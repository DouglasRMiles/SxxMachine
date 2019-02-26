
package SxxMachine;

import static SxxMachine.pterm.TermData.internS;

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
        final Term[] areg = mach.getAreg();
        // Areg[0] contains a PrologObject of type
        // HeapChoice
        final int i = ((HeapChoice) areg[0]).CutTo;
        mach.doCut(i);
        areg[0] = areg[1];
        mach.updateCUTB();
        return mach.Call1.exec(mach);
    }
}
