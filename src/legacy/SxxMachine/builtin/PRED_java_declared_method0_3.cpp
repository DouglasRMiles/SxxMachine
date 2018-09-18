using namespace std;

#include "PRED_java_declared_method0_3.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/ExistenceException.h"
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

	PRED_java_declared_method0_3::PRED_java_declared_method0_3(Term *a1, Term *a2, Term *a3, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	LARG[2] = a3;
	this->cont = cont;
	}

	Operation PRED_java_declared_method0_3::exec(Prolog *engine)
	{
		engine->requireFeature(Prolog::Feature::JAVA_REFLECTION, this, LARG[0]);
		engine->setB0();

	Term *a1, *a2, *a3;
	a1 = LARG[0];
	a2 = LARG[1];
	a3 = LARG[2];

	type_info clazz = nullptr;
	any instance = nullptr;
	std::vector<Method*> methods;
	Method *m = nullptr;
	any value = nullptr;
	int arity;
	std::vector<Term*> pArgs;
	std::vector<any> jArgs;
	wstring methodName = "";

	// 3rd. argument (unbound variable)
	a3 = a3->dref();
	if (!(dynamic_cast<VariableTerm*>(a3) != nullptr))
	{
		throw IllegalTypeException(this, 3, "variable", a3);
	}
	try
	{
		// 1st. argument (atom or java term)
		a1 = a1->dref();
		if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
		{
		throw PInstantiationException(this, 1);
		}
		else if ((dynamic_cast<SymbolTerm*>(a1) != nullptr))
		{ // class
		clazz = type_info::forName(a1->asSymbolTerm()->name());
		}
		else if ((dynamic_cast<FFIObjectTerm*>(a1) != nullptr))
		{ // instance
		instance = (a1)->object();
		clazz = (a1)->getClazz();
		}
		else
		{
		throw IllegalTypeException(this, 1, "atom_or_java", a1);
		}
		// 2nd. argument (atom or callable term)
		a2 = a2->dref();
		if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
		{
		throw PInstantiationException(this, 2);
		}
		else if ((dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{ // No argument method
		m = clazz.getDeclaredMethod(a2->asSymbolTerm()->name());
		m->setAccessible(true);
		value = m->invoke(instance);
		}
		else if ((dynamic_cast<StructureTerm*>(a2) != nullptr))
		{ // Parameterized method
		methodName = (a2)->name();
		arity = (a2)->arity();
		methods = clazz.getDeclaredMethods();
		if (methods.empty())
		{
			throw ExistenceException(this, 2, "method", a2, "");
		}
		pArgs = (a2)->args();
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
			for (auto method : methods)
			{
				if (method->getName().equals(methodName) && checkParameterTypes(method->getParameterTypes(), pArgs))
				{
					try
					{
						m = method;
						m->setAccessible(true);
						value = m->invoke(instance, jArgs);
						break; // Succeeds to invoke the method
					}
					catch (const runtime_error &e)
					{
						m = nullptr; // Back to loop
					}
				}
			}
		if (m == nullptr)
		{
			throw ExistenceException(this, 2, "method", a2, "");
		}
		}
		else
		{
		throw IllegalTypeException(this, 2, "callable", a2);
		}
		if (value == nullptr)
		{
		return cont;
		}
		if (!a3->unify(toPrologTerm(value), engine->trail))
		{
		return engine->fail();
		}
		return cont;
	}
	catch (const ClassNotFoundException &e)
	{ // Class.forName
		throw JavaException(this, 1, e);
	}
	catch (const NoSuchMethodException &e)
	{ // Class.getDeclaredMethod
		throw JavaException(this, 2, e);
	}
	catch (const SecurityException &e)
	{ // Class.getDeclaredMethods
		throw JavaException(this, 2, e);
	}
	catch (const IllegalAccessException &e)
	{ // Method.invoke
		throw JavaException(this, 2, e);
	}
	catch (const invalid_argument &e)
	{ // Method.invoke
		throw JavaException(this, 2, e);
	}
	catch (const InvocationTargetException &e)
	{ // Method.invoke
		throw JavaException(this, 2, e);
	}
	catch (const NullPointerException &e)
	{ // Method.invoke
		throw JavaException(this, 2, e);
	}
	}

	Term *PRED_java_declared_method0_3::toPrologTerm(any obj)
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
