
package SxxMachine;

import java.util.HashMap;
import java.util.Map;

public abstract class ModulePrologMachine extends PredikatenPrologMachine {

    private final Map<Class<? extends JpModule>, JpModule> modules;

    protected ModulePrologMachine() {
        super();
        modules = new HashMap<Class<? extends JpModule>, JpModule>();
    }

    public boolean isRegisteredOrRegister(JpModule mod) {
        if (mod == null)
            throw new NullPointerException();
        if (isModuleRegistered(mod.getClassToRegister())) {
            return mod.equals(getRegisteredModule(mod.getClassToRegister()));
        }
        return registerModule(mod);
    }

    public boolean isModuleRegistered(Class<? extends JpModule> mod) {
        return modules.containsKey(mod);
    }

    public boolean registerModule(JpModule module) {
        if (isModuleRegistered(module.getClassToRegister()))
            return false;
        modules.put(module.getClassToRegister(), module);
        return true;
    }

    @SuppressWarnings("unchecked")
    public <T extends JpModule> T getRegisteredModule(Class<T> module) {
        return (T) modules.get(module);
    }

    public abstract ModuleRunStackInfo getModuleInfo(JpModule module);

}
