package SxxMachine.builtin;

import java.io.PrintWriter;

import SxxMachine.FFIObjectTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.ExistenceException;
import SxxMachine.exceptions.IllegalDomainException;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PInstantiationException;
import SxxMachine.exceptions.PermissionException;
/**
   <code>put_byte/2</code><br>
   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
   @version 1.1
   @since 1.1
*/
public class PRED_put_byte_2 extends Predicate.P2 {
    public PRED_put_byte_2(Term a1, Term a2, Operation cont) {
        LARG[0] = a1;
        LARG[1] = a2;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
	int c;
	Object stream = null;

	// Byte
	a2 = a2.dref(); 
	if ((a2 instanceof VariableTerm))
	    throw new PInstantiationException(this, 2);
	if (! (a2 instanceof IntegerTerm))
	    throw new IllegalTypeException(this, 2, "byte", a2);
	c = ((IntegerTerm)a2).intValue();
	if (c < 0 || c > 255)
	    throw new IllegalTypeException(this, 2, "byte", a2);
	// S_or_a
	a1 = a1.dref(); 
	if ((a1 instanceof VariableTerm)) {
	    throw new PInstantiationException(this, 1);
	} else if ((a1 instanceof SymbolTerm)) {
	    if (! engine.getStreamManager().containsKey(a1))
		throw new ExistenceException(this, 1, "stream", a1, "");
	    stream = ((FFIObjectTerm) engine.getStreamManager().get(a1)).object();
	} else if ((a1 instanceof FFIObjectTerm)) {
	    stream = ((FFIObjectTerm) a1).object();
	} else {
	    throw new IllegalDomainException(this, 1, "stream_or_alias", a1);
	}
	if (! (stream instanceof PrintWriter))
	    throw new PermissionException(this, "output", "stream", a1, "");
	// print single byte
	((PrintWriter) stream).print((char)c);
	return cont;
    }
}
