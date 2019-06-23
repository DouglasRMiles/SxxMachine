package SxxMachine;

import static SxxMachine.pterm.TermData.*;

public abstract class AbstractCall extends Code {

    public void setArguments(TermArray local_aregs, int arity, AFunct pred) {
        if (pred == null)
            return;
        final Term args[] = pred.args();
        while (arity-- > 0) {
            local_aregs.setAV(arity, args[arity]);
        }
    }

    public static Code loadPred(PredikatenPrologMachine mach, String predName, int arity) {
        if (mach.couldLoadPredikaat(predName, arity))
            return mach.loadPred(predName, arity);
        //Speciaal predikaat?
        return new SearchTarget(arity, predName);
    }

    private static class SearchTarget extends Code {

        private final int arity;
        private final String predName;

        SearchTarget(int arity, String predName) {
            if (arity < 0)
                throw new IllegalArgumentException();
            this.arity = arity;
            this.predName = predName;
        }

        @Override
        public int arity() {
            return arity;
        }

        @Override
        public Code exec(PrologMachine mach) throws JPrologInternalException {
            final TermArray local_aregs = mach.getAreg();
            final Term[] funcArgs = mach.createAregCopy(arity);
            final Term cont = mach.getCont(mach.getAreg(), arity);
            final JpVar v = Jv(mach);
            local_aregs.setAreg0((S("operator_goal", S(predName, funcArgs), v)));
            mach.setCont(local_aregs, 1, S("call", v, cont.dref(), cont.dref()));
            for (int i = 2; i < arity; i++)
                local_aregs.setAV(i, null);
            return mach.getCall2();
        }

    }

}
