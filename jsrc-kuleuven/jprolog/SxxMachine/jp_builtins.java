
package SxxMachine;

import java.io.PrintWriter;

// some builtins written in Java for Prolog
// Bart Demoen, Paul Tarau Aug 1996 Moncton
// there is a mapping from special names (like <) to tokens
// with only letters - the compiler must be aware of that mapping

// smallerthan implements </2

class pred_smallerthan_2 extends Code {
    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        long i1, i2;
        Term dereffed;
        Term[] areg = mach.getAreg();
        dereffed = areg[0].dref();
        i1 = dereffed.longValue();
        dereffed = areg[1].dref();
        i2 = dereffed.longValue();
        if (i1 < i2) {
            areg[0] = areg[2];
            areg[1] = areg[2] = null;
            return mach.Call1;
        }
        return mach.Fail0;
    }
}

// smallerorequal implements =</2

class pred_smallerorequal_2 extends Code {
    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        long i1, i2;
        Term dereffed;
        Term[] areg = mach.getAreg();
        dereffed = areg[0].dref();
        i1 = dereffed.longValue();
        dereffed = areg[1].dref();
        i2 = dereffed.longValue();
        if (i1 <= i2) {
            areg[0] = areg[2];
            areg[1] = areg[2] = null;
            return mach.Call1;
        }
        return mach.Fail0;
    }
}

// arithequal implements =:=/2

class pred_arithequal_2 extends Code {
    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        long i1, i2;
        Term dereffed;
        Term[] areg = mach.getAreg();
        dereffed = areg[0].dref();
        i1 = dereffed.longValue();
        dereffed = areg[1].dref();
        i2 = dereffed.longValue();
        if (i1 == i2) {
            areg[0] = areg[2];
            areg[1] = areg[2] = null;
            return mach.Call1;
        }
        return mach.Fail0;
    }
}

// arithdifferent implements =\= /2

class pred_arithdifferent_2 extends Code {
    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        long i1, i2;
        Term dereffed;
        Term[] areg = mach.getAreg();
        dereffed = (areg[0]).dref();
        i1 = dereffed.longValue();
        dereffed = (areg[1]).dref();
        i2 = dereffed.longValue();
        if (i1 != i2) {
            areg[0] = areg[2];
            areg[1] = areg[2] = null;
            return mach.Call1;
        }
        return mach.Fail0;
    }
}

// is implements is/2

class pred_is_2 extends Code {
    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        long i1;
        Term dereffed;
        Term[] areg = mach.getAreg();
        dereffed = (areg[1]).dref();
        i1 = dereffed.longValue();
        dereffed = (areg[0]).dref();
        if (!(dereffed.unify(JpFactory.Long(i1))))
            return mach.Fail0;
        areg[0] = areg[2];
        areg[1] = areg[2] = null;
        return mach.Call1;
    }
}

// unify implements =/2

class pred_unify_2 extends Code {
    private final static Logger log = Logger.getLogger(pred_unify_2.class);

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        Term arg2 = areg[1].dref();

        if (!(arg1.unify(arg2))) {
            return mach.Fail0;
        }
        areg[0] = areg[2]; // move continuation to first register
        areg[1] = areg[2] = null;

        if (mach.getExceptionState() == ErrorStatus.CHANGEDPENDINGGOALS) {
            log.info("...pushing interrupt vector to the front of the continuation");
            areg[0] = JpFactory.S(Const.strIntern("call_list"), mach.getPendinggoals(), areg[0]);
            mach.setExceptionState(ErrorStatus.NONE);
            mach.setPendinggoals(Const.NIL);
        }

        return mach.Call1; // call continuation in first register

    }
}

// univ implements =../2

class pred_univ_3 extends Code {
    @Override
    public int arity() {
        return 3;
    }

    // Areg[0] is a free variable
    // Areg[1] is a Const
    // Areg[2] is a list of PrologObjects

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        Term arg2 = areg[1].dref();
        Term arg3 = areg[2].dref();

