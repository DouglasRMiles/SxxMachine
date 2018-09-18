package SxxMachine;

import SxxMachine.*;


import java.util.Comparator;

import SxxMachine.IllegalTypeException;
import prolog.KPTrail;
import prolog.terms.Expect;

public class LongTerm extends DoubleTerm {
  @Override
  public boolean isLong() {
    return true;
  }

  @Override
  public boolean isDouble() {
    return false;
  }

  // protected final long value;
  public LongTerm(long value) {
    super(value);
    // longValue() = value;
  }

  public Object value() {
    return longValue();
  }

  public boolean bind(Term that, KPTrail trail) {
    return super.bind(that, trail)
        && ((double) longValue() == (double) Expect.asInt(that).longValue());
    // unbelievable but true: converting
    // to double is the only way to convince
    // Microsoft's jview that 1==1
    // $$ casting to double to be removed
    // once they get it right
  }

  public final int arityOrType() {
    return Term.INT;
  }

  @Override
  public int compareTo(Term anotherTerm) {
    if (((anotherTerm.isVar()) || anotherTerm.isDouble())) return AFTER;
    if (!(anotherTerm.isLong())) return BEFORE;
    long v = anotherTerm.longValue();
    if (longValue() == v) return EQUAL;
    if (longValue() > v) return AFTER;
    return BEFORE;
  }

  @Override
  public int intValue() {
    return (int) super.longValue();
  }

  @Override
  public long longValue() {
    return (long) value;
  }

  @Override
  public double doubleValue() {
    return longValue();
  }

  @Override
  public int arithCompareTo(NumberTerm t) {
    return Long.compare(longValue(), t.longValue());
  }

  @Override
  public NumberTerm abs() {
    return Long(Math.abs(longValue()));
  }

  @Override
  public NumberTerm acos() {
    return Float(Math.acos(value));
  }

  @Override
  public NumberTerm add(NumberTerm t) {
    if ((t.isDouble())) {
      return t.add(this);
    }
    return Long(longValue() + t.longValue());
  }

  @Override
  public NumberTerm and(NumberTerm t) {
    if ((t.isDouble())) throw new IllegalTypeException("integer", t);
    return Long(longValue() & t.longValue());
  }

  @Override
  public NumberTerm asin() {
    return Float(Math.asin(value));
  }

  @Override
  public NumberTerm atan() {
    return Float(Math.atan(value));
  }

  @Override
  public NumberTerm ceil() {
    return this;
  }

  @Override
  public NumberTerm cos() {
    return Float(Math.cos(value));
  }

  @Override
  public NumberTerm divide(NumberTerm t) {
    if (t.doubleValue() == 0) throw new EvaluationException("zero_divisor");
    return Float(value / t.doubleValue());
  }

  @Override
  public NumberTerm exp() {
    return Float(Math.exp(value));
  }

  @Override
  public NumberTerm floatIntPart() {
    throw new IllegalTypeException("float", this);
  }

  @Override
  public NumberTerm floatFractPart() {
    throw new IllegalTypeException("float", this);
  }

  @Override
  public NumberTerm floor() {
    return this;
  }

  @Override
  public NumberTerm intDivide(NumberTerm t) {
    if ((t.isDouble())) throw new IllegalTypeException("integer", t);
    if (t.intValue() == 0) throw new EvaluationException("zero_divisor");
    return Long((longValue() / t.longValue()));
  }

  @Override
  public NumberTerm log() {
    if (longValue() == 0L) throw new EvaluationException("undefined");
    return Float(Math.log(value));
  }

  @Override
  public NumberTerm max(NumberTerm t) {
    if ((t.isDouble())) return t.max(this);
    return Long(Math.max(longValue(), t.longValue()));
  }

  @Override
  public NumberTerm min(NumberTerm t) {
    if ((t.isDouble())) return t.min(this);
    return Long(Math.min(longValue(), t.longValue()));
  }

