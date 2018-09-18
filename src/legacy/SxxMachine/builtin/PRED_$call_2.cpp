using namespace std;

#include "PRED_$call_2.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/ExistenceException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/SystemException.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using ExistenceException = SxxMachine::ExistenceException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using SystemException = SxxMachine::SystemException;
SxxMachine::SymbolTerm *const PRED_$call_2::SYM_SLASH_2 = SxxMachine::SymbolTerm::intern("/", 2);
SxxMachine::SymbolTerm *const PRED_$call_2::SYM_COLON_2 = SxxMachine::SymbolTerm::intern(":", 2);
std::vector<SxxMachine::Term*> const PRED_$call_2::NO_ARGS = std::vector<SxxMachine::Term*>(0);

	PRED_$call_2::PRED_$call_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_$call_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0]->dref(); // a1 must be atom of package name
		a2 = LARG[1]->dref(); // a2 must be callable name

		wstring functor;
		int arity;
		std::vector<Term*> args;
		//	Class clazz;
		//	Constructor constr;
		//	Operation pred;

		try
		{
			if (!(dynamic_cast<SymbolTerm*>(a1) != nullptr))
			{
				throw IllegalTypeException(this, 1, "atom", a1);
			}
			if ((dynamic_cast<SymbolTerm*>(a2) != nullptr))
			{
				functor = a2->name();
				args = NO_ARGS; //new Term[]{};
				arity = 0;
			}
			else if ((dynamic_cast<StructureTerm*>(a2) != nullptr))
			{
				functor = a2->name();
				args = (a2)->args();
				arity = a2->arity();
			}
			else
			{
				throw IllegalTypeException(this, 2, "callable", a2);
			}
			try
			{
				return engine->pcl->predicate(a1->name(), functor, {cont, args});
			}
			catch (const ExistenceException &e)
			{
				try
				{
					return engine->pcl->predicate(Prolog::BUILTIN, functor, {cont, args});
				}
				catch (const ExistenceException &e2)
				{
					if ((engine->getUnknown()) == "fail")
					{
						return engine->fail();
					}

					StructureTerm tempVar(SYM_SLASH_2, SymbolTerm::create(functor), new IntegerTerm(arity));
					Term *what = new StructureTerm(SYM_COLON_2, a1, &tempVar);
					ExistenceException *err = new ExistenceException(this, 0, "procedure", what, e->what());
					err->initCause(e);
					throw err;
				}
			}
		}
		catch (const invalid_argument &e)
		{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
			throw SystemException(e.what() + " in " + this->toString());
		}
	}
}
