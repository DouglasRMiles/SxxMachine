
package SxxMachine;

public class GlobalVarTrailEntry implements UnTrailOperation {

    private final Const name;
    private final Term value;
    private final ModulePrologMachine mach;

    public GlobalVarTrailEntry(Const name, Term value, ModulePrologMachine machine) {
        super();
        this.name = name;
        this.value = value;
        mach = machine;
    }

    @Override
    public void unTrailSelf() {
        try {
            GlobalVarsModule.getTable(mach).put(name, value);
        } catch (final JPrologScriptException e) {
            //Hier kunnen we niet geraken aangezien name reeds
            // als geldige waarde is ingesteld in het verleden
            throw new JPrologInternalException("Illegal location", e);
        }
    }

}
