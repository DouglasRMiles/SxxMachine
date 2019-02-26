
package SxxMachine.specialConvertionRules2Java;

public class Long2Int implements ConvertRuleIF {

    @Override
    public boolean canConvert(Class<?> target, Class<?> current) {
        return (Long.class.equals(current) || Long.TYPE.equals(current))
                //
                && (Integer.class.equals(target) || Integer.TYPE.equals(target));
    }

    @Override
    public Object doConvert(Class<?> target, Object current) {
        if (!canConvert(target, current.getClass()))
            throw new IllegalStateException();
        final long l = (Long) current;
        if (l < Integer.MIN_VALUE || l > Integer.MAX_VALUE)
            throw new NoSuchConvertionException("Value out of bounds");
        return (int) l;
    }

}
