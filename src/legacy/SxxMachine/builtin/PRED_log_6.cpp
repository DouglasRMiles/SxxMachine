using namespace std;

#include "PRED_log_6.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/PrologException.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"

namespace SxxMachine
{
//	import static SxxMachine.PRED_loggable_1.LEVELS;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PrologException = SxxMachine::PrologException;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;

	PRED_log_6::PRED_log_6(Term *a0, Term *a1, Term *a2, std::vector<Term*> &LARG, Term *arg5, Term *arg6, Operation cont)
	{
		this->LARG[0] = a0; //0];
		this->LARG[1] = a1; //1];
		this->LARG[2] = a2; //2];
		this->LARG[3] = LARG[3];
		this->arg5 = arg5;
		this->arg6 = arg6;
		this->cont = cont;
	}

	Operation PRED_log_6::exec(Prolog *engine) throw(PrologException)
	{
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		Term * const a3 = LARG[2]->dref();
		Term * const a4 = LARG[3]->dref();
		Term * const a5 = arg5::dref();
		Term * const a6 = arg6::dref();

		if (!(dynamic_cast<StructureTerm*>(a1) != nullptr) || a1->arity() != 2)
		{
			throw IllegalTypeException(this, 1, "package:level", a1);
		}
		if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{
			throw IllegalTypeException(this, 2, "atom", a2);
		}

		Logger * const logger = Logger::getLogger(a1->arg0(0)->name());
		Level * const level = LEVELS::getOrDefault(a1->arg0(1), Level::INFO);
		logger->log(level, [&] ()
		{
		wstring::format(a2->name(), a3->toJava(), a4->toJava(), a5->toJava(), a6->toJava());
		});
		return cont;
	}
}
