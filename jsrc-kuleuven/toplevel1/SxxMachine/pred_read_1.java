
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import SxxMachine.pterm.StructureTerm;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_read_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_read_1_1();

    static Code nexttoken2cont;

    static String string0 = internS("cut");

    static String string1 = internS("cut");

    static String string2 = internS("maketerm");

    static String string3 = internS("nexttoken");

    static String string4 = internS("read");

    static String string5 = internS("readall");

    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        nexttoken2cont = mach.loadPred("nexttoken", 1);
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(2);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_read_1_1 extends pred_read_1 {
    private Term ignore(Term o, String[][] ignores) {
        if (ignores == null || !(o instanceof StructureTerm))
            return o;
        final Term arg = ((StructureTerm) o).getPlainArg(0).dref();
        for (int i = 0; i < ignores.length; i++) {
            if (arg.equalsTerm(S("const", CONST(ignores[i][0]))))
                return findToken((StructureTerm) o, ignores[i][1], ignores).getPlainArg(1).dref();
        }
        return o;
    }

    private StructureTerm findToken(StructureTerm f, String token, String[][] ignores) {
        final Term c = S("const", CONST(token));
        Term next = ignore(f.getPlainArg(1).dref(), ignores);
        while (next.isCons()) {
            f = (StructureTerm) next;
            if (f.getPlainArg(0).dref().equalsTerm(c))
                return f;
            next = ignore(f.getPlainArg(1).dref(), ignores);
        }
        return null;
    }

    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();

        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        local_aregs[0] = var2;
        local_aregs[1] = S(string5, var2.dref(), var3, S(string2, var3.dref(), var1
                .dref(), S(string0, new HeapChoice(mach.getCUTB()), continuation)));
        mach.updateCUTB();
        return nexttoken2cont;
        /*
        List<PrologObject> in = readIn(mach);
        if (in.isEmpty()) {
        if (!areg0.Unify(new Const(Lexer.ENDOFFILE))) return mach.Fail0;
        }
        else {
        if (!areg0.Unify(buildTerm(in))) return mach.Fail0;
        }
        mach.CUTB = mach.CurrentChoice;
        local_aregs[0] = continuation;
        return mach.Call1;*/
    }
}
