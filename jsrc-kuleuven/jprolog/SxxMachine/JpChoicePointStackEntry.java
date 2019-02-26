
package SxxMachine;

import java.util.Iterator;
import java.util.NoSuchElementException;

class JpChoicePointStackEntry { //implements ExceptionHandlerIF {
    private Iterator<Code> alternatives;

    private int trail;

    private final Term arguments[];

    private final long timeStamp;
    private ExceptionHandlerIF handler;

    JpChoicePointStackEntry(long timestamp, Term... args) {
        arguments = args.clone();
        timeStamp = timestamp;
        handler = DefaultExceptionHandler.getInstance();
    }

    void setTrail(int trail) {
        if (trail < 0)
            throw new IllegalArgumentException();
        this.trail = trail;
    }

    int getTrail() {
        return trail;
    }

    Term[] getArguments() {
        return arguments;
    }

    public Code handlePrologException(JPrologInternalException exception, RunStackItem mach)
            throws JPrologInternalException {
        return handler.handlePrologException(exception, mach);
    }

    void setExceptionHandler(ExceptionHandlerIF handler) {
        this.handler = handler;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    Code getAlternative() {
        if (!hasNextAlternative())
            throw new NoSuchElementException();
        return alternatives.next();
    }

    boolean hasNextAlternative() {
        if (alternatives == null || !alternatives.hasNext()) {
            //Geen verdere elementen, stack opkuisen
            alternatives = null;
            return false;
        }
        return true;
    }

    //@Deprecated
    public void setAlternative(Code alt) {
        if (alt == null)
            throw new NullPointerException();
        alternatives = new SingleElementIterator(alt);
    }

    public void setAlternative(Iterator<Code> alternatives) {
        if (alternatives == null)
            throw new NullPointerException();
        this.alternatives = alternatives;
    }

    @Deprecated
    private static class SingleElementIterator implements Iterator<Code> {

        private final Code code;
        private final boolean returned;

        public SingleElementIterator(Code c) {
            code = c;
            returned = false;
        }

        @Override
        public boolean hasNext() {
            return !returned;
        }

        @Override
        public Code next() {
            if (returned)
                throw new NoSuchElementException("Element reeds opgevraagd");
            return code;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

}
