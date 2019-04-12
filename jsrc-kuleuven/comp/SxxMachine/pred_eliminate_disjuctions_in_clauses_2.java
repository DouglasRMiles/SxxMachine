// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Integer;
// Jv;
// internS;
import static SxxMachine.pterm.TermData.*;

class pred_eliminate_disjuctions_in_clauses_2_consts {
    Code entry_code;
    Code eliminate_disjunction_list4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("eliminate_disjuctions_in_clauses");
    final static String string2 = internS("eliminate_disjunction_list");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_eliminate_disjuctions_in_clauses_2 extends Code {
    private final pred_eliminate_disjuctions_in_clauses_2_consts consts;

    public pred_eliminate_disjuctions_in_clauses_2() {
        consts = new pred_eliminate_disjuctions_in_clauses_2_consts();
        initAlternatives();
    }

    protected pred_eliminate_disjuctions_in_clauses_2(pred_eliminate_disjuctions_in_clauses_2 c) {
        consts = c.getConsts();
    }

    protected final pred_eliminate_disjuctions_in_clauses_2_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.eliminate_disjunction_list4cont = mach.loadPred("eliminate_disjunction_list", 3);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2)))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());

        local_aregs.setAV(1,pred_eliminate_disjuctions_in_clauses_2_consts.posint1);
        local_aregs.setAV(2,var2.dref());
        mach.setCont(local_aregs, 3, continuation);
        mach.updateCUTB();
        return getConsts().eliminate_disjunction_list4cont;

    }
}
