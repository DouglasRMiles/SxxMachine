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

	public Operation exec(Prolog engine) {
		engine.setB0();
		PrologLogger logger = engine.getLogger();
		Term a1 = arg1;

		if (!a1.unify(new JavaObjectTerm(this), engine.trail))
			return engine.fail();
		PrologControl ctl = engine.control;
		Operation code = cont;
		int B = engine.stack.top();
		this.outOfScope = false;
		this.outOfLoop = false;
		engine.trail.push(new OutOfLoop(this));

		try {
			while (engine.halt == 0 && !ctl.isEngineStopped() && !outOfLoop) {
				logger.beforeExec(code);
				code = code.exec(engine);
			}
		} catch (RuntimeException re){
			PrologException e = logger.execThrows(re);
			if (outOfScope){
				throw e;
			}
			engine.setException(engine.copy(e.getMessageTerm()));
			engine.cut(B);
			return engine.fail();
		}
		return code;
	}
}
