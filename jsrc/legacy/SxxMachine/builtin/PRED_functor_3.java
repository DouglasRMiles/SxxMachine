package SxxMachine.builtin;

import SxxMachine.ClosureTerm;
import SxxMachine.FFIObjectTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.ListTerm;
import SxxMachine.NumberTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.IllegalDomainException;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PInstantiationException;
/**
 * <code>functor/3</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PRED_functor_3 extends Predicate.P3 {
    private static final SymbolTerm SYM_DOT = SymbolTerm.intern(".");

    public PRED_functor_3(Term a1, Term a2, Term a3, Operation cont) {
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

	// functor(?X,+Y,+Z)
	a1 = a1.dref();
	if ((a1 instanceof VariableTerm)) {
	    a2 = a2.dref();
	    if ((a2 instanceof VariableTerm))
		throw new PInstantiationException(this, 2);
	    if (!(a2 instanceof SymbolTerm) &&  !(a2 instanceof NumberTerm) && !(a2 instanceof FFIObjectTerm) && !(a2 instanceof ClosureTerm))
		throw new IllegalTypeException(this, 2, "atomic", a2);
	    a3 = a3.dref();
	    if ((a3 instanceof VariableTerm))
		throw new PInstantiationException(this, 3);
	    if (! (a3 instanceof IntegerTerm))
		throw new IllegalTypeException(this, 3, "integer", a3);
	    int n = ((IntegerTerm)a3).intValue();
	    if (n < 0)
		throw new IllegalDomainException(this, 3, "not_less_than_zero", a3);
	    if (n == 0) {
		if(! a1.unify(a2, engine.trail))
		    return engine.fail();
		return cont;
	    }
	    if (! (a2 instanceof SymbolTerm))
		throw new IllegalTypeException(this, 2, "atom", a2);
	    if (n == 2  &&  a2.equals(SYM_DOT)) {
		Term t = TermData.CONS(new VariableTerm(engine), new VariableTerm(engine));
		if(! a1.unify(t, engine.trail))
		    return engine.fail();
		return cont;
	    }
	    Term[] args = new Term[n];
	    for(int i=0; i<n; i++)
		args[i] = new VariableTerm(engine);
	    SymbolTerm sym = SymbolTerm.create(((SymbolTerm)a2).name(), n);
	    if(! a1.unify(new StructureTerm(sym, args), engine.trail))
		return engine.fail();
	    return cont;
	}
	// functor(+X,?Y,?Z)
	Term functor;
	IntegerTerm arity;
	if ((a1 instanceof SymbolTerm) || (a1 instanceof NumberTerm) || (a1 instanceof FFIObjectTerm) || (a1 instanceof ClosureTerm)) {
	    functor = a1;
	    arity   = new IntegerTerm(0);
	} else if ((a1 instanceof ListTerm)) {
	    functor = SYM_DOT;
	    arity   = new IntegerTerm(2);
	} else if ((a1 instanceof StructureTerm)) {
	    functor = SymbolTerm.create(((StructureTerm)a1).name());
	    arity   = new IntegerTerm(((StructureTerm)a1).arity());
	} else {
	    return engine.fail();
	}
	if(! a2.unify(functor, engine.trail)) 
	    return engine.fail();
	if(! a3.unify(arity, engine.trail)) 
	    return engine.fail();
	return cont;
    }
}
