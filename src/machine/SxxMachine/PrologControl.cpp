using namespace std;

#include "PrologControl.h"
#include "InternalDatabase.h"
#include "PrologMachineCopy.h"
#include "PrologClassLoader.h"
#include "HashtableOfTerm.h"
#include "SymbolTerm.h"
#include "TermData.h"
#include "Predicate.h"
#include "Success.h"
#include "Term.h"
#include "../../exceptions/SxxMachine/PrologException.h"
#include "../../exceptions/SxxMachine/JavaInterruptedException.h"
#include "PrologLogger.h"
#include "../../exceptions/SxxMachine/StopEngineException.h"
#include "../../exceptions/SxxMachine/HaltException.h"
#include "../../handcoded/SxxMachine/sxxtensions.h"
#include "../../builtin/SxxMachine/FILE_builtins.h"

namespace SxxMachine
{

	PrologControl::PrologControl() : engine(new Prolog(this))
	{
	}

	PrologControl::PrologControl(PrologMachineCopy *pmc) : engine(new Prolog(this, pmc))
	{
	}

	PrologControl::PrologControl(Prolog *pmc) : engine(pmc)
	{
	}

	bool PrologControl::isEnabled(Prolog::Feature f)
	{
	  return this->engine->features->contains(f);
	}

	void PrologControl::setEnabled(Prolog::Feature f, bool on)
	{
	  if (on)
	  {
		this->engine->features->add(f);
	  }
	  else
	  {
		this->engine->features->remove(f);
	  }
	}

	void PrologControl::setEnabled(Set<Prolog::Feature> *f, bool on)
	{
	  if (on)
	  {
		this->engine->features->addAll(f);
	  }
	  else
	  {
		this->engine->features->removeAll(f);
	  }
	}

	void PrologControl::printStackTrace(runtime_error err)
	{
	  this->engine->getLogger()->printStackTrace(err);
	}

	void PrologControl::setUserInput(InputStream *userInput)
	{
	  this->userInput = userInput;
	}

	void PrologControl::setUserOuput(PrintStream *userOuput)
	{
	  this->userOuput = userOuput;
	}

	int PrologControl::getMaxDatabaseSize()
	{
	  if (this->engine->internalDB != nullptr)
	  {
		return this->engine->internalDB->maxContents;
	  }
	  return InternalDatabase::DEFAULT_SIZE;
	}

	void PrologControl::setMaxDatabaseSize(int size)
	{
	  //if (this.engine.aregs != null)
	   // throw new IllegalStateException("Prolog already initialized");
	  if (this->engine->internalDB != nullptr)
	  {
		this->engine->internalDB->maxContents = size;
	  }
	  else
	  {
		this->engine->internalDB = new InternalDatabase(size);
	  }
	}

	PrologClassLoader *PrologControl::getPrologClassLoader()
	{
	  if (this->engine->pcl == nullptr)
	  {
		  this->engine->pcl = new PrologClassLoader();
	  }
	  return this->engine->pcl;
	}

	void PrologControl::setPrologClassLoader(PrologClassLoader *cl)
	{
	  if (this->engine->AREGS.size() > 0)
	  {
		throw IllegalStateException("Prolog already initialized");
	  }
	  this->engine->pcl = cl;
	}

	int PrologControl::getMaxArity()
	{
	  return this->engine->getMaxArity();
	}

	void PrologControl::setMaxArity(int max)
	{
	  if (max < 8)
	  {
		  throw IllegalStateException("invalid arity " + to_string(max));
	  }
	  if (this->engine->AREGS.size() > 0)
	  {
		throw IllegalStateException("Prolog already initialized");
	  }
	  this->engine->maxArity = max;
	}

	void PrologControl::configureUserIO(InputStream *in_Renamed, OutputStream *out, OutputStream *err)
	{
	  if (this->engine->streamManager == nullptr)
	  {
		this->engine->streamManager = new HashtableOfTerm(7);
	  }
	  if (in_Renamed != nullptr)
	  {
		PushbackReader tempVar(new BufferedReader(new InputStreamReader(in_Renamed)), Prolog::PUSHBACK_SIZE);
		this->engine->streamManager->put(SymbolTerm::intern("user_input"), TermData::FFIObject(&tempVar));
	  }
	  if (out != nullptr)
	  {
		PrintWriter tempVar2(new BufferedWriter(new OutputStreamWriter(out)), true);
		this->engine->streamManager->put(SymbolTerm::intern("user_output"), TermData::FFIObject(&tempVar2));
	  }
	  if (err != nullptr)
	  {
		PrintWriter tempVar3(new BufferedWriter(new OutputStreamWriter(err)), true);
		this->engine->streamManager->put(SymbolTerm::intern("user_error"), TermData::FFIObject(&tempVar3));
	  }
	}

	void PrologControl::setPredicate(Operation operation)
	{
	  (static_cast<Predicate*>(operation))->cont = Success::SUCCESS;
	  this->code = operation;
	}

	void PrologControl::setPredicate(const wstring &pkg, const wstring &functor, vector<Term> &args)
	{
	  setPredicate(getPrologClassLoader()->predicate(pkg, functor, {args}));
	}

