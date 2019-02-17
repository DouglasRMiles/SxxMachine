package SxxMachine.pterm;

import SxxMachine.PrologException;
import SxxMachine.Term;

/**
 * Special constants, used to Name variables
 * 
 * @see Term
 * @see Var
 */
public class PseudoVar extends SymbolTerm.Dynamic {

    public PseudoVar(int i) {
        super("V_" + i);
    }

    /**
     * Prints out a term to a String with variables named in order V1, V2,....
     */
    @Override
    public String pprint() {
        return fname();
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
