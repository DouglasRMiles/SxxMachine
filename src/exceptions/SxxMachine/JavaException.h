#pragma once

#include "BuiltinException.h"
#include <string>
#include <vector>
#include <stdexcept>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Operation;
	class Term;
}

namespace SxxMachine
{

	/**
	 * Java error.<br>
	 * There will be a Java error when
	 * a Java exception is threw during interoperating with Java in Prolog Cafe.
	 * The class <code>JavaException</code> wraps a subclass of <code>java.lang.Exception</code>.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class JavaException : public BuiltinException
	{
	private:
		static constexpr long long serialVersionUID = -7510890457700984457LL;
		/** A functor symbol of <code>java_error/3</code>. */
	public:
		static SymbolTerm *const JAVA_ERROR;
		/** Holds a Java exception. */
	protected:
		const std::runtime_error e;
		/** Constructs a new <code>JavaException</code> with a Java exception. */
	public:
		JavaException(std::runtime_error _e);
		/** Constructs a new <code>JavaException</code> with the given arguments. */
		JavaException(Operation _goal, int _argNo, std::runtime_error _e);
		/** Returns a term representation of this <code>JavaException</code>:
		 * <code>java_error(goal,argNo,exception)</code>.
		 */
		Term *getMessageTerm() override;
		/** Returns a underlying Java exception. */
		virtual std::runtime_error getException();
		/** Returns a string representation of this <code>JavaException</code>. */
		std::string toString() override;
		std::string getMessage() override;

	};

}
