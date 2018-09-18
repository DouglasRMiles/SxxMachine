package SxxMachine;

import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.Token;
/**
 * <code>'$atom_type0'/2</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class PRED_$atom_type0_2 extends Predicate.P2 {
    public PRED_$atom_type0_2(Term a1, Term a2, Operation cont){ 
	LARG[0] = a1;
	LARG[1] = a2;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1, a2;
	int type;
	a1 = LARG[0];
	a2 = LARG[1];

	a1 = a1.dref();
	if(! (a1 instanceof SymbolTerm))
	    return engine.fail();
	type = Token.getStringType(a1.asSymbolTerm().name());
	if(! a2.unify(new IntegerTerm(type), engine.trail)) 
	    return engine.fail();
	return cont;
    }
}
