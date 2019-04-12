package SxxMachine.pterm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import SxxMachine.BlockingPrologControl;
import SxxMachine.InternalException;
import SxxMachine.KPTrail;
import SxxMachine.MiniJProlog;
import SxxMachine.OpVisitor;
import SxxMachine.Operation;
import SxxMachine.Prolog;
import SxxMachine.PrologMachineCopy;
import SxxMachine.RunningPrologMachine;
import SxxMachine.Term;
import SxxMachine.Trail;
import SxxMachine.Undoable;
import SxxMachine.Var;

/**
 * Variable.<br>
 * The <code>VariableTerm</code> class represents a logical variable.<br>
 * For example,
 *
 * <pre>
 * Term t = new VariableTerm();
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
@SuppressWarnings({ "rawtypes", "unused" })
public class VariableTerm extends AVar implements Undoable, Var {


    public long timestampJP;

    protected MiniJProlog mach;
    
    @Override
    public Var toClone() {
        return this;
    }

    @Override
    public boolean unifyInt(int i, Trail trail) {
        return unify(TermData.Integer(i), trail);
    }

    /**
     * Holds a term to which this variable is bound. Initial value is
     * <code>this</code> (self-reference).
     */
    // private Term val;
    /** A CPF time stamp when this object is newly constructed. */
    public long timeStamp;
    /** Variable terms, that reference to (use value of) this one */
    private List<VariableTerm> upRef = null;
    /** Opposite reference to upRef */
    private VariableTerm downRef = null;
    public Term Refers = this;
    private int isCyclic;

    @Override
    public String toString() {
        if (isCyclic > 0) {
            return "/*cyclic*/" + variableName();
        }
        return super.toString();
    }

    @Override
    public boolean isAtomicValue() {
        return (this.Refers != null) && (this.Refers != this) && this.Refers.isAtomicValue();
    }

    @Override
    public boolean isVar() {
        return true;
    }

    @Override
    public boolean isNonvar() {
        return false;
    }

    /**
     * Constructs a new logical variable so that the <code>timeStamp</code> field is
     * set to <code>Long.MIN_VALUE</code>.
     */
    public VariableTerm() {
        // this.val = this;
        this.myID = nextID++;
        this.timeStamp = Long.MIN_VALUE;
    }

    /**
     * Constructs a new logical variable so that the <code>timeStamp</code> field is
     * set to the current value of <code>CPFTimeStamp</code> of the specified Prolog
     * engine.
     *
     * @param engine
     *            Current Prolog engine.
     * @see Prolog#getCPFTimeStamp
     */
    public VariableTerm(Prolog engine) {
        // this.val = this;
        if (engine != null)
            this.timeStamp = engine.getCPFTimeStamp();
        this.myID = nextID++;
    }

    /** Returns a string representation of this object. */
    public String variableName() {
        if (this.varName != null) {
            return this.varName;
        }
        return ("_"
                // + Integer.toHexString(termHashCode()) + "_"
                + Integer.toHexString(myID) // + "_"
        // + Long.toHexString(Math.abs(this.timeStamp)) //
        ).toUpperCase() + ((this.varName != null) ? "_" + this.varName : "");
    }

    @Override
    public int type() {
        return TYPE_VARIABLE;
    }

    /**
     * Checks whether the argument term is unified with this one. If this is an
     * unbound variable, the <code>unify</code> method binds this to the
     * dereferenced value of argument term:
     * <code>bind(t.dereference(), trail)</code>, and returns <code>true</code>.
     * Otherwise, it returns a <code>boolean</code> whose value is
     * <code>val.unify(t, trail)</code>.
     *
     * @param t
     *            the term to be unified with.
     * @param trail
     *            Trail Stack.
     * @return <code>true</code> if succeeds, otherwise <code>false</code>.
     * @see #Refers
     * @see #bind(Term,Trail)
     * @see Trail
     */
    @Override
    public final boolean unifyImpl(Term t, Trail trail) {
        if (t == this)
            return true;
        if (t == Refers)
            return true;
        return (this.Refers.isVar()) ? this.Refers.bind(t.dref(), trail) : this.Refers.unify(t, trail);
    }

    @Override
    public int containsTermImpl(Term variableTerm, OpVisitor comparison) {
        if (isCyclic > 0)
            return isCyclic;
        if (variableTerm == Refers) {
            return 1;
        }
        if (variableTerm == this) {
            return 1;
        }
        if (Refers != null && Refers != this) {
            return Refers.containsTerm(variableTerm, comparison);
        }
        return 0;
    }

    private void updateUpRef(Term value) {
        if (value == Refers || value == this) {
            updateUpRefNoOccurs(value);
            return;
        }
        if (!value.isAtomicValue()) {
            isCyclic = value.containsTerm(this, Term.StrictEquals);
            if (isCyclic > 0) {
                Prolog.Break("cyclic " + variableName());
            }
        }
        updateUpRefNoOccurs(value);
    }

    private void updateUpRefNoOccurs(Term value) {
        if (value == this) {
            isCyclic = 0;
        }
        if (this.upRef == null || this.upRef.isEmpty()) { // short cut
            this.Refers = value;
            return;
        }
        Deque<VariableTerm> queue = new ArrayDeque<VariableTerm>();
        queue.add(this);
        while (!queue.isEmpty()) {
            VariableTerm v = queue.poll();
            v.Refers = value;
            if (v.upRef != null) {
                for (VariableTerm u : v.upRef) {
                    if (u.Refers != value) { // queue only not visited variable terms
                        queue.add(u);
                    }
                }
            }
        }
    }

    private void bindUpRef(VariableTerm upVariable) {
        if (this.upRef == null) {
            this.upRef = new ArrayList<VariableTerm>(4);
        }
        this.upRef.add(upVariable);
        upVariable.downRef = this;
        upVariable.updateUpRef(this.Refers);
    }

    VariableTerm frozenProxy;

    @Override
    public Term freeze(Trail trail, Term newval) {
        if (frozenProxy == null) {
            frozenProxy = new VariableTerm();
        }
        Map<Object, Term> copyHash = new IdentityHashMap<Object, Term>();
        copyHash.put(this, frozenProxy);
        Term nextnewVal = newval.copy(copyHash, COPY_ALL);
        return super.freeze(trail, nextnewVal);
    }

    boolean FBind(Term that, Trail trail) {
        VariableTerm fv2 = this;
        if (that.isFVar()) {
            VariableTerm thatv = (VariableTerm) that;
            Term newgoals = StructureTerm.createCons(",", this.frozenGoals(), thatv.frozenGoals());
            VariableTerm newfrv = new VariableTerm(trail.getProlog(), trail.top(), newgoals);
            trail.push(this);
            trail.push(thatv);
            if (isAttvar()) {

            }

            this.Refers = thatv.Refers = newfrv;

        } else if (that.isVar()) {
            return that.cafe_bind_var(this, trail);
        } else {
            if (false) {
                Prolog m = trail.getProlog();
                Term g = this.frozenGoals();
                BlockingPrologControl e2 = (BlockingPrologControl) m.control;
                Operation saved = e2.code;
                frozenProxy.cafe_bind_var(that, trail);
                // freeze(X,integer(X)),X=1.
                e2.resultReady = false;
                Term[] savedA1 = m.AREGS;
                Operation savedA2 = m.getCont();
                m.setCont(null);
                int savedA3 = m.B0;
                e2.setPredicate(g);
                e2.executePredicate(false);
                try {
                    if (e2.result) {
                        fv2.cafe_bind_var(frozenProxy.Refers, trail);
                        e2.code = saved;
                        return true;
                    } else {
                        return false;
                    }
                } finally {
                    frozenProxy.undo();
                    e2.resultReady = false;
                    e2.code = saved;
                    m.AREGS = savedA1;
                    m.setCont(savedA2);
                    m.B0 = savedA3;
                }
            }

            Prolog m = trail.getProlog();
            Term g = this.frozenGoals();
            BlockingPrologControl e2 = new BlockingPrologControl(PrologMachineCopy.cloneCheap(m));
            frozenProxy.cafe_bind_var(that, trail);
            e2.setPredicate(g);
            if (e2.call()) {
                fv2.cafe_bind_var(frozenProxy.Refers, trail);
                frozenProxy.undo();
                return true;
            } else {
                frozenProxy.undo();
                return false;
            }
            // m.push(new PopPendingGoals(m, m.pendingGoals));
            // m.addPendingGoal(TermData.AND(g, new ClosureTerm(new Predicate() {
            // @Override
            // public int predArity() {
            // return 0;
            // }
            // @Override
            // public Operation exec(Prolog engine) throws PrologException {
            // fv2.pbind(frozenProxy.val, trail);
            // //VariableTerm.this.val = frozenProxy.val;
            // return engine.cont;
            // }
            // })));

            // @TODO mach.ExceptionRaised = 1;
        }
        return true;
    }

    /**
     * Binds this variable to a given term. And pushs this variable to trail stack
     * if necessary.
     *
     * @param p
     *            a term to be bound.
     * @param trail
     *            Trail Stack
     * @see Trail
     */
    @Override
    public final boolean cafe_bind_var(Term p, Trail trail) {
        if (p.isVar()) {
            VariableTerm v = (VariableTerm) p, t = this;
            if (v.timeStamp >= this.timeStamp) {
                t = v;
                v = this;
            }
            v.bindUpRef(t);
            if (t.timeStamp < trail.timeStamp) {
                trail.push(t);
            }
            return true;
        }
        // update upRefs to use value t
        updateUpRef(p);
        this.downRef = null;
        if (this.timeStamp < trail.timeStamp) {
            trail.push(this);
        }
        return true;
    }

    @Override
    public final boolean bind(Term p, Trail trail) {
        final boolean fVar = this.isFVar();
        if (fVar) {
            return this.FBind(p, trail);
        }
        return cafe_bind_var(p, trail);

    }

    /**
     * Checks whether this object is convertible with the given Java class type if
     * this variable is unbound. Otherwise, returns the value of
     * <code>val.convertible(type)</code>.
     *
     * @param type
     *            the Java class type to compare with.
     * @return <code>true</code> if this (or dereferenced term) is convertible with
     *         <code>type</code>. Otherwise <code>false</code>.
     * @see #Refers
     */
    @Override
    public final boolean convertible(Class type) {
        return (this.Refers != this) ? this.Refers.convertible(type) : convertible(this.getClass(), type);
    }

    /**
     * Returns a copy of this object if unbound variable. Otherwise, returns the
     * value of <code>val.copy(engine)</code>.
     *
     * @see #Refers
     */
    @Override
    protected Term cafe_copyImpl(Map<Object, Term> copyHash, int deeply) {
        if (this.Refers.isVar()) {
            Term co = copyHash.get(this.Refers);
            if (co == null) {
                co = new VariableTerm();
                copyHash.put(this.Refers, co);
            }
            return co;
        } else {
            return this.Refers.copy(copyHash, deeply);
        }
    }

    @Override
    public final boolean isGround() {
        if (isCyclic > 0)
            return true;
        return (this.Refers != this) && this.Refers.isGround();
    }

    @Override
    public final String getJavaString() {
        oopsy("unknown reason");
        return (this.unbound()) ? "" : this.Refers.dref().getJavaString();
    }

    /**
     * Returns <code>this</code> if this variable is unbound. Otherwise, returns a
     * Java object that corresponds to the dereferenced term:
     * <code>val.toJava()</code>.
     *
     * @return a Java object defined in <em>Prolog Cafe interoperability with
     *         Java</em>.
     * @see #Refers
     */
    @Override
    public Object javaInstance() {
        if (isCyclic > 0)
            return this;
        return (this.Refers != this) ? this.Refers.javaInstance() : this;
    }

    /* Object */
    /**
     * Checks <em>term equality</em> of two terms. This method returns a
     * <code>boolean</code> whose value is (<code>this == obj</code>) if this
     * variable is unbound. Otherwise, it returns the value of
     * <code>val.equals(obj)</code>.
     *
     * @param obj
     *            the object to compare with. This must be dereferenced.
     * @return <code>true</code> if this (or dereferenced term) is the same as the
     *         argument; <code>false</code> otherwise.
     * @see #Refers
     * @see #compareTo
     */
    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        if (isCyclic > 0)
            return obj == Refers;
        return (this.unbound()) ? this == obj : (this == obj || this.Refers.equalsTerm(obj, comparator));
    }

    @Override
    public int termHashCodeImpl() {
        try {
            return (this.unbound()) ? myID : this.Refers.termHashCode();
        } catch (Exception e) {
            // TODO: handle exception
            return myID;// System.identityHashCode(this);
        }
    }

    /**
     * Returns a string representation of this term if unbound. Otherwise, returns
     * the value of dereferenced term: <code>val.toString()</code>
     *
     * @see #Refers
     */
    int loopPrintingVar = 0;

    @Override
    public void toStringImpl(int printFlags, StringBuilder sb) {
        toString();
        if (isCyclic > 0) {
            // System.out.print(""+variableName());
            sb.append(variableName());
            return;
        }
        if (loopPrintingVar > 0 || this.Refers == null || this.unbound()) {
            sb.append(variableName());
        } else {
            try {
                loopPrintingVar++;
                this.Refers.toQuotedString(printFlags, sb);
            } finally {
                loopPrintingVar--;
            }
        }
    }

    /**
     * If unbound returns empty iterator, otherwise returns the value's iterator.
     */
    @Override
    public Iterator<Term> iterator(boolean skipSyntax) {
        return (this.Refers.isVar()) ? Collections.emptyIterator() : this.Refers.iterator(skipSyntax);
    }

    /* Undoable */
    @Override
    public void undo() {
        // remove self from references of bound variables
        if (this.downRef != null) {
            // do not use downRef.upRef.remove(this), because it uses equals() which is
            // overriden and is not equivalent to ==
            Iterator<VariableTerm> it = this.downRef.upRef.iterator();
            while (it.hasNext()) {
                if (it.next() == this) {
                    it.remove();
                    break;
                }
            }
            this.downRef = null;
        }
        // update references
        updateUpRefNoOccurs(this);
    }

    /* Comparable */
    /**
     * Compares two terms in <em>Prolog standard order of terms</em>.<br>
     * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
     * <code>boolean</code> value as <code>t1.equals(t2)</code>.
     *
     * @param anotherTerm
     *            the term to compare with. It must be dereferenced.
     * @return the value <code>0</code> if two terms are identical; a value less
     *         than <code>0</code> if this term is <em>before</em> the
     *         <code>anotherTerm</code>; and a value greater than <code>0</code> if
     *         this term is <em>after</em> the <code>anotherTerm</code>.
     */
    @Override
    public int compareTo(Term anotherTerm) { // anotherTerm must be dereferenced.
        if (this.Refers != this)
            return this.Refers.compareTo(anotherTerm);
        if (!(anotherTerm.isVar()))
            return BEFORE;
        if (this == anotherTerm)
            return EQUAL;
        int x = this.termHashCode() - anotherTerm.termHashCode();
        if (x != 0)
            return x;
        throw new InternalException("VariableTerm is not unique");
    }

    @Override
    public final boolean isImmutable() {
        return false;
    }

    static int nextID;
    final int myID;
    // Prolog mach;
    public String varName = null;

    public VariableTerm(String sval) {
        this(Prolog.M, sval);
    }

    public VariableTerm(Prolog m, String sval) {
        this.Refers = this;
        this.varName = sval;
        Prolog mach = m;
        this.timeStamp = mach.getCPFTimeStamp();
        this.myID = nextID++;
    }

    public VariableTerm(Prolog mach, long currentChoice, Term newgoals) {
        this.Refers = this;
        this.timeStamp = currentChoice;
        this.myID = nextID++;
        this.getFdata().setGoals(newgoals);
    }

    public VariableTerm(Prolog mach, long currentChoice) {
        this.Refers = this;
        this.timeStamp = currentChoice;
        this.myID = nextID++;
    }

    @Override
    public Term dref() {
        if ((this.unbound()) || !(this.Refers instanceof Term))
            return this;
        return this.Refers.dref();
    }

    // public Term val;

    // @Override
    // public boolean isVar() {
    // return true;
    // }
    //
    // public Var(String... s) {
    // if(s.length>0 && s[0]!=null) {
    // varName = s[0];
    // }
    // myID = ++ termHashCount;
    // val = this;
    // }

    @Override
    public int arityOrType() {
        return Term.VAR;
    }

    @Override
    final public boolean unbound() {
        assert(Refers != null);
        return Refers == this;
    }
    //
    // public Term dref() {
    // return unbound() ? this : val.dref();
    // }

    @Override
    public boolean bindKP(Term x, KPTrail trail) {
        if (x == Refers)
            return true;
        Refers = x;
        trail.push(this);
        return true;
    }

    // public void undo() {
    // val = this;
    // }

    @Override
    public boolean Unify_TO(Term that, KPTrail trail) {
        // expects: this, that are dereferenced
        // return (this==that)?true:Ref.bind_to(that,trail);
        return Refers.bindKP(that, trail);
    }

    public boolean eq(Term x) { // not a term compare!
        return dref() == x.dref();
    }

    @Override
    public String getFAKey() {
        Term t = dref();
        if (t.isVar())
            return null;
        else
            return t.getFAKey();
    }

    @Override
    public Term reaction(Term agent) {

        Term R = agent.action(dref());

        if (!(R.isVar())) {
            R = R.reaction(agent);
        }

        return R;
    }

    // public String name() {
    // return variableName();
    // }
    //
    // public String variableName() {
    // if(varName!=null)
    // return varName+ "_" + Integer.toHexString(termHashCode());
    // return "_" + Integer.toHexString(termHashCode());
    // }

    @Override
    public String pprint() {
        return unbound() ? variableName() : dref().pprint();
    }

    // // public String varName;
    // static int termHashCount = 666;
    // // final int myID;
    // @Override
    // public int termHashCodeImpl() {
    // return myID;
    // }

    @Override
    public boolean equalsTerm(Term aneof) {
        return aneof == this;
    }

}
