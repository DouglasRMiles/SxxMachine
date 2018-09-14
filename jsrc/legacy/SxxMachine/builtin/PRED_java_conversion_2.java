package SxxMachine.builtin;

import java.util.List;

import SxxMachine.exceptions.EvaluationException;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.ClosureTerm;
import SxxMachine.DoubleTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.JavaObjectTerm;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
/**
 * <code>java_conversion/2</code>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PRED_java_conversion_2 extends Predicate.P2 {
    public PRED_java_conversion_2(Term a1, Term a2, Operation cont) {
	arg1 = a1;
	arg2 = a2;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1, a2;
	a1 = arg1;
	a2 = arg2;

	a1 = a1.dereference();
	a2 = a2.dereference();
	if ((a1 instanceof VariableTerm)) { // a1 = var
	    if ((a2 instanceof JavaObjectTerm)) { // a1 = var /\ a2 = java
		((VariableTerm)a1).bind(inverseConversion(((JavaObjectTerm)a2).object()), engine.trail);
	    } else { // a1 = var /\ a2 = nonjava
		((VariableTerm)a1).bind(a2, engine.trail);
	    }
	} else if (! (a2 instanceof VariableTerm)) { // a1 = nonvar /\ a2 = nonvar
	    throw new IllegalTypeException(this, 2, "variable", a2);
	} else { // a1 = nonvar /\ a2 = var
	    // (a1 = java \/  a1 = str \/ a1 = clo) /\ a2 = var
	    if ((a1 instanceof JavaObjectTerm) || (a1 instanceof StructureTerm) || (a1 instanceof ClosureTerm)) {
		((VariableTerm)a2).bind(a1, engine.trail);
	    } else { // a1 != java /\ a1 != str /\ a1 != clo /\ a2 = var
		((VariableTerm)a2).bind(new JavaObjectTerm(a1.toJava()), engine.trail);
	    }
	}
	return cont;
    }

    protected Term inverseConversion(Object o) {
	if (o == null) {
	    throw new EvaluationException(this, 2, "undefined");
	} else if (o instanceof Byte    || 
		   o instanceof Short   ||
		   o instanceof Integer ||
		   o instanceof Long) {
	    return new IntegerTerm(((Number)o).intValue());
	} else if (o instanceof Float || 
		   o instanceof Double) {
	    return new DoubleTerm(((Number)o).doubleValue());
	} else if (o instanceof String) {
	    return SymbolTerm.create((String) o);
	} else if (o instanceof List) {
	    List v = (List) o;
	    Term t = Prolog.Nil;
	    for(int i= v.size(); i>0; i--) {
		t = new ListTerm(inverseConversion(v.get(i-1)), t);
	    }
	    return t;
	}
	return new JavaObjectTerm(o);
    }
}
