#ifndef FILE_BUILTINS
#define FILE_BUILTINS

#include "../../machine/SxxMachine/TermData.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class IntegerTerm; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class ListTerm; }

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.PRED_$trace_goal_4_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.PRED_consult_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.PRED_debug_0_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.PRED_leash_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.PRED_nodebug_0_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.PRED_nospy_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.PRED_nospyall_0_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.PRED_notrace_0_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.PRED_spy_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.PRED_trace_0_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_io.PRED_nl_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_system.PRED_system_predicate_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.fail_0;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$atom_type0_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$begin_exception_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$begin_sync_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$builtin_member_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$call_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$call_closure_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$compare0_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$compiled_predicate_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$compiled_predicate_or_builtin_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$end_exception_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$end_sync_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$erase_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$fast_write_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$fast_writeq_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$get_current_B_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$get_exception_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$get_hash_manager_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$get_instances_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$get_prolog_impl_flag_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$hash_adda_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$hash_addz_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$hash_remove_first_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$insert_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$read_token0_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$set_exception_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$set_prolog_impl_flag_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$statistics_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$term_hash_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$univ_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_arg_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_atom_codes_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_atom_concat_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_atom_length_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_current_input_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_current_output_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_flush_output_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_functor_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_halt_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_hash_contains_key_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_hash_get_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_hash_keys_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_hash_put_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_hash_remove_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_java_constructor0_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_java_conversion_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_java_declared_constructor0_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_java_declared_method0_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_java_get_declared_field0_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_java_get_field0_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_java_method0_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_java_set_declared_field0_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_java_set_field0_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_mutex_lock_bt_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_mutex_unlock_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_new_hash_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_number_codes_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_put_char_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_put_code_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_raise_exception_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_read_line_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_regex_compile_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_regex_match_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_sort_2_static_exec;

	class FILE_builtins final : public TermData
	{
		/** PREDICATE: (package)/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_package_1_static_exec(Prolog* m);

		/** PREDICATE: true/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_true_0_static_exec(Prolog* m);

		/** PREDICATE: otherwise/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_otherwise_0_static_exec(Prolog* m);

		/** PREDICATE: fail/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_fail_0_static_exec(Prolog* m);

		/** PREDICATE: false/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_false_0_static_exec(Prolog* m);

		/** PREDICATE: !/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$0021_0_static_exec(Prolog* m);

		/** PREDICATE: (^)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  ATOM_SxxMachine$002Ebuiltin;

		static Operation PRED_$005E_2_static_exec(Prolog* m);

		/** PREDICATE: (,)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$002C_2_static_exec(Prolog* m);

		/** PREDICATE: (;)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$003B_2_static_exec(Prolog* m);

	private:
		static Operation $003B_2_var(Prolog* m);

		static Operation $003B_2_var_1(Prolog* m);

		static Operation $003B_2_var_2(Prolog* m);

		static Operation $003B_2_var_3(Prolog* m);

		static Operation $003B_2_int(Prolog* m);

		static Operation $003B_2_int_1(Prolog* m);

		static Operation $003B_2_1(Prolog* m);

		static Operation $003B_2_2(Prolog* m);

		static Operation $003B_2_3(Prolog* m);

		static Operation $003B_2_4(Prolog* m);

		/** PREDICATE: (->)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$002D$003E_2_static_exec(Prolog* m);

		/** PREDICATE: call/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_call_1_s1;
	public:
		static IntegerTerm* const  int_0;
		static SymbolTerm* const  ATOM_interpret;

		static Operation PRED_call_1_static_exec(Prolog* m);

		/** PREDICATE: $meta_call/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$meta_call_5_s1;
	public:
		static IntegerTerm* const  int_1;
		static SymbolTerm* const  ATOM_trace;
		static SymbolTerm* const  ATOM_debug;
		static SymbolTerm* const  ATOM_notrace;
		static SymbolTerm* const  ATOM_nodebug;
		static SymbolTerm* const  ATOM_nospyall;
		static SymbolTerm* const  ATOM_$0021;
		static SymbolTerm* const  ATOM_no;
		static SymbolTerm* const  ATOM_if;
		static SymbolTerm* const  ATOM_cut;
	private:
		static StructureTerm* const  PRED_$meta_call_5_s21;
	public:
		static SymbolTerm* const  ATOM_callable;
	private:
		static StructureTerm* const  PRED_$meta_call_5_s44;

		// private final Term arg5;

	public:
		static Operation PRED_$meta_call_5_static_exec(Prolog* m);

	private:
		static Operation $meta_call_5_top(Prolog* m);

		static Operation $meta_call_5_var(Prolog* m);

		static Operation $meta_call_5_var_1(Prolog* m);

		static Operation $meta_call_5_var_2(Prolog* m);

		static Operation $meta_call_5_var_3(Prolog* m);

		static Operation $meta_call_5_var_4(Prolog* m);

		static Operation $meta_call_5_var_5(Prolog* m);

		static Operation $meta_call_5_var_6(Prolog* m);

		static Operation $meta_call_5_var_7(Prolog* m);

		static Operation $meta_call_5_var_8(Prolog* m);

		static Operation $meta_call_5_var_9(Prolog* m);

		static Operation $meta_call_5_var_10(Prolog* m);

		static Operation $meta_call_5_var_11(Prolog* m);

		static Operation $meta_call_5_var_12(Prolog* m);

		static Operation $meta_call_5_var_13(Prolog* m);

		static Operation $meta_call_5_var_14(Prolog* m);

		static Operation $meta_call_5_var_15(Prolog* m);

		static Operation $meta_call_5_var_16(Prolog* m);

		static Operation $meta_call_5_var_17(Prolog* m);

		static Operation $meta_call_5_var_18(Prolog* m);

		static Operation $meta_call_5_var_19(Prolog* m);

		static Operation $meta_call_5_var_20(Prolog* m);

		static Operation $meta_call_5_var_21(Prolog* m);

		static Operation $meta_call_5_var_22(Prolog* m);

		static Operation $meta_call_5_var_23(Prolog* m);

		static Operation $meta_call_5_var_24(Prolog* m);

		static Operation $meta_call_5_var_25(Prolog* m);

		static Operation $meta_call_5_var_26(Prolog* m);

		static Operation $meta_call_5_var_27(Prolog* m);

		static Operation $meta_call_5_var_28(Prolog* m);

		static Operation $meta_call_5_var_29(Prolog* m);

		static Operation $meta_call_5_var_30(Prolog* m);

		static Operation $meta_call_5_var_31(Prolog* m);

		static Operation $meta_call_5_var_32(Prolog* m);

		static Operation $meta_call_5_var_33(Prolog* m);

		static Operation $meta_call_5_var_34(Prolog* m);

		static Operation $meta_call_5_var_35(Prolog* m);

		static Operation $meta_call_5_var_36(Prolog* m);

		static Operation $meta_call_5_int(Prolog* m);

		static Operation $meta_call_5_int_1(Prolog* m);

		static Operation $meta_call_5_int_2(Prolog* m);

		static Operation $meta_call_5_int_3(Prolog* m);

		static Operation $meta_call_5_con(Prolog* m);

		static Operation $meta_call_5_con_1(Prolog* m);

		static Operation $meta_call_5_con_2(Prolog* m);

		static Operation $meta_call_5_con_3(Prolog* m);

		static Operation $meta_call_5_con_4(Prolog* m);

		static Operation $meta_call_5_con_5(Prolog* m);

		static Operation $meta_call_5_con_6(Prolog* m);

		static Operation $meta_call_5_con_7(Prolog* m);

		static Operation $meta_call_5_con_8(Prolog* m);

		static Operation $meta_call_5_con_9(Prolog* m);

		static Operation $meta_call_5_con_10(Prolog* m);

		static Operation $meta_call_5_con_11(Prolog* m);

		static Operation $meta_call_5_str(Prolog* m);

		static Operation $meta_call_5_str_1(Prolog* m);

		static Operation $meta_call_5_str_2(Prolog* m);

		static Operation $meta_call_5_str_3(Prolog* m);

		static Operation $meta_call_5_str_4(Prolog* m);

		static Operation $meta_call_5_str_5(Prolog* m);

		static Operation $meta_call_5_str_6(Prolog* m);

		static Operation $meta_call_5_str_7(Prolog* m);

		static Operation $meta_call_5_str_8(Prolog* m);

		static Operation $meta_call_5_str_9(Prolog* m);

		static Operation $meta_call_5_str_10(Prolog* m);

		static Operation $meta_call_5_str_11(Prolog* m);

		static Operation $meta_call_5_str_12(Prolog* m);

		static Operation $meta_call_5_str_13(Prolog* m);

		static Operation $meta_call_5_str_14(Prolog* m);

		static Operation $meta_call_5_str_15(Prolog* m);

		static Operation $meta_call_5_str_16(Prolog* m);

		static Operation $meta_call_5_str_17(Prolog* m);

		static Operation $meta_call_5_str_18(Prolog* m);

		static Operation $meta_call_5_str_19(Prolog* m);

		static Operation $meta_call_5_str_20(Prolog* m);

		static Operation $meta_call_5_str_21(Prolog* m);

		static Operation $meta_call_5_str_22(Prolog* m);

		static Operation $meta_call_5_str_23(Prolog* m);

		static Operation $meta_call_5_str_24(Prolog* m);

		static Operation $meta_call_5_str_25(Prolog* m);

		static Operation $meta_call_5_str_26(Prolog* m);

		static Operation $meta_call_5_str_27(Prolog* m);

		static Operation $meta_call_5_lis(Prolog* m);

		static Operation $meta_call_5_lis_1(Prolog* m);

		static Operation $meta_call_5_lis_2(Prolog* m);

		static Operation $meta_call_5_lis_3(Prolog* m);

		static Operation $meta_call_5_lis_4(Prolog* m);

		static Operation $meta_call_5_1(Prolog* m);

		static Operation $meta_call_5_2(Prolog* m);

		static Operation $meta_call_5_3(Prolog* m);

		static Operation $meta_call_5_4(Prolog* m);

		static Operation $meta_call_5_5(Prolog* m);

		static Operation $meta_call_5_6(Prolog* m);

		static Operation $meta_call_5_7(Prolog* m);

		static Operation $meta_call_5_8(Prolog* m);

		static Operation $meta_call_5_9(Prolog* m);

		static Operation $meta_call_5_10(Prolog* m);

		static Operation $meta_call_5_11(Prolog* m);

		static Operation $meta_call_5_12(Prolog* m);

		static Operation $meta_call_5_13(Prolog* m);

		static Operation $meta_call_5_14(Prolog* m);

		static Operation $meta_call_5_15(Prolog* m);

		static Operation $meta_call_5_16(Prolog* m);

		static Operation $meta_call_5_17(Prolog* m);

		static Operation $meta_call_5_18(Prolog* m);

		static Operation $meta_call_5_19(Prolog* m);

		static Operation $meta_call_5_20(Prolog* m);

		static Operation $meta_call_5_21(Prolog* m);

		static Operation $meta_call_5_22(Prolog* m);

		static Operation $meta_call_5_23(Prolog* m);

		static Operation $meta_call_5_24(Prolog* m);

		static Operation $meta_call_5_25(Prolog* m);

		static Operation $meta_call_5_26(Prolog* m);

		static Operation $meta_call_5_27(Prolog* m);

		static Operation $meta_call_5_28(Prolog* m);

		static Operation $meta_call_5_29(Prolog* m);

		static Operation $meta_call_5_30(Prolog* m);

		static Operation $meta_call_5_31(Prolog* m);

		static Operation $meta_call_5_32(Prolog* m);

		static Operation $meta_call_5_33(Prolog* m);

		static Operation $meta_call_5_34(Prolog* m);

		static Operation $meta_call_5_35(Prolog* m);

		static Operation $meta_call_5_36(Prolog* m);

		static Operation $meta_call_5_37(Prolog* m);

		/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/7
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_s1;

		// private final Term arg5, arg6, arg7;

	public:
		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_static_exec(Prolog* m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_sub_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_2(Prolog* m);

		/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/6
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_s1;

		// private final Term arg5, arg6;

	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec(Prolog* m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_2(Prolog* m);

		/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/6
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5, arg6;

	public:
		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec(Prolog* m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_2(Prolog* m);

		/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_s1;

	public:
		static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec(Prolog* m);

	private:
		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_sub_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_2(Prolog* m);

		/** PREDICATE: $meta_call/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$meta_call_4_s1;

	public:
		static Operation PRED_$meta_call_4_static_exec(Prolog* m);

	private:
		static Operation $meta_call_4_var(Prolog* m);

		static Operation $meta_call_4_var_1(Prolog* m);

		static Operation $meta_call_4_1(Prolog* m);

		static Operation $meta_call_4_2(Prolog* m);

		/** PREDICATE: $call_internal/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_$call_internal_5_static_exec(Prolog* m);

	private:
		static Operation $call_internal_5_sub_1(Prolog* m);

		static Operation $call_internal_5_1(Prolog* m);

		static Operation $call_internal_5_2(Prolog* m);

		/** PREDICATE: catch/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_catch_3_static_exec(Prolog* m);

		/** PREDICATE: throw/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_throw_1_static_exec(Prolog* m);

		/** PREDICATE: on_exception/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static StructureTerm* const  PRED_on_exception_3_s4;
	public:
		static IntegerTerm* const  int_2;

		static Operation PRED_on_exception_3_static_exec(Prolog* m);

	private:
		static Operation on_exception_3_sub_1(Prolog* m);

		static Operation on_exception_3_1(Prolog* m);

		static Operation on_exception_3_2(Prolog* m);

		/** PREDICATE: $on_exception/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$on_exception_3_s1;

	public:
		static Operation PRED_$on_exception_3_static_exec(Prolog* m);

	private:
		static Operation $on_exception_3_sub_1(Prolog* m);

		static Operation $on_exception_3_1(Prolog* m);

		static Operation $on_exception_3_2(Prolog* m);

		/** PREDICATE: $catch_and_throw/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$catch_and_throw_3_s1;

	public:
		static Operation PRED_$catch_and_throw_3_static_exec(Prolog* m);

	private:
		static Operation $catch_and_throw_3_sub_1(Prolog* m);

		static Operation $catch_and_throw_3_1(Prolog* m);

		static Operation $catch_and_throw_3_2(Prolog* m);

		/** PREDICATE: (=)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$003D_2_static_exec(Prolog* m);

		/** PREDICATE: $unify/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$unify_2_static_exec(Prolog* m);

		/** PREDICATE: (\=)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$005C$003D_2_static_exec(Prolog* m);

		/** PREDICATE: $not_unifiable/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$not_unifiable_2_static_exec(Prolog* m);

		/** PREDICATE: var/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_var_1_static_exec(Prolog* m);

		/** PREDICATE: atom/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_atom_1_static_exec(Prolog* m);

		/** PREDICATE: integer/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_integer_1_static_exec(Prolog* m);

		/** PREDICATE: long/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_long_1_static_exec(Prolog* m);

		/** PREDICATE: float/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_float_1_static_exec(Prolog* m);

		/** PREDICATE: atomic/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_atomic_1_static_exec(Prolog* m);

		/** PREDICATE: nonvar/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_nonvar_1_static_exec(Prolog* m);

		/** PREDICATE: number/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_number_1_static_exec(Prolog* m);

		/** PREDICATE: java/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_java_1_static_exec(Prolog* m);

		/** PREDICATE: java/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_java_2_static_exec(Prolog* m);

		/** PREDICATE: closure/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_closure_1_static_exec(Prolog* m);

		/** PREDICATE: ground/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_ground_1_static_exec(Prolog* m);

		/** PREDICATE: compound/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static IntegerTerm* const  PRED_compound_1_s1;

	public:
		static Operation PRED_compound_1_static_exec(Prolog* m);

		/** PREDICATE: callable/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_callable_1_static_exec(Prolog* m);

	private:
		static Operation callable_1_sub_1(Prolog* m);

		static Operation callable_1_sub_2(Prolog* m);

		static Operation callable_1_1(Prolog* m);

		static Operation callable_1_2(Prolog* m);

		static Operation callable_1_3(Prolog* m);

		/** PREDICATE: (==)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$003D$003D_2_static_exec(Prolog* m);

		/** PREDICATE: $equality_of_term/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$equality_of_term_2_static_exec(Prolog* m);

		/** PREDICATE: (\==)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$005C$003D$003D_2_static_exec(Prolog* m);

		/** PREDICATE: $inequality_of_term/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$inequality_of_term_2_static_exec(Prolog* m);

		/** PREDICATE: (@<)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$0040$003C_2_static_exec(Prolog* m);

		/** PREDICATE: $before/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$before_2_static_exec(Prolog* m);

		/** PREDICATE: (@>)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$0040$003E_2_static_exec(Prolog* m);

		/** PREDICATE: $after/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$after_2_static_exec(Prolog* m);

		/** PREDICATE: (@=<)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$0040$003D$003C_2_static_exec(Prolog* m);

		/** PREDICATE: $not_after/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$not_after_2_static_exec(Prolog* m);

		/** PREDICATE: (@>=)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$0040$003E$003D_2_static_exec(Prolog* m);

		/** PREDICATE: $not_before/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$not_before_2_static_exec(Prolog* m);

		/** PREDICATE: ?= / 2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$003F$003D_2_static_exec(Prolog* m);

		/** PREDICATE: $identical_or_cannot_unify/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$identical_or_cannot_unify_2_static_exec(Prolog* m);

		/** PREDICATE: compare/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_compare_3_static_exec(Prolog* m);

		/** PREDICATE: $map_compare_op/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static IntegerTerm* const  PRED_$map_compare_op_2_s1;
	public:
		static SymbolTerm* const  ATOM_unify;
		static SymbolTerm* const  ATOM_smallerthan;
		static SymbolTerm* const  ATOM_greaterthan;

		static Operation PRED_$map_compare_op_2_static_exec(Prolog* m);

	private:
		static Operation $map_compare_op_2_sub_1(Prolog* m);

		static Operation $map_compare_op_2_sub_2(Prolog* m);

		static Operation $map_compare_op_2_1(Prolog* m);

		static Operation $map_compare_op_2_2(Prolog* m);

		static Operation $map_compare_op_2_3(Prolog* m);

		/** PREDICATE: (=..)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$003D$002E$002E_2_static_exec(Prolog* m);

		/** PREDICATE: copy_term/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_copy_term_2_static_exec(Prolog* m);

		/** PREDICATE: (is)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_is_2_static_exec(Prolog* m);

		/** PREDICATE: $abs/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$abs_2_static_exec(Prolog* m);

		/** PREDICATE: $asin/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$asin_2_static_exec(Prolog* m);

		/** PREDICATE: $acos/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$acos_2_static_exec(Prolog* m);

		/** PREDICATE: $atan/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$atan_2_static_exec(Prolog* m);

		/** PREDICATE: $bitwise_conj/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$bitwise_conj_3_static_exec(Prolog* m);

		/** PREDICATE: $bitwise_disj/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$bitwise_disj_3_static_exec(Prolog* m);

		/** PREDICATE: $bitwise_exclusive_or/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$bitwise_exclusive_or_3_static_exec(Prolog* m);

		/** PREDICATE: $bitwise_neg/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$bitwise_neg_2_static_exec(Prolog* m);

		/** PREDICATE: $ceil/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$ceil_2_static_exec(Prolog* m);

		/** PREDICATE: $cos/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$cos_2_static_exec(Prolog* m);

		/** PREDICATE: $degrees/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$degrees_2_static_exec(Prolog* m);

		/** PREDICATE: $exp/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$exp_2_static_exec(Prolog* m);

		/** PREDICATE: $float/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$float_2_static_exec(Prolog* m);

		/** PREDICATE: $float_integer_part/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$float_integer_part_2_static_exec(Prolog* m);

		/** PREDICATE: $float_fractional_part/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$float_fractional_part_2_static_exec(Prolog* m);

		/** PREDICATE: $float_quotient/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$float_quotient_3_static_exec(Prolog* m);

		/** PREDICATE: $floor/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$floor_2_static_exec(Prolog* m);

		/** PREDICATE: $int_quotient/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$int_quotient_3_static_exec(Prolog* m);

		/** PREDICATE: $log/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$log_2_static_exec(Prolog* m);

		/** PREDICATE: $max/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$max_3_static_exec(Prolog* m);

		/** PREDICATE: $min/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$min_3_static_exec(Prolog* m);

		/** PREDICATE: $minus/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$minus_3_static_exec(Prolog* m);

		/** PREDICATE: $mod/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$mod_3_static_exec(Prolog* m);

		/** PREDICATE: $multi/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$multi_3_static_exec(Prolog* m);

		/** PREDICATE: $plus/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$plus_3_static_exec(Prolog* m);

		/** PREDICATE: $pow/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$pow_3_static_exec(Prolog* m);

		/** PREDICATE: $radians/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$radians_2_static_exec(Prolog* m);

		/** PREDICATE: $rint/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$rint_2_static_exec(Prolog* m);

		/** PREDICATE: $round/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$round_2_static_exec(Prolog* m);

		/** PREDICATE: $shift_left/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$shift_left_3_static_exec(Prolog* m);

		/** PREDICATE: $shift_right/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$shift_right_3_static_exec(Prolog* m);

		/** PREDICATE: $sign/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$sign_2_static_exec(Prolog* m);

		/** PREDICATE: $sin/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$sin_2_static_exec(Prolog* m);

		/** PREDICATE: $sqrt/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$sqrt_2_static_exec(Prolog* m);

		/** PREDICATE: $tan/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$tan_2_static_exec(Prolog* m);

		/** PREDICATE: $truncate/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$truncate_2_static_exec(Prolog* m);

		/** PREDICATE: (=:=)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$003D$003A$003D_2_static_exec(Prolog* m);

		/** PREDICATE: $arith_equal/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$arith_equal_2_static_exec(Prolog* m);

		/** PREDICATE: (=\=)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$003D$005C$003D_2_static_exec(Prolog* m);

		/** PREDICATE: $arith_not_equal/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$arith_not_equal_2_static_exec(Prolog* m);

		/** PREDICATE: (<)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$003C_2_static_exec(Prolog* m);

		/** PREDICATE: $less_than/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$less_than_2_static_exec(Prolog* m);

		/** PREDICATE: (=<)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$003D$003C_2_static_exec(Prolog* m);

		/** PREDICATE: $less_or_equal/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$less_or_equal_2_static_exec(Prolog* m);

		/** PREDICATE: (>)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$003E_2_static_exec(Prolog* m);

		/** PREDICATE: $greater_than/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$greater_than_2_static_exec(Prolog* m);

		/** PREDICATE: (>=)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$003E$003D_2_static_exec(Prolog* m);

		/** PREDICATE: $greater_or_equal/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$greater_or_equal_2_static_exec(Prolog* m);

		/** PREDICATE: clause/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  ATOM_access;
		static SymbolTerm* const  ATOM_private_procedure;

		static Operation PRED_clause_2_static_exec(Prolog* m);

		/** PREDICATE: $head_to_term/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  ATOM_user;

		static Operation PRED_$head_to_term_4_static_exec(Prolog* m);

		/** PREDICATE: $head_to_term/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$head_to_term_5_s1;
		static StructureTerm* const  PRED_$head_to_term_5_s7;

		// private final Term arg5;

	public:
		static Operation PRED_$head_to_term_5_static_exec(Prolog* m);

	private:
		static Operation $head_to_term_5_top(Prolog* m);

		static Operation $head_to_term_5_var(Prolog* m);

		static Operation $head_to_term_5_var_1(Prolog* m);

		static Operation $head_to_term_5_var_2(Prolog* m);

		static Operation $head_to_term_5_var_3(Prolog* m);

		static Operation $head_to_term_5_int(Prolog* m);

		static Operation $head_to_term_5_int_1(Prolog* m);

		static Operation $head_to_term_5_int_2(Prolog* m);

		static Operation $head_to_term_5_1(Prolog* m);

		static Operation $head_to_term_5_2(Prolog* m);

		static Operation $head_to_term_5_3(Prolog* m);

		static Operation $head_to_term_5_4(Prolog* m);

		/** PREDICATE: $new_internal_database/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$new_internal_database_1_static_exec(Prolog* m);

		/** PREDICATE: $new_internal_database/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$new_internal_database_2_static_exec(Prolog* m);

	private:
		static Operation $new_internal_database_2_sub_1(Prolog* m);

		static Operation $new_internal_database_2_1(Prolog* m);

		static Operation $new_internal_database_2_2(Prolog* m);

		/** PREDICATE: $init_internal_database/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$init_internal_database_1_s1;

	public:
		static Operation PRED_$init_internal_database_1_static_exec(Prolog* m);

	private:
		static Operation $init_internal_database_1_sub_1(Prolog* m);

		static Operation $init_internal_database_1_1(Prolog* m);

		static Operation $init_internal_database_1_2(Prolog* m);

		/** PREDICATE: $defined_internal_database/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$defined_internal_database_1_static_exec(Prolog* m);

		/** PREDICATE: $clause_internal/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5;

		static Operation PRED_$clause_internal_5_static_exec(Prolog* m);

		/** PREDICATE: $clause_internal0/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$clause_internal0_3_s1;

	public:
		static Operation PRED_$clause_internal0_3_static_exec(Prolog* m);

	private:
		static Operation $clause_internal0_3_var(Prolog* m);

		static Operation $clause_internal0_3_var_1(Prolog* m);

		static Operation $clause_internal0_3_var_2(Prolog* m);

		static Operation $clause_internal0_3_con(Prolog* m);

		static Operation $clause_internal0_3_con_1(Prolog* m);

		static Operation $clause_internal0_3_lis(Prolog* m);

		static Operation $clause_internal0_3_lis_1(Prolog* m);

		static Operation $clause_internal0_3_1(Prolog* m);

		static Operation $clause_internal0_3_2(Prolog* m);

		static Operation $clause_internal0_3_3(Prolog* m);

		/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_s1;

	public:
		static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog* m);

		/** PREDICATE: $get_indices/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$get_indices_4_static_exec(Prolog* m);

		/** PREDICATE: $new_indexing_hash/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$new_indexing_hash_3_s1;
	public:
		static SymbolTerm* const  ATOM_var;
		static SymbolTerm* const  ATOM_lis;
		static SymbolTerm* const  ATOM_str;

		static Operation PRED_$new_indexing_hash_3_static_exec(Prolog* m);

	private:
		static Operation $new_indexing_hash_3_sub_1(Prolog* m);

		static Operation $new_indexing_hash_3_1(Prolog* m);

		static Operation $new_indexing_hash_3_2(Prolog* m);

		/** PREDICATE: $calc_indexing_key/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$calc_indexing_key_2_s1;

	public:
		static Operation PRED_$calc_indexing_key_2_static_exec(Prolog* m);

	private:
		static Operation $calc_indexing_key_2_sub_1(Prolog* m);

		static Operation $calc_indexing_key_2_1(Prolog* m);

		static Operation $calc_indexing_key_2_2(Prolog* m);

		/** PREDICATE: $calc_indexing_key0/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$calc_indexing_key0_2_s1;
	public:
		static SymbolTerm* const  ATOM_term;
	private:
		static StructureTerm* const  PRED_$calc_indexing_key0_2_s7;

	public:
		static Operation PRED_$calc_indexing_key0_2_static_exec(Prolog* m);

	private:
		static Operation $calc_indexing_key0_2_sub_1(Prolog* m);

		static Operation $calc_indexing_key0_2_sub_2(Prolog* m);

		static Operation $calc_indexing_key0_2_sub_3(Prolog* m);

		static Operation $calc_indexing_key0_2_sub_4(Prolog* m);

		static Operation $calc_indexing_key0_2_1(Prolog* m);

		static Operation $calc_indexing_key0_2_2(Prolog* m);

		static Operation $calc_indexing_key0_2_3(Prolog* m);

		static Operation $calc_indexing_key0_2_4(Prolog* m);

		static Operation $calc_indexing_key0_2_5(Prolog* m);

		/** PREDICATE: $check_procedure_permission/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$check_procedure_permission_4_static_exec(Prolog* m);

	private:
		static Operation $check_procedure_permission_4_var(Prolog* m);

		static Operation $check_procedure_permission_4_var_1(Prolog* m);

		static Operation $check_procedure_permission_4_var_2(Prolog* m);

		static Operation $check_procedure_permission_4_1(Prolog* m);

		static Operation $check_procedure_permission_4_2(Prolog* m);

		static Operation $check_procedure_permission_4_3(Prolog* m);

		/** PREDICATE: (initialization)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_initialization_2_s1;

	public:
		static Operation PRED_initialization_2_static_exec(Prolog* m);

	private:
		static Operation initialization_2_var(Prolog* m);

		static Operation initialization_2_var_1(Prolog* m);

		static Operation initialization_2_1(Prolog* m);

		static Operation initialization_2_2(Prolog* m);

		/** PREDICATE: assert/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_assert_1_static_exec(Prolog* m);

		/** PREDICATE: assertz/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  ATOM_modify;
		static SymbolTerm* const  ATOM_static_procedure;
		static SymbolTerm* const  ATOM_z;

		static Operation PRED_assertz_1_static_exec(Prolog* m);

	private:
		static Operation assertz_1_sub_1(Prolog* m);

		static Operation assertz_1_1(Prolog* m);

		static Operation assertz_1_2(Prolog* m);

		/** PREDICATE: asserta/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	public:
		static SymbolTerm* const  ATOM_a;

		static Operation PRED_asserta_1_static_exec(Prolog* m);

	private:
		static Operation asserta_1_sub_1(Prolog* m);

		static Operation asserta_1_1(Prolog* m);

		static Operation asserta_1_2(Prolog* m);

		/** PREDICATE: abolish/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	public:
		static SymbolTerm* const  ATOM_all;

		static Operation PRED_abolish_1_static_exec(Prolog* m);

	private:
		static Operation abolish_1_sub_1(Prolog* m);

		static Operation abolish_1_1(Prolog* m);

		static Operation abolish_1_2(Prolog* m);

		/** PREDICATE: retract/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_retract_1_static_exec(Prolog* m);

		/** PREDICATE: retractall/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_retractall_1_static_exec(Prolog* m);

	private:
		static Operation retractall_1_sub_1(Prolog* m);

		static Operation retractall_1_1(Prolog* m);

		static Operation retractall_1_2(Prolog* m);

		/** PREDICATE: $term_to_clause/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$term_to_clause_4_static_exec(Prolog* m);

		/** PREDICATE: $term_to_clause/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$term_to_clause_5_s1;
	public:
		static SymbolTerm* const  ATOM_atom;
	private:
		static StructureTerm* const  PRED_$term_to_clause_5_s7;

		// private final Term arg5;

	public:
		static Operation PRED_$term_to_clause_5_static_exec(Prolog* m);

	private:
		static Operation $term_to_clause_5_top(Prolog* m);

		static Operation $term_to_clause_5_var(Prolog* m);

		static Operation $term_to_clause_5_var_1(Prolog* m);

		static Operation $term_to_clause_5_var_2(Prolog* m);

		static Operation $term_to_clause_5_var_3(Prolog* m);

		static Operation $term_to_clause_5_var_4(Prolog* m);

		static Operation $term_to_clause_5_var_5(Prolog* m);

		static Operation $term_to_clause_5_int(Prolog* m);

		static Operation $term_to_clause_5_int_1(Prolog* m);

		static Operation $term_to_clause_5_int_2(Prolog* m);

		static Operation $term_to_clause_5_int_3(Prolog* m);

		static Operation $term_to_clause_5_1(Prolog* m);

		static Operation $term_to_clause_5_2(Prolog* m);

		static Operation $term_to_clause_5_3(Prolog* m);

		static Operation $term_to_clause_5_4(Prolog* m);

		static Operation $term_to_clause_5_5(Prolog* m);

		static Operation $term_to_clause_5_6(Prolog* m);

		/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: $term_to_head/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_$term_to_head_4_s4;

	public:
		static Operation PRED_$term_to_head_4_static_exec(Prolog* m);

	private:
		static Operation $term_to_head_4_sub_1(Prolog* m);

		static Operation $term_to_head_4_sub_2(Prolog* m);

		static Operation $term_to_head_4_1(Prolog* m);

		static Operation $term_to_head_4_2(Prolog* m);

		static Operation $term_to_head_4_3(Prolog* m);

		/** PREDICATE: $term_to_body/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$term_to_body_4_static_exec(Prolog* m);

		/** PREDICATE: $localize_body/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$localize_body_3_static_exec(Prolog* m);

	private:
		static Operation $localize_body_3_top(Prolog* m);

		static Operation $localize_body_3_var(Prolog* m);

		static Operation $localize_body_3_var_1(Prolog* m);

		static Operation $localize_body_3_var_2(Prolog* m);

		static Operation $localize_body_3_var_3(Prolog* m);

		static Operation $localize_body_3_var_4(Prolog* m);

		static Operation $localize_body_3_var_5(Prolog* m);

		static Operation $localize_body_3_var_6(Prolog* m);

		static Operation $localize_body_3_var_7(Prolog* m);

		static Operation $localize_body_3_var_8(Prolog* m);

		static Operation $localize_body_3_var_9(Prolog* m);

		static Operation $localize_body_3_int(Prolog* m);

		static Operation $localize_body_3_int_1(Prolog* m);

		static Operation $localize_body_3_int_2(Prolog* m);

		static Operation $localize_body_3_int_3(Prolog* m);

		static Operation $localize_body_3_int_4(Prolog* m);

		static Operation $localize_body_3_int_5(Prolog* m);

		static Operation $localize_body_3_1(Prolog* m);

		static Operation $localize_body_3_2(Prolog* m);

		static Operation $localize_body_3_3(Prolog* m);

		static Operation $localize_body_3_4(Prolog* m);

		static Operation $localize_body_3_5(Prolog* m);

		static Operation $localize_body_3_6(Prolog* m);

		static Operation $localize_body_3_7(Prolog* m);

		static Operation $localize_body_3_8(Prolog* m);

		static Operation $localize_body_3_9(Prolog* m);

		static Operation $localize_body_3_10(Prolog* m);

		/** PREDICATE: $localize_args/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$localize_args_4_s1;
	public:
		static SymbolTerm* const  ATOM_module_colon;

		static Operation PRED_$localize_args_4_static_exec(Prolog* m);

	private:
		static Operation $localize_args_4_top(Prolog* m);

		static Operation $localize_args_4_var(Prolog* m);

		static Operation $localize_args_4_var_1(Prolog* m);

		static Operation $localize_args_4_var_2(Prolog* m);

		static Operation $localize_args_4_lis(Prolog* m);

		static Operation $localize_args_4_lis_1(Prolog* m);

		static Operation $localize_args_4_1(Prolog* m);

		static Operation $localize_args_4_2(Prolog* m);

		static Operation $localize_args_4_3(Prolog* m);

		/** PREDICATE: $dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog* m);

		/** PREDICATE: $builtin_meta_predicates/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$builtin_meta_predicates_3_s1;
	public:
		static SymbolTerm* const  ATOM_$003F;
	private:
		static ListTerm* const  PRED_$builtin_meta_predicates_3_s6;
		static ListTerm* const  PRED_$builtin_meta_predicates_3_s7;
	public:
		static SymbolTerm* const  ATOM_call;
		static SymbolTerm* const  ATOM_once;
		static SymbolTerm* const  ATOM_not;
		static SymbolTerm* const  ATOM_findall;
		static IntegerTerm* const  int_3;
	private:
		static ListTerm* const  PRED_$builtin_meta_predicates_3_s14;
		static ListTerm* const  PRED_$builtin_meta_predicates_3_s15;
		static ListTerm* const  PRED_$builtin_meta_predicates_3_s16;
	public:
		static SymbolTerm* const  ATOM_setof;
		static SymbolTerm* const  ATOM_bagof;
		static SymbolTerm* const  ATOM_on_exception;
	private:
		static ListTerm* const  PRED_$builtin_meta_predicates_3_s20;
		static ListTerm* const  PRED_$builtin_meta_predicates_3_s21;
	public:
		static SymbolTerm* const  ATOM_catch;
	private:
		static ListTerm* const  PRED_$builtin_meta_predicates_3_s23;
	public:
		static SymbolTerm* const  ATOM_synchronized;
		static SymbolTerm* const  ATOM_freeze;

		static Operation PRED_$builtin_meta_predicates_3_static_exec(Prolog* m);

	private:
		static Operation $builtin_meta_predicates_3_var(Prolog* m);

		static Operation $builtin_meta_predicates_3_var_1(Prolog* m);

		static Operation $builtin_meta_predicates_3_var_2(Prolog* m);

		static Operation $builtin_meta_predicates_3_var_3(Prolog* m);

		static Operation $builtin_meta_predicates_3_var_4(Prolog* m);

		static Operation $builtin_meta_predicates_3_var_5(Prolog* m);

		static Operation $builtin_meta_predicates_3_var_6(Prolog* m);

		static Operation $builtin_meta_predicates_3_var_7(Prolog* m);

		static Operation $builtin_meta_predicates_3_var_8(Prolog* m);

		static Operation $builtin_meta_predicates_3_var_9(Prolog* m);

		static Operation $builtin_meta_predicates_3_var_10(Prolog* m);

		static Operation $builtin_meta_predicates_3_1(Prolog* m);

		static Operation $builtin_meta_predicates_3_2(Prolog* m);

		static Operation $builtin_meta_predicates_3_3(Prolog* m);

		static Operation $builtin_meta_predicates_3_4(Prolog* m);

		static Operation $builtin_meta_predicates_3_5(Prolog* m);

		static Operation $builtin_meta_predicates_3_6(Prolog* m);

		static Operation $builtin_meta_predicates_3_7(Prolog* m);

		static Operation $builtin_meta_predicates_3_8(Prolog* m);

		static Operation $builtin_meta_predicates_3_9(Prolog* m);

		static Operation $builtin_meta_predicates_3_10(Prolog* m);

		static Operation $builtin_meta_predicates_3_11(Prolog* m);

		/** PREDICATE: $clause_to_term/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$clause_to_term_4_static_exec(Prolog* m);

		/** PREDICATE: $clause_to_term/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$clause_to_term_5_s1;
		static StructureTerm* const  PRED_$clause_to_term_5_s7;

		// private final Term arg5;

	public:
		static Operation PRED_$clause_to_term_5_static_exec(Prolog* m);

	private:
		static Operation $clause_to_term_5_top(Prolog* m);

		static Operation $clause_to_term_5_var(Prolog* m);

		static Operation $clause_to_term_5_var_1(Prolog* m);

		static Operation $clause_to_term_5_var_2(Prolog* m);

		static Operation $clause_to_term_5_var_3(Prolog* m);

		static Operation $clause_to_term_5_var_4(Prolog* m);

		static Operation $clause_to_term_5_var_5(Prolog* m);

		static Operation $clause_to_term_5_int(Prolog* m);

		static Operation $clause_to_term_5_int_1(Prolog* m);

		static Operation $clause_to_term_5_int_2(Prolog* m);

		static Operation $clause_to_term_5_int_3(Prolog* m);

		static Operation $clause_to_term_5_1(Prolog* m);

		static Operation $clause_to_term_5_2(Prolog* m);

		static Operation $clause_to_term_5_3(Prolog* m);

		static Operation $clause_to_term_5_4(Prolog* m);

		static Operation $clause_to_term_5_5(Prolog* m);

		static Operation $clause_to_term_5_6(Prolog* m);

		/** PREDICATE: $dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: $term_to_predicateindicator/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$term_to_predicateindicator_3_static_exec(Prolog* m);

		/** PREDICATE: $term_to_predicateindicator/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$term_to_predicateindicator_5_s1;
	public:
		static SymbolTerm* const  ATOM_predicate_indicator;
	private:
		static StructureTerm* const  PRED_$term_to_predicateindicator_5_s8;
		static StructureTerm* const  PRED_$term_to_predicateindicator_5_s11;
	public:
		static SymbolTerm* const  ATOM_integer;
	private:
		static StructureTerm* const  PRED_$term_to_predicateindicator_5_s14;

		// private final Term arg5;

	public:
		static Operation PRED_$term_to_predicateindicator_5_static_exec(Prolog* m);

	private:
		static Operation $term_to_predicateindicator_5_top(Prolog* m);

		static Operation $term_to_predicateindicator_5_var(Prolog* m);

		static Operation $term_to_predicateindicator_5_var_1(Prolog* m);

		static Operation $term_to_predicateindicator_5_var_2(Prolog* m);

		static Operation $term_to_predicateindicator_5_var_3(Prolog* m);

		static Operation $term_to_predicateindicator_5_var_4(Prolog* m);

		static Operation $term_to_predicateindicator_5_var_5(Prolog* m);

		static Operation $term_to_predicateindicator_5_var_6(Prolog* m);

		static Operation $term_to_predicateindicator_5_int(Prolog* m);

		static Operation $term_to_predicateindicator_5_int_1(Prolog* m);

		static Operation $term_to_predicateindicator_5_int_2(Prolog* m);

		static Operation $term_to_predicateindicator_5_int_3(Prolog* m);

		static Operation $term_to_predicateindicator_5_1(Prolog* m);

		static Operation $term_to_predicateindicator_5_2(Prolog* m);

		static Operation $term_to_predicateindicator_5_3(Prolog* m);

		static Operation $term_to_predicateindicator_5_4(Prolog* m);

		static Operation $term_to_predicateindicator_5_5(Prolog* m);

		static Operation $term_to_predicateindicator_5_6(Prolog* m);

		static Operation $term_to_predicateindicator_5_7(Prolog* m);

		/** PREDICATE: $dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: $dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: $update_indexing/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_$update_indexing_5_static_exec(Prolog* m);

		/** PREDICATE: $gen_indexing_keys/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static ListTerm* const  PRED_$gen_indexing_keys_3_s4;

	public:
		static Operation PRED_$gen_indexing_keys_3_static_exec(Prolog* m);

	private:
		static Operation $gen_indexing_keys_3_var(Prolog* m);

		static Operation $gen_indexing_keys_3_var_1(Prolog* m);

		static Operation $gen_indexing_keys_3_1(Prolog* m);

		static Operation $gen_indexing_keys_3_2(Prolog* m);

		/** PREDICATE: $gen_indexing_keys0/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$gen_indexing_keys0_3_s1;
		static ListTerm* const  PRED_$gen_indexing_keys0_3_s4;
		static ListTerm* const  PRED_$gen_indexing_keys0_3_s5;
		static ListTerm* const  PRED_$gen_indexing_keys0_3_s7;
		static ListTerm* const  PRED_$gen_indexing_keys0_3_s8;
		static StructureTerm* const  PRED_$gen_indexing_keys0_3_s12;

	public:
		static Operation PRED_$gen_indexing_keys0_3_static_exec(Prolog* m);

	private:
		static Operation $gen_indexing_keys0_3_sub_1(Prolog* m);

		static Operation $gen_indexing_keys0_3_sub_2(Prolog* m);

		static Operation $gen_indexing_keys0_3_sub_3(Prolog* m);

		static Operation $gen_indexing_keys0_3_sub_4(Prolog* m);

		static Operation $gen_indexing_keys0_3_1(Prolog* m);

		static Operation $gen_indexing_keys0_3_2(Prolog* m);

		static Operation $gen_indexing_keys0_3_3(Prolog* m);

		static Operation $gen_indexing_keys0_3_4(Prolog* m);

		static Operation $gen_indexing_keys0_3_5(Prolog* m);

		/** PREDICATE: $dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_s1;

	public:
		static Operation PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog* m);

		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog* m);

		/** PREDICATE: $update_indexing_hash/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$update_indexing_hash_4_s1;

	public:
		static Operation PRED_$update_indexing_hash_4_static_exec(Prolog* m);

	private:
		static Operation $update_indexing_hash_4_var(Prolog* m);

		static Operation $update_indexing_hash_4_var_1(Prolog* m);

		static Operation $update_indexing_hash_4_1(Prolog* m);

		static Operation $update_indexing_hash_4_2(Prolog* m);

		/** PREDICATE: $hash_adda_all/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$hash_adda_all_3_s1;

	public:
		static Operation PRED_$hash_adda_all_3_static_exec(Prolog* m);

	private:
		static Operation $hash_adda_all_3_var(Prolog* m);

		static Operation $hash_adda_all_3_var_1(Prolog* m);

		static Operation $hash_adda_all_3_1(Prolog* m);

		static Operation $hash_adda_all_3_2(Prolog* m);

		/** PREDICATE: $hash_addz_all/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$hash_addz_all_3_s1;

	public:
		static Operation PRED_$hash_addz_all_3_static_exec(Prolog* m);

	private:
		static Operation $hash_addz_all_3_var(Prolog* m);

		static Operation $hash_addz_all_3_var_1(Prolog* m);

		static Operation $hash_addz_all_3_1(Prolog* m);

		static Operation $hash_addz_all_3_2(Prolog* m);

		/** PREDICATE: $erase_all/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$erase_all_1_s1;

	public:
		static Operation PRED_$erase_all_1_static_exec(Prolog* m);

	private:
		static Operation $erase_all_1_var(Prolog* m);

		static Operation $erase_all_1_var_1(Prolog* m);

		static Operation $erase_all_1_1(Prolog* m);

		static Operation $erase_all_1_2(Prolog* m);

		/** PREDICATE: $rehash_indexing/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$rehash_indexing_3_static_exec(Prolog* m);

		/** PREDICATE: $remove_index_all/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$remove_index_all_3_s1;

	public:
		static Operation PRED_$remove_index_all_3_static_exec(Prolog* m);

	private:
		static Operation $remove_index_all_3_var(Prolog* m);

		static Operation $remove_index_all_3_var_1(Prolog* m);

		static Operation $remove_index_all_3_1(Prolog* m);

		static Operation $remove_index_all_3_2(Prolog* m);

		/** PREDICATE: findall/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_findall_3_s4;

	public:
		static Operation PRED_findall_3_static_exec(Prolog* m);

	private:
		static Operation findall_3_sub_1(Prolog* m);

		static Operation findall_3_1(Prolog* m);

		static Operation findall_3_2(Prolog* m);

		/** PREDICATE: $findall/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	public:
		static SymbolTerm* const  ATOM_$0024FINDALL;

		static Operation PRED_$findall_4_static_exec(Prolog* m);

	private:
		static Operation $findall_4_sub_1(Prolog* m);

		static Operation $findall_4_1(Prolog* m);

		static Operation $findall_4_2(Prolog* m);

		/** PREDICATE: bagof/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_bagof_3_s4;

	public:
		static Operation PRED_bagof_3_static_exec(Prolog* m);

	private:
		static Operation bagof_3_sub_1(Prolog* m);

		static Operation bagof_3_1(Prolog* m);

		static Operation bagof_3_2(Prolog* m);

		/** PREDICATE: setof/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_setof_3_s4;

	public:
		static Operation PRED_setof_3_static_exec(Prolog* m);

	private:
		static Operation setof_3_sub_1(Prolog* m);

		static Operation setof_3_1(Prolog* m);

		static Operation setof_3_2(Prolog* m);

		/** PREDICATE: $bagof/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$bagof_3_s1;
	public:
		static SymbolTerm* const  ATOM_$0024witness;

		static Operation PRED_$bagof_3_static_exec(Prolog* m);

	private:
		static Operation $bagof_3_sub_1(Prolog* m);

		static Operation $bagof_3_1(Prolog* m);

		static Operation $bagof_3_2(Prolog* m);

		/** PREDICATE: $bagof_instances/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$bagof_instances_3_s1;

	public:
		static Operation PRED_$bagof_instances_3_static_exec(Prolog* m);

	private:
		static Operation $bagof_instances_3_var(Prolog* m);

		static Operation $bagof_instances_3_var_1(Prolog* m);

		static Operation $bagof_instances_3_1(Prolog* m);

		static Operation $bagof_instances_3_2(Prolog* m);

		/** PREDICATE: $bagof_instances0/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_$bagof_instances0_5_static_exec(Prolog* m);

	private:
		static Operation $bagof_instances0_5_sub_1(Prolog* m);

		static Operation $bagof_instances0_5_1(Prolog* m);

		static Operation $bagof_instances0_5_2(Prolog* m);

		/** PREDICATE: $variants_subset/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$variants_subset_5_s1;

		// private final Term arg5;

	public:
		static Operation PRED_$variants_subset_5_static_exec(Prolog* m);

	private:
		static Operation $variants_subset_5_top(Prolog* m);

		static Operation $variants_subset_5_var(Prolog* m);

		static Operation $variants_subset_5_var_1(Prolog* m);

		static Operation $variants_subset_5_var_2(Prolog* m);

		static Operation $variants_subset_5_lis(Prolog* m);

		static Operation $variants_subset_5_lis_1(Prolog* m);

		static Operation $variants_subset_5_1(Prolog* m);

		static Operation $variants_subset_5_2(Prolog* m);

		static Operation $variants_subset_5_3(Prolog* m);

		/** PREDICATE: $term_variant/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$term_variant_2_static_exec(Prolog* m);

		/** PREDICATE: $dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec(Prolog* m);

	private:
		static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_sub_1(Prolog* m);

		static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_1(Prolog* m);

		static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_2(Prolog* m);

		/** PREDICATE: $term_variant/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$term_variant_3_static_exec(Prolog* m);

	private:
		static Operation $term_variant_3_top(Prolog* m);

		static Operation $term_variant_3_var(Prolog* m);

		static Operation $term_variant_3_var_1(Prolog* m);

		static Operation $term_variant_3_var_2(Prolog* m);

		static Operation $term_variant_3_var_3(Prolog* m);

		static Operation $term_variant_3_var_4(Prolog* m);

		static Operation $term_variant_3_int(Prolog* m);

		static Operation $term_variant_3_int_1(Prolog* m);

		static Operation $term_variant_3_int_2(Prolog* m);

		static Operation $term_variant_3_int_3(Prolog* m);

		static Operation $term_variant_3_1(Prolog* m);

		static Operation $term_variant_3_2(Prolog* m);

		static Operation $term_variant_3_3(Prolog* m);

		static Operation $term_variant_3_4(Prolog* m);

		static Operation $term_variant_3_5(Prolog* m);

		/** PREDICATE: $unify_witness/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$unify_witness_2_s1;

	public:
		static Operation PRED_$unify_witness_2_static_exec(Prolog* m);

	private:
		static Operation $unify_witness_2_top(Prolog* m);

		static Operation $unify_witness_2_var(Prolog* m);

		static Operation $unify_witness_2_var_1(Prolog* m);

		static Operation $unify_witness_2_1(Prolog* m);

		static Operation $unify_witness_2_2(Prolog* m);

		/** PREDICATE: $variables_set/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$variables_set_2_s1;

	public:
		static Operation PRED_$variables_set_2_static_exec(Prolog* m);

		/** PREDICATE: $variables_set/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$variables_set_3_static_exec(Prolog* m);

	private:
		static Operation $variables_set_3_top(Prolog* m);

		static Operation $variables_set_3_var(Prolog* m);

		static Operation $variables_set_3_var_1(Prolog* m);

		static Operation $variables_set_3_var_2(Prolog* m);

		static Operation $variables_set_3_var_3(Prolog* m);

		static Operation $variables_set_3_var_4(Prolog* m);

		static Operation $variables_set_3_int(Prolog* m);

		static Operation $variables_set_3_int_1(Prolog* m);

		static Operation $variables_set_3_int_2(Prolog* m);

		static Operation $variables_set_3_int_3(Prolog* m);

		static Operation $variables_set_3_1(Prolog* m);

		static Operation $variables_set_3_2(Prolog* m);

		static Operation $variables_set_3_3(Prolog* m);

		static Operation $variables_set_3_4(Prolog* m);

		static Operation $variables_set_3_5(Prolog* m);

		/** PREDICATE: $builtin_memq/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$builtin_memq_2_static_exec(Prolog* m);

	private:
		static Operation $builtin_memq_2_top(Prolog* m);

		static Operation $builtin_memq_2_sub_1(Prolog* m);

		static Operation $builtin_memq_2_1(Prolog* m);

		static Operation $builtin_memq_2_2(Prolog* m);

		/** PREDICATE: $existential_variables_set/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$existential_variables_set_2_s1;

	public:
		static Operation PRED_$existential_variables_set_2_static_exec(Prolog* m);

		/** PREDICATE: $existential_variables_set/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$existential_variables_set_3_static_exec(Prolog* m);

	private:
		static Operation $existential_variables_set_3_top(Prolog* m);

		static Operation $existential_variables_set_3_var(Prolog* m);

		static Operation $existential_variables_set_3_var_1(Prolog* m);

		static Operation $existential_variables_set_3_var_2(Prolog* m);

		static Operation $existential_variables_set_3_var_3(Prolog* m);

		static Operation $existential_variables_set_3_var_4(Prolog* m);

		static Operation $existential_variables_set_3_var_5(Prolog* m);

		static Operation $existential_variables_set_3_int(Prolog* m);

		static Operation $existential_variables_set_3_int_1(Prolog* m);

		static Operation $existential_variables_set_3_int_2(Prolog* m);

		static Operation $existential_variables_set_3_1(Prolog* m);

		static Operation $existential_variables_set_3_2(Prolog* m);

		static Operation $existential_variables_set_3_3(Prolog* m);

		static Operation $existential_variables_set_3_4(Prolog* m);

		static Operation $existential_variables_set_3_5(Prolog* m);

		static Operation $existential_variables_set_3_6(Prolog* m);

		/** PREDICATE: $free_variables_set/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$free_variables_set_3_static_exec(Prolog* m);

		/** PREDICATE: $builtin_set_diff/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$builtin_set_diff_3_static_exec(Prolog* m);

		/** PREDICATE: $builtin_set_diff0/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$builtin_set_diff0_3_s1;

	public:
		static Operation PRED_$builtin_set_diff0_3_static_exec(Prolog* m);

	private:
		static Operation $builtin_set_diff0_3_top(Prolog* m);

		static Operation $builtin_set_diff0_3_var(Prolog* m);

		static Operation $builtin_set_diff0_3_var_1(Prolog* m);

		static Operation $builtin_set_diff0_3_var_2(Prolog* m);

		static Operation $builtin_set_diff0_3_var_3(Prolog* m);

		static Operation $builtin_set_diff0_3_var_4(Prolog* m);

		static Operation $builtin_set_diff0_3_con(Prolog* m);

		static Operation $builtin_set_diff0_3_con_1(Prolog* m);

		static Operation $builtin_set_diff0_3_lis(Prolog* m);

		static Operation $builtin_set_diff0_3_lis_1(Prolog* m);

		static Operation $builtin_set_diff0_3_lis_2(Prolog* m);

		static Operation $builtin_set_diff0_3_lis_3(Prolog* m);

		static Operation $builtin_set_diff0_3_1(Prolog* m);

		static Operation $builtin_set_diff0_3_2(Prolog* m);

		static Operation $builtin_set_diff0_3_3(Prolog* m);

		static Operation $builtin_set_diff0_3_4(Prolog* m);

		static Operation $builtin_set_diff0_3_5(Prolog* m);

		/** PREDICATE: read/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_read_1_static_exec(Prolog* m);

		/** PREDICATE: read/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_read_2_static_exec(Prolog* m);

		/** PREDICATE: read_with_variables/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_read_with_variables_2_static_exec(Prolog* m);

		/** PREDICATE: read_with_variables/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_read_with_variables_3_static_exec(Prolog* m);

		/** PREDICATE: read_line/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_read_line_1_static_exec(Prolog* m);

		/** PREDICATE: read_token/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_read_token_2_s1;

	public:
		static Operation PRED_read_token_2_static_exec(Prolog* m);

		/** PREDICATE: $read_token1/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static IntegerTerm* const  PRED_$read_token1_3_s1;
		static ListTerm* const  PRED_$read_token1_3_s3;
	public:
		static IntegerTerm* const  int_73;
	private:
		static ListTerm* const  PRED_$read_token1_3_s6;
	public:
		static IntegerTerm* const  int_76;
	private:
		static ListTerm* const  PRED_$read_token1_3_s9;
	public:
		static IntegerTerm* const  int_68;
	private:
		static ListTerm* const  PRED_$read_token1_3_s11;
	public:
		static IntegerTerm* const  int_65;
	private:
		static ListTerm* const  PRED_$read_token1_3_s13;
	public:
		static IntegerTerm* const  int_86;
	private:
		static ListTerm* const  PRED_$read_token1_3_s16;
	public:
		static IntegerTerm* const  int_83;
	private:
		static ListTerm* const  PRED_$read_token1_3_s19;

	public:
		static Operation PRED_$read_token1_3_static_exec(Prolog* m);

	private:
		static Operation $read_token1_3_var(Prolog* m);

		static Operation $read_token1_3_var_1(Prolog* m);

		static Operation $read_token1_3_var_2(Prolog* m);

		static Operation $read_token1_3_var_3(Prolog* m);

		static Operation $read_token1_3_var_4(Prolog* m);

		static Operation $read_token1_3_var_5(Prolog* m);

		static Operation $read_token1_3_var_6(Prolog* m);

		static Operation $read_token1_3_var_7(Prolog* m);

		static Operation $read_token1_3_1(Prolog* m);

		static Operation $read_token1_3_2(Prolog* m);

		static Operation $read_token1_3_3(Prolog* m);

		static Operation $read_token1_3_4(Prolog* m);

		static Operation $read_token1_3_5(Prolog* m);

		static Operation $read_token1_3_6(Prolog* m);

		static Operation $read_token1_3_7(Prolog* m);

		static Operation $read_token1_3_8(Prolog* m);

		/** PREDICATE: read_tokens/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_read_tokens_3_s1;

	public:
		static Operation PRED_read_tokens_3_static_exec(Prolog* m);

		/** PREDICATE: $read_tokens/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$read_tokens_4_static_exec(Prolog* m);

		/** PREDICATE: $read_tokens1/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  ATOM_user_error;
		static SymbolTerm* const  ATOM_$007BSYNTAX$0020ERROR$007D;
		static SymbolTerm* const  ATOM_$002A$002A$0020;
		static SymbolTerm* const  ATOM_$0020$002A$002A;
		static SymbolTerm* const  ATOM_end_of_file;
		static SymbolTerm* const  ATOM_$002E;
	private:
		static ListTerm* const  PRED_$read_tokens1_5_s9;
		static ListTerm* const  PRED_$read_tokens1_5_s10;
	public:
		static SymbolTerm* const  ATOM__;
	private:
		static StructureTerm* const  PRED_$read_tokens1_5_s14;

		// private final Term arg5;

	public:
		static Operation PRED_$read_tokens1_5_static_exec(Prolog* m);

	private:
		static Operation $read_tokens1_5_sub_1(Prolog* m);

		static Operation $read_tokens1_5_sub_2(Prolog* m);

		static Operation $read_tokens1_5_sub_3(Prolog* m);

		static Operation $read_tokens1_5_sub_4(Prolog* m);

		static Operation $read_tokens1_5_sub_5(Prolog* m);

		static Operation $read_tokens1_5_sub_6(Prolog* m);

		static Operation $read_tokens1_5_1(Prolog* m);

		static Operation $read_tokens1_5_2(Prolog* m);

		static Operation $read_tokens1_5_3(Prolog* m);

		static Operation $read_tokens1_5_4(Prolog* m);

		static Operation $read_tokens1_5_5(Prolog* m);

		static Operation $read_tokens1_5_6(Prolog* m);

		static Operation $read_tokens1_5_7(Prolog* m);

		/** PREDICATE: $mem_pair/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$mem_pair_2_static_exec(Prolog* m);

	private:
		static Operation $mem_pair_2_top(Prolog* m);

		static Operation $mem_pair_2_var(Prolog* m);

		static Operation $mem_pair_2_var_1(Prolog* m);

		static Operation $mem_pair_2_1(Prolog* m);

		static Operation $mem_pair_2_2(Prolog* m);

		/** PREDICATE: $read_tokens_until_fullstop/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$read_tokens_until_fullstop_1_static_exec(Prolog* m);

		/** PREDICATE: $read_tokens_until_fullstop/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$read_tokens_until_fullstop_2_s1;

	public:
		static Operation PRED_$read_tokens_until_fullstop_2_static_exec(Prolog* m);

	private:
		static Operation $read_tokens_until_fullstop_2_sub_1(Prolog* m);

		static Operation $read_tokens_until_fullstop_2_sub_2(Prolog* m);

		static Operation $read_tokens_until_fullstop_2_1(Prolog* m);

		static Operation $read_tokens_until_fullstop_2_2(Prolog* m);

		static Operation $read_tokens_until_fullstop_2_3(Prolog* m);

		/** PREDICATE: parse_tokens/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	public:
		static IntegerTerm* const  int_1201;
	private:
		static ListTerm* const  PRED_parse_tokens_2_s7;

	public:
		static Operation PRED_parse_tokens_2_static_exec(Prolog* m);

		/** PREDICATE: $parse_tokens/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$parse_tokens_4_static_exec(Prolog* m);

		/** PREDICATE: $parse_tokens1/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$parse_tokens1_5_s1;
	public:
		static SymbolTerm* const  ATOM_start;
		static SymbolTerm* const  ATOM_an;
		static SymbolTerm* const  ATOM_expression;
	private:
		static ListTerm* const  PRED_$parse_tokens1_5_s6;
		static ListTerm* const  PRED_$parse_tokens1_5_s7;
		static ListTerm* const  PRED_$parse_tokens1_5_s8;
		static ListTerm* const  PRED_$parse_tokens1_5_s9;

		// private final Term arg5;

	public:
		static Operation PRED_$parse_tokens1_5_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens1_5_sub_1(Prolog* m);

		static Operation $parse_tokens1_5_1(Prolog* m);

		static Operation $parse_tokens1_5_2(Prolog* m);

		/** PREDICATE: $parse_tokens2/7
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens2_7_s1;
	public:
		static SymbolTerm* const  ATOM_expected;
		static SymbolTerm* const  ATOM_after;
	private:
		static ListTerm* const  PRED_$parse_tokens2_7_s6;
		static ListTerm* const  PRED_$parse_tokens2_7_s7;
		static ListTerm* const  PRED_$parse_tokens2_7_s8;
		static ListTerm* const  PRED_$parse_tokens2_7_s9;

		// private final Term arg5, arg6, arg7;

	public:
		static Operation PRED_$parse_tokens2_7_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens2_7_sub_1(Prolog* m);

		static Operation $parse_tokens2_7_sub_2(Prolog* m);

		static Operation $parse_tokens2_7_1(Prolog* m);

		static Operation $parse_tokens2_7_2(Prolog* m);

		static Operation $parse_tokens2_7_3(Prolog* m);

		/** PREDICATE: $parse_tokens_before_op/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_before_op_5_s1;
	public:
		static SymbolTerm* const  ATOM_$002D;
	private:
		static StructureTerm* const  PRED_$parse_tokens_before_op_5_s8;
	public:
		static SymbolTerm* const  ATOM_$0028;
		static SymbolTerm* const  ATOM_$0029;
		static SymbolTerm* const  ATOM_$007B;
		static SymbolTerm* const  ATOM_$005B;
		static SymbolTerm* const  ATOM_fx;
		static SymbolTerm* const  ATOM_fy;

		// private final Term arg5;

		static Operation PRED_$parse_tokens_before_op_5_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_before_op_5_top(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_1(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_2(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_3(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_4(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_5(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_6(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_7(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_8(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_9(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_10(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_11(Prolog* m);

		static Operation $parse_tokens_before_op_5_sub_12(Prolog* m);

		static Operation $parse_tokens_before_op_5_1(Prolog* m);

		static Operation $parse_tokens_before_op_5_2(Prolog* m);

		static Operation $parse_tokens_before_op_5_3(Prolog* m);

		static Operation $parse_tokens_before_op_5_4(Prolog* m);

		static Operation $parse_tokens_before_op_5_5(Prolog* m);

		static Operation $parse_tokens_before_op_5_6(Prolog* m);

		static Operation $parse_tokens_before_op_5_7(Prolog* m);

		static Operation $parse_tokens_before_op_5_8(Prolog* m);

		static Operation $parse_tokens_before_op_5_9(Prolog* m);

		static Operation $parse_tokens_before_op_5_10(Prolog* m);

		static Operation $parse_tokens_before_op_5_11(Prolog* m);

		static Operation $parse_tokens_before_op_5_12(Prolog* m);

		static Operation $parse_tokens_before_op_5_13(Prolog* m);

		/** PREDICATE: $dummy_12_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: $dummy_13_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: $parse_tokens_brace/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_brace_3_s1;
	public:
		static SymbolTerm* const  ATOM_$007D;

		static Operation PRED_$parse_tokens_brace_3_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_brace_3_var(Prolog* m);

		static Operation $parse_tokens_brace_3_var_1(Prolog* m);

		static Operation $parse_tokens_brace_3_1(Prolog* m);

		static Operation $parse_tokens_brace_3_2(Prolog* m);

		/** PREDICATE: $parse_tokens_list/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_list_3_s1;
	public:
		static SymbolTerm* const  ATOM_$005D;
		static IntegerTerm* const  int_999;

		static Operation PRED_$parse_tokens_list_3_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_list_3_var(Prolog* m);

		static Operation $parse_tokens_list_3_var_1(Prolog* m);

		static Operation $parse_tokens_list_3_1(Prolog* m);

		static Operation $parse_tokens_list_3_2(Prolog* m);

		/** PREDICATE: $parse_tokens_list_rest/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_list_rest_3_s1;
	public:
		static SymbolTerm* const  ATOM_$002C;
		static SymbolTerm* const  ATOM_Nil;

		static Operation PRED_$parse_tokens_list_rest_3_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_list_rest_3_var(Prolog* m);

		static Operation $parse_tokens_list_rest_3_var_1(Prolog* m);

		static Operation $parse_tokens_list_rest_3_var_2(Prolog* m);

		static Operation $parse_tokens_list_rest_3_con(Prolog* m);

		static Operation $parse_tokens_list_rest_3_con_1(Prolog* m);

		static Operation $parse_tokens_list_rest_3_lis(Prolog* m);

		static Operation $parse_tokens_list_rest_3_lis_1(Prolog* m);

		static Operation $parse_tokens_list_rest_3_1(Prolog* m);

		static Operation $parse_tokens_list_rest_3_2(Prolog* m);

		static Operation $parse_tokens_list_rest_3_3(Prolog* m);

		/** PREDICATE: $parse_tokens_args/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_args_3_s1;

	public:
		static Operation PRED_$parse_tokens_args_3_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_args_3_var(Prolog* m);

		static Operation $parse_tokens_args_3_var_1(Prolog* m);

		static Operation $parse_tokens_args_3_1(Prolog* m);

		static Operation $parse_tokens_args_3_2(Prolog* m);

		/** PREDICATE: $parse_tokens_args_rest/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_args_rest_3_s1;

	public:
		static Operation PRED_$parse_tokens_args_rest_3_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_args_rest_3_var(Prolog* m);

		static Operation $parse_tokens_args_rest_3_var_1(Prolog* m);

		static Operation $parse_tokens_args_rest_3_1(Prolog* m);

		static Operation $parse_tokens_args_rest_3_2(Prolog* m);

		/** PREDICATE: $parse_tokens_post_in_ops/7
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5, arg6, arg7;

	public:
		static Operation PRED_$parse_tokens_post_in_ops_7_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_post_in_ops_7_sub_1(Prolog* m);

		static Operation $parse_tokens_post_in_ops_7_1(Prolog* m);

		static Operation $parse_tokens_post_in_ops_7_2(Prolog* m);

		/** PREDICATE: $parse_tokens_op/8
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_op_8_s1;
		static StructureTerm* const  PRED_$parse_tokens_op_8_s4;
	public:
		static SymbolTerm* const  ATOM_$007C;
		static SymbolTerm* const  ATOM_or;
	private:
		static StructureTerm* const  PRED_$parse_tokens_op_8_s8;
	public:
		static SymbolTerm* const  ATOM_xf;
		static SymbolTerm* const  ATOM_yf;
		static SymbolTerm* const  ATOM_xfx;
		static SymbolTerm* const  ATOM_xfy;
		static SymbolTerm* const  ATOM_yfx;

		// private final Term arg5, arg6, arg7, arg8;

		static Operation PRED_$parse_tokens_op_8_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_op_8_top(Prolog* m);

		static Operation $parse_tokens_op_8_var(Prolog* m);

		static Operation $parse_tokens_op_8_var_1(Prolog* m);

		static Operation $parse_tokens_op_8_var_2(Prolog* m);

		static Operation $parse_tokens_op_8_var_3(Prolog* m);

		static Operation $parse_tokens_op_8_var_4(Prolog* m);

		static Operation $parse_tokens_op_8_var_5(Prolog* m);

		static Operation $parse_tokens_op_8_var_6(Prolog* m);

		static Operation $parse_tokens_op_8_con(Prolog* m);

		static Operation $parse_tokens_op_8_con_1(Prolog* m);

		static Operation $parse_tokens_op_8_str(Prolog* m);

		static Operation $parse_tokens_op_8_str_1(Prolog* m);

		static Operation $parse_tokens_op_8_str_2(Prolog* m);

		static Operation $parse_tokens_op_8_str_3(Prolog* m);

		static Operation $parse_tokens_op_8_str_4(Prolog* m);

		static Operation $parse_tokens_op_8_1(Prolog* m);

		static Operation $parse_tokens_op_8_2(Prolog* m);

		static Operation $parse_tokens_op_8_3(Prolog* m);

		static Operation $parse_tokens_op_8_4(Prolog* m);

		static Operation $parse_tokens_op_8_5(Prolog* m);

		static Operation $parse_tokens_op_8_6(Prolog* m);

		static Operation $parse_tokens_op_8_7(Prolog* m);

		/** PREDICATE: $parse_tokens_is_starter/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_is_starter_1_s1;

	public:
		static Operation PRED_$parse_tokens_is_starter_1_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_is_starter_1_var(Prolog* m);

		static Operation $parse_tokens_is_starter_1_var_1(Prolog* m);

		static Operation $parse_tokens_is_starter_1_var_2(Prolog* m);

		static Operation $parse_tokens_is_starter_1_var_3(Prolog* m);

		static Operation $parse_tokens_is_starter_1_var_4(Prolog* m);

		static Operation $parse_tokens_is_starter_1_var_5(Prolog* m);

		static Operation $parse_tokens_is_starter_1_var_6(Prolog* m);

		static Operation $parse_tokens_is_starter_1_var_7(Prolog* m);

		static Operation $parse_tokens_is_starter_1_con(Prolog* m);

		static Operation $parse_tokens_is_starter_1_con_1(Prolog* m);

		static Operation $parse_tokens_is_starter_1_con_2(Prolog* m);

		static Operation $parse_tokens_is_starter_1_con_3(Prolog* m);

		static Operation $parse_tokens_is_starter_1_str(Prolog* m);

		static Operation $parse_tokens_is_starter_1_str_1(Prolog* m);

		static Operation $parse_tokens_is_starter_1_str_2(Prolog* m);

		static Operation $parse_tokens_is_starter_1_str_3(Prolog* m);

		static Operation $parse_tokens_is_starter_1_1(Prolog* m);

		static Operation $parse_tokens_is_starter_1_2(Prolog* m);

		static Operation $parse_tokens_is_starter_1_3(Prolog* m);

		static Operation $parse_tokens_is_starter_1_4(Prolog* m);

		static Operation $parse_tokens_is_starter_1_5(Prolog* m);

		static Operation $parse_tokens_is_starter_1_6(Prolog* m);

		static Operation $parse_tokens_is_starter_1_7(Prolog* m);

		static Operation $parse_tokens_is_starter_1_8(Prolog* m);

		/** PREDICATE: $parse_tokens_is_terminator/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_is_terminator_1_s1;

	public:
		static Operation PRED_$parse_tokens_is_terminator_1_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_is_terminator_1_var(Prolog* m);

		static Operation $parse_tokens_is_terminator_1_var_1(Prolog* m);

		static Operation $parse_tokens_is_terminator_1_var_2(Prolog* m);

		static Operation $parse_tokens_is_terminator_1_var_3(Prolog* m);

		static Operation $parse_tokens_is_terminator_1_1(Prolog* m);

		static Operation $parse_tokens_is_terminator_1_2(Prolog* m);

		static Operation $parse_tokens_is_terminator_1_3(Prolog* m);

		static Operation $parse_tokens_is_terminator_1_4(Prolog* m);

		/** PREDICATE: $parse_tokens_is_post_in_op/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_is_post_in_op_1_s1;

	public:
		static Operation PRED_$parse_tokens_is_post_in_op_1_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_is_post_in_op_1_var(Prolog* m);

		static Operation $parse_tokens_is_post_in_op_1_var_1(Prolog* m);

		static Operation $parse_tokens_is_post_in_op_1_var_2(Prolog* m);

		static Operation $parse_tokens_is_post_in_op_1_con(Prolog* m);

		static Operation $parse_tokens_is_post_in_op_1_con_1(Prolog* m);

		static Operation $parse_tokens_is_post_in_op_1_1(Prolog* m);

		static Operation $parse_tokens_is_post_in_op_1_2(Prolog* m);

		static Operation $parse_tokens_is_post_in_op_1_3(Prolog* m);

		/** PREDICATE: $parse_tokens_post_in_type/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_post_in_type_1_s1;

	public:
		static Operation PRED_$parse_tokens_post_in_type_1_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_post_in_type_1_var(Prolog* m);

		static Operation $parse_tokens_post_in_type_1_var_1(Prolog* m);

		static Operation $parse_tokens_post_in_type_1_var_2(Prolog* m);

		static Operation $parse_tokens_post_in_type_1_var_3(Prolog* m);

		static Operation $parse_tokens_post_in_type_1_var_4(Prolog* m);

		static Operation $parse_tokens_post_in_type_1_1(Prolog* m);

		static Operation $parse_tokens_post_in_type_1_2(Prolog* m);

		static Operation $parse_tokens_post_in_type_1_3(Prolog* m);

		static Operation $parse_tokens_post_in_type_1_4(Prolog* m);

		static Operation $parse_tokens_post_in_type_1_5(Prolog* m);

		/** PREDICATE: $parse_tokens_expect/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_expect_3_s1;
		static ListTerm* const  PRED_$parse_tokens_expect_3_s3;

	public:
		static Operation PRED_$parse_tokens_expect_3_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_expect_3_sub_1(Prolog* m);

		static Operation $parse_tokens_expect_3_1(Prolog* m);

		static Operation $parse_tokens_expect_3_2(Prolog* m);

		/** PREDICATE: $parse_tokens_skip_spaces/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_skip_spaces_2_s1;

	public:
		static Operation PRED_$parse_tokens_skip_spaces_2_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_skip_spaces_2_top(Prolog* m);

		static Operation $parse_tokens_skip_spaces_2_var(Prolog* m);

		static Operation $parse_tokens_skip_spaces_2_var_1(Prolog* m);

		static Operation $parse_tokens_skip_spaces_2_1(Prolog* m);

		static Operation $parse_tokens_skip_spaces_2_2(Prolog* m);

		/** PREDICATE: $parse_tokens_peep_next/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$parse_tokens_peep_next_3_static_exec(Prolog* m);

		/** PREDICATE: $parse_tokens_error/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$parse_tokens_error_3_s1;

	public:
		static Operation PRED_$parse_tokens_error_3_static_exec(Prolog* m);

		/** PREDICATE: $parse_tokens_error1/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$parse_tokens_error1_2_s1;
	public:
		static SymbolTerm* const  ATOM_$002A$002A$0020here$0020$002A$002A;

		static Operation PRED_$parse_tokens_error1_2_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_error1_2_var(Prolog* m);

		static Operation $parse_tokens_error1_2_var_1(Prolog* m);

		static Operation $parse_tokens_error1_2_var_2(Prolog* m);

		static Operation $parse_tokens_error1_2_con(Prolog* m);

		static Operation $parse_tokens_error1_2_con_1(Prolog* m);

		static Operation $parse_tokens_error1_2_lis(Prolog* m);

		static Operation $parse_tokens_error1_2_lis_1(Prolog* m);

		static Operation $parse_tokens_error1_2_1(Prolog* m);

		static Operation $parse_tokens_error1_2_2(Prolog* m);

		static Operation $parse_tokens_error1_2_3(Prolog* m);

		/** PREDICATE: $parse_tokens_error2/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	public:
		static SymbolTerm* const  ATOM_$0022;

		static Operation PRED_$parse_tokens_error2_1_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_error2_1_var(Prolog* m);

		static Operation $parse_tokens_error2_1_var_1(Prolog* m);

		static Operation $parse_tokens_error2_1_var_2(Prolog* m);

		static Operation $parse_tokens_error2_1_var_3(Prolog* m);

		static Operation $parse_tokens_error2_1_var_4(Prolog* m);

		static Operation $parse_tokens_error2_1_1(Prolog* m);

		static Operation $parse_tokens_error2_1_2(Prolog* m);

		static Operation $parse_tokens_error2_1_3(Prolog* m);

		static Operation $parse_tokens_error2_1_4(Prolog* m);

		static Operation $parse_tokens_error2_1_5(Prolog* m);

		/** PREDICATE: $parse_tokens_write_string/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_write_string_2_s1;
	public:
		static IntegerTerm* const  int_34;
	private:
		static ListTerm* const  PRED_$parse_tokens_write_string_2_s3;

	public:
		static Operation PRED_$parse_tokens_write_string_2_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_write_string_2_sub_1(Prolog* m);

		static Operation $parse_tokens_write_string_2_sub_2(Prolog* m);

		static Operation $parse_tokens_write_string_2_1(Prolog* m);

		static Operation $parse_tokens_write_string_2_2(Prolog* m);

		static Operation $parse_tokens_write_string_2_3(Prolog* m);

		/** PREDICATE: $parse_tokens_write_message/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$parse_tokens_write_message_2_s1;
	public:
		static SymbolTerm* const  ATOM_$0020;

		static Operation PRED_$parse_tokens_write_message_2_static_exec(Prolog* m);

	private:
		static Operation $parse_tokens_write_message_2_sub_1(Prolog* m);

		static Operation $parse_tokens_write_message_2_1(Prolog* m);

		static Operation $parse_tokens_write_message_2_2(Prolog* m);

		/** PREDICATE: write/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_write_1_s4;
		static ListTerm* const  PRED_write_1_s6;

	public:
		static Operation PRED_write_1_static_exec(Prolog* m);

		/** PREDICATE: write/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static StructureTerm* const  PRED_write_2_s4;
		static ListTerm* const  PRED_write_2_s6;

	public:
		static Operation PRED_write_2_static_exec(Prolog* m);

		/** PREDICATE: writeq/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static StructureTerm* const  PRED_writeq_1_s4;
		static StructureTerm* const  PRED_writeq_1_s6;
		static ListTerm* const  PRED_writeq_1_s8;
		static ListTerm* const  PRED_writeq_1_s9;

	public:
		static Operation PRED_writeq_1_static_exec(Prolog* m);

		/** PREDICATE: writeq/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static StructureTerm* const  PRED_writeq_2_s4;
		static StructureTerm* const  PRED_writeq_2_s6;
		static ListTerm* const  PRED_writeq_2_s8;
		static ListTerm* const  PRED_writeq_2_s9;

	public:
		static Operation PRED_writeq_2_static_exec(Prolog* m);

		/** PREDICATE: write_canonical/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static StructureTerm* const  PRED_write_canonical_1_s4;
		static StructureTerm* const  PRED_write_canonical_1_s6;
		static ListTerm* const  PRED_write_canonical_1_s8;
		static ListTerm* const  PRED_write_canonical_1_s9;

	public:
		static Operation PRED_write_canonical_1_static_exec(Prolog* m);

		/** PREDICATE: write_canonical/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static StructureTerm* const  PRED_write_canonical_2_s4;
		static StructureTerm* const  PRED_write_canonical_2_s6;
		static ListTerm* const  PRED_write_canonical_2_s8;
		static ListTerm* const  PRED_write_canonical_2_s9;

	public:
		static Operation PRED_write_canonical_2_static_exec(Prolog* m);

		/** PREDICATE: write_term/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_write_term_2_static_exec(Prolog* m);

		/** PREDICATE: write_term/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_write_term_3_static_exec(Prolog* m);

	private:
		static Operation write_term_3_sub_1(Prolog* m);

		static Operation write_term_3_1(Prolog* m);

		static Operation write_term_3_2(Prolog* m);

		/** PREDICATE: $write_term/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static IntegerTerm* const  PRED_$write_term_3_s1;
	public:
		static SymbolTerm* const  ATOM_punct;

		static Operation PRED_$write_term_3_static_exec(Prolog* m);

		/** PREDICATE: $write_term0/6
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$write_term0_6_s1;
		static StructureTerm* const  PRED_$write_term0_6_s7;
	public:
		static SymbolTerm* const  ATOM_symbol;
		static IntegerTerm* const  int_1200;

		// private final Term arg5, arg6;

		static Operation PRED_$write_term0_6_static_exec(Prolog* m);

	private:
		static Operation $write_term0_6_sub_1(Prolog* m);

		static Operation $write_term0_6_sub_2(Prolog* m);

		static Operation $write_term0_6_sub_3(Prolog* m);

		static Operation $write_term0_6_sub_4(Prolog* m);

		static Operation $write_term0_6_sub_5(Prolog* m);

		static Operation $write_term0_6_sub_6(Prolog* m);

		static Operation $write_term0_6_sub_7(Prolog* m);

		static Operation $write_term0_6_sub_8(Prolog* m);

		static Operation $write_term0_6_sub_9(Prolog* m);

		static Operation $write_term0_6_1(Prolog* m);

		static Operation $write_term0_6_2(Prolog* m);

		static Operation $write_term0_6_3(Prolog* m);

		static Operation $write_term0_6_4(Prolog* m);

		static Operation $write_term0_6_5(Prolog* m);

		static Operation $write_term0_6_6(Prolog* m);

		static Operation $write_term0_6_7(Prolog* m);

		static Operation $write_term0_6_8(Prolog* m);

		static Operation $write_term0_6_9(Prolog* m);

		static Operation $write_term0_6_10(Prolog* m);

		/** PREDICATE: $dummy_14_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_$dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_s4;

	public:
		static Operation PRED_$dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: $dummy_15_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_$dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_s4;

	public:
		static Operation PRED_$dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: $dummy_16_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_$dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_s4;

	public:
		static Operation PRED_$dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: $write_space_if_needed/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$write_space_if_needed_3_s1;
	public:
		static SymbolTerm* const  ATOM_other;
		static SymbolTerm* const  ATOM_alpha;

		static Operation PRED_$write_space_if_needed_3_static_exec(Prolog* m);

	private:
		static Operation $write_space_if_needed_3_var(Prolog* m);

		static Operation $write_space_if_needed_3_var_1(Prolog* m);

		static Operation $write_space_if_needed_3_var_2(Prolog* m);

		static Operation $write_space_if_needed_3_var_3(Prolog* m);

		static Operation $write_space_if_needed_3_int(Prolog* m);

		static Operation $write_space_if_needed_3_int_1(Prolog* m);

		static Operation $write_space_if_needed_3_1(Prolog* m);

		static Operation $write_space_if_needed_3_2(Prolog* m);

		static Operation $write_space_if_needed_3_3(Prolog* m);

		static Operation $write_space_if_needed_3_4(Prolog* m);

		/** PREDICATE: $write_VAR/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static IntegerTerm* const  PRED_$write_VAR_2_s1;
		static ListTerm* const  PRED_$write_VAR_2_s6;

	public:
		static Operation PRED_$write_VAR_2_static_exec(Prolog* m);

	private:
		static Operation $write_VAR_2_sub_1(Prolog* m);

		static Operation $write_VAR_2_1(Prolog* m);

		static Operation $write_VAR_2_2(Prolog* m);

		/** PREDICATE: $write_atom/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_$write_atom_5_s4;

		// private final Term arg5;

	public:
		static Operation PRED_$write_atom_5_static_exec(Prolog* m);

	private:
		static Operation $write_atom_5_sub_1(Prolog* m);

		static Operation $write_atom_5_1(Prolog* m);

		static Operation $write_atom_5_2(Prolog* m);

		/** PREDICATE: $atom_type/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$atom_type_2_s1;

	public:
		static Operation PRED_$atom_type_2_static_exec(Prolog* m);

	private:
		static Operation $atom_type_2_sub_1(Prolog* m);

		static Operation $atom_type_2_sub_2(Prolog* m);

		static Operation $atom_type_2_sub_3(Prolog* m);

		static Operation $atom_type_2_1(Prolog* m);

		static Operation $atom_type_2_2(Prolog* m);

		static Operation $atom_type_2_3(Prolog* m);

		static Operation $atom_type_2_4(Prolog* m);

		/** PREDICATE: $write_is_operator/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$write_is_operator_4_static_exec(Prolog* m);

		/** PREDICATE: $write_op_type/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static IntegerTerm* const  PRED_$write_op_type_2_s1;

	public:
		static Operation PRED_$write_op_type_2_static_exec(Prolog* m);

	private:
		static Operation $write_op_type_2_var(Prolog* m);

		static Operation $write_op_type_2_var_1(Prolog* m);

		static Operation $write_op_type_2_var_2(Prolog* m);

		static Operation $write_op_type_2_var_3(Prolog* m);

		static Operation $write_op_type_2_var_4(Prolog* m);

		static Operation $write_op_type_2_var_5(Prolog* m);

		static Operation $write_op_type_2_var_6(Prolog* m);

		static Operation $write_op_type_2_1(Prolog* m);

		static Operation $write_op_type_2_2(Prolog* m);

		static Operation $write_op_type_2_3(Prolog* m);

		static Operation $write_op_type_2_4(Prolog* m);

		static Operation $write_op_type_2_5(Prolog* m);

		static Operation $write_op_type_2_6(Prolog* m);

		static Operation $write_op_type_2_7(Prolog* m);

		/** PREDICATE: $write_term_op/8
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$write_term_op_8_s1;

		// private final Term arg5, arg6, arg7, arg8;

	public:
		static Operation PRED_$write_term_op_8_static_exec(Prolog* m);

	private:
		static Operation $write_term_op_8_sub_1(Prolog* m);

		static Operation $write_term_op_8_1(Prolog* m);

		static Operation $write_term_op_8_2(Prolog* m);

		/** PREDICATE: $write_term_op1/8
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$write_term_op1_8_s1;

		// private final Term arg5, arg6, arg7, arg8;

	public:
		static Operation PRED_$write_term_op1_8_static_exec(Prolog* m);

	private:
		static Operation $write_term_op1_8_sub_1(Prolog* m);

		static Operation $write_term_op1_8_sub_2(Prolog* m);

		static Operation $write_term_op1_8_sub_3(Prolog* m);

		static Operation $write_term_op1_8_sub_4(Prolog* m);

		static Operation $write_term_op1_8_sub_5(Prolog* m);

		static Operation $write_term_op1_8_sub_6(Prolog* m);

		static Operation $write_term_op1_8_1(Prolog* m);

		static Operation $write_term_op1_8_2(Prolog* m);

		static Operation $write_term_op1_8_3(Prolog* m);

		static Operation $write_term_op1_8_4(Prolog* m);

		static Operation $write_term_op1_8_5(Prolog* m);

		static Operation $write_term_op1_8_6(Prolog* m);

		static Operation $write_term_op1_8_7(Prolog* m);

		/** PREDICATE: $write_term_infix_op/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$write_term_infix_op_5_s1;

		// private final Term arg5;

	public:
		static Operation PRED_$write_term_infix_op_5_static_exec(Prolog* m);

	private:
		static Operation $write_term_infix_op_5_var(Prolog* m);

		static Operation $write_term_infix_op_5_var_1(Prolog* m);

		static Operation $write_term_infix_op_5_1(Prolog* m);

		static Operation $write_term_infix_op_5_2(Prolog* m);

		/** PREDICATE: $write_term_list_args/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static IntegerTerm* const  PRED_$write_term_list_args_5_s1;

		// private final Term arg5;

	public:
		static Operation PRED_$write_term_list_args_5_static_exec(Prolog* m);

	private:
		static Operation $write_term_list_args_5_var(Prolog* m);

		static Operation $write_term_list_args_5_var_1(Prolog* m);

		static Operation $write_term_list_args_5_var_2(Prolog* m);

		static Operation $write_term_list_args_5_1(Prolog* m);

		static Operation $write_term_list_args_5_2(Prolog* m);

		static Operation $write_term_list_args_5_3(Prolog* m);

		/** PREDICATE: $write_term_args/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$write_term_args_5_s1;

		// private final Term arg5;

	public:
		static Operation PRED_$write_term_args_5_static_exec(Prolog* m);

	private:
		static Operation $write_term_args_5_var(Prolog* m);

		static Operation $write_term_args_5_var_1(Prolog* m);

		static Operation $write_term_args_5_var_2(Prolog* m);

		static Operation $write_term_args_5_lis(Prolog* m);

		static Operation $write_term_args_5_lis_1(Prolog* m);

		static Operation $write_term_args_5_1(Prolog* m);

		static Operation $write_term_args_5_2(Prolog* m);

		static Operation $write_term_args_5_3(Prolog* m);

		/** PREDICATE: op/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static IntegerTerm* const  PRED_op_3_s1;
		static StructureTerm* const  PRED_op_3_s7;
		static StructureTerm* const  PRED_op_3_s9;

	public:
		static Operation PRED_op_3_static_exec(Prolog* m);

	private:
		static Operation op_3_sub_1(Prolog* m);

		static Operation op_3_1(Prolog* m);

		static Operation op_3_2(Prolog* m);

		/** PREDICATE: $op1/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$op1_3_static_exec(Prolog* m);

	private:
		static Operation $op1_3_sub_1(Prolog* m);

		static Operation $op1_3_1(Prolog* m);

		static Operation $op1_3_2(Prolog* m);

		/** PREDICATE: $op2/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$op2_3_s1;
		static StructureTerm* const  PRED_$op2_3_s6;
		static StructureTerm* const  PRED_$op2_3_s8;

	public:
		static Operation PRED_$op2_3_static_exec(Prolog* m);

	private:
		static Operation $op2_3_sub_1(Prolog* m);

		static Operation $op2_3_sub_2(Prolog* m);

		static Operation $op2_3_1(Prolog* m);

		static Operation $op2_3_2(Prolog* m);

		static Operation $op2_3_3(Prolog* m);

		/** PREDICATE: $add_operators/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$add_operators_3_s1;

	public:
		static Operation PRED_$add_operators_3_static_exec(Prolog* m);

	private:
		static Operation $add_operators_3_var(Prolog* m);

		static Operation $add_operators_3_var_1(Prolog* m);

		static Operation $add_operators_3_1(Prolog* m);

		static Operation $add_operators_3_2(Prolog* m);

		/** PREDICATE: $add_op/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$add_op_3_s1;
	public:
		static SymbolTerm* const  ATOM_operator;

		static Operation PRED_$add_op_3_static_exec(Prolog* m);

	private:
		static Operation $add_op_3_var(Prolog* m);

		static Operation $add_op_3_var_1(Prolog* m);

		static Operation $add_op_3_var_2(Prolog* m);

		static Operation $add_op_3_var_3(Prolog* m);

		static Operation $add_op_3_int(Prolog* m);

		static Operation $add_op_3_int_1(Prolog* m);

		static Operation $add_op_3_int_2(Prolog* m);

		static Operation $add_op_3_1(Prolog* m);

		static Operation $add_op_3_2(Prolog* m);

		static Operation $add_op_3_3(Prolog* m);

		static Operation $add_op_3_4(Prolog* m);

		/** PREDICATE: $op_specifier/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$op_specifier_2_s1;
	public:
		static SymbolTerm* const  ATOM_prefix;
		static SymbolTerm* const  ATOM_infix;
		static SymbolTerm* const  ATOM_postfix;

		static Operation PRED_$op_specifier_2_static_exec(Prolog* m);

	private:
		static Operation $op_specifier_2_var(Prolog* m);

		static Operation $op_specifier_2_var_1(Prolog* m);

		static Operation $op_specifier_2_var_2(Prolog* m);

		static Operation $op_specifier_2_var_3(Prolog* m);

		static Operation $op_specifier_2_var_4(Prolog* m);

		static Operation $op_specifier_2_var_5(Prolog* m);

		static Operation $op_specifier_2_var_6(Prolog* m);

		static Operation $op_specifier_2_1(Prolog* m);

		static Operation $op_specifier_2_2(Prolog* m);

		static Operation $op_specifier_2_3(Prolog* m);

		static Operation $op_specifier_2_4(Prolog* m);

		static Operation $op_specifier_2_5(Prolog* m);

		static Operation $op_specifier_2_6(Prolog* m);

		static Operation $op_specifier_2_7(Prolog* m);

		/** PREDICATE: $op_atom_list/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$op_atom_list_2_s1;

	public:
		static Operation PRED_$op_atom_list_2_static_exec(Prolog* m);

	private:
		static Operation $op_atom_list_2_top(Prolog* m);

		static Operation $op_atom_list_2_var(Prolog* m);

		static Operation $op_atom_list_2_var_1(Prolog* m);

		static Operation $op_atom_list_2_var_2(Prolog* m);

		static Operation $op_atom_list_2_con(Prolog* m);

		static Operation $op_atom_list_2_con_1(Prolog* m);

		static Operation $op_atom_list_2_lis(Prolog* m);

		static Operation $op_atom_list_2_lis_1(Prolog* m);

		static Operation $op_atom_list_2_1(Prolog* m);

		static Operation $op_atom_list_2_2(Prolog* m);

		static Operation $op_atom_list_2_3(Prolog* m);

		/** PREDICATE: current_op/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_current_op_3_static_exec(Prolog* m);

		/** PREDICATE: (\+)/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$005C$002B_1_static_exec(Prolog* m);

	private:
		static Operation $005C$002B_1_sub_1(Prolog* m);

		static Operation $005C$002B_1_1(Prolog* m);

		static Operation $005C$002B_1_2(Prolog* m);

		/** PREDICATE: repeat/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_repeat_0_static_exec(Prolog* m);

	private:
		static Operation repeat_0_top(Prolog* m);

		static Operation repeat_0_sub_1(Prolog* m);

		static Operation repeat_0_1(Prolog* m);

		static Operation repeat_0_2(Prolog* m);

		/** PREDICATE: once/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_once_1_static_exec(Prolog* m);

		/** PREDICATE: sub_atom/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5;

		static Operation PRED_sub_atom_5_static_exec(Prolog* m);

		/** PREDICATE: $dummy_17_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  ATOM_atomic;
	private:
		static StructureTerm* const  PRED_$dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_s4;

	public:
		static Operation PRED_$dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_sub_2(Prolog* m);

		static Operation $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_1(Prolog* m);

		static Operation $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_2(Prolog* m);

		static Operation $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_3(Prolog* m);

		/** PREDICATE: $dummy_18_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_1(Prolog* m);

		static Operation $dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_2(Prolog* m);

		/** PREDICATE: name/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_name_2_static_exec(Prolog* m);

	private:
		static Operation name_2_sub_1(Prolog* m);

		static Operation name_2_1(Prolog* m);

		static Operation name_2_2(Prolog* m);

		/** PREDICATE: $dummy_19_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	public:
		static SymbolTerm* const  ATOM_char;
	private:
		static StructureTerm* const  PRED_$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_s5;
		static StructureTerm* const  PRED_$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_s7;

	public:
		static Operation PRED_$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_2(Prolog* m);

		static Operation $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog* m);

		static Operation $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog* m);

		static Operation $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_3(Prolog* m);

		/** PREDICATE: $dummy_20_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog* m);

		static Operation $dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog* m);

		/** PREDICATE: regex_matches/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_regex_matches_3_s1;

	public:
		static Operation PRED_regex_matches_3_static_exec(Prolog* m);

	private:
		static Operation regex_matches_3_sub_1(Prolog* m);

		static Operation regex_matches_3_sub_2(Prolog* m);

		static Operation regex_matches_3_1(Prolog* m);

		static Operation regex_matches_3_2(Prolog* m);

		static Operation regex_matches_3_3(Prolog* m);

		/** PREDICATE: regex_matches/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_regex_matches_2_static_exec(Prolog* m);

		/** PREDICATE: regex_list/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_regex_list_3_static_exec(Prolog* m);

	private:
		static Operation regex_list_3_top(Prolog* m);

		static Operation regex_list_3_sub_1(Prolog* m);

		static Operation regex_list_3_1(Prolog* m);

		static Operation regex_list_3_2(Prolog* m);

		/** PREDICATE: set_prolog_flag/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_set_prolog_flag_2_s1;
		static StructureTerm* const  PRED_set_prolog_flag_2_s8;

	public:
		static Operation PRED_set_prolog_flag_2_static_exec(Prolog* m);

	private:
		static Operation set_prolog_flag_2_sub_1(Prolog* m);

		static Operation set_prolog_flag_2_sub_2(Prolog* m);

		static Operation set_prolog_flag_2_sub_3(Prolog* m);

		static Operation set_prolog_flag_2_1(Prolog* m);

		static Operation set_prolog_flag_2_2(Prolog* m);

		static Operation set_prolog_flag_2_3(Prolog* m);

		static Operation set_prolog_flag_2_4(Prolog* m);

		/** PREDICATE: $set_prolog_flag0/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	public:
		static SymbolTerm* const  ATOM_prolog_flag;
	private:
		static StructureTerm* const  PRED_$set_prolog_flag0_2_s6;

	public:
		static Operation PRED_$set_prolog_flag0_2_static_exec(Prolog* m);

	private:
		static Operation $set_prolog_flag0_2_sub_1(Prolog* m);

		static Operation $set_prolog_flag0_2_1(Prolog* m);

		static Operation $set_prolog_flag0_2_2(Prolog* m);

		/** PREDICATE: $set_prolog_flag0/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$set_prolog_flag0_4_s1;
	public:
		static SymbolTerm* const  ATOM_flag;
		static SymbolTerm* const  ATOM_flag_value;
	private:
		static StructureTerm* const  PRED_$set_prolog_flag0_4_s10;

	public:
		static Operation PRED_$set_prolog_flag0_4_static_exec(Prolog* m);

	private:
		static Operation $set_prolog_flag0_4_var(Prolog* m);

		static Operation $set_prolog_flag0_4_var_1(Prolog* m);

		static Operation $set_prolog_flag0_4_var_2(Prolog* m);

		static Operation $set_prolog_flag0_4_int(Prolog* m);

		static Operation $set_prolog_flag0_4_int_1(Prolog* m);

		static Operation $set_prolog_flag0_4_1(Prolog* m);

		static Operation $set_prolog_flag0_4_2(Prolog* m);

		static Operation $set_prolog_flag0_4_3(Prolog* m);

		/** PREDICATE: current_prolog_flag/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_current_prolog_flag_2_s4;

	public:
		static Operation PRED_current_prolog_flag_2_static_exec(Prolog* m);

	private:
		static Operation current_prolog_flag_2_sub_1(Prolog* m);

		static Operation current_prolog_flag_2_sub_2(Prolog* m);

		static Operation current_prolog_flag_2_1(Prolog* m);

		static Operation current_prolog_flag_2_2(Prolog* m);

		static Operation current_prolog_flag_2_3(Prolog* m);

		/** PREDICATE: $dummy_21_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_$dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_s5;

	public:
		static Operation PRED_$dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec(Prolog* m);

	private:
		static Operation $dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_sub_1(Prolog* m);

		static Operation $dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_1(Prolog* m);

		static Operation $dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_2(Prolog* m);

		/** PREDICATE: $prolog_impl_flag/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$prolog_impl_flag_3_s1;
		static StructureTerm* const  PRED_$prolog_impl_flag_3_s5;
	public:
		static SymbolTerm* const  ATOM_min_integer;
		static SymbolTerm* const  ATOM_on;
		static SymbolTerm* const  ATOM_off;
	private:
		static ListTerm* const  PRED_$prolog_impl_flag_3_s11;
		static ListTerm* const  PRED_$prolog_impl_flag_3_s12;
	public:
		static SymbolTerm* const  ATOM_yes;
	private:
		static StructureTerm* const  PRED_$prolog_impl_flag_3_s15;
	public:
		static SymbolTerm* const  ATOM_max_arity;
		static SymbolTerm* const  ATOM_unknown;
		static SymbolTerm* const  ATOM_error;
		static SymbolTerm* const  ATOM_fail;
		static SymbolTerm* const  ATOM_warning;
	private:
		static ListTerm* const  PRED_$prolog_impl_flag_3_s21;
		static ListTerm* const  PRED_$prolog_impl_flag_3_s22;
		static ListTerm* const  PRED_$prolog_impl_flag_3_s23;
	public:
		static SymbolTerm* const  ATOM_double_quotes;
		static SymbolTerm* const  ATOM_chars;
		static SymbolTerm* const  ATOM_codes;
	private:
		static ListTerm* const  PRED_$prolog_impl_flag_3_s28;
		static ListTerm* const  PRED_$prolog_impl_flag_3_s29;
		static ListTerm* const  PRED_$prolog_impl_flag_3_s30;
	public:
		static SymbolTerm* const  ATOM_print_stack_trace;

		static Operation PRED_$prolog_impl_flag_3_static_exec(Prolog* m);

	private:
		static Operation $prolog_impl_flag_3_var(Prolog* m);

		static Operation $prolog_impl_flag_3_var_1(Prolog* m);

		static Operation $prolog_impl_flag_3_var_2(Prolog* m);

		static Operation $prolog_impl_flag_3_var_3(Prolog* m);

		static Operation $prolog_impl_flag_3_var_4(Prolog* m);

		static Operation $prolog_impl_flag_3_var_5(Prolog* m);

		static Operation $prolog_impl_flag_3_var_6(Prolog* m);

		static Operation $prolog_impl_flag_3_1(Prolog* m);

		static Operation $prolog_impl_flag_3_2(Prolog* m);

		static Operation $prolog_impl_flag_3_3(Prolog* m);

		static Operation $prolog_impl_flag_3_4(Prolog* m);

		static Operation $prolog_impl_flag_3_5(Prolog* m);

		static Operation $prolog_impl_flag_3_6(Prolog* m);

		static Operation $prolog_impl_flag_3_7(Prolog* m);

		/** PREDICATE: halt/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static IntegerTerm* const  PRED_halt_0_s1;

	public:
		static Operation PRED_halt_0_static_exec(Prolog* m);

		/** PREDICATE: abort/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_abort_0_s1;

	public:
		static Operation PRED_abort_0_static_exec(Prolog* m);

		/** PREDICATE: C/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_C_3_static_exec(Prolog* m);

		/** PREDICATE: expand_term/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_expand_term_2_static_exec(Prolog* m);

	private:
		static Operation expand_term_2_sub_1(Prolog* m);

		static Operation expand_term_2_sub_2(Prolog* m);

		static Operation expand_term_2_1(Prolog* m);

		static Operation expand_term_2_2(Prolog* m);

		static Operation expand_term_2_3(Prolog* m);

		/** PREDICATE: $dcg_expansion/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dcg_expansion_2_static_exec(Prolog* m);

	private:
		static Operation $dcg_expansion_2_var(Prolog* m);

		static Operation $dcg_expansion_2_var_1(Prolog* m);

		static Operation $dcg_expansion_2_var_2(Prolog* m);

		static Operation $dcg_expansion_2_1(Prolog* m);

		static Operation $dcg_expansion_2_2(Prolog* m);

		static Operation $dcg_expansion_2_3(Prolog* m);

		/** PREDICATE: $dcg_translation_atom/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dcg_translation_atom_4_static_exec(Prolog* m);

	private:
		static Operation $dcg_translation_atom_4_top(Prolog* m);

		static Operation $dcg_translation_atom_4_var(Prolog* m);

		static Operation $dcg_translation_atom_4_var_1(Prolog* m);

		static Operation $dcg_translation_atom_4_var_2(Prolog* m);

		static Operation $dcg_translation_atom_4_int(Prolog* m);

		static Operation $dcg_translation_atom_4_int_1(Prolog* m);

		static Operation $dcg_translation_atom_4_1(Prolog* m);

		static Operation $dcg_translation_atom_4_2(Prolog* m);

		static Operation $dcg_translation_atom_4_3(Prolog* m);

		/** PREDICATE: $dcg_translation/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dcg_translation_4_static_exec(Prolog* m);

		/** PREDICATE: $dcg_trans0/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5;

		static Operation PRED_$dcg_trans0_5_static_exec(Prolog* m);

	private:
		static Operation $dcg_trans0_5_sub_1(Prolog* m);

		static Operation $dcg_trans0_5_1(Prolog* m);

		static Operation $dcg_trans0_5_2(Prolog* m);

		/** PREDICATE: $dcg_concat/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$dcg_concat_3_s1;

	public:
		static Operation PRED_$dcg_concat_3_static_exec(Prolog* m);

	private:
		static Operation $dcg_concat_3_sub_1(Prolog* m);

		static Operation $dcg_concat_3_sub_2(Prolog* m);

		static Operation $dcg_concat_3_1(Prolog* m);

		static Operation $dcg_concat_3_2(Prolog* m);

		static Operation $dcg_concat_3_3(Prolog* m);

		/** PREDICATE: $dcg_trans/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_$dcg_trans_5_static_exec(Prolog* m);

	private:
		static Operation $dcg_trans_5_top(Prolog* m);

		static Operation $dcg_trans_5_var(Prolog* m);

		static Operation $dcg_trans_5_var_1(Prolog* m);

		static Operation $dcg_trans_5_var_2(Prolog* m);

		static Operation $dcg_trans_5_var_3(Prolog* m);

		static Operation $dcg_trans_5_var_4(Prolog* m);

		static Operation $dcg_trans_5_var_5(Prolog* m);

		static Operation $dcg_trans_5_var_6(Prolog* m);

		static Operation $dcg_trans_5_var_7(Prolog* m);

		static Operation $dcg_trans_5_var_8(Prolog* m);

		static Operation $dcg_trans_5_var_9(Prolog* m);

		static Operation $dcg_trans_5_var_10(Prolog* m);

		static Operation $dcg_trans_5_var_11(Prolog* m);

		static Operation $dcg_trans_5_int(Prolog* m);

		static Operation $dcg_trans_5_int_1(Prolog* m);

		static Operation $dcg_trans_5_con(Prolog* m);

		static Operation $dcg_trans_5_con_1(Prolog* m);

		static Operation $dcg_trans_5_con_2(Prolog* m);

		static Operation $dcg_trans_5_con_3(Prolog* m);

		static Operation $dcg_trans_5_str(Prolog* m);

		static Operation $dcg_trans_5_str_1(Prolog* m);

		static Operation $dcg_trans_5_str_2(Prolog* m);

		static Operation $dcg_trans_5_str_3(Prolog* m);

		static Operation $dcg_trans_5_str_4(Prolog* m);

		static Operation $dcg_trans_5_str_5(Prolog* m);

		static Operation $dcg_trans_5_str_6(Prolog* m);

		static Operation $dcg_trans_5_str_7(Prolog* m);

		static Operation $dcg_trans_5_str_8(Prolog* m);

		static Operation $dcg_trans_5_lis(Prolog* m);

		static Operation $dcg_trans_5_lis_1(Prolog* m);

		static Operation $dcg_trans_5_lis_2(Prolog* m);

		static Operation $dcg_trans_5_1(Prolog* m);

		static Operation $dcg_trans_5_2(Prolog* m);

		static Operation $dcg_trans_5_3(Prolog* m);

		static Operation $dcg_trans_5_4(Prolog* m);

		static Operation $dcg_trans_5_5(Prolog* m);

		static Operation $dcg_trans_5_6(Prolog* m);

		static Operation $dcg_trans_5_7(Prolog* m);

		static Operation $dcg_trans_5_8(Prolog* m);

		static Operation $dcg_trans_5_9(Prolog* m);

		static Operation $dcg_trans_5_10(Prolog* m);

		static Operation $dcg_trans_5_11(Prolog* m);

		static Operation $dcg_trans_5_12(Prolog* m);

		/** PREDICATE: new_hash/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_new_hash_1_s1;

	public:
		static Operation PRED_new_hash_1_static_exec(Prolog* m);

		/** PREDICATE: hash_map/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_hash_map_2_static_exec(Prolog* m);

		/** PREDICATE: hash_map/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_hash_map_3_s1;

	public:
		static Operation PRED_hash_map_3_static_exec(Prolog* m);

	private:
		static Operation hash_map_3_var(Prolog* m);

		static Operation hash_map_3_var_1(Prolog* m);

		static Operation hash_map_3_1(Prolog* m);

		static Operation hash_map_3_2(Prolog* m);

		/** PREDICATE: hash_exists/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_hash_exists_1_static_exec(Prolog* m);

		/** PREDICATE: consult_stream/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_consult_stream_2_s1;

	public:
		static Operation PRED_consult_stream_2_static_exec(Prolog* m);

		/** PREDICATE: $consult_init/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static StructureTerm* const  PRED_$consult_init_1_s9;
		static StructureTerm* const  PRED_$consult_init_1_s11;

	public:
		static Operation PRED_$consult_init_1_static_exec(Prolog* m);

	private:
		static Operation $consult_init_1_sub_1(Prolog* m);

		static Operation $consult_init_1_1(Prolog* m);

		static Operation $consult_init_1_2(Prolog* m);

		/** PREDICATE: $consult_clause/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$consult_clause_1_s1;

	public:
		static Operation PRED_$consult_clause_1_static_exec(Prolog* m);

	private:
		static Operation $consult_clause_1_var(Prolog* m);

		static Operation $consult_clause_1_var_1(Prolog* m);

		static Operation $consult_clause_1_var_2(Prolog* m);

		static Operation $consult_clause_1_var_3(Prolog* m);

		static Operation $consult_clause_1_var_4(Prolog* m);

		static Operation $consult_clause_1_var_5(Prolog* m);

		static Operation $consult_clause_1_var_6(Prolog* m);

		static Operation $consult_clause_1_var_7(Prolog* m);

		static Operation $consult_clause_1_var_8(Prolog* m);

		static Operation $consult_clause_1_var_9(Prolog* m);

		static Operation $consult_clause_1_var_10(Prolog* m);

		static Operation $consult_clause_1_var_11(Prolog* m);

		static Operation $consult_clause_1_con(Prolog* m);

		static Operation $consult_clause_1_con_1(Prolog* m);

		static Operation $consult_clause_1_str(Prolog* m);

		static Operation $consult_clause_1_str_1(Prolog* m);

		static Operation $consult_clause_1_str_2(Prolog* m);

		static Operation $consult_clause_1_str_3(Prolog* m);

		static Operation $consult_clause_1_str_4(Prolog* m);

		static Operation $consult_clause_1_str_5(Prolog* m);

		static Operation $consult_clause_1_str_6(Prolog* m);

		static Operation $consult_clause_1_str_7(Prolog* m);

		static Operation $consult_clause_1_str_8(Prolog* m);

		static Operation $consult_clause_1_str_9(Prolog* m);

		static Operation $consult_clause_1_str_10(Prolog* m);

		static Operation $consult_clause_1_1(Prolog* m);

		static Operation $consult_clause_1_2(Prolog* m);

		static Operation $consult_clause_1_3(Prolog* m);

		static Operation $consult_clause_1_4(Prolog* m);

		static Operation $consult_clause_1_5(Prolog* m);

		static Operation $consult_clause_1_6(Prolog* m);

		static Operation $consult_clause_1_7(Prolog* m);

		static Operation $consult_clause_1_8(Prolog* m);

		static Operation $consult_clause_1_9(Prolog* m);

		static Operation $consult_clause_1_10(Prolog* m);

		static Operation $consult_clause_1_11(Prolog* m);

		static Operation $consult_clause_1_12(Prolog* m);

		/** PREDICATE: $assert_consulted_package/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$assert_consulted_package_1_static_exec(Prolog* m);

	private:
		static Operation $assert_consulted_package_1_sub_1(Prolog* m);

		static Operation $assert_consulted_package_1_1(Prolog* m);

		static Operation $assert_consulted_package_1_2(Prolog* m);

		/** PREDICATE: $assert_consulted_import/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$assert_consulted_import_1_static_exec(Prolog* m);

		/** PREDICATE: $consult_preprocess/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$consult_preprocess_2_static_exec(Prolog* m);

		/** PREDICATE: $consult_cls/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$consult_cls_1_static_exec(Prolog* m);

	private:
		static Operation $consult_cls_1_var(Prolog* m);

		static Operation $consult_cls_1_var_1(Prolog* m);

		static Operation $consult_cls_1_1(Prolog* m);

		static Operation $consult_cls_1_2(Prolog* m);

		/** PREDICATE: $assert_consulted_clause/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$assert_consulted_clause_1_static_exec(Prolog* m);

		/** PREDICATE: length/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static IntegerTerm* const  PRED_length_2_s1;

	public:
		static Operation PRED_length_2_static_exec(Prolog* m);

	private:
		static Operation length_2_sub_1(Prolog* m);

		static Operation length_2_1(Prolog* m);

		static Operation length_2_2(Prolog* m);

		/** PREDICATE: $length/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$length_3_s1;

	public:
		static Operation PRED_$length_3_static_exec(Prolog* m);

	private:
		static Operation $length_3_top(Prolog* m);

		static Operation $length_3_var(Prolog* m);

		static Operation $length_3_var_1(Prolog* m);

		static Operation $length_3_1(Prolog* m);

		static Operation $length_3_2(Prolog* m);

		/** PREDICATE: $length0/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$length0_3_s1;

	public:
		static Operation PRED_$length0_3_static_exec(Prolog* m);

	private:
		static Operation $length0_3_top(Prolog* m);

		static Operation $length0_3_var(Prolog* m);

		static Operation $length0_3_var_1(Prolog* m);

		static Operation $length0_3_1(Prolog* m);

		static Operation $length0_3_2(Prolog* m);

		/** PREDICATE: numbervars/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static IntegerTerm* const  PRED_numbervars_3_s1;

	public:
		static Operation PRED_numbervars_3_static_exec(Prolog* m);

		/** PREDICATE: $numbervars/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_$numbervars_3_static_exec(Prolog* m);

	private:
		static Operation $numbervars_3_sub_1(Prolog* m);

		static Operation $numbervars_3_sub_2(Prolog* m);

		static Operation $numbervars_3_sub_3(Prolog* m);

		static Operation $numbervars_3_1(Prolog* m);

		static Operation $numbervars_3_2(Prolog* m);

		static Operation $numbervars_3_3(Prolog* m);

		static Operation $numbervars_3_4(Prolog* m);

		/** PREDICATE: $numbervars_str/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_$numbervars_str_5_static_exec(Prolog* m);

	private:
		static Operation $numbervars_str_5_sub_1(Prolog* m);

		static Operation $numbervars_str_5_1(Prolog* m);

		static Operation $numbervars_str_5_2(Prolog* m);

		/** PREDICATE: statistics/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_statistics_2_static_exec(Prolog* m);

	private:
		static Operation statistics_2_sub_1(Prolog* m);

		static Operation statistics_2_1(Prolog* m);

		static Operation statistics_2_2(Prolog* m);

		/** PREDICATE: $statistics_mode/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$statistics_mode_1_s1;
	public:
		static SymbolTerm* const  ATOM_trail;
		static SymbolTerm* const  ATOM_choice;

		static Operation PRED_$statistics_mode_1_static_exec(Prolog* m);

	private:
		static Operation $statistics_mode_1_var(Prolog* m);

		static Operation $statistics_mode_1_var_1(Prolog* m);

		static Operation $statistics_mode_1_var_2(Prolog* m);

		static Operation $statistics_mode_1_1(Prolog* m);

		static Operation $statistics_mode_1_2(Prolog* m);

		static Operation $statistics_mode_1_3(Prolog* m);

		/** PREDICATE: illarg/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_illarg_3_s1;

	public:
		static Operation PRED_illarg_3_static_exec(Prolog* m);

	private:
		static Operation illarg_3_top(Prolog* m);

		static Operation illarg_3_var(Prolog* m);

		static Operation illarg_3_var_1(Prolog* m);

		static Operation illarg_3_var_2(Prolog* m);

		static Operation illarg_3_var_3(Prolog* m);

		static Operation illarg_3_var_4(Prolog* m);

		static Operation illarg_3_var_5(Prolog* m);

		static Operation illarg_3_var_6(Prolog* m);

		static Operation illarg_3_var_7(Prolog* m);

		static Operation illarg_3_var_8(Prolog* m);

		static Operation illarg_3_var_9(Prolog* m);

		static Operation illarg_3_var_10(Prolog* m);

		static Operation illarg_3_var_11(Prolog* m);

		static Operation illarg_3_var_12(Prolog* m);

		static Operation illarg_3_int(Prolog* m);

		static Operation illarg_3_int_1(Prolog* m);

		static Operation illarg_3_con(Prolog* m);

		static Operation illarg_3_con_1(Prolog* m);

		static Operation illarg_3_con_2(Prolog* m);

		static Operation illarg_3_str(Prolog* m);

		static Operation illarg_3_str_1(Prolog* m);

		static Operation illarg_3_str_2(Prolog* m);

		static Operation illarg_3_str_3(Prolog* m);

		static Operation illarg_3_str_4(Prolog* m);

		static Operation illarg_3_str_5(Prolog* m);

		static Operation illarg_3_str_6(Prolog* m);

		static Operation illarg_3_str_7(Prolog* m);

		static Operation illarg_3_str_8(Prolog* m);

		static Operation illarg_3_str_9(Prolog* m);

		static Operation illarg_3_str_10(Prolog* m);

		static Operation illarg_3_str_11(Prolog* m);

		static Operation illarg_3_1(Prolog* m);

		static Operation illarg_3_2(Prolog* m);

		static Operation illarg_3_3(Prolog* m);

		static Operation illarg_3_4(Prolog* m);

		static Operation illarg_3_5(Prolog* m);

		static Operation illarg_3_6(Prolog* m);

		static Operation illarg_3_7(Prolog* m);

		static Operation illarg_3_8(Prolog* m);

		static Operation illarg_3_9(Prolog* m);

		static Operation illarg_3_10(Prolog* m);

		static Operation illarg_3_11(Prolog* m);

		static Operation illarg_3_12(Prolog* m);

		static Operation illarg_3_13(Prolog* m);

		/** PREDICATE: $dummy_22_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_$dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_static_exec(Prolog* m);

	private:
		static Operation $dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_sub_1(Prolog* m);

		static Operation $dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_1(Prolog* m);

		static Operation $dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_2(Prolog* m);

		/** PREDICATE: $dummy_23_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/6
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5, arg6;

	public:
		static Operation PRED_$dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec(Prolog* m);

	private:
		static Operation $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_1(Prolog* m);

		static Operation $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_2(Prolog* m);

		static Operation $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_1(Prolog* m);

		static Operation $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_2(Prolog* m);

		static Operation $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_3(Prolog* m);

		/** PREDICATE: $dummy_24_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_$dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_static_exec(Prolog* m);

	private:
		static Operation $dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_sub_1(Prolog* m);

		static Operation $dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_1(Prolog* m);

		static Operation $dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_2(Prolog* m);

		/** PREDICATE: $match_type/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$match_type_2_s1;
	public:
		static SymbolTerm* const  ATOM_variable;
		static SymbolTerm* const  ATOM_byte;
		static IntegerTerm* const  int_255;
		static SymbolTerm* const  ATOM_in_byte;
		static IntegerTerm* const  int_neg1;
		static SymbolTerm* const  ATOM_character;
		static SymbolTerm* const  ATOM_in_character;
		static SymbolTerm* const  ATOM_number;
		static SymbolTerm* const  ATOM_long;
		static SymbolTerm* const  ATOM_float;
		static SymbolTerm* const  ATOM_compound;
		static SymbolTerm* const  ATOM_list;
		static SymbolTerm* const  ATOM_java;
		static SymbolTerm* const  ATOM_stream;
		static SymbolTerm* const  ATOM_java$002Eio$002EPushbackReader;
		static SymbolTerm* const  ATOM_java$002Eio$002EPrintWriter;
		static SymbolTerm* const  ATOM_stream_or_alias;
		static SymbolTerm* const  ATOM_hash;
		static SymbolTerm* const  ATOM_SxxMachine$002EHashtableOfTerm;
		static SymbolTerm* const  ATOM_hash_or_alias;

		static Operation PRED_$match_type_2_static_exec(Prolog* m);

	private:
		static Operation $match_type_2_top(Prolog* m);

		static Operation $match_type_2_var(Prolog* m);

		static Operation $match_type_2_var_1(Prolog* m);

		static Operation $match_type_2_var_2(Prolog* m);

		static Operation $match_type_2_var_3(Prolog* m);

		static Operation $match_type_2_var_4(Prolog* m);

		static Operation $match_type_2_var_5(Prolog* m);

		static Operation $match_type_2_var_6(Prolog* m);

		static Operation $match_type_2_var_7(Prolog* m);

		static Operation $match_type_2_var_8(Prolog* m);

		static Operation $match_type_2_var_9(Prolog* m);

		static Operation $match_type_2_var_10(Prolog* m);

		static Operation $match_type_2_var_11(Prolog* m);

		static Operation $match_type_2_var_12(Prolog* m);

		static Operation $match_type_2_var_13(Prolog* m);

		static Operation $match_type_2_var_14(Prolog* m);

		static Operation $match_type_2_var_15(Prolog* m);

		static Operation $match_type_2_var_16(Prolog* m);

		static Operation $match_type_2_var_17(Prolog* m);

		static Operation $match_type_2_var_18(Prolog* m);

		static Operation $match_type_2_var_19(Prolog* m);

		static Operation $match_type_2_var_20(Prolog* m);

		static Operation $match_type_2_var_21(Prolog* m);

		static Operation $match_type_2_var_22(Prolog* m);

		static Operation $match_type_2_var_23(Prolog* m);

		static Operation $match_type_2_var_24(Prolog* m);

		static Operation $match_type_2_1(Prolog* m);

		static Operation $match_type_2_2(Prolog* m);

		static Operation $match_type_2_3(Prolog* m);

		static Operation $match_type_2_4(Prolog* m);

		static Operation $match_type_2_5(Prolog* m);

		static Operation $match_type_2_6(Prolog* m);

		static Operation $match_type_2_7(Prolog* m);

		static Operation $match_type_2_8(Prolog* m);

		static Operation $match_type_2_9(Prolog* m);

		static Operation $match_type_2_10(Prolog* m);

		static Operation $match_type_2_11(Prolog* m);

		static Operation $match_type_2_12(Prolog* m);

		static Operation $match_type_2_13(Prolog* m);

		static Operation $match_type_2_14(Prolog* m);

		static Operation $match_type_2_15(Prolog* m);

		static Operation $match_type_2_16(Prolog* m);

		static Operation $match_type_2_17(Prolog* m);

		static Operation $match_type_2_18(Prolog* m);

		static Operation $match_type_2_19(Prolog* m);

		static Operation $match_type_2_20(Prolog* m);

		static Operation $match_type_2_21(Prolog* m);

		static Operation $match_type_2_22(Prolog* m);

		static Operation $match_type_2_23(Prolog* m);

		static Operation $match_type_2_24(Prolog* m);

		static Operation $match_type_2_25(Prolog* m);

		/** PREDICATE: $dummy_25_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_s1;

	public:
		static Operation PRED_$dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog* m);

		static Operation $dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog* m);

		/** PREDICATE: $builtin_append/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static SymbolTerm* const  PRED_$builtin_append_3_s1;

	public:
		static Operation PRED_$builtin_append_3_static_exec(Prolog* m);

	private:
		static Operation $builtin_append_3_top(Prolog* m);

		static Operation $builtin_append_3_var(Prolog* m);

		static Operation $builtin_append_3_var_1(Prolog* m);

		static Operation $builtin_append_3_1(Prolog* m);

		static Operation $builtin_append_3_2(Prolog* m);

		/** PREDICATE: $member_in_reverse/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$member_in_reverse_2_static_exec(Prolog* m);

	private:
		static Operation $member_in_reverse_2_top(Prolog* m);

		static Operation $member_in_reverse_2_sub_1(Prolog* m);

		static Operation $member_in_reverse_2_1(Prolog* m);

		static Operation $member_in_reverse_2_2(Prolog* m);

		/** PREDICATE: $dummy_26_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: $dummy_27_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_27_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_27_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_27_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_27_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: with_mutex/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
		static StructureTerm* const  PRED_with_mutex_2_s4;
		static StructureTerm* const  PRED_with_mutex_2_s11;

	public:
		static Operation PRED_with_mutex_2_static_exec(Prolog* m);

	private:
		static Operation with_mutex_2_sub_1(Prolog* m);

		static Operation with_mutex_2_sub_2(Prolog* m);

		static Operation with_mutex_2_sub_3(Prolog* m);

		static Operation with_mutex_2_1(Prolog* m);

		static Operation with_mutex_2_2(Prolog* m);

		static Operation with_mutex_2_3(Prolog* m);

		static Operation with_mutex_2_4(Prolog* m);

		/** PREDICATE: $dummy_28_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_$dummy_28_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_28_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_28_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog* m);

		static Operation $dummy_28_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog* m);

		/** PREDICATE: java_constructor/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_java_constructor_2_static_exec(Prolog* m);

		/** PREDICATE: java_declared_constructor/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_java_declared_constructor_2_static_exec(Prolog* m);

		/** PREDICATE: java_method/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_java_method_3_static_exec(Prolog* m);

		/** PREDICATE: java_declared_method/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_java_declared_method_3_static_exec(Prolog* m);

		/** PREDICATE: java_get_field/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_java_get_field_3_static_exec(Prolog* m);

		/** PREDICATE: java_get_declared_field/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_java_get_declared_field_3_static_exec(Prolog* m);

		/** PREDICATE: java_set_field/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_java_set_field_3_static_exec(Prolog* m);

		/** PREDICATE: java_set_declared_field/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

		static Operation PRED_java_set_declared_field_3_static_exec(Prolog* m);

		/** PREDICATE: builtin_java_convert_args/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_builtin_java_convert_args_2_s1;

	public:
		static Operation PRED_builtin_java_convert_args_2_static_exec(Prolog* m);

	private:
		static Operation builtin_java_convert_args_2_var(Prolog* m);

		static Operation builtin_java_convert_args_2_var_1(Prolog* m);

		static Operation builtin_java_convert_args_2_1(Prolog* m);

		static Operation builtin_java_convert_args_2_2(Prolog* m);

		/** PREDICATE: synchronized/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/

	public:
		static Operation PRED_synchronized_2_static_exec(Prolog* m);

		/** PREDICATE: $init/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/builtins.pl
		*/
	private:
		static SymbolTerm* const  PRED_$init_0_s1;
	public:
		static SymbolTerm* const  ATOM_$0024tokens;
	private:
		static StructureTerm* const  PRED_$init_0_s6;
	public:
		static SymbolTerm* const  ATOM_$003A$002D;
	private:
		static StructureTerm* const  PRED_$init_0_s14;
		static StructureTerm* const  PRED_$init_0_s17;
		static StructureTerm* const  PRED_$init_0_s19;
	public:
		static SymbolTerm* const  ATOM_$002D$002D$003E;
	private:
		static StructureTerm* const  PRED_$init_0_s22;
		static StructureTerm* const  PRED_$init_0_s24;
		static StructureTerm* const  PRED_$init_0_s26;
		static StructureTerm* const  PRED_$init_0_s29;
		static StructureTerm* const  PRED_$init_0_s31;
		static StructureTerm* const  PRED_$init_0_s33;
	public:
		static SymbolTerm* const  ATOM_$003F$002D;
	private:
		static StructureTerm* const  PRED_$init_0_s36;
		static StructureTerm* const  PRED_$init_0_s38;
		static StructureTerm* const  PRED_$init_0_s40;
	public:
		static IntegerTerm* const  int_1150;
		static SymbolTerm* const  ATOM_package;
	private:
		static StructureTerm* const  PRED_$init_0_s44;
		static StructureTerm* const  PRED_$init_0_s46;
		static StructureTerm* const  PRED_$init_0_s48;
	public:
		static SymbolTerm* const  ATOM_import;
	private:
		static StructureTerm* const  PRED_$init_0_s51;
		static StructureTerm* const  PRED_$init_0_s53;
		static StructureTerm* const  PRED_$init_0_s55;
	public:
		static SymbolTerm* const  ATOM_include;
	private:
		static StructureTerm* const  PRED_$init_0_s58;
		static StructureTerm* const  PRED_$init_0_s60;
		static StructureTerm* const  PRED_$init_0_s62;
	public:
		static SymbolTerm* const  ATOM_include_resource;
	private:
		static StructureTerm* const  PRED_$init_0_s65;
		static StructureTerm* const  PRED_$init_0_s67;
		static StructureTerm* const  PRED_$init_0_s69;
	public:
		static SymbolTerm* const  ATOM_constant;
	private:
		static StructureTerm* const  PRED_$init_0_s72;
		static StructureTerm* const  PRED_$init_0_s74;
		static StructureTerm* const  PRED_$init_0_s76;
	public:
		static SymbolTerm* const  ATOM_public;
	private:
		static StructureTerm* const  PRED_$init_0_s79;
		static StructureTerm* const  PRED_$init_0_s81;
		static StructureTerm* const  PRED_$init_0_s83;
	public:
		static SymbolTerm* const  ATOM_dynamic;
	private:
		static StructureTerm* const  PRED_$init_0_s86;
		static StructureTerm* const  PRED_$init_0_s88;
		static StructureTerm* const  PRED_$init_0_s90;
	public:
		static SymbolTerm* const  ATOM_meta_predicate;
	private:
		static StructureTerm* const  PRED_$init_0_s93;
		static StructureTerm* const  PRED_$init_0_s95;
		static StructureTerm* const  PRED_$init_0_s97;
	public:
		static SymbolTerm* const  ATOM_mode;
	private:
		static StructureTerm* const  PRED_$init_0_s100;
		static StructureTerm* const  PRED_$init_0_s102;
		static StructureTerm* const  PRED_$init_0_s104;
	public:
		static SymbolTerm* const  ATOM_multifile;
	private:
		static StructureTerm* const  PRED_$init_0_s107;
		static StructureTerm* const  PRED_$init_0_s109;
		static StructureTerm* const  PRED_$init_0_s111;
	public:
		static SymbolTerm* const  ATOM_block;
	private:
		static StructureTerm* const  PRED_$init_0_s114;
		static StructureTerm* const  PRED_$init_0_s116;
		static StructureTerm* const  PRED_$init_0_s118;
	public:
		static SymbolTerm* const  ATOM_ifdef;
	private:
		static StructureTerm* const  PRED_$init_0_s121;
		static StructureTerm* const  PRED_$init_0_s123;
		static StructureTerm* const  PRED_$init_0_s125;
	public:
		static SymbolTerm* const  ATOM_ifndef;
	private:
		static StructureTerm* const  PRED_$init_0_s128;
		static StructureTerm* const  PRED_$init_0_s130;
		static StructureTerm* const  PRED_$init_0_s132;
	public:
		static SymbolTerm* const  ATOM_domain;
	private:
		static StructureTerm* const  PRED_$init_0_s135;
		static StructureTerm* const  PRED_$init_0_s137;
		static StructureTerm* const  PRED_$init_0_s139;
	public:
		static SymbolTerm* const  ATOM_database;
	private:
		static StructureTerm* const  PRED_$init_0_s142;
		static StructureTerm* const  PRED_$init_0_s144;
		static StructureTerm* const  PRED_$init_0_s146;
	public:
		static IntegerTerm* const  int_1100;
	private:
		static StructureTerm* const  PRED_$init_0_s151;
		static StructureTerm* const  PRED_$init_0_s153;
		static StructureTerm* const  PRED_$init_0_s155;
	public:
		static IntegerTerm* const  int_1050;
		static SymbolTerm* const  ATOM_$002D$003E;
	private:
		static StructureTerm* const  PRED_$init_0_s159;
		static StructureTerm* const  PRED_$init_0_s161;
		static StructureTerm* const  PRED_$init_0_s163;
	public:
		static IntegerTerm* const  int_1000;
	private:
		static StructureTerm* const  PRED_$init_0_s167;
		static StructureTerm* const  PRED_$init_0_s169;
		static StructureTerm* const  PRED_$init_0_s171;
	public:
		static IntegerTerm* const  int_900;
	private:
		static StructureTerm* const  PRED_$init_0_s176;
		static StructureTerm* const  PRED_$init_0_s178;
		static StructureTerm* const  PRED_$init_0_s180;
	public:
		static IntegerTerm* const  int_700;
	private:
		static StructureTerm* const  PRED_$init_0_s184;
		static StructureTerm* const  PRED_$init_0_s186;
		static StructureTerm* const  PRED_$init_0_s188;
	public:
		static SymbolTerm* const  ATOM_$005C$003D;
	private:
		static StructureTerm* const  PRED_$init_0_s191;
		static StructureTerm* const  PRED_$init_0_s193;
		static StructureTerm* const  PRED_$init_0_s195;
	public:
		static SymbolTerm* const  ATOM_termequal;
	private:
		static StructureTerm* const  PRED_$init_0_s198;
		static StructureTerm* const  PRED_$init_0_s200;
		static StructureTerm* const  PRED_$init_0_s202;
	public:
		static SymbolTerm* const  ATOM_$005C$003D$003D;
	private:
		static StructureTerm* const  PRED_$init_0_s205;
		static StructureTerm* const  PRED_$init_0_s207;
		static StructureTerm* const  PRED_$init_0_s209;
	public:
		static SymbolTerm* const  ATOM_termsmallerthan;
	private:
		static StructureTerm* const  PRED_$init_0_s212;
		static StructureTerm* const  PRED_$init_0_s214;
		static StructureTerm* const  PRED_$init_0_s216;
	public:
		static SymbolTerm* const  ATOM_termgreaterthan;
	private:
		static StructureTerm* const  PRED_$init_0_s219;
		static StructureTerm* const  PRED_$init_0_s221;
		static StructureTerm* const  PRED_$init_0_s223;
	public:
		static SymbolTerm* const  ATOM_termsmallerequal;
	private:
		static StructureTerm* const  PRED_$init_0_s226;
		static StructureTerm* const  PRED_$init_0_s228;
		static StructureTerm* const  PRED_$init_0_s230;
	public:
		static SymbolTerm* const  ATOM_termgreaterequal;
	private:
		static StructureTerm* const  PRED_$init_0_s233;
		static StructureTerm* const  PRED_$init_0_s235;
		static StructureTerm* const  PRED_$init_0_s237;
	public:
		static SymbolTerm* const  ATOM_$003D$002E$002E;
	private:
		static StructureTerm* const  PRED_$init_0_s240;
		static StructureTerm* const  PRED_$init_0_s242;
		static StructureTerm* const  PRED_$init_0_s244;
	public:
		static SymbolTerm* const  ATOM_is;
	private:
		static StructureTerm* const  PRED_$init_0_s247;
		static StructureTerm* const  PRED_$init_0_s249;
		static StructureTerm* const  PRED_$init_0_s251;
	public:
		static SymbolTerm* const  ATOM_arithequal;
	private:
		static StructureTerm* const  PRED_$init_0_s254;
		static StructureTerm* const  PRED_$init_0_s256;
		static StructureTerm* const  PRED_$init_0_s258;
	public:
		static SymbolTerm* const  ATOM_$003D$005C$003D;
	private:
		static StructureTerm* const  PRED_$init_0_s261;
		static StructureTerm* const  PRED_$init_0_s263;
		static StructureTerm* const  PRED_$init_0_s265;
		static StructureTerm* const  PRED_$init_0_s268;
		static StructureTerm* const  PRED_$init_0_s270;
		static StructureTerm* const  PRED_$init_0_s272;
		static StructureTerm* const  PRED_$init_0_s275;
		static StructureTerm* const  PRED_$init_0_s277;
		static StructureTerm* const  PRED_$init_0_s279;
	public:
		static SymbolTerm* const  ATOM_smallerorequal;
	private:
		static StructureTerm* const  PRED_$init_0_s282;
		static StructureTerm* const  PRED_$init_0_s284;
		static StructureTerm* const  PRED_$init_0_s286;
	public:
		static SymbolTerm* const  ATOM_greaterorequal;
	private:
		static StructureTerm* const  PRED_$init_0_s289;
		static StructureTerm* const  PRED_$init_0_s291;
		static StructureTerm* const  PRED_$init_0_s293;
	public:
		static IntegerTerm* const  int_550;
	private:
		static StructureTerm* const  PRED_$init_0_s297;
		static StructureTerm* const  PRED_$init_0_s299;
		static StructureTerm* const  PRED_$init_0_s301;
	public:
		static IntegerTerm* const  int_500;
		static SymbolTerm* const  ATOM_$002B;
	private:
		static StructureTerm* const  PRED_$init_0_s306;
		static StructureTerm* const  PRED_$init_0_s308;
		static StructureTerm* const  PRED_$init_0_s310;
		static StructureTerm* const  PRED_$init_0_s313;
		static StructureTerm* const  PRED_$init_0_s315;
		static StructureTerm* const  PRED_$init_0_s317;
	public:
		static SymbolTerm* const  ATOM_$0023;
	private:
		static StructureTerm* const  PRED_$init_0_s320;
		static StructureTerm* const  PRED_$init_0_s322;
		static StructureTerm* const  PRED_$init_0_s324;
	public:
		static SymbolTerm* const  ATOM_$002F$005C;
	private:
		static StructureTerm* const  PRED_$init_0_s327;
		static StructureTerm* const  PRED_$init_0_s329;
		static StructureTerm* const  PRED_$init_0_s331;
	public:
		static SymbolTerm* const  ATOM_$005C$002F;
	private:
		static StructureTerm* const  PRED_$init_0_s334;
		static StructureTerm* const  PRED_$init_0_s336;
		static StructureTerm* const  PRED_$init_0_s338;
		static StructureTerm* const  PRED_$init_0_s340;
		static StructureTerm* const  PRED_$init_0_s342;
		static StructureTerm* const  PRED_$init_0_s344;
	public:
		static IntegerTerm* const  int_400;
		static SymbolTerm* const  ATOM_$002A;
	private:
		static StructureTerm* const  PRED_$init_0_s348;
		static StructureTerm* const  PRED_$init_0_s350;
		static StructureTerm* const  PRED_$init_0_s352;
	public:
		static SymbolTerm* const  ATOM_$002F;
	private:
		static StructureTerm* const  PRED_$init_0_s355;
		static StructureTerm* const  PRED_$init_0_s357;
		static StructureTerm* const  PRED_$init_0_s359;
	public:
		static SymbolTerm* const  ATOM_$002F$002F;
	private:
		static StructureTerm* const  PRED_$init_0_s362;
		static StructureTerm* const  PRED_$init_0_s364;
		static StructureTerm* const  PRED_$init_0_s366;
	public:
		static SymbolTerm* const  ATOM_mod;
	private:
		static StructureTerm* const  PRED_$init_0_s369;
		static StructureTerm* const  PRED_$init_0_s371;
		static StructureTerm* const  PRED_$init_0_s373;
	public:
		static SymbolTerm* const  ATOM_rem;
	private:
		static StructureTerm* const  PRED_$init_0_s376;
		static StructureTerm* const  PRED_$init_0_s378;
		static StructureTerm* const  PRED_$init_0_s380;
	public:
		static SymbolTerm* const  ATOM_$003C$003C;
	private:
		static StructureTerm* const  PRED_$init_0_s383;
		static StructureTerm* const  PRED_$init_0_s385;
		static StructureTerm* const  PRED_$init_0_s387;
	public:
		static SymbolTerm* const  ATOM_$003E$003E;
	private:
		static StructureTerm* const  PRED_$init_0_s390;
		static StructureTerm* const  PRED_$init_0_s392;
		static StructureTerm* const  PRED_$init_0_s394;
	public:
		static IntegerTerm* const  int_300;
		static SymbolTerm* const  ATOM_$007E;
	private:
		static StructureTerm* const  PRED_$init_0_s398;
		static StructureTerm* const  PRED_$init_0_s400;
		static StructureTerm* const  PRED_$init_0_s402;
	public:
		static IntegerTerm* const  int_200;
		static SymbolTerm* const  ATOM_$002A$002A;
	private:
		static StructureTerm* const  PRED_$init_0_s406;
		static StructureTerm* const  PRED_$init_0_s408;
		static StructureTerm* const  PRED_$init_0_s410;
	public:
		static SymbolTerm* const  ATOM_$005E;
	private:
		static StructureTerm* const  PRED_$init_0_s413;
		static StructureTerm* const  PRED_$init_0_s415;
		static StructureTerm* const  PRED_$init_0_s417;
	public:
		static SymbolTerm* const  ATOM_$005C;
	private:
		static StructureTerm* const  PRED_$init_0_s420;
		static StructureTerm* const  PRED_$init_0_s422;
		static StructureTerm* const  PRED_$init_0_s424;
		static StructureTerm* const  PRED_$init_0_s426;
		static StructureTerm* const  PRED_$init_0_s428;
		static StructureTerm* const  PRED_$init_0_s430;
	public:
		static SymbolTerm* const  ATOM_$0024consulted_file;
	private:
		static StructureTerm* const  PRED_$init_0_s433;
	public:
		static SymbolTerm* const  ATOM_$0024consulted_import;
	private:
		static StructureTerm* const  PRED_$init_0_s437;
	public:
		static SymbolTerm* const  ATOM_$0024consulted_package;
	private:
		static StructureTerm* const  PRED_$init_0_s440;
	public:
		static SymbolTerm* const  ATOM_$0024consulted_predicate;
	private:
		static StructureTerm* const  PRED_$init_0_s444;

		static Operation PRED_$init_0_static_exec(Prolog* m);

		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static FILE_builtins::StaticConstructor staticConstructor;


	public:
		static void loadPreds();
	};

}


#endif	//#ifndef FILE_BUILTINS
