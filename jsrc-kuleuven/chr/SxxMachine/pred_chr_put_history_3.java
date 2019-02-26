
package SxxMachine;

import static SxxMachine.pterm.TermData.internS;

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
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        local_aregs[0] = local_aregs[2];
        local_aregs[2] = continuation;
        local_aregs[3] = null;
        return unify;
    }

}
