
package SxxMachine;

public class pred_call_1 extends AbstractCall {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        // Areg[0] contains a Funct/Const - might have to
        // be dereffed
        final Term object = local_aregs.a(0).getVVV();
        final Term cont = local_aregs.a(1).getVVV();
        //System.out.println(object);
        String functName;
        Code code;
        int arity;

        if (object.isCompound()) {
            final AFunct pred = (AFunct) object;
            functName = pred.fname();
            arity = pred.arity();
            code = loadPred(mach, functName, arity);
            setArguments(local_aregs, arity, pred);
        } else {
            final Const pred = (Const) object;
            functName = pred.fname();
            arity = 0;
            code = loadPred(mach, functName, 0);
        }
        mach.setCont(local_aregs, arity, cont);

        return code;
    }

}
