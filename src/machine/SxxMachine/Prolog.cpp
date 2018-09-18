using namespace std;

#include "Prolog.h"
#include "PrologLogger.h"
#include "SymbolTerm.h"
#include "PrologControl.h"
#include "Term.h"
#include "ChoicePointStack.h"
#include "Trail.h"
#include "PrologClassLoader.h"
#include "InternalDatabase.h"
#include "HashtableOfTerm.h"
#include "ListTerm.h"
#include "../../kernelprolog/main/SxxMachine/NameArity.h"
#include "PrologMachineCopy.h"
#include "TermData.h"
#include "Failure.h"
#include "../../exceptions/SxxMachine/PermissionException.h"
#include "ChoicePointFrame.h"
#include "../../exceptions/SxxMachine/SystemException.h"
#include "StructureTerm.h"
#include "Undoable.h"

namespace SxxMachine
{
//	import static SxxMachine.TermData.CONS;
java::util::logging::Logger *const Prolog::javaUtilLogger = java::util::logging::Logger::getLogger(Prolog::typeid->getName());
SymbolTerm *const Prolog::NONE = SymbolTerm::intern("$none");
std::vector<Term*> const Prolog::NO_REGISTERS = {};
const wstring Prolog::BUILTIN = "SxxMachine";
SymbolTerm *const Prolog::Nil = SymbolTerm::intern("[]");
SymbolTerm *const Prolog::True = SymbolTerm::intern("true");
SymbolTerm *const Prolog::SYM_MODE_1 = SymbolTerm::intern("mode", 1);
SymbolTerm *const Prolog::SYM_ALIAS_1 = SymbolTerm::intern("alias", 1);
SymbolTerm *const Prolog::SYM_TYPE_1 = SymbolTerm::intern("type", 1);
SymbolTerm *const Prolog::SYM_READ = SymbolTerm::intern("read");
SymbolTerm *const Prolog::SYM_APPEND = SymbolTerm::intern("append");
SymbolTerm *const Prolog::SYM_INPUT = SymbolTerm::intern("input");
SymbolTerm *const Prolog::SYM_OUTPUT = SymbolTerm::intern("output");
SymbolTerm *const Prolog::SYM_TEXT = SymbolTerm::intern("text");
SymbolTerm *const Prolog::SYM_USERINPUT = SymbolTerm::intern("user_input");
SymbolTerm *const Prolog::SYM_USEROUTPUT = SymbolTerm::intern("user_output");
SymbolTerm *const Prolog::SYM_USERERROR = SymbolTerm::intern("user_error");
java::io::PrintWriter *const Prolog::NO_OUTPUT = new java::io::PrintWriter(new WriterAnonymousInnerClass());

	Prolog::WriterAnonymousInnerClass::WriterAnonymousInnerClass()
	{
	}

	void Prolog::WriterAnonymousInnerClass::write(std::vector<char> &cbuf, int off, int len) throw(IOException)
	{
		throw IOException("Prolog.Feature.IO disabled");
	}

	void Prolog::WriterAnonymousInnerClass::flush() throw(IOException)
	{
	}

	Prolog::WriterAnonymousInnerClass::~WriterAnonymousInnerClass()
	{
	}

java::io::PushbackReader *const Prolog::NO_INPUT = new java::io::PushbackReader(new ReaderAnonymousInnerClass());

	Prolog::ReaderAnonymousInnerClass::ReaderAnonymousInnerClass()
	{
	}

	int Prolog::ReaderAnonymousInnerClass::read(std::vector<char> &cbuf, int off, int len) throw(IOException)
	{
		return -1;
	}

	Prolog::ReaderAnonymousInnerClass::~ReaderAnonymousInnerClass()
	{
	}

bool Prolog::BE_FAST = true;
Prolog *Prolog::M = nullptr;
SymbolTerm *const Prolog::anEof = TermData::F("end_of_file");
SymbolTerm *const Prolog::aNo = TermData::F("no");
SymbolTerm *const Prolog::aYes = TermData::F("yes");
NameArity *const Prolog::aFail = TermData::F("fail");
SymbolTerm *const Prolog::SYM_DOT = SymbolTerm::intern(".", 2);
SymbolTerm *const Prolog::SYM_CONJ = SymbolTerm::intern(",", 2);
SymbolTerm *const Prolog::SYM_NECK = SymbolTerm::intern(":-", 2);

