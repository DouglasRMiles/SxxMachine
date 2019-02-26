// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_modulefile_1_consts {
    Code entry_code;
    Code modulename2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("modulefile");
    final static String string2 = Const.strIntern("modulename");
    final static String string3 = Const.strIntern("nb_current");
    final static String string4 = Const.strIntern("targetfolder");
    final static String string5 = Const.strIntern("concat");
    final static String string6 = Const.strIntern(".java");
}

public class pred_modulefile_1 extends Code {
    private final pred_modulefile_1_consts consts;

    public pred_modulefile_1() {
        consts = new pred_modulefile_1_consts();
        initAlternatives();
    }

    protected pred_modulefile_1(pred_modulefile_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_modulefile_1_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.modulename2cont = mach.loadPred("modulename", 1);
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
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        local_aregs[0] = var2;
        local_aregs[1] = JpFactory.S(getConsts().string3, JpFactory.CONST(getConsts().string4), var3, JpFactory
                .S(getConsts().string5, var3.dref(), var2.dref(), var4, JpFactory.S(getConsts().string5, var4
                        .dref(), JpFactory.CONST(getConsts().string6), var1.dref(), continuation)));
        mach.updateCUTB();
        return getConsts().modulename2cont;

    }
}
