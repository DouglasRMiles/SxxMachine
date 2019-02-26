
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

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
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(CONST(string2))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_call_list_1_2 extends pred_call_list_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unify(S(string1, var1, var2))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = S(string4, var2.dref(), continuation);
        mach.updateCUTB();
        return mach.Call2;
    }

}
