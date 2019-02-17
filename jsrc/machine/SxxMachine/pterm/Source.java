package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.CONS;

import java.util.ArrayList;

import SxxMachine.Copier;
import SxxMachine.Prog;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.Undoable; 

abstract public class Source extends Fluent implements Undoable {

    public Source(Prog p) {
        super(p);
    }

    public static boolean isSource() {
        return true;
    }

    abstract public Term getElement();

    public Nonvar toList() {
        Term head = getElement();
        if (null == head)
            return (Nonvar) Prolog.Nil;
        Nonvar l = CONS(head, Prolog.Nil);
        Nonvar curr = l;
        for (;;) {
            head = getElement();
            if (null == head)
                break;
            Nonvar tail = CONS(head, Prolog.Nil);
            curr.setArg(1, tail);
            curr = tail;
        }
        return l;
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
