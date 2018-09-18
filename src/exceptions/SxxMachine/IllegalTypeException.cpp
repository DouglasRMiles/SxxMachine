using namespace std;

#include "IllegalTypeException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{

SymbolTerm *const IllegalTypeException::TYPE_ERROR = SymbolTerm::intern("type_error", 4);

	IllegalTypeException::IllegalTypeException(const wstring &_type, Term *_culprit) : type(_type), culprit(_culprit)
	{
	}

	IllegalTypeException::IllegalTypeException(Operation _goal, int _argNo, const wstring &_type, Term *_culprit) : type(_type), culprit(_culprit)
	{
		this->goal = _goal;
		this->argNo = _argNo;
	}

	Term *IllegalTypeException::getMessageTerm()
	{
		std::vector<Term*> args = {(this->goal == nullptr)?SymbolTerm::create("<Goal unknown>"):TermData::FFIObject(this->goal), TermData::Integer(this->argNo), SymbolTerm::create(this->type), this->culprit};
		return TermData::createErrorTerm(this, TYPE_ERROR, args);
	}

	wstring IllegalTypeException::toString()
	{
		wstring s = "{TYPE ERROR: " + this->goal;
		if (this->argNo > 0)
		{
			s += " - arg " + to_string(this->argNo);
		}
		s += ": expected " + this->type;
		s += ", found " + this->culprit->toAtomName();
		s += "}";
		return s;
	}

	wstring IllegalTypeException::getMessage()
	{
	return toString();
	}
}
