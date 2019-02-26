package SxxMachine;

import java.util.Enumeration;
import java.util.Vector;

import SxxMachine.pterm.SourceFluentTerm;

/**
  Builds Jinni Iterators from Java
  Sequences and Iterator type classes
*/
public class EnumerationSource extends SourceFluentTerm {
    private Enumeration e;

    public EnumerationSource(Prog p) {
        super(p);
        e = null;
    }

    public EnumerationSource(Enumeration e, Prog p) {
        super(p);
        this.e = e;
    }

    public EnumerationSource(Vector V, Prog p) {
        super(p);
        this.e = V.elements();
    }

    @Override
    public Term getElement() {
        if (null == e || !e.hasMoreElements())
            return null;
        else
            return (Term) e.nextElement();
    }

    @Override
    public void stop() {
        e = null;
    }
}
