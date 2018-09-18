#pragma once

#include "../../../machine/SxxMachine/SymbolTerm.h"
#include <string>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class PrologException;
}

namespace SxxMachine
{

	using Dynamic = SxxMachine::SymbolTerm::Dynamic;

	/**
	 * Special constants, used to Name variables
	 * 
	 * @see Term
	 * @see Var
	 */
	class PseudoVar : public Dynamic
	{
  public:
	  PseudoVar(int i);

	  /**
	   * Prints out a term to a String with variables named in order V1, V2,....
	   */
	  std::string pprint() override;

	  std::string toQuotedString() throw(PrologException) override;

	  void toStringImpl(int printingFlags, StringBuilder *sb) override;

	  std::string toString() override;

	  PseudoVar(const std::string &s);
	};

}
