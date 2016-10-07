package com.googlecode.prolog_cafe.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * The superclass of classes for Prolog exceptions.<br>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public abstract class PrologException extends RuntimeException {

    /** Constructs a new Prolog exception. */
    public PrologException() {}

    public PrologException(String s) {
      super(s);
    }

    /** Returns the message term of this object. */
    abstract public Term getMessageTerm();

    private Operation[] prologStackElement = null;

    public Operation[] getPrologStackTrace() {
    	return prologStackElement==null?null:prologStackElement.clone();
    }

    void setPrologStackTrace(Operation[] stack){
    	this.prologStackElement = stack;
    }

    public boolean hasPrologStackTrace(){
    	return this.prologStackElement != null;
    }
    
	@Override
	public void printStackTrace(PrintStream s) {
		super.printStackTrace(s);
		if (prologStackElement!=null && prologStackElement.length>0){
			s.println("Prolog stack trace:");
			for (Operation o: prologStackElement){
				StringBuilder sb = new StringBuilder("\tat ");
				sb.append(o.getClass().getName());
				int i = sb.lastIndexOf(".");
				if (i>=0){
					sb.setCharAt(i, ':');
				}
				s.println(sb.toString());
			}
		}
	}

	@Override
	public void printStackTrace(PrintWriter s) {
		super.printStackTrace(s);
		if (prologStackElement!=null && prologStackElement.length>0){
			s.println("Prolog stack trace:");
			for (Operation o: prologStackElement){
				StringBuilder sb = new StringBuilder("\tat ");
				sb.append(o.getClass().getName());
				int i = sb.lastIndexOf(".");
				if (i>=0){
					sb.setCharAt(i, ':');
				}
				s.println(sb.toString());
			}
		}
	}
}
