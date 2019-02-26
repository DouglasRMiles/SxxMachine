
package SxxMachine;

public class JPInstance extends Code {

    private Code iterate;

    @Override
    protected void init(PredikatenPrologMachine mach) {
        iterate = mach.loadPred(IterateOverClassStructure.PREDNAME, 2);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] args = mach.getAreg();
        Term object = args[0].dref();
        Term classType = args[1].dref();
        Term cont = args[2];
        if (!(object instanceof Const))
            return mach.Fail0;
        Object obj = ((Const) object).getValue();
        if (obj instanceof String)
            return mach.Fail0;
        if (classType.isVariable())
            return startIteration(args, classType, obj);
        else
            return doCheckInstance(mach, args, object, classType, cont);

    }

    private Code doCheckInstance(PrologMachine mach, Term[] args, Term object, Term classType, Term cont) {
        if (!(classType instanceof Const))
            return mach.Fail0;
        Object cl = ((Const) classType).getValue();
        if (cl == null || !(cl instanceof Class))
            return mach.Fail0;
        Class jClassType = (Class) cl;
        if (!(object instanceof Const))
            return mach.Fail0;
        if (!jClassType.isInstance(((Const) object).getValue()))
            return mach.Fail0;

        args[1] = args[2] = null;
        args[0] = cont;
        return mach.Call1;
    }

    private Code startIteration(Term[] args, Term classType, Object obj) {
        //Iteratie starten over structuur
        args[0] = JpFactory.CONST(obj.getClass());
        args[1] = classType;
        return iterate;
    }

}
