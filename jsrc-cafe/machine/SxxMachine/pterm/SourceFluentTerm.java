package SxxMachine.pterm;

// CONS;
import static SxxMachine.pterm.TermData.*;

import java.util.ArrayList;

import SxxMachine.Compound;
import SxxMachine.Copier;
import SxxMachine.Nonvar;
import SxxMachine.Prog;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.Undoable;
import SxxMachine.Var;


abstract public class SourceFluentTerm extends FluentTerm implements Undoable, Var {

    @Override
    public boolean unbound() {
        return false;
    }

    public SourceFluentTerm(Prog p) {
        super(p);
    }

    @Override
	public boolean isSource() {
        return true;
    }

    abstract public Term getElement();

    public Nonvar toPlConsList() {
        Term head = getElement();
        if (null == head)
            return (Nonvar) Prolog.Nil;
        Compound l = CONS(head, Prolog.Nil);
        Compound curr = l;
        for (;;) {
            head = getElement();
            if (null == head)
                break;
            Compound tail = CONS(head, Prolog.Nil);
            curr.setArg(1, tail);
            curr = tail;
        }
        return l.toNonVar();
    }

    public Term toFun() {
        ArrayList V = new ArrayList();
        Term X;
        while (null != (X = getElement())) {
            V.add(X);
        }
        return Copier.VectorToFun(V);
    }
}
