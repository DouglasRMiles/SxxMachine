package com.googlecode.prolog_cafe.lang;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Formatter;

/**
 * <p>Logs executed predicates and their arguments to {@link Logger} instance specified by {@link Prolog#LOGGER_NAME}.
 * <p>Writes the following data:
 * <ul>
 *  <li> level SEVERE - exception stack traces reported by {@link PrologControl#printStackTrace(Throwable)}
 *  <li> level WARNING - nothing
 *  <li> level INFO - messages about detected log level change
 *  <li> level CONFIG - nothing
 *  <li> level FINE - logs executed predicates, their arguments and failure flag. Intercepted exception stack traces. Internal built in predicates are not logged.
 *  <li> level FINER - info about engine try, retry, trust
 *  <li> level FINEST - internal built in predicates, their arguments and failure flag.
 * </ul>
 *
 *
 * @author semenov
 *
 */

public class PrologLogger {

	private static final Logger logger = Logger.getLogger(Prolog.LOGGER_NAME);
	private final Prolog engine;

	private boolean enabled = false;
	private boolean failure = false;
	private boolean expectAfter = false;
	private PrologLoggerFileHandler fileHandler = null;
	private final StringBuilder stringBuilder = new StringBuilder(2048);
	private final Map<String, Long> timings;
	private final Map<String, Long> counters;
	private long start;

	private static class StackNode {
		Operation operation;
		final StackNode next;
		final String indent;
		Level level;

		StackNode() {
			operation = null;
			next = null;
			indent = "";
		}

		StackNode(Operation operation, StackNode next){
			this.operation = operation;
			this.next = next;
			int indentLength = next.indent.length()+1;
			if (indentLength<indentCache.length) {
				this.indent = indentCache[indentLength];
			} else {
				this.indent = indentCache[indentCache.length-1];//this.indent = next.indent + " ";
			}
		}

		public String toString() {
			return level + indent+": "+operation;
		}

		StackNode nextPredicate() {
			StackNode n = next;
			while (n!=null && !(n.operation instanceof Predicate)) {
				n = n.next;
			}
			return n;
		}
	}

	private final static int INDENT_CHACHE_SIZE = 512;
	private final static String[] indentCache = new String[INDENT_CHACHE_SIZE];
	static {
		// init indent cache
		indentCache[0] = "";
		StringBuilder sb = new StringBuilder(INDENT_CHACHE_SIZE);
		for (int i=1; i<INDENT_CHACHE_SIZE; i++){
			sb.append(' ');
			indentCache[i] = sb.toString();
		}
	}

	private static class PrologLoggerFormatter extends Formatter {

		private final StringBuilder sb = new StringBuilder(512);
		
		@Override
		public String format(LogRecord record) {
			sb.setLength(0);
			String level = record.getLevel().toString();
			int len = level.length();
			while (len<9){
				sb.append(' ');
				len++;
			}
			sb.append(level);
			sb.append(' ');
			sb.append(record.getMessage());
			Throwable thrown = record.getThrown();
			try {
				StringWriter sw = new StringWriter();
				PrintWriter pw = new PrintWriter(sw);
				thrown.printStackTrace(pw);
				pw.close();
				sb.append(sw.toString());
			} catch (Exception ex) {
			}
			sb.append('\n');
			return sb.toString();
		}		
	}
	
	private static class PrologLoggerFileHandler extends FileHandler {
		
		private final String fileName;

		public PrologLoggerFileHandler(String fileName) throws IOException, SecurityException {
			super(fileName);
			this.fileName = fileName;
		}
		
		public String getFileName() {
			return fileName;
		}
	}

	private StackNode stackTop = new StackNode();


	PrologLogger(Prolog engine) {
		this.engine = engine;
		setLevel(System.getProperty(logger.getName()+".level"));
		setLogFile(System.getProperty(logger.getName()+".file"));
		String enabledProperty = System.getProperty(logger.getName()+".enabled");
		setEnabled(logger.isLoggable(Level.FINE) || enabledProperty==null || "true".equals(enabledProperty));
		if (System.getProperty(logger.getName()+".timingsFile")!=null){
			timings = new HashMap<String, Long>(); // TODO handle concurrency
			counters = new HashMap<String, Long>();
		} else {
			timings = null;
			counters = null;
		}
		
	}

