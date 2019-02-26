
package SxxMachine;

import java.util.ArrayList;
import java.util.List;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_read_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_read_1_1();

    static Code nexttoken2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("cut");

    static String string2 = Const.strIntern("maketerm");

    static String string3 = Const.strIntern("nexttoken");

    static String string4 = Const.strIntern("read");

    static String string5 = Const.strIntern("readall");

    static Int posint1 = JpFactory.Long(1);

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
        Term aregs[] = mach.createAregCopy(2);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_read_1_1 extends pred_read_1 {
    private Term ignore(Term o, String[][] ignores) {
        if (ignores == null || !(o instanceof StructureTerm))
            return o;
        Term arg = ((StructureTerm) o).args()[0].dref();
        for (int i = 0; i < ignores.length; i++) {
            if (arg.equalsTerm(JpFactory.S("const", JpFactory.CONST(ignores[i][0]))))
                return findToken((StructureTerm) o, ignores[i][1], ignores).args()[1].dref();
        }
        return o;
    }

    private StructureTerm findToken(StructureTerm f, String token, String[][] ignores) {
        Term c = JpFactory.S("const", JpFactory.CONST(token));
        Term next = ignore(f.args()[1].dref(), ignores);
        while (next.isCons()) {
            f = (StructureTerm) next;
            if (f.args()[0].dref().equalsTerm(c))
                return f;
            next = ignore(f.args()[1].dref(), ignores);
        }
        return null;
    }

    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();

        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        local_aregs[0] = var2;
        local_aregs[1] = JpFactory.S(string5, var2.dref(), var3, JpFactory.S(string2, var3.dref(), var1
                .dref(), JpFactory.S(string0, new HeapChoice(mach.getCUTB()), continuation)));
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

    private List<Term> readIn(PrologMachine mach) {
        List<Term> in = new ArrayList<Term>();
        boolean stop = false;
        while (!stop) {
            Term o = mach.nexttoken();
            if (o instanceof Const) {
                Const c = (Const) o;
                if (c.fname().equals(Lexer.ENDOFCLAUSE))
                    stop = true;
                else if (c.fname().equals(Lexer.ENDOFFILE))
                    stop = true;
                else
                    in.add(c);
            } else
                in.add(o);
        }
        return in;
    }
}
