#ifndef FILE_SWI_SUPP
#define FILE_SWI_SUPP

#include "../../machine/SxxMachine/TermData.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class IntegerTerm; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class DoubleTerm; }

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$equality_of_term_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$new_indexing_hash_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$not_unifiable_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_assertz_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_call_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_compound_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_copy_term_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_integer_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_write_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_writeq_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.PRED_nl_0_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.fail_0;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$univ_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_peek_pending_1_static_exec;
	class FILE_swi_supp : public TermData
	{
	/** PREDICATE: (package)/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_package_1_static_exec(Prolog* m);
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
			static SymbolTerm* const  ATOM_swi_supp;




		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog* m);
	/** PREDICATE: typein_module/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
		static SymbolTerm* const  PRED_typein_module_1_s1;




	public:
		static Operation PRED_typein_module_1_static_exec(Prolog* m);

	private:
		static Operation typein_module_1_sub_1(Prolog* m);

		static Operation typein_module_1_1(Prolog* m);

		static Operation typein_module_1_2(Prolog* m);
	/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog* m);
	/** PREDICATE: source_module/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
		static SymbolTerm* const  PRED_source_module_1_s1;




	public:
		static Operation PRED_source_module_1_static_exec(Prolog* m);

	private:
		static Operation source_module_1_sub_1(Prolog* m);

		static Operation source_module_1_1(Prolog* m);

		static Operation source_module_1_2(Prolog* m);
	/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog* m);
	/** PREDICATE: context_module/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_context_module_1_static_exec(Prolog* m);
	/** PREDICATE: strip_module/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




		static Operation PRED_strip_module_3_static_exec(Prolog* m);

	private:
		static Operation strip_module_3_var(Prolog* m);

		static Operation strip_module_3_var_1(Prolog* m);

		static Operation strip_module_3_var_2(Prolog* m);

		static Operation strip_module_3_int(Prolog* m);

		static Operation strip_module_3_int_1(Prolog* m);

		static Operation strip_module_3_1(Prolog* m);

		static Operation strip_module_3_2(Prolog* m);

		static Operation strip_module_3_3(Prolog* m);
	/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
		public:
			static IntegerTerm* const  int_1;
			static SymbolTerm* const  ATOM_some;
			static IntegerTerm* const  int_0;
	private:
		static StructureTerm* const  PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_s8;




	public:
		static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_static_exec(Prolog* m);

	private:
		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_sub_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_2(Prolog* m);
	/** PREDICATE: (*->)/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
		static StructureTerm* const  PRED_$002A$002D$003E_2_s5;




	public:
		static Operation PRED_$002A$002D$003E_2_static_exec(Prolog* m);
	/** PREDICATE: maplist/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




		static Operation PRED_maplist_2_static_exec(Prolog* m);

	private:
		static Operation maplist_2_sub_1(Prolog* m);

		static Operation maplist_2_1(Prolog* m);

		static Operation maplist_2_2(Prolog* m);
	/** PREDICATE: maplist/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_maplist_3_static_exec(Prolog* m);

	private:
		static Operation maplist_3_sub_1(Prolog* m);

		static Operation maplist_3_1(Prolog* m);

		static Operation maplist_3_2(Prolog* m);
	/** PREDICATE: maplist/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_maplist_4_static_exec(Prolog* m);

	private:
		static Operation maplist_4_sub_1(Prolog* m);

		static Operation maplist_4_1(Prolog* m);

		static Operation maplist_4_2(Prolog* m);
	/** PREDICATE: call/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
		static SymbolTerm* const  PRED_call_2_s1;




	public:
		static Operation PRED_call_2_static_exec(Prolog* m);
	/** PREDICATE: call/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
	private:
		static SymbolTerm* const  PRED_call_3_s1;




	public:
		static Operation PRED_call_3_static_exec(Prolog* m);
	/** PREDICATE: call/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
	private:
		static SymbolTerm* const  PRED_call_4_s1;




	public:
		static Operation PRED_call_4_static_exec(Prolog* m);
	/** PREDICATE: is_cons/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




		static Operation PRED_is_cons_1_static_exec(Prolog* m);
	/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




		static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog* m);
	/** PREDICATE: is_list/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
		static SymbolTerm* const  PRED_is_list_1_s1;




	public:
		static Operation PRED_is_list_1_static_exec(Prolog* m);

	private:
		static Operation is_list_1_top(Prolog* m);

		static Operation is_list_1_var(Prolog* m);

		static Operation is_list_1_var_1(Prolog* m);

		static Operation is_list_1_1(Prolog* m);

		static Operation is_list_1_2(Prolog* m);
	/** PREDICATE: member/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_member_2_static_exec(Prolog* m);
	/** PREDICATE: member_/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




		static Operation PRED_member__3_static_exec(Prolog* m);

	private:
		static Operation member__3_top(Prolog* m);

		static Operation member__3_var(Prolog* m);

		static Operation member__3_var_1(Prolog* m);

		static Operation member__3_1(Prolog* m);

		static Operation member__3_2(Prolog* m);
	/** PREDICATE: append/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
		static SymbolTerm* const  PRED_append_3_s1;




	public:
		static Operation PRED_append_3_static_exec(Prolog* m);

	private:
		static Operation append_3_top(Prolog* m);

		static Operation append_3_var(Prolog* m);

		static Operation append_3_var_1(Prolog* m);

		static Operation append_3_1(Prolog* m);

		static Operation append_3_2(Prolog* m);
	/** PREDICATE: flatten/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
		static SymbolTerm* const  PRED_flatten_2_s1;




	public:
		static Operation PRED_flatten_2_static_exec(Prolog* m);
	/** PREDICATE: flatten/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
	private:
		static SymbolTerm* const  PRED_flatten_3_s1;




	public:
		static Operation PRED_flatten_3_static_exec(Prolog* m);

	private:
		static Operation flatten_3_top(Prolog* m);

		static Operation flatten_3_var(Prolog* m);

		static Operation flatten_3_var_1(Prolog* m);

		static Operation flatten_3_var_2(Prolog* m);

		static Operation flatten_3_var_3(Prolog* m);

		static Operation flatten_3_int(Prolog* m);

		static Operation flatten_3_int_1(Prolog* m);

		static Operation flatten_3_con(Prolog* m);

		static Operation flatten_3_con_1(Prolog* m);

		static Operation flatten_3_con_2(Prolog* m);

		static Operation flatten_3_lis(Prolog* m);

		static Operation flatten_3_lis_1(Prolog* m);

		static Operation flatten_3_lis_2(Prolog* m);

		static Operation flatten_3_1(Prolog* m);

		static Operation flatten_3_2(Prolog* m);

		static Operation flatten_3_3(Prolog* m);

		static Operation flatten_3_4(Prolog* m);
	/** PREDICATE: printAll/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_printAll_1_static_exec(Prolog* m);

	private:
		static Operation printAll_1_sub_1(Prolog* m);

		static Operation printAll_1_1(Prolog* m);

		static Operation printAll_1_2(Prolog* m);
	/** PREDICATE: random/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
		static SymbolTerm* const  PRED_random_1_s1;




	public:
		static Operation PRED_random_1_static_exec(Prolog* m);
	/** PREDICATE: go/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
	private:
		static IntegerTerm* const  PRED_go_1_s1;
		public:
			static IntegerTerm* const  int_2;
	private:
		static DoubleTerm* const  sf3;
		public:
			static IntegerTerm* const  int_3;
			static IntegerTerm* const  int_4;
			static IntegerTerm* const  int_11;
			static IntegerTerm* const  int_12;
			static IntegerTerm* const  int_13;
			static IntegerTerm* const  int_14;
			static IntegerTerm* const  int_15;
			static IntegerTerm* const  int_16;
			static IntegerTerm* const  int_17;
			static IntegerTerm* const  int_18;
			static IntegerTerm* const  int_19;
			static IntegerTerm* const  int_20;
			static IntegerTerm* const  int_21;




		static Operation PRED_go_1_static_exec(Prolog* m);

	private:
		static Operation go_1_var(Prolog* m);

		static Operation go_1_var_1(Prolog* m);

		static Operation go_1_var_2(Prolog* m);

		static Operation go_1_var_3(Prolog* m);

		static Operation go_1_var_4(Prolog* m);

		static Operation go_1_var_5(Prolog* m);

		static Operation go_1_var_6(Prolog* m);

		static Operation go_1_var_7(Prolog* m);

		static Operation go_1_var_8(Prolog* m);

		static Operation go_1_var_9(Prolog* m);

		static Operation go_1_var_10(Prolog* m);

		static Operation go_1_var_11(Prolog* m);

		static Operation go_1_var_12(Prolog* m);

		static Operation go_1_var_13(Prolog* m);

		static Operation go_1_var_14(Prolog* m);

		static Operation go_1_1(Prolog* m);

		static Operation go_1_2(Prolog* m);

		static Operation go_1_3(Prolog* m);

		static Operation go_1_4(Prolog* m);

		static Operation go_1_5(Prolog* m);

		static Operation go_1_6(Prolog* m);

		static Operation go_1_7(Prolog* m);

		static Operation go_1_8(Prolog* m);

		static Operation go_1_9(Prolog* m);

		static Operation go_1_10(Prolog* m);

		static Operation go_1_11(Prolog* m);

		static Operation go_1_12(Prolog* m);

		static Operation go_1_13(Prolog* m);

		static Operation go_1_14(Prolog* m);

		static Operation go_1_15(Prolog* m);
	/** PREDICATE: $dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog* m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog* m);

		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/




	public:
		static Operation PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog* m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog* m);
	/** PREDICATE: $init/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
	*/
		static StructureTerm* const  PRED_$init_0_s6;
		static StructureTerm* const  PRED_$init_0_s9;
		static StructureTerm* const  PRED_$init_0_s11;
		public:
			static SymbolTerm* const  ATOM_$0024current_source_module;
	private:
		static StructureTerm* const  PRED_$init_0_s16;
		public:
			static SymbolTerm* const  ATOM_user;
	private:
		static StructureTerm* const  PRED_$init_0_s20;
		static StructureTerm* const  PRED_$init_0_s22;
		static StructureTerm* const  PRED_$init_0_s24;




	public:
		static Operation PRED_$init_0_static_exec(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_swi_supp::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_SWI_SUPP
