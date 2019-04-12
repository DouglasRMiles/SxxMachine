// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_getData_4_consts {
    Code entry_code;
    Code createSet4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("getData");
    final static String string2 = internS("createSet");
    final static String string3 = internS("continuationof");
    final static String string4 = internS("stringof");
    final static String string5 = internS("intof");
    final static String string6 = internS("fixClauses");
    final static String string7 = internS("escapeStrings");
    final static String string8 = internS("unify");
    final static String string9 = internS(".");
    final static String string10 = internS("cut");
}

public class pred_getData_4 extends Code {
    private final pred_getData_4_consts consts;

    public pred_getData_4() {
        consts = new pred_getData_4_consts();
        initAlternatives();
    }

    protected pred_getData_4(pred_getData_4 c) {
        consts = c.getConsts();
    }

    protected final pred_getData_4_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.createSet4cont = mach.loadPred("createSet", 3);
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
        final Term var8 = Jv(mach);
        final Term var7 = Jv(mach);
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
        if (!(areg3.unifyJP(var4)))
            return mach.Fail0;
        local_aregs.areg0 = (var5);

        local_aregs.areg1 = (S(pred_getData_4_consts.string3, var1.dref(), var5.dref()));
        local_aregs.areg2 = (var2.dref());

        mach.setCont(local_aregs, 3, S(pred_getData_4_consts.string2, var5.dref(), S(pred_getData_4_consts.string4, var1
                .dref(), var5.dref()), var6, S(pred_getData_4_consts.string2, var5
                        .dref(), S(pred_getData_4_consts.string5, var1.dref(), var5.dref()), var4
                                .dref(), S(pred_getData_4_consts.string6, var7, var6
                                        .dref(), S(pred_getData_4_consts.string7, var7
                                                .dref(), var8, S(pred_getData_4_consts.string8, S(pred_getData_4_consts.string9, CONST(pred_getData_4_consts.string0), var8
                                                        .dref()), var3.dref(), continuation))))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 4);
        return getConsts().createSet4cont;

    }
}
