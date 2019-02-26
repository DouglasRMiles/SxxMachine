package SxxMachine;

import java.util.Vector;

import SxxMachine.pterm.*;
import static SxxMachine.pterm.TermData.*;

/**
  An Infinite IFluent.
  If based on a finite IFluent, it moves to its the first element after reaching its last element.
  A SourceLoop returns 'no' if the original IFluent is empty.
  In case the original IFluent is infinite, a SourceLoop will
  return the same elements as the original IFluent.
  (In particular, this happens if the original IFluent is also a IFluent loop).
*/
public class SourceLoop extends SourceFluent implements Fluent {
    private Vector v;
    Fluent s;
    private int i;

    public SourceLoop(Fluent s, Prog p) {
        super(p);
        this.s = s;
        this.v = new Vector();
        this.i = 0;
    }

    private final Term getMemoized() {
        if (null == v || v.size() <= 0)
            return null;
        Term T = (Term) v.elementAt(i);
        i = (i + 1) % v.size();
        return T;
    }

    @Override
    public Term getElement() {
        Term T = null;
        if (null != s) { //s is alive
            T = ((SourceFluentTerm) s).getElement();
            if (null != T)
                v.addElement(T);
            else {
                s = null;
            }
        }
        if (null == s)
            T = getMemoized();
        return T;
    }

    @Override
    public void stop() {
        v = null;
        s = null;
    }
}
