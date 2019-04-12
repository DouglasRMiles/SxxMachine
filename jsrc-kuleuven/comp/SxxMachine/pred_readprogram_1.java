// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Jv;
import static SxxMachine.pterm.TermData.*;

class pred_readprogram_1_consts {
    Code entry_code;
    Code read2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("readprogram");
    final static String string2 = internS("read");
    final static String string3 = internS("processfile");
}

public class pred_readprogram_1 extends Code {
    private final pred_readprogram_1_consts consts;

    public pred_readprogram_1() {
        consts = new pred_readprogram_1_consts();
        initAlternatives();
    }

    protected pred_readprogram_1(pred_readprogram_1 c) {
        consts = c.getConsts();
    }

    protected final pred_readprogram_1_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.read2cont = mach.loadPred("read", 1);
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        local_aregs.areg0 = (var2);

        mach.setCont(local_aregs, 1, S(pred_readprogram_1_consts.string3, var2.dref(), var1.dref(), continuation));
        mach.updateCUTB();
        return getConsts().read2cont;

    }
}
