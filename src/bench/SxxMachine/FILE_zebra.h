#pragma once

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
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
	class FILE_zebra : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/
		// main(top/0,public)
		public:
			static SymbolTerm *const FUNCTOR_house_5;
			static SymbolTerm *const ATOM_red;
			static SymbolTerm *const ATOM_english;
			static SymbolTerm *const ATOM_spanish;
			static SymbolTerm *const ATOM_dog;
			static SymbolTerm *const ATOM_green;
			static SymbolTerm *const ATOM_coffee;
			static SymbolTerm *const ATOM_ukrainian;
			static SymbolTerm *const ATOM_tea;
			static SymbolTerm *const ATOM_ivory;
			static SymbolTerm *const ATOM_snails;
			static SymbolTerm *const ATOM_winstons;
			static SymbolTerm *const ATOM_yellow;
			static SymbolTerm *const ATOM_kools;
			static SymbolTerm *const ATOM_milk;
			static SymbolTerm *const ATOM_norwegian;
			static SymbolTerm *const ATOM_chesterfields;
			static SymbolTerm *const ATOM_fox;
			static SymbolTerm *const ATOM_horse;
			static SymbolTerm *const ATOM_orange_juice;
			static SymbolTerm *const ATOM_lucky_strikes;
			static SymbolTerm *const ATOM_japanese;
			static SymbolTerm *const ATOM_parliaments;
			static SymbolTerm *const ATOM_blue;
			static SymbolTerm *const ATOM_zebra;
			static SymbolTerm *const ATOM_water;




		static Operation PRED_top_0_static_exec(Prolog *m);
	/** PREDICATE: houses/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/
		// main(houses/1,public)




		static Operation PRED_houses_1_static_exec(Prolog *m);
	/** PREDICATE: right_of/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/
		// main(right_of/3,public)




		static Operation PRED_right_of_3_static_exec(Prolog *m);

	private:
		static Operation right_of_3_top(Prolog *m);

		static Operation right_of_3_sub_1(Prolog *m);

		static Operation right_of_3_1(Prolog *m);

		static Operation right_of_3_2(Prolog *m);
	/** PREDICATE: next_to/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/
		// main(next_to/3,public)




	public:
		static Operation PRED_next_to_3_static_exec(Prolog *m);

	private:
		static Operation next_to_3_top(Prolog *m);

		static Operation next_to_3_sub_1(Prolog *m);

		static Operation next_to_3_sub_2(Prolog *m);

		static Operation next_to_3_1(Prolog *m);

		static Operation next_to_3_2(Prolog *m);

		static Operation next_to_3_3(Prolog *m);
	/** PREDICATE: member/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/
		// main(member/2,public)




	public:
		static Operation PRED_member_2_static_exec(Prolog *m);

	private:
		static Operation member_2_top(Prolog *m);

		static Operation member_2_sub_1(Prolog *m);

		static Operation member_2_1(Prolog *m);

		static Operation member_2_2(Prolog *m);
	/** PREDICATE: print_houses/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/
		// main(print_houses/1,public)




	public:
		static Operation PRED_print_houses_1_static_exec(Prolog *m);

	private:
		static Operation print_houses_1_var(Prolog *m);

		static Operation print_houses_1_var_1(Prolog *m);

		static Operation print_houses_1_1(Prolog *m);

		static Operation print_houses_1_2(Prolog *m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_zebra::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
