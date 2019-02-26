
package SxxMachine;

public class TrueProc extends Code {

    @Override
    public int arity() {
        return 0;
    }

    public TrueProc(PredikatenPrologMachine machine) {
        machine.registerCode(this, Const.strIntern("true"));
    }

    @Override
    public Code exec(PrologMachine mach) {
        return mach.Call1;
    }

}
