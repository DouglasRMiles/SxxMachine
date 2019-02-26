package SxxMachine;

import SxxMachine.pterm.*;
import static SxxMachine.pterm.TermData.*;
import SxxMachine.pterm.SourceFluentTerm;
import SxxMachine.Prog;

import java.util.ArrayList;
import java.util.Vector;

abstract public class SourceFluent extends SourceFluentTerm implements Fluent {

    public SourceFluent(Prog p) {
        super(p);
    }

    @Override
    abstract public Term getElement();

    public Nonvar toList() {
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
