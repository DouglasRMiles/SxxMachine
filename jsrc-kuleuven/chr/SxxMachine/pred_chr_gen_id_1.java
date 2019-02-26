
package SxxMachine;

public class pred_chr_gen_id_1 extends Code {

    private long id = 0;

    private static Code unify;

    @Override
    public void init(PredikatenPrologMachine machine) {
        if (unify == null) {
            unify = machine.loadPred(Const.strIntern("unify"), 2);
        }
    }

    /*@Override*/
    @Override
    public int arity() {
        return 1;
    }

    /*@Override*/
    @Override
    public Code exec(PrologMachine mach) {
        Term[] local_aregs = mach.getAreg();
        local_aregs[2] = local_aregs[1];
        local_aregs[1] = JpFactory.Long(id++);
        return unify;
    }

}
