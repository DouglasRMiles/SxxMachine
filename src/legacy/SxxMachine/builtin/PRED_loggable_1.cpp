using namespace std;

#include "PRED_loggable_1.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/PrologException.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"

namespace SxxMachine
{
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PrologException = SxxMachine::PrologException;
	using Operation = SxxMachine::Operation;
	using P1 = SxxMachine::Predicate::P1;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
const unordered_map<SxxMachine::Term*, java::util::logging::Level*> PRED_loggable_1::LEVELS = unordered_map<SxxMachine::Term*, java::util::logging::Level*>();

	PRED_loggable_1::StaticConstructor::StaticConstructor()
	{
	LEVELS.emplace(SymbolTerm::intern("ALL"), Level::ALL);
	LEVELS.emplace(SymbolTerm::intern("all"), Level::ALL);
	LEVELS.emplace(SymbolTerm::intern("FINEST"), Level::FINEST);
	LEVELS.emplace(SymbolTerm::intern("finest"), Level::FINEST);
	LEVELS.emplace(SymbolTerm::intern("FINER"), Level::FINER);
	LEVELS.emplace(SymbolTerm::intern("finer"), Level::FINER);
	LEVELS.emplace(SymbolTerm::intern("FINE"), Level::FINE);
	LEVELS.emplace(SymbolTerm::intern("fine"), Level::FINE);
	LEVELS.emplace(SymbolTerm::intern("INFO"), Level::INFO);
	LEVELS.emplace(SymbolTerm::intern("info"), Level::INFO);
	LEVELS.emplace(SymbolTerm::intern("CONFIG"), Level::CONFIG);
	LEVELS.emplace(SymbolTerm::intern("config"), Level::CONFIG);
	LEVELS.emplace(SymbolTerm::intern("WARNING"), Level::WARNING);
	LEVELS.emplace(SymbolTerm::intern("warning"), Level::WARNING);
	LEVELS.emplace(SymbolTerm::intern("SEVERE"), Level::SEVERE);
	LEVELS.emplace(SymbolTerm::intern("severe"), Level::SEVERE);
	}

PRED_loggable_1::StaticConstructor PRED_loggable_1::staticConstructor;

	PRED_loggable_1::PRED_loggable_1(Term *a0, Operation cont)
	{
		this->LARG[0] = a0; //0];
		this->cont = cont;
	}

	Operation PRED_loggable_1::exec(Prolog *engine) throw(PrologException)
	{

		Term *a1 = LARG[0]->dref();

		if (!(dynamic_cast<StructureTerm*>(a1) != nullptr) || a1->arity() != 2)
		{
			throw IllegalTypeException(this, 1, "package:level", a1);
		}

		Logger *logger = Logger::getLogger(a1->arg0(0)->name());
		if (!logger->isLoggable(LEVELS.getOrDefault(a1->arg0(1), Level::INFO)))
		{
			return engine->fail();
		}
		return cont;
	}
}
