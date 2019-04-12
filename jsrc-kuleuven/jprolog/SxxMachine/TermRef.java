/**
 * 
 */
package SxxMachine;

/**
 * @author Administrator
 *
 */
public abstract class TermRef {
    //    private Term v;
    //
    //    /**
    //     * @return the v
    //     */
    abstract Term getV();

    //        return v;
    //    }
    //
    //    /**
    //     * @param v the v to set
    //     */
    abstract Term setV(Term v);
    //    Term setV(Term v) {
    //        this.v = v;
    //        return v;
    //    }
    //
    //    /**
    //     * @return
    //     */
    //    public Term getVVV() {
    //        return v.dref();
    //    }

    /**
     * @return
     */
    abstract public Term getVVV();
}
