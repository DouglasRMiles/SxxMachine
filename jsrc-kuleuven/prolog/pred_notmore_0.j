// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package be.kuleuven.jProlog;

import java.util.*;

class pred_notmore_0_consts {
    Code entry_code;
    Code get02cont;
    final static String string0 = "cut".intern();
    final static String string1 = "notmore".intern();
    final static String string2 = "call".intern();
    final static String string3 = "get0".intern();
    final static String string4 = "noteq".intern();
    final static String string5 = "cut".intern();
    final static String string6 = "untilend".intern();
    final static String string7 = "fail".intern();
    final static Int posint10 = new Int(10);
    final static Int posint1 = new Int(1);
}

public class pred_notmore_0 extends Code {
    private final pred_notmore_0_consts consts;

    public pred_notmore_0() {
        consts = new pred_notmore_0_consts();
        initAlternatives();
    }

    protected pred_notmore_0(pred_notmore_0 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_notmore_0_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_notmore_0_1(this));
        ALT.addAlternative(new pred_notmore_0_2(this));

    }

    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.get02cont = mach.loadPred("get0", 1);
    }

    @Override
    public int arity() {
        return 0;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        PrologObject aregs[] = mach.createAregCopy(1);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_notmore_0_1 extends pred_notmore_0 {
    pred_notmore_0_1(pred_notmore_0 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected PrologObject[] getArgs() {

        PrologObject var1 = new DummyVar();
        return new PrologObject[] {};
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        PrologObject local_aregs[] = mach.getAreg();
        PrologObject continuation = local_aregs[0];
        PrologObject var1 = new Var(mach);
        local_aregs[0] = var1;
        local_aregs[1] = new StructureTerm(getConsts().string4, var1.dref(), getConsts().posint10,
                new StructureTerm(getConsts().string0, new HeapChoice(mach.getCUTB()), new StructureTerm(
                        getConsts().string6, var1.dref(), new StructureTerm(getConsts().string7, continuation))));
        mach.updateCUTB();
        return getConsts().get02cont;
    }
}

class pred_notmore_0_2 extends pred_notmore_0 {
    pred_notmore_0_2(pred_notmore_0 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected PrologObject[] getArgs() {
        return new PrologObject[] {};
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        PrologObject local_aregs[] = mach.getAreg();
        PrologObject continuation = local_aregs[0];
        local_aregs[0] = continuation;
        mach.updateCUTB();
        return mach.Call1;
    }
}
