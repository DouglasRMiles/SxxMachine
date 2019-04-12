
package SxxMachine;

public class JPNull extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term nullObject = local_aregs.a(0).getVVV();
        if (!nullObject.unifyJP(Const.javaNull()))
            return mach.Fail0;
        local_aregs.setAV(0,local_aregs.a(1).getV());
        return mach.getCall1();
    }

}
