
package SxxMachine;

public class pred_if_2 extends Code {

    private Code savecp;

    @Override
    public void init(PredikatenPrologMachine mach) {
        savecp = mach.loadPred("savecp", 1);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        Term[] args = mach.getAreg();
        Term test = args[0].dref();
        Term iftrue = args[1].dref();
        Term cont = args[2].dref();
        Term position = JpFactory.JVAR(mach);
        args[2] = null;
        args[1] = JpFactory.S("call", test, JpFactory.S("call", iftrue, cont));
        args[0] = position;
        return savecp;
    }

}
