// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Jv;
import static SxxMachine.pterm.TermData.*;

class pred_samepred_2_consts {
    Code entry_code;
    Code functor4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("samepred");
    final static String string2 = internS(":-");
    final static String string3 = internS(".");
    final static String string4 = internS("functor");
}

public class pred_samepred_2 extends Code {
    private final pred_samepred_2_consts consts;

    public pred_samepred_2() {
        consts = new pred_samepred_2_consts();
        initAlternatives();
    }

    protected pred_samepred_2(pred_samepred_2 c) {
        consts = c.getConsts();
    }

    protected final pred_samepred_2_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.functor4cont = mach.loadPred("functor", 3);
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
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_samepred_2_consts.string2, var1, var2))))
            return mach.Fail0;

        if (!(areg1.unifyJP(S(pred_samepred_2_consts.string3, S(pred_samepred_2_consts.string2, var3, var4), var5))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var6;
        local_aregs[2] = var7;

        local_aregs[3] = S(pred_samepred_2_consts.string4, var3.dref(), var6.dref(), var7.dref(), continuation);
        mach.updateCUTB();
        return getConsts().functor4cont;

    }
}
