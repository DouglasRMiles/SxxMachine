
package SxxMachine;

import java.util.LinkedList;
import java.util.Queue;

public class pred_ground_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term term = local_aregs[0].dref();

        Queue<Term> queue = new LinkedList<Term>();

        while (term != null) {
            if (term.isVariable()) {
                return mach.Fail0;
            } else if (term instanceof AFunct) {
                Term[] subterms = ((AFunct) term).args();
                for (int i = 0; i < subterms.length; i++)
                    queue.add(subterms[i].dref());
            }
            term = (Term) queue.poll();
        }

        local_aregs[0] = continuation;
        local_aregs[1] = null;
        return mach.Call1;
    }

}
