package SxxMachine.bench;

import static SxxMachine.bootpreds.*;
import static SxxMachine.FILE_builtins.*;
import static SxxMachine.FILE_swi_supp.*;
import static SxxMachine.Failure.*;
import SxxMachine.*;
import SxxMachine.*;

public class FILE_nreverse  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nreverse.pl
	*/

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-nreverse
		m.setB0();
		// top:-[nreverse]
		return //
		Op((Prolog e) -> PRED_nreverse_0_static_exec(e), VA(), cont);
	}

	/** PREDICATE: nreverse/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nreverse.pl
	*/
	private static final /**/ IntegerTerm PRED_nreverse_0_s1 = Integer(1);
	final static IntegerTerm int_2 = Integer(2);
	final static IntegerTerm int_3 = Integer(3);
	final static IntegerTerm int_4 = Integer(4);
	final static IntegerTerm int_5 = Integer(5);
	final static IntegerTerm int_6 = Integer(6);
	final static IntegerTerm int_7 = Integer(7);
	final static IntegerTerm int_8 = Integer(8);
	final static IntegerTerm int_9 = Integer(9);
	final static IntegerTerm int_10 = Integer(10);
	final static IntegerTerm int_11 = Integer(11);
	final static IntegerTerm int_12 = Integer(12);
	final static IntegerTerm int_13 = Integer(13);
	final static IntegerTerm int_14 = Integer(14);
	final static IntegerTerm int_15 = Integer(15);
	final static IntegerTerm int_16 = Integer(16);
	final static IntegerTerm int_17 = Integer(17);
	final static IntegerTerm int_18 = Integer(18);
	final static IntegerTerm int_19 = Integer(19);
	final static IntegerTerm int_20 = Integer(20);
	final static IntegerTerm int_21 = Integer(21);
	final static IntegerTerm int_22 = Integer(22);
	final static IntegerTerm int_23 = Integer(23);
	final static IntegerTerm int_24 = Integer(24);
	final static IntegerTerm int_25 = Integer(25);
	final static IntegerTerm int_26 = Integer(26);
	final static IntegerTerm int_27 = Integer(27);
	final static IntegerTerm int_28 = Integer(28);
	final static IntegerTerm int_29 = Integer(29);
	final static IntegerTerm int_30 = Integer(30);
	private static final ListTerm PRED_nreverse_0_s32 = CONS(int_30, Prolog.Nil);
	private static final ListTerm PRED_nreverse_0_s33 = CONS(int_29, PRED_nreverse_0_s32);
	private static final ListTerm PRED_nreverse_0_s34 = CONS(int_28, PRED_nreverse_0_s33);
	private static final ListTerm PRED_nreverse_0_s35 = CONS(int_27, PRED_nreverse_0_s34);
	private static final ListTerm PRED_nreverse_0_s36 = CONS(int_26, PRED_nreverse_0_s35);
	private static final ListTerm PRED_nreverse_0_s37 = CONS(int_25, PRED_nreverse_0_s36);
	private static final ListTerm PRED_nreverse_0_s38 = CONS(int_24, PRED_nreverse_0_s37);
	private static final ListTerm PRED_nreverse_0_s39 = CONS(int_23, PRED_nreverse_0_s38);
	private static final ListTerm PRED_nreverse_0_s40 = CONS(int_22, PRED_nreverse_0_s39);
	private static final ListTerm PRED_nreverse_0_s41 = CONS(int_21, PRED_nreverse_0_s40);
	private static final ListTerm PRED_nreverse_0_s42 = CONS(int_20, PRED_nreverse_0_s41);
	private static final ListTerm PRED_nreverse_0_s43 = CONS(int_19, PRED_nreverse_0_s42);
	private static final ListTerm PRED_nreverse_0_s44 = CONS(int_18, PRED_nreverse_0_s43);
	private static final ListTerm PRED_nreverse_0_s45 = CONS(int_17, PRED_nreverse_0_s44);
	private static final ListTerm PRED_nreverse_0_s46 = CONS(int_16, PRED_nreverse_0_s45);
	private static final ListTerm PRED_nreverse_0_s47 = CONS(int_15, PRED_nreverse_0_s46);
	private static final ListTerm PRED_nreverse_0_s48 = CONS(int_14, PRED_nreverse_0_s47);
	private static final ListTerm PRED_nreverse_0_s49 = CONS(int_13, PRED_nreverse_0_s48);
	private static final ListTerm PRED_nreverse_0_s50 = CONS(int_12, PRED_nreverse_0_s49);
	private static final ListTerm PRED_nreverse_0_s51 = CONS(int_11, PRED_nreverse_0_s50);
	private static final ListTerm PRED_nreverse_0_s52 = CONS(int_10, PRED_nreverse_0_s51);
	private static final ListTerm PRED_nreverse_0_s53 = CONS(int_9, PRED_nreverse_0_s52);
	private static final ListTerm PRED_nreverse_0_s54 = CONS(int_8, PRED_nreverse_0_s53);
	private static final ListTerm PRED_nreverse_0_s55 = CONS(int_7, PRED_nreverse_0_s54);
	private static final ListTerm PRED_nreverse_0_s56 = CONS(int_6, PRED_nreverse_0_s55);
	private static final ListTerm PRED_nreverse_0_s57 = CONS(int_5, PRED_nreverse_0_s56);
	private static final ListTerm PRED_nreverse_0_s58 = CONS(int_4, PRED_nreverse_0_s57);
	private static final ListTerm PRED_nreverse_0_s59 = CONS(int_3, PRED_nreverse_0_s58);
	private static final ListTerm PRED_nreverse_0_s60 = CONS(int_2, PRED_nreverse_0_s59);
	private static final ListTerm PRED_nreverse_0_s61 = CONS(PRED_nreverse_0_s1, PRED_nreverse_0_s60);

	public static Operation PRED_nreverse_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// nreverse:-nreverse([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30],A)
		m.setB0();
		// nreverse:-[nreverse([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30],A)]
		return //
		Op((Prolog e) -> PRED_nreverse_2_static_exec(e), VA(PRED_nreverse_0_s61, V(m)), cont);
	}

	/** PREDICATE: nreverse/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nreverse.pl
	*/
	private static final SymbolTerm PRED_nreverse_2_s1 = SYM("[]");

	public static Operation PRED_nreverse_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return nreverse_2_top(m);
	}

	private final static Operation nreverse_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_nreverse::nreverse_2_var, fail_0, fail_0, FILE_nreverse::nreverse_2_2, fail_0, FILE_nreverse::nreverse_2_1);
	}

	private final static Operation nreverse_2_var(Prolog m) {
		m.jtry2(null, FILE_nreverse::nreverse_2_var_1);
		return nreverse_2_1(m);
	}

	private final static Operation nreverse_2_var_1(Prolog m) {
		m.trust(null);
		return nreverse_2_2(m);
	}

	private final static Operation nreverse_2_1(Prolog m) {
		// nreverse([A|B],C):-nreverse(B,D),concatenate(D,[A],C)
		Term a1, a2, a3, a4, a5, a6;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// nreverse([A|B],C):-[nreverse(B,D),concatenate(D,[A],C)]
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
		a5 = V(m);
		a6 = CONS(a3, PRED_nreverse_2_s1);
		p1 = //
				Op((Prolog e) -> PRED_concatenate_3_static_exec(e), VA(a5, a6, a2), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a5;
		m.cont = p1;
		return nreverse_2_top(m);
	}

	private final static Operation nreverse_2_2(Prolog m) {
		// nreverse([],[]):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// nreverse([],[]):-[]
		if (!PRED_nreverse_2_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_nreverse_2_s1.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: concatenate/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nreverse.pl
	*/
	private static final SymbolTerm PRED_concatenate_3_s1 = SYM("[]");

	public static Operation PRED_concatenate_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return concatenate_3_top(m);
	}

	private final static Operation concatenate_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_nreverse::concatenate_3_var, fail_0, fail_0, FILE_nreverse::concatenate_3_2, fail_0, FILE_nreverse::concatenate_3_1);
	}

	private final static Operation concatenate_3_var(Prolog m) {
		m.jtry3(null, FILE_nreverse::concatenate_3_var_1);
		return concatenate_3_1(m);
	}

	private final static Operation concatenate_3_var_1(Prolog m) {
		m.trust(null);
		return concatenate_3_2(m);
	}

	private final static Operation concatenate_3_1(Prolog m) {
		// concatenate([A|B],C,[A|D]):-concatenate(B,C,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// concatenate([A|B],C,[A|D]):-[concatenate(B,C,D)]
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
		return concatenate_3_top(m);
	}

	private final static Operation concatenate_3_2(Prolog m) {
		// concatenate([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// concatenate([],A,A):-[]
		if (!PRED_concatenate_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_nreverse::PRED_top_0_static_exec);
		PredTable.registerBuiltin("nreverse", 0, FILE_nreverse::PRED_nreverse_0_static_exec);
		PredTable.registerBuiltin("nreverse", 2, FILE_nreverse::PRED_nreverse_2_static_exec);
		PredTable.registerBuiltin("concatenate", 3, FILE_nreverse::PRED_concatenate_3_static_exec);
	}
}
