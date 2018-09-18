package SxxMachine;

import static SxxMachine.PRED_loggable_1.LEVELS;

import java.util.logging.Level;
import java.util.logging.Logger;

import SxxMachine.IllegalTypeException;
import SxxMachine.PrologException;
import SxxMachine.Operation;
import SxxMachine.Predicate.P2;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.Term;

/**
 * <b>log(package:level, message)</b> - logs given <i>message</i> to the logger, corresponding to <i>package</i>, 
 * under the given <i>level</i>.
 * <p><i>package</i> is expected to be atom. (Variable will cause errors).
 * If package is absent, then current package is automatically added by prolog compiler.
 * So call log('INFO','message') is valid.
 * <p><i>level</i> can be either variable or atom. If it is a variable, it will be bound to current logging level of given package.
 * If it is an atom, the current logging level of given package will be set to its value.  
 * Value can be one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL' (from highest to lowest).
 * Also lower case variants without quotes are accepted. So log(info,'message') is valid. 
 * <p><i>message</i> can be any term, including free variable. It will be converted to string using method {@link Object#toString()}
 * 
 * <p>The predicate finds {@link Logger} instance, corresponding to given package, and calls its method {@link Logger#log(Level, String)}
 * with level and message as arguments.
 *  
 * @author semenov
 *
 */
public class PRED_log_2 extends P2 {

	public PRED_log_2(Term a0, Term a1, Operation cont) {
		this.LARG[0] = a0; //0];
		this.LARG[1] = a1; //1];
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {

		final Term a1 = LARG[0].dref();
		final Term a2 = LARG[1].dref();

		if (!(a1 instanceof StructureTerm) || a1.arity()!=2){
			throw new IllegalTypeException(this, 1, "package:level", a1);
		}

		final Logger logger = Logger.getLogger(a1.arg0(0).name());
		final Level level = LEVELS.getOrDefault(a1.arg0(1), Level.INFO);
		logger.log(level, a2::toString);
		return cont;
	}

}
