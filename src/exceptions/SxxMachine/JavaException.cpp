using namespace std;

#include "JavaException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{

SymbolTerm *const JavaException::JAVA_ERROR = SymbolTerm::intern("java_error", 3);

	JavaException::JavaException(runtime_error _e) : e(_e)
	{
		initCause(_e);
	}

	JavaException::JavaException(Operation _goal, int _argNo, runtime_error _e) : JavaException(_e)
	{
		this->goal = _goal;
		this->argNo = _argNo;
	}

	Term *JavaException::getMessageTerm()
	{
		std::vector<Term*> args = {(this->goal == nullptr)?SymbolTerm::create("<Goal unknown>"):TermData::FFIObject(this->goal), TermData::Integer(this->argNo), TermData::FFIObject(this->e)};
		return TermData::createErrorTerm(this, JAVA_ERROR, args);
	}

	runtime_error JavaException::getException()
	{
		return this->e;
	}

	wstring JavaException::toString()
	{
		StringBuilder *sb = new StringBuilder("{JAVA ERROR: ");
		sb->append(this->goal);
		if (this->argNo > 0)
		{
			sb->append(" - arg ")->append(this->argNo);
		}
		sb->append(", occurs ")->append(this->e);
		sb->append("}");
		return sb->toString();
	}

	wstring JavaException::getMessage()
	{
	return toString();
	}
}
