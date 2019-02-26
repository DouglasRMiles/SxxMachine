package SxxMachine;

import java.util.Iterator;

import SxxMachine.pterm.SourceFluentTerm;

/**
 * Builds Prolog Iterators from Java Sequences and Iterator type classes
 */
public class IterableSource extends SourceFluentTerm {
    private Iterator e;

    public IterableSource(Prog p) {
        super(p);
        e = null;
    }

    public IterableSource(Iterator iterator, Prog p) {
        super(p);
        this.e = iterator;
    }
 

    public IterableSource(Iterable V, Prog p) {
        super(p);
        this.e = V.iterator();
    }

    @Override
    public Term getElement() {
        if (null == e || !e.hasNext())
            return null;
        else
            return (Term) e.next();
    }

    @Override
    public void stop() {
        e = null;
    }
}
