
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
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        Term term = local_aregs[0].dref();

        final Queue<Term> queue = new LinkedList<Term>();

        while (term != null) {
            if (term.isVariable()) {
                return mach.Fail0;
            } else if (term.isCompound()) {
                final Term[] subterms = ((AFunct) term).args();
                for (int i = 0; i < subterms.length; i++)
                    queue.add(subterms[i].dref());
            }
            term = queue.poll();
        }

        mach.setCont(local_aregs, 0, continuation);
        mach.setARegENull(local_aregs, 1);
        return mach.getCall1();
    }

}
