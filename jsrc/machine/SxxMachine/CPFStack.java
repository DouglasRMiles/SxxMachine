package jp.ac.kobe_u.cs.prolog.lang;
import java.io.Serializable;
/**
 * Choice point frame.<br>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class CPFEntry implements Serializable {
    public long timeStamp;
    public Operation cont;  // continuation goal
    public Operation bp;    // next cluase
    public int tr;          // trail pointer
    public int b0;          // cut point

    static CPFEntry S0(Operation cont) {
      CPFEntry r = new CPFEntry();
      r.cont = cont;
      return r;
    }

    void restore(Prolog engine) {
      engine.cont = this.cont;
    }

    public String toString() {
	String t = " time:" + timeStamp + "\n" ;
	t = t + " cont:" + cont + "\n";
	t = t + " bp:" + bp + "\n";
	t = t + " tr:" + tr + "\n";
	t = t + " b0:" + b0 + "\n";
	return t;
    }

    static final class S1 extends CPFEntry {
      private Term areg1;

      S1(Prolog engine) {
        this.cont = engine.cont;
        this.areg1 = engine.areg1;
      }

      void restore(Prolog engine) {
        engine.cont = this.cont;
        engine.areg1 = this.areg1;
      }
    }

    static final class S2 extends CPFEntry {
      private Term areg1, areg2;

      S2(Prolog engine) {
        this.cont = engine.cont;
        this.areg1 = engine.areg1;
        this.areg2 = engine.areg2;
      }

      void restore(Prolog engine) {
        engine.cont = this.cont;
        engine.areg1 = this.areg1;
        engine.areg2 = this.areg2;
      }
    }

    static final class S3 extends CPFEntry {
      private Term areg1, areg2, areg3;

      S3(Prolog engine) {
        this.cont = engine.cont;
        this.areg1 = engine.areg1;
        this.areg2 = engine.areg2;
        this.areg3 = engine.areg3;
      }

      void restore(Prolog engine) {
        engine.cont = this.cont;
        engine.areg1 = this.areg1;
        engine.areg2 = this.areg2;
        engine.areg3 = this.areg3;
      }
    }

    static final class S4 extends CPFEntry {
      private Term areg1, areg2, areg3, areg4;

      S4(Prolog engine) {
        this.cont = engine.cont;
        this.areg1 = engine.areg1;
        this.areg2 = engine.areg2;
        this.areg3 = engine.areg3;
        this.areg4 = engine.areg4;
      }

      void restore(Prolog engine) {
        engine.cont = this.cont;
        engine.areg1 = this.areg1;
        engine.areg2 = this.areg2;
        engine.areg3 = this.areg3;
        engine.areg4 = this.areg4;
      }
    }

    static final class S5 extends CPFEntry {
      private Term areg1, areg2, areg3, areg4, areg5;

      S5(Prolog engine) {
        this.cont = engine.cont;
        this.areg1 = engine.areg1;
        this.areg2 = engine.areg2;
        this.areg3 = engine.areg3;
        this.areg4 = engine.areg4;
        this.areg5 = engine.areg5;
      }

      void restore(Prolog engine) {
        engine.cont = this.cont;
        engine.areg1 = this.areg1;
        engine.areg2 = this.areg2;
        engine.areg3 = this.areg3;
        engine.areg4 = this.areg4;
        engine.areg5 = this.areg5;
      }
    }

    static final class S6 extends CPFEntry {
      private Term areg1, areg2, areg3, areg4, areg5, areg6;

      S6(Prolog engine) {
        this.cont = engine.cont;
        this.areg1 = engine.areg1;
        this.areg2 = engine.areg2;
        this.areg3 = engine.areg3;
        this.areg4 = engine.areg4;
        this.areg5 = engine.areg5;
        this.areg6 = engine.areg6;
      }

      void restore(Prolog engine) {
        engine.cont = this.cont;
        engine.areg1 = this.areg1;
        engine.areg2 = this.areg2;
        engine.areg3 = this.areg3;
        engine.areg4 = this.areg4;
        engine.areg5 = this.areg5;
        engine.areg6 = this.areg6;
      }
    }

    static final class S7 extends CPFEntry {
      private Term areg1, areg2, areg3, areg4, areg5, areg6, areg7;

      S7(Prolog engine) {
        this.cont = engine.cont;
        this.areg1 = engine.areg1;
        this.areg2 = engine.areg2;
        this.areg3 = engine.areg3;
        this.areg4 = engine.areg4;
        this.areg5 = engine.areg5;
        this.areg6 = engine.areg6;
        this.areg7 = engine.areg7;
      }

      void restore(Prolog engine) {
        engine.cont = this.cont;
        engine.areg1 = this.areg1;
        engine.areg2 = this.areg2;
        engine.areg3 = this.areg3;
        engine.areg4 = this.areg4;
        engine.areg5 = this.areg5;
        engine.areg6 = this.areg6;
        engine.areg7 = this.areg7;
      }
    }

    static class S8 extends CPFEntry {
      private Term areg1, areg2, areg3, areg4, areg5, areg6, areg7, areg8;

      S8(Prolog engine) {
        this.cont = engine.cont;
        this.areg1 = engine.areg1;
        this.areg2 = engine.areg2;
        this.areg3 = engine.areg3;
        this.areg4 = engine.areg4;
        this.areg5 = engine.areg5;
        this.areg6 = engine.areg6;
        this.areg7 = engine.areg7;
        this.areg8 = engine.areg8;
      }

      void restore(Prolog engine) {
        engine.cont = this.cont;
        engine.areg1 = this.areg1;
        engine.areg2 = this.areg2;
        engine.areg3 = this.areg3;
        engine.areg4 = this.areg4;
        engine.areg5 = this.areg5;
        engine.areg6 = this.areg6;
        engine.areg7 = this.areg7;
        engine.areg8 = this.areg8;
      }
    }

    static final class S9 extends S8 {
      private Term[] aregs;

      S9(int arity, Prolog engine) {
        super(engine);
        aregs = new Term[arity - 8];
        System.arraycopy(engine.aregs, 0, aregs, 0, aregs.length);
      }

      void restore(Prolog engine) {
        System.arraycopy(aregs, 0, engine.aregs, 0, aregs.length);
        super.restore(engine);
      }
    }
}

/**
 * Choice point frame stack.<br>
 * The <code>CPFStack</code> class represents a stack
 * of choice point frames.<br>
 * Each choice point frame has the following fields:
 * <ul>
 * <li><em>arguments</em>
 * <li><em>continuation goal</em>
 * <li><em>next clause</em>
 * <li><em>trail pointer</em>
 * <li><em>cut point</em>
 * <li><em>time stamp</em>
 * </ul>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class CPFStack implements Serializable {
    /** Maximum size of enties. Initial size is <code>20000</code>. */
    protected int maxContents = 20000;

    /** An array of choice point frames. */
    protected CPFEntry[] buffer;

    /** the top index of this <code>CPFStack</code>. */
    protected int top;

    /** Holds the Prolog engine that this <code>CPFStack</code> belongs to. */
    protected Prolog engine;
	
    /** Constructs a new choice point frame stack. */
    public CPFStack(Prolog _engine) {
	engine = _engine;
	buffer = new CPFEntry[maxContents];
	top = -1;
    }

    /** Constructs a new choice point frame stack with the given size. */
    public CPFStack(Prolog _engine, int n) {
	engine = _engine;
	maxContents = n;
	buffer = new CPFEntry[maxContents];
	top = -1;
    }

    /** Create a new choice point frame.
     * @param entry <em>entry to save</em>
     */
    void push(CPFEntry entry){
	try {
	    buffer[++top] = entry;
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("{expanding choice point stack...}");
	    int len = buffer.length;
	    CPFEntry[] new_buffer = new CPFEntry[len+10000];
	    for(int i=0; i<len; i++) {
		new_buffer[i] = buffer[i];
	    }
	    buffer = new_buffer;
	    buffer[top] = entry;
	    maxContents = len+10000;
	}
    }

    /** Discards all choice points. */
    public void deleteAll() { 
	while (! empty()) {
	    buffer[top--] = null;
	}
    }

    /** Discards all choice points after the value of <code>i</code>. */
    public void cut(int i) {
	while (top > i) {
	    buffer[top--] = null;
	}
    }

    /** Discards the top of choice points. */
    public void delete() { buffer[top--] = null; }

    /** Discards all choice points. */
    public void init() { deleteAll(); }

    /** Tests if this stack has no entry. */
    public boolean empty() { return top == -1; }

    /** Returns the value of <code>top</code>. 
     * @see #top
     */
    public int top() { return top; }

    /** Returns the value of <code>maxContents</code>. 
     * @see #maxContents
     */
    public int max() { return maxContents; }

    CPFEntry topEntry() { return buffer[top]; }
    void restore() { buffer[top].restore(engine); }

    /** Returns the <em>time stamp</em> of current choice point frame. */
    public long getTimeStamp() { return buffer[top].timeStamp; }
    
    /** Shows the contents of this <code>CPFStack</code>. */
    public void show() {
	if (empty()) {
	    System.out.println("{choice point stack is empty!}");
	    return;
	}
	for (int i=0; i<=top; i++) {
	    System.out.print("stack[" + i + "]: ");
	    System.out.println(buffer[i]);
	}
    }
}
