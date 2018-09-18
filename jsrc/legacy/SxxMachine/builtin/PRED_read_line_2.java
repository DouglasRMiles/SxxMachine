package SxxMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PushbackReader;

import SxxMachine.FFIObjectTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.VariableTerm;
import SxxMachine.ExistenceException;
import SxxMachine.IllegalDomainException;
import SxxMachine.PInstantiationException;
import SxxMachine.PermissionException;
import SxxMachine.RepresentationException;
import SxxMachine.TermException;
/**
 * <code>read_line/2</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PRED_read_line_2 extends Predicate.P2 {
    public PRED_read_line_2(Term a1, Term a2, Operation cont) {
	LARG[0] = a1;
	LARG[1] = a2;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
	Object stream = null;
	String line;
	char[] chars;
	Term t;

	// S_or_a
	a1 = a1.dref();
	if ((a1 instanceof VariableTerm)) {
	    throw new PInstantiationException(this, 1);
	} else if ((a1 instanceof SymbolTerm)) {
	    if (! engine.getStreamManager().containsKey(a1))
		throw new ExistenceException(this, 1, "stream", a1, "");
	    stream = ( engine.getStreamManager().get(a1)).object();
	} else if ((a1 instanceof FFIObjectTerm)) {
	    stream = a1.object();
	} else {
	    throw new IllegalDomainException(this, 1, "stream_or_alias", a1);
	}
	if (! (stream instanceof PushbackReader))
	    throw new PermissionException(this, "input", "stream", a1, "");
	// read line
	try {
	    line = (new BufferedReader((PushbackReader)stream)).readLine();
	    if (line == null) { // end_of_stream
		if(! a2.unify(new IntegerTerm(-1), engine.trail))
		    return engine.fail();
		return cont;
	    }
	    chars = line.toCharArray();
	    t = Prolog.Nil;
	    for (int i=chars.length; i>0; i--) {
		if (! Character.isDefined((int)chars[i-1]))
		    throw new RepresentationException(this, 0, "character");
		t = TermData.CONS(new IntegerTerm((int)chars[i-1]), t);
	    }
	    if(! a2.unify(t, engine.trail))
		return engine.fail();
	    return cont;
	} catch (IOException e) {
	    throw new TermException(new FFIObjectTerm(e));
	}
    }
}
