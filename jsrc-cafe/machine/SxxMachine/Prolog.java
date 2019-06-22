package SxxMachine;

import static SxxMachine.pterm.TermData.CONS;
import static SxxMachine.pterm.TermData.S;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.Writer;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import SxxMachine.pterm.HashtableOfTerm;
import SxxMachine.pterm.HornClause;
import SxxMachine.pterm.TermData;

/**
 * Prolog engine.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.2
 */
@SuppressWarnings("unused")
public final class Prolog extends PrologFlags {
    private final PrologLogger logger;
    private final static Logger javaUtilLogger = Logger.getLogger(Prolog.class.getName());
    private static final Functor NONE = TermData.SYM("$none");
    private final ConcurrentMap<String, Object> externalData = new ConcurrentHashMap<>();
    /** Prolog thread */
    public final PrologControl control;
    /** Argument registers */
    //public Term AREGS.a(0).v, AREGS.a(1).v, AREGS.a(2).v, AREGS.a(3).v, AREGS.a(4).v, AREGS.a(5).v, AREGS.a(6).v, AREGS.a(7).v;
    //public Term[] aregs;
    //* @TODO Convert Prolog to -PrologRegs soon
    public TermArray AREGS;
    // public PrologRegs AREGS;

    public int initTimes = 0;

    private static final Term[] NO_REGISTERS = {};
    /** Continuation goal register */
    public Operation cont;
    /** Choice point frame stack */
    public final ChoicePointStack stack;
    /** Trail stack */
    public final Trail trail;
    /** Cut pointer */
    public int B0;
    /** Class loader */
    public PrologClassLoader pcl;
    /** Internal Database */
    public InternalDatabase internalDB;
    /** Current time stamp of choice point frame */
    private long CPFTimeStamp;
    /** Stack for keeping B value of error catchers */
    private int[] catchersB = new int[256];
    private int catchersBindex = -1;
    /**
     * Exception level of continuation passing loop:
     * <li><code>0</code> for no exception,
     * <li><code>1</code> for <code>halt/0</code>,
     * <li><code>1+N</code> for <code>halt(N)</code>.
     * </ul>
     */
    public int halt;

