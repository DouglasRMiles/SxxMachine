
package SxxMachine;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class pred_sort_2 extends Code {

    private final static Logger log = Logger.getLogger(pred_sort_2.class);

    private static Code unify;

    @Override
    public void init(PredikatenPrologMachine machine) {
        if (unify == null) {
            unify = machine.loadPred(Const.strIntern("unify"), 2);
        }
    }

    @Override
    public int arity() {

        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        // PrologObject continuation = local_aregs[2];
        // PrologObject sortedlist = local_aregs[1].Deref();
        Term list = local_aregs[0].dref();

        SortedSet<Term> set = new TreeSet<Term>(Collections.reverseOrder(pred_compare_3.getComparator()));
        log.debug("Startin sort...");
        while (list.isCons()) {
            Term[] fields = ((StructureTerm) list).args();
            set.add(fields[0].dref());
            list = fields[1].dref();
        }

        if (!list.isNil()) {
            log.warn("Sort: not a nil-terminated list!!!");
            log.debug(list);
            return mach.Fail0;
        }

        Term output = JpFactory.CONST(Const.strIntern("[]"));
        for (Iterator<Term> iter = (Iterator<Term>) set.iterator(); iter.hasNext();) {
            output = JpFactory.S(Const.strIntern("."), iter.next(), output);
        }

        local_aregs[0] = output;
        return unify;
    }

}
