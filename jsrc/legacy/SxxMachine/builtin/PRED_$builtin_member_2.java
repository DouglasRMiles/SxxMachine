package com.googlecode.prolog_cafe.builtin;

import com.googlecode.prolog_cafe.lang.ListTerm;
import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.Predicate;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.PrologException;
import com.googlecode.prolog_cafe.lang.Term;
/**
 * '$builtin_member'(X, [X|_]).
 * '$builtin_member'(X, [_|L]) :- '$builtin_member'(X, L).
 */

final class PRED_$builtin_member_2 extends Predicate.P2 {

	private static final Operation CHECK = new Check();
	private static final Operation GET = new Get();
	private static final Operation NEXT = new Next();
	
    public PRED_$builtin_member_2(Term a1, Term a2, Operation cont) {
        this.arg1 = a1;
        this.arg2 = a2;
        this.cont = cont;
    }

    @Override
    public void toString(StringBuilder sb) {
        sb.append("$builtin_member(");
        arg1.toString(sb); sb.append(", "); arg2.toString(sb);
        sb.append(")");
    }


    @Override
    public final Operation exec(Prolog engine) {
        engine.areg1 = arg1;
        engine.areg2 = arg2;
        engine.cont = cont;
        engine.setB0();
        return CHECK;
    }

    private static class Check extends Operation{

		@Override
		public final Operation exec(Prolog engine) throws PrologException {
			Term a2 = engine.areg2.dereference();
			if (a2 instanceof ListTerm){
				engine.areg2 = a2;
				return engine.jtry2(GET, NEXT); 
			}			
			return engine.fail();
		}
    }

    private static class Get extends Operation{

		@Override
		public final Operation exec(Prolog engine) throws PrologException {
			Term a2 = engine.areg2;
			if (engine.areg1.unify(((ListTerm) a2).car(), engine.trail)){						
				return engine.cont;
			}
			return engine.fail();
		}
    	
    }

    private static class Next extends Operation{

		@Override
		public final Operation exec(Prolog engine) throws PrologException {
			Operation next = engine.trust(CHECK);
			engine.areg2 = ((ListTerm) engine.areg2).cdr();
			return next;
		}    	
    }
}
