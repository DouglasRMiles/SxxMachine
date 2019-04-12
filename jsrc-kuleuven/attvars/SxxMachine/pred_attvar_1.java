
package SxxMachine;

/**
  * attvar/1 predicate tests whether argument is an attributed variable
  *  @author  toms
  *
  */
public class pred_attvar_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term variable = local_aregs.getTermDRef(0);

        mach.setARegENull(local_aregs, 1);

        if (variable instanceof AttributedVariable) {
            mach.setCont(local_aregs, 0, continuation);
            return (Code) (Object) mach.getCall1();
        } else {
            mach.setARegENull(local_aregs, 0);
            return mach.Fail0;
        }
    }

}
