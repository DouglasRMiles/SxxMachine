package SxxMachine;

import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.SYM;

import java.io.File;

/**
  *  @author  toms
  */
public class PrologMachine extends RunningPrologMachine {

    private final static Logger log = Logger.getLogger(PrologMachine.class);

    private final java.util.List<Term> initializers;

    public PrologMachine() {
        this(createDefaultStreamProvider());
    }

    public PrologMachine(StreamProvider defaultStreams) {
        super();
        initializers = new java.util.LinkedList<Term>();
    }

    protected void trace(Code codeToRun) {
        if (log.isDebugEnabled() || true) {
            final StringBuilder b = new StringBuilder();
            b.append(codeToRun).append("(");
            final Term[] areg = getAreg();
            for (int i = 0; i < codeToRun.arity(); i++) {
                if (areg[i] != null) {
                    b.append(areg[i].dref());
                } else {
                    b.append((Object) null);
                }
                b.append(",");
            }
            b.append(")");
            //log.debug(b.toString());
            System.out.println(b.toString());
        }
    }

    public ErrorStatus solveGoalOnce(Term goal) throws JPrologScriptException {
        return solveGoalOnce(goal, null);
    }

    public synchronized ErrorStatus solveGoalOnce(Term goal, JPrologRunStackIniter initer)
            throws JPrologScriptException {
        startNewStackItem(initer);
        try {
            return doSolveGoalOnce(goal);
        } finally {
            removeStackItem();
        }
    }

    private void installGoal(Term goal, MiniJProlog runStack) {
        final Term[] areg = runStack.getAreg();
        areg[0] = goal;
        areg[1] = S(("halt"), Integer(0));
    }

    //public boolean doTrace = false;

    private synchronized ErrorStatus doSolveGoalOnce(Term goal) throws JPrologScriptException {
        Code code = getCall2();
        final MiniJProlog runStack = getCurrentStackItem();
        runStack.setExceptionState(ErrorStatus.NONE);
        //final StatCreator st = new StatCreator();
        //st.setPrologMachine(this); st.setEnabled(true);
        installGoal(goal, runStack);
        ErrorStatus status;
        while ((status = runStack.getExceptionState()).continueRunning()) {
            //if (doTrace)
            //      trace(code);
            //st.startPred(code);
            final Code nCode = run(code);
            if (Thread.currentThread().isInterrupted()) {
                log.fatal("PrologMachine stopped na uitvoeren " + code + " en volgende " + nCode);
                return ErrorStatus.ABORTTHREAD; //Thread zou moeten aborten
            }
            //st.stopPred(code);
            if (nCode == null) {
                if (code instanceof pred_halt_0) {
                    return ErrorStatus.NORMALEXIT;
                } else {
                    log.error("Kan niet verder, " + code.getClass().getName()
                            + " geeft null terug ipv volgende opdracht");
                    return ErrorStatus.FATALERROR;
                }
            } else {
                code = nCode;
                if (status == ErrorStatus.CHANGEDPENDINGGOALS) {
                    log.debug(code);
                    final Term[] arguments = new Term[code.arity() + 1];
                    final Term[] areg = getAreg();
                    for (int i = 0; i < arguments.length; i++) {
                        arguments[i] = areg[i];
                        log.debug(areg[i]);
                    }
                    final Term continuation = S(("code_call"), new CodeObject(code), S("arguments", arguments));
                    log.debug("*** continuation: " + continuation);
                    setCont(areg, 0, S(("call_list"), getPendinggoals(), continuation));
                    setExceptionState(ErrorStatus.NONE);
                    setPendinggoals(Prolog.Nil);
                    code = getCall1();
                }
            }

        }
        //st.printSortedOnTime(1000L);
        return status;
    }

    public synchronized Term solveGoal(Term goal) throws JPrologScriptException {
        return solveGoal(goal, null);
    }

    public synchronized Term solveGoal(Term goal, JPrologRunStackIniter initer) throws JPrologScriptException {
        startNewStackItem(initer);
        try {
            return doSolveGoal(goal);
        } finally {
            removeStackItem();
        }
    }

    private synchronized Term doSolveGoal(Term Goal) throws JPrologScriptException {
        final Term AnswerList = Jv(this);
        setExceptionState(ErrorStatus.NONE);

        setCont(getAreg(), 0, S(("findall"), Goal, Goal, AnswerList, S(("halt"), Integer(0))));

        Code code = getCall1();
        while (getExceptionState().continueRunning()) {
            log.debug(code);
            code = run(code);
        }
        return AnswerList; // exceptions are ignored here !!!!
    }

    private Code run(Code r) throws JPrologScriptException {
        try {
            return r.exec(this);
        } catch (final JPrologInternalException ex) {
            try {
                return processException(ex);
            } catch (final PrologThrownException ex2) {
                throw ex2;
            } catch (final JPrologInternalException ex2) {
                //Kan niet intern recoveren van fout!
                //fout doorwerpen naar buiten
                throw new JPrologScriptException(ex2);
            }
        }
    }

    @Override
    public void initAlways() {
        log.info("Start initialization");
        for (final Term iter : initializers) {
            setCont(getAreg(), 0, iter);
            Code code = getCall1();
            while (getExceptionState().continueRunning() && code != null) {
                code = code.exec(this);
            }
            if (getExceptionState() != ErrorStatus.NORMALEXIT)
                throw new RuntimeException("PrologMachine: initialization error!");
        }
        log.info("End initialization");
    }

    /**
     * Register a new initializer. Initializers are called before each query.
     *
     *  @param  initializer   Callable Prolog term
     */
    public void registerInitializer(Term initializer) {
        log.info("Registering initializer: " + initializer);
        initializers.add(initializer);
    }

    public boolean runQuery(File targetFolder) throws JPrologScriptException {
        if (!targetFolder.isDirectory())
            throw new IllegalArgumentException();
        loadQuery(targetFolder);
        ErrorStatus status = null;
        try {
            status = solveGoalOnce(SYM("solveDefaultQuery"));
        } finally {
            removeQuery();
        }
        return ErrorStatus.NORMALEXIT.equals(status);
    }

    @Override
    public ModuleRunStackInfo getModuleInfo(JpModule module) {
        return getCurrentStackItem().getModuleInfo(module.getClassToRegister());
    }

    /**
     * @param areg
     * @param arity
     * @param cont
     */
    public void setCont(Term[] areg, int arity, Term cont) {
        getCurrentStackItem().setCont(areg, arity, cont);
    }

    /**
     * @param local_aregs
     * @param i
     */
    public void setARegENull(Term[] local_aregs, int arity) {
        getCurrentStackItem().setARegENull(local_aregs, arity);

    }

    /**
     * @param local_aregs
     * @param i
     */
    public void setARegENull(Term[] local_aregs, int high, int low) {
        getCurrentStackItem().setARegENull(local_aregs, high, low);

    }

    /**
     * @param local_aregs
     * @param i
     */
    public void setARegXFR(Term[] local_aregs, int low, int high) {
        getCurrentStackItem().setARegXFR(local_aregs, low, high);

    }

    /**
     * @param local_aregs
     * @param i
     * @return
     */
    public Term getCont(Term[] local_aregs, int arity) {
        return getCurrentStackItem().getCont(local_aregs, arity);

    }

    /**
     * @param term
     */
    public void setCont(Term term) {
       getCurrentStackItem().setCont(term);
        
    }
}