	public boolean isEnabled() {
		return enabled;
	}
	/**
	 * allows to completely disable logger functions to gain performance.
	 */
	public void setEnabled(boolean value) {
		enabled = value;
	}

	public String getLogFile() {
		return fileHandler==null?null:fileHandler.getFileName();
	}

	public void setLogFile(String logFile) {
		// close previous handler
		if (fileHandler!=null){ 
			// check if file is the same
			if (fileHandler.getFileName().equals(logFile)){
				return;
			}
			logger.removeHandler(fileHandler);
			fileHandler.close();
			logger.setUseParentHandlers(true);
		}
		if (logFile!=null){			
			try {
				fileHandler = new PrologLoggerFileHandler(logFile);
				fileHandler.setFormatter(new PrologLoggerFormatter());
				fileHandler.setLevel(Level.ALL);
				logger.addHandler(fileHandler);
				logger.setUseParentHandlers(false);
			} catch (Exception e) {
				logger.setUseParentHandlers(true);
				logger.getParent().log(Level.SEVERE, "failed to log to file "+logFile, e);
			}			
		}
		setEnabled(enabled || logger.isLoggable(Level.FINE) || fileHandler!=null);
	}

	public Level getLevel() {
		return logger.getLevel();
	}

	public void setLevel(String levelName){
		setLevel(levelName==null?null:Level.parse(levelName.toUpperCase()));
	}

	public void setLevel(Level level){
		logger.setLevel(level);
		setEnabled(enabled || logger.isLoggable(Level.FINE) || fileHandler!=null);
	}

	private void reset() {
		stackTop = new StackNode();
	}

	void fail() {
		if (enabled ){
			failure = true;
			if (logger.isLoggable(stackTop.level)){
				stringBuilder.setLength(0);
				stringBuilder.append(stackTop.indent).append("failure => ");
				engine.stack.top.bp.toString(stringBuilder);
				logger.log(stackTop.level, stringBuilder.toString());
			}
		}
	}

	void jtry(Operation p, Operation next, ChoicePointFrame entry) {
		if (enabled){
			entry.ownerPredicate = stackTop.operation; //currentOperation;
			if (logger.isLoggable(stackTop.level)){
				stringBuilder.setLength(0);
				stringBuilder.append(stackTop.indent).append("try ");
				stackTop.operation.toString(stringBuilder);
				stringBuilder.append(" => ");
				p.toString(stringBuilder);
				logger.log(stackTop.level, stringBuilder.toString());
			}
		}
	}

	void retry(Operation p, Operation next) {
		if (enabled){
			failure = true;
			if (logger.isLoggable(stackTop.level)) {
				stringBuilder.setLength(0);
				stringBuilder.append(stackTop.indent).append("retry ");
				engine.stack.top.ownerPredicate.toString(stringBuilder);
				stringBuilder.append(" => ");
				p.toString(stringBuilder);
				logger.log(stackTop.level, stringBuilder.toString());
			}
		}
	}

	void trust(Operation p) {
		if (enabled){
			failure = true;
			if (logger.isLoggable(stackTop.level)) {
				stringBuilder.setLength(0);
				stringBuilder.append(stackTop.indent).append("trust ");
				engine.stack.top.ownerPredicate.toString(stringBuilder);
				stringBuilder.append(" => ");
				p.toString(stringBuilder);
				logger.log(stackTop.level, stringBuilder.toString());
			}
		}
	}


	void beforeExec(Operation code) {
		if (enabled || logger.isLoggable(Level.FINE)) {
			// detect logger level change
			if (!enabled){
				logger.info("log level set to FINE or below");
				reset();
				enabled = true;
			}

			// some predicates like $begin_exception contains inner execution loop
			// afterExec() is called for them only after inner loop finishes
			if (expectAfter){
				afterExec(stackTop.operation, null);
			}

			failure = false;
			boolean codeBuiltin = code.getClass().getName().startsWith("com.googlecode.prolog_cafe.");
			Operation parent = stackTop.next!=null?stackTop.next.operation:null;
			boolean parentBuiltin = parent!=null && parent.getClass().getName().startsWith("com.googlecode.prolog_cafe.");
			stackTop.operation = code;
			expectAfter = true;
			Level level;
			if (codeBuiltin && parentBuiltin){
				level = Level.FINEST;
			} else if (code instanceof Predicate){
				level = Level.FINE;
			} else {
				level = Level.FINER;
			}
			stackTop.level = level;
			if (logger.isLoggable(level)){
				stringBuilder.setLength(0);
				stringBuilder.append(stackTop.indent).append(": ");
				code.toString(stringBuilder);
				logger.log(level, stringBuilder.toString());
			}
			start = System.currentTimeMillis();
		}
	}


