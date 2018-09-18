using namespace std;

#include "PRED_java_conversion_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../machine/SxxMachine/ClosureTerm.h"
#include "../../../exceptions/SxxMachine/EvaluationException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../machine/SxxMachine/DoubleTerm.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{
	using ClosureTerm = SxxMachine::ClosureTerm;
	using DoubleTerm = SxxMachine::DoubleTerm;
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using EvaluationException = SxxMachine::EvaluationException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;

	PRED_java_conversion_2::PRED_java_conversion_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_java_conversion_2::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2;
	a1 = LARG[0];
	a2 = LARG[1];

	a1 = a1->dref();
	a2 = a2->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{ // a1 = var
		if ((dynamic_cast<FFIObjectTerm*>(a2) != nullptr))
		{ // a1 = var /\ a2 = java
		a1->asVariablelTerm().bind(inverseConversion((a2)->object()), engine->trail);
		}
		else
		{ // a1 = var /\ a2 = nonjava
		a1->asVariablelTerm().bind(a2, engine->trail);
		}
	}
	else if (!(dynamic_cast<VariableTerm*>(a2) != nullptr))
	{ // a1 = nonvar /\ a2 = nonvar
		throw IllegalTypeException(this, 2, "variable", a2);
	}
	else
	{ // a1 = nonvar /\ a2 = var
		// (a1 = java \/  a1 = str \/ a1 = clo) /\ a2 = var
		if ((dynamic_cast<FFIObjectTerm*>(a1) != nullptr) || (dynamic_cast<StructureTerm*>(a1) != nullptr) || (dynamic_cast<ClosureTerm*>(a1) != nullptr))
		{
		a2->asVariablelTerm().bind(a1, engine->trail);
		}
		else
		{ // a1 != java /\ a1 != str /\ a1 != clo /\ a2 = var
		FFIObjectTerm tempVar(a1->toJava());
		a2->asVariablelTerm().bind(&tempVar, engine->trail);
		}
	}
	return cont;
	}

	Term *PRED_java_conversion_2::inverseConversion(any o)
	{
	if (o == nullptr)
	{
		throw EvaluationException(this, 2, "undefined");
	}
	else if (dynamic_cast<optional<char>>(o) != nullptr || dynamic_cast<optional<short>>(o) != nullptr || dynamic_cast<optional<int>>(o) != nullptr || dynamic_cast<optional<long long>>(o) != nullptr)
	{
		return new IntegerTerm((any_cast<Number*>(o)).intValue());
	}
	else if (dynamic_cast<optional<float>>(o) != nullptr || dynamic_cast<optional<double>>(o) != nullptr)
	{
		return new DoubleTerm((any_cast<Number*>(o)).doubleValue());
	}
	else if (dynamic_cast<wstring>(o) != nullptr)
	{
		return SymbolTerm::create(any_cast<wstring>(o));
	}
	else if (dynamic_cast<vector>(o) != nullptr)
	{
		vector v = any_cast<vector>(o);
		Term *t = Prolog::Nil;
		for (int i = v.size(); i > 0; i--)
		{
		t = TermData::CONS(inverseConversion(v[i - 1]), t);
		}
		return t;
	}
	return new FFIObjectTerm(o);
	}
}
