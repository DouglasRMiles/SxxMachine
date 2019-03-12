// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Jv;
// S;
// internS;
import static SxxMachine.pterm.TermData.*;

class pred_createSet_3_consts {
    Code entry_code;
    Code findall4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("createSet");
    final static String string2 = internS("findall");
    final static String string3 = internS("list_to_set");
}

public class pred_createSet_3 extends Code {
    private final pred_createSet_3_consts consts;

    public pred_createSet_3() {
        consts = new pred_createSet_3_consts();
        initAlternatives();
    }

    protected pred_createSet_3(pred_createSet_3 c) {
        consts = c.getConsts();
    }

    protected final pred_createSet_3_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.findall4cont = mach.loadPred("findall", 3);
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
        local_aregs[1] = var2.dref();
        local_aregs[2] = var4;

        local_aregs[3] = S(pred_createSet_3_consts.string3, var4.dref(), var3.dref(), continuation);
        mach.updateCUTB();
        return getConsts().findall4cont;

    }
}
