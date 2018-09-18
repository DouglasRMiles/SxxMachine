#ifndef FILE_CHAT_PARSER
#define FILE_CHAT_PARSER

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class ListTerm; }
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
	class FILE_chat_parser : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog* m);
	/** PREDICATE: go/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(go/0,public)
			static SymbolTerm* const  ATOM_runtime;
			static SymbolTerm* const  ATOM_execution$0020time$0020is$0020;
			static SymbolTerm* const  ATOM_milliseconds;




		static Operation PRED_go_0_static_exec(Prolog* m);
	/** PREDICATE: chat_parser/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(chat_parser/0,public)




		static Operation PRED_chat_parser_0_static_exec(Prolog* m);

	private:
		static Operation chat_parser_0_sub_1(Prolog* m);

		static Operation chat_parser_0_1(Prolog* m);

		static Operation chat_parser_0_2(Prolog* m);
	/** PREDICATE: my_string/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(my_string/1,public)
		public:
			static SymbolTerm* const  ATOM_what;
			static SymbolTerm* const  ATOM_rivers;
			static SymbolTerm* const  ATOM_are;
			static SymbolTerm* const  ATOM_there;
			static SymbolTerm* const  ATOM_$003F;
	private:
		static ListTerm* const  L_my_string_1_s7;
		static ListTerm* const  L_my_string_1_s8;
		static ListTerm* const  L_my_string_1_s9;
		static ListTerm* const  L_my_string_1_s10;
		static ListTerm* const  L_my_string_1_s11;
		public:
			static SymbolTerm* const  ATOM_does;
			static SymbolTerm* const  ATOM_afghanistan;
			static SymbolTerm* const  ATOM_border;
			static SymbolTerm* const  ATOM_china;
	private:
		static ListTerm* const  L_my_string_1_s16;
		static ListTerm* const  L_my_string_1_s17;
		static ListTerm* const  L_my_string_1_s18;
		static ListTerm* const  L_my_string_1_s19;
		public:
			static SymbolTerm* const  ATOM_is;
			static SymbolTerm* const  ATOM_the;
			static SymbolTerm* const  ATOM_capital;
			static SymbolTerm* const  ATOM_of;
			static SymbolTerm* const  ATOM_upper_volta;
	private:
		static ListTerm* const  L_my_string_1_s25;
		static ListTerm* const  L_my_string_1_s26;
		static ListTerm* const  L_my_string_1_s27;
		static ListTerm* const  L_my_string_1_s28;
		static ListTerm* const  L_my_string_1_s29;
		static ListTerm* const  L_my_string_1_s30;
		public:
			static SymbolTerm* const  ATOM_where;
			static SymbolTerm* const  ATOM_largest;
			static SymbolTerm* const  ATOM_country;
	private:
		static ListTerm* const  L_my_string_1_s34;
		static ListTerm* const  L_my_string_1_s35;
		static ListTerm* const  L_my_string_1_s36;
		static ListTerm* const  L_my_string_1_s37;
		static ListTerm* const  L_my_string_1_s38;
		public:
			static SymbolTerm* const  ATOM_which;
			static SymbolTerm* const  ATOM_$007E;
			static SymbolTerm* const  ATOM_s;
			static SymbolTerm* const  ATOM_london;
	private:
		static ListTerm* const  L_my_string_1_s43;
		static ListTerm* const  L_my_string_1_s44;
		static ListTerm* const  L_my_string_1_s45;
		static ListTerm* const  L_my_string_1_s46;
		static ListTerm* const  L_my_string_1_s47;
		static ListTerm* const  L_my_string_1_s48;
		static ListTerm* const  L_my_string_1_s49;
		public:
			static SymbolTerm* const  ATOM_countries;
			static SymbolTerm* const  ATOM_european;
	private:
		static ListTerm* const  L_my_string_1_s52;
		static ListTerm* const  L_my_string_1_s53;
		static ListTerm* const  L_my_string_1_s54;
		static ListTerm* const  L_my_string_1_s55;
		public:
			static SymbolTerm* const  ATOM_how;
			static SymbolTerm* const  ATOM_large;
			static SymbolTerm* const  ATOM_smallest;
			static SymbolTerm* const  ATOM_american;
	private:
		static ListTerm* const  L_my_string_1_s60;
		static ListTerm* const  L_my_string_1_s61;
		static ListTerm* const  L_my_string_1_s62;
		static ListTerm* const  L_my_string_1_s63;
		static ListTerm* const  L_my_string_1_s64;
		static ListTerm* const  L_my_string_1_s65;
		public:
			static SymbolTerm* const  ATOM_ocean;
			static SymbolTerm* const  ATOM_that;
			static SymbolTerm* const  ATOM_borders;
			static SymbolTerm* const  ATOM_african;
			static SymbolTerm* const  ATOM_and;
			static SymbolTerm* const  ATOM_asian;
	private:
		static ListTerm* const  L_my_string_1_s72;
		static ListTerm* const  L_my_string_1_s73;
		static ListTerm* const  L_my_string_1_s74;
		static ListTerm* const  L_my_string_1_s75;
		static ListTerm* const  L_my_string_1_s76;
		static ListTerm* const  L_my_string_1_s77;
		static ListTerm* const  L_my_string_1_s78;
		static ListTerm* const  L_my_string_1_s79;
		static ListTerm* const  L_my_string_1_s80;
		static ListTerm* const  L_my_string_1_s81;
		static ListTerm* const  L_my_string_1_s82;
		static ListTerm* const  L_my_string_1_s83;
		static ListTerm* const  L_my_string_1_s84;
		public:
			static SymbolTerm* const  ATOM_capitals;
			static SymbolTerm* const  ATOM_bordering;
			static SymbolTerm* const  ATOM_baltic;
	private:
		static ListTerm* const  L_my_string_1_s88;
		static ListTerm* const  L_my_string_1_s89;
		static ListTerm* const  L_my_string_1_s90;
		static ListTerm* const  L_my_string_1_s91;
		static ListTerm* const  L_my_string_1_s92;
		static ListTerm* const  L_my_string_1_s93;
		static ListTerm* const  L_my_string_1_s94;
		static ListTerm* const  L_my_string_1_s95;
		static ListTerm* const  L_my_string_1_s96;
		static ListTerm* const  L_my_string_1_s97;
		public:
			static SymbolTerm* const  ATOM_bordered;
			static SymbolTerm* const  ATOM_by;
			static SymbolTerm* const  ATOM_two;
			static SymbolTerm* const  ATOM_seas;
	private:
		static ListTerm* const  L_my_string_1_s102;
		static ListTerm* const  L_my_string_1_s103;
		static ListTerm* const  L_my_string_1_s104;
		static ListTerm* const  L_my_string_1_s105;
		static ListTerm* const  L_my_string_1_s106;
		static ListTerm* const  L_my_string_1_s107;
		static ListTerm* const  L_my_string_1_s108;
		public:
			static SymbolTerm* const  ATOM_many;
			static SymbolTerm* const  ATOM_danube;
			static SymbolTerm* const  ATOM_flow;
			static SymbolTerm* const  ATOM_through;
	private:
		static ListTerm* const  L_my_string_1_s113;
		static ListTerm* const  L_my_string_1_s114;
		static ListTerm* const  L_my_string_1_s115;
		static ListTerm* const  L_my_string_1_s116;
		static ListTerm* const  L_my_string_1_s117;
		static ListTerm* const  L_my_string_1_s118;
		static ListTerm* const  L_my_string_1_s119;
		static ListTerm* const  L_my_string_1_s120;
		public:
			static SymbolTerm* const  ATOM_total;
			static SymbolTerm* const  ATOM_area;
			static SymbolTerm* const  ATOM_south;
			static SymbolTerm* const  ATOM_equator;
			static SymbolTerm* const  ATOM_not;
			static SymbolTerm* const  ATOM_in;
			static SymbolTerm* const  ATOM_australasia;
	private:
		static ListTerm* const  L_my_string_1_s128;
		static ListTerm* const  L_my_string_1_s129;
		static ListTerm* const  L_my_string_1_s130;
		static ListTerm* const  L_my_string_1_s131;
		static ListTerm* const  L_my_string_1_s132;
		static ListTerm* const  L_my_string_1_s133;
		static ListTerm* const  L_my_string_1_s134;
		static ListTerm* const  L_my_string_1_s135;
		static ListTerm* const  L_my_string_1_s136;
		static ListTerm* const  L_my_string_1_s137;
		static ListTerm* const  L_my_string_1_s138;
		static ListTerm* const  L_my_string_1_s139;
		static ListTerm* const  L_my_string_1_s140;
		static ListTerm* const  L_my_string_1_s141;
		static ListTerm* const  L_my_string_1_s142;
		public:
			static SymbolTerm* const  ATOM_average;
			static SymbolTerm* const  ATOM_each;
			static SymbolTerm* const  ATOM_continent;
	private:
		static ListTerm* const  L_my_string_1_s146;
		static ListTerm* const  L_my_string_1_s147;
		static ListTerm* const  L_my_string_1_s148;
		static ListTerm* const  L_my_string_1_s149;
		static ListTerm* const  L_my_string_1_s150;
		static ListTerm* const  L_my_string_1_s151;
		static ListTerm* const  L_my_string_1_s152;
		static ListTerm* const  L_my_string_1_s153;
		static ListTerm* const  L_my_string_1_s154;
		static ListTerm* const  L_my_string_1_s155;
		static ListTerm* const  L_my_string_1_s156;
		public:
			static SymbolTerm* const  ATOM_more;
			static SymbolTerm* const  ATOM_than;
			static SymbolTerm* const  ATOM_one;
	private:
		static ListTerm* const  L_my_string_1_s160;
		static ListTerm* const  L_my_string_1_s161;
		static ListTerm* const  L_my_string_1_s162;
		static ListTerm* const  L_my_string_1_s163;
		static ListTerm* const  L_my_string_1_s164;
		static ListTerm* const  L_my_string_1_s165;
		public:
			static SymbolTerm* const  ATOM_some;
			static SymbolTerm* const  ATOM_any;
	private:
		static ListTerm* const  L_my_string_1_s168;
		static ListTerm* const  L_my_string_1_s169;
		static ListTerm* const  L_my_string_1_s170;
		static ListTerm* const  L_my_string_1_s171;
		static ListTerm* const  L_my_string_1_s172;
		static ListTerm* const  L_my_string_1_s173;
		static ListTerm* const  L_my_string_1_s174;
		static ListTerm* const  L_my_string_1_s175;
		static ListTerm* const  L_my_string_1_s176;
		public:
			static SymbolTerm* const  ATOM_from;
			static SymbolTerm* const  ATOM_a;
			static SymbolTerm* const  ATOM_river;
			static SymbolTerm* const  ATOM_flows;
			static SymbolTerm* const  ATOM_into;
			static SymbolTerm* const  ATOM_black_sea;
	private:
		static ListTerm* const  L_my_string_1_s183;
		static ListTerm* const  L_my_string_1_s184;
		static ListTerm* const  L_my_string_1_s185;
		static ListTerm* const  L_my_string_1_s186;
		static ListTerm* const  L_my_string_1_s187;
		static ListTerm* const  L_my_string_1_s188;
		static ListTerm* const  L_my_string_1_s189;
		static ListTerm* const  L_my_string_1_s190;
		static ListTerm* const  L_my_string_1_s191;
		static ListTerm* const  L_my_string_1_s192;
		static ListTerm* const  L_my_string_1_s193;
		static ListTerm* const  L_my_string_1_s194;




	public:
		static Operation PRED_my_string_1_static_exec(Prolog* m);

	private:
		static Operation my_string_1_var(Prolog* m);

		static Operation my_string_1_var_1(Prolog* m);

		static Operation my_string_1_var_2(Prolog* m);

		static Operation my_string_1_var_3(Prolog* m);

		static Operation my_string_1_var_4(Prolog* m);

		static Operation my_string_1_var_5(Prolog* m);

		static Operation my_string_1_var_6(Prolog* m);

		static Operation my_string_1_var_7(Prolog* m);

		static Operation my_string_1_var_8(Prolog* m);

		static Operation my_string_1_var_9(Prolog* m);

		static Operation my_string_1_var_10(Prolog* m);

		static Operation my_string_1_var_11(Prolog* m);

		static Operation my_string_1_var_12(Prolog* m);

		static Operation my_string_1_var_13(Prolog* m);

		static Operation my_string_1_var_14(Prolog* m);

		static Operation my_string_1_var_15(Prolog* m);

		static Operation my_string_1_1(Prolog* m);

		static Operation my_string_1_2(Prolog* m);

		static Operation my_string_1_3(Prolog* m);

		static Operation my_string_1_4(Prolog* m);

		static Operation my_string_1_5(Prolog* m);

		static Operation my_string_1_6(Prolog* m);

		static Operation my_string_1_7(Prolog* m);

		static Operation my_string_1_8(Prolog* m);

		static Operation my_string_1_9(Prolog* m);

		static Operation my_string_1_10(Prolog* m);

		static Operation my_string_1_11(Prolog* m);

		static Operation my_string_1_12(Prolog* m);

		static Operation my_string_1_13(Prolog* m);

		static Operation my_string_1_14(Prolog* m);

		static Operation my_string_1_15(Prolog* m);

		static Operation my_string_1_16(Prolog* m);
	/** PREDICATE: determinate_say/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(determinate_say/2,public)




	public:
		static Operation PRED_determinate_say_2_static_exec(Prolog* m);
	/** PREDICATE: terminal/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(terminal/5,public)
			static SymbolTerm* const  FUNCTOR_x_4;
			static SymbolTerm* const  ATOM_terminal;

		// private final Term arg5;




		static Operation PRED_terminal_5_static_exec(Prolog* m);

	private:
		static Operation terminal_5_sub_1(Prolog* m);

		static Operation terminal_5_1(Prolog* m);

		static Operation terminal_5_2(Prolog* m);
	/** PREDICATE: gap/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(gap/1,public)
		public:
			static SymbolTerm* const  ATOM_gap;




		static Operation PRED_gap_1_static_exec(Prolog* m);

	private:
		static Operation gap_1_var(Prolog* m);

		static Operation gap_1_var_1(Prolog* m);

		static Operation gap_1_1(Prolog* m);

		static Operation gap_1_2(Prolog* m);
	/** PREDICATE: virtual/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(virtual/3,public)
		public:
			static SymbolTerm* const  ATOM_nonterminal;




		static Operation PRED_virtual_3_static_exec(Prolog* m);
	/** PREDICATE: is_pp/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(is_pp/1,public)
			static SymbolTerm* const  FUNCTOR_$0023_4;




		static Operation PRED_is_pp_1_static_exec(Prolog* m);
	/** PREDICATE: is_pred/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(is_pred/1,public)




		static Operation PRED_is_pred_1_static_exec(Prolog* m);
	/** PREDICATE: is_trace/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(is_trace/1,public)




		static Operation PRED_is_trace_1_static_exec(Prolog* m);
	/** PREDICATE: is_adv/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(is_adv/1,public)




		static Operation PRED_is_adv_1_static_exec(Prolog* m);
	/** PREDICATE: trace1/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(trace1/2,public)
	private:
		static StructureTerm* const  L_trace1_2_s5;




	public:
		static Operation PRED_trace1_2_static_exec(Prolog* m);
	/** PREDICATE: trace1/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(trace1/1,public)
	private:
		static StructureTerm* const  L_trace1_1_s5;




	public:
		static Operation PRED_trace1_1_static_exec(Prolog* m);
	/** PREDICATE: adv/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(adv/1,public)
	private:
		static StructureTerm* const  L_adv_1_s5;




	public:
		static Operation PRED_adv_1_static_exec(Prolog* m);
	/** PREDICATE: empty/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(empty/1,public)
	private:
		static StructureTerm* const  L_empty_1_s4;




	public:
		static Operation PRED_empty_1_static_exec(Prolog* m);
	/** PREDICATE: np_all/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(np_all/1,public)
	private:
		static StructureTerm* const  L_np_all_1_s5;




	public:
		static Operation PRED_np_all_1_static_exec(Prolog* m);
	/** PREDICATE: s_all/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(s_all/1,public)
	private:
		static StructureTerm* const  L_s_all_1_s5;




	public:
		static Operation PRED_s_all_1_static_exec(Prolog* m);
	/** PREDICATE: np_no_trace/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(np_no_trace/1,public)
	private:
		static StructureTerm* const  L_np_no_trace_1_s5;




	public:
		static Operation PRED_np_no_trace_1_static_exec(Prolog* m);
	/** PREDICATE: myplus/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(myplus/3,public)




		static Operation PRED_myplus_3_static_exec(Prolog* m);
	/** PREDICATE: minus/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(minus/3,public)




		static Operation PRED_minus_3_static_exec(Prolog* m);
	/** PREDICATE: or/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(or/3,public)




		static Operation PRED_or_3_static_exec(Prolog* m);

	private:
		static Operation or_3_var(Prolog* m);

		static Operation or_3_var_1(Prolog* m);

		static Operation or_3_var_2(Prolog* m);

		static Operation or_3_1(Prolog* m);

		static Operation or_3_2(Prolog* m);

		static Operation or_3_3(Prolog* m);
	/** PREDICATE: anot/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(anot/3,public)




	public:
		static Operation PRED_anot_3_static_exec(Prolog* m);

	private:
		static Operation anot_3_sub_1(Prolog* m);

		static Operation anot_3_1(Prolog* m);

		static Operation anot_3_2(Prolog* m);
	/** PREDICATE: role/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(role/3,public)
		public:
			static SymbolTerm* const  ATOM_subj;
			static SymbolTerm* const  FUNCTOR_$0023_3;
	private:
		static StructureTerm* const  L_role_3_s6;
		public:
			static SymbolTerm* const  ATOM_compl;
			static SymbolTerm* const  ATOM_undef;
			static SymbolTerm* const  ATOM_main;
			static SymbolTerm* const  ATOM_aux;
			static SymbolTerm* const  ATOM_decl;
			static SymbolTerm* const  ATOM_nil;




		static Operation PRED_role_3_static_exec(Prolog* m);

	private:
		static Operation role_3_var(Prolog* m);

		static Operation role_3_var_1(Prolog* m);

		static Operation role_3_var_2(Prolog* m);

		static Operation role_3_var_3(Prolog* m);

		static Operation role_3_var_4(Prolog* m);

		static Operation role_3_var_5(Prolog* m);

		static Operation role_3_1(Prolog* m);

		static Operation role_3_2(Prolog* m);

		static Operation role_3_3(Prolog* m);

		static Operation role_3_4(Prolog* m);

		static Operation role_3_5(Prolog* m);

		static Operation role_3_6(Prolog* m);
	/** PREDICATE: subj_case/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(subj_case/1,public)
		static StructureTerm* const  L_subj_case_1_s5;




	public:
		static Operation PRED_subj_case_1_static_exec(Prolog* m);
	/** PREDICATE: verb_case/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(verb_case/1,public)
	private:
		static StructureTerm* const  L_verb_case_1_s5;




	public:
		static Operation PRED_verb_case_1_static_exec(Prolog* m);
	/** PREDICATE: prep_case/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(prep_case/1,public)
	private:
		static StructureTerm* const  L_prep_case_1_s5;




	public:
		static Operation PRED_prep_case_1_static_exec(Prolog* m);
	/** PREDICATE: compl_case/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(compl_case/1,public)




		static Operation PRED_compl_case_1_static_exec(Prolog* m);
	/** PREDICATE: say/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(say/2,public)




		static Operation PRED_say_2_static_exec(Prolog* m);
	/** PREDICATE: sentence/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(sentence/5,public)
			static SymbolTerm* const  ATOM_$002E;
			static SymbolTerm* const  ATOM_$0021;

		// private final Term arg5;




		static Operation PRED_sentence_5_static_exec(Prolog* m);

	private:
		static Operation sentence_5_sub_1(Prolog* m);

		static Operation sentence_5_sub_2(Prolog* m);

		static Operation sentence_5_sub_3(Prolog* m);

		static Operation sentence_5_sub_4(Prolog* m);

		static Operation sentence_5_1(Prolog* m);

		static Operation sentence_5_2(Prolog* m);

		static Operation sentence_5_3(Prolog* m);

		static Operation sentence_5_4(Prolog* m);

		static Operation sentence_5_5(Prolog* m);
	/** PREDICATE: pp/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(pp/8,public)
		public:
			static SymbolTerm* const  FUNCTOR_pp_4;
			static SymbolTerm* const  FUNCTOR_pp_2;

		// private final Term arg5, arg6, arg7, arg8;




		static Operation PRED_pp_8_static_exec(Prolog* m);

	private:
		static Operation pp_8_var(Prolog* m);

		static Operation pp_8_var_1(Prolog* m);

		static Operation pp_8_1(Prolog* m);

		static Operation pp_8_2(Prolog* m);
	/** PREDICATE: topic/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(topic/4,public)




	public:
		static Operation PRED_topic_4_static_exec(Prolog* m);
	/** PREDICATE: opt_comma/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(opt_comma/4,public)
			static SymbolTerm* const  ATOM_$002C;




		static Operation PRED_opt_comma_4_static_exec(Prolog* m);

	private:
		static Operation opt_comma_4_sub_1(Prolog* m);

		static Operation opt_comma_4_1(Prolog* m);

		static Operation opt_comma_4_2(Prolog* m);
	/** PREDICATE: declarative/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(declarative/5,public)
		public:
			static SymbolTerm* const  FUNCTOR_decl_1;

		// private final Term arg5;




		static Operation PRED_declarative_5_static_exec(Prolog* m);
	/** PREDICATE: wh_question/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(wh_question/5,public)
			static SymbolTerm* const  FUNCTOR_whq_2;

		// private final Term arg5;




		static Operation PRED_wh_question_5_static_exec(Prolog* m);
	/** PREDICATE: np/11
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(np/11,public)
			static SymbolTerm* const  FUNCTOR_np_7;
			static SymbolTerm* const  FUNCTOR_np_3;
			static SymbolTerm* const  ATOM_def;
			static SymbolTerm* const  FUNCTOR_$002B_2;
			static SymbolTerm* const  FUNCTOR_part_2;
			static SymbolTerm* const  ATOM_indef;
			static SymbolTerm* const  ATOM_plu;
	private:
		static StructureTerm* const  L_np_11_s13;

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;




	public:
		static Operation PRED_np_11_static_exec(Prolog* m);

	private:
		static Operation np_11_var(Prolog* m);

		static Operation np_11_var_1(Prolog* m);

		static Operation np_11_var_2(Prolog* m);

		static Operation np_11_var_3(Prolog* m);

		static Operation np_11_1(Prolog* m);

		static Operation np_11_2(Prolog* m);

		static Operation np_11_3(Prolog* m);

		static Operation np_11_4(Prolog* m);
	/** PREDICATE: variable_q/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(variable_q/8,public)
		public:
			static SymbolTerm* const  FUNCTOR_adv_phrase_3;
			static SymbolTerm* const  FUNCTOR_np_head_3;
			static SymbolTerm* const  FUNCTOR_int_det_1;
			static SymbolTerm* const  FUNCTOR_predicate_3;
			static SymbolTerm* const  ATOM_adj;
			static SymbolTerm* const  FUNCTOR_value_2;
			static SymbolTerm* const  FUNCTOR_wh_1;
			static SymbolTerm* const  ATOM_quant;

		// private final Term arg5, arg6, arg7, arg8;




		static Operation PRED_variable_q_8_static_exec(Prolog* m);

	private:
		static Operation variable_q_8_sub_1(Prolog* m);

		static Operation variable_q_8_sub_2(Prolog* m);

		static Operation variable_q_8_sub_3(Prolog* m);

		static Operation variable_q_8_1(Prolog* m);

		static Operation variable_q_8_2(Prolog* m);

		static Operation variable_q_8_3(Prolog* m);

		static Operation variable_q_8_4(Prolog* m);
	/** PREDICATE: adv_phrase/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(adv_phrase/7,public)
		public:
			static SymbolTerm* const  FUNCTOR_prep_1;
	private:
		static StructureTerm* const  L_adv_phrase_7_s6;

		// private final Term arg5, arg6, arg7;




	public:
		static Operation PRED_adv_phrase_7_static_exec(Prolog* m);

	private:
		static Operation adv_phrase_7_var(Prolog* m);

		static Operation adv_phrase_7_var_1(Prolog* m);

		static Operation adv_phrase_7_1(Prolog* m);

		static Operation adv_phrase_7_2(Prolog* m);
	/** PREDICATE: predicate/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(predicate/7,public)
		public:
			static SymbolTerm* const  ATOM_neg;

		// private final Term arg5, arg6, arg7;




		static Operation PRED_predicate_7_static_exec(Prolog* m);

	private:
		static Operation predicate_7_var(Prolog* m);

		static Operation predicate_7_var_1(Prolog* m);

		static Operation predicate_7_var_2(Prolog* m);

		static Operation predicate_7_var_3(Prolog* m);

		static Operation predicate_7_int(Prolog* m);

		static Operation predicate_7_int_1(Prolog* m);

		static Operation predicate_7_int_2(Prolog* m);

		static Operation predicate_7_1(Prolog* m);

		static Operation predicate_7_2(Prolog* m);

		static Operation predicate_7_3(Prolog* m);

		static Operation predicate_7_4(Prolog* m);
	/** PREDICATE: whq/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(whq/8,public)

		// private final Term arg5, arg6, arg7, arg8;




	public:
		static Operation PRED_whq_8_static_exec(Prolog* m);

	private:
		static Operation whq_8_sub_1(Prolog* m);

		static Operation whq_8_1(Prolog* m);

		static Operation whq_8_2(Prolog* m);
	/** PREDICATE: int_det/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(int_det/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_int_det_6_static_exec(Prolog* m);

	private:
		static Operation int_det_6_sub_1(Prolog* m);

		static Operation int_det_6_1(Prolog* m);

		static Operation int_det_6_2(Prolog* m);
	/** PREDICATE: gen_marker/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(gen_marker/4,public)
		public:
			static SymbolTerm* const  ATOM_gen_marker;




		static Operation PRED_gen_marker_4_static_exec(Prolog* m);

	private:
		static Operation gen_marker_4_sub_1(Prolog* m);

		static Operation gen_marker_4_1(Prolog* m);

		static Operation gen_marker_4_2(Prolog* m);
	/** PREDICATE: whose/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(whose/6,public)
		public:
			static SymbolTerm* const  ATOM_nogap;
			static SymbolTerm* const  FUNCTOR_np_head0_3;
			static SymbolTerm* const  ATOM_proper;
			static SymbolTerm* const  ATOM_whose;

		// private final Term arg5, arg6;




		static Operation PRED_whose_6_static_exec(Prolog* m);
	/** PREDICATE: question/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(question/7,public)

		// private final Term arg5, arg6, arg7;




		static Operation PRED_question_7_static_exec(Prolog* m);

	private:
		static Operation question_7_sub_1(Prolog* m);

		static Operation question_7_1(Prolog* m);

		static Operation question_7_2(Prolog* m);
	/** PREDICATE: det/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(det/7,public)
		public:
			static SymbolTerm* const  FUNCTOR_det_3;
			static SymbolTerm* const  FUNCTOR_det_1;
			static SymbolTerm* const  ATOM_generic;

		// private final Term arg5, arg6, arg7;




		static Operation PRED_det_7_static_exec(Prolog* m);

	private:
		static Operation det_7_var(Prolog* m);

		static Operation det_7_var_1(Prolog* m);

		static Operation det_7_var_2(Prolog* m);

		static Operation det_7_con(Prolog* m);

		static Operation det_7_con_1(Prolog* m);

		static Operation det_7_str(Prolog* m);

		static Operation det_7_str_1(Prolog* m);

		static Operation det_7_1(Prolog* m);

		static Operation det_7_2(Prolog* m);

		static Operation det_7_3(Prolog* m);
	/** PREDICATE: int_art/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(int_art/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_int_art_6_static_exec(Prolog* m);
	/** PREDICATE: subj_question/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(subj_question/1,public)




		static Operation PRED_subj_question_1_static_exec(Prolog* m);

	private:
		static Operation subj_question_1_var(Prolog* m);

		static Operation subj_question_1_var_1(Prolog* m);

		static Operation subj_question_1_1(Prolog* m);

		static Operation subj_question_1_2(Prolog* m);
	/** PREDICATE: yn_question/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(yn_question/5,public)
		public:
			static SymbolTerm* const  FUNCTOR_q_1;

		// private final Term arg5;




		static Operation PRED_yn_question_5_static_exec(Prolog* m);
	/** PREDICATE: verb_form/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(verb_form/8,public)
			static SymbolTerm* const  FUNCTOR_verb_form_4;

		// private final Term arg5, arg6, arg7, arg8;




		static Operation PRED_verb_form_8_static_exec(Prolog* m);

	private:
		static Operation verb_form_8_sub_1(Prolog* m);

		static Operation verb_form_8_1(Prolog* m);

		static Operation verb_form_8_2(Prolog* m);
	/** PREDICATE: neg/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(neg/6,public)
		public:
			static SymbolTerm* const  FUNCTOR_neg_2;
			static SymbolTerm* const  ATOM_pos;

		// private final Term arg5, arg6;




		static Operation PRED_neg_6_static_exec(Prolog* m);

	private:
		static Operation neg_6_var(Prolog* m);

		static Operation neg_6_var_1(Prolog* m);

		static Operation neg_6_var_2(Prolog* m);

		static Operation neg_6_int(Prolog* m);

		static Operation neg_6_int_1(Prolog* m);

		static Operation neg_6_1(Prolog* m);

		static Operation neg_6_2(Prolog* m);

		static Operation neg_6_3(Prolog* m);
	/** PREDICATE: fronted_verb/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(fronted_verb/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_fronted_verb_6_static_exec(Prolog* m);
	/** PREDICATE: imperative/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(imperative/5,public)
			static SymbolTerm* const  FUNCTOR_imp_1;

		// private final Term arg5;




		static Operation PRED_imperative_5_static_exec(Prolog* m);
	/** PREDICATE: imperative_verb/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(imperative_verb/4,public)
			static SymbolTerm* const  ATOM_you;
			static SymbolTerm* const  ATOM_imp;
			static SymbolTerm* const  ATOM_fin;
	private:
		static StructureTerm* const  L_imperative_verb_4_s11;
		public:
			static SymbolTerm* const  ATOM_sin;
	private:
		static StructureTerm* const  L_imperative_verb_4_s15;
		public:
			static SymbolTerm* const  ATOM_inf;




		static Operation PRED_imperative_verb_4_static_exec(Prolog* m);
	/** PREDICATE: s/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(s/6,public)
			static SymbolTerm* const  FUNCTOR_s_4;

		// private final Term arg5, arg6;




		static Operation PRED_s_6_static_exec(Prolog* m);
	/** PREDICATE: subj/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(subj/7,public)
			static SymbolTerm* const  ATOM_be;

		// private final Term arg5, arg6, arg7;




		static Operation PRED_subj_7_static_exec(Prolog* m);

	private:
		static Operation subj_7_var(Prolog* m);

		static Operation subj_7_var_1(Prolog* m);

		static Operation subj_7_1(Prolog* m);

		static Operation subj_7_2(Prolog* m);
	/** PREDICATE: np_head/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(np_head/9,public)

		// private final Term arg5, arg6, arg7, arg8, arg9;




	public:
		static Operation PRED_np_head_9_static_exec(Prolog* m);
	/** PREDICATE: np_head0/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(np_head0/7,public)
			static SymbolTerm* const  FUNCTOR_name_1;
	private:
		static StructureTerm* const  L_np_head0_7_s7;
		static StructureTerm* const  L_np_head0_7_s11;
		public:
			static SymbolTerm* const  ATOM_common;
	private:
		static StructureTerm* const  L_np_head0_7_s21;

		// private final Term arg5, arg6, arg7;




	public:
		static Operation PRED_np_head0_7_static_exec(Prolog* m);

	private:
		static Operation np_head0_7_var(Prolog* m);

		static Operation np_head0_7_var_1(Prolog* m);

		static Operation np_head0_7_var_2(Prolog* m);

		static Operation np_head0_7_var_3(Prolog* m);

		static Operation np_head0_7_var_4(Prolog* m);

		static Operation np_head0_7_int(Prolog* m);

		static Operation np_head0_7_int_1(Prolog* m);

		static Operation np_head0_7_1(Prolog* m);

		static Operation np_head0_7_2(Prolog* m);

		static Operation np_head0_7_3(Prolog* m);

		static Operation np_head0_7_4(Prolog* m);

		static Operation np_head0_7_5(Prolog* m);
	/** PREDICATE: np_compls/10
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(np_compls/10,public)

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10;




	public:
		static Operation PRED_np_compls_10_static_exec(Prolog* m);

	private:
		static Operation np_compls_10_var(Prolog* m);

		static Operation np_compls_10_var_1(Prolog* m);

		static Operation np_compls_10_1(Prolog* m);

		static Operation np_compls_10_2(Prolog* m);
	/** PREDICATE: possessive/14
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(possessive/14,public)
		public:
			static SymbolTerm* const  ATOM_poss;

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14;




		static Operation PRED_possessive_14_static_exec(Prolog* m);

	private:
		static Operation possessive_14_sub_1(Prolog* m);

		static Operation possessive_14_1(Prolog* m);

		static Operation possessive_14_2(Prolog* m);
	/** PREDICATE: gen_case/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(gen_case/4,public)




	public:
		static Operation PRED_gen_case_4_static_exec(Prolog* m);
	/** PREDICATE: an_s/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(an_s/4,public)




		static Operation PRED_an_s_4_static_exec(Prolog* m);

	private:
		static Operation an_s_4_sub_1(Prolog* m);

		static Operation an_s_4_1(Prolog* m);

		static Operation an_s_4_2(Prolog* m);
	/** PREDICATE: determiner/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(determiner/7,public)

		// private final Term arg5, arg6, arg7;




	public:
		static Operation PRED_determiner_7_static_exec(Prolog* m);

	private:
		static Operation determiner_7_sub_1(Prolog* m);

		static Operation determiner_7_1(Prolog* m);

		static Operation determiner_7_2(Prolog* m);
	/** PREDICATE: quant_phrase/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(quant_phrase/7,public)
		public:
			static SymbolTerm* const  FUNCTOR_quant_2;

		// private final Term arg5, arg6, arg7;




		static Operation PRED_quant_phrase_7_static_exec(Prolog* m);
	/** PREDICATE: quant/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(quant/6,public)
			static SymbolTerm* const  ATOM_at;
			static SymbolTerm* const  ATOM_same;

		// private final Term arg5, arg6;




		static Operation PRED_quant_6_static_exec(Prolog* m);

	private:
		static Operation quant_6_var(Prolog* m);

		static Operation quant_6_var_1(Prolog* m);

		static Operation quant_6_var_2(Prolog* m);

		static Operation quant_6_var_3(Prolog* m);

		static Operation quant_6_int(Prolog* m);

		static Operation quant_6_int_1(Prolog* m);

		static Operation quant_6_1(Prolog* m);

		static Operation quant_6_2(Prolog* m);

		static Operation quant_6_3(Prolog* m);

		static Operation quant_6_4(Prolog* m);
	/** PREDICATE: neg_adv/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(neg_adv/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_neg_adv_6_static_exec(Prolog* m);

	private:
		static Operation neg_adv_6_sub_1(Prolog* m);

		static Operation neg_adv_6_1(Prolog* m);

		static Operation neg_adv_6_2(Prolog* m);
	/** PREDICATE: sup_op/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(sup_op/2,public)
		public:
			static SymbolTerm* const  ATOM_least;
			static SymbolTerm* const  ATOM_less;
	private:
		static StructureTerm* const  L_sup_op_2_s6;
		public:
			static SymbolTerm* const  ATOM_most;
	private:
		static StructureTerm* const  L_sup_op_2_s10;




	public:
		static Operation PRED_sup_op_2_static_exec(Prolog* m);

	private:
		static Operation sup_op_2_var(Prolog* m);

		static Operation sup_op_2_var_1(Prolog* m);

		static Operation sup_op_2_1(Prolog* m);

		static Operation sup_op_2_2(Prolog* m);
	/** PREDICATE: np_mods/12
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(np_mods/12,public)

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;




	public:
		static Operation PRED_np_mods_12_static_exec(Prolog* m);

	private:
		static Operation np_mods_12_sub_1(Prolog* m);

		static Operation np_mods_12_1(Prolog* m);

		static Operation np_mods_12_2(Prolog* m);
	/** PREDICATE: np_mod/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(np_mod/9,public)

		// private final Term arg5, arg6, arg7, arg8, arg9;




	public:
		static Operation PRED_np_mod_9_static_exec(Prolog* m);

	private:
		static Operation np_mod_9_sub_1(Prolog* m);

		static Operation np_mod_9_1(Prolog* m);

		static Operation np_mod_9_2(Prolog* m);
	/** PREDICATE: verb_mods/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(verb_mods/8,public)

		// private final Term arg5, arg6, arg7, arg8;




	public:
		static Operation PRED_verb_mods_8_static_exec(Prolog* m);

	private:
		static Operation verb_mods_8_var(Prolog* m);

		static Operation verb_mods_8_var_1(Prolog* m);

		static Operation verb_mods_8_1(Prolog* m);

		static Operation verb_mods_8_2(Prolog* m);
	/** PREDICATE: verb_mod/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(verb_mod/7,public)

		// private final Term arg5, arg6, arg7;




	public:
		static Operation PRED_verb_mod_7_static_exec(Prolog* m);

	private:
		static Operation verb_mod_7_sub_1(Prolog* m);

		static Operation verb_mod_7_sub_2(Prolog* m);

		static Operation verb_mod_7_1(Prolog* m);

		static Operation verb_mod_7_2(Prolog* m);

		static Operation verb_mod_7_3(Prolog* m);
	/** PREDICATE: adjs/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(adjs/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_adjs_5_static_exec(Prolog* m);

	private:
		static Operation adjs_5_var(Prolog* m);

		static Operation adjs_5_var_1(Prolog* m);

		static Operation adjs_5_1(Prolog* m);

		static Operation adjs_5_2(Prolog* m);
	/** PREDICATE: pre_adj/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(pre_adj/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_pre_adj_5_static_exec(Prolog* m);

	private:
		static Operation pre_adj_5_sub_1(Prolog* m);

		static Operation pre_adj_5_1(Prolog* m);

		static Operation pre_adj_5_2(Prolog* m);
	/** PREDICATE: sup_phrase/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(sup_phrase/5,public)
		public:
			static SymbolTerm* const  FUNCTOR_sup_2;

		// private final Term arg5;




		static Operation PRED_sup_phrase_5_static_exec(Prolog* m);

	private:
		static Operation sup_phrase_5_var(Prolog* m);

		static Operation sup_phrase_5_var_1(Prolog* m);

		static Operation sup_phrase_5_1(Prolog* m);

		static Operation sup_phrase_5_2(Prolog* m);
	/** PREDICATE: comp_phrase/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(comp_phrase/6,public)
		public:
			static SymbolTerm* const  FUNCTOR_comp_3;

		// private final Term arg5, arg6;




		static Operation PRED_comp_phrase_6_static_exec(Prolog* m);
	/** PREDICATE: comp/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(comp/6,public)
			static SymbolTerm* const  ATOM_as;

		// private final Term arg5, arg6;




		static Operation PRED_comp_6_static_exec(Prolog* m);

	private:
		static Operation comp_6_var(Prolog* m);

		static Operation comp_6_var_1(Prolog* m);

		static Operation comp_6_var_2(Prolog* m);

		static Operation comp_6_1(Prolog* m);

		static Operation comp_6_2(Prolog* m);

		static Operation comp_6_3(Prolog* m);
	/** PREDICATE: relative/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(relative/9,public)

		// private final Term arg5, arg6, arg7, arg8, arg9;




	public:
		static Operation PRED_relative_9_static_exec(Prolog* m);

	private:
		static Operation relative_9_sub_1(Prolog* m);

		static Operation relative_9_1(Prolog* m);

		static Operation relative_9_2(Prolog* m);
	/** PREDICATE: rel_conj/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(rel_conj/8,public)

		// private final Term arg5, arg6, arg7, arg8;




	public:
		static Operation PRED_rel_conj_8_static_exec(Prolog* m);
	/** PREDICATE: rel_rest/10
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(rel_rest/10,public)

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10;




		static Operation PRED_rel_rest_10_static_exec(Prolog* m);

	private:
		static Operation rel_rest_10_sub_1(Prolog* m);

		static Operation rel_rest_10_1(Prolog* m);

		static Operation rel_rest_10_2(Prolog* m);
	/** PREDICATE: rel/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(rel/7,public)
		public:
			static SymbolTerm* const  FUNCTOR_rel_2;

		// private final Term arg5, arg6, arg7;




		static Operation PRED_rel_7_static_exec(Prolog* m);
	/** PREDICATE: variable/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(variable/6,public)

		// private final Term arg5, arg6;




		static Operation PRED_variable_6_static_exec(Prolog* m);

	private:
		static Operation variable_6_sub_1(Prolog* m);

		static Operation variable_6_sub_2(Prolog* m);

		static Operation variable_6_1(Prolog* m);

		static Operation variable_6_2(Prolog* m);

		static Operation variable_6_3(Prolog* m);
	/** PREDICATE: wh/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(wh/9,public)

		// private final Term arg5, arg6, arg7, arg8, arg9;




	public:
		static Operation PRED_wh_9_static_exec(Prolog* m);

	private:
		static Operation wh_9_sub_1(Prolog* m);

		static Operation wh_9_sub_2(Prolog* m);

		static Operation wh_9_1(Prolog* m);

		static Operation wh_9_2(Prolog* m);

		static Operation wh_9_3(Prolog* m);
	/** PREDICATE: reduced_relative/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(reduced_relative/8,public)

		// private final Term arg5, arg6, arg7, arg8;




	public:
		static Operation PRED_reduced_relative_8_static_exec(Prolog* m);
	/** PREDICATE: reduced_rel_conj/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(reduced_rel_conj/8,public)

		// private final Term arg5, arg6, arg7, arg8;




		static Operation PRED_reduced_rel_conj_8_static_exec(Prolog* m);
	/** PREDICATE: reduced_rel_rest/10
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(reduced_rel_rest/10,public)

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10;




		static Operation PRED_reduced_rel_rest_10_static_exec(Prolog* m);

	private:
		static Operation reduced_rel_rest_10_sub_1(Prolog* m);

		static Operation reduced_rel_rest_10_1(Prolog* m);

		static Operation reduced_rel_rest_10_2(Prolog* m);
	/** PREDICATE: reduced_rel/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(reduced_rel/7,public)
		public:
			static SymbolTerm* const  FUNCTOR_reduced_rel_2;

		// private final Term arg5, arg6, arg7;




		static Operation PRED_reduced_rel_7_static_exec(Prolog* m);
	/** PREDICATE: reduced_wh/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(reduced_wh/6,public)
			static SymbolTerm* const  ATOM_pres;
	private:
		static StructureTerm* const  L_reduced_wh_6_s14;
		public:
			static SymbolTerm* const  FUNCTOR_verb_4;

		// private final Term arg5, arg6;




		static Operation PRED_reduced_wh_6_static_exec(Prolog* m);

	private:
		static Operation reduced_wh_6_sub_1(Prolog* m);

		static Operation reduced_wh_6_sub_2(Prolog* m);

		static Operation reduced_wh_6_1(Prolog* m);

		static Operation reduced_wh_6_2(Prolog* m);

		static Operation reduced_wh_6_3(Prolog* m);
	/** PREDICATE: verb/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(verb/8,public)
		public:
			static SymbolTerm* const  FUNCTOR_verb_5;

		// private final Term arg5, arg6, arg7, arg8;




		static Operation PRED_verb_8_static_exec(Prolog* m);

	private:
		static Operation verb_8_var(Prolog* m);

		static Operation verb_8_var_1(Prolog* m);

		static Operation verb_8_1(Prolog* m);

		static Operation verb_8_2(Prolog* m);
	/** PREDICATE: rest_verb/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(rest_verb/9,public)
		public:
			static SymbolTerm* const  ATOM_have;
			static SymbolTerm* const  ATOM_perf;
			static SymbolTerm* const  ATOM_past;
			static SymbolTerm* const  ATOM_part;
	private:
		static StructureTerm* const  L_rest_verb_9_s8;
		public:
			static SymbolTerm* const  ATOM_do;
			static SymbolTerm* const  ATOM_active;

		// private final Term arg5, arg6, arg7, arg8, arg9;




		static Operation PRED_rest_verb_9_static_exec(Prolog* m);

	private:
		static Operation rest_verb_9_var(Prolog* m);

		static Operation rest_verb_9_var_1(Prolog* m);

		static Operation rest_verb_9_var_2(Prolog* m);

		static Operation rest_verb_9_var_3(Prolog* m);

		static Operation rest_verb_9_1(Prolog* m);

		static Operation rest_verb_9_2(Prolog* m);

		static Operation rest_verb_9_3(Prolog* m);

		static Operation rest_verb_9_4(Prolog* m);
	/** PREDICATE: have/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(have/8,public)

		// private final Term arg5, arg6, arg7, arg8;




	public:
		static Operation PRED_have_8_static_exec(Prolog* m);

	private:
		static Operation have_8_var(Prolog* m);

		static Operation have_8_var_1(Prolog* m);

		static Operation have_8_1(Prolog* m);

		static Operation have_8_2(Prolog* m);
	/** PREDICATE: be/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(be/9,public)
		static StructureTerm* const  L_be_9_s5;
		public:
			static SymbolTerm* const  ATOM_passive;
	private:
		static StructureTerm* const  L_be_9_s10;
		public:
			static SymbolTerm* const  ATOM_prog;
	private:
		static ListTerm* const  L_be_9_s12;

		// private final Term arg5, arg6, arg7, arg8, arg9;




	public:
		static Operation PRED_be_9_static_exec(Prolog* m);

	private:
		static Operation be_9_var(Prolog* m);

		static Operation be_9_var_1(Prolog* m);

		static Operation be_9_1(Prolog* m);

		static Operation be_9_2(Prolog* m);
	/** PREDICATE: passive/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(passive/7,public)
		static StructureTerm* const  L_passive_7_s7;

		// private final Term arg5, arg6, arg7;




	public:
		static Operation PRED_passive_7_static_exec(Prolog* m);

	private:
		static Operation passive_7_var(Prolog* m);

		static Operation passive_7_var_1(Prolog* m);

		static Operation passive_7_1(Prolog* m);

		static Operation passive_7_2(Prolog* m);
	/** PREDICATE: participle/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(participle/7,public)

		// private final Term arg5, arg6, arg7;




	public:
		static Operation PRED_participle_7_static_exec(Prolog* m);
	/** PREDICATE: passive/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(passive/1,public)
			static SymbolTerm* const  ATOM_trans;
			static SymbolTerm* const  ATOM_ditrans;




		static Operation PRED_passive_1_static_exec(Prolog* m);

	private:
		static Operation passive_1_var(Prolog* m);

		static Operation passive_1_var_1(Prolog* m);

		static Operation passive_1_1(Prolog* m);

		static Operation passive_1_2(Prolog* m);
	/** PREDICATE: participle/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(participle/3,public)
		static StructureTerm* const  L_participle_3_s5;
		static ListTerm* const  L_participle_3_s9;
		static StructureTerm* const  L_participle_3_s12;




	public:
		static Operation PRED_participle_3_static_exec(Prolog* m);

	private:
		static Operation participle_3_var(Prolog* m);

		static Operation participle_3_var_1(Prolog* m);

		static Operation participle_3_1(Prolog* m);

		static Operation participle_3_2(Prolog* m);
	/** PREDICATE: close/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(close/4,public)
		public:
			static SymbolTerm* const  ATOM_close;




		static Operation PRED_close_4_static_exec(Prolog* m);
	/** PREDICATE: myopen/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(myopen/4,public)




		static Operation PRED_myopen_4_static_exec(Prolog* m);
	/** PREDICATE: verb_args/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(verb_args/9,public)
			static SymbolTerm* const  FUNCTOR_arg_2;
			static SymbolTerm* const  ATOM_dir;
			static SymbolTerm* const  ATOM_np;
			static SymbolTerm* const  ATOM_void;
	private:
		static ListTerm* const  L_verb_args_9_s11;
		public:
			static SymbolTerm* const  ATOM_predicate;

		// private final Term arg5, arg6, arg7, arg8, arg9;




		static Operation PRED_verb_args_9_static_exec(Prolog* m);

	private:
		static Operation verb_args_9_var(Prolog* m);

		static Operation verb_args_9_var_1(Prolog* m);

		static Operation verb_args_9_var_2(Prolog* m);

		static Operation verb_args_9_var_3(Prolog* m);

		static Operation verb_args_9_var_4(Prolog* m);

		static Operation verb_args_9_var_5(Prolog* m);

		static Operation verb_args_9_var_6(Prolog* m);

		static Operation verb_args_9_var_7(Prolog* m);

		static Operation verb_args_9_con(Prolog* m);

		static Operation verb_args_9_con_1(Prolog* m);

		static Operation verb_args_9_con_2(Prolog* m);

		static Operation verb_args_9_con_3(Prolog* m);

		static Operation verb_args_9_con_4(Prolog* m);

		static Operation verb_args_9_con_5(Prolog* m);

		static Operation verb_args_9_con_6(Prolog* m);

		static Operation verb_args_9_str(Prolog* m);

		static Operation verb_args_9_str_1(Prolog* m);

		static Operation verb_args_9_1(Prolog* m);

		static Operation verb_args_9_2(Prolog* m);

		static Operation verb_args_9_3(Prolog* m);

		static Operation verb_args_9_4(Prolog* m);

		static Operation verb_args_9_5(Prolog* m);

		static Operation verb_args_9_6(Prolog* m);

		static Operation verb_args_9_7(Prolog* m);

		static Operation verb_args_9_8(Prolog* m);
	/** PREDICATE: object/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(object/8,public)

		// private final Term arg5, arg6, arg7, arg8;




	public:
		static Operation PRED_object_8_static_exec(Prolog* m);
	/** PREDICATE: obj/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(obj/8,public)
			static SymbolTerm* const  ATOM_ind;

		// private final Term arg5, arg6, arg7, arg8;




		static Operation PRED_obj_8_static_exec(Prolog* m);

	private:
		static Operation obj_8_var(Prolog* m);

		static Operation obj_8_var_1(Prolog* m);

		static Operation obj_8_1(Prolog* m);

		static Operation obj_8_2(Prolog* m);
	/** PREDICATE: pred_conj/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(pred_conj/7,public)

		// private final Term arg5, arg6, arg7;




	public:
		static Operation PRED_pred_conj_7_static_exec(Prolog* m);
	/** PREDICATE: pred_rest/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(pred_rest/9,public)

		// private final Term arg5, arg6, arg7, arg8, arg9;




		static Operation PRED_pred_rest_9_static_exec(Prolog* m);

	private:
		static Operation pred_rest_9_sub_1(Prolog* m);

		static Operation pred_rest_9_1(Prolog* m);

		static Operation pred_rest_9_2(Prolog* m);
	/** PREDICATE: verb_arg/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(verb_arg/7,public)

		// private final Term arg5, arg6, arg7;




	public:
		static Operation PRED_verb_arg_7_static_exec(Prolog* m);
	/** PREDICATE: advs/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(advs/7,public)

		// private final Term arg5, arg6, arg7;




		static Operation PRED_advs_7_static_exec(Prolog* m);

	private:
		static Operation advs_7_var(Prolog* m);

		static Operation advs_7_var_1(Prolog* m);

		static Operation advs_7_1(Prolog* m);

		static Operation advs_7_2(Prolog* m);
	/** PREDICATE: adj_phrase/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(adj_phrase/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_adj_phrase_6_static_exec(Prolog* m);

	private:
		static Operation adj_phrase_6_sub_1(Prolog* m);

		static Operation adj_phrase_6_1(Prolog* m);

		static Operation adj_phrase_6_2(Prolog* m);
	/** PREDICATE: no_args/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(no_args/1,public)
		public:
			static SymbolTerm* const  ATOM_intrans;




		static Operation PRED_no_args_1_static_exec(Prolog* m);

	private:
		static Operation no_args_1_var(Prolog* m);

		static Operation no_args_1_var_1(Prolog* m);

		static Operation no_args_1_var_2(Prolog* m);

		static Operation no_args_1_1(Prolog* m);

		static Operation no_args_1_2(Prolog* m);

		static Operation no_args_1_3(Prolog* m);
	/** PREDICATE: conj/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(conj/9,public)
		public:
			static SymbolTerm* const  FUNCTOR_conj_2;
			static SymbolTerm* const  FUNCTOR_conj_3;

		// private final Term arg5, arg6, arg7, arg8, arg9;




		static Operation PRED_conj_9_static_exec(Prolog* m);
	/** PREDICATE: noun/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(noun/6,public)

		// private final Term arg5, arg6;




		static Operation PRED_noun_6_static_exec(Prolog* m);
	/** PREDICATE: adj/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(adj/6,public)
			static SymbolTerm* const  FUNCTOR_adj_1;

		// private final Term arg5, arg6;




		static Operation PRED_adj_6_static_exec(Prolog* m);
	/** PREDICATE: prep/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(prep/5,public)

		// private final Term arg5;




		static Operation PRED_prep_5_static_exec(Prolog* m);
	/** PREDICATE: rel_adj/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(rel_adj/5,public)

		// private final Term arg5;




		static Operation PRED_rel_adj_5_static_exec(Prolog* m);
	/** PREDICATE: sup_adj/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(sup_adj/5,public)

		// private final Term arg5;




		static Operation PRED_sup_adj_5_static_exec(Prolog* m);
	/** PREDICATE: comp_adv/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(comp_adv/5,public)

		// private final Term arg5;




		static Operation PRED_comp_adv_5_static_exec(Prolog* m);

	private:
		static Operation comp_adv_5_var(Prolog* m);

		static Operation comp_adv_5_var_1(Prolog* m);

		static Operation comp_adv_5_1(Prolog* m);

		static Operation comp_adv_5_2(Prolog* m);
	/** PREDICATE: sup_adv/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(sup_adv/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_sup_adv_5_static_exec(Prolog* m);

	private:
		static Operation sup_adv_5_var(Prolog* m);

		static Operation sup_adv_5_var_1(Prolog* m);

		static Operation sup_adv_5_1(Prolog* m);

		static Operation sup_adv_5_2(Prolog* m);
	/** PREDICATE: rel_pron/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(rel_pron/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_rel_pron_5_static_exec(Prolog* m);
	/** PREDICATE: name/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(name/5,public)

		// private final Term arg5;




		static Operation PRED_name_5_static_exec(Prolog* m);
	/** PREDICATE: int_art/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(int_art/7,public)

		// private final Term arg5, arg6, arg7;




		static Operation PRED_int_art_7_static_exec(Prolog* m);

	private:
		static Operation int_art_7_sub_1(Prolog* m);

		static Operation int_art_7_1(Prolog* m);

		static Operation int_art_7_2(Prolog* m);
	/** PREDICATE: int_pron/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(int_pron/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_int_pron_5_static_exec(Prolog* m);
	/** PREDICATE: adverb/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(adverb/5,public)
			static SymbolTerm* const  FUNCTOR_adv_1;

		// private final Term arg5;




		static Operation PRED_adverb_5_static_exec(Prolog* m);
	/** PREDICATE: poss_pron/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(poss_pron/6,public)
			static SymbolTerm* const  FUNCTOR_pronoun_1;

		// private final Term arg5, arg6;




		static Operation PRED_poss_pron_6_static_exec(Prolog* m);
	/** PREDICATE: pers_pron/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(pers_pron/7,public)

		// private final Term arg5, arg6, arg7;




		static Operation PRED_pers_pron_7_static_exec(Prolog* m);
	/** PREDICATE: quantifier_pron/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(quantifier_pron/6,public)

		// private final Term arg5, arg6;




		static Operation PRED_quantifier_pron_6_static_exec(Prolog* m);
	/** PREDICATE: context_pron/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(context_pron/6,public)
	private:
		static StructureTerm* const  L_context_pron_6_s4;
		public:
			static SymbolTerm* const  ATOM_place;
	private:
		static StructureTerm* const  L_context_pron_6_s9;
		public:
			static SymbolTerm* const  ATOM_time;
			static SymbolTerm* const  ATOM_when;

		// private final Term arg5, arg6;




		static Operation PRED_context_pron_6_static_exec(Prolog* m);

	private:
		static Operation context_pron_6_var(Prolog* m);

		static Operation context_pron_6_var_1(Prolog* m);

		static Operation context_pron_6_1(Prolog* m);

		static Operation context_pron_6_2(Prolog* m);
	/** PREDICATE: number/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(number/6,public)
		public:
			static SymbolTerm* const  FUNCTOR_nb_1;

		// private final Term arg5, arg6;




		static Operation PRED_number_6_static_exec(Prolog* m);
	/** PREDICATE: terminator/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(terminator/5,public)

		// private final Term arg5;




		static Operation PRED_terminator_5_static_exec(Prolog* m);
	/** PREDICATE: opt_the/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(opt_the/4,public)




		static Operation PRED_opt_the_4_static_exec(Prolog* m);

	private:
		static Operation opt_the_4_sub_1(Prolog* m);

		static Operation opt_the_4_1(Prolog* m);

		static Operation opt_the_4_2(Prolog* m);
	/** PREDICATE: conj/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(conj/7,public)
		public:
			static SymbolTerm* const  ATOM_list;
			static SymbolTerm* const  ATOM_end;

		// private final Term arg5, arg6, arg7;




		static Operation PRED_conj_7_static_exec(Prolog* m);

	private:
		static Operation conj_7_sub_1(Prolog* m);

		static Operation conj_7_1(Prolog* m);

		static Operation conj_7_2(Prolog* m);
	/** PREDICATE: loc_pred/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(loc_pred/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_loc_pred_5_static_exec(Prolog* m);
	/** PREDICATE: ~ / 5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(~ / 5,public)

		// private final Term arg5;




		static Operation PRED_$007E_5_static_exec(Prolog* m);
	/** PREDICATE: word/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(word/1,public)




		static Operation PRED_word_1_static_exec(Prolog* m);

	private:
		static Operation word_1_sub_1(Prolog* m);

		static Operation word_1_sub_2(Prolog* m);

		static Operation word_1_sub_3(Prolog* m);

		static Operation word_1_sub_4(Prolog* m);

		static Operation word_1_sub_5(Prolog* m);

		static Operation word_1_sub_6(Prolog* m);

		static Operation word_1_sub_7(Prolog* m);

		static Operation word_1_sub_8(Prolog* m);

		static Operation word_1_sub_9(Prolog* m);

		static Operation word_1_sub_10(Prolog* m);

		static Operation word_1_sub_11(Prolog* m);

		static Operation word_1_sub_12(Prolog* m);

		static Operation word_1_sub_13(Prolog* m);

		static Operation word_1_sub_14(Prolog* m);

		static Operation word_1_sub_15(Prolog* m);

		static Operation word_1_sub_16(Prolog* m);

		static Operation word_1_sub_17(Prolog* m);

		static Operation word_1_sub_18(Prolog* m);

		static Operation word_1_sub_19(Prolog* m);

		static Operation word_1_1(Prolog* m);

		static Operation word_1_2(Prolog* m);

		static Operation word_1_3(Prolog* m);

		static Operation word_1_4(Prolog* m);

		static Operation word_1_5(Prolog* m);

		static Operation word_1_6(Prolog* m);

		static Operation word_1_7(Prolog* m);

		static Operation word_1_8(Prolog* m);

		static Operation word_1_9(Prolog* m);

		static Operation word_1_10(Prolog* m);

		static Operation word_1_11(Prolog* m);

		static Operation word_1_12(Prolog* m);

		static Operation word_1_13(Prolog* m);

		static Operation word_1_14(Prolog* m);

		static Operation word_1_15(Prolog* m);

		static Operation word_1_16(Prolog* m);

		static Operation word_1_17(Prolog* m);

		static Operation word_1_18(Prolog* m);

		static Operation word_1_19(Prolog* m);

		static Operation word_1_20(Prolog* m);
	/** PREDICATE: ~ / 1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(~ / 1,public)




	public:
		static Operation PRED_$007E_1_static_exec(Prolog* m);

	private:
		static Operation $007E_1_var(Prolog* m);

		static Operation $007E_1_var_1(Prolog* m);

		static Operation $007E_1_var_2(Prolog* m);

		static Operation $007E_1_var_3(Prolog* m);

		static Operation $007E_1_var_4(Prolog* m);

		static Operation $007E_1_var_5(Prolog* m);

		static Operation $007E_1_var_6(Prolog* m);

		static Operation $007E_1_var_7(Prolog* m);

		static Operation $007E_1_var_8(Prolog* m);

		static Operation $007E_1_var_9(Prolog* m);

		static Operation $007E_1_var_10(Prolog* m);

		static Operation $007E_1_var_11(Prolog* m);

		static Operation $007E_1_var_12(Prolog* m);

		static Operation $007E_1_var_13(Prolog* m);

		static Operation $007E_1_var_14(Prolog* m);

		static Operation $007E_1_var_15(Prolog* m);

		static Operation $007E_1_var_16(Prolog* m);

		static Operation $007E_1_var_17(Prolog* m);

		static Operation $007E_1_var_18(Prolog* m);

		static Operation $007E_1_var_19(Prolog* m);

		static Operation $007E_1_1(Prolog* m);

		static Operation $007E_1_2(Prolog* m);

		static Operation $007E_1_3(Prolog* m);

		static Operation $007E_1_4(Prolog* m);

		static Operation $007E_1_5(Prolog* m);

		static Operation $007E_1_6(Prolog* m);

		static Operation $007E_1_7(Prolog* m);

		static Operation $007E_1_8(Prolog* m);

		static Operation $007E_1_9(Prolog* m);

		static Operation $007E_1_10(Prolog* m);

		static Operation $007E_1_11(Prolog* m);

		static Operation $007E_1_12(Prolog* m);

		static Operation $007E_1_13(Prolog* m);

		static Operation $007E_1_14(Prolog* m);

		static Operation $007E_1_15(Prolog* m);

		static Operation $007E_1_16(Prolog* m);

		static Operation $007E_1_17(Prolog* m);

		static Operation $007E_1_18(Prolog* m);

		static Operation $007E_1_19(Prolog* m);

		static Operation $007E_1_20(Prolog* m);
	/** PREDICATE: conj/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(conj/1,public)
		public:
			static SymbolTerm* const  ATOM_or;




		static Operation PRED_conj_1_static_exec(Prolog* m);

	private:
		static Operation conj_1_var(Prolog* m);

		static Operation conj_1_var_1(Prolog* m);

		static Operation conj_1_1(Prolog* m);

		static Operation conj_1_2(Prolog* m);
	/** PREDICATE: int_pron/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(int_pron/2,public)
		public:
			static SymbolTerm* const  ATOM_who;
			static SymbolTerm* const  ATOM_whom;




		static Operation PRED_int_pron_2_static_exec(Prolog* m);

	private:
		static Operation int_pron_2_var(Prolog* m);

		static Operation int_pron_2_var_1(Prolog* m);

		static Operation int_pron_2_var_2(Prolog* m);

		static Operation int_pron_2_var_3(Prolog* m);

		static Operation int_pron_2_1(Prolog* m);

		static Operation int_pron_2_2(Prolog* m);

		static Operation int_pron_2_3(Prolog* m);

		static Operation int_pron_2_4(Prolog* m);
	/** PREDICATE: int_art/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(int_art/4,public)




	public:
		static Operation PRED_int_art_4_static_exec(Prolog* m);

	private:
		static Operation int_art_4_var(Prolog* m);

		static Operation int_art_4_var_1(Prolog* m);

		static Operation int_art_4_1(Prolog* m);

		static Operation int_art_4_2(Prolog* m);
	/** PREDICATE: det/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(det/4,public)
		public:
			static SymbolTerm* const  FUNCTOR_the_1;
			static SymbolTerm* const  ATOM_an;
			static SymbolTerm* const  ATOM_every;
			static SymbolTerm* const  ATOM_all;
			static SymbolTerm* const  ATOM_no;




		static Operation PRED_det_4_static_exec(Prolog* m);

	private:
		static Operation det_4_var(Prolog* m);

		static Operation det_4_var_1(Prolog* m);

		static Operation det_4_var_2(Prolog* m);

		static Operation det_4_var_3(Prolog* m);

		static Operation det_4_var_4(Prolog* m);

		static Operation det_4_var_5(Prolog* m);

		static Operation det_4_var_6(Prolog* m);

		static Operation det_4_var_7(Prolog* m);

		static Operation det_4_var_8(Prolog* m);

		static Operation det_4_1(Prolog* m);

		static Operation det_4_2(Prolog* m);

		static Operation det_4_3(Prolog* m);

		static Operation det_4_4(Prolog* m);

		static Operation det_4_5(Prolog* m);

		static Operation det_4_6(Prolog* m);

		static Operation det_4_7(Prolog* m);

		static Operation det_4_8(Prolog* m);

		static Operation det_4_9(Prolog* m);
	/** PREDICATE: number/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(number/3,public)




	public:
		static Operation PRED_number_3_static_exec(Prolog* m);
	/** PREDICATE: tr_number/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(tr_number/2,public)
			static SymbolTerm* const  ATOM_three;
			static SymbolTerm* const  ATOM_four;
			static SymbolTerm* const  ATOM_five;
			static SymbolTerm* const  ATOM_six;
			static SymbolTerm* const  ATOM_seven;
			static SymbolTerm* const  ATOM_eight;
			static SymbolTerm* const  ATOM_nine;
			static SymbolTerm* const  ATOM_ten;




		static Operation PRED_tr_number_2_static_exec(Prolog* m);

	private:
		static Operation tr_number_2_var(Prolog* m);

		static Operation tr_number_2_var_1(Prolog* m);

		static Operation tr_number_2_var_2(Prolog* m);

		static Operation tr_number_2_var_3(Prolog* m);

		static Operation tr_number_2_var_4(Prolog* m);

		static Operation tr_number_2_var_5(Prolog* m);

		static Operation tr_number_2_var_6(Prolog* m);

		static Operation tr_number_2_var_7(Prolog* m);

		static Operation tr_number_2_var_8(Prolog* m);

		static Operation tr_number_2_var_9(Prolog* m);

		static Operation tr_number_2_var_10(Prolog* m);

		static Operation tr_number_2_con(Prolog* m);

		static Operation tr_number_2_con_1(Prolog* m);

		static Operation tr_number_2_con_2(Prolog* m);

		static Operation tr_number_2_con_3(Prolog* m);

		static Operation tr_number_2_con_4(Prolog* m);

		static Operation tr_number_2_con_5(Prolog* m);

		static Operation tr_number_2_con_6(Prolog* m);

		static Operation tr_number_2_con_7(Prolog* m);

		static Operation tr_number_2_con_8(Prolog* m);

		static Operation tr_number_2_con_9(Prolog* m);

		static Operation tr_number_2_1(Prolog* m);

		static Operation tr_number_2_2(Prolog* m);

		static Operation tr_number_2_3(Prolog* m);

		static Operation tr_number_2_4(Prolog* m);

		static Operation tr_number_2_5(Prolog* m);

		static Operation tr_number_2_6(Prolog* m);

		static Operation tr_number_2_7(Prolog* m);

		static Operation tr_number_2_8(Prolog* m);

		static Operation tr_number_2_9(Prolog* m);

		static Operation tr_number_2_10(Prolog* m);

		static Operation tr_number_2_11(Prolog* m);
	/** PREDICATE: ag_number/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(ag_number/2,public)




	public:
		static Operation PRED_ag_number_2_static_exec(Prolog* m);

	private:
		static Operation ag_number_2_var(Prolog* m);

		static Operation ag_number_2_var_1(Prolog* m);

		static Operation ag_number_2_1(Prolog* m);

		static Operation ag_number_2_2(Prolog* m);
	/** PREDICATE: quantifier_pron/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(quantifier_pron/3,public)
		public:
			static SymbolTerm* const  ATOM_everybody;
			static SymbolTerm* const  ATOM_person;
			static SymbolTerm* const  ATOM_everyone;
			static SymbolTerm* const  ATOM_everything;
			static SymbolTerm* const  ATOM_thing;
			static SymbolTerm* const  ATOM_somebody;
			static SymbolTerm* const  ATOM_someone;
			static SymbolTerm* const  ATOM_something;
			static SymbolTerm* const  ATOM_anybody;
			static SymbolTerm* const  ATOM_anyone;
			static SymbolTerm* const  ATOM_anything;
			static SymbolTerm* const  ATOM_nobody;
			static SymbolTerm* const  ATOM_nothing;




		static Operation PRED_quantifier_pron_3_static_exec(Prolog* m);

	private:
		static Operation quantifier_pron_3_var(Prolog* m);

		static Operation quantifier_pron_3_var_1(Prolog* m);

		static Operation quantifier_pron_3_var_2(Prolog* m);

		static Operation quantifier_pron_3_var_3(Prolog* m);

		static Operation quantifier_pron_3_var_4(Prolog* m);

		static Operation quantifier_pron_3_var_5(Prolog* m);

		static Operation quantifier_pron_3_var_6(Prolog* m);

		static Operation quantifier_pron_3_var_7(Prolog* m);

		static Operation quantifier_pron_3_var_8(Prolog* m);

		static Operation quantifier_pron_3_var_9(Prolog* m);

		static Operation quantifier_pron_3_var_10(Prolog* m);

		static Operation quantifier_pron_3_1(Prolog* m);

		static Operation quantifier_pron_3_2(Prolog* m);

		static Operation quantifier_pron_3_3(Prolog* m);

		static Operation quantifier_pron_3_4(Prolog* m);

		static Operation quantifier_pron_3_5(Prolog* m);

		static Operation quantifier_pron_3_6(Prolog* m);

		static Operation quantifier_pron_3_7(Prolog* m);

		static Operation quantifier_pron_3_8(Prolog* m);

		static Operation quantifier_pron_3_9(Prolog* m);

		static Operation quantifier_pron_3_10(Prolog* m);

		static Operation quantifier_pron_3_11(Prolog* m);
	/** PREDICATE: prep/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(prep/1,public)
		public:
			static SymbolTerm* const  ATOM_to;
			static SymbolTerm* const  ATOM_with;
			static SymbolTerm* const  ATOM_on;




		static Operation PRED_prep_1_static_exec(Prolog* m);

	private:
		static Operation prep_1_var(Prolog* m);

		static Operation prep_1_var_1(Prolog* m);

		static Operation prep_1_var_2(Prolog* m);

		static Operation prep_1_var_3(Prolog* m);

		static Operation prep_1_var_4(Prolog* m);

		static Operation prep_1_var_5(Prolog* m);

		static Operation prep_1_var_6(Prolog* m);

		static Operation prep_1_var_7(Prolog* m);

		static Operation prep_1_var_8(Prolog* m);

		static Operation prep_1_var_9(Prolog* m);

		static Operation prep_1_var_10(Prolog* m);

		static Operation prep_1_1(Prolog* m);

		static Operation prep_1_2(Prolog* m);

		static Operation prep_1_3(Prolog* m);

		static Operation prep_1_4(Prolog* m);

		static Operation prep_1_5(Prolog* m);

		static Operation prep_1_6(Prolog* m);

		static Operation prep_1_7(Prolog* m);

		static Operation prep_1_8(Prolog* m);

		static Operation prep_1_9(Prolog* m);

		static Operation prep_1_10(Prolog* m);

		static Operation prep_1_11(Prolog* m);
	/** PREDICATE: noun_form/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(noun_form/3,public)
		public:
			static SymbolTerm* const  ATOM_proportion;
			static SymbolTerm* const  ATOM_percentage;




		static Operation PRED_noun_form_3_static_exec(Prolog* m);

	private:
		static Operation noun_form_3_var(Prolog* m);

		static Operation noun_form_3_var_1(Prolog* m);

		static Operation noun_form_3_var_2(Prolog* m);

		static Operation noun_form_3_var_3(Prolog* m);

		static Operation noun_form_3_int(Prolog* m);

		static Operation noun_form_3_int_1(Prolog* m);

		static Operation noun_form_3_1(Prolog* m);

		static Operation noun_form_3_2(Prolog* m);

		static Operation noun_form_3_3(Prolog* m);

		static Operation noun_form_3_4(Prolog* m);
	/** PREDICATE: root_form/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(root_form/1,public)
		static StructureTerm* const  L_root_form_1_s5;
		static StructureTerm* const  L_root_form_1_s9;
		static StructureTerm* const  L_root_form_1_s12;




	public:
		static Operation PRED_root_form_1_static_exec(Prolog* m);

	private:
		static Operation root_form_1_var(Prolog* m);

		static Operation root_form_1_var_1(Prolog* m);

		static Operation root_form_1_var_2(Prolog* m);

		static Operation root_form_1_var_3(Prolog* m);

		static Operation root_form_1_1(Prolog* m);

		static Operation root_form_1_2(Prolog* m);

		static Operation root_form_1_3(Prolog* m);

		static Operation root_form_1_4(Prolog* m);
	/** PREDICATE: verb_root/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(verb_root/1,public)
		public:
			static SymbolTerm* const  ATOM_contain;
			static SymbolTerm* const  ATOM_drain;
			static SymbolTerm* const  ATOM_exceed;
			static SymbolTerm* const  ATOM_rise;




		static Operation PRED_verb_root_1_static_exec(Prolog* m);

	private:
		static Operation verb_root_1_var(Prolog* m);

		static Operation verb_root_1_var_1(Prolog* m);

		static Operation verb_root_1_var_2(Prolog* m);

		static Operation verb_root_1_var_3(Prolog* m);

		static Operation verb_root_1_var_4(Prolog* m);

		static Operation verb_root_1_var_5(Prolog* m);

		static Operation verb_root_1_var_6(Prolog* m);

		static Operation verb_root_1_var_7(Prolog* m);

		static Operation verb_root_1_var_8(Prolog* m);

		static Operation verb_root_1_1(Prolog* m);

		static Operation verb_root_1_2(Prolog* m);

		static Operation verb_root_1_3(Prolog* m);

		static Operation verb_root_1_4(Prolog* m);

		static Operation verb_root_1_5(Prolog* m);

		static Operation verb_root_1_6(Prolog* m);

		static Operation verb_root_1_7(Prolog* m);

		static Operation verb_root_1_8(Prolog* m);

		static Operation verb_root_1_9(Prolog* m);
	/** PREDICATE: regular_pres/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(regular_pres/1,public)




	public:
		static Operation PRED_regular_pres_1_static_exec(Prolog* m);

	private:
		static Operation regular_pres_1_var(Prolog* m);

		static Operation regular_pres_1_var_1(Prolog* m);

		static Operation regular_pres_1_var_2(Prolog* m);

		static Operation regular_pres_1_var_3(Prolog* m);

		static Operation regular_pres_1_var_4(Prolog* m);

		static Operation regular_pres_1_var_5(Prolog* m);

		static Operation regular_pres_1_var_6(Prolog* m);

		static Operation regular_pres_1_var_7(Prolog* m);

		static Operation regular_pres_1_1(Prolog* m);

		static Operation regular_pres_1_2(Prolog* m);

		static Operation regular_pres_1_3(Prolog* m);

		static Operation regular_pres_1_4(Prolog* m);

		static Operation regular_pres_1_5(Prolog* m);

		static Operation regular_pres_1_6(Prolog* m);

		static Operation regular_pres_1_7(Prolog* m);

		static Operation regular_pres_1_8(Prolog* m);
	/** PREDICATE: regular_past/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(regular_past/2,public)
		public:
			static SymbolTerm* const  ATOM_had;
			static SymbolTerm* const  ATOM_contained;
			static SymbolTerm* const  ATOM_drained;
			static SymbolTerm* const  ATOM_exceeded;
			static SymbolTerm* const  ATOM_flowed;




		static Operation PRED_regular_past_2_static_exec(Prolog* m);

	private:
		static Operation regular_past_2_var(Prolog* m);

		static Operation regular_past_2_var_1(Prolog* m);

		static Operation regular_past_2_var_2(Prolog* m);

		static Operation regular_past_2_var_3(Prolog* m);

		static Operation regular_past_2_var_4(Prolog* m);

		static Operation regular_past_2_var_5(Prolog* m);

		static Operation regular_past_2_1(Prolog* m);

		static Operation regular_past_2_2(Prolog* m);

		static Operation regular_past_2_3(Prolog* m);

		static Operation regular_past_2_4(Prolog* m);

		static Operation regular_past_2_5(Prolog* m);

		static Operation regular_past_2_6(Prolog* m);
	/** PREDICATE: rel_pron/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(rel_pron/2,public)




	public:
		static Operation PRED_rel_pron_2_static_exec(Prolog* m);

	private:
		static Operation rel_pron_2_var(Prolog* m);

		static Operation rel_pron_2_var_1(Prolog* m);

		static Operation rel_pron_2_var_2(Prolog* m);

		static Operation rel_pron_2_1(Prolog* m);

		static Operation rel_pron_2_2(Prolog* m);

		static Operation rel_pron_2_3(Prolog* m);
	/** PREDICATE: poss_pron/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(poss_pron/4,public)
		public:
			static SymbolTerm* const  ATOM_my;
			static SymbolTerm* const  ATOM_your;
			static SymbolTerm* const  ATOM_his;
			static SymbolTerm* const  ATOM_masc;
			static SymbolTerm* const  ATOM_her;
			static SymbolTerm* const  ATOM_fem;
			static SymbolTerm* const  ATOM_its;
			static SymbolTerm* const  ATOM_neut;
			static SymbolTerm* const  ATOM_our;
			static SymbolTerm* const  ATOM_their;




		static Operation PRED_poss_pron_4_static_exec(Prolog* m);

	private:
		static Operation poss_pron_4_var(Prolog* m);

		static Operation poss_pron_4_var_1(Prolog* m);

		static Operation poss_pron_4_var_2(Prolog* m);

		static Operation poss_pron_4_var_3(Prolog* m);

		static Operation poss_pron_4_var_4(Prolog* m);

		static Operation poss_pron_4_var_5(Prolog* m);

		static Operation poss_pron_4_var_6(Prolog* m);

		static Operation poss_pron_4_1(Prolog* m);

		static Operation poss_pron_4_2(Prolog* m);

		static Operation poss_pron_4_3(Prolog* m);

		static Operation poss_pron_4_4(Prolog* m);

		static Operation poss_pron_4_5(Prolog* m);

		static Operation poss_pron_4_6(Prolog* m);

		static Operation poss_pron_4_7(Prolog* m);
	/** PREDICATE: pers_pron/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(pers_pron/5,public)
		public:
			static SymbolTerm* const  ATOM_i;
			static SymbolTerm* const  ATOM_he;
			static SymbolTerm* const  ATOM_she;
			static SymbolTerm* const  ATOM_it;
			static SymbolTerm* const  ATOM_we;
			static SymbolTerm* const  ATOM_them;
			static SymbolTerm* const  ATOM_me;
			static SymbolTerm* const  FUNCTOR_compl_1;
			static SymbolTerm* const  ATOM_him;
			static SymbolTerm* const  ATOM_us;

		// private final Term arg5;




		static Operation PRED_pers_pron_5_static_exec(Prolog* m);

	private:
		static Operation pers_pron_5_var(Prolog* m);

		static Operation pers_pron_5_var_1(Prolog* m);

		static Operation pers_pron_5_var_2(Prolog* m);

		static Operation pers_pron_5_var_3(Prolog* m);

		static Operation pers_pron_5_var_4(Prolog* m);

		static Operation pers_pron_5_var_5(Prolog* m);

		static Operation pers_pron_5_var_6(Prolog* m);

		static Operation pers_pron_5_var_7(Prolog* m);

		static Operation pers_pron_5_var_8(Prolog* m);

		static Operation pers_pron_5_var_9(Prolog* m);

		static Operation pers_pron_5_var_10(Prolog* m);

		static Operation pers_pron_5_var_11(Prolog* m);

		static Operation pers_pron_5_1(Prolog* m);

		static Operation pers_pron_5_2(Prolog* m);

		static Operation pers_pron_5_3(Prolog* m);

		static Operation pers_pron_5_4(Prolog* m);

		static Operation pers_pron_5_5(Prolog* m);

		static Operation pers_pron_5_6(Prolog* m);

		static Operation pers_pron_5_7(Prolog* m);

		static Operation pers_pron_5_8(Prolog* m);

		static Operation pers_pron_5_9(Prolog* m);

		static Operation pers_pron_5_10(Prolog* m);

		static Operation pers_pron_5_11(Prolog* m);

		static Operation pers_pron_5_12(Prolog* m);
	/** PREDICATE: terminator/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(terminator/2,public)




	public:
		static Operation PRED_terminator_2_static_exec(Prolog* m);

	private:
		static Operation terminator_2_var(Prolog* m);

		static Operation terminator_2_var_1(Prolog* m);

		static Operation terminator_2_var_2(Prolog* m);

		static Operation terminator_2_1(Prolog* m);

		static Operation terminator_2_2(Prolog* m);

		static Operation terminator_2_3(Prolog* m);
	/** PREDICATE: name/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(name/1,public)




	public:
		static Operation PRED_name_1_static_exec(Prolog* m);
	/** PREDICATE: loc_pred/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(loc_pred/2,public)
			static SymbolTerm* const  ATOM_east;
			static SymbolTerm* const  ATOM_eastof;
	private:
		static StructureTerm* const  L_loc_pred_2_s5;
		public:
			static SymbolTerm* const  ATOM_west;
			static SymbolTerm* const  ATOM_westof;
	private:
		static StructureTerm* const  L_loc_pred_2_s9;
		public:
			static SymbolTerm* const  ATOM_north;
			static SymbolTerm* const  ATOM_northof;
	private:
		static StructureTerm* const  L_loc_pred_2_s13;
		public:
			static SymbolTerm* const  ATOM_southof;
	private:
		static StructureTerm* const  L_loc_pred_2_s17;




	public:
		static Operation PRED_loc_pred_2_static_exec(Prolog* m);

	private:
		static Operation loc_pred_2_var(Prolog* m);

		static Operation loc_pred_2_var_1(Prolog* m);

		static Operation loc_pred_2_var_2(Prolog* m);

		static Operation loc_pred_2_var_3(Prolog* m);

		static Operation loc_pred_2_1(Prolog* m);

		static Operation loc_pred_2_2(Prolog* m);

		static Operation loc_pred_2_3(Prolog* m);

		static Operation loc_pred_2_4(Prolog* m);
	/** PREDICATE: adj/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(adj/2,public)
		public:
			static SymbolTerm* const  ATOM_minimum;
			static SymbolTerm* const  ATOM_restr;
			static SymbolTerm* const  ATOM_maximum;
			static SymbolTerm* const  ATOM_great;
			static SymbolTerm* const  ATOM_big;
			static SymbolTerm* const  ATOM_small;
			static SymbolTerm* const  ATOM_old;
			static SymbolTerm* const  ATOM_new;
			static SymbolTerm* const  ATOM_populous;




		static Operation PRED_adj_2_static_exec(Prolog* m);

	private:
		static Operation adj_2_var(Prolog* m);

		static Operation adj_2_var_1(Prolog* m);

		static Operation adj_2_var_2(Prolog* m);

		static Operation adj_2_var_3(Prolog* m);

		static Operation adj_2_var_4(Prolog* m);

		static Operation adj_2_var_5(Prolog* m);

		static Operation adj_2_var_6(Prolog* m);

		static Operation adj_2_var_7(Prolog* m);

		static Operation adj_2_var_8(Prolog* m);

		static Operation adj_2_var_9(Prolog* m);

		static Operation adj_2_var_10(Prolog* m);

		static Operation adj_2_var_11(Prolog* m);

		static Operation adj_2_var_12(Prolog* m);

		static Operation adj_2_var_13(Prolog* m);

		static Operation adj_2_var_14(Prolog* m);

		static Operation adj_2_1(Prolog* m);

		static Operation adj_2_2(Prolog* m);

		static Operation adj_2_3(Prolog* m);

		static Operation adj_2_4(Prolog* m);

		static Operation adj_2_5(Prolog* m);

		static Operation adj_2_6(Prolog* m);

		static Operation adj_2_7(Prolog* m);

		static Operation adj_2_8(Prolog* m);

		static Operation adj_2_9(Prolog* m);

		static Operation adj_2_10(Prolog* m);

		static Operation adj_2_11(Prolog* m);

		static Operation adj_2_12(Prolog* m);

		static Operation adj_2_13(Prolog* m);

		static Operation adj_2_14(Prolog* m);

		static Operation adj_2_15(Prolog* m);
	/** PREDICATE: rel_adj/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(rel_adj/2,public)
		public:
			static SymbolTerm* const  ATOM_greater;
			static SymbolTerm* const  ATOM_bigger;
			static SymbolTerm* const  ATOM_smaller;
			static SymbolTerm* const  ATOM_larger;
			static SymbolTerm* const  ATOM_older;
			static SymbolTerm* const  ATOM_newer;




		static Operation PRED_rel_adj_2_static_exec(Prolog* m);

	private:
		static Operation rel_adj_2_var(Prolog* m);

		static Operation rel_adj_2_var_1(Prolog* m);

		static Operation rel_adj_2_var_2(Prolog* m);

		static Operation rel_adj_2_var_3(Prolog* m);

		static Operation rel_adj_2_var_4(Prolog* m);

		static Operation rel_adj_2_var_5(Prolog* m);

		static Operation rel_adj_2_var_6(Prolog* m);

		static Operation rel_adj_2_1(Prolog* m);

		static Operation rel_adj_2_2(Prolog* m);

		static Operation rel_adj_2_3(Prolog* m);

		static Operation rel_adj_2_4(Prolog* m);

		static Operation rel_adj_2_5(Prolog* m);

		static Operation rel_adj_2_6(Prolog* m);

		static Operation rel_adj_2_7(Prolog* m);
	/** PREDICATE: sup_adj/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(sup_adj/2,public)
		public:
			static SymbolTerm* const  ATOM_biggest;
			static SymbolTerm* const  ATOM_oldest;
			static SymbolTerm* const  ATOM_newest;




		static Operation PRED_sup_adj_2_static_exec(Prolog* m);

	private:
		static Operation sup_adj_2_var(Prolog* m);

		static Operation sup_adj_2_var_1(Prolog* m);

		static Operation sup_adj_2_var_2(Prolog* m);

		static Operation sup_adj_2_var_3(Prolog* m);

		static Operation sup_adj_2_var_4(Prolog* m);

		static Operation sup_adj_2_1(Prolog* m);

		static Operation sup_adj_2_2(Prolog* m);

		static Operation sup_adj_2_3(Prolog* m);

		static Operation sup_adj_2_4(Prolog* m);

		static Operation sup_adj_2_5(Prolog* m);
	/** PREDICATE: noun_sin/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(noun_sin/1,public)
		public:
			static SymbolTerm* const  ATOM_sum;
			static SymbolTerm* const  ATOM_degree;
			static SymbolTerm* const  ATOM_sqmile;
			static SymbolTerm* const  ATOM_ksqmile;
			static SymbolTerm* const  ATOM_thousand;
			static SymbolTerm* const  ATOM_million;
			static SymbolTerm* const  ATOM_city;
			static SymbolTerm* const  ATOM_latitude;
			static SymbolTerm* const  ATOM_longitude;
			static SymbolTerm* const  ATOM_population;
			static SymbolTerm* const  ATOM_region;
			static SymbolTerm* const  ATOM_sea;
			static SymbolTerm* const  ATOM_seamass;
			static SymbolTerm* const  ATOM_number;




		static Operation PRED_noun_sin_1_static_exec(Prolog* m);

	private:
		static Operation noun_sin_1_var(Prolog* m);

		static Operation noun_sin_1_var_1(Prolog* m);

		static Operation noun_sin_1_var_2(Prolog* m);

		static Operation noun_sin_1_var_3(Prolog* m);

		static Operation noun_sin_1_var_4(Prolog* m);

		static Operation noun_sin_1_var_5(Prolog* m);

		static Operation noun_sin_1_var_6(Prolog* m);

		static Operation noun_sin_1_var_7(Prolog* m);

		static Operation noun_sin_1_var_8(Prolog* m);

		static Operation noun_sin_1_var_9(Prolog* m);

		static Operation noun_sin_1_var_10(Prolog* m);

		static Operation noun_sin_1_var_11(Prolog* m);

		static Operation noun_sin_1_var_12(Prolog* m);

		static Operation noun_sin_1_var_13(Prolog* m);

		static Operation noun_sin_1_var_14(Prolog* m);

		static Operation noun_sin_1_var_15(Prolog* m);

		static Operation noun_sin_1_var_16(Prolog* m);

		static Operation noun_sin_1_var_17(Prolog* m);

		static Operation noun_sin_1_var_18(Prolog* m);

		static Operation noun_sin_1_var_19(Prolog* m);

		static Operation noun_sin_1_var_20(Prolog* m);

		static Operation noun_sin_1_var_21(Prolog* m);

		static Operation noun_sin_1_var_22(Prolog* m);

		static Operation noun_sin_1_var_23(Prolog* m);

		static Operation noun_sin_1_var_24(Prolog* m);

		static Operation noun_sin_1_1(Prolog* m);

		static Operation noun_sin_1_2(Prolog* m);

		static Operation noun_sin_1_3(Prolog* m);

		static Operation noun_sin_1_4(Prolog* m);

		static Operation noun_sin_1_5(Prolog* m);

		static Operation noun_sin_1_6(Prolog* m);

		static Operation noun_sin_1_7(Prolog* m);

		static Operation noun_sin_1_8(Prolog* m);

		static Operation noun_sin_1_9(Prolog* m);

		static Operation noun_sin_1_10(Prolog* m);

		static Operation noun_sin_1_11(Prolog* m);

		static Operation noun_sin_1_12(Prolog* m);

		static Operation noun_sin_1_13(Prolog* m);

		static Operation noun_sin_1_14(Prolog* m);

		static Operation noun_sin_1_15(Prolog* m);

		static Operation noun_sin_1_16(Prolog* m);

		static Operation noun_sin_1_17(Prolog* m);

		static Operation noun_sin_1_18(Prolog* m);

		static Operation noun_sin_1_19(Prolog* m);

		static Operation noun_sin_1_20(Prolog* m);

		static Operation noun_sin_1_21(Prolog* m);

		static Operation noun_sin_1_22(Prolog* m);

		static Operation noun_sin_1_23(Prolog* m);

		static Operation noun_sin_1_24(Prolog* m);

		static Operation noun_sin_1_25(Prolog* m);
	/** PREDICATE: noun_plu/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(noun_plu/2,public)
		public:
			static SymbolTerm* const  ATOM_averages;
			static SymbolTerm* const  ATOM_totals;
			static SymbolTerm* const  ATOM_sums;
			static SymbolTerm* const  ATOM_degrees;
			static SymbolTerm* const  ATOM_sqmiles;
			static SymbolTerm* const  ATOM_ksqmiles;
			static SymbolTerm* const  ATOM_times;
			static SymbolTerm* const  ATOM_places;
			static SymbolTerm* const  ATOM_areas;
			static SymbolTerm* const  ATOM_cities;
			static SymbolTerm* const  ATOM_continents;
			static SymbolTerm* const  ATOM_latitudes;
			static SymbolTerm* const  ATOM_longitudes;
			static SymbolTerm* const  ATOM_oceans;
			static SymbolTerm* const  ATOM_persons;
			static SymbolTerm* const  ATOM_people;
			static SymbolTerm* const  ATOM_populations;
			static SymbolTerm* const  ATOM_regions;
			static SymbolTerm* const  ATOM_seamasses;
			static SymbolTerm* const  ATOM_numbers;




		static Operation PRED_noun_plu_2_static_exec(Prolog* m);

	private:
		static Operation noun_plu_2_var(Prolog* m);

		static Operation noun_plu_2_var_1(Prolog* m);

		static Operation noun_plu_2_var_2(Prolog* m);

		static Operation noun_plu_2_var_3(Prolog* m);

		static Operation noun_plu_2_var_4(Prolog* m);

		static Operation noun_plu_2_var_5(Prolog* m);

		static Operation noun_plu_2_var_6(Prolog* m);

		static Operation noun_plu_2_var_7(Prolog* m);

		static Operation noun_plu_2_var_8(Prolog* m);

		static Operation noun_plu_2_var_9(Prolog* m);

		static Operation noun_plu_2_var_10(Prolog* m);

		static Operation noun_plu_2_var_11(Prolog* m);

		static Operation noun_plu_2_var_12(Prolog* m);

		static Operation noun_plu_2_var_13(Prolog* m);

		static Operation noun_plu_2_var_14(Prolog* m);

		static Operation noun_plu_2_var_15(Prolog* m);

		static Operation noun_plu_2_var_16(Prolog* m);

		static Operation noun_plu_2_var_17(Prolog* m);

		static Operation noun_plu_2_var_18(Prolog* m);

		static Operation noun_plu_2_var_19(Prolog* m);

		static Operation noun_plu_2_var_20(Prolog* m);

		static Operation noun_plu_2_var_21(Prolog* m);

		static Operation noun_plu_2_var_22(Prolog* m);

		static Operation noun_plu_2_var_23(Prolog* m);

		static Operation noun_plu_2_var_24(Prolog* m);

		static Operation noun_plu_2_var_25(Prolog* m);

		static Operation noun_plu_2_1(Prolog* m);

		static Operation noun_plu_2_2(Prolog* m);

		static Operation noun_plu_2_3(Prolog* m);

		static Operation noun_plu_2_4(Prolog* m);

		static Operation noun_plu_2_5(Prolog* m);

		static Operation noun_plu_2_6(Prolog* m);

		static Operation noun_plu_2_7(Prolog* m);

		static Operation noun_plu_2_8(Prolog* m);

		static Operation noun_plu_2_9(Prolog* m);

		static Operation noun_plu_2_10(Prolog* m);

		static Operation noun_plu_2_11(Prolog* m);

		static Operation noun_plu_2_12(Prolog* m);

		static Operation noun_plu_2_13(Prolog* m);

		static Operation noun_plu_2_14(Prolog* m);

		static Operation noun_plu_2_15(Prolog* m);

		static Operation noun_plu_2_16(Prolog* m);

		static Operation noun_plu_2_17(Prolog* m);

		static Operation noun_plu_2_18(Prolog* m);

		static Operation noun_plu_2_19(Prolog* m);

		static Operation noun_plu_2_20(Prolog* m);

		static Operation noun_plu_2_21(Prolog* m);

		static Operation noun_plu_2_22(Prolog* m);

		static Operation noun_plu_2_23(Prolog* m);

		static Operation noun_plu_2_24(Prolog* m);

		static Operation noun_plu_2_25(Prolog* m);

		static Operation noun_plu_2_26(Prolog* m);
	/** PREDICATE: verb_form/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(verb_form/4,public)
		static StructureTerm* const  L_verb_form_4_s6;
		public:
			static SymbolTerm* const  ATOM_am;
	private:
		static StructureTerm* const  L_verb_form_4_s13;
		static StructureTerm* const  L_verb_form_4_s17;
		static StructureTerm* const  L_verb_form_4_s21;
		public:
			static SymbolTerm* const  ATOM_was;
	private:
		static StructureTerm* const  L_verb_form_4_s25;
		public:
			static SymbolTerm* const  ATOM_were;
			static SymbolTerm* const  ATOM_been;
	private:
		static StructureTerm* const  L_verb_form_4_s30;
		public:
			static SymbolTerm* const  ATOM_being;
	private:
		static StructureTerm* const  L_verb_form_4_s33;
		public:
			static SymbolTerm* const  ATOM_has;
			static SymbolTerm* const  ATOM_having;
			static SymbolTerm* const  ATOM_did;
			static SymbolTerm* const  ATOM_doing;
			static SymbolTerm* const  ATOM_done;
			static SymbolTerm* const  ATOM_flowing;
			static SymbolTerm* const  ATOM_rises;
			static SymbolTerm* const  ATOM_rose;
			static SymbolTerm* const  ATOM_risen;
			static SymbolTerm* const  ATOM_contains;
			static SymbolTerm* const  ATOM_containing;
			static SymbolTerm* const  ATOM_drains;
			static SymbolTerm* const  ATOM_draining;
			static SymbolTerm* const  ATOM_exceeds;
			static SymbolTerm* const  ATOM_exceeding;




		static Operation PRED_verb_form_4_static_exec(Prolog* m);

	private:
		static Operation verb_form_4_var(Prolog* m);

		static Operation verb_form_4_var_1(Prolog* m);

		static Operation verb_form_4_var_2(Prolog* m);

		static Operation verb_form_4_var_3(Prolog* m);

		static Operation verb_form_4_var_4(Prolog* m);

		static Operation verb_form_4_var_5(Prolog* m);

		static Operation verb_form_4_var_6(Prolog* m);

		static Operation verb_form_4_var_7(Prolog* m);

		static Operation verb_form_4_var_8(Prolog* m);

		static Operation verb_form_4_var_9(Prolog* m);

		static Operation verb_form_4_var_10(Prolog* m);

		static Operation verb_form_4_var_11(Prolog* m);

		static Operation verb_form_4_var_12(Prolog* m);

		static Operation verb_form_4_var_13(Prolog* m);

		static Operation verb_form_4_var_14(Prolog* m);

		static Operation verb_form_4_var_15(Prolog* m);

		static Operation verb_form_4_var_16(Prolog* m);

		static Operation verb_form_4_var_17(Prolog* m);

		static Operation verb_form_4_var_18(Prolog* m);

		static Operation verb_form_4_var_19(Prolog* m);

		static Operation verb_form_4_var_20(Prolog* m);

		static Operation verb_form_4_var_21(Prolog* m);

		static Operation verb_form_4_var_22(Prolog* m);

		static Operation verb_form_4_var_23(Prolog* m);

		static Operation verb_form_4_var_24(Prolog* m);

		static Operation verb_form_4_var_25(Prolog* m);

		static Operation verb_form_4_var_26(Prolog* m);

		static Operation verb_form_4_var_27(Prolog* m);

		static Operation verb_form_4_var_28(Prolog* m);

		static Operation verb_form_4_var_29(Prolog* m);

		static Operation verb_form_4_var_30(Prolog* m);

		static Operation verb_form_4_var_31(Prolog* m);

		static Operation verb_form_4_int(Prolog* m);

		static Operation verb_form_4_int_1(Prolog* m);

		static Operation verb_form_4_int_2(Prolog* m);

		static Operation verb_form_4_1(Prolog* m);

		static Operation verb_form_4_2(Prolog* m);

		static Operation verb_form_4_3(Prolog* m);

		static Operation verb_form_4_4(Prolog* m);

		static Operation verb_form_4_5(Prolog* m);

		static Operation verb_form_4_6(Prolog* m);

		static Operation verb_form_4_7(Prolog* m);

		static Operation verb_form_4_8(Prolog* m);

		static Operation verb_form_4_9(Prolog* m);

		static Operation verb_form_4_10(Prolog* m);

		static Operation verb_form_4_11(Prolog* m);

		static Operation verb_form_4_12(Prolog* m);

		static Operation verb_form_4_13(Prolog* m);

		static Operation verb_form_4_14(Prolog* m);

		static Operation verb_form_4_15(Prolog* m);

		static Operation verb_form_4_16(Prolog* m);

		static Operation verb_form_4_17(Prolog* m);

		static Operation verb_form_4_18(Prolog* m);

		static Operation verb_form_4_19(Prolog* m);

		static Operation verb_form_4_20(Prolog* m);

		static Operation verb_form_4_21(Prolog* m);

		static Operation verb_form_4_22(Prolog* m);

		static Operation verb_form_4_23(Prolog* m);

		static Operation verb_form_4_24(Prolog* m);

		static Operation verb_form_4_25(Prolog* m);

		static Operation verb_form_4_26(Prolog* m);

		static Operation verb_form_4_27(Prolog* m);

		static Operation verb_form_4_28(Prolog* m);

		static Operation verb_form_4_29(Prolog* m);

		static Operation verb_form_4_30(Prolog* m);

		static Operation verb_form_4_31(Prolog* m);

		static Operation verb_form_4_32(Prolog* m);
	/** PREDICATE: verb_type/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(verb_type/2,public)
		static StructureTerm* const  L_verb_type_2_s5;
		static StructureTerm* const  L_verb_type_2_s8;
		static StructureTerm* const  L_verb_type_2_s12;
		static StructureTerm* const  L_verb_type_2_s17;
		static StructureTerm* const  L_verb_type_2_s21;




	public:
		static Operation PRED_verb_type_2_static_exec(Prolog* m);

	private:
		static Operation verb_type_2_var(Prolog* m);

		static Operation verb_type_2_var_1(Prolog* m);

		static Operation verb_type_2_var_2(Prolog* m);

		static Operation verb_type_2_var_3(Prolog* m);

		static Operation verb_type_2_var_4(Prolog* m);

		static Operation verb_type_2_var_5(Prolog* m);

		static Operation verb_type_2_var_6(Prolog* m);

		static Operation verb_type_2_var_7(Prolog* m);

		static Operation verb_type_2_var_8(Prolog* m);

		static Operation verb_type_2_1(Prolog* m);

		static Operation verb_type_2_2(Prolog* m);

		static Operation verb_type_2_3(Prolog* m);

		static Operation verb_type_2_4(Prolog* m);

		static Operation verb_type_2_5(Prolog* m);

		static Operation verb_type_2_6(Prolog* m);

		static Operation verb_type_2_7(Prolog* m);

		static Operation verb_type_2_8(Prolog* m);

		static Operation verb_type_2_9(Prolog* m);
	/** PREDICATE: adverb/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/chat_parser.pl
	*/
		// main(adverb/1,public)
		public:
			static SymbolTerm* const  ATOM_yesterday;
			static SymbolTerm* const  ATOM_tomorrow;




		static Operation PRED_adverb_1_static_exec(Prolog* m);

	private:
		static Operation adverb_1_var(Prolog* m);

		static Operation adverb_1_var_1(Prolog* m);

		static Operation adverb_1_1(Prolog* m);

		static Operation adverb_1_2(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_chat_parser::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_CHAT_PARSER
