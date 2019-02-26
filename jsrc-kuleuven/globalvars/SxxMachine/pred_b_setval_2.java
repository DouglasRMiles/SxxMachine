
package SxxMachine;

public class pred_b_setval_2 extends Code {

    private final static Logger log = Logger.getLogger(pred_b_setval_2.class);

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term name = local_aregs[0].dref();
        Term value = local_aregs[1].dref();
        Term continuation = local_aregs[2];
        if (name instanceof AFunct) {
            AFunct f = (AFunct) name;
            if (f.arity() == 0) {
                name = JpFactory.CONST(f.fname());
            }
        }
        if (name instanceof Const) {

            Const cname = (Const) name;
            VarTableIF table = GlobalVarsModule.getTable(mach);
            Term oldValue = (Term) table.get(cname);
            //if (oldValue != null) {
            mach.trailEntry(new GlobalVarTrailEntry(cname, oldValue, mach));
            //}

            // System.out.println("b_setval(" + cname + "," + value + ")");
            try {
                table.put(cname, value);
            } catch (JPrologScriptException e) {
                log.debug("Error setting value", e);
                return mach.Fail0;
            }

            local_aregs[2] = null;
            local_aregs[1] = null;
            local_aregs[0] = continuation;
            return mach.Call1;
        } else {
            local_aregs[2] = null;
            local_aregs[1] = null;
            local_aregs[0] = null;
            return mach.Fail0;
        }
    }

}
