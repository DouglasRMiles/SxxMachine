// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_comp_3_consts {
    Code entry_code;
    Code b_setval3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("comp");
    final static String string2 = internS("b_setval");
    final static String string3 = internS("package");
    final static String string4 = internS("module");
    final static String string5 = internS("see");
    final static String string6 = internS("doCompile");
    final static String string7 = internS(".");
}

public class pred_comp_3 extends Code {
    private final pred_comp_3_consts consts;

    public pred_comp_3() {
        consts = new pred_comp_3_consts();
        initAlternatives();
    }

    protected pred_comp_3(pred_comp_3 c) {
        consts = c.getConsts();
    }

    protected final pred_comp_3_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.b_setval3cont = mach.loadPred("b_setval", 2);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2)))
            return mach.Fail0;
        if (!(areg2.unifyJP(var3)))
            return mach.Fail0;

        local_aregs.setAV(0,CONST(pred_comp_3_consts.string3));
        local_aregs.setAV(1,var2.dref());

        mach.setCont(local_aregs, 2, S(pred_comp_3_consts.string2, CONST(pred_comp_3_consts.string4), var3
                .dref(), S(pred_comp_3_consts.string5, var1
                        .dref(), S(pred_comp_3_consts.string6, CONST(pred_comp_3_consts.string7), var4, continuation))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3);
        return getConsts().b_setval3cont;

    }
}
