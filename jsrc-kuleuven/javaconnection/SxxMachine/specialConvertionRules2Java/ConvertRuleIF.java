
package SxxMachine.specialConvertionRules2Java;

public interface ConvertRuleIF {

    public boolean canConvert(Class<?> target, Class<?> current);

    public Object doConvert(Class<?> target, Object current);

}
