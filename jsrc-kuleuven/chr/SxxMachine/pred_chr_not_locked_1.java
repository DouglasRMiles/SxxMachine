
package SxxMachine;

public class pred_chr_not_locked_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        // TODO: proper implementation
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        local_aregs[0] = continuation;
        local_aregs[1] = null;
        return mach.Call1;
    }

}
