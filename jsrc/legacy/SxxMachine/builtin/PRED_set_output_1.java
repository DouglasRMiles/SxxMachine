package SxxMachine;

import java.io.PrintWriter;

import SxxMachine.FFIObjectTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.ExistenceException;
import SxxMachine.IllegalDomainException;
import SxxMachine.PInstantiationException;
import SxxMachine.PermissionException;
/**
   <code>set_output/1</code><br>
   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
   @version 1.0
*/
public class PRED_set_output_1 extends Predicate.P1 {
    public PRED_set_output_1(Term a1, Operation cont) {
        LARG[0] = a1;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1;
        a1 = LARG[0];
	Object stream = null;

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
	if (! (stream instanceof PrintWriter))
	    throw new PermissionException(this, "output", "stream", a1, "");
	engine.setCurrentOutput((PrintWriter)stream);
        return cont;
    }
}
