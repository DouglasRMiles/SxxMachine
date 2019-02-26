
package SxxMachine;

public interface VarTableIF {

    Term get(Const cname);

    void put(Const cname, Term value) throws JPrologScriptException;

}
