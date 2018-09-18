#pragma once

#include "Predicate.h"
#include <vector>
#include <typeinfo>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
}

namespace SxxMachine
{

	/**
	 * The abstract class <code>JavaPredicate</code> contains methods
	 * for interoperating with Java</em>.<br>
	 * For example, the following builtin predicates extends this <code>JavaPredicate</code>.
	 * <ul>
	 * <li><code>java_constructor</code>
	 * <li><code>java_method</code>.
	 * </ul>
	 * 
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class JavaPredicate : public Predicate
	{
		/**
		 * Checks whether all terms in <code>args</code> are convertible
		 * to the corresponding Java types in <code>paraTypes</code>.
		 * @return <code>true</code>
		 * if <code>args[i].convertible(paraTypes[i])</code> succeeds for all <code>i</code>,
		 * otherwise <code>false</code>.
		 * @see Term#convertible(Class)
		 */
	protected:
		virtual bool checkParameterTypes(std::vector<std::type_info> &paraTypes, std::vector<Term*> &args);
	};

}
