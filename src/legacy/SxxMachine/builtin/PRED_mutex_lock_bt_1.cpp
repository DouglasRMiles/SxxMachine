using namespace std;

#include "PRED_mutex_lock_bt_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/PrologException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Mutex.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"

namespace SxxMachine
{
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PrologException = SxxMachine::PrologException;
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Mutex = SxxMachine::Mutex;
	using Operation = SxxMachine::Operation;
	using P1 = SxxMachine::Predicate::P1;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;

	PRED_mutex_lock_bt_1::PRED_mutex_lock_bt_1(Term *a0, Operation cont)
	{
		this->LARG[0] = a0; //0];
		this->cont = cont;
	}

	Operation PRED_mutex_lock_bt_1::exec(Prolog *engine) throw(PrologException)
	{
		Term *a1 = LARG[0]->dref();

		Lock * const lock;
		if ((dynamic_cast<SymbolTerm*>(a1) != nullptr))
		{
			lock = Mutex::getInstance(a1->name());
		}
		else if ((dynamic_cast<FFIObjectTerm*>(a1) != nullptr) && (dynamic_cast<Lock*>(a1->toJava()) != nullptr))
		{
			lock = any_cast<Lock*>(a1->toJava());
		}
		else
		{
			throw IllegalTypeException(this, 1, "atom or FFIObjectTerm(Lock)", a1);
		}
		lock->lock();
		engine->trail->push([&] ()
		{
		try
		{
			lock->unlock();
		}
		catch (const IllegalMonitorStateException &e)
		{
		}
		});
		return cont;
	}
}
