package SxxMachine;

import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.Term;

public final class PRED_$compare0_3 extends Predicate.P3 {
    public PRED_$compare0_3(Term a1, Term a2, Term a3, Operation cont) {
        this.LARG[0] = a1;
        this.LARG[1] = a2;
        this.LARG[2] = a3;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a2 = LARG[1].dref();
        Term a3 = LARG[2].dref();
        if(! LARG[0].unify(new IntegerTerm(a2.compareTo(a3)), engine.trail))
          return engine.fail();
        return cont;
    }
}
