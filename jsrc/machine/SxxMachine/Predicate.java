package com.googlecode.prolog_cafe.lang;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Superclass of any predicate's implementation class.
 * <p>
 * Concrete implementations must provide a definition of the Operation's
 * {@link Operation#exec(Prolog)} method. On a successful execution the
 * method must return {@link #cont}.
 * <p>
 * To be compatible with the {@code am2j} compiler implementations must
 * define a constructor matching the signature:
 * <pre>
 *   public ClassName(Term arg1, Term arg2, ..., Operation cont) {
 *     // save arg1, arg2
 *     this.cont = cont;
 *   }
 * </pre>
 */
public abstract class Predicate extends Operation {
  /**
   * Holds the continuation goal of this predicate.
   * <p>
   * In a Prolog program this is the next operation to perform if this operation
   * was executed successfully.
   */
  public Operation cont;

  @Override
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  toString(sb);
	  return sb.toString();
  }

  @Override
  public void toString(StringBuilder sb) {
	Deque<Class> toScan = new ArrayDeque<Class>();
    Class clazz = getClass();
    while (clazz != Predicate.class) {
      toScan.addFirst(clazz);
      clazz = clazz.getSuperclass();
    }

    sb.append(PredicateEncoder.decodeFunctor(getClass().getName()));
    boolean first = true;
    int i=1;
    Field f = null;
    do {
    	for (Class c : toScan){
    		try {
				f = c.getDeclaredField("arg"+i);
				if ((f.getModifiers() & Modifier.STATIC) == 0
						&& f.getType() == Term.class){

					f.setAccessible(true);
					Term val = (Term) f.get(this);
					if (first) {
						sb.append('(');
						first = false;
					} else {
						sb.append(", ");
					}
					val.toString(sb);
					break;
				}
			} catch (Exception e) {
				f = null;
			}
    	}
    	i++;
    } while (f!=null);
    if (!first){
    	sb.append(')');
    }
  }

  public static abstract class P1 extends Predicate {
    protected Term arg1;

    @Override
    public void toString(StringBuilder sb) {
    	sb.append(PredicateEncoder.decodeFunctor(getClass().getName()));
    	sb.append('(');
    	arg1.toString(sb);
    	sb.append(')');
    }
  }

  public static abstract class P2 extends Predicate {
    protected Term arg1;
    protected Term arg2;

    @Override
    public void toString(StringBuilder sb) {
    	sb.append(PredicateEncoder.decodeFunctor(getClass().getName()));
    	sb.append('(');
    	arg1.toString(sb);
    	sb.append(", ");
    	arg2.toString(sb);
    	sb.append(')');
    }
  }

  public static abstract class P3 extends Predicate {
    protected Term arg1;
    protected Term arg2;
    protected Term arg3;

    @Override
    public void toString(StringBuilder sb) {
    	sb.append(PredicateEncoder.decodeFunctor(getClass().getName()));
    	sb.append('(');
    	arg1.toString(sb);
    	sb.append(", ");
    	arg2.toString(sb);
    	sb.append(", ");
    	arg3.toString(sb);
    	sb.append(')');
    }
  }

  public static abstract class P4 extends Predicate {
    protected Term arg1;
    protected Term arg2;
    protected Term arg3;
    protected Term arg4;

  }
}
