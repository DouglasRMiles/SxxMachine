using namespace std;

#include "EvaluationException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{

SymbolTerm *const EvaluationException::EVALUATION_ERROR = SymbolTerm::intern("evaluation_error", 3);

	EvaluationException::EvaluationException(const wstring &_errorType) : errorType(_errorType)
	{
	}

	EvaluationException::EvaluationException(Operation _goal, int _argNo, const wstring &_errorType) : errorType(_errorType)
	{
		this->goal = _goal;
		this->argNo = _argNo;
	}

	Term *EvaluationException::getMessageTerm()
	{
		std::vector<Term*> args = {TermData::FFIObject(this->goal), TermData::Integer(this->argNo), SymbolTerm::create(this->errorType)};
		return TermData::createErrorTerm(this, EVALUATION_ERROR, args);
	}

	wstring EvaluationException::toString()
	{
		wstring s = "{EVALUATION ERROR: " + this->goal;
		if (this->argNo > 0)
		{
			s += " - arg " + to_string(this->argNo);
		}
		s += ", found " + this->errorType;
		s += "}";
		return s;
	}

	wstring EvaluationException::getMessage()
	{
	return toString();
	}
}
