using namespace std;

#include "PRED_$builtin_member_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../machine/SxxMachine/Trail.h"
#include "../../../machine/SxxMachine/Failure.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Failure = SxxMachine::Failure;
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using Trail = SxxMachine::Trail;

	PRED_$builtin_member_2::PRED_$builtin_member_2(Term *a1, Term *a2, Operation cont)
	{
		this->LARG[0] = a1;
		this->LARG[1] = a2;
		this->cont = cont;
	}

	void PRED_$builtin_member_2::toString(StringBuilder *sb)
	{
		sb->append("$builtin_member(");
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		LARG[0]->toString(sb);
		sb->append(", ");
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		LARG[1]->toString(sb);
		sb->append(")");
	}

	Operation PRED_$builtin_member_2::exec(Prolog *engine)
	{
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		if (!(dynamic_cast<ListTerm*>(a2) != nullptr))
		{
			return engine->fail();
		}

		Term * const value = a2->asListTerm()->car();
		Term * const next = a2->asListTerm()->cdr()->dref();

		if (!next->equals(Prolog::Nil))
		{
			engine->setB0();
			engine->AREGS[0] = LARG[0];
			engine->AREGS[1] = new FFIObjectTerm(std::vector<Term*>{next});
			engine->cont = cont;
			engine->jtry2(nullptr, PRED_$builtin_member_2::retry); // push new frame with retry as next
		}
		return (a1->unify(value, engine->trail)) ? cont : engine->fail();
	}

	Operation PRED_$builtin_member_2::retry(Prolog *engine)
	{
		engine->retry(nullptr, PRED_$builtin_member_2::retry); // restore engine.areg1, AREGS[1], cont
		std::vector<Term*> p = any_cast<std::vector<Term*>>(engine->AREGS[1]->toJava());
		Trail * const trail = engine->trail;
		constexpr int top = trail->top();
		Term *a2 = p[0];
		while (dynamic_cast<ListTerm*>(a2) != nullptr)
		{
			Term * const value = a2->asListTerm()->car()->dref();
			a2 = a2->asListTerm()->cdr()->dref();
			if (engine->AREGS[0]->unify(value, engine->trail))
			{
				p[0] = a2;
				return engine->cont;
			}
			trail->unwind(top);
		}
		return engine->trust(Failure::FAIL_0);
	}
}
