using namespace std;

#include "PRED_line_count_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/PrologException.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../exceptions/SxxMachine/ExistenceException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../exceptions/SxxMachine/PermissionException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../machine/SxxMachine/LineNumberPushbackReader.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using IntegerTerm = SxxMachine::IntegerTerm;
	using LineNumberPushbackReader = SxxMachine::LineNumberPushbackReader;
	using Operation = SxxMachine::Operation;
	using P2 = SxxMachine::Predicate::P2;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using ExistenceException = SxxMachine::ExistenceException;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using PermissionException = SxxMachine::PermissionException;
	using PrologException = SxxMachine::PrologException;

	PRED_line_count_2::PRED_line_count_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_line_count_2::exec(Prolog *engine) throw(PrologException)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		any stream = nullptr;
		Term *t;

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
		// get line number
		IntegerTerm tempVar((any_cast<LineNumberPushbackReader*>(stream)).getLineNumber() + 1);
		if (!(dynamic_cast<LineNumberPushbackReader*>(stream) != nullptr) || !a2->unify(&tempVar, engine->trail))
		{
		//		if (!a2.unify(new IntegerTerm(0),engine.trail)){ // uncomment this for creating patch and comment two lines above
				return engine->fail();
		}
		return cont;
	}
}
