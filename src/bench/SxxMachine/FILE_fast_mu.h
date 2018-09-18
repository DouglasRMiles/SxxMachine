#pragma once

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
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
	class FILE_fast_mu : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
		// main(top/0,public)
		public:
			static SymbolTerm *const ATOM_m;
			static SymbolTerm *const ATOM_u;
			static SymbolTerm *const ATOM_i;
	private:
		static ListTerm *const L_top_0_s5;
		static ListTerm *const L_top_0_s6;
		static ListTerm *const L_top_0_s7;
		static ListTerm *const L_top_0_s8;
		static ListTerm *const L_top_0_s9;




	public:
		static Operation PRED_top_0_static_exec(Prolog *m);
	/** PREDICATE: theorem/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
		// main(theorem/1,public)
			static SymbolTerm *const FUNCTOR_$002D_2;
	private:
		static ListTerm *const L_theorem_1_s6;
		static ListTerm *const L_theorem_1_s7;




	public:
		static Operation PRED_theorem_1_static_exec(Prolog *m);
	/** PREDICATE: derive/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
		// main(derive/6,public)
			static SymbolTerm *const FUNCTOR_$002B_2;

		// private final Term arg5, arg6;




		static Operation PRED_derive_6_static_exec(Prolog *m);

	private:
		static Operation derive_6_top(Prolog *m);

		static Operation derive_6_sub_1(Prolog *m);

		static Operation derive_6_1(Prolog *m);

		static Operation derive_6_2(Prolog *m);
	/** PREDICATE: derive2/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
		// main(derive2/7,public)
		public:
			static SymbolTerm *const FUNCTOR_rule_2;

		// private final Term arg5, arg6, arg7;




		static Operation PRED_derive2_7_static_exec(Prolog *m);

	private:
		static Operation derive2_7_sub_1(Prolog *m);

		static Operation derive2_7_1(Prolog *m);

		static Operation derive2_7_2(Prolog *m);
	/** PREDICATE: rule/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
		// main(rule/7,public)

		// private final Term arg5, arg6, arg7;




	public:
		static Operation PRED_rule_7_static_exec(Prolog *m);
	/** PREDICATE: rule/11
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
		// main(rule/11,public)
	private:
		static ListTerm *const L_rule_11_s3;
		static ListTerm *const L_rule_11_s5;
		static ListTerm *const L_rule_11_s6;

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;




	public:
		static Operation PRED_rule_11_static_exec(Prolog *m);

	private:
		static Operation rule_11_top(Prolog *m);

		static Operation rule_11_var(Prolog *m);

		static Operation rule_11_var_1(Prolog *m);

		static Operation rule_11_var_2(Prolog *m);

		static Operation rule_11_var_3(Prolog *m);

		static Operation rule_11_var_4(Prolog *m);

		static Operation rule_11_lis(Prolog *m);

		static Operation rule_11_lis_1(Prolog *m);

		static Operation rule_11_lis_2(Prolog *m);

		static Operation rule_11_lis_3(Prolog *m);

		static Operation rule_11_1(Prolog *m);

		static Operation rule_11_2(Prolog *m);

		static Operation rule_11_3(Prolog *m);

		static Operation rule_11_4(Prolog *m);

		static Operation rule_11_5(Prolog *m);
	/** PREDICATE: lower_bound/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
		// main(lower_bound/3,public)
		public:
			static SymbolTerm *const FUNCTOR_$002F$005C_2;




		static Operation PRED_lower_bound_3_static_exec(Prolog *m);

	private:
		static Operation lower_bound_3_sub_1(Prolog *m);

		static Operation lower_bound_3_sub_2(Prolog *m);

		static Operation lower_bound_3_1(Prolog *m);

		static Operation lower_bound_3_2(Prolog *m);

		static Operation lower_bound_3_3(Prolog *m);
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
		// main('$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl'/3,public)
		public:
			static SymbolTerm *const FUNCTOR_$003E$003E_2;




		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_static_exec(Prolog *m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_sub_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_2(Prolog *m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_fast_mu::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
