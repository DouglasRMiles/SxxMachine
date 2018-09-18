package SxxMachine;

import SxxMachine.*;

import static SxxMachine.TermData.CONS;

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
import java.util.logging.Logger;

import SxxMachine.Const;
/**
 * Prolog engine.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.2
 */
@SuppressWarnings("unused")
public final class Prolog {
	private final PrologLogger logger;
	private final static Logger javaUtilLogger = Logger.getLogger(Prolog.class.getName());
	private static final SymbolTerm NONE = SymbolTerm.intern("$none");
	private final ConcurrentMap<String, Object> externalData = new ConcurrentHashMap<>();
	/** Prolog thread */
	public final PrologControl control;
	/** Argument registers */
	//public Term AREGS[0], AREGS[1], AREGS[2], AREGS[3], AREGS[4], AREGS[5], AREGS[6], AREGS[7];
	//public Term[] aregs;
	public Term[] AREGS;

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
	/** <font color="red">Not supported yet</font>. Prolog implementation flag: <code>bounded</code>. */
	private final boolean bounded = false;
	/** Prolog implementation flag: <code>max_integer</code>. */
	private static final int maxInteger = Integer.MAX_VALUE;
	/** Prolog implementation flag: <code>min_integer</code>. */
	private static final int minInteger = Integer.MIN_VALUE;
	/** Prolog implementation flag: <code>integer_rounding_function</code>. */
	private final String integerRoundingFunction = "down";
	/** <font color="red">Not supported yet</font>. Prolog implementation flag: <code>char_conversion</code>. */
	private String charConversion;
	/** Prolog implementation flag: <code>debug</code>. */
	private String debug;
	/** Prolog implementation flag: <code>max_arity</code>. */
	int maxArity = 255;
	/** Prolog implementation flag: <code>unknown</code>. */
	private String unknown;
	/** <font color="red">Not supported yet</font>. Prolog implementation flag: <code>double_quotes</code>. */
	private String doubleQuotes;
	/** Prolog implementation flag: <code>print_stack_trace</code>. */
	private String printStackTrace;
	/** Holds an exception term for <code>catch/3</code> and <code>throw/1</code>. */
	private Term exception;
	/** Holds the start time as <code>long</code> for <code>statistics/2</code>. */
	private long startRuntime;
	/** Holds the previous time as <code>long</code> for <code>statistics/2</code>. */
	private long previousRuntime;
//    /** Hashtable for creating a copy of term. */
//    protected IdentityHashMap<Object, Term> copyHash;
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
	public static final SymbolTerm Nil     = SymbolTerm.intern("[]");
	public static final SymbolTerm True     = SymbolTerm.intern("true");
	/* Some symbols for stream options */
	private static final SymbolTerm SYM_MODE_1     = SymbolTerm.intern("mode", 1);
	private static final SymbolTerm SYM_ALIAS_1    = SymbolTerm.intern("alias", 1);
	private static final SymbolTerm SYM_TYPE_1     = SymbolTerm.intern("type", 1);
	private static final SymbolTerm SYM_READ       = SymbolTerm.intern("read");
	private static final SymbolTerm SYM_APPEND     = SymbolTerm.intern("append");
	private static final SymbolTerm SYM_INPUT      = SymbolTerm.intern("input");
	private static final SymbolTerm SYM_OUTPUT     = SymbolTerm.intern("output");
	private static final SymbolTerm SYM_TEXT       = SymbolTerm.intern("text");
	private static final SymbolTerm SYM_USERINPUT  = SymbolTerm.intern("user_input");
	private static final SymbolTerm SYM_USEROUTPUT = SymbolTerm.intern("user_output");
	private static final SymbolTerm SYM_USERERROR  = SymbolTerm.intern("user_error");
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
	public Object INTERUPT_LOCK;
	public ListTerm lastPendingGoal;
	public Term assumptions;
  public Operation pred;
  public final static Const anEof = TermData.F("end_of_file");
  public final static Const aNo = TermData.F("no");
  public final static Const aYes = TermData.F("yes");
  public final static NameArity aFail = TermData.F("fail");//new fail_();

