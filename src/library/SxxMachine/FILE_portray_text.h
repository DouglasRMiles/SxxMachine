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
	class StructureTerm;
}

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$greater_or_equal_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_$new_indexing_hash_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_assert_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_assertz_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_call_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_retractall_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_io.PRED_put_char_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_io.PRED_put_code_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.fail_0;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.PRED_between_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_$skip_list_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_format_1_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_format_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_must_be_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_succ_2_static_exec;

	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using TermData = SxxMachine::TermData;

	class FILE_portray_text : public TermData
	{
		/** PREDICATE: portray_text/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/
	private:
		static SymbolTerm *const PRED_portray_text_1_s1;
	public:
		static SymbolTerm *const ATOM_portray_text;

		static Operation PRED_portray_text_1_static_exec(Prolog *m);

		/** PREDICATE: set_portray_text/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/
	private:
		static SymbolTerm *const PRED_set_portray_text_2_s1;
	public:
		static SymbolTerm *const ATOM_nonneg;
		static SymbolTerm *const ATOM_ellipsis;

		static Operation PRED_set_portray_text_2_static_exec(Prolog *m);

	private:
		static Operation set_portray_text_2_var(Prolog *m);

		static Operation set_portray_text_2_var_1(Prolog *m);

		static Operation set_portray_text_2_1(Prolog *m);

		static Operation set_portray_text_2_2(Prolog *m);

		/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl/6
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/
	public:
		static IntegerTerm *const int_5;
		static SymbolTerm *const ATOM_$002E$002E$002E;

		// private final Term arg5, arg6;

		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_static_exec(Prolog *m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_sub_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_2(Prolog *m);

		/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/
		static SymbolTerm *const PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_s1;

	public:
		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_static_exec(Prolog *m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_sub_1(Prolog *m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_1(Prolog *m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_2(Prolog *m);

		/** PREDICATE: (:)/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/
		static SymbolTerm *const PRED_$003A_2_s1;
		static StructureTerm *const PRED_$003A_2_s8;
		static StructureTerm *const PRED_$003A_2_s10;
	public:
		static SymbolTerm *const ATOM_min_length;
		static SymbolTerm *const ATOM_$0022;

		static Operation PRED_$003A_2_static_exec(Prolog *m);

		/** PREDICATE: put_n_codes/2
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/
	private:
		static IntegerTerm *const PRED_put_n_codes_2_s1;
	public:
		static IntegerTerm *const int_1;

		static Operation PRED_put_n_codes_2_static_exec(Prolog *m);

	private:
		static Operation put_n_codes_2_sub_1(Prolog *m);

		static Operation put_n_codes_2_1(Prolog *m);

		static Operation put_n_codes_2_2(Prolog *m);

		/** PREDICATE: skip_first/3
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/

	public:
		static Operation PRED_skip_first_3_static_exec(Prolog *m);

	private:
		static Operation skip_first_3_sub_1(Prolog *m);

		static Operation skip_first_3_1(Prolog *m);

		static Operation skip_first_3_2(Prolog *m);

		/** PREDICATE: put_var_codes/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/
		static SymbolTerm *const PRED_put_var_codes_1_s1;

	public:
		static Operation PRED_put_var_codes_1_static_exec(Prolog *m);

	private:
		static Operation put_var_codes_1_var(Prolog *m);

		static Operation put_var_codes_1_var_1(Prolog *m);

		static Operation put_var_codes_1_var_2(Prolog *m);

		static Operation put_var_codes_1_con(Prolog *m);

		static Operation put_var_codes_1_con_1(Prolog *m);

		static Operation put_var_codes_1_lis(Prolog *m);

		static Operation put_var_codes_1_lis_1(Prolog *m);

		static Operation put_var_codes_1_1(Prolog *m);

		static Operation put_var_codes_1_2(Prolog *m);

		static Operation put_var_codes_1_3(Prolog *m);

		/** PREDICATE: emit_code/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/
		static IntegerTerm *const PRED_emit_code_1_s1;
	public:
		static SymbolTerm *const ATOM_$005Cb;
		static IntegerTerm *const int_13;
		static SymbolTerm *const ATOM_$005Cr;
		static IntegerTerm *const int_10;
		static SymbolTerm *const ATOM_$005Cn;
		static IntegerTerm *const int_9;
		static SymbolTerm *const ATOM_$005Ct;

		static Operation PRED_emit_code_1_static_exec(Prolog *m);

	private:
		static Operation emit_code_1_var(Prolog *m);

		static Operation emit_code_1_var_1(Prolog *m);

		static Operation emit_code_1_var_2(Prolog *m);

		static Operation emit_code_1_var_3(Prolog *m);

		static Operation emit_code_1_var_4(Prolog *m);

		static Operation emit_code_1_1(Prolog *m);

		static Operation emit_code_1_2(Prolog *m);

		static Operation emit_code_1_3(Prolog *m);

		static Operation emit_code_1_4(Prolog *m);

		static Operation emit_code_1_5(Prolog *m);

		/** PREDICATE: all_ascii/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/
		static SymbolTerm *const PRED_all_ascii_1_s1;

	public:
		static Operation PRED_all_ascii_1_static_exec(Prolog *m);

	private:
		static Operation all_ascii_1_var(Prolog *m);

		static Operation all_ascii_1_var_1(Prolog *m);

		static Operation all_ascii_1_var_2(Prolog *m);

		static Operation all_ascii_1_con(Prolog *m);

		static Operation all_ascii_1_con_1(Prolog *m);

		static Operation all_ascii_1_lis(Prolog *m);

		static Operation all_ascii_1_lis_1(Prolog *m);

		static Operation all_ascii_1_1(Prolog *m);

		static Operation all_ascii_1_2(Prolog *m);

		static Operation all_ascii_1_3(Prolog *m);

		/** PREDICATE: isascii/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/

	public:
		static Operation PRED_isascii_1_static_exec(Prolog *m);

		/** PREDICATE: ascii_code/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/
	private:
		static IntegerTerm *const PRED_ascii_code_1_s1;
	public:
		static IntegerTerm *const int_32;
		static IntegerTerm *const int_126;

		static Operation PRED_ascii_code_1_static_exec(Prolog *m);

	private:
		static Operation ascii_code_1_var(Prolog *m);

		static Operation ascii_code_1_var_1(Prolog *m);

		static Operation ascii_code_1_var_2(Prolog *m);

		static Operation ascii_code_1_var_3(Prolog *m);

		static Operation ascii_code_1_1(Prolog *m);

		static Operation ascii_code_1_2(Prolog *m);

		static Operation ascii_code_1_3(Prolog *m);

		static Operation ascii_code_1_4(Prolog *m);

		/** PREDICATE: var_or_numbered/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/

	public:
		static Operation PRED_var_or_numbered_1_static_exec(Prolog *m);

	private:
		static Operation var_or_numbered_1_var(Prolog *m);

		static Operation var_or_numbered_1_var_1(Prolog *m);

		static Operation var_or_numbered_1_1(Prolog *m);

		static Operation var_or_numbered_1_2(Prolog *m);

		/** PREDICATE: $init/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl
		*/
		static StructureTerm *const PRED_$init_0_s7;
		static StructureTerm *const PRED_$init_0_s9;
		static StructureTerm *const PRED_$init_0_s11;
	public:
		static IntegerTerm *const int_3;
	private:
		static StructureTerm *const PRED_$init_0_s16;
		static StructureTerm *const PRED_$init_0_s18;
		static StructureTerm *const PRED_$init_0_s20;
	public:
		static IntegerTerm *const int_30;
	private:
		static StructureTerm *const PRED_$init_0_s24;
		static StructureTerm *const PRED_$init_0_s26;
		static StructureTerm *const PRED_$init_0_s28;
	public:
		static SymbolTerm *const ATOM_portray;
	private:
		static StructureTerm *const PRED_$init_0_s33;

	public:
		static Operation PRED_$init_0_static_exec(Prolog *m);

		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static FILE_portray_text::StaticConstructor staticConstructor;


	public:
		static void loadPreds();
	};

}
