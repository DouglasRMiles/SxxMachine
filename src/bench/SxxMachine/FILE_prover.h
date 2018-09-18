#ifndef FILE_PROVER
#define FILE_PROVER

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
	class FILE_prover : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog* m);
	/** PREDICATE: prover/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
		// main(prover/0,public)




		static Operation PRED_prover_0_static_exec(Prolog* m);

	private:
		static Operation prover_0_sub_1(Prolog* m);

		static Operation prover_0_1(Prolog* m);

		static Operation prover_0_2(Prolog* m);
	/** PREDICATE: problem/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
		// main(problem/3,public)
		public:
			static SymbolTerm* const  FUNCTOR_$002D_1;
			static SymbolTerm* const  ATOM_a;
	private:
		static StructureTerm* const  L_problem_3_s5;
		public:
			static SymbolTerm* const  FUNCTOR_$002B_1;
	private:
		static StructureTerm* const  L_problem_3_s7;
		public:
			static SymbolTerm* const  FUNCTOR_$0026_2;
	private:
		static StructureTerm* const  L_problem_3_s11;
		public:
			static SymbolTerm* const  FUNCTOR_$0023_2;
			static SymbolTerm* const  ATOM_to_be;
	private:
		static StructureTerm* const  L_problem_3_s16;
		static StructureTerm* const  L_problem_3_s17;
		static StructureTerm* const  L_problem_3_s19;
		public:
			static SymbolTerm* const  ATOM_b;
	private:
		static StructureTerm* const  L_problem_3_s24;
		static StructureTerm* const  L_problem_3_s26;
		static StructureTerm* const  L_problem_3_s28;
		static StructureTerm* const  L_problem_3_s30;
		static StructureTerm* const  L_problem_3_s32;
		static StructureTerm* const  L_problem_3_s34;
		static StructureTerm* const  L_problem_3_s36;
		public:
			static SymbolTerm* const  ATOM_c;
	private:
		static StructureTerm* const  L_problem_3_s40;
		static StructureTerm* const  L_problem_3_s42;
		static StructureTerm* const  L_problem_3_s44;
		static StructureTerm* const  L_problem_3_s46;
		static StructureTerm* const  L_problem_3_s48;
		static StructureTerm* const  L_problem_3_s51;
		static StructureTerm* const  L_problem_3_s52;
		static StructureTerm* const  L_problem_3_s54;
		static StructureTerm* const  L_problem_3_s56;
		static StructureTerm* const  L_problem_3_s59;
		static StructureTerm* const  L_problem_3_s61;




	public:
		static Operation PRED_problem_3_static_exec(Prolog* m);

	private:
		static Operation problem_3_var(Prolog* m);

		static Operation problem_3_var_1(Prolog* m);

		static Operation problem_3_var_2(Prolog* m);

		static Operation problem_3_var_3(Prolog* m);

		static Operation problem_3_var_4(Prolog* m);

		static Operation problem_3_var_5(Prolog* m);

		static Operation problem_3_var_6(Prolog* m);

		static Operation problem_3_var_7(Prolog* m);

		static Operation problem_3_var_8(Prolog* m);

		static Operation problem_3_var_9(Prolog* m);

		static Operation problem_3_1(Prolog* m);

		static Operation problem_3_2(Prolog* m);

		static Operation problem_3_3(Prolog* m);

		static Operation problem_3_4(Prolog* m);

		static Operation problem_3_5(Prolog* m);

		static Operation problem_3_6(Prolog* m);

		static Operation problem_3_7(Prolog* m);

		static Operation problem_3_8(Prolog* m);

		static Operation problem_3_9(Prolog* m);

		static Operation problem_3_10(Prolog* m);
	/** PREDICATE: implies/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
		// main(implies/2,public)
		public:
			static SymbolTerm* const  FUNCTOR_fs_4;
	private:
		static StructureTerm* const  L_implies_2_s4;




	public:
		static Operation PRED_implies_2_static_exec(Prolog* m);
	/** PREDICATE: opposite/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
		// main(opposite/2,public)




		static Operation PRED_opposite_2_static_exec(Prolog* m);

	private:
		static Operation opposite_2_top(Prolog* m);

		static Operation opposite_2_var(Prolog* m);

		static Operation opposite_2_var_1(Prolog* m);

		static Operation opposite_2_var_2(Prolog* m);

		static Operation opposite_2_var_3(Prolog* m);

		static Operation opposite_2_1(Prolog* m);

		static Operation opposite_2_2(Prolog* m);

		static Operation opposite_2_3(Prolog* m);

		static Operation opposite_2_4(Prolog* m);
	/** PREDICATE: add_conjunction/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
		// main(add_conjunction/3,public)




	public:
		static Operation PRED_add_conjunction_3_static_exec(Prolog* m);
	/** PREDICATE: expand/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
		// main(expand/3,public)
			static SymbolTerm* const  ATOM_refuted;




		static Operation PRED_expand_3_static_exec(Prolog* m);

	private:
		static Operation expand_3_top(Prolog* m);

		static Operation expand_3_var(Prolog* m);

		static Operation expand_3_var_1(Prolog* m);

		static Operation expand_3_var_2(Prolog* m);

		static Operation expand_3_var_3(Prolog* m);

		static Operation expand_3_var_4(Prolog* m);

		static Operation expand_3_var_5(Prolog* m);

		static Operation expand_3_var_6(Prolog* m);

		static Operation expand_3_1(Prolog* m);

		static Operation expand_3_2(Prolog* m);

		static Operation expand_3_3(Prolog* m);

		static Operation expand_3_4(Prolog* m);

		static Operation expand_3_5(Prolog* m);

		static Operation expand_3_6(Prolog* m);

		static Operation expand_3_7(Prolog* m);
	/** PREDICATE: includes/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
		// main(includes/2,public)




	public:
		static Operation PRED_includes_2_static_exec(Prolog* m);

	private:
		static Operation includes_2_top(Prolog* m);

		static Operation includes_2_var(Prolog* m);

		static Operation includes_2_var_1(Prolog* m);

		static Operation includes_2_1(Prolog* m);

		static Operation includes_2_2(Prolog* m);
	/** PREDICATE: extend/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
		// main(extend/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_extend_6_static_exec(Prolog* m);

	private:
		static Operation extend_6_sub_1(Prolog* m);

		static Operation extend_6_sub_2(Prolog* m);

		static Operation extend_6_1(Prolog* m);

		static Operation extend_6_2(Prolog* m);

		static Operation extend_6_3(Prolog* m);
	/** PREDICATE: refute/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
		// main(refute/1,public)




	public:
		static Operation PRED_refute_1_static_exec(Prolog* m);

	private:
		static Operation refute_1_var(Prolog* m);

		static Operation refute_1_var_1(Prolog* m);

		static Operation refute_1_1(Prolog* m);

		static Operation refute_1_2(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_prover::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_PROVER
