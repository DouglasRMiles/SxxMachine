package SxxMachine;

// *;
import static SxxMachine.pterm.TermData.*;

import SxxMachine.pterm.StructureTerm;

/**
  Lazy List: produces Cons-like sequences, based on a SourceFluent.
  Saving a lazy list to the database does not make too much sense
  as it will be discarded when backtracking over its creation point.
  Note that a Lazy List has its own trail, and is only discarded
  when backtracking over its creation point.
*/
public class LazyList extends StructureTerm implements Undoable {
    public LazyList(Term head, Fluent source, KPTrail trail) {
        super(".", head, V());
        this.source = (SourceFluent) source;
        this.bound = false;
        this.trail = trail;
        this.oldTop = trail.top();
    }

    private SourceFluent source;
    private boolean bound;
    private KPTrail trail;
    private int oldTop;

    /**
     * advances the Lazy List, pulling out elements of the SourceFluent
     * as needed
     */
    private final void advance() {
        if (bound)
            return;
        Term nextHead = source.getElement();
        Nonvar thisTail;
        if (null == nextHead) {
            thisTail = getNull();
        } else {
            thisTail = new LazyList(nextHead.duplicateTerm(), source, trail);
        }
        super.getDrefArg(1).Unify_TO(thisTail, trail);
        bound = true;
    }

    /**
     * Advances the tail of a lazy list.
     * Note that they inherit getHead() from Cons.
     */

    @Override
    public Term getPlainArg(int i) {
        if (i > 0)
            advance();
        return super.getPlainArg(i);
    }

    /**
     * this permissive definition for bind_to allows a Lazy
     * List to Unify with any 2 arg constructor chain
     */
    @Override
    public boolean bindKP(Term that, KPTrail trail) {
        return that instanceof Compound && 2 == that.arity();
    }

    public Nonvar getNull() {
        return Nonvar.aNil;
    }

    @Override
    public void undo() {
        //if(source.getPersistent()) return;
        trail.unwind(oldTop);
        source.stop();
        source = null;
    }
}
