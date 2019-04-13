
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
        final TermArray local_aregs = mach.getAreg();
        final Term test = local_aregs.getTermDRef(0);
        final Term iftrue = local_aregs.getTermDRef(1);
        final Term cont = local_aregs.getTermDRef(2);
        final Term position = Jv(mach);
        local_aregs.setAreg2((null));
        local_aregs.setAreg1((S("call", test, S("call", iftrue, cont))));
        local_aregs.setAreg0((position));
        return savecp;
    }

}
