package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import java.util.IdentityHashMap;
import java.util.Map;

import SxxMachine.pterm.VariableTerm;

public class sxxtensions extends missing_preds {

    public static Operation PRED_$003A$002D_2_static_exec(Prolog m) {
        return PRED_nb_getval_2_static_exec(m);
    }

    static {
        PredTable.scanPreds(sxxtensions.class);
    }

    public static Operation PRED_nb_linkval_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        linkval(m, a1, a2);
        return m.getCont();
    }

    static void linkval(Prolog m, Term a1, Term a2) {
        final Map<Term, Term> saved = m.getTermBlackboard();
        saved.put(a1.functor(), a2);
    }

    static Term currentval(Prolog m, Term a1) {
        final Map<Term, Term> saved = m.getTermBlackboard();
        return saved.get(a1.functor());
    }

    public static Operation PRED_b_setval_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        final Map<Term, Term> saved = m.getTermBlackboard();
        Term was = saved.get(a1.functor());
        if (was == null)
            was = Prolog.Nil;
        final VariableTerm sav = new VariableTerm();
        sav.Refers = was;
        sav.bind(a2, m.trail);
        linkval(m, a1, sav);
        return m.getCont();
    }

    public static Operation PRED_nb_setval_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        linkval(m, a1, a2.duplicateTerm());
        return m.getCont();
    }

    public static Operation PRED_b_getval_2_static_exec(Prolog m) {
        return PRED_nb_getval_2_static_exec(m);
    }

    public static Operation PRED_nb_getval_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        final Map<Term, Term> saved = m.getTermBlackboard();
        final Term arg0 = saved.get(a1.functor());
        if (!a2.unify(arg0, m.trail)) {
            return m.fail();
        }
        return m.getCont();
    }

    public static Operation PRED_nb_current_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        final Map<Term, Term> saved = m.getTermBlackboard();
        final Term arg0 = saved.get(a1.functor());
        if (arg0 == null || !a2.unify(arg0, m.trail)) {
            return m.fail();
        }
        return m.getCont();
    }

    public Operation PRED_cputime_1_static_exec(Prolog m) {
        m.setB0();
        final long t = java.lang.System.currentTimeMillis();
        if (!m.getPlainArg(0).unify(Long(t), m.trail))
            return m.fail();
        return m.getCont();
    }

    public static boolean DoSetArg3(Prolog m, Term arg1, Term arg2, Term arg3) {
        arg1 = arg1.dref();
        arg2 = arg2.dref();
        arg3 = arg3.dref();
        if (!(arg1.isInteger()))
            return false;
        if (!(arg2.isCompound()))
            return false;
        final int i = arg1.intValue();
        if (i < 1)
            return false;
        final int l = arg2.arity();
        if (i > l)
            return false;
        return DoSetArg3_p2(m, i, arg2, arg3);
    }

    public static boolean DoSetArg3_p2(Prolog m, int i, Term arg2, Term arg3) {
        if (m == null) {
            arg2.setarg0Maybe_trail(null, i - 1, arg3);
            return true;
        }
        final Term x = arg2.getPlainArg(i - 1);
        final VariableTerm v = V(m);
        v.Refers = arg3;
        arg2.setarg0Maybe_trail(null, i - 1, v);
        m.push(new SetArgTrail(x, v, m));
        return true;
    }

    public static Operation PRED_setarg_3_static_exec(Prolog m) {
        m.setB0();
        if (!DoSetArg3(m, m.getPlainArg(0), m.getPlainArg(1), m.getPlainArg(2)))
            return m.fail();
        return m.getCont();
    }

    // A = foo(1),setarg(1,A,2)
    static {
        PredTable.registerBuiltin("setarg", 3, sxxtensions::PRED_setarg_3_static_exec);
        PredTable.registerBuiltin("nb_setarg", 3, sxxtensions::PRED_nb_setarg_3_static_exec);
    }

    // A = foo(1), findall(A, (nb_setarg(1,A,2) ; true), L), [foo(2),foo(2)] = L.

    static boolean NonBacktrackingSetArg(Prolog m, Term arg1, Term arg2, Term arg3) {
        arg1 = arg1.dref();
        arg2 = arg2.dref();
        arg3 = arg3.dref();

        if (!(arg1.isInteger()))
            return false;
        if (arg2.isAtomicValue())
            return false;
        final int i = arg1.intValue();
        if (i < 1)
            return false;
        final int l = arg2.arity();
        if (i > l)
            return false;
        arg2.setArg(i - 1, arg3.dref());
        return true;
    }

    public static Operation PRED_nb_setarg_3_static_exec(Prolog m) {
        m.setB0();
        if (!NonBacktrackingSetArg(m, m.getPlainArg(0), m.getPlainArg(1), m.getPlainArg(2)))
            return m.fail();
        return m.getCont();
    }

    public final static class SetArgTrail implements Undoable {
        Term OldValue;
        VariableTerm Which;
        Prolog m;

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "$SetArgTrail " + this.OldValue + " " + this.Which;
        }

        SetArgTrail(Term old, Var changed, Prolog m) {
            //  super("$SetArgTrail", old, changed);
            this.OldValue = old;
            this.Which = (VariableTerm) changed;
            this.m = m;
        }

        @Override
        public void undo() {
            this.Which.Refers = this.OldValue;
            this.Which.timeStamp = this.m.getCPFTimeStamp();
        }

    }

    public final static class PopPendingGoals implements Undoable {
        Prolog m;
        Term old;

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "$PopPendingGoals " + this.old;
        }

        public PopPendingGoals(Prolog m, Term o) {
            //super("$PopPendingGoals", o);
            this.m = m;
            this.old = o;
        }

        @Override
        public void undo() {
            this.m.pendingGoals = this.old;
        }

    }

    public final static class PopAssumptions implements Undoable {
        Prolog m;
        Term old;

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "$PopAssumptions " + this.old;
        }

        PopAssumptions(Prolog m, Term o) {
            // super("$PopAssumptions", o);
            this.m = m;
            this.old = o;
        }

        @Override
        public void undo() {
            this.m.assumptions = this.old;
        }

    }

    static {
        PredTable.registerBuiltin("freeze", 2, sxxtensions::PRED_freeze_2_static_exec);
        PredTable.registerBuiltin("frozen", 2, sxxtensions::PRED_frozen_2_static_exec);
    }

    public static Operation PRED_freeze_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        a1.freeze(m.trail, a2);
        return m.getCont();
    }

    public static Operation PRED_frozen_2_static_exec(Prolog m) {

        m.setB0();
        Term a1, a2;
        a1 = m.getPlainArg(0);
        a2 = m.getTermDRef(1);
        final Term goals = a1.frozenGoals();
        if (!a2.unify(goals, m.trail)) {
            return m.fail();
        }

        return m.getCont();
    }
    // package TauMachine.builtin;

    // import TauMachine.Operation;
    // import TauMachine.Predicate;
    // import TauMachine.Prolog;
    // import TauMachine.Term;
    static {
        PredTable.registerBuiltin("copy_term_nat", 2, sxxtensions::PRED_copy_term_nat_2_static_exec);
        PredTable.registerBuiltin("copy_term_att", 2, sxxtensions::PRED_copy_term_att_2_static_exec);
        PredTable.registerBuiltin("copy_term", 3, sxxtensions::PRED_copy_term_3_static_exec);

        PredTable.registerBuiltin("attvar", 1, sxxtensions::PRED_attvar_1_static_exec);
        PredTable.registerBuiltin("get_attr", 3, sxxtensions::PRED_get_attr_3_static_exec);
        PredTable.registerBuiltin("put_attr", 3, sxxtensions::PRED_put_attr_3_static_exec);
        PredTable.registerBuiltin("get_attrs", 2, sxxtensions::PRED_get_attrs_2_static_exec);
        PredTable.registerBuiltin("put_attrs", 2, sxxtensions::PRED_put_attrs_2_static_exec);
    }

    public static Operation PRED_copy_term_3_static_exec(Prolog m) {
        Term a1, a2, a3;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        a3 = m.getTermDRef(2);
        final Map<Object, Term> saved = new IdentityHashMap<Object, Term>();
        if (!a2.unify(a1.copy(saved, Term.COPY_SAVE_ATTRS_COPY), m.trail)) {
            return m.fail();
        }
        final Term copyGoals = saved.get(Prolog.GOALS);
        if (sxxtensions.isNoGoal(copyGoals)) {
            if (!a3.unify(Prolog.Nil, m.trail)) {
                return m.fail();
            }
        } else {
            if (!a3.unify(copyGoals, m.trail)) {
                return m.fail();
            }
        }
        return m.getCont();
    }

    public static Operation PRED_copy_term_nat_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        final Map<Object, Term> saved = new IdentityHashMap<Object, Term>();
        if (!a2.unify(a1.copy(saved, Term.COPY_NO_ATTRS), m.trail)) {
            return m.fail();
        }
        return m.getCont();
    }

    public static Operation PRED_copy_term_att_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        final Map<Object, Term> saved = new IdentityHashMap<Object, Term>();
        final Term copy = a1.copy(saved, Term.COPY_ALL);
        if (!a2.unify(copy, m.trail)) {
            return m.fail();
        }
        return m.getCont();
    }

    public static Operation PRED_attvar_1_static_exec(Prolog m) {
        m.setB0();
        Term a1;
        a1 = m.getPlainArg(0);
        a1 = a1.dref();
        if (!a1.isAttvar()) {
            return m.fail();
        }
        return m.getCont();
    }

    public static Operation PRED_get_attr_3_static_exec(Prolog m) {
        m.setB0();
        Term a1, a2, a3;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        a3 = m.getTermDRef(2);
        final Term t = a1.findOrAttrValue(m.trail, false, a2);
        if (!t.isCompound())
            return m.fail();
        if (!a3.unify(t.getPlainArg(1), m.trail))
            return m.fail();
        return m.getCont();
    }

    public static Operation PRED_get_attrs_2_static_exec(Prolog m) {

        m.setB0();
        Term a1, a2;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        final Term attrs = a1.getAttrs();
        if (!a2.unify(attrs, m.trail)) {
            return m.fail();
        }

        return m.getCont();
    }

    public static Operation PRED_put_attr_3_static_exec(Prolog m) {
        Term a1, a2, a3;
        a1 = m.getTermDRef(0);
        a2 = m.getTermDRef(1);
        a3 = m.getTermDRef(2);
        a1.putAttrValue(m.trail, a2, a3);
        return m.getCont();
    }

    public static Operation PRED_put_attrs_2_static_exec(Prolog m) {
        m.getTermDRef(0).setAttrs(m.trail, m.getTermDRef(1));
        return m.getCont();

    }

    public static Operation PRED_peek_pending_1_static_exec(final Prolog m) {
        m.setB0();
        final Term a1 = m.getTermDRef(0);
        final Term goals = m.peekPendingGoals();
        if (!a1.unify(goals, m.trail)) {
            return m.fail();
        }
        return m.getCont();
    }

    public static Operation PRED_add_pending_1_static_exec(final Prolog m) {
        final Term a1 = m.getTermDRef(0);
        m.addPendingGoal(a1);
        return m.getCont();
    }

    public static Operation PRED_push_pending_1_static_exec(final Prolog m) {
        final Term a1 = m.getTermDRef(0);
        m.addPendingGoal(a1);
        return m.getCont();
    }

    public static Operation PRED_undo_1_static_exec(final Prolog m) {
        final Term a1 = m.getTermDRef(0);
        m.push(new Undoable() {
            @Override
            public void undo() {
                m.addPendingGoal(a1);
            }
        });
        return m.getCont();
    }

    public static Operation PRED_assume_1_static_exec(Prolog m) {
        final Term arg1 = m.getTermDRef(0);
        final Term ass = (m.assumptions).dref();
        m.push(new PopAssumptions(m, ass));
        m.assumptions = CONS(arg1, ass);
        return m.getCont();
    }

    public static Operation PRED_allassumed_1_static_exec(Prolog m) {
        final Term arg1 = m.getTermDRef(0);
        final Term ass = (m.assumptions).dref();
        if (!(arg1.unify(ass, m.trail)))
            return m.fail();
        return m.getCont();
    }

    public static void loadFile() {
        PredTable.registerBuiltin("undo", 1, sxxtensions::PRED_undo_1_static_exec);
        PredTable.registerBuiltin("add_pending", 1, sxxtensions::PRED_add_pending_1_static_exec);
        PredTable.registerBuiltin("push_pending", 1, sxxtensions::PRED_push_pending_1_static_exec);
        PredTable.registerBuiltin("peek_pending", 1, sxxtensions::PRED_peek_pending_1_static_exec);
        PredTable.registerBuiltin("assume", 1, sxxtensions::PRED_assume_1_static_exec);
        PredTable.registerBuiltin("allassumed", 1, sxxtensions::PRED_allassumed_1_static_exec);
    }

    public static Term get_attribute_goals(Term copy, Term frozen) {
        if (sxxtensions.isNoGoal(frozen))
            return null;
        return S("put_attrs", copy, frozen);
    }

    public static Term appendGoals(Term sofar, Term goals1) {
        Term result = null;
        if (sxxtensions.isNoGoal(sofar)) {
            result = goals1;
        } else if (sxxtensions.isNoGoal(goals1)) {
            result = sofar;
        } else {
            return S(",", sofar, goals1);
        }
        if (sxxtensions.isNoGoal(result)) {
            result = null;
        }
        return result;
    }

    public static boolean isNoGoal(Term sofar) {
        return sofar == null || sofar == Prolog.Nil || sofar == Prolog.True;
    }
}
