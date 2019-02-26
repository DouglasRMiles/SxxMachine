// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_readprogram_1_consts {
    Code entry_code;
    Code read2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("readprogram");
    final static String string2 = Const.strIntern("read");
    final static String string3 = Const.strIntern("processfile");
}

public class pred_readprogram_1 extends Code {
    private final pred_readprogram_1_consts consts;

    public pred_readprogram_1() {
        consts = new pred_readprogram_1_consts();
        initAlternatives();
    }

    protected pred_readprogram_1(pred_readprogram_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_readprogram_1_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.read2cont = mach.loadPred("read", 1);
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
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        local_aregs[0] = var2;
        local_aregs[1] = JpFactory.S(getConsts().string3, var2.dref(), var1.dref(), continuation);
        mach.updateCUTB();
        return getConsts().read2cont;

    }
}
