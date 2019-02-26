
package SxxMachine;

import java.util.HashMap;
import java.util.Map;

public class ConvertieData {

    private final Term[] res;
    private final Map<Object, JpVar> obj2Var;

    ConvertieData(Term[] res, Map<Object, JpVar> obj2Var) {
        super();
        if (res == null || obj2Var == null)
            throw new NullPointerException();
        this.res = res;
        this.obj2Var = obj2Var;
    }

    public Term[] getPrologParams() {
        return res;
    }

    public Map<JpVar, Object> getVarMap() {
        Map<JpVar, Object> reverseMap = new HashMap<JpVar, Object>();
        for (Map.Entry<Object, JpVar> e : obj2Var.entrySet()) {
            reverseMap.put(e.getValue(), e.getKey());
        }
        return reverseMap;
    }

}
