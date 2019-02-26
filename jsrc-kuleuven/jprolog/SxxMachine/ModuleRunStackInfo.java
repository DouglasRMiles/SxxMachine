
package SxxMachine;

import java.util.Map;

public class ModuleRunStackInfo {

    private final Map<String, Object> settings;

    public ModuleRunStackInfo() {
        super();
        settings = new java.util.TreeMap<String, Object>();
    }

    @SuppressWarnings("unchecked")
    public <T> T getSetting(String string, Class<T> name) {
        return (T) settings.get(string);
    }

    public <T> void setSetting(String string, T o) {
        settings.put(string, o);
    }

}
