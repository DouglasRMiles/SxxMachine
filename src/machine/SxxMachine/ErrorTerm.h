#ifndef ERRORTERM
#define ERRORTERM

#include "StructureTerm.h"
#include <string>
#include <vector>
#include <stdexcept>
#include <any>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }

namespace SxxMachine
{

	/**
	 * A term to represent errors, extends {@link StructureTerm}, 
	 * additionally holds reference to {@link Throwable}, which this term represents.
	 * @author a.semenov@unipro.ru
	 *
	 */
	class ErrorTerm : public StructureTerm
	{
		//@Override
	public:
		virtual bool isError();
	private:
		const std::runtime_error error;

	public:
		ErrorTerm(std::runtime_error error, const std::string& name, std::vector<Term> &args);

		ErrorTerm(std::runtime_error error, Term* _functor, std::vector<Term> &_args);
		virtual std::runtime_error getThrowable();

	protected:
		Term* copyImpl(IdentityHashMap<std::any, Term*>* copyHash, const int& deeply) override;
	};

}


#endif	//#ifndef ERRORTERM
