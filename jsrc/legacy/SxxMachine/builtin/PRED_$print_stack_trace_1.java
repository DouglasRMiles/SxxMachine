package com.googlecode.prolog_cafe.builtin;

import com.googlecode.prolog_cafe.exceptions.IllegalTypeException;
import com.googlecode.prolog_cafe.exceptions.JavaInterruptedException;
import com.googlecode.prolog_cafe.exceptions.PInstantiationException;
import com.googlecode.prolog_cafe.lang.JavaObjectTerm;
import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.Predicate;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.Term;
import com.googlecode.prolog_cafe.lang.VariableTerm;
/**
 * <code>'$print_stack_trace'/1</code>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
*/
class PRED_$print_stack_trace_1 extends Predicate.P1 {
    public PRED_$print_stack_trace_1(Term a1, Operation cont) {
        arg1 = a1;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1;
        a1 = arg1;

	a1 = a1.dereference();
	if ((a1 instanceof VariableTerm))
	    throw new PInstantiationException(this, 1);
	if (! (a1 instanceof JavaObjectTerm))
	    throw new IllegalTypeException(this, 1, "java", a1);
	Object obj = ((JavaObjectTerm) a1).object();
	if (obj instanceof InterruptedException)
	    throw new JavaInterruptedException((InterruptedException) obj);
	if (engine.getPrintStackTrace().equals("on"))
	    engine.control.printStackTrace((Throwable) obj);
        return cont;
    }
}
