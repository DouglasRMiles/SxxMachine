#ifndef FILE_CAFETERIA
#define FILE_CAFETERIA

#include "../../machine/SxxMachine/TermData.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class IntegerTerm; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class ListTerm; }

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$call_internal_5_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$clause_internal_5_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$equality_of_term_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$greater_than_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$inequality_of_term_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$meta_call_5_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$new_indexing_hash_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$new_internal_database_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$term_to_predicateindicator_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_abort_0_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_assertz_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_call_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_clause_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_consult_stream_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_current_prolog_flag_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_illarg_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_numbervars_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_on_exception_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_read_line_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_read_with_variables_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_repeat_0_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_retract_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_retractall_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_set_prolog_flag_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_statistics_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_sub_atom_5_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_write_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_write_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_writeq_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_io.PRED_close_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_io.PRED_flush_output_0_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_io.PRED_nl_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_io.PRED_open_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_io.PRED_stream_property_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_io.PRED_tab_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_swi_supp.PRED_context_module_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_swi_supp.PRED_typein_module_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.fail_0;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$builtin_member_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$fast_write_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$fast_write_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$get_current_B_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$print_stack_trace_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$write_toString_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_atom_concat_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_flush_output_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_functor_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_hash_keys_2_static_exec;
	class FILE_cafeteria : public TermData
	{
	/** PREDICATE: cafeteria/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_cafeteria_0_s1;
		public:
			static SymbolTerm* const  ATOM_end_of_file;
			static SymbolTerm* const  ATOM_bye;




		static Operation PRED_cafeteria_0_static_exec(Prolog* m);
	/** PREDICATE: $cafeteria_init/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_$cafeteria_init_0_s1;
		public:
			static SymbolTerm* const  ATOM_$0024leap_flag;
			static IntegerTerm* const  int_1;
	private:
		static StructureTerm* const  PRED_$cafeteria_init_0_s6;
		public:
			static SymbolTerm* const  ATOM_$0024current_spypoint;
			static IntegerTerm* const  int_3;
	private:
		static StructureTerm* const  PRED_$cafeteria_init_0_s10;
		public:
			static SymbolTerm* const  ATOM_$0024current_leash;
	private:
		static StructureTerm* const  PRED_$cafeteria_init_0_s13;
		public:
			static SymbolTerm* const  ATOM_no;
	private:
		static StructureTerm* const  PRED_$cafeteria_init_0_s23;
		static StructureTerm* const  PRED_$cafeteria_init_0_s25;
		public:
			static SymbolTerm* const  ATOM_call;
	private:
		static StructureTerm* const  PRED_$cafeteria_init_0_s28;
		static StructureTerm* const  PRED_$cafeteria_init_0_s30;
		public:
			static SymbolTerm* const  ATOM_exit;
	private:
		static StructureTerm* const  PRED_$cafeteria_init_0_s33;
		static StructureTerm* const  PRED_$cafeteria_init_0_s35;
		public:
			static SymbolTerm* const  ATOM_redo;
	private:
		static StructureTerm* const  PRED_$cafeteria_init_0_s38;
		static StructureTerm* const  PRED_$cafeteria_init_0_s40;
		public:
			static SymbolTerm* const  ATOM_fail;
	private:
		static StructureTerm* const  PRED_$cafeteria_init_0_s43;
		static StructureTerm* const  PRED_$cafeteria_init_0_s45;




	public:
		static Operation PRED_$cafeteria_init_0_static_exec(Prolog* m);
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_s1;
		public:
			static SymbolTerm* const  ATOM_info;
			static SymbolTerm* const  ATOM_debug;
	private:
		static ListTerm* const  PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_s5;




	public:
		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_s1;




	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_2(Prolog* m);
	/** PREDICATE: $toplvel_loop/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$toplvel_loop_0_s1;
		public:
			static SymbolTerm* const  ATOM_$007C$0020$003F$002D$0020;




		static Operation PRED_$toplvel_loop_0_static_exec(Prolog* m);
	/** PREDICATE: $cafeteria/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/




		static Operation PRED_$cafeteria_1_static_exec(Prolog* m);
	/** PREDICATE: $process_order/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_$process_order_2_s1;
		public:
			static SymbolTerm* const  ATOM_yes;




		static Operation PRED_$process_order_2_static_exec(Prolog* m);

	private:
		static Operation $process_order_2_var(Prolog* m);

		static Operation $process_order_2_var_1(Prolog* m);

		static Operation $process_order_2_var_2(Prolog* m);

		static Operation $process_order_2_var_3(Prolog* m);

		static Operation $process_order_2_var_4(Prolog* m);

		static Operation $process_order_2_int(Prolog* m);

		static Operation $process_order_2_int_1(Prolog* m);

		static Operation $process_order_2_int_2(Prolog* m);

		static Operation $process_order_2_con(Prolog* m);

		static Operation $process_order_2_con_1(Prolog* m);

		static Operation $process_order_2_con_2(Prolog* m);

		static Operation $process_order_2_con_3(Prolog* m);

		static Operation $process_order_2_lis(Prolog* m);

		static Operation $process_order_2_lis_1(Prolog* m);

		static Operation $process_order_2_lis_2(Prolog* m);

		static Operation $process_order_2_lis_3(Prolog* m);

		static Operation $process_order_2_1(Prolog* m);

		static Operation $process_order_2_2(Prolog* m);

		static Operation $process_order_2_3(Prolog* m);

		static Operation $process_order_2_4(Prolog* m);

		static Operation $process_order_2_5(Prolog* m);
	/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_s1;




	public:
		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_2(Prolog* m);
	/** PREDICATE: $rm_redundant_vars/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$rm_redundant_vars_2_s1;
		public:
			static SymbolTerm* const  ATOM__;




		static Operation PRED_$rm_redundant_vars_2_static_exec(Prolog* m);

	private:
		static Operation $rm_redundant_vars_2_top(Prolog* m);

		static Operation $rm_redundant_vars_2_var(Prolog* m);

		static Operation $rm_redundant_vars_2_var_1(Prolog* m);

		static Operation $rm_redundant_vars_2_var_2(Prolog* m);

		static Operation $rm_redundant_vars_2_lis(Prolog* m);

		static Operation $rm_redundant_vars_2_lis_1(Prolog* m);

		static Operation $rm_redundant_vars_2_1(Prolog* m);

		static Operation $rm_redundant_vars_2_2(Prolog* m);

		static Operation $rm_redundant_vars_2_3(Prolog* m);
	/** PREDICATE: $give_answers_with_prompt/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$give_answers_with_prompt_1_s1;
		public:
			static SymbolTerm* const  ATOM_$0020$003F$0020;
			static IntegerTerm* const  int_59;
	private:
		static ListTerm* const  PRED_$give_answers_with_prompt_1_s4;




	public:
		static Operation PRED_$give_answers_with_prompt_1_static_exec(Prolog* m);

	private:
		static Operation $give_answers_with_prompt_1_var(Prolog* m);

		static Operation $give_answers_with_prompt_1_var_1(Prolog* m);

		static Operation $give_answers_with_prompt_1_1(Prolog* m);

		static Operation $give_answers_with_prompt_1_2(Prolog* m);
	/** PREDICATE: $give_an_answer/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$give_an_answer_1_s1;
		public:
			static SymbolTerm* const  ATOM_$002C;




		static Operation PRED_$give_an_answer_1_static_exec(Prolog* m);

	private:
		static Operation $give_an_answer_1_var(Prolog* m);

		static Operation $give_an_answer_1_var_1(Prolog* m);

		static Operation $give_an_answer_1_var_2(Prolog* m);

		static Operation $give_an_answer_1_lis(Prolog* m);

		static Operation $give_an_answer_1_lis_1(Prolog* m);

		static Operation $give_an_answer_1_1(Prolog* m);

		static Operation $give_an_answer_1_2(Prolog* m);

		static Operation $give_an_answer_1_3(Prolog* m);
	/** PREDICATE: $print_an answer/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		public:
			static SymbolTerm* const  ATOM_$0020$003D$0020;




		static Operation PRED_$print_an$0020answer_1_static_exec(Prolog* m);
	/** PREDICATE: consult/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_consult_1_s1;




	public:
		static Operation PRED_consult_1_static_exec(Prolog* m);

	private:
		static Operation consult_1_top(Prolog* m);

		static Operation consult_1_var(Prolog* m);

		static Operation consult_1_var_1(Prolog* m);

		static Operation consult_1_var_2(Prolog* m);

		static Operation consult_1_var_3(Prolog* m);

		static Operation consult_1_int(Prolog* m);

		static Operation consult_1_int_1(Prolog* m);

		static Operation consult_1_con(Prolog* m);

		static Operation consult_1_con_1(Prolog* m);

		static Operation consult_1_con_2(Prolog* m);

		static Operation consult_1_lis(Prolog* m);

		static Operation consult_1_lis_1(Prolog* m);

		static Operation consult_1_lis_2(Prolog* m);

		static Operation consult_1_1(Prolog* m);

		static Operation consult_1_2(Prolog* m);

		static Operation consult_1_3(Prolog* m);

		static Operation consult_1_4(Prolog* m);
	/** PREDICATE: $consult/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$consult_1_s1;
		public:
			static SymbolTerm* const  ATOM_consulting;
			static SymbolTerm* const  ATOM_$002E$002E$002E;
	private:
		static ListTerm* const  PRED_$consult_1_s7;
		public:
			static SymbolTerm* const  ATOM_runtime;
			static SymbolTerm* const  ATOM_consulted;
			static SymbolTerm* const  ATOM_msec;
	private:
		static ListTerm* const  PRED_$consult_1_s11;




	public:
		static Operation PRED_$consult_1_static_exec(Prolog* m);
	/** PREDICATE: $prolog_file_name/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_$prolog_file_name_2_s1;
		public:
			static IntegerTerm* const  int_0;
			static SymbolTerm* const  ATOM_$002Epl;




		static Operation PRED_$prolog_file_name_2_static_exec(Prolog* m);

	private:
		static Operation $prolog_file_name_2_sub_1(Prolog* m);

		static Operation $prolog_file_name_2_1(Prolog* m);

		static Operation $prolog_file_name_2_2(Prolog* m);
	/** PREDICATE: trace/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_trace_0_s1;
		public:
			static SymbolTerm* const  ATOM_on;
			static SymbolTerm* const  ATOM_$007BSmall$0020debugger$0020is$0020switch$0020on$007D;




		static Operation PRED_trace_0_static_exec(Prolog* m);

	private:
		static Operation trace_0_sub_1(Prolog* m);

		static Operation trace_0_1(Prolog* m);

		static Operation trace_0_2(Prolog* m);
	/** PREDICATE: $trace_init/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		public:
			static SymbolTerm* const  ATOM_SxxMachine$002Ebuiltin;
	private:
		static StructureTerm* const  PRED_$trace_init_0_s8;
		static StructureTerm* const  PRED_$trace_init_0_s10;
		static StructureTerm* const  PRED_$trace_init_0_s13;
		static StructureTerm* const  PRED_$trace_init_0_s15;
		static StructureTerm* const  PRED_$trace_init_0_s18;
		static StructureTerm* const  PRED_$trace_init_0_s20;
		static StructureTerm* const  PRED_$trace_init_0_s23;
		static StructureTerm* const  PRED_$trace_init_0_s25;
		static StructureTerm* const  PRED_$trace_init_0_s28;
		static StructureTerm* const  PRED_$trace_init_0_s30;




	public:
		static Operation PRED_$trace_init_0_static_exec(Prolog* m);
	/** PREDICATE: notrace/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_notrace_0_s1;
		public:
			static SymbolTerm* const  ATOM_off;
			static SymbolTerm* const  ATOM_$007BSmall$0020debugger$0020is$0020switch$0020off$007D;




		static Operation PRED_notrace_0_static_exec(Prolog* m);

	private:
		static Operation notrace_0_sub_1(Prolog* m);

		static Operation notrace_0_1(Prolog* m);

		static Operation notrace_0_2(Prolog* m);
	/** PREDICATE: debug/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/




	public:
		static Operation PRED_debug_0_static_exec(Prolog* m);
	/** PREDICATE: nodebug/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/




		static Operation PRED_nodebug_0_static_exec(Prolog* m);
	/** PREDICATE: $trace_goal/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_$trace_goal_1_s1;
		public:
			static SymbolTerm* const  ATOM_trace;




		static Operation PRED_$trace_goal_1_static_exec(Prolog* m);
	/** PREDICATE: $trace_goal/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_$trace_goal_4_s1;




	public:
		static Operation PRED_$trace_goal_4_static_exec(Prolog* m);

	private:
		static Operation $trace_goal_4_sub_1(Prolog* m);

		static Operation $trace_goal_4_1(Prolog* m);

		static Operation $trace_goal_4_2(Prolog* m);
	/** PREDICATE: print_procedure_box/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		public:
			static SymbolTerm* const  ATOM_$002B;
			static SymbolTerm* const  ATOM_module_colon;
	private:
		static StructureTerm* const  PRED_print_procedure_box_5_s12;
		static StructureTerm* const  PRED_print_procedure_box_5_s14;
		public:
			static SymbolTerm* const  ATOM_$0020;

		// private final Term arg5;




		static Operation PRED_print_procedure_box_5_static_exec(Prolog* m);

	private:
		static Operation print_procedure_box_5_sub_1(Prolog* m);

		static Operation print_procedure_box_5_sub_2(Prolog* m);

		static Operation print_procedure_box_5_1(Prolog* m);

		static Operation print_procedure_box_5_2(Prolog* m);

		static Operation print_procedure_box_5_3(Prolog* m);
	/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/

		// private final Term arg5, arg6;




	public:
		static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_static_exec(Prolog* m);

	private:
		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_sub_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_2(Prolog* m);
	/** PREDICATE: redo_procedure_box/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_redo_procedure_box_4_s1;




	public:
		static Operation PRED_redo_procedure_box_4_static_exec(Prolog* m);

	private:
		static Operation redo_procedure_box_4_sub_1(Prolog* m);

		static Operation redo_procedure_box_4_1(Prolog* m);

		static Operation redo_procedure_box_4_2(Prolog* m);
	/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_s1;
		public:
			static IntegerTerm* const  int_99;




		static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_2(Prolog* m);
	/** PREDICATE: $read_blocked/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$read_blocked_1_s1;




	public:
		static Operation PRED_$read_blocked_1_static_exec(Prolog* m);
	/** PREDICATE: $debug_option/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static IntegerTerm* const  PRED_$debug_option_2_s1;
		public:
			static SymbolTerm* const  ATOM_leap;
			static IntegerTerm* const  int_108;
			static IntegerTerm* const  int_43;
			static IntegerTerm* const  int_45;
			static IntegerTerm* const  int_63;
			static IntegerTerm* const  int_104;




		static Operation PRED_$debug_option_2_static_exec(Prolog* m);

	private:
		static Operation $debug_option_2_var(Prolog* m);

		static Operation $debug_option_2_var_1(Prolog* m);

		static Operation $debug_option_2_var_2(Prolog* m);

		static Operation $debug_option_2_var_3(Prolog* m);

		static Operation $debug_option_2_var_4(Prolog* m);

		static Operation $debug_option_2_var_5(Prolog* m);

		static Operation $debug_option_2_var_6(Prolog* m);

		static Operation $debug_option_2_var_7(Prolog* m);

		static Operation $debug_option_2_1(Prolog* m);

		static Operation $debug_option_2_2(Prolog* m);

		static Operation $debug_option_2_3(Prolog* m);

		static Operation $debug_option_2_4(Prolog* m);

		static Operation $debug_option_2_5(Prolog* m);

		static Operation $debug_option_2_6(Prolog* m);

		static Operation $debug_option_2_7(Prolog* m);

		static Operation $debug_option_2_8(Prolog* m);
	/** PREDICATE: $show_debug_option/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static IntegerTerm* const  PRED_$show_debug_option_0_s1;
		public:
			static SymbolTerm* const  ATOM_Debugging$0020options$003A;
			static SymbolTerm* const  ATOM_a$0020$0020$0020$0020$0020$0020abort;
			static SymbolTerm* const  ATOM_RET$0020$0020$0020$0020creep;
			static SymbolTerm* const  ATOM_c$0020$0020$0020$0020$0020$0020creep;
			static SymbolTerm* const  ATOM_l$0020$0020$0020$0020$0020$0020leap;
			static SymbolTerm* const  ATOM_$002B$0020$0020$0020$0020$0020$0020spy$0020this;
			static SymbolTerm* const  ATOM_$002D$0020$0020$0020$0020$0020$0020nospy$0020this;
			static SymbolTerm* const  ATOM_$003F$0020$0020$0020$0020$0020$0020help;
			static SymbolTerm* const  ATOM_h$0020$0020$0020$0020$0020$0020help;




		static Operation PRED_$show_debug_option_0_static_exec(Prolog* m);
	/** PREDICATE: $set_debug_flag/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_$set_debug_flag_2_s1;




	public:
		static Operation PRED_$set_debug_flag_2_static_exec(Prolog* m);

	private:
		static Operation $set_debug_flag_2_var(Prolog* m);

		static Operation $set_debug_flag_2_var_1(Prolog* m);

		static Operation $set_debug_flag_2_1(Prolog* m);

		static Operation $set_debug_flag_2_2(Prolog* m);
	/** PREDICATE: spy/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/




	public:
		static Operation PRED_spy_1_static_exec(Prolog* m);
	/** PREDICATE: $assert_spypoint/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
			static SymbolTerm* const  ATOM_spypoint;
			static SymbolTerm* const  ATOM_is;
			static SymbolTerm* const  ATOM_already;
			static SymbolTerm* const  ATOM_added;
	private:
		static ListTerm* const  PRED_$assert_spypoint_1_s11;
		static ListTerm* const  PRED_$assert_spypoint_1_s12;
		static ListTerm* const  PRED_$assert_spypoint_1_s13;
		static ListTerm* const  PRED_$assert_spypoint_1_s15;
		public:
			static SymbolTerm* const  ATOM_warning;
			static SymbolTerm* const  ATOM_matching;
			static SymbolTerm* const  ATOM_predicate;
			static SymbolTerm* const  ATOM_for;
			static SymbolTerm* const  ATOM_spy;




		static Operation PRED_$assert_spypoint_1_static_exec(Prolog* m);

	private:
		static Operation $assert_spypoint_1_var(Prolog* m);

		static Operation $assert_spypoint_1_var_1(Prolog* m);

		static Operation $assert_spypoint_1_var_2(Prolog* m);

		static Operation $assert_spypoint_1_1(Prolog* m);

		static Operation $assert_spypoint_1_2(Prolog* m);

		static Operation $assert_spypoint_1_3(Prolog* m);
	/** PREDICATE: nospy/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/




	public:
		static Operation PRED_nospy_1_static_exec(Prolog* m);
	/** PREDICATE: $retract_spypoint/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
			static SymbolTerm* const  ATOM_removed;
	private:
		static ListTerm* const  PRED_$retract_spypoint_1_s10;
		static ListTerm* const  PRED_$retract_spypoint_1_s11;




	public:
		static Operation PRED_$retract_spypoint_1_static_exec(Prolog* m);

	private:
		static Operation $retract_spypoint_1_var(Prolog* m);

		static Operation $retract_spypoint_1_var_1(Prolog* m);

		static Operation $retract_spypoint_1_1(Prolog* m);

		static Operation $retract_spypoint_1_2(Prolog* m);
	/** PREDICATE: nospyall/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/




	public:
		static Operation PRED_nospyall_0_static_exec(Prolog* m);
	/** PREDICATE: leash/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
			static SymbolTerm* const  ATOM_leash_specifier;
	private:
		static StructureTerm* const  PRED_leash_1_s4;




	public:
		static Operation PRED_leash_1_static_exec(Prolog* m);

	private:
		static Operation leash_1_sub_1(Prolog* m);

		static Operation leash_1_1(Prolog* m);

		static Operation leash_1_2(Prolog* m);
	/** PREDICATE: $leash/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$leash_1_s1;
		public:
			static SymbolTerm* const  ATOM_leashing;
	private:
		static ListTerm* const  PRED_$leash_1_s8;
		static ListTerm* const  PRED_$leash_1_s9;
		public:
			static SymbolTerm* const  ATOM_stopping;




		static Operation PRED_$leash_1_static_exec(Prolog* m);

	private:
		static Operation $leash_1_var(Prolog* m);

		static Operation $leash_1_var_1(Prolog* m);

		static Operation $leash_1_1(Prolog* m);

		static Operation $leash_1_2(Prolog* m);
	/** PREDICATE: $assert_leash/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$assert_leash_1_s1;




	public:
		static Operation PRED_$assert_leash_1_static_exec(Prolog* m);

	private:
		static Operation $assert_leash_1_var(Prolog* m);

		static Operation $assert_leash_1_var_1(Prolog* m);

		static Operation $assert_leash_1_1(Prolog* m);

		static Operation $assert_leash_1_2(Prolog* m);
	/** PREDICATE: $leash_specifier/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$leash_specifier_1_s1;




	public:
		static Operation PRED_$leash_specifier_1_static_exec(Prolog* m);

	private:
		static Operation $leash_specifier_1_var(Prolog* m);

		static Operation $leash_specifier_1_var_1(Prolog* m);

		static Operation $leash_specifier_1_var_2(Prolog* m);

		static Operation $leash_specifier_1_var_3(Prolog* m);

		static Operation $leash_specifier_1_1(Prolog* m);

		static Operation $leash_specifier_1_2(Prolog* m);

		static Operation $leash_specifier_1_3(Prolog* m);

		static Operation $leash_specifier_1_4(Prolog* m);
	/** PREDICATE: listing/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/




	public:
		static Operation PRED_listing_0_static_exec(Prolog* m);
	/** PREDICATE: listing/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_listing_1_s1;
		public:
			static SymbolTerm* const  ATOM_predicate_indicator;
	private:
		static StructureTerm* const  PRED_listing_1_s9;




	public:
		static Operation PRED_listing_1_static_exec(Prolog* m);

	private:
		static Operation listing_1_var(Prolog* m);

		static Operation listing_1_var_1(Prolog* m);

		static Operation listing_1_var_2(Prolog* m);

		static Operation listing_1_var_3(Prolog* m);

		static Operation listing_1_var_4(Prolog* m);

		static Operation listing_1_int(Prolog* m);

		static Operation listing_1_int_1(Prolog* m);

		static Operation listing_1_int_2(Prolog* m);

		static Operation listing_1_1(Prolog* m);

		static Operation listing_1_2(Prolog* m);

		static Operation listing_1_3(Prolog* m);

		static Operation listing_1_4(Prolog* m);

		static Operation listing_1_5(Prolog* m);
	/** PREDICATE: $listing/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static StructureTerm* const  PRED_$listing_2_s5;




	public:
		static Operation PRED_$listing_2_static_exec(Prolog* m);

	private:
		static Operation $listing_2_var(Prolog* m);

		static Operation $listing_2_var_1(Prolog* m);

		static Operation $listing_2_var_2(Prolog* m);

		static Operation $listing_2_int(Prolog* m);

		static Operation $listing_2_int_1(Prolog* m);

		static Operation $listing_2_1(Prolog* m);

		static Operation $listing_2_2(Prolog* m);

		static Operation $listing_2_3(Prolog* m);
	/** PREDICATE: $listing_dynamic_clause/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/




	public:
		static Operation PRED_$listing_dynamic_clause_2_static_exec(Prolog* m);

	private:
		static Operation $listing_dynamic_clause_2_sub_1(Prolog* m);

		static Operation $listing_dynamic_clause_2_1(Prolog* m);

		static Operation $listing_dynamic_clause_2_2(Prolog* m);
	/** PREDICATE: $write_dynamic_clause/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		public:
			static SymbolTerm* const  ATOM_$002E;
			static SymbolTerm* const  ATOM_$0020$003A$002D;
			static IntegerTerm* const  int_8;




		static Operation PRED_$write_dynamic_clause_2_static_exec(Prolog* m);

	private:
		static Operation $write_dynamic_clause_2_sub_1(Prolog* m);

		static Operation $write_dynamic_clause_2_sub_2(Prolog* m);

		static Operation $write_dynamic_clause_2_1(Prolog* m);

		static Operation $write_dynamic_clause_2_2(Prolog* m);

		static Operation $write_dynamic_clause_2_3(Prolog* m);
	/** PREDICATE: $write_dynamic_head/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$write_dynamic_head_2_s1;




	public:
		static Operation PRED_$write_dynamic_head_2_static_exec(Prolog* m);

	private:
		static Operation $write_dynamic_head_2_sub_1(Prolog* m);

		static Operation $write_dynamic_head_2_1(Prolog* m);

		static Operation $write_dynamic_head_2_2(Prolog* m);
	/** PREDICATE: $write_dynamic_body/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		public:
			static IntegerTerm* const  int_4;
			static SymbolTerm* const  ATOM_$0028;
			static SymbolTerm* const  ATOM_or;
			static SymbolTerm* const  ATOM_$0029;
			static SymbolTerm* const  ATOM_$002D$003E;




		static Operation PRED_$write_dynamic_body_2_static_exec(Prolog* m);

	private:
		static Operation $write_dynamic_body_2_top(Prolog* m);

		static Operation $write_dynamic_body_2_var(Prolog* m);

		static Operation $write_dynamic_body_2_var_1(Prolog* m);

		static Operation $write_dynamic_body_2_var_2(Prolog* m);

		static Operation $write_dynamic_body_2_var_3(Prolog* m);

		static Operation $write_dynamic_body_2_1(Prolog* m);

		static Operation $write_dynamic_body_2_2(Prolog* m);

		static Operation $write_dynamic_body_2_3(Prolog* m);

		static Operation $write_dynamic_body_2_4(Prolog* m);
	/** PREDICATE: print_message/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_print_message_2_s1;
		public:
			static SymbolTerm* const  ATOM_error;
			static SymbolTerm* const  ATOM_$007B;
			static SymbolTerm* const  ATOM_$007D;
			static SymbolTerm* const  ATOM_$007BWARNING$003A$0020;




		static Operation PRED_print_message_2_static_exec(Prolog* m);

	private:
		static Operation print_message_2_var(Prolog* m);

		static Operation print_message_2_var_1(Prolog* m);

		static Operation print_message_2_var_2(Prolog* m);

		static Operation print_message_2_var_3(Prolog* m);

		static Operation print_message_2_1(Prolog* m);

		static Operation print_message_2_2(Prolog* m);

		static Operation print_message_2_3(Prolog* m);

		static Operation print_message_2_4(Prolog* m);
	/** PREDICATE: nl/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_nl_0_s1;




	public:
		static Operation PRED_nl_0_static_exec(Prolog* m);
	/** PREDICATE: $builtin_message/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
	private:
		static SymbolTerm* const  PRED_$builtin_message_1_s1;




	public:
		static Operation PRED_$builtin_message_1_static_exec(Prolog* m);

	private:
		static Operation $builtin_message_1_var(Prolog* m);

		static Operation $builtin_message_1_var_1(Prolog* m);

		static Operation $builtin_message_1_var_2(Prolog* m);

		static Operation $builtin_message_1_lis(Prolog* m);

		static Operation $builtin_message_1_lis_1(Prolog* m);

		static Operation $builtin_message_1_1(Prolog* m);

		static Operation $builtin_message_1_2(Prolog* m);

		static Operation $builtin_message_1_3(Prolog* m);
	/** PREDICATE: $error_message/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		public:
			static SymbolTerm* const  ATOM_user_error;
			static SymbolTerm* const  ATOM_$007BINSTANTIATION$0020ERROR$003A$0020;
			static SymbolTerm* const  ATOM_$0020$002D$0020arg$0020;
			static SymbolTerm* const  ATOM_$007BTYPE$0020ERROR$003A$0020;
			static SymbolTerm* const  ATOM_$003A$0020expected$0020;
			static SymbolTerm* const  ATOM_$002C$0020found$0020;
			static SymbolTerm* const  ATOM_$007BDOMAIN$0020ERROR$003A$0020;
			static SymbolTerm* const  ATOM_$007BEXISTENCE$0020ERROR$003A$0020;
			static SymbolTerm* const  ATOM_$0020does$0020not$0020exist;
			static SymbolTerm* const  ATOM_$003A$0020;
			static SymbolTerm* const  ATOM_$007BPERMISSION$0020ERROR$003A$0020;
			static SymbolTerm* const  ATOM_$0020$002D$0020can$0020not$0020;
			static SymbolTerm* const  ATOM_$007BREPRESENTATION$0020ERROR$003A$0020;
			static SymbolTerm* const  ATOM_$003A$0020limit$0020of$0020;
			static SymbolTerm* const  ATOM_$0020is$0020breached;
			static SymbolTerm* const  ATOM_$007BEVALUATION$0020ERROR$003A$0020;
			static SymbolTerm* const  ATOM_$007BSYNTAX$0020ERROR$003A$0020;
			static SymbolTerm* const  ATOM_$007BSYSTEM$0020ERROR$003A$0020;
			static SymbolTerm* const  ATOM_$007BINTERNAL$0020ERROR$003A$0020;
			static SymbolTerm* const  ATOM_$007BJAVA$0020ERROR$003A$0020;




		static Operation PRED_$error_message_1_static_exec(Prolog* m);

	private:
		static Operation $error_message_1_var(Prolog* m);

		static Operation $error_message_1_var_1(Prolog* m);

		static Operation $error_message_1_var_2(Prolog* m);

		static Operation $error_message_1_var_3(Prolog* m);

		static Operation $error_message_1_var_4(Prolog* m);

		static Operation $error_message_1_var_5(Prolog* m);

		static Operation $error_message_1_var_6(Prolog* m);

		static Operation $error_message_1_var_7(Prolog* m);

		static Operation $error_message_1_var_8(Prolog* m);

		static Operation $error_message_1_var_9(Prolog* m);

		static Operation $error_message_1_var_10(Prolog* m);

		static Operation $error_message_1_var_11(Prolog* m);

		static Operation $error_message_1_var_12(Prolog* m);

		static Operation $error_message_1_var_13(Prolog* m);

		static Operation $error_message_1_1(Prolog* m);

		static Operation $error_message_1_2(Prolog* m);

		static Operation $error_message_1_3(Prolog* m);

		static Operation $error_message_1_4(Prolog* m);

		static Operation $error_message_1_5(Prolog* m);

		static Operation $error_message_1_6(Prolog* m);

		static Operation $error_message_1_7(Prolog* m);

		static Operation $error_message_1_8(Prolog* m);

		static Operation $error_message_1_9(Prolog* m);

		static Operation $error_message_1_10(Prolog* m);

		static Operation $error_message_1_11(Prolog* m);

		static Operation $error_message_1_12(Prolog* m);

		static Operation $error_message_1_13(Prolog* m);

		static Operation $error_message_1_14(Prolog* m);
	/** PREDICATE: $write_goal/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/
		static SymbolTerm* const  PRED_$write_goal_1_s1;




	public:
		static Operation PRED_$write_goal_1_static_exec(Prolog* m);

	private:
		static Operation $write_goal_1_sub_1(Prolog* m);

		static Operation $write_goal_1_1(Prolog* m);

		static Operation $write_goal_1_2(Prolog* m);
	/** PREDICATE: $write_goal/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl
	*/




	public:
		static Operation PRED_$write_goal_2_static_exec(Prolog* m);

	private:
		static Operation $write_goal_2_sub_1(Prolog* m);

		static Operation $write_goal_2_1(Prolog* m);

		static Operation $write_goal_2_2(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_cafeteria::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_CAFETERIA
