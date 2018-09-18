#ifndef FILE_SDDA
#define FILE_SDDA

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class ListTerm; }
namespace SxxMachine { class IntegerTerm; }

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
	class FILE_sdda : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(top/0,public)
		public:
			static SymbolTerm* const  ATOM_test;




		static Operation PRED_top_0_static_exec(Prolog* m);
	/** PREDICATE: do_sdda/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(do_sdda/4,public)




		static Operation PRED_do_sdda_4_static_exec(Prolog* m);
	/** PREDICATE: read_procedures/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(read_procedures/3,public)
			static SymbolTerm* const  FUNCTOR_$002F_2;
			static SymbolTerm* const  ATOM_a;
	private:
		static StructureTerm* const  L_read_procedures_3_s5;
		public:
			static SymbolTerm* const  FUNCTOR_a_2;
			static SymbolTerm* const  ATOM_c;
	private:
		static StructureTerm* const  L_read_procedures_3_s10;
		public:
			static SymbolTerm* const  FUNCTOR_$003A$002D_2;
			static SymbolTerm* const  FUNCTOR_c_3;




		static Operation PRED_read_procedures_3_static_exec(Prolog* m);
	/** PREDICATE: entry_exit_modes_list/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(entry_exit_modes_list/3,public)




		static Operation PRED_entry_exit_modes_list_3_static_exec(Prolog* m);

	private:
		static Operation entry_exit_modes_list_3_sub_1(Prolog* m);

		static Operation entry_exit_modes_list_3_1(Prolog* m);

		static Operation entry_exit_modes_list_3_2(Prolog* m);
	/** PREDICATE: proc_exit_mode/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(proc_exit_mode/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_proc_exit_mode_6_static_exec(Prolog* m);

	private:
		static Operation proc_exit_mode_6_sub_1(Prolog* m);

		static Operation proc_exit_mode_6_sub_2(Prolog* m);

		static Operation proc_exit_mode_6_sub_3(Prolog* m);

		static Operation proc_exit_mode_6_1(Prolog* m);

		static Operation proc_exit_mode_6_2(Prolog* m);

		static Operation proc_exit_mode_6_3(Prolog* m);

		static Operation proc_exit_mode_6_4(Prolog* m);
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main('$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'/1,public)




	public:
		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(Prolog* m);
	/** PREDICATE: clause_exit_modes_list/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(clause_exit_modes_list/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_clause_exit_modes_list_6_static_exec(Prolog* m);

	private:
		static Operation clause_exit_modes_list_6_top(Prolog* m);

		static Operation clause_exit_modes_list_6_sub_1(Prolog* m);

		static Operation clause_exit_modes_list_6_sub_2(Prolog* m);

		static Operation clause_exit_modes_list_6_sub_3(Prolog* m);

		static Operation clause_exit_modes_list_6_1(Prolog* m);

		static Operation clause_exit_modes_list_6_2(Prolog* m);

		static Operation clause_exit_modes_list_6_3(Prolog* m);

		static Operation clause_exit_modes_list_6_4(Prolog* m);
	/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main('$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'/3,public)




	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_2(Prolog* m);
	/** PREDICATE: clause_exit_mode/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(clause_exit_mode/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_clause_exit_mode_5_static_exec(Prolog* m);
	/** PREDICATE: body_exit_mode/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(body_exit_mode/4,public)
			static SymbolTerm* const  FUNCTOR_$002C_2;




		static Operation PRED_body_exit_mode_4_static_exec(Prolog* m);

	private:
		static Operation body_exit_mode_4_top(Prolog* m);

		static Operation body_exit_mode_4_sub_1(Prolog* m);

		static Operation body_exit_mode_4_1(Prolog* m);

		static Operation body_exit_mode_4_2(Prolog* m);
	/** PREDICATE: unify/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(unify/2,public)
		public:
			static SymbolTerm* const  ATOM_g;




		static Operation PRED_unify_2_static_exec(Prolog* m);

	private:
		static Operation unify_2_top(Prolog* m);

		static Operation unify_2_var(Prolog* m);

		static Operation unify_2_var_1(Prolog* m);

		static Operation unify_2_var_2(Prolog* m);

		static Operation unify_2_var_3(Prolog* m);

		static Operation unify_2_var_4(Prolog* m);

		static Operation unify_2_int(Prolog* m);

		static Operation unify_2_int_1(Prolog* m);

		static Operation unify_2_int_2(Prolog* m);

		static Operation unify_2_con(Prolog* m);

		static Operation unify_2_con_1(Prolog* m);

		static Operation unify_2_con_2(Prolog* m);

		static Operation unify_2_con_3(Prolog* m);

		static Operation unify_2_lis(Prolog* m);

		static Operation unify_2_lis_1(Prolog* m);

		static Operation unify_2_lis_2(Prolog* m);

		static Operation unify_2_lis_3(Prolog* m);

		static Operation unify_2_1(Prolog* m);

		static Operation unify_2_2(Prolog* m);

		static Operation unify_2_3(Prolog* m);

		static Operation unify_2_4(Prolog* m);

		static Operation unify_2_5(Prolog* m);
	/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main('$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'/1,public)




	public:
		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main('$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'/1,public)




	public:
		static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(Prolog* m);
	/** PREDICATE: equiv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(equiv/2,public)




	public:
		static Operation PRED_equiv_2_static_exec(Prolog* m);
	/** PREDICATE: equiv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(equiv/3,public)




		static Operation PRED_equiv_3_static_exec(Prolog* m);

	private:
		static Operation equiv_3_top(Prolog* m);

		static Operation equiv_3_var(Prolog* m);

		static Operation equiv_3_var_1(Prolog* m);

		static Operation equiv_3_var_2(Prolog* m);

		static Operation equiv_3_var_3(Prolog* m);

		static Operation equiv_3_var_4(Prolog* m);

		static Operation equiv_3_var_5(Prolog* m);

		static Operation equiv_3_var_6(Prolog* m);

		static Operation equiv_3_int(Prolog* m);

		static Operation equiv_3_int_1(Prolog* m);

		static Operation equiv_3_int_2(Prolog* m);

		static Operation equiv_3_int_3(Prolog* m);

		static Operation equiv_3_int_4(Prolog* m);

		static Operation equiv_3_con(Prolog* m);

		static Operation equiv_3_con_1(Prolog* m);

		static Operation equiv_3_con_2(Prolog* m);

		static Operation equiv_3_con_3(Prolog* m);

		static Operation equiv_3_con_4(Prolog* m);

		static Operation equiv_3_con_5(Prolog* m);

		static Operation equiv_3_lis(Prolog* m);

		static Operation equiv_3_lis_1(Prolog* m);

		static Operation equiv_3_lis_2(Prolog* m);

		static Operation equiv_3_lis_3(Prolog* m);

		static Operation equiv_3_lis_4(Prolog* m);

		static Operation equiv_3_lis_5(Prolog* m);

		static Operation equiv_3_1(Prolog* m);

		static Operation equiv_3_2(Prolog* m);

		static Operation equiv_3_3(Prolog* m);

		static Operation equiv_3_4(Prolog* m);

		static Operation equiv_3_5(Prolog* m);

		static Operation equiv_3_6(Prolog* m);

		static Operation equiv_3_7(Prolog* m);
	/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main('$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'/1,public)




	public:
		static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main('$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'/1,public)




	public:
		static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(Prolog* m);
	/** PREDICATE: equiv_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(equiv_vars/3,public)




	public:
		static Operation PRED_equiv_vars_3_static_exec(Prolog* m);

	private:
		static Operation equiv_vars_3_top(Prolog* m);

		static Operation equiv_vars_3_sub_1(Prolog* m);

		static Operation equiv_vars_3_sub_2(Prolog* m);

		static Operation equiv_vars_3_sub_3(Prolog* m);

		static Operation equiv_vars_3_1(Prolog* m);

		static Operation equiv_vars_3_2(Prolog* m);

		static Operation equiv_vars_3_3(Prolog* m);

		static Operation equiv_vars_3_4(Prolog* m);
	/** PREDICATE: dup/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(dup/2,public)




	public:
		static Operation PRED_dup_2_static_exec(Prolog* m);
	/** PREDICATE: dup/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(dup/3,public)




		static Operation PRED_dup_3_static_exec(Prolog* m);

	private:
		static Operation dup_3_top(Prolog* m);

		static Operation dup_3_var(Prolog* m);

		static Operation dup_3_var_1(Prolog* m);

		static Operation dup_3_var_2(Prolog* m);

		static Operation dup_3_var_3(Prolog* m);

		static Operation dup_3_int(Prolog* m);

		static Operation dup_3_int_1(Prolog* m);

		static Operation dup_3_int_2(Prolog* m);

		static Operation dup_3_1(Prolog* m);

		static Operation dup_3_2(Prolog* m);

		static Operation dup_3_3(Prolog* m);

		static Operation dup_3_4(Prolog* m);
	/** PREDICATE: dup_var/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(dup_var/3,public)




	public:
		static Operation PRED_dup_var_3_static_exec(Prolog* m);

	private:
		static Operation dup_var_3_top(Prolog* m);

		static Operation dup_var_3_sub_1(Prolog* m);

		static Operation dup_var_3_sub_2(Prolog* m);

		static Operation dup_var_3_1(Prolog* m);

		static Operation dup_var_3_2(Prolog* m);

		static Operation dup_var_3_3(Prolog* m);
	/** PREDICATE: built_in/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(built_in/3,public)
		static StructureTerm* const  L_built_in_3_s5;
		public:
			static SymbolTerm* const  ATOM_fail;
	private:
		static StructureTerm* const  L_built_in_3_s9;
		public:
			static SymbolTerm* const  ATOM_$003D;
	private:
		static StructureTerm* const  L_built_in_3_s13;
		static ListTerm* const  L_built_in_3_s15;
		static ListTerm* const  L_built_in_3_s16;
		public:
			static SymbolTerm* const  ATOM_$002B;
	private:
		static StructureTerm* const  L_built_in_3_s19;
		public:
			static SymbolTerm* const  ATOM_$002D;
	private:
		static StructureTerm* const  L_built_in_3_s22;
		public:
			static SymbolTerm* const  ATOM_$002A;
	private:
		static StructureTerm* const  L_built_in_3_s25;
		public:
			static SymbolTerm* const  ATOM_$002F;
	private:
		static StructureTerm* const  L_built_in_3_s28;
		public:
			static SymbolTerm* const  ATOM_$003E$003D;
	private:
		static StructureTerm* const  L_built_in_3_s31;
		public:
			static SymbolTerm* const  ATOM_$003C;
	private:
		static StructureTerm* const  L_built_in_3_s34;
		public:
			static SymbolTerm* const  ATOM_is;
	private:
		static StructureTerm* const  L_built_in_3_s37;




	public:
		static Operation PRED_built_in_3_static_exec(Prolog* m);

	private:
		static Operation built_in_3_var(Prolog* m);

		static Operation built_in_3_var_1(Prolog* m);

		static Operation built_in_3_var_2(Prolog* m);

		static Operation built_in_3_var_3(Prolog* m);

		static Operation built_in_3_var_4(Prolog* m);

		static Operation built_in_3_var_5(Prolog* m);

		static Operation built_in_3_var_6(Prolog* m);

		static Operation built_in_3_var_7(Prolog* m);

		static Operation built_in_3_var_8(Prolog* m);

		static Operation built_in_3_var_9(Prolog* m);

		static Operation built_in_3_var_10(Prolog* m);

		static Operation built_in_3_var_11(Prolog* m);

		static Operation built_in_3_1(Prolog* m);

		static Operation built_in_3_2(Prolog* m);

		static Operation built_in_3_3(Prolog* m);

		static Operation built_in_3_4(Prolog* m);

		static Operation built_in_3_5(Prolog* m);

		static Operation built_in_3_6(Prolog* m);

		static Operation built_in_3_7(Prolog* m);

		static Operation built_in_3_8(Prolog* m);

		static Operation built_in_3_9(Prolog* m);

		static Operation built_in_3_10(Prolog* m);

		static Operation built_in_3_11(Prolog* m);

		static Operation built_in_3_12(Prolog* m);
	/** PREDICATE: worst_case/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(worst_case/2,public)




	public:
		static Operation PRED_worst_case_2_static_exec(Prolog* m);

	private:
		static Operation worst_case_2_var(Prolog* m);

		static Operation worst_case_2_var_1(Prolog* m);

		static Operation worst_case_2_1(Prolog* m);

		static Operation worst_case_2_2(Prolog* m);
	/** PREDICATE: look_up_act/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(look_up_act/2,public)




	public:
		static Operation PRED_look_up_act_2_static_exec(Prolog* m);

	private:
		static Operation look_up_act_2_top(Prolog* m);

		static Operation look_up_act_2_var(Prolog* m);

		static Operation look_up_act_2_var_1(Prolog* m);

		static Operation look_up_act_2_var_2(Prolog* m);

		static Operation look_up_act_2_1(Prolog* m);

		static Operation look_up_act_2_2(Prolog* m);

		static Operation look_up_act_2_3(Prolog* m);
	/** PREDICATE: all_shared/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(all_shared/2,public)




	public:
		static Operation PRED_all_shared_2_static_exec(Prolog* m);
	/** PREDICATE: bind_all/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(bind_all/2,public)




		static Operation PRED_bind_all_2_static_exec(Prolog* m);

	private:
		static Operation bind_all_2_top(Prolog* m);

		static Operation bind_all_2_sub_1(Prolog* m);

		static Operation bind_all_2_sub_2(Prolog* m);

		static Operation bind_all_2_1(Prolog* m);

		static Operation bind_all_2_2(Prolog* m);

		static Operation bind_all_2_3(Prolog* m);
	/** PREDICATE: add_to_list/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(add_to_list/2,public)




	public:
		static Operation PRED_add_to_list_2_static_exec(Prolog* m);

	private:
		static Operation add_to_list_2_top(Prolog* m);

		static Operation add_to_list_2_sub_1(Prolog* m);

		static Operation add_to_list_2_1(Prolog* m);

		static Operation add_to_list_2_2(Prolog* m);
	/** PREDICATE: umember/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(umember/2,public)




	public:
		static Operation PRED_umember_2_static_exec(Prolog* m);

	private:
		static Operation umember_2_top(Prolog* m);

		static Operation umember_2_sub_1(Prolog* m);

		static Operation umember_2_sub_2(Prolog* m);

		static Operation umember_2_1(Prolog* m);

		static Operation umember_2_2(Prolog* m);

		static Operation umember_2_3(Prolog* m);
	/** PREDICATE: sumember/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(sumember/2,public)




	public:
		static Operation PRED_sumember_2_static_exec(Prolog* m);

	private:
		static Operation sumember_2_top(Prolog* m);

		static Operation sumember_2_sub_1(Prolog* m);

		static Operation sumember_2_sub_2(Prolog* m);

		static Operation sumember_2_1(Prolog* m);

		static Operation sumember_2_2(Prolog* m);

		static Operation sumember_2_3(Prolog* m);
	/** PREDICATE: member/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(member/2,public)




	public:
		static Operation PRED_member_2_static_exec(Prolog* m);

	private:
		static Operation member_2_top(Prolog* m);

		static Operation member_2_sub_1(Prolog* m);

		static Operation member_2_1(Prolog* m);

		static Operation member_2_2(Prolog* m);
	/** PREDICATE: smember/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(smember/2,public)




	public:
		static Operation PRED_smember_2_static_exec(Prolog* m);

	private:
		static Operation smember_2_top(Prolog* m);

		static Operation smember_2_sub_1(Prolog* m);

		static Operation smember_2_1(Prolog* m);

		static Operation smember_2_2(Prolog* m);
	/** PREDICATE: eqmember/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(eqmember/2,public)




	public:
		static Operation PRED_eqmember_2_static_exec(Prolog* m);

	private:
		static Operation eqmember_2_top(Prolog* m);

		static Operation eqmember_2_sub_1(Prolog* m);

		static Operation eqmember_2_1(Prolog* m);

		static Operation eqmember_2_2(Prolog* m);
	/** PREDICATE: concat/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(concat/3,public)




	public:
		static Operation PRED_concat_3_static_exec(Prolog* m);

	private:
		static Operation concat_3_top(Prolog* m);

		static Operation concat_3_var(Prolog* m);

		static Operation concat_3_var_1(Prolog* m);

		static Operation concat_3_1(Prolog* m);

		static Operation concat_3_2(Prolog* m);
	/** PREDICATE: nl/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(nl/0,public)




	public:
		static Operation PRED_nl_0_static_exec(Prolog* m);
	/** PREDICATE: $dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main('$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'/3,public)
			static SymbolTerm* const  ATOM_$002C;
			static SymbolTerm* const  ATOM_$0020;




		static Operation PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_2(Prolog* m);
	/** PREDICATE: write_list2/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(write_list2/3,public)




	public:
		static Operation PRED_write_list2_3_static_exec(Prolog* m);
	/** PREDICATE: name_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(name_vars/3,public)
			static SymbolTerm* const  FUNCTOR_$002B_2;




		static Operation PRED_name_vars_3_static_exec(Prolog* m);

	private:
		static Operation name_vars_3_top(Prolog* m);

		static Operation name_vars_3_var(Prolog* m);

		static Operation name_vars_3_var_1(Prolog* m);

		static Operation name_vars_3_var_2(Prolog* m);

		static Operation name_vars_3_var_3(Prolog* m);

		static Operation name_vars_3_int(Prolog* m);

		static Operation name_vars_3_int_1(Prolog* m);

		static Operation name_vars_3_int_2(Prolog* m);

		static Operation name_vars_3_1(Prolog* m);

		static Operation name_vars_3_2(Prolog* m);

		static Operation name_vars_3_3(Prolog* m);

		static Operation name_vars_3_4(Prolog* m);
	/** PREDICATE: make_name/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(make_name/2,public)
		public:
			static SymbolTerm* const  FUNCTOR_$002F$002F_2;
			static IntegerTerm* const  int_26;
			static SymbolTerm* const  FUNCTOR_mod_2;
			static IntegerTerm* const  int_65;
	private:
		static ListTerm* const  L_make_name_2_s7;




	public:
		static Operation PRED_make_name_2_static_exec(Prolog* m);
	/** PREDICATE: build_name/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl
	*/
		// main(build_name/3,public)
			static SymbolTerm* const  FUNCTOR_$002D_2;




		static Operation PRED_build_name_3_static_exec(Prolog* m);

	private:
		static Operation build_name_3_top(Prolog* m);

		static Operation build_name_3_var(Prolog* m);

		static Operation build_name_3_var_1(Prolog* m);

		static Operation build_name_3_1(Prolog* m);

		static Operation build_name_3_2(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_sdda::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_SDDA
