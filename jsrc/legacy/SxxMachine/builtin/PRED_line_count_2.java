package com.googlecode.prolog_cafe.builtin;

import com.googlecode.prolog_cafe.lang.*;
import com.googlecode.prolog_cafe.lang.Predicate.P2;

import java.io.PushbackReader;

public class PRED_line_count_2 extends P2 {

	public PRED_line_count_2(Term a1, Term a2, Operation cont) {
		arg1 = a1;
		arg2 = a2;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {
		engine.setB0();
		Term a1, a2;
		a1 = arg1;
		a2 = arg2;
		Object stream = null;
		Term t;

		// S_or_a
		a1 = a1.dereference();
		if ((a1 instanceof VariableTerm)) {
			throw new PInstantiationException(this, 1);
		} else if ((a1 instanceof SymbolTerm)) {
			if (!engine.getStreamManager().containsKey(a1)) {
				throw new ExistenceException(this, 1, "stream", a1, "");
			}
			stream = ((JavaObjectTerm) engine.getStreamManager().get(a1)).object();
		} else if ((a1 instanceof JavaObjectTerm)) {
			stream = ((JavaObjectTerm) a1).object();
		} else {
			throw new IllegalDomainException(this, 1, "stream_or_alias", a1);
		}
		if (!(stream instanceof PushbackReader))
			throw new PermissionException(this, "input", "stream", a1, "");
		// get line number
		if (!(stream instanceof LineNumberPushbackReader) 			
			 || !a2.unify(new IntegerTerm(((LineNumberPushbackReader) stream).getLineNumber()+1), engine.trail)){
//		if (!a2.unify(new IntegerTerm(0),engine.trail)){ // uncomment this for creating patch and comment two lines above
				return engine.fail();
		}
		return cont;
	}

}
