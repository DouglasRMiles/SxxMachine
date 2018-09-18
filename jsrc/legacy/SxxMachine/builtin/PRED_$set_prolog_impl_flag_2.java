package SxxMachine;

import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
/**
   <code>'$set_prolog_impl_flag'/2</code><br>
   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
   @version 1.0
*/
class PRED_$set_prolog_impl_flag_2 extends Predicate.P2 {
    private static final SymbolTerm CHAR_CONVERSION   = SymbolTerm.intern("char_conversion");
    private static final SymbolTerm DEBUG             = SymbolTerm.intern("debug");
    private static final SymbolTerm UNKNOWN           = SymbolTerm.intern("unknown");
    private static final SymbolTerm DOUBLE_QUOTES     = SymbolTerm.intern("double_quotes");
    private static final SymbolTerm PRINT_STACK_TRACE = SymbolTerm.intern("print_stack_trace");

    public PRED_$set_prolog_impl_flag_2(Term a1, Term a2, Operation cont) {
        LARG[0] = a1;
        LARG[1] = a2;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
	a1 = a1.dref();
	a2 = a2.dref();

	if (a1.equals(CHAR_CONVERSION)) {
	    if (! (a2 instanceof SymbolTerm))
		return engine.fail();
	    engine.setCharConversion(a2.asSymbolTerm().name());
	} else if (a1.equals(DEBUG)) {
	    if (! (a2 instanceof SymbolTerm))
		return engine.fail();
	    engine.setDebug(a2.asSymbolTerm().name());
	} else if (a1.equals(UNKNOWN)) {
	    if (! (a2 instanceof SymbolTerm))
		return engine.fail();
	    engine.setUnknown(a2.asSymbolTerm().name());
	} else if (a1.equals(DOUBLE_QUOTES)) {
	    if (! (a2 instanceof SymbolTerm))
		return engine.fail();
	    engine.setDoubleQuotes(a2.asSymbolTerm().name());
	} else if (a1.equals(PRINT_STACK_TRACE)) {
	    if (! (a2 instanceof SymbolTerm))
		return engine.fail();
	    engine.setPrintStackTrace(a2.asSymbolTerm().name());
	} else {
	    return engine.fail();
	}
        return cont;
    }
}
