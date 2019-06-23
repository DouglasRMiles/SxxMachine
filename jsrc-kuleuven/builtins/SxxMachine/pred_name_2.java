
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.S;

import SxxMachine.pterm.StructureTerm;

public class pred_name_2 extends Code {

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term atom = local_aregs.getTermDRef(0);
        final Term list = local_aregs.getTermDRef(1);
        final Term continuation = mach.getCont(local_aregs, 2);
        mach.setARegENull(local_aregs, 0, 2);
        if (atom.isVariable()) {
            if (!(list.isCons() || list.isNil()))
                return mach.Fail0;
            final String st = buildString(list);
            if (!atom.unifyJP(CONST(st)))
                return mach.Fail0;
        } else {
            //van atom naar een lijst gaan, dat unify met list
            if (atom instanceof StructureTerm) {
                if (atom.arity() != 0)
                    return mach.Fail0;
            }
            final Term l = buildList(atom.portrayTerm());
            if (!list.unifyJP(l))
                return mach.Fail0;
        }
        mach.setCont(local_aregs, 0, continuation);
        return mach.getCall1();
    }

    private Term buildList(String st) {
        if (st.length() == 0)
            return CONST("[]");
        return S(".", Integer(st.charAt(0)), buildList(st.substring(1)));
    }

    private String buildString(Term list) {
        final StringBuilder b = new StringBuilder();
        list = list.dref();
        while (!list.isNil()) {
            if (list.isCompound()) {
                final AFunct f = (AFunct) list;
                final Term ch = f.getPlainArg(0).dref();
                if (!(ch instanceof NumberTerm))
                    return null;
                b.append((char) ch.longValue());
                list = f.getPlainArg(1).dref();
            }
        }
        return b.toString();
    }

}
