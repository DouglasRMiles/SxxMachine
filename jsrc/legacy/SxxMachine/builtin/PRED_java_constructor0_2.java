package com.googlecode.prolog_cafe.builtin;

import java.lang.reflect.Constructor;

import com.googlecode.prolog_cafe.exceptions.ExistenceException;
import com.googlecode.prolog_cafe.exceptions.IllegalTypeException;
import com.googlecode.prolog_cafe.exceptions.JavaException;
import com.googlecode.prolog_cafe.exceptions.PInstantiationException;
import com.googlecode.prolog_cafe.lang.JavaObjectTerm;
import com.googlecode.prolog_cafe.lang.JavaPredicate;
import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.StructureTerm;
import com.googlecode.prolog_cafe.lang.SymbolTerm;
import com.googlecode.prolog_cafe.lang.Term;
import com.googlecode.prolog_cafe.lang.VariableTerm;
/**
 * <code>java_constructor0/2</code>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PRED_java_constructor0_2 extends JavaPredicate {
    private final Term arg1, arg2;

    public PRED_java_constructor0_2(Term a1, Term a2, Operation cont) {
	arg1 = a1;
	arg2 = a2;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.requireFeature(Prolog.Feature.JAVA_REFLECTION, this, arg1);
        engine.setB0();

	Term a1, a2;
	a1 = arg1;
	a2 = arg2;

	Class clazz = null;
	Object instance = null;
	int arity;
	Constructor[] constrs = null;
	Term[] pArgs = null;
	Object[] jArgs = null;
	Constructor c = null;

	try {
	    // 2nd. argument (unbound variable)
	    a2 = a2.dereference();
	    if (! (a2 instanceof VariableTerm))
		throw new IllegalTypeException(this, 2, "variable", a2);
	    // 1st. argument (atom or callable term)
	    a1 = a1.dereference();
	    if ((a1 instanceof VariableTerm))
		throw new PInstantiationException(this, 1);
	    if (!(a1 instanceof SymbolTerm) && !(a1 instanceof StructureTerm))
		throw new IllegalTypeException(this, 1, "callable", a1);
	    if ((a1 instanceof SymbolTerm)) { // No argument constructor
		clazz = Class.forName(((SymbolTerm)a1).name());
		instance = clazz.newInstance();
		if (! a2.unify(toPrologTerm(instance), engine.trail))
		    return engine.fail();
		return cont;
	    } 
	    // Parameterized constructor
	    clazz = Class.forName(((StructureTerm)a1).name());
	    arity  = ((StructureTerm)a1).arity();
	    constrs = clazz.getConstructors();
	    if (constrs.length == 0)
		throw new ExistenceException(this, 1, "constructor", a1, "");
	    pArgs  = ((StructureTerm)a1).args();
	    jArgs  = new Object[arity];
	    for (int i=0; i<arity; i++) {
		pArgs[i] = pArgs[i].dereference();
		if (! (pArgs[i] instanceof JavaObjectTerm))
		    pArgs[i] = new JavaObjectTerm(pArgs[i]);
		jArgs[i] = pArgs[i].toJava();
	    }
		for (Constructor constr : constrs) {
			if (checkParameterTypes(constr.getParameterTypes(), pArgs)) {
				try {
					c = constr;
					//c.setAccessible(true);
					instance = c.newInstance(jArgs);
					break;    // Succeeds to create new instance
				} catch (Exception e) {
					c = null; // Back to loop
				}
			}
		}
	    if (c == null)
		throw new ExistenceException(this, 1, "constructor", a1, "");
	    if (! a2.unify(toPrologTerm(instance), engine.trail)) 
		return engine.fail();
	    return cont;
	} catch (ClassNotFoundException e) {    // Class.forName(..)
	    throw new JavaException(this, 1, e);
	} catch (InstantiationException e) {    // Class.forName(..) or Constructor.newInstance()
	    throw new JavaException(this, 1, e);
	} catch (IllegalAccessException e) {    // Class.forName(..) or Constructor.newInstance()
	    throw new JavaException(this, 1, e);
	} catch (SecurityException e) {         // Class.getConstructors()
	    throw new JavaException(this, 1, e);
	} catch (IllegalArgumentException e) {  // Constructor.newInstance()
	    throw new JavaException(this, 1, e);
	}
    }

    private Term toPrologTerm(Object obj) {
	if (Term.instanceOfTerm(obj))
	    return (Term)obj;
	else 
	    return new JavaObjectTerm(obj);
    }
}
