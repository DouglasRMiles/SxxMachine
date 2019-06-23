
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

public class pred_chr_put_history_3 extends Code {

    private static Code unify;

    @Override
    public void init(PredikatenPrologMachine machine) {
        if (unify == null) {
            unify = machine.loadPred(internS("unify"), 2);
        }
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        // TODO: proper implementation
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        mach.setARegXFR(local_aregs, 0, 2);
        mach.setCont(local_aregs, 2, continuation);
        mach.setARegENull(local_aregs, 3);
        return unify;
    }

}
