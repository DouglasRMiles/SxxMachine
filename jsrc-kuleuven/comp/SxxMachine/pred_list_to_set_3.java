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

class pred_list_to_set_3_consts {
    Code entry_code;
    Code append4cont;
    Code memberchk_eq3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("list_to_set");
    final static String string2 = internS(".");
    final static String string3 = internS("append");
    final static String string4 = internS("[]");
    final static String string5 = internS("memberchk_eq");
    final static String string6 = internS("cut");
    final static String string7 = internS("call");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_list_to_set_3 extends Code {
    private final pred_list_to_set_3_consts consts;

    public pred_list_to_set_3() {
        consts = new pred_list_to_set_3_consts();
        initAlternatives();
    }

    protected pred_list_to_set_3(pred_list_to_set_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_list_to_set_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_list_to_set_3_1(this));
        ALT.addAlternative(new pred_list_to_set_3_2(this));
        ALT.addAlternative(new pred_list_to_set_3_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.append4cont = mach.loadPred("append", 3);
        consts.memberchk_eq3cont = mach.loadPred("memberchk_eq", 2);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_list_to_set_3_1 extends pred_list_to_set_3 {
    pred_list_to_set_3_1(pred_list_to_set_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();

        final Term arg0 = CONST(pred_list_to_set_3_consts.string4);
        final Term arg1 = var1;
        final Term arg2 = var1.dref();
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);

        if (!(areg0.unify(CONST(pred_list_to_set_3_consts.string4))))
            return mach.Fail0;
        if (!(areg1.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_list_to_set_3_2 extends pred_list_to_set_3 {
    pred_list_to_set_3_2(pred_list_to_set_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_list_to_set_3_consts.string2, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        return new Term[] { arg0, arg1, arg2 };
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

        if (!(areg0.unify(S(pred_list_to_set_3_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var4.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var4.dref();

        local_aregs[2] = S(pred_list_to_set_3_consts.string0, new HeapChoice(mach
                .getCUTB()), S(pred_list_to_set_3_consts.string1, var2.dref(), var3.dref(), var4.dref(), continuation));
        mach.updateCUTB();
        local_aregs[3] = null;
        return getConsts().memberchk_eq3cont;
    }
}

class pred_list_to_set_3_3 extends pred_list_to_set_3 {
    pred_list_to_set_3_3(pred_list_to_set_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_list_to_set_3_consts.string2, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_list_to_set_3_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var4.dref())))
            return mach.Fail0;
        local_aregs[0] = var4.dref();

        local_aregs[1] = S(pred_list_to_set_3_consts.string2, var1.dref(), CONST(pred_list_to_set_3_consts.string4));
        local_aregs[2] = var5;

        local_aregs[3] = S(pred_list_to_set_3_consts.string1, var2.dref(), var3.dref(), var5.dref(), continuation);
        mach.updateCUTB();
        return getConsts().append4cont;
    }
}
