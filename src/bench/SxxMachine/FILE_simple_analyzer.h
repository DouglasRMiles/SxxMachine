#ifndef FILE_SIMPLE_ANALYZER
#define FILE_SIMPLE_ANALYZER

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class ListTerm; }

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
	class FILE_simple_analyzer : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog* m);
	/** PREDICATE: main/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(main/1,public)
			static SymbolTerm* const  FUNCTOR_stree_5;
			static SymbolTerm* const  FUNCTOR_$002F_2;
			static SymbolTerm* const  ATOM_main;
	private:
		static StructureTerm* const  L_main_1_s6;
		public:
			static SymbolTerm* const  FUNCTOR_$003A$002D_2;
			static SymbolTerm* const  FUNCTOR_or_2;
			static SymbolTerm* const  FUNCTOR_$002C_2;
			static SymbolTerm* const  FUNCTOR_qsort_3;
	private:
		static ListTerm* const  L_main_1_s14;
		static ListTerm* const  L_main_1_s15;
		public:
			static SymbolTerm* const  ATOM_fail;
	private:
		static StructureTerm* const  L_main_1_s19;
		public:
			static SymbolTerm* const  ATOM_qsort;
	private:
		static StructureTerm* const  L_main_1_s23;
		public:
			static SymbolTerm* const  FUNCTOR_$003D_2;
			static SymbolTerm* const  FUNCTOR_part_4;
			static SymbolTerm* const  ATOM_part;
	private:
		static StructureTerm* const  L_main_1_s29;
		public:
			static SymbolTerm* const  FUNCTOR_$0024cut_load_1;
			static SymbolTerm* const  FUNCTOR_$0024cut_part$002F41_5;
			static SymbolTerm* const  ATOM_$0024cut_part$002F41;
	private:
		static StructureTerm* const  L_main_1_s35;
		public:
			static SymbolTerm* const  FUNCTOR_$0024fac_$0024cut_part$002F4_1$002F52_6;
			static SymbolTerm* const  ATOM_$0024fac_$0024cut_part$002F4_1$002F52;
	private:
		static StructureTerm* const  L_main_1_s40;
		public:
			static SymbolTerm* const  FUNCTOR_$003D$003C_2;
			static SymbolTerm* const  FUNCTOR_$0024cut_shallow_1;




		static Operation PRED_main_1_static_exec(Prolog* m);
	/** PREDICATE: analyze_strees/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(analyze_strees/2,public)




		static Operation PRED_analyze_strees_2_static_exec(Prolog* m);
	/** PREDICATE: analyze_closure/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(analyze_closure/3,public)




		static Operation PRED_analyze_closure_3_static_exec(Prolog* m);
	/** PREDICATE: analyze_closure/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(analyze_closure/4,public)




		static Operation PRED_analyze_closure_4_static_exec(Prolog* m);

	private:
		static Operation analyze_closure_4_sub_1(Prolog* m);

		static Operation analyze_closure_4_1(Prolog* m);

		static Operation analyze_closure_4_2(Prolog* m);
	/** PREDICATE: init_strees/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(init_strees/3,public)
		public:
			static SymbolTerm* const  FUNCTOR_get_2;




		static Operation PRED_init_strees_3_static_exec(Prolog* m);

	private:
		static Operation init_strees_3_var(Prolog* m);

		static Operation init_strees_3_var_1(Prolog* m);

		static Operation init_strees_3_1(Prolog* m);

		static Operation init_strees_3_2(Prolog* m);
	/** PREDICATE: init_conj/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(init_conj/3,public)




	public:
		static Operation PRED_init_conj_3_static_exec(Prolog* m);

	private:
		static Operation init_conj_3_var(Prolog* m);

		static Operation init_conj_3_var_1(Prolog* m);

		static Operation init_conj_3_1(Prolog* m);

		static Operation init_conj_3_2(Prolog* m);
	/** PREDICATE: init_disj/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(init_disj/3,public)




	public:
		static Operation PRED_init_disj_3_static_exec(Prolog* m);

	private:
		static Operation init_disj_3_var(Prolog* m);

		static Operation init_disj_3_var_1(Prolog* m);

		static Operation init_disj_3_1(Prolog* m);

		static Operation init_disj_3_2(Prolog* m);
	/** PREDICATE: init_goal/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(init_goal/3,public)




	public:
		static Operation PRED_init_goal_3_static_exec(Prolog* m);

	private:
		static Operation init_goal_3_sub_1(Prolog* m);

		static Operation init_goal_3_1(Prolog* m);

		static Operation init_goal_3_2(Prolog* m);
	/** PREDICATE: traverse_strees/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(traverse_strees/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_traverse_strees_5_static_exec(Prolog* m);

	private:
		static Operation traverse_strees_5_var(Prolog* m);

		static Operation traverse_strees_5_var_1(Prolog* m);

		static Operation traverse_strees_5_1(Prolog* m);

		static Operation traverse_strees_5_2(Prolog* m);
	/** PREDICATE: traverse_disj/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(traverse_disj/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_traverse_disj_6_static_exec(Prolog* m);

	private:
		static Operation traverse_disj_6_sub_1(Prolog* m);

		static Operation traverse_disj_6_1(Prolog* m);

		static Operation traverse_disj_6_2(Prolog* m);
	/** PREDICATE: traverse_conj/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(traverse_conj/6,public)
		public:
			static SymbolTerm* const  ATOM_uninit;
			static SymbolTerm* const  ATOM_ground;

		// private final Term arg5, arg6;




		static Operation PRED_traverse_conj_6_static_exec(Prolog* m);
	/** PREDICATE: traverse_conj/11
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(traverse_conj/11,public)

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;




		static Operation PRED_traverse_conj_11_static_exec(Prolog* m);

	private:
		static Operation traverse_conj_11_var(Prolog* m);

		static Operation traverse_conj_11_var_1(Prolog* m);

		static Operation traverse_conj_11_1(Prolog* m);

		static Operation traverse_conj_11_2(Prolog* m);
	/** PREDICATE: update_goal/12
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(update_goal/12,public)
		public:
			static SymbolTerm* const  FUNCTOR_add_1;
			static SymbolTerm* const  FUNCTOR_sub_1;
			static SymbolTerm* const  FUNCTOR_add_set_1;
			static SymbolTerm* const  FUNCTOR_sub_set_1;

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;




		static Operation PRED_update_goal_12_static_exec(Prolog* m);

	private:
		static Operation update_goal_12_sub_1(Prolog* m);

		static Operation update_goal_12_sub_2(Prolog* m);

		static Operation update_goal_12_sub_3(Prolog* m);

		static Operation update_goal_12_sub_4(Prolog* m);

		static Operation update_goal_12_1(Prolog* m);

		static Operation update_goal_12_2(Prolog* m);

		static Operation update_goal_12_3(Prolog* m);

		static Operation update_goal_12_4(Prolog* m);

		static Operation update_goal_12_5(Prolog* m);
	/** PREDICATE: update_table/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(update_table/6,public)
		public:
			static SymbolTerm* const  FUNCTOR_set_2;
			static SymbolTerm* const  FUNCTOR_$002B_2;

		// private final Term arg5, arg6;




		static Operation PRED_update_table_6_static_exec(Prolog* m);

	private:
		static Operation update_table_6_var(Prolog* m);

		static Operation update_table_6_var_1(Prolog* m);

		static Operation update_table_6_1(Prolog* m);

		static Operation update_table_6_2(Prolog* m);
	/** PREDICATE: create_new_call/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(create_new_call/9,public)

		// private final Term arg5, arg6, arg7, arg8, arg9;




	public:
		static Operation PRED_create_new_call_9_static_exec(Prolog* m);

	private:
		static Operation create_new_call_9_sub_1(Prolog* m);

		static Operation create_new_call_9_1(Prolog* m);

		static Operation create_new_call_9_2(Prolog* m);
	/** PREDICATE: lub/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(lub/3,public)
		public:
			static SymbolTerm* const  ATOM_unknown;
			static SymbolTerm* const  ATOM_any;




		static Operation PRED_lub_3_static_exec(Prolog* m);

	private:
		static Operation lub_3_var(Prolog* m);

		static Operation lub_3_var_1(Prolog* m);

		static Operation lub_3_var_2(Prolog* m);

		static Operation lub_3_var_3(Prolog* m);

		static Operation lub_3_var_4(Prolog* m);

		static Operation lub_3_var_5(Prolog* m);

		static Operation lub_3_var_6(Prolog* m);

		static Operation lub_3_var_7(Prolog* m);

		static Operation lub_3_int(Prolog* m);

		static Operation lub_3_int_1(Prolog* m);

		static Operation lub_3_1(Prolog* m);

		static Operation lub_3_2(Prolog* m);

		static Operation lub_3_3(Prolog* m);

		static Operation lub_3_4(Prolog* m);

		static Operation lub_3_5(Prolog* m);

		static Operation lub_3_6(Prolog* m);

		static Operation lub_3_7(Prolog* m);

		static Operation lub_3_8(Prolog* m);
	/** PREDICATE: bottom/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(bottom/1,public)




	public:
		static Operation PRED_bottom_1_static_exec(Prolog* m);
	/** PREDICATE: create_argument/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(create_argument/6,public)
			static SymbolTerm* const  ATOM_yes;
			static SymbolTerm* const  ATOM_no;

		// private final Term arg5, arg6;




		static Operation PRED_create_argument_6_static_exec(Prolog* m);

	private:
		static Operation create_argument_6_var(Prolog* m);

		static Operation create_argument_6_var_1(Prolog* m);

		static Operation create_argument_6_var_2(Prolog* m);

		static Operation create_argument_6_var_3(Prolog* m);

		static Operation create_argument_6_var_4(Prolog* m);

		static Operation create_argument_6_var_5(Prolog* m);

		static Operation create_argument_6_1(Prolog* m);

		static Operation create_argument_6_2(Prolog* m);

		static Operation create_argument_6_3(Prolog* m);

		static Operation create_argument_6_4(Prolog* m);

		static Operation create_argument_6_5(Prolog* m);

		static Operation create_argument_6_6(Prolog* m);
	/** PREDICATE: lub_call/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(lub_call/3,public)




	public:
		static Operation PRED_lub_call_3_static_exec(Prolog* m);
	/** PREDICATE: lub_call/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(lub_call/5,public)

		// private final Term arg5;




		static Operation PRED_lub_call_5_static_exec(Prolog* m);

	private:
		static Operation lub_call_5_sub_1(Prolog* m);

		static Operation lub_call_5_1(Prolog* m);

		static Operation lub_call_5_2(Prolog* m);
	/** PREDICATE: bottom_call/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(bottom_call/2,public)




	public:
		static Operation PRED_bottom_call_2_static_exec(Prolog* m);
	/** PREDICATE: bottom_call/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(bottom_call/3,public)




		static Operation PRED_bottom_call_3_static_exec(Prolog* m);

	private:
		static Operation bottom_call_3_sub_1(Prolog* m);

		static Operation bottom_call_3_1(Prolog* m);

		static Operation bottom_call_3_2(Prolog* m);
	/** PREDICATE: lattice_modes_call/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(lattice_modes_call/3,public)




	public:
		static Operation PRED_lattice_modes_call_3_static_exec(Prolog* m);
	/** PREDICATE: lattice_modes_call/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(lattice_modes_call/6,public)

		// private final Term arg5, arg6;




		static Operation PRED_lattice_modes_call_6_static_exec(Prolog* m);

	private:
		static Operation lattice_modes_call_6_sub_1(Prolog* m);

		static Operation lattice_modes_call_6_1(Prolog* m);

		static Operation lattice_modes_call_6_2(Prolog* m);
	/** PREDICATE: lattice_modes_arg/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(lattice_modes_arg/4,public)
		public:
			static SymbolTerm* const  FUNCTOR_uninit_1;
			static SymbolTerm* const  FUNCTOR_ground_1;




		static Operation PRED_lattice_modes_arg_4_static_exec(Prolog* m);

	private:
		static Operation lattice_modes_arg_4_var(Prolog* m);

		static Operation lattice_modes_arg_4_var_1(Prolog* m);

		static Operation lattice_modes_arg_4_var_2(Prolog* m);

		static Operation lattice_modes_arg_4_1(Prolog* m);

		static Operation lattice_modes_arg_4_2(Prolog* m);

		static Operation lattice_modes_arg_4_3(Prolog* m);
	/** PREDICATE: get/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(get/3,public)
		public:
			static SymbolTerm* const  FUNCTOR_node_4;




		static Operation PRED_get_3_static_exec(Prolog* m);
	/** PREDICATE: get/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(get/6,public)

		// private final Term arg5, arg6;




		static Operation PRED_get_6_static_exec(Prolog* m);

	private:
		static Operation get_6_sub_1(Prolog* m);

		static Operation get_6_1(Prolog* m);

		static Operation get_6_2(Prolog* m);
	/** PREDICATE: get/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(get/5,public)
		public:
			static SymbolTerm* const  ATOM_$003C;
			static SymbolTerm* const  ATOM_$003E;

		// private final Term arg5;




		static Operation PRED_get_5_static_exec(Prolog* m);

	private:
		static Operation get_5_var(Prolog* m);

		static Operation get_5_var_1(Prolog* m);

		static Operation get_5_1(Prolog* m);

		static Operation get_5_2(Prolog* m);
	/** PREDICATE: set/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(set/4,public)
		public:
			static SymbolTerm* const  ATOM_leaf;




		static Operation PRED_set_4_static_exec(Prolog* m);

	private:
		static Operation set_4_var(Prolog* m);

		static Operation set_4_var_1(Prolog* m);

		static Operation set_4_1(Prolog* m);

		static Operation set_4_2(Prolog* m);
	/** PREDICATE: set_2/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(set_2/9,public)
		public:
			static SymbolTerm* const  ATOM_$003D;

		// private final Term arg5, arg6, arg7, arg8, arg9;




		static Operation PRED_set_2_9_static_exec(Prolog* m);

	private:
		static Operation set_2_9_var(Prolog* m);

		static Operation set_2_9_var_1(Prolog* m);

		static Operation set_2_9_var_2(Prolog* m);

		static Operation set_2_9_1(Prolog* m);

		static Operation set_2_9_2(Prolog* m);

		static Operation set_2_9_3(Prolog* m);
	/** PREDICATE: seal/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(seal/1,public)




	public:
		static Operation PRED_seal_1_static_exec(Prolog* m);

	private:
		static Operation seal_1_top(Prolog* m);

		static Operation seal_1_var(Prolog* m);

		static Operation seal_1_var_1(Prolog* m);

		static Operation seal_1_1(Prolog* m);

		static Operation seal_1_2(Prolog* m);
	/** PREDICATE: membership_flag/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(membership_flag/3,public)




	public:
		static Operation PRED_membership_flag_3_static_exec(Prolog* m);

	private:
		static Operation membership_flag_3_sub_1(Prolog* m);

		static Operation membership_flag_3_1(Prolog* m);

		static Operation membership_flag_3_2(Prolog* m);
	/** PREDICATE: ground_flag/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(ground_flag/3,public)




	public:
		static Operation PRED_ground_flag_3_static_exec(Prolog* m);

	private:
		static Operation ground_flag_3_sub_1(Prolog* m);

		static Operation ground_flag_3_1(Prolog* m);

		static Operation ground_flag_3_2(Prolog* m);
	/** PREDICATE: get_entry_modes/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(get_entry_modes/4,public)




	public:
		static Operation PRED_get_entry_modes_4_static_exec(Prolog* m);
	/** PREDICATE: get_entry_modes/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(get_entry_modes/6,public)

		// private final Term arg5, arg6;




		static Operation PRED_get_entry_modes_6_static_exec(Prolog* m);

	private:
		static Operation get_entry_modes_6_top(Prolog* m);

		static Operation get_entry_modes_6_sub_1(Prolog* m);

		static Operation get_entry_modes_6_sub_2(Prolog* m);

		static Operation get_entry_modes_6_1(Prolog* m);

		static Operation get_entry_modes_6_2(Prolog* m);

		static Operation get_entry_modes_6_3(Prolog* m);
	/** PREDICATE: var_args/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(var_args/2,public)




	public:
		static Operation PRED_var_args_2_static_exec(Prolog* m);
	/** PREDICATE: filter_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(filter_vars/3,public)




		static Operation PRED_filter_vars_3_static_exec(Prolog* m);
	/** PREDICATE: filter_vars/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(filter_vars/4,public)




		static Operation PRED_filter_vars_4_static_exec(Prolog* m);

	private:
		static Operation filter_vars_4_sub_1(Prolog* m);

		static Operation filter_vars_4_1(Prolog* m);

		static Operation filter_vars_4_2(Prolog* m);
	/** PREDICATE: filter_vars_arg/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(filter_vars_arg/5,public)
		public:
			static SymbolTerm* const  FUNCTOR_$002D_2;

		// private final Term arg5;




		static Operation PRED_filter_vars_arg_5_static_exec(Prolog* m);

	private:
		static Operation filter_vars_arg_5_sub_1(Prolog* m);

		static Operation filter_vars_arg_5_1(Prolog* m);

		static Operation filter_vars_arg_5_2(Prolog* m);
	/** PREDICATE: goal_dupset/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(goal_dupset/2,public)




	public:
		static Operation PRED_goal_dupset_2_static_exec(Prolog* m);
	/** PREDICATE: goal_dupset_varset/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(goal_dupset_varset/3,public)




		static Operation PRED_goal_dupset_varset_3_static_exec(Prolog* m);
	/** PREDICATE: goal_dupset_varbag/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(goal_dupset_varbag/3,public)




		static Operation PRED_goal_dupset_varbag_3_static_exec(Prolog* m);
	/** PREDICATE: make_key/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(make_key/2,public)
			static SymbolTerm* const  ATOM_dummy;




		static Operation PRED_make_key_2_static_exec(Prolog* m);

	private:
		static Operation make_key_2_top(Prolog* m);

		static Operation make_key_2_var(Prolog* m);

		static Operation make_key_2_var_1(Prolog* m);

		static Operation make_key_2_1(Prolog* m);

		static Operation make_key_2_2(Prolog* m);
	/** PREDICATE: filter_dups/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(filter_dups/2,public)




	public:
		static Operation PRED_filter_dups_2_static_exec(Prolog* m);
	/** PREDICATE: filter_dups/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(filter_dups/3,public)




		static Operation PRED_filter_dups_3_static_exec(Prolog* m);

	private:
		static Operation filter_dups_3_top(Prolog* m);

		static Operation filter_dups_3_var(Prolog* m);

		static Operation filter_dups_3_var_1(Prolog* m);

		static Operation filter_dups_3_var_2(Prolog* m);

		static Operation filter_dups_3_var_3(Prolog* m);

		static Operation filter_dups_3_lis(Prolog* m);

		static Operation filter_dups_3_lis_1(Prolog* m);

		static Operation filter_dups_3_lis_2(Prolog* m);

		static Operation filter_dups_3_1(Prolog* m);

		static Operation filter_dups_3_2(Prolog* m);

		static Operation filter_dups_3_3(Prolog* m);

		static Operation filter_dups_3_4(Prolog* m);
	/** PREDICATE: set_command/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(set_command/3,public)




	public:
		static Operation PRED_set_command_3_static_exec(Prolog* m);

	private:
		static Operation set_command_3_var(Prolog* m);

		static Operation set_command_3_var_1(Prolog* m);

		static Operation set_command_3_var_2(Prolog* m);

		static Operation set_command_3_var_3(Prolog* m);

		static Operation set_command_3_1(Prolog* m);

		static Operation set_command_3_2(Prolog* m);

		static Operation set_command_3_3(Prolog* m);

		static Operation set_command_3_4(Prolog* m);
	/** PREDICATE: table_command/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(table_command/3,public)




	public:
		static Operation PRED_table_command_3_static_exec(Prolog* m);

	private:
		static Operation table_command_3_var(Prolog* m);

		static Operation table_command_3_var_1(Prolog* m);

		static Operation table_command_3_1(Prolog* m);

		static Operation table_command_3_2(Prolog* m);
	/** PREDICATE: inv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(inv/2,public)




	public:
		static Operation PRED_inv_2_static_exec(Prolog* m);
	/** PREDICATE: inv_2/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(inv_2/3,public)




		static Operation PRED_inv_2_3_static_exec(Prolog* m);

	private:
		static Operation inv_2_3_var(Prolog* m);

		static Operation inv_2_3_var_1(Prolog* m);

		static Operation inv_2_3_1(Prolog* m);

		static Operation inv_2_3_2(Prolog* m);
	/** PREDICATE: intersectv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(intersectv/3,public)




	public:
		static Operation PRED_intersectv_3_static_exec(Prolog* m);

	private:
		static Operation intersectv_3_var(Prolog* m);

		static Operation intersectv_3_var_1(Prolog* m);

		static Operation intersectv_3_1(Prolog* m);

		static Operation intersectv_3_2(Prolog* m);
	/** PREDICATE: intersectv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(intersectv_2/4,public)




	public:
		static Operation PRED_intersectv_2_4_static_exec(Prolog* m);

	private:
		static Operation intersectv_2_4_var(Prolog* m);

		static Operation intersectv_2_4_var_1(Prolog* m);

		static Operation intersectv_2_4_1(Prolog* m);

		static Operation intersectv_2_4_2(Prolog* m);
	/** PREDICATE: intersectv_3/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(intersectv_3/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_intersectv_3_6_static_exec(Prolog* m);

	private:
		static Operation intersectv_3_6_var(Prolog* m);

		static Operation intersectv_3_6_var_1(Prolog* m);

		static Operation intersectv_3_6_var_2(Prolog* m);

		static Operation intersectv_3_6_1(Prolog* m);

		static Operation intersectv_3_6_2(Prolog* m);

		static Operation intersectv_3_6_3(Prolog* m);
	/** PREDICATE: diffv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(diffv/3,public)




	public:
		static Operation PRED_diffv_3_static_exec(Prolog* m);

	private:
		static Operation diffv_3_var(Prolog* m);

		static Operation diffv_3_var_1(Prolog* m);

		static Operation diffv_3_1(Prolog* m);

		static Operation diffv_3_2(Prolog* m);
	/** PREDICATE: diffv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(diffv_2/4,public)




	public:
		static Operation PRED_diffv_2_4_static_exec(Prolog* m);

	private:
		static Operation diffv_2_4_var(Prolog* m);

		static Operation diffv_2_4_var_1(Prolog* m);

		static Operation diffv_2_4_1(Prolog* m);

		static Operation diffv_2_4_2(Prolog* m);
	/** PREDICATE: diffv_3/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(diffv_3/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_diffv_3_6_static_exec(Prolog* m);

	private:
		static Operation diffv_3_6_var(Prolog* m);

		static Operation diffv_3_6_var_1(Prolog* m);

		static Operation diffv_3_6_var_2(Prolog* m);

		static Operation diffv_3_6_1(Prolog* m);

		static Operation diffv_3_6_2(Prolog* m);

		static Operation diffv_3_6_3(Prolog* m);
	/** PREDICATE: unionv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(unionv/3,public)




	public:
		static Operation PRED_unionv_3_static_exec(Prolog* m);

	private:
		static Operation unionv_3_var(Prolog* m);

		static Operation unionv_3_var_1(Prolog* m);

		static Operation unionv_3_1(Prolog* m);

		static Operation unionv_3_2(Prolog* m);
	/** PREDICATE: unionv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(unionv_2/4,public)




	public:
		static Operation PRED_unionv_2_4_static_exec(Prolog* m);

	private:
		static Operation unionv_2_4_var(Prolog* m);

		static Operation unionv_2_4_var_1(Prolog* m);

		static Operation unionv_2_4_1(Prolog* m);

		static Operation unionv_2_4_2(Prolog* m);
	/** PREDICATE: unionv_3/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(unionv_3/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_unionv_3_6_static_exec(Prolog* m);

	private:
		static Operation unionv_3_6_var(Prolog* m);

		static Operation unionv_3_6_var_1(Prolog* m);

		static Operation unionv_3_6_var_2(Prolog* m);

		static Operation unionv_3_6_1(Prolog* m);

		static Operation unionv_3_6_2(Prolog* m);

		static Operation unionv_3_6_3(Prolog* m);
	/** PREDICATE: includev/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(includev/3,public)




	public:
		static Operation PRED_includev_3_static_exec(Prolog* m);
	/** PREDICATE: includev_2/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(includev_2/3,public)




		static Operation PRED_includev_2_3_static_exec(Prolog* m);

	private:
		static Operation includev_2_3_var(Prolog* m);

		static Operation includev_2_3_var_1(Prolog* m);

		static Operation includev_2_3_1(Prolog* m);

		static Operation includev_2_3_2(Prolog* m);
	/** PREDICATE: includev_3/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(includev_3/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_includev_3_5_static_exec(Prolog* m);

	private:
		static Operation includev_3_5_var(Prolog* m);

		static Operation includev_3_5_var_1(Prolog* m);

		static Operation includev_3_5_var_2(Prolog* m);

		static Operation includev_3_5_1(Prolog* m);

		static Operation includev_3_5_2(Prolog* m);

		static Operation includev_3_5_3(Prolog* m);
	/** PREDICATE: subsetv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(subsetv/2,public)




	public:
		static Operation PRED_subsetv_2_static_exec(Prolog* m);

	private:
		static Operation subsetv_2_var(Prolog* m);

		static Operation subsetv_2_var_1(Prolog* m);

		static Operation subsetv_2_1(Prolog* m);

		static Operation subsetv_2_2(Prolog* m);
	/** PREDICATE: subsetv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(subsetv_2/4,public)




	public:
		static Operation PRED_subsetv_2_4_static_exec(Prolog* m);

	private:
		static Operation subsetv_2_4_var(Prolog* m);

		static Operation subsetv_2_4_var_1(Prolog* m);

		static Operation subsetv_2_4_1(Prolog* m);

		static Operation subsetv_2_4_2(Prolog* m);
	/** PREDICATE: varset/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(varset/2,public)




	public:
		static Operation PRED_varset_2_static_exec(Prolog* m);
	/** PREDICATE: varbag/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(varbag/2,public)




		static Operation PRED_varbag_2_static_exec(Prolog* m);
	/** PREDICATE: varbag/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(varbag/3,public)




		static Operation PRED_varbag_3_static_exec(Prolog* m);

	private:
		static Operation varbag_3_sub_1(Prolog* m);

		static Operation varbag_3_1(Prolog* m);

		static Operation varbag_3_2(Prolog* m);
	/** PREDICATE: varbag/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(varbag/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_varbag_5_static_exec(Prolog* m);

	private:
		static Operation varbag_5_sub_1(Prolog* m);

		static Operation varbag_5_1(Prolog* m);

		static Operation varbag_5_2(Prolog* m);
	/** PREDICATE: unify_p/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(unify_p/1,public)




	public:
		static Operation PRED_unify_p_1_static_exec(Prolog* m);
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main('$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl'/1,public)




		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_2(Prolog* m);
	/** PREDICATE: call_p/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(call_p/1,public)




	public:
		static Operation PRED_call_p_1_static_exec(Prolog* m);
	/** PREDICATE: split_unify/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
		// main(split_unify/3,public)




		static Operation PRED_split_unify_3_static_exec(Prolog* m);

	private:
		static Operation split_unify_3_var(Prolog* m);

		static Operation split_unify_3_var_1(Prolog* m);

		static Operation split_unify_3_1(Prolog* m);

		static Operation split_unify_3_2(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_simple_analyzer::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_SIMPLE_ANALYZER
