
package SxxMachine;

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
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term term = local_aregs[0].dref();

        local_aregs[1] = null;

        if (term instanceof StructureTerm) {
            local_aregs[0] = continuation;
            return mach.Call1;
        } else {
            local_aregs[0] = null;
            return mach.Fail0;
        }
    }

}
