using namespace std;

#include "PRED_peek_byte_2.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../exceptions/SxxMachine/RepresentationException.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../exceptions/SxxMachine/ExistenceException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../exceptions/SxxMachine/PermissionException.h"
#include "../../../exceptions/SxxMachine/TermException.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using ExistenceException = SxxMachine::ExistenceException;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using PermissionException = SxxMachine::PermissionException;
	using RepresentationException = SxxMachine::RepresentationException;
	using TermException = SxxMachine::TermException;
SxxMachine::IntegerTerm *const PRED_peek_byte_2::INT_EOF = new SxxMachine::IntegerTerm(-1);

	PRED_peek_byte_2::PRED_peek_byte_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_peek_byte_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
	any stream = nullptr;

	// InByte
	a2 = a2->dref();
	if (!(dynamic_cast<VariableTerm*>(a2) != nullptr))
	{
		if (!(dynamic_cast<IntegerTerm*>(a2) != nullptr))
		{
		throw IllegalTypeException(this, 2, "in_byte", a2);
		}
		int n = a2->asIntegerlTerm().intValue();
		if (n != -1 && (n < 0 || n > 255))
		{
		throw RepresentationException(this, 2, "in_byte");
		}
	}
	// S_or_a
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
	if (!(dynamic_cast<PushbackReader*>(stream) != nullptr))
	{
		throw PermissionException(this, "input", "stream", a1, "");
	}
	// read single byte
	try
	{
		int c = (any_cast<PushbackReader*>(stream)).read();
		if (c < 0)
		{ // EOF
		if (!a2->unify(INT_EOF, engine->trail))
		{
			return engine->fail();
		}
		return cont;
		}
		if (c > 255)
		{
		throw RepresentationException(this, 0, "byte");
		}
		(any_cast<PushbackReader*>(stream)).unread(c);
		IntegerTerm tempVar(c);
		if (!a2->unify(&tempVar, engine->trail))
		{
		return engine->fail();
		}
		return cont;
	}
	catch (const IOException &e)
	{
		throw TermException(FFIObjectTerm(e));
	}
	}
}
