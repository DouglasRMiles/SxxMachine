package com.googlecode.prolog_cafe.builtin;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.googlecode.prolog_cafe.lang.IllegalTypeException;
import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.Predicate;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.PrologException;
import com.googlecode.prolog_cafe.lang.Term;

/**
 * <b>log(package:level, format, arg1,... argN)</b> - logs message, specified by <i>format</i> and <i>arg1</i>...<i>argN</i> to the logger, 
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
 * <p><i>arg1</i> - can be any term, including free variable. It will be converted to string using method {@link Object#toString()}
 * <p>...
 * <p><i>argN</i> - can be any term, including free variable. It will be converted to string using method {@link Object#toString()}
 * <p>The predicate finds {@link Logger} instance, corresponding to given package, and calls its method {@link Logger#log(Level, String)}
 * with level and the result of {@link String#format(String, Object...)} call with <i>format</i> and <i>arg1</i>...<i>argN</i> as arguments.
 *  
 * @author semenov
 *
 */

public class PRED_log_7 extends Predicate {
	Term arg1, arg2, arg3, arg4, arg5, arg6, arg7;
	
	public PRED_log_7(Term arg1, Term arg2, Term arg3, Term arg4, Term arg5, Term arg6, Term arg7, Operation cont) {
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.arg3 = arg3;
		this.arg4 = arg4;
		this.arg5 = arg5;
		this.arg6 = arg6;
		this.arg7 = arg7;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {

		Term a1 = arg1.dereference();
		Term a2 = arg2.dereference();
		Term a3 = arg3.dereference();
		Term a4 = arg4.dereference();
		Term a5 = arg5.dereference();
		Term a6 = arg6.dereference();
		Term a7 = arg7.dereference();
		Term packageTerm, levelTerm;
		
		
		if (!a1.isStructure() || a1.arity()!=2 || 
				!(packageTerm=a1.arg(0)).isSymbol() || !(levelTerm=a1.arg(1)).isSymbol()){
			throw new IllegalTypeException(this, 1, "package:level", a1);
		}
		if (!a2.isSymbol()){
			throw new IllegalTypeException(this, 2, "atom", a2);
		}
		
		Logger logger = Logger.getLogger(packageTerm.name());
		Level level = Level.parse(levelTerm.name().toUpperCase());
		if (logger.isLoggable(level)){
			logger.log(level, String.format(a2.name(), a3.toJava(), a4.toJava(), a5.toJava(), a6.toJava(), a7.toJava()));
		}
		return cont;
	}

}
