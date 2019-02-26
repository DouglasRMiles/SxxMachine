
package SxxMachine;

public class Call2Proc extends AbstractCall {
    @Override
    public int arity() {
        return 2;
    }

    Call2Proc(PredikatenPrologMachine machine) {
        machine.registerCode(this, Const.strIntern("call"));
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        // Areg[0] contains a Funct or Const - might
        // have to be dereffed
        Term obj = areg[0].dref();
        int arity;
        String PredName;
        Code code;
        AFunct pred = null;

        if (obj instanceof AFunct) {
            pred = (AFunct) obj;
            PredName = pred.fname();
            arity = (pred.args()).length;
        } else // it is a Const
        {
            PredName = ((Const) obj).fname();
            arity = 0;
        }

        code = loadPred(mach, PredName, arity);
        areg[arity] = areg[1];
        setArguments(areg, arity, pred);
        return code;
    }
}
