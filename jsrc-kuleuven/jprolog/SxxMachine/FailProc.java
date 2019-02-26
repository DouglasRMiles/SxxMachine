
package SxxMachine;

public class FailProc extends Code {

    private final static Logger log = Logger.getLogger(FailProc.class);

    private static volatile FailProc instance;

    private FailProc() {
    }

    @Override
    public int arity() {
        return 0;
    }

    public synchronized static FailProc createInstance(PredikatenPrologMachine machine) {
        if (instance == null)
            instance = new FailProc();
        machine.registerCode(instance, Const.strIntern("fail"));
        return instance;
    }

    @Override
    public Code exec(PrologMachine mach) {
        RunStackItem stack = mach.getCurrentStackItem();
        if (stack.getCurrentChoice() == -1) {
            log.warn("Stack choicepoints empty!");
            stack.setExceptionState(ErrorStatus.FATALERROR);
            return null;
        }
        // unwind the trail
        stack.unTrail();
        // restore the arguments
        stack.restoreArguments();
        if (stack.getCurrentChoice() == 0)
            return null;
        // reset CUTB
        stack.updateCUTB(stack.getCurrentChoice() - 1);
        // return the alternative as continuation
        Code c = stack.getAlternative();
        stack.cleanAlternatives();
        return c;
    }

}