        //Bij testen van werking code in vergelijking met YAP moet dit ook zo werken voor int
        if (arg1 instanceof Const || arg1 instanceof Int) {
            //Geen parameters bijgevolg
            if (!arg2.unify(arg1))
                return mach.Fail0;
            if (!arg3.unify(JpFactory.CONST("[]")))
                return mach.Fail0;
            areg[0] = areg[3];
            areg[1] = areg[2] = areg[3] = null;
            return mach.Call1;
        } else if (arg1 instanceof AFunct) {
            AFunct term = (AFunct) arg1;
            Term functor = JpFactory.CONST(term.fname());
            Term arguments = AFunct.listFromArray(term.args());
            if (!arg2.unify(functor))
                return mach.Fail0;
            if (!arg3.unify(arguments))
                return mach.Fail0;
            areg[0] = areg[3];
            areg[1] = areg[2] = areg[3] = null;
            return mach.Call1;
        } else {
            Term tail = arg3;
            int l = 0;
            while (tail.isCons()) {
                tail = (((AFunct) tail).args()[1]).dref();
                l++;
            }
            //if (l == 0)          //l == 0 kan als er geen parameters zijn voor de gegeven functie
            //  return mach.Fail0;
            if (!(tail.isNil()))
                return mach.Fail0;
            if (!(arg2 instanceof Const)) {
                if (arg2 instanceof Int && l == 0) {
                    //Moet toch nog werken
                    if (!arg1.unify(arg2))
                        return mach.Fail0;
                    areg[0] = areg[3];
                    areg[1] = areg[2] = areg[3] = null;
                    return mach.Call1;
                }
                return mach.Fail0;
            }
            Term args[] = new Term[l];
            tail = arg3;
            int i;
            for (i = 0; i < l; i++) {
                args[i] = ((AFunct) tail).args()[0];
                tail = (((AFunct) tail).args()[1]).dref();
            }

            if (!arg1.unify(JpFactory.S(arg2.fname(), args)))
                return mach.Fail0;
            areg[0] = areg[3];
            areg[1] = areg[2] = areg[3] = null;
            return mach.Call1;
        }
    }
}

class pred_write_1 extends Code {
    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        String s = (areg[0].dref()).toString();
        PrintWriter writer = mach.getIOLayer().getCurrentOutputStream();
        writer.print(s);
        writer.flush();
        areg[0] = areg[1];
        areg[1] = null;
        return mach.Call1;
    }
}

class pred_nl_0 extends Code {
    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Code exec(PrologMachine mach) {
        mach.getIOLayer().getCurrentOutputStream().println();
        return mach.Call1;
    }
}

class pred_functor_3 extends Code {

    @Override
    public int arity() {
        return 3;
    }

    boolean DoFunctor3(PrologMachine mach, Term arg1, Term arg2, Term arg3) {
        arg1 = arg1.dref();
        arg2 = arg2.dref();
        arg3 = arg3.dref();

        if (arg1 instanceof JpVar) {
            if ((!(arg2 instanceof Const)) || (!(arg3 instanceof Int)))
                return false;
            int i = (int) (((Int) arg3).longValue());
            String Name = arg2.fname();
            Term args[] = new Term[i];
            while (i-- > 0) {
                args[i] = JpFactory.JVAR(mach);
            }
            if (!(arg1.unify(JpFactory.S(Name, args))))
                return false;
        } else {
            String Name = arg1.fname();
            int arity = arg1.arity();

            if (!(arg2.unify(JpFactory.CONST(Name))))
                return false;

            if (!(arg3.unify(JpFactory.Long(arity))))
                return false;
        }
        return true;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        if (!DoFunctor3(mach, areg[0], areg[1], areg[2]))
            return mach.Fail0;
        areg[0] = areg[3]; // install the continuation
        areg[1] = areg[2] = areg[3] = null;
        return mach.Call1;
    }
}

class pred_arg_3 extends Code {
    @Override
    public int arity() {
        return 3;
    }

    boolean DoArg3(PredikatenPrologMachine mach, Term arg1, Term arg2, Term arg3) {
        arg1 = arg1.dref();
        arg2 = arg2.dref();
        arg3 = arg3.dref();

        if (!(arg1 instanceof Int))
            return false;
        if (!(arg2 instanceof AFunct))
            return false;
        int i = (int) (((Int) arg1).longValue());
        if (i < 1)
            return false;
        int l = ((AFunct) arg2).arity();
        if (i > l)
            return false;
        Term x = ((AFunct) arg2).args()[i - 1];
        x = x.dref();
        return (arg3.unify(x));
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        if (!DoArg3(mach, areg[0], areg[1], areg[2]))
            return mach.Fail0;
        areg[0] = areg[3]; // install the continuation
        areg[1] = areg[2] = areg[3] = null;
        return mach.Call1;
    }
}

