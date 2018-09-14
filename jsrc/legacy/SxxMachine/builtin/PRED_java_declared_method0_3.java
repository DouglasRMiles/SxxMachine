package SxxMachine.builtin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import SxxMachine.FFIObjectTerm;
import SxxMachine.JavaPredicate;
import SxxMachine.Operation;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.ExistenceException;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.JavaException;
import SxxMachine.exceptions.PInstantiationException;
/**
 * <code>java_declared_method0/3</code>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PRED_java_declared_method0_3 extends JavaPredicate {
    // private final Term LARG[0], LARG[1], LARG[2];

    public PRED_java_declared_method0_3(Term a1, Term a2, Term a3, Operation cont) {
	LARG[0] = a1;
	LARG[1] = a2;
	LARG[2] = a3;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.requireFeature(Prolog.Feature.JAVA_REFLECTION, this, LARG[0]);
        engine.setB0();

	Term a1, a2, a3;
	a1 = LARG[0];
	a2 = LARG[1];
	a3 = LARG[2];

	Class clazz = null;
	Object instance = null;
	Method[] methods = null;
	Method m = null;
	Object value = null;
	int arity;
	Term[] pArgs = null;
	Object[] jArgs = null;
	String methodName = null;

	// 3rd. argument (unbound variable)
	a3 = a3.dref();
	if (! (a3 instanceof VariableTerm))
	    throw new IllegalTypeException(this, 3, "variable", a3);
	try {
	    // 1st. argument (atom or java term)
	    a1 = a1.dref();
	    if ((a1 instanceof VariableTerm)) {
		throw new PInstantiationException(this, 1);
	    } else if ((a1 instanceof SymbolTerm)){      // class
		clazz = Class.forName(((SymbolTerm)a1).name());
	    } else if ((a1 instanceof FFIObjectTerm)) { // instance
		instance = ((FFIObjectTerm)a1).object();
		clazz = ((FFIObjectTerm)a1).getClazz();
	    } else {
		throw new IllegalTypeException(this, 1, "atom_or_java", a1);
	    }
	    // 2nd. argument (atom or callable term)
	    a2 = a2.dref();
	    if ((a2 instanceof VariableTerm)) {
		throw new PInstantiationException(this, 2);
	    } else if ((a2 instanceof SymbolTerm)) {    // No argument method
		m = clazz.getDeclaredMethod(((SymbolTerm)a2).name());
		m.setAccessible(true);
		value = m.invoke(instance);
	    } else if ((a2 instanceof StructureTerm)) { // Parameterized method
		methodName = ((StructureTerm)a2).name();
		arity      = ((StructureTerm)a2).arity();
		methods = clazz.getDeclaredMethods();
		if (methods.length == 0)
		    throw new ExistenceException(this, 2, "method", a2, "");
		pArgs = ((StructureTerm)a2).args();
		jArgs = new Object[arity];
		for (int i=0; i<arity; i++) {
		    pArgs[i] = pArgs[i].dref();
		    if (! (pArgs[i] instanceof FFIObjectTerm))
			pArgs[i] = new FFIObjectTerm(pArgs[i]);
		    jArgs[i] = pArgs[i].toJava();
		}
			for (Method method : methods) {
				if (method.getName().equals(methodName)
						&& checkParameterTypes(method.getParameterTypes(), pArgs)) {
					try {
						m = method;
						m.setAccessible(true);
						value = m.invoke(instance, jArgs);
						break;     // Succeeds to invoke the method
					} catch (Exception e) {
						m = null;  // Back to loop
					}
				}
			}
		if (m == null)
		    throw new ExistenceException(this, 2, "method", a2, "");
	    } else {
		throw new IllegalTypeException(this, 2, "callable", a2);
	    }
	    if (value == null)
		return cont;
	    if (! a3.unify(toPrologTerm(value), engine.trail))
		return engine.fail();
	    return cont; 
	} catch (ClassNotFoundException e) {    // Class.forName
	    throw new JavaException(this, 1, e);
	} catch (NoSuchMethodException e) {     // Class.getDeclaredMethod
	    throw new JavaException(this, 2, e);
	} catch (SecurityException e) {         // Class.getDeclaredMethods
	    throw new JavaException(this, 2, e);
	} catch (IllegalAccessException e) {    // Method.invoke
	    throw new JavaException(this, 2, e);
	} catch (IllegalArgumentException e) {  // Method.invoke
	    throw new JavaException(this, 2, e);
	} catch (InvocationTargetException e) { // Method.invoke
	    throw new JavaException(this, 2, e);
	} catch (NullPointerException e) {      // Method.invoke
	    throw new JavaException(this, 2, e);
	}
    }

    private Term toPrologTerm(Object obj) {
	if (Term.instanceOfTerm(obj))
	    return (Term)obj;
	else 
	    return new FFIObjectTerm(obj);
    }
}
