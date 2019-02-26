
package SxxMachine;

import SxxMachine.pterm.StructureTerm;

public class pred_code_call_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term[] local_aregs = mach.getAreg();
        final CodeObject codeObject = (CodeObject) local_aregs[0].dref();
        final StructureTerm argumentTerm = (StructureTerm) local_aregs[1].dref();

        local_aregs[1] = null;

        final Term[] arguments = argumentTerm.args();

        for (int i = 0; i < arguments.length; i++) {
            local_aregs[i] = arguments[i];
        }

        return codeObject.getCode();
    }

}
