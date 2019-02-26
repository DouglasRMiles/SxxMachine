// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

class pred_decl_deref_args_1_consts {
    Code entry_code;
    Code writel2cont;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("decl_deref_args");
    final static String string2 = internS("writel");
    final static String string3 = internS(".");
    final static String string4 = internS("PrologObject areg");
    final static String string5 = internS(" = local_aregs[");
    final static String string6 = internS("].dref() ;");
    final static String string7 = internS("wr");
    final static String string8 = internS("nl");
    final static String string9 = internS("[]");
    final static String string10 = internS("is");
    final static String string11 = internS("-");
    final static String string12 = internS("cut");
    final static NumberTerm posint1 = Integer(1);
    final static NumberTerm negint1 = Integer(-1);
}

public class pred_decl_deref_args_1 extends Code {
    private final pred_decl_deref_args_1_consts consts;

    public pred_decl_deref_args_1() {
        consts = new pred_decl_deref_args_1_consts();
        initAlternatives();
    }

    protected pred_decl_deref_args_1(pred_decl_deref_args_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_decl_deref_args_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_decl_deref_args_1_1(this));
        ALT.addAlternative(new pred_decl_deref_args_1_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.writel2cont = mach.loadPred("writel", 1);
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(2);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_decl_deref_args_1_1 extends pred_decl_deref_args_1 {
    pred_decl_deref_args_1_1(pred_decl_deref_args_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = pred_decl_deref_args_1_consts.negint1;
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();

        if (!(areg0.unify(pred_decl_deref_args_1_consts.negint1)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_decl_deref_args_1_2 extends pred_decl_deref_args_1 {
    pred_decl_deref_args_1_2(pred_decl_deref_args_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;

        local_aregs[0] = S(pred_decl_deref_args_1_consts.string3, CONST(pred_decl_deref_args_1_consts.string4), S(pred_decl_deref_args_1_consts.string3, var1
                .dref(), S(pred_decl_deref_args_1_consts.string3, CONST(pred_decl_deref_args_1_consts.string5), S(pred_decl_deref_args_1_consts.string3, var1
                        .dref(), S(pred_decl_deref_args_1_consts.string3, CONST(pred_decl_deref_args_1_consts.string6), S(pred_decl_deref_args_1_consts.string3, S(pred_decl_deref_args_1_consts.string7, CONST(pred_decl_deref_args_1_consts.string8)), CONST(pred_decl_deref_args_1_consts.string9)))))));

        local_aregs[1] = S(pred_decl_deref_args_1_consts.string10, var2, S(pred_decl_deref_args_1_consts.string11, var1
                .dref(), pred_decl_deref_args_1_consts.posint1), S(pred_decl_deref_args_1_consts.string1, var2
                        .dref(), continuation));
        mach.updateCUTB();
        return getConsts().writel2cont;
    }
}
