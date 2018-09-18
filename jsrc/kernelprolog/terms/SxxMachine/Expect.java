package SxxMachine;
import SxxMachine.NumberTerm;
import SxxMachine.StructureTerm;
import SxxMachine.Term;
import SxxMachine.CharReader;

public class Expect {

	public static SymbolTerm asConst(Term i) {
		// TODO Auto-generated method stub
		return (SymbolTerm) i.asConst();
	}

	public static LongTerm asInt(Term i) {
		// TODO Auto-generated method stub
		return i.asLongTerm();
	}

	public static StructureTerm asCons(Term i) {
		// TODO Auto-generated method stub
		return  (StructureTerm) i.asListTerm();
	}

	public static StructureTerm asStruct(Term i) {
		// TODO Auto-generated method stub
		return  (StructureTerm) i.asStructureTerm();
	}
 
	public static StructureTerm asConj(Term i) {
		// TODO Auto-generated method stub
		return  (StructureTerm) i.asStructureTerm();
	}

	public static CharReader asCharReader(Term i) {
		// TODO Auto-generated method stub
		return (CharReader) i.toValue();
	}

	public static Real asNum(Term i) {
		// TODO Auto-generated method stub
		return (Real) i.asNumberTerm();
	}

	public final static Nonvar the(Term X) {
		return (null == X) ? Prolog.aNo : StructureTerm.S("the", X);
	}

}
