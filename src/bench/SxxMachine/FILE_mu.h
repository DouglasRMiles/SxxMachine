#pragma once

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Prolog;
	class SymbolTerm;
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
	class FILE_mu : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog *m);
	/** PREDICATE: mu/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
		// main(mu/0,public)
			static SymbolTerm *const ATOM_m;
			static SymbolTerm *const ATOM_u;
			static SymbolTerm *const ATOM_i;
	private:
		static ListTerm *const L_mu_0_s5;
		static ListTerm *const L_mu_0_s6;
		static ListTerm *const L_mu_0_s7;
		static ListTerm *const L_mu_0_s8;
		static ListTerm *const L_mu_0_s9;




	public:
		static Operation PRED_mu_0_static_exec(Prolog *m);
	/** PREDICATE: theorem/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
		// main(theorem/3,public)
	private:
		static ListTerm *const L_theorem_3_s4;
		static ListTerm *const L_theorem_3_s5;
		public:
			static SymbolTerm *const ATOM_a;
	private:
		static ListTerm *const L_theorem_3_s7;
		static ListTerm *const L_theorem_3_s8;
		public:
			static SymbolTerm *const FUNCTOR_$002D_2;




		static Operation PRED_theorem_3_static_exec(Prolog *m);

	private:
		static Operation theorem_3_top(Prolog *m);

		static Operation theorem_3_var(Prolog *m);

		static Operation theorem_3_var_1(Prolog *m);

		static Operation theorem_3_1(Prolog *m);

		static Operation theorem_3_2(Prolog *m);
	/** PREDICATE: rule/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
		// main(rule/3,public)




	public:
		static Operation PRED_rule_3_static_exec(Prolog *m);

	private:
		static Operation rule_3_var(Prolog *m);

		static Operation rule_3_var_1(Prolog *m);

		static Operation rule_3_var_2(Prolog *m);

		static Operation rule_3_var_3(Prolog *m);

		static Operation rule_3_1(Prolog *m);

		static Operation rule_3_2(Prolog *m);

		static Operation rule_3_3(Prolog *m);

		static Operation rule_3_4(Prolog *m);
	/** PREDICATE: rule1/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
		// main(rule1/2,public)
		static ListTerm *const L_rule1_2_s3;
		static ListTerm *const L_rule1_2_s5;
		static ListTerm *const L_rule1_2_s6;




	public:
		static Operation PRED_rule1_2_static_exec(Prolog *m);

	private:
		static Operation rule1_2_top(Prolog *m);

		static Operation rule1_2_var(Prolog *m);

		static Operation rule1_2_var_1(Prolog *m);

		static Operation rule1_2_1(Prolog *m);

		static Operation rule1_2_2(Prolog *m);
	/** PREDICATE: rule2/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
		// main(rule2/2,public)




	public:
		static Operation PRED_rule2_2_static_exec(Prolog *m);
	/** PREDICATE: rule3/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
		// main(rule3/2,public)




		static Operation PRED_rule3_2_static_exec(Prolog *m);

	private:
		static Operation rule3_2_top(Prolog *m);

		static Operation rule3_2_var(Prolog *m);

		static Operation rule3_2_var_1(Prolog *m);

		static Operation rule3_2_1(Prolog *m);

		static Operation rule3_2_2(Prolog *m);
	/** PREDICATE: rule4/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
	*/
		// main(rule4/2,public)




	public:
		static Operation PRED_rule4_2_static_exec(Prolog *m);

	private:
		static Operation rule4_2_top(Prolog *m);

		static Operation rule4_2_var(Prolog *m);

		static Operation rule4_2_var_1(Prolog *m);

		static Operation rule4_2_1(Prolog *m);

		static Operation rule4_2_2(Prolog *m);
	/** PREDICATE: append/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/mu.pl
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
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_mu::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
