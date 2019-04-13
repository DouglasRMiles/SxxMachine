// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_genFileName_2_consts {
    Code entry_code;
    Code nb_current3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("genFileName");
    final static String string2 = internS("nb_current");
    final static String string3 = internS("targetfolder");
    final static String string4 = internS("makename");
    final static String string5 = internS(".");
    final static String string6 = internS("/");
    final static String string7 = internS(".java");
    final static String string8 = internS("[]");
}

public class pred_genFileName_2 extends Code {
    private final pred_genFileName_2_consts consts;

    public pred_genFileName_2() {
        consts = new pred_genFileName_2_consts();
        initAlternatives();
    }

    protected pred_genFileName_2(pred_genFileName_2 c) {
        consts = c.getConsts();
    }

    protected final pred_genFileName_2_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.nb_current3cont = mach.loadPred("nb_current", 2);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2)))
            return mach.Fail0;

        local_aregs.setAreg0((CONST(pred_genFileName_2_consts.string3)));
        local_aregs.setAreg1((var3));

        mach.setCont(local_aregs, 2, S(pred_genFileName_2_consts.string4, S(pred_genFileName_2_consts.string5, var3
                .dref(), S(pred_genFileName_2_consts.string5, CONST(pred_genFileName_2_consts.string6), S(pred_genFileName_2_consts.string5, var1
                        .dref(), S(pred_genFileName_2_consts.string5, CONST(pred_genFileName_2_consts.string7), CONST(pred_genFileName_2_consts.string8))))), var2
                                .dref(), continuation));
        mach.updateCUTB();
        return getConsts().nb_current3cont;

    }
}
