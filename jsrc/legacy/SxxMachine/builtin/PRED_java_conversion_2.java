package SxxMachine;

import java.util.List;

import SxxMachine.ClosureTerm;
import SxxMachine.DoubleTerm;
import SxxMachine.FFIObjectTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.VariableTerm;
import SxxMachine.EvaluationException;
import SxxMachine.IllegalTypeException;
/**
 * <code>java_conversion/2</code>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PRED_java_conversion_2 extends Predicate.P2 {
    public PRED_java_conversion_2(Term a1, Term a2, Operation cont) {
	LARG[0] = a1;
	LARG[1] = a2;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1, a2;
	a1 = LARG[0];
	a2 = LARG[1];

	a1 = a1.dref();
	a2 = a2.dref();
	if ((a1 instanceof VariableTerm)) { // a1 = var
	    if ((a2 instanceof FFIObjectTerm)) { // a1 = var /\ a2 = java
		a1.asVariablelTerm().bind(inverseConversion((a2).object()), engine.trail);
	    } else { // a1 = var /\ a2 = nonjava
		a1.asVariablelTerm().bind(a2, engine.trail);
	    }
	} else if (! (a2 instanceof VariableTerm)) { // a1 = nonvar /\ a2 = nonvar
	    throw new IllegalTypeException(this, 2, "variable", a2);
	} else { // a1 = nonvar /\ a2 = var
	    // (a1 = java \/  a1 = str \/ a1 = clo) /\ a2 = var
	    if ((a1 instanceof FFIObjectTerm) || (a1 instanceof StructureTerm) || (a1 instanceof ClosureTerm)) {
		a2.asVariablelTerm().bind(a1, engine.trail);
	    } else { // a1 != java /\ a1 != str /\ a1 != clo /\ a2 = var
		a2.asVariablelTerm().bind(new FFIObjectTerm(a1.toJava()), engine.trail);
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
		t = TermData.CONS(inverseConversion(v.get(i-1)), t);
	    }
	    return t;
	}
	return new FFIObjectTerm(o);
    }
}
