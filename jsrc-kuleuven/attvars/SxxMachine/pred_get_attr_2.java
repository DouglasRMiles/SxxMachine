
package SxxMachine;

import static SxxMachine.pterm.TermData.S;

public class pred_get_attr_2 extends Code {

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term variable = local_aregs[0].dref();
        final Term attribute = local_aregs[1].dref();

        local_aregs[1] = local_aregs[2] = null;

        if (variable instanceof AttributedVariable) {
            local_aregs[0] = S("unify", attribute, ((AttributedVariable) variable).getAttr(), continuation);
            return mach.Call1;
        } else {
            local_aregs[0] = null;
            return mach.Fail0;
        }

    }

}
