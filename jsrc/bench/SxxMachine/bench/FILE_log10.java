package SxxMachine.bench;

import SxxMachine.Arithmetic;
import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.PredTable;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;

public class FILE_log10  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/log10.pl
	*/

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-log10
		m.setB0();
		// top:-[log10]
		return //
		Op((Prolog e) -> PRED_log10_0_static_exec(e), VA(), cont);
	}

	/** PREDICATE: log10/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/log10.pl
	*/
	final static SymbolTerm ATOM_x = SYM("x");
	private static final StructureTerm PRED_log10_0_s4 = S("log", ATOM_x);
	private static final StructureTerm PRED_log10_0_s6 = S("log", PRED_log10_0_s4);
	private static final StructureTerm PRED_log10_0_s8 = S("log", PRED_log10_0_s6);
	private static final StructureTerm PRED_log10_0_s10 = S("log", PRED_log10_0_s8);
	private static final StructureTerm PRED_log10_0_s12 = S("log", PRED_log10_0_s10);
	private static final StructureTerm PRED_log10_0_s14 = S("log", PRED_log10_0_s12);
	private static final StructureTerm PRED_log10_0_s16 = S("log", PRED_log10_0_s14);
	private static final StructureTerm PRED_log10_0_s18 = S("log", PRED_log10_0_s16);
	private static final StructureTerm PRED_log10_0_s20 = S("log", PRED_log10_0_s18);
	private static final StructureTerm PRED_log10_0_s22 = S("log", PRED_log10_0_s20);

	public static Operation PRED_log10_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// log10:-d(log(log(log(log(log(log(log(log(log(log(x)))))))))),x,A)
		m.setB0();
		// log10:-[d(log(log(log(log(log(log(log(log(log(log(x)))))))))),x,A)]
		return //
		Op((Prolog e) -> PRED_d_3_static_exec(e), VA(PRED_log10_0_s22, ATOM_x, V(m)), cont);
	}

	/** PREDICATE: d/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/log10.pl
	*/
	final static IntegerTerm int_2 = Integer(2);
	final static IntegerTerm int_1 = Integer(1);
	final static IntegerTerm int_0 = Integer(0);

	public static Operation PRED_d_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return d_3_top(m);
	}

	private final static Operation d_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_log10::d_3_var, FILE_log10::d_3_int, FILE_log10::d_3_int, FILE_log10::d_3_int, FILE_log10::d_3_var, FILE_log10::d_3_int);
	}

	private final static Operation d_3_var(Prolog m) {
		m.jtry3(null, FILE_log10::d_3_var_1);
		return d_3_1(m);
	}

	private final static Operation d_3_var_1(Prolog m) {
		m.retry(null, FILE_log10::d_3_var_2);
		return d_3_2(m);
	}

	private final static Operation d_3_var_2(Prolog m) {
		m.retry(null, FILE_log10::d_3_var_3);
		return d_3_3(m);
	}

	private final static Operation d_3_var_3(Prolog m) {
		m.retry(null, FILE_log10::d_3_var_4);
		return d_3_4(m);
	}

	private final static Operation d_3_var_4(Prolog m) {
		m.retry(null, FILE_log10::d_3_var_5);
		return d_3_5(m);
	}

	private final static Operation d_3_var_5(Prolog m) {
		m.retry(null, FILE_log10::d_3_var_6);
		return d_3_6(m);
	}

	private final static Operation d_3_var_6(Prolog m) {
		m.retry(null, FILE_log10::d_3_var_7);
		return d_3_7(m);
	}

	private final static Operation d_3_var_7(Prolog m) {
		m.retry(null, FILE_log10::d_3_var_8);
		return d_3_8(m);
	}

	private final static Operation d_3_var_8(Prolog m) {
		m.retry(null, FILE_log10::d_3_var_9);
		return d_3_9(m);
	}

	private final static Operation d_3_var_9(Prolog m) {
		m.trust(null);
		return d_3_10(m);
	}

	private final static Operation d_3_int(Prolog m) {
		m.jtry3(null, FILE_log10::d_3_int_1);
		return d_3_9(m);
	}

	private final static Operation d_3_int_1(Prolog m) {
		m.trust(null);
		return d_3_10(m);
	}

	private final static Operation d_3_1(Prolog m) {
		// d(A+B,C,D+E):-!,d(A,C,D),d(B,C,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// d(A+B,C,D+E):-['$neck_cut',d(A,C,D),d(B,C,E)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("+", a4, a5), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a3.unify(C("+", a6, a7), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		p1 = //
				Op((Prolog e) -> PRED_d_3_static_exec(e), VA(a5, a2, a7), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a6;
		m.cont = p1;
		return d_3_top(m);
	}

	private final static Operation d_3_2(Prolog m) {
		// d(A-B,C,D-E):-!,d(A,C,D),d(B,C,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// d(A-B,C,D-E):-['$neck_cut',d(A,C,D),d(B,C,E)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("-", a4, a5), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a3.unify(C("-", a6, a7), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		p1 = //
				Op((Prolog e) -> PRED_d_3_static_exec(e), VA(a5, a2, a7), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a6;
		m.cont = p1;
		return d_3_top(m);
	}

	private final static Operation d_3_3(Prolog m) {
		// d(A*B,C,D*B+A*E):-!,d(A,C,D),d(B,C,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// d(A*B,C,D*B+A*E):-['$neck_cut',d(A,C,D),d(B,C,E)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("*", a4, a5), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a3.unify(C("+", a6, a7), m.trail)) {
			return m.fail();
		}
		a6 = a6.dref();
		a8 = V(m);
		if (!a6.unify(C("*", a8, a5), m.trail)) {
			return m.fail();
		}
		a7 = a7.dref();
		a9 = V(m);
		if (!a7.unify(C("*", a4, a9), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		p1 = //
				Op((Prolog e) -> PRED_d_3_static_exec(e), VA(a5, a2, a9), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a8;
		m.cont = p1;
		return d_3_top(m);
	}

	private final static Operation d_3_4(Prolog m) {
		// d(A/B,C,(D*B-A*E)/B^2):-!,d(A,C,D),d(B,C,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// d(A/B,C,(D*B-A*E)/B^2):-['$neck_cut',d(A,C,D),d(B,C,E)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("/", a4, a5), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a3.unify(C("/", a6, a7), m.trail)) {
			return m.fail();
		}
		a6 = a6.dref();
		a8 = V(m);
		a9 = V(m);
		if (!a6.unify(C("-", a8, a9), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		a10 = V(m);
		if (!a8.unify(C("*", a10, a5), m.trail)) {
			return m.fail();
		}
		a9 = a9.dref();
		a11 = V(m);
		if (!a9.unify(C("*", a4, a11), m.trail)) {
			return m.fail();
		}
		a7 = a7.dref();
		if (!a7.unify(C("^", a5, int_2), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		p1 = //
				Op((Prolog e) -> PRED_d_3_static_exec(e), VA(a5, a2, a11), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a10;
		m.cont = p1;
		return d_3_top(m);
	}

	private final static Operation d_3_5(Prolog m) {
		// d(A^B,C,D*B*A^E):-!,integer(B),E is B-1,d(A,C,D)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// d(A^B,C,D*B*A^E):-['$neck_cut',integer(B),E is B-1,d(A,C,D)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("^", a4, a5), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a3.unify(C("*", a6, a7), m.trail)) {
			return m.fail();
		}
		a6 = a6.dref();
		a8 = V(m);
		if (!a6.unify(C("*", a8, a5), m.trail)) {
			return m.fail();
		}
		a7 = a7.dref();
		a9 = V(m);
		if (!a7.unify(C("^", a4, a9), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		//START inline expansion of integer(a(5))
		a5 = a5.dref();
		if (!(a5.isInteger())) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a5, int_1);
		a10 = S("-", y1);
		//START inline expansion of a(9)is a(10)
		if (!a9.unify(Arithmetic.evaluate(a10), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a8;
		m.cont = cont;
		return d_3_top(m);
	}

	private final static Operation d_3_6(Prolog m) {
		// d(-A,B,-C):-!,d(A,B,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// d(-A,B,-C):-['$neck_cut',d(A,B,C)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("-", a4), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a5 = V(m);
		if (!a3.unify(C("-", a5), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a5;
		m.cont = cont;
		return d_3_top(m);
	}

	private final static Operation d_3_7(Prolog m) {
		// d(exp(A),B,exp(A)*C):-!,d(A,B,C)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// d(exp(A),B,exp(A)*C):-['$neck_cut',d(A,B,C)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("exp", a4), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a3.unify(C("*", a5, a6), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		if (!a5.unify(C("exp", a4), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a6;
		m.cont = cont;
		return d_3_top(m);
	}

	private final static Operation d_3_8(Prolog m) {
		// d(log(A),B,C/A):-!,d(A,B,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// d(log(A),B,C/A):-['$neck_cut',d(A,B,C)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("log", a4), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a5 = V(m);
		if (!a3.unify(C("/", a5, a4), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a5;
		m.cont = cont;
		return d_3_top(m);
	}

	private final static Operation d_3_9(Prolog m) {
		// d(A,A,1):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// d(A,A,1):-['$neck_cut']
		if (!a1.unify(a2, m.trail))
			return m.fail();
		if (!int_1.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation d_3_10(Prolog m) {
		// d(A,B,0):-true
		Term a3;
		Operation cont;
		a3 = m.AREGS[2];
		cont = m.cont;
		// d(A,B,0):-[]
		if (!int_0.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_log10::PRED_top_0_static_exec);
		PredTable.registerBuiltin("log10", 0, FILE_log10::PRED_log10_0_static_exec);
		PredTable.registerBuiltin("d", 3, FILE_log10::PRED_d_3_static_exec);
	}
}
