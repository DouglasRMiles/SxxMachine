
package SxxMachine;

public class JPNull extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term[] args = mach.getAreg();
        final Term nullObject = args[0].dref();
        if (!nullObject.unifyJP(Const.javaNull()))
            return mach.Fail0;
        args[0] = args[1];
        return mach.getCall1();
    }

}
