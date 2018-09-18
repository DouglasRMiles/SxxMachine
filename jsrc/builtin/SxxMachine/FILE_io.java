package SxxMachine.builtin;

import static SxxMachine.builtin.bootpreds.*;
import static SxxMachine.builtin.FILE_builtins.*;
import static SxxMachine.builtin.FILE_swi_supp.*;
import static SxxMachine.Failure.*;
import SxxMachine.*;

public class FILE_io  extends TermData {
	/** PREDICATE: open/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/
	private static final SymbolTerm PRED_open_3_s1 = SYM("[]");

	public static Operation PRED_open_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// open(A,B,C):-open(A,B,C,[])
		m.setB0();
		Term a1, a2, a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// open(A,B,C):-[open(A,B,C,[])]
		return //
		Op((Prolog e) -> PRED_open_4_static_exec(e), VA(a1, a2, a3, PRED_open_3_s1), cont);
	}

	/** PREDICATE: close/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/
	private static final SymbolTerm PRED_close_1_s1 = SYM("[]");

	public static Operation PRED_close_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// close(A):-close(A,[])
		m.setB0();
		Term a1;
		a1 = LARG[0];
		// close(A):-[close(A,[])]
		return //
		Op((Prolog e) -> PRED_close_2_static_exec(e), VA(a1, PRED_close_1_s1), cont);
	}

	/** PREDICATE: flush_output/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_flush_output_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// flush_output:-current_output(A),flush_output(A)
		m.setB0();
		Term a1;
		// flush_output:-[current_output(A),flush_output(A)]
		a1 = V(m);
		return //
		Op((Prolog e) -> PRED_current_output_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_flush_output_1_static_exec(e), VA(a1), cont));
	}

	/** PREDICATE: stream_property/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/
	final static SymbolTerm ATOM_term = SYM("term");
	final static SymbolTerm ATOM_stream_property = SYM("stream_property");
	private static final StructureTerm PRED_stream_property_2_s5 = S("domain", ATOM_term, ATOM_stream_property);
	final static IntegerTerm int_2 = Integer(2);

	public static Operation PRED_stream_property_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null, FILE_io::stream_property_2_sub_1);
		return stream_property_2_1(m);
	}

	private final static Operation stream_property_2_sub_1(Prolog m) {
		m.retry(null, FILE_io::stream_property_2_sub_2);
		return stream_property_2_2(m);
	}

	private final static Operation stream_property_2_sub_2(Prolog m) {
		m.trust(null);
		return stream_property_2_3(m);
	}

	private final static Operation stream_property_2_1(Prolog m) {
		// stream_property(A,B):-var(B),!,'$stream_property'(A,B)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// stream_property(A,B):-['$get_level'(C),var(B),'$cut'(C),'$stream_property'(A,B)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of var(a(2))
		a2 = a2.dref();
		if (!(a2.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_$stream_property_2_static_exec(e), VA(a1, a2), cont);
	}

	private final static Operation stream_property_2_2(Prolog m) {
		// stream_property(A,B):-'$stream_property_specifier'(B),!,'$stream_property'(A,B)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// stream_property(A,B):-['$get_level'(C),'$stream_property_specifier'(B),'$cut'(C),'$stream_property'(A,B)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_$stream_property_specifier_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), //
						Op((Prolog e) -> PRED_$stream_property_2_static_exec(e), VA(a1, a2), cont)));
	}

	private final static Operation stream_property_2_3(Prolog m) {
		// stream_property(A,B):-illarg(domain(term,stream_property),stream_property(A,B),2)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// stream_property(A,B):-[illarg(domain(term,stream_property),stream_property(A,B),2)]
		Term[] y1 = VA(a1, a2);
		a3 = S("stream_property", y1);
		return //
		Op((Prolog e) -> PRED_illarg_3_static_exec(e), VA(PRED_stream_property_2_s5, a3, int_2), cont);
	}

	/** PREDICATE: $stream_property/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/
	final static SymbolTerm ATOM_stream = SYM("stream");
	private static final StructureTerm PRED_$stream_property_2_s5 = S("domain", ATOM_stream, ATOM_stream);
	final static IntegerTerm int_1 = Integer(1);

	public static Operation PRED_$stream_property_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null, FILE_io::$stream_property_2_sub_1);
		return $stream_property_2_1(m);
	}

	private final static Operation $stream_property_2_sub_1(Prolog m) {
		m.retry(null, FILE_io::$stream_property_2_sub_2);
		return $stream_property_2_2(m);
	}

	private final static Operation $stream_property_2_sub_2(Prolog m) {
		m.trust(null);
		return $stream_property_2_3(m);
	}

	private final static Operation $stream_property_2_1(Prolog m) {
		// '$stream_property'(A,B):-var(A),!,'$get_stream_manager'(C),hash_map(C,D),'$builtin_member'((A,E),D),java(A),'$builtin_member'(B,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$stream_property'(A,B):-['$get_level'(C),var(A),'$cut'(C),'$get_stream_manager'(D),hash_map(D,E),'$builtin_member'((A,F),E),java(A),'$builtin_member'(B,F)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1.dref();
		if (!(a1.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		//END inline expansion
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		Term[] y1 = VA(a1, a6);
		a7 = S(",", y1);
		return //
		Op((Prolog e) -> PRED_$get_stream_manager_1_static_exec(e), VA(a4), //
				Op((Prolog e) -> PRED_hash_map_2_static_exec(e), VA(a4, a5), //
						Op((Prolog e) -> PRED_$builtin_member_2_static_exec(e), VA(a7, a5), //
								Op((Prolog e) -> PRED_java_1_static_exec(e), VA(a1), //
										Op((Prolog e) -> PRED_$builtin_member_2_static_exec(e), VA(a2, a6), cont)))));
	}

	private final static Operation $stream_property_2_2(Prolog m) {
		// '$stream_property'(A,B):-java(A),!,'$get_stream_manager'(C),hash_get(C,A,D),'$builtin_member'(B,D)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$stream_property'(A,B):-['$get_level'(C),java(A),'$cut'(C),'$get_stream_manager'(D),hash_get(D,A,E),'$builtin_member'(B,E)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of java(a(1))
		a1 = a1.dref();
		if (!(a1.isFFIObject())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		//END inline expansion
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_$get_stream_manager_1_static_exec(e), VA(a4), //
				Op((Prolog e) -> PRED_hash_get_3_static_exec(e), VA(a4, a1, a5), //
						Op((Prolog e) -> PRED_$builtin_member_2_static_exec(e), VA(a2, a5), cont)));
	}

	private final static Operation $stream_property_2_3(Prolog m) {
		// '$stream_property'(A,B):-illarg(domain(stream,stream),stream_property(A,B),1)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$stream_property'(A,B):-[illarg(domain(stream,stream),stream_property(A,B),1)]
		Term[] y1 = VA(a1, a2);
		a3 = S("stream_property", y1);
		return //
		Op((Prolog e) -> PRED_illarg_3_static_exec(e), VA(PRED_$stream_property_2_s5, a3, int_1), cont);
	}

	/** PREDICATE: $stream_property_specifier/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/
	private static final SymbolTerm PRED_$stream_property_specifier_1_s1 = SYM("input");
	final static SymbolTerm ATOM_output = SYM("output");

	public static Operation PRED_$stream_property_specifier_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_io::$stream_property_specifier_1_var, fail_0, fail_0, FILE_io::$stream_property_specifier_1_con, FILE_io::$stream_property_specifier_1_str, fail_0);
	}

	private final static Operation $stream_property_specifier_1_var(Prolog m) {
		m.jtry1(null, FILE_io::$stream_property_specifier_1_var_1);
		return $stream_property_specifier_1_1(m);
	}

	private final static Operation $stream_property_specifier_1_var_1(Prolog m) {
		m.retry(null, FILE_io::$stream_property_specifier_1_var_2);
		return $stream_property_specifier_1_2(m);
	}

	private final static Operation $stream_property_specifier_1_var_2(Prolog m) {
		m.retry(null, FILE_io::$stream_property_specifier_1_var_3);
		return $stream_property_specifier_1_3(m);
	}

	private final static Operation $stream_property_specifier_1_var_3(Prolog m) {
		m.retry(null, FILE_io::$stream_property_specifier_1_var_4);
		return $stream_property_specifier_1_4(m);
	}

	private final static Operation $stream_property_specifier_1_var_4(Prolog m) {
		m.retry(null, FILE_io::$stream_property_specifier_1_var_5);
		return $stream_property_specifier_1_5(m);
	}

	private final static Operation $stream_property_specifier_1_var_5(Prolog m) {
		m.trust(null);
		return $stream_property_specifier_1_6(m);
	}

	private final static Operation $stream_property_specifier_1_con(Prolog m) {
		m.jtry1(null, FILE_io::$stream_property_specifier_1_con_1);
		return $stream_property_specifier_1_1(m);
	}

	private final static Operation $stream_property_specifier_1_con_1(Prolog m) {
		m.trust(null);
		return $stream_property_specifier_1_2(m);
	}

	private final static Operation $stream_property_specifier_1_str(Prolog m) {
		m.jtry1(null, FILE_io::$stream_property_specifier_1_str_1);
		return $stream_property_specifier_1_3(m);
	}

	private final static Operation $stream_property_specifier_1_str_1(Prolog m) {
		m.retry(null, FILE_io::$stream_property_specifier_1_str_2);
		return $stream_property_specifier_1_4(m);
	}

	private final static Operation $stream_property_specifier_1_str_2(Prolog m) {
		m.retry(null, FILE_io::$stream_property_specifier_1_str_3);
		return $stream_property_specifier_1_5(m);
	}

	private final static Operation $stream_property_specifier_1_str_3(Prolog m) {
		m.trust(null);
		return $stream_property_specifier_1_6(m);
	}

	private final static Operation $stream_property_specifier_1_1(Prolog m) {
		// '$stream_property_specifier'(input):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$stream_property_specifier'(input):-[]
		if (!PRED_$stream_property_specifier_1_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation $stream_property_specifier_1_2(Prolog m) {
		// '$stream_property_specifier'(output):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$stream_property_specifier'(output):-[]
		if (!ATOM_output.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation $stream_property_specifier_1_3(Prolog m) {
		// '$stream_property_specifier'(alias(A)):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$stream_property_specifier'(alias(A)):-[]
		a1 = a1.dref();
		if (!a1.unify(C("alias", V(m)), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation $stream_property_specifier_1_4(Prolog m) {
		// '$stream_property_specifier'((mode A)):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$stream_property_specifier'((mode A)):-[]
		a1 = a1.dref();
		if (!a1.unify(C("mode", V(m)), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation $stream_property_specifier_1_5(Prolog m) {
		// '$stream_property_specifier'(type(A)):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$stream_property_specifier'(type(A)):-[]
		a1 = a1.dref();
		if (!a1.unify(C("type", V(m)), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation $stream_property_specifier_1_6(Prolog m) {
		// '$stream_property_specifier'(file_name(A)):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$stream_property_specifier'(file_name(A)):-[]
		a1 = a1.dref();
		if (!a1.unify(C("file_name", V(m)), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	/** PREDICATE: get_char/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_get_char_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// get_char(A):-current_input(B),get_char(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// get_char(A):-[current_input(B),get_char(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_input_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_get_char_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: get_code/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_get_code_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// get_code(A):-current_input(B),get_code(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// get_code(A):-[current_input(B),get_code(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_input_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_get_code_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: peek_char/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_peek_char_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// peek_char(A):-current_input(B),peek_char(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// peek_char(A):-[current_input(B),peek_char(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_input_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_peek_char_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: peek_code/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_peek_code_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// peek_code(A):-current_input(B),peek_code(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// peek_code(A):-[current_input(B),peek_code(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_input_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_peek_code_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: put_char/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_put_char_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// put_char(A):-current_output(B),put_char(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// put_char(A):-[current_output(B),put_char(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_output_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_put_char_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: put_code/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_put_code_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// put_code(A):-current_output(B),put_code(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// put_code(A):-[current_output(B),put_code(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_output_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_put_code_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: nl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/
	private static final SymbolTerm PRED_nl_1_s1 = SYM("\n");

	public static Operation PRED_nl_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// nl(A):-put_char(A,'\n')
		m.setB0();
		Term a1;
		a1 = LARG[0];
		// nl(A):-[put_char(A,'\n')]
		return //
		Op((Prolog e) -> PRED_put_char_2_static_exec(e), VA(a1, PRED_nl_1_s1), cont);
	}

	/** PREDICATE: get0/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_get0_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// get0(A):-current_input(B),get_code(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// get0(A):-[current_input(B),get_code(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_input_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_get_code_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: get0/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_get0_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// get0(A,B):-get_code(A,B)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// get0(A,B):-[get_code(A,B)]
		return //
		Op((Prolog e) -> PRED_get_code_2_static_exec(e), VA(a1, a2), cont);
	}

	/** PREDICATE: get/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_get_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// get(A):-current_input(B),get(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// get(A):-[current_input(B),get(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_input_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_get_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: put/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_put_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// put(A):-current_output(B),put(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// put(A):-[current_output(B),put(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_output_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_put_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: put/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_put_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// put(A,B):-C is B,put_code(A,C)
		m.setB0();
		Term a1, a2, a3;
		a1 = LARG[0];
		a2 = LARG[1];
		// put(A,B):-[C is B,put_code(A,C)]
		a3 = V(m);
		//START inline expansion of a(3)is a(2)
		if (!a3.unify(Arithmetic.evaluate(a2), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_put_code_2_static_exec(e), VA(a1, a3), cont);
	}

	/** PREDICATE: tab/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_tab_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// tab(A):-current_output(B),tab(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// tab(A):-[current_output(B),tab(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_output_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_tab_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: skip/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_skip_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// skip(A):-current_input(B),skip(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// skip(A):-[current_input(B),skip(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_input_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_skip_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: get_byte/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_get_byte_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// get_byte(A):-current_input(B),get_byte(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// get_byte(A):-[current_input(B),get_byte(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_input_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_get_byte_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: peek_byte/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_peek_byte_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// peek_byte(A):-current_input(B),peek_byte(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// peek_byte(A):-[current_input(B),peek_byte(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_input_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_peek_byte_2_static_exec(e), VA(a2, a1), cont));
	}

	/** PREDICATE: put_byte/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
	*/

