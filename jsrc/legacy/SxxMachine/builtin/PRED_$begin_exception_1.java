package com.googlecode.prolog_cafe.builtin;

import com.googlecode.prolog_cafe.lang.*;

/**
 * <code>'$begin_exception'/1</code><br>
 * 
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.2
 */
class PRED_$begin_exception_1 extends BlockPredicate {
	private final Term arg1;

	public PRED_$begin_exception_1(Term a1, Operation cont) {
		arg1 = a1;
		this.cont = cont;
	}

	public Operation exec(final Prolog engine) {
		engine.setB0();
		engine.pushCatcherB(engine.B0);
		engine.trail.push(()-> engine.popCatcherB());
		return cont;
	}
}
