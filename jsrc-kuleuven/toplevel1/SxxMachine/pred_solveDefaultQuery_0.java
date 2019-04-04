
package SxxMachine;

// Jv;
import static SxxMachine.pterm.TermData.*;

public class pred_solveDefaultQuery_0 extends Code {

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        final Term[] args = mach.getAreg();
        final JpVar v = Jv(mach);
        args[0] = S("$$query", v, S("processGoal", v, args[1]));
        args[1] = null;
        return mach.getCall1();
    }

}

class pred_processGoal_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        final Term[] args = mach.getAreg();
        final Term goal = args[0].dref();
        final JpVar part1 = Jv(mach);
        final JpVar part2 = Jv(mach);
        if (goal.unifyJP(S(",", part1, part2))) {
            args[0] = part1.dref();
            args[1] = S("processGoal", part2.dref(), args[1]);
            return mach.getCall2();
        }
        args[0] = goal.dref();
        args[1] = args[1].dref();
        return mach.getCall2();
    }

}
