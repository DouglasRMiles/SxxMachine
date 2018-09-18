using namespace std;

#include "InternalException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{

SymbolTerm* const  InternalException::INTERNAL_ERROR = SymbolTerm::intern("internal_error", 1);

	InternalException::InternalException(const wstring& _message) : message(_message)
	{
	}

	Term* InternalException::getMessageTerm()
	{
	std::vector<Term*> args = { SymbolTerm::create(this->message) };
	return TermData::createErrorTerm(this, INTERNAL_ERROR, args);
	}

	wstring InternalException::toString()
	{
	wstring s = "{INTERNAL ERROR: " + this->message;
	s += "}";
	return s;
	}

	wstring InternalException::getMessage()
	{
	return toString();
	}
}
