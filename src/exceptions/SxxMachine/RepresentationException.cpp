using namespace std;

#include "RepresentationException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{

SymbolTerm* const  RepresentationException::REPRESENTATION_ERROR = SymbolTerm::intern("representation_error", 3);

	RepresentationException::RepresentationException(const wstring& _flag) : flag(_flag)
	{
	}

	RepresentationException::RepresentationException(Operation _goal, const int& _argNo, const wstring& _flag) : flag(_flag)
	{
	this->goal = _goal;
	this->argNo = _argNo;
	}

	Term* RepresentationException::getMessageTerm()
	{
	std::vector<Term*> args = { TermData::FFIObject(this->goal), TermData::Integer(this->argNo), SymbolTerm::create(this->flag) };
	return TermData::createErrorTerm(this, REPRESENTATION_ERROR, args);
	}

	wstring RepresentationException::toString()
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
	wstring s = "{REPRESENTATION ERROR: " + this->goal->toString();
	if(this->argNo > 0)
	{
		s += " - arg " + to_string(this->argNo);
	}
	s += ": limit of " + this->flag + " is breached";
	s += "}";
	return s;
	}

	wstring RepresentationException::getMessage()
	{
	return toString();
	}
}
