
package SxxMachine;

public class JPNull extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term nullObject = local_aregs.getTermDRef(0);
        if (!nullObject.unifyJP(Const.javaNull()))
            return mach.Fail0;
        local_aregs.areg0 = (local_aregs.getPlainArg(1));
        return mach.getCall1();
    }

}
