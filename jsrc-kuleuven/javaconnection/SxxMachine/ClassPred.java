
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;

@SuppressWarnings("rawtypes")
public class ClassPred extends Code {

    private final static Logger log = Logger.getLogger(ClassPred.class);

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term[] args = mach.getAreg();
        final Term classConst = args[0];
        final Term className = args[1];
        final Term c = args[2];
        if (!find(classConst, className))
            return mach.Fail0;
        args[1] = args[2] = null;
        args[0] = c;
        return mach.Call1;
    }

    static boolean find(Term classConst, Term className) {
        classConst = classConst.dref();
        className = className.dref();
        if (classConst .isAtomOrObject()) {
            final Const cct = (Const) classConst;
            if (cct.getValue() instanceof Class) {
                final Class cc = (Class) cct.getValue();
                return className.unifyJP(CONST(cc.getName()));
            } else
                return false;
        }
        if (className .isAtomOrObject()) {
            final Const ccn = (Const) className;
            if (ccn.getValue() instanceof String) {
                return find(classConst, (String) ccn.getValue());
            }
        }
        if (className .isCompound()) {
            final AFunct ccnf = (AFunct) className;
            if (ccnf.arity() > 0)
                return false;
            return find(classConst, ccnf.fname());
        }
        return false;
    }

    private static boolean find(Term classConst, String className) {
        Class type;
        try {
            type = Class.forName(className);
        } catch (final ClassNotFoundException e) {
            log.debug("Could not find class", e);
            return false;
        }
        return classConst.unifyJP(CONST(type));
    }

}
