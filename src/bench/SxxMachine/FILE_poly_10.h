#ifndef FILE_POLY_10
#define FILE_POLY_10

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class ListTerm; }

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
	class FILE_poly_10 : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog* m);
	/** PREDICATE: poly_10/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main(poly_10/0,public)




		static Operation PRED_poly_10_0_static_exec(Prolog* m);
	/** PREDICATE: test_poly/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main(test_poly/1,public)
			static SymbolTerm* const  FUNCTOR_poly_2;
			static SymbolTerm* const  ATOM_x;
			static SymbolTerm* const  FUNCTOR_term_2;
	private:
		static StructureTerm* const  L_test_poly_1_s7;
		static StructureTerm* const  L_test_poly_1_s9;
		static ListTerm* const  L_test_poly_1_s11;
		static ListTerm* const  L_test_poly_1_s12;
		static StructureTerm* const  L_test_poly_1_s14;
		public:
			static SymbolTerm* const  ATOM_y;
	private:
		static StructureTerm* const  L_test_poly_1_s17;
		public:
			static SymbolTerm* const  ATOM_z;
	private:
		static StructureTerm* const  L_test_poly_1_s20;




	public:
		static Operation PRED_test_poly_1_static_exec(Prolog* m);
	/** PREDICATE: (less_than)/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main((less_than)/2,public)




		static Operation PRED_less_than_2_static_exec(Prolog* m);

	private:
		static Operation less_than_2_var(Prolog* m);

		static Operation less_than_2_var_1(Prolog* m);

		static Operation less_than_2_var_2(Prolog* m);

		static Operation less_than_2_1(Prolog* m);

		static Operation less_than_2_2(Prolog* m);

		static Operation less_than_2_3(Prolog* m);
	/** PREDICATE: poly_add/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main(poly_add/3,public)
		public:
			static SymbolTerm* const  FUNCTOR_$002B_2;




		static Operation PRED_poly_add_3_static_exec(Prolog* m);

	private:
		static Operation poly_add_3_var(Prolog* m);

		static Operation poly_add_3_var_1(Prolog* m);

		static Operation poly_add_3_var_2(Prolog* m);

		static Operation poly_add_3_var_3(Prolog* m);

		static Operation poly_add_3_var_4(Prolog* m);

		static Operation poly_add_3_int(Prolog* m);

		static Operation poly_add_3_int_1(Prolog* m);

		static Operation poly_add_3_1(Prolog* m);

		static Operation poly_add_3_2(Prolog* m);

		static Operation poly_add_3_3(Prolog* m);

		static Operation poly_add_3_4(Prolog* m);

		static Operation poly_add_3_5(Prolog* m);
	/** PREDICATE: term_add/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main(term_add/3,public)




	public:
		static Operation PRED_term_add_3_static_exec(Prolog* m);

	private:
		static Operation term_add_3_top(Prolog* m);

		static Operation term_add_3_var(Prolog* m);

		static Operation term_add_3_var_1(Prolog* m);

		static Operation term_add_3_var_2(Prolog* m);

		static Operation term_add_3_var_3(Prolog* m);

		static Operation term_add_3_var_4(Prolog* m);

		static Operation term_add_3_int(Prolog* m);

		static Operation term_add_3_int_1(Prolog* m);

		static Operation term_add_3_con(Prolog* m);

		static Operation term_add_3_con_1(Prolog* m);

		static Operation term_add_3_con_2(Prolog* m);

		static Operation term_add_3_lis(Prolog* m);

		static Operation term_add_3_lis_1(Prolog* m);

		static Operation term_add_3_lis_2(Prolog* m);

		static Operation term_add_3_lis_3(Prolog* m);

		static Operation term_add_3_1(Prolog* m);

		static Operation term_add_3_2(Prolog* m);

		static Operation term_add_3_3(Prolog* m);

		static Operation term_add_3_4(Prolog* m);

		static Operation term_add_3_5(Prolog* m);
	/** PREDICATE: add_to_order_zero_term/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main(add_to_order_zero_term/3,public)




	public:
		static Operation PRED_add_to_order_zero_term_3_static_exec(Prolog* m);

	private:
		static Operation add_to_order_zero_term_3_var(Prolog* m);

		static Operation add_to_order_zero_term_3_var_1(Prolog* m);

		static Operation add_to_order_zero_term_3_1(Prolog* m);

		static Operation add_to_order_zero_term_3_2(Prolog* m);
	/** PREDICATE: poly_exp/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main(poly_exp/3,public)
		public:
			static SymbolTerm* const  FUNCTOR_$003E$003E_2;
			static SymbolTerm* const  FUNCTOR_$003C$003C_2;
			static SymbolTerm* const  FUNCTOR_$002D_2;




		static Operation PRED_poly_exp_3_static_exec(Prolog* m);

	private:
		static Operation poly_exp_3_top(Prolog* m);

		static Operation poly_exp_3_var(Prolog* m);

		static Operation poly_exp_3_var_1(Prolog* m);

		static Operation poly_exp_3_var_2(Prolog* m);

		static Operation poly_exp_3_flo(Prolog* m);

		static Operation poly_exp_3_flo_1(Prolog* m);

		static Operation poly_exp_3_1(Prolog* m);

		static Operation poly_exp_3_2(Prolog* m);

		static Operation poly_exp_3_3(Prolog* m);
	/** PREDICATE: poly_mul/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main(poly_mul/3,public)
		public:
			static SymbolTerm* const  FUNCTOR_$002A_2;




		static Operation PRED_poly_mul_3_static_exec(Prolog* m);

	private:
		static Operation poly_mul_3_var(Prolog* m);

		static Operation poly_mul_3_var_1(Prolog* m);

		static Operation poly_mul_3_var_2(Prolog* m);

		static Operation poly_mul_3_var_3(Prolog* m);

		static Operation poly_mul_3_var_4(Prolog* m);

		static Operation poly_mul_3_int(Prolog* m);

		static Operation poly_mul_3_int_1(Prolog* m);

		static Operation poly_mul_3_1(Prolog* m);

		static Operation poly_mul_3_2(Prolog* m);

		static Operation poly_mul_3_3(Prolog* m);

		static Operation poly_mul_3_4(Prolog* m);

		static Operation poly_mul_3_5(Prolog* m);
	/** PREDICATE: term_mul/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main(term_mul/3,public)




	public:
		static Operation PRED_term_mul_3_static_exec(Prolog* m);

	private:
		static Operation term_mul_3_var(Prolog* m);

		static Operation term_mul_3_var_1(Prolog* m);

		static Operation term_mul_3_var_2(Prolog* m);

		static Operation term_mul_3_con(Prolog* m);

		static Operation term_mul_3_con_1(Prolog* m);

		static Operation term_mul_3_lis(Prolog* m);

		static Operation term_mul_3_lis_1(Prolog* m);

		static Operation term_mul_3_1(Prolog* m);

		static Operation term_mul_3_2(Prolog* m);

		static Operation term_mul_3_3(Prolog* m);
	/** PREDICATE: single_term_mul/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main(single_term_mul/3,public)




	public:
		static Operation PRED_single_term_mul_3_static_exec(Prolog* m);

	private:
		static Operation single_term_mul_3_var(Prolog* m);

		static Operation single_term_mul_3_var_1(Prolog* m);

		static Operation single_term_mul_3_1(Prolog* m);

		static Operation single_term_mul_3_2(Prolog* m);
	/** PREDICATE: mul_through/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
		// main(mul_through/3,public)




	public:
		static Operation PRED_mul_through_3_static_exec(Prolog* m);

	private:
		static Operation mul_through_3_var(Prolog* m);

		static Operation mul_through_3_var_1(Prolog* m);

		static Operation mul_through_3_1(Prolog* m);

		static Operation mul_through_3_2(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_poly_10::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_POLY_10
