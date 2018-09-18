#ifndef EVALUATIONEXCEPTION
#define EVALUATIONEXCEPTION

#include "BuiltinException.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Term; }

namespace SxxMachine
{

	/**
	 * Evaluation error.<br>
	 * There will be an evaluation error when the operands
	 * of an evaluable functor are such that the operation
	 * has an exceptional value.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class EvaluationException : public BuiltinException
	{
		/** A functor symbol of <code>evaluation_error/3</code>. */
	public:
		static SymbolTerm* const  EVALUATION_ERROR;
		/* errorType ::= float_overflow | int_overflow | undefined | underflow | zero_devisor */
		/** Holds a string representation of error type. */
		const std::string errorType;
		/** Constructs a new <code>EvaluationException</code> with an error type. */
		EvaluationException(const std::string& _errorType);
		/** Constructs a new <code>EvaluationException</code> with the given arguments. */
		EvaluationException(Operation _goal, const int& _argNo, const std::string& _errorType);
		/** Returns a term representation of this <code>EvaluationException</code>:
		 * <code>evaluation_error(goal,argNo,errorType)</code>.
		 */
		Term* getMessageTerm() override;
		/** Returns a string representation of this <code>EvaluationException</code>. */
		std::string toString() override;
		std::string getMessage() override;

	};

}


#endif	//#ifndef EVALUATIONEXCEPTION
