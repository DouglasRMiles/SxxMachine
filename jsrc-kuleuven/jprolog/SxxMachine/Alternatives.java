
package SxxMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Alternatives {

    private final List<Code> alternates;
    private boolean isIndexed;
    private Map<Code, Term[]> args;

    public Alternatives() {
        this(2);
    }

    public Alternatives(int size) {
        super();
        alternates = new ArrayList<Code>(size);
        isIndexed = true;
        args = new HashMap<Code, Term[]>();
    }

    public void disable() {
        isIndexed = false;
        args = null;
    }

    public boolean isDisabled() {
        return !isIndexed;
    }

    public void addAlternative(Code c) {
        if (c == null)
            throw new NullPointerException();
        alternates.add(c);
        if (isDisabled())
            return;
        Term[] ar = c.getArgs();
        if (ar == null) {
            disable();
        } else {
            args.put(c, ar);
        }
    }

    public Iterator<Code> getIndexedAlternatives(Term[] args) {
        if (!isIndexed || args == null || args.length == 0 || alternates.size() == 1)
            return (Iterator<Code>) alternates.iterator();
        args = deref(args);
        if (isAllVar(args))
            return alternates.iterator();
        //Eigen iterator bouwen om sneller rond te stappen
        return new Switch(args);
    }

    private boolean isAllVar(Term[] args) {
        for (Term a : args)
            if (!a.isVariable())
                return false;
        return true;
    }

    private Term[] deref(Term[] args) {
        Term[] res = new Term[args.length];
        for (int i = 0; i < args.length; i++)
            res[i] = args[i].dref();
        return res;
    }

    private class Switch implements CodeIterator {

        private final Iterator<Code> iterator;
        private Code next = null;
        private final Term[] args;
        private RunningPrologMachine mach;

        public Switch(Term[] args) {
            super();
            iterator = alternates.iterator();
            this.args = args;
            next = findNext();
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Code next() {
            if (!hasNext()) {
                //throw new NoSuchElementException();
                //Normaalgezien moet bovenstaande fout optreden volgens afspraak in interface,
                //wij gaan echter een aangepaste versie uitvoeren
                if (mach == null)
                    throw new NoSuchElementException();
                mach.removeChoice();
                Code f = mach.Fail0;
                mach = null;
                return f;
            }
            Code n = next;
            next = findNext();
            return n;
        }

        private Code findNext() {
            while (iterator.hasNext()) {
                Code n = iterator.next();
                if (couldWork(n))
                    return n;
            }
            return null;
        }

        private boolean couldWork(Code n) {
            Term[] ar = Alternatives.this.args.get(n);
            for (int i = 0; i < ar.length; i++) {
                if (!ar[i].couldUnify(args[i]))
                    return false;
            }
            return true;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setPrologMachine(RunningPrologMachine mach) {
            if (mach == null)
                throw new NullPointerException();
            this.mach = mach;
        }

    }

}