  /** A functor <code>'.' /2</code>. */
  public static final SymbolTerm SYM_DOT = SymbolTerm.intern(".", 2);
  public static final SymbolTerm SYM_CONJ = SymbolTerm.intern(",", 2);
  public static final SymbolTerm SYM_NECK = SymbolTerm.intern(":-", 2);

    
	Prolog(PrologControl c) {
		M = this;
		this.assumptions = this.pendingGoals = Nil;
		this.logger = new PrologLogger(javaUtilLogger);
		this.control = c;
		this.trail = new Trail(this);
		this.stack = new ChoicePointStack(this.trail);
//      copyHash = new IdentityHashMap<Object, Term>();
		this.hashManager = new HashtableOfTerm();
	}
	Prolog(PrologControl c, PrologMachineCopy pmc) {
		this.assumptions = this.pendingGoals = Nil;
		this.logger = new PrologLogger(javaUtilLogger);
		this.control = c;
		this.trail = new Trail(this);
		this.stack = new ChoicePointStack(this.trail);
//      copyHash = new IdentityHashMap<Object, Term>();
		this.pcl = pmc.pcl;
		// During restore there is no need to copy terms. clause/2 inside of
		// builtins.pl copies the predicate when it reads from internalDB.
		if(pmc.noCopy()) {
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


	    this.AREGS = new Term[this.maxArity];
	    
		if (this.pcl == null) this.pcl = new PrologClassLoader();
		if (this.internalDB == null) this.internalDB = new InternalDatabase();
		this.streamManager = new HashtableOfTerm(7);
		if (this.features.contains(Feature.IO)) {
			this.userInput = new PushbackReader(new BufferedReader(new InputStreamReader(in)), PUSHBACK_SIZE);
			this.userOutput = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)), true);
			this.userError = new PrintWriter(new OutputStreamWriter(err), true);
			this.streamManager.put(SYM_USERINPUT, TermData.FFIObject(this.userInput));
			this.streamManager.put(TermData.FFIObject(this.userInput),
					makeStreamProperty(SYM_READ, SYM_INPUT, SYM_USERINPUT, SYM_TEXT));
			this.streamManager.put(SYM_USEROUTPUT, TermData.FFIObject(this.userOutput));
			this.streamManager.put(TermData.FFIObject(this.userOutput),
					makeStreamProperty(SYM_APPEND, SYM_OUTPUT, SYM_USEROUTPUT, SYM_TEXT));
			this.streamManager.put(SYM_USERERROR, TermData.FFIObject(this.userError));
			this.streamManager.put(TermData.FFIObject(this.userError),
					makeStreamProperty(SYM_APPEND, SYM_OUTPUT, SYM_USERERROR, SYM_TEXT));
		} else {
			this.userInput = NO_INPUT;
			this.userOutput = NO_OUTPUT;
			this.userError = this.userOutput;
		}
	}
	/** Initializes this Prolog engine. */
	public void init(InputStream in, PrintStream out, PrintStream err) {
		if (this.AREGS == null)
			initOnce(in,out,err);
		this.stack.init();
		this.trail.init();
		this.B0 = this.stack.top();
		this.CPFTimeStamp = Long.MIN_VALUE;
		// Creates an initial choice point frame.
		//ChoicePointFrame initialFrame = new ChoicePointFrame(this, Failure.FAILURE, ++CPFTimeStamp);  
        //ChoicePointFrame.S0(null);
		this.trail.timeStamp = ++this.CPFTimeStamp;
		this.stack.push(this, Failure.FAILURE, ChoicePointStack::restore0);
		this.logger.init(this.stack.top);
		this.halt = 0;
		pendingGoals = Nil;
		assumptions = Nil;
		PENDING_INTERUPTS = 0;	
		INTERUPT_LOCK = new Object();
		lastPendingGoal = null;
		this.charConversion  = "off";
		this.debug           = "off";
		this.unknown         = "error";
		this.doubleQuotes    = "codes";
		this.printStackTrace = "off";
		this.exception = NONE;
		this.startRuntime = this.features.contains(Feature.STATISTICS_RUNTIME)
				? System.currentTimeMillis()
				: 0;
		this.previousRuntime = 0;
		this.currentInput  = this.userInput;
		this.currentOutput = this.userOutput;
	}
	/** Ensure a feature is enabled, throwing if not. */
	public void requireFeature(Prolog.Feature f, Operation goal, Term arg) {
		if (!this.features.contains(f)) {
			throw new PermissionException(goal, "use", f.toString().toLowerCase(), arg, "disabled");
		}
	}
	public void pushCatcherB(int b){
		this.catchersBindex++;
		if (this.catchersBindex>=this.catchersB.length){
			ensureCatchersCapability();
		}
		this.catchersB[this.catchersBindex] = b;
	}
	private void ensureCatchersCapability() {
		int[] newCatchersB = new int[this.catchersB.length<<1];
		System.arraycopy(this.catchersB, 0, newCatchersB, 0, this.catchersB.length);
		this.catchersB = newCatchersB;
	}
	public int popCatcherB(){
		return (this.catchersBindex>=0) ? this.catchersB[this.catchersBindex--] : -1;
	}
	public int peekCatcherB() {
		return (this.catchersBindex>=0) ? this.catchersB[this.catchersBindex] : -1;
	}
	/** Sets B0 to the top of the choice point stack.. */
	public void setB0()    { this.B0 = this.stack.top(); }
	/** Discards all choice points after the value of <code>i</code>. */
	public void cut(int i) { this.stack.cut(i); }
	/** Discards all choice points after the value of <code>B0</code>. */
	public void neckCut()  { this.stack.cut(this.B0); }
	/**
	 * Returns a copy of term <code>t</code>.
	 * @param t a term to be copied. It must be dereferenced.
	 */
	public Term copy(Term t) {
		if (t.isImmutable()){
			return t;
		} else {
		  int deeply = Term.COPY_ALL;
			//copyHash.clear();
//    		copyHash = new IdentityHashMap<Object, Term>();
			return t.copy(new IdentityHashMap<Object, Term>(), deeply);
		}
	}
	/**
	 * Do backtrack.
	 * This method restores the value of <code>B0</code>
	 * and returns the backtrack point in current choice point.
	 */
	public Operation fail() {
		ChoicePointFrame top = this.stack.top;
    	this.logger.fail(top.bp, top);
		this.B0 = top.b0;     // restore B0
		return top.bp;   // execute next clause
	}

  /**
   * Returns the <code>Predicate</code> object refered, respectively,
   * <code>var</code>, <code>Int</code>, <code>flo</code>, <code>con</code>,
   * <code>str</code>, or <code>lis</code>, depending on whether the
   * dereferenced value of argument register <code>areg[1]</code> is a variable,
   * integer, float, atom, compound term, or non-empty list, respectively.
   */
  public Operation switch_on_term(Operation var, Operation Int, Operation flo,
      Operation con, Operation str, Operation lis) {
    Term a1 = this.AREGS[0].dref();

    switch (a1.type()) {
      case Term.TYPE_VARIABLE:
        return var;
      case Term.TYPE_INTEGER:
        return Int;
      case Term.TYPE_DOUBLE:
        return flo;
      case Term.TYPE_SYMBOL:
        return con;
     // case Term.TYPE_LIST:
       // return lis;
    }
    if (a1.isCons()) {
      return lis;
    }
    if (a1.isStructure()) {
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
	public Operation switch_on_hash(Map<Term,Operation> hash, Operation otherwise) {
		Term arg1 = this.AREGS[0].dref();
		Term key;
		if (((arg1 .isInteger()) || arg1 .isDouble()) || (arg1 .isSymbol())) {
			key = arg1;
		} else if ((arg1 .isStructure())) {
			key = ( arg1).functor();
		} else {
			throw new SystemException("Invalid argument in switch_on_hash");
		}
		Operation p = hash.get(key);
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
		return finishjtry(p, next, this.stack.push(this, next, ChoicePointStack::restore0));
		//return p;
	}

	  public Operation jtry1(Operation p, Operation next) { return jtry(1, p, next); }
	  public Operation jtry2(Operation p, Operation next) { return jtry(2, p, next); }
	  public Operation jtry3(Operation p, Operation next) { return jtry(3, p, next); }
	  public Operation jtry4(Operation p, Operation next) { return jtry(4, p, next); }
	  public Operation jtry5(Operation p, Operation next) { return jtry(5, p, next); }
	  public Operation jtry6(Operation p, Operation next) { return jtry(6, p, next); }
	  public Operation jtry7(Operation p, Operation next) { return jtry(7, p, next); }
	  public Operation jtry8(Operation p, Operation next) { return jtry(8, p, next); }
      public Operation jtry(int arity, Operation p, Operation next) {
		this.trail.timeStamp = ++this.CPFTimeStamp;
		return finishjtry(p, next, this.stack.push(this, arity, next));
		//return p;
	  }
    private Operation finishjtry(Operation p, Operation next, ChoicePointFrame entry) {
/*
      entry.bp = next;
      entry.tr = trail.top();
      entry.timeStamp = ++CPFTimeStamp;
      stack.push(entry);
*/
      logger.jtry(p,next,entry);
      return p;
    }
	/**
	 * Resets all necessary information from the current choice point frame,
	 * updates its next clause field to <code>next</code>,
	 * and then returns <code>p</code>.
	 */
	public Operation retry(Operation p, Operation next) {
		ChoicePointFrame top = this.stack.top;
		top.restore.accept(top,this);
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
		top.restore.accept(top,this);
		this.logger.trust(p, top);
		this.trail.unwind(top.tr);
		this.stack.delete();
		return p;
	}
	private Term makeStreamProperty(SymbolTerm _mode, SymbolTerm io, SymbolTerm _alias, SymbolTerm _type) {
		Term[] mode  = {_mode};
		Term[] alias = {_alias};
		Term[] type  = {_type};
		Term t = Nil;
		t = CONS(new StructureTerm(SYM_MODE_1,  mode ), t);
		t = CONS(io, t);
		t = CONS(new StructureTerm(SYM_ALIAS_1, alias), t);
		t = CONS(new StructureTerm(SYM_TYPE_1,  type ), t);
		return t;
	}
	/** Returns the current time stamp of choice point frame. */
	public final long getCPFTimeStamp() { return this.CPFTimeStamp; }
	/** Returns the value of Prolog implementation flag: <code>bounded</code>. */
	public boolean isBounded() { return this.bounded; }
	/** Returns the value of Prolog implementation flag: <code>max_integer</code>. */
	public int getMaxInteger() { return maxInteger; }
	/** Returns the value of Prolog implementation flag: <code>min_integer</code>. */
	public int getMinInteger() { return minInteger; }
	/** Returns the value of Prolog implementation flag: <code>integer_rounding_function</code>. */
	public String getIntegerRoundingFunction() { return this.integerRoundingFunction; }
	/** Returns the value of Prolog implementation flag: <code>char_conversion</code>. */
	public String getCharConversion() { return this.charConversion; }
	/** Sets the value of Prolog implementation flag: <code>char_conversion</code>. */
	public void setCharConversion(String mode) { this.charConversion = mode;}
	/** Returns the value of Prolog implementation flag: <code>debug</code>. */
	public String getDebug() { return this.debug; }
	/** Sets the value of Prolog implementation flag: <code>debug</code>. */
	public void setDebug(String mode) { this.debug = mode;}
	/** Returns the value of Prolog implementation flag: <code>max_arity</code>. */
	public int getMaxArity() { return this.maxArity; }
	/** Returns the value of Prolog implementation flag: <code>unknown</code>. */
	public String getUnknown() { return this.unknown; }
	/** Sets the value of Prolog implementation flag: <code>unknown</code>. */
	public void setUnknown(String mode) { this.unknown = mode;}
	/** Returns the value of Prolog implementation flag: <code>double_quotes</code>. */
	public String getDoubleQuotes() { return this.doubleQuotes; }
	/** Sets the value of Prolog implementation flag: <code>double_quotes</code>. */
	public void setDoubleQuotes(String mode) { this.doubleQuotes = mode;}
	/** Returns the value of Prolog implementation flag: <code>print_stack_trace</code>. */
	public String getPrintStackTrace() { return "on"; /*return printStackTrace;*/ }
	/** Sets the value of Prolog implementation flag: <code>print_stack_trace</code>. */
	public void setPrintStackTrace(String mode) { this.printStackTrace = mode;}
	/** Returns the value of <code>exception</code>. This is used in <code>catch/3</code>. */
	public Term getException() { return this.exception; }
	/** Sets the value of <code>exception</code>. This is used in <code>throw/1</code>. */
	public void setException(Term t) { this.exception = t;}
	/** Returns the value of <code>startRuntime</code>. This is used in <code>statistics/2</code>. */
	public long getStartRuntime() { return this.startRuntime; }
	/** Returns the value of <code>previousRuntime</code>. This is used in <code>statistics/2</code>. */
	public long getPreviousRuntime() { return this.previousRuntime; }
	/** Sets the value of <code>previousRuntime</code>. This is used in <code>statistics/2</code>. */
	public void setPreviousRuntime(long t) { this.previousRuntime = t; }
	/** Returns the standard input stream. */
	public PushbackReader  getUserInput() { return this.userInput; }
	/** Returns the standard output stream. */
	public PrintWriter     getUserOutput() { return this.userOutput; }
	/** Returns the standard error stream. */
	public PrintWriter     getUserError() { return this.userError; }
	/** Returns the current input stream. */
	public PushbackReader  getCurrentInput() { return this.currentInput; }
	/** Sets the current input stream to <code>in</code>. */
	public void            setCurrentInput(PushbackReader in) { this.currentInput = in; }
	/** Returns the current output stream. */
	public PrintWriter     getCurrentOutput() { return this.currentOutput; }
	/** Sets the current output stream to <code>out</code>. */
	public void            setCurrentOutput(PrintWriter out) { this.currentOutput = out; }
	/** Returns the stream manager. */
	public HashtableOfTerm getStreamManager() { return this.streamManager; }
	/** Returns the hash manager. */
	public HashtableOfTerm getHashManager() { return this.hashManager; }
//	public final Operation exec(Operation code){
//		try {
//			logger.beforeExec(code);
//			return code.exec(this);
//		} catch (RuntimeException t){
//			throw logger.execThrows(t);
//		}
//	}
	public Object getExternalData(String key){
		return this.externalData.get(key);
	}
	public void setExternalData(String key, Object value){
		this.externalData.put(key, value);
	}
	public PrologLogger getLogger() {
		return this.logger;
	}	
	public void push(Undoable undoable) {
		this.trail.push(undoable);		
	}
	
	public Term popPendingGoals() {
		if(halt != 1)  return Nil;
      synchronized (INTERUPT_LOCK) {
        if(PENDING_INTERUPTS==0) return Nil;
        PENDING_INTERUPTS=0;
        Term retPendingGoals = this.pendingGoals;
        lastPendingGoal = null;
        pendingGoals = Nil;
        return retPendingGoals;    
      }
	}
	   public Term peekPendingGoals() {
	      synchronized (INTERUPT_LOCK) {
	        if(PENDING_INTERUPTS==0) return Nil;
	        return this.pendingGoals;
	    }
	   }
	public void pushPendingGoal(Term goal) {
      synchronized (INTERUPT_LOCK) {
      PENDING_INTERUPTS++;
      if(pendingGoals==null || pendingGoals==Prolog.Nil || pendingGoals==Prolog.True) {
        pendingGoals = goal;
        lastPendingGoal = null;
      } else {
        // lastPendingGoal = lastPendingGoal; 
        this.pendingGoals = CONS(goal, this.pendingGoals);
      }
      }
    }   
    public void addPendingGoal(Term goal) {
      synchronized (INTERUPT_LOCK) {
        PENDING_INTERUPTS++; 
        if(lastPendingGoal!=null) {
          lastPendingGoal = this.lastPendingGoal.append(goal);
          return;
        }           
        if(pendingGoals==null || pendingGoals==Prolog.Nil || pendingGoals==Prolog.True) {
          pendingGoals = goal;
        } else {
          if(this.pendingGoals.isCons()) {
            lastPendingGoal = this.pendingGoals.append(goal);
          } else {
            lastPendingGoal = CONS(this.pendingGoals,goal);
            pendingGoals = lastPendingGoal;
          }          
        }                    
      }
    }
    
    void getStackTrace(StringBuilder sb ) {
      
    }
    
    @Override
    public String toString() {
      if(logger==null) {
        return super.toString();
      }
       Operation code = cont;
       if(code==null) {
         return super.toString();
       }
       StringBuilder stringBuilder = new StringBuilder();
       logger.printStack(code, stringBuilder);
       return stringBuilder.toString();
    }

  public static void Break(String string) {
   // byte[] array = new byte[16];
    try {
      new Exception(string).printStackTrace();
    //  System.in.read(array);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
