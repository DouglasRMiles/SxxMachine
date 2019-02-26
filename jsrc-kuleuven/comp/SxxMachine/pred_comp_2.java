// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_comp_2_consts {
    Code entry_code;
    Code comp4cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("comp");
    final static String string2 = Const.strIntern("NewModule");
}

public class pred_comp_2 extends Code {
    private final pred_comp_2_consts consts;

    public pred_comp_2() {
        consts = new pred_comp_2_consts();
        initAlternatives();
    }

    protected pred_comp_2(pred_comp_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_comp_2_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.comp4cont = mach.loadPred("comp", 3);
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
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var2.dref();
        local_aregs[2] = JpFactory.CONST(getConsts().string2);
        local_aregs[3] = continuation;
        mach.updateCUTB();
        return getConsts().comp4cont;

    }
}
