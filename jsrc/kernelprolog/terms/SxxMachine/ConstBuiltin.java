package SxxMachine;

/**
* Template for builtins of arity 0
*/

abstract public class ConstBuiltin extends TermData implements NameArity {

	String Name;
	public ConstBuiltin(String s) {
		Name = s;
	}

	//abstract public int exec(Prog p);

	public boolean isBuiltin() {
		return true;
	}

	public String name() {
		return Name;
	}

	public int arityOrType() {
		return Term.CONST;
	}
	

}
