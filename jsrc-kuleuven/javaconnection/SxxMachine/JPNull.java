
package SxxMachine;

public class JPNull extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] args = mach.getAreg();
        Term nullObject = args[0].dref();
        if (!nullObject.unify(Const.javaNull()))
            return mach.Fail0;
        args[0] = args[1];
        return mach.Call1;
    }

}
