package SxxMachine.builtin;

import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PInstantiationException;
import SxxMachine.exceptions.StopEngineException;
import SxxMachine.BlockPredicate;
import SxxMachine.JavaObjectTerm;
import SxxMachine.Operation;
import SxxMachine.OutOfLoop;
import SxxMachine.Prolog;
import SxxMachine.PrologLogger;
import SxxMachine.Term;
import SxxMachine.VariableTerm;

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
