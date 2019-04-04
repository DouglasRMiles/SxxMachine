
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
        final Term[] local_aregs = mach.getAreg();
        final JpVar v = Jv(mach);
        mach.setCont(local_aregs, 0, S("$$query", v, S("processGoal", v, local_aregs[1])));
        local_aregs[1] = null;
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
        final Term[] local_aregs = mach.getAreg();
        final Term goal = local_aregs[0].dref();
        final JpVar part1 = Jv(mach);
        final JpVar part2 = Jv(mach);
        if (goal.unifyJP(S(",", part1, part2))) {
            local_aregs[0] = part1.dref();
            local_aregs[1] = S("processGoal", part2.dref(), local_aregs[1]);
            return mach.getCall2();
        }
        local_aregs[0] = goal.dref();
        mach.setCont(local_aregs, 0, local_aregs[1].dref());
        return mach.getCall2();
    }

}
