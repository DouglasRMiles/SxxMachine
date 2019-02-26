package SxxMachine.pterm;

import SxxMachine.Atomic;
import SxxMachine.Const;
import SxxMachine.OpVisitor;
import SxxMachine.PrologException;
import SxxMachine.Term;

public abstract class AtomicConst extends Const implements Atomic {

    public AtomicConst(Object i) {
        super(i);
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IConst#type()
     */
    @Override
    abstract public int type();

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IConst#arityOrType()
     */
    @Override
    public int arityOrType() {
        return type();
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IConst#toStringImpl(int, java.lang.StringBuilder)
     */
    @Override
    public void toStringImpl(int printFlags, StringBuilder sb) {
        sb.append(pprint());
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IConst#isImmutable()
     */
    @Override
    public boolean isImmutable() {
        return true;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IConst#equalsTerm(SxxMachine.Term, SxxMachine.OpVisitor)
     */

    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        return equalsTerm(obj);
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.IConst#pprint()
     */
    @Override
    public String pprint() throws PrologException {
        return getString();
    }

}
