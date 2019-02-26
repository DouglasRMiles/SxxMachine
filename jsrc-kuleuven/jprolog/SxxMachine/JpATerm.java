
package SxxMachine;

public abstract class JpATerm implements Term {
    final static Logger log = Logger.getLogger(JpFactory.class);

    @Override
    public boolean isTerm() {
        return true;
    }

    @Override
    public Term asTerm() {
        return this;
    }

    public void oopsy(String message) {
        final String cmessage = message + " for " + getClass();
        new Exception(cmessage).printStackTrace();
        log.debug(cmessage);
        // TODO Auto-generated method stub

    }

    @Override
    public Term dref() {
        oopsy("ERROR: General deref on objects not available");
        return this;
    }

    @Override
    public boolean unify(Term that) {
        oopsy("general unify on objects not available");
        return false;
    }

    @Override
    public boolean bind(Term that) {
        return false;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Term))
            return false;
        return equalsTerm((Term) o);
    }

    @Override
    public boolean equalsTerm(Term that) {
        oopsy("general equal on objects not available");
        return false;
    }

    @Override
    public String fname() {
        oopsy("general getname on objects not available");
        return "";
    }

    @Override
    public int arity() {
        oopsy("general getarity on objects not available");
        return 0;
    }

    @Override
    public void unTrailSelf() {
        oopsy("general untrail on objects not available");
    }

    @Override
    public Term copy(RunningPrologMachine m, long t) {
        oopsy("general copy on objects not available");
        return null;
    }

    @Override
    public boolean isVariable() {
        return false;
    }

    @Override
    public int termHashCode() {
        return super.hashCode();
    }

    @Override
    final public int hashCode() {
        return termHashCode();
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public boolean isCons() {
        return false;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public final String toString() {
        return toStringImpl(5);
    }

    @Override
    public String toStringImpl(int depth) {
        return super.toString();
    }

    @Override
    public boolean couldUnify(Term object) {
        return false;
    }

    @Override
    public boolean couldUnifyInverse(Term object) {
        return false;
    }

    @Override
    public Continuation asContinuation() {
        return (Continuation) (Object) this;
    }

    @Override
    public boolean isContinuation() {
        return false;
    }

}
