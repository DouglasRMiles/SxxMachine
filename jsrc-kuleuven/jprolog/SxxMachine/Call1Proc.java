package SxxMachine;

import static SxxMachine.pterm.TermData.internS;

public class Call1Proc extends AbstractCall {

    private static Call1Proc instance;

    private Call1Proc() {
    }

    public static synchronized Call1Proc createInstance(PredikatenPrologMachine machine) {
        if (instance == null)
            instance = new Call1Proc();
        machine.registerCode(instance, internS("call_intern"));
        return instance;
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term[] areg = mach.getAreg();
        // Areg[0] contains a Funct - might have to
        // be dereffed
        final Term object = areg[0].dref();
        //System.out.println(object);
        String FunctName;
        Code code;

        final AFunct pred = (AFunct) object;
        FunctName = pred.fname();
        final int arity = pred.arity();
        code = loadPred(mach, FunctName, arity - 1);
        setArguments(areg, arity, pred);

        return code;
    }

}
