package SxxMachine.builtin;

import SxxMachine.ClosureTerm;
import SxxMachine.FFIObjectTerm;
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
import SxxMachine.IllegalDomainException;
import SxxMachine.IllegalTypeException;
import SxxMachine.PInstantiationException;

/**
 * <code>'$univ'/2</code><br>
 * 
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PRED_$univ_2 extends Predicate.P2 {
	private static final SymbolTerm SYM_DOT = SymbolTerm.intern(".");
	private static final SymbolTerm SYM_NIL = Prolog.Nil;

	public PRED_$univ_2(Term a1, Term a2, Operation cont) {
		LARG[0] = a1;
		LARG[1] = a2;
		this.cont = cont;
	}

	public String toString() {
		return "=..(" + LARG[0] + "," + LARG[1] + ")";
	}

	public Operation exec(Prolog engine) {
		engine.setB0();
		Term a1, a2;
		a1 = LARG[0];
		a2 = LARG[1];

		a1 = a1.dref();
		if ((a1 instanceof SymbolTerm) || (a1 instanceof NumberTerm) || (a1 instanceof FFIObjectTerm) || (a1 instanceof ClosureTerm)) {
			if (!a2.unify(TermData.CONS(a1, SYM_NIL), engine.trail))
				return engine.fail();
		} else if ((a1 instanceof ListTerm)) {
			Term t = TermData.CONS(a1.asListTerm().cdr(), SYM_NIL);
			t = TermData.CONS(a1.asListTerm().car(), t);
			t = TermData.CONS(SYM_DOT, t);
			if (!a2.unify(t, engine.trail))
				return engine.fail();
		} else if ((a1 instanceof StructureTerm)) {
			SymbolTerm sym = SymbolTerm.create(( a1).functor().name());
			Term[] args = ( a1).args();
			Term t = SYM_NIL;
			for (int i = args.length; i > 0; i--)
				t = TermData.CONS(args[i - 1], t);
			if (!a2.unify(TermData.CONS(sym, t), engine.trail))
				return engine.fail();
		} else if ((a1 instanceof VariableTerm)) {
			a2 = a2.dref();
			if ((a2 instanceof VariableTerm))
				throw new PInstantiationException(this, 2);
			else if (a2.equals(SYM_NIL))
				throw new IllegalDomainException(this, 2, "non_empty_list", a2);
			else if (!(a2 instanceof ListTerm))
				throw new IllegalTypeException(this, 2, "list", a2);
			Term head = a2.asListTerm().car().dref();
			Term tail = a2.asListTerm().cdr().dref();
			if ((head instanceof VariableTerm))
				throw new PInstantiationException(this, 2);
			if (tail.equals(SYM_NIL)) {
				if ((head instanceof SymbolTerm) || (head instanceof NumberTerm) || (head instanceof FFIObjectTerm) || (head instanceof ClosureTerm)) {
					if (!a1.unify(head, engine.trail))
						return engine.fail();
					return cont;
				} else {
					throw new IllegalTypeException(this, 2, "atomic", head);
				}
			}
			if (!(head instanceof SymbolTerm))
				throw new IllegalTypeException(this, 2, "atom", head);
			Term x = tail;
			while (!x.equals(SYM_NIL)) {
				if ((x instanceof VariableTerm))
					throw new PInstantiationException(this, 2);
				if (!(x instanceof ListTerm))
					throw new IllegalTypeException(this, 2, "list", a2);
				x = x.asListTerm().cdr().dref();
			}
			int n = a2.asListTerm().length() - 1;
			SymbolTerm sym = SymbolTerm.create(head.asSymbolTerm().name(), n);
			Term[] args = new Term[n];
			for (int i = 0; i < n; i++) {
				args[i] = tail.asListTerm().car().dref();
				tail = tail.asListTerm().cdr().dref();
			}
			Term t = null;
			if (SYM_DOT.equals(head)){
				if (n!=2){
					throw new IllegalDomainException(this, 2, "['.',head,tail]", a2);
				}
				t = TermData.CONS(args[0], args[1]);
			} else {
				t = new StructureTerm(sym, args);
			}			
			if (!a1.unify(t, engine.trail))
				return engine.fail();
		} else {
			return engine.fail();
		}
		return cont;
	}
}