    //    /** Hashtable for creating a copy of term. */
    //    protected Map<Object, Term> copyHash;
    /** The size of the pushback buffer used for creating input streams. */
    public static final int PUSHBACK_SIZE = 256;
    /** Standard input stream. */
    private transient PushbackReader userInput;
    /** Standard output stream. */
    private transient PrintWriter userOutput;
    /** Standard error stream. */
    private transient PrintWriter userError;
    /** Current input stream. */
    private transient PushbackReader currentInput;
    /** Current output stream. */
    private transient PrintWriter currentOutput;
    /** Hashtable for managing input and output streams. */
    HashtableOfTerm streamManager;
    /** Hashtable for managing internal databases. */
    private final HashtableOfTerm hashManager;
    /** Name of the builtin package. */
    public static final String BUILTIN = "SxxMachine";
    /** Holds an atom <code>[]<code> (empty list). */
    public static final Term Nil = TermData.SYM("[]");
    public static final Functor True = TermData.SYM("true");
    /* Some symbols for stream options */
    private static final Functor SYM_MODE_1 = TermData.F("mode", 1);
    private static final Functor SYM_ALIAS_1 = TermData.F("alias", 1);
    private static final Functor SYM_TYPE_1 = TermData.F("type", 1);
    private static final Functor SYM_READ = TermData.SYM("read");
    private static final Functor SYM_APPEND = TermData.SYM("append");
    private static final Functor SYM_INPUT = TermData.SYM("input");
    private static final Functor SYM_OUTPUT = TermData.SYM("output");
    private static final Functor SYM_TEXT = TermData.SYM("text");
    private static final Functor SYM_USERINPUT = TermData.SYM("user_input");
    private static final Functor SYM_USEROUTPUT = TermData.SYM("user_output");
    private static final Functor SYM_USERERROR = TermData.SYM("user_error");
    private static final PrintWriter NO_OUTPUT = new PrintWriter(new Writer() {
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            throw new IOException("Prolog.Feature.IO disabled");
        }

        @Override
        public void flush() throws IOException {
        }

        @Override
        public void close() throws IOException {
        }
    });
    private static final PushbackReader NO_INPUT = new PushbackReader(new Reader() {
        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            return -1;
        }

        @Override
        public void close() throws IOException {
        }
    });

    public static final boolean BE_SAFE = false;
    public static boolean BE_FAST = true;
    public static final boolean CYCLIC_TERMS = true;
    public static Prolog M = null;

    public enum Feature {
        /** Enable the {@code java_*} predicates, supporting reflection in Prolog. */
        JAVA_REFLECTION,
        /** Access to the local filesystem and console. */
        IO,
        /** Track the running time of evaluations */
        STATISTICS_RUNTIME
    }

    protected final EnumSet<Feature> features = EnumSet.allOf(Feature.class);
    public Term pendingGoals;
    public int PENDING_INTERUPTS;
    final public Object INTERUPT_LOCK = new Object();
    public Compound lastPendingGoal;
    public Term assumptions;
    public Operation pred;
    private final Map<Term, Term> termBlackboard = new HashtableOfTerm().termMap;
    public final static Functor anEof = TermData.SYM("end_of_file");
    public final static Functor aNo = TermData.SYM("no");
    public final static Functor aYes = TermData.SYM("yes");
    public final static NameArity aFail = TermData.SYM("fail");//new fail_();

    /** A functor <code>'.' /2</code>. */
    public static final Functor FUNCTOR_LIST_2 = TermData.F(".", 2);
    public static final Functor FUNCTOR_CONJ_2 = TermData.F(",", 2);
    public static final Functor FUNCTOR_NECK_2 = TermData.F(":-", 2);
    public static final Functor GOALS = TermData.SYM("$goals");

    Prolog(PrologControl c) {
        M = this;
        current = this;
        this.assumptions = this.pendingGoals = Nil;
        this.logger = new PrologLogger(javaUtilLogger);
        this.control = c;
        this.trail = new Trail(this);
        this.stack = new ChoicePointStack(this.trail);
        //      copyHash = new Map<Object, Term>();
        this.hashManager = new HashtableOfTerm();
    }

    Prolog(PrologControl c, PrologMachineCopy pmc) {
        this.assumptions = this.pendingGoals = Nil;
        this.logger = new PrologLogger(javaUtilLogger);
        this.control = c;
        this.trail = new Trail(this);
        this.stack = new ChoicePointStack(this.trail);
        //      copyHash = new Map<Object, Term>();
        this.pcl = pmc.pcl;
        // During restore there is no need to copy terms. clause/2 inside of
        // builtins.pl copies the predicate when it reads from internalDB.
        if (pmc.noCopy()) {
            this.hashManager = pmc.hashManager;
            this.internalDB = pmc.internalDB;

        } else {
            this.hashManager = pmc.hashManager.copyShallow();
            this.internalDB = pmc.internalDB.copyInternalDatabase(false, new IdentityHashMap<Object, Term>());
        }
    }

    /**
     * Initializes some local instances only once.
     * This <code>initOnce</code> method is invoked in the constructor
     * and initializes the following instances:
     * <ul>
     *   <li><code>userInput</code>
     *   <li><code>userOutput</code>
     *   <li><code>userError</code>
     *   <li><code>copyHash</code>
     *   <li><code>streamManager</code>
     * </ul>
     */
    private void initOnce(InputStream in, PrintStream out, PrintStream err) {
        //
        //this.AREGS =  new Term[this.maxArity];
        this.setAREGS(TermArray.newTermArray(this.maxArity));

        if (this.pcl == null)
            this.pcl = new PrologClassLoader();
        if (this.internalDB == null)
            this.internalDB = new InternalDatabase();
        this.streamManager = new HashtableOfTerm(7);
        if (this.features.contains(Feature.IO)) {
            this.userInput = new PushbackReader(new BufferedReader(new InputStreamReader(in)), PUSHBACK_SIZE);
            this.userOutput = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)), true);
            this.userError = new PrintWriter(new OutputStreamWriter(err), true);
            this.streamManager.put(SYM_USERINPUT, TermData.FFIObject(this.userInput));
            this.streamManager.put(TermData
                    .FFIObject(this.userInput), this.makeStreamProperty(SYM_READ, SYM_INPUT, SYM_USERINPUT, SYM_TEXT));
            this.streamManager.put(SYM_USEROUTPUT, TermData.FFIObject(this.userOutput));
            this.streamManager.put(TermData
                    .FFIObject(this.userOutput), this.makeStreamProperty(SYM_APPEND, SYM_OUTPUT, SYM_USEROUTPUT, SYM_TEXT));
            this.streamManager.put(SYM_USERERROR, TermData.FFIObject(this.userError));
            this.streamManager.put(TermData
                    .FFIObject(this.userError), this.makeStreamProperty(SYM_APPEND, SYM_OUTPUT, SYM_USERERROR, SYM_TEXT));
        } else {
            this.userInput = NO_INPUT;
            this.userOutput = NO_OUTPUT;
            this.userError = this.userOutput;
        }
    }

    /** Initializes this Prolog engine. */
    public void init(InputStream in, PrintStream out, PrintStream err) {
        this.initTimes++;
        if (this.AREGS == null || this.initTimes == 1)
            this.initOnce(in, out, err);

        this.stack.init();
        this.trail.init();
        this.B0 = this.stack.top();
        this.CPFTimeStamp = Long.MIN_VALUE;
        // Creates an initial choice point frame.
        //ChoicePointFrame initialFrame = new ChoicePointFrame(this, Failure.FAILURE, ++CPFTimeStamp);
        //ChoicePointFrame.S0(null);
        this.trail.timeStamp = ++this.CPFTimeStamp;
        if (this.stack.level == -1)
            this.stack.push(this, Failure.FAILURE, ChoicePointStack::restore0);
        this.logger.init(this.stack.top);
        this.halt = 0;
        this.pendingGoals = Nil;
        this.assumptions = Nil;
        this.PENDING_INTERUPTS = 0;
        //INTERUPT_LOCK = new Object();
        this.lastPendingGoal = null;

        this.setFlags();

        this.exception = NONE;
        this.startRuntime = this.features.contains(Feature.STATISTICS_RUNTIME) ? System.currentTimeMillis() : 0;
        this.previousRuntime = 0;
        this.currentInput = this.userInput;
        this.currentOutput = this.userOutput;
    }

    /** Ensure a feature is enabled, throwing if not. */
    public void requireFeature(Prolog.Feature f, Operation goal, Term arg) {
        if (!this.features.contains(f)) {
            throw new PermissionException(goal, "use", f.toString().toLowerCase(), arg, "disabled");
        }
    }

    public void pushCatcherB(int b) {
        this.catchersBindex++;
        if (this.catchersBindex >= this.catchersB.length) {
            this.ensureCatchersCapability();
        }
        this.catchersB[this.catchersBindex] = b;
    }

    private void ensureCatchersCapability() {
        final int[] newCatchersB = new int[this.catchersB.length << 1];
        System.arraycopy(this.catchersB, 0, newCatchersB, 0, this.catchersB.length);
        this.catchersB = newCatchersB;
    }

    public int popCatcherB() {
        return (this.catchersBindex >= 0) ? this.catchersB[this.catchersBindex--] : -1;
    }

    public int peekCatcherB() {
        return (this.catchersBindex >= 0) ? this.catchersB[this.catchersBindex] : -1;
    }

    /** Sets B0 to the top of the choice point stack.. */
    public void setB0() {
        this.B0 = this.stack.top();
    }

    /** Discards all choice points after the value of <code>i</code>. */
    public void cut(int i) {
        this.stack.cut(i);
    }

    /** Discards all choice points after the value of <code>B0</code>. */
    public void neckCut() {
        this.stack.cut(this.B0);
    }
    
    /**
     * Returns a copy of term <code>t</code>.
     * @param t a term to be copied. It must be dereferenced.
     */
    public Term copy(Term t) {
        if (t.isImmutable()) {
            return t;
        } else {
            final int deeply = Term.COPY_ALL;
            //copyHash.clear();
            //    		copyHash = new Map<Object, Term>();
            return t.copy(new IdentityHashMap<Object, Term>(), deeply);
        }
    }

    /**
     * Do backtrack.
     * This method restores the value of <code>B0</code>
     * and returns the backtrack point in current choice point.
     */
    public Operation fail() {
        final ChoicePointFrame top = this.stack.top;
        this.logger.fail(top.bp, top);
        this.B0 = top.b0; // restore B0
        return top.bp; // execute next clause
    }

    /**
     * Returns the <code>Predicate</code> object refered, respectively,
     * <code>var</code>, <code>Int</code>, <code>flo</code>, <code>con</code>,
     * <code>str</code>, or <code>lis</code>, depending on whether the
     * dereferenced value of argument register <code>areg[1]</code> is a variable,
     * integer, float, atom, compound term, or non-empty list, respectively.
     */
    public Operation switch_on_term(Operation var, Operation Int, Operation flo, Operation con, Operation str,
            Operation lis) {
        final Term a1 = this.AREGS.getTermDRef(0);

        switch (a1.type()) {
            case Term.TYPE_VARIABLE:
                return var;
            case Term.TYPE_INTEGER:
                return Int;
            case Term.TYPE_DOUBLE_OR_CONST:
                return flo;
            case Term.TYPE_SYMBOL:
                return con;
            // case Term.TYPE_LIST:
            // return lis;
        }
        if (a1.isCons()) {
            return lis;
        }
        if (a1.isCompound()) {
            return str;
        }
        return var;

    }

    /**
     * If the dereferenced value of arugment register <code>areg[1]</code>
     * is an integer, float, atom, or compound term (except for non-empty list),
     * this returns the <code>Predicate</code> object to which its key is mapped
     * in hashtable <code>hash</code>.
     *
     * The key is calculated as follows:
     * <ul>
     *   <li>integer - itself
     *   <li>float - itself
     *   <li>atom - itself
     *   <li>compound term - functor/arity
     * </ul>
     *
     * If there is no mapping for the key of <code>areg[1]</code>,
     * this returns <code>otherwise</code>.
     */
    public Operation switch_on_hash(Map<Term, Operation> hash, Operation otherwise) {
        final Term arg1 = this.AREGS.getTermDRef(0);
        Term key;
        if (((arg1.isInteger()) || arg1.isDouble()) || (arg1.isAtomSymbol())) {
            key = arg1;
        } else if ((arg1.isCompound())) {
            key = (arg1).functor();
        } else {
            throw new SystemException("Invalid argument in switch_on_hash");
        }
        final Operation p = hash.get(key);
        if (p != null)
            return p;
        else
            return otherwise;
    }

    // --Commented out by Inspection START (03.04.2017 11:14):
    //	/** Restores the argument registers and continuation goal register from the current choice point frame. */
    //	public final void restore() {
    //		stack.top.restore(this);
    //	}
    // --Commented out by Inspection STOP (03.04.2017 11:14)
    /** Creates a new choice point frame. */
    public Operation jtry0(Operation p, Operation next) {
        this.trail.timeStamp = ++this.CPFTimeStamp;
        return this.finishjtry(p, next, this.stack.push(this, next, ChoicePointStack::restore0));
        //return p;
    }

    public Operation jtry1(Operation p, Operation next) {
        return this.jtry(1, p, next);
    }

    public Operation jtry2(Operation p, Operation next) {
        return this.jtry(2, p, next);
    }

    public Operation jtry3(Operation p, Operation next) {
        return this.jtry(3, p, next);
    }

    public Operation jtry4(Operation p, Operation next) {
        return this.jtry(4, p, next);
    }

    public Operation jtry5(Operation p, Operation next) {
        return this.jtry(5, p, next);
    }

    public Operation jtry6(Operation p, Operation next) {
        return this.jtry(6, p, next);
    }

    public Operation jtry7(Operation p, Operation next) {
        return this.jtry(7, p, next);
    }

    public Operation jtry8(Operation p, Operation next) {
        return this.jtry(8, p, next);
    }

    public Operation jtry(int arity, Operation p, Operation next) {
        this.trail.timeStamp = ++this.CPFTimeStamp;
        return this.finishjtry(p, next, this.stack.push(this, arity, next));
        //return p;
    }

    private Operation finishjtry(Operation p, Operation next, ChoicePointFrame entry) {
        /*
              entry.bp = next;
              entry.tr = trail.top();
              entry.timeStamp = ++CPFTimeStamp;
              stack.push(entry);
        */
        this.logger.jtry(p, next, entry);
        return p;
    }

    /**
     * Resets all necessary information from the current choice point frame,
     * updates its next clause field to <code>next</code>,
     * and then returns <code>p</code>.
     */
    public Operation retry(Operation p, Operation next) {
        final ChoicePointFrame top = this.stack.top;
        top.restore.accept(top, this);
        this.logger.retry(p, next, top);
        this.trail.unwind(top.tr);
        top.bp = next;
        return p;
    }

    /**
     * Resets all necessary information from the current choice point frame,
     * discard it, and then returns <code>p</code>.
     */
    public Operation trust(Operation p) {
        final ChoicePointFrame top = this.stack.top;
        top.restore.accept(top, this);
        this.logger.trust(p, top);
        this.trail.unwind(top.tr);
        this.stack.delete();
        return p;
    }

    private Term makeStreamProperty(Functor _mode, Functor io, Functor _alias, Functor _type) {
        final Term[] mode = { _mode };
        final Term[] alias = { _alias };
        final Term[] type = { _type };
        Term t = Nil;
        t = CONS(S(SYM_MODE_1, mode), t);
        t = CONS(io, t);
        t = CONS(S(SYM_ALIAS_1, alias), t);
        t = CONS(TermData.S(SYM_TYPE_1, type), t);
        return t;
    }

    /** Returns the current time stamp of choice point frame. */
    public final long getCPFTimeStamp() {
        return this.CPFTimeStamp;
    }

    /** Holds an exception term for <code>catch/3</code> and <code>throw/1</code>. */
    private Term exception;
    /** Holds the start time as <code>long</code> for <code>statistics/2</code>. */
    private long startRuntime;
    /** Holds the previous time as <code>long</code> for <code>statistics/2</code>. */
    private long previousRuntime;
	private Prog theProg = new Prog(HornClause.clauseFromString("true"), null);

    /** Returns the value of <code>exception</code>. This is used in <code>catch/3</code>. */
    public Term getException() {
        return this.exception;
    }

    /** Sets the value of <code>exception</code>. This is used in <code>throw/1</code>. */
    public void setException(Term t) {
        this.exception = t;
    }

    /** Returns the value of <code>startRuntime</code>. This is used in <code>statistics/2</code>. */
    public long getStartRuntime() {
        return this.startRuntime;
    }

    /** Returns the value of <code>previousRuntime</code>. This is used in <code>statistics/2</code>. */
    public long getPreviousRuntime() {
        return this.previousRuntime;
    }

    /** Sets the value of <code>previousRuntime</code>. This is used in <code>statistics/2</code>. */
    public void setPreviousRuntime(long t) {
        this.previousRuntime = t;
    }

    /** Returns the standard input stream. */
    public PushbackReader getUserInput() {
        return this.userInput;
    }

    /** Returns the standard output stream. */
    public PrintWriter getUserOutput() {
        return this.userOutput;
    }

    /** Returns the standard error stream. */
    public PrintWriter getUserError() {
        return this.userError;
    }

    /** Returns the current input stream. */
    public PushbackReader getCurrentInput() {
        return this.currentInput;
    }

    /** Sets the current input stream to <code>in</code>. */
    public void setCurrentInput(PushbackReader in) {
        this.currentInput = in;
    }

    /** Returns the current output stream. */
    public PrintWriter getCurrentOutput() {
        return this.currentOutput;
    }

    /** Sets the current output stream to <code>out</code>. */
    public void setCurrentOutput(PrintWriter out) {
        this.currentOutput = out;
    }

    /** Returns the stream manager. */
    public HashtableOfTerm getStreamManager() {
        return this.streamManager;
    }

    /** Returns the hash manager. */
    public HashtableOfTerm getHashManager() {
        return this.hashManager;
    }

    //	public final Operation exec(Operation code){
    //		try {
    //			logger.beforeExec(code);
    //			return code.exec(this);
    //		} catch (RuntimeException t){
    //			throw logger.execThrows(t);
    //		}
    //	}
    public Object getExternalData(String key) {
        return this.externalData.get(key);
    }

    public void setExternalData(String key, Object value) {
        this.externalData.put(key, value);
    }

    public PrologLogger getLogger() {
        return this.logger;
    }

    public void push(Undoable undoable) {
        this.trail.push(undoable);
    }

    public Term popPendingGoals() {
        if (this.halt != 0)
            return Nil;
        synchronized (this.INTERUPT_LOCK) {
            if (this.PENDING_INTERUPTS == 0)
                return Nil;
            this.PENDING_INTERUPTS = 0;
            final Term retPendingGoals = this.pendingGoals;
            this.lastPendingGoal = null;
            this.pendingGoals = Nil;
            return retPendingGoals;
        }
    }

    public Term peekPendingGoals() {
        synchronized (this.INTERUPT_LOCK) {
            if (this.PENDING_INTERUPTS == 0)
                return Nil;
            return this.pendingGoals;
        }
    }

    public void pushPendingGoal(Term goal) {
        synchronized (this.INTERUPT_LOCK) {
            this.PENDING_INTERUPTS++;
            if (this.pendingGoals == null || this.pendingGoals == Prolog.Nil || this.pendingGoals == Prolog.True) {
                this.pendingGoals = goal;
                this.lastPendingGoal = null;
            } else {
                // lastPendingGoal = lastPendingGoal;
                this.pendingGoals = CONS(goal, this.pendingGoals);
            }
        }
    }

    public void addPendingGoal(Term goal) {
        synchronized (this.INTERUPT_LOCK) {
            this.PENDING_INTERUPTS++;
            if (this.lastPendingGoal != null) {
                this.lastPendingGoal = this.lastPendingGoal.appendCons(goal);
                return;
            }
            if (this.pendingGoals == null || this.pendingGoals == Prolog.Nil || this.pendingGoals == Prolog.True) {
                this.pendingGoals = goal;
            } else {
                if (this.pendingGoals.isCons()) {
                    this.lastPendingGoal = this.pendingGoals.appendCons(goal);
                } else {
                    this.lastPendingGoal = CONS(this.pendingGoals, goal);
                    this.pendingGoals = this.lastPendingGoal;
                }
            }
        }
    }

    void getStackTrace(StringBuilder sb) {

    }

    @Override
    public String toString() {
        if (this.logger == null) {
            return super.toString();
        }
        final Operation code = this.cont;
        if (code == null) {
            return super.toString();
        }
        final StringBuilder stringBuilder = new StringBuilder();
        this.logger.printStack(code, stringBuilder);
        return stringBuilder.toString();
    }

    public static void Break(String string) {
        final byte[] array = new byte[16];
        try {
            new Exception(string).printStackTrace();
            System.in.read(array);
        } catch (final Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
	 * @param string
	 * @return
	 */
	final static AtomicLong debugVarNum = new AtomicLong(0);
	private Term mVar(String why) {
    	if(!BE_SAFE) return TermData.V(this);
		return TermData.V(this, why + "_" + Long.toOctalString(debugVarNum.incrementAndGet()));
	}

    public Term mkvar1() {
        return mVar("M1V");
    }

    public Term mkvar2() {
        return mVar("M2V");
    }

    public Term mkvar3() {
        return mVar("M3V");
    }

    public Term DONTCARE(String _string) {
        return mVar(String.valueOf(_string).toUpperCase().replaceAll("[^A-Z]", "_"));
    }

	public Term DONT_CARE1() {
		return mVar("D1C");
    }
    public Term DONT_CARE2() {
		return mVar("D2C");
    }

    public Map<Term, Term> getTermBlackboard() {
        return this.termBlackboard;
    }

    /**
     * @return the cont
     */
    public Operation getCont() {
        return this.cont;
    }

    /**
     * @param cont the cont to set
     */
    public void setCont(Operation cont) {
        this.cont = cont;
    }

    /**
     * @param i
     * @return
     */
    public Term getPlainArg(int i) {
        return this.AREGS.getPlainArg(i);
    }

    /**
     * @param i
     * @return
     */
    public Term getTermDRef(int i) {
        return this.AREGS.getTermDRef(i);
    }

    /**
     * @param i
     * @param atomExp
     */
    public Term setAV(int i, Term v) {
        return this.AREGS.setAV(i, v);
    }

    /**
     * @param aREGS the aREGS to set
     */
    public void setAREGS(TermArray aREGS) {
        this.AREGS = aREGS;
    }

	/**
	 * @return
	 */
	public ISTerm getISTerm(int arity) {
		return null;
	}

	/**
	 * @return
	 */
	public Prog asProg() {
		return theProg ;
	}

}