  @Override
  public NumberTerm mod(NumberTerm t) {
    if ((t.isDouble())) throw new IllegalTypeException("integer", t);
    if (t.intValue() == 0) throw new EvaluationException("zero_divisor");
    return Long(longValue() % t.longValue());
  }

  @Override
  public NumberTerm multiply(NumberTerm t) {
    if ((t.isDouble())) return t.multiply(this);
    return Long(longValue() * t.longValue());
  }

  @Override
  public NumberTerm negate() {
    return Long(-longValue());
  }

  @Override
  public NumberTerm not() {
    return Long(~longValue());
  }

  @Override
  public NumberTerm or(NumberTerm t) {
    if ((t.isDouble())) throw new IllegalTypeException("integer", t);
    return Long(longValue() | t.longValue());
  }

  @Override
  public NumberTerm pow(NumberTerm t) {
    return Float(Math.pow(value, t.doubleValue()));
  }

  @Override
  public NumberTerm rint() {
    return Float(value);
  }

  @Override
  public NumberTerm round() {
    return this;
  }

  @Override
  public NumberTerm shiftLeft(NumberTerm t) {
    if ((t.isDouble())) throw new IllegalTypeException("integer", t);
    return Long(longValue() << t.intValue());
  }

  @Override
  public NumberTerm shiftRight(NumberTerm t) {
    if ((t.isDouble())) throw new IllegalTypeException("integer", t);
    return Long(longValue() >> t.intValue());
  }

  @Override
  public NumberTerm signum() {
    return TermData.Integer((int) Math.signum((double) longValue()));
  }

  @Override
  public NumberTerm sin() {
    return Float(Math.sin(value));
  }

  @Override
  public NumberTerm sqrt() {
    if (longValue() < 0) throw new EvaluationException("undefined");
    return Float(Math.sqrt(value));
  }

  @Override
  public NumberTerm subtract(NumberTerm t) {
    if ((t.isDouble()))
      return Float(value - t.value);
    return Long(longValue() - t.longValue());
  }

  @Override
  public NumberTerm tan() {
    return Float(Math.tan(value));
  }

  @Override
  public NumberTerm toDegrees() {
    return Float(Math.toDegrees(value));
  }

  @Override
  public NumberTerm toFloat() {
    return Float(longValue());
  }

  @Override
  public NumberTerm toRadians() {
    return Float(Math.toRadians(value));
  }

  @Override
  public NumberTerm truncate() {
    return this;
  }

  @Override
  public NumberTerm xor(NumberTerm t) {
    if ((t.isDouble())) throw new IllegalTypeException("integer", t);
    return Long(longValue() ^ t.longValue());
  }

  @Override
  public boolean unifyImpl(Term t, Trail trail) {
    t = t.dref();
    return (t.isVar()) ? t.asVariableTerm().bind(this, trail)
        : (((t.isLong()) && longValue() == t.asLongTerm().value)
            || ((t.isInteger())
                && longValue() == t.asIntegerTerm().longValue()));
  }

  @Override
  public String name() {
    oopsy();
    return "";
  }

  @Override
  public boolean convertible(Class type) {
    return convertible(Long.class, type);
  }

  @Override
  public Object toJava() {
    return Long.valueOf(longValue());
  }

  @Override // Overridden for performance
  public String toAtomName() {
    return Long.toString(longValue());
  }

  @Override
  public void toStringImpl(int printingFlags, StringBuilder sb) {
    sb.append(longValue());
  }

  @Override
  public boolean equalsTerm(Term obj, Comparator comparator) {
    if (!(obj.isLong())) return false;
    return longValue() == obj.asLongTerm().longValue();
  }

  @Override
  public int termHashCodeImpl() {
    long n = (long) value;
    return (int) (n ^ n >>> 32);
    // return Long.hashCode(longValue());
  }

  @Override
  public int type() {
    return TYPE_INTEGER;
  }
}
