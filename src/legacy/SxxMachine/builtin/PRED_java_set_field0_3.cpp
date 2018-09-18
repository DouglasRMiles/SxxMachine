using namespace std;

#include "PRED_java_set_field0_3.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../exceptions/SxxMachine/JavaException.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using JavaPredicate = SxxMachine::JavaPredicate;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using JavaException = SxxMachine::JavaException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_java_set_field0_3::PRED_java_set_field0_3(Term *a1, Term *a2, Term *a3, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	LARG[2] = a3;
	this->cont = cont;
	}

	Operation PRED_java_set_field0_3::exec(Prolog *engine)
	{
		engine->requireFeature(Prolog::Feature::JAVA_REFLECTION, this, LARG[0]);
		engine->setB0();

	Term *a1, *a2, *a3;
	a1 = LARG[0];
	a2 = LARG[1];
	a3 = LARG[2];

	type_info clazz = nullptr;
	any instance = nullptr;
	Field *field = nullptr;
	any value = nullptr;

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
		// 2nd. argument (atom)
		a2 = a2->dref();
		if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
		{
		throw PInstantiationException(this, 2);
		}
		else if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{
		throw IllegalTypeException(this, 2, "atom", a2);
		}
		field = clazz.getField(a2->asSymbolTerm()->name());
		// 3rd. argument (term)
		a3 = a3->dref();
		if ((dynamic_cast<FFIObjectTerm*>(a3) != nullptr))
		{
		value = a3->toJava();
		}
		else
		{
		value = a3;
		}
		field->set(instance, value);
		return cont;
	}
	catch (const ClassNotFoundException &e)
	{ // Class.forName
		throw JavaException(this, 1, e);
	}
	catch (const NoSuchFieldException &e)
	{ // Class.getField(..)
		throw JavaException(this, 2, e);
	}
	catch (const SecurityException &e)
	{ // Class.getField(..)
		throw JavaException(this, 2, e);
	}
	catch (const NullPointerException &e)
	{ // Class.getField(..)
		throw JavaException(this, 2, e);
	}
	catch (const IllegalAccessException &e)
	{ // Field.get(..)
		throw JavaException(this, 2, e);
	}
	catch (const invalid_argument &e)
	{ // Field.get(..)
		throw JavaException(this, 2, e);
	}
	}
}
