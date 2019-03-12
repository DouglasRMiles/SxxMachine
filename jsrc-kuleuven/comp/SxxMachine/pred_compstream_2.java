// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_compstream_2_consts {
    Code entry_code;
    Code useInputStream3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("compstream");
    final static String string2 = internS("useInputStream");
    final static String string3 = internS("input");
    final static String string4 = internS("doCompile");
}

public class pred_compstream_2 extends Code {
    private final pred_compstream_2_consts consts;

    public pred_compstream_2() {
        consts = new pred_compstream_2_consts();
        initAlternatives();
    }

    protected pred_compstream_2(pred_compstream_2 c) {
        consts = c.getConsts();
    }

    protected final pred_compstream_2_consts getConsts() {
        return consts;
    }

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
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2)))
            return mach.Fail0;

        local_aregs[0] = CONST(pred_compstream_2_consts.string3);
        local_aregs[1] = var1.dref();

        local_aregs[2] = S(pred_compstream_2_consts.string4, var2.dref(), var3, continuation);
        mach.updateCUTB();
        return getConsts().useInputStream3cont;

    }
}
