#pragma once

#include "../../machine/SxxMachine/TermData.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Operation;
	class Prolog;
	class StructureTerm;
	class IntegerTerm;
}

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_hash_map_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_illarg_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_java_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.fail_0;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$builtin_member_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$get_stream_manager_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_close_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_current_input_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_current_output_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_flush_output_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_get_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_get_byte_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_get_char_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_get_code_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_hash_get_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_open_4_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_peek_byte_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_peek_char_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_peek_code_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_put_byte_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_put_char_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_put_code_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_skip_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_tab_2_static_exec;

	class FILE_io : public TermData
	{
		/** PREDICATE: open/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/
	private:
		static SymbolTerm *const PRED_open_3_s1;

	public:
		static Operation PRED_open_3_static_exec(Prolog *m);

		/** PREDICATE: close/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/
	private:
		static SymbolTerm *const PRED_close_1_s1;

	public:
		static Operation PRED_close_1_static_exec(Prolog *m);

		/** PREDICATE: flush_output/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_flush_output_0_static_exec(Prolog *m);

		/** PREDICATE: stream_property/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/
		static SymbolTerm *const ATOM_term;
		static SymbolTerm *const ATOM_stream_property;
	private:
		static StructureTerm *const PRED_stream_property_2_s5;
	public:
		static IntegerTerm *const int_2;

		static Operation PRED_stream_property_2_static_exec(Prolog *m);

	private:
		static Operation stream_property_2_sub_1(Prolog *m);

		static Operation stream_property_2_sub_2(Prolog *m);

		static Operation stream_property_2_1(Prolog *m);

		static Operation stream_property_2_2(Prolog *m);

		static Operation stream_property_2_3(Prolog *m);

		/** PREDICATE: $stream_property/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/
	public:
		static SymbolTerm *const ATOM_stream;
	private:
		static StructureTerm *const PRED_$stream_property_2_s5;
	public:
		static IntegerTerm *const int_1;

		static Operation PRED_$stream_property_2_static_exec(Prolog *m);

	private:
		static Operation $stream_property_2_sub_1(Prolog *m);

		static Operation $stream_property_2_sub_2(Prolog *m);

		static Operation $stream_property_2_1(Prolog *m);

		static Operation $stream_property_2_2(Prolog *m);

		static Operation $stream_property_2_3(Prolog *m);

		/** PREDICATE: $stream_property_specifier/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/
		static SymbolTerm *const PRED_$stream_property_specifier_1_s1;
	public:
		static SymbolTerm *const ATOM_output;

		static Operation PRED_$stream_property_specifier_1_static_exec(Prolog *m);

	private:
		static Operation $stream_property_specifier_1_var(Prolog *m);

		static Operation $stream_property_specifier_1_var_1(Prolog *m);

		static Operation $stream_property_specifier_1_var_2(Prolog *m);

		static Operation $stream_property_specifier_1_var_3(Prolog *m);

		static Operation $stream_property_specifier_1_var_4(Prolog *m);

		static Operation $stream_property_specifier_1_var_5(Prolog *m);

		static Operation $stream_property_specifier_1_con(Prolog *m);

		static Operation $stream_property_specifier_1_con_1(Prolog *m);

		static Operation $stream_property_specifier_1_str(Prolog *m);

		static Operation $stream_property_specifier_1_str_1(Prolog *m);

		static Operation $stream_property_specifier_1_str_2(Prolog *m);

		static Operation $stream_property_specifier_1_str_3(Prolog *m);

		static Operation $stream_property_specifier_1_1(Prolog *m);

		static Operation $stream_property_specifier_1_2(Prolog *m);

		static Operation $stream_property_specifier_1_3(Prolog *m);

		static Operation $stream_property_specifier_1_4(Prolog *m);

		static Operation $stream_property_specifier_1_5(Prolog *m);

		static Operation $stream_property_specifier_1_6(Prolog *m);

		/** PREDICATE: get_char/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

	public:
		static Operation PRED_get_char_1_static_exec(Prolog *m);

		/** PREDICATE: get_code/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_get_code_1_static_exec(Prolog *m);

		/** PREDICATE: peek_char/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_peek_char_1_static_exec(Prolog *m);

		/** PREDICATE: peek_code/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_peek_code_1_static_exec(Prolog *m);

		/** PREDICATE: put_char/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_put_char_1_static_exec(Prolog *m);

		/** PREDICATE: put_code/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_put_code_1_static_exec(Prolog *m);

		/** PREDICATE: nl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/
	private:
		static SymbolTerm *const PRED_nl_1_s1;

	public:
		static Operation PRED_nl_1_static_exec(Prolog *m);

		/** PREDICATE: get0/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_get0_1_static_exec(Prolog *m);

		/** PREDICATE: get0/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_get0_2_static_exec(Prolog *m);

		/** PREDICATE: get/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_get_1_static_exec(Prolog *m);

		/** PREDICATE: put/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_put_1_static_exec(Prolog *m);

		/** PREDICATE: put/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_put_2_static_exec(Prolog *m);

		/** PREDICATE: tab/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_tab_1_static_exec(Prolog *m);

		/** PREDICATE: skip/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_skip_1_static_exec(Prolog *m);

		/** PREDICATE: get_byte/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_get_byte_1_static_exec(Prolog *m);

		/** PREDICATE: peek_byte/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_peek_byte_1_static_exec(Prolog *m);

		/** PREDICATE: put_byte/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/io.pl
		*/

		static Operation PRED_put_byte_1_static_exec(Prolog *m);

		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static FILE_io::StaticConstructor staticConstructor;


	public:
		static void loadPreds();
	};

}
