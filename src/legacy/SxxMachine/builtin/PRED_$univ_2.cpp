using namespace std;

#include "PRED_$univ_2.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../machine/SxxMachine/NumberTerm.h"
#include "../../../machine/SxxMachine/ClosureTerm.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"

namespace SxxMachine
{
	using ClosureTerm = SxxMachine::ClosureTerm;
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using ListTerm = SxxMachine::ListTerm;
	using NumberTerm = SxxMachine::NumberTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
SxxMachine::SymbolTerm *const PRED_$univ_2::SYM_DOT = SxxMachine::SymbolTerm::intern(".");
SxxMachine::SymbolTerm *const PRED_$univ_2::SYM_NIL = SxxMachine::Prolog::Nil;

	PRED_$univ_2::PRED_$univ_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	wstring PRED_$univ_2::toString()
	{
		return "=..(" + LARG[0] + "," + LARG[1] + ")";
	}

	Operation PRED_$univ_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];

		a1 = a1->dref();
		if ((dynamic_cast<SymbolTerm*>(a1) != nullptr) || (dynamic_cast<NumberTerm*>(a1) != nullptr) || (dynamic_cast<FFIObjectTerm*>(a1) != nullptr) || (dynamic_cast<ClosureTerm*>(a1) != nullptr))
		{
			if (!a2->unify(TermData::CONS(a1, SYM_NIL), engine->trail))
			{
				return engine->fail();
			}
		}
		else if ((dynamic_cast<ListTerm*>(a1) != nullptr))
		{
			Term *t = TermData::CONS(a1->asListTerm()->cdr(), SYM_NIL);
			t = TermData::CONS(a1->asListTerm()->car(), t);
			t = TermData::CONS(SYM_DOT, t);
			if (!a2->unify(t, engine->trail))
			{
				return engine->fail();
			}
		}
		else if ((dynamic_cast<StructureTerm*>(a1) != nullptr))
		{
			SymbolTerm *sym = SymbolTerm::create((a1)->functor()->name());
			std::vector<Term*> args = (a1)->args();
			Term *t = SYM_NIL;
			for (int i = args.size(); i > 0; i--)
			{
				t = TermData::CONS(args[i - 1], t);
			}
			if (!a2->unify(TermData::CONS(sym, t), engine->trail))
			{
				return engine->fail();
			}
		}
		else if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
		{
			a2 = a2->dref();
			if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
			{
				throw PInstantiationException(this, 2);
			}
			else if (a2->equals(SYM_NIL))
			{
				throw IllegalDomainException(this, 2, "non_empty_list", a2);
			}
			else if (!(dynamic_cast<ListTerm*>(a2) != nullptr))
			{
				throw IllegalTypeException(this, 2, "list", a2);
			}
			Term *head = a2->asListTerm()->car()->dref();
			Term *tail = a2->asListTerm()->cdr()->dref();
			if ((dynamic_cast<VariableTerm*>(head) != nullptr))
			{
				throw PInstantiationException(this, 2);
			}
			if (tail->equals(SYM_NIL))
			{
				if ((dynamic_cast<SymbolTerm*>(head) != nullptr) || (dynamic_cast<NumberTerm*>(head) != nullptr) || (dynamic_cast<FFIObjectTerm*>(head) != nullptr) || (dynamic_cast<ClosureTerm*>(head) != nullptr))
				{
					if (!a1->unify(head, engine->trail))
					{
						return engine->fail();
					}
					return cont;
				}
				else
				{
					throw IllegalTypeException(this, 2, "atomic", head);
				}
			}
			if (!(dynamic_cast<SymbolTerm*>(head) != nullptr))
			{
				throw IllegalTypeException(this, 2, "atom", head);
			}
			Term *x = tail;
			while (!x->equals(SYM_NIL))
			{
				if ((dynamic_cast<VariableTerm*>(x) != nullptr))
				{
					throw PInstantiationException(this, 2);
				}
				if (!(dynamic_cast<ListTerm*>(x) != nullptr))
				{
					throw IllegalTypeException(this, 2, "list", a2);
				}
				x = x->asListTerm()->cdr()->dref();
			}
			int n = a2->asListTerm()->length() - 1;
			SymbolTerm *sym = SymbolTerm::create(head->asSymbolTerm()->name(), n);
			std::vector<Term*> args(n);
			for (int i = 0; i < n; i++)
			{
				args[i] = tail->asListTerm()->car()->dref();
				tail = tail->asListTerm()->cdr()->dref();
			}
			Term *t = nullptr;
			if (SYM_DOT->equals(head))
			{
				if (n != 2)
				{
					throw IllegalDomainException(this, 2, "['.',head,tail]", a2);
				}
				t = TermData::CONS(args[0], args[1]);
			}
			else
			{
				t = new StructureTerm(sym, args);
			}
			if (!a1->unify(t, engine->trail))
			{
				return engine->fail();
			}
		}
		else
		{
			return engine->fail();
		}
		return cont;
	}
}
