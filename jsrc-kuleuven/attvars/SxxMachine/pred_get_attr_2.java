
package SxxMachine;

public class pred_get_attr_2 extends Code {

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term variable = local_aregs[0].dref();
        Term attribute = local_aregs[1].dref();

        local_aregs[1] = local_aregs[2] = null;

        if (variable instanceof AttributedVariable) {
            local_aregs[0] = JpFactory
                    .S("unify", attribute, ((AttributedVariable) variable).getAttr(), continuation);
            return mach.Call1;
        } else {
            local_aregs[0] = null;
            return mach.Fail0;
        }

    }

}
