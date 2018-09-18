#ifndef ILLEGALDOMAINEXCEPTION
#define ILLEGALDOMAINEXCEPTION

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
	 * Domain error.<br>
	 * There will be a domain error when the type of an argument
	 * is correct, but the value is outside the domain for which
	 * the procedure is defined.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class IllegalDomainException : public BuiltinException
	{
		/** A functor symbol of <code>domain_error/4</code>. */
	public:
		static SymbolTerm* const  DOMAIN_ERROR;
		/*
		  domain ::= character_code_list | close_option | flag_value | io_mode | 
		             non_empty_list | not_less_than_zero | operator_priority |
			 operator_specifier | prolog_flag | read_option | source_sink |
			 stream | steam_option | stream_or_alias | stream_position |
			 stream_property | write_option |
			 hash_or_alias| hash_option | 'arithmetic expression'
		*/
		/** Holds a string representation of valid domain. */
		const std::string domain;
		/** Holds the argument or one of its components which caused the error. */
		Term* const  culprit;
		/** Constructs a new <code>IllegalDomainException</code>
		 * with a valid domain and its culprit. */
		virtual ~IllegalDomainException()
		{
			delete culprit;
		}

		IllegalDomainException(const std::string& _domain, Term* _culprit);
		/** Constructs a new <code>IllegalDomainException</code> 
		 * with the given arguments. */
		IllegalDomainException(Operation _goal, const int& _argNo, const std::string& _domain, Term* _culprit);
		/** Returns a term representation of this <code>IllegalDomainException</code>:
		 * <code>domain_error(goal,argNo,type,culprit)</code>.
		 */
		Term* getMessageTerm() override;
		/** Returns a string representation of this <code>IllegalDomainException</code>. */
		std::string toString() override;
		std::string getMessage() override;

	};

}


#endif	//#ifndef ILLEGALDOMAINEXCEPTION
