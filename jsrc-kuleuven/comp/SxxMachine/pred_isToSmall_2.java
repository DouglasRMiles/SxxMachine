// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Integer;
import static SxxMachine.pterm.TermData.*;

import java.util.Iterator;

class pred_isToSmall_2_consts {
    Code entry_code;
    Code maxClauses3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("isToSmall");
    final static String string2 = internS("maxClauses");
    final static String string3 = internS("call");
    final static NumberTerm posint5 = Integer(5);
    final static NumberTerm posint0 = Integer(0);
}

public class pred_isToSmall_2 extends Code {
    private final pred_isToSmall_2_consts consts;

    public pred_isToSmall_2() {
        consts = new pred_isToSmall_2_consts();
        initAlternatives();
    }

    protected pred_isToSmall_2(pred_isToSmall_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_isToSmall_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_isToSmall_2_1(this));
        ALT.addAlternative(new pred_isToSmall_2_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.maxClauses3cont = mach.loadPred("maxClauses", 2);
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

class pred_isToSmall_2_1 extends pred_isToSmall_2 {
    pred_isToSmall_2_1(pred_isToSmall_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();
        final Term arg0 = var1;

        final Term arg1 = pred_isToSmall_2_consts.posint0;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;

        if (!(areg1.unifyJP(pred_isToSmall_2_consts.posint0)))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2, 1);
        return mach.getCall1();
    }
}

class pred_isToSmall_2_2 extends pred_isToSmall_2 {
    pred_isToSmall_2_2(pred_isToSmall_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());

        local_aregs.setAV(1,pred_isToSmall_2_consts.posint5);
        mach.setCont(local_aregs, 2, continuation);
        mach.updateCUTB();
        return getConsts().maxClauses3cont;
    }
}
