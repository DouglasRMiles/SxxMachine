using namespace std;

#include "Expect.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/LongTerm.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../io/SxxMachine/CharReader.h"
#include "../../../machine/SxxMachine/NumberTerm.h"
#include "../../../machine/SxxMachine/Nonvar.h"
#include "../../../machine/SxxMachine/Prolog.h"

namespace SxxMachine
{

	SymbolTerm* Expect::asConst(Term* i)
	{
		// TODO Auto-generated method stub
		return static_cast<SymbolTerm*>(i->asConst());
	}

	LongTerm* Expect::asInt(Term* i)
	{
		// TODO Auto-generated method stub
		return i->asLongTerm();
	}

	StructureTerm* Expect::asCons(Term* i)
	{
		// TODO Auto-generated method stub
		return static_cast<StructureTerm*>(i->asListTerm());
	}

	StructureTerm* Expect::asStruct(Term* i)
	{
		// TODO Auto-generated method stub
		return static_cast<StructureTerm*>(i->asStructureTerm());
	}

	StructureTerm* Expect::asConj(Term* i)
	{
		// TODO Auto-generated method stub
		return static_cast<StructureTerm*>(i->asStructureTerm());
	}

	CharReader* Expect::asCharReader(Term* i)
	{
		// TODO Auto-generated method stub
		return static_cast<CharReader*>(i->toValue());
	}

	NumberTerm* Expect::asNum(Term* i)
	{
		// TODO Auto-generated method stub
		return i->asNumberTerm();
	}

	Nonvar* Expect::the(Term* X)
	{
		return (nullptr == X) ? Prolog::aNo : StructureTerm::S("the", { X });
	}
}
