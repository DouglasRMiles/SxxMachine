package SxxMachine.builtin;

import java.io.IOException;
import java.io.PushbackReader;

import SxxMachine.exceptions.BuiltinException;
import SxxMachine.exceptions.ExistenceException;
import SxxMachine.exceptions.IllegalDomainException;
import SxxMachine.exceptions.PInstantiationException;
import SxxMachine.exceptions.PermissionException;
import SxxMachine.exceptions.RepresentationException;
import SxxMachine.exceptions.TermException;
import SxxMachine.Arithmetic;
import SxxMachine.IntegerTerm;
import SxxMachine.JavaObjectTerm;
import SxxMachine.NumberTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
/**
   <code>skip/2</code><br>
   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
   @version 1.0
*/
public class PRED_skip_2 extends Predicate.P2 {
    private static final IntegerTerm INT_EOF = new IntegerTerm(-1);

    public PRED_skip_2(Term a1, Term a2, Operation cont) {
        arg1 = a1;
        arg2 = a2;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1, a2;
        a1 = arg1;
        a2 = arg2;
	int n;
	Object stream = null;
	
	// Char
	a2 = a2.dereference(); 
	if ((a2 instanceof VariableTerm))
	    throw new PInstantiationException(this, 2);
	if (! (a2 instanceof IntegerTerm)) {
	    try {
		a2 = Arithmetic.evaluate(a2);
	    } catch (BuiltinException e) {
		e.goal = this;
		e.argNo = 2;
		throw e;
	    }
	}
	n = ((NumberTerm)a2).intValue();
	if (! Character.isDefined(n))
	    throw new RepresentationException(this, 2, "character_code");
	// S_or_a
	a1 = a1.dereference(); 
	if ((a1 instanceof VariableTerm)) {
	    throw new PInstantiationException(this, 1);
	} else if ((a1 instanceof SymbolTerm)) {
	    if (! engine.getStreamManager().containsKey(a1))
		throw new ExistenceException(this, 1, "stream", a1, "");
	    stream = ((JavaObjectTerm) engine.getStreamManager().get(a1)).object();
	} else if ((a1 instanceof JavaObjectTerm)) {
	    stream = ((JavaObjectTerm) a1).object();
	} else {
	    throw new IllegalDomainException(this, 1, "stream_or_alias", a1);
	}
	if (! (stream instanceof PushbackReader))
	    throw new PermissionException(this, "input", "stream", a1, "");
	// skip
	try {
	    PushbackReader in = (PushbackReader) stream;
	    int c = in.read();
	    while(c != n) {
		c = in.read();
		if (c == -1) // EOF
		    return cont;
		if (! Character.isDefined(c))
		    throw new RepresentationException(this, 0, "character");
	    } 
	    return cont;
	} catch (IOException e) {
	    throw new TermException(new JavaObjectTerm(e));
	}
    }
}
