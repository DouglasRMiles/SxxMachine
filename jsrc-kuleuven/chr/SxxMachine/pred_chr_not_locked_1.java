
package SxxMachine;

public class pred_chr_not_locked_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        // TODO: proper implementation
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        mach.setCont(local_aregs, 0, continuation);
        mach.setARegENull(local_aregs, 1);
        return mach.getCall1();
    }

}
