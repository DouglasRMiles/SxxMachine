
package SxxMachine;

// Jv;
import static SxxMachine.pterm.TermData.*;

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
        final Term[] args = mach.getAreg();
        final Term test = args[0].dref();
        final Term iftrue = args[1].dref();
        final Term cont = args[2].dref();
        final Term position = Jv(mach);
        args[2] = null;
        args[1] = S("call", test, S("call", iftrue, cont));
        args[0] = position;
        return savecp;
    }

}
