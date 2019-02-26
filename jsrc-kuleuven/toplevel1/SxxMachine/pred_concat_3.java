
package SxxMachine;

public class pred_concat_3 extends Code {

    final static Code concat1 = new Concat1();
    final static Code concat2 = new Concat2();

    @Override
    public int arity() {
        return 3;
    }

    protected String getAsString(Term o) {
        if (o instanceof Const) {
            return ((Const) o).toString();
        }
        if (o instanceof AFunct) {
            AFunct f = (AFunct) o;
            if (f.arity() == 0)
                return f.fname();
        }
        return null;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term v1 = areg[0].dref();
        Term v2 = areg[1].dref();
        Term v3 = areg[2].dref();
        String v1Str = getAsString(v1);
        String v2Str = getAsString(v2);
        String v3Str = getAsString(v3);
        if (v1Str != null) {
            if (v2Str != null) {
                v3Str = v1Str + v2Str;
                if (!v3.unify(JpFactory.CONST(v3Str)))
                    return mach.Fail0;
            } else {
                if (v3Str == null)
                    return mach.Fail0;
                if (!v3Str.startsWith(v1Str))
                    return mach.Fail0;
                v2Str = v3Str.substring(v1Str.length());
                if (!v2.unify(JpFactory.CONST(v2Str)))
                    return mach.Fail0;
            }
        } else if (v2Str != null) {
            //v1Str is wel null
            if (v3Str == null)
                return mach.Fail0;
            if (!v3Str.endsWith(v2Str))
                return mach.Fail0;
            v1Str = v3Str.substring(0, v3Str.length() - v2Str.length());
            if (!v1.unify(JpFactory.CONST(v1Str)))
                return mach.Fail0;
        } else {
            if (v3Str == null)
                return mach.Fail0;
            //Opsplitsing teken per teken teruggeven
            mach.createChoicePoint(new Term[] { v1, v2, v3, areg[3] });
            return concat1.exec(mach);
        }
        areg[0] = areg[3];
        areg[3] = areg[2] = areg[1] = null;
        return mach.Call1;
    }

}

class Concat1 extends pred_concat_3 {

    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(concat2);
        Term[] areg = mach.getAreg();
        Term v1 = areg[0].dref();
        Term v2 = areg[1].dref();
        Term v3 = areg[2].dref();
        if (!v1.unify(JpFactory.CONST("")))
            return mach.Fail0;
        if (!v2.unify(v3))
            return mach.Fail0;
        areg[0] = areg[3];
        areg[3] = areg[2] = areg[1] = null;
        return mach.Call1;
    }

}

class Concat2 extends pred_concat_3 {

    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term[] areg = mach.getAreg();
        Term v1 = areg[0].dref();
        Term v2 = areg[1].dref();
        Term v3 = areg[2].dref();
        String v3Str = getAsString(v3);
        if (v3Str == null)
            return mach.Fail0;
        JpVar var = JpFactory.JVAR(mach);
        areg[0] = JpFactory.S("concat", var, v2, JpFactory.CONST(v3Str.substring(1)), JpFactory
                .S("concat", JpFactory.CONST(v3Str.substring(0, 1)), var, v1, areg[3]));
        areg[3] = areg[2] = areg[1] = null;
        return mach.Call1;
    }

}
