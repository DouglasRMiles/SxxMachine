using namespace std;

#include "ClauseWriter.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../terms/SxxMachine/Expect.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "IO.h"

namespace SxxMachine
{

	ClauseWriter::ClauseWriter(const wstring& f, Prog* p) : CharWriter(f, p)
	{
	}

	ClauseWriter::ClauseWriter(Prog* p) : CharWriter(p)
	{
	}

	int ClauseWriter::putElement(Term* t)
	{
		if(nullptr == writer)
		{
			return 0;
		}
		wstring s = "";
		if((t->isStructure()) && "$string" == Expect::asStruct(t)->name())
		{
			SymbolTerm* Xs = Expect::asConst(Expect::asStruct(t)->ArgDeRef(0));
			s = Term::charsToString(Xs);
		} else
		{
			s = t->pprint();
		}
		IO::print(writer, s);
		return 1;
	}
}
