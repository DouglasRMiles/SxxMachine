/**
 * 
 */
package SxxMachine;

import java.lang.reflect.Field;

/**
 * @author Administrator
 *
 */
public class TermArray {

    public int length;

    final TermRef[] termRefs;
    public Term areg0, areg1, areg2, areg3, areg4, areg5, areg6, areg7, areg8, areg9, areg10, areg11, areg12, areg13,
            areg14, areg15, areg16, areg17, areg18, areg19, areg20, areg21, areg22, areg23, areg24, areg25, areg26,
            areg27, areg28, areg29, areg30, areg31, areg32;

    //private int length;

    final static Field[] fieldDecls = new Field[33];

    /**
     * @param length
     */
    public TermArray(int len) {
        length = len;
        //backing = new Term[len];
        termRefs = new TermRef[len];
    }

    /**
     * @param len
     * @return
     */
    public static TermArray newTermArray(int len) {
        TermArray termArray = new TermArray(len);
        //        for (int j = 0; j < len; j++) {
        //            termArray.setAV(j, null);
        //        }
        return termArray;
    }

    /**
     * @param args
     * @return
     */
    public static TermArray newTermArray(Term... args) {
        final int len = args.length;
        TermArray termArray = new TermArray(len);
        for (int j = 0; j < len; j++) {
            termArray.setAV(j, args[j]);
        }
        return termArray;
    }

    /**
     * @param i
     * @return
     */
    public Term getPlainArg(int i) {
        if (true) {
            Field fa = getField(i);
            try {
                return (Term) fa.get(this);
            } catch (IllegalArgumentException | IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                if (true)
                    throw new AbstractMethodError("TermArray.setAV throw Exception");

            }
        }
        throw new AbstractMethodError("TermArray.setAV throw Exception");
    }

    /**
     * @param i
     * @return
     */
    public Term getTermDRef(int i) {
        return getPlainArg(i).dref();
    }

    /**
     * @param i
     * @param object
     * @return
     */
    public Term setAV(int i, Term v) {
        if (v == null) {
            if (i <= length) {
                length = i + 1;
            }
        } else {
            if (i >= length) {
                length = i + 1;
            }
        }
        if (true) {
            Field fa = getField(i);
            try {
                fa.set(this, v);
            } catch (IllegalArgumentException | IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                if (true)
                    throw new AbstractMethodError("TermArray.setAV throw Exception");

            }
            return v;
        } else {
            final Term[] backing = getBacking();
            return backing[i] = v;
        }
    }

    /**
     * @param i
     * @return
     */
    public Field getField(final int i) {
        Field tr = fieldDecls[i];
        if (tr == null) {
            try {
                tr = fieldDecls[i] = getClass().getField("areg" + i);
            } catch (NoSuchFieldException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                if (true)
                    throw new AbstractMethodError("TermArray.getField throw NoSuchFieldException");

            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                if (true)
                    throw new AbstractMethodError("TermArray.getField throw SecurityException");

            }
        }
        return tr;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @return the backing
     */
    public Term[] getBacking() {
        // return backing;

        throw new AbstractMethodError("TermArray.getBacking throw Exception");
    }

    /**
     * @param i
     * @return
     */
    public TermRef aref(final int i) {
        TermRef tr = termRefs[i];
        if (tr == null) {
            tr = termRefs[i] = makePlain(i);
        }
        return tr;
    }

    /**
     * @param i
     * @return
     */
    private TermRef makePlain(final int i) {
        return new TermRef() {
            @Override
            public Term getVVV() {
                return getTermDRef(i);
            }

            @Override
            public Term getV() {
                return getPlainArg(i);
            }

            /* (non-Javadoc)
             * @see SxxMachine.TermRef#setV(SxxMachine.Term)
             */
            @Override
            Term setV(Term v) {
                return setAV(i, v);
            }
        };
    }

}
