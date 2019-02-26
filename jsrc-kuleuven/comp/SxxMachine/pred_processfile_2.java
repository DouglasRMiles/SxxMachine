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

class pred_processfile_2_consts {
    Code entry_code;
    Code readprogram2cont;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("processfile");
    final static String string2 = internS(".");
    final static String string3 = internS("readprogram");
    final static String string4 = internS("end_of_file");
    final static String string5 = internS("[]");
    final static String string6 = internS("cut");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_processfile_2 extends Code {
    private final pred_processfile_2_consts consts;

    public pred_processfile_2() {
        consts = new pred_processfile_2_consts();
        initAlternatives();
    }

    protected pred_processfile_2(pred_processfile_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_processfile_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_processfile_2_1(this));
        ALT.addAlternative(new pred_processfile_2_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.readprogram2cont = mach.loadPred("readprogram", 1);
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

class pred_processfile_2_1 extends pred_processfile_2 {
    pred_processfile_2_1(pred_processfile_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = CONST(pred_processfile_2_consts.string4);

        final Term arg1 = CONST(pred_processfile_2_consts.string5);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();

        if (!(areg0.unify(CONST(pred_processfile_2_consts.string4))))
            return mach.Fail0;

        if (!(areg1.unify(CONST(pred_processfile_2_consts.string5))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_processfile_2_2 extends pred_processfile_2 {
    pred_processfile_2_2(pred_processfile_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();
        final Term arg0 = var1;

        final Term arg1 = S(pred_processfile_2_consts.string2, var1.dref(), var2);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_processfile_2_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().readprogram2cont;
    }
}
