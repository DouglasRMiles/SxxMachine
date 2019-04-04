
package SxxMachine;

import static SxxMachine.pterm.TermData.Jv;

/**
  * del_attr/1 removes attributed from attributed variable or fails silently.
  *  @author  toms
  *
  */
public class pred_del_attr_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        System.out.println("DEL ATTR");
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term variable = local_aregs[0].dref();

        mach.setARegENull(local_aregs, 1);

        if (variable instanceof AttributedVariable) {
            final JpVar var = Jv(mach);
            mach.trailEntry((AttributedVariable) variable);
            ((AttributedVariable) variable).setRefers(var);
            mach.setCont(local_aregs, 0, continuation);
            return mach.getCall1();
        } else {
            mach.setARegENull(local_aregs, 0);
            return mach.Fail0;
        }
    }

}
