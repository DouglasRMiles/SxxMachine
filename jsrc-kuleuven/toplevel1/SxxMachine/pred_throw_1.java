
package SxxMachine;

public class pred_throw_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        final Term ex = mach.getAreg().getTermDRef(0);
        if (ex.isVariable())
            return mach.Fail0;
        throw new PrologThrownException(ex);
    }

}
