package SxxMachine;

import java.io.PushbackReader;

import SxxMachine.FFIObjectTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.LineNumberPushbackReader;
import SxxMachine.Operation;
import SxxMachine.Predicate.P2;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.ExistenceException;
import SxxMachine.IllegalDomainException;
import SxxMachine.PInstantiationException;
import SxxMachine.PermissionException;
import SxxMachine.PrologException;

public class PRED_line_count_2 extends P2 {

	public PRED_line_count_2(Term a1, Term a2, Operation cont) {
		LARG[0] = a1;
		LARG[1] = a2;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {
		engine.setB0();
		Term a1, a2;
		a1 = LARG[0];
		a2 = LARG[1];
		Object stream = null;
		Term t;

		// S_or_a
		a1 = a1.dref();
		if ((a1 instanceof VariableTerm)) {
			throw new PInstantiationException(this, 1);
		} else if ((a1 instanceof SymbolTerm)) {
			if (!engine.getStreamManager().containsKey(a1)) {
				throw new ExistenceException(this, 1, "stream", a1, "");
			}
			stream = ( engine.getStreamManager().get(a1)).object();
		} else if ((a1 instanceof FFIObjectTerm)) {
			stream = a1.object();
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
