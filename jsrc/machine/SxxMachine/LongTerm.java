package com.googlecode.prolog_cafe.lang;

import com.googlecode.prolog_cafe.exceptions.EvaluationException;
import com.googlecode.prolog_cafe.exceptions.IllegalTypeException;

public class LongTerm extends NumberTerm {

	protected final long value;

	public LongTerm(long value) {
		this.value = value;
	}

	public long value() {
		return value;
	}

	@Override
	public int compareTo(Term anotherTerm) {
		if (((anotherTerm instanceof VariableTerm) || anotherTerm instanceof DoubleTerm))
		    return AFTER;
		if (! (anotherTerm instanceof LongTerm))
		    return BEFORE;
		long v = ((LongTerm)anotherTerm).value();
		if (this.value == v)
		    return EQUAL;
		if (this.value > v)
		    return AFTER;
		return BEFORE;
	}

	@Override
	public int intValue() {
		return (int) value;
	}

	@Override
	public long longValue() {
		return value;
	}

	@Override
	public double doubleValue() {
		return (double)value;
	}

	@Override
	public int arithCompareTo(NumberTerm t) {
		return Long.compare(this.value, t.longValue());
	}

	@Override
	public NumberTerm abs() {
		return new LongTerm(Math.abs(this.value));
	}

	@Override
	public NumberTerm acos() {
		return new DoubleTerm(Math.acos(this.doubleValue()));
	}

	@Override
	public NumberTerm add(NumberTerm t) {
		if ((t instanceof DoubleTerm)){
			return t.add(this);
		}
		return new LongTerm(this.value+t.longValue());
	}

	@Override
	public NumberTerm and(NumberTerm t) {
		if ((t instanceof DoubleTerm))
		    throw new IllegalTypeException("integer", t);
		return new LongTerm(this.value & t.longValue());
	}

	@Override
	public NumberTerm asin() {
		return new DoubleTerm(Math.asin(this.doubleValue()));
	}

	@Override
	public NumberTerm atan() {
		 return new DoubleTerm(Math.atan(this.doubleValue()));
	}

	@Override
	public NumberTerm ceil() {
		return this;
	}

	@Override
	public NumberTerm cos() {
		return new DoubleTerm(Math.cos(this.doubleValue()));
	}

	@Override
	public NumberTerm divide(NumberTerm t) {
		if (t.doubleValue() == 0)
		    throw new EvaluationException("zero_divisor");
		return new DoubleTerm(this.doubleValue() / t.doubleValue()); 	}

	@Override
	public NumberTerm exp() {
		return new DoubleTerm(Math.exp(this.doubleValue()));
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
		if ((t instanceof DoubleTerm))
		    throw new IllegalTypeException("integer", t);
		if (t.intValue() == 0)
		    throw new EvaluationException("zero_divisor");
		return new LongTerm((this.value / t.longValue()));
	}

	@Override
	public NumberTerm log() {
		if (this.value == 0L)
		    throw new EvaluationException("undefined");
		return new DoubleTerm(Math.log(this.doubleValue()));
	}

	@Override
	public NumberTerm max(NumberTerm t) {
		if ((t instanceof DoubleTerm))
		    return t.max(this);
		return new LongTerm(Math.max(this.value, t.longValue()));
	}

	@Override
	public NumberTerm min(NumberTerm t) {
		if ((t instanceof DoubleTerm))
		    return t.min(this);
		return new LongTerm(Math.min(this.value, t.longValue()));
	}

	@Override
	public NumberTerm mod(NumberTerm t) {
		if ((t instanceof DoubleTerm))
		    throw new IllegalTypeException("integer", t);
		if (t.intValue() == 0)
		    throw new EvaluationException("zero_divisor");
		return new LongTerm(this.value % t.longValue());
	}

	@Override
	public NumberTerm multiply(NumberTerm t) {
		if ((t instanceof DoubleTerm))
		    return t.multiply(this);
		return new LongTerm(this.value * t.longValue());
	}

