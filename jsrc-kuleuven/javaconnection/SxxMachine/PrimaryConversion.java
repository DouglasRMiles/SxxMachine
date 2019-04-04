
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;

public class PrimaryConversion {

    public static Term convert2Prolog(Object javaObject) {
        if (javaObject == null)
            return Const.javaNull();
        ;
        if (javaObject instanceof String)
            return CONST(javaObject);
        if (javaObject instanceof Iterable)
            return ListConverter.convert2prolog((Iterable<?>) javaObject);
        if (javaObject instanceof Object[])
            return ArrayConverter.convert2prolog((Object[]) javaObject);
        if (javaObject instanceof Number) {
            final Number nb = (Number) javaObject;
            if (couldBeLong(nb))
                return Integer(nb.longValue());
            return CONST(nb); //nu kan een int wel gelijk zijn aan een const
        }
        return CONST(javaObject);
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
        if (prologObject.isAtomOrObject())
            return ((Const) prologObject).getValue();
        if (prologObject.isCompound()) {
            final AFunct f = (AFunct) prologObject;
            if (f.isCons() || f.isNil())
                return ListConverter.convert2java(f);
            if (f.arity() > 0)
                throw new JPrologScriptException("can not convert a function to a java-object");
            return f.fname();
        }
        return ((NumberTerm) prologObject).longValue();
    }

}
