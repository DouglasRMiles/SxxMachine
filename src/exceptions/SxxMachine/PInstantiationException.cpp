using namespace std;

#include "PInstantiationException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{

SymbolTerm *const PInstantiationException::INSTANTIATION_ERROR = SymbolTerm::intern("instantiation_error", 2);

	PInstantiationException::PInstantiationException()
	{
	}

	PInstantiationException::PInstantiationException(Operation _goal, int _argNo)
	{
	this->goal = _goal;
	this->argNo = _argNo;
	}

	Term *PInstantiationException::getMessageTerm()
	{
	std::vector<Term*> args = {TermData::FFIObject(this->goal), TermData::Integer(this->argNo)};
	return TermData::createErrorTerm(this, INSTANTIATION_ERROR, args);
	}

	wstring PInstantiationException::toString()
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
	wstring s = "{INSTANTIATION ERROR: " + this->goal->toString();
	if (this->argNo > 0)
	{
		s += " - arg " + to_string(this->argNo);
	}
	s += "}";
	return s;
	}

	wstring PInstantiationException::getMessage()
	{
	return toString();
	}
}
