using namespace std;

#include "PermissionException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{

SymbolTerm* const  PermissionException::PERMISSION_ERROR = SymbolTerm::intern("permission_error", 5);

	PermissionException::PermissionException(Operation _goal, const wstring& _operation, const wstring& _permissionType, Term* _culprit, const wstring& _message) : operation(_operation), permissionType(_permissionType), culprit(_culprit), message(_message)
	{
	this->goal = _goal;
	}

	wstring PermissionException::getMessage()
	{
	return toString();
	}

	Term* PermissionException::getMessageTerm()
	{
	std::vector<Term*> args = { TermData::FFIObject(this->goal), SymbolTerm::create(this->operation), SymbolTerm::create(this->permissionType), this->culprit, SymbolTerm::create(this->message) };
	return TermData::createErrorTerm(this, PERMISSION_ERROR, args);
	}

	wstring PermissionException::toString()
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
	wstring s = "{PERMISSION ERROR: " + this->goal->toString();
	s += " - can not " + this->operation + " " + this->permissionType + " " + this->culprit->toAtomName();
	s += ": " + this->message;
	s += "}";
	return s;
	}
}
