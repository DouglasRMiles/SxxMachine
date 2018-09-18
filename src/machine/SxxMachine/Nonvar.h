#pragma once

#include "Term.h"
#include <string>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
	class Prog;
	class KPTrail;
}

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

		Term *ArgDeRef(int i) override;

		Term *ArgNoDeRef(int i) override;

		virtual int unifyArg(int i, Term *a, Prog *p);

		virtual int getIntArg(int i);

		std::string name() = 0 override;

		virtual bool bind(Term *that, KPTrail *trail);

		bool Unify_TO(Term *that, KPTrail *trail) override;

		/**
		 * returns a list representation of the object
		 */
		virtual Nonvar *listify();
	};

}
