package SxxMachine.builtin;

import java.lang.reflect.Field;

import SxxMachine.FFIObjectTerm;
import SxxMachine.JavaPredicate;
import SxxMachine.Operation;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.IllegalTypeException;
import SxxMachine.JavaException;
import SxxMachine.PInstantiationException;
/**
 * <code>java_set_field0/3</code>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PRED_java_set_field0_3 extends JavaPredicate {
	// private final Term LARG[0], LARG[1], LARG[2];

    public PRED_java_set_field0_3(Term a1, Term a2, Term a3, Operation cont) {
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

	Class  clazz = null;
	Object instance = null;
	Field  field = null;
	Object value = null;

	try {
	    // 1st. argument (atom or java term)
	    a1 = a1.dref();
	    if ((a1 instanceof VariableTerm)) {
		throw new PInstantiationException(this, 1);
	    } else if ((a1 instanceof SymbolTerm)){      // class
		clazz = Class.forName(a1.asSymbolTerm().name());
	    } else if ((a1 instanceof FFIObjectTerm)) { // instance
		instance = (a1).object();
		clazz = (a1).getClazz();
	    } else {
		throw new IllegalTypeException(this, 1, "atom_or_java", a1);
	    }
	    // 2nd. argument (atom)
	    a2 = a2.dref();
	    if ((a2 instanceof VariableTerm)) {
		throw new PInstantiationException(this, 2);
	    } else if (! (a2 instanceof SymbolTerm)) {
		throw new IllegalTypeException(this, 2, "atom", a2);
	    }
	    field = clazz.getField(a2.asSymbolTerm().name());
	    // 3rd. argument (term)
	    a3 = a3.dref();
	    if ((a3 instanceof FFIObjectTerm))
		value = a3.toJava();
	    else
		value = a3;
	    field.set(instance, value);
	    return cont; 
	} catch (ClassNotFoundException e) {    // Class.forName
	    throw new JavaException(this, 1, e);
	} catch (NoSuchFieldException e) {      // Class.getField(..)
	    throw new JavaException(this, 2, e);
	} catch (SecurityException e) {         // Class.getField(..)
	    throw new JavaException(this, 2, e);
	} catch (NullPointerException e) {      // Class.getField(..)
	    throw new JavaException(this, 2, e);
	} catch (IllegalAccessException e) {    // Field.get(..)
	    throw new JavaException(this, 2, e);
	} catch (IllegalArgumentException e) {  // Field.get(..)
	    throw new JavaException(this, 2, e);
	}
    }
}