	Prolog::Prolog(PrologControl *c) : logger(new PrologLogger(javaUtilLogger)), control(c), stack(new ChoicePointStack(this->trail)), trail(new Trail(this)), hashManager(new HashtableOfTerm())
	{
		M = this;
		this->assumptions = this->pendingGoals = Nil;
		//      copyHash = new IdentityHashMap<Object, Term>();
	}

	Prolog::Prolog(PrologControl *c, PrologMachineCopy *pmc) : logger(new PrologLogger(javaUtilLogger)), control(c), stack(new ChoicePointStack(this->trail)), trail(new Trail(this))
	{
		this->assumptions = this->pendingGoals = Nil;
		//      copyHash = new IdentityHashMap<Object, Term>();
		this->pcl = pmc->pcl;
		// During restore there is no need to copy terms. clause/2 inside of
		// builtins.pl copies the predicate when it reads from internalDB.
		if (pmc->noCopy())
		{
			this->hashManager = pmc->hashManager;
			this->internalDB = pmc->internalDB;

		}
		else
		{
			this->hashManager = pmc->hashManager->copyShallow();
			IdentityHashMap<any, Term*> tempVar();
			this->internalDB = pmc->internalDB->copyInternalDatabase(false, &tempVar);
		}
	}

	void Prolog::initOnce(InputStream *in_Renamed, PrintStream *out, PrintStream *err)
	{


		this->AREGS = std::vector<Term*>(this->maxArity);

		if (this->pcl == nullptr)
		{
			this->pcl = new PrologClassLoader();
		}
		if (this->internalDB == nullptr)
		{
			this->internalDB = new InternalDatabase();
		}
		this->streamManager = new HashtableOfTerm(7);
		if (this->features->contains(Feature::IO))
		{
			BufferedReader tempVar(new InputStreamReader(in_Renamed));
			this->userInput = new PushbackReader(&tempVar, PUSHBACK_SIZE);
			BufferedWriter tempVar2(new OutputStreamWriter(out));
			this->userOutput = new PrintWriter(&tempVar2, true);
			OutputStreamWriter tempVar3(err);
			this->userError = new PrintWriter(&tempVar3, true);
			this->streamManager->put(SYM_USERINPUT, TermData::FFIObject(this->userInput));
			this->streamManager->put(TermData::FFIObject(this->userInput), makeStreamProperty(SYM_READ, SYM_INPUT, SYM_USERINPUT, SYM_TEXT));
			this->streamManager->put(SYM_USEROUTPUT, TermData::FFIObject(this->userOutput));
			this->streamManager->put(TermData::FFIObject(this->userOutput), makeStreamProperty(SYM_APPEND, SYM_OUTPUT, SYM_USEROUTPUT, SYM_TEXT));
			this->streamManager->put(SYM_USERERROR, TermData::FFIObject(this->userError));
			this->streamManager->put(TermData::FFIObject(this->userError), makeStreamProperty(SYM_APPEND, SYM_OUTPUT, SYM_USERERROR, SYM_TEXT));
		}
		else
		{
			this->userInput = NO_INPUT;
			this->userOutput = NO_OUTPUT;
			this->userError = this->userOutput;
		}
	}

	void Prolog::init(InputStream *in_Renamed, PrintStream *out, PrintStream *err)
	{
		if (this->AREGS.empty())
		{
			initOnce(in_Renamed,out,err);
		}
		this->stack->init();
		this->trail->init();
		this->B0 = this->stack->top();
		this->CPFTimeStamp = numeric_limits<long long>::min();
		// Creates an initial choice point frame.
		//ChoicePointFrame initialFrame = new ChoicePointFrame(this, Failure.FAILURE, ++CPFTimeStamp);  
		//ChoicePointFrame.S0(null);
		this->trail->timeStamp = ++this->CPFTimeStamp;
		this->stack->push(this, Failure::FAILURE, ChoicePointStack::restore0);
		this->logger->init(this->stack->top_Renamed);
		this->halt = 0;
		pendingGoals = Nil;
		assumptions = Nil;
		PENDING_INTERUPTS = 0;
		INTERUPT_LOCK = any();
		lastPendingGoal = nullptr;
		this->charConversion = "off";
		this->debug = "off";
		this->unknown = "error";
		this->doubleQuotes = "codes";
		this->printStackTrace = "off";
		this->exception = NONE;
		this->startRuntime = this->features->contains(Feature::STATISTICS_RUNTIME) ? System::currentTimeMillis() : 0;
		this->previousRuntime = 0;
		this->currentInput = this->userInput;
		this->currentOutput = this->userOutput;
	}

