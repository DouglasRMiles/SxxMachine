package SxxMachine;

final public class JpFactory {
    
    public static AFunct cons(Term left, Term right) {
        return S(StructureTerm.LIST, left, right);
    }

    public static Const CONST(String o) {
        return new Const(o);
    }

    public static Const CONST(Class o) {
        return new Const(o);
    }

    public static Const CONST(Object o) {
        return new Const(o);
    }

    public static Int Long(long i) {
        return new Int(i);
    }

    public static StructureTerm S(String naam, Term... args) {
        return new StructureTerm(naam, args);
    }

    public static JpVar JVAR(RunningPrologMachine machine) {
        return new JpVar(machine);
    }

    //    public Term dref() {
    //        final Term asTerm = asTerm();
    //        assert (asTerm == this);
    //        assert (isTerm());
    //        return asTerm;
    //    }
    //
    //    public boolean unify(Term that) {
    //        final Term asTerm = asTerm();
    //        return asTerm != this && asTerm.unify(that);
    //    }
    //
    //    public boolean isTerm() {
    //        return false;
    //    }
    //
    //    public Term asTerm() {
    //        oopsy("ERROR: asTerm on objects not available");
    //        return null;
    //    }
    //
    //    public boolean isContinuation() {
    //        return false;
    //    }
    //
    //    public Continuation asContinuation() {
    //        oopsy("ERROR: asContinuation on objects not available");
    //        return null;
    //    }
    //
    //    public boolean isCode() {
    //        return false;
    //    }
    //
    //    public Code asCode() {
    //        oopsy("ERROR: asCode on objects not available");
    //        return null;
    //    }
    //
}
