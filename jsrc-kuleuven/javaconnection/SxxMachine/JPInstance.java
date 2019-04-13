
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;

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
        final TermArray local_aregs = mach.getAreg();
        final Term object = local_aregs.getTermDRef(0);
        final Term classType = local_aregs.getTermDRef(1);
        final Term cont = local_aregs.getPlainArg(2);
        if (!(object.isAtomOrObject()))
            return mach.Fail0;
        final Object obj = ((Const) object).getValue();
        if (obj instanceof String)
            return mach.Fail0;
        if (classType.isVariable())
            return startIteration(local_aregs, classType, obj);
        else
            return doCheckInstance(mach, local_aregs, object, classType, cont);

    }

    @SuppressWarnings("rawtypes")
    private Code doCheckInstance(PrologMachine mach, TermArray args, Term object, Term classType, Term cont) {
        if (!(classType.isAtomOrObject()))
            return mach.Fail0;
        final Object cl = ((Const) classType).getValue();
        if (cl == null || !(cl instanceof Class))
            return mach.Fail0;
        final Class jClassType = (Class) cl;
        if (!(object.isAtomOrObject()))
            return mach.Fail0;
        if (!jClassType.isInstance(((Const) object).getValue()))
            return mach.Fail0;

        args.setAreg1((args.setAreg2((null))));
        mach.setCont(args, 0, cont);
        return mach.getCall1();
    }

    private Code startIteration(TermArray args, Term classType, Object obj) {
        //Iteratie starten over structuur
        args.setAreg0((CONST(obj.getClass())));
        args.setAreg1((classType));
        return iterate;
    }

}
