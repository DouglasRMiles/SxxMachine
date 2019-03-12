
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;

@SuppressWarnings("rawtypes")
public class JPrologInternalException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final Object clause;

    public JPrologInternalException(String msg) {
        this(msg, (Code) null);
    }

    public JPrologInternalException(String msg, Throwable cause) {
        this(msg, cause, null);
    }

    public JPrologInternalException(String msg, Code clause) {
        super(msg);
        this.clause = clause;
    }

    public JPrologInternalException(Object o, String msg) {
        super(msg);
        this.clause = o;
    }

    public JPrologInternalException(String msg, Throwable cause, Code clause) {
        super(msg, cause);
        this.clause = clause;
    }

    /**
     * Clause opvragen waarbinnen de fout optrad.
     *
     *  @return  indien gezet de clause waarbinnen de fout optrad, anders null
     */
    protected Object getClause() {
        return clause;
    }

    /**
     * Proberen om een fout te unificeren met een prolog-object.
     *
     *  @param  exception het prolog-object waarmee moet gebonden worden
     *  @return  true als er een binding kon gemaakt worden.
     */
    public final boolean unify(Term exception) {
        final Term ex = exception.dref();
        if (ex.isVariable()) {
            return ex.unifyJP(toPrologException());
        }
        return bind(ex);
    }

    protected boolean bind(Term o) {
        if (o .isCompound()) {
            //snelmogelijkheid voor fout-opvangen
            final AFunct f = (AFunct) o;
            if (f.fname().equals("exception") && f.arity() == 2) {
                final Term cl = f.getPlainArg(0).dref();
                if (cl .isAtomOrObject() && isValidException(((Const) cl).getValue())) {
                    return f.getPlainArg(1).unifyJP(toPrologException());
                }
            }
        }
        return o.unifyJP(toPrologException());
    }

    private boolean isValidException(Object o) {
        if (o instanceof Class) {
            final Class c = (Class) o;
            return c.isInstance(this);
        } else if (o instanceof String) {
            final String str = (String) o;
            return getClass().getName().equals(str);
        }
        return false;
    }

    protected Term toPrologException() {
        if (getCause() != null) {
            if (getCause() instanceof JPrologInternalException)
                return ((JPrologInternalException) getCause()).toPrologException();
            return CONST(getCause());
        }
        return CONST(this);
    }

}
