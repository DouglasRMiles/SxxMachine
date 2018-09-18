#ifndef FILE_NAND
#define FILE_NAND

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class ListTerm; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class IntegerTerm; }

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
	class FILE_nand : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog* m);
	/** PREDICATE: main/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(main/1,public)




		static Operation PRED_main_1_static_exec(Prolog* m);

	private:
		static Operation main_1_sub_1(Prolog* m);

		static Operation main_1_1(Prolog* m);

		static Operation main_1_2(Prolog* m);
	/** PREDICATE: init_state/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(init_state/4,public)
		public:
			static SymbolTerm* const  FUNCTOR_function_8;
	private:
		static ListTerm* const  L_init_state_4_s7;
		static ListTerm* const  L_init_state_4_s8;
		static ListTerm* const  L_init_state_4_s9;
		static ListTerm* const  L_init_state_4_s10;
		static StructureTerm* const  L_init_state_4_s12;
		static ListTerm* const  L_init_state_4_s13;
		static ListTerm* const  L_init_state_4_s14;
		static ListTerm* const  L_init_state_4_s15;
		static StructureTerm* const  L_init_state_4_s17;
		static ListTerm* const  L_init_state_4_s18;
		static ListTerm* const  L_init_state_4_s19;
		static StructureTerm* const  L_init_state_4_s21;
		static ListTerm* const  L_init_state_4_s22;
		static ListTerm* const  L_init_state_4_s23;
		static ListTerm* const  L_init_state_4_s24;
		public:
			static IntegerTerm* const  int_100;
	private:
		static ListTerm* const  L_init_state_4_s30;
		static ListTerm* const  L_init_state_4_s31;
		static ListTerm* const  L_init_state_4_s32;
		static ListTerm* const  L_init_state_4_s33;
		static ListTerm* const  L_init_state_4_s34;
		static ListTerm* const  L_init_state_4_s35;
		static ListTerm* const  L_init_state_4_s36;
		static ListTerm* const  L_init_state_4_s37;
		static StructureTerm* const  L_init_state_4_s39;
		static ListTerm* const  L_init_state_4_s40;
		static ListTerm* const  L_init_state_4_s41;
		static ListTerm* const  L_init_state_4_s42;
		static StructureTerm* const  L_init_state_4_s44;
		static ListTerm* const  L_init_state_4_s45;
		static ListTerm* const  L_init_state_4_s46;
		static ListTerm* const  L_init_state_4_s47;
		static ListTerm* const  L_init_state_4_s48;
		static ListTerm* const  L_init_state_4_s49;
		static ListTerm* const  L_init_state_4_s50;
		static StructureTerm* const  L_init_state_4_s52;
		static ListTerm* const  L_init_state_4_s53;
		static ListTerm* const  L_init_state_4_s54;
		static ListTerm* const  L_init_state_4_s55;
		static ListTerm* const  L_init_state_4_s56;
		static ListTerm* const  L_init_state_4_s57;
		static ListTerm* const  L_init_state_4_s58;
		static ListTerm* const  L_init_state_4_s59;
		static StructureTerm* const  L_init_state_4_s61;
		static ListTerm* const  L_init_state_4_s62;
		static ListTerm* const  L_init_state_4_s63;
		static ListTerm* const  L_init_state_4_s64;
		static ListTerm* const  L_init_state_4_s65;
		static ListTerm* const  L_init_state_4_s66;
		static ListTerm* const  L_init_state_4_s67;
		static ListTerm* const  L_init_state_4_s68;
		static ListTerm* const  L_init_state_4_s69;
		static ListTerm* const  L_init_state_4_s70;
		static StructureTerm* const  L_init_state_4_s72;
		static ListTerm* const  L_init_state_4_s73;
		static ListTerm* const  L_init_state_4_s74;
		static ListTerm* const  L_init_state_4_s75;
		static ListTerm* const  L_init_state_4_s76;
		static ListTerm* const  L_init_state_4_s77;
		static ListTerm* const  L_init_state_4_s78;
		static ListTerm* const  L_init_state_4_s79;
		static StructureTerm* const  L_init_state_4_s81;
		static ListTerm* const  L_init_state_4_s82;
		static StructureTerm* const  L_init_state_4_s84;
		static ListTerm* const  L_init_state_4_s85;
		public:
			static IntegerTerm* const  int_26;
			static IntegerTerm* const  int_29;
			static IntegerTerm* const  int_31;
	private:
		static ListTerm* const  L_init_state_4_s99;
		static ListTerm* const  L_init_state_4_s100;
		static ListTerm* const  L_init_state_4_s101;
		static ListTerm* const  L_init_state_4_s102;
		static ListTerm* const  L_init_state_4_s103;
		static ListTerm* const  L_init_state_4_s104;
		static ListTerm* const  L_init_state_4_s105;
		static ListTerm* const  L_init_state_4_s106;
		static ListTerm* const  L_init_state_4_s107;
		static ListTerm* const  L_init_state_4_s108;
		static ListTerm* const  L_init_state_4_s109;
		static ListTerm* const  L_init_state_4_s110;
		static ListTerm* const  L_init_state_4_s111;
		static ListTerm* const  L_init_state_4_s112;
		static ListTerm* const  L_init_state_4_s113;
		static ListTerm* const  L_init_state_4_s114;
		public:
			static IntegerTerm* const  int_27;
			static IntegerTerm* const  int_28;
			static IntegerTerm* const  int_30;
	private:
		static ListTerm* const  L_init_state_4_s126;
		static ListTerm* const  L_init_state_4_s127;
		static ListTerm* const  L_init_state_4_s128;
		static ListTerm* const  L_init_state_4_s129;
		static ListTerm* const  L_init_state_4_s130;
		static ListTerm* const  L_init_state_4_s131;
		static ListTerm* const  L_init_state_4_s132;
		static ListTerm* const  L_init_state_4_s133;
		static ListTerm* const  L_init_state_4_s134;
		static ListTerm* const  L_init_state_4_s135;
		static ListTerm* const  L_init_state_4_s136;
		static ListTerm* const  L_init_state_4_s137;
		static ListTerm* const  L_init_state_4_s138;
		static ListTerm* const  L_init_state_4_s139;
		static ListTerm* const  L_init_state_4_s140;
		static ListTerm* const  L_init_state_4_s141;
		static StructureTerm* const  L_init_state_4_s143;
		static ListTerm* const  L_init_state_4_s144;
		static ListTerm* const  L_init_state_4_s145;
		static ListTerm* const  L_init_state_4_s146;
		static ListTerm* const  L_init_state_4_s147;
		static ListTerm* const  L_init_state_4_s148;
		static ListTerm* const  L_init_state_4_s149;
		static ListTerm* const  L_init_state_4_s150;
		static ListTerm* const  L_init_state_4_s151;
		static ListTerm* const  L_init_state_4_s152;
		static ListTerm* const  L_init_state_4_s153;
		static ListTerm* const  L_init_state_4_s154;
		static ListTerm* const  L_init_state_4_s155;
		static ListTerm* const  L_init_state_4_s156;
		static ListTerm* const  L_init_state_4_s157;
		static ListTerm* const  L_init_state_4_s158;
		static ListTerm* const  L_init_state_4_s159;
		static ListTerm* const  L_init_state_4_s160;
		static ListTerm* const  L_init_state_4_s161;
		static ListTerm* const  L_init_state_4_s162;
		static ListTerm* const  L_init_state_4_s163;
		static ListTerm* const  L_init_state_4_s164;
		static ListTerm* const  L_init_state_4_s165;
		static ListTerm* const  L_init_state_4_s166;
		static ListTerm* const  L_init_state_4_s167;
		static ListTerm* const  L_init_state_4_s168;
		static ListTerm* const  L_init_state_4_s169;
		static ListTerm* const  L_init_state_4_s170;
		static ListTerm* const  L_init_state_4_s171;
		static ListTerm* const  L_init_state_4_s172;
		static ListTerm* const  L_init_state_4_s173;
		static ListTerm* const  L_init_state_4_s174;
		static StructureTerm* const  L_init_state_4_s176;
		static ListTerm* const  L_init_state_4_s177;
		static ListTerm* const  L_init_state_4_s178;
		static ListTerm* const  L_init_state_4_s179;
		static ListTerm* const  L_init_state_4_s180;
		static ListTerm* const  L_init_state_4_s181;
		static ListTerm* const  L_init_state_4_s182;
		static ListTerm* const  L_init_state_4_s183;
		static ListTerm* const  L_init_state_4_s184;
		static ListTerm* const  L_init_state_4_s185;
		static ListTerm* const  L_init_state_4_s186;
		static ListTerm* const  L_init_state_4_s187;
		static ListTerm* const  L_init_state_4_s188;
		static ListTerm* const  L_init_state_4_s189;
		static ListTerm* const  L_init_state_4_s190;
		static ListTerm* const  L_init_state_4_s191;
		static ListTerm* const  L_init_state_4_s192;
		static ListTerm* const  L_init_state_4_s193;
		static ListTerm* const  L_init_state_4_s194;
		static ListTerm* const  L_init_state_4_s195;
		static ListTerm* const  L_init_state_4_s196;
		static ListTerm* const  L_init_state_4_s197;
		static ListTerm* const  L_init_state_4_s198;
		static ListTerm* const  L_init_state_4_s199;
		static ListTerm* const  L_init_state_4_s200;
		static ListTerm* const  L_init_state_4_s201;
		static ListTerm* const  L_init_state_4_s202;
		static ListTerm* const  L_init_state_4_s203;
		static ListTerm* const  L_init_state_4_s204;
		static ListTerm* const  L_init_state_4_s205;
		static ListTerm* const  L_init_state_4_s206;
		static StructureTerm* const  L_init_state_4_s208;
		static ListTerm* const  L_init_state_4_s209;
		static ListTerm* const  L_init_state_4_s210;
		static ListTerm* const  L_init_state_4_s211;
		static ListTerm* const  L_init_state_4_s212;
		static ListTerm* const  L_init_state_4_s213;
		static ListTerm* const  L_init_state_4_s214;
		static ListTerm* const  L_init_state_4_s215;
		static ListTerm* const  L_init_state_4_s216;
		static ListTerm* const  L_init_state_4_s217;
		static ListTerm* const  L_init_state_4_s218;
		static ListTerm* const  L_init_state_4_s219;
		static ListTerm* const  L_init_state_4_s220;
		static ListTerm* const  L_init_state_4_s221;
		static ListTerm* const  L_init_state_4_s222;
		static ListTerm* const  L_init_state_4_s223;
		static ListTerm* const  L_init_state_4_s224;
		static ListTerm* const  L_init_state_4_s225;
		static ListTerm* const  L_init_state_4_s226;
		static ListTerm* const  L_init_state_4_s227;
		static ListTerm* const  L_init_state_4_s228;
		static ListTerm* const  L_init_state_4_s229;
		static ListTerm* const  L_init_state_4_s230;
		static ListTerm* const  L_init_state_4_s231;
		static ListTerm* const  L_init_state_4_s232;
		static ListTerm* const  L_init_state_4_s233;
		static StructureTerm* const  L_init_state_4_s235;
		static ListTerm* const  L_init_state_4_s236;
		static ListTerm* const  L_init_state_4_s237;
		static ListTerm* const  L_init_state_4_s238;
		static ListTerm* const  L_init_state_4_s239;
		static ListTerm* const  L_init_state_4_s240;
		static ListTerm* const  L_init_state_4_s241;
		static ListTerm* const  L_init_state_4_s242;
		static ListTerm* const  L_init_state_4_s243;
		static ListTerm* const  L_init_state_4_s244;
		static ListTerm* const  L_init_state_4_s245;
		static ListTerm* const  L_init_state_4_s246;
		static ListTerm* const  L_init_state_4_s247;
		static ListTerm* const  L_init_state_4_s248;
		static ListTerm* const  L_init_state_4_s249;
		static ListTerm* const  L_init_state_4_s250;
		static ListTerm* const  L_init_state_4_s251;
		static ListTerm* const  L_init_state_4_s252;
		static ListTerm* const  L_init_state_4_s253;
		static ListTerm* const  L_init_state_4_s254;
		static ListTerm* const  L_init_state_4_s255;
		static ListTerm* const  L_init_state_4_s256;
		static ListTerm* const  L_init_state_4_s257;
		static ListTerm* const  L_init_state_4_s258;
		static ListTerm* const  L_init_state_4_s259;
		static StructureTerm* const  L_init_state_4_s261;
		static ListTerm* const  L_init_state_4_s262;
		static ListTerm* const  L_init_state_4_s263;
		static ListTerm* const  L_init_state_4_s264;
		static ListTerm* const  L_init_state_4_s265;
		static ListTerm* const  L_init_state_4_s266;
		static ListTerm* const  L_init_state_4_s267;
		static ListTerm* const  L_init_state_4_s268;
		static ListTerm* const  L_init_state_4_s269;
		static ListTerm* const  L_init_state_4_s270;
		static ListTerm* const  L_init_state_4_s271;
		static ListTerm* const  L_init_state_4_s272;
		static ListTerm* const  L_init_state_4_s273;
		static ListTerm* const  L_init_state_4_s274;
		static ListTerm* const  L_init_state_4_s275;
		static ListTerm* const  L_init_state_4_s276;
		static ListTerm* const  L_init_state_4_s277;
		static ListTerm* const  L_init_state_4_s278;
		static ListTerm* const  L_init_state_4_s279;
		static ListTerm* const  L_init_state_4_s280;
		static ListTerm* const  L_init_state_4_s281;
		static ListTerm* const  L_init_state_4_s282;
		static ListTerm* const  L_init_state_4_s283;
		static ListTerm* const  L_init_state_4_s284;
		static ListTerm* const  L_init_state_4_s285;
		static ListTerm* const  L_init_state_4_s286;
		static ListTerm* const  L_init_state_4_s287;
		static ListTerm* const  L_init_state_4_s288;
		static ListTerm* const  L_init_state_4_s289;
		static StructureTerm* const  L_init_state_4_s291;
		static ListTerm* const  L_init_state_4_s292;
		static ListTerm* const  L_init_state_4_s293;
		static ListTerm* const  L_init_state_4_s294;
		static ListTerm* const  L_init_state_4_s295;
		static ListTerm* const  L_init_state_4_s296;
		static ListTerm* const  L_init_state_4_s297;
		static ListTerm* const  L_init_state_4_s298;
		static ListTerm* const  L_init_state_4_s299;
		static ListTerm* const  L_init_state_4_s300;
		static ListTerm* const  L_init_state_4_s301;
		static ListTerm* const  L_init_state_4_s302;
		static ListTerm* const  L_init_state_4_s303;
		static ListTerm* const  L_init_state_4_s304;
		static ListTerm* const  L_init_state_4_s305;
		static ListTerm* const  L_init_state_4_s306;
		static ListTerm* const  L_init_state_4_s307;
		static ListTerm* const  L_init_state_4_s308;
		static ListTerm* const  L_init_state_4_s309;
		static ListTerm* const  L_init_state_4_s310;
		static ListTerm* const  L_init_state_4_s311;
		static ListTerm* const  L_init_state_4_s312;
		static ListTerm* const  L_init_state_4_s313;
		static ListTerm* const  L_init_state_4_s314;
		static ListTerm* const  L_init_state_4_s315;
		static ListTerm* const  L_init_state_4_s316;
		static ListTerm* const  L_init_state_4_s317;
		static ListTerm* const  L_init_state_4_s318;
		static StructureTerm* const  L_init_state_4_s320;
		static ListTerm* const  L_init_state_4_s321;
		static ListTerm* const  L_init_state_4_s322;
		static ListTerm* const  L_init_state_4_s323;
		static ListTerm* const  L_init_state_4_s324;
		static ListTerm* const  L_init_state_4_s325;
		static ListTerm* const  L_init_state_4_s326;
		static ListTerm* const  L_init_state_4_s327;
		static ListTerm* const  L_init_state_4_s328;
		static ListTerm* const  L_init_state_4_s329;
		static ListTerm* const  L_init_state_4_s330;
		static ListTerm* const  L_init_state_4_s331;
		static ListTerm* const  L_init_state_4_s332;
		static ListTerm* const  L_init_state_4_s333;
		static ListTerm* const  L_init_state_4_s334;
		static ListTerm* const  L_init_state_4_s335;
		static ListTerm* const  L_init_state_4_s336;
		static ListTerm* const  L_init_state_4_s337;
		static ListTerm* const  L_init_state_4_s338;
		static ListTerm* const  L_init_state_4_s339;
		static ListTerm* const  L_init_state_4_s340;
		static ListTerm* const  L_init_state_4_s341;
		static ListTerm* const  L_init_state_4_s342;
		static ListTerm* const  L_init_state_4_s343;
		static ListTerm* const  L_init_state_4_s344;
		static ListTerm* const  L_init_state_4_s345;
		static ListTerm* const  L_init_state_4_s346;
		static ListTerm* const  L_init_state_4_s347;
		static ListTerm* const  L_init_state_4_s348;
		static StructureTerm* const  L_init_state_4_s350;
		static ListTerm* const  L_init_state_4_s351;
		static ListTerm* const  L_init_state_4_s352;
		static ListTerm* const  L_init_state_4_s353;
		static ListTerm* const  L_init_state_4_s354;
		static ListTerm* const  L_init_state_4_s355;
		static ListTerm* const  L_init_state_4_s356;
		static ListTerm* const  L_init_state_4_s357;
		static ListTerm* const  L_init_state_4_s358;




	public:
		static Operation PRED_init_state_4_static_exec(Prolog* m);

	private:
		static Operation init_state_4_var(Prolog* m);

		static Operation init_state_4_var_1(Prolog* m);

		static Operation init_state_4_var_2(Prolog* m);

		static Operation init_state_4_var_3(Prolog* m);

		static Operation init_state_4_var_4(Prolog* m);

		static Operation init_state_4_var_5(Prolog* m);

		static Operation init_state_4_1(Prolog* m);

		static Operation init_state_4_2(Prolog* m);

		static Operation init_state_4_3(Prolog* m);

		static Operation init_state_4_4(Prolog* m);

		static Operation init_state_4_5(Prolog* m);

		static Operation init_state_4_6(Prolog* m);
	/** PREDICATE: search/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(search/3,public)




	public:
		static Operation PRED_search_3_static_exec(Prolog* m);

	private:
		static Operation search_3_sub_1(Prolog* m);

		static Operation search_3_1(Prolog* m);

		static Operation search_3_2(Prolog* m);
	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/1,public)
		public:
			static SymbolTerm* const  ATOM_cov;




		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_1(Prolog* m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/1,public)
		public:
			static SymbolTerm* const  ATOM_nf;




		static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_1(Prolog* m);

		static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_2(Prolog* m);
	/** PREDICATE: select_vector/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(select_vector/5,public)
		public:
			static SymbolTerm* const  ATOM_dummy;
			static IntegerTerm* const  int_999;

		// private final Term arg5;




		static Operation PRED_select_vector_5_static_exec(Prolog* m);
	/** PREDICATE: select_vector/12
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(select_vector/12,public)

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;




		static Operation PRED_select_vector_12_static_exec(Prolog* m);

	private:
		static Operation select_vector_12_var(Prolog* m);

		static Operation select_vector_12_var_1(Prolog* m);

		static Operation select_vector_12_1(Prolog* m);

		static Operation select_vector_12_2(Prolog* m);
	/** PREDICATE: select_vector/13
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(select_vector/13,public)

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13;




	public:
		static Operation PRED_select_vector_13_static_exec(Prolog* m);

	private:
		static Operation select_vector_13_var(Prolog* m);

		static Operation select_vector_13_var_1(Prolog* m);

		static Operation select_vector_13_1(Prolog* m);

		static Operation select_vector_13_2(Prolog* m);
	/** PREDICATE: vector_cover_type/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(vector_cover_type/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_vector_cover_type_6_static_exec(Prolog* m);
	/** PREDICATE: cover_type1/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(cover_type1/7,public)
			static SymbolTerm* const  FUNCTOR_$002B_2;

		// private final Term arg5, arg6, arg7;




		static Operation PRED_cover_type1_7_static_exec(Prolog* m);

	private:
		static Operation cover_type1_7_top(Prolog* m);

		static Operation cover_type1_7_var(Prolog* m);

		static Operation cover_type1_7_var_1(Prolog* m);

		static Operation cover_type1_7_var_2(Prolog* m);

		static Operation cover_type1_7_lis(Prolog* m);

		static Operation cover_type1_7_lis_1(Prolog* m);

		static Operation cover_type1_7_1(Prolog* m);

		static Operation cover_type1_7_2(Prolog* m);

		static Operation cover_type1_7_3(Prolog* m);
	/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/2,public)




	public:
		static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_1(Prolog* m);

		static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_2(Prolog* m);
	/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/4,public)
		public:
			static SymbolTerm* const  ATOM_exp;




		static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_static_exec(Prolog* m);

	private:
		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_sub_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_1(Prolog* m);

		static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_2(Prolog* m);
	/** PREDICATE: cover_type2/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(cover_type2/9,public)
		public:
			static SymbolTerm* const  ATOM_var;

		// private final Term arg5, arg6, arg7, arg8, arg9;




		static Operation PRED_cover_type2_9_static_exec(Prolog* m);

	private:
		static Operation cover_type2_9_top(Prolog* m);

		static Operation cover_type2_9_var(Prolog* m);

		static Operation cover_type2_9_var_1(Prolog* m);

		static Operation cover_type2_9_var_2(Prolog* m);

		static Operation cover_type2_9_var_3(Prolog* m);

		static Operation cover_type2_9_lis(Prolog* m);

		static Operation cover_type2_9_lis_1(Prolog* m);

		static Operation cover_type2_9_lis_2(Prolog* m);

		static Operation cover_type2_9_1(Prolog* m);

		static Operation cover_type2_9_2(Prolog* m);

		static Operation cover_type2_9_3(Prolog* m);

		static Operation cover_type2_9_4(Prolog* m);
	/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/2,public)




	public:
		static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_1(Prolog* m);

		static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_2(Prolog* m);
	/** PREDICATE: $dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/4,public)
		public:
			static SymbolTerm* const  ATOM_fcn;
			static SymbolTerm* const  ATOM_mcf;




		static Operation PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_static_exec(Prolog* m);

	private:
		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_sub_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_1(Prolog* m);

		static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_2(Prolog* m);
	/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/6,public)
		public:
			static SymbolTerm* const  ATOM_exmcf;

		// private final Term arg5, arg6;




		static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_static_exec(Prolog* m);

	private:
		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_sub_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_sub_2(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_1(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_2(Prolog* m);

		static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_3(Prolog* m);
	/** PREDICATE: $dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/4,public)
		public:
			static SymbolTerm* const  ATOM_exf;




		static Operation PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_static_exec(Prolog* m);

	private:
		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_sub_1(Prolog* m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_1(Prolog* m);

		static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_4_2(Prolog* m);
	/** PREDICATE: best_vector/12
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(best_vector/12,public)

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;




	public:
		static Operation PRED_best_vector_12_static_exec(Prolog* m);

	private:
		static Operation best_vector_12_var(Prolog* m);

		static Operation best_vector_12_var_1(Prolog* m);

		static Operation best_vector_12_var_2(Prolog* m);

		static Operation best_vector_12_var_3(Prolog* m);

		static Operation best_vector_12_var_4(Prolog* m);

		static Operation best_vector_12_var_5(Prolog* m);

		static Operation best_vector_12_var_6(Prolog* m);

		static Operation best_vector_12_var_7(Prolog* m);

		static Operation best_vector_12_var_8(Prolog* m);

		static Operation best_vector_12_var_9(Prolog* m);

		static Operation best_vector_12_int(Prolog* m);

		static Operation best_vector_12_int_1(Prolog* m);

		static Operation best_vector_12_int_2(Prolog* m);

		static Operation best_vector_12_int_3(Prolog* m);

		static Operation best_vector_12_int_4(Prolog* m);

		static Operation best_vector_12_int_5(Prolog* m);

		static Operation best_vector_12_int_6(Prolog* m);

		static Operation best_vector_12_int_7(Prolog* m);

		static Operation best_vector_12_int_8(Prolog* m);

		static Operation best_vector_12_1(Prolog* m);

		static Operation best_vector_12_2(Prolog* m);

		static Operation best_vector_12_3(Prolog* m);

		static Operation best_vector_12_4(Prolog* m);

		static Operation best_vector_12_5(Prolog* m);

		static Operation best_vector_12_6(Prolog* m);

		static Operation best_vector_12_7(Prolog* m);

		static Operation best_vector_12_8(Prolog* m);

		static Operation best_vector_12_9(Prolog* m);

		static Operation best_vector_12_10(Prolog* m);
	/** PREDICATE: $dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/1,public)




	public:
		static Operation PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_1(Prolog* m);

		static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/1,public)




	public:
		static Operation PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_1(Prolog* m);

		static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/1,public)




	public:
		static Operation PRED_$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_1(Prolog* m);

		static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/1,public)




	public:
		static Operation PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_1(Prolog* m);

		static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_13_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_13_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/1,public)




	public:
		static Operation PRED_$dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_1(Prolog* m);

		static Operation $dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_2(Prolog* m);
	/** PREDICATE: $dummy_12_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_12_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/1,public)




	public:
		static Operation PRED_$dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_static_exec(Prolog* m);

	private:
		static Operation $dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_sub_1(Prolog* m);

		static Operation $dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_1(Prolog* m);

		static Operation $dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_1_2(Prolog* m);
	/** PREDICATE: max_type/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(max_type/3,public)




	public:
		static Operation PRED_max_type_3_static_exec(Prolog* m);

	private:
		static Operation max_type_3_sub_1(Prolog* m);

		static Operation max_type_3_1(Prolog* m);

		static Operation max_type_3_2(Prolog* m);
	/** PREDICATE: $dummy_14_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_14_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/2,public)




	public:
		static Operation PRED_$dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_1(Prolog* m);

		static Operation $dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_2(Prolog* m);
	/** PREDICATE: type_order/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(type_order/2,public)




	public:
		static Operation PRED_type_order_2_static_exec(Prolog* m);

	private:
		static Operation type_order_2_var(Prolog* m);

		static Operation type_order_2_var_1(Prolog* m);

		static Operation type_order_2_var_2(Prolog* m);

		static Operation type_order_2_var_3(Prolog* m);

		static Operation type_order_2_var_4(Prolog* m);

		static Operation type_order_2_var_5(Prolog* m);

		static Operation type_order_2_var_6(Prolog* m);

		static Operation type_order_2_var_7(Prolog* m);

		static Operation type_order_2_var_8(Prolog* m);

		static Operation type_order_2_var_9(Prolog* m);

		static Operation type_order_2_var_10(Prolog* m);

		static Operation type_order_2_var_11(Prolog* m);

		static Operation type_order_2_var_12(Prolog* m);

		static Operation type_order_2_var_13(Prolog* m);

		static Operation type_order_2_var_14(Prolog* m);

		static Operation type_order_2_var_15(Prolog* m);

		static Operation type_order_2_var_16(Prolog* m);

		static Operation type_order_2_var_17(Prolog* m);

		static Operation type_order_2_var_18(Prolog* m);

		static Operation type_order_2_var_19(Prolog* m);

		static Operation type_order_2_var_20(Prolog* m);

		static Operation type_order_2_var_21(Prolog* m);

		static Operation type_order_2_var_22(Prolog* m);

		static Operation type_order_2_var_23(Prolog* m);

		static Operation type_order_2_var_24(Prolog* m);

		static Operation type_order_2_var_25(Prolog* m);

		static Operation type_order_2_var_26(Prolog* m);

		static Operation type_order_2_var_27(Prolog* m);

		static Operation type_order_2_1(Prolog* m);

		static Operation type_order_2_2(Prolog* m);

		static Operation type_order_2_3(Prolog* m);

		static Operation type_order_2_4(Prolog* m);

		static Operation type_order_2_5(Prolog* m);

		static Operation type_order_2_6(Prolog* m);

		static Operation type_order_2_7(Prolog* m);

		static Operation type_order_2_8(Prolog* m);

		static Operation type_order_2_9(Prolog* m);

		static Operation type_order_2_10(Prolog* m);

		static Operation type_order_2_11(Prolog* m);

		static Operation type_order_2_12(Prolog* m);

		static Operation type_order_2_13(Prolog* m);

		static Operation type_order_2_14(Prolog* m);

		static Operation type_order_2_15(Prolog* m);

		static Operation type_order_2_16(Prolog* m);

		static Operation type_order_2_17(Prolog* m);

		static Operation type_order_2_18(Prolog* m);

		static Operation type_order_2_19(Prolog* m);

		static Operation type_order_2_20(Prolog* m);

		static Operation type_order_2_21(Prolog* m);

		static Operation type_order_2_22(Prolog* m);

		static Operation type_order_2_23(Prolog* m);

		static Operation type_order_2_24(Prolog* m);

		static Operation type_order_2_25(Prolog* m);

		static Operation type_order_2_26(Prolog* m);

		static Operation type_order_2_27(Prolog* m);

		static Operation type_order_2_28(Prolog* m);
	/** PREDICATE: cover_vector/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(cover_vector/7,public)

		// private final Term arg5, arg6, arg7;




	public:
		static Operation PRED_cover_vector_7_static_exec(Prolog* m);
	/** PREDICATE: vector_types/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(vector_types/1,public)




		static Operation PRED_vector_types_1_static_exec(Prolog* m);

	private:
		static Operation vector_types_1_var(Prolog* m);

		static Operation vector_types_1_var_1(Prolog* m);

		static Operation vector_types_1_var_2(Prolog* m);

		static Operation vector_types_1_var_3(Prolog* m);

		static Operation vector_types_1_var_4(Prolog* m);

		static Operation vector_types_1_var_5(Prolog* m);

		static Operation vector_types_1_var_6(Prolog* m);

		static Operation vector_types_1_1(Prolog* m);

		static Operation vector_types_1_2(Prolog* m);

		static Operation vector_types_1_3(Prolog* m);

		static Operation vector_types_1_4(Prolog* m);

		static Operation vector_types_1_5(Prolog* m);

		static Operation vector_types_1_6(Prolog* m);

		static Operation vector_types_1_7(Prolog* m);
	/** PREDICATE: $dummy_15_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_15_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/2,public)




	public:
		static Operation PRED_$dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_1(Prolog* m);

		static Operation $dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_2(Prolog* m);
	/** PREDICATE: cover_vector/10
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(cover_vector/10,public)

		// private final Term arg5, arg6, arg7, arg8, arg9, arg10;




	public:
		static Operation PRED_cover_vector_10_static_exec(Prolog* m);

	private:
		static Operation cover_vector_10_top(Prolog* m);

		static Operation cover_vector_10_var(Prolog* m);

		static Operation cover_vector_10_var_1(Prolog* m);

		static Operation cover_vector_10_var_2(Prolog* m);

		static Operation cover_vector_10_var_3(Prolog* m);

		static Operation cover_vector_10_var_4(Prolog* m);

		static Operation cover_vector_10_var_5(Prolog* m);

		static Operation cover_vector_10_var_6(Prolog* m);

		static Operation cover_vector_10_var_7(Prolog* m);

		static Operation cover_vector_10_var_8(Prolog* m);

		static Operation cover_vector_10_var_9(Prolog* m);

		static Operation cover_vector_10_var_10(Prolog* m);

		static Operation cover_vector_10_var_11(Prolog* m);

		static Operation cover_vector_10_var_12(Prolog* m);

		static Operation cover_vector_10_1(Prolog* m);

		static Operation cover_vector_10_2(Prolog* m);

		static Operation cover_vector_10_3(Prolog* m);

		static Operation cover_vector_10_4(Prolog* m);

		static Operation cover_vector_10_5(Prolog* m);

		static Operation cover_vector_10_6(Prolog* m);

		static Operation cover_vector_10_7(Prolog* m);

		static Operation cover_vector_10_8(Prolog* m);

		static Operation cover_vector_10_9(Prolog* m);

		static Operation cover_vector_10_10(Prolog* m);

		static Operation cover_vector_10_11(Prolog* m);

		static Operation cover_vector_10_12(Prolog* m);

		static Operation cover_vector_10_13(Prolog* m);
	/** PREDICATE: $dummy_16_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_16_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/2,public)




	public:
		static Operation PRED_$dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_1(Prolog* m);

		static Operation $dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_2(Prolog* m);
	/** PREDICATE: $dummy_17_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_17_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/2,public)




	public:
		static Operation PRED_$dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_1(Prolog* m);

		static Operation $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_2(Prolog* m);
	/** PREDICATE: $dummy_18_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_18_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/2,public)




	public:
		static Operation PRED_$dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_1(Prolog* m);

		static Operation $dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_2(Prolog* m);
	/** PREDICATE: $dummy_19_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_19_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/2,public)




	public:
		static Operation PRED_$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_1(Prolog* m);

		static Operation $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_2(Prolog* m);
	/** PREDICATE: $dummy_20_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_20_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/2,public)




	public:
		static Operation PRED_$dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_1(Prolog* m);

		static Operation $dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_2(Prolog* m);
	/** PREDICATE: $dummy_21_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_21_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/2,public)




	public:
		static Operation PRED_$dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_static_exec(Prolog* m);

	private:
		static Operation $dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_sub_1(Prolog* m);

		static Operation $dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_1(Prolog* m);

		static Operation $dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_2_2(Prolog* m);
	/** PREDICATE: update_circuit/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(update_circuit/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_update_circuit_6_static_exec(Prolog* m);

	private:
		static Operation update_circuit_6_var(Prolog* m);

		static Operation update_circuit_6_var_1(Prolog* m);

		static Operation update_circuit_6_1(Prolog* m);

		static Operation update_circuit_6_2(Prolog* m);
	/** PREDICATE: $dummy_22_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_22_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_$dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_static_exec(Prolog* m);

	private:
		static Operation $dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_sub_1(Prolog* m);

		static Operation $dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_1(Prolog* m);

		static Operation $dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_2(Prolog* m);
	/** PREDICATE: $dummy_23_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_23_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_$dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_static_exec(Prolog* m);

	private:
		static Operation $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_sub_1(Prolog* m);

		static Operation $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_1(Prolog* m);

		static Operation $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_2(Prolog* m);
	/** PREDICATE: $dummy_34_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_34_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/3,public)




	public:
		static Operation PRED_$dummy_34_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_34_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_34_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_1(Prolog* m);

		static Operation $dummy_34_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_2(Prolog* m);
	/** PREDICATE: $dummy_24_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_24_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_$dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_static_exec(Prolog* m);

	private:
		static Operation $dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_sub_1(Prolog* m);

		static Operation $dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_1(Prolog* m);

		static Operation $dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_2(Prolog* m);
	/** PREDICATE: $dummy_25_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_25_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_$dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_static_exec(Prolog* m);

	private:
		static Operation $dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_sub_1(Prolog* m);

		static Operation $dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_1(Prolog* m);

		static Operation $dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_2(Prolog* m);
	/** PREDICATE: $dummy_35_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_35_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/3,public)




	public:
		static Operation PRED_$dummy_35_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_35_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_35_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_1(Prolog* m);

		static Operation $dummy_35_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_2(Prolog* m);
	/** PREDICATE: $dummy_26_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_26_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_$dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_static_exec(Prolog* m);

	private:
		static Operation $dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_sub_1(Prolog* m);

		static Operation $dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_1(Prolog* m);

		static Operation $dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_2(Prolog* m);
	/** PREDICATE: $dummy_27_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_27_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_$dummy_27_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_static_exec(Prolog* m);

	private:
		static Operation $dummy_27_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_sub_1(Prolog* m);

		static Operation $dummy_27_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_1(Prolog* m);

		static Operation $dummy_27_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_2(Prolog* m);
	/** PREDICATE: $dummy_28_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_28_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_$dummy_28_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_static_exec(Prolog* m);

	private:
		static Operation $dummy_28_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_sub_1(Prolog* m);

		static Operation $dummy_28_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_1(Prolog* m);

		static Operation $dummy_28_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_6_2(Prolog* m);
	/** PREDICATE: $dummy_29_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_29_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_$dummy_29_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_static_exec(Prolog* m);

	private:
		static Operation $dummy_29_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_sub_1(Prolog* m);

		static Operation $dummy_29_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_1(Prolog* m);

		static Operation $dummy_29_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_2(Prolog* m);
	/** PREDICATE: $dummy_30_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_30_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_$dummy_30_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_static_exec(Prolog* m);

	private:
		static Operation $dummy_30_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_sub_1(Prolog* m);

		static Operation $dummy_30_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_1(Prolog* m);

		static Operation $dummy_30_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_2(Prolog* m);
	/** PREDICATE: $dummy_31_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_31_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_$dummy_31_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_static_exec(Prolog* m);

	private:
		static Operation $dummy_31_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_sub_1(Prolog* m);

		static Operation $dummy_31_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_1(Prolog* m);

		static Operation $dummy_31_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_2(Prolog* m);
	/** PREDICATE: $dummy_32_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_32_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_$dummy_32_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_static_exec(Prolog* m);

	private:
		static Operation $dummy_32_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_sub_1(Prolog* m);

		static Operation $dummy_32_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_1(Prolog* m);

		static Operation $dummy_32_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_2(Prolog* m);
	/** PREDICATE: $dummy_33_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_33_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_$dummy_33_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_static_exec(Prolog* m);

	private:
		static Operation $dummy_33_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_sub_1(Prolog* m);

		static Operation $dummy_33_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_1(Prolog* m);

		static Operation $dummy_33_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_2(Prolog* m);
	/** PREDICATE: exclude_if_vector_in_false_set/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(exclude_if_vector_in_false_set/4,public)




	public:
		static Operation PRED_exclude_if_vector_in_false_set_4_static_exec(Prolog* m);

	private:
		static Operation exclude_if_vector_in_false_set_4_top(Prolog* m);

		static Operation exclude_if_vector_in_false_set_4_var(Prolog* m);

		static Operation exclude_if_vector_in_false_set_4_var_1(Prolog* m);

		static Operation exclude_if_vector_in_false_set_4_var_2(Prolog* m);

		static Operation exclude_if_vector_in_false_set_4_lis(Prolog* m);

		static Operation exclude_if_vector_in_false_set_4_lis_1(Prolog* m);

		static Operation exclude_if_vector_in_false_set_4_1(Prolog* m);

		static Operation exclude_if_vector_in_false_set_4_2(Prolog* m);

		static Operation exclude_if_vector_in_false_set_4_3(Prolog* m);
	/** PREDICATE: add_necessary_functions/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(add_necessary_functions/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_add_necessary_functions_5_static_exec(Prolog* m);
	/** PREDICATE: add_necessary_functions/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(add_necessary_functions/6,public)

		// private final Term arg5, arg6;




		static Operation PRED_add_necessary_functions_6_static_exec(Prolog* m);

	private:
		static Operation add_necessary_functions_6_top(Prolog* m);

		static Operation add_necessary_functions_6_sub_1(Prolog* m);

		static Operation add_necessary_functions_6_sub_2(Prolog* m);

		static Operation add_necessary_functions_6_1(Prolog* m);

		static Operation add_necessary_functions_6_2(Prolog* m);

		static Operation add_necessary_functions_6_3(Prolog* m);
	/** PREDICATE: new_function_CIs/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(new_function_CIs/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_new_function_CIs_5_static_exec(Prolog* m);
	/** PREDICATE: new_function_CIs/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(new_function_CIs/7,public)

		// private final Term arg5, arg6, arg7;




		static Operation PRED_new_function_CIs_7_static_exec(Prolog* m);

	private:
		static Operation new_function_CIs_7_top(Prolog* m);

		static Operation new_function_CIs_7_var(Prolog* m);

		static Operation new_function_CIs_7_var_1(Prolog* m);

		static Operation new_function_CIs_7_var_2(Prolog* m);

		static Operation new_function_CIs_7_lis(Prolog* m);

		static Operation new_function_CIs_7_lis_1(Prolog* m);

		static Operation new_function_CIs_7_1(Prolog* m);

		static Operation new_function_CIs_7_2(Prolog* m);

		static Operation new_function_CIs_7_3(Prolog* m);
	/** PREDICATE: $dummy_36_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_36_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/5,public)

		// private final Term arg5;




	public:
		static Operation PRED_$dummy_36_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_static_exec(Prolog* m);

	private:
		static Operation $dummy_36_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_sub_1(Prolog* m);

		static Operation $dummy_36_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_1(Prolog* m);

		static Operation $dummy_36_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_5_2(Prolog* m);
	/** PREDICATE: function_type/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(function_type/6,public)

		// private final Term arg5, arg6;




	public:
		static Operation PRED_function_type_6_static_exec(Prolog* m);
	/** PREDICATE: test_bounds/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(test_bounds/3,public)
			static SymbolTerm* const  ATOM_bound;




		static Operation PRED_test_bounds_3_static_exec(Prolog* m);
	/** PREDICATE: update_bounds/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(update_bounds/3,public)




		static Operation PRED_update_bounds_3_static_exec(Prolog* m);
	/** PREDICATE: $dummy_37_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main('$dummy_37_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl'/3,public)




		static Operation PRED_$dummy_37_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_static_exec(Prolog* m);

	private:
		static Operation $dummy_37_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_sub_1(Prolog* m);

		static Operation $dummy_37_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_1(Prolog* m);

		static Operation $dummy_37_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fnand$002Epl_3_2(Prolog* m);
	/** PREDICATE: set/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(set/2,public)




	public:
		static Operation PRED_set_2_static_exec(Prolog* m);
	/** PREDICATE: access/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(access/2,public)




		static Operation PRED_access_2_static_exec(Prolog* m);
	/** PREDICATE: write_gates/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(write_gates/1,public)
			static SymbolTerm* const  ATOM_gate$0020$0023;
			static SymbolTerm* const  ATOM_$0020inputs$003A$0020$0020$0020;




		static Operation PRED_write_gates_1_static_exec(Prolog* m);

	private:
		static Operation write_gates_1_var(Prolog* m);

		static Operation write_gates_1_var_1(Prolog* m);

		static Operation write_gates_1_1(Prolog* m);

		static Operation write_gates_1_2(Prolog* m);
	/** PREDICATE: function/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(function/3,public)




	public:
		static Operation PRED_function_3_static_exec(Prolog* m);

	private:
		static Operation function_3_top(Prolog* m);

		static Operation function_3_sub_1(Prolog* m);

		static Operation function_3_1(Prolog* m);

		static Operation function_3_2(Prolog* m);
	/** PREDICATE: function_number/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(function_number/2,public)




	public:
		static Operation PRED_function_number_2_static_exec(Prolog* m);
	/** PREDICATE: true_set/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(true_set/2,public)




		static Operation PRED_true_set_2_static_exec(Prolog* m);
	/** PREDICATE: false_set/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(false_set/2,public)




		static Operation PRED_false_set_2_static_exec(Prolog* m);
	/** PREDICATE: conceivable_inputs/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(conceivable_inputs/2,public)




		static Operation PRED_conceivable_inputs_2_static_exec(Prolog* m);
	/** PREDICATE: immediate_predecessors/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(immediate_predecessors/2,public)




		static Operation PRED_immediate_predecessors_2_static_exec(Prolog* m);
	/** PREDICATE: immediate_successors/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(immediate_successors/2,public)




		static Operation PRED_immediate_successors_2_static_exec(Prolog* m);
	/** PREDICATE: predecessors/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(predecessors/2,public)




		static Operation PRED_predecessors_2_static_exec(Prolog* m);
	/** PREDICATE: successors/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(successors/2,public)




		static Operation PRED_successors_2_static_exec(Prolog* m);
	/** PREDICATE: set_union/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(set_union/3,public)




		static Operation PRED_set_union_3_static_exec(Prolog* m);

	private:
		static Operation set_union_3_top(Prolog* m);

		static Operation set_union_3_var(Prolog* m);

		static Operation set_union_3_var_1(Prolog* m);

		static Operation set_union_3_var_2(Prolog* m);

		static Operation set_union_3_var_3(Prolog* m);

		static Operation set_union_3_var_4(Prolog* m);

		static Operation set_union_3_var_5(Prolog* m);

		static Operation set_union_3_con(Prolog* m);

		static Operation set_union_3_con_1(Prolog* m);

		static Operation set_union_3_lis(Prolog* m);

		static Operation set_union_3_lis_1(Prolog* m);

		static Operation set_union_3_lis_2(Prolog* m);

		static Operation set_union_3_lis_3(Prolog* m);

		static Operation set_union_3_1(Prolog* m);

		static Operation set_union_3_2(Prolog* m);

		static Operation set_union_3_3(Prolog* m);

		static Operation set_union_3_4(Prolog* m);

		static Operation set_union_3_5(Prolog* m);

		static Operation set_union_3_6(Prolog* m);
	/** PREDICATE: set_intersection/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(set_intersection/3,public)




	public:
		static Operation PRED_set_intersection_3_static_exec(Prolog* m);

	private:
		static Operation set_intersection_3_top(Prolog* m);

		static Operation set_intersection_3_var(Prolog* m);

		static Operation set_intersection_3_var_1(Prolog* m);

		static Operation set_intersection_3_var_2(Prolog* m);

		static Operation set_intersection_3_var_3(Prolog* m);

		static Operation set_intersection_3_var_4(Prolog* m);

		static Operation set_intersection_3_var_5(Prolog* m);

		static Operation set_intersection_3_con(Prolog* m);

		static Operation set_intersection_3_con_1(Prolog* m);

		static Operation set_intersection_3_lis(Prolog* m);

		static Operation set_intersection_3_lis_1(Prolog* m);

		static Operation set_intersection_3_lis_2(Prolog* m);

		static Operation set_intersection_3_lis_3(Prolog* m);

		static Operation set_intersection_3_1(Prolog* m);

		static Operation set_intersection_3_2(Prolog* m);

		static Operation set_intersection_3_3(Prolog* m);

		static Operation set_intersection_3_4(Prolog* m);

		static Operation set_intersection_3_5(Prolog* m);

		static Operation set_intersection_3_6(Prolog* m);
	/** PREDICATE: set_difference/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(set_difference/3,public)




	public:
		static Operation PRED_set_difference_3_static_exec(Prolog* m);

	private:
		static Operation set_difference_3_top(Prolog* m);

		static Operation set_difference_3_var(Prolog* m);

		static Operation set_difference_3_var_1(Prolog* m);

		static Operation set_difference_3_var_2(Prolog* m);

		static Operation set_difference_3_var_3(Prolog* m);

		static Operation set_difference_3_var_4(Prolog* m);

		static Operation set_difference_3_var_5(Prolog* m);

		static Operation set_difference_3_con(Prolog* m);

		static Operation set_difference_3_con_1(Prolog* m);

		static Operation set_difference_3_lis(Prolog* m);

		static Operation set_difference_3_lis_1(Prolog* m);

		static Operation set_difference_3_lis_2(Prolog* m);

		static Operation set_difference_3_lis_3(Prolog* m);

		static Operation set_difference_3_1(Prolog* m);

		static Operation set_difference_3_2(Prolog* m);

		static Operation set_difference_3_3(Prolog* m);

		static Operation set_difference_3_4(Prolog* m);

		static Operation set_difference_3_5(Prolog* m);

		static Operation set_difference_3_6(Prolog* m);
	/** PREDICATE: set_subset/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(set_subset/2,public)




	public:
		static Operation PRED_set_subset_2_static_exec(Prolog* m);

	private:
		static Operation set_subset_2_top(Prolog* m);

		static Operation set_subset_2_var(Prolog* m);

		static Operation set_subset_2_var_1(Prolog* m);

		static Operation set_subset_2_var_2(Prolog* m);

		static Operation set_subset_2_lis(Prolog* m);

		static Operation set_subset_2_lis_1(Prolog* m);

		static Operation set_subset_2_1(Prolog* m);

		static Operation set_subset_2_2(Prolog* m);

		static Operation set_subset_2_3(Prolog* m);
	/** PREDICATE: set_member/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nand.pl
	*/
		// main(set_member/2,public)




	public:
		static Operation PRED_set_member_2_static_exec(Prolog* m);

	private:
		static Operation set_member_2_top(Prolog* m);

		static Operation set_member_2_sub_1(Prolog* m);

		static Operation set_member_2_1(Prolog* m);

		static Operation set_member_2_2(Prolog* m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_nand::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}


#endif	//#ifndef FILE_NAND
