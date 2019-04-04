// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_printClauseConstructor_2_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("printClauseConstructor");
    final static String string2 = internS("writel");
    final static String string3 = internS(".");
    final static String string4 = internS("_");
    final static String string5 = internS("(");
    final static String string6 = internS(" consts){");
    final static String string7 = internS("wr");
    final static String string8 = internS("nl");
    final static String string9 = internS("  super(consts);");
    final static String string10 = internS("}");
    final static String string11 = internS("[]");
}

public class pred_printClauseConstructor_2 extends Code {
    private final pred_printClauseConstructor_2_consts consts;

    public pred_printClauseConstructor_2() {
        consts = new pred_printClauseConstructor_2_consts();
        initAlternatives();
    }

    protected pred_printClauseConstructor_2(pred_printClauseConstructor_2 c) {
        consts = c.getConsts();
    }

    protected final pred_printClauseConstructor_2_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.writel2cont = mach.loadPred("writel", 1);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2)))
            return mach.Fail0;

        local_aregs[0] = S(pred_printClauseConstructor_2_consts.string3, var1
                .dref(), S(pred_printClauseConstructor_2_consts.string3, CONST(pred_printClauseConstructor_2_consts.string4), S(pred_printClauseConstructor_2_consts.string3, var2
                        .dref(), S(pred_printClauseConstructor_2_consts.string3, CONST(pred_printClauseConstructor_2_consts.string5), S(pred_printClauseConstructor_2_consts.string3, var1
                                .dref(), S(pred_printClauseConstructor_2_consts.string3, CONST(pred_printClauseConstructor_2_consts.string6), S(pred_printClauseConstructor_2_consts.string3, S(pred_printClauseConstructor_2_consts.string7, CONST(pred_printClauseConstructor_2_consts.string8)), S(pred_printClauseConstructor_2_consts.string3, CONST(pred_printClauseConstructor_2_consts.string9), S(pred_printClauseConstructor_2_consts.string3, S(pred_printClauseConstructor_2_consts.string7, CONST(pred_printClauseConstructor_2_consts.string8)), S(pred_printClauseConstructor_2_consts.string3, CONST(pred_printClauseConstructor_2_consts.string10), S(pred_printClauseConstructor_2_consts.string3, S(pred_printClauseConstructor_2_consts.string7, CONST(pred_printClauseConstructor_2_consts.string8)), S(pred_printClauseConstructor_2_consts.string3, S(pred_printClauseConstructor_2_consts.string7, CONST(pred_printClauseConstructor_2_consts.string8)), CONST(pred_printClauseConstructor_2_consts.string11)))))))))))));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().writel2cont;

    }
}
