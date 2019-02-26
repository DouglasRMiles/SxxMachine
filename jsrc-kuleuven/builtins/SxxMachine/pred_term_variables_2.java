
package SxxMachine;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class pred_term_variables_2 extends Code {

    private static Code unify;

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public void init(PredikatenPrologMachine machine) {
        if (unify == null) {
            unify = machine.loadPred(Const.strIntern("unify"), 2);
        }
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        // PrologObject continuation = local_aregs[2];
        // PrologObject variables = local_aregs[1].Deref();
        Term term = local_aregs[0].dref();

        Set<Term> varset = new HashSet<Term>();
        Queue<Term> queue = (Queue<Term>) new LinkedList<Term>();

        while (term != null) {
            if (term.isVariable()) {
                varset.add(term);
            } else if (term instanceof AFunct) {
                Term[] subterms = ((AFunct) term).args();
                for (int i = 0; i < subterms.length; i++)
                    queue.add(subterms[i].dref());
            }
            term = queue.poll();
        }

        Term varlist = JpFactory.CONST(Const.strIntern("[]"));
        for (Iterator<Term> iter = varset.iterator(); iter.hasNext();) {
            varlist = JpFactory.S(Const.strIntern("."), iter.next(), varlist);
        }

        local_aregs[0] = varlist;

        return unify;
    }

}
