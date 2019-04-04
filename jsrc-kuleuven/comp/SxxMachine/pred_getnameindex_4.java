// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Integer;
import static SxxMachine.pterm.TermData.*;

import java.util.Iterator;

class pred_getnameindex_4_consts {
    Code entry_code;
    Code inc3cont;
    Code escapeFunctor3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("getnameindex");
    final static String string2 = internS(".");
    final static String string3 = internS("inc");
    final static String string4 = internS("escapeFunctor");
    final static String string5 = internS("cut");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_getnameindex_4 extends Code {
    private final pred_getnameindex_4_consts consts;

    public pred_getnameindex_4() {
        consts = new pred_getnameindex_4_consts();
        initAlternatives();
    }

    protected pred_getnameindex_4(pred_getnameindex_4 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_getnameindex_4_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_getnameindex_4_1(this));
        ALT.addAlternative(new pred_getnameindex_4_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.inc3cont = mach.loadPred("inc", 2);
        consts.escapeFunctor3cont = mach.loadPred("escapeFunctor", 2);
    }

    @Override
    public int arity() {
        return 4;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(5);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_getnameindex_4_1 extends pred_getnameindex_4 {
    pred_getnameindex_4_1(pred_getnameindex_4 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_getnameindex_4_consts.string2, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        final Term arg3 = var4.dref();
        return new Term[] { arg0, arg1, arg2, arg3 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 4);
        final Term areg3 = local_aregs[3].dref();
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_getnameindex_4_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;
        if (!(areg3.unifyJP(var4.dref())))
            return mach.Fail0;
        local_aregs[0] = var3.dref();
        local_aregs[1] = var1.dref();

        mach.setCont(local_aregs, 2, S(pred_getnameindex_4_consts.string0, new HeapChoice(
                mach.getCUTB()), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 4, 3);
        return getConsts().escapeFunctor3cont;
    }
}

class pred_getnameindex_4_2 extends pred_getnameindex_4 {
    pred_getnameindex_4_2(pred_getnameindex_4 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var5 = new DummyVar();

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_getnameindex_4_consts.string2, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        final Term arg3 = var5;
        return new Term[] { arg0, arg1, arg2, arg3 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 4);
        final Term areg3 = local_aregs[3].dref();
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_getnameindex_4_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;
        if (!(areg3.unifyJP(var5.dref())))
            return mach.Fail0;
        local_aregs[0] = var6;
        local_aregs[1] = var4.dref();

        mach.setCont(local_aregs, 2, S(pred_getnameindex_4_consts.string1, var2.dref(), var3.dref(), var6.dref(), var5
                .dref(), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 4, 3);
        return getConsts().inc3cont;
    }
}
