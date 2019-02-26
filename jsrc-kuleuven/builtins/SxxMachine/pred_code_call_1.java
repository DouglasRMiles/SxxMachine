
package SxxMachine;

public class pred_code_call_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] local_aregs = mach.getAreg();
        CodeObject codeObject = (CodeObject) local_aregs[0].dref();
        StructureTerm argumentTerm = (StructureTerm) local_aregs[1].dref();

        local_aregs[1] = null;

        Term[] arguments = argumentTerm.args();

        for (int i = 0; i < arguments.length; i++) {
            local_aregs[i] = arguments[i];
        }

        return codeObject.getCode();
    }

}
