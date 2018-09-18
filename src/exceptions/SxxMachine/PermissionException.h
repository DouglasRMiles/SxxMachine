#pragma once

#include "BuiltinException.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Term;
	class Operation;
}

namespace SxxMachine
{

	/**
	 * Permission error.<br>
	 * There will be a permission error when it is not permitted
	 * to perform a specific operation.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class PermissionException : public BuiltinException
	{
		/** A functor symbol of <code>permission_error/5</code>. */
	public:
		static SymbolTerm *const PERMISSION_ERROR;
		/* operation ::= access | create | input | modify | open | output | reposition | new */
		/** Holds a string representation of operation. */
		const std::string operation;
		/*
		  permissionType ::= binary_stream | flag | operator | past_end_of_stream
		                     private_procedure | static_procedure | source_sink
				 stream | text_stream
		*/
		/** Holds a string representation of permission type. */
		const std::string permissionType;
		/** Holds the argument or one of its components which caused the error. */
		Term *const culprit;
		/** Holds a string representation of detail message. */
		const std::string message;
		/** Constructs a new <code>PermissionException</code>
		 * with the given arguments. */
		virtual ~PermissionException()
		{
			delete culprit;
		}

		PermissionException(Operation _goal, const std::string &_operation, const std::string &_permissionType, Term *_culprit, const std::string &_message);
		std::string getMessage() override;
		/** Returns a term representation of this <code>PermissionException</code>:
		 * <code>permission_error(goal,argNo,operation,permissionType,culprit,message)</code>.
		 */
		Term *getMessageTerm() override;
		/** Returns a string representation of this <code>PermissionException</code>. */
		std::string toString() override;
	};

}
