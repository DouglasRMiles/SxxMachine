
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

public class pred_call_list_1 extends Code {

    static Code entry_code;
    static Code cl1 = new pred_call_list_1_1();
    static Code cl2 = new pred_call_list_1_2();
    static String string0 = internS("cut");
    static String string1 = internS(".");
    static String string2 = internS("[]");
    static String string3 = internS("call");
    static String string4 = internS("call_list");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(2);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_call_list_1_1 extends pred_call_list_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        if (!((areg0).unifyJP(CONST(string2))))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 1);
        return mach.getCall1();
    }
}

class pred_call_list_1_2 extends pred_call_list_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string1, var1, var2))))
            return mach.Fail0;
        local_aregs.setAreg0((var1.dref()));
        mach.setCont(local_aregs, 1, S(string4, var2.dref(), continuation));
        mach.updateCUTB();
        return mach.getCall2();
    }

}
