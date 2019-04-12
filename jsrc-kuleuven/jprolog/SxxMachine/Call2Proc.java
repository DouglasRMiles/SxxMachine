
package SxxMachine;

import static SxxMachine.pterm.TermData.internS;

public class Call2Proc extends AbstractCall {
    @Override
    public int arity() {
        return 2;
    }

    Call2Proc(PredikatenPrologMachine machine) {
        machine.registerCode(this, internS("call"));
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        // Areg[0] contains a Funct or Const - might
        // have to be dereffed
        final Term obj = local_aregs.a(0).getVVV();
        int arity;
        String PredName;
        Code code;
        AFunct pred = null;

        if (obj.isCompound()) {
            pred = (AFunct) obj;
            PredName = pred.fname();
            arity = (pred.args()).length;
        } else // it is a Const
        {
            PredName = ((Const) obj).fname();
            arity = 0;
        }

        code = loadPred(mach, PredName, arity);
        local_aregs.setAV(arity, local_aregs.a(1).getV());
        setArguments(local_aregs, arity, pred);
        return code;
    }
}
