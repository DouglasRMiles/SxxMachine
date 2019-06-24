package SxxMachine;

import java.math.BigInteger;

import static SxxMachine.pterm.TermData.*;

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
    static final Atomic SYM_INFINITE = SYM("infinite");
    static final Atomic SYM_INF = SYM("inf");
    static final Atomic SYM_RANDOM = SYM("random");
    static final Atomic SYM_PI = SYM("pi");
    static final Atomic SYM_E = SYM("e");
    static final Atomic SYM_ADD_1 = F("+", 1);
    static final Functor SYM_NEGATE_1 = F("-", 1);
    static final Functor SYM_ADD_2 = F("+", 2);
    static final Functor SYM_SUBTRACT_2 = F("-", 2);
    static final Functor SYM_MULTIPLY_2 = F("*", 2);
    static final Functor SYM_DIVIDE_2 = F("/", 2);
    static final Functor SYM_INTDIVIDE_2 = F("//", 2);
    static final Functor SYM_MOD_2 = F("mod", 2);
    static final Functor SYM_SHIFTLEFT_2 = F("<<", 2);
    static final Functor SYM_SHIFTRIGHT_2 = F(">>", 2);
    static final Functor SYM_NOT_1 = F("\\", 1);
    static final Functor SYM_AND_2 = F("/\\", 2);
    static final Functor SYM_OR_2 = F("\\/", 2);
    static final Functor SYM_XOR_2 = F("#", 2);
    static final Functor SYM_POW_2 = F("**", 2);
    static final Functor SYM_ABS_1 = F("abs", 1);
    static final Functor SYM_ACOS_1 = F("acos", 1);
    static final Functor SYM_ASIN_1 = F("asin", 1);
    static final Functor SYM_ATAN_1 = F("atan", 1);
    static final Functor SYM_CEIL_1 = F("ceiling", 1);
    static final Functor SYM_COS_1 = F("cos", 1);
    static final Functor SYM_DEGREES_1 = F("degrees", 1);
    static final Functor SYM_EXP_1 = F("exp", 1);
    static final Functor SYM_FLOOR_1 = F("floor", 1);
    static final Functor SYM_LOG_1 = F("log", 1);
    static final Functor SYM_MAX_2 = F("max", 2);
    static final Functor SYM_MIN_2 = F("min", 2);
    static final Functor SYM_RADIANS_1 = F("radians", 1);
    static final Functor SYM_RINT_1 = F("rint", 1);
    static final Functor SYM_ROUND_1 = F("round", 1);
    static final Functor SYM_SIN_1 = F("sin", 1);
    static final Functor SYM_SQRT_1 = F("sqrt", 1);
    static final Functor SYM_TAN_1 = F("tan", 1);
    static final Functor SYM_REM_2 = F("rem", 2);
    static final Functor SYM_SIGN_1 = F("sign", 1);
    static final Functor SYM_FLOAT_1 = F("float", 1);
    static final Functor SYM_INTPART_1 = F("float_integer_part", 1);
    static final Functor SYM_FRACTPART_1 = F("float_fractional_part", 1);
    static final Functor SYM_TRUNCATE_1 = F("truncate", 1);

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
            return (NumberTerm) t;
        else if ((t.isLong()))
            return (NumberTerm) t;
        else if ((t.isDouble()))
            return (NumberTerm) t;
        else if (t.equalsTerm(SYM_RANDOM))
            return Float(Math.random());
        else if (t.equalsTerm(SYM_INF))
            return Float(Double.POSITIVE_INFINITY);
        else if (t.equalsTerm(SYM_INFINITE))
            return Long(Long.MAX_VALUE); // @TODO @Fixme
        else if (t.equalsTerm(SYM_PI))
            return Float(Math.PI);
        else if (t.equalsTerm(SYM_E))
            return Float(Math.E);
        else if ((t.isCons()))
            return evaluate(t.asListTerm().car());
        else if (!(t.isCompound()))

            throw new IllegalDomainException("arithmetic expression", t);
        Functor func = (t).functor().asSymbolTerm();
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
