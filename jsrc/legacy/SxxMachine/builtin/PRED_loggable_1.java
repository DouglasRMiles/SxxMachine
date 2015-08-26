package com.googlecode.prolog_cafe.builtin;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.googlecode.prolog_cafe.lang.IllegalTypeException;
import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.Predicate.P1;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.PrologException;
import com.googlecode.prolog_cafe.lang.Term;
/**
 * <p><b>loggable(package:level)</b> - succeed if given level is loggable for given package.
 * If package is absent, then current package is automatically added by prolog compiler.
 * So call loggable('INFO') is valid. Both package and level are expected to be atoms. (Variables will cause errors).
 * Level can be one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL' (from highest to lowest).
 * Also lower case variants without quotes are accepted.  
 *
 * <p>The predicate finds {@link Logger} instance, corresponding to given package, and calls its {@link Logger#isLoggable(Level)}
 * method with given level.
 * 	  
 * @author semenov
 *
 */
public class PRED_loggable_1 extends P1 {

	public PRED_loggable_1(Term arg1, Operation cont) {
		this.arg1 = arg1;
		this.cont = cont;
	}
	
	@Override
	public Operation exec(Prolog engine) throws PrologException {

		Term a1 = arg1.dereference();
		Term packageTerm, levelTerm;
		
		if (!a1.isStructure() || a1.arity()!=2 ||
				!(packageTerm=a1.arg(0)).isSymbol() || !(levelTerm=a1.arg(1)).isSymbol()){
			throw new IllegalTypeException(this, 1, "package:level", a1);
		}
		
		Logger logger = Logger.getLogger(packageTerm.name());		
		if (!logger.isLoggable(Level.parse(levelTerm.name().toUpperCase()))){
			return engine.fail();
		}
		return cont;
	}

}
