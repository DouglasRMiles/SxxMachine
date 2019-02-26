
package SxxMachine.specialConvertionRules2Java;

import java.lang.reflect.Array;
import java.util.Collection;

@SuppressWarnings("rawtypes")
public class Collection2Array implements ConvertRuleIF {

    @Override
    public boolean canConvert(Class<?> target, Class<?> current) {
        return target.isArray() && Collection.class.isAssignableFrom(current);
    }

    @Override
    public Object doConvert(Class<?> target, Object current) {
        if (!canConvert(target, current.getClass()))
            throw new IllegalStateException();
        final Collection c = (Collection) current;
        final Object array = Array.newInstance(target.getComponentType(), c.size());
        int index = 0;
        for (final Object o : c) {
            try {
                Array.set(array, index, o);
            } catch (final IllegalArgumentException ex) {
                //Not a valid type, try to convert
                Array.set(array, index, RuleManager.getInstance().tryToConvert(target.getComponentType(), o));
            }
            index++;
        }
        return array;
    }

}
