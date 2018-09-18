package SxxMachine.library;

import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
import static SxxMachine.Failure.fail_0;
import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
import static SxxMachine.bootpreds.PRED_atom_codes_2_static_exec;
import static SxxMachine.bootpreds.PRED_atom_concat_3_static_exec;
import static SxxMachine.bootpreds.PRED_reverse_2_static_exec;
import static SxxMachine.sxxtensions.PRED_$atom_completions_2_static_exec;
import static SxxMachine.sxxtensions.PRED_code_type_2_static_exec;
import static SxxMachine.sxxtensions.PRED_expand_file_name_2_static_exec;
import static SxxMachine.sxxtensions.PRED_phrase_3_static_exec;
import static SxxMachine.sxxtensions.PRED_string_codes_2_static_exec;

import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.PredTable;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;

public class FILE_console_input  extends TermData {
	/** PREDICATE: (:)/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
	*/
	private static final SymbolTerm PRED_$003A_2_s1 = SYM("prolog");

	public static Operation PRED_$003A_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// prolog:complete_input(A,B,C,D):-string_codes(A,E),reverse(E,F),complete(F,C,D)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7;
		a1 = LARG[0];
		a2 = LARG[1];
		// prolog:complete_input(A,B,C,D):-[string_codes(A,E),reverse(E,F),complete(F,C,D)]
		if (!PRED_$003A_2_s1.unify(a1, m.trail))
			return m.fail();
		a2 = a2.dref();
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		if (!a2.unify(C("complete_input", a3, V(m), a4, a5), m.trail)) {
			return m.fail();
		}
		a6 = V(m);
		a7 = V(m);
		return //
		Op((Prolog e) -> PRED_string_codes_2_static_exec(e), VA(a3, a6), //
				Op((Prolog e) -> PRED_reverse_2_static_exec(e), VA(a6, a7), //
						Op((Prolog e) -> PRED_complete_3_static_exec(e), VA(a7, a4, a5), cont)));
	}

	/** PREDICATE: complete/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
	*/
	final static SymbolTerm ATOM_$002A = SYM("*");

	public static Operation PRED_complete_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_console_input::complete_3_sub_1);
		return complete_3_1(m);
	}

	private final static Operation complete_3_sub_1(Prolog m) {
		m.trust(null);
		return complete_3_2(m);
	}

	private final static Operation complete_3_1(Prolog m) {
		// complete(A,B,C):-phrase(file_prefix(B),A,D),!,atom_concat(B,*,E),expand_file_name(E,C)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// complete(A,B,C):-['$get_level'(D),phrase(file_prefix(B),A,E),'$cut'(D),atom_concat(B,*,F),expand_file_name(F,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a2);
		a5 = S("file_prefix", y1);
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_phrase_3_static_exec(e), VA(a5, a1, V(m)), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), //
						Op((Prolog e) -> PRED_atom_concat_3_static_exec(e), VA(a2, ATOM_$002A, a6), //
								Op((Prolog e) -> PRED_expand_file_name_2_static_exec(e), VA(a6, a3), cont))));
	}

	private final static Operation complete_3_2(Prolog m) {
		// complete(A,B,C):-phrase(atom_prefix(B),A,D),!,'$atom_completions'(B,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// complete(A,B,C):-['$get_level'(D),phrase(atom_prefix(B),A,E),'$cut'(D),'$atom_completions'(B,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a2);
		a5 = S("atom_prefix", y1);
		return //
		Op((Prolog e) -> PRED_phrase_3_static_exec(e), VA(a5, a1, V(m)), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), //
						Op((Prolog e) -> PRED_$atom_completions_2_static_exec(e), VA(a2, a3), cont)));
	}

	/** PREDICATE: atom_prefix/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
	*/

	public static Operation PRED_atom_prefix_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// atom_prefix(A,B,C):-atom_chars(D,B,E),(reverse(D,F),string_codes(A,F)),C=E
		m.setB0();
		Term a1, a2, a3, a4, a5, a6;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// atom_prefix(A,B,C):-[atom_chars(D,B,E),reverse(D,F),string_codes(A,F),'$unify'(C,E)]
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_atom_chars_3_static_exec(e), VA(a4, a2, a5), //
				Op((Prolog e) -> PRED_reverse_2_static_exec(e), VA(a4, a6), //
						Op((Prolog e) -> PRED_string_codes_2_static_exec(e), VA(a1, a6), //
								Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a3, a5), cont))));
	}

	/** PREDICATE: atom_chars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
	*/
	private static final SymbolTerm PRED_atom_chars_3_s1 = SYM("[]");

	public static Operation PRED_atom_chars_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_console_input::atom_chars_3_var, fail_0, fail_0, FILE_console_input::atom_chars_3_2, fail_0, FILE_console_input::atom_chars_3_1);
	}

	private final static Operation atom_chars_3_var(Prolog m) {
		m.jtry3(null, FILE_console_input::atom_chars_3_var_1);
		return atom_chars_3_1(m);
	}

	private final static Operation atom_chars_3_var_1(Prolog m) {
		m.trust(null);
		return atom_chars_3_2(m);
	}

	private final static Operation atom_chars_3_1(Prolog m) {
		// atom_chars([A|B],C,D):-atom_char(A,C,E),(!,F=E),atom_chars(B,F,D)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// atom_chars([A|B],C,D):-['$get_level'(E),atom_char(A,C,F),'$cut'(E),'$unify'(G,F),atom_chars(B,G,D)]
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
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a7 = V(m);
		a8 = V(m);
		return //
		Op((Prolog e) -> PRED_atom_char_3_static_exec(e), VA(a4, a2, a7), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a6), //
						Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a8, a7), //
								Op((Prolog e) -> PRED_atom_chars_3_static_exec(e), VA(a5, a8, a3), cont))));
	}

	private final static Operation atom_chars_3_2(Prolog m) {
		// atom_chars([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// atom_chars([],A,A):-[]
		if (!PRED_atom_chars_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: atom_char/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
	*/

	public static Operation PRED_atom_char_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// atom_char(A,[A|B],C):-atom_char(A),C=B
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// atom_char(A,[A|B],C):-[atom_char(A),'$unify'(C,B)]
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
			a4 = argz[1];
		} else if (a2.isVar()) {
			a4 = V(m);
			a2.bind(CONS(a1, a4), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_atom_char_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a3, a4), cont));
	}

	/** PREDICATE: atom_char/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
	*/
	private static final SymbolTerm PRED_atom_char_1_s1 = SYM("csym");

	public static Operation PRED_atom_char_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// atom_char(A):-code_type(A,csym)
		m.setB0();
		Term a1;
		a1 = LARG[0];
		// atom_char(A):-[code_type(A,csym)]
		return //
		Op((Prolog e) -> PRED_code_type_2_static_exec(e), VA(a1, PRED_atom_char_1_s1), cont);
	}

	/** PREDICATE: file_prefix/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
	*/
	private static final /**/ IntegerTerm PRED_file_prefix_3_s1 = Integer(39);

	public static Operation PRED_file_prefix_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// file_prefix(A,B,C):-file_chars(D,B,E),E=[39|F],(reverse(D,G),atom_codes(A,G)),C=F
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// file_prefix(A,B,C):-[file_chars(D,B,E),'$unify'(E,[39|F]),reverse(D,G),atom_codes(A,G),'$unify'(C,F)]
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		a7 = CONS(PRED_file_prefix_3_s1, a6);
		a8 = V(m);
		return //
		Op((Prolog e) -> PRED_file_chars_3_static_exec(e), VA(a4, a2, a5), //
				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a5, a7), //
						Op((Prolog e) -> PRED_reverse_2_static_exec(e), VA(a4, a8), //
								Op((Prolog e) -> PRED_atom_codes_2_static_exec(e), VA(a1, a8), //
										Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a3, a6), cont)))));
	}

	/** PREDICATE: file_chars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
	*/
	private static final SymbolTerm PRED_file_chars_3_s1 = SYM("[]");

	public static Operation PRED_file_chars_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_console_input::file_chars_3_var, fail_0, fail_0, FILE_console_input::file_chars_3_2, fail_0, FILE_console_input::file_chars_3_1);
	}

	private final static Operation file_chars_3_var(Prolog m) {
		m.jtry3(null, FILE_console_input::file_chars_3_var_1);
		return file_chars_3_1(m);
	}

	private final static Operation file_chars_3_var_1(Prolog m) {
		m.trust(null);
		return file_chars_3_2(m);
	}

	private final static Operation file_chars_3_1(Prolog m) {
		// file_chars([A|B],C,D):-file_char(A,C,E),(!,F=E),file_chars(B,F,D)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// file_chars([A|B],C,D):-['$get_level'(E),file_char(A,C,F),'$cut'(E),'$unify'(G,F),file_chars(B,G,D)]
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
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a7 = V(m);
		a8 = V(m);
		return //
		Op((Prolog e) -> PRED_file_char_3_static_exec(e), VA(a4, a2, a7), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a6), //
						Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a8, a7), //
								Op((Prolog e) -> PRED_file_chars_3_static_exec(e), VA(a5, a8, a3), cont))));
	}

	private final static Operation file_chars_3_2(Prolog m) {
		// file_chars([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// file_chars([],A,A):-[]
		if (!PRED_file_chars_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: file_char/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
	*/

	public static Operation PRED_file_char_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// file_char(A,[A|B],C):-file_char(A),C=B
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// file_char(A,[A|B],C):-[file_char(A),'$unify'(C,B)]
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
			a4 = argz[1];
		} else if (a2.isVar()) {
			a4 = V(m);
			a2.bind(CONS(a1, a4), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_file_char_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a3, a4), cont));
	}

	/** PREDICATE: file_char/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
	*/
	private static final SymbolTerm PRED_file_char_1_s1 = SYM("csym");
	final static IntegerTerm int_47 = Integer(47);
	final static IntegerTerm int_46 = Integer(46);
	final static IntegerTerm int_45 = Integer(45);
	final static IntegerTerm int_126 = Integer(126);

	public static Operation PRED_file_char_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_console_input::file_char_1_var, FILE_console_input::file_char_1_var, FILE_console_input::file_char_1_1, FILE_console_input::file_char_1_1, FILE_console_input::file_char_1_1,
				FILE_console_input::file_char_1_1);
	}

	private final static Operation file_char_1_var(Prolog m) {
		m.jtry1(null, FILE_console_input::file_char_1_var_1);
		return file_char_1_1(m);
	}

	private final static Operation file_char_1_var_1(Prolog m) {
		m.retry(null, FILE_console_input::file_char_1_var_2);
		return file_char_1_2(m);
	}

	private final static Operation file_char_1_var_2(Prolog m) {
		m.retry(null, FILE_console_input::file_char_1_var_3);
		return file_char_1_3(m);
	}

	private final static Operation file_char_1_var_3(Prolog m) {
		m.retry(null, FILE_console_input::file_char_1_var_4);
		return file_char_1_4(m);
	}

	private final static Operation file_char_1_var_4(Prolog m) {
		m.trust(null);
		return file_char_1_5(m);
	}

	private final static Operation file_char_1_1(Prolog m) {
		// file_char(A):-code_type(A,csym)
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// file_char(A):-[code_type(A,csym)]
		return //
		Op((Prolog e) -> PRED_code_type_2_static_exec(e), VA(a1, PRED_file_char_1_s1), cont);
	}

	private final static Operation file_char_1_2(Prolog m) {
		// file_char(47):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// file_char(47):-[]
		if (!int_47.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation file_char_1_3(Prolog m) {
		// file_char(46):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// file_char(46):-[]
		if (!int_46.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation file_char_1_4(Prolog m) {
		// file_char(45):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// file_char(45):-[]
		if (!int_45.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation file_char_1_5(Prolog m) {
		// file_char(126):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// file_char(126):-[]
		if (!int_126.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin(":", "$003A", 2, FILE_console_input::PRED_$003A_2_static_exec);
		PredTable.registerBuiltin("complete", 3, FILE_console_input::PRED_complete_3_static_exec);
		PredTable.registerBuiltin("atom_prefix", 3, FILE_console_input::PRED_atom_prefix_3_static_exec);
		PredTable.registerBuiltin("atom_chars", 3, FILE_console_input::PRED_atom_chars_3_static_exec);
		PredTable.registerBuiltin("atom_char", 3, FILE_console_input::PRED_atom_char_3_static_exec);
		PredTable.registerBuiltin("atom_char", 1, FILE_console_input::PRED_atom_char_1_static_exec);
		PredTable.registerBuiltin("file_prefix", 3, FILE_console_input::PRED_file_prefix_3_static_exec);
		PredTable.registerBuiltin("file_chars", 3, FILE_console_input::PRED_file_chars_3_static_exec);
		PredTable.registerBuiltin("file_char", 3, FILE_console_input::PRED_file_char_3_static_exec);
		PredTable.registerBuiltin("file_char", 1, FILE_console_input::PRED_file_char_1_static_exec);
	}
}
