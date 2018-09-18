#pragma once

#include "../../machine/SxxMachine/TermData.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Operation;
	class Prolog;
	class IntegerTerm;
}

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.fail_0;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_atom_codes_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_atom_concat_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_reverse_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_$atom_completions_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_code_type_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_expand_file_name_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_phrase_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_string_codes_2_static_exec;

	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using TermData = SxxMachine::TermData;

	class FILE_console_input : public TermData
	{
		/** PREDICATE: (:)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
		*/
	private:
		static SymbolTerm *const PRED_$003A_2_s1;

	public:
		static Operation PRED_$003A_2_static_exec(Prolog *m);

		/** PREDICATE: complete/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
		*/
		static SymbolTerm *const ATOM_$002A;

		static Operation PRED_complete_3_static_exec(Prolog *m);

	private:
		static Operation complete_3_sub_1(Prolog *m);

		static Operation complete_3_1(Prolog *m);

		static Operation complete_3_2(Prolog *m);

		/** PREDICATE: atom_prefix/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
		*/

	public:
		static Operation PRED_atom_prefix_3_static_exec(Prolog *m);

		/** PREDICATE: atom_chars/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
		*/
	private:
		static SymbolTerm *const PRED_atom_chars_3_s1;

	public:
		static Operation PRED_atom_chars_3_static_exec(Prolog *m);

	private:
		static Operation atom_chars_3_var(Prolog *m);

		static Operation atom_chars_3_var_1(Prolog *m);

		static Operation atom_chars_3_1(Prolog *m);

		static Operation atom_chars_3_2(Prolog *m);

		/** PREDICATE: atom_char/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
		*/

	public:
		static Operation PRED_atom_char_3_static_exec(Prolog *m);

		/** PREDICATE: atom_char/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
		*/
	private:
		static SymbolTerm *const PRED_atom_char_1_s1;

	public:
		static Operation PRED_atom_char_1_static_exec(Prolog *m);

		/** PREDICATE: file_prefix/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
		*/
	private:
		static IntegerTerm *const PRED_file_prefix_3_s1;

	public:
		static Operation PRED_file_prefix_3_static_exec(Prolog *m);

		/** PREDICATE: file_chars/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
		*/
	private:
		static SymbolTerm *const PRED_file_chars_3_s1;

	public:
		static Operation PRED_file_chars_3_static_exec(Prolog *m);

	private:
		static Operation file_chars_3_var(Prolog *m);

		static Operation file_chars_3_var_1(Prolog *m);

		static Operation file_chars_3_1(Prolog *m);

		static Operation file_chars_3_2(Prolog *m);

		/** PREDICATE: file_char/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
		*/

	public:
		static Operation PRED_file_char_3_static_exec(Prolog *m);

		/** PREDICATE: file_char/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/console_input.pl
		*/
	private:
		static SymbolTerm *const PRED_file_char_1_s1;
	public:
		static IntegerTerm *const int_47;
		static IntegerTerm *const int_46;
		static IntegerTerm *const int_45;
		static IntegerTerm *const int_126;

		static Operation PRED_file_char_1_static_exec(Prolog *m);

	private:
		static Operation file_char_1_var(Prolog *m);

		static Operation file_char_1_var_1(Prolog *m);

		static Operation file_char_1_var_2(Prolog *m);

		static Operation file_char_1_var_3(Prolog *m);

		static Operation file_char_1_var_4(Prolog *m);

		static Operation file_char_1_1(Prolog *m);

		static Operation file_char_1_2(Prolog *m);

		static Operation file_char_1_3(Prolog *m);

		static Operation file_char_1_4(Prolog *m);

		static Operation file_char_1_5(Prolog *m);

		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static FILE_console_input::StaticConstructor staticConstructor;


	public:
		static void loadPreds();
	};

}
