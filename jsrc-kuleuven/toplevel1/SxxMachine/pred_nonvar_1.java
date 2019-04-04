
package SxxMachine;

public class pred_nonvar_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term[] areg = mach.getAreg();
        if (!areg[0].dref().isVariable()) {
            mach.setARegXFR(areg, 0, 1);
            mach.setARegENull(areg, 1);
            return mach.getCall1();
        } else {
            areg[0] = null;
            mach.setARegENull(areg, 1);
            return mach.Fail0;
        }

    }

}
