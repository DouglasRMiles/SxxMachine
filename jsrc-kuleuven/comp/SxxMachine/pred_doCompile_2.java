// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_doCompile_2_consts {
    Code entry_code;
    Code use_module2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("doCompile");
    final static String string2 = internS("use_module");
    final static String string3 = internS("SxxMachine.BuiltinsModule");
    final static String string4 = internS("globalvars.GlobalVarsModule");
    final static String string5 = internS("b_setval");
    final static String string6 = internS("targetfolder");
    final static String string7 = internS("readprogram");
    final static String string8 = internS("seen");
    final static String string9 = internS("eliminate_disjuctions_in_clauses");
    final static String string10 = internS("fixClauses");
    final static String string11 = internS("unify");
    final static String string12 = internS("[]");
    final static String string13 = internS("binarize_clauses");
    final static String string14 = internS("genjava");
}

public class pred_doCompile_2 extends Code {
    private final pred_doCompile_2_consts consts;

    public pred_doCompile_2() {
        consts = new pred_doCompile_2_consts();
        initAlternatives();
    }

    protected pred_doCompile_2(pred_doCompile_2 c) {
        consts = c.getConsts();
    }

    protected final pred_doCompile_2_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.use_module2cont = mach.loadPred("use_module", 1);
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

        local_aregs[0] = CONST(pred_doCompile_2_consts.string3);

        mach.setCont(local_aregs, 1, S(pred_doCompile_2_consts.string2, CONST(pred_doCompile_2_consts.string4), S(pred_doCompile_2_consts.string5, CONST(pred_doCompile_2_consts.string6), var1
                .dref(), S(pred_doCompile_2_consts.string7, var3, S(pred_doCompile_2_consts.string8, S(pred_doCompile_2_consts.string9, var3
                        .dref(), var4, S(pred_doCompile_2_consts.string10, var3
                                .dref(), var5, S(pred_doCompile_2_consts.string11, CONST(pred_doCompile_2_consts.string12), var6, S(pred_doCompile_2_consts.string13, var5
                                        .dref(), var6.dref(), var2.dref(), S(pred_doCompile_2_consts.string14, var2
                                                .dref(), continuation))))))))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().use_module2cont;

    }
}
