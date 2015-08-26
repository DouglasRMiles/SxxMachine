package com.googlecode.prolog_cafe.builtin;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.Predicate.P2;
import com.googlecode.prolog_cafe.lang.IllegalTypeException;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.PrologException;
import com.googlecode.prolog_cafe.lang.Term;

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

	public PRED_log_2(Term arg1, Term arg2, Operation cont) {
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {

		Term a1 = arg1.dereference();
		Term a2 = arg2.dereference();
		Term packageTerm, levelTerm;		
		
		if (!a1.isStructure() || a1.arity()!=2 || 
				!(packageTerm=a1.arg(0)).isSymbol() || !(levelTerm=a1.arg(1)).isSymbol()){
			throw new IllegalTypeException(this, 1, "package:level", a1);
		}
		if (a2.isVariable()){
			throw new IllegalTypeException(this, 2, "nonvar", a2);
		}
		
		Logger logger = Logger.getLogger(packageTerm.name().toUpperCase());
		Level level = Level.parse(levelTerm.name());
		if (logger.isLoggable(level)){
			logger.log(level, a2.toString());
		}
		return cont;
	}

}
