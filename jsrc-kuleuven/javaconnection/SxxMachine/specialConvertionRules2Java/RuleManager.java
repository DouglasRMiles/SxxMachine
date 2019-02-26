
package SxxMachine.specialConvertionRules2Java;

import java.util.ArrayList;
import java.util.List;

public class RuleManager {

    private static RuleManager instance;

    private final List<ConvertRuleIF> rules;

    private RuleManager() {
        super();
        rules = new ArrayList<ConvertRuleIF>();
        loadRules();
    }

    private void loadRules() {
        rules.add(new Collection2Array());
        rules.add(new Long2Int());
    }

    public static RuleManager getInstance() {
        if (instance == null) {
            synchronized (RuleManager.class) {
                if (instance == null)
                    instance = new RuleManager();
            }
        }
        return instance;
    }

    public Object tryToConvert(Class<?> target, Object current) throws NoSuchConvertionException {
        for (ConvertRuleIF rule : rules) {
            if (rule.canConvert(target, current.getClass())) {
                try {
                    return rule.doConvert(target, current);
                } catch (Exception ex) {
                    throw new NoSuchConvertionException(ex);
                }
            }
        }
        throw new NoSuchConvertionException("Could not find a rule for " + current.getClass() + " to " + target);
    }

}
