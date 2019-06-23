
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

public class CutProc extends Code {

    @Override
    public int arity() {
        return 1;
    }

    public CutProc(PredikatenPrologMachine machine) {
        machine.registerCode(this, internS("cut"));
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        // Areg[0] contains a PrologObject of type
        // HeapChoice
        final int i = ((HeapChoice) local_aregs.getPlainArg(0)).CutTo;
        mach.doCut(i);
        mach.setARegXFR(local_aregs, 0, 1);
        mach.updateCUTB();
        return mach.getCall1().exec(mach);
    }
}
