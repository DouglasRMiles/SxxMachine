// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_name_nil_ok_2_consts {
    Code entry_code;
    Code atom_codes3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("name_nil_ok");
    final static String string2 = Const.strIntern("atom_codes");
    final static String string3 = Const.strIntern("cut");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_name_nil_ok_2 extends Code {
    private final pred_name_nil_ok_2_consts consts;

    public pred_name_nil_ok_2() {
        consts = new pred_name_nil_ok_2_consts();
        initAlternatives();
    }

    protected pred_name_nil_ok_2(pred_name_nil_ok_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_name_nil_ok_2_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.atom_codes3cont = mach.loadPred("atom_codes", 2);
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
        local_aregs[2] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), continuation);
        mach.updateCUTB();
        return getConsts().atom_codes3cont;

    }
}
