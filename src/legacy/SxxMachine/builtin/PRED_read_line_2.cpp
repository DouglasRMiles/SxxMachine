using namespace std;

#include "PRED_read_line_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../exceptions/SxxMachine/ExistenceException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../exceptions/SxxMachine/PermissionException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/RepresentationException.h"
#include "../../../machine/SxxMachine/TermData.h"
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
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using ExistenceException = SxxMachine::ExistenceException;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using PermissionException = SxxMachine::PermissionException;
	using RepresentationException = SxxMachine::RepresentationException;
	using TermException = SxxMachine::TermException;

	PRED_read_line_2::PRED_read_line_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_read_line_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
	any stream = nullptr;
	wstring line;
	std::vector<char> chars;
	Term *t;

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
	// read line
	try
	{
		BufferedReader tempVar(any_cast<PushbackReader*>(stream));
		line = (&tempVar)->readLine();
		if (line == "")
		{ // end_of_stream
		IntegerTerm tempVar2(-1);
		if (!a2->unify(&tempVar2, engine->trail))
		{
			return engine->fail();
		}
		return cont;
		}
		chars = line.toCharArray();
		t = Prolog::Nil;
		for (int i = chars.size(); i > 0; i--)
		{
		if (!Character::isDefined(static_cast<int>(chars[i - 1])))
		{
			throw RepresentationException(this, 0, "character");
		}
		IntegerTerm tempVar3(static_cast<int>(chars[i - 1]));
		t = TermData::CONS(&tempVar3, t);
		}
		if (!a2->unify(t, engine->trail))
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
