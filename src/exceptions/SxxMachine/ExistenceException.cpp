using namespace std;

#include "ExistenceException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{

SymbolTerm *const ExistenceException::EXISTENCE_ERROR = SymbolTerm::intern("existence_error", 5);

	ExistenceException::ExistenceException(const wstring &_objType, Term *_culprit, const wstring &_message) : objType(_objType), culprit(_culprit), message(_message.intern())
	{
	}

	ExistenceException::ExistenceException(Operation _goal, int _argNo, const wstring &_objType, Term *_culprit, const wstring &_message) : objType(_objType), culprit(_culprit), message(_message.intern())
	{
	this->goal = _goal;
	this->argNo = _argNo;
	}

	wstring ExistenceException::getMessage()
	{
	  return this->message;
	}

	Term *ExistenceException::getMessageTerm()
	{
	  if (messageTerm == nullptr)
	  {
		std::vector<Term*> args = {TermData::FFIObject(this->goal), TermData::Integer(this->argNo), SymbolTerm::create(this->objType), this->culprit, SymbolTerm::create(this->message)};
		messageTerm = TermData::createErrorTerm(this, EXISTENCE_ERROR, args);
	  }
	return messageTerm;
	}

	wstring ExistenceException::toString()
	{
	wstring s = "{EXISTENCE ERROR:";
	if (this->argNo > 0)
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		s += " " + this->goal->toString() + " - arg " + to_string(this->argNo) + ":";
	}
	s += this->objType + " " + this->culprit->toAtomName() + " does not exist";
	s += "}";
	return s;
	}
}
