/**
 * 
 */
package SxxMachine;

/**
 * @author Administrator
 *
 */
public class TermArray {

    //private int length;

    final TermRef[] termRefs;

    /**
     * @param length
     */
    public TermArray(int len) {
        backing = new Term[len];
        termRefs = new TermRef[len];
    }

    /**
     * @param len
     * @return
     */
    public static TermArray newTermArray(int len) {
        TermArray termArray = new TermArray(len);
        for (int j = 0; j < len; j++) {
            termArray.setAV(j, null);
        }
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

    final private Term[] backing;

    /**
     * @param i
     * @return
     */
    public Term getPlainArg(int i) {
        return backing[i];
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
    public Term setAV(int i, Term object) {
        final Term[] backing = getBacking();
        return backing[i] = object;
    }

    /**
     * @return the length
     */
    public int getLength() {
        final Term[] backing = getBacking();
        return backing.length;
    }

    /**
     * @return the backing
     */
    public Term[] getBacking() {
        return backing;
    }

    /**
     * @param i
     * @return
     */
    public TermRef getPlain(final int i) {
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
                return backing[i].dref();
            }

            @Override
            public Term getV() {
                return backing[i];
            }

            /* (non-Javadoc)
             * @see SxxMachine.TermRef#setV(SxxMachine.Term)
             */
            @Override
            Term setV(Term v) {
                return backing[i] = v;
            }
        };
    }

}
