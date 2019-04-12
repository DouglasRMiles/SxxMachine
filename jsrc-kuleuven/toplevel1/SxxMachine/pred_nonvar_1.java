
package SxxMachine;

public class pred_nonvar_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        if (!local_aregs.getTermDRef(0).isVariable()) {
            mach.setARegXFR(local_aregs, 0, 1);
            mach.setARegENull(local_aregs, 1);
            return mach.getCall1();
        } else {
            local_aregs.setAV(0,null);
            mach.setARegENull(local_aregs, 1);
            return mach.Fail0;
        }

    }

}
