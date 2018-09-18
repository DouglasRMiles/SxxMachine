package SxxMachine;

/**
  Builds  Fluents from Java
  Streams
*/
public class StringSink extends Sink {
	protected StringBuffer buffer;

	public StringSink(Prog p) {
		super(p);
		this.buffer = new StringBuffer();
	}

	public int putElement(Term t) {
		buffer.append(t.toUnquoted());
		return 1;
	}

	public void stop() {
		buffer = null;
	}

	public Term collect() {
		return TermData.SYM(buffer.toString());
	}
}
