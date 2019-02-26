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
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[4];
        final Term areg3 = local_aregs[3].dref();
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        if (!(areg2.unify(var3)))
            return mach.Fail0;
        if (!(areg3.unify(var4)))
            return mach.Fail0;

        local_aregs[0] = CONST(pred_compstreamModule_4_consts.string3);
        local_aregs[1] = var3.dref();

        local_aregs[2] = S(pred_compstreamModule_4_consts.string2, CONST(pred_compstreamModule_4_consts.string4), var4
                .dref(), S(pred_compstreamModule_4_consts.string5, CONST(pred_compstreamModule_4_consts.string6), var1
                        .dref(), S(pred_compstreamModule_4_consts.string7, var2
                                .dref(), var5, S(pred_compstreamModule_4_consts.string8, var5.dref(), continuation))));
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = null;
        return getConsts().b_setval3cont;

    }
}
