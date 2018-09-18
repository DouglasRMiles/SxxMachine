#pragma once

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Operation;
	class Prolog;
	class StructureTerm;
}

namespace SxxMachine
{

	using namespace SxxMachine;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.LEVELS;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_io.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_swi_supp.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_system.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Predicate.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Prolog.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Success.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.SymbolTerm.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.TermData.*;
	class FILE_boyer : public bootpreds
	{
	/** PREDICATE: go/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(go/0,public)
		public:
			static SymbolTerm *const ATOM_runtime;
			static SymbolTerm *const ATOM_execution$0020time$0020is$0020;
			static SymbolTerm *const ATOM_$0020milliseconds;




		static Operation PRED_go_0_static_exec(Prolog *m);
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(top/0,public)




		static Operation PRED_top_0_static_exec(Prolog *m);
	/** PREDICATE: wff/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(wff/1,public)
			static SymbolTerm *const FUNCTOR_implies_2;
			static SymbolTerm *const FUNCTOR_and_2;
			static SymbolTerm *const FUNCTOR_f_1;
			static SymbolTerm *const FUNCTOR_myplus_2;
			static SymbolTerm *const ATOM_a;
			static SymbolTerm *const ATOM_b;
	private:
		static StructureTerm *const L_wff_1_s8;
		public:
			static SymbolTerm *const ATOM_c;
			static SymbolTerm *const ATOM_zero;
	private:
		static StructureTerm *const L_wff_1_s12;
		static StructureTerm *const L_wff_1_s14;
		static StructureTerm *const L_wff_1_s16;
		public:
			static SymbolTerm *const FUNCTOR_times_2;
	private:
		static StructureTerm *const L_wff_1_s18;
		public:
			static SymbolTerm *const ATOM_d;
	private:
		static StructureTerm *const L_wff_1_s21;
		static StructureTerm *const L_wff_1_s23;
		static StructureTerm *const L_wff_1_s25;
		public:
			static SymbolTerm *const FUNCTOR_reverse_1;
			static SymbolTerm *const FUNCTOR_append_2;
	private:
		static StructureTerm *const L_wff_1_s28;
		static StructureTerm *const L_wff_1_s31;
		static StructureTerm *const L_wff_1_s33;
		static StructureTerm *const L_wff_1_s35;
		public:
			static SymbolTerm *const FUNCTOR_equal_2;
			static SymbolTerm *const FUNCTOR_boyer_difference_2;
			static SymbolTerm *const ATOM_x;
			static SymbolTerm *const ATOM_y;
	private:
		static StructureTerm *const L_wff_1_s41;
		static StructureTerm *const L_wff_1_s43;
		public:
			static SymbolTerm *const FUNCTOR_lessp_2;
			static SymbolTerm *const FUNCTOR_remainder_2;
	private:
		static StructureTerm *const L_wff_1_s46;
		public:
			static SymbolTerm *const FUNCTOR_boyer_member_2;
			static SymbolTerm *const FUNCTOR_length_1;
	private:
		static StructureTerm *const L_wff_1_s50;
		static StructureTerm *const L_wff_1_s52;
		static StructureTerm *const L_wff_1_s54;




	public:
		static Operation PRED_wff_1_static_exec(Prolog *m);
	/** PREDICATE: tautology/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(tautology/1,public)




		static Operation PRED_tautology_1_static_exec(Prolog *m);
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main('$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl'/6,public)

		// private final Term arg5, arg6;




		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_6_static_exec(Prolog *m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_6_sub_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_6_sub_2(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_6_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_6_2(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_6_3(Prolog *m);
	/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main('$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl'/2,public)




	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_2_static_exec(Prolog *m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_2_sub_1(Prolog *m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_2_1(Prolog *m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_2_2(Prolog *m);
	/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main('$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl'/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_5_static_exec(Prolog *m);

	private:
		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_5_sub_1(Prolog *m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_5_sub_2(Prolog *m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_5_1(Prolog *m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_5_2(Prolog *m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_5_3(Prolog *m);
	/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main('$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl'/4,public)




	public:
		static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_4_static_exec(Prolog *m);

	private:
		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_4_sub_1(Prolog *m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_4_1(Prolog *m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_4_2(Prolog *m);
	/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main('$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl'/6,public)
		public:
			static SymbolTerm *const FUNCTOR_if_3;

		// private final Term arg5, arg6;




		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_6_static_exec(Prolog *m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_6_sub_1(Prolog *m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_6_1(Prolog *m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_6_2(Prolog *m);
	/** PREDICATE: tautology/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(tautology/3,public)




	public:
		static Operation PRED_tautology_3_static_exec(Prolog *m);
	/** PREDICATE: rewrite/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(rewrite/2,public)




		static Operation PRED_rewrite_2_static_exec(Prolog *m);

	private:
		static Operation rewrite_2_sub_1(Prolog *m);

		static Operation rewrite_2_1(Prolog *m);

		static Operation rewrite_2_2(Prolog *m);
	/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main('$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl'/3,public)




	public:
		static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_3_static_exec(Prolog *m);

	private:
		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_3_sub_1(Prolog *m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_3_1(Prolog *m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fboyer$002Epl_3_2(Prolog *m);
	/** PREDICATE: rewrite_args/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(rewrite_args/3,public)
		public:
			static SymbolTerm *const FUNCTOR_$002D_2;




		static Operation PRED_rewrite_args_3_static_exec(Prolog *m);

	private:
		static Operation rewrite_args_3_var(Prolog *m);

		static Operation rewrite_args_3_var_1(Prolog *m);

		static Operation rewrite_args_3_1(Prolog *m);

		static Operation rewrite_args_3_2(Prolog *m);
	/** PREDICATE: truep/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(truep/2,public)
		public:
			static SymbolTerm *const ATOM_t;




		static Operation PRED_truep_2_static_exec(Prolog *m);

	private:
		static Operation truep_2_var(Prolog *m);

		static Operation truep_2_var_1(Prolog *m);

		static Operation truep_2_1(Prolog *m);

		static Operation truep_2_2(Prolog *m);
	/** PREDICATE: falsep/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(falsep/2,public)
		public:
			static SymbolTerm *const ATOM_f;




		static Operation PRED_falsep_2_static_exec(Prolog *m);

	private:
		static Operation falsep_2_var(Prolog *m);

		static Operation falsep_2_var_1(Prolog *m);

		static Operation falsep_2_1(Prolog *m);

		static Operation falsep_2_2(Prolog *m);
	/** PREDICATE: boyer_member/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(boyer_member/2,public)




	public:
		static Operation PRED_boyer_member_2_static_exec(Prolog *m);

	private:
		static Operation boyer_member_2_top(Prolog *m);

		static Operation boyer_member_2_sub_1(Prolog *m);

		static Operation boyer_member_2_1(Prolog *m);

		static Operation boyer_member_2_2(Prolog *m);
	/** PREDICATE: equal/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(equal/2,public)
		public:
			static SymbolTerm *const FUNCTOR_assignment_2;
			static SymbolTerm *const FUNCTOR_assignedp_2;
			static SymbolTerm *const FUNCTOR_assume_false_2;
			static SymbolTerm *const FUNCTOR_cons_2;
			static SymbolTerm *const FUNCTOR_assume_true_2;
			static SymbolTerm *const FUNCTOR_boolean_1;
			static SymbolTerm *const FUNCTOR_or_2;
			static SymbolTerm *const FUNCTOR_car_1;
			static SymbolTerm *const FUNCTOR_gopher_1;
			static SymbolTerm *const FUNCTOR_listp_1;
			static SymbolTerm *const FUNCTOR_flatten_1;
			static SymbolTerm *const FUNCTOR_compile_1;
			static SymbolTerm *const FUNCTOR_codegen_2;
			static SymbolTerm *const FUNCTOR_optimize_1;
			static SymbolTerm *const FUNCTOR_count_list_2;
			static SymbolTerm *const FUNCTOR_sort_lp_2;
			static SymbolTerm *const FUNCTOR_countps__2;
			static SymbolTerm *const FUNCTOR_countps_loop_3;
			static SymbolTerm *const FUNCTOR_divides_2;
			static SymbolTerm *const FUNCTOR_zerop_1;
			static SymbolTerm *const FUNCTOR_dsort_1;
			static SymbolTerm *const FUNCTOR_sort2_1;
			static SymbolTerm *const FUNCTOR_eqp_2;
			static SymbolTerm *const FUNCTOR_fix_1;
			static SymbolTerm *const FUNCTOR_even1_1;
			static SymbolTerm *const FUNCTOR_odd_1;
			static SymbolTerm *const FUNCTOR_decr_1;
			static SymbolTerm *const FUNCTOR_exec_3;
			static SymbolTerm *const FUNCTOR_exp_2;
			static SymbolTerm *const FUNCTOR_fact__1;
			static SymbolTerm *const FUNCTOR_fact_loop_2;
			static SymbolTerm *const FUNCTOR_falsify_1;
			static SymbolTerm *const FUNCTOR_falsify1_2;
			static SymbolTerm *const FUNCTOR_normalize_1;
			static SymbolTerm *const FUNCTOR_numberp_1;
			static SymbolTerm *const FUNCTOR_cdr_1;
	private:
		static StructureTerm *const L_equal_2_s51;
		public:
			static SymbolTerm *const FUNCTOR_gcd_2;
			static SymbolTerm *const FUNCTOR_get_2;
			static SymbolTerm *const FUNCTOR_set_3;
			static SymbolTerm *const FUNCTOR_greatereqp_2;
			static SymbolTerm *const FUNCTOR_not_1;
			static SymbolTerm *const FUNCTOR_greatereqpr_2;
			static SymbolTerm *const FUNCTOR_greaterp_2;
			static SymbolTerm *const FUNCTOR_iff_2;
			static SymbolTerm *const FUNCTOR_last_1;
			static SymbolTerm *const FUNCTOR_cons_1;
			static SymbolTerm *const FUNCTOR_lesseqp_2;
			static SymbolTerm *const FUNCTOR_mc_flatten_2;
			static SymbolTerm *const FUNCTOR_meaning_2;
			static SymbolTerm *const FUNCTOR_nth_2;
			static SymbolTerm *const FUNCTOR_greatest_factor_2;
			static SymbolTerm *const FUNCTOR_if_4;
			static SymbolTerm *const FUNCTOR_power_eval_2;
			static SymbolTerm *const FUNCTOR_prime_1;
			static SymbolTerm *const FUNCTOR_add1_1;
	private:
		static StructureTerm *const L_equal_2_s76;
		public:
			static SymbolTerm *const FUNCTOR_prime1_2;
			static SymbolTerm *const FUNCTOR_prime_list_1;
			static SymbolTerm *const FUNCTOR_quotient_2;
			static SymbolTerm *const FUNCTOR_reverse__1;
			static SymbolTerm *const FUNCTOR_reverse_loop_2;
			static SymbolTerm *const FUNCTOR_samefringe_2;
			static SymbolTerm *const FUNCTOR_sigma_2;
			static SymbolTerm *const FUNCTOR_delete_2;
			static SymbolTerm *const FUNCTOR_tautology_checker_1;
			static SymbolTerm *const FUNCTOR_tautologyp_2;
			static SymbolTerm *const FUNCTOR_times_list_1;
			static SymbolTerm *const FUNCTOR_value_2;




		static Operation PRED_equal_2_static_exec(Prolog *m);

	private:
		static Operation equal_2_var(Prolog *m);

		static Operation equal_2_var_1(Prolog *m);

		static Operation equal_2_var_2(Prolog *m);

		static Operation equal_2_var_3(Prolog *m);

		static Operation equal_2_var_4(Prolog *m);

		static Operation equal_2_var_5(Prolog *m);

		static Operation equal_2_var_6(Prolog *m);

		static Operation equal_2_var_7(Prolog *m);

		static Operation equal_2_var_8(Prolog *m);

		static Operation equal_2_var_9(Prolog *m);

		static Operation equal_2_var_10(Prolog *m);

		static Operation equal_2_var_11(Prolog *m);

		static Operation equal_2_var_12(Prolog *m);

		static Operation equal_2_var_13(Prolog *m);

		static Operation equal_2_var_14(Prolog *m);

		static Operation equal_2_var_15(Prolog *m);

		static Operation equal_2_var_16(Prolog *m);

		static Operation equal_2_var_17(Prolog *m);

		static Operation equal_2_var_18(Prolog *m);

		static Operation equal_2_var_19(Prolog *m);

		static Operation equal_2_var_20(Prolog *m);

		static Operation equal_2_var_21(Prolog *m);

		static Operation equal_2_var_22(Prolog *m);

		static Operation equal_2_var_23(Prolog *m);

		static Operation equal_2_var_24(Prolog *m);

		static Operation equal_2_var_25(Prolog *m);

		static Operation equal_2_var_26(Prolog *m);

		static Operation equal_2_var_27(Prolog *m);

		static Operation equal_2_var_28(Prolog *m);

		static Operation equal_2_var_29(Prolog *m);

		static Operation equal_2_var_30(Prolog *m);

		static Operation equal_2_var_31(Prolog *m);

		static Operation equal_2_var_32(Prolog *m);

		static Operation equal_2_var_33(Prolog *m);

		static Operation equal_2_var_34(Prolog *m);

		static Operation equal_2_var_35(Prolog *m);

		static Operation equal_2_var_36(Prolog *m);

		static Operation equal_2_var_37(Prolog *m);

		static Operation equal_2_var_38(Prolog *m);

		static Operation equal_2_var_39(Prolog *m);

		static Operation equal_2_var_40(Prolog *m);

		static Operation equal_2_var_41(Prolog *m);

		static Operation equal_2_var_42(Prolog *m);

		static Operation equal_2_var_43(Prolog *m);

		static Operation equal_2_var_44(Prolog *m);

		static Operation equal_2_var_45(Prolog *m);

		static Operation equal_2_var_46(Prolog *m);

		static Operation equal_2_var_47(Prolog *m);

		static Operation equal_2_var_48(Prolog *m);

		static Operation equal_2_var_49(Prolog *m);

		static Operation equal_2_var_50(Prolog *m);

		static Operation equal_2_var_51(Prolog *m);

		static Operation equal_2_var_52(Prolog *m);

		static Operation equal_2_var_53(Prolog *m);

		static Operation equal_2_var_54(Prolog *m);

		static Operation equal_2_var_55(Prolog *m);

		static Operation equal_2_var_56(Prolog *m);

		static Operation equal_2_var_57(Prolog *m);

		static Operation equal_2_var_58(Prolog *m);

		static Operation equal_2_1(Prolog *m);

		static Operation equal_2_2(Prolog *m);

		static Operation equal_2_3(Prolog *m);

		static Operation equal_2_4(Prolog *m);

		static Operation equal_2_5(Prolog *m);

		static Operation equal_2_6(Prolog *m);

		static Operation equal_2_7(Prolog *m);

		static Operation equal_2_8(Prolog *m);

		static Operation equal_2_9(Prolog *m);

		static Operation equal_2_10(Prolog *m);

		static Operation equal_2_11(Prolog *m);

		static Operation equal_2_12(Prolog *m);

		static Operation equal_2_13(Prolog *m);

		static Operation equal_2_14(Prolog *m);

		static Operation equal_2_15(Prolog *m);

		static Operation equal_2_16(Prolog *m);

		static Operation equal_2_17(Prolog *m);

		static Operation equal_2_18(Prolog *m);

		static Operation equal_2_19(Prolog *m);

		static Operation equal_2_20(Prolog *m);

		static Operation equal_2_21(Prolog *m);

		static Operation equal_2_22(Prolog *m);

		static Operation equal_2_23(Prolog *m);

		static Operation equal_2_24(Prolog *m);

		static Operation equal_2_25(Prolog *m);

		static Operation equal_2_26(Prolog *m);

		static Operation equal_2_27(Prolog *m);

		static Operation equal_2_28(Prolog *m);

		static Operation equal_2_29(Prolog *m);

		static Operation equal_2_30(Prolog *m);

		static Operation equal_2_31(Prolog *m);

		static Operation equal_2_32(Prolog *m);

		static Operation equal_2_33(Prolog *m);

		static Operation equal_2_34(Prolog *m);

		static Operation equal_2_35(Prolog *m);

		static Operation equal_2_36(Prolog *m);

		static Operation equal_2_37(Prolog *m);

		static Operation equal_2_38(Prolog *m);

		static Operation equal_2_39(Prolog *m);

		static Operation equal_2_40(Prolog *m);

		static Operation equal_2_41(Prolog *m);

		static Operation equal_2_42(Prolog *m);

		static Operation equal_2_43(Prolog *m);

		static Operation equal_2_44(Prolog *m);

		static Operation equal_2_45(Prolog *m);

		static Operation equal_2_46(Prolog *m);

		static Operation equal_2_47(Prolog *m);

		static Operation equal_2_48(Prolog *m);

		static Operation equal_2_49(Prolog *m);

		static Operation equal_2_50(Prolog *m);

		static Operation equal_2_51(Prolog *m);

		static Operation equal_2_52(Prolog *m);

		static Operation equal_2_53(Prolog *m);

		static Operation equal_2_54(Prolog *m);

		static Operation equal_2_55(Prolog *m);

		static Operation equal_2_56(Prolog *m);

		static Operation equal_2_57(Prolog *m);

		static Operation equal_2_58(Prolog *m);

		static Operation equal_2_59(Prolog *m);
	/** PREDICATE: boyer_difference/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(boyer_difference/3,public)




	public:
		static Operation PRED_boyer_difference_3_static_exec(Prolog *m);

	private:
		static Operation boyer_difference_3_var(Prolog *m);

		static Operation boyer_difference_3_var_1(Prolog *m);

		static Operation boyer_difference_3_var_2(Prolog *m);

		static Operation boyer_difference_3_var_3(Prolog *m);

		static Operation boyer_difference_3_var_4(Prolog *m);

		static Operation boyer_difference_3_var_5(Prolog *m);

		static Operation boyer_difference_3_var_6(Prolog *m);

		static Operation boyer_difference_3_1(Prolog *m);

		static Operation boyer_difference_3_2(Prolog *m);

		static Operation boyer_difference_3_3(Prolog *m);

		static Operation boyer_difference_3_4(Prolog *m);

		static Operation boyer_difference_3_5(Prolog *m);

		static Operation boyer_difference_3_6(Prolog *m);

		static Operation boyer_difference_3_7(Prolog *m);
	/** PREDICATE: eq/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(eq/3,public)
		public:
			static SymbolTerm *const FUNCTOR_and_1;
			static SymbolTerm *const FUNCTOR_nlistp_1;




		static Operation PRED_eq_3_static_exec(Prolog *m);

	private:
		static Operation eq_3_var(Prolog *m);

		static Operation eq_3_var_1(Prolog *m);

		static Operation eq_3_var_2(Prolog *m);

		static Operation eq_3_var_3(Prolog *m);

		static Operation eq_3_var_4(Prolog *m);

		static Operation eq_3_var_5(Prolog *m);

		static Operation eq_3_var_6(Prolog *m);

		static Operation eq_3_var_7(Prolog *m);

		static Operation eq_3_var_8(Prolog *m);

		static Operation eq_3_var_9(Prolog *m);

		static Operation eq_3_var_10(Prolog *m);

		static Operation eq_3_var_11(Prolog *m);

		static Operation eq_3_var_12(Prolog *m);

		static Operation eq_3_var_13(Prolog *m);

		static Operation eq_3_int(Prolog *m);

		static Operation eq_3_int_1(Prolog *m);

		static Operation eq_3_int_2(Prolog *m);

		static Operation eq_3_con(Prolog *m);

		static Operation eq_3_con_1(Prolog *m);

		static Operation eq_3_con_2(Prolog *m);

		static Operation eq_3_con_3(Prolog *m);

		static Operation eq_3_str(Prolog *m);

		static Operation eq_3_str_1(Prolog *m);

		static Operation eq_3_str_2(Prolog *m);

		static Operation eq_3_str_3(Prolog *m);

		static Operation eq_3_str_4(Prolog *m);

		static Operation eq_3_str_5(Prolog *m);

		static Operation eq_3_str_6(Prolog *m);

		static Operation eq_3_str_7(Prolog *m);

		static Operation eq_3_str_8(Prolog *m);

		static Operation eq_3_str_9(Prolog *m);

		static Operation eq_3_str_10(Prolog *m);

		static Operation eq_3_str_11(Prolog *m);

		static Operation eq_3_str_12(Prolog *m);

		static Operation eq_3_1(Prolog *m);

		static Operation eq_3_2(Prolog *m);

		static Operation eq_3_3(Prolog *m);

		static Operation eq_3_4(Prolog *m);

		static Operation eq_3_5(Prolog *m);

		static Operation eq_3_6(Prolog *m);

		static Operation eq_3_7(Prolog *m);

		static Operation eq_3_8(Prolog *m);

		static Operation eq_3_9(Prolog *m);

		static Operation eq_3_10(Prolog *m);

		static Operation eq_3_11(Prolog *m);

		static Operation eq_3_12(Prolog *m);

		static Operation eq_3_13(Prolog *m);

		static Operation eq_3_14(Prolog *m);
	/** PREDICATE: exp/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(exp/3,public)




	public:
		static Operation PRED_exp_3_static_exec(Prolog *m);

	private:
		static Operation exp_3_sub_1(Prolog *m);

		static Operation exp_3_1(Prolog *m);

		static Operation exp_3_2(Prolog *m);
	/** PREDICATE: gcd/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(gcd/3,public)




	public:
		static Operation PRED_gcd_3_static_exec(Prolog *m);

	private:
		static Operation gcd_3_var(Prolog *m);

		static Operation gcd_3_var_1(Prolog *m);

		static Operation gcd_3_1(Prolog *m);

		static Operation gcd_3_2(Prolog *m);
	/** PREDICATE: mylength/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(mylength/2,public)




	public:
		static Operation PRED_mylength_2_static_exec(Prolog *m);

	private:
		static Operation mylength_2_var(Prolog *m);

		static Operation mylength_2_var_1(Prolog *m);

		static Operation mylength_2_1(Prolog *m);

		static Operation mylength_2_2(Prolog *m);
	/** PREDICATE: lessp/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(lessp/3,public)




	public:
		static Operation PRED_lessp_3_static_exec(Prolog *m);

	private:
		static Operation lessp_3_var(Prolog *m);

		static Operation lessp_3_var_1(Prolog *m);

		static Operation lessp_3_var_2(Prolog *m);

		static Operation lessp_3_var_3(Prolog *m);

		static Operation lessp_3_var_4(Prolog *m);

		static Operation lessp_3_var_5(Prolog *m);

		static Operation lessp_3_var_6(Prolog *m);

		static Operation lessp_3_1(Prolog *m);

		static Operation lessp_3_2(Prolog *m);

		static Operation lessp_3_3(Prolog *m);

		static Operation lessp_3_4(Prolog *m);

		static Operation lessp_3_5(Prolog *m);

		static Operation lessp_3_6(Prolog *m);

		static Operation lessp_3_7(Prolog *m);
	/** PREDICATE: meaning/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(meaning/3,public)
		public:
			static SymbolTerm *const FUNCTOR_plus_tree_1;
			static SymbolTerm *const FUNCTOR_plus_fringe_1;




		static Operation PRED_meaning_3_static_exec(Prolog *m);

	private:
		static Operation meaning_3_var(Prolog *m);

		static Operation meaning_3_var_1(Prolog *m);

		static Operation meaning_3_var_2(Prolog *m);

		static Operation meaning_3_1(Prolog *m);

		static Operation meaning_3_2(Prolog *m);

		static Operation meaning_3_3(Prolog *m);
	/** PREDICATE: myboyer_member/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(myboyer_member/3,public)
		public:
			static SymbolTerm *const FUNCTOR_intersect_2;




		static Operation PRED_myboyer_member_3_static_exec(Prolog *m);

	private:
		static Operation myboyer_member_3_sub_1(Prolog *m);

		static Operation myboyer_member_3_sub_2(Prolog *m);

		static Operation myboyer_member_3_1(Prolog *m);

		static Operation myboyer_member_3_2(Prolog *m);

		static Operation myboyer_member_3_3(Prolog *m);
	/** PREDICATE: nth/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(nth/3,public)




	public:
		static Operation PRED_nth_3_static_exec(Prolog *m);

	private:
		static Operation nth_3_var(Prolog *m);

		static Operation nth_3_var_1(Prolog *m);

		static Operation nth_3_var_2(Prolog *m);

		static Operation nth_3_con(Prolog *m);

		static Operation nth_3_con_1(Prolog *m);

		static Operation nth_3_1(Prolog *m);

		static Operation nth_3_2(Prolog *m);

		static Operation nth_3_3(Prolog *m);
	/** PREDICATE: myplus/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(myplus/3,public)




	public:
		static Operation PRED_myplus_3_static_exec(Prolog *m);

	private:
		static Operation myplus_3_var(Prolog *m);

		static Operation myplus_3_var_1(Prolog *m);

		static Operation myplus_3_var_2(Prolog *m);

		static Operation myplus_3_1(Prolog *m);

		static Operation myplus_3_2(Prolog *m);

		static Operation myplus_3_3(Prolog *m);
	/** PREDICATE: power_eval/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(power_eval/3,public)
		public:
			static SymbolTerm *const FUNCTOR_big_plus1_3;
			static SymbolTerm *const FUNCTOR_power_rep_2;
			static SymbolTerm *const FUNCTOR_big_plus_4;




		static Operation PRED_power_eval_3_static_exec(Prolog *m);

	private:
		static Operation power_eval_3_var(Prolog *m);

		static Operation power_eval_3_var_1(Prolog *m);

		static Operation power_eval_3_var_2(Prolog *m);

		static Operation power_eval_3_var_3(Prolog *m);

		static Operation power_eval_3_1(Prolog *m);

		static Operation power_eval_3_2(Prolog *m);

		static Operation power_eval_3_3(Prolog *m);

		static Operation power_eval_3_4(Prolog *m);
	/** PREDICATE: quotient/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(quotient/3,public)




	public:
		static Operation PRED_quotient_3_static_exec(Prolog *m);

	private:
		static Operation quotient_3_var(Prolog *m);

		static Operation quotient_3_var_1(Prolog *m);

		static Operation quotient_3_1(Prolog *m);

		static Operation quotient_3_2(Prolog *m);
	/** PREDICATE: remainder/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(remainder/3,public)




	public:
		static Operation PRED_remainder_3_static_exec(Prolog *m);

	private:
		static Operation remainder_3_var(Prolog *m);

		static Operation remainder_3_var_1(Prolog *m);

		static Operation remainder_3_var_2(Prolog *m);

		static Operation remainder_3_var_3(Prolog *m);

		static Operation remainder_3_int(Prolog *m);

		static Operation remainder_3_int_1(Prolog *m);

		static Operation remainder_3_1(Prolog *m);

		static Operation remainder_3_2(Prolog *m);

		static Operation remainder_3_3(Prolog *m);

		static Operation remainder_3_4(Prolog *m);
	/** PREDICATE: reverse_loop/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(reverse_loop/3,public)




	public:
		static Operation PRED_reverse_loop_3_static_exec(Prolog *m);

	private:
		static Operation reverse_loop_3_sub_1(Prolog *m);

		static Operation reverse_loop_3_1(Prolog *m);

		static Operation reverse_loop_3_2(Prolog *m);
	/** PREDICATE: times/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/boyer.pl
	*/
		// main(times/3,public)




	public:
		static Operation PRED_times_3_static_exec(Prolog *m);

	private:
		static Operation times_3_var(Prolog *m);

		static Operation times_3_var_1(Prolog *m);

		static Operation times_3_var_2(Prolog *m);

		static Operation times_3_var_3(Prolog *m);

		static Operation times_3_int(Prolog *m);

		static Operation times_3_int_1(Prolog *m);

		static Operation times_3_int_2(Prolog *m);

		static Operation times_3_1(Prolog *m);

		static Operation times_3_2(Prolog *m);

		static Operation times_3_3(Prolog *m);

		static Operation times_3_4(Prolog *m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_boyer::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
