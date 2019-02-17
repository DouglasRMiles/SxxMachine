package SxxMachine;

import java.lang.reflect.Method;

import SxxMachine.pterm.TermData;

/**
 * Template for builtins of arity 0
 */

abstract public class ConstBuiltin extends TermData implements NameArity {

	@Override
	public void setMethod(Method b) {
		// TODO Auto-generated method stub

	}

	@Override
	public java.lang.String getKey() {
		return Name + "/" + arityOrType();
	}

	String Name;

	public ConstBuiltin(String s) {
		Name = s;
	}

	// abstract public int exec(Prog p);

	public boolean isBuiltin() {
		return true;
	}

	@Override
	public String fname() {
		return Name;
	}

	@Override
	public int arityOrType() {
		return Term.CONST;
	}

}
