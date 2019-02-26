
package SxxMachine;

/**
  * inc/2 predicate defined as
  *
  *     inc(X,Y) :-
  *       X is Y + 1.
  *
  *  @author  toms
  *
  */
public class pred_inc_2 extends Code {

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
        Term value = local_aregs[1].dref();
        // PrologObject list = local_aregs[0].Deref();
        if (!(value instanceof Int || value instanceof AFunct)) {
            throw new JPrologInternalException(value + " is not an Int");
        }
        local_aregs[1] = JpFactory.Long(value.longValue() + 1);
        return unify;
    }

}
