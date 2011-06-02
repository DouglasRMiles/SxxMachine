package jp.ac.kobe_u.cs.prolog.builtin;
import  jp.ac.kobe_u.cs.prolog.lang.*;
/**
 * <code>current_output/1</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PRED_current_output_1 extends Predicate.P1 {
    public PRED_current_output_1(Term a1, Operation cont) {
	arg1 = a1;
	this.cont = cont;
    }

    public String toString() { return "current_output(" + arg1 + ")"; }

    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1;
	a1 = arg1;
	a1 = a1.dereference();
	if (a1.isVariable()) {
	    ((VariableTerm)a1).bind(new JavaObjectTerm(engine.getCurrentOutput()), engine.trail);
	} else if (a1.isJavaObject()) {
	    if (! a1.unify(new JavaObjectTerm(engine.getCurrentOutput()), engine.trail)) 
		return engine.fail();
	} else {
	    throw new IllegalDomainException(this,1,"stream",a1);
	}
	return cont;
    }
}
