
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_atom_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_atom_1_1();

    static Code type_of3cont;

    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("atom");
    static String string2 = Const.strIntern("type_of");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        pred_type_of_2.class.toString();
        type_of3cont = mach.loadPred("type_of", 2);
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(2);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }

    static class pred_atom_1_1 extends pred_atom_1 {
        @Override
        public Code exec(PrologMachine mach) {
            mach.removeChoice();
            Term local_aregs[] = mach.getAreg();
            Term continuation = local_aregs[1];
            Term areg0 = local_aregs[0].dref();
            Term var1 = JpFactory.JVAR(mach);
            if (!((areg0).unify(var1)))
                return mach.Fail0;
            local_aregs[0] = var1.dref();
            local_aregs[1] = JpFactory.CONST(string1);
            local_aregs[2] = continuation;
            mach.updateCUTB();
            return type_of3cont;
        }
    }
}
