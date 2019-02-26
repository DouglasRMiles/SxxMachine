
package SxxMachine;

public class pred_chr_get_history_2 extends Code {

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        // TODO: proper implementation
        Term local_aregs[] = mach.getAreg();
        // PrologObject continuation = local_aregs[2];
        local_aregs[0] = null;
        local_aregs[1] = null;
        local_aregs[2] = null;
        return mach.Fail0;

    }

}
