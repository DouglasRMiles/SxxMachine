#ifndef FILE_QUEENS_8
#define FILE_QUEENS_8

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class SymbolTerm; }

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
	class FILE_queens_8 : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog* m);

	private:
		static Operation top_0_sub_1(Prolog* m);

		static Operation top_0_1(Prolog* m);

		static Operation top_0_2(Prolog* m);
	/** PREDICATE: queens/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
		// main(queens/2,public)




	public:
		static Operation PRED_queens_2_static_exec(Prolog* m);
	/** PREDICATE: queens/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
		// main(queens/3,public)




		static Operation PRED_queens_3_static_exec(Prolog* m);

	private:
		static Operation queens_3_var(Prolog* m);

		static Operation queens_3_var_1(Prolog* m);

		static Operation queens_3_1(Prolog* m);

		static Operation queens_3_2(Prolog* m);
	/** PREDICATE: not_attack/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
		// main(not_attack/2,public)




	public:
		static Operation PRED_not_attack_2_static_exec(Prolog* m);
	/** PREDICATE: not_attack/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
		// main(not_attack/3,public)
			static SymbolTerm* const  FUNCTOR_$002B_2;
			static SymbolTerm* const  FUNCTOR_$002D_2;




		static Operation PRED_not_attack_3_static_exec(Prolog* m);

	private:
		static Operation not_attack_3_top(Prolog* m);

		static Operation not_attack_3_var(Prolog* m);

		static Operation not_attack_3_var_1(Prolog* m);

		static Operation not_attack_3_1(Prolog* m);

		static Operation not_attack_3_2(Prolog* m);
	/** PREDICATE: select/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
		// main(select/3,public)




	public:
		static Operation PRED_select_3_static_exec(Prolog* m);

	private:
		static Operation select_3_top(Prolog* m);

		static Operation select_3_var(Prolog* m);

		static Operation select_3_var_1(Prolog* m);

		static Operation select_3_1(Prolog* m);

		static Operation select_3_2(Prolog* m);
	/** PREDICATE: range/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
		// main(range/3,public)




	public:
		static Operation PRED_range_3_static_exec(Prolog* m);

	private:
		static Operation range_3_top(Prolog* m);

		static Operation range_3_sub_1(Prolog* m);

		static Operation range_3_1(Prolog* m);

		static Operation range_3_2(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_queens_8::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_QUEENS_8
