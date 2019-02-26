
package SxxMachine;

public final class Continuation extends JPrologObject {
    private final Code code;

    private final Term argz[];

    Continuation(Term args[], Code c) {
        int i = c.arity() + 1;
        argz = new Term[i];
        while (i-- > 0)
            argz[i] = args[i];
        code = c;
    }

    @Override
    public Term dref() {
        return this;
    }

    //
    //
    @Override
    public boolean unify(Term that) {
        return that.bind(this);
    }

    public Term getArg(int i) {
        return argz[i];
    }

    public Code getCode() {
        return code;
    }

}
