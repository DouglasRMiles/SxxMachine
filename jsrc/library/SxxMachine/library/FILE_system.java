package SxxMachine.library;

import static SxxMachine.FILE_builtins.PRED_set_prolog_flag_2_static_exec;
import static SxxMachine.sxxtensions.PRED_$set_predicate_attribute_3_static_exec;
import static SxxMachine.sxxtensions.PRED_must_be_2_static_exec;

import SxxMachine.Operation;
import SxxMachine.PredTable;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;

public class FILE_system  extends TermData {
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
	*/
	private static final SymbolTerm PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_s1 = SYM("true");
	final static SymbolTerm ATOM_access_level = SYM("access_level");
	final static SymbolTerm ATOM_system = SYM("system");
	final static SymbolTerm ATOM_user = SYM("user");

	public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null, FILE_system::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_1(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_2(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_1(Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl'(A):-A==true,!,set_prolog_flag(access_level,system)
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl'(A):-['$get_level'(B),'$equality_of_term'(A,true),'$cut'(B),set_prolog_flag(access_level,system)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),s(1))
		a1 = a1.dref();
		if (!a1.equalsTerm(PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_s1)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(2))
		a2 = a2.dref();
		m.cut(a2.intValue());
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_set_prolog_flag_2_static_exec(e), VA(ATOM_access_level, ATOM_system), cont);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_2(Prolog m) {
		Operation cont;
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl'(A):-[set_prolog_flag(access_level,user)]
		return //
		Op((Prolog e) -> PRED_set_prolog_flag_2_static_exec(e), VA(ATOM_access_level, ATOM_user), cont);
	}

	/** PREDICATE: system_mode/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
	*/
	private static final SymbolTerm PRED_system_mode_1_s1 = SYM("boolean");

	public static Operation PRED_system_mode_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// system_mode(A):-must_be(boolean,A),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl'(A)
		m.setB0();
		Term a1;
		a1 = LARG[0];
		// system_mode(A):-[must_be(boolean,A),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl'(A)]
		return //
		Op((Prolog e) -> PRED_must_be_2_static_exec(e), VA(PRED_system_mode_1_s1, a1), //
				Op((Prolog e) -> PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_static_exec(e), VA(a1), cont));
	}

	/** PREDICATE: system_module/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
	*/
	private static final SymbolTerm PRED_system_module_0_s1 = SYM("generate_debug_info");
	final static SymbolTerm ATOM_false = SYM("false");

	public static Operation PRED_system_module_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// system_module:-set_prolog_flag(generate_debug_info,false)
		m.setB0();
		// system_module:-[set_prolog_flag(generate_debug_info,false)]
		return //
		Op((Prolog e) -> PRED_set_prolog_flag_2_static_exec(e), VA(PRED_system_module_0_s1, ATOM_false), cont);
	}

	/** PREDICATE: lock_predicate/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
	*/
	private static final SymbolTerm PRED_lock_predicate_1_s1 = SYM("system");

	public static Operation PRED_lock_predicate_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// lock_predicate(A):-'$set_predicate_attribute'(A,system,true)
		m.setB0();
		Term a1;
		a1 = LARG[0];
		// lock_predicate(A):-['$set_predicate_attribute'(A,system,true)]
		return //
		Op((Prolog e) -> PRED_$set_predicate_attribute_3_static_exec(e), VA(a1, PRED_lock_predicate_1_s1, Prolog.True), cont);
	}

	/** PREDICATE: unlock_predicate/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
	*/
	private static final SymbolTerm PRED_unlock_predicate_1_s1 = SYM("system");

	public static Operation PRED_unlock_predicate_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// unlock_predicate(A):-'$set_predicate_attribute'(A,system,false)
		m.setB0();
		Term a1;
		a1 = LARG[0];
		// unlock_predicate(A):-['$set_predicate_attribute'(A,system,false)]
		return //
		Op((Prolog e) -> PRED_$set_predicate_attribute_3_static_exec(e), VA(a1, PRED_unlock_predicate_1_s1, ATOM_false), cont);
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl",
				"$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl", 1,
				FILE_system::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_static_exec);
		PredTable.registerBuiltin("system_mode", 1, FILE_system::PRED_system_mode_1_static_exec);
		PredTable.registerBuiltin("system_module", 0, FILE_system::PRED_system_module_0_static_exec);
		PredTable.registerBuiltin("lock_predicate", 1, FILE_system::PRED_lock_predicate_1_static_exec);
		PredTable.registerBuiltin("unlock_predicate", 1, FILE_system::PRED_unlock_predicate_1_static_exec);
	}
}
