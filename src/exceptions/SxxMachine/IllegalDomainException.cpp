using namespace std;

#include "IllegalDomainException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{

SymbolTerm *const IllegalDomainException::DOMAIN_ERROR = SymbolTerm::intern("domain_error", 4);

	IllegalDomainException::IllegalDomainException(const wstring &_domain, Term *_culprit) : domain(_domain), culprit(_culprit)
	{
	}

	IllegalDomainException::IllegalDomainException(Operation _goal, int _argNo, const wstring &_domain, Term *_culprit) : domain(_domain), culprit(_culprit)
	{
	this->goal = _goal;
	this->argNo = _argNo;
	}

	Term *IllegalDomainException::getMessageTerm()
	{
	std::vector<Term*> args = {TermData::FFIObject(this->goal), TermData::Integer(this->argNo), SymbolTerm::create(this->domain), this->culprit};
	return TermData::createErrorTerm(this, DOMAIN_ERROR, args);
	}

	wstring IllegalDomainException::toString()
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
	wstring s = "{DOMAIN ERROR: " + this->goal->toString();
	if (this->argNo > 0)
	{
		s += " - arg " + to_string(this->argNo);
	}
	s += ": expected " + this->domain;
	s += ", found " + this->culprit->toAtomName();
	s += "}";
	return s;
	}

	wstring IllegalDomainException::getMessage()
	{
	return toString();
	}
}
