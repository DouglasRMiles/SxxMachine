#pragma once

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class StructureTerm;
	class ListTerm;
	class Operation;
	class Prolog;
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
	class FILE_reducer : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(top/0,public)
		public:
			static SymbolTerm *const FUNCTOR_fac_1;
	private:
		static StructureTerm *const L_top_0_s4;
		public:
			static SymbolTerm *const FUNCTOR_quick_1;
	private:
		static ListTerm *const L_top_0_s9;
		static ListTerm *const L_top_0_s10;
		static ListTerm *const L_top_0_s11;
		static StructureTerm *const L_top_0_s13;




	public:
		static Operation PRED_top_0_static_exec(Prolog *m);
	/** PREDICATE: try/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(try/2,public)




		static Operation PRED_try_2_static_exec(Prolog *m);
	/** PREDICATE: end/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(end/1,public)




		static Operation PRED_end_1_static_exec(Prolog *m);

	private:
		static Operation end_1_sub_1(Prolog *m);

		static Operation end_1_1(Prolog *m);

		static Operation end_1_2(Prolog *m);
	/** PREDICATE: list_functor_name/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(list_functor_name/1,public)




	public:
		static Operation PRED_list_functor_name_1_static_exec(Prolog *m);
	/** PREDICATE: t_def/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(t_def/3,public)
			static SymbolTerm *const ATOM_fac;
			static SymbolTerm *const FUNCTOR_cond_3;
			static SymbolTerm *const FUNCTOR_$003D_2;
			static SymbolTerm *const FUNCTOR_$002A_2;
			static SymbolTerm *const FUNCTOR_$002D_2;
			static SymbolTerm *const ATOM_quick;
			static SymbolTerm *const FUNCTOR_tl_1;
			static SymbolTerm *const FUNCTOR_quick2_1;
			static SymbolTerm *const FUNCTOR_split_2;
			static SymbolTerm *const FUNCTOR_hd_1;
			static SymbolTerm *const ATOM_quick2;
			static SymbolTerm *const FUNCTOR_append_2;
			static SymbolTerm *const ATOM_split;
			static SymbolTerm *const FUNCTOR_$003D$003C_2;
			static SymbolTerm *const FUNCTOR_inserthead_2;
			static SymbolTerm *const FUNCTOR_inserttail_2;
			static SymbolTerm *const ATOM_inserthead;
			static SymbolTerm *const ATOM_inserttail;
			static SymbolTerm *const ATOM_append;




		static Operation PRED_t_def_3_static_exec(Prolog *m);

	private:
		static Operation t_def_3_var(Prolog *m);

		static Operation t_def_3_var_1(Prolog *m);

		static Operation t_def_3_var_2(Prolog *m);

		static Operation t_def_3_var_3(Prolog *m);

		static Operation t_def_3_var_4(Prolog *m);

		static Operation t_def_3_var_5(Prolog *m);

		static Operation t_def_3_var_6(Prolog *m);

		static Operation t_def_3_1(Prolog *m);

		static Operation t_def_3_2(Prolog *m);

		static Operation t_def_3_3(Prolog *m);

		static Operation t_def_3_4(Prolog *m);

		static Operation t_def_3_5(Prolog *m);

		static Operation t_def_3_6(Prolog *m);

		static Operation t_def_3_7(Prolog *m);
	/** PREDICATE: t_reduce/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(t_reduce/2,public)




	public:
		static Operation PRED_t_reduce_2_static_exec(Prolog *m);

	private:
		static Operation t_reduce_2_var(Prolog *m);

		static Operation t_reduce_2_var_1(Prolog *m);

		static Operation t_reduce_2_var_2(Prolog *m);

		static Operation t_reduce_2_int(Prolog *m);

		static Operation t_reduce_2_int_1(Prolog *m);

		static Operation t_reduce_2_1(Prolog *m);

		static Operation t_reduce_2_2(Prolog *m);

		static Operation t_reduce_2_3(Prolog *m);
	/** PREDICATE: t_append/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(t_append/4,public)




	public:
		static Operation PRED_t_append_4_static_exec(Prolog *m);

	private:
		static Operation t_append_4_top(Prolog *m);

		static Operation t_append_4_var(Prolog *m);

		static Operation t_append_4_var_1(Prolog *m);

		static Operation t_append_4_1(Prolog *m);

		static Operation t_append_4_2(Prolog *m);
	/** PREDICATE: t_redex/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(t_redex/2,public)
		public:
			static SymbolTerm *const ATOM_sp;
			static SymbolTerm *const ATOM_bp;
			static SymbolTerm *const ATOM_cp;
			static SymbolTerm *const ATOM_s;
			static SymbolTerm *const ATOM_b;
			static SymbolTerm *const ATOM_c;
			static SymbolTerm *const ATOM_k;
			static SymbolTerm *const ATOM_i;
			static SymbolTerm *const ATOM_cond;
			static SymbolTerm *const ATOM_apply;
			static SymbolTerm *const ATOM_hd;
			static SymbolTerm *const ATOM_tl;
			static SymbolTerm *const ATOM_$002B;
			static SymbolTerm *const ATOM_$002D;
			static SymbolTerm *const ATOM_$002A;
			static SymbolTerm *const ATOM_$002F$002F;
			static SymbolTerm *const ATOM_mod;
	private:
		static ListTerm *const L_t_redex_2_s20;
		static ListTerm *const L_t_redex_2_s21;
		static ListTerm *const L_t_redex_2_s22;
		static ListTerm *const L_t_redex_2_s23;
		static ListTerm *const L_t_redex_2_s24;
		public:
			static SymbolTerm *const ATOM_$003C;
			static SymbolTerm *const ATOM_$003E;
			static SymbolTerm *const ATOM_$003D$003C;
			static SymbolTerm *const ATOM_$003E$003D;
			static SymbolTerm *const ATOM_$003D$005C$003D;
			static SymbolTerm *const ATOM_$003D$003A$003D;
	private:
		static ListTerm *const L_t_redex_2_s31;
		static ListTerm *const L_t_redex_2_s32;
		static ListTerm *const L_t_redex_2_s33;
		static ListTerm *const L_t_redex_2_s34;
		static ListTerm *const L_t_redex_2_s35;
		static ListTerm *const L_t_redex_2_s36;
		public:
			static SymbolTerm *const ATOM_$003D;
	private:
		static ListTerm *const L_t_redex_2_s38;




	public:
		static Operation PRED_t_redex_2_static_exec(Prolog *m);

	private:
		static Operation t_redex_2_var(Prolog *m);

		static Operation t_redex_2_var_1(Prolog *m);

		static Operation t_redex_2_var_2(Prolog *m);

		static Operation t_redex_2_var_3(Prolog *m);

		static Operation t_redex_2_var_4(Prolog *m);

		static Operation t_redex_2_var_5(Prolog *m);

		static Operation t_redex_2_var_6(Prolog *m);

		static Operation t_redex_2_var_7(Prolog *m);

		static Operation t_redex_2_var_8(Prolog *m);

		static Operation t_redex_2_var_9(Prolog *m);

		static Operation t_redex_2_var_10(Prolog *m);

		static Operation t_redex_2_var_11(Prolog *m);

		static Operation t_redex_2_var_12(Prolog *m);

		static Operation t_redex_2_var_13(Prolog *m);

		static Operation t_redex_2_var_14(Prolog *m);

		static Operation t_redex_2_var_15(Prolog *m);

		static Operation t_redex_2_var_16(Prolog *m);

		static Operation t_redex_2_var_17(Prolog *m);

		static Operation t_redex_2_1(Prolog *m);

		static Operation t_redex_2_2(Prolog *m);

		static Operation t_redex_2_3(Prolog *m);

		static Operation t_redex_2_4(Prolog *m);

		static Operation t_redex_2_5(Prolog *m);

		static Operation t_redex_2_6(Prolog *m);

		static Operation t_redex_2_7(Prolog *m);

		static Operation t_redex_2_8(Prolog *m);

		static Operation t_redex_2_9(Prolog *m);

		static Operation t_redex_2_10(Prolog *m);

		static Operation t_redex_2_11(Prolog *m);

		static Operation t_redex_2_12(Prolog *m);

		static Operation t_redex_2_13(Prolog *m);

		static Operation t_redex_2_14(Prolog *m);

		static Operation t_redex_2_15(Prolog *m);

		static Operation t_redex_2_16(Prolog *m);

		static Operation t_redex_2_17(Prolog *m);

		static Operation t_redex_2_18(Prolog *m);
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main('$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'/4,public)
		public:
			static SymbolTerm *const ATOM_false;




		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_static_exec(Prolog *m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_sub_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_2(Prolog *m);
	/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main('$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'/3,public)




	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_static_exec(Prolog *m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_sub_1(Prolog *m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_1(Prolog *m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_2(Prolog *m);
	/** PREDICATE: eval/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(eval/4,public)
		public:
			static SymbolTerm *const FUNCTOR_$002B_2;
			static SymbolTerm *const FUNCTOR_$002F$002F_2;
			static SymbolTerm *const FUNCTOR_mod_2;




		static Operation PRED_eval_4_static_exec(Prolog *m);

	private:
		static Operation eval_4_var(Prolog *m);

		static Operation eval_4_var_1(Prolog *m);

		static Operation eval_4_var_2(Prolog *m);

		static Operation eval_4_var_3(Prolog *m);

		static Operation eval_4_var_4(Prolog *m);

		static Operation eval_4_1(Prolog *m);

		static Operation eval_4_2(Prolog *m);

		static Operation eval_4_3(Prolog *m);

		static Operation eval_4_4(Prolog *m);

		static Operation eval_4_5(Prolog *m);
	/** PREDICATE: eval1/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(eval1/3,public)
		public:
			static SymbolTerm *const FUNCTOR_$002D_1;




		static Operation PRED_eval1_3_static_exec(Prolog *m);
	/** PREDICATE: relop/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(relop/3,public)




		static Operation PRED_relop_3_static_exec(Prolog *m);

	private:
		static Operation relop_3_var(Prolog *m);

		static Operation relop_3_var_1(Prolog *m);

		static Operation relop_3_var_2(Prolog *m);

		static Operation relop_3_var_3(Prolog *m);

		static Operation relop_3_var_4(Prolog *m);

		static Operation relop_3_var_5(Prolog *m);

		static Operation relop_3_1(Prolog *m);

		static Operation relop_3_2(Prolog *m);

		static Operation relop_3_3(Prolog *m);

		static Operation relop_3_4(Prolog *m);

		static Operation relop_3_5(Prolog *m);

		static Operation relop_3_6(Prolog *m);
	/** PREDICATE: t/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(t/3,public)




	public:
		static Operation PRED_t_3_static_exec(Prolog *m);
	/** PREDICATE: t_argvars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(t_argvars/3,public)




		static Operation PRED_t_argvars_3_static_exec(Prolog *m);

	private:
		static Operation t_argvars_3_top(Prolog *m);

		static Operation t_argvars_3_var(Prolog *m);

		static Operation t_argvars_3_var_1(Prolog *m);

		static Operation t_argvars_3_1(Prolog *m);

		static Operation t_argvars_3_2(Prolog *m);
	/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main('$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'/1,public)




	public:
		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_static_exec(Prolog *m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_sub_1(Prolog *m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_1(Prolog *m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_2(Prolog *m);
	/** PREDICATE: curry/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(curry/2,public)




	public:
		static Operation PRED_curry_2_static_exec(Prolog *m);

	private:
		static Operation curry_2_var(Prolog *m);

		static Operation curry_2_var_1(Prolog *m);

		static Operation curry_2_1(Prolog *m);

		static Operation curry_2_2(Prolog *m);
	/** PREDICATE: currylist/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(currylist/3,public)




	public:
		static Operation PRED_currylist_3_static_exec(Prolog *m);

	private:
		static Operation currylist_3_var(Prolog *m);

		static Operation currylist_3_var_1(Prolog *m);

		static Operation currylist_3_1(Prolog *m);

		static Operation currylist_3_2(Prolog *m);
	/** PREDICATE: t_vars/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(t_vars/2,public)
		static ListTerm *const L_t_vars_2_s2;




	public:
		static Operation PRED_t_vars_2_static_exec(Prolog *m);

	private:
		static Operation t_vars_2_top(Prolog *m);

		static Operation t_vars_2_var(Prolog *m);

		static Operation t_vars_2_var_1(Prolog *m);

		static Operation t_vars_2_var_2(Prolog *m);

		static Operation t_vars_2_var_3(Prolog *m);

		static Operation t_vars_2_int(Prolog *m);

		static Operation t_vars_2_int_1(Prolog *m);

		static Operation t_vars_2_1(Prolog *m);

		static Operation t_vars_2_2(Prolog *m);

		static Operation t_vars_2_3(Prolog *m);

		static Operation t_vars_2_4(Prolog *m);
	/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main('$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'/2,public)




	public:
		static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_static_exec(Prolog *m);

	private:
		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_sub_1(Prolog *m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_1(Prolog *m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_2(Prolog *m);
	/** PREDICATE: t_trans/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(t_trans/4,public)




	public:
		static Operation PRED_t_trans_4_static_exec(Prolog *m);

	private:
		static Operation t_trans_4_sub_1(Prolog *m);

		static Operation t_trans_4_sub_2(Prolog *m);

		static Operation t_trans_4_sub_3(Prolog *m);

		static Operation t_trans_4_sub_4(Prolog *m);

		static Operation t_trans_4_1(Prolog *m);

		static Operation t_trans_4_2(Prolog *m);

		static Operation t_trans_4_3(Prolog *m);

		static Operation t_trans_4_4(Prolog *m);

		static Operation t_trans_4_5(Prolog *m);
	/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main('$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_static_exec(Prolog *m);

	private:
		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_sub_1(Prolog *m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_1(Prolog *m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_2(Prolog *m);
	/** PREDICATE: t_rule1/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(t_rule1/8,public)

		// private final Term arg5, arg6, arg7, arg8;




	public:
		static Operation PRED_t_rule1_8_static_exec(Prolog *m);

	private:
		static Operation t_rule1_8_sub_1(Prolog *m);

		static Operation t_rule1_8_sub_2(Prolog *m);

		static Operation t_rule1_8_sub_3(Prolog *m);

		static Operation t_rule1_8_1(Prolog *m);

		static Operation t_rule1_8_2(Prolog *m);

		static Operation t_rule1_8_3(Prolog *m);

		static Operation t_rule1_8_4(Prolog *m);
	/** PREDICATE: t_rule2/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(t_rule2/9,public)

		// private final Term arg5, arg6, arg7, arg8, arg9;




	public:
		static Operation PRED_t_rule2_9_static_exec(Prolog *m);

	private:
		static Operation t_rule2_9_sub_1(Prolog *m);

		static Operation t_rule2_9_sub_2(Prolog *m);

		static Operation t_rule2_9_sub_3(Prolog *m);

		static Operation t_rule2_9_sub_4(Prolog *m);

		static Operation t_rule2_9_sub_5(Prolog *m);

		static Operation t_rule2_9_1(Prolog *m);

		static Operation t_rule2_9_2(Prolog *m);

		static Operation t_rule2_9_3(Prolog *m);

		static Operation t_rule2_9_4(Prolog *m);

		static Operation t_rule2_9_5(Prolog *m);

		static Operation t_rule2_9_6(Prolog *m);
	/** PREDICATE: make_list/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(make_list/2,public)




	public:
		static Operation PRED_make_list_2_static_exec(Prolog *m);

	private:
		static Operation make_list_2_var(Prolog *m);

		static Operation make_list_2_var_1(Prolog *m);

		static Operation make_list_2_1(Prolog *m);

		static Operation make_list_2_2(Prolog *m);
	/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main('$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'/1,public)




	public:
		static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_static_exec(Prolog *m);

	private:
		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_sub_1(Prolog *m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_1(Prolog *m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_2(Prolog *m);
	/** PREDICATE: listify/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(listify/2,public)




	public:
		static Operation PRED_listify_2_static_exec(Prolog *m);

	private:
		static Operation listify_2_sub_1(Prolog *m);

		static Operation listify_2_1(Prolog *m);

		static Operation listify_2_2(Prolog *m);
	/** PREDICATE: listify_list/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(listify_list/4,public)




	public:
		static Operation PRED_listify_list_4_static_exec(Prolog *m);

	private:
		static Operation listify_list_4_sub_1(Prolog *m);

		static Operation listify_list_4_1(Prolog *m);

		static Operation listify_list_4_2(Prolog *m);
	/** PREDICATE: member/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(member/2,public)




	public:
		static Operation PRED_member_2_static_exec(Prolog *m);

	private:
		static Operation member_2_top(Prolog *m);

		static Operation member_2_sub_1(Prolog *m);

		static Operation member_2_1(Prolog *m);

		static Operation member_2_2(Prolog *m);
	/** PREDICATE: append/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(append/3,public)




	public:
		static Operation PRED_append_3_static_exec(Prolog *m);

	private:
		static Operation append_3_top(Prolog *m);

		static Operation append_3_var(Prolog *m);

		static Operation append_3_var_1(Prolog *m);

		static Operation append_3_1(Prolog *m);

		static Operation append_3_2(Prolog *m);
	/** PREDICATE: intersectv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(intersectv/3,public)




	public:
		static Operation PRED_intersectv_3_static_exec(Prolog *m);

	private:
		static Operation intersectv_3_var(Prolog *m);

		static Operation intersectv_3_var_1(Prolog *m);

		static Operation intersectv_3_1(Prolog *m);

		static Operation intersectv_3_2(Prolog *m);
	/** PREDICATE: intersectv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(intersectv_2/4,public)




	public:
		static Operation PRED_intersectv_2_4_static_exec(Prolog *m);

	private:
		static Operation intersectv_2_4_var(Prolog *m);

		static Operation intersectv_2_4_var_1(Prolog *m);

		static Operation intersectv_2_4_1(Prolog *m);

		static Operation intersectv_2_4_2(Prolog *m);
	/** PREDICATE: intersectv_3/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(intersectv_3/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_intersectv_3_6_static_exec(Prolog *m);

	private:
		static Operation intersectv_3_6_var(Prolog *m);

		static Operation intersectv_3_6_var_1(Prolog *m);

		static Operation intersectv_3_6_var_2(Prolog *m);

		static Operation intersectv_3_6_1(Prolog *m);

		static Operation intersectv_3_6_2(Prolog *m);

		static Operation intersectv_3_6_3(Prolog *m);
	/** PREDICATE: intersectv_list/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(intersectv_list/2,public)




	public:
		static Operation PRED_intersectv_list_2_static_exec(Prolog *m);

	private:
		static Operation intersectv_list_2_var(Prolog *m);

		static Operation intersectv_list_2_var_1(Prolog *m);

		static Operation intersectv_list_2_1(Prolog *m);

		static Operation intersectv_list_2_2(Prolog *m);
	/** PREDICATE: intersectv_list/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(intersectv_list/3,public)




	public:
		static Operation PRED_intersectv_list_3_static_exec(Prolog *m);

	private:
		static Operation intersectv_list_3_var(Prolog *m);

		static Operation intersectv_list_3_var_1(Prolog *m);

		static Operation intersectv_list_3_1(Prolog *m);

		static Operation intersectv_list_3_2(Prolog *m);
	/** PREDICATE: diffv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(diffv/3,public)




	public:
		static Operation PRED_diffv_3_static_exec(Prolog *m);

	private:
		static Operation diffv_3_var(Prolog *m);

		static Operation diffv_3_var_1(Prolog *m);

		static Operation diffv_3_1(Prolog *m);

		static Operation diffv_3_2(Prolog *m);
	/** PREDICATE: diffv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(diffv_2/4,public)




	public:
		static Operation PRED_diffv_2_4_static_exec(Prolog *m);

	private:
		static Operation diffv_2_4_var(Prolog *m);

		static Operation diffv_2_4_var_1(Prolog *m);

		static Operation diffv_2_4_1(Prolog *m);

		static Operation diffv_2_4_2(Prolog *m);
	/** PREDICATE: diffv_3/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(diffv_3/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_diffv_3_6_static_exec(Prolog *m);

	private:
		static Operation diffv_3_6_var(Prolog *m);

		static Operation diffv_3_6_var_1(Prolog *m);

		static Operation diffv_3_6_var_2(Prolog *m);

		static Operation diffv_3_6_1(Prolog *m);

		static Operation diffv_3_6_2(Prolog *m);

		static Operation diffv_3_6_3(Prolog *m);
	/** PREDICATE: unionv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(unionv/3,public)




	public:
		static Operation PRED_unionv_3_static_exec(Prolog *m);

	private:
		static Operation unionv_3_var(Prolog *m);

		static Operation unionv_3_var_1(Prolog *m);

		static Operation unionv_3_1(Prolog *m);

		static Operation unionv_3_2(Prolog *m);
	/** PREDICATE: unionv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(unionv_2/4,public)




	public:
		static Operation PRED_unionv_2_4_static_exec(Prolog *m);

	private:
		static Operation unionv_2_4_var(Prolog *m);

		static Operation unionv_2_4_var_1(Prolog *m);

		static Operation unionv_2_4_1(Prolog *m);

		static Operation unionv_2_4_2(Prolog *m);
	/** PREDICATE: unionv_3/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(unionv_3/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_unionv_3_6_static_exec(Prolog *m);

	private:
		static Operation unionv_3_6_var(Prolog *m);

		static Operation unionv_3_6_var_1(Prolog *m);

		static Operation unionv_3_6_var_2(Prolog *m);

		static Operation unionv_3_6_1(Prolog *m);

		static Operation unionv_3_6_2(Prolog *m);

		static Operation unionv_3_6_3(Prolog *m);
	/** PREDICATE: subsetv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(subsetv/2,public)




	public:
		static Operation PRED_subsetv_2_static_exec(Prolog *m);

	private:
		static Operation subsetv_2_var(Prolog *m);

		static Operation subsetv_2_var_1(Prolog *m);

		static Operation subsetv_2_1(Prolog *m);

		static Operation subsetv_2_2(Prolog *m);
	/** PREDICATE: subsetv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(subsetv_2/4,public)




	public:
		static Operation PRED_subsetv_2_4_static_exec(Prolog *m);

	private:
		static Operation subsetv_2_4_var(Prolog *m);

		static Operation subsetv_2_4_var_1(Prolog *m);

		static Operation subsetv_2_4_1(Prolog *m);

		static Operation subsetv_2_4_2(Prolog *m);
	/** PREDICATE: small_subsetv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(small_subsetv/2,public)




	public:
		static Operation PRED_small_subsetv_2_static_exec(Prolog *m);

	private:
		static Operation small_subsetv_2_var(Prolog *m);

		static Operation small_subsetv_2_var_1(Prolog *m);

		static Operation small_subsetv_2_1(Prolog *m);

		static Operation small_subsetv_2_2(Prolog *m);
	/** PREDICATE: inv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(inv/2,public)




	public:
		static Operation PRED_inv_2_static_exec(Prolog *m);
	/** PREDICATE: inv_2/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(inv_2/3,public)




		static Operation PRED_inv_2_3_static_exec(Prolog *m);

	private:
		static Operation inv_2_3_var(Prolog *m);

		static Operation inv_2_3_var_1(Prolog *m);

		static Operation inv_2_3_1(Prolog *m);

		static Operation inv_2_3_2(Prolog *m);
	/** PREDICATE: notinv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(notinv/2,public)




	public:
		static Operation PRED_notinv_2_static_exec(Prolog *m);
	/** PREDICATE: notinv_2/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(notinv_2/2,public)




		static Operation PRED_notinv_2_2_static_exec(Prolog *m);

	private:
		static Operation notinv_2_2_var(Prolog *m);

		static Operation notinv_2_2_var_1(Prolog *m);

		static Operation notinv_2_2_1(Prolog *m);

		static Operation notinv_2_2_2(Prolog *m);
	/** PREDICATE: notinv_3/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
		// main(notinv_3/3,public)




	public:
		static Operation PRED_notinv_3_3_static_exec(Prolog *m);

	private:
		static Operation notinv_3_3_var(Prolog *m);

		static Operation notinv_3_3_var_1(Prolog *m);

		static Operation notinv_3_3_1(Prolog *m);

		static Operation notinv_3_3_2(Prolog *m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_reducer::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
