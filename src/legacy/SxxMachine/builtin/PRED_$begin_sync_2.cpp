using namespace std;

#include "PRED_$begin_sync_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/OutOfLoop.h"
#include "../../../machine/SxxMachine/PrologLogger.h"
#include "../../../exceptions/SxxMachine/StopEngineException.h"

namespace SxxMachine
{
	using BlockPredicate = SxxMachine::BlockPredicate;
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Operation = SxxMachine::Operation;
	using OutOfLoop = SxxMachine::OutOfLoop;
	using Prolog = SxxMachine::Prolog;
	using PrologLogger = SxxMachine::PrologLogger;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using StopEngineException = SxxMachine::StopEngineException;

	PRED_$begin_sync_2::PRED_$begin_sync_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_$begin_sync_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];

		any o = nullptr;
		Operation code = nullptr;

		// 1st. argument
		a1 = a1->dref();
		if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
		{
			throw PInstantiationException(this, 1);
		}
		if (!(dynamic_cast<FFIObjectTerm*>(a1) != nullptr))
		{
			throw IllegalTypeException(this, 1, "java", a1);
		}
		o = a1->object();
		// 2nd. argument
		a2 = a2->dref();
		if (!(dynamic_cast<VariableTerm*>(a2) != nullptr))
		{
			throw IllegalTypeException(this, 2, "variable", a1);
		}
		FFIObjectTerm tempVar(this);
		a2->asVariableTerm()->bind(&tempVar, engine->trail);
		//
		code = cont;
		this->outOfScope = false;
		this->outOfLoop = false;
		OutOfLoop tempVar2(this);
		engine->trail->push(&tempVar2);
		PrologLogger *logger = engine->getLogger();
		try
		{
			while (true)
			{
				{
					lock_guard<mutex> lock(o);
					while (!outOfScope)
					{
						if (engine->halt != 0)
						{
							goto main_loopBreak;
						}
		//						if (engine.control.isEngineStopped())
		//							break main_loop;
						if (outOfLoop)
						{
							goto main_loopBreak;
						}

						logger->beforeExec(code);
						code = code(engine);
					}
				}
				while (outOfScope)
				{
					if (engine->halt != 0)
					{
						goto main_loopBreak;
					}
		//					if (engine.control.isEngineStopped())
		//						break main_loop;
					if (outOfLoop)
					{
						goto main_loopBreak;
					}

					logger->beforeExec(code);
					code = code(engine);
				}

				main_loopContinue:;
			}
			main_loopBreak:;
		}
		catch (const StopEngineException &see)
		{
			throw see;
		}
		catch (const runtime_error &e)
		{
			throw logger->execThrows(e);
		}
		return code;
	}
}
