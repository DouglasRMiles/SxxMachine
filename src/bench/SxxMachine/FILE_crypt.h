#pragma once

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Prolog;
	class SymbolTerm;
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
	class FILE_crypt : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/crypt.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog *m);
	/** PREDICATE: sum/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/crypt.pl
	*/
		// main(sum/3,public)




		static Operation PRED_sum_3_static_exec(Prolog *m);
	/** PREDICATE: sum/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/crypt.pl
	*/
		// main(sum/4,public)
			static SymbolTerm *const FUNCTOR_$002B_2;
			static SymbolTerm *const FUNCTOR_mod_2;
			static SymbolTerm *const FUNCTOR_$002F$002F_2;




		static Operation PRED_sum_4_static_exec(Prolog *m);

	private:
		static Operation sum_4_top(Prolog *m);

		static Operation sum_4_var(Prolog *m);

		static Operation sum_4_var_1(Prolog *m);

		static Operation sum_4_var_2(Prolog *m);

		static Operation sum_4_var_3(Prolog *m);

		static Operation sum_4_var_4(Prolog *m);

		static Operation sum_4_var_5(Prolog *m);

		static Operation sum_4_con(Prolog *m);

		static Operation sum_4_con_1(Prolog *m);

		static Operation sum_4_con_2(Prolog *m);

		static Operation sum_4_con_3(Prolog *m);

		static Operation sum_4_lis(Prolog *m);

		static Operation sum_4_lis_1(Prolog *m);

		static Operation sum_4_lis_2(Prolog *m);

		static Operation sum_4_1(Prolog *m);

		static Operation sum_4_2(Prolog *m);

		static Operation sum_4_3(Prolog *m);

		static Operation sum_4_4(Prolog *m);

		static Operation sum_4_5(Prolog *m);

		static Operation sum_4_6(Prolog *m);
	/** PREDICATE: mult/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/crypt.pl
	*/
		// main(mult/3,public)




	public:
		static Operation PRED_mult_3_static_exec(Prolog *m);
	/** PREDICATE: mult/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/crypt.pl
	*/
		// main(mult/4,public)
			static SymbolTerm *const FUNCTOR_$002A_2;




		static Operation PRED_mult_4_static_exec(Prolog *m);

	private:
		static Operation mult_4_top(Prolog *m);

		static Operation mult_4_var(Prolog *m);

		static Operation mult_4_var_1(Prolog *m);

		static Operation mult_4_1(Prolog *m);

		static Operation mult_4_2(Prolog *m);
	/** PREDICATE: zero/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/crypt.pl
	*/
		// main(zero/1,public)




	public:
		static Operation PRED_zero_1_static_exec(Prolog *m);

	private:
		static Operation zero_1_top(Prolog *m);

		static Operation zero_1_var(Prolog *m);

		static Operation zero_1_var_1(Prolog *m);

		static Operation zero_1_1(Prolog *m);

		static Operation zero_1_2(Prolog *m);
	/** PREDICATE: odd/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/crypt.pl
	*/
		// main(odd/1,public)




	public:
		static Operation PRED_odd_1_static_exec(Prolog *m);

	private:
		static Operation odd_1_var(Prolog *m);

		static Operation odd_1_var_1(Prolog *m);

		static Operation odd_1_var_2(Prolog *m);

		static Operation odd_1_var_3(Prolog *m);

		static Operation odd_1_var_4(Prolog *m);

		static Operation odd_1_1(Prolog *m);

		static Operation odd_1_2(Prolog *m);

		static Operation odd_1_3(Prolog *m);

		static Operation odd_1_4(Prolog *m);

		static Operation odd_1_5(Prolog *m);
	/** PREDICATE: even/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/crypt.pl
	*/
		// main(even/1,public)




	public:
		static Operation PRED_even_1_static_exec(Prolog *m);

	private:
		static Operation even_1_var(Prolog *m);

		static Operation even_1_var_1(Prolog *m);

		static Operation even_1_var_2(Prolog *m);

		static Operation even_1_var_3(Prolog *m);

		static Operation even_1_var_4(Prolog *m);

		static Operation even_1_1(Prolog *m);

		static Operation even_1_2(Prolog *m);

		static Operation even_1_3(Prolog *m);

		static Operation even_1_4(Prolog *m);

		static Operation even_1_5(Prolog *m);
	/** PREDICATE: lefteven/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/crypt.pl
	*/
		// main(lefteven/1,public)




	public:
		static Operation PRED_lefteven_1_static_exec(Prolog *m);

	private:
		static Operation lefteven_1_var(Prolog *m);

		static Operation lefteven_1_var_1(Prolog *m);

		static Operation lefteven_1_var_2(Prolog *m);

		static Operation lefteven_1_var_3(Prolog *m);

		static Operation lefteven_1_1(Prolog *m);

		static Operation lefteven_1_2(Prolog *m);

		static Operation lefteven_1_3(Prolog *m);

		static Operation lefteven_1_4(Prolog *m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_crypt::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