	void Prolog::requireFeature(Prolog::Feature f, Operation goal, Term *arg)
	{
		if (!this->features->contains(f))
		{
			throw PermissionException(goal, "use", f.toString()->toLowerCase(), arg, "disabled");
		}
	}

	void Prolog::pushCatcherB(int b)
	{
		this->catchersBindex++;
		if (this->catchersBindex >= this->catchersB.size())
		{
			ensureCatchersCapability();
		}
		this->catchersB[this->catchersBindex] = b;
	}

	void Prolog::ensureCatchersCapability()
	{
		std::vector<int> newCatchersB(this->catchersB.size() << 1);
		System::arraycopy(this->catchersB, 0, newCatchersB, 0, this->catchersB.size());
		this->catchersB = newCatchersB;
	}

	int Prolog::popCatcherB()
	{
		return (this->catchersBindex >= 0) ? this->catchersB[this->catchersBindex--] : -1;
	}

	int Prolog::peekCatcherB()
	{
		return (this->catchersBindex >= 0) ? this->catchersB[this->catchersBindex] : -1;
	}

	void Prolog::setB0()
	{
		this->B0 = this->stack->top();
	}

	void Prolog::cut(int i)
	{
		this->stack->cut(i);
	}

	void Prolog::neckCut()
	{
		this->stack->cut(this->B0);
	}

	Term *Prolog::copy(Term *t)
	{
		if (t->isImmutable())
		{
			return t;
		}
		else
		{
		  int deeply = Term::COPY_ALL;
			//copyHash.clear();
		//    		copyHash = new IdentityHashMap<Object, Term>();
			IdentityHashMap<any, Term*> tempVar();
			return t->copy(&tempVar, deeply);
		}
	}

	Operation Prolog::fail()
	{
		ChoicePointFrame *top = this->stack->top_Renamed;
		this->logger->fail(top->bp, top);
		this->B0 = top->b0; // restore B0
		return top->bp; // execute next clause
	}

	Operation Prolog::switch_on_term(Operation var, Operation Int, Operation flo, Operation con, Operation str, Operation lis)
	{
	  Term *a1 = this->AREGS[0]->dref();

	  switch (a1->type())
	  {
		case Term::TYPE_VARIABLE:
		  return var;
		case Term::TYPE_INTEGER:
		  return Int;
		case Term::TYPE_DOUBLE:
		  return flo;
		case Term::TYPE_SYMBOL:
		  return con;
	   // case Term.TYPE_LIST:
		 // return lis;
	  }
	  if (a1->isCons())
	  {
		return lis;
	  }
	  if (a1->isStructure())
	  {
		return str;
	  }
	  return var;

	}

	Operation Prolog::switch_on_hash(unordered_map<Term*, Operation> &hash, Operation otherwise)
	{
		Term *arg1 = this->AREGS[0]->dref();
		Term *key;
		if (((arg1->isInteger()) || arg1->isDouble()) || (arg1->isSymbol()))
		{
			key = arg1;
		}
		else if ((arg1->isStructure()))
		{
			key = (arg1)->functor();
		}
		else
		{
			throw SystemException("Invalid argument in switch_on_hash");
		}
		Operation p = hash[key];
		if (p != nullptr)
		{
			return p;
		}
		else
		{
			return otherwise;
		}
	}

	Operation Prolog::jtry0(Operation p, Operation next)
	{
		this->trail->timeStamp = ++this->CPFTimeStamp;
		return finishjtry(p, next, this->stack->push(this, next, ChoicePointStack::restore0));
		//return p;
	}

	Operation Prolog::jtry1(Operation p, Operation next)
	{
		return jtry(1, p, next);
	}

	Operation Prolog::jtry2(Operation p, Operation next)
	{
		return jtry(2, p, next);
	}

	Operation Prolog::jtry3(Operation p, Operation next)
	{
		return jtry(3, p, next);
	}

