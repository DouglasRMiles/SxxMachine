#ifndef FILE_META_QSORT
#define FILE_META_QSORT

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class IntegerTerm; }
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
	class FILE_meta_qsort : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog* m);
	/** PREDICATE: meta_qsort/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
		// main(meta_qsort/0,public)
			static SymbolTerm* const  ATOM_qsort;




		static Operation PRED_meta_qsort_0_static_exec(Prolog* m);
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
		// main('$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'/1,public)




		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_2(Prolog* m);
	/** PREDICATE: interpret/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
		// main(interpret/1,public)




	public:
		static Operation PRED_interpret_1_static_exec(Prolog* m);
	/** PREDICATE: interpret/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
		// main(interpret/2,public)
			static SymbolTerm* const  FUNCTOR_$002C_2;
			static SymbolTerm* const  FUNCTOR_or_2;
			static SymbolTerm* const  FUNCTOR_$002D$003E_2;
			static SymbolTerm* const  ATOM_fail;
			static SymbolTerm* const  FUNCTOR_$005C$002B_1;
			static SymbolTerm* const  ATOM_$0021;




		static Operation PRED_interpret_2_static_exec(Prolog* m);

	private:
		static Operation interpret_2_top(Prolog* m);

		static Operation interpret_2_var(Prolog* m);

		static Operation interpret_2_var_1(Prolog* m);

		static Operation interpret_2_var_2(Prolog* m);

		static Operation interpret_2_var_3(Prolog* m);

		static Operation interpret_2_var_4(Prolog* m);

		static Operation interpret_2_var_5(Prolog* m);

		static Operation interpret_2_var_6(Prolog* m);

		static Operation interpret_2_var_7(Prolog* m);

		static Operation interpret_2_var_8(Prolog* m);

		static Operation interpret_2_int(Prolog* m);

		static Operation interpret_2_int_1(Prolog* m);

		static Operation interpret_2_int_2(Prolog* m);

		static Operation interpret_2_int_3(Prolog* m);

		static Operation interpret_2_con(Prolog* m);

		static Operation interpret_2_con_1(Prolog* m);

		static Operation interpret_2_con_2(Prolog* m);

		static Operation interpret_2_con_3(Prolog* m);

		static Operation interpret_2_con_4(Prolog* m);

		static Operation interpret_2_str(Prolog* m);

		static Operation interpret_2_str_1(Prolog* m);

		static Operation interpret_2_str_2(Prolog* m);

		static Operation interpret_2_str_3(Prolog* m);

		static Operation interpret_2_str_4(Prolog* m);

		static Operation interpret_2_str_5(Prolog* m);

		static Operation interpret_2_str_6(Prolog* m);

		static Operation interpret_2_str_7(Prolog* m);

		static Operation interpret_2_1(Prolog* m);

		static Operation interpret_2_2(Prolog* m);

		static Operation interpret_2_3(Prolog* m);

		static Operation interpret_2_4(Prolog* m);

		static Operation interpret_2_5(Prolog* m);

		static Operation interpret_2_6(Prolog* m);

		static Operation interpret_2_7(Prolog* m);

		static Operation interpret_2_8(Prolog* m);

		static Operation interpret_2_9(Prolog* m);
	/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
		// main('$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'/3,public)




	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_2(Prolog* m);
	/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
		// main('$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'/3,public)




	public:
		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_2(Prolog* m);
	/** PREDICATE: interpret_disjunction/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
		// main(interpret_disjunction/3,public)




	public:
		static Operation PRED_interpret_disjunction_3_static_exec(Prolog* m);

	private:
		static Operation interpret_disjunction_3_var(Prolog* m);

		static Operation interpret_disjunction_3_var_1(Prolog* m);

		static Operation interpret_disjunction_3_var_2(Prolog* m);

		static Operation interpret_disjunction_3_var_3(Prolog* m);

		static Operation interpret_disjunction_3_int(Prolog* m);

		static Operation interpret_disjunction_3_int_1(Prolog* m);

		static Operation interpret_disjunction_3_1(Prolog* m);

		static Operation interpret_disjunction_3_2(Prolog* m);

		static Operation interpret_disjunction_3_3(Prolog* m);

		static Operation interpret_disjunction_3_4(Prolog* m);
	/** PREDICATE: is_built_in/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
		// main(is_built_in/1,public)
		public:
			static SymbolTerm* const  FUNCTOR_$003D$003C_2;




		static Operation PRED_is_built_in_1_static_exec(Prolog* m);

	private:
		static Operation is_built_in_1_var(Prolog* m);

		static Operation is_built_in_1_var_1(Prolog* m);

		static Operation is_built_in_1_1(Prolog* m);

		static Operation is_built_in_1_2(Prolog* m);
	/** PREDICATE: interpret_built_in/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
		// main(interpret_built_in/1,public)




	public:
		static Operation PRED_interpret_built_in_1_static_exec(Prolog* m);

	private:
		static Operation interpret_built_in_1_var(Prolog* m);

		static Operation interpret_built_in_1_var_1(Prolog* m);

		static Operation interpret_built_in_1_1(Prolog* m);

		static Operation interpret_built_in_1_2(Prolog* m);
	/** PREDICATE: define/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
		// main(define/2,public)
		public:
			static SymbolTerm* const  FUNCTOR_qsort_3;
			static IntegerTerm* const  int_27;
			static IntegerTerm* const  int_74;
			static IntegerTerm* const  int_33;
			static IntegerTerm* const  int_94;
			static IntegerTerm* const  int_46;
			static IntegerTerm* const  int_83;
			static IntegerTerm* const  int_65;
			static IntegerTerm* const  int_32;
			static IntegerTerm* const  int_53;
			static IntegerTerm* const  int_28;
			static IntegerTerm* const  int_85;
			static IntegerTerm* const  int_99;
			static IntegerTerm* const  int_47;
			static IntegerTerm* const  int_82;
			static IntegerTerm* const  int_55;
			static IntegerTerm* const  int_29;
			static IntegerTerm* const  int_39;
			static IntegerTerm* const  int_81;
			static IntegerTerm* const  int_90;
			static IntegerTerm* const  int_37;
			static IntegerTerm* const  int_66;
			static IntegerTerm* const  int_51;
			static IntegerTerm* const  int_31;
			static IntegerTerm* const  int_63;
			static IntegerTerm* const  int_75;
			static IntegerTerm* const  int_95;
			static IntegerTerm* const  int_61;
			static IntegerTerm* const  int_92;
			static IntegerTerm* const  int_40;
			static IntegerTerm* const  int_59;
	private:
		static ListTerm* const  L_define_2_s45;
		static ListTerm* const  L_define_2_s46;
		static ListTerm* const  L_define_2_s47;
		static ListTerm* const  L_define_2_s48;
		static ListTerm* const  L_define_2_s49;
		static ListTerm* const  L_define_2_s50;
		static ListTerm* const  L_define_2_s51;
		static ListTerm* const  L_define_2_s52;
		static ListTerm* const  L_define_2_s53;
		static ListTerm* const  L_define_2_s54;
		static ListTerm* const  L_define_2_s55;
		static ListTerm* const  L_define_2_s56;
		static ListTerm* const  L_define_2_s57;
		static ListTerm* const  L_define_2_s58;
		static ListTerm* const  L_define_2_s59;
		static ListTerm* const  L_define_2_s60;
		static ListTerm* const  L_define_2_s61;
		static ListTerm* const  L_define_2_s62;
		static ListTerm* const  L_define_2_s63;
		static ListTerm* const  L_define_2_s64;
		static ListTerm* const  L_define_2_s65;
		static ListTerm* const  L_define_2_s66;
		static ListTerm* const  L_define_2_s67;
		static ListTerm* const  L_define_2_s68;
		static ListTerm* const  L_define_2_s69;
		static ListTerm* const  L_define_2_s70;
		static ListTerm* const  L_define_2_s71;
		static ListTerm* const  L_define_2_s72;
		static ListTerm* const  L_define_2_s73;
		static ListTerm* const  L_define_2_s74;
		static ListTerm* const  L_define_2_s75;
		static ListTerm* const  L_define_2_s76;
		static ListTerm* const  L_define_2_s77;
		static ListTerm* const  L_define_2_s78;
		static ListTerm* const  L_define_2_s79;
		static ListTerm* const  L_define_2_s80;
		static ListTerm* const  L_define_2_s81;
		static ListTerm* const  L_define_2_s82;
		static ListTerm* const  L_define_2_s83;
		static ListTerm* const  L_define_2_s84;
		static ListTerm* const  L_define_2_s85;
		static ListTerm* const  L_define_2_s86;
		static ListTerm* const  L_define_2_s87;
		static ListTerm* const  L_define_2_s88;
		static ListTerm* const  L_define_2_s89;
		static ListTerm* const  L_define_2_s90;
		static ListTerm* const  L_define_2_s91;
		static ListTerm* const  L_define_2_s92;
		static ListTerm* const  L_define_2_s93;
		static ListTerm* const  L_define_2_s94;
		public:
			static SymbolTerm* const  FUNCTOR_partition_4;




		static Operation PRED_define_2_static_exec(Prolog* m);

	private:
		static Operation define_2_var(Prolog* m);

		static Operation define_2_var_1(Prolog* m);

		static Operation define_2_var_2(Prolog* m);

		static Operation define_2_var_3(Prolog* m);

		static Operation define_2_var_4(Prolog* m);

		static Operation define_2_var_5(Prolog* m);

		static Operation define_2_str(Prolog* m);

		static Operation define_2_str_1(Prolog* m);

		static Operation define_2_str_2(Prolog* m);

		static Operation define_2_str_3(Prolog* m);

		static Operation define_2_str_4(Prolog* m);

		static Operation define_2_1(Prolog* m);

		static Operation define_2_2(Prolog* m);

		static Operation define_2_3(Prolog* m);

		static Operation define_2_4(Prolog* m);

		static Operation define_2_5(Prolog* m);

		static Operation define_2_6(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_meta_qsort::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_META_QSORT
