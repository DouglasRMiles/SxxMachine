
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

public class pred_concat_3 extends Code {

    final static Code concat1 = new Concat1();
    final static Code concat2 = new Concat2();

    @Override
    public int arity() {
        return 3;
    }

    protected String getAsString(Term o) {
        if (o.isAtomOrObject()) {
            // portrayTerm is being deleted from Term
            // and put into Const
            // @TODO replace with return ((Const) o).portrayTerm();
           // afterwards
            return o.portrayTerm();
        }
        if (o.isCompound()) {
            final AFunct f = (AFunct) o;
            if (f.arity() == 0)
                return f.fname();
        }
        return null;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term v1 = local_aregs.getTermDRef(0);
        final Term v2 = local_aregs.getTermDRef(1);
        final Term v3 = local_aregs.getTermDRef(2);
        String v1Str = getAsString(v1);
        String v2Str = getAsString(v2);
        String v3Str = getAsString(v3);
        if (v1Str != null) {
            if (v2Str != null) {
                v3Str = v1Str + v2Str;
                if (!v3.unifyJP(CONST(v3Str)))
                    return mach.Fail0;
            } else {
                if (v3Str == null)
                    return mach.Fail0;
                if (!v3Str.startsWith(v1Str))
                    return mach.Fail0;
                v2Str = v3Str.substring(v1Str.length());
                if (!v2.unifyJP(CONST(v2Str)))
                    return mach.Fail0;
            }
        } else if (v2Str != null) {
            //v1Str is wel null
            if (v3Str == null)
                return mach.Fail0;
            if (!v3Str.endsWith(v2Str))
                return mach.Fail0;
            v1Str = v3Str.substring(0, v3Str.length() - v2Str.length());
            if (!v1.unifyJP(CONST(v1Str)))
                return mach.Fail0;
        } else {
            if (v3Str == null)
                return mach.Fail0;
            //Opsplitsing teken per teken teruggeven
            // @TODO make sure createChoicePoint calls args.clone(); if using varargs
            mach.createChoicePoint(v1, v2, v3, local_aregs.getPlainArg(3));
            return concat1.exec(mach);
        }
        mach.setCont(local_aregs.setAreg0(( local_aregs.getPlainArg(3))));
        local_aregs.setAreg3(( local_aregs.setAreg2(( local_aregs.setAreg1(( null))))));
        return mach.getCall1();
    }

}

class Concat1 extends pred_concat_3 {

    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(concat2);
        final TermArray local_aregs = mach.getAreg();
        final Term v1 = local_aregs.getTermDRef(0);
        final Term v2 = local_aregs.getTermDRef(1);
        final Term v3 = local_aregs.getTermDRef(2);
        if (!v1.unifyJP(CONST("")))
            return mach.Fail0;
        if (!v2.unifyJP(v3))
            return mach.Fail0;
        local_aregs.setAreg0(( local_aregs.getPlainArg(3)));
        local_aregs.setAreg3(( local_aregs.setAreg2(( local_aregs.setAreg1(( null))))));
        return mach.getCall1();
    }

}

class Concat2 extends pred_concat_3 {

    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term v1 = local_aregs.getTermDRef(0);
        final Term v2 = local_aregs.getTermDRef(1);
        final Term v3 = local_aregs.getTermDRef(2);
        final String v3Str = getAsString(v3);
        if (v3Str == null)
            return mach.Fail0;
        final JpVar var = Jv(mach);
        mach.setCont(local_aregs, 0, S("concat", var, v2, CONST(v3Str
                .substring(1)), S("concat", CONST(v3Str.substring(0, 1)), var, v1, local_aregs.getPlainArg(3))));
        local_aregs.setAreg3(( local_aregs.setAreg2(( local_aregs.setAreg1(( null))))));
        return mach.getCall1();
    }

}