class pred_nexttoken_1 extends Code {
    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        if (!(arg1 instanceof JpVar))
            return mach.Fail0;
        Term t = mach.nexttoken();
        if (!(arg1.unify(t.dref())))
            return mach.Fail0;
        areg[0] = areg[1]; // install the continuation
        areg[1] = null;
        return mach.Call1;
    }
}

class pred_cputime_1 extends Code {
    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        long t = java.lang.System.currentTimeMillis();
        Term o = JpFactory.Long(t);
        if (!(arg1.unify(o)))
            return mach.Fail0;
        areg[0] = areg[1]; // install the continuation
        areg[1] = null;
        return mach.Call1;
    }
}

class findall_list extends JpATerm {
    JpVar uptonowbegin, uptonowend;

    long time;

    findall_list(PrologMachine mach) {
        uptonowbegin = uptonowend = JpFactory.JVAR(mach);
        time = mach.getTimestamp();
    }

    @Override
    public Term dref() {
        return this;
    }

    @Override
    public boolean unify(Term that) {
        return that.bind(this);
    }

    @Override
    public String toStringImpl(int depth) {
        return ("findall = " + (uptonowbegin.dref()).toString() + " - " + (uptonowend.dref()).toStringImpl(depth - 1));
    }

}

class pred_initfindall_1 extends Code {
    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        if (!(arg1.unify(new findall_list(mach))))
            return mach.Fail0;
        areg[0] = areg[1]; // install the continuation
        areg[1] = null;
        return mach.Call1;
    }
}

class pred_addfindall_2 extends Code {
    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        findall_list arg2 = (findall_list) (areg[1].dref());
        int oldtrail = mach.getCurrentStackItem().getTrailSize();
        Term copy = arg1.copy(mach, arg2.time);
        mach.getCurrentStackItem().unTrail(oldtrail);
        JpVar NewTail = JpFactory.JVAR(mach);
        (arg2.uptonowend).Refers = JpFactory.S(Const.strIntern("."), copy, NewTail);
        arg2.uptonowend = NewTail;
        // areg[0] = areg[2] ; // install the continuation
        // areg[1] = areg[2] = null ;
        return mach.Fail0;
    }
}

class pred_retrievefindall_2 extends Code {
    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        findall_list arg2 = (findall_list) (areg[1].dref());
        (arg2.uptonowend).Refers = JpFactory.CONST(Const.strIntern("[]"));
        if (!(arg1.unify((arg2.uptonowbegin).dref())))
            return mach.Fail0;
        areg[0] = areg[2]; // install the continuation
        areg[1] = areg[2] = null;
        return mach.Call1;
    }
}

class pred_var_equal_2 extends Code {
    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        Term arg2 = areg[1].dref();
        if (arg1 != arg2)
            return mach.Fail0;
        areg[0] = areg[2]; // install the continuation
        areg[1] = areg[2] = null;
        return mach.Call1;
    }
}

class pred_trail_1 extends Code {
    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        if (!(arg1.unify(JpFactory.Long((mach.getCurrentStackItem().getTrailSize())))))
            return mach.Fail0;
        areg[0] = areg[1]; // install the continuation
        areg[1] = null;
        return mach.Call1;
    }
}

class pred_choice_1 extends Code {
    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        if (!(arg1.unify(JpFactory.Long((mach.getCurrentChoice())))))
            return mach.Fail0;
        areg[0] = areg[1]; // install the continuation
        areg[1] = null;
        return mach.Call1;
    }
}

class pred_type_of_2 extends Code {
    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        Term arg2 = areg[1].dref();
        String s;
        if (arg1 instanceof JpVar)
            s = Const.strIntern("var");
        else if (arg1 instanceof FrozenVar)
            s = Const.strIntern("var");
        else if (arg1 instanceof AttributedVariable)
            s = Const.strIntern("var");
        else if (arg1 instanceof Int)
            s = Const.strIntern("integer");
        else if (arg1 instanceof Const)
            s = Const.strIntern("atom");
        else if (arg1 instanceof AFunct) {
            AFunct a = (AFunct) arg1;
            if (a.arity() == 0)
                s = Const.strIntern("atom");
            else
                s = Const.strIntern("struct");
        } else {
            ((JpATerm) arg1).oopsy("unknown " + this);
            s = Const.strIntern("unknown");
        }

