package com.googlecode.prolog_cafe.builtin;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.Predicate.P1;
import com.googlecode.prolog_cafe.lang.IllegalTypeException;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.PrologException;
import com.googlecode.prolog_cafe.lang.SymbolTerm;
import com.googlecode.prolog_cafe.lang.Term;
/**
 * <p><b>log_level(package:level)</b> - gets or sets logging level for given package.
 * <p><i>package</i> is expected to be atom. (Variable will cause errors).
 * If package is absent, then current package is automatically added by prolog compiler.
 * So call log_level('INFO') is valid.
 * <p><i>level</i> can be either variable or atom. If it is a variable, it will be bound to current logging level of given package.
 * If it is an atom, the current logging level of given package will be set to its value.  
 * Value can be one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL' (from highest to lowest).
 * Also lower case variants without quotes are accepted. So log_level(info) is valid.
 * 
 * <p>If <i>level</i> is bound to atom value, the predicate finds {@link Logger} instance, 
 * corresponding to given package, and calls its {@link Logger#setLevel(Level)} method with given <i>level</i> value.
 * <p>If level is free variable, the predicate finds {@link Logger} instance, 
 * corresponding to given package, calls its {@link Logger#getLevel()} method to find out it is level
 * and binds the value to the <i>level</i> argument
 * 
 * @author semenov
 *
 */
public class PRED_log_level_1 extends P1 {

	public PRED_log_level_1(Term arg1, Operation cont) {
		this.arg1 = arg1;
		this.cont = cont;
	}
	
	@Override
	public Operation exec(Prolog engine) throws PrologException {

		Term a1 = arg1.dereference();
		if (!a1.isStructure() || a1.arity()!=2 ){
			throw new IllegalTypeException(this, 1, "package:level", a1);
		}
		Term packageTerm = a1.arg(0);
		Logger logger = Logger.getLogger(packageTerm.name());
		Term levelTerm = a1.arg(1);
		if (levelTerm.isVariable()){			
			// obtain logger's level, which may be inherited from parent
			Level level = null;
			for(Logger l = logger; l!=null && (level=l.getLevel())==null; l=l.getParent());
			if (level==null){
				level = Level.INFO;
			}
			if (!levelTerm.unify(SymbolTerm.create(level.getName()), engine.trail)){
				return engine.fail();
			}
		} else if (levelTerm.isSymbol()){
			logger.setLevel(Level.parse(levelTerm.name().toUpperCase()));
		} else {
			throw new IllegalTypeException(this, 1, "package:level", a1);
		}
		return cont;
	}

}
