// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_samepred_2_consts {
    Code entry_code;
    Code functor4cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("samepred");
    final static String string2 = Const.strIntern(":-");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("functor");
}

public class pred_samepred_2 extends Code {
    private final pred_samepred_2_consts consts;

    public pred_samepred_2() {
        consts = new pred_samepred_2_consts();
        initAlternatives();
    }

    protected pred_samepred_2(pred_samepred_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_samepred_2_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.functor4cont = mach.loadPred("functor", 3);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var7 = JpFactory.JVAR(mach);
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string2, var1, var2))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string3, JpFactory.S(getConsts().string2, var3, var4), var5))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var6;
        local_aregs[2] = var7;
        local_aregs[3] = JpFactory.S(getConsts().string4, var3.dref(), var6.dref(), var7.dref(), continuation);
        mach.updateCUTB();
        return getConsts().functor4cont;

    }
}
