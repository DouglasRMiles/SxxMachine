using namespace std;

#include "PRED_atom_concat_3.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"

namespace SxxMachine
{
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
SxxMachine::SymbolTerm *const PRED_atom_concat_3::AC_2 = SxxMachine::SymbolTerm::intern("ac", 2);

	PRED_atom_concat_3::PRED_atom_concat_3(Term *a1, Term *a2, Term *a3, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		LARG[2] = a3;
		this->cont = cont;
	}

	Operation PRED_atom_concat_3::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];

	a3 = a3->dref();
	if ((dynamic_cast<SymbolTerm*>(a3) != nullptr))
	{
		SymbolTerm *s3 = static_cast<SymbolTerm*>(a3);
		int endIndex = s3->length();
		Term *t = Prolog::Nil;
		for (int i = 0; i <= endIndex; i++)
		{
		std::vector<Term*> args = {s3->subsymbol(0, i), s3->subsymbol(i)};
		StructureTerm tempVar(AC_2, args);
		t = TermData::CONS(&tempVar, t);
		}
		StructureTerm tempVar2(AC_2, a1, a2);
		return new PRED_$member_in_reverse_2(&tempVar2, t, cont);
	}
	else if (!(dynamic_cast<VariableTerm*>(a3) != nullptr))
	{
		throw IllegalTypeException(this, 3, "atom", a3);
	}
	// a3 is a variable
	a1 = a1->dref();
	a2 = a2->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		throw PInstantiationException(this, 1);
	}
	if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
	{
		throw PInstantiationException(this, 2);
	}
	if (!(dynamic_cast<SymbolTerm*>(a1) != nullptr))
	{
		throw IllegalTypeException(this, 1, "integer", a1);
	}
	if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr))
	{
		throw IllegalTypeException(this, 2, "integer", a2);
	}
	wstring str3 = a1->asSymbolTerm()->name().concat(a2->asSymbolTerm()->name());
	if (!a3->unify(SymbolTerm::create(str3), engine->trail))
	{
		return engine->fail();
	}
		return cont;
	}
}
