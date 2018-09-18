#ifndef FILE_QUERY
#define FILE_QUERY

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class IntegerTerm; }

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
	class FILE_query : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/query.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog* m);
	/** PREDICATE: query/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/query.pl
	*/
		// main(query/0,public)




		static Operation PRED_query_0_static_exec(Prolog* m);

	private:
		static Operation query_0_sub_1(Prolog* m);

		static Operation query_0_1(Prolog* m);

		static Operation query_0_2(Prolog* m);
	/** PREDICATE: query/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/query.pl
	*/
		// main(query/1,public)
		public:
			static SymbolTerm* const  FUNCTOR_$002A_2;




		static Operation PRED_query_1_static_exec(Prolog* m);
	/** PREDICATE: density/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/query.pl
	*/
		// main(density/2,public)
			static SymbolTerm* const  FUNCTOR_$002F$002F_2;
			static IntegerTerm* const  int_100;




		static Operation PRED_density_2_static_exec(Prolog* m);
	/** PREDICATE: pop/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/query.pl
	*/
		// main(pop/2,public)
			static SymbolTerm* const  ATOM_china;
			static IntegerTerm* const  int_8250;
			static SymbolTerm* const  ATOM_india;
			static IntegerTerm* const  int_5863;
			static SymbolTerm* const  ATOM_ussr;
			static IntegerTerm* const  int_2521;
			static SymbolTerm* const  ATOM_usa;
			static IntegerTerm* const  int_2119;
			static SymbolTerm* const  ATOM_indonesia;
			static IntegerTerm* const  int_1276;
			static SymbolTerm* const  ATOM_japan;
			static IntegerTerm* const  int_1097;
			static SymbolTerm* const  ATOM_brazil;
			static IntegerTerm* const  int_1042;
			static SymbolTerm* const  ATOM_bangladesh;
			static IntegerTerm* const  int_750;
			static SymbolTerm* const  ATOM_pakistan;
			static IntegerTerm* const  int_682;
			static SymbolTerm* const  ATOM_w_germany;
			static IntegerTerm* const  int_620;
			static SymbolTerm* const  ATOM_nigeria;
			static IntegerTerm* const  int_613;
			static SymbolTerm* const  ATOM_mexico;
			static IntegerTerm* const  int_581;
			static SymbolTerm* const  ATOM_uk;
			static IntegerTerm* const  int_559;
			static SymbolTerm* const  ATOM_italy;
			static IntegerTerm* const  int_554;
			static SymbolTerm* const  ATOM_france;
			static IntegerTerm* const  int_525;
			static SymbolTerm* const  ATOM_philippines;
			static IntegerTerm* const  int_415;
			static SymbolTerm* const  ATOM_thailand;
			static IntegerTerm* const  int_410;
			static SymbolTerm* const  ATOM_turkey;
			static IntegerTerm* const  int_383;
			static SymbolTerm* const  ATOM_egypt;
			static IntegerTerm* const  int_364;
			static SymbolTerm* const  ATOM_spain;
			static IntegerTerm* const  int_352;
			static SymbolTerm* const  ATOM_poland;
			static IntegerTerm* const  int_337;
			static SymbolTerm* const  ATOM_s_korea;
			static IntegerTerm* const  int_335;
			static SymbolTerm* const  ATOM_iran;
			static IntegerTerm* const  int_320;
			static SymbolTerm* const  ATOM_ethiopia;
			static IntegerTerm* const  int_272;
			static SymbolTerm* const  ATOM_argentina;
			static IntegerTerm* const  int_251;




		static Operation PRED_pop_2_static_exec(Prolog* m);

	private:
		static Operation pop_2_var(Prolog* m);

		static Operation pop_2_var_1(Prolog* m);

		static Operation pop_2_var_2(Prolog* m);

		static Operation pop_2_var_3(Prolog* m);

		static Operation pop_2_var_4(Prolog* m);

		static Operation pop_2_var_5(Prolog* m);

		static Operation pop_2_var_6(Prolog* m);

		static Operation pop_2_var_7(Prolog* m);

		static Operation pop_2_var_8(Prolog* m);

		static Operation pop_2_var_9(Prolog* m);

		static Operation pop_2_var_10(Prolog* m);

		static Operation pop_2_var_11(Prolog* m);

		static Operation pop_2_var_12(Prolog* m);

		static Operation pop_2_var_13(Prolog* m);

		static Operation pop_2_var_14(Prolog* m);

		static Operation pop_2_var_15(Prolog* m);

		static Operation pop_2_var_16(Prolog* m);

		static Operation pop_2_var_17(Prolog* m);

		static Operation pop_2_var_18(Prolog* m);

		static Operation pop_2_var_19(Prolog* m);

		static Operation pop_2_var_20(Prolog* m);

		static Operation pop_2_var_21(Prolog* m);

		static Operation pop_2_var_22(Prolog* m);

		static Operation pop_2_var_23(Prolog* m);

		static Operation pop_2_var_24(Prolog* m);

		static Operation pop_2_1(Prolog* m);

		static Operation pop_2_2(Prolog* m);

		static Operation pop_2_3(Prolog* m);

		static Operation pop_2_4(Prolog* m);

		static Operation pop_2_5(Prolog* m);

		static Operation pop_2_6(Prolog* m);

		static Operation pop_2_7(Prolog* m);

		static Operation pop_2_8(Prolog* m);

		static Operation pop_2_9(Prolog* m);

		static Operation pop_2_10(Prolog* m);

		static Operation pop_2_11(Prolog* m);

		static Operation pop_2_12(Prolog* m);

		static Operation pop_2_13(Prolog* m);

		static Operation pop_2_14(Prolog* m);

		static Operation pop_2_15(Prolog* m);

		static Operation pop_2_16(Prolog* m);

		static Operation pop_2_17(Prolog* m);

		static Operation pop_2_18(Prolog* m);

		static Operation pop_2_19(Prolog* m);

		static Operation pop_2_20(Prolog* m);

		static Operation pop_2_21(Prolog* m);

		static Operation pop_2_22(Prolog* m);

		static Operation pop_2_23(Prolog* m);

		static Operation pop_2_24(Prolog* m);

		static Operation pop_2_25(Prolog* m);
	/** PREDICATE: area/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/query.pl
	*/
		// main(area/2,public)
		public:
			static IntegerTerm* const  int_3380;
			static IntegerTerm* const  int_1139;
			static IntegerTerm* const  int_8708;
			static IntegerTerm* const  int_3609;
			static IntegerTerm* const  int_570;
			static IntegerTerm* const  int_148;
			static IntegerTerm* const  int_3288;
			static IntegerTerm* const  int_55;
			static IntegerTerm* const  int_311;
			static IntegerTerm* const  int_96;
			static IntegerTerm* const  int_373;
			static IntegerTerm* const  int_764;
			static IntegerTerm* const  int_86;
			static IntegerTerm* const  int_116;
			static IntegerTerm* const  int_213;
			static IntegerTerm* const  int_90;
			static IntegerTerm* const  int_200;
			static IntegerTerm* const  int_296;
			static IntegerTerm* const  int_386;
			static IntegerTerm* const  int_190;
			static IntegerTerm* const  int_121;
			static IntegerTerm* const  int_37;
			static IntegerTerm* const  int_628;
			static IntegerTerm* const  int_350;
			static IntegerTerm* const  int_1080;




		static Operation PRED_area_2_static_exec(Prolog* m);

	private:
		static Operation area_2_var(Prolog* m);

		static Operation area_2_var_1(Prolog* m);

		static Operation area_2_var_2(Prolog* m);

		static Operation area_2_var_3(Prolog* m);

		static Operation area_2_var_4(Prolog* m);

		static Operation area_2_var_5(Prolog* m);

		static Operation area_2_var_6(Prolog* m);

		static Operation area_2_var_7(Prolog* m);

		static Operation area_2_var_8(Prolog* m);

		static Operation area_2_var_9(Prolog* m);

		static Operation area_2_var_10(Prolog* m);

		static Operation area_2_var_11(Prolog* m);

		static Operation area_2_var_12(Prolog* m);

		static Operation area_2_var_13(Prolog* m);

		static Operation area_2_var_14(Prolog* m);

		static Operation area_2_var_15(Prolog* m);

		static Operation area_2_var_16(Prolog* m);

		static Operation area_2_var_17(Prolog* m);

		static Operation area_2_var_18(Prolog* m);

		static Operation area_2_var_19(Prolog* m);

		static Operation area_2_var_20(Prolog* m);

		static Operation area_2_var_21(Prolog* m);

		static Operation area_2_var_22(Prolog* m);

		static Operation area_2_var_23(Prolog* m);

		static Operation area_2_var_24(Prolog* m);

		static Operation area_2_1(Prolog* m);

		static Operation area_2_2(Prolog* m);

		static Operation area_2_3(Prolog* m);

		static Operation area_2_4(Prolog* m);

		static Operation area_2_5(Prolog* m);

		static Operation area_2_6(Prolog* m);

		static Operation area_2_7(Prolog* m);

		static Operation area_2_8(Prolog* m);

		static Operation area_2_9(Prolog* m);

		static Operation area_2_10(Prolog* m);

		static Operation area_2_11(Prolog* m);

		static Operation area_2_12(Prolog* m);

		static Operation area_2_13(Prolog* m);

		static Operation area_2_14(Prolog* m);

		static Operation area_2_15(Prolog* m);

		static Operation area_2_16(Prolog* m);

		static Operation area_2_17(Prolog* m);

		static Operation area_2_18(Prolog* m);

		static Operation area_2_19(Prolog* m);

		static Operation area_2_20(Prolog* m);

		static Operation area_2_21(Prolog* m);

		static Operation area_2_22(Prolog* m);

		static Operation area_2_23(Prolog* m);

		static Operation area_2_24(Prolog* m);

		static Operation area_2_25(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_query::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_QUERY