	@Override
	public NumberTerm negate() {
		return new LongTerm(- this.value);
	}

	@Override
	public NumberTerm not() {
		 return new LongTerm(~ this.value);
	}

	@Override
	public NumberTerm or(NumberTerm t) {
		if ((t instanceof DoubleTerm))
		    throw new IllegalTypeException("integer", t);
		return new LongTerm(this.value | t.longValue());
	}

	@Override
	public NumberTerm pow(NumberTerm t) {
		return new DoubleTerm(Math.pow(this.doubleValue(), t.doubleValue()));
	}

	@Override
	public NumberTerm rint() {
		return new DoubleTerm(this.doubleValue());
	}

	@Override
	public NumberTerm round() {
		return this;
	}

	@Override
	public NumberTerm shiftLeft(NumberTerm t) {
		if ((t instanceof DoubleTerm))
		    throw new IllegalTypeException("integer", t);
		return new LongTerm(this.value << t.intValue());
	}

	@Override
	public NumberTerm shiftRight(NumberTerm t) {
		if ((t instanceof DoubleTerm))
		    throw new IllegalTypeException("integer", t);
		return new LongTerm(this.value >> t.intValue());
	}

	@Override
	public NumberTerm signum() {
		return new IntegerTerm((int) Math.signum((double) this.value));
	}

	@Override
	public NumberTerm sin() {
		return new DoubleTerm(Math.sin(this.doubleValue()));
	}

	@Override
	public NumberTerm sqrt() {
		if (this.value < 0)
		    throw new EvaluationException("undefined");
		return new DoubleTerm(Math.sqrt(this.doubleValue()));
	}

	@Override
	public NumberTerm subtract(NumberTerm t) {
		if ((t instanceof DoubleTerm))
		    return new DoubleTerm(this.doubleValue() - t.doubleValue());
		return new LongTerm(this.value - t.longValue());
	}

	@Override
	public NumberTerm tan() {
		return new DoubleTerm(Math.tan(this.doubleValue()));
	}

	@Override
	public NumberTerm toDegrees() {
		return new DoubleTerm(Math.toDegrees(this.doubleValue()));
	}

	@Override
	public NumberTerm toFloat() {
		return new DoubleTerm((double) this.value);
	}

	@Override
	public NumberTerm toRadians() {
		return new DoubleTerm(Math.toRadians(this.doubleValue()));
	}

	@Override
	public NumberTerm truncate() {
		return this;
	}

	@Override
	public NumberTerm xor(NumberTerm t) {
		if ((t instanceof DoubleTerm))
		    throw new IllegalTypeException("integer", t);
		return new LongTerm(this.value ^ t.longValue());
	}

	@Override
	public boolean unify(Term t, Trail trail) {
		t = t.dereference();
		return (t instanceof VariableTerm) ? ((VariableTerm) t).bind(this, trail) :
			(((t instanceof LongTerm) && this.value == ((LongTerm) t).value) ||
			 ((t instanceof IntegerTerm) && this.value == ((IntegerTerm) t).longValue()));
	}

	@Override
	public String name() {
		return "";
	}


    public boolean convertible(Class type) {
    	return convertible(Long.class, type);
    }

	@Override
	public Object toJava() {
		return Long.valueOf(value);
	}

	@Override // Overridden for performance
	public String toString() {
		return Long.toString(value);
	}

	@Override // Overridden for performance
	public String toQuotedString() {
		return Long.toString(value);
	}

    @Override
    public void toString(StringBuilder sb){
    	sb.append(this.value);
    }

    @Override
    public void toQuotedString(StringBuilder sb){
    	sb.append(this.value);
    }
	
    public boolean equals(Object obj) {
	if (! (obj instanceof LongTerm))
	    return false;
	return this.value == ((LongTerm)obj).value();
    }

    public int hashCode() {
    	return Long.hashCode(value);
    }

}
