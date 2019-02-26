
package SxxMachine;

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
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term variable = local_aregs[0].dref();

        local_aregs[1] = null;

        if (variable instanceof AttributedVariable) {
            final AttributedVariable attributedVariable = (AttributedVariable) variable;
            JpVar var = JpFactory.JVAR(mach);
            mach.trailEntry(attributedVariable);
            attributedVariable.setRefers(var);
            local_aregs[0] = continuation;
            return mach.Call1;
        } else {
            local_aregs[0] = null;
            return mach.Fail0;
        }
    }

}
