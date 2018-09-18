package SxxMachine.bench;

import static SxxMachine.bootpreds.*;
import static SxxMachine.FILE_builtins.*;
import static SxxMachine.FILE_swi_supp.*;
import SxxMachine.*;
import SxxMachine.*;

public class FILE_tak  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/tak.pl
	*/

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-tak
		m.setB0();
		// top:-[tak]
		return //
		Op((Prolog e) -> PRED_tak_0_static_exec(e), VA(), cont);
	}

	/** PREDICATE: tak/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/tak.pl
	*/
	private static final /**/ IntegerTerm PRED_tak_0_s1 = Integer(18);
	final static IntegerTerm int_12 = Integer(12);
	final static IntegerTerm int_6 = Integer(6);

	public static Operation PRED_tak_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// tak:-tak(18,12,6,A)
		m.setB0();
		// tak:-[tak(18,12,6,A)]
		return //
		Op((Prolog e) -> PRED_tak_4_static_exec(e), VA(PRED_tak_0_s1, int_12, int_6, V(m)), cont);
	}

	/** PREDICATE: tak/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/tak.pl
	*/
	final static IntegerTerm int_1 = Integer(1);

	public static Operation PRED_tak_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return tak_4_top(m);
	}

	private final static Operation tak_4_top(Prolog m) {
		m.setB0();
		m.jtry4(null, FILE_tak::tak_4_sub_1);
		return tak_4_1(m);
	}

	private final static Operation tak_4_sub_1(Prolog m) {
		m.trust(null);
		return tak_4_2(m);
	}

	private final static Operation tak_4_1(Prolog m) {
		// tak(A,B,C,D):-A=<B,C=D
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// tak(A,B,C,D):-['$less_or_equal'(A,B),'$unify'(C,D)]
		//START inline expansion of $less_or_equal(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(3),a(4))
		if (!a3.unify(a4, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation tak_4_2(Prolog m) {
		// tak(A,B,C,D):-A>B,E is A-1,tak(E,B,C,F),G is B-1,tak(G,C,A,H),I is C-1,tak(I,A,B,J),tak(F,H,J,D)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
		Operation p5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// tak(A,B,C,D):-['$greater_than'(A,B),E is A-1,tak(E,B,C,F),G is B-1,tak(G,C,A,H),I is C-1,tak(I,A,B,J),tak(F,H,J,D)]
		//START inline expansion of $greater_than(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		a5 = V(m);
		Term[] y1 = VA(a1, int_1);
		a6 = S("-", y1);
		//START inline expansion of a(5)is a(6)
		if (!a5.unify(Arithmetic.evaluate(a6), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a7 = V(m);
		a8 = V(m);
		Term[] y2 = VA(a2, int_1);
		a9 = S("-", y2);
		a10 = V(m);
		a11 = V(m);
		Term[] y3 = VA(a3, int_1);
		a12 = S("-", y3);
		a13 = V(m);
		p5 = //
				Op(FILE_builtins::PRED_is_2_static_exec, VA(a8, a9), //
						Op((Prolog e) -> PRED_tak_4_static_exec(e), VA(a8, a3, a1, a10), //
								Op(FILE_builtins::PRED_is_2_static_exec, VA(a11, a12), //
										Op((Prolog e) -> PRED_tak_4_static_exec(e), VA(a11, a1, a2, a13), //
												Op((Prolog e) -> PRED_tak_4_static_exec(e), VA(a7, a10, a13, a4), cont)))));
		m.AREGS[0] = a5;
		m.AREGS[1] = a2;
		m.AREGS[2] = a3;
		m.AREGS[3] = a7;
		m.cont = p5;
		return tak_4_top(m);
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_tak::PRED_top_0_static_exec);
		PredTable.registerBuiltin("tak", 0, FILE_tak::PRED_tak_0_static_exec);
		PredTable.registerBuiltin("tak", 4, FILE_tak::PRED_tak_4_static_exec);
	}
}
