package SxxMachine;

import java.util.Stack;

import SxxMachine.pterm.FluentTerm;



/**
 * Varable-like entity, with a multiple values, in stack order.
 * Set operations are undone on backtraking, when the previous
 * value is restored.
 */
public class MultiVar extends FluentTerm {
    Stack vals;

    public MultiVar(Term T, Prog p) {
        super(p);
        vals = new Stack();
        vals.push(T.dref());
    }

    final public void set(Term T, Prog p) {
        vals.push(T);
        p.getTrail().push(this);
    }

    public Term val() {
        return (Term) vals.peek();
    }

    /**
     * cannot be made presistent
    */
    @Override
    public void undo() {
        vals.pop();
    }

    /*
    public String toString() {
        return "MultiVar["+vals.size()+"]->{"+vals.peek().toString()+"}";
    }
    */
}