	void afterExec(Operation code, Operation next) {
		// if it was enabled since beforeExec() avoid doing anything before reset() call in beforeExec()
		if (enabled){
			if (timings!=null){
				long finish = System.currentTimeMillis();
				String key = code.getClass().getName();
				counters.put(key, counters.getOrDefault(key, 0L)+1);
				timings.put(key, timings.getOrDefault(key, 0L)+(finish-start));		
			}
//			if (!logger.isLoggable(Level.FINE)){// it was disabled since beforeExec()
//				logger.info("log level set to CONFIG or above");
//				enabled = false;
//				return;
//			}

			if (!failure && expectAfter){
				if ((code instanceof Predicate) && (((Predicate)code).cont!=next)){
					final StackNode stackNode = stackTop;
					stackTop = new StackNode(next, stackTop);
					engine.trail.push(() -> stackTop = stackNode);
				} else {
					// stackTop is either operation or predicate
					// check if next is a finish for some predicate below stack top
					StackNode n = stackTop.nextPredicate();
					while (n!=null && ((Predicate)n.operation).cont==next){
						stackTop = n;
						n = n.nextPredicate();
					}
				}

			}
			expectAfter = false;
		}
	}

	RuntimeException execThrows(RuntimeException t) {
		if (enabled){
			if (!(t instanceof PrologException) || !((PrologException)t).hasPrologStackTrace() ){
				// prepare stack trace for embedding into exception
				List<Operation> list = new ArrayList<Operation>(stackTop.indent.length());
				StackNode n = stackTop;
				while(n!=null){
					list.add(n.operation);
					n = n.next;
				}
				Operation[] array = new Operation[list.size()];
				list.toArray(array);
				// wrap t into JavaException if it is not PrologException
				if (!(t instanceof PrologException)){
					t = new JavaException(t);
				}
				// add stacktrace into t
				((PrologException)t).setPrologStackTrace(array);
			}
			if (logger.isLoggable(Level.FINE)) {
				stringBuilder.setLength(0);
				stackTop.operation.toString(stringBuilder);
				stringBuilder.append(" throws exception ");
				logger.log(Level.FINE, stringBuilder.toString(), t);
			}
		}
		return t;
	}

	public void printStackTrace(Throwable err) {
		logger.log(Level.SEVERE, "", err);
		if (!logger.getUseParentHandlers()){ // propagate error outside
			Logger.getLogger("").log(Level.SEVERE, "", err);
		}
	}
	
	public void dumpTimings() {
		String filename = System.getProperty(logger.getName()+".timingsFile");
		if (timings==null || filename==null){
			return;
		}
    	@SuppressWarnings("unchecked")
		Map.Entry<String, Long>[] a = new Map.Entry[timings.size()];
    	int i = 0;
    	int maxWidth = 0;
    	for (Map.Entry<String, Long> me: timings.entrySet()){
    		a[i] = me;
    		if (maxWidth<me.getKey().length()){
    			maxWidth = me.getKey().length();
    		}
    		i++;
    	}
    	Arrays.sort(a, Comparator.comparing(Map.Entry::getValue));
    	try {
			PrintStream printStream = new PrintStream(new FileOutputStream(filename, true), true, "UTF-8");
			try {
				printStream.println("Predicates execute statistics "+new Date()+":");
				printStream.format("%"+maxWidth+"s | Time, ms | Count %n", "Predicate");
				String format = "%-"+maxWidth+"s | %8d | %8d%n";
				for (Map.Entry<String, Long> me: a){
					printStream.format(format, me.getKey(), me.getValue(), counters.get(me.getKey()));
				}
				printStream.println();
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Failed to write to "+filename, e);
			} finally {
				printStream.close();
				if (printStream.checkError()){
					logger.log(Level.SEVERE, "Failed to write to "+filename);
				}
			}			
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to open "+filename, e);
		}
	}
	
	public void clearTimeings() {
		if (timings!=null){
			timings.clear();
			counters.clear();
		}
	}
	
}
