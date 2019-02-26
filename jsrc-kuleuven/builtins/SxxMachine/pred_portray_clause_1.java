
package SxxMachine;

public class pred_portray_clause_1 extends Code {

    private final static Logger log = Logger.getLogger(pred_portray_clause_1.class);

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term clause = local_aregs[0].dref();
        Term continuation = local_aregs[1];
        local_aregs[0] = local_aregs[1] = null;
        log.info("pred_portray lists the given clause as a debug-operation");
        String str = clause.toString();
        log.debug("String-version of clause:");
        log.debug(str);
        mach.getIOLayer().getStreamHandlerOut().getCurrentStream().getStream().println(str);
        local_aregs[0] = continuation;
        return mach.Call1;
    }

}
