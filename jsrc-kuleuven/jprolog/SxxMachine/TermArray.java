/**
 * 
 */
package SxxMachine;

/**
 * @author Administrator
 *
 */
public class TermArray {

    public int length;

    /**
     * @param i
     * @return
     */
    public TermRef a(int i) {
        return null;
    }

    /**
     * @param len
     * @return
     */
    public static TermArray newTermArray(int len) {
        TermArray termArray = new TermArray();
        termArray.length = len;
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
        TermArray termArray = new TermArray();
        final int len = args.length;
        termArray.length = len;
        for (int j = 0; j < len; j++) {
            termArray.setAV(j, args[j]);
        }
        return termArray;
    }

    /**
     * @param i
     * @param object
     * @return
     */
    public Term setAV(int i, Term object) {
        return setAV(i,object);
    }

}
