using namespace std;

#include "PRED_reverse_2.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
SxxMachine::SymbolTerm *const PRED_reverse_2::s1 = SxxMachine::SymbolTerm::intern("[]");

	PRED_reverse_2::PRED_reverse_2(Term *a1, Term *a2, Operation cont)
	{
		this->LARG[0] = a1;
		this->LARG[1] = a2;
		this->cont = cont;
	}

	void PRED_reverse_2::toString(StringBuilder *sb)
	{
		sb->append("reverse(");
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		LARG[0]->toString(sb);
		sb->append(", ");
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		LARG[1]->toString(sb);
		sb->append(")");
	}

	Operation PRED_reverse_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();

		if (dynamic_cast<ListTerm*>(a1) != nullptr || a1->isNil())
		{
			Term *r = Prolog::Nil;
			while (dynamic_cast<ListTerm*>(a1) != nullptr)
			{
				r = TermData::CONS(a1->asListTerm()->car(), r);
				a1 = a1->asListTerm()->cdr();
			}
			if (a1->isNil() && a2->unify(r, engine->trail))
			{
				return cont;
			}
		}
		return engine->fail();
	}
}