	public static Operation PRED_put_byte_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// put_byte(A):-current_output(B),put_byte(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// put_byte(A):-[current_output(B),put_byte(B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_current_output_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_put_byte_2_static_exec(e), VA(a2, a1), cont));
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("open", 3, FILE_io::PRED_open_3_static_exec);
		PredTable.registerBuiltin("close", 1, FILE_io::PRED_close_1_static_exec);
		PredTable.registerBuiltin("flush_output", 0, FILE_io::PRED_flush_output_0_static_exec);
		PredTable.registerBuiltin("stream_property", 2, FILE_io::PRED_stream_property_2_static_exec);
		PredTable.registerBuiltin("$stream_property", 2, FILE_io::PRED_$stream_property_2_static_exec);
		PredTable.registerBuiltin("$stream_property_specifier", 1, FILE_io::PRED_$stream_property_specifier_1_static_exec);
		PredTable.registerBuiltin("get_char", 1, FILE_io::PRED_get_char_1_static_exec);
		PredTable.registerBuiltin("get_code", 1, FILE_io::PRED_get_code_1_static_exec);
		PredTable.registerBuiltin("peek_char", 1, FILE_io::PRED_peek_char_1_static_exec);
		PredTable.registerBuiltin("peek_code", 1, FILE_io::PRED_peek_code_1_static_exec);
		PredTable.registerBuiltin("put_char", 1, FILE_io::PRED_put_char_1_static_exec);
		PredTable.registerBuiltin("put_code", 1, FILE_io::PRED_put_code_1_static_exec);
		PredTable.registerBuiltin("nl", 1, FILE_io::PRED_nl_1_static_exec);
		PredTable.registerBuiltin("get0", 1, FILE_io::PRED_get0_1_static_exec);
		PredTable.registerBuiltin("get0", 2, FILE_io::PRED_get0_2_static_exec);
		PredTable.registerBuiltin("get", 1, FILE_io::PRED_get_1_static_exec);
		PredTable.registerBuiltin("put", 1, FILE_io::PRED_put_1_static_exec);
		PredTable.registerBuiltin("put", 2, FILE_io::PRED_put_2_static_exec);
		PredTable.registerBuiltin("tab", 1, FILE_io::PRED_tab_1_static_exec);
		PredTable.registerBuiltin("skip", 1, FILE_io::PRED_skip_1_static_exec);
		PredTable.registerBuiltin("get_byte", 1, FILE_io::PRED_get_byte_1_static_exec);
		PredTable.registerBuiltin("peek_byte", 1, FILE_io::PRED_peek_byte_1_static_exec);
		PredTable.registerBuiltin("put_byte", 1, FILE_io::PRED_put_byte_1_static_exec);
	}
}
