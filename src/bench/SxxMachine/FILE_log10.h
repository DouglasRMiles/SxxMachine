#ifndef FILE_LOG10
#define FILE_LOG10

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class StructureTerm; }

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
	class FILE_log10 : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/log10.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog* m);
	/** PREDICATE: log10/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/log10.pl
	*/
		// main(log10/0,public)
			static SymbolTerm* const  FUNCTOR_log_1;
			static SymbolTerm* const  ATOM_x;
	private:
		static StructureTerm* const  L_log10_0_s4;
		static StructureTerm* const  L_log10_0_s6;
		static StructureTerm* const  L_log10_0_s8;
		static StructureTerm* const  L_log10_0_s10;
		static StructureTerm* const  L_log10_0_s12;
		static StructureTerm* const  L_log10_0_s14;
		static StructureTerm* const  L_log10_0_s16;
		static StructureTerm* const  L_log10_0_s18;
		static StructureTerm* const  L_log10_0_s20;
		static StructureTerm* const  L_log10_0_s22;




	public:
		static Operation PRED_log10_0_static_exec(Prolog* m);
	/** PREDICATE: d/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/log10.pl
	*/
		// main(d/3,public)
			static SymbolTerm* const  FUNCTOR_$002B_2;
			static SymbolTerm* const  FUNCTOR_$002D_2;
			static SymbolTerm* const  FUNCTOR_$002A_2;
			static SymbolTerm* const  FUNCTOR_$002F_2;
			static SymbolTerm* const  FUNCTOR_$005E_2;
			static SymbolTerm* const  FUNCTOR_$002D_1;
			static SymbolTerm* const  FUNCTOR_exp_1;




		static Operation PRED_d_3_static_exec(Prolog* m);

	private:
		static Operation d_3_top(Prolog* m);

		static Operation d_3_var(Prolog* m);

		static Operation d_3_var_1(Prolog* m);

		static Operation d_3_var_2(Prolog* m);

		static Operation d_3_var_3(Prolog* m);

		static Operation d_3_var_4(Prolog* m);

		static Operation d_3_var_5(Prolog* m);

		static Operation d_3_var_6(Prolog* m);

		static Operation d_3_var_7(Prolog* m);

		static Operation d_3_var_8(Prolog* m);

		static Operation d_3_var_9(Prolog* m);

		static Operation d_3_int(Prolog* m);

		static Operation d_3_int_1(Prolog* m);

		static Operation d_3_1(Prolog* m);

		static Operation d_3_2(Prolog* m);

		static Operation d_3_3(Prolog* m);

		static Operation d_3_4(Prolog* m);

		static Operation d_3_5(Prolog* m);

		static Operation d_3_6(Prolog* m);

		static Operation d_3_7(Prolog* m);

		static Operation d_3_8(Prolog* m);

		static Operation d_3_9(Prolog* m);

		static Operation d_3_10(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_log10::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_LOG10
