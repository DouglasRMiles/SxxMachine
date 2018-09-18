#ifndef FILE_UNIFY
#define FILE_UNIFY

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
	class FILE_unify : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog* m);
	/** PREDICATE: main/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(main/1,public)




		static Operation PRED_main_1_static_exec(Prolog* m);
	/** PREDICATE: u/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(u/4,public)




		static Operation PRED_u_4_static_exec(Prolog* m);
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main('$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl'/2,public)




		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_2(Prolog* m);
	/** PREDICATE: unify/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(unify/6,public)
		public:
			static SymbolTerm* const  ATOM_nonlast;

		// private final Term arg5, arg6;




		static Operation PRED_unify_6_static_exec(Prolog* m);

	private:
		static Operation unify_6_sub_1(Prolog* m);

		static Operation unify_6_1(Prolog* m);

		static Operation unify_6_2(Prolog* m);
	/** PREDICATE: uninit/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(uninit/6,public)
		public:
			static SymbolTerm* const  FUNCTOR_move_2;
			static SymbolTerm* const  FUNCTOR_$005E_2;
			static SymbolTerm* const  ATOM_h;
			static SymbolTerm* const  ATOM_tatm;

		// private final Term arg5, arg6;




		static Operation PRED_uninit_6_static_exec(Prolog* m);

	private:
		static Operation uninit_6_sub_1(Prolog* m);

		static Operation uninit_6_sub_2(Prolog* m);

		static Operation uninit_6_1(Prolog* m);

		static Operation uninit_6_2(Prolog* m);

		static Operation uninit_6_3(Prolog* m);
	/** PREDICATE: init/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(init/8,public)
		public:
			static SymbolTerm* const  FUNCTOR_deref_1;
			static SymbolTerm* const  FUNCTOR_switch_5;
			static SymbolTerm* const  FUNCTOR_trail_1;
			static SymbolTerm* const  ATOM_fail;

		// private final Term arg5, arg6, arg7, arg8;




		static Operation PRED_init_8_static_exec(Prolog* m);

	private:
		static Operation init_8_sub_1(Prolog* m);

		static Operation init_8_1(Prolog* m);

		static Operation init_8_2(Prolog* m);
	/** PREDICATE: unify_var/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(unify_var/6,public)
		public:
			static SymbolTerm* const  FUNCTOR_unify_3;
			static SymbolTerm* const  ATOM_tvar;
	private:
		static StructureTerm* const  L_unify_var_6_s8;
		public:
			static SymbolTerm* const  FUNCTOR_add_2;
	private:
		static StructureTerm* const  L_unify_var_6_s12;
		public:
			static SymbolTerm* const  FUNCTOR_$002D_2;
	private:
		static StructureTerm* const  L_unify_var_6_s15;
		static ListTerm* const  L_unify_var_6_s17;

		// private final Term arg5, arg6;




	public:
		static Operation PRED_unify_var_6_static_exec(Prolog* m);

	private:
		static Operation unify_var_6_sub_1(Prolog* m);

		static Operation unify_var_6_sub_2(Prolog* m);

		static Operation unify_var_6_sub_3(Prolog* m);

		static Operation unify_var_6_1(Prolog* m);

		static Operation unify_var_6_2(Prolog* m);

		static Operation unify_var_6_3(Prolog* m);

		static Operation unify_var_6_4(Prolog* m);
	/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main('$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl'/2,public)




	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_2(Prolog* m);
	/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main('$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl'/2,public)




	public:
		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_2(Prolog* m);
	/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main('$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl'/2,public)




	public:
		static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_2(Prolog* m);
	/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main('$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl'/2,public)




	public:
		static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_2(Prolog* m);
	/** PREDICATE: unify_readmode/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(unify_readmode/7,public)
		public:
			static SymbolTerm* const  FUNCTOR_equal_3;
			static SymbolTerm* const  FUNCTOR_$002F_2;

		// private final Term arg5, arg6, arg7;




		static Operation PRED_unify_readmode_7_static_exec(Prolog* m);

	private:
		static Operation unify_readmode_7_sub_1(Prolog* m);

		static Operation unify_readmode_7_sub_2(Prolog* m);

		static Operation unify_readmode_7_1(Prolog* m);

		static Operation unify_readmode_7_2(Prolog* m);

		static Operation unify_readmode_7_3(Prolog* m);
	/** PREDICATE: unify_args/10
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(unify_args/10,public)
		public:
			static SymbolTerm* const  ATOM_last;
			static SymbolTerm* const  FUNCTOR_$002B_2;

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10;




		static Operation PRED_unify_args_10_static_exec(Prolog* m);

	private:
		static Operation unify_args_10_sub_1(Prolog* m);

		static Operation unify_args_10_sub_2(Prolog* m);

		static Operation unify_args_10_1(Prolog* m);

		static Operation unify_args_10_2(Prolog* m);

		static Operation unify_args_10_3(Prolog* m);
	/** PREDICATE: unify_arg/10
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(unify_arg/10,public)

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10;




	public:
		static Operation PRED_unify_arg_10_static_exec(Prolog* m);
	/** PREDICATE: unify_writemode/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(unify_writemode/7,public)

		// private final Term arg5, arg6, arg7;




		static Operation PRED_unify_writemode_7_static_exec(Prolog* m);

	private:
		static Operation unify_writemode_7_sub_1(Prolog* m);

		static Operation unify_writemode_7_1(Prolog* m);

		static Operation unify_writemode_7_2(Prolog* m);
	/** PREDICATE: unify_block/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(unify_block/8,public)
		public:
			static SymbolTerm* const  FUNCTOR_jump_1;
			static SymbolTerm* const  FUNCTOR_$002D_1;

		// private final Term arg5, arg6, arg7, arg8;




		static Operation PRED_unify_block_8_static_exec(Prolog* m);

	private:
		static Operation unify_block_8_var(Prolog* m);

		static Operation unify_block_8_var_1(Prolog* m);

		static Operation unify_block_8_1(Prolog* m);

		static Operation unify_block_8_2(Prolog* m);
	/** PREDICATE: (block)/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main((block)/8,public)

		// private final Term arg5, arg6, arg7, arg8;




	public:
		static Operation PRED_block_8_static_exec(Prolog* m);

	private:
		static Operation block_8_sub_1(Prolog* m);

		static Operation block_8_sub_2(Prolog* m);

		static Operation block_8_sub_3(Prolog* m);

		static Operation block_8_1(Prolog* m);

		static Operation block_8_2(Prolog* m);

		static Operation block_8_3(Prolog* m);

		static Operation block_8_4(Prolog* m);
	/** PREDICATE: block_args/11
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(block_args/11,public)
		public:
			static SymbolTerm* const  FUNCTOR_label_1;

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;




		static Operation PRED_block_args_11_static_exec(Prolog* m);

	private:
		static Operation block_args_11_sub_1(Prolog* m);

		static Operation block_args_11_sub_2(Prolog* m);

		static Operation block_args_11_1(Prolog* m);

		static Operation block_args_11_2(Prolog* m);

		static Operation block_args_11_3(Prolog* m);
	/** PREDICATE: make_slots/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(make_slots/9,public)

		// private final Term arg5, arg6, arg7, arg8, arg9;




	public:
		static Operation PRED_make_slots_9_static_exec(Prolog* m);

	private:
		static Operation make_slots_9_sub_1(Prolog* m);

		static Operation make_slots_9_1(Prolog* m);

		static Operation make_slots_9_2(Prolog* m);
	/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main('$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl'/2,public)




	public:
		static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_2_2(Prolog* m);
	/** PREDICATE: init_var/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(init_var/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_init_var_5_static_exec(Prolog* m);

	private:
		static Operation init_var_5_sub_1(Prolog* m);

		static Operation init_var_5_sub_2(Prolog* m);

		static Operation init_var_5_1(Prolog* m);

		static Operation init_var_5_2(Prolog* m);

		static Operation init_var_5_3(Prolog* m);
	/** PREDICATE: make_word/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(make_word/3,public)




	public:
		static Operation PRED_make_word_3_static_exec(Prolog* m);

	private:
		static Operation make_word_3_sub_1(Prolog* m);

		static Operation make_word_3_sub_2(Prolog* m);

		static Operation make_word_3_1(Prolog* m);

		static Operation make_word_3_2(Prolog* m);

		static Operation make_word_3_3(Prolog* m);
	/** PREDICATE: size/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(size/3,public)




	public:
		static Operation PRED_size_3_static_exec(Prolog* m);

	private:
		static Operation size_3_sub_1(Prolog* m);

		static Operation size_3_sub_2(Prolog* m);

		static Operation size_3_sub_3(Prolog* m);

		static Operation size_3_1(Prolog* m);

		static Operation size_3_2(Prolog* m);

		static Operation size_3_3(Prolog* m);

		static Operation size_3_4(Prolog* m);
	/** PREDICATE: size_args/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(size_args/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_size_args_5_static_exec(Prolog* m);

	private:
		static Operation size_args_5_sub_1(Prolog* m);

		static Operation size_args_5_1(Prolog* m);

		static Operation size_args_5_2(Prolog* m);
	/** PREDICATE: add/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(add/3,public)




	public:
		static Operation PRED_add_3_static_exec(Prolog* m);
	/** PREDICATE: myin/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(myin/2,public)




		static Operation PRED_myin_2_static_exec(Prolog* m);
	/** PREDICATE: in_2/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(in_2/3,public)
			static SymbolTerm* const  ATOM_$003D;
			static SymbolTerm* const  ATOM_$003E;




		static Operation PRED_in_2_3_static_exec(Prolog* m);

	private:
		static Operation in_2_3_var(Prolog* m);

		static Operation in_2_3_var_1(Prolog* m);

		static Operation in_2_3_1(Prolog* m);

		static Operation in_2_3_2(Prolog* m);
	/** PREDICATE: incl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(incl/3,public)




	public:
		static Operation PRED_incl_3_static_exec(Prolog* m);
	/** PREDICATE: incl_2/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(incl_2/3,public)




		static Operation PRED_incl_2_3_static_exec(Prolog* m);

	private:
		static Operation incl_2_3_var(Prolog* m);

		static Operation incl_2_3_var_1(Prolog* m);

		static Operation incl_2_3_1(Prolog* m);

		static Operation incl_2_3_2(Prolog* m);
	/** PREDICATE: incl_3/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(incl_3/5,public)
		public:
			static SymbolTerm* const  ATOM_$003C;

		// private final Term arg5;




		static Operation PRED_incl_3_5_static_exec(Prolog* m);

	private:
		static Operation incl_3_5_var(Prolog* m);

		static Operation incl_3_5_var_1(Prolog* m);

		static Operation incl_3_5_var_2(Prolog* m);

		static Operation incl_3_5_1(Prolog* m);

		static Operation incl_3_5_2(Prolog* m);

		static Operation incl_3_5_3(Prolog* m);
	/** PREDICATE: $dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main('$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl'/1,public)




	public:
		static Operation PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_1_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_1_2(Prolog* m);
	/** PREDICATE: my_compound/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(my_compound/1,public)




	public:
		static Operation PRED_my_compound_1_static_exec(Prolog* m);
	/** PREDICATE: cons/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(cons/1,public)




		static Operation PRED_cons_1_static_exec(Prolog* m);
	/** PREDICATE: $dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main('$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl'/3,public)




		static Operation PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_3_1(Prolog* m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Funify$002Epl_3_2(Prolog* m);
	/** PREDICATE: structure/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(structure/1,public)




	public:
		static Operation PRED_structure_1_static_exec(Prolog* m);
	/** PREDICATE: termtag/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/unify.pl
	*/
		// main(termtag/2,public)
			static SymbolTerm* const  ATOM_tstr;
			static SymbolTerm* const  ATOM_tlst;




		static Operation PRED_termtag_2_static_exec(Prolog* m);

	private:
		static Operation termtag_2_sub_1(Prolog* m);

		static Operation termtag_2_sub_2(Prolog* m);

		static Operation termtag_2_sub_3(Prolog* m);

		static Operation termtag_2_1(Prolog* m);

		static Operation termtag_2_2(Prolog* m);

		static Operation termtag_2_3(Prolog* m);

		static Operation termtag_2_4(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_unify::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_UNIFY
