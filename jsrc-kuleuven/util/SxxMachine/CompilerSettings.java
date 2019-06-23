
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import java.util.EnumMap;
import java.util.Map;

public class CompilerSettings implements JPrologRunStackIniter {

    private final static Const TRUE = CONST(internS("true"));

    private final Map<CompilerSetting, Boolean> settings;

    public CompilerSettings() {
        settings = new EnumMap<CompilerSetting, Boolean>(CompilerSetting.class);
    }

    public boolean isEnabled(CompilerSetting setting) {
        return Boolean.TRUE.equals(settings.get(setting));
    }

    public void setEnabled(CompilerSetting setting, boolean enable) {
        settings.put(setting, enable);
    }

    @Override
    public void init(RunningPrologMachine mach) throws JPrologScriptException {
        if (settings.size() > 0) {
            final ModuleRunStackInfo info = mach.getModuleInfo(GlobalVarsModule.class);
            VarTableIF table = info.getSetting(GlobalVarsModule.MAP, VarTableIF.class);
            if (table == null)
                table = new DefaultVariableTable();
            for (final Map.Entry<CompilerSetting, Boolean> e : settings.entrySet()) {
                if (e.getValue()) {
                    table.put(CONST(e.getKey().name()), TRUE);
                }
            }
            info.setSetting(GlobalVarsModule.MAP, table);
        }
    }

}
