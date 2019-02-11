package SxxMachine;

import SxxMachine.SymbolTerm.Dynamic;

/**
 * Special constants, used to Name variables
 * 
 * @see Term
 * @see Var
 */
class PseudoVar extends Dynamic {
	PseudoVar(int i) {
		super("V_" + i);
	}

	/**
	 * Prints out a term to a String with variables named in order V1, V2,....
	 */
	@Override
	public String pprint() {
		return name();
	}

	@Override
	public String toQuotedString() throws PrologException {
		// TODO Auto-generated method stub
		return pprint();
	}

	@Override
	public void toStringImpl(int printingFlags, StringBuilder sb) {
		// TODO Auto-generated method stub
		sb.append(toQuotedString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pprint();
	}

	PseudoVar(String s) {
		super(s);
	}
}
