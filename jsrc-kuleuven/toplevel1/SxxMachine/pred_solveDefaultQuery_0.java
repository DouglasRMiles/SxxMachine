
package SxxMachine;

public class pred_solveDefaultQuery_0 extends Code {

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        Term[] args = mach.getAreg();
        JpVar v = JpFactory.JVAR(mach);
        args[0] = JpFactory.S("$$query", v, JpFactory.S("processGoal", v, args[1]));
        args[1] = null;
        return mach.Call1;
    }

}

class pred_processGoal_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        Term[] args = mach.getAreg();
        Term goal = args[0].dref();
        JpVar part1 = JpFactory.JVAR(mach);
        JpVar part2 = JpFactory.JVAR(mach);
        if (goal.unify(JpFactory.S(",", part1, part2))) {
            args[0] = part1.dref();
            args[1] = JpFactory.S("processGoal", part2.dref(), args[1]);
            return mach.Call2;
        }
        args[0] = goal.dref();
        args[1] = args[1].dref();
        return mach.Call2;
    }

}
