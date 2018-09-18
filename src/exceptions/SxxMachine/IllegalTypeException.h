#ifndef ILLEGALTYPEEXCEPTION
#define ILLEGALTYPEEXCEPTION

#include "BuiltinException.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class Operation; }

namespace SxxMachine
{

	/**
	 * Type error.<br>
	 * There will be a type error when the type of an argument or 
	 * one of its components is incorrect, but not a variable.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class IllegalTypeException : public BuiltinException
	{
		/** A functor symbol of <code>type_error/4</code>. */
	public:
		static SymbolTerm* const  TYPE_ERROR;
		/*
		  type ::= atom | atomic | byte | callable | character | compound | evaluable |
		           in_byte | in_character | integer | list | number |
			   predicate_indicator | variable |
			   flaot | java
		*/
		/** Holds a string representation of valid type. */
		const std::string type;
		/** Holds the argument or one of its components which caused the error. */
		Term* const  culprit;
		/** Constructs a new <code>IllegalTypeException</code> 
		 * with a valid type and its culprit. */
		virtual ~IllegalTypeException()
		{
			delete culprit;
		}

		IllegalTypeException(const std::string& _type, Term* _culprit);
		/** Constructs a new <code>IllegalTypeException</code> 
		 * with the given arguments. */
		IllegalTypeException(Operation _goal, const int& _argNo, const std::string& _type, Term* _culprit);
		/** Returns a term representation of this <code>IllegalTypeException</code>:
		 * <code>type_error(goal,argNo,type,culprit)</code>.
		 */
		Term* getMessageTerm() override;
		/** Returns a string representation of this <code>IllegalTypeException</code>. */
		std::string toString() override;
		std::string getMessage() override;

	};

}


#endif	//#ifndef ILLEGALTYPEEXCEPTION
