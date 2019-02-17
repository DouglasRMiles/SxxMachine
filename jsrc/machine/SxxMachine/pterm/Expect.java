package SxxMachine.pterm;

import SxxMachine.CharReader;
import SxxMachine.Functor;
import SxxMachine.Prolog;
import SxxMachine.Term;

public class Expect {

    public static Functor asConst(Term i) {
        // TODO Auto-generated method stub
        return i.asConst();
    }

    public static LongTerm asInt(Term i) {
        // TODO Auto-generated method stub
        return i.asLongTerm();
    }

    public static StructureTerm asCons(Term i) {
        // TODO Auto-generated method stub
        return (StructureTerm) i.asListTerm();
    }

    public static StructureTerm asStruct(Term i) {
        // TODO Auto-generated method stub
        return (StructureTerm) i.asStructureTerm();
    }

    public static StructureTerm asConj(Term i) {
        // TODO Auto-generated method stub
        return (StructureTerm) i.asStructureTerm();
    }

    public static CharReader asCharReader(Term i) {
        // TODO Auto-generated method stub
        return (CharReader) i.toValue();
    }

    public static NumberTerm asNum(Term i) {
        // TODO Auto-generated method stub
        return i.asNumberTerm();
    }

    public final static Nonvar the(Term X) {
        return (null == X) ? (Nonvar) Prolog.aNo : StructureTerm.S("the", X);
    }

}
