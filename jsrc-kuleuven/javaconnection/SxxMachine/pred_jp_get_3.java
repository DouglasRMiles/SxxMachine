
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

public class pred_jp_get_3 extends Code {
    static Code entry_code;
    static Code univ4cont;
    static String string0 = internS("cut");
    static String string1 = internS("jp_get");
    static String string2 = internS("univ");
    static String string3 = internS("[]");
    static String string4 = internS("jp_call");
    static String string5 = internS("not");
    static String string6 = internS("jp_exception");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        univ4cont = mach.loadPred("univ", 3);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1.dref())))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2.dref())))
            return mach.Fail0;
        if (!((areg2).unifyJP(var3.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var4);
        local_aregs.setAV(1,var2.dref());
        local_aregs.setAV(2,CONST(string3));
        mach.setCont(local_aregs, 3, S(string4, var1.dref(), var4.dref(), var3
                .dref(), var5, S(string5, S(string6, var5.dref(), var6, var7), continuation)));
        mach.updateCUTB();
        return univ4cont;
    }
}
