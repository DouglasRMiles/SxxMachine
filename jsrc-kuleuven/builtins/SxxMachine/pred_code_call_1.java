
package SxxMachine;

import SxxMachine.pterm.StructureTerm;

public class pred_code_call_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final CodeObject codeObject = (CodeObject) local_aregs.getTermDRef(0);
        final StructureTerm argumentTerm = (StructureTerm) local_aregs.getTermDRef(1);

        mach.setARegENull(local_aregs, 1);

        final Term[] arguments = argumentTerm.args();

        for (int i = 0; i < arguments.length; i++) {
            local_aregs.setAV(i, arguments[i]);
        }

        return codeObject.getCode();
    }

}
