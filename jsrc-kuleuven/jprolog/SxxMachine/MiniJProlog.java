
package SxxMachine;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MiniJProlog implements Comparator<Class<? extends JpModule>> {

    private final static Logger log = Logger.getLogger(MiniJProlog.class);

    private Term pendinggoals;
    private Term assumptions;
    private ErrorStatus status;

    private final ArrayDeque<UnTrailOperation> trailStack;
    private final Term areg[] = new Term[32];

    private int cutb;
    private final ArrayDeque<JpChoicePointStackEntry> choicePointStack;
    private final Map<Class<? extends JpModule>, ModuleRunStackInfo> moduleInfo;
    private final RunningPrologMachine mach;

    MiniJProlog(RunningPrologMachine machine) {
        if (machine == null)
            throw new NullPointerException();
        mach = machine;
        setPendinggoals(Prolog.Nil);
        setAssumptions(Prolog.Nil);
        status = ErrorStatus.NONE;
        cutb = 0;
        trailStack = new ArrayDeque<UnTrailOperation>(500);
        choicePointStack = new ArrayDeque<JpChoicePointStackEntry>(100);
        moduleInfo = new TreeMap<Class<? extends JpModule>, ModuleRunStackInfo>(this);
    }

    public RunningPrologMachine getMachine() {
        return mach;
    }

    public ModuleRunStackInfo getModuleInfo(Class<? extends JpModule> c) {
        ModuleRunStackInfo info = moduleInfo.get(c);
        if (info == null) {
            info = new ModuleRunStackInfo();
            moduleInfo.put(c, info);
        }
        return info;
    }

    public final int getCurrentChoice() {
        return choicePointStack.size() - 1;
    }

    public Term[] getAreg() {
        return areg;
    }

    public void setExceptionState(ErrorStatus status) {
        if (status == null)
            throw new NullPointerException();
        this.status = status;
    }

    public ErrorStatus getExceptionState() {
        return status;
    }

    public Term getAssumptions() {
        return assumptions;
    }

    public final void setAssumptions(Term assumptions) {
        if (assumptions == null)
            throw new NullPointerException();
        this.assumptions = assumptions;
    }

    public Term getPendinggoals() {
        return pendinggoals;
    }

    public final void setPendinggoals(Term pendinggoals) {
        if (pendinggoals == null)
            throw new NullPointerException();
        this.pendinggoals = pendinggoals;
    }

    void unTrail(int targetSize) {
        while (trailStack.size() > targetSize) {
            trailStack.pollLast().unTrailSelf();
        }
    }

    public int getTrailSize() {
        return trailStack.size();
    }

    public void trailEntry(UnTrailOperation po) {
        if (po == null)
            throw new NullPointerException();
        trailStack.add(po);
    }

    protected JpChoicePointStackEntry getCurrentStackPoint() {
        return choicePointStack.getLast();
    }

    public void removeChoice() {
        choicePointStack.removeLast();
    }

    void restoreArguments() {
        final JpChoicePointStackEntry cp = getCurrentStackPoint();
        final Term[] args = cp.getArguments();
        for (int i = 0; i < args.length; i++) {
            areg[i] = args[i];
        }
    }

    public int getCUTB() {
        return cutb;
    }

    public void updateCUTB(int i) {
        if (i < 0)
            throw new IllegalArgumentException("Invalid index: " + i);
        cutb = i;
    }

    public long getTimestamp() {
        return mach.getTimestamp();
    }

    public long getCurrentChoiceTimeStamp() {
        return getCurrentStackPoint().getTimeStamp();
    }

    void createChoicePoint(Term... args) {
        choicePointStack.add(new JpChoicePointStackEntry(mach.updateTimestamp(), args));
        getCurrentStackPoint().setTrail(getTrailSize());
    }

    void doCut(int cutTo) {
        if (cutTo > getCurrentChoice())
            throw new IllegalArgumentException();
        int ch = getCurrentChoice();
        log.debug("Cut to " + cutTo + " from " + ch);
        while (ch != cutTo) {
            removeChoice();
            ch--;
        }
    }

    @Override
    public int compare(Class<? extends JpModule> o1, Class<? extends JpModule> o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public boolean cleanAlternatives() {
        if (getCurrentChoice() < 0)
            return false;
        if (!getCurrentStackPoint().hasNextAlternative()) {
            removeChoice();
            return true;
        }
        return false;
    }

    public void unTrail() {
        if (choicePointStack.isEmpty())
            unTrail(0);
        else
            unTrail(getCurrentStackPoint().getTrail());
    }

    public Code processException(JPrologInternalException ex) {
        while (getCurrentChoice() >= 0) {
            try {
                return getCurrentStackPoint().handlePrologException(ex, this);
            } catch (final JPrologInternalException ex2) {
                if (!ex.equals(ex2))
                    throw new JPrologInternalException("Unknown exception detected", ex2);
                /*if (getCurrentChoice() >= 0) {
                  removeChoice();
                    unTrail();
                } */
            }
        }
        throw ex;
    }

    Code getAlternative() {
        if (cleanAlternatives()) {
            return getMachine().Fail0;
        }
        return getCurrentStackPoint().getAlternative();
    }

    /**
     * @param args
     * @param i
     * @param continuation
     */
    public void setCont(Term[] args, int arity, Term continuation) {
        cont = continuation;
        arity_b4_cont = arity;
        args[arity] = continuation;

    }

    /**
     * @param local_aregs
     * @param i
     */
    public void setARegENull(Term[] local_aregs, int i) {
        local_aregs[i] = null;

    }

    /**
     * @param local_aregs
     * @param high
     * @param low
     */

    public void setARegENull(Term[] local_aregs, int high, int low) {
        for (int i = low; i < high; i++) {
            local_aregs[i] = null;
        }

    }

    protected Term cont;
    protected int arity_b4_cont;

    /**
     * @param n
     */
    public void checkCont(int n) {
        final Term term = areg[n];
        if (cont != term)
        // TODO Auto-generated method stub
        {
            if (cont != term)
                throw new AbstractMethodError("MiniJProlog.checkCont");
        }

    }

    /**
     * @param local_aregs
     * @param i
     * @return
     */
    public Term getCont(Term[] local_aregs, int i) {
        return local_aregs[i];
    }

    /**
     * @param local_aregs
     * @param low
     * @param high
     */
    public void setARegXFR(Term[] local_aregs, int low, int high) {
        cont = local_aregs[low] = local_aregs[high];

    }

    /**
     * @param term
     */
    public void setCont(Term term) {
        cont = term;

    }

}
