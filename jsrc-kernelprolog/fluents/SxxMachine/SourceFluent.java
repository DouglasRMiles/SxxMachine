package SxxMachine;

// *;
import static SxxMachine.pterm.TermData.*;

import java.util.ArrayList;

import SxxMachine.pterm.SourceFluentTerm;

abstract public class SourceFluent extends SourceFluentTerm implements Fluent {

    public SourceFluent(Prog p) {
        super(p);
    }

    @Override
    abstract public Term getElement();

    public Nonvar toPlConsList() {
        Term head = getElement();
        if (null == head)
            return (Nonvar) Nonvar.aNil;
        Compound l = CONS(head, Nonvar.aNil);
        Compound curr = l;
        for (;;) {
            head = getElement();
            if (null == head)
                break;
            Compound tail = CONS(head, (Term) Nonvar.aNil);
            curr.setArg(1, tail);
            curr = tail;
        }
        return l;
    }

    public Term toCompound() {
        ArrayList V = new ArrayList();
        Term X;
        while (null != (X = getElement())) {
            V.add(X);
        }
        return  Copier.VectorToFun(V);
    }
}
