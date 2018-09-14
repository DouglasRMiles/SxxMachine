package SxxMachine.builtin;

import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PInstantiationException;
/**
 * <code>atom_concat/3</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
*/
public class PRED_atom_concat_3 extends Predicate.P3 {
    private static final SymbolTerm AC_2 = SymbolTerm.intern("ac", 2);

    public PRED_atom_concat_3(Term a1, Term a2, Term a3, Operation cont) {
        LARG[0] = a1;
        LARG[1] = a2;
        LARG[2] = a3;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];

	a3 = a3.dref();
	if ((a3 instanceof SymbolTerm)) {
		SymbolTerm s3 = (SymbolTerm) a3;
		int endIndex = s3.length();
	    Term t = Prolog.Nil;
	    for (int i=0; i<=endIndex; i++) {
		Term[] args = { s3.subsymbol(0, i),	s3.subsymbol(i)	};
		t = TermData.CONS(new StructureTerm(AC_2, args), t);
	    }
	    return new PRED_$member_in_reverse_2(new StructureTerm(AC_2, a1, a2), t, cont);
	} else if (! (a3 instanceof VariableTerm)) {
	    throw new IllegalTypeException(this, 3, "atom", a3);
	}
	// a3 is a variable
	a1 = a1.dref();
	a2 = a2.dref();
	if ((a1 instanceof VariableTerm))
	    throw new PInstantiationException(this, 1);
	if ((a2 instanceof VariableTerm))
	    throw new PInstantiationException(this, 2);
	if (! (a1 instanceof SymbolTerm))
	    throw new IllegalTypeException(this, 1, "integer", a1);
	if (! (a2 instanceof SymbolTerm))
	    throw new IllegalTypeException(this, 2, "integer", a2);
	String str3 = ((SymbolTerm) a1).name().concat(((SymbolTerm) a2).name());
	if (! a3.unify(SymbolTerm.create(str3), engine.trail))
	    return engine.fail();
        return cont;
    }
}
