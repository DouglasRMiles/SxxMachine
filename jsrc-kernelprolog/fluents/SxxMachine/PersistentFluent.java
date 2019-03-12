package SxxMachine;


import SxxMachine.pterm.FluentTerm;

/**
 * A Fluent is a Agent Object which has its own state, subject to changes over time.
 *
 */
abstract public class PersistentFluent extends FluentTerm implements  Cloneable {

    public boolean persistent = true;

    public PersistentFluent() {
        super(null);
    }

    public PersistentFluent(Prog as) {
        super(as);
    }

}
