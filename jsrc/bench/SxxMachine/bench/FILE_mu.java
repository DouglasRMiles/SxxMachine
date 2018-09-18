package SxxMachine.bench;

import static SxxMachine.builtin.bootpreds.*;
import static SxxMachine.builtin.FILE_builtins.*;
import static SxxMachine.builtin.FILE_swi_supp.*;
import static SxxMachine.Failure.*;
import SxxMachine.*;
import SxxMachine.builtin.*;

public class FILE_mu  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-mu
		m.setB0();
		// top:-[mu]
		return //
		Op((Prolog e) -> PRED_mu_0_static_exec(e), VA(), cont);
	}

	/** PREDICATE: mu/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
	private static final SymbolTerm PRED_mu_0_s1 = SYM("m");
	final static SymbolTerm ATOM_u = SYM("u");
	final static SymbolTerm ATOM_i = SYM("i");
	private static final ListTerm PRED_mu_0_s5 = CONS(ATOM_u, Prolog.Nil);
	private static final ListTerm PRED_mu_0_s6 = CONS(ATOM_i, PRED_mu_0_s5);
	private static final ListTerm PRED_mu_0_s7 = CONS(ATOM_i, PRED_mu_0_s6);
	private static final ListTerm PRED_mu_0_s8 = CONS(ATOM_u, PRED_mu_0_s7);
	private static final ListTerm PRED_mu_0_s9 = CONS(PRED_mu_0_s1, PRED_mu_0_s8);
	final static IntegerTerm int_5 = Integer(5);

	public static Operation PRED_mu_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// mu:-theorem([m,u,i,i,u],5,A),!
		m.setB0();
		Term a1;
		// mu:-['$get_level'(A),theorem([m,u,i,i,u],5,B),'$cut'(A)]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_theorem_3_static_exec(e), VA(PRED_mu_0_s9, int_5, V(m)), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a1), cont));
	}

	/** PREDICATE: theorem/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
	private static final SymbolTerm PRED_theorem_3_s1 = SYM("m");
	private static final ListTerm PRED_theorem_3_s4 = CONS(ATOM_i, Prolog.Nil);
	private static final ListTerm PRED_theorem_3_s5 = CONS(PRED_theorem_3_s1, PRED_theorem_3_s4);
	final static SymbolTerm ATOM_a = SYM("a");
	private static final ListTerm PRED_theorem_3_s7 = CONS(ATOM_a, PRED_theorem_3_s5);
	private static final ListTerm PRED_theorem_3_s8 = CONS(PRED_theorem_3_s7, Prolog.Nil);
	final static IntegerTerm int_0 = Integer(0);
	final static IntegerTerm int_1 = Integer(1);

	public static Operation PRED_theorem_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return theorem_3_top(m);
	}

	private final static Operation theorem_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_mu::theorem_3_var, FILE_mu::theorem_3_2, FILE_mu::theorem_3_2, FILE_mu::theorem_3_2, FILE_mu::theorem_3_2, FILE_mu::theorem_3_var);
	}

	private final static Operation theorem_3_var(Prolog m) {
		m.jtry3(null, FILE_mu::theorem_3_var_1);
		return theorem_3_1(m);
	}

	private final static Operation theorem_3_var_1(Prolog m) {
		m.trust(null);
		return theorem_3_2(m);
	}

	private final static Operation theorem_3_1(Prolog m) {
		// theorem([m,i],A,[[a,m,i]]):-true
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// theorem([m,i],A,[[a,m,i]]):-[]
		if (!PRED_theorem_3_s5.unify(a1, m.trail))
			return m.fail();
		if (!PRED_theorem_3_s8.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation theorem_3_2(Prolog m) {
		// theorem(A,B,[[C|A]|D]):-B>0,E is B-1,theorem(F,E,D),rule(C,F,A)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// theorem(A,B,[[C|A]|D]):-[E is 0,'$greater_than'(B,E),F is B-1,theorem(G,F,D),rule(C,G,A)]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a4 = argz[0];
			a5 = argz[1];
		} else if (a3.isVar()) {
			a4 = V(m);
			a5 = V(m);
			a3.bind(CONS(a4, a5), m.trail);
		} else {
			return m.fail();
		}
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a6 = argz[0];
			if (!a1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a4.isVar()) {
			a6 = V(m);
			a4.bind(CONS(a6, a1), m.trail);
		} else {
			return m.fail();
		}
		a7 = V(m);
		//START inline expansion of a(7)is@(int_0)
		if (!a7.unify(Arithmetic.evaluate(int_0), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(2),a(7))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a7)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		a8 = V(m);
		Term[] y1 = VA(a2, int_1);
		a9 = S("-", y1);
		//START inline expansion of a(8)is a(9)
		if (!a8.unify(Arithmetic.evaluate(a9), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a10 = V(m);
		p1 = //
				Op((Prolog e) -> PRED_rule_3_static_exec(e), VA(a6, a10, a1), cont);
		m.AREGS[0] = a10;
		m.AREGS[1] = a8;
		m.AREGS[2] = a5;
		m.cont = p1;
		return theorem_3_top(m);
	}

	/** PREDICATE: rule/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
	private static final /**/ IntegerTerm PRED_rule_3_s1 = Integer(1);
	final static IntegerTerm int_2 = Integer(2);
	final static IntegerTerm int_3 = Integer(3);
	final static IntegerTerm int_4 = Integer(4);

	public static Operation PRED_rule_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_mu::rule_3_var, FILE_mu::rule_3_var, fail_0, fail_0, fail_0, fail_0);
	}

	private final static Operation rule_3_var(Prolog m) {
		m.jtry3(null, FILE_mu::rule_3_var_1);
		return rule_3_1(m);
	}

	private final static Operation rule_3_var_1(Prolog m) {
		m.retry(null, FILE_mu::rule_3_var_2);
		return rule_3_2(m);
	}

	private final static Operation rule_3_var_2(Prolog m) {
		m.retry(null, FILE_mu::rule_3_var_3);
		return rule_3_3(m);
	}

	private final static Operation rule_3_var_3(Prolog m) {
		m.trust(null);
		return rule_3_4(m);
	}

	private final static Operation rule_3_1(Prolog m) {
		// rule(1,A,B):-rule1(A,B)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// rule(1,A,B):-[rule1(A,B)]
		if (!PRED_rule_3_s1.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_rule1_2_static_exec(e), VA(a2, a3), cont);
	}

	private final static Operation rule_3_2(Prolog m) {
		// rule(2,A,B):-rule2(A,B)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// rule(2,A,B):-[rule2(A,B)]
		if (!int_2.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_rule2_2_static_exec(e), VA(a2, a3), cont);
	}

	private final static Operation rule_3_3(Prolog m) {
		// rule(3,A,B):-rule3(A,B)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// rule(3,A,B):-[rule3(A,B)]
		if (!int_3.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_rule3_2_static_exec(e), VA(a2, a3), cont);
	}

	private final static Operation rule_3_4(Prolog m) {
		// rule(4,A,B):-rule4(A,B)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// rule(4,A,B):-[rule4(A,B)]
		if (!int_4.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_rule4_2_static_exec(e), VA(a2, a3), cont);
	}

	/** PREDICATE: rule1/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
	private static final SymbolTerm PRED_rule1_2_s1 = SYM("i");
	private static final ListTerm PRED_rule1_2_s3 = CONS(PRED_rule1_2_s1, Prolog.Nil);
	private static final ListTerm PRED_rule1_2_s5 = CONS(ATOM_u, Prolog.Nil);
	private static final ListTerm PRED_rule1_2_s6 = CONS(PRED_rule1_2_s1, PRED_rule1_2_s5);

	public static Operation PRED_rule1_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return rule1_2_top(m);
	}

	private final static Operation rule1_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_mu::rule1_2_var, fail_0, fail_0, fail_0, fail_0, FILE_mu::rule1_2_var);
	}

	private final static Operation rule1_2_var(Prolog m) {
		m.jtry2(null, FILE_mu::rule1_2_var_1);
		return rule1_2_1(m);
	}

	private final static Operation rule1_2_var_1(Prolog m) {
		m.trust(null);
		return rule1_2_2(m);
	}

	private final static Operation rule1_2_1(Prolog m) {
		// rule1([i],[i,u]):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// rule1([i],[i,u]):-[]
		if (!PRED_rule1_2_s3.unify(a1, m.trail))
			return m.fail();
		if (!PRED_rule1_2_s6.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation rule1_2_2(Prolog m) {
		// rule1([A|B],[A|C]):-rule1(B,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// rule1([A|B],[A|C]):-[rule1(B,C)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
			a4 = argz[1];
		} else if (a1.isVar()) {
			a3 = V(m);
			a4 = V(m);
			a1.bind(CONS(a3, a4), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			a5 = argz[1];
		} else if (a2.isVar()) {
			a5 = V(m);
			a2.bind(CONS(a3, a5), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a4;
		m.AREGS[1] = a5;
		m.cont = cont;
		return rule1_2_top(m);
	}

	/** PREDICATE: rule2/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
	private static final SymbolTerm PRED_rule2_2_s1 = SYM("m");

	public static Operation PRED_rule2_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// rule2([m|A],[m|B]):-append(A,A,B)
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// rule2([m|A],[m|B]):-[append(A,A,B)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			if (!PRED_rule2_2_s1.unify(argz[0], m.trail))
				return m.fail();
			a3 = argz[1];
		} else if (a1.isVar()) {
			a3 = V(m);
			a1.bind(CONS(PRED_rule2_2_s1, a3), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!PRED_rule2_2_s1.unify(argz[0], m.trail))
				return m.fail();
			a4 = argz[1];
		} else if (a2.isVar()) {
			a4 = V(m);
			a2.bind(CONS(PRED_rule2_2_s1, a4), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_append_3_static_exec(e), VA(a3, a3, a4), cont);
	}

	/** PREDICATE: rule3/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
	private static final SymbolTerm PRED_rule3_2_s1 = SYM("i");

	public static Operation PRED_rule3_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return rule3_2_top(m);
	}

	private final static Operation rule3_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_mu::rule3_2_var, fail_0, fail_0, fail_0, fail_0, FILE_mu::rule3_2_var);
	}

	private final static Operation rule3_2_var(Prolog m) {
		m.jtry2(null, FILE_mu::rule3_2_var_1);
		return rule3_2_1(m);
	}

	private final static Operation rule3_2_var_1(Prolog m) {
		m.trust(null);
		return rule3_2_2(m);
	}

	private final static Operation rule3_2_1(Prolog m) {
		// rule3([i,i,i|A],[u|A]):-true
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// rule3([i,i,i|A],[u|A]):-[]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			if (!PRED_rule3_2_s1.unify(argz[0], m.trail))
				return m.fail();
			a3 = argz[1];
		} else if (a1.isVar()) {
			a3 = V(m);
			a1.bind(CONS(PRED_rule3_2_s1, a3), m.trail);
		} else {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!PRED_rule3_2_s1.unify(argz[0], m.trail))
				return m.fail();
			a4 = argz[1];
		} else if (a3.isVar()) {
			a4 = V(m);
			a3.bind(CONS(PRED_rule3_2_s1, a4), m.trail);
		} else {
			return m.fail();
		}
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			if (!PRED_rule3_2_s1.unify(argz[0], m.trail))
				return m.fail();
			a5 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a4.bind(CONS(PRED_rule3_2_s1, a5), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!ATOM_u.unify(argz[0], m.trail))
				return m.fail();
			if (!a5.unify(argz[1], m.trail))
				return m.fail();
		} else if (a2.isVar()) {
			a2.bind(CONS(ATOM_u, a5), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation rule3_2_2(Prolog m) {
		// rule3([A|B],[A|C]):-rule3(B,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// rule3([A|B],[A|C]):-[rule3(B,C)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
			a4 = argz[1];
		} else if (a1.isVar()) {
			a3 = V(m);
			a4 = V(m);
			a1.bind(CONS(a3, a4), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			a5 = argz[1];
		} else if (a2.isVar()) {
			a5 = V(m);
			a2.bind(CONS(a3, a5), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a4;
		m.AREGS[1] = a5;
		m.cont = cont;
		return rule3_2_top(m);
	}

	/** PREDICATE: rule4/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
	private static final SymbolTerm PRED_rule4_2_s1 = SYM("u");

	public static Operation PRED_rule4_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return rule4_2_top(m);
	}

	private final static Operation rule4_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_mu::rule4_2_var, fail_0, fail_0, fail_0, fail_0, FILE_mu::rule4_2_var);
	}

	private final static Operation rule4_2_var(Prolog m) {
		m.jtry2(null, FILE_mu::rule4_2_var_1);
		return rule4_2_1(m);
	}

	private final static Operation rule4_2_var_1(Prolog m) {
		m.trust(null);
		return rule4_2_2(m);
	}

	private final static Operation rule4_2_1(Prolog m) {
		// rule4([u,u|A],A):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// rule4([u,u|A],A):-[]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			if (!PRED_rule4_2_s1.unify(argz[0], m.trail))
				return m.fail();
			a3 = argz[1];
		} else if (a1.isVar()) {
			a3 = V(m);
			a1.bind(CONS(PRED_rule4_2_s1, a3), m.trail);
		} else {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!PRED_rule4_2_s1.unify(argz[0], m.trail))
				return m.fail();
			a4 = argz[1];
		} else if (a3.isVar()) {
			a4 = V(m);
			a3.bind(CONS(PRED_rule4_2_s1, a4), m.trail);
		} else {
			return m.fail();
		}
		if (!a4.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation rule4_2_2(Prolog m) {
		// rule4([A|B],[A|C]):-rule4(B,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// rule4([A|B],[A|C]):-[rule4(B,C)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
			a4 = argz[1];
		} else if (a1.isVar()) {
			a3 = V(m);
			a4 = V(m);
			a1.bind(CONS(a3, a4), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			a5 = argz[1];
		} else if (a2.isVar()) {
			a5 = V(m);
			a2.bind(CONS(a3, a5), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a4;
		m.AREGS[1] = a5;
		m.cont = cont;
		return rule4_2_top(m);
	}

	/** PREDICATE: append/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
	private static final SymbolTerm PRED_append_3_s1 = SYM("[]");

	public static Operation PRED_append_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return append_3_top(m);
	}

	private final static Operation append_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_mu::append_3_var, fail_0, fail_0, FILE_mu::append_3_1, fail_0, FILE_mu::append_3_2);
	}

	private final static Operation append_3_var(Prolog m) {
		m.jtry3(null, FILE_mu::append_3_var_1);
		return append_3_1(m);
	}

	private final static Operation append_3_var_1(Prolog m) {
		m.trust(null);
		return append_3_2(m);
	}

	private final static Operation append_3_1(Prolog m) {
		// append([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// append([],A,A):-[]
		if (!PRED_append_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation append_3_2(Prolog m) {
		// append([A|B],C,[A|D]):-append(B,C,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// append([A|B],C,[A|D]):-[append(B,C,D)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a4 = argz[0];
			a5 = argz[1];
		} else if (a1.isVar()) {
			a4 = V(m);
			a5 = V(m);
			a1.bind(CONS(a4, a5), m.trail);
		} else {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a4.unify(argz[0], m.trail))
				return m.fail();
			a6 = argz[1];
		} else if (a3.isVar()) {
			a6 = V(m);
			a3.bind(CONS(a4, a6), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a5;
		m.AREGS[1] = a2;
		m.AREGS[2] = a6;
		m.cont = cont;
		return append_3_top(m);
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_mu::PRED_top_0_static_exec);
		PredTable.registerBuiltin("mu", 0, FILE_mu::PRED_mu_0_static_exec);
		PredTable.registerBuiltin("theorem", 3, FILE_mu::PRED_theorem_3_static_exec);
		PredTable.registerBuiltin("rule", 3, FILE_mu::PRED_rule_3_static_exec);
		PredTable.registerBuiltin("rule1", 2, FILE_mu::PRED_rule1_2_static_exec);
		PredTable.registerBuiltin("rule2", 2, FILE_mu::PRED_rule2_2_static_exec);
		PredTable.registerBuiltin("rule3", 2, FILE_mu::PRED_rule3_2_static_exec);
		PredTable.registerBuiltin("rule4", 2, FILE_mu::PRED_rule4_2_static_exec);
		PredTable.registerBuiltin("append", 3, FILE_mu::PRED_append_3_static_exec);
	}
}
