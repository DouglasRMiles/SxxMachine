
package SxxMachine;

public class pred_name_2 extends Code {

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term atom = local_aregs[0].dref();
        Term list = local_aregs[1].dref();
        Term continuation = local_aregs[2];
        local_aregs[0] = local_aregs[1] = local_aregs[2] = null;
        if (atom.isVariable()) {
            if (!(list.isCons() || list.isNil()))
                return mach.Fail0;
            String st = buildString(list);
            if (!atom.unify(JpFactory.CONST(st)))
                return mach.Fail0;
        } else {
            //van atom naar een lijst gaan, dat unify met list
            if (atom instanceof StructureTerm) {
                if (((StructureTerm) atom).arity() != 0)
                    return mach.Fail0;
            }
            Term l = buildList(atom.toString());
            if (!list.unify(l))
                return mach.Fail0;
        }
        local_aregs[0] = continuation;
        return mach.Call1;
    }

    private Term buildList(String st) {
        if (st.length() == 0)
            return JpFactory.CONST("[]");
        return JpFactory.S(".", JpFactory.Long(st.charAt(0)), buildList(st.substring(1)));
    }

    private String buildString(Term list) {
        StringBuilder b = new StringBuilder();
        list = list.dref();
        while (!list.isNil()) {
            if (list instanceof AFunct) {
                AFunct f = (AFunct) list;
                Term ch = f.args()[0].dref();
                if (!(ch instanceof Int))
                    return null;
                b.append((char) ((Int) ch).longValue());
                list = f.args()[1].dref();
            }
        }
        return b.toString();
    }

}
