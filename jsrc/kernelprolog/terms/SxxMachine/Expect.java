package prolog.terms;
import SxxMachine.NumberTerm;
import SxxMachine.StructureTerm;
import SxxMachine.Term;
import prolog.io.CharReader;

public class Expect {

	public static Const asConst(Term i) {
		// TODO Auto-generated method stub
		return (Const) i.toValue();
	}

	public static NumberTerm asInt(Term i) {
		// TODO Auto-generated method stub
		return (NumberTerm) i.toValue();
	}

	public static StructureTerm asCons(Term i) {
		// TODO Auto-generated method stub
		return (StructureTerm) i.toValue();
	}

	public static StructureTerm asStruct(Term i) {
		// TODO Auto-generated method stub
		return (StructureTerm) i.toValue();
	}

	public static StructureTerm asConj(Term i) {
		// TODO Auto-generated method stub
		return (StructureTerm) i.toValue();
	}

	public static CharReader asCharReader(Term i) {
		// TODO Auto-generated method stub
		return (CharReader) i.toValue();
	}

	public static Real asNum(Term i) {
		// TODO Auto-generated method stub
		return (Real) i.toValue();
	}

}
