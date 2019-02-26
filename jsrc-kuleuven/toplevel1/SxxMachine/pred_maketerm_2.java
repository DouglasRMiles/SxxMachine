
package SxxMachine;

import java.util.HashMap;
import java.util.Map;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_maketerm_2 extends Code {

    static Code entry_code;

    static Code cl1 = new pred_maketerm_2_1();

    static Code maketerm4cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("maketerm");

    static Int posint1200 = JpFactory.Long(1200);

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

    private void parseKomma(StructureTerm o, PrologMachine mach, Map<JpVar, StructureTerm> lists) {
        StructureTerm komma = findToken(o, ",", new String[][] { { "(", ")" } });
        if (komma == null)
            return;
        if (findToken(o, ",", null) != komma) {
            JpVar v = JpFactory.JVAR(mach);
            StructureTerm start = o = (StructureTerm) o.args()[1].dref(); //Eerste element negeren
            //Vanaf start tot komma opnemen voor te parsen en binden met v      
            while (start.args()[1].dref() != komma)
                start = (StructureTerm) start.args()[1].dref();
            start.args()[1] = Const.NIL;
            lists.put(v, JpFactory.S(o.fname(), o.args().clone()));
            o.args()[0] = JpFactory.S("var", v, JpFactory.CONST("__ListItem" + v), JpFactory.Long(0));
            o.args()[1] = komma;
            //Funct f = lists.get(v);
        }
        parseKomma(komma, mach, lists);
    }

    private Term fastParse(Term o, PrologMachine mach, Map<JpVar, StructureTerm> lists) {
        if (!o.isCons())
            return o;
        StructureTerm start = (StructureTerm) o;
        //Lijsten eruit pikken en apart laten verwerken voor sneller parsen
        final StructureTerm startList = findToken(start, "[", null);
        if (startList == null)
            return o;
        StructureTerm endList = findToken(startList, "]", new String[][] { { "[", "]" } });
        if (endList == null)
            return o;
        if (endList.args()[1].dref().isNil())
            return o;
        //Nu lijst sneller parsen
        StructureTerm lijst = JpFactory.S(".", startList.args()[0], startList.args()[1]);
        //aangezien endlist.next != nil --> volgend element --> funct
        StructureTerm next = (StructureTerm) endList.args()[1].dref();
        startList.args()[1] = next;
        JpVar list = JpFactory.JVAR(mach);
        startList.args()[0] = JpFactory.S("var", list, JpFactory.CONST("___List" + list), JpFactory.Long(0));
        endList.args()[1] = Const.NIL;
        //Lijst eruit geknipt nu        
        StructureTerm resList = (StructureTerm) fastParse(lijst, mach, lists);
        //Lijst bevat nu geen sublijsten meer, maar voor extra versnelling ook ','-parsen nog optimaliseren?
        parseKomma(lijst, mach, lists);
        //Beslissen of we zelf lijst gaan maken of geheel door maketerm_3 laten doen
        if (resList.equalsTerm(JpFactory
                .S(".", JpFactory.CONST("["), JpFactory.S(".", JpFactory.CONST("]"), Const.NIL)))) {
            list.unify(Const.NIL);
        } else {
            lists.put(list, resList);
        }
        return fastParse(o, mach, lists);
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Const eof = JpFactory.CONST("end_of_file");
        if (areg0.unify(eof)) {
            if (areg1.unify(eof)) {
                //op het einde vd stream?
                local_aregs[0] = continuation;
                local_aregs[1] = local_aregs[2] = null;
                //System.out.println("end_of_file " + continuation);
                return mach.Call1;
            }
        }
        Term var2 = JpFactory.JVAR(mach);
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        //System.out.println("Maketerm voor: " + areg0);
        Map<JpVar, StructureTerm> subs = new HashMap<JpVar, StructureTerm>();
        local_aregs[0] = fastParse(areg0, mach, subs);
        //local_aregs[0] = areg0;
        Term extras = null;
        for (Map.Entry<JpVar, StructureTerm> e : subs.entrySet()) {
            if (extras == null) {
                extras = JpFactory.S("maketerm", e.getValue(), e.getKey(), continuation);
            } else {
                extras = JpFactory.S("maketerm", e.getValue(), e.getKey(), extras);
            }
        }

        local_aregs[0] = areg0;
        local_aregs[1] = var2.dref();
        local_aregs[2] = posint1200;
        local_aregs[3] = (extras == null ? continuation : extras);
        //local_aregs[3] = continuation;
        //mach.DoCut(mach.CUTB);
        mach.updateCUTB();
        return maketerm4cont;
    }
}
