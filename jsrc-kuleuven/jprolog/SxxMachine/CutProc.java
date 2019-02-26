
package SxxMachine;

public class CutProc extends Code {

    @Override
    public int arity() {
        return 1;
    }

    public CutProc(PredikatenPrologMachine machine) {
        machine.registerCode(this, Const.strIntern("cut"));
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        // Areg[0] contains a PrologObject of type
        // HeapChoice
        int i = ((HeapChoice) areg[0]).CutTo;
        mach.doCut(i);
        areg[0] = (AFunct) areg[1];
        mach.updateCUTB();
        return mach.Call1.exec(mach);
    }
}
