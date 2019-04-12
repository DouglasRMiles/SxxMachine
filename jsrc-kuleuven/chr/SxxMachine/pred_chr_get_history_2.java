
package SxxMachine;

public class pred_chr_get_history_2 extends Code {

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        // TODO: proper implementation
        final TermArray local_aregs = mach.getAreg();
        // PrologObject continuation = mach.getCont(local_aregs, 2);
        mach.setARegENull(local_aregs, 2, 0);
        return mach.Fail0;

    }

}
