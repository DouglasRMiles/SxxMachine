
package SxxMachine;

import SxxMachine.pterm.StructureTerm;

/**
  * compound/1 built-in
  *
  *  @author  toms
  *
  */
public class pred_compound_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term term = local_aregs.a(0).getVVV();

        mach.setARegENull(local_aregs, 1);

        if (term instanceof StructureTerm) {
            mach.setCont(local_aregs, 0, continuation);
            return mach.getCall1();
        } else {
            mach.setARegENull(local_aregs, 0);
            return mach.Fail0;
        }
    }

}
