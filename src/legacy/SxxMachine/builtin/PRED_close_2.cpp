using namespace std;

#include "PRED_close_2.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../exceptions/SxxMachine/ExistenceException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/TermException.h"
#include "../../../exceptions/SxxMachine/SystemException.h"
#include "../../../machine/SxxMachine/HashtableOfTerm.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using HashtableOfTerm = SxxMachine::HashtableOfTerm;
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using ExistenceException = SxxMachine::ExistenceException;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using SystemException = SxxMachine::SystemException;
	using TermException = SxxMachine::TermException;
SxxMachine::SymbolTerm *const PRED_close_2::SYM_ALIAS_1 = SxxMachine::SymbolTerm::intern("alias", 1);
SxxMachine::SymbolTerm *const PRED_close_2::SYM_FORCE_1 = SxxMachine::SymbolTerm::intern("force", 1);
SxxMachine::SymbolTerm *const PRED_close_2::SYM_TRUE = SxxMachine::SymbolTerm::intern("true");
SxxMachine::SymbolTerm *const PRED_close_2::SYM_FALSE = SxxMachine::SymbolTerm::intern("false");

	PRED_close_2::PRED_close_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_close_2::exec(Prolog *engine)
	{
		engine->requireFeature(Prolog::Feature::IO, this, LARG[0]);
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];

	bool forceFlag = false;
	any stream = nullptr;

	// close options
	a2 = a2->dref();
	Term *tmp = a2;
	while (!tmp->isNil())
	{
		if ((dynamic_cast<VariableTerm*>(tmp) != nullptr))
		{
		throw PInstantiationException(this, 2);
		}
		if (!(dynamic_cast<ListTerm*>(tmp) != nullptr))
		{
		throw IllegalTypeException(this, 2, "list", a2);
		}
		Term *car = tmp->asListTerm()->car()->dref();
		if ((dynamic_cast<VariableTerm*>(car) != nullptr))
		{
		throw PInstantiationException(this, 2);
		}
		if ((dynamic_cast<StructureTerm*>(car) != nullptr))
		{
		Term *functor = (car)->functor();
		std::vector<Term*> args = (car)->args();
		if (functor->equals(SYM_FORCE_1))
		{
			Term *bool_Renamed = args[0]->dref();
			if (bool_Renamed->equals(SYM_TRUE))
			{
			forceFlag = true;
			}
			else if (bool_Renamed->equals(SYM_FALSE))
			{
			forceFlag = false;
			}
			else
			{
			throw IllegalDomainException(this, 2, "close_option", car);
			}
		}
		else
		{
			throw IllegalDomainException(this, 2, "close_option", car);
		}
		}
		else
		{
		throw IllegalDomainException(this, 2, "close_option", car);
		}
		tmp = tmp->asListTerm()->cdr()->dref();
	}
	//stream
	a1 = a1->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		throw PInstantiationException(this, 1);
	}
	else if ((dynamic_cast<SymbolTerm*>(a1) != nullptr))
	{
		if (!engine->getStreamManager()->containsKey(a1))
		{
		throw ExistenceException(this, 1, "stream", a1, "");
		}
		stream = (engine->getStreamManager()->get(a1)).object();
	}
	else if ((dynamic_cast<FFIObjectTerm*>(a1) != nullptr))
	{
		stream = a1->object();
	}
	else
	{
		throw IllegalDomainException(this, 1, "stream_or_alias", a1);
	}
	if (dynamic_cast<PushbackReader*>(stream) != nullptr)
	{
		PushbackReader *in_Renamed = any_cast<PushbackReader*>(stream);
		if (in_Renamed->equals(engine->getUserInput()))
		{
		return cont;
		}
		if (in_Renamed->equals(engine->getCurrentInput()))
		{
		engine->setCurrentInput(engine->getUserInput());
		}
		try
		{
		in_Renamed->close();
		}
		catch (const IOException &e)
		{
		throw TermException(FFIObjectTerm(e));
		}
	}
	else if (dynamic_cast<PrintWriter*>(stream) != nullptr)
	{
		PrintWriter *out = any_cast<PrintWriter*>(stream);
		if (out->checkError())
		{
		if (!forceFlag)
		{
			throw SystemException("output stream error");
		}
		}
		out->flush();
		if (out->equals(engine->getUserOutput()) || out->equals(engine->getUserError()))
		{
		return cont;
		}
		if (out->equals(engine->getCurrentOutput()))
		{
		engine->setCurrentOutput(engine->getUserOutput());
		}
		out->close();
	}
	else
	{
		throw IllegalDomainException(this, 1, "stream_or_alias", a1);
	}
	// delete associated entries from the stream manager
	HashtableOfTerm *streamManager = engine->getStreamManager();
	if ((dynamic_cast<SymbolTerm*>(a1) != nullptr))
	{
		streamManager->remove(engine->getStreamManager()->get(a1));
		streamManager->remove(a1);
	}
	else if ((dynamic_cast<FFIObjectTerm*>(a1) != nullptr))
	{
		Term *tmp2 = streamManager->get(a1);
		while (!tmp2->isNil())
		{
		Term *car = tmp2->asListTerm()->car()->dref();
		if ((dynamic_cast<StructureTerm*>(car) != nullptr))
		{
			Term *functor = (car)->functor();
			std::vector<Term*> args = (car)->args();
			if (functor->equals(SYM_ALIAS_1))
			{
			Term *alias = args[0]->dref();
			streamManager->remove(alias);
			}
		}
		tmp2 = tmp2->asListTerm()->cdr()->dref();
		}
		streamManager->remove(a1);
	}
	else
	{
		throw IllegalDomainException(this, 1, "stream_or_alias", a1);
	}
		return cont;
	}
}