        if (!(arg2.unify(JpFactory.CONST(s))))
            return mach.Fail0;
        areg[0] = areg[2]; // install the continuation
        areg[1] = areg[2] = null;
        return mach.Call1;
    }
}

class pred_assume_1 extends Code {
    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        Term ass = (mach.getAssumptions()).dref();
        mach.trailEntry(new PopAssumptions(mach, ass));
        mach.setAssumptions(JpFactory.S(Const.strIntern("."), arg1, ass));
        areg[0] = areg[1]; // install the continuation
        areg[1] = null;
        return mach.Call1;
    }
}

class pred_allassumed_1 extends Code {
    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        Term ass = (mach.getAssumptions()).dref();
        if (!(arg1.unify(ass)))
            return mach.Fail0;
        areg[0] = areg[1]; // install the continuation
        areg[1] = null;
        return mach.Call1;
    }
}

class pred_get0_1 extends Code {
    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        int i;
        try {
            i = mach.getIOLayer().getStreamHandlerIn().getCurrentStream().getStream().read();
        } catch (Exception e) {
            return mach.Fail0;
        }
        if (!(arg1.unify(JpFactory.Long(i))))
            return mach.Fail0;
        areg[0] = areg[1]; // install the continuation
        areg[1] = null;
        return mach.Call1;
    }
}

class pred_halt_0 extends Code {
    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Code exec(PrologMachine mach) {
        mach.setExceptionState(ErrorStatus.NORMALEXIT);
        return null;
    }
}

class pred_setarg_3 extends Code {
    @Override
    public int arity() {
        return 3;
    }

    boolean DoSetArg3(PrologMachine mach, Term arg1, Term arg2, Term arg3) {
        arg1 = arg1.dref();
        arg2 = arg2.dref();
        arg3 = arg3.dref();

        if (!(arg1 instanceof Int))
            return false;
        if (!(arg2 instanceof AFunct))
            return false;
        int i = (int) (((Int) arg1).longValue());
        if (i < 1)
            return false;
        int l = ((AFunct) arg2).arity();
        if (i > l)
            return false;
        Term x = ((AFunct) arg2).args()[i - 1];
        JpVar v = JpFactory.JVAR(mach);
        v.Refers = arg3;
        ((AFunct) arg2).args()[i - 1] = v;
        mach.trailEntry(new SetArgTrail(x, v, mach));
        return true;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        if (!DoSetArg3(mach, areg[0], areg[1], areg[2]))
            return mach.Fail0;
        areg[0] = areg[3]; // install the continuation
        areg[1] = areg[2] = areg[3] = null;
        return mach.Call1;
    }
}

class pred_freeze_internal_2 extends Code {
    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        Term arg2 = areg[1].dref();

        FrozenVar frv = new FrozenVar(mach, arg2);
        if (!(arg1.unify(frv)))
            return mach.Fail0;
        areg[0] = areg[2]; // install the continuation
        areg[1] = areg[2] = null;
        return mach.Call1;
    }
}

class pred_execcontinuation_0 extends Code {
    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();

        if (!(arg1.isContinuation()))
            return mach.Fail0;
        Continuation c = (Continuation) arg1.asContinuation();
        Code code = c.getCode();
        int i = code.arity() + 1;

        while (i-- > 0) {
            areg[i] = c.getArg(i);
        }
        return code;
    }
}

class pred_frozen_2 extends Code {
    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        Term arg2 = areg[1].dref();
        Term goal;

        if (arg1 instanceof JpVar)
            goal = JpFactory.CONST(Const.strIntern("true"));
        else if (arg1 instanceof FrozenVar)
            goal = (((FrozenVar) arg1).getGoals()).dref();
        else
            return mach.Fail0;

        if (!(arg2.unify(goal)))
            return mach.Fail0;
        areg[0] = areg[2]; // install the continuation
        areg[1] = areg[2] = null;
        return mach.Call1;
    }
}
