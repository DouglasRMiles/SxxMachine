package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Template for builtins of arity 0
 */

abstract public class ConstBuiltin implements NameArity, Operation {

	Method st_exec_method;

	@Override
	public Operation exec(Prolog engine) throws PrologException {

		if (st_exec_method == null) {
			soopsy("Null method in " + this);

		}
		return new Operation() {

			@Override
			public Operation exec(Prolog e) throws PrologException {
				try {
					return (Operation) st_exec_method.invoke(null, e.asProg(), engine.getISTerm(arity()));
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
					e1.printStackTrace();
					throw new AbstractMethodError(".exec throw Exception " + e1);
				}
			}
		};

	}

	@Override
	public void setMethod(Method b) {
		// soopsy();
		st_exec_method = b;
	}

	@Override
	public java.lang.String getFAKey() {
		return Name + "/" + arity();
	}

	String Name;

	public ConstBuiltin(String s) {
		Name = s;
		if (getClass() == ConstBuiltin.class) {
			PredTable.register(this);
		}
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
	public int arity() {
		return Term.CONST;
	}

}
