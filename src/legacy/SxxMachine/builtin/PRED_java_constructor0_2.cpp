using namespace std;

#include "PRED_java_constructor0_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/ExistenceException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/JavaException.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using JavaPredicate = SxxMachine::JavaPredicate;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using ExistenceException = SxxMachine::ExistenceException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using JavaException = SxxMachine::JavaException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_java_constructor0_2::PRED_java_constructor0_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_java_constructor0_2::exec(Prolog *engine)
	{
		engine->requireFeature(Prolog::Feature::JAVA_REFLECTION, this, LARG[0]);
		engine->setB0();

	Term *a1, *a2;
	a1 = LARG[0];
	a2 = LARG[1];

	type_info clazz = nullptr;
	any instance = nullptr;
	int arity;
	std::vector<Constructor*> constrs;
	std::vector<Term*> pArgs;
	std::vector<any> jArgs;
	Constructor *c = nullptr;

	try
	{
		// 2nd. argument (unbound variable)
		a2 = a2->dref();
		if (!(dynamic_cast<VariableTerm*>(a2) != nullptr))
		{
		throw IllegalTypeException(this, 2, "variable", a2);
		}
		// 1st. argument (atom or callable term)
		a1 = a1->dref();
		if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
		{
		throw PInstantiationException(this, 1);
		}
		if (!(dynamic_cast<SymbolTerm*>(a1) != nullptr) && !(dynamic_cast<StructureTerm*>(a1) != nullptr))
		{
		throw IllegalTypeException(this, 1, "callable", a1);
		}
		if ((dynamic_cast<SymbolTerm*>(a1) != nullptr))
		{ // No argument constructor
		clazz = type_info::forName(a1->asSymbolTerm()->name());
		instance = clazz.newInstance();
		if (!a2->unify(toPrologTerm(instance), engine->trail))
		{
			return engine->fail();
		}
		return cont;
		}
		// Parameterized constructor
		clazz = type_info::forName((a1)->name());
		arity = (a1)->arity();
		constrs = clazz.getConstructors();
		if (constrs.empty())
		{
		throw ExistenceException(this, 1, "constructor", a1, "");
		}
		pArgs = (a1)->args();
		jArgs = std::vector<any>(arity);
		for (int i = 0; i < arity; i++)
		{
		pArgs[i] = pArgs[i]->dref();
		if (!(dynamic_cast<FFIObjectTerm*>(pArgs[i]) != nullptr))
		{
			pArgs[i] = new FFIObjectTerm(pArgs[i]);
		}
		jArgs[i] = pArgs[i]->toJava();
		}
		for (auto constr : constrs)
		{
			if (checkParameterTypes(constr->getParameterTypes(), pArgs))
			{
				try
				{
					c = constr;
					//c.setAccessible(true);
					instance = c->newInstance(jArgs);
					break; // Succeeds to create new instance
				}
				catch (const runtime_error &e)
				{
					c = nullptr; // Back to loop
				}
			}
		}
		if (c == nullptr)
		{
		throw ExistenceException(this, 1, "constructor", a1, "");
		}
		if (!a2->unify(toPrologTerm(instance), engine->trail))
		{
		return engine->fail();
		}
		return cont;
	}
	catch (const ClassNotFoundException &e)
	{ // Class.forName(..)
		throw JavaException(this, 1, e);
	}
	catch (const InstantiationException &e)
	{ // Class.forName(..) or Constructor.newInstance()
		throw JavaException(this, 1, e);
	}
	catch (const IllegalAccessException &e)
	{ // Class.forName(..) or Constructor.newInstance()
		throw JavaException(this, 1, e);
	}
	catch (const SecurityException &e)
	{ // Class.getConstructors()
		throw JavaException(this, 1, e);
	}
	catch (const invalid_argument &e)
	{ // Constructor.newInstance()
		throw JavaException(this, 1, e);
	}
	}

	Term *PRED_java_constructor0_2::toPrologTerm(any obj)
	{
	if (Term::instanceOfTerm(obj))
	{
		return any_cast<Term*>(obj);
	}
	else
	{
		return new FFIObjectTerm(obj);
	}
	}
}
