package SxxMachine;

import SxxMachine.LongTerm;
import SxxMachine.Term;
import SxxMachine.Prog;
import SxxMachine.Source;

/**
 * creates a source of integers based on x=a*x+b formula
 */
public class IntegerSource extends Source {

	public IntegerSource(long fuel, long a, long x, long b, Prog p) {
		super(p);
		this.fuel = fuel;
		this.a = a;
		this.b = b;
		this.x = x;
	}

	private long fuel;

	private long a;

	private long b;

	private long x;

	public Term getElement() {
		if (fuel <= 0)
			return null;
		LongTerm R = Long(x);
		x = a * x + b;
		--fuel;
		return R;
	}

	public void stop() {
		fuel = 0;
	}

	public String pprint() {
		return "{(x->" + a + "*x+" + b + ")[" + fuel + "]=" + x + "}";
	}

}