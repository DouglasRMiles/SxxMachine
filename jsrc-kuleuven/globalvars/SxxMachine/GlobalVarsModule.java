
package SxxMachine;

/**
  * Backtrackable global variables module, features:
  *     b_setval/2
  *  @author  toms
  *
  */
public class GlobalVarsModule extends JpModule {

    public final static String MAP = Const.strIntern("map");

    private final VarTableIF variableTable;

    public GlobalVarsModule() {
        super(new Code[] { new pred_b_setval_2(), new pred_b_getval_2() },
                new String[] { Const.strIntern("b_setval"), Const.strIntern("b_getval") });
        variableTable = createTable();
    }

    protected VarTableIF createTable() {
        return new DefaultVariableTable();
    }

    protected VarTableIF getCurrentTable(ModulePrologMachine mach) {
        ModuleRunStackInfo mod = mach.getModuleInfo(this);
        VarTableIF table = mod.getSetting(MAP, VarTableIF.class);
        if (table != null)
            return table;
        return variableTable;
    }

    static VarTableIF getTable(ModulePrologMachine mach) {
        return mach.getRegisteredModule(GlobalVarsModule.class).getCurrentTable(mach);
    }

}
