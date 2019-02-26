
package SxxMachine;

public class pred_test_3 extends Code {

    public static void main(String args[]) throws JPrologScriptException {

        // this is the application
        // before it can call a Prolog goal, it must make and initialise a
        // machine

        PrologMachine M = new PrologMachine();
        new AttvarsModule().load(M);
        // any time a new goal is called, the machine has to be "reset"

        M.initAlways();

        // then you can call the goal

        Term Goal = JpFactory.S(Const.strIntern("test"), JpFactory.JVAR(M), JpFactory.JVAR(M), JpFactory.JVAR(M)); // animal(X)
        System.out.println("Running");
        Term AnswerList = M.solveGoal(Goal);

        // AnswerList is now a list of instances of the Goal
        // you can iterate through it as follows

        Term NextAnswerList, Answer;

        NextAnswerList = AnswerList.dref();
        while (NextAnswerList.isCons()) {
            Answer = (((AFunct) NextAnswerList).args()[0]).dref();
            // do something with the answer - e.g. print it
            String s = Answer.toString();
            System.out.println(s);
            System.out.flush();

            // get the tail of the next answer list
            NextAnswerList = (((AFunct) NextAnswerList).args()[1]).dref();
        }
    }

    static Code entry_code;

    static Code cl1 = new pred_test_3_1();

    static Code freeze3cont;

    static String string0 = Const.strIntern("cut");

    static String conj = Const.strIntern(",");

    static String unify = Const.strIntern("unify");

    static String a = Const.strIntern("a");

    static String b = Const.strIntern("b");

    static String freeze = Const.strIntern("freeze");

    static String or = Const.strIntern("or");

    static String test = Const.strIntern("test");

    static Int posint1 = JpFactory.Long(1);

    static Int posint2 = JpFactory.Long(2);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        freeze3cont = mach.loadPred("freeze", 2);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] machAreg = mach.getAreg();
        Term aregs[] = { machAreg[0], machAreg[1], machAreg[2], machAreg[3] };
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_test_3_1 extends pred_test_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        if (!((areg2).unify(var3)))
            return mach.Fail0;
        // local_aregs[0] = var1.deref();
        // local_aregs[1] = new Funct(unify, var3.deref(), posint1);

        // local_aregs[2] = new Funct(unify,var1.deref(),new Const(a),continuation);
        // local_aregs[2] = new Funct(unify, var2.deref(),new Const(b), new Funct(unify,
        // new Const(a), var1.deref(), continuation));
        // local_aregs[2] = new Funct(or, new Funct(conj, new Funct(
        // freeze, var2.deref(),
        // new Funct(unify, var3.deref(), posint2)), new Funct(unify,
        // var1.deref(), var2.deref())), new Funct(unify, var2.deref(),
        // new Const(b)), new Funct(unify, new Const(a),
        // var1.deref(), continuation));
        mach.updateCUTB(mach.getCurrentChoice());
        local_aregs[1] = null;
        local_aregs[2] = null;
        local_aregs[3] = null;
        local_aregs[0] = JpFactory
                .S("put_attr", var1, JpFactory.CONST(a), JpFactory.S("get_attr", var1, var2, JpFactory
                        .S("put_attr", var1, JpFactory.CONST(b), JpFactory.S("get_attr", var1, var3, JpFactory
                                .S("unify", var1, JpFactory.CONST(a), continuation)))));
        return mach.Call1;
        // return freeze3cont;
    }
}
