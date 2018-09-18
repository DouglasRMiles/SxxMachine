package SxxMachine.builtin;

import java.io.IOException;
import java.io.PushbackReader;

import SxxMachine.FFIObjectTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.ExistenceException;
import SxxMachine.IllegalDomainException;
import SxxMachine.IllegalTypeException;
import SxxMachine.PInstantiationException;
import SxxMachine.PermissionException;
import SxxMachine.RepresentationException;
import SxxMachine.TermException;
/**
 * <code>get/2</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
*/
public class PRED_get_2 extends Predicate.P2 {
    private static final IntegerTerm INT_EOF = new IntegerTerm(-1);

    public PRED_get_2(Term a1, Term a2, Operation cont) {
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

	// Char
	a2 = a2.dref(); 
	if (! (a2 instanceof VariableTerm)) {
	    if (! (a2 instanceof IntegerTerm))
		throw new IllegalTypeException(this, 2, "integer", a2);
	    int n = a2.asIntegerlTerm().intValue();
	    if (n != -1 && ! Character.isDefined(n))
		throw new RepresentationException(this, 2, "in_character_code");
	}
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
	// read a non-blank single character
	try {
	    PushbackReader in = (PushbackReader) stream;
	    int c = in.read();
	    while(Character.isWhitespace((char)c))
		c = in.read();
	    if (c < 0) { // EOF
		if (! a2.unify(INT_EOF, engine.trail))
		    return engine.fail();
		return cont;
	    } 
	    if (! Character.isDefined(c))
		throw new RepresentationException(this, 0, "character");
	    if (! a2.unify(new IntegerTerm(c), engine.trail))
		return engine.fail();
	    return cont;
	} catch (IOException e) {
	    throw new TermException(new FFIObjectTerm(e));
	}
    }
}
