#ifndef ARITHMETIC
#define ARITHMETIC

#define _USE_MATH_DEFINES
#include <vector>
#include <cmath>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class NumberTerm; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class IllegalDomainException; }
namespace SxxMachine { class PInstantiationException; }

namespace SxxMachine
{

	/**
	 * The <code>Arithmetic</code> class contains a method
	 * for evaluating arithmetic expressions.<br>
	 * This class is mainly used by the builtin predicate <code>is/2</code>.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class Arithmetic
	{
	public:
		static SymbolTerm* const  SYM_RANDOM;
		static SymbolTerm* const  SYM_PI;
		static SymbolTerm* const  SYM_E;
		static SymbolTerm* const  SYM_ADD_1;
		static SymbolTerm* const  SYM_NEGATE_1;
		static SymbolTerm* const  SYM_ADD_2;
		static SymbolTerm* const  SYM_SUBTRACT_2;
		static SymbolTerm* const  SYM_MULTIPLY_2;
		static SymbolTerm* const  SYM_DIVIDE_2;
		static SymbolTerm* const  SYM_INTDIVIDE_2;
		static SymbolTerm* const  SYM_MOD_2;
		static SymbolTerm* const  SYM_SHIFTLEFT_2;
		static SymbolTerm* const  SYM_SHIFTRIGHT_2;
		static SymbolTerm* const  SYM_NOT_1;
		static SymbolTerm* const  SYM_AND_2;
		static SymbolTerm* const  SYM_OR_2;
		static SymbolTerm* const  SYM_XOR_2;
		static SymbolTerm* const  SYM_POW_2;
		static SymbolTerm* const  SYM_ABS_1;
		static SymbolTerm* const  SYM_ACOS_1;
		static SymbolTerm* const  SYM_ASIN_1;
		static SymbolTerm* const  SYM_ATAN_1;
		static SymbolTerm* const  SYM_CEIL_1;
		static SymbolTerm* const  SYM_COS_1;
		static SymbolTerm* const  SYM_DEGREES_1;
		static SymbolTerm* const  SYM_EXP_1;
		static SymbolTerm* const  SYM_FLOOR_1;
		static SymbolTerm* const  SYM_LOG_1;
		static SymbolTerm* const  SYM_MAX_2;
		static SymbolTerm* const  SYM_MIN_2;
		static SymbolTerm* const  SYM_RADIANS_1;
		static SymbolTerm* const  SYM_RINT_1;
		static SymbolTerm* const  SYM_ROUND_1;
		static SymbolTerm* const  SYM_SIN_1;
		static SymbolTerm* const  SYM_SQRT_1;
		static SymbolTerm* const  SYM_TAN_1;
		static SymbolTerm* const  SYM_REM_2;
		static SymbolTerm* const  SYM_SIGN_1;
		static SymbolTerm* const  SYM_FLOAT_1;
		static SymbolTerm* const  SYM_INTPART_1;
		static SymbolTerm* const  SYM_FRACTPART_1;
		static SymbolTerm* const  SYM_TRUNCATE_1;
		/**
		 * Evaluates <code>_t</code> as an arithmetic expression,
		 * and returns the resulting number as <code>NumberTerm</code>.
		 *
		 * @exception PInstantiationException if <code>_t</code> contains unbound variables.
		 * @exception IllegalDomainException if <code>_t</code> is not an arithmetic expression.
		 */
		static NumberTerm* evaluate(NumberTerm* _t);
		static NumberTerm* evaluate(Term* _t) throw(PInstantiationException,IllegalDomainException);
	};

}


#endif	//#ifndef ARITHMETIC
