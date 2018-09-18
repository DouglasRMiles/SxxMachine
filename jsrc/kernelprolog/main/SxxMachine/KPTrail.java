package SxxMachine;

import java.util.ArrayList;

/**
 * Implements a stack of undo actions for backtracking, and in particular,
 * resetting a Var's Ref fiels to unbound (i.e. this).
 * 
 * 
 * @see Term
 * @see Var
 */
public class KPTrail {
  public final void push(Term var) {
    add(var);
  }

  public final Term pop() {
    return (Term) remove(size() - 1);
  }

  ArrayList<Term> stack = new ArrayList<Term>();

  private Object remove(int i) {
    return stack.remove(i);
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

  public int size() {
    return stack.size();
  }

  private void add(Term x) {
    stack.add(x);
  }

  public KPTrail() {
    super();
  }

  public String name() {
    return "trail" + hashCode() % 64;
  }

  public String pprint() {
    return name() + "\n" + super.toString() + "\n";
  }

  /**
   * Used to undo bindings after unification, if we intend to leave no side
   * effects.
   */

  // synchronized
  final public void unwind(int to) {
    // IO.mes("unwind TRAIL: "+name()+": "+size()+"=>"+to);
    // if(to>size())
    // IO.assertion("unwind attempted from smaller to larger top");
    for (int i = size() - to; i > 0; i--) {
      Term O = pop();
      O.undo();
    }
  }

  public String stat() {
    return "Trail=" + size();
  }
}
