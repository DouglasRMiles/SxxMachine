package SxxMachine;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.PushbackReader;

import SxxMachine.FFIObjectTerm;
import SxxMachine.HashtableOfTerm;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.ExistenceException;
import SxxMachine.IllegalDomainException;
import SxxMachine.IllegalTypeException;
import SxxMachine.PInstantiationException;
import SxxMachine.SystemException;
import SxxMachine.TermException;
/**
 * <code>close/2</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
*/
public class PRED_close_2 extends Predicate.P2 {
    private static final SymbolTerm SYM_ALIAS_1 = SymbolTerm.intern("alias", 1);
    private static final SymbolTerm SYM_FORCE_1 = SymbolTerm.intern("force", 1);
    private static final SymbolTerm SYM_TRUE    = SymbolTerm.intern("true");
    private static final SymbolTerm SYM_FALSE   = SymbolTerm.intern("false");

    public PRED_close_2(Term a1, Term a2, Operation cont) {
        LARG[0] = a1;
        LARG[1] = a2;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.requireFeature(Prolog.Feature.IO, this, LARG[0]);
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];

	boolean forceFlag = false;
	Object stream = null;

	// close options
	a2 = a2.dref();
	Term tmp = a2;
	while (! tmp.isNil()) {
	    if ((tmp instanceof VariableTerm))
		throw new PInstantiationException(this, 2);
	    if (!( tmp instanceof ListTerm))
		throw new IllegalTypeException(this, 2, "list", a2);
	    Term car = tmp.asListTerm().car().dref();
	    if ((car instanceof VariableTerm))
		throw new PInstantiationException(this, 2);
	    if ((car instanceof StructureTerm)) {
		Term functor = ( car).functor();
		Term[] args = ( car).args();
		if (functor.equals(SYM_FORCE_1)) {
		    Term bool = args[0].dref();
		    if (bool.equals(SYM_TRUE))
			forceFlag = true;
		    else if (bool.equals(SYM_FALSE))
			forceFlag = false;
		    else 
			throw new IllegalDomainException(this, 2, "close_option", car);
		} else {
		    throw new IllegalDomainException(this, 2, "close_option", car);
		}
	    } else {
		throw new IllegalDomainException(this, 2, "close_option", car);
	    }
	    tmp = tmp.asListTerm().cdr().dref();
	}
	//stream
	a1 = a1.dref();
	if ((a1 instanceof VariableTerm)) {
	    throw new PInstantiationException(this, 1);
	} else if ((a1 instanceof SymbolTerm)) {
	    if (! engine.getStreamManager().containsKey(a1))
		throw new ExistenceException(this, 1, "stream", a1, "");
	    stream = ( engine.getStreamManager().get(a1)).object();
	} else if ((a1 instanceof FFIObjectTerm)) {
	    stream = a1.object();
	} else {
	    throw new IllegalDomainException(this, 1, "stream_or_alias", a1);
	}
	if (stream instanceof PushbackReader) {
	    PushbackReader in = (PushbackReader) stream;
	    if (in.equals(engine.getUserInput()))
		return cont;
	    if (in.equals(engine.getCurrentInput()))
		engine.setCurrentInput(engine.getUserInput());
	    try {
		in.close();
	    } catch (IOException e) {
		throw new TermException(new FFIObjectTerm(e));
	    }
	} else if (stream instanceof PrintWriter) {
	    PrintWriter out = (PrintWriter) stream;
	    if (out.checkError()) {
		if (! forceFlag)
		    throw new SystemException("output stream error");
	    }
	    out.flush();
	    if (out.equals(engine.getUserOutput()) || out.equals(engine.getUserError()))
		return cont;
	    if (out.equals(engine.getCurrentOutput()))
		engine.setCurrentOutput(engine.getUserOutput());
	    out.close();
	} else {
	    throw new IllegalDomainException(this, 1, "stream_or_alias", a1);
	}
	// delete associated entries from the stream manager
	HashtableOfTerm streamManager = engine.getStreamManager();
	if ((a1 instanceof SymbolTerm)) {
	    streamManager.remove(engine.getStreamManager().get(a1));
	    streamManager.remove(a1);
	} else if ((a1 instanceof FFIObjectTerm)) {
	    Term tmp2 = streamManager.get(a1);
	    while (! tmp2.isNil()) {
		Term car = tmp2.asListTerm().car().dref();
		if ((car instanceof StructureTerm)) {
		    Term functor = ( car).functor();
		    Term[] args = ( car).args();
		    if (functor.equals(SYM_ALIAS_1)) {
			Term alias = args[0].dref();
			streamManager.remove(alias);
		    }
		}
		tmp2 = tmp2.asListTerm().cdr().dref();
	    }
	    streamManager.remove(a1);
	} else {
	    throw new IllegalDomainException(this, 1, "stream_or_alias", a1);
	}
        return cont;
    }
}
