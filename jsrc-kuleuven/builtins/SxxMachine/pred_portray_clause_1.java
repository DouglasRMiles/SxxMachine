
package SxxMachine;

public class pred_portray_clause_1 extends Code {

    private final static Logger log = Logger.getLogger(pred_portray_clause_1.class);

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term clause = local_aregs.getTermDRef(0);
        final Term continuation = mach.getCont(local_aregs, 1);
        mach.setARegENull(local_aregs, 0, 1);
        log.info("pred_portray lists the given clause as a debug-operation");
        final String str = clause.portrayTerm();
        log.debug("String-version of clause:");
        log.debug(str);
        mach.getIOLayer().getStreamHandlerOut().getCurrentStream().getStream().println(str);
        mach.setCont(local_aregs, 0, continuation);
        return mach.getCall1();
    }

}
