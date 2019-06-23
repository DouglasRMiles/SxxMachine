
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

public class TrueProc extends Code {

    @Override
    public int arity() {
        return 0;
    }

    public TrueProc(PredikatenPrologMachine machine) {
        machine.registerCode(this, internS("true"));
    }

    @Override
    public Code exec(PrologMachine mach) {
        return mach.getCall1();
    }

}
