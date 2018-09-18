#pragma once

#include "../../machine/SxxMachine/TermData.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Prolog;
	class SymbolTerm;
	class IntegerTerm;
}

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$equality_of_term_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$less_or_equal_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_length_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.fail_0;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_sort_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_$skip_list_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_memberchk_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_must_be_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_pairs_keys_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_sort_4_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_succ_2_static_exec;

	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using TermData = SxxMachine::TermData;

	class FILE_lists : public TermData
	{
		/** PREDICATE: member/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_member_2_static_exec(Prolog *m);

		/** PREDICATE: member_/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

		static Operation PRED_member__3_static_exec(Prolog *m);

	private:
		static Operation member__3_top(Prolog *m);

		static Operation member__3_var(Prolog *m);

		static Operation member__3_var_1(Prolog *m);

		static Operation member__3_1(Prolog *m);

		static Operation member__3_2(Prolog *m);

		/** PREDICATE: append/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_append_3_s1;

	public:
		static Operation PRED_append_3_static_exec(Prolog *m);

	private:
		static Operation append_3_top(Prolog *m);

		static Operation append_3_var(Prolog *m);

		static Operation append_3_var_1(Prolog *m);

		static Operation append_3_1(Prolog *m);

		static Operation append_3_2(Prolog *m);

		/** PREDICATE: append/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_append_2_s1;

	public:
		static Operation PRED_append_2_static_exec(Prolog *m);

		/** PREDICATE: append_/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_append__2_s1;

	public:
		static Operation PRED_append__2_static_exec(Prolog *m);

	private:
		static Operation append__2_var(Prolog *m);

		static Operation append__2_var_1(Prolog *m);

		static Operation append__2_1(Prolog *m);

		static Operation append__2_2(Prolog *m);

		/** PREDICATE: prefix/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_prefix_2_s1;

	public:
		static Operation PRED_prefix_2_static_exec(Prolog *m);

	private:
		static Operation prefix_2_top(Prolog *m);

		static Operation prefix_2_var(Prolog *m);

		static Operation prefix_2_var_1(Prolog *m);

		static Operation prefix_2_1(Prolog *m);

		static Operation prefix_2_2(Prolog *m);

		/** PREDICATE: select/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_select_3_static_exec(Prolog *m);

	private:
		static Operation select_3_top(Prolog *m);

		static Operation select_3_sub_1(Prolog *m);

		static Operation select_3_1(Prolog *m);

		static Operation select_3_2(Prolog *m);

		/** PREDICATE: selectchk/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_selectchk_3_static_exec(Prolog *m);

		/** PREDICATE: select/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

		static Operation PRED_select_4_static_exec(Prolog *m);

		/** PREDICATE: select_/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

		static Operation PRED_select__4_static_exec(Prolog *m);

	private:
		static Operation select__4_top(Prolog *m);

		static Operation select__4_var(Prolog *m);

		static Operation select__4_var_1(Prolog *m);

		static Operation select__4_1(Prolog *m);

		static Operation select__4_2(Prolog *m);

		/** PREDICATE: selectchk/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_selectchk_4_static_exec(Prolog *m);

		/** PREDICATE: nextto/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

		static Operation PRED_nextto_3_static_exec(Prolog *m);

	private:
		static Operation nextto_3_top(Prolog *m);

		static Operation nextto_3_sub_1(Prolog *m);

		static Operation nextto_3_1(Prolog *m);

		static Operation nextto_3_2(Prolog *m);

		/** PREDICATE: delete/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_delete_3_s1;

	public:
		static Operation PRED_delete_3_static_exec(Prolog *m);

	private:
		static Operation delete_3_top(Prolog *m);

		static Operation delete_3_var(Prolog *m);

		static Operation delete_3_var_1(Prolog *m);

		static Operation delete_3_var_2(Prolog *m);

		static Operation delete_3_lis(Prolog *m);

		static Operation delete_3_lis_1(Prolog *m);

		static Operation delete_3_1(Prolog *m);

		static Operation delete_3_2(Prolog *m);

		static Operation delete_3_3(Prolog *m);

		/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_static_exec(Prolog *m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_sub_1(Prolog *m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_1(Prolog *m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_2(Prolog *m);

		/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog *m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog *m);

		/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_static_exec(Prolog *m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_sub_1(Prolog *m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_1(Prolog *m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_2(Prolog *m);

		/** PREDICATE: nth0/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_nth0_3_s1;

	public:
		static Operation PRED_nth0_3_static_exec(Prolog *m);

	private:
		static Operation nth0_3_sub_1(Prolog *m);

		static Operation nth0_3_sub_2(Prolog *m);

		static Operation nth0_3_1(Prolog *m);

		static Operation nth0_3_2(Prolog *m);

		static Operation nth0_3_3(Prolog *m);

		/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static IntegerTerm *const PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_s1;

		// private final Term arg5;

	public:
		static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec(Prolog *m);

	private:
		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_sub_1(Prolog *m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_1(Prolog *m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_2(Prolog *m);

		/** PREDICATE: nth0_det/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static IntegerTerm *const PRED_nth0_det_3_s1;
	public:
		static IntegerTerm *const int_1;
		static IntegerTerm *const int_2;
		static IntegerTerm *const int_3;
		static IntegerTerm *const int_4;
		static IntegerTerm *const int_5;
		static IntegerTerm *const int_6;

		static Operation PRED_nth0_det_3_static_exec(Prolog *m);

	private:
		static Operation nth0_det_3_top(Prolog *m);

		static Operation nth0_det_3_var(Prolog *m);

		static Operation nth0_det_3_var_1(Prolog *m);

		static Operation nth0_det_3_var_2(Prolog *m);

		static Operation nth0_det_3_var_3(Prolog *m);

		static Operation nth0_det_3_var_4(Prolog *m);

		static Operation nth0_det_3_var_5(Prolog *m);

		static Operation nth0_det_3_var_6(Prolog *m);

		static Operation nth0_det_3_1(Prolog *m);

		static Operation nth0_det_3_2(Prolog *m);

		static Operation nth0_det_3_3(Prolog *m);

		static Operation nth0_det_3_4(Prolog *m);

		static Operation nth0_det_3_5(Prolog *m);

		static Operation nth0_det_3_6(Prolog *m);

		static Operation nth0_det_3_7(Prolog *m);

		/** PREDICATE: nth_gen/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_nth_gen_5_static_exec(Prolog *m);

	private:
		static Operation nth_gen_5_var(Prolog *m);

		static Operation nth_gen_5_var_1(Prolog *m);

		static Operation nth_gen_5_1(Prolog *m);

		static Operation nth_gen_5_2(Prolog *m);

		/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog *m);

	private:
		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog *m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog *m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog *m);

		/** PREDICATE: nth1/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_nth1_3_s1;

	public:
		static Operation PRED_nth1_3_static_exec(Prolog *m);

	private:
		static Operation nth1_3_sub_1(Prolog *m);

		static Operation nth1_3_sub_2(Prolog *m);

		static Operation nth1_3_1(Prolog *m);

		static Operation nth1_3_2(Prolog *m);

		static Operation nth1_3_3(Prolog *m);

		/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static IntegerTerm *const PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_s1;

		// private final Term arg5;

	public:
		static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec(Prolog *m);

	private:
		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_sub_1(Prolog *m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_1(Prolog *m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_2(Prolog *m);

		/** PREDICATE: nth0/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static IntegerTerm *const PRED_nth0_4_s1;
	public:
		static SymbolTerm *const ATOM_nonneg;

		static Operation PRED_nth0_4_static_exec(Prolog *m);

	private:
		static Operation nth0_4_sub_1(Prolog *m);

		static Operation nth0_4_1(Prolog *m);

		static Operation nth0_4_2(Prolog *m);

		/** PREDICATE: nth1/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static IntegerTerm *const PRED_nth1_4_s1;
	public:
		static SymbolTerm *const ATOM_positive_integer;

		static Operation PRED_nth1_4_static_exec(Prolog *m);

	private:
		static Operation nth1_4_sub_1(Prolog *m);

		static Operation nth1_4_1(Prolog *m);

		static Operation nth1_4_2(Prolog *m);

		/** PREDICATE: generate_nth/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_generate_nth_5_static_exec(Prolog *m);

	private:
		static Operation generate_nth_5_top(Prolog *m);

		static Operation generate_nth_5_sub_1(Prolog *m);

		static Operation generate_nth_5_1(Prolog *m);

		static Operation generate_nth_5_2(Prolog *m);

		/** PREDICATE: find_nth0/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static IntegerTerm *const PRED_find_nth0_4_s1;

	public:
		static Operation PRED_find_nth0_4_static_exec(Prolog *m);

	private:
		static Operation find_nth0_4_top(Prolog *m);

		static Operation find_nth0_4_var(Prolog *m);

		static Operation find_nth0_4_var_1(Prolog *m);

		static Operation find_nth0_4_1(Prolog *m);

		static Operation find_nth0_4_2(Prolog *m);

		/** PREDICATE: last/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_last_2_static_exec(Prolog *m);

		/** PREDICATE: last_/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_last__3_s1;

	public:
		static Operation PRED_last__3_static_exec(Prolog *m);

	private:
		static Operation last__3_top(Prolog *m);

		static Operation last__3_var(Prolog *m);

		static Operation last__3_var_1(Prolog *m);

		static Operation last__3_1(Prolog *m);

		static Operation last__3_2(Prolog *m);

		/** PREDICATE: proper_length/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_proper_length_2_s1;

	public:
		static Operation PRED_proper_length_2_static_exec(Prolog *m);

		/** PREDICATE: same_length/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_same_length_2_s1;

	public:
		static Operation PRED_same_length_2_static_exec(Prolog *m);

	private:
		static Operation same_length_2_top(Prolog *m);

		static Operation same_length_2_var(Prolog *m);

		static Operation same_length_2_var_1(Prolog *m);

		static Operation same_length_2_1(Prolog *m);

		static Operation same_length_2_2(Prolog *m);

		/** PREDICATE: reverse/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_reverse_2_s1;

	public:
		static Operation PRED_reverse_2_static_exec(Prolog *m);

		/** PREDICATE: reverse/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_reverse_4_s1;

	public:
		static Operation PRED_reverse_4_static_exec(Prolog *m);

	private:
		static Operation reverse_4_top(Prolog *m);

		static Operation reverse_4_var(Prolog *m);

		static Operation reverse_4_var_1(Prolog *m);

		static Operation reverse_4_1(Prolog *m);

		static Operation reverse_4_2(Prolog *m);

		/** PREDICATE: $dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/7
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_s1;
	public:
		static SymbolTerm *const ATOM_list;

		// private final Term arg5, arg6, arg7;

		static Operation PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_static_exec(Prolog *m);

	private:
		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_1(Prolog *m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_2(Prolog *m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_3(Prolog *m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_4(Prolog *m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_1(Prolog *m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_2(Prolog *m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_3(Prolog *m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_4(Prolog *m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_5(Prolog *m);

		/** PREDICATE: $dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_s1;

	public:
		static Operation PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog *m);

	private:
		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog *m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog *m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog *m);

		/** PREDICATE: $dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_s1;

	public:
		static Operation PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog *m);

	private:
		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog *m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog *m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog *m);

		/** PREDICATE: $dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

		// private final Term arg5;

	public:
		static Operation PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec(Prolog *m);

	private:
		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_sub_1(Prolog *m);

		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_1(Prolog *m);

		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_2(Prolog *m);

		/** PREDICATE: permutation/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_permutation_2_static_exec(Prolog *m);

		/** PREDICATE: perm/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_perm_2_s1;

	public:
		static Operation PRED_perm_2_static_exec(Prolog *m);

	private:
		static Operation perm_2_var(Prolog *m);

		static Operation perm_2_var_1(Prolog *m);

		static Operation perm_2_1(Prolog *m);

		static Operation perm_2_2(Prolog *m);

		/** PREDICATE: flatten/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_flatten_2_s1;

	public:
		static Operation PRED_flatten_2_static_exec(Prolog *m);

		/** PREDICATE: flatten/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_flatten_3_s1;

	public:
		static Operation PRED_flatten_3_static_exec(Prolog *m);

	private:
		static Operation flatten_3_top(Prolog *m);

		static Operation flatten_3_var(Prolog *m);

		static Operation flatten_3_var_1(Prolog *m);

		static Operation flatten_3_var_2(Prolog *m);

		static Operation flatten_3_var_3(Prolog *m);

		static Operation flatten_3_int(Prolog *m);

		static Operation flatten_3_int_1(Prolog *m);

		static Operation flatten_3_con(Prolog *m);

		static Operation flatten_3_con_1(Prolog *m);

		static Operation flatten_3_con_2(Prolog *m);

		static Operation flatten_3_lis(Prolog *m);

		static Operation flatten_3_lis_1(Prolog *m);

		static Operation flatten_3_lis_2(Prolog *m);

		static Operation flatten_3_1(Prolog *m);

		static Operation flatten_3_2(Prolog *m);

		static Operation flatten_3_3(Prolog *m);

		static Operation flatten_3_4(Prolog *m);

		/** PREDICATE: max_member/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_max_member_2_static_exec(Prolog *m);

		/** PREDICATE: max_member_/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_max_member__3_s1;

	public:
		static Operation PRED_max_member__3_static_exec(Prolog *m);

	private:
		static Operation max_member__3_top(Prolog *m);

		static Operation max_member__3_var(Prolog *m);

		static Operation max_member__3_var_1(Prolog *m);

		static Operation max_member__3_var_2(Prolog *m);

		static Operation max_member__3_lis(Prolog *m);

		static Operation max_member__3_lis_1(Prolog *m);

		static Operation max_member__3_1(Prolog *m);

		static Operation max_member__3_2(Prolog *m);

		static Operation max_member__3_3(Prolog *m);

		/** PREDICATE: $dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog *m);

	private:
		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog *m);

		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog *m);

		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog *m);

		/** PREDICATE: min_member/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_min_member_2_static_exec(Prolog *m);

		/** PREDICATE: min_member_/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_min_member__3_s1;

	public:
		static Operation PRED_min_member__3_static_exec(Prolog *m);

	private:
		static Operation min_member__3_top(Prolog *m);

		static Operation min_member__3_var(Prolog *m);

		static Operation min_member__3_var_1(Prolog *m);

		static Operation min_member__3_var_2(Prolog *m);

		static Operation min_member__3_lis(Prolog *m);

		static Operation min_member__3_lis_1(Prolog *m);

		static Operation min_member__3_1(Prolog *m);

		static Operation min_member__3_2(Prolog *m);

		static Operation min_member__3_3(Prolog *m);

		/** PREDICATE: $dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog *m);

	private:
		static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog *m);

		static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog *m);

		static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog *m);

		/** PREDICATE: sum_list/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static IntegerTerm *const PRED_sum_list_2_s1;

	public:
		static Operation PRED_sum_list_2_static_exec(Prolog *m);

		/** PREDICATE: sum_list/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_sum_list_3_s1;

	public:
		static Operation PRED_sum_list_3_static_exec(Prolog *m);

	private:
		static Operation sum_list_3_top(Prolog *m);

		static Operation sum_list_3_var(Prolog *m);

		static Operation sum_list_3_var_1(Prolog *m);

		static Operation sum_list_3_1(Prolog *m);

		static Operation sum_list_3_2(Prolog *m);

		/** PREDICATE: max_list/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_max_list_2_static_exec(Prolog *m);

		/** PREDICATE: max_list/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_max_list_3_s1;

	public:
		static Operation PRED_max_list_3_static_exec(Prolog *m);

	private:
		static Operation max_list_3_top(Prolog *m);

		static Operation max_list_3_var(Prolog *m);

		static Operation max_list_3_var_1(Prolog *m);

		static Operation max_list_3_1(Prolog *m);

		static Operation max_list_3_2(Prolog *m);

		/** PREDICATE: min_list/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_min_list_2_static_exec(Prolog *m);

		/** PREDICATE: min_list/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_min_list_3_s1;

	public:
		static Operation PRED_min_list_3_static_exec(Prolog *m);

	private:
		static Operation min_list_3_top(Prolog *m);

		static Operation min_list_3_var(Prolog *m);

		static Operation min_list_3_var_1(Prolog *m);

		static Operation min_list_3_1(Prolog *m);

		static Operation min_list_3_2(Prolog *m);

		/** PREDICATE: numlist/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_numlist_3_s1;

	public:
		static Operation PRED_numlist_3_static_exec(Prolog *m);

		/** PREDICATE: numlist_/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_numlist__3_s1;

	public:
		static Operation PRED_numlist__3_static_exec(Prolog *m);

	private:
		static Operation numlist__3_top(Prolog *m);

		static Operation numlist__3_sub_1(Prolog *m);

		static Operation numlist__3_1(Prolog *m);

		static Operation numlist__3_2(Prolog *m);

		/** PREDICATE: is_set/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_is_set_1_s1;

	public:
		static Operation PRED_is_set_1_static_exec(Prolog *m);

		/** PREDICATE: list_to_set/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_list_to_set_2_s1;
	public:
		static SymbolTerm *const ATOM_termsmallerequal;

		static Operation PRED_list_to_set_2_static_exec(Prolog *m);

		/** PREDICATE: number_list/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
	private:
		static SymbolTerm *const PRED_number_list_3_s1;

	public:
		static Operation PRED_number_list_3_static_exec(Prolog *m);

	private:
		static Operation number_list_3_top(Prolog *m);

		static Operation number_list_3_var(Prolog *m);

		static Operation number_list_3_var_1(Prolog *m);

		static Operation number_list_3_1(Prolog *m);

		static Operation number_list_3_2(Prolog *m);

		/** PREDICATE: remove_dup_keys/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_remove_dup_keys_2_s1;

	public:
		static Operation PRED_remove_dup_keys_2_static_exec(Prolog *m);

	private:
		static Operation remove_dup_keys_2_var(Prolog *m);

		static Operation remove_dup_keys_2_var_1(Prolog *m);

		static Operation remove_dup_keys_2_1(Prolog *m);

		static Operation remove_dup_keys_2_2(Prolog *m);

		/** PREDICATE: remove_same_key/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/

	public:
		static Operation PRED_remove_same_key_3_static_exec(Prolog *m);

	private:
		static Operation remove_same_key_3_top(Prolog *m);

		static Operation remove_same_key_3_var(Prolog *m);

		static Operation remove_same_key_3_var_1(Prolog *m);

		static Operation remove_same_key_3_1(Prolog *m);

		static Operation remove_same_key_3_2(Prolog *m);

		/** PREDICATE: intersection/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_intersection_3_s1;

	public:
		static Operation PRED_intersection_3_static_exec(Prolog *m);

	private:
		static Operation intersection_3_top(Prolog *m);

		static Operation intersection_3_var(Prolog *m);

		static Operation intersection_3_var_1(Prolog *m);

		static Operation intersection_3_var_2(Prolog *m);

		static Operation intersection_3_lis(Prolog *m);

		static Operation intersection_3_lis_1(Prolog *m);

		static Operation intersection_3_1(Prolog *m);

		static Operation intersection_3_2(Prolog *m);

		static Operation intersection_3_3(Prolog *m);

		/** PREDICATE: union/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_union_3_s1;

	public:
		static Operation PRED_union_3_static_exec(Prolog *m);

	private:
		static Operation union_3_top(Prolog *m);

		static Operation union_3_var(Prolog *m);

		static Operation union_3_var_1(Prolog *m);

		static Operation union_3_var_2(Prolog *m);

		static Operation union_3_lis(Prolog *m);

		static Operation union_3_lis_1(Prolog *m);

		static Operation union_3_1(Prolog *m);

		static Operation union_3_2(Prolog *m);

		static Operation union_3_3(Prolog *m);

		/** PREDICATE: subset/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_subset_2_s1;

	public:
		static Operation PRED_subset_2_static_exec(Prolog *m);

	private:
		static Operation subset_2_var(Prolog *m);

		static Operation subset_2_var_1(Prolog *m);

		static Operation subset_2_1(Prolog *m);

		static Operation subset_2_2(Prolog *m);

		/** PREDICATE: subtract/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl
		*/
		static SymbolTerm *const PRED_subtract_3_s1;

	public:
		static Operation PRED_subtract_3_static_exec(Prolog *m);

	private:
		static Operation subtract_3_top(Prolog *m);

		static Operation subtract_3_var(Prolog *m);

		static Operation subtract_3_var_1(Prolog *m);

		static Operation subtract_3_var_2(Prolog *m);

		static Operation subtract_3_lis(Prolog *m);

		static Operation subtract_3_lis_1(Prolog *m);

		static Operation subtract_3_1(Prolog *m);

		static Operation subtract_3_2(Prolog *m);

		static Operation subtract_3_3(Prolog *m);

		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static FILE_lists::StaticConstructor staticConstructor;


	public:
		static void loadPreds();
	};

}
