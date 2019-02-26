package SxxMachine;

abstract class AbstractCall extends Code {

    protected void setArguments(Term[] areg, int arity, AFunct pred) {
        if (pred == null)
            return;
        Term args[] = pred.args();
        while (arity-- > 0) {
            areg[arity] = args[arity];
        }
    }

    protected Code loadPred(PredikatenPrologMachine mach, String predName, int arity) {
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
            Term[] args = mach.getAreg();
            Term[] funcArgs = mach.createAregCopy(arity);
            Term cont = mach.getAreg()[arity];
            JpVar v = JpFactory.JVAR(mach);
            args[0] = JpFactory.S("operator_goal", JpFactory.S(predName, funcArgs), v);
            args[1] = JpFactory.S("call", v, cont.dref(), cont.dref());
            for (int i = 2; i < arity; i++)
                args[i] = null;
            return mach.Call2;
        }

    }

}
