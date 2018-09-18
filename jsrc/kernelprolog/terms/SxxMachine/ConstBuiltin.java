package SxxMachine;

import SxxMachine.Builtins.NameArity;

/**
* Template for builtins of arity 0
*/

abstract public class ConstBuiltin implements NameArity {

	String Name;
	public ConstBuiltin(String s) {
		Name = s;
	}

	//abstract public int exec(Prog p);

	public boolean isBuiltin() {
		return true;
	}

	public String name() {
		// TODO Auto-generated method stub
		return Name;
	}

	public int arityOrType() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