	void PrologControl::setPredicate(Term *t)
	{
	  setPredicate(Prolog::BUILTIN, "call", {t});
	}

	void PrologControl::executePredicate()
	{
	  executePredicate(true);
	}

	void PrologControl::executePredicate(bool isOutter) throw(PrologException, JavaInterruptedException)
	{
	  Prolog *engine = this->engine;
	  PrologLogger *logger = engine->getLogger();
	  Operation code = this->code;
	  Operation nextCode = this->code;
	  try
	  {
		if (isOutter)
		{
		  engine->init(this->userInput, this->userOuput, this->userError);
		}
		  do
		  {
			try
			{
			  do
			  {
				if (isOutter)
				{
					code = insertPendingGoals(code);
				}
				if (!Prolog::BE_SAFE)
				{
					logger->beforeExec(code);
				}
				if (code == nullptr)
				{
				  break;
				}
				engine->pred = code;
				nextCode = code(engine);
				if (nextCode == code || nextCode == nullptr)
				{
				  break;
				}
				code = nextCode;
			  } while (true);
			}
			catch (const StopEngineException &see)
			{
			  see->printStackTrace();
			  return; // escape execution loop
			}
			catch (const runtime_error &t)
			{
			  PrologException *e = logger->execThrows(t);
			  constexpr int b = engine->peekCatcherB();
			  if (b >= 0)
			  {
				engine->setException(engine->copy(e->getMessageTerm()));
				engine->cut(b);
				code = engine->fail(); // set next operation to execute
				goto mainLoopContinue;
			  }
			  else
			  {
				t.printStackTrace();
				throw e;
			  }
			}
			if (engine->halt != 1)
			{
			  throw HaltException(engine->halt - 1);
			}
		  } while (code != nullptr);
			mainLoopContinue:;
		mainLoopBreak:;
	  }
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to the exception 'finally' clause:
	  finally
	  {
		if (isOutter)
		{
			this->code = insertPendingGoals(code);
		}
		else
		{
		  this->code = code;
		}

		if (isOutter)
		{
		  SymbolTerm::gc();
		  logger->close();
		}
	  }
	}

	Operation PrologControl::insertPendingGoals(Operation after)
	{
	  // there are pending goals - deal with them
		//    ExceptionRaised = 0;
		//    Continuation c = new Continuation(Areg, GetArity(code), code);
		//    Areg[0] = new StructureTerm("execpendinggoals".intern(), pendingGoals, c);
		//    pendingGoals = SymbolTerm.intern("[]");
		//    code = Prolog.Call1;

		if (engine->halt != 1)
		{
			return after;
		}
	  Term *pendingGoals = engine->popPendingGoals();
	  if (pendingGoals == Prolog::Nil)
	  {
		  return after;
	  }
	  SxxMachine::sxxtensions::PopPendingGoals tempVar(engine, engine->pendingGoals);
	  engine->push(&tempVar);
	  //code = Prolog.Call1;
	  return insertCode(pendingGoals, after);
	  //executePredicate(false);
	}

	Operation PrologControl::insertCode(Term *pendingGoals, Operation after)
	{
	  if (pendingGoals == Prolog::Nil)
	  {
		  return after;
	  }
	   while (pendingGoals->isCons())
	   {
		  Term *goal = pendingGoals->car();
		  after = insertCode(goal,after);
		  pendingGoals = pendingGoals->cdr();
	   }
		return new TermData::StaticPred("call",FILE_builtins::PRED_call_1_static_exec,TermData::VA({pendingGoals}), after);
	}

	void PrologControl::executePredicate_goog() throw(PrologException)
	{
	  Prolog *engine = this->engine;
	  Operation code = this->code;
	  long long reductionsRemaining = this->reductionLimit;
	  try
	  {
		// engine.init();

		do
		{
		  if (isEngineStopped())
		  {
			  return;
		  }
		  // if (--reductionsRemaining <= 0) throw new
		  // ReductionLimitException(reductionLimit);
		  code = code(engine);
		} while (engine->halt == 0);

		if (engine->halt != 1)
		{
		  throw HaltException(engine->halt - 1);
		}
	  }
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to the exception 'finally' clause:
	  finally
	  {
		this->reductionsUsed = this->reductionLimit - reductionsRemaining;
		this->code = code;
		SymbolTerm::gc();
	  }
	}

	long long PrologControl::getReductions()
	{
	  return this->reductionsUsed;
	}

	void PrologControl::setReductionLimit(long long limit)
	{
	  this->reductionLimit = max(0, limit);
	}

	void PrologControl::setUserError(PrintStream *userError)
	{
	  this->userError = userError;
	}

	any PrologControl::getExternalData(const wstring &key)
	{
	  return this->engine->getExternalData(key);
	}

	void PrologControl::setExternalData(const wstring &key, any value)
	{
	  this->engine->setExternalData(key, value);
	}

	PrologLogger *PrologControl::getLogger()
	{
	return engine->getLogger();
	}
}
