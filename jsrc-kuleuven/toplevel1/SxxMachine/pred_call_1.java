
package SxxMachine;

public class pred_call_1 extends AbstractCall {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        // Areg[0] contains a Funct/Const - might have to
        // be dereffed
        Term object = areg[0].dref();
        Term cont = areg[1].dref();
        //System.out.println(object);      
        String functName;
        Code code;
        int arity;

        if (object instanceof AFunct) {
            AFunct pred = (AFunct) object;
            functName = pred.fname();
            arity = pred.arity();
            code = loadPred(mach, functName, arity);
            setArguments(areg, arity, pred);
        } else {
            Const pred = (Const) object;
            functName = pred.fname();
            arity = 0;
            code = loadPred(mach, functName, 0);
        }
        areg[arity] = cont;

        return code;
    }

}
