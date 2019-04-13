// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_disableIndexing_1_consts {
    Code entry_code;
    Code concat_atom3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("disableIndexing");
    final static String string2 = internS("concat_atom");
    final static String string3 = internS(".");
    final static String string4 = internS("DISABLE_INDEXING_");
    final static String string5 = internS("[]");
    final static String string6 = internS("b_setval");
    final static String string7 = internS("true");
    final static String string8 = internS("log");
    final static String string9 = internS("DISABLE INDEXING ENABLED for ");
}

public class pred_disableIndexing_1 extends Code {
    private final pred_disableIndexing_1_consts consts;

    public pred_disableIndexing_1() {
        consts = new pred_disableIndexing_1_consts();
        initAlternatives();
    }

    protected pred_disableIndexing_1(pred_disableIndexing_1 c) {
        consts = c.getConsts();
    }

    protected final pred_disableIndexing_1_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.concat_atom3cont = mach.loadPred("concat_atom", 2);
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

        local_aregs.setAreg0((S(pred_disableIndexing_1_consts.string3, CONST(pred_disableIndexing_1_consts.string4), S(pred_disableIndexing_1_consts.string3, var1
                .dref(), CONST(pred_disableIndexing_1_consts.string5)))));
        local_aregs.setAreg1((var2));

        mach.setCont(local_aregs, 2, S(pred_disableIndexing_1_consts.string6, var2
                .dref(), CONST(pred_disableIndexing_1_consts.string7), S(pred_disableIndexing_1_consts.string8, S(pred_disableIndexing_1_consts.string3, CONST(pred_disableIndexing_1_consts.string9), S(pred_disableIndexing_1_consts.string3, var1
                        .dref(), CONST(pred_disableIndexing_1_consts.string5))), continuation)));
        mach.updateCUTB();
        return getConsts().concat_atom3cont;

    }
}
