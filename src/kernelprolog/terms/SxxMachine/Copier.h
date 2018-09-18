#ifndef COPIER
#define COPIER

#include "../../../machine/SxxMachine/SystemObject.h"
#include <vector>
#include <any>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class HashDict; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class Nonvar; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class StructureTerm; }

namespace SxxMachine
{

	//!depends
	/**
	 * Term Copier agent. Has its own Variable dictionnary. Uses a generic action
	 * propagator which recurses over Terms.
	 */
	class Copier : public SystemObject
	{
	private:
		HashDict* dict;

		/**
		 * creates a new Copier together with its related HashDict for variables
		 */
	public:
		virtual ~Copier()
		{
			delete dict;
		}

		Copier();

		/**
		 * This action only defines what happens here (at this <b> place </b>). Ageneric
		 * mechanism will be used to recurse over Terms in a (truly:-)) OO style (well,
		 * looks more like some Haskell stuff, but who cares).
		 */
		Term* action(Term* place) override;

		virtual Term* copyMe(Term* that);

		/**
		 * Reifies an Iterator as a ArrayList. ArrayList.iterator() can give back the
		 * ArrayList.iterator() can give back the iterator if needed.
		 * 
		 * @see Copier
		 */
		static std::vector EnumerationToVector(Iterator* e);

		static std::vector ConsToVector(Nonvar* Xs);

		/**
		 * Converts a reified Iterator to functor based on name of Const c and Arguments
		 * being the elements of the Iterator.
		 */

		static Term* toFun(SymbolTerm* c, Iterator* e);

		/**
		 * Represents a list [f,a1...,an] as f(a1,...,an)
		 */

		static StructureTerm* VectorToFun(std::vector V);

		/**
		 * Extracts the free variables of a Term, using a care of recursing over its
		 * structure. It can be speeded up through specialization.
		 */
		static SymbolTerm* const  anAnswer;

		virtual Term* getMyVars(Term* that);

	};

}


#endif	//#ifndef COPIER
