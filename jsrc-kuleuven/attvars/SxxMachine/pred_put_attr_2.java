
package SxxMachine;

/**
  *  @author  toms
  *
  *  put_attr(-Var,+Attr)
  */
public class pred_put_attr_2 extends Code {

    static Code entry_code;

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term variable = local_aregs.getTermDRef(0);
        final Term attribute = local_aregs.getTermDRef(1);

        mach.setARegXFR(local_aregs, 0, 2);
        mach.setARegENull(local_aregs, 2, 1);

        if (variable instanceof AttributedVariable) {
            mach.trailEntry((AttributedVariable) variable);
            final Term newVariable = new AttributedVariable(mach, attribute);
            System.out.println("bind('" + variable + "','" + newVariable + "').");
            // TODO: keep chains short, value trail!
            ((AttributedVariable) variable).setRefers(newVariable);
            return mach.getCall1();
        } else if (variable instanceof JpVar) {
            mach.trailEntry((JpVar) variable);
            ((JpVar) variable).Refers = new AttributedVariable(mach, attribute);
            return mach.getCall1();
        } else {
            mach.setARegENull(local_aregs, 0);
            return mach.Fail0;
        }

    }
}
