package SxxMachine;

import java.util.ArrayList;

/**
 * Implements a stack of undo actions for backtracking, and in particular,
 * resetting a Var's Ref fiels to unbound (i.e. this).
 *
 *
 * @see Undoable
 * @see Var
 */
public class KPTrail extends Trail {

    public KPTrail() {
        super(Prolog.M);
    }

    ArrayList<Undoable> stack = new ArrayList<Undoable>();

    //    public int top() {
    //        int expect = super.top() + 1;
    //        final int size = stack.size();
    //        if (expect != size) {
    //            mismatch();
    //        }
    //        return size;
    //    }

    //    public final void push(Undoable var) {
    //        super.push(var);
    //        stack.add(var);
    //        top();
    //    }
    //
    //    public final Undoable pop() {
    //        final Object remove = stack.remove(stack.size() - 1);
    //        Undoable Other = super.pop();
    //        if (Other != remove) {
    //            mismatch();
    //        }
    //        return (Undoable) remove;
    //    }

    /**
     * Used to undo bindings after unification, if we intend to leave no side
     * effects.
     */

    //    // synchronized
    //    final public void unwind(int to) {
    //        // super.unwind(to);
    //        // IO.mes("unwind TRAIL: "+name()+": "+size()+"=>"+to);
    //        int remove = top() - to;
    //        if (remove < 0)
    //            IO.assertion("unwind attempted from smaller to larger top");
    //        while (remove-- > 0) {
    //            Undoable O = pop();
    //            O.undo();
    //        }
    //    }
    //
    //    private void mismatch() {
    //        Prolog.Break("mismatch ");
    //        // TODO Auto-generated method stub
    //        if (true)
    //            throw new AbstractMethodError("KPTrail.mismatch");
    //    }

    //
    //    public boolean isEmpty() {
    //        assert super.
    //        return stack.isEmpty();
    //    }

    public String name() {
        return "trail" + hashCode() % 64;
    }

    public String pprint() {
        return name() + "\n" + super.toString() + "\n";
    }

    public String stat() {
        return "Trail=" + top();
    }
}
