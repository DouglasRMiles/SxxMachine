package SxxMachine;

import SxxMachine.pterm.SourceFluentTerm;

/**
 * Merges a List of Sources into a new Source which (fairly) iterates over them
 * breadth first.
 */
public class SourceMerger extends IterableSource {

    public SourceMerger(Nonvar Xs, Prog p) {
        super(p);
        this.Q = new O1Queue(Copier.ConsToVector(Xs));
    }

    private O1Queue Q;

    @Override
    public Term getElement() {
        if (null == Q)
            return null;
        while (!Q.isEmpty()) {
            SourceFluentTerm current = (SourceFluentTerm) Q.deq();
            if (null == current)
                continue;
            Term T = current.getElement();
            if (null == T)
                continue;
            Q.enq(current);
            return T;
        }
        return null;
    }
}
