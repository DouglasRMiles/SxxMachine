
package SxxMachine;

public interface Term extends UnTrailOperation {

    public boolean isTerm();

    public Term asTerm();

    public Term dref();

    public boolean unify(Term that);

    public boolean bind(Term that);

    //@Override
    //public boolean equals(Object o);

    public boolean equalsTerm(Term that);

    public String fname();

    public int arity();

    public void unTrailSelf();

    public Term copy(RunningPrologMachine m, long t);

    public boolean isVariable();

    public int termHashCode();

    @Override
    public int hashCode();

    public long longValue();

    public boolean isCons();

    public boolean isNil();

    @Override
    public String toString();

    String toStringImpl(int depth);

    public boolean couldUnify(Term object);

    boolean couldUnifyInverse(Term object);

    public Continuation asContinuation();

    public boolean isContinuation();

}
