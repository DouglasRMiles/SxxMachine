using namespace std;

#include "ErrorTerm.h"
#include "Term.h"
#include "TermData.h"

namespace SxxMachine
{

	bool ErrorTerm::isError()
	{
		return true;
	}

	ErrorTerm::ErrorTerm(runtime_error error, const wstring& name, vector<Term> &args) : StructureTerm(name, args), error(error)
	{
	}

	ErrorTerm::ErrorTerm(runtime_error error, Term* _functor, vector<Term> &_args) : StructureTerm(_functor, _args), error(error)
	{
	}

	runtime_error ErrorTerm::getThrowable()
	{
		return this->error;
	}

	Term* ErrorTerm::copyImpl(IdentityHashMap<any, Term*>* copyHash, const int& deeply)
	{
		std::vector<Term*> a(arity());
		for(int i = 0; i < a.size(); i++)
		{
			a[i] = arg0(i)->copy(copyHash, deeply);
		}
		return TermData::createErrorTerm(this->error, functor(), a);
	}
}
