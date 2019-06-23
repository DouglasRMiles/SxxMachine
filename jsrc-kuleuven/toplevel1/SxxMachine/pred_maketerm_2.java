
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import java.util.HashMap;
import java.util.Map;

import SxxMachine.pterm.StructureTerm;
import SxxMachine.pterm.TermData;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_maketerm_2 extends Code {

    static Code entry_code;

    static Code cl1 = new pred_maketerm_2_1();

    static Code maketerm4cont;

    static String string0 = internS("cut");

    static String string1 = internS("maketerm");

    static NumberTerm posint1200 = Integer(1200);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        maketerm4cont = mach.loadPred("maketerm", 3);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        return cl1.exec(mach);
    }
}

class pred_maketerm_2_1 extends pred_maketerm_2 {
    private Term ignore(Term o, String[][] ignores) {
        if (ignores == null || !(o instanceof StructureTerm))
            return o;
        final Term arg = o.getPlainArg(0).dref();
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

    private void parseKomma(StructureTerm o, PrologMachine mach, Map<JpVar, StructureTerm> lists) {
        final StructureTerm komma = findToken(o, ",", new String[][] { { "(", ")" } });
        if (komma == null)
            return;
        if (findToken(o, ",", null) != komma) {
            final JpVar v = Jv(mach);
            StructureTerm start = o = (StructureTerm) o.getPlainArg(1).dref(); //Eerste element negeren
            //Vanaf start tot komma opnemen voor te parsen en binden met v
            final Term arg0 = start.getPlainArg(1);
            while (arg0.dref() != komma)
                start = (StructureTerm) arg0.dref();
            start.setarg0(1, Prolog.Nil);
            lists.put(v, (StructureTerm) S(o.fname(), o.args().clone()));
            o.setarg0(0, S("var", v, CONST("__ListItem" + v), Integer(0)));
            o.setarg0(1, komma);
            //Funct f = lists.get(v);
        }
        parseKomma(komma, mach, lists);
    }

    private Term fastParse(Term o, PrologMachine mach, Map<JpVar, StructureTerm> lists) {
        if (!o.isCons())
            return o;
        final StructureTerm start = (StructureTerm) o;
        //Lijsten eruit pikken en apart laten verwerken voor sneller parsen
        final StructureTerm startList = findToken(start, "[", null);
        if (startList == null)
            return o;
        final StructureTerm endList = findToken(startList, "]", new String[][] { { "[", "]" } });
        if (endList == null)
            return o;
        if (endList.getPlainArg(1).dref().isNil())
            return o;
        //Nu lijst sneller parsen
        final StructureTerm lijst = (StructureTerm) TermData.CONS(startList.getPlainArg(0), startList.getPlainArg(1));
        //aangezien endlist.next != nil --> volgend element --> funct
        final StructureTerm next = (StructureTerm) endList.getPlainArg(1).dref();
        startList.setarg0(1, next);
        final JpVar list = Jv(mach);
        startList.setarg0(0, S("var", list, CONST("___List" + list), Integer(0)));
        endList.setarg0(1, Prolog.Nil);
        //Lijst eruit geknipt nu
        final StructureTerm resList = (StructureTerm) fastParse(lijst, mach, lists);
        //Lijst bevat nu geen sublijsten meer, maar voor extra versnelling ook ','-parsen nog optimaliseren?
        parseKomma(lijst, mach, lists);
        //Beslissen of we zelf lijst gaan maken of geheel door maketerm_3 laten doen
        if (resList.equalsTerm(S(".", CONST("["), S(".", CONST("]"), Prolog.Nil)))) {
            list.unifyJP(Prolog.Nil);
        } else {
            lists.put(list, resList);
        }
        return fastParse(o, mach, lists);
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Const eof = CONST("end_of_file");
        if (areg0.unifyJP(eof)) {
            if (areg1.unifyJP(eof)) {
                //op het einde vd stream?
                mach.setCont(local_aregs, 0, continuation);
                mach.setARegENull(local_aregs, 2, 1);
                //System.out.println("end_of_file " + continuation);
                return mach.getCall1();
            }
        }
        final Term var2 = Jv(mach);
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        //System.out.println("Maketerm voor: " + areg0);
        final Map<JpVar, StructureTerm> subs = new HashMap<JpVar, StructureTerm>();
        local_aregs.setAreg0((fastParse(areg0, mach, subs)));
        //local_aregs.a(0).v = areg0;
        Term extras = null;
        for (final Map.Entry<JpVar, StructureTerm> e : subs.entrySet()) {
            if (extras == null) {
                extras = S("maketerm", e.getValue(), e.getKey(), continuation);
            } else {
                extras = S("maketerm", e.getValue(), e.getKey(), extras);
            }
        }

        local_aregs.setAreg0((areg0));
        local_aregs.setAreg1((var2.dref()));
        local_aregs.setAreg2((posint1200));
        mach.setCont(local_aregs, 3, (extras == null ? continuation : extras));
        //mach.setCont(local_aregs,3,continuation);
        //mach.DoCut(mach.CUTB);
        mach.updateCUTB();
        return maketerm4cont;
    }
}
