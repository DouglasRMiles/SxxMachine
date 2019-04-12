// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_compstreamModule_4_consts {
    Code entry_code;
    Code b_setval3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("compstreamModule");
    final static String string2 = internS("b_setval");
    final static String string3 = internS("package");
    final static String string4 = internS("module");
    final static String string5 = internS("useInputStream");
    final static String string6 = internS("input");
    final static String string7 = internS("doCompiler");
    final static String string8 = internS("genmodule");
}

public class pred_compstreamModule_4 extends Code {
    private final pred_compstreamModule_4_consts consts;

    public pred_compstreamModule_4() {
        consts = new pred_compstreamModule_4_consts();
        initAlternatives();
    }

    protected pred_compstreamModule_4(pred_compstreamModule_4 c) {
        consts = c.getConsts();
    }

    protected final pred_compstreamModule_4_consts getConsts() {
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
        return 4;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 4);
        final Term areg3 = local_aregs.getTermDRef(3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var5 = Jv(mach);
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
        if (!(areg3.unifyJP(var4)))
            return mach.Fail0;

        local_aregs.setAV(0, CONST(pred_compstreamModule_4_consts.string3));
        local_aregs.setAV(1, var3.dref());

        mach.setCont(local_aregs, 2, S(pred_compstreamModule_4_consts.string2, CONST(pred_compstreamModule_4_consts.string4), var4
                .dref(), S(pred_compstreamModule_4_consts.string5, CONST(pred_compstreamModule_4_consts.string6), var1
                        .dref(), S(pred_compstreamModule_4_consts.string7, var2
                                .dref(), var5, S(pred_compstreamModule_4_consts.string8, var5.dref(), continuation)))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 4, 3);
        return getConsts().b_setval3cont;

    }
}
