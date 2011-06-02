package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/**
 * <code>halt/1</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
*/
public class PRED_halt_1 extends Predicate {

    public Term arg1;

    public PRED_halt_1(Term a1, Operation cont) {
        arg1 = a1;
        this.cont = cont;
    }

    public String toString() {
        return "halt(" + arg1 + ")";
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1;
        a1 = arg1;

	a1 = a1.dereference();
	if (a1.isVariable())
	    throw new PInstantiationException(this, 1);
	if (! a1.isInteger())
	    throw new IllegalTypeException(this, 1, "integer", a1);
	engine.exceptionRaised = ((IntegerTerm)a1).intValue();
        return cont;
    }
}
