package SxxMachine;

import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.IllegalTypeException;
/**
 <code>'$cut'/1</code><br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
public class PRED_$cut_1 extends Predicate.P1 {
    public PRED_$cut_1(Term a1, Operation cont) {
        LARG[0] = a1;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
	//        engine.setB0(); 
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        if (! (a1 instanceof IntegerTerm)) {
            throw new IllegalTypeException("integer", a1);
        } else {
            engine.cut(a1.asIntegerTerm().intValue());
        }
        return cont;
    }
}
