#pragma once

#include "../../machine/SxxMachine/TermData.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Operation;
	class Prolog;
	class IntegerTerm;
	class StructureTerm;
}

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$equality_of_term_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$inequality_of_term_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$new_indexing_hash_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_assertz_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_call_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_callable_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_clause_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_compound_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_findall_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_length_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_var_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_swi_supp.PRED_append_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_swi_supp.PRED_maplist_4_static_exec;
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
//	import static SxxMachine.sxxtensions.PRED_get_attr_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_predicate_property_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_put_attr_3_static_exec;

	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using TermData = SxxMachine::TermData;

	class FILE_prolog_metainference : public TermData
	{
		/** PREDICATE: inferred_meta_predicate/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
	public:
		static SymbolTerm *const ATOM_prolog_metainference;

		static Operation PRED_inferred_meta_predicate_2_static_exec(Prolog *m);

	private:
		static Operation inferred_meta_predicate_2_var(Prolog *m);

		static Operation inferred_meta_predicate_2_var_1(Prolog *m);

		static Operation inferred_meta_predicate_2_1(Prolog *m);

		static Operation inferred_meta_predicate_2_2(Prolog *m);

		/** PREDICATE: infer_meta_predicate/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/

	public:
		static Operation PRED_infer_meta_predicate_2_static_exec(Prolog *m);

	private:
		static Operation infer_meta_predicate_2_var(Prolog *m);

		static Operation infer_meta_predicate_2_var_1(Prolog *m);

		static Operation infer_meta_predicate_2_var_2(Prolog *m);

		static Operation infer_meta_predicate_2_1(Prolog *m);

		static Operation infer_meta_predicate_2_2(Prolog *m);

		static Operation infer_meta_predicate_2_3(Prolog *m);

		/** PREDICATE: do_infer_meta_predicate/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/

	public:
		static Operation PRED_do_infer_meta_predicate_2_static_exec(Prolog *m);

		/** PREDICATE: meta_pred_args_in_clause/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/

		static Operation PRED_meta_pred_args_in_clause_3_static_exec(Prolog *m);

		/** PREDICATE: annotate_meta_vars_in_body/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
	private:
		static IntegerTerm *const PRED_annotate_meta_vars_in_body_2_s1;
	public:
		static IntegerTerm *const int_1;

		static Operation PRED_annotate_meta_vars_in_body_2_static_exec(Prolog *m);

	private:
		static Operation annotate_meta_vars_in_body_2_top(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_var(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_var_1(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_var_2(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_var_3(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_var_4(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_var_5(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_var_6(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_var_7(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_var_8(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_var_9(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_var_10(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_int(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_int_1(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_int_2(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_int_3(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_int_4(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_1(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_2(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_3(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_4(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_5(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_6(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_7(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_8(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_9(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_10(Prolog *m);

		static Operation annotate_meta_vars_in_body_2_11(Prolog *m);

		/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/

	public:
		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_static_exec(Prolog *m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_sub_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_sub_2(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_2(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_3(Prolog *m);

		/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
		static SymbolTerm *const PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_s1;

	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec(Prolog *m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_sub_1(Prolog *m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_1(Prolog *m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_2(Prolog *m);

		/** PREDICATE: annotate_meta_args/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_annotate_meta_args_5_static_exec(Prolog *m);

	private:
		static Operation annotate_meta_args_5_sub_1(Prolog *m);

		static Operation annotate_meta_args_5_1(Prolog *m);

		static Operation annotate_meta_args_5_2(Prolog *m);

		/** PREDICATE: annotate_meta_arg/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
		static IntegerTerm *const PRED_annotate_meta_arg_3_s1;
	public:
		static SymbolTerm *const ATOM_m;

		static Operation PRED_annotate_meta_arg_3_static_exec(Prolog *m);

	private:
		static Operation annotate_meta_arg_3_var(Prolog *m);

		static Operation annotate_meta_arg_3_var_1(Prolog *m);

		static Operation annotate_meta_arg_3_var_2(Prolog *m);

		static Operation annotate_meta_arg_3_var_3(Prolog *m);

		static Operation annotate_meta_arg_3_var_4(Prolog *m);

		static Operation annotate_meta_arg_3_flo(Prolog *m);

		static Operation annotate_meta_arg_3_flo_1(Prolog *m);

		static Operation annotate_meta_arg_3_flo_2(Prolog *m);

		static Operation annotate_meta_arg_3_flo_3(Prolog *m);

		static Operation annotate_meta_arg_3_1(Prolog *m);

		static Operation annotate_meta_arg_3_2(Prolog *m);

		static Operation annotate_meta_arg_3_3(Prolog *m);

		static Operation annotate_meta_arg_3_4(Prolog *m);

		static Operation annotate_meta_arg_3_5(Prolog *m);

		/** PREDICATE: annotate/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
		static SymbolTerm *const PRED_annotate_2_s1;

	public:
		static Operation PRED_annotate_2_static_exec(Prolog *m);

	private:
		static Operation annotate_2_sub_1(Prolog *m);

		static Operation annotate_2_1(Prolog *m);

		static Operation annotate_2_2(Prolog *m);

		/** PREDICATE: join_annotation/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
		static SymbolTerm *const PRED_join_annotation_3_s1;

	public:
		static Operation PRED_join_annotation_3_static_exec(Prolog *m);

	private:
		static Operation join_annotation_3_sub_1(Prolog *m);

		static Operation join_annotation_3_sub_2(Prolog *m);

		static Operation join_annotation_3_sub_3(Prolog *m);

		static Operation join_annotation_3_sub_4(Prolog *m);

		static Operation join_annotation_3_1(Prolog *m);

		static Operation join_annotation_3_2(Prolog *m);

		static Operation join_annotation_3_3(Prolog *m);

		static Operation join_annotation_3_4(Prolog *m);

		static Operation join_annotation_3_5(Prolog *m);

		/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/

	public:
		static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec(Prolog *m);

	private:
		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_sub_1(Prolog *m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_1(Prolog *m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_2(Prolog *m);

		/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/

	public:
		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec(Prolog *m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_sub_1(Prolog *m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_1(Prolog *m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_2(Prolog *m);

		/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/

	public:
		static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec(Prolog *m);

	private:
		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_sub_1(Prolog *m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_1(Prolog *m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_2(Prolog *m);

		/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/

	public:
		static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec(Prolog *m);

	private:
		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_sub_1(Prolog *m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_1(Prolog *m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_2(Prolog *m);

		/** PREDICATE: $dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
		static SymbolTerm *const PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_s1;

	public:
		static Operation PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec(Prolog *m);

	private:
		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_sub_1(Prolog *m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_1(Prolog *m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_2(Prolog *m);

		/** PREDICATE: attr_unify_hook/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
		static SymbolTerm *const PRED_attr_unify_hook_2_s1;

	public:
		static Operation PRED_attr_unify_hook_2_static_exec(Prolog *m);

		/** PREDICATE: meta_annotation/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
	private:
		static IntegerTerm *const PRED_meta_annotation_2_s1;

	public:
		static Operation PRED_meta_annotation_2_static_exec(Prolog *m);

		/** PREDICATE: $dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
	private:
		static SymbolTerm *const PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_s1;

	public:
		static Operation PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_static_exec(Prolog *m);

	private:
		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_sub_1(Prolog *m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_1(Prolog *m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_2(Prolog *m);

		/** PREDICATE: meta_args/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_meta_args_5_static_exec(Prolog *m);

	private:
		static Operation meta_args_5_sub_1(Prolog *m);

		static Operation meta_args_5_1(Prolog *m);

		static Operation meta_args_5_2(Prolog *m);

		/** PREDICATE: is_meta/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
		static SymbolTerm *const PRED_is_meta_1_s1;
	public:
		static SymbolTerm *const ATOM_$005E;
		static SymbolTerm *const ATOM_$002F$002F;

		static Operation PRED_is_meta_1_static_exec(Prolog *m);

	private:
		static Operation is_meta_1_var(Prolog *m);

		static Operation is_meta_1_var_1(Prolog *m);

		static Operation is_meta_1_var_2(Prolog *m);

		static Operation is_meta_1_var_3(Prolog *m);

		static Operation is_meta_1_1(Prolog *m);

		static Operation is_meta_1_2(Prolog *m);

		static Operation is_meta_1_3(Prolog *m);

		static Operation is_meta_1_4(Prolog *m);

		/** PREDICATE: meta_arg/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
		static SymbolTerm *const PRED_meta_arg_2_s1;
	public:
		static SymbolTerm *const ATOM_module_colon;
		static SymbolTerm *const ATOM_$002A;

		static Operation PRED_meta_arg_2_static_exec(Prolog *m);

	private:
		static Operation meta_arg_2_sub_1(Prolog *m);

		static Operation meta_arg_2_sub_2(Prolog *m);

		static Operation meta_arg_2_1(Prolog *m);

		static Operation meta_arg_2_2(Prolog *m);

		static Operation meta_arg_2_3(Prolog *m);

		/** PREDICATE: combine_meta_args/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
		static SymbolTerm *const PRED_combine_meta_args_2_s1;
	public:
		static SymbolTerm *const ATOM_join_annotation;

		static Operation PRED_combine_meta_args_2_static_exec(Prolog *m);

	private:
		static Operation combine_meta_args_2_top(Prolog *m);

		static Operation combine_meta_args_2_var(Prolog *m);

		static Operation combine_meta_args_2_var_1(Prolog *m);

		static Operation combine_meta_args_2_var_2(Prolog *m);

		static Operation combine_meta_args_2_var_3(Prolog *m);

		static Operation combine_meta_args_2_lis(Prolog *m);

		static Operation combine_meta_args_2_lis_1(Prolog *m);

		static Operation combine_meta_args_2_lis_2(Prolog *m);

		static Operation combine_meta_args_2_1(Prolog *m);

		static Operation combine_meta_args_2_2(Prolog *m);

		static Operation combine_meta_args_2_3(Prolog *m);

		static Operation combine_meta_args_2_4(Prolog *m);

		/** PREDICATE: $init/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
		*/
		static SymbolTerm *const PRED_$init_0_s1;
	public:
		static SymbolTerm *const ATOM_inferred_meta_pred;
		static IntegerTerm *const int_3;
	private:
		static StructureTerm *const PRED_$init_0_s6;

	public:
		static Operation PRED_$init_0_static_exec(Prolog *m);

		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static FILE_prolog_metainference::StaticConstructor staticConstructor;


	public:
		static void loadPreds();
	};

}
