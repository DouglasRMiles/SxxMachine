package SxxMachine.builtin;

import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;


public final class PRED_reverse_2 extends Predicate.P2 {
    private static final SymbolTerm s1 = SymbolTerm.intern("[]");

    public PRED_reverse_2(Term a1, Term a2, Operation cont) {
        this.LARG[0] = a1;
        this.LARG[1] = a2;
        this.cont = cont;
    }

    @Override
    public void toString(StringBuilder sb) {
        sb.append("reverse(");
        LARG[0].toString(sb); sb.append(", "); LARG[1].toString(sb);
        sb.append(")");
    }


    @Override
    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1 = LARG[0].dref();
        Term a2 = LARG[1].dref();

		if (a1 instanceof ListTerm || a1.isNil()) {
            Term r = Prolog.Nil;
            while (a1 instanceof ListTerm) {
                r = TermData.CONS(((ListTerm) a1).car(), r);
                a1 = ((ListTerm) a1).cdr();
            }
            if (a1.isNil() && a2.unify(r, engine.trail)){
            	return cont;
			}
        }
        return engine.fail();
    }
}
