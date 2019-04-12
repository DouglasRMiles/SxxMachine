// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Jv;
// S;
// internS;
import static SxxMachine.pterm.TermData.*;

import java.util.Iterator;

class pred_continuationof_2_consts {
    Code entry_code;
    Code functor4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("continuationof");
    final static String string2 = internS(".");
    final static String string3 = internS(":-");
    final static String string4 = internS("/");
    final static String string5 = internS("functor");
}

public class pred_continuationof_2 extends Code {
    private final pred_continuationof_2_consts consts;

    public pred_continuationof_2() {
        consts = new pred_continuationof_2_consts();
        initAlternatives();
    }

    protected pred_continuationof_2(pred_continuationof_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_continuationof_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_continuationof_2_1(this));
        ALT.addAlternative(new pred_continuationof_2_2(this));

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
        final Term aregs[] = mach.createAregCopy(3);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_continuationof_2_1 extends pred_continuationof_2 {
    pred_continuationof_2_1(pred_continuationof_2 consts) {
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

        final Term arg0 = S(pred_continuationof_2_consts.string2, S(pred_continuationof_2_consts.string3, var1, var2), var3);

        final Term arg1 = S(pred_continuationof_2_consts.string4, var4, var5);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_continuationof_2_consts.string2, S(pred_continuationof_2_consts.string3, var1
                .dref(), var2.dref()), var3.dref()))))
            return mach.Fail0;

        if (!(areg1.unifyJP(S(pred_continuationof_2_consts.string4, var4.dref(), var5.dref()))))
            return mach.Fail0;
        local_aregs.areg0 = (var2.dref());
        local_aregs.areg1 = (var4.dref());
        local_aregs.areg2 = (var5.dref());
        mach.setCont(local_aregs, 3, continuation);
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}

class pred_continuationof_2_2 extends pred_continuationof_2 {
    pred_continuationof_2_2(pred_continuationof_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_continuationof_2_consts.string2, var1, var2);
        final Term arg1 = var3;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_continuationof_2_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        local_aregs.areg0 = (var2.dref());
        local_aregs.areg1 = (var3.dref());
        mach.setCont(local_aregs, 2, continuation);
        mach.updateCUTB();
        return getConsts().entry_code;
    }
}
