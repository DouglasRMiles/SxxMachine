#ifndef PREDICATEENCODER
#define PREDICATEENCODER

#include <string>
#include <vector>
#include <iostream>
#include "exceptionhelper.h"
#include "stringhelper.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
class StringBuilder;
class NumberFormatException;

namespace SxxMachine
{


	/**
	 * The <code>PredicateEncoder</code> class contains static methods for encoding predicate names.<br>
	 * The predicate with <code>hoge:f/n</code> is encoded to <code>hoge.PRED_f_n</code>, where
	 * <code>hoge</code> is package name,
	 * <code>f</code> is predicate name, and
	 * <code>n</code> is arity.<br>
	 *
	 * When encoding a predicate name, we apply the following rules:<br>
	 *<ul>
	 *<li>The alphanumeric characters
	 * &ldquo;<code>a</code>&rdquo; through &ldquo;<code>z</code>&rdquo;,
	 * &ldquo;<code>A</code>&rdquo; through &ldquo;<code>Z</code>&rdquo; and
	 * &ldquo;<code>0</code>&rdquo; through &ldquo;<code>9</code>&rdquo; remain the same.
	 *<li>The special characters &ldquo;<code>_</code>&rdquo; and &ldquo;<code>$</code>&rdquo; remain the same.
	 *<li>All other characters are first converted into a list of character codes.
	 * Then each character code is represented by the 5-character string &ldquo;<code>$XYZW</code>&rdquo;,
	 * where <code>XYZW</code> is the four-digit hexadecimal representation of the character code.
	 *</ul>
	 *
	 * For example,
	 * a predicate with <code>hoge:(=..)/2</code> is encoded to <code>hoge.PRED_$003D$002E$002E_2</code>.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.1
	 */
	class PredicateEncoder
	{
		/**
		 * Returns a string representation of class for
		 * the predicate with the given arguments.
		 * @param pkg package name
		 * @param functor predicate name
		 * @param arity predicate arity
		 * @return a string representation of class for
		 * the predicate that corresponds to <code>pkg:functor/arity</code>.
		 */

	public:
		static std::string encode(const std::string& pkg, const std::string& functor, const int& arity);

	static std::string decodeFunctor_2(const std::string& className);
	static int decodeArity(const std::string& className);

//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("fallthrough") public static String decodeFunctor(String className)
		static std::string decodeFunctor(const std::string& className);
		static void main(std::vector<std::string>& argv);
	};

}


#endif	//#ifndef PREDICATEENCODER
