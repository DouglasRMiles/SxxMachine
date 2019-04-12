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

    /**
     * @param length
     */
    public TermArray(int len) {
        backing = new Term[len];
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
    public static TermArray newTermArray(Term[] args) {
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
        final Term[] backing = getBacking();
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

}
