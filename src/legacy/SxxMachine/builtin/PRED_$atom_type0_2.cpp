using namespace std;

#include "PRED_$atom_type0_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Token.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using Token = SxxMachine::Token;

	PRED_$atom_type0_2::PRED_$atom_type0_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_$atom_type0_2::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2;
	int type;
	a1 = LARG[0];
	a2 = LARG[1];

	a1 = a1->dref();
	if (!(dynamic_cast<SymbolTerm*>(a1) != nullptr))
	{
		return engine->fail();
	}
	type = Token::getStringType(a1->asSymbolTerm()->name());
	IntegerTerm tempVar(type);
	if (!a2->unify(&tempVar, engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}
}
