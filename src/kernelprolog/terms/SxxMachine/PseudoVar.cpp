using namespace std;

#include "PseudoVar.h"
#include "../../../exceptions/SxxMachine/PrologException.h"
#include "StringBuilder.h"

namespace SxxMachine
{
	using Dynamic = SxxMachine::SymbolTerm::Dynamic;

	PseudoVar::PseudoVar(const int& i) : SxxMachine::SymbolTerm::Dynamic("V_" + i)
	{
	}

	wstring PseudoVar::pprint()
	{
	  return name();
	}

	wstring PseudoVar::toQuotedString() throw(PrologException)
	{
	  // TODO Auto-generated method stub
	  return pprint();
	}

	void PseudoVar::toStringImpl(const int& printingFlags, StringBuilder* sb)
	{
	  // TODO Auto-generated method stub
	  sb->append(toQuotedString());
	}

	wstring PseudoVar::toString()
	{
	  // TODO Auto-generated method stub
	  return pprint();
	}

	PseudoVar::PseudoVar(const wstring& s) : SxxMachine::SymbolTerm::Dynamic(s)
	{
	}
}
