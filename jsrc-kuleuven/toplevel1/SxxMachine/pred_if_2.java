
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
        final Term test = local_aregs.a(0).getVVV();
        final Term iftrue = local_aregs.a(1).getVVV();
        final Term cont = local_aregs.a(2).getVVV();
        final Term position = Jv(mach);
        local_aregs.setAV(2,null);
        local_aregs.setAV(1,S("call", test, S("call", iftrue, cont)));
        local_aregs.setAV(0,position);
        return savecp;
    }

}
