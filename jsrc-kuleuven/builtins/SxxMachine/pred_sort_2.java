
package SxxMachine;

import static SxxMachine.pterm.TermData.CONS;
import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.internS;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import SxxMachine.pterm.StructureTerm;

public class pred_sort_2 extends Code {

    private final static Logger log = Logger.getLogger(pred_sort_2.class);

    private static Code unify;

    @Override
    public void init(PredikatenPrologMachine machine) {
        if (unify == null) {
            unify = machine.loadPred(internS("unify"), 2);
        }
    }

    @Override
    public int arity() {

        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        // PrologObject continuation = mach.getCont(local_aregs, 2);
        // PrologObject sortedlist = local_aregs.a(1).v.Deref();
        Term list = local_aregs.getTermDRef(0);

        final SortedSet<Term> set = new TreeSet<Term>(Collections.reverseOrder(pred_compare_3.getComparator()));
        log.debug("Startin sort...");
        while (list.isCons()) {
            final Term[] fields = list.args();
            set.add(fields[0].dref());
            list = fields[1].dref();
        }

        if (!list.isNil()) {
            log.warn("Sort: not a nil-terminated list!!!");
            log.debug(list);
            return mach.Fail0;
        }

        Term output = CONST(internS("[]"));
        for (final Iterator<Term> iter = set.iterator(); iter.hasNext();) {
            output = CONS(iter.next(), output);
        }

        local_aregs.setAreg0((output));
        return unify;
    }

}
