using namespace std;

#include "SystemException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{

SymbolTerm* const  SystemException::SYSTEM_ERROR = SymbolTerm::intern("system_error", 1);

	wstring SystemException::getMessage()
	{
	return message;
	}

	SystemException::SystemException(const wstring& _message) : message(_message)
	{
	}

	Term* SystemException::getMessageTerm()
	{
	std::vector<Term*> args = { SymbolTerm::create(this->message) };
	return TermData::createErrorTerm(this, SYSTEM_ERROR, args);
	}

	wstring SystemException::toString()
	{
	wstring s = "{SYSTEM ERROR: " + this->message;
	s += "}";
	return s;
	}
}
