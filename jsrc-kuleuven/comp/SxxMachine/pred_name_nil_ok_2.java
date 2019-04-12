// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Integer;
import static SxxMachine.pterm.TermData.*;

class pred_name_nil_ok_2_consts {
    Code entry_code;
    Code atom_codes3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("name_nil_ok");
    final static String string2 = internS("atom_codes");
    final static String string3 = internS("cut");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_name_nil_ok_2 extends Code {
    private final pred_name_nil_ok_2_consts consts;

    public pred_name_nil_ok_2() {
        consts = new pred_name_nil_ok_2_consts();
        initAlternatives();
    }

    protected pred_name_nil_ok_2(pred_name_nil_ok_2 c) {
        consts = c.getConsts();
    }

    protected final pred_name_nil_ok_2_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.atom_codes3cont = mach.loadPred("atom_codes", 2);
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
        local_aregs.setAV(1,var2.dref());

        mach.setCont(local_aregs, 2, S(pred_name_nil_ok_2_consts.string0, new HeapChoice(
                mach.getCUTB()), continuation));
        mach.updateCUTB();
        return getConsts().atom_codes3cont;

    }
}
