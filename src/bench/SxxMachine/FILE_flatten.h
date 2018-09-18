#pragma once

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Operation;
	class Prolog;
	class StructureTerm;
	class IntegerTerm;
	class ListTerm;
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
	class FILE_flatten : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(top/0,public)
		public:
			static SymbolTerm *const FUNCTOR_$003A$002D_2;
			static SymbolTerm *const FUNCTOR_a_3;
			static SymbolTerm *const FUNCTOR_or_2;
			static SymbolTerm *const FUNCTOR_b_1;
			static SymbolTerm *const FUNCTOR_c_1;
			static SymbolTerm *const FUNCTOR_$002C_2;




		static Operation PRED_top_0_static_exec(Prolog *m);

	private:
		static Operation top_0_sub_1(Prolog *m);

		static Operation top_0_1(Prolog *m);

		static Operation top_0_2(Prolog *m);
	/** PREDICATE: eliminate_disjunctions/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(eliminate_disjunctions/4,public)




	public:
		static Operation PRED_eliminate_disjunctions_4_static_exec(Prolog *m);
	/** PREDICATE: gather_disj/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(gather_disj/4,public)




		static Operation PRED_gather_disj_4_static_exec(Prolog *m);

	private:
		static Operation gather_disj_4_var(Prolog *m);

		static Operation gather_disj_4_var_1(Prolog *m);

		static Operation gather_disj_4_1(Prolog *m);

		static Operation gather_disj_4_2(Prolog *m);
	/** PREDICATE: extract_disj/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(extract_disj/4,public)




	public:
		static Operation PRED_extract_disj_4_static_exec(Prolog *m);

	private:
		static Operation extract_disj_4_sub_1(Prolog *m);

		static Operation extract_disj_4_1(Prolog *m);

		static Operation extract_disj_4_2(Prolog *m);
	/** PREDICATE: extract_disj/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(extract_disj/7,public)
		public:
			static SymbolTerm *const FUNCTOR_disj_4;
			static SymbolTerm *const FUNCTOR_$002B_2;

		// private final Term arg5, arg6, arg7;




		static Operation PRED_extract_disj_7_static_exec(Prolog *m);

	private:
		static Operation extract_disj_7_top(Prolog *m);

		static Operation extract_disj_7_var(Prolog *m);

		static Operation extract_disj_7_var_1(Prolog *m);

		static Operation extract_disj_7_var_2(Prolog *m);

		static Operation extract_disj_7_int(Prolog *m);

		static Operation extract_disj_7_int_1(Prolog *m);

		static Operation extract_disj_7_1(Prolog *m);

		static Operation extract_disj_7_2(Prolog *m);

		static Operation extract_disj_7_3(Prolog *m);
	/** PREDICATE: is_disj/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(is_disj/2,public)
		public:
			static SymbolTerm *const FUNCTOR_$002D$003E_2;
			static SymbolTerm *const ATOM_$0021;
			static SymbolTerm *const FUNCTOR_not_1;
			static SymbolTerm *const ATOM_fail;
	private:
		static StructureTerm *const L_is_disj_2_s9;
		public:
			static SymbolTerm *const FUNCTOR_$005C$002B_1;
			static SymbolTerm *const FUNCTOR_$005C$003D_2;
			static SymbolTerm *const FUNCTOR_$003D_2;




		static Operation PRED_is_disj_2_static_exec(Prolog *m);

	private:
		static Operation is_disj_2_var(Prolog *m);

		static Operation is_disj_2_var_1(Prolog *m);

		static Operation is_disj_2_var_2(Prolog *m);

		static Operation is_disj_2_var_3(Prolog *m);

		static Operation is_disj_2_var_4(Prolog *m);

		static Operation is_disj_2_1(Prolog *m);

		static Operation is_disj_2_2(Prolog *m);

		static Operation is_disj_2_3(Prolog *m);

		static Operation is_disj_2_4(Prolog *m);

		static Operation is_disj_2_5(Prolog *m);
	/** PREDICATE: treat_disj/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(treat_disj/3,public)




	public:
		static Operation PRED_treat_disj_3_static_exec(Prolog *m);

	private:
		static Operation treat_disj_3_var(Prolog *m);

		static Operation treat_disj_3_var_1(Prolog *m);

		static Operation treat_disj_3_1(Prolog *m);

		static Operation treat_disj_3_2(Prolog *m);
	/** PREDICATE: make_dummy_clauses/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(make_dummy_clauses/4,public)




	public:
		static Operation PRED_make_dummy_clauses_4_static_exec(Prolog *m);

	private:
		static Operation make_dummy_clauses_4_var(Prolog *m);

		static Operation make_dummy_clauses_4_var_1(Prolog *m);

		static Operation make_dummy_clauses_4_1(Prolog *m);

		static Operation make_dummy_clauses_4_2(Prolog *m);
	/** PREDICATE: find_vars/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(find_vars/2,public)




	public:
		static Operation PRED_find_vars_2_static_exec(Prolog *m);
	/** PREDICATE: find_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(find_vars/3,public)




		static Operation PRED_find_vars_3_static_exec(Prolog *m);

	private:
		static Operation find_vars_3_top(Prolog *m);

		static Operation find_vars_3_var(Prolog *m);

		static Operation find_vars_3_var_1(Prolog *m);

		static Operation find_vars_3_var_2(Prolog *m);

		static Operation find_vars_3_var_3(Prolog *m);

		static Operation find_vars_3_int(Prolog *m);

		static Operation find_vars_3_int_1(Prolog *m);

		static Operation find_vars_3_int_2(Prolog *m);

		static Operation find_vars_3_1(Prolog *m);

		static Operation find_vars_3_2(Prolog *m);

		static Operation find_vars_3_3(Prolog *m);

		static Operation find_vars_3_4(Prolog *m);
	/** PREDICATE: intersect_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(intersect_vars/3,public)




	public:
		static Operation PRED_intersect_vars_3_static_exec(Prolog *m);
	/** PREDICATE: make_dummy_name/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(make_dummy_name/2,public)
			static SymbolTerm *const ATOM__dummy_;




		static Operation PRED_make_dummy_name_2_static_exec(Prolog *m);
	/** PREDICATE: append/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(append/3,public)




		static Operation PRED_append_3_static_exec(Prolog *m);

	private:
		static Operation append_3_top(Prolog *m);

		static Operation append_3_var(Prolog *m);

		static Operation append_3_var_1(Prolog *m);

		static Operation append_3_1(Prolog *m);

		static Operation append_3_2(Prolog *m);
	/** PREDICATE: copy/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(copy/2,public)




	public:
		static Operation PRED_copy_2_static_exec(Prolog *m);
	/** PREDICATE: copy2/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(copy2/3,public)




		static Operation PRED_copy2_3_static_exec(Prolog *m);

	private:
		static Operation copy2_3_sub_1(Prolog *m);

		static Operation copy2_3_1(Prolog *m);

		static Operation copy2_3_2(Prolog *m);
	/** PREDICATE: copy2/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(copy2/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_copy2_5_static_exec(Prolog *m);

	private:
		static Operation copy2_5_sub_1(Prolog *m);

		static Operation copy2_5_1(Prolog *m);

		static Operation copy2_5_2(Prolog *m);
	/** PREDICATE: retrieve_sym/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(retrieve_sym/3,public)
		public:
			static SymbolTerm *const FUNCTOR_p_2;




		static Operation PRED_retrieve_sym_3_static_exec(Prolog *m);

	private:
		static Operation retrieve_sym_3_top(Prolog *m);

		static Operation retrieve_sym_3_sub_1(Prolog *m);

		static Operation retrieve_sym_3_1(Prolog *m);

		static Operation retrieve_sym_3_2(Prolog *m);
	/** PREDICATE: make_sym/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(make_sym/2,public)




	public:
		static Operation PRED_make_sym_2_static_exec(Prolog *m);

	private:
		static Operation make_sym_2_top(Prolog *m);

		static Operation make_sym_2_var(Prolog *m);

		static Operation make_sym_2_var_1(Prolog *m);

		static Operation make_sym_2_1(Prolog *m);

		static Operation make_sym_2_2(Prolog *m);
	/** PREDICATE: varset/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(varset/2,public)




	public:
		static Operation PRED_varset_2_static_exec(Prolog *m);
	/** PREDICATE: varbag/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(varbag/2,public)




		static Operation PRED_varbag_2_static_exec(Prolog *m);
	/** PREDICATE: varbag/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(varbag/3,public)




		static Operation PRED_varbag_3_static_exec(Prolog *m);

	private:
		static Operation varbag_3_sub_1(Prolog *m);

		static Operation varbag_3_1(Prolog *m);

		static Operation varbag_3_2(Prolog *m);
	/** PREDICATE: varbag/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(varbag/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_varbag_5_static_exec(Prolog *m);

	private:
		static Operation varbag_5_sub_1(Prolog *m);

		static Operation varbag_5_1(Prolog *m);

		static Operation varbag_5_2(Prolog *m);
	/** PREDICATE: inst_vars/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(inst_vars/1,public)
		public:
			static IntegerTerm *const int_65;
	private:
		static ListTerm *const L_inst_vars_1_s3;




	public:
		static Operation PRED_inst_vars_1_static_exec(Prolog *m);
	/** PREDICATE: inst_vars_list/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(inst_vars_list/2,public)




		static Operation PRED_inst_vars_list_2_static_exec(Prolog *m);

	private:
		static Operation inst_vars_list_2_var(Prolog *m);

		static Operation inst_vars_list_2_var_1(Prolog *m);

		static Operation inst_vars_list_2_1(Prolog *m);

		static Operation inst_vars_list_2_2(Prolog *m);
	/** PREDICATE: sort_vars/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(sort_vars/2,public)




	public:
		static Operation PRED_sort_vars_2_static_exec(Prolog *m);
	/** PREDICATE: sort_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(sort_vars/3,public)




		static Operation PRED_sort_vars_3_static_exec(Prolog *m);

	private:
		static Operation sort_vars_3_var(Prolog *m);

		static Operation sort_vars_3_var_1(Prolog *m);

		static Operation sort_vars_3_1(Prolog *m);

		static Operation sort_vars_3_2(Prolog *m);
	/** PREDICATE: intersect_sorted_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(intersect_sorted_vars/3,public)




	public:
		static Operation PRED_intersect_sorted_vars_3_static_exec(Prolog *m);

	private:
		static Operation intersect_sorted_vars_3_top(Prolog *m);

		static Operation intersect_sorted_vars_3_var(Prolog *m);

		static Operation intersect_sorted_vars_3_var_1(Prolog *m);

		static Operation intersect_sorted_vars_3_var_2(Prolog *m);

		static Operation intersect_sorted_vars_3_var_3(Prolog *m);

		static Operation intersect_sorted_vars_3_var_4(Prolog *m);

		static Operation intersect_sorted_vars_3_con(Prolog *m);

		static Operation intersect_sorted_vars_3_con_1(Prolog *m);

		static Operation intersect_sorted_vars_3_lis(Prolog *m);

		static Operation intersect_sorted_vars_3_lis_1(Prolog *m);

		static Operation intersect_sorted_vars_3_lis_2(Prolog *m);

		static Operation intersect_sorted_vars_3_lis_3(Prolog *m);

		static Operation intersect_sorted_vars_3_1(Prolog *m);

		static Operation intersect_sorted_vars_3_2(Prolog *m);

		static Operation intersect_sorted_vars_3_3(Prolog *m);

		static Operation intersect_sorted_vars_3_4(Prolog *m);

		static Operation intersect_sorted_vars_3_5(Prolog *m);
	/** PREDICATE: split_vars/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
		// main(split_vars/4,public)




	public:
		static Operation PRED_split_vars_4_static_exec(Prolog *m);

	private:
		static Operation split_vars_4_top(Prolog *m);

		static Operation split_vars_4_var(Prolog *m);

		static Operation split_vars_4_var_1(Prolog *m);

		static Operation split_vars_4_var_2(Prolog *m);

		static Operation split_vars_4_var_3(Prolog *m);

		static Operation split_vars_4_lis(Prolog *m);

		static Operation split_vars_4_lis_1(Prolog *m);

		static Operation split_vars_4_lis_2(Prolog *m);

		static Operation split_vars_4_1(Prolog *m);

		static Operation split_vars_4_2(Prolog *m);

		static Operation split_vars_4_3(Prolog *m);

		static Operation split_vars_4_4(Prolog *m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_flatten::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
