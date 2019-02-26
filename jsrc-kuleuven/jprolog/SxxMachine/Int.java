
package SxxMachine;

public final class Int extends JpATerm {
    private final long intValue;

    Int(long i) {
        intValue = i;
    }

    @Override
    public Term copy(RunningPrologMachine m, long t) {
        return JpFactory.Long(intValue);
    }

    @Override
    public long longValue() {
        return intValue;
    }

    @Override
    public Term dref() {
        return this;
    }

    @Override
    public String toStringImpl(int depth) {
        return "" + intValue;
    }

    @Override
    public boolean unify(Term that) {
        Int tmpint;
        if (!(that instanceof Int))
            return that.bind(this);
        tmpint = (Int) that; // cast perhaps to be avoided
        return (tmpint.intValue == this.intValue);
    }

    @Override
    public boolean couldUnify(Term object) {
        return equalsTerm(object.dref()) || object.couldUnifyInverse(this);
    }

    @Override
    public boolean equalsTerm(Term that) {
        if (!(that instanceof Int)) {
            return false;
        }
        return this.intValue == ((Int) that).intValue;
    }

    @Override
    public String fname() {
        return "" + intValue;
    }

}
