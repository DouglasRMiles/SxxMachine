// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_doAdd_3_consts {
    Code entry_code;
    Code univ4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("doAdd");
    final static String string2 = internS("univ");
    final static String string3 = internS("append");
    final static String string4 = internS(".");
    final static String string5 = internS("[]");
}

public class pred_doAdd_3 extends Code {
    private final pred_doAdd_3_consts consts;

    public pred_doAdd_3() {
        consts = new pred_doAdd_3_consts();
    }

    protected pred_doAdd_3(pred_doAdd_3 c) {
        consts = c.consts;
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.univ4cont = mach.loadPred("univ", 3);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var6 = Jv(mach);
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
        local_aregs[0] = var1.dref();
        local_aregs[1] = var4;
        local_aregs[2] = var5;

        local_aregs[3] = S(pred_doAdd_3_consts.string3, var5.dref(), S(pred_doAdd_3_consts.string4, var2
                .dref(), CONST(pred_doAdd_3_consts.string5)), var6, S(pred_doAdd_3_consts.string2, var3
                        .dref(), var4.dref(), var6.dref(), continuation));
        mach.updateCUTB();
        return consts.univ4cont;

    }
}