	Operation Prolog::jtry4(Operation p, Operation next)
	{
		return jtry(4, p, next);
	}

	Operation Prolog::jtry5(Operation p, Operation next)
	{
		return jtry(5, p, next);
	}

	Operation Prolog::jtry6(Operation p, Operation next)
	{
		return jtry(6, p, next);
	}

	Operation Prolog::jtry7(Operation p, Operation next)
	{
		return jtry(7, p, next);
	}

	Operation Prolog::jtry8(Operation p, Operation next)
	{
		return jtry(8, p, next);
	}

	Operation Prolog::jtry(int arity, Operation p, Operation next)
	{
	  this->trail->timeStamp = ++this->CPFTimeStamp;
	  return finishjtry(p, next, this->stack->push(this, arity, next));
	  //return p;
	}

	Operation Prolog::finishjtry(Operation p, Operation next, ChoicePointFrame *entry)
	{
		/*
		      entry.bp = next;
		      entry.tr = trail.top();
		      entry.timeStamp = ++CPFTimeStamp;
		      stack.push(entry);
		*/
	  logger->jtry(p,next,entry);
	  return p;
	}

	Operation Prolog::retry(Operation p, Operation next)
	{
		ChoicePointFrame *top = this->stack->top_Renamed;
		top->restore_Renamed.accept(top,this);
		this->logger->retry(p, next, top);
		this->trail->unwind(top->tr);
		top->bp = next;
		return p;
	}

	Operation Prolog::trust(Operation p)
	{
		ChoicePointFrame * const top = this->stack->top_Renamed;
		top->restore_Renamed.accept(top,this);
		this->logger->trust(p, top);
		this->trail->unwind(top->tr);
		this->stack->delete();
		return p;
	}

	Term *Prolog::makeStreamProperty(SymbolTerm *_mode, SymbolTerm *io, SymbolTerm *_alias, SymbolTerm *_type)
	{
		std::vector<Term*> mode = {_mode};
		std::vector<Term*> alias = {_alias};
		std::vector<Term*> type = {_type};
		Term *t = Nil;
		StructureTerm tempVar(SYM_MODE_1, mode);
		t = CONS(&tempVar, t);
		t = CONS(io, t);
		StructureTerm tempVar2(SYM_ALIAS_1, alias);
		t = CONS(&tempVar2, t);
		StructureTerm tempVar3(SYM_TYPE_1, type);
		t = CONS(&tempVar3, t);
		return t;
	}

	long long Prolog::getCPFTimeStamp()
	{
		return this->CPFTimeStamp;
	}

	bool Prolog::isBounded()
	{
		return this->bounded;
	}

	int Prolog::getMaxInteger()
	{
		return maxInteger;
	}

	int Prolog::getMinInteger()
	{
		return minInteger;
	}

	wstring Prolog::getIntegerRoundingFunction()
	{
		return this->integerRoundingFunction;
	}

	wstring Prolog::getCharConversion()
	{
		return this->charConversion;
	}

	void Prolog::setCharConversion(const wstring &mode)
	{
		this->charConversion = mode;
	}

	wstring Prolog::getDebug()
	{
		return this->debug;
	}

	void Prolog::setDebug(const wstring &mode)
	{
		this->debug = mode;
	}

	int Prolog::getMaxArity()
	{
		return this->maxArity;
	}

	wstring Prolog::getUnknown()
	{
		return this->unknown;
	}

	void Prolog::setUnknown(const wstring &mode)
	{
		this->unknown = mode;
	}

	wstring Prolog::getDoubleQuotes()
	{
		return this->doubleQuotes;
	}

	void Prolog::setDoubleQuotes(const wstring &mode)
	{
		this->doubleQuotes = mode;
	}

	wstring Prolog::getPrintStackTrace()
	{
		return "on";
	}

	void Prolog::setPrintStackTrace(const wstring &mode)
	{
		this->printStackTrace = mode;
	}

	Term *Prolog::getException()
	{
		return this->exception;
	}

	void Prolog::setException(Term *t)
	{
		this->exception = t;
	}

	long long Prolog::getStartRuntime()
	{
		return this->startRuntime;
	}

	long long Prolog::getPreviousRuntime()
	{
		return this->previousRuntime;
	}

