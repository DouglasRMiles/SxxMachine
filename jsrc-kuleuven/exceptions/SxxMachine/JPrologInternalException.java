
package SxxMachine;

public class JPrologInternalException extends RuntimeException {

    private final Code clause;

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

    public JPrologInternalException(String msg, Throwable cause, Code clause) {
        super(msg, cause);
        this.clause = clause;
    }

    /**
     * Clause opvragen waarbinnen de fout optrad.
     *
     *  @return  indien gezet de clause waarbinnen de fout optrad, anders null
     */
    protected Code getClause() {
        return clause;
    }

    /**
     * Proberen om een fout te unificeren met een prolog-object.
     *
     *  @param  exception het prolog-object waarmee moet gebonden worden
     *  @return  true als er een binding kon gemaakt worden.
     */
    public final boolean unify(Term exception) {
        Term ex = exception.dref();
        if (ex.isVariable()) {
            return ex.unify(toPrologException());
        }
        return bind(ex);
    }

    protected boolean bind(Term o) {
        if (o instanceof AFunct) {
            //snelmogelijkheid voor fout-opvangen
            AFunct f = (AFunct) o;
            if (f.fname().equals("exception") && f.arity() == 2) {
                Term cl = f.args()[0].dref();
                if (cl instanceof Const && isValidException(((Const) cl).getValue())) {
                    return f.args()[1].unify(toPrologException());
                }
            }
        }
        return o.unify(toPrologException());
    }

    private boolean isValidException(Object o) {
        if (o instanceof Class) {
            Class c = (Class) o;
            return c.isInstance(this);
        } else if (o instanceof String) {
            String str = (String) o;
            return getClass().getName().equals(str);
        }
        return false;
    }

    protected Term toPrologException() {
        if (getCause() != null) {
            if (getCause() instanceof JPrologInternalException)
                return ((JPrologInternalException) getCause()).toPrologException();
            return JpFactory.CONST(getCause());
        }
        return JpFactory.CONST(this);
    }

}
