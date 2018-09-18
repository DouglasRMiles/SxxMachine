using namespace std;

#include "SyntaxException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{

SymbolTerm *const SyntaxException::SYNTAX_ERROR = SymbolTerm::intern("syntax_error", 5);

	wstring SyntaxException::getMessage()
	{
	return message;
	}

	SyntaxException::SyntaxException(const wstring &_type, Term *_culprit, const wstring &_message) : type(_type), culprit(_culprit), message(_message)
	{
	}

	SyntaxException::SyntaxException(Operation _goal, int _argNo, const wstring &_type, Term *_culprit, const wstring &_message) : type(_type), culprit(_culprit), message(_message)
	{
	this->goal = _goal;
	this->argNo = _argNo;
	}

	Term *SyntaxException::getMessageTerm()
	{
	std::vector<Term*> args = {TermData::FFIObject(this->goal), TermData::Integer(this->argNo), SymbolTerm::create(this->type), this->culprit, SymbolTerm::create(this->message)};
	return TermData::createErrorTerm(this, SYNTAX_ERROR, args);
	}

	wstring SyntaxException::toString()
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
	wstring s = "{SYNTAX ERROR: " + this->goal->toString();
	if (this->argNo > 0)
	{
		s += " - arg " + to_string(this->argNo);
	}
	s += ": expected " + this->type;
	s += ", found " + this->culprit->toAtomName();
	s += "}";
	return s;
	}
}
