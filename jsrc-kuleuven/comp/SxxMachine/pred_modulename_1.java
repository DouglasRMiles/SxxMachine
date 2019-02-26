// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_modulename_1_consts {
    Code entry_code;
    Code nb_current3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("modulename");
    final static String string2 = Const.strIntern("nb_current");
    final static String string3 = Const.strIntern("module");
}

public class pred_modulename_1 extends Code {
    private final pred_modulename_1_consts consts;

    public pred_modulename_1() {
        consts = new pred_modulename_1_consts();
        initAlternatives();
    }

    protected pred_modulename_1(pred_modulename_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_modulename_1_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.nb_current3cont = mach.loadPred("nb_current", 2);
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        local_aregs[0] = JpFactory.CONST(getConsts().string3);
        local_aregs[1] = var1.dref();
        local_aregs[2] = continuation;
        mach.updateCUTB();
        return getConsts().nb_current3cont;

    }
}
