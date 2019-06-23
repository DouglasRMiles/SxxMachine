package SxxMachine.pterm; //

// *;
import static SxxMachine.pterm.TermData.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static SxxMachine.pterm.TermData.*;

import SxxMachine.Const;
import SxxMachine.DataBase;
import SxxMachine.Functor;
import SxxMachine.HashDict;
import SxxMachine.IO;
import SxxMachine.Init;
import SxxMachine.Prolog;
import SxxMachine.Term;

/**
 * A ForeignObject is a Jinni FunctionObject with a stubbed slot
 * which containing a wrapped Java object
 */

public class ForeignObject extends FunctionObject implements InvocationHandler {

    public final static Map atomTable = new Hashtable();

    static public final Functor useAtomStatic(String s) {
        Functor I = (Functor) atomTable.get(s);
        if (I != null)
            return I;
        I = SYM(s);
        atomTable.put( I.fname(), I);
        return I;
    }

    static public final Functor defAtomStatic(String s) {
        Functor I = (Functor) atomTable.get(s);
        if (I != null)
            return I;
        I = SYM(s);
        atomTable.put(I.fname(), I);
        return I;
    }

    public final static Functor useStringAtom(String s) {
        return SYM(s);
    }

    //static public Hashtable systemObjectMap = new Hashtable();

    // Object tracking
    static public void objectPut(String named, Term any) {
        if (Init.default_db == null)
            return;
        currentInstance().put(named, any);
    }

    /**
     * @return
     */
    private static HashDict currentInstance() {
        return Init.default_db;
    }

    static public Term objectGet(String named) {
        return (Term) currentInstance().get(named);
    }

    static public String objectKey(Object any) {
        for (Iterator iterator = currentInstance().keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();
            if (currentInstance().get(key) == any)
                return key;
        }
        return null;
    }

    static public void objectRemove(String named) {
        currentInstance().remove(named);
    }

    final static public Class baseinterface = Term.class;

    static public Term getRef(Object obj) {
        if (obj == null)
            return Const.javaNull();
        if (obj instanceof Integer)
            return Integer(((Integer) obj).intValue());
        if (obj instanceof Long)
            return Integer(((Long) obj).longValue());
        if (obj instanceof Number)
            return Float(((Number) obj).doubleValue());
        return getStub(obj);
    }

    static public Term getStub(Object obj) {
        Term theStub = null;
        if (obj == null)
            return Prolog.aNo;
        if (obj instanceof String) {
            theStub = objectGet((String) obj);
            if (theStub != null)
                return theStub;
            return useStringAtom((String) obj);
        }
        if (obj instanceof Term)
            return (Term) obj;
        String loc = objectKey(obj);
        if (loc != null)
            return objectGet(loc);
        Class[] pclasses = obj.getClass().getClasses();
        Class[] classes = new Class[pclasses.length + 1];
        System.arraycopy(pclasses, 0, classes, 0, pclasses.length);
        classes[pclasses.length] = baseinterface;
        try {
            Class proxyClass = Proxy.getProxyClass(baseinterface.getClassLoader(), classes);
            Constructor constructure = proxyClass.getConstructor(InvocationHandler.class);
            theStub = (Term) constructure
                    .newInstance(new Object[] { new ForeignObject(obj, new ArrayList(Arrays.asList(pclasses))) });
            if (theStub instanceof FunctionObject) {
                objectPut(theStub.fname(), theStub);
            } else if (true) {
                objectPut(theStub.fname(), theStub);
            }
            return theStub;
        } catch (Exception e) {
            e.printStackTrace();
            return Prolog.aNo;
        }
    } // get_default_db(X),jtype(X,Y),jtype(Y,Z),jtype(Z,A).

    // The object thats wrapped
    Object stubbed;
    // The object class before wrapped
    Class classstubbed;
    // The object classes before wrapped
    private List prevclasses = null;
    // The object is not in critical code
    private boolean available = true;

    private ForeignObject(Object obj, List classesImplemented) {
        super();
        this.prevclasses = classesImplemented;
        this.stubbed = obj;
        this.classstubbed = stubbed.getClass();
        setSym(getJinniName(stubbed));
    }

    static public String getJinniName(Object obj) {
        if (obj instanceof Class)
            return (((Class) obj).getName() + ".class");
        final String name = obj.getClass().getName();
        if (obj instanceof Number) {
            return name + "." + ((Number) obj).doubleValue();
        }
        if (obj instanceof String)
            return obj.toString();
        return (name + "." + (++ctr));
    }

    public static long ctr = 0;

    @Override
    public Object javaInstance() {
        return stubbed;
    }

    //  public Class getClass() {
    //      return classstubbed;
    //  }

    @Override
    public java.lang.Object invoke(java.lang.Object A, java.lang.reflect.Method B, java.lang.Object[] C)
            throws Throwable {
        try {
            if (prevclasses.contains(B.getDeclaringClass())) {
                IO.mes("invoke directly: \"" + B.getName() + "\" on " + fname() + " as "
                        + B.getDeclaringClass().getName() + " with " + C);
                return B.invoke(stubbed, C);
            }
            IO.mes("invoked wrapper: \"" + B.getName() + "\" on " + fname() + " as " + B.getDeclaringClass().getName()
                    + " with " + C);
            return B.invoke(this, C);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    synchronized public void suspend() {
        available = false;
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    synchronized public void resume() {
        available = true;
        notifyAll();
    }
}
