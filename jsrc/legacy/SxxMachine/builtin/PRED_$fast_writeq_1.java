package com.googlecode.prolog_cafe.builtin;
import  com.googlecode.prolog_cafe.lang.*;
/**
 * <code>'$fast_writeq'/1</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PRED_$fast_writeq_1 extends Predicate.P1 {
    public PRED_$fast_writeq_1(Term a1, Operation cont) {
	arg1 = a1;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1;
	a1 = arg1.dereference();
	engine.getCurrentOutput().print(a1.toQuotedString());
	return cont;
    }
}
