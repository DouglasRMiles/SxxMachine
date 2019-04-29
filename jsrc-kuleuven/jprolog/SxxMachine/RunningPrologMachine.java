
package SxxMachine;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
//import SxxMachine.Deque;
//import SxxMachine.Iterator
//import SxxMachine.LinkedList;

public class RunningPrologMachine extends ModulePrologMachine {

    public static final Term[] NO_ARGS = {};

    private final java.util.Deque<MiniJProlog> runStack;

    private final IOLayer iolayer;
    private long timestamp;

    public RunningPrologMachine() {
        this(createDefaultStreamProvider());
    }

    public RunningPrologMachine(StreamProvider defaultStreams) {
        super();
        iolayer = new IOLayer(this, defaultStreams);
        runStack = new java.util.LinkedList<MiniJProlog>();
    }

    protected void initAlways() {
        timestamp = Long.MIN_VALUE;
    }

    public long getTimestamp() {
        return timestamp;
    }

    long updateTimestamp() {
        return timestamp++;
    }

    public Term[] createAregCopy(int count) {
        if (count < 0)
            throw new IllegalArgumentException();
        final TermArray areg = getAreg();
        final Term[] copy = areg.getBackingCopy(count);
        return copy;
    }

    public TermArray getAreg() {
        return getCurrentStackItem().getAreg();
    }

    protected void startNewStackItem(JPrologRunStackIniter initer) throws JPrologScriptException {
        runStack.addLast(new MiniJProlog(this));
        createChoicePoint(NO_ARGS);
        if (initer != null)
            initer.init(this);
    }

    protected void removeStackItem() {
        runStack.removeLast();
    }

    MiniJProlog getCurrentStackItem() {
        return runStack.getLast();
    }

    public Term getAssumptions() {
        return getCurrentStackItem().getAssumptions();
    }

    public void setAssumptions(Term assumptions) {
        getCurrentStackItem().setAssumptions(assumptions);
    }

    public Term getPendinggoals() {
        return getCurrentStackItem().getPendinggoals();
    }

    public void setPendinggoals(Term pendinggoals) {
        getCurrentStackItem().setPendinggoals(pendinggoals);
    }

    public final int getCurrentChoice() {
        return getCurrentStackItem().getCurrentChoice();
    }

    public IOLayer getIOLayer() {
        return iolayer;
    }

    Term nexttoken() {
        return getIOLayer().getStreamHandlerIn().getCurrentStream().getLexer().next();
    }

    @Override
    public void setExceptionState(ErrorStatus status) {
        getCurrentStackItem().setExceptionState(status);
    }

    ErrorStatus getExceptionState() {
        return getCurrentStackItem().getExceptionState();
    }

    private JpChoicePointStackEntry getCurrentStackPoint() {
        return getCurrentStackItem().getCurrentStackPoint();
    }

    public void setPrologExceptionHandler(ExceptionHandlerIF handler) {
        getCurrentStackPoint().setExceptionHandler(handler);
    }

    public Code processException(JPrologInternalException ex) throws JPrologInternalException {
        return getCurrentStackItem().processException(ex);
    }

    //@Deprecated
    public void fillAlternative(Code alt) {
        getCurrentStackPoint().setAlternative(alt);
    }

    public void fillAlternatives(java.util.Iterator<Code> todo) {
        if (todo instanceof CodeIterator) {
            final CodeIterator c = (CodeIterator) todo;
            c.setPrologMachine(this);
        }
        getCurrentStackPoint().setAlternative(todo);
    }

    public void trailEntry(UnTrailOperation po) {
        getCurrentStackItem().trailEntry(po);
    }

    public void removeChoice() {
        getCurrentStackItem().removeChoice();
    }

    public int getCUTB() {
        return getCurrentStackItem().getCUTB();
    }

    public void updateCUTB() {
        updateCUTB(getCurrentChoice());
    }

    public void updateCUTB(int i) {
        getCurrentStackItem().updateCUTB(i);
    }

    public void createChoicePoint(Term... args) {
        getCurrentStackItem().createChoicePoint(args);
    }

    @Override
    public void checkCont(int n) {
        getCurrentStackItem().checkCont(n);
    }

    public void doCut(int cutTo) {
        getCurrentStackItem().doCut(cutTo);
    }

    @Override
    public ModuleRunStackInfo getModuleInfo(JpModule module) {
        return getCurrentStackItem().getModuleInfo(module.getClassToRegister());
    }

    public ModuleRunStackInfo getModuleInfo(Class<? extends JpModule> name) {
        return getCurrentStackItem().getModuleInfo(name);
    }

    static StreamProvider createDefaultStreamProvider() {
        return new StreamProvider() {
            private final Reader in = new InputStreamReader(System.in);
            private final Writer out = new OutputStreamWriter(System.out);

            @Override
            public Reader getReader() {
                return in;
            }

            @Override
            public Writer getWriter() {
                return out;
            }
        };
    }

    public JpVar mkvar0() {
        return new JpVar(this);
    }

}
