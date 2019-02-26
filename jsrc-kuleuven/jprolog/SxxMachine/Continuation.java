
package SxxMachine;

public final class Continuation extends JpATerm {
    private Code code;

    private Term args[];

    Continuation(Term args[], Code c) {
        int i = c.arity() + 1;
        this.args = new Term[i];
        while (i-- > 0)
            this.args[i] = args[i];
        code = c;
    }

    @Override
    public Term dref() {
        return this.asTerm();
    }

    @Override
    public Term asTerm() {
        // TODO Auto-generated method stub
        return (Term) (Object) this;
    }

    @Override
    public boolean unify(Term that) {
        return that.bind(this.asTerm());
    }

    public Term getArg(int i) {
        return args[i];
    }

    public Code getCode() {
        return code;
    }

    @Override
    public boolean isContinuation() {
        return true;
    }

    @Override
    public Continuation asContinuation() {
        return this;
    }

}
