package SxxMachine;

import java.util.ArrayList;

import SxxMachine.Term;
import SxxMachine.Prog;
import SxxMachine.Sink;

/**
  Builds  Fluents from Java
  Streams
*/
public class TermCollector extends Sink {
	protected ArrayList buffer;

	private Prog p;

	public TermCollector(Prog p) {
		super(p);
		this.p = p;
		this.buffer = new ArrayList();
	}

	public int putElement(Term T) {
		buffer.add(T);
		return 1;
	}

	public void stop() {
		buffer = null;
	}

	public Term collect() {
		return new IterableSource(buffer, p);
	}
}
