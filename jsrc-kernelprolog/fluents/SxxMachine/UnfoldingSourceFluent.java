package SxxMachine;

import java.util.Enumeration;
import java.util.Iterator;

import SxxMachine.pterm.HornClause;


/**
 * For a given clause g= A0:-<Guard>,A1,A2...,An, used as resolvent
 * iterates over its possible unfoldings (LD-resolution steps)
 * with clauses of the form B0:-B1,...,Bm in the default database.
 * For each such step, a new clause (A0:-B1,...,Bm,A2...,An)mgu(A1,B0)
 * is built and returned by the UnfoldingSourceFluent's getElement method.
 * Before the actual unfolding operations, builtins in Guard are executed,
 * possibly providing bindings for some variables or failing.
 * In case of failure of Guard or of unification, getElement() returns null.
 */
public class UnfoldingSourceFluent extends SourceFluent {
    private static final int KernelAgenttracing = 0;
    private int oldtop;
    private Iterator e;
    private HornClause goal;
    private Prog prog;

    /**
     * Creates an UnfoldingSourceFluent based on goal clause g for resolution
     * step in program p
     */
    public UnfoldingSourceFluent(HornClause g, Prog p) {
        super(p);
        this.goal = g;
        this.prog = p;
        this.e = null;
        trace_goal(g);
        reduceProceedures();
        if (null != goal) {
            Term first = goal.getFirst();
            if (null != first) {
                oldtop = prog.getTrail().top();
                this.e = p.getBlackboard().toEnumerationFor(first.getFAKey());
                if (!e.hasNext())
                    trace_nomatch(first);
            }
        } else
            trace_failing(g);
    }

    /**
     * Overrides default trailing by empty action
     */
    @Override
    public void trailMe(Prog p) {
        //IO.mes("not trailing"+this);
    };

    /**
     * Extracts an answer at the end of an AND-derivation
     */
    public HornClause getAnswer() {
        if (null != goal && goal.getBody() instanceof Success)
            return goal.ccopy();
        else
            return null;
    }

    /**
     * Checks if this clause is the last one, allowing LCO
     */
    final public boolean notLastClause() {
        return (null != e) && e.hasNext();
    }

    /**
     * Reduces builtin functions after the neck of a clause, before a "real" atom is unfolded
     */
    final public void reduceProceedures() {
        for (;;) {
            Term first = goal.getFirst();
            if (null == first)
                break; // cannot reduce further
            if (first .isConj()) { // advances to next (possibly) inline builtin
                goal = new HornClause(goal.getHead(), HornClause.appendConj(first, goal.getRest()));
                first = goal.getFirst();
            }

            int ok = first.exec(prog); // (possibly) executes builtin

            switch (ok) {

                case -1: // nothing to do, this is not a builtin
                    break;

                case 1: // builtin suceeds
                    //IO.mes("advancing: "+goal);
                    goal = new HornClause(goal.getHead(), goal.getRest());
                    continue; // advance

                case 0: // builtin fails
                    goal = null;
                    break; // get out

                default: // unexpected code: programming error
                    IO.errmes("Bad return code:" + ok + ") in builtin: " + first);
                    goal = null;
                    break;
            }
            //IO.mes("leaving reduceProceedures: "+goal);
            break; // leaves loop
        }
    }

    /**
     * Returns a new clause by unfolding the goal with a matching
     * clause in the database, or null if no such clause exists.
     */
    @Override
    public Term getElement() {
        if (null == e)
            return null;
        HornClause unfolded_goal = null;
        while (e.hasNext()) {
            Term T = (Term) e.next();
            if (!(T .isClause()))
                continue;
            // resolution step, over goal/resolvent of the form:
            // Answer:-G1,G2,...,Gn.
            prog.getTrail().unwind(oldtop);
            unfolded_goal = T.toClause().unfold_with_goal(goal, prog.getTrail());
            if (null != unfolded_goal)
                break;
        }
        return unfolded_goal;
    }

    /**
     * Stops production of more alternatives by setting the clause enmerator to null
     */
    @Override
    public void stop() {
        e = null;
    }

    /**
     * Tracer on entering g
     */
    final public void trace_goal(HornClause g) {
        switch (KernelAgenttracing) {
            case 2:
                IO.println(">>>: " + g.getFirst());
                break;
            case 3:
                IO.println(">>>: " + g.pprint());
                break;
        }
    }

    /**
     * Tracer on exiting g
     */
    final public void trace_failing(HornClause g) {
        switch (KernelAgenttracing) {
            case 2:
                IO.println("FAILING CALL IN<<<: " + g.getFirst());
                break;
            case 3:
                IO.println("FAILING CALL IN<<<: " + g.pprint());
                break;
        }
    }

    /**
     * Tracer for undefined predicates
     */
    final public void trace_nomatch(Term first) {
        if (KernelAgenttracing > 0) {
            IO.println("*** UNDEFINED CALL: " + first.pprint());
        }
    }

    /**
     * Returns a string representation of this unfolder, based
     * on the original clause it is based on.
     */
    /*
    public String toString() {
        return(null==goal)?"{UnfoldingSourceFluent}":"{UnfoldingSourceFluent=> "+goal.pprint()+"}";
    }
    */
}
