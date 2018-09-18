using namespace std;

#include "PRED_$read_token0_3.h"
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
#include "../../../machine/SxxMachine/Token.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../machine/SxxMachine/LongTerm.h"
#include "../../../machine/SxxMachine/DoubleTerm.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "../../../exceptions/SxxMachine/JavaException.h"

namespace SxxMachine
{
	using DoubleTerm = SxxMachine::DoubleTerm;
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using IntegerTerm = SxxMachine::IntegerTerm;
	using LongTerm = SxxMachine::LongTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using Token = SxxMachine::Token;
	using VariableTerm = SxxMachine::VariableTerm;
	using ExistenceException = SxxMachine::ExistenceException;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using JavaException = SxxMachine::JavaException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using PermissionException = SxxMachine::PermissionException;

	PRED_$read_token0_3::PRED_$read_token0_3(Term *a1, Term *a2, Term *a3, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	LARG[2] = a3;
	this->cont = cont;
	}

	Operation PRED_$read_token0_3::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2, *a3;
	a1 = LARG[0];
	a2 = LARG[1];
	a3 = LARG[2];

	any stream = nullptr;
	StringBuilder *s;
	int type;
	Term *token;

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
	// read token
	s = new StringBuilder();
	try
	{
		type = Token::read_token(s, any_cast<PushbackReader*>(stream));
		switch (type)
		{
		case Token::TOKEN_INTEGER:
			token = new IntegerTerm(static_cast<Integer>(s->toString()));
			break;
		case Token::TOKEN_LONG:
			token = new LongTerm(static_cast<long long>(s->toString()));
			break;
		case Token::TOKEN_DOUBLE:
			token = new DoubleTerm(static_cast<Double>(s->toString()));
			break;
		case 'S':
		{
			std::vector<char> chars = (s->toString()).toCharArray();
			token = Prolog::Nil;
			for (int i = chars.size(); i > 0; i--)
			{
				IntegerTerm tempVar(static_cast<int>(chars[i - 1]));
				token = TermData::CONS(&tempVar, token);
			}
			break;
		}
		default :
			token = SymbolTerm::create(s->toString());
			break;
		}
	}
	catch (const runtime_error &e)
	{
		throw JavaException(this, 1, e);
	}
	IntegerTerm tempVar2(type);
	if (!a2->unify(&tempVar2, engine->trail))
	{
		return engine->fail();
	}
	if (!a3->unify(token, engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}
}
