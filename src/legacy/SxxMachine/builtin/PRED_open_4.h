#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include "../../../machine/SxxMachine/Undoable.h"
#include <string>
#include <unordered_map>
#include <any>
#include "exceptionhelper.h"
#include "stringhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Operation;
	class Term;
	class Prolog;
	class FFIObjectTerm;
}

namespace SxxMachine
{


	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using Undoable = SxxMachine::Undoable;

	/**
	 * <code>open/4</code><br>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class PRED_open_4 : public Predicate::P4
	{
	private:
		static SymbolTerm *const SYM_TEXT;
		static SymbolTerm *const SYM_READ;
		static SymbolTerm *const SYM_WRITE;
		static SymbolTerm *const SYM_APPEND;
		static SymbolTerm *const SYM_INPUT;
		static SymbolTerm *const SYM_OUTPUT;
		static SymbolTerm *const SYM_ALIAS_1;
		static SymbolTerm *const SYM_MODE_1;
		static SymbolTerm *const SYM_TYPE_1;
		static SymbolTerm *const SYM_FILE_NAME_1;
		static SymbolTerm *const SYM_CHARSET;
		static SymbolTerm *const SYM_AUTOCLOSE;

	public:
		PRED_open_4(Term *a1, Term *a2, Term *a3, Term *a4, Operation cont);

		Operation exec(Prolog *engine) override;

	private:
		std::unordered_map<SymbolTerm*, Term*> processOptions(Term *options);

	private:
		class CloseHelper : public Undoable
		{

		private:
			Prolog *const engine;
			FFIObjectTerm *const streamObject;
			Term *const alias;

		public:
			virtual ~CloseHelper()
			{
				delete engine;
				delete streamObject;
				delete alias;
			}

			CloseHelper(Prolog *engine, FFIObjectTerm *streamObject, Term *alias);


			void undo() override;

		};

	};

}
