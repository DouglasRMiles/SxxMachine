
package SxxMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterateOverClassStructure extends Code {

    final static String PREDNAME = "jp_javaStructureIterator";

    private final static IterateOverClassStructure2 next = new IterateOverClassStructure2();

    @Override
    public final int arity() {
        return 2;
    }

    @Override
    public final Code exec(PrologMachine mach) {
        initMach(mach);
        Term[] args = mach.getAreg();
        Term object = args[0].dref();
        Term classType = args[1].dref();
        Term cont = args[2];
        if (!classType.isVariable())
            return mach.Fail0;
        if (!(object instanceof Const))
            return mach.Fail0;
        Object c = ((Const) object).getValue();
        if (!(c instanceof Class))
            return mach.Fail0;
        cont = doAction((Class) c, classType, cont);
        if (cont == null)
            return mach.Fail0;
        args[1] = args[2] = null;
        args[0] = cont;
        mach.updateCUTB();
        return mach.Call1;
    }

    @SuppressWarnings("deprecation")
    protected void initMach(PrologMachine mach) {
        Term[] trace = mach.createAregCopy(3);
        mach.createChoicePoint(trace);
        mach.fillAlternative(next);
    }

    protected Term doAction(Class c, Term v, Term cont) {
        v.unify(JpFactory.CONST(c));
        return cont;
    }

}

class IterateOverClassStructure2 extends IterateOverClassStructure {

    private final static IterateOverClassStructure3 next = new IterateOverClassStructure3();

    @Override
    protected Term doAction(Class c, Term v, Term cont) {
        //Over classen verder gaan
        if (c.getSuperclass() == null)
            return null;
        return JpFactory.S(PREDNAME, JpFactory.CONST(c.getSuperclass()), v, cont);
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void initMach(PrologMachine mach) {
        mach.fillAlternative(next);
    }

}

class IterateOverClassStructure3 extends IterateOverClassStructure {

    @Override
    protected Term doAction(Class c, Term v, Term cont) {
        Class[] interfaces = c.getInterfaces();
        if (interfaces == null || interfaces.length == 0)
            return null;
        List<Class> a = new ArrayList<Class>();
        Collections.addAll(a, interfaces);
        return JpFactory.S(InterfaceIterator.PREDNAME, JpFactory.CONST(a.iterator()), v, cont);
    }

    @Override
    protected void initMach(PrologMachine mach) {
        mach.removeChoice();
    }

}

class InterfaceIterator extends Code {

    final static String PREDNAME = "jp_interfaceIterator";

    @Override
    public int arity() {
        return 2;
    }

    @SuppressWarnings({ "unchecked", "deprecation" })
    @Override
    public Code exec(PrologMachine mach) {
        Term[] args = mach.getAreg();

        Term object = args[0].dref();
        Term classType = args[1].dref();
        Term cont = args[2];
        if (!classType.isVariable())
            return mach.Fail0;
        if (!(object instanceof Const))
            return mach.Fail0;
        Object c = ((Const) object).getValue();
        if (!(c instanceof Iterator))
            return mach.Fail0;
        Iterator<Class> it = (Iterator<Class>) c;
        if (!it.hasNext()) {
            mach.removeChoice();
            return mach.Fail0;
        }
        Term[] trace = { args[0], args[1], args[2] };
        mach.createChoicePoint(trace);
        mach.fillAlternative(this);
        if (!classType.unify(JpFactory.CONST(it.next())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        args[1] = args[2] = null;
        args[0] = cont;
        mach.updateCUTB();
        return mach.Call1;
    }

}
