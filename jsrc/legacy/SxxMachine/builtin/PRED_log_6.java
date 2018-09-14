package SxxMachine.builtin;

import static SxxMachine.builtin.PRED_loggable_1.LEVELS;

import java.util.logging.Level;
import java.util.logging.Logger;

import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PrologException;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;

/**
 * <b>log(package:level, format, LARG[0],... argN)</b> - logs message, specified by <i>format</i> and <i>LARG[0]</i>...<i>argN</i> to the logger, 
 * corresponding to <i>package</i>, under the given <i>level</i>.
 * <p><i>package</i> is expected to be atom. (Variable will cause errors).
 * If package is absent, then current package is automatically added by prolog compiler.
 * So call log('INFO','%s','message') is valid.
 * <p><i>level</i> can be either variable or atom. If it is a variable, it will be bound to current logging level of given package.
 * If it is an atom, the current logging level of given package will be set to its value.  
 * Value can be one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL' (from highest to lowest).
 * Also lower case variants without quotes are accepted. So log(info,'%s','message') is valid. 
 * <p><i>format</i> - is expected to be an atom, holding format string, that will be supplied to method {@link String#format(String, Object...)}. 
 * Variable will cause error.
 * <p><i>LARG[0]</i> - can be any term, including free variable. It will be converted to string using method {@link Object#toString()}
 * <p>...
 * <p><i>argN</i> - can be any term, including free variable. It will be converted to string using method {@link Object#toString()}
 * <p>The predicate finds {@link Logger} instance, corresponding to given package, and calls its method {@link Logger#log(Level, String)}
 * with level and the result of {@link String#format(String, Object...)} call with <i>format</i> and <i>LARG[0]</i>...<i>argN</i> as arguments.
 *  
 * @author semenov
 *
 */

public class PRED_log_6 extends Predicate {
	// private final Term LARG[0], LARG[1], LARG[2], LARG[3], arg5, arg6;
	
	public PRED_log_6(Term a0, Term a1, Term a2, Term LARG[3], Term arg5, Term arg6, Operation cont) {
		this.LARG[0] = a0; //0];
		this.LARG[1] = a1; //1];
		this.LARG[2] = a2; //2];
		this.LARG[3] = LARG[3];
		this.arg5 = arg5;
		this.arg6 = arg6;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {
		final Term a1 = LARG[0].dref();
		final Term a2 = LARG[1].dref();
		final Term a3 = LARG[2].dref();
		final Term a4 = LARG[3].dref();
		final Term a5 = arg5.dref();
		final Term a6 = arg6.dref();

		if (!(a1 instanceof StructureTerm) || a1.arity()!=2){
			throw new IllegalTypeException(this, 1, "package:level", a1);
		}
		if (!(a2 instanceof SymbolTerm)){
			throw new IllegalTypeException(this, 2, "atom", a2);
		}

		final Logger logger = Logger.getLogger(a1.arg0(0).name());
		final Level level = LEVELS.getOrDefault(a1.arg0(1), Level.INFO);
		logger.log(level, ()->String.format(a2.name(), a3.toJava(), a4.toJava(), a5.toJava(), a6.toJava()));
		return cont;
	}

}
