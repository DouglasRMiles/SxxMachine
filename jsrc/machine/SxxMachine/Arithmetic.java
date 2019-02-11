package SxxMachine;

/**
 * The <code>Arithmetic</code> class contains a method for evaluating arithmetic
 * expressions.<br>
 * This class is mainly used by the builtin predicate <code>is/2</code>.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class Arithmetic {
	static final SymbolTerm SYM_RANDOM = SymbolTerm.intern("random");
	static final SymbolTerm SYM_PI = SymbolTerm.intern("pi");
	static final SymbolTerm SYM_E = SymbolTerm.intern("e");
	static final SymbolTerm SYM_ADD_1 = SymbolTerm.intern("+", 1);
	static final SymbolTerm SYM_NEGATE_1 = SymbolTerm.intern("-", 1);
	static final SymbolTerm SYM_ADD_2 = SymbolTerm.intern("+", 2);
	static final SymbolTerm SYM_SUBTRACT_2 = SymbolTerm.intern("-", 2);
	static final SymbolTerm SYM_MULTIPLY_2 = SymbolTerm.intern("*", 2);
	static final SymbolTerm SYM_DIVIDE_2 = SymbolTerm.intern("/", 2);
	static final SymbolTerm SYM_INTDIVIDE_2 = SymbolTerm.intern("//", 2);
	static final SymbolTerm SYM_MOD_2 = SymbolTerm.intern("mod", 2);
	static final SymbolTerm SYM_SHIFTLEFT_2 = SymbolTerm.intern("<<", 2);
	static final SymbolTerm SYM_SHIFTRIGHT_2 = SymbolTerm.intern(">>", 2);
	static final SymbolTerm SYM_NOT_1 = SymbolTerm.intern("\\", 1);
	static final SymbolTerm SYM_AND_2 = SymbolTerm.intern("/\\", 2);
	static final SymbolTerm SYM_OR_2 = SymbolTerm.intern("\\/", 2);
	static final SymbolTerm SYM_XOR_2 = SymbolTerm.intern("#", 2);
	static final SymbolTerm SYM_POW_2 = SymbolTerm.intern("**", 2);
	static final SymbolTerm SYM_ABS_1 = SymbolTerm.intern("abs", 1);
	static final SymbolTerm SYM_ACOS_1 = SymbolTerm.intern("acos", 1);
	static final SymbolTerm SYM_ASIN_1 = SymbolTerm.intern("asin", 1);
	static final SymbolTerm SYM_ATAN_1 = SymbolTerm.intern("atan", 1);
	static final SymbolTerm SYM_CEIL_1 = SymbolTerm.intern("ceiling", 1);
	static final SymbolTerm SYM_COS_1 = SymbolTerm.intern("cos", 1);
	static final SymbolTerm SYM_DEGREES_1 = SymbolTerm.intern("degrees", 1);
	static final SymbolTerm SYM_EXP_1 = SymbolTerm.intern("exp", 1);
	static final SymbolTerm SYM_FLOOR_1 = SymbolTerm.intern("floor", 1);
	static final SymbolTerm SYM_LOG_1 = SymbolTerm.intern("log", 1);
	static final SymbolTerm SYM_MAX_2 = SymbolTerm.intern("max", 2);
	static final SymbolTerm SYM_MIN_2 = SymbolTerm.intern("min", 2);
	static final SymbolTerm SYM_RADIANS_1 = SymbolTerm.intern("radians", 1);
	static final SymbolTerm SYM_RINT_1 = SymbolTerm.intern("rint", 1);
	static final SymbolTerm SYM_ROUND_1 = SymbolTerm.intern("round", 1);
	static final SymbolTerm SYM_SIN_1 = SymbolTerm.intern("sin", 1);
	static final SymbolTerm SYM_SQRT_1 = SymbolTerm.intern("sqrt", 1);
	static final SymbolTerm SYM_TAN_1 = SymbolTerm.intern("tan", 1);
	static final SymbolTerm SYM_REM_2 = SymbolTerm.intern("rem", 2);
	static final SymbolTerm SYM_SIGN_1 = SymbolTerm.intern("sign", 1);
	static final SymbolTerm SYM_FLOAT_1 = SymbolTerm.intern("float", 1);
	static final SymbolTerm SYM_INTPART_1 = SymbolTerm.intern("float_integer_part", 1);
	static final SymbolTerm SYM_FRACTPART_1 = SymbolTerm.intern("float_fractional_part", 1);
	static final SymbolTerm SYM_TRUNCATE_1 = SymbolTerm.intern("truncate", 1);

	/**
	 * Evaluates <code>_t</code> as an arithmetic expression, and returns the
	 * resulting number as <code>NumberTerm</code>.
	 *
	 * @exception PInstantiationException
	 *                if <code>_t</code> contains unbound variables.
	 * @exception IllegalDomainException
	 *                if <code>_t</code> is not an arithmetic expression.
	 */
	final public static NumberTerm evaluate(NumberTerm _t) {
		return _t;
	}

	public static NumberTerm evaluate(Term _t) throws PInstantiationException, IllegalDomainException {
		Term t = _t.dref();
		if ((t.isVar()))
			throw new PInstantiationException();
		else if ((t.isInteger()))
			return (IntegerTerm) t;
		else if ((t.isLong()))
			return (LongTerm) t;
		else if ((t.isDouble()))
			return (DoubleTerm) t;
		else if (t.equalsTerm(SYM_RANDOM))
			return new DoubleTerm(Math.random());
		else if (t.equalsTerm(SYM_PI))
			return new DoubleTerm(Math.PI);
		else if (t.equalsTerm(SYM_E))
			return new DoubleTerm(Math.E);
		else if ((t.isCons()))
			return evaluate(t.asListTerm().car());
		else if (!(t.isStructure()))
			throw new IllegalDomainException("arithmetic expression", t);
		SymbolTerm func = (t).functor().asSymbolTerm();
		Term[] args = (t).args();
		if (func.equalsTerm(SYM_ADD_1))
			return evaluate(args[0]);
		else if (func.equalsTerm(SYM_NEGATE_1))
			return evaluate(args[0]).negate();

		else if (func.equalsTerm(SYM_ADD_2))
			return evaluate(args[0]).add(evaluate(args[1]));
		else if (func.equalsTerm(SYM_SUBTRACT_2))
			return evaluate(args[0]).subtract(evaluate(args[1]));
		else if (func.equalsTerm(SYM_MULTIPLY_2))
			return evaluate(args[0]).multiply(evaluate(args[1]));
		else if (func.equalsTerm(SYM_INTDIVIDE_2))
			return evaluate(args[0]).intDivide(evaluate(args[1]));
		else if (func.equalsTerm(SYM_DIVIDE_2))
			return evaluate(args[0]).divide(evaluate(args[1]));
		else if (func.equalsTerm(SYM_MOD_2))
			return evaluate(args[0]).mod(evaluate(args[1]));
		else if (func.equalsTerm(SYM_REM_2))
			return evaluate(args[0]).mod(evaluate(args[1]));
		else if (func.equalsTerm(SYM_AND_2))
			return evaluate(args[0]).and(evaluate(args[1]));
		else if (func.equalsTerm(SYM_OR_2))
			return evaluate(args[0]).or(evaluate(args[1]));
		else if (func.equalsTerm(SYM_XOR_2))
			return evaluate(args[0]).xor(evaluate(args[1]));
		else if (func.equalsTerm(SYM_NOT_1))
			return evaluate(args[0]).not();
		else if (func.equalsTerm(SYM_SHIFTLEFT_2))
			return evaluate(args[0]).shiftLeft(evaluate(args[1]));
		else if (func.equalsTerm(SYM_SHIFTRIGHT_2))
			return evaluate(args[0]).shiftRight(evaluate(args[1]));
		else if (func.equalsTerm(SYM_ABS_1))
			return evaluate(args[0]).abs();
		else if (func.equalsTerm(SYM_MIN_2))
			return evaluate(args[0]).min(evaluate(args[1]));
		else if (func.equalsTerm(SYM_MAX_2))
			return evaluate(args[0]).max(evaluate(args[1]));
		else if (func.equalsTerm(SYM_RINT_1))
			return evaluate(args[0]).rint();
		else if (func.equalsTerm(SYM_ROUND_1))
			return evaluate(args[0]).round();
		else if (func.equalsTerm(SYM_FLOOR_1))
			return evaluate(args[0]).floor();
		else if (func.equalsTerm(SYM_CEIL_1))
			return evaluate(args[0]).ceil();
		else if (func.equalsTerm(SYM_SIN_1))
			return evaluate(args[0]).sin();
		else if (func.equalsTerm(SYM_COS_1))
			return evaluate(args[0]).cos();
		else if (func.equalsTerm(SYM_TAN_1))
			return evaluate(args[0]).tan();
		else if (func.equalsTerm(SYM_ASIN_1))
			return evaluate(args[0]).asin();
		else if (func.equalsTerm(SYM_ACOS_1))
			return evaluate(args[0]).acos();
		else if (func.equalsTerm(SYM_ATAN_1))
			return evaluate(args[0]).atan();
		else if (func.equalsTerm(SYM_SQRT_1))
			return evaluate(args[0]).sqrt();
		else if (func.equalsTerm(SYM_LOG_1))
			return evaluate(args[0]).log();
		else if (func.equalsTerm(SYM_EXP_1))
			return evaluate(args[0]).exp();
		else if (func.equalsTerm(SYM_POW_2))
			return evaluate(args[0]).pow(evaluate(args[1]));
		else if (func.equalsTerm(SYM_DEGREES_1))
			return evaluate(args[0]).toDegrees();
		else if (func.equalsTerm(SYM_RADIANS_1))
			return evaluate(args[0]).toRadians();
		else if (func.equalsTerm(SYM_SIGN_1))
			return evaluate(args[0]).signum();
		else if (func.equalsTerm(SYM_FLOAT_1))
			return evaluate(args[0]).toFloat();
		else if (func.equalsTerm(SYM_INTPART_1))
			return evaluate(args[0]).floatIntPart();
		else if (func.equalsTerm(SYM_FRACTPART_1))
			return evaluate(args[0]).floatFractPart();
		else if (func.equalsTerm(SYM_TRUNCATE_1))
			return evaluate(args[0]).truncate();
		else
			throw new IllegalDomainException("arithmetic expression", t);
	}
}
