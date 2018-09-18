using namespace std;

#include "PRED_file_directory_name_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/PrologException.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"

namespace SxxMachine::am2j
{
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using Operation = SxxMachine::Operation;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using PrologException = SxxMachine::PrologException;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;

	PRED_file_directory_name_2::PRED_file_directory_name_2(Term* a1, Term* a2, Operation next)
	{
	  LARG[0] = a1;
	  LARG[1] = a2;
	  cont = next;
	}

	Operation PRED_file_directory_name_2::exec(Prolog* engine) throw(PrologException)
	{
	  engine->requireFeature(Prolog::Feature::IO, this, LARG[0]);
	  engine->setB0();

	  Term* a1 = LARG[0]->dref();
	  if(dynamic_cast<VariableTerm*>(a1) != nullptr)
	  {
		  throw PInstantiationException(this, 1);
	  }
	  if(!(dynamic_cast<SymbolTerm*>(a1) != nullptr))
	  {
		  throw IllegalDomainException(this, 1, "file", a1);
	  }

	  File* file = new File(a1->name());
	  File* dir = file->getParentFile();
	  if(dir == nullptr)
	  {
		  throw IllegalDomainException(this, 1, "file", a1);
	  }

	  Term* a2 = LARG[1]->dref();
	  if(a2->unify(SymbolTerm::create(dir->getPath()), engine->trail))
	  {
		return cont;
	  } else
	  {
		return engine->fail();
	  }
	}
}
