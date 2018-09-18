#ifndef FILE_APPLY_MACROS
#define FILE_APPLY_MACROS

#include "../../machine/SxxMachine/TermData.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class IntegerTerm; }
namespace SxxMachine { class StructureTerm; }

namespace SxxMachine::library
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$greater_or_equal_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$new_indexing_hash_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_callable_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_compound_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_current_prolog_flag_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_length_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_nonvar_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_sub_atom_5_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_swi_supp.PRED_append_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_swi_supp.PRED_strip_module_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.fail_0;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$univ_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_arg_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_functor_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_$expand_closure_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_$skip_list_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_compile_aux_clauses_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_compound_name_arguments_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_compound_name_arity_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_f2_pos_6_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_format_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_predicate_property_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_prolog_load_context_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_string_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_string_codes_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_type_error_2_static_exec;

	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using TermData = SxxMachine::TermData;

	class FILE_apply_macros : public TermData
	{
		/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl/9
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

		// private final Term arg5, arg6, arg7, arg8, arg9;

	public:
		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec(Prolog* m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_sub_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_2(Prolog* m);

		/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
	public:
		static SymbolTerm* const  ATOM_transparent;

		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_2(Prolog* m);

		/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl/22
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
	public:
		static SymbolTerm* const  ATOM_defined;

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22;

		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_static_exec(Prolog* m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_sub_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_2(Prolog* m);

		/** PREDICATE: expand_maplist/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
	public:
		static IntegerTerm* const  int_1;
		static SymbolTerm* const  ATOM___aux_maplist$002F$007Ed_$007Ew$002B$007Ed;
		static SymbolTerm* const  ATOM_module;

		static Operation PRED_expand_maplist_3_static_exec(Prolog* m);

		/** PREDICATE: expand_closure_no_fail/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

		static Operation PRED_expand_closure_no_fail_3_static_exec(Prolog* m);

	private:
		static Operation expand_closure_no_fail_3_sub_1(Prolog* m);

		static Operation expand_closure_no_fail_3_1(Prolog* m);

		static Operation expand_closure_no_fail_3_2(Prolog* m);

		/** PREDICATE: empty_lists/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static IntegerTerm* const  PRED_empty_lists_2_s1;

	public:
		static Operation PRED_empty_lists_2_static_exec(Prolog* m);

	private:
		static Operation empty_lists_2_top(Prolog* m);

		static Operation empty_lists_2_var(Prolog* m);

		static Operation empty_lists_2_var_1(Prolog* m);

		static Operation empty_lists_2_1(Prolog* m);

		static Operation empty_lists_2_2(Prolog* m);

		/** PREDICATE: heads_and_tails/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static IntegerTerm* const  PRED_heads_and_tails_4_s1;

	public:
		static Operation PRED_heads_and_tails_4_static_exec(Prolog* m);

	private:
		static Operation heads_and_tails_4_top(Prolog* m);

		static Operation heads_and_tails_4_var(Prolog* m);

		static Operation heads_and_tails_4_var_1(Prolog* m);

		static Operation heads_and_tails_4_1(Prolog* m);

		static Operation heads_and_tails_4_2(Prolog* m);

		/** PREDICATE: expand_apply/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static SymbolTerm* const  PRED_expand_apply_2_s1;
	public:
		static IntegerTerm* const  int_2;

		static Operation PRED_expand_apply_2_static_exec(Prolog* m);

		/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl/8
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static IntegerTerm* const  int_0;

		// private final Term arg5, arg6, arg7, arg8;

		static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_static_exec(Prolog* m);

	private:
		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_sub_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_2(Prolog* m);

		/** PREDICATE: expand_apply/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

	public:
		static Operation PRED_expand_apply_4_static_exec(Prolog* m);

	private:
		static Operation expand_apply_4_var(Prolog* m);

		static Operation expand_apply_4_var_1(Prolog* m);

		static Operation expand_apply_4_var_2(Prolog* m);

		static Operation expand_apply_4_var_3(Prolog* m);

		static Operation expand_apply_4_1(Prolog* m);

		static Operation expand_apply_4_2(Prolog* m);

		static Operation expand_apply_4_3(Prolog* m);

		static Operation expand_apply_4_4(Prolog* m);

		/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl/9
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

		// private final Term arg5, arg6, arg7, arg8, arg9;

	public:
		static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec(Prolog* m);

	private:
		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_sub_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_2(Prolog* m);

		/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl/9
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

		// private final Term arg5, arg6, arg7, arg8, arg9;

	public:
		static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec(Prolog* m);

	private:
		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_sub_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_2(Prolog* m);

		/** PREDICATE: expand_phrase/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

	public:
		static Operation PRED_expand_phrase_2_static_exec(Prolog* m);

		/** PREDICATE: expand_phrase/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

		static Operation PRED_expand_phrase_4_static_exec(Prolog* m);

	private:
		static Operation expand_phrase_4_var(Prolog* m);

		static Operation expand_phrase_4_var_1(Prolog* m);

		static Operation expand_phrase_4_1(Prolog* m);

		static Operation expand_phrase_4_2(Prolog* m);

		/** PREDICATE: dcg_goal/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

	public:
		static Operation PRED_dcg_goal_4_static_exec(Prolog* m);

	private:
		static Operation dcg_goal_4_var(Prolog* m);

		static Operation dcg_goal_4_var_1(Prolog* m);

		static Operation dcg_goal_4_1(Prolog* m);

		static Operation dcg_goal_4_2(Prolog* m);

		/** PREDICATE: $dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

	public:
		static Operation PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_2(Prolog* m);

		/** PREDICATE: dcg_extend/6
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static IntegerTerm* const  PRED_dcg_extend_6_s1;

		// private final Term arg5, arg6;

	public:
		static Operation PRED_dcg_extend_6_static_exec(Prolog* m);

	private:
		static Operation dcg_extend_6_sub_1(Prolog* m);

		static Operation dcg_extend_6_sub_2(Prolog* m);

		static Operation dcg_extend_6_sub_3(Prolog* m);

		static Operation dcg_extend_6_1(Prolog* m);

		static Operation dcg_extend_6_2(Prolog* m);

		static Operation dcg_extend_6_3(Prolog* m);

		static Operation dcg_extend_6_4(Prolog* m);

		/** PREDICATE: $dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

	public:
		static Operation PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_1(Prolog* m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_2(Prolog* m);

		/** PREDICATE: dcg_control/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static SymbolTerm* const  PRED_dcg_control_1_s1;

	public:
		static Operation PRED_dcg_control_1_static_exec(Prolog* m);

	private:
		static Operation dcg_control_1_var(Prolog* m);

		static Operation dcg_control_1_var_1(Prolog* m);

		static Operation dcg_control_1_var_2(Prolog* m);

		static Operation dcg_control_1_var_3(Prolog* m);

		static Operation dcg_control_1_var_4(Prolog* m);

		static Operation dcg_control_1_var_5(Prolog* m);

		static Operation dcg_control_1_var_6(Prolog* m);

		static Operation dcg_control_1_var_7(Prolog* m);

		static Operation dcg_control_1_var_8(Prolog* m);

		static Operation dcg_control_1_con(Prolog* m);

		static Operation dcg_control_1_con_1(Prolog* m);

		static Operation dcg_control_1_str(Prolog* m);

		static Operation dcg_control_1_str_1(Prolog* m);

		static Operation dcg_control_1_str_2(Prolog* m);

		static Operation dcg_control_1_str_3(Prolog* m);

		static Operation dcg_control_1_str_4(Prolog* m);

		static Operation dcg_control_1_str_5(Prolog* m);

		static Operation dcg_control_1_1(Prolog* m);

		static Operation dcg_control_1_2(Prolog* m);

		static Operation dcg_control_1_3(Prolog* m);

		static Operation dcg_control_1_4(Prolog* m);

		static Operation dcg_control_1_5(Prolog* m);

		static Operation dcg_control_1_6(Prolog* m);

		static Operation dcg_control_1_7(Prolog* m);

		static Operation dcg_control_1_8(Prolog* m);

		static Operation dcg_control_1_9(Prolog* m);

		/** PREDICATE: $dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static SymbolTerm* const  PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_s1;

	public:
		static Operation PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_static_exec(Prolog* m);

	private:
		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_sub_1(Prolog* m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_sub_2(Prolog* m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_1(Prolog* m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_2(Prolog* m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_3(Prolog* m);

		/** PREDICATE: $dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static SymbolTerm* const  PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_s1;

	public:
		static Operation PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_static_exec(Prolog* m);

	private:
		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_sub_1(Prolog* m);

		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_1(Prolog* m);

		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_2(Prolog* m);

		/** PREDICATE: terminal/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static SymbolTerm* const  PRED_terminal_3_s1;

	public:
		static Operation PRED_terminal_3_static_exec(Prolog* m);

	private:
		static Operation terminal_3_sub_1(Prolog* m);

		static Operation terminal_3_sub_2(Prolog* m);

		static Operation terminal_3_1(Prolog* m);

		static Operation terminal_3_2(Prolog* m);

		static Operation terminal_3_3(Prolog* m);

		/** PREDICATE: extend_pos/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

	public:
		static Operation PRED_extend_pos_3_static_exec(Prolog* m);

	private:
		static Operation extend_pos_3_var(Prolog* m);

		static Operation extend_pos_3_var_1(Prolog* m);

		static Operation extend_pos_3_var_2(Prolog* m);

		static Operation extend_pos_3_1(Prolog* m);

		static Operation extend_pos_3_2(Prolog* m);

		static Operation extend_pos_3_3(Prolog* m);

		/** PREDICATE: extra_pos/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static IntegerTerm* const  PRED_extra_pos_3_s1;

	public:
		static Operation PRED_extra_pos_3_static_exec(Prolog* m);

	private:
		static Operation extra_pos_3_var(Prolog* m);

		static Operation extra_pos_3_var_1(Prolog* m);

		static Operation extra_pos_3_1(Prolog* m);

		static Operation extra_pos_3_2(Prolog* m);

		/** PREDICATE: nt_pos/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

	public:
		static Operation PRED_nt_pos_2_static_exec(Prolog* m);

	private:
		static Operation nt_pos_2_var(Prolog* m);

		static Operation nt_pos_2_var_1(Prolog* m);

		static Operation nt_pos_2_1(Prolog* m);

		static Operation nt_pos_2_2(Prolog* m);

		/** PREDICATE: t_pos/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

	public:
		static Operation PRED_t_pos_2_static_exec(Prolog* m);

	private:
		static Operation t_pos_2_sub_1(Prolog* m);

		static Operation t_pos_2_1(Prolog* m);

		static Operation t_pos_2_2(Prolog* m);

		/** PREDICATE: qcall_instantiated/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/

	public:
		static Operation PRED_qcall_instantiated_1_static_exec(Prolog* m);

	private:
		static Operation qcall_instantiated_1_var(Prolog* m);

		static Operation qcall_instantiated_1_var_1(Prolog* m);

		static Operation qcall_instantiated_1_var_2(Prolog* m);

		static Operation qcall_instantiated_1_int(Prolog* m);

		static Operation qcall_instantiated_1_int_1(Prolog* m);

		static Operation qcall_instantiated_1_1(Prolog* m);

		static Operation qcall_instantiated_1_2(Prolog* m);

		static Operation qcall_instantiated_1_3(Prolog* m);

		/** PREDICATE: (:)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static SymbolTerm* const  PRED_$003A_2_s1;
	public:
		static SymbolTerm* const  ATOM_prolog_colour;
		static SymbolTerm* const  ATOM_maplist;
		static SymbolTerm* const  ATOM_expanded;
		static SymbolTerm* const  ATOM_system;

		static Operation PRED_$003A_2_static_exec(Prolog* m);

	private:
		static Operation $003A_2_var(Prolog* m);

		static Operation $003A_2_var_1(Prolog* m);

		static Operation $003A_2_var_2(Prolog* m);

		static Operation $003A_2_var_3(Prolog* m);

		static Operation $003A_2_1(Prolog* m);

		static Operation $003A_2_2(Prolog* m);

		static Operation $003A_2_3(Prolog* m);

		static Operation $003A_2_4(Prolog* m);

		/** PREDICATE: is_maplist/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static SymbolTerm* const  PRED_is_maplist_1_s1;

	public:
		static Operation PRED_is_maplist_1_static_exec(Prolog* m);

		/** PREDICATE: maplist_expansion/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
	private:
		static IntegerTerm* const  PRED_maplist_expansion_1_s1;
	public:
		static SymbolTerm* const  ATOM___aux_maplist$002F;

		static Operation PRED_maplist_expansion_1_static_exec(Prolog* m);

		/** PREDICATE: $dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
	private:
		static SymbolTerm* const  PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_s1;

	public:
		static Operation PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_static_exec(Prolog* m);

	private:
		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_sub_1(Prolog* m);

		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_1(Prolog* m);

		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_2(Prolog* m);

		/** PREDICATE: $init/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl
		*/
		static SymbolTerm* const  PRED_$init_0_s1;
	public:
		static SymbolTerm* const  ATOM_goal_expansion;
	private:
		static StructureTerm* const  PRED_$init_0_s6;

	public:
		static Operation PRED_$init_0_static_exec(Prolog* m);

		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static FILE_apply_macros::StaticConstructor staticConstructor;


	public:
		static void loadPreds();
	};

}


#endif	//#ifndef FILE_APPLY_MACROS
