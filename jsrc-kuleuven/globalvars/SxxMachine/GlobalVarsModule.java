
package SxxMachine;

// internS;
import static SxxMachine.pterm.TermData.*;

/**
  * Backtrackable global variables module, features:
  *     b_setval/2
  *  @author  toms
  *
  */
public class GlobalVarsModule extends JpModule {

    public final static String MAP = internS("map");

    private final VarTableIF variableTable;

    public GlobalVarsModule() {
        super(new Code[] { new pred_b_setval_2(), new pred_b_getval_2() },
                new String[] { internS("b_setval"), internS("b_getval") });
        variableTable = createTable();
    }

    protected VarTableIF createTable() {
        return new DefaultVariableTable();
    }

    protected VarTableIF getCurrentTable(ModulePrologMachine mach) {
        final ModuleRunStackInfo mod = mach.getModuleInfo(this);
        final VarTableIF table = mod.getSetting(MAP, VarTableIF.class);
        if (table != null)
            return table;
        return variableTable;
    }

    static VarTableIF getTable(ModulePrologMachine mach) {
        return mach.getRegisteredModule(GlobalVarsModule.class).getCurrentTable(mach);
    }

}
