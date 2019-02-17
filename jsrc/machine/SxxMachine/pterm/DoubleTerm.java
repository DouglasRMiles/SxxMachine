package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.Float;

import SxxMachine.EvaluationException;
import SxxMachine.IllegalTypeException;
import SxxMachine.KPTrail;
import SxxMachine.OpVisitor;
import SxxMachine.Term;
import SxxMachine.Trail; 

/**
 * Floating point number. The class <code>DoubleTerm</code> wraps a value of
 * primitive type <code>double</code>.
 *
 * <pre>
 * Term t = Float(3.3333);
 * double d = (t).doubleValue();
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class DoubleTerm extends NumberTerm {

    @Override
    public double doubleValue() {
        return dvalue;// .doubleValue();
    }

    @Override
    public boolean bind(Term that, KPTrail trail) {
        return super.bind(that, trail) && dvalue == (((NumberTerm) that).doubleValue());
    }

    public double dvalue;

    @Override
    public int arityOrType() {
        return Term.FLOAT;
    }

    @Override
    public boolean isDouble() {
        return true;
    }

    /**
     * Holds a <code>double</code> value that this <code>DoubleTerm</code>
     * represents.
     */
    // protected final double value;
    /**
     * Constructs a new Prolog floating point number that represents the specified
     * <code>double</code> value.
     */
    protected DoubleTerm(double i) {
        super(i);
        this.dvalue = i;
    }

    /**
     * Returns the value of <code>value</code>.
     * 
     * @see #dvalue
     */
    public Object value() {
        return this.dvalue;
    }

    @Override
    public int type() {
        return TYPE_DOUBLE;
    }

    @Override
    public boolean unifyImpl(Term t, Trail trail) {
        t = t.dref();
        return (t.isVar()) ? t.unify(this, trail) : ((t.isDouble()) && this.dvalue == t.doubleValue());
    }

    @Override
    public String fname() {
        oopsy();
        return "Double";
    }

    /**
     * @return the <code>boolean</code> whose value is
     *         <code>convertible(Double.class, type)</code>.
     * @see Term#convertible(Class, Class)
     */

    @Override
    public boolean convertible(Class type) {
        return convertible(Double.class, type);
    }

    /**
     * Returns a <code>java.lang.Double</code> corresponds to this
     * <code>DoubleTerm</code> according to <em>Prolog Cafe interoperability with
     * Java</em>.
     * 
     * @return a <code>java.lang.Double</code> object equivalent to this
     *         <code>DoubleTerm</code>.
     */
    @Override
    public Object toJava() {
        return Double.valueOf(this.dvalue);
    }

    /* Object */
    @Override // Overridden for performance
    public String pprint() {
        return Double.toString(this.dvalue);
    }

    /** Returns a unqupted string representation of this <code>DoubleTerm</code>. */
    @Override
    public void toStringImpl(int printFlags, StringBuilder sb) {
        sb.append(this.dvalue);
    }

    /**
     * Checks <em>term equality</em> of two terms. The result is <code>true</code>
     * if and only if the argument is an instance of <code>DoubleTerm</code> and has
     * the same <code>double</code> value as this object.
     * 
     * @param obj
     *            the object to compare with. This must be dereferenced.
     * @return <code>true</code> if the given object represents a Prolog floating
     *         point number equivalent to this <code>DoubleTerm</code>, false
     *         otherwise.
     * @see #compareTo
     */
    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        return obj.isDouble() && Double.doubleToLongBits(this.dvalue) == Double.doubleToLongBits((obj).doubleValue());
    }

    @Override
    public int termHashCodeImpl() {
        long bits = Double.doubleToLongBits(this.dvalue);
        return (int) (bits ^ (bits >>> 32));
    }

    /* Comparable */
    /**
     * Compares two terms in <em>Prolog standard order of terms</em>.<br>
     * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
     * <code>boolean</code> value as <code>t1.equals(t2)</code>.
     * 
     * @param anotherTerm
     *            the term to compared with. It must be dereferenced.
     * @return the value <code>0</code> if two terms are identical; a value less
     *         than <code>0</code> if this term is <em>before</em> the
     *         <code>anotherTerm</code>; and a value greater than <code>0</code> if
     *         this term is <em>after</em> the <code>anotherTerm</code>.
     */
    @Override
    public int compareTo(Term anotherTerm) { // anotherTerm must be dereferenced
        if ((anotherTerm.isVar()))
            return AFTER;
        if (!(anotherTerm.isDouble()))
            return BEFORE;
        return Double.compare(this.dvalue, anotherTerm.doubleValue());
    }

    /* NumberTerm */
    @Override
    public int intValue() {
        return (int) this.dvalue;
    }

    @Override
    public long longValue() {
        return (long) this.dvalue;
    }

    // @Override
    // public double doubleValue() { return this.value; }

    @Override
    public int arithCompareTo(NumberTerm t) {
        return Double.compare(this.dvalue, t.doubleValue());
    }

    @Override
    public NumberTerm abs() {
        return Float(Math.abs(this.dvalue));
    }

    @Override
    public NumberTerm acos() {
        return Float(Math.acos(this.dvalue));
    }

    @Override
    public NumberTerm add(NumberTerm t) {
        return Float(this.dvalue + t.doubleValue());
    }

    /**
     * Throws a <code>type_error</code>.
     * 
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm and(NumberTerm t) {
        throw mustInt();
    }
    // public NumberTerm and(NumberTerm t) { return new IntegerTerm(this.intValue()
    // & t.intValue()); }

    @Override
    public NumberTerm asin() {
        return Float(Math.asin(this.dvalue));
    }

    @Override
    public NumberTerm atan() {
        return Float(Math.atan(this.dvalue));
    }

    @Override
    public NumberTerm ceil() {
        return Integer((long) Math.ceil(this.dvalue));
    }

    @Override
    public NumberTerm cos() {
        return Float(Math.cos(this.dvalue));
    }

    /**
     * @exception EvaluationException
     *                if the given argument <code>NumberTerm</code> represents
     *                <coe>0</code>.
     */
    @Override
    public NumberTerm divide(NumberTerm t) {
        if (t.doubleValue() == 0)
            throw new EvaluationException("zero_divisor");
        return Float(this.dvalue / t.doubleValue());
    }

    @Override
    public NumberTerm exp() {
        return Float(Math.exp(this.dvalue));
    }

    @Override
    public NumberTerm floatIntPart() {
        return Float(Math.signum(this.dvalue) * Math.floor(Math.abs(this.dvalue)));
    }

    @Override
    public NumberTerm floatFractPart() {
        return Float(this.dvalue - Math.signum(this.dvalue) * Math.floor(Math.abs(this.dvalue)));
    }

    @Override
    public NumberTerm floor() {
        return Integer((long) Math.floor(this.dvalue));
    }

    /**
     * Throws a <code>type_error</code>.
     * 
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm intDivide(NumberTerm t) {
        throw mustInt();
    }

    // public NumberTerm intDivide(NumberTerm t) { return new
    // IntegerTerm((int)(this.intValue() / t.intValue())); }
    /**
     * @exception EvaluationException
     *                if this object represents <coe>0</code>.
     */
    @Override
    public NumberTerm log() {
        if (this.dvalue == 0)
            throw new EvaluationException("undefined");
        return Float(Math.log(this.dvalue));
    }

    @Override
    public NumberTerm max(NumberTerm t) {
        return Float(Math.max(this.dvalue, t.doubleValue()));
    }

    @Override
    public NumberTerm min(NumberTerm t) {
        return Float(Math.min(this.dvalue, t.doubleValue()));
    }

    /**
     * Throws a <code>type_error</code>.
     * 
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm mod(NumberTerm t) {
        throw mustInt();
    }
    // public NumberTerm mod(NumberTerm t) { return new IntegerTerm(this.intValue()
    // % t.intValue()); }

    @Override
    public NumberTerm multiply(NumberTerm t) {
        return Float(this.dvalue * t.doubleValue());
    }

    @Override
    public NumberTerm negate() {
        return Float(-this.dvalue);
    }

    /**
     * Throws a <code>type_error</code>.
     * 
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm not() {
        throw mustInt();
    }

    // public NumberTerm not() { return new IntegerTerm(~ this.intValue()); }
    /**
     * Throws a <code>type_error</code>.
     * 
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm or(NumberTerm t) {
        throw mustInt();
    }
    // public NumberTerm or(NumberTerm t) { return new IntegerTerm(this.intValue() |
    // t.intValue()); }

    @Override
    public NumberTerm pow(NumberTerm t) {
        return Float(Math.pow(this.dvalue, t.doubleValue()));
    }

    @Override
    public NumberTerm rint() {
        return Float(Math.rint(this.dvalue));
    }

    @Override
    public NumberTerm round() {
        return Integer(Math.round(this.dvalue));
    }

    /**
     * Throws a <code>type_error</code>.
     * 
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm shiftLeft(NumberTerm t) {
        throw mustInt();
    }

    /**
     * Throws a <code>type_error</code>.
     * 
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm shiftRight(NumberTerm t) {
        throw mustInt();
    }

    @Override
    public NumberTerm signum() {
        return Float(Math.signum(this.dvalue));
    }

    @Override
    public NumberTerm sin() {
        return Float(Math.sin(this.dvalue));
    }

    /**
     * @exception EvaluationException
     *                if this object represents a floating point number less than
     *                <coe>0</code>.
     */
    @Override
    public NumberTerm sqrt() {
        if (this.dvalue < 0)
            throw new EvaluationException("undefined");
        return Float(Math.sqrt(this.dvalue));
    }

    @Override
    public NumberTerm subtract(NumberTerm t) {
        return Float(this.dvalue - t.doubleValue());
    }

    @Override
    public NumberTerm tan() {
        return Float(Math.tan(this.dvalue));
    }

    @Override
    public NumberTerm toDegrees() {
        return Float(Math.toDegrees(this.dvalue));
    }

    @Override
    public NumberTerm toFloat() {
        return this;
    }

    @Override
    public NumberTerm toRadians() {
        return Float(Math.toRadians(this.dvalue));
    }

    // public NumberTerm Float(double n) {
    // return new DoubleTerm(n);
    // }

    @Override
    public NumberTerm truncate() {
        if (this.dvalue >= 0)
            return Integer((long) Math.floor(this.dvalue));
        else
            return Integer((long) (-1 * Math.floor(Math.abs(this.dvalue))));
    }

    /**
     * Throws a <code>type_error</code>.
     * 
     * @exception IllegalTypeException
     */
    @Override
    public NumberTerm xor(NumberTerm t) {
        throw mustInt();
    }

    private IllegalTypeException mustInt() {
        return new IllegalTypeException("integer", this);
    }

    private LongTerm Integer(long round) {
        int i = (int) round;
        if ((i) == round) {
            return TermData.Integer(i);
        }
        return TermData.Long(round);
    }

    @Override
    public boolean isFloat() {
        return true;
    }
}
