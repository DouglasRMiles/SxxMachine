package SxxMachine;

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
            StringBuilder b = new StringBuilder();
            b.append(codeToRun).append("(");
            Term[] areg = getAreg();
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

    private void installGoal(Term goal, RunStackItem runStack) {
        Term[] areg = runStack.getAreg();
        areg[0] = goal;
        areg[1] = JpFactory.S(Const.strIntern("halt"), JpFactory.Long(0));
    }

    //public boolean doTrace = false;

    private synchronized ErrorStatus doSolveGoalOnce(Term goal) throws JPrologScriptException {
        Code code = Call2;
        RunStackItem runStack = getCurrentStackItem();
        runStack.setExceptionState(ErrorStatus.NONE);
        //final StatCreator st = new StatCreator();
        //st.setPrologMachine(this); st.setEnabled(true);
        installGoal(goal, runStack);
        ErrorStatus status;
        while ((status = runStack.getExceptionState()).continueRunning()) {
            //if (doTrace) 
            //      trace(code);
            //st.startPred(code);
            Code nCode = run(code);
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
                    Term[] arguments = new Term[code.arity() + 1];
                    Term[] areg = getAreg();
                    for (int i = 0; i < arguments.length; i++) {
                        arguments[i] = areg[i];
                        log.debug(areg[i]);
                    }
                    Term continuation = JpFactory.S(Const.strIntern("code_call"), new CodeObject(code), JpFactory
                            .S("arguments", arguments));
                    log.debug("*** continuation: " + continuation);
                    areg[0] = JpFactory.S(Const.strIntern("call_list"), getPendinggoals(), continuation);
                    setExceptionState(ErrorStatus.NONE);
                    setPendinggoals(Const.NIL);
                    code = Call1;
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
        Code code = Call1;
        Term AnswerList = JpFactory.JVAR(this);
        setExceptionState(ErrorStatus.NONE);

        getAreg()[0] = JpFactory.S(Const.strIntern("findall"), Goal, Goal, AnswerList, JpFactory
                .S(Const.strIntern("halt"), JpFactory.Long(0)));

        while (getExceptionState().continueRunning()) {
            log.debug(code);
            code = run(code);
        }
        return AnswerList; // exceptions are ignored here !!!!
    }

    private Code run(Code r) throws JPrologScriptException {
        try {
            return r.exec(this);
        } catch (JPrologInternalException ex) {
            try {
                return processException(ex);
            } catch (PrologThrownException ex2) {
                throw ex2;
            } catch (JPrologInternalException ex2) {
                //Kan niet intern recoveren van fout!
                //fout doorwerpen naar buiten
                throw new JPrologScriptException(ex2);
            }
        }
    }

    @Override
    public void initAlways() {
        log.info("Start initialization");
        for (Term iter : initializers) {
            getAreg()[0] = iter;
            Code code = Call1;
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
            status = solveGoalOnce(JpFactory.S("solveDefaultQuery"));
        } finally {
            removeQuery();
        }
        return ErrorStatus.NORMALEXIT.equals(status);
    }

    @Override
    public ModuleRunStackInfo getModuleInfo(JpModule module) {
        return getCurrentStackItem().getModuleInfo(module.getClassToRegister());
    }

}
