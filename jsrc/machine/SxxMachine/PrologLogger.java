package com.googlecode.prolog_cafe.lang;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.googlecode.prolog_cafe.builtin.PRED_true_0;
import com.googlecode.prolog_cafe.exceptions.BuiltinException;
import com.googlecode.prolog_cafe.exceptions.JavaException;
import com.googlecode.prolog_cafe.exceptions.PrologException;

/**
 * <p>Logs executed predicates and their arguments to {@link Logger} instance given in constructor.
 * <p>Writes the following data:
 * <ul>
 *  <li> level SEVERE - exception stack traces reported by {@link PrologControl#printStackTrace(Throwable)}
 *  <li> level WARNING - nothing
 *  <li> level INFO - nothing
 *  <li> level CONFIG - nothing
 *  <li> level FINE - logs executed  {@link Predicate}, their arguments . Intercepted exception stack traces.
 *  <li> level FINER - info about engine try, retry, trust, fail and executed {@link Operation}
 *  <li> level FINEST - nothing
 * </ul>
 *
 *
 * @author semenov
 *
 */
public class PrologLogger {

	private final Logger logger;

	private Predicate[] stackFrame;
	private int stackTop;
	private boolean normalExecution = true;

	private final StringBuilder stringBuilder = new StringBuilder(2048);
	private char[] indent;

	PrologLogger(Logger logger){
		this.logger = logger;
		stackFrame = new Predicate[256];
		indent = new char[256];
	}

	final void init(ChoicePointFrame initialChoicePointFrame) {
		stackTop = 0;
		//Arrays.fill(stackFrame, null);
		stackFrame[0] = new PRED_true_0(null); // TODO check if null is ok
		normalExecution = true;

		initialChoicePointFrame.ownerPredicate = stackFrame[stackTop];
		initialChoicePointFrame.loggerStackTop = stackTop;
	}

	final void fail(Operation next, ChoicePointFrame entry) {
		//  write to log
		logger.log(Level.FINER, ()->{
			stringBuilder.setLength(0);
			stringBuilder.append(indent, 1, stackTop).append("failure => ");
			stringBuilder.append(next);
			return stringBuilder.toString();
		});
		normalExecution = false;
		stackTop = entry.loggerStackTop;
		stackFrame[stackTop] = entry.ownerPredicate;
	}


	final void jtry(Operation p, Operation next, ChoicePointFrame entry) {
		entry.ownerPredicate = stackFrame[stackTop];
		entry.loggerStackTop = stackTop;
		//  write to log
		logger.log(Level.FINER, ()->{
			stringBuilder.setLength(0);
			stringBuilder.append(indent, 1, stackTop).append("try ");
			stackFrame[stackTop].toString(stringBuilder);
			stringBuilder.append(" => ");
			stringBuilder.append(p);
			return stringBuilder.toString();
		});
	}

	final void retry(Operation p, Operation next, ChoicePointFrame entry) {
		//  write to log
		logger.log(Level.FINER, ()->{
			stringBuilder.setLength(0);
			stringBuilder.append(indent, 1, stackTop).append("retry ");
			entry.ownerPredicate.toString(stringBuilder);
			stringBuilder.append(" => ");
			stringBuilder.append(p);
			return stringBuilder.toString();
		});
		normalExecution = false;
		stackTop = entry.loggerStackTop;
		stackFrame[stackTop] = entry.ownerPredicate;
	}

	final void trust(Operation p, ChoicePointFrame entry) {
		// write to log
		logger.log(Level.FINER, ()->{
			stringBuilder.setLength(0);
			stringBuilder.append(indent, 1, stackTop).append("trust ");
			entry.ownerPredicate.toString(stringBuilder);
			stringBuilder.append(" => ");
			stringBuilder.append(p);
			return stringBuilder.toString();
		});
		normalExecution = false;
		stackTop = entry.loggerStackTop;
		stackFrame[stackTop] = entry.ownerPredicate;
	}

	public final void beforeExec(Operation code) {
		Level level;
		// do afterExec
		if (code instanceof Predicate) {
			if (normalExecution){
				while (stackTop>=0 && stackFrame[stackTop].cont==code){
					stackTop--;
				}
				stackTop++;
				if (stackTop>=stackFrame.length) {
					ensureCapacity();
				}
			}

			// most important
			stackFrame[stackTop] = (Predicate) code;
			level = Level.FINE;
		} else {
			level = Level.FINER;
		}
		normalExecution = true;
		//  if logger.isLoggable(Level.FINE) write code to log
		logger.log(level, ()->{
			stringBuilder.setLength(0);
			stringBuilder.append(indent, 1, stackTop).append(": ");
			if (code instanceof Predicate){
				((Predicate) code).toString(stringBuilder);
			} else {
				stringBuilder.append(code);
			}
			return stringBuilder.toString();
		});
	}

	private void ensureCapacity() {
		Predicate[] array = new Predicate[stackFrame.length*2];
		System.arraycopy(stackFrame, 0, array, 0, stackFrame.length);
		stackFrame = array;
		indent = new char[stackFrame.length];
		Arrays.fill(indent, ' ');
	}

	public final PrologException execThrows(RuntimeException t) {
		if (!(t instanceof PrologException) || !((com.googlecode.prolog_cafe.exceptions.PrologException)t).hasPrologStackTrace() ){
			Operation[] array = new Operation[stackTop];
			for (int i=stackTop, k=0; i>0; i--){
				array[k] = stackFrame[i];
				k++;
			}
			// wrap t into JavaException if it is not PrologException
			if (!(t instanceof PrologException)){
				t = new JavaException(t);
			}
			// add stacktrace into t
			((com.googlecode.prolog_cafe.exceptions.PrologException)t).setPrologStackTrace(array);
			if (t instanceof BuiltinException) {
				((BuiltinException) t).goal = stackFrame[stackTop];
			}
		}
		// write to log
		logger.log(Level.FINE, "", t);
		return (PrologException) t;
	}

	final void printStackTrace(Throwable err) {
		logger.log(Level.SEVERE, "", err);
		if (!logger.getUseParentHandlers()){ // propagate error outside
			Logger.getLogger("").log(Level.SEVERE, "", err);
		}
	}

	final void close() {
		Arrays.fill(stackFrame, stackTop+1, stackFrame.length, null);
	}
}
