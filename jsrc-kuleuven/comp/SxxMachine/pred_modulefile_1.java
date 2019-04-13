// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_modulefile_1_consts {
    Code entry_code;
    Code modulename2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("modulefile");
    final static String string2 = internS("modulename");
    final static String string3 = internS("nb_current");
    final static String string4 = internS("targetfolder");
    final static String string5 = internS("concat");
    final static String string6 = internS(".java");
}

public class pred_modulefile_1 extends Code {
    private final pred_modulefile_1_consts consts;

    public pred_modulefile_1() {
        consts = new pred_modulefile_1_consts();
        initAlternatives();
    }

    protected pred_modulefile_1(pred_modulefile_1 c) {
        consts = c.getConsts();
    }

    protected final pred_modulefile_1_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.modulename2cont = mach.loadPred("modulename", 1);
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
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        local_aregs.setAreg0((var2));

        mach.setCont(local_aregs, 1, S(pred_modulefile_1_consts.string3, CONST(pred_modulefile_1_consts.string4), var3, S(pred_modulefile_1_consts.string5, var3
                .dref(), var2.dref(), var4, S(pred_modulefile_1_consts.string5, var4
                        .dref(), CONST(pred_modulefile_1_consts.string6), var1.dref(), continuation))));
        mach.updateCUTB();
        return getConsts().modulename2cont;

    }
}
