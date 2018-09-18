#ifndef FILE_READUTIL
#define FILE_READUTIL

#include "../../machine/SxxMachine/TermData.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class IntegerTerm; }
namespace SxxMachine { class ListTerm; }
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }

namespace SxxMachine::library
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_assertz_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.fail_0;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_get_code_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_absolute_file_name_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_compile_predicates_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_load_foreign_library_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_must_be_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_option_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_read_string_5_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_read_term_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_setup_call_cleanup_3_static_exec;

	using IntegerTerm = SxxMachine::IntegerTerm;
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using TermData = SxxMachine::TermData;

	class FILE_readutil : public TermData
	{
		/** PREDICATE: link_foreign/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
	public:
		static SymbolTerm* const  ATOM_readutil;
	private:
		static StructureTerm* const  PRED_link_foreign_0_s4;
	public:
		static SymbolTerm* const  ATOM_read_util;
		static SymbolTerm* const  ATOM_read_line_to_codes;
		static IntegerTerm* const  int_2;
	private:
		static StructureTerm* const  PRED_link_foreign_0_s20;
	public:
		static IntegerTerm* const  int_3;
	private:
		static StructureTerm* const  PRED_link_foreign_0_s23;
	public:
		static SymbolTerm* const  ATOM_read_stream_to_codes;
	private:
		static StructureTerm* const  PRED_link_foreign_0_s26;
		static StructureTerm* const  PRED_link_foreign_0_s28;
		static ListTerm* const  PRED_link_foreign_0_s30;
		static ListTerm* const  PRED_link_foreign_0_s31;
		static ListTerm* const  PRED_link_foreign_0_s32;
		static ListTerm* const  PRED_link_foreign_0_s33;

	public:
		static Operation PRED_link_foreign_0_static_exec(Prolog* m);

	private:
		static Operation link_foreign_0_sub_1(Prolog* m);

		static Operation link_foreign_0_1(Prolog* m);

		static Operation link_foreign_0_2(Prolog* m);

		/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
		static IntegerTerm* const  PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_s1;
	public:
		static SymbolTerm* const  ATOM_end_of_file;

		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_2(Prolog* m);

		/** PREDICATE: pl_read_line_to_codes/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/

	public:
		static Operation PRED_pl_read_line_to_codes_2_static_exec(Prolog* m);

		/** PREDICATE: read_1line_to_codes/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
	private:
		static IntegerTerm* const  PRED_read_1line_to_codes_3_s1;
	public:
		static IntegerTerm* const  int_10;
		static IntegerTerm* const  int_13;

		static Operation PRED_read_1line_to_codes_3_static_exec(Prolog* m);

	private:
		static Operation read_1line_to_codes_3_var(Prolog* m);

		static Operation read_1line_to_codes_3_var_1(Prolog* m);

		static Operation read_1line_to_codes_3_var_2(Prolog* m);

		static Operation read_1line_to_codes_3_var_3(Prolog* m);

		static Operation read_1line_to_codes_3_1(Prolog* m);

		static Operation read_1line_to_codes_3_2(Prolog* m);

		static Operation read_1line_to_codes_3_3(Prolog* m);

		static Operation read_1line_to_codes_3_4(Prolog* m);

		/** PREDICATE: pl_read_line_to_codes/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/

	public:
		static Operation PRED_pl_read_line_to_codes_3_static_exec(Prolog* m);

		/** PREDICATE: read_line_to_codes/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
	private:
		static IntegerTerm* const  PRED_read_line_to_codes_4_s1;

	public:
		static Operation PRED_read_line_to_codes_4_static_exec(Prolog* m);

	private:
		static Operation read_line_to_codes_4_var(Prolog* m);

		static Operation read_line_to_codes_4_var_1(Prolog* m);

		static Operation read_line_to_codes_4_var_2(Prolog* m);

		static Operation read_line_to_codes_4_1(Prolog* m);

		static Operation read_line_to_codes_4_2(Prolog* m);

		static Operation read_line_to_codes_4_3(Prolog* m);

		/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
		static IntegerTerm* const  PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_s1;

	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_sub_2(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_2(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_3(Prolog* m);

		/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
		static SymbolTerm* const  PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_s1;

	public:
		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_2(Prolog* m);

		/** PREDICATE: read_line_to_string/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
		static SymbolTerm* const  PRED_read_line_to_string_2_s1;
	public:
		static SymbolTerm* const  ATOM_$000D;

		static Operation PRED_read_line_to_string_2_static_exec(Prolog* m);

		/** PREDICATE: pl_read_stream_to_codes/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
	private:
		static SymbolTerm* const  PRED_pl_read_stream_to_codes_2_s1;

	public:
		static Operation PRED_pl_read_stream_to_codes_2_static_exec(Prolog* m);

		/** PREDICATE: pl_read_stream_to_codes/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/

		static Operation PRED_pl_read_stream_to_codes_3_static_exec(Prolog* m);

		/** PREDICATE: read_stream_to_codes/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
	private:
		static IntegerTerm* const  PRED_read_stream_to_codes_4_s1;

	public:
		static Operation PRED_read_stream_to_codes_4_static_exec(Prolog* m);

	private:
		static Operation read_stream_to_codes_4_var(Prolog* m);

		static Operation read_stream_to_codes_4_var_1(Prolog* m);

		static Operation read_stream_to_codes_4_1(Prolog* m);

		static Operation read_stream_to_codes_4_2(Prolog* m);

		/** PREDICATE: read_stream_to_terms/4
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/

	public:
		static Operation PRED_read_stream_to_terms_4_static_exec(Prolog* m);

		/** PREDICATE: read_stream_to_terms/5
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
	private:
		static SymbolTerm* const  PRED_read_stream_to_terms_5_s1;

		// private final Term arg5;

	public:
		static Operation PRED_read_stream_to_terms_5_static_exec(Prolog* m);

	private:
		static Operation read_stream_to_terms_5_var(Prolog* m);

		static Operation read_stream_to_terms_5_var_1(Prolog* m);

		static Operation read_stream_to_terms_5_1(Prolog* m);

		static Operation read_stream_to_terms_5_2(Prolog* m);

		/** PREDICATE: read_file_to_codes/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
		static SymbolTerm* const  PRED_read_file_to_codes_3_s1;
	public:
		static SymbolTerm* const  ATOM_read;
	private:
		static StructureTerm* const  PRED_read_file_to_codes_3_s7;

	public:
		static Operation PRED_read_file_to_codes_3_static_exec(Prolog* m);

		/** PREDICATE: read_file_to_string/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
	private:
		static SymbolTerm* const  PRED_read_file_to_string_3_s1;
		static StructureTerm* const  PRED_read_file_to_string_3_s5;

	public:
		static Operation PRED_read_file_to_string_3_static_exec(Prolog* m);

		/** PREDICATE: read_file_to_terms/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
		*/
	private:
		static SymbolTerm* const  PRED_read_file_to_terms_3_s1;
		static StructureTerm* const  PRED_read_file_to_terms_3_s7;

	public:
		static Operation PRED_read_file_to_terms_3_static_exec(Prolog* m);

		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static FILE_readutil::StaticConstructor staticConstructor;


	public:
		static void loadPreds();
	};

}


#endif	//#ifndef FILE_READUTIL
