using namespace std;

#include "PRED_log_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/PrologException.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"

namespace SxxMachine
{
//	import static SxxMachine.PRED_loggable_1.LEVELS;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PrologException = SxxMachine::PrologException;
	using Operation = SxxMachine::Operation;
	using P2 = SxxMachine::Predicate::P2;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using Term = SxxMachine::Term;

	PRED_log_2::PRED_log_2(Term *a0, Term *a1, Operation cont)
	{
		this->LARG[0] = a0; //0];
		this->LARG[1] = a1; //1];
		this->cont = cont;
	}

	Operation PRED_log_2::exec(Prolog *engine) throw(PrologException)
	{

		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();

		if (!(dynamic_cast<StructureTerm*>(a1) != nullptr) || a1->arity() != 2)
		{
			throw IllegalTypeException(this, 1, "package:level", a1);
		}

		Logger * const logger = Logger::getLogger(a1->arg0(0)->name());
		Level * const level = LEVELS::getOrDefault(a1->arg0(1), Level::INFO);
		logger->log(level, a2::toString);
		return cont;
	}
}
