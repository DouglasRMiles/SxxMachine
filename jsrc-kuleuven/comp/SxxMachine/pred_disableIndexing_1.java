// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_disableIndexing_1_consts {
    Code entry_code;
    Code concat_atom3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("disableIndexing");
    final static String string2 = Const.strIntern("concat_atom");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("DISABLE_INDEXING_");
    final static String string5 = Const.strIntern("[]");
    final static String string6 = Const.strIntern("b_setval");
    final static String string7 = Const.strIntern("true");
    final static String string8 = Const.strIntern("log");
    final static String string9 = Const.strIntern("DISABLE INDEXING ENABLED for ");
}

public class pred_disableIndexing_1 extends Code {
    private final pred_disableIndexing_1_consts consts;

    public pred_disableIndexing_1() {
        consts = new pred_disableIndexing_1_consts();
        initAlternatives();
    }

    protected pred_disableIndexing_1(pred_disableIndexing_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_disableIndexing_1_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.concat_atom3cont = mach.loadPred("concat_atom", 2);
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
        local_aregs[0] = JpFactory.S(getConsts().string3, JpFactory.CONST(getConsts().string4), JpFactory
                .S(getConsts().string3, var1.dref(), JpFactory.CONST(getConsts().string5)));
        local_aregs[1] = var2;
        local_aregs[2] = JpFactory
                .S(getConsts().string6, var2.dref(), JpFactory.CONST(getConsts().string7), JpFactory
                        .S(getConsts().string8, JpFactory
                                .S(getConsts().string3, JpFactory.CONST(getConsts().string9), JpFactory
                                        .S(getConsts().string3, var1.dref(), JpFactory
                                                .CONST(getConsts().string5))), continuation));
        mach.updateCUTB();
        return getConsts().concat_atom3cont;

    }
}
