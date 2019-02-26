
package SxxMachine;

import java.util.HashMap;
import java.util.Map;

public class DefaultVariableTable implements VarTableIF {

    private final Map<Const, Term> variableTable;

    public DefaultVariableTable() {
        super();
        variableTable = new HashMap<Const, Term>();
    }

    @Override
    public Term get(Const cname) {
        return variableTable.get(cname);
    }

    @Override
    public void put(Const cname, Term value) throws JPrologScriptException {
        variableTable.put(cname, value);
    }

}
