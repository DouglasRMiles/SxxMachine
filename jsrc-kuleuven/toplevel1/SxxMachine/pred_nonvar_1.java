
package SxxMachine;

public class pred_nonvar_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        if (!areg[0].dref().isVariable()) {
            areg[0] = areg[1];
            areg[1] = null;
            return mach.Call1;
        } else {
            areg[0] = null;
            areg[1] = null;
            return mach.Fail0;
        }

    }

}
