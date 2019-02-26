
package SxxMachine;

public class pred_cut_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final HeapChoice heapChoice = (HeapChoice) local_aregs[0];
        mach.doCut(heapChoice.CutTo);
        mach.updateCUTB();
        local_aregs[1] = null;
        local_aregs[0] = continuation;
        return mach.Call1;
    }

}
