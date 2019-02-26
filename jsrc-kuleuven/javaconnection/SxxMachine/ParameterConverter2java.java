
package SxxMachine;

import java.util.HashMap;
import java.util.Map;

class ParameterConverter2java {

    Object[] getParamRes(Term[] ar, Map<JpVar, Object> var2Object) throws JPrologScriptException {
        final Object[] res = new Object[ar.length];
        if (var2Object == null)
            var2Object = new HashMap<JpVar, Object>();
        for (int i = 0; i < res.length; i++) {
            res[i] = createParam(ar[i], var2Object);
        }
        return res;
    }

    private Object createParam(Term o, Map<JpVar, Object> var2Object) throws JPrologScriptException {
        o = o.dref();
        if (o.isVariable()) {
            Object obj = var2Object.get(o);
            if (obj == null) {
                obj = new Object();
                var2Object.put((JpVar) o, obj);
            }
            return obj;
        }
        return PrimaryConversion.convert2java(o);
    }

}
