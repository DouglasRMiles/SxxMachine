using namespace std;

#include "BuiltinException.h"
#include "../../machine/SxxMachine/Term.h"

namespace SxxMachine
{

	BuiltinException::BuiltinException()
	{
	}

	BuiltinException::BuiltinException(Term *_message)
	{
	this->messageTerm = _message;
	}

	Term *BuiltinException::getMessageTerm()
	{
	return this->messageTerm;
	}
}
