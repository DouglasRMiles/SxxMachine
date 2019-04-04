
package SxxMachine;

public class pred_cut_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final HeapChoice heapChoice = (HeapChoice) local_aregs[0];
        mach.doCut(heapChoice.CutTo);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 1);
        mach.setCont(local_aregs, 0, continuation);
        return mach.getCall1();
    }

}