	void Prolog::setPreviousRuntime(long long t)
	{
		this->previousRuntime = t;
	}

	PushbackReader *Prolog::getUserInput()
	{
		return this->userInput;
	}

	PrintWriter *Prolog::getUserOutput()
	{
		return this->userOutput;
	}

	PrintWriter *Prolog::getUserError()
	{
		return this->userError;
	}

	PushbackReader *Prolog::getCurrentInput()
	{
		return this->currentInput;
	}

	void Prolog::setCurrentInput(PushbackReader *in_Renamed)
	{
		this->currentInput = in_Renamed;
	}

	PrintWriter *Prolog::getCurrentOutput()
	{
		return this->currentOutput;
	}

	void Prolog::setCurrentOutput(PrintWriter *out)
	{
		this->currentOutput = out;
	}

	HashtableOfTerm *Prolog::getStreamManager()
	{
		return this->streamManager;
	}

	HashtableOfTerm *Prolog::getHashManager()
	{
		return this->hashManager;
	}

	any Prolog::getExternalData(const wstring &key)
	{
		return this->externalData->get(key);
	}

	void Prolog::setExternalData(const wstring &key, any value)
	{
		this->externalData->put(key, value);
	}

	PrologLogger *Prolog::getLogger()
	{
		return this->logger;
	}

	void Prolog::push(Undoable *undoable)
	{
		this->trail->push(undoable);
	}

	Term *Prolog::popPendingGoals()
	{
		if (halt != 1)
		{
			return Nil;
		}
		{
		  lock_guard<mutex> lock(INTERUPT_LOCK);
		if (PENDING_INTERUPTS == 0)
		{
			return Nil;
		}
		PENDING_INTERUPTS = 0;
		Term *retPendingGoals = this->pendingGoals;
		lastPendingGoal = nullptr;
		pendingGoals = Nil;
		return retPendingGoals;
	  }
	}

	Term *Prolog::peekPendingGoals()
	{
	   {
		lock_guard<mutex> lock(INTERUPT_LOCK);
		 if (PENDING_INTERUPTS == 0)
		 {
			 return Nil;
		 }
		 return this->pendingGoals;
	 }
	}

	void Prolog::pushPendingGoal(Term *goal)
	{
	  {
		  lock_guard<mutex> lock(INTERUPT_LOCK);
	  PENDING_INTERUPTS++;
	  if (pendingGoals == nullptr || pendingGoals == Prolog::Nil || pendingGoals == Prolog::True)
	  {
		pendingGoals = goal;
		lastPendingGoal = nullptr;
	  }
	  else
	  {
		// lastPendingGoal = lastPendingGoal; 
		this->pendingGoals = CONS(goal, this->pendingGoals);
	  }
	  }
	}

	void Prolog::addPendingGoal(Term *goal)
	{
	  {
		  lock_guard<mutex> lock(INTERUPT_LOCK);
		PENDING_INTERUPTS++;
		if (lastPendingGoal != nullptr)
		{
		  lastPendingGoal = this->lastPendingGoal->append(goal);
		  return;
		}
		if (pendingGoals == nullptr || pendingGoals == Prolog::Nil || pendingGoals == Prolog::True)
		{
		  pendingGoals = goal;
		}
		else
		{
		  if (this->pendingGoals->isCons())
		  {
			lastPendingGoal = this->pendingGoals->append(goal);
		  }
		  else
		  {
			lastPendingGoal = CONS(this->pendingGoals,goal);
			pendingGoals = lastPendingGoal;
		  }
		}
	  }
	}

	void Prolog::getStackTrace(StringBuilder *sb)
	{

	}

	wstring Prolog::toString()
	{
	  if (logger == nullptr)
	  {
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		return __super::toString();
	  }
	   Operation code = cont;
	   if (code == nullptr)
	   {
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		 return __super::toString();
	   }
	   StringBuilder *stringBuilder = new StringBuilder();
	   logger->printStack(code, stringBuilder);
	   return stringBuilder->toString();
	}

	void Prolog::Break(const wstring &string)
	{
	 // byte[] array = new byte[16];
	  try
	  {
		(runtime_error(string))->printStackTrace();
	  //  System.in.read(array);
	  }
	  catch (const runtime_error &e)
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }

	}
}
