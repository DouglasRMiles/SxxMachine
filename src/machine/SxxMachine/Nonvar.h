#ifndef NONVAR
#define NONVAR

#include "Term.h"
#include <string>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }
namespace SxxMachine { class Prog; }
namespace SxxMachine { class KPTrail; }

namespace SxxMachine
{

	/**
	 * Part of the Prolog Term hierarchy
	 * 
	 * @see Term
	 */
	class Nonvar : public Term
	{

		//	public boolean equalsTerm(Term ano2) {
		//		return this==ano2;
		//	}
	public:
		bool isNonvar() override;

		Term* ArgDeRef(const int& i) override;

		Term* ArgNoDeRef(const int& i) override;

		virtual int unifyArg(const int& i, Term* a, Prog* p);

		virtual int getIntArg(const int& i);

		std::string name() = 0 override;

		virtual bool bind(Term* that, KPTrail* trail);

		bool Unify_TO(Term* that, KPTrail* trail) override;

		/**
		 * returns a list representation of the object
		 */
		virtual Nonvar* listify();
	};

}


#endif	//#ifndef NONVAR
