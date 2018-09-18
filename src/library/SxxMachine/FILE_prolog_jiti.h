#pragma once

#include "../../machine/SxxMachine/TermData.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Prolog;
	class SymbolTerm;
	class ListTerm;
	class IntegerTerm;
}

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$002C_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_findall_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_swi_supp.PRED_maplist_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.fail_0;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_functor_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_format_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_format_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_number_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_phrase_2_static_exec;

	using IntegerTerm = SxxMachine::IntegerTerm;
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using TermData = SxxMachine::TermData;

	class FILE_prolog_jiti : public TermData
	{
		/** PREDICATE: jiti_list/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
		*/

	public:
		static Operation PRED_jiti_list_0_static_exec(Prolog *m);

		/** PREDICATE: jiti_list/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
		*/
		static SymbolTerm *const ATOM_Predicate$007E46$007C$007Ew$0020$007Et$007E8$002B$0020$007Et$007Ew$007E6$002B$0020$007Et$007Ew$007E6$002B$0020$007Et$007Ew$007E5$002B$007En;
		static SymbolTerm *const ATOM_Indexed;
		static SymbolTerm *const ATOM_Buckets;
		static SymbolTerm *const ATOM_Speedup;
		static SymbolTerm *const ATOM_Flags;
	private:
		static ListTerm *const PRED_jiti_list_1_s14;
		static ListTerm *const PRED_jiti_list_1_s15;
		static ListTerm *const PRED_jiti_list_1_s16;
		static ListTerm *const PRED_jiti_list_1_s17;
	public:
		static SymbolTerm *const ATOM_$007E$0060$003Dt$007E76$007C$007En;
		static SymbolTerm *const ATOM_print_indexed;

		static Operation PRED_jiti_list_1_static_exec(Prolog *m);

	private:
		static Operation jiti_list_1_var(Prolog *m);

		static Operation jiti_list_1_var_1(Prolog *m);

		static Operation jiti_list_1_var_2(Prolog *m);

		static Operation jiti_list_1_var_3(Prolog *m);

		static Operation jiti_list_1_1(Prolog *m);

		static Operation jiti_list_1_2(Prolog *m);

		static Operation jiti_list_1_3(Prolog *m);

		static Operation jiti_list_1_4(Prolog *m);

		/** PREDICATE: print_indexed/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
		*/
	public:
		static SymbolTerm *const ATOM_$007Eq$0020$007Et$007E48$007C$007Es$0020$007Et$007E8$002B$0020$007Et$007ED$007E6$002B$0020$007Et$007E1f$007E8$002B$0020$007Et$007Es$007E3$002B$007En;
		static SymbolTerm *const ATOM_print_secondary_index;
		static SymbolTerm *const ATOM_Failed$003A$0020$007Ep$007En;

		static Operation PRED_print_indexed_1_static_exec(Prolog *m);

	private:
		static Operation print_indexed_1_var(Prolog *m);

		static Operation print_indexed_1_var_1(Prolog *m);

		static Operation print_indexed_1_1(Prolog *m);

		static Operation print_indexed_1_2(Prolog *m);

		/** PREDICATE: print_secondary_index/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
		*/
	public:
		static SymbolTerm *const ATOM_$007Et$007E48$007C$007Es$0020$007Et$007E8$002B$0020$007Et$007ED$007E6$002B$0020$007Et$007E1f$007E8$002B$0020$007Et$007Es$007E3$002B$007En;
		static SymbolTerm *const ATOM_Secondary$0020failed$003A$0020$007Ep$007En;

		static Operation PRED_print_secondary_index_1_static_exec(Prolog *m);

	private:
		static Operation print_secondary_index_1_var(Prolog *m);

		static Operation print_secondary_index_1_var_1(Prolog *m);

		static Operation print_secondary_index_1_1(Prolog *m);

		static Operation print_secondary_index_1_2(Prolog *m);

		/** PREDICATE: iarg_spec/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
		*/

	public:
		static Operation PRED_iarg_spec_3_static_exec(Prolog *m);

	private:
		static Operation iarg_spec_3_var(Prolog *m);

		static Operation iarg_spec_3_var_1(Prolog *m);

		static Operation iarg_spec_3_var_2(Prolog *m);

		static Operation iarg_spec_3_1(Prolog *m);

		static Operation iarg_spec_3_2(Prolog *m);

		static Operation iarg_spec_3_3(Prolog *m);

		/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
		*/
		static SymbolTerm *const PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_s1;
	public:
		static IntegerTerm *const int_43;

		// private final Term arg5;

		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_static_exec(Prolog *m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_sub_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_2(Prolog *m);

		/** PREDICATE: plus_list/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
		*/

	public:
		static Operation PRED_plus_list_3_static_exec(Prolog *m);

		/** PREDICATE: deep_list/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
		*/
	private:
		static SymbolTerm *const PRED_deep_list_3_s1;
	public:
		static IntegerTerm *const int_47;

		static Operation PRED_deep_list_3_static_exec(Prolog *m);

	private:
		static Operation deep_list_3_var(Prolog *m);

		static Operation deep_list_3_var_1(Prolog *m);

		static Operation deep_list_3_1(Prolog *m);

		static Operation deep_list_3_2(Prolog *m);

		/** PREDICATE: iflags/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
		*/
		static SymbolTerm *const PRED_iflags_3_s1;
	public:
		static IntegerTerm *const int_76;
		static SymbolTerm *const ATOM_false;

		static Operation PRED_iflags_3_static_exec(Prolog *m);

	private:
		static Operation iflags_3_var(Prolog *m);

		static Operation iflags_3_var_1(Prolog *m);

		static Operation iflags_3_1(Prolog *m);

		static Operation iflags_3_2(Prolog *m);

		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static FILE_prolog_jiti::StaticConstructor staticConstructor;


	public:
		static void loadPreds();
	};

}
