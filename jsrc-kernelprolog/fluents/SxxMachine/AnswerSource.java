package SxxMachine;

import java.util.Stack;
import SxxMachine.pterm.*;
import static SxxMachine.pterm.TermData.*;

import SxxMachine.pterm.HornClause;

/**
  Basic toplevel Prolog Engine. Loads and executes Prolog
  programs and spawns threads executing on new Prolog Engine
  objects as well as networking threads and
  synchronized local and remote Linda transactions
*/
public class AnswerSource extends SourceFluent implements Runnable, IProg {
    // CONSTRUCTORS

    private int oldTop;

    /**
      Creates a IKernel starting execution with argument "goal"
    */
    public AnswerSource(HornClause goal, Prog parent) {
        super(parent);
        this.parent = parent;
        this.blackboard = parent.getBlackboard();
        goal = goal.ccopy();
        this.trail = new KPTrail();
        this.oldTop = trail.top();
        this.orStack = new Stack();
        if (null != goal)
            orStack.push(new UnfoldingSourceFluent(goal, (Prog) (Object) this));
    }

    // INSTANCE FIELDS

    private Trail trail;
    private Stack orStack;
    private Prog parent;
    private BlackBoard blackboard;

    public final Trail getTrail() {
        return trail;
    }

    public final Prog getParent() {
        return parent;
    }

    public final BlackBoard getBlackboard() {
        return blackboard;
    }

    // INSTANCE METHODS

    @Override
    public Term getElement() {
        if (null == orStack)
            return null;
        HornClause answer = null;
        while (!orStack.isEmpty()) {
            UnfoldingSourceFluent I = (UnfoldingSourceFluent) orStack.pop();
            answer = I.getAnswer();
            if (null != answer)
                break;
            HornClause goal = (HornClause) I.getElement();
            if (null != goal) {
                if (I.notLastClause())
                    orStack.push(I);
                else
                    I.stop();
                if (null == answer)
                    orStack.push(new UnfoldingSourceFluent(goal, (Prog) (Object) this));
            }
        }
        Term head;
        if (null == answer) {
            head = null;
            stop();
        } else
            head = answer.getHead();
        return head;
    }

    @Override
    public void stop() {
        if (null != trail) {
            trail.unwind(oldTop);
            trail = null;
        }
        orStack = null;
    }

    @Override
    public void run() {
        for (;;) {
            Term Answer = getElement();
            if (null == Answer)
                break;
        }
    }
}