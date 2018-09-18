using namespace std;

#include "PRED_log_level_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/PrologException.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"

namespace SxxMachine
{
//	import static SxxMachine.PRED_loggable_1.LEVELS;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PrologException = SxxMachine::PrologException;
	using Operation = SxxMachine::Operation;
	using P1 = SxxMachine::Predicate::P1;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;

	PRED_log_level_1::PRED_log_level_1(Term *a0, Operation cont)
	{
		this->LARG[0] = a0; //0];
		this->cont = cont;
	}

	Operation PRED_log_level_1::exec(Prolog *engine) throw(PrologException)
	{

		Term * const a1 = LARG[0]->dref();
		if (!(dynamic_cast<StructureTerm*>(a1) != nullptr) || a1->arity() != 2)
		{
			throw IllegalTypeException(this, 1, "package:level", a1);
		}
		Term * const packageTerm = a1->arg0(0);
		Logger * const logger = Logger::getLogger(packageTerm->name());
		Term * const levelTerm = a1->arg0(1);
		if ((dynamic_cast<VariableTerm*>(levelTerm) != nullptr))
		{
			// obtain logger's level, which may be inherited from parent
			Level *level = nullptr;
			for (Logger *l = logger; l != nullptr && (level = l->getLevel()) == nullptr; l = l->getParent())
			{
				;
			}
			if (level == nullptr)
			{
				level = Level::INFO;
			}
			if (!levelTerm->unify(SymbolTerm::create(level->getName()), engine->trail))
			{
				return engine->fail();
			}
		}
		else if (dynamic_cast<SymbolTerm*>(levelTerm) != nullptr)
		{
			logger->setLevel(LEVELS::getOrDefault(levelTerm, Level::INFO));
		}
		else
		{
			throw IllegalTypeException(this, 1, "package:level", a1);
		}
		return cont;
	}
}
