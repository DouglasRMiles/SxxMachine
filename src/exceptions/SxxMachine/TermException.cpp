using namespace std;

#include "TermException.h"
#include "../../machine/SxxMachine/Term.h"

namespace SxxMachine
{

	TermException::TermException()
	{
	}

	TermException::TermException(Term* _message) : PrologException(_message->toAtomName())
	{
	this->messageTerm = _message;
	}

	Term* TermException::getMessageTerm()
	{
	return this->messageTerm;
	}

	wstring TermException::getMessage()
	{
	return messageTerm->pprint();
	}
}
