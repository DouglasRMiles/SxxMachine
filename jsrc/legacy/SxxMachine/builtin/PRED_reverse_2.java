package com.googlecode.prolog_cafe.builtin;

import com.googlecode.prolog_cafe.lang.*;


public final class PRED_reverse_2 extends Predicate.P2 {
    private static final SymbolTerm s1 = SymbolTerm.intern("[]");

    public PRED_reverse_2(Term a1, Term a2, Operation cont) {
        this.arg1 = a1;
        this.arg2 = a2;
        this.cont = cont;
    }

    @Override
    public void toString(StringBuilder sb) {
        sb.append("reverse(");
        arg1.toString(sb); sb.append(", "); arg2.toString(sb);
        sb.append(")");
    }


    @Override
    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1 = arg1.dereference();
        Term a2 = arg2.dereference();

		if (a1 instanceof ListTerm || a1.isNil()) {
            Term r = Prolog.Nil;
            while (a1 instanceof ListTerm) {
                r = new ListTerm(((ListTerm) a1).car(), r);
                a1 = ((ListTerm) a1).cdr();
            }
            if (a1.isNil() && a2.unify(r, engine.trail)){
            	return cont;
			}
        }
        return engine.fail();
    }
}
