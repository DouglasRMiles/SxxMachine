package com.googlecode.prolog_cafe.lang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

	private Operation currentOperation = null;
	private boolean topBuiltin = false, builtin = false;
	private StringBuilder message = new StringBuilder(128);
	private boolean enabled = false;
	
	private final List<Predicate> stack = new ArrayList<Predicate>();
	
	
	public PrologLogger(Prolog engine) {
		this.engine = engine;
		String levelName = System.getProperty(logger.getName()+".level");
		if (levelName!=null){
			logger.setLevel(Level.parse(levelName));
		}
		enabled = logger.isLoggable(Level.FINE);
	}

	private void reset() {
		stack.clear();
		builtin = false;
		topBuiltin = false;
		message.setLength(0);
		currentOperation = null;
	}
	
	public void fail() {
		if (enabled && (!topBuiltin || !builtin || logger.isLoggable(Level.FINEST))){
			message.append(" => fail");
		}
	}
	

	public void jtry(Operation p, Operation next, ChoicePointFrame entry) {
		if (logger.isLoggable(Level.FINER)){
			entry.ownerPredicate = currentOperation;
			if (!builtin){
				logger.finer(indent(' ', stack.size())+"try "+currentOperation+" => "+p);
			} else if (logger.isLoggable(Level.FINEST)){
				logger.finest(indent(' ', stack.size())+"try "+currentOperation+" => "+p);
			}
		}		
	}

	public void retry(Operation p, Operation next) {
		if (logger.isLoggable(Level.FINER)){
			if (!builtin){
				logger.finer(indent(' ', stack.size())+"retry "+engine.stack.top.ownerPredicate+" => "+p);
			} else if (logger.isLoggable(Level.FINEST)){
				logger.finest(indent(' ', stack.size())+"retry "+engine.stack.top.ownerPredicate+" => "+p);
			}
		}		
	}

	public void trust(Operation p) {
		if (logger.isLoggable(Level.FINER)){
			if (!builtin){
				logger.finer(indent(' ', stack.size())+"trust "+engine.stack.top.ownerPredicate+" => "+p);
			} else if (logger.isLoggable(Level.FINEST)){
				logger.finest(indent(' ', stack.size())+"trust "+engine.stack.top.ownerPredicate+" => "+p);
			}
		}		
	}

	
	private final String indent(char c, int len) {
		if (len < 1)
			return "";
		StringBuilder sb = new StringBuilder(len).append(c);
		int remnant = len - sb.length();
		while (remnant > 0) {
			if (remnant >= sb.length())
				sb.append(sb);
			else
				sb.append(sb.subSequence(0, remnant));
			remnant = len - sb.length();
		}
		return sb.toString();
	}
	
	public void beforeExec(Operation code) {
		if (logger.isLoggable(Level.FINE)) {
			// detect logger level change
			if (!enabled){
				logger.info("log level set to FINE or below");
				reset();
				enabled = true;
			}
			
			currentOperation = code;
			builtin = code.getClass().getName().startsWith("com.googlecode.prolog_cafe.");
			if (!topBuiltin || !builtin || logger.isLoggable(Level.FINEST)){
				message.setLength(0);
				message.append(indent(' ', stack.size()));
				message.append(": ");
				message.append(code);
			}
		}		
	}

	
	public void afterExec(Operation code, Operation next) {
		// if it was enabled since beforeExec() avoid doing anything before reset() call in beforeExec()
		if (enabled){
			if (!logger.isLoggable(Level.FINE)){// it was disabled since beforeExec() 
				logger.info("log level set to CONFIG or above");
				enabled = false;
				return;
			}
			if (!topBuiltin || !builtin){
				if (code instanceof Predicate) {
					logger.fine(message.toString());
				} else {
					logger.finer(message.toString());
				}				
			} else if (logger.isLoggable(Level.FINEST)){
				logger.finest(message.toString());
			}						
		
			if ((code instanceof Predicate) && ((Predicate)code).cont!=next){
				stack.add((Predicate) code);
				engine.trail.push(new FailureHandler(stack, stack.size()));
				topBuiltin = builtin;
			}
			// TODO optimize
			int i = 0;
			Iterator<Predicate> it = stack.iterator(); 
			while(it.hasNext() && it.next().cont!=next){
				i++;				
			}
			for (int k=stack.size()-1; k>=i; k--){
				stack.remove(k);
			}
		}
	}

	public void execThrows(RuntimeException t) {
		logger.log(Level.FINE, "", t);
	}

	public void printStackTrace(Throwable err) {
		logger.log(Level.SEVERE, "", err);
	}
	
	private static class FailureHandler implements Undoable{

		private final int depth;
		private final List<Predicate> stack;
		
		public FailureHandler(List<Predicate> stack, int depth) {		
			this.stack = stack;
			this.depth = depth;
		}


		@Override
		public void undo() {
			for (int i=stack.size()-1; i>=depth; i--){
				stack.remove(i);
			}						
		}
		
	}
}