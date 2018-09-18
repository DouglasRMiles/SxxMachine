#pragma once

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Operation;
	class Prolog;
	class ListTerm;
	class StructureTerm;
	class IntegerTerm;
	class DoubleTerm;
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
	class FILE_run : public bootpreds
	{
	/** PREDICATE: run/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(run/1,public)
		public:
			static SymbolTerm *const ATOM_current_output;




		static Operation PRED_run_1_static_exec(Prolog *m);
	/** PREDICATE: run/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(run/2,public)
			static SymbolTerm *const ATOM_$007Ep$007Et$007E18$007C$0020$007Et$007Ew$007E25$007C$0020$007Et$007Ew$007E32$007C$007En;
			static SymbolTerm *const ATOM_Program;
			static SymbolTerm *const ATOM_Time;
			static SymbolTerm *const ATOM_GC;
	private:
		static ListTerm *const L_run_2_s6;
		static ListTerm *const L_run_2_s7;
		static ListTerm *const L_run_2_s8;
		public:
			static SymbolTerm *const ATOM_$007E$0060$003Dt$007E32$007C$007En;
			static SymbolTerm *const FUNCTOR_total_3;
	private:
		static StructureTerm *const L_run_2_s13;
		public:
			static SymbolTerm *const FUNCTOR_program_3;
			static SymbolTerm *const FUNCTOR_run_program_4;
			static SymbolTerm *const FUNCTOR_$002F_2;
			static SymbolTerm *const ATOM_$007Et$007Ew$007E18$007C$0020$007Et$007E3f$007E25$007C$0020$007Et$007E3f$007E32$007C$007En;
			static SymbolTerm *const ATOM_average;




		static Operation PRED_run_2_static_exec(Prolog *m);
	/** PREDICATE: compile_programs/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(compile_programs/0,public)
			static SymbolTerm *const FUNCTOR_$002D_1;
			static SymbolTerm *const ATOM_singleton;
	private:
		static StructureTerm *const L_compile_programs_0_s4;
		public:
			static SymbolTerm *const FUNCTOR_program_2;
			static SymbolTerm *const FUNCTOR_load_files_2;
			static SymbolTerm *const FUNCTOR_module_colon_2;
			static SymbolTerm *const FUNCTOR_bench_1;
			static SymbolTerm *const FUNCTOR_silent_1;
	private:
		static StructureTerm *const L_compile_programs_0_s12;
		public:
			static SymbolTerm *const FUNCTOR_if_1;
			static SymbolTerm *const ATOM_changed;
	private:
		static StructureTerm *const L_compile_programs_0_s16;
		static ListTerm *const L_compile_programs_0_s18;
		static ListTerm *const L_compile_programs_0_s19;




	public:
		static Operation PRED_compile_programs_0_static_exec(Prolog *m);
	/** PREDICATE: run_program/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(run_program/4,public)
			static SymbolTerm *const ATOM_$007Ep$007Et$007E18$007C$0020$007Et$007E3f$007E25$007C$0020$007Et$007E3f$007E32$007C$007En;




		static Operation PRED_run_program_4_static_exec(Prolog *m);
	/** PREDICATE: add/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(add/3,public)
			static SymbolTerm *const FUNCTOR_$002B_2;




		static Operation PRED_add_3_static_exec(Prolog *m);
	/** PREDICATE: get_performance_stats/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(get_performance_stats/2,public)
			static SymbolTerm *const ATOM_gctime;
			static SymbolTerm *const ATOM_cputime;




		static Operation PRED_get_performance_stats_2_static_exec(Prolog *m);
	/** PREDICATE: ntimes/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(ntimes/4,public)
			static SymbolTerm *const FUNCTOR_$002D_2;




		static Operation PRED_ntimes_4_static_exec(Prolog *m);
	/** PREDICATE: ntimes/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(ntimes/2,public)




		static Operation PRED_ntimes_2_static_exec(Prolog *m);

	private:
		static Operation ntimes_2_sub_1(Prolog *m);

		static Operation ntimes_2_1(Prolog *m);

		static Operation ntimes_2_2(Prolog *m);
	/** PREDICATE: ntimes_dummy/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(ntimes_dummy/1,public)




	public:
		static Operation PRED_ntimes_dummy_1_static_exec(Prolog *m);

	private:
		static Operation ntimes_dummy_1_sub_1(Prolog *m);

		static Operation ntimes_dummy_1_1(Prolog *m);

		static Operation ntimes_dummy_1_2(Prolog *m);
	/** PREDICATE: not_not_top/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(not_not_top/1,public)




	public:
		static Operation PRED_not_not_top_1_static_exec(Prolog *m);

	private:
		static Operation not_not_top_1_sub_1(Prolog *m);

		static Operation not_not_top_1_1(Prolog *m);

		static Operation not_not_top_1_2(Prolog *m);
	/** PREDICATE: not_top/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(not_top/1,public)
		public:
			static SymbolTerm *const ATOM_top;




		static Operation PRED_not_top_1_static_exec(Prolog *m);

	private:
		static Operation not_top_1_sub_1(Prolog *m);

		static Operation not_top_1_1(Prolog *m);

		static Operation not_top_1_2(Prolog *m);
	/** PREDICATE: not_not_dummy/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(not_not_dummy/0,public)




	public:
		static Operation PRED_not_not_dummy_0_static_exec(Prolog *m);

	private:
		static Operation not_not_dummy_0_sub_1(Prolog *m);

		static Operation not_not_dummy_0_1(Prolog *m);

		static Operation not_not_dummy_0_2(Prolog *m);
	/** PREDICATE: not_dummy/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(not_dummy/0,public)




	public:
		static Operation PRED_not_dummy_0_static_exec(Prolog *m);

	private:
		static Operation not_dummy_0_sub_1(Prolog *m);

		static Operation not_dummy_0_1(Prolog *m);

		static Operation not_dummy_0_2(Prolog *m);
	/** PREDICATE: dummy/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(dummy/0,public)




	public:
		static Operation PRED_dummy_0_static_exec(Prolog *m);
	/** PREDICATE: tune_counts/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(tune_counts/0,public)
			static SymbolTerm *const FUNCTOR_$002C_2;
			static SymbolTerm *const FUNCTOR_tune_count_2;
			static SymbolTerm *const FUNCTOR_format_2;
			static SymbolTerm *const ATOM_$007Eq$002E$007En;




		static Operation PRED_tune_counts_0_static_exec(Prolog *m);
	/** PREDICATE: tune_count/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(tune_count/2,public)
			static IntegerTerm *const int_100;
			static SymbolTerm *const FUNCTOR_$003C$003C_2;
	private:
		static DoubleTerm *const sf4;
		public:
			static SymbolTerm *const FUNCTOR_round_1;
			static SymbolTerm *const FUNCTOR_$002A_2;




		static Operation PRED_tune_count_2_static_exec(Prolog *m);
	/** PREDICATE: program/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(program/3,public)
			static SymbolTerm *const FUNCTOR_max_2;




		static Operation PRED_program_3_static_exec(Prolog *m);
	/** PREDICATE: program/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(program/2,public)
			static SymbolTerm *const ATOM_boyer;
			static SymbolTerm *const ATOM_browse;
			static SymbolTerm *const ATOM_chat_parser;
			static IntegerTerm *const int_46;
			static SymbolTerm *const ATOM_crypt;
			static IntegerTerm *const int_868;
			static SymbolTerm *const ATOM_fast_mu;
			static IntegerTerm *const int_4819;
			static SymbolTerm *const ATOM_flatten;
			static IntegerTerm *const int_8275;
			static SymbolTerm *const ATOM_meta_qsort;
			static IntegerTerm *const int_966;
			static SymbolTerm *const ATOM_mu;
			static IntegerTerm *const int_6827;
			static SymbolTerm *const ATOM_nreverse;
			static IntegerTerm *const int_11378;
			static SymbolTerm *const ATOM_poly_10;
			static IntegerTerm *const int_105;
			static SymbolTerm *const ATOM_prover;
			static IntegerTerm *const int_6400;
			static SymbolTerm *const ATOM_qsort;
			static IntegerTerm *const int_8445;
			static SymbolTerm *const ATOM_queens_8;
			static IntegerTerm *const int_63;
			static SymbolTerm *const ATOM_query;
			static IntegerTerm *const int_1219;
			static SymbolTerm *const ATOM_reducer;
			static IntegerTerm *const int_164;
			static SymbolTerm *const ATOM_sendmore;
			static IntegerTerm *const int_44;
			static SymbolTerm *const ATOM_simple_analyzer;
			static IntegerTerm *const int_320;
			static SymbolTerm *const ATOM_tak;
			static IntegerTerm *const int_35;
			static SymbolTerm *const ATOM_zebra;
			static IntegerTerm *const int_166;




		static Operation PRED_program_2_static_exec(Prolog *m);

	private:
		static Operation program_2_var(Prolog *m);

		static Operation program_2_var_1(Prolog *m);

		static Operation program_2_var_2(Prolog *m);

		static Operation program_2_var_3(Prolog *m);

		static Operation program_2_var_4(Prolog *m);

		static Operation program_2_var_5(Prolog *m);

		static Operation program_2_var_6(Prolog *m);

		static Operation program_2_var_7(Prolog *m);

		static Operation program_2_var_8(Prolog *m);

		static Operation program_2_var_9(Prolog *m);

		static Operation program_2_var_10(Prolog *m);

		static Operation program_2_var_11(Prolog *m);

		static Operation program_2_var_12(Prolog *m);

		static Operation program_2_var_13(Prolog *m);

		static Operation program_2_var_14(Prolog *m);

		static Operation program_2_var_15(Prolog *m);

		static Operation program_2_var_16(Prolog *m);

		static Operation program_2_var_17(Prolog *m);

		static Operation program_2_var_18(Prolog *m);

		static Operation program_2_1(Prolog *m);

		static Operation program_2_2(Prolog *m);

		static Operation program_2_3(Prolog *m);

		static Operation program_2_4(Prolog *m);

		static Operation program_2_5(Prolog *m);

		static Operation program_2_6(Prolog *m);

		static Operation program_2_7(Prolog *m);

		static Operation program_2_8(Prolog *m);

		static Operation program_2_9(Prolog *m);

		static Operation program_2_10(Prolog *m);

		static Operation program_2_11(Prolog *m);

		static Operation program_2_12(Prolog *m);

		static Operation program_2_13(Prolog *m);

		static Operation program_2_14(Prolog *m);

		static Operation program_2_15(Prolog *m);

		static Operation program_2_16(Prolog *m);

		static Operation program_2_17(Prolog *m);

		static Operation program_2_18(Prolog *m);

		static Operation program_2_19(Prolog *m);
	/** PREDICATE: run_interleaved/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(run_interleaved/1,public)
		public:
			static SymbolTerm *const FUNCTOR_seq_interleaved_1;
			static SymbolTerm *const ATOM_user;
			static SymbolTerm *const ATOM_rni;
	private:
		static StructureTerm *const L_run_interleaved_1_s7;
		public:
			static SymbolTerm *const FUNCTOR_$003A$002D_2;




		static Operation PRED_run_interleaved_1_static_exec(Prolog *m);
	/** PREDICATE: seq_interleaved/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(seq_interleaved/3,public)




		static Operation PRED_seq_interleaved_3_static_exec(Prolog *m);

	private:
		static Operation seq_interleaved_3_var(Prolog *m);

		static Operation seq_interleaved_3_var_1(Prolog *m);

		static Operation seq_interleaved_3_1(Prolog *m);

		static Operation seq_interleaved_3_2(Prolog *m);
	/** PREDICATE: seq_interleaved/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(seq_interleaved/4,public)




	public:
		static Operation PRED_seq_interleaved_4_static_exec(Prolog *m);

	private:
		static Operation seq_interleaved_4_top(Prolog *m);

		static Operation seq_interleaved_4_var(Prolog *m);

		static Operation seq_interleaved_4_var_1(Prolog *m);

		static Operation seq_interleaved_4_var_2(Prolog *m);

		static Operation seq_interleaved_4_lis(Prolog *m);

		static Operation seq_interleaved_4_lis_1(Prolog *m);

		static Operation seq_interleaved_4_1(Prolog *m);

		static Operation seq_interleaved_4_2(Prolog *m);

		static Operation seq_interleaved_4_3(Prolog *m);
	/** PREDICATE: seq_clause/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(seq_clause/2,public)
		public:
			static SymbolTerm *const FUNCTOR_$005C$002B_1;




		static Operation PRED_seq_clause_2_static_exec(Prolog *m);

	private:
		static Operation seq_clause_2_top(Prolog *m);

		static Operation seq_clause_2_var(Prolog *m);

		static Operation seq_clause_2_var_1(Prolog *m);

		static Operation seq_clause_2_1(Prolog *m);

		static Operation seq_clause_2_2(Prolog *m);
	/** PREDICATE: run_non_interleaved/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(run_non_interleaved/1,public)
		public:
			static SymbolTerm *const FUNCTOR_seq_non_interleaved_1;




		static Operation PRED_run_non_interleaved_1_static_exec(Prolog *m);
	/** PREDICATE: seq_non_interleaved/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main(seq_non_interleaved/3,public)




		static Operation PRED_seq_non_interleaved_3_static_exec(Prolog *m);

	private:
		static Operation seq_non_interleaved_3_top(Prolog *m);

		static Operation seq_non_interleaved_3_var(Prolog *m);

		static Operation seq_non_interleaved_3_var_1(Prolog *m);

		static Operation seq_non_interleaved_3_var_2(Prolog *m);

		static Operation seq_non_interleaved_3_lis(Prolog *m);

		static Operation seq_non_interleaved_3_lis_1(Prolog *m);

		static Operation seq_non_interleaved_3_1(Prolog *m);

		static Operation seq_non_interleaved_3_2(Prolog *m);

		static Operation seq_non_interleaved_3_3(Prolog *m);
	/** PREDICATE: $init/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
		// main('$init'/0,public)
		static StructureTerm *const L_$init_0_s6;




	public:
		static Operation PRED_$init_0_static_exec(Prolog *m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_run::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
