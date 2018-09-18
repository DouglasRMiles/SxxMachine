package SxxMachine;

import SxxMachine.FFIObjectTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.IllegalTypeException;
import SxxMachine.JavaInterruptedException;
import SxxMachine.PInstantiationException;
/**
 * <code>'$print_stack_trace'/1</code>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
*/
class PRED_$print_stack_trace_1 extends Predicate.P1 {
    public PRED_$print_stack_trace_1(Term a1, Operation cont) {
        LARG[0] = a1;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1;
        a1 = LARG[0];

	a1 = a1.dref();
	if ((a1 instanceof VariableTerm))
	    throw new PInstantiationException(this, 1);
	if (! (a1 instanceof FFIObjectTerm))
	    throw new IllegalTypeException(this, 1, "java", a1);
	Object obj = a1.object();
	if (obj instanceof InterruptedException)
	    throw new JavaInterruptedException((InterruptedException) obj);
	if (engine.getPrintStackTrace().equals("on"))
	    engine.control.printStackTrace((Throwable) obj);
        return cont;
    }
}
