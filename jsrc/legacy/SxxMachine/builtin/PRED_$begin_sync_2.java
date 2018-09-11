package com.googlecode.prolog_cafe.builtin;

import com.googlecode.prolog_cafe.exceptions.IllegalTypeException;
import com.googlecode.prolog_cafe.exceptions.PInstantiationException;
import com.googlecode.prolog_cafe.exceptions.StopEngineException;
import com.googlecode.prolog_cafe.lang.BlockPredicate;
import com.googlecode.prolog_cafe.lang.JavaObjectTerm;
import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.OutOfLoop;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.PrologLogger;
import com.googlecode.prolog_cafe.lang.Term;
import com.googlecode.prolog_cafe.lang.VariableTerm;

/**
 * <code>'$begin_sync'/2</code>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.2
 */
class PRED_$begin_sync_2 extends BlockPredicate {
	private final Term arg1, arg2;

	public PRED_$begin_sync_2(Term a1, Term a2, Operation cont) {
		arg1 = a1;
		arg2 = a2;
		this.cont = cont;
	}

	public Operation exec(Prolog engine) {
		engine.setB0();
		Term a1, a2;
		a1 = arg1;
		a2 = arg2;

		Object o = null;
		Operation code = null;

		// 1st. argument
		a1 = a1.dereference();
		if ((a1 instanceof VariableTerm))
			throw new PInstantiationException(this, 1);
		if (!(a1 instanceof JavaObjectTerm))
			throw new IllegalTypeException(this, 1, "java", a1);
		o = ((JavaObjectTerm) a1).object();
		// 2nd. argument
		a2 = a2.dereference();
		if (!(a2 instanceof VariableTerm))
			throw new IllegalTypeException(this, 2, "variable", a1);
		((VariableTerm) a2).bind(new JavaObjectTerm(this), engine.trail);
		//
		code = cont;
		this.outOfScope = false;
		this.outOfLoop = false;
		engine.trail.push(new OutOfLoop(this));
		PrologLogger logger = engine.getLogger();
		try {
			main_loop:
			while (true) {
				synchronized (o) {
					while (!outOfScope) {
						if (engine.halt != 0) {
							break main_loop;
						}
//						if (engine.control.isEngineStopped())
//							break main_loop;
						if (outOfLoop)
							break main_loop;

						logger.beforeExec(code);
						code = code.exec(engine);
					}
				}
				while (outOfScope) {
					if (engine.halt != 0) {
						break main_loop;
					}
//					if (engine.control.isEngineStopped())
//						break main_loop;
					if (outOfLoop)
						break main_loop;

					logger.beforeExec(code);
					code = code.exec(engine);
				}

			}
		} catch (StopEngineException see){
			throw see;
		} catch (RuntimeException e){
			throw logger.execThrows(e);
		}
		return code;
	}
}
