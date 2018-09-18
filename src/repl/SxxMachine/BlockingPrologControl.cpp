using namespace std;

#include "BlockingPrologControl.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/PrologMachineCopy.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/Predicate.h"
#include "../../kernelprolog/main/SxxMachine/Builtins.h"

namespace SxxMachine
{

	BlockingPrologControl::BlockingPrologControl()
	{
	}

	BlockingPrologControl::BlockingPrologControl(Prolog *p) : PrologControl(p)
	{
	}

	BlockingPrologControl::BlockingPrologControl(PrologMachineCopy *pmc) : PrologControl(pmc)
	{
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	bool BlockingPrologControl::execute(const wstring &pkg, const wstring &functor, vector<Term> &args)
	{
	  return execute(static_cast<Predicate*>(getPrologClassLoader()->predicate(pkg, functor, {args})));
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	bool BlockingPrologControl::execute(Predicate *p)
	{
	setPredicate(p);
	this->thread = new Thread(this);
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
	this->thread->setName("Prolog-" + p->toString());
	this->thread->start(); // execute run() in new thread.
	try
	{
		wait(); // wait caller's thread.
	}
	catch (const InterruptedException &e)
	{
	}
	stop();
	return this->result;
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	bool BlockingPrologControl::call()
	{
	start();
	return next();
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	bool BlockingPrologControl::redo()
	{
	cont();
	return next();
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	void BlockingPrologControl::success()
	{
	this->resultReady = true;
	this->result = true;
	notifyAll();
	while (this->thread != nullptr && this->resultReady)
	{
		try
		{
		wait();
		}
		catch (const InterruptedException &e)
		{
		}
	}
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	void BlockingPrologControl::fail()
	{
	this->resultReady = true;
	this->result = false;
	notifyAll();
	while (this->thread != nullptr && this->resultReady)
	{
		try
		{
		wait();
		}
		catch (const InterruptedException &e)
		{
		}
	}
	}

	bool BlockingPrologControl::isEngineStopped()
	{
	  return this->thread == nullptr;
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	void BlockingPrologControl::join()
	{
	while (this->thread != nullptr && !this->resultReady)
	{
		try
		{
		wait();
		}
		catch (const InterruptedException &e)
		{
		}
	}
	stop();
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	void BlockingPrologControl::stop()
	{
	this->resultReady = false;
	this->thread = nullptr;
	notifyAll();
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	void BlockingPrologControl::start()
	{
	this->resultReady = false;
	this->thread = new Thread(this);
	this->thread->start();
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	void BlockingPrologControl::cont()
	{
	this->resultReady = false;
	notifyAll();
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	bool BlockingPrologControl::ready()
	{
	return this->resultReady;
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	bool BlockingPrologControl::in_success()
	{
	return ready() && this->result;
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	bool BlockingPrologControl::in_failure()
	{
	return ready() && !this->result;
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	bool BlockingPrologControl::next()
	{
	while (this->thread != nullptr && !this->resultReady)
	{
		try
		{
		wait();
		}
		catch (const InterruptedException &e)
		{
		}
	}
	if (!this->result)
	{
		stop();
	}
	return this->result;
	}

	void BlockingPrologControl::run()
	{
	  try
	  {
		executePredicate();
		//  } catch (JavaInterruptedException e) {
		//     System.exit(1);
		//  } catch (PrologException e){
		//      if (engine.getPrintStackTrace().equals("on"))
		//      printStackTrace(e);
		//      else
		//      System.out.println(e.toString());
	  }
	catch (const runtime_error &e)
	{
		printStackTrace(e);
	}
	stop();
	}
}
