// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_compstream_2_consts {
    Code entry_code;
    Code useInputStream3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("compstream");
    final static String string2 = Const.strIntern("useInputStream");
    final static String string3 = Const.strIntern("input");
    final static String string4 = Const.strIntern("doCompile");
}

public class pred_compstream_2 extends Code {
    private final pred_compstream_2_consts consts;

    public pred_compstream_2() {
        consts = new pred_compstream_2_consts();
        initAlternatives();
    }

    protected pred_compstream_2(pred_compstream_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_compstream_2_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.useInputStream3cont = mach.loadPred("useInputStream", 2);
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
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        local_aregs[0] = JpFactory.CONST(getConsts().string3);
        local_aregs[1] = var1.dref();
        local_aregs[2] = JpFactory.S(getConsts().string4, var2.dref(), var3, continuation);
        mach.updateCUTB();
        return getConsts().useInputStream3cont;

    }
}
