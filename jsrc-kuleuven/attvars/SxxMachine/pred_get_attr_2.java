
package SxxMachine;

import static SxxMachine.pterm.TermData.S;

public class pred_get_attr_2 extends Code {

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term variable = local_aregs.a(0).getVVV();
        final Term attribute = local_aregs.a(1).getVVV();

        mach.setARegENull(local_aregs, 2, 1);

        if (variable instanceof AttributedVariable) {
            mach.setCont(local_aregs, 0, S("unify", attribute, ((AttributedVariable) variable)
                    .getAttr(), continuation));
            return mach.getCall1();
        } else {
            mach.setARegENull(local_aregs, 0);
            return mach.Fail0;
        }

    }

}
