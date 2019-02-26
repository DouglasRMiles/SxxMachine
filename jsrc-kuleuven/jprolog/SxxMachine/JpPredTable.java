
package SxxMachine;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

class JpPredTable {
    private final Map<Integer, Map<String, Code>> tables;

    public JpPredTable() {
        tables = new TreeMap<Integer, Map<String, Code>>();
    }

    void insertNameArity(String Functor, Integer ArityPusOne, Code Adr) {
        Map<String, Code> T = tables.get(ArityPusOne);
        if (T == null) {
            T = new Hashtable<String, Code>();
            tables.put(ArityPusOne, T);
        }
        T.put(Functor, Adr);
    }

    Code isInPredTable(String N, Integer A) {
        if (tables.get(A) == null)
            return null;
        return tables.get(A).get(N);
    }

    public void removeQuery() {
        tables.get(1).remove("$$query");
    }
}
