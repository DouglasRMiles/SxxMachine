
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;

public class pred_b_setval_2 extends Code {

    private final static Logger log = Logger.getLogger(pred_b_setval_2.class);

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        Term name = local_aregs.a(0).getVVV();
        final Term value = local_aregs.a(1).getVVV();
        final Term continuation = mach.getCont(local_aregs, 2);
        if (name.isCompound()) {
            final AFunct f = (AFunct) name;
            if (f.arity() == 0) {
                name = CONST(f.fname());
            }
        }
        if (name.isAtomOrObject()) {

            final Const cname = (Const) name;
            final VarTableIF table = GlobalVarsModule.getTable(mach);
            final Term oldValue = table.get(cname);
            //if (oldValue != null) {
            mach.trailEntry(new GlobalVarTrailEntry(cname, oldValue, mach));
            //}

            // System.out.println("b_setval(" + cname + "," + value + ")");
            try {
                table.put(cname, value);
            } catch (final JPrologScriptException e) {
                log.debug("Error setting value", e);
                return mach.Fail0;
            }

            mach.setARegENull(local_aregs, 2);
            mach.setARegENull(local_aregs, 1);
            mach.setCont(local_aregs, 0, continuation);
            return mach.getCall1();
        } else {
            mach.setARegENull(local_aregs, 2);
            mach.setARegENull(local_aregs, 1);
            mach.setARegENull(local_aregs, 0);
            return mach.Fail0;
        }
    }

}
