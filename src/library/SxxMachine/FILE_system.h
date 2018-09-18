#pragma once

#include "../../machine/SxxMachine/TermData.h"
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

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.PRED_set_prolog_flag_2_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_$set_predicate_attribute_3_static_exec;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.PRED_must_be_2_static_exec;

	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using TermData = SxxMachine::TermData;

	class FILE_system : public TermData
	{
		/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
		*/
	private:
		static SymbolTerm *const PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_s1;
	public:
		static SymbolTerm *const ATOM_access_level;
		static SymbolTerm *const ATOM_system;
		static SymbolTerm *const ATOM_user;

		static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_static_exec(Prolog *m);

	private:
		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_sub_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_1(Prolog *m);

		static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_2(Prolog *m);

		/** PREDICATE: system_mode/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
		*/
		static SymbolTerm *const PRED_system_mode_1_s1;

	public:
		static Operation PRED_system_mode_1_static_exec(Prolog *m);

		/** PREDICATE: system_module/0
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
		*/
	private:
		static SymbolTerm *const PRED_system_module_0_s1;
	public:
		static SymbolTerm *const ATOM_false;

		static Operation PRED_system_module_0_static_exec(Prolog *m);

		/** PREDICATE: lock_predicate/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
		*/
	private:
		static SymbolTerm *const PRED_lock_predicate_1_s1;

	public:
		static Operation PRED_lock_predicate_1_static_exec(Prolog *m);

		/** PREDICATE: unlock_predicate/1
		from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
		*/
	private:
		static SymbolTerm *const PRED_unlock_predicate_1_s1;

	public:
		static Operation PRED_unlock_predicate_1_static_exec(Prolog *m);

		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static FILE_system::StaticConstructor staticConstructor;


	public:
		static void loadPreds();
	};

}
