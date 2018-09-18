#pragma once

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class IntegerTerm;
	class Operation;
	class Prolog;
	class LongTerm;
	class ListTerm;
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
	class FILE_perfect : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl
	*/
		// main(top/0,public)
		public:
			static IntegerTerm *const int_100;




		static Operation PRED_top_0_static_exec(Prolog *m);
	/** PREDICATE: ok/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl
	*/
		// main(ok/1,public)
			static LongTerm *const int_3213876088517980551083924184681057554444177758164088967397376;
			static LongTerm *const int_12554203470773361527671578846336104669690446551334525075456;
			static LongTerm *const int_191561942608236107294793378084303638130997321548169216;
			static LongTerm *const int_46768052394588893382517909811217778170473142550528;
			static LongTerm *const int_182687704666362864775460301858080473799697891328;
			static LongTerm *const int_44601490397061246283066714178813853366747136;
			static LongTerm *const int_2787593149816327892690784192460327776944128;
			static LongTerm *const int_10889035741470030830754200461521744560128;
			static LongTerm *const int_2658455991569831744654692615953842176;
			static LongTerm *const int_166153499473114483824745506383331328;
			static LongTerm *const int_40564819207303336344294875201536;
			static LongTerm *const int_9903520314282971830448816128;
			static LongTerm *const int_38685626227663735544086528;
			static LongTerm *const int_2417851639228158837784576;
			static LongTerm *const int_9444732965670570950656;
			static LongTerm *const int_2305843008139952128;
			static LongTerm *const int_144115187807420416;
			static LongTerm *const int_35184367894528;
			static LongTerm *const int_137438691328;
			static LongTerm *const int_8589869056;
			static IntegerTerm *const int_33550336;
			static IntegerTerm *const int_2096128;
			static IntegerTerm *const int_8128;
			static IntegerTerm *const int_496;
			static IntegerTerm *const int_28;
	private:
		static ListTerm *const L_ok_1_s28;
		static ListTerm *const L_ok_1_s29;
		static ListTerm *const L_ok_1_s30;
		static ListTerm *const L_ok_1_s31;
		static ListTerm *const L_ok_1_s32;
		static ListTerm *const L_ok_1_s33;
		static ListTerm *const L_ok_1_s34;
		static ListTerm *const L_ok_1_s35;
		static ListTerm *const L_ok_1_s36;
		static ListTerm *const L_ok_1_s37;
		static ListTerm *const L_ok_1_s38;
		static ListTerm *const L_ok_1_s39;
		static ListTerm *const L_ok_1_s40;
		static ListTerm *const L_ok_1_s41;
		static ListTerm *const L_ok_1_s42;
		static ListTerm *const L_ok_1_s43;
		static ListTerm *const L_ok_1_s44;
		static ListTerm *const L_ok_1_s45;
		static ListTerm *const L_ok_1_s46;
		static ListTerm *const L_ok_1_s47;
		static ListTerm *const L_ok_1_s48;
		static ListTerm *const L_ok_1_s49;
		static ListTerm *const L_ok_1_s50;
		static ListTerm *const L_ok_1_s51;
		static ListTerm *const L_ok_1_s52;
		static ListTerm *const L_ok_1_s53;




	public:
		static Operation PRED_ok_1_static_exec(Prolog *m);
	/** PREDICATE: divisible/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl
	*/
		// main(divisible/2,public)
			static SymbolTerm *const FUNCTOR_$002A_2;
			static SymbolTerm *const FUNCTOR_mod_2;
			static SymbolTerm *const FUNCTOR_$002B_2;




		static Operation PRED_divisible_2_static_exec(Prolog *m);

	private:
		static Operation divisible_2_top(Prolog *m);

		static Operation divisible_2_sub_1(Prolog *m);

		static Operation divisible_2_1(Prolog *m);

		static Operation divisible_2_2(Prolog *m);
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl
	*/
		// main('$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl'/2,public)




	public:
		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_static_exec(Prolog *m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_sub_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_2(Prolog *m);
	/** PREDICATE: isprime/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl
	*/
		// main(isprime/2,public)




	public:
		static Operation PRED_isprime_2_static_exec(Prolog *m);

	private:
		static Operation isprime_2_top(Prolog *m);

		static Operation isprime_2_var(Prolog *m);

		static Operation isprime_2_var_1(Prolog *m);

		static Operation isprime_2_1(Prolog *m);

		static Operation isprime_2_2(Prolog *m);
	/** PREDICATE: power/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl
	*/
		// main(power/3,public)
		public:
			static SymbolTerm *const FUNCTOR_$002D_2;




		static Operation PRED_power_3_static_exec(Prolog *m);

	private:
		static Operation power_3_top(Prolog *m);

		static Operation power_3_sub_1(Prolog *m);

		static Operation power_3_1(Prolog *m);

		static Operation power_3_2(Prolog *m);
	/** PREDICATE: calc/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl
	*/
		// main(calc/3,public)




	public:
		static Operation PRED_calc_3_static_exec(Prolog *m);
	/** PREDICATE: listperf/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl
	*/
		// main(listperf/2,public)




		static Operation PRED_listperf_2_static_exec(Prolog *m);

	private:
		static Operation listperf_2_top(Prolog *m);

		static Operation listperf_2_var(Prolog *m);

		static Operation listperf_2_var_1(Prolog *m);

		static Operation listperf_2_1(Prolog *m);

		static Operation listperf_2_2(Prolog *m);
	/** PREDICATE: generateList/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl
	*/
		// main(generateList/2,public)




	public:
		static Operation PRED_generateList_2_static_exec(Prolog *m);

	private:
		static Operation generateList_2_top(Prolog *m);

		static Operation generateList_2_var(Prolog *m);

		static Operation generateList_2_var_1(Prolog *m);

		static Operation generateList_2_1(Prolog *m);

		static Operation generateList_2_2(Prolog *m);
	/** PREDICATE: perfect/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl
	*/
		// main(perfect/2,public)




	public:
		static Operation PRED_perfect_2_static_exec(Prolog *m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_perfect::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
