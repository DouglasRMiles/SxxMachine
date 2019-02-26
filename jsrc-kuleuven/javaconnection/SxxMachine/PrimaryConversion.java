
package SxxMachine;

public class PrimaryConversion {

    public static Term convert2Prolog(Object javaObject) {
        if (javaObject == null)
            return Const.javaNull();
        ;
        if (javaObject instanceof String)
            return JpFactory.CONST(javaObject);
        if (javaObject instanceof Iterable)
            return ListConverter.convert2prolog((Iterable<?>) javaObject);
        if (javaObject instanceof Object[])
            return ArrayConverter.convert2prolog((Object[]) javaObject);
        if (javaObject instanceof Number) {
            Number nb = (Number) javaObject;
            if (couldBeLong(nb))
                return JpFactory.Long(nb.longValue());
            return JpFactory.CONST(nb); //nu kan een int wel gelijk zijn aan een const
        }
        return JpFactory.CONST(javaObject);
    }

    private static boolean couldBeLong(Number nb) {
        return nb instanceof Long || nb.longValue() == nb.floatValue();
    }

    public static Object convert2java(Term prologObject) throws JPrologScriptException {
        if (prologObject == null)
            throw new NullPointerException();
        prologObject = prologObject.dref();
        if (prologObject.isVariable())
            throw new JPrologScriptException("Variable is not a valid java-item");
        if (prologObject instanceof Const)
            return ((Const) prologObject).getValue();
        if (prologObject instanceof AFunct) {
            AFunct f = (AFunct) prologObject;
            if (f.isCons() || f.isNil())
                return ListConverter.convert2java(f);
            if (f.arity() > 0)
                throw new JPrologScriptException("can not convert a function to a java-object");
            return f.fname();
        }
        return ((Int) prologObject).longValue();
    }

}
