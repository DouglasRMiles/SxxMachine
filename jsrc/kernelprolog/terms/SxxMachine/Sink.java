package SxxMachine;

abstract public class Sink extends Fluent implements Undoable {

	public Sink(Prog p) {
		super(p);
	}

	abstract public int putElement(Term T);

	public Term collect() {
		return null;
	}
}
