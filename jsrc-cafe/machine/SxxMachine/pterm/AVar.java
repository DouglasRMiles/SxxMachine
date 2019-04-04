package SxxMachine.pterm;

import SxxMachine.Undoable;
import SxxMachine.Var;

/**
 * Part of the Term hierarchy implmenting logical variables. They are subject to
 * reset by application of and undo action keep on the trail stack.
 */
abstract class AVar extends PTerm implements Var, Undoable {

    @Override
    public String toStringImpl(int depth) {
        return "_" + Integer.toHexString(hashCode());
    }

    @Override
    public String variableName() {
        return "_" + Integer.toHexString(hashCode());
    }

    @Override
    abstract public boolean unbound();

}