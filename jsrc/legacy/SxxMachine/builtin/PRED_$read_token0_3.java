package SxxMachine;

import java.io.PushbackReader;

import SxxMachine.DoubleTerm;
import SxxMachine.FFIObjectTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.LongTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.Token;
import SxxMachine.VariableTerm;
import SxxMachine.ExistenceException;
import SxxMachine.IllegalDomainException;
import SxxMachine.JavaException;
import SxxMachine.PInstantiationException;
import SxxMachine.PermissionException;
/**
 * <code>'$read_token0'/3</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 * @since 0.7
 */
class PRED_$read_token0_3 extends Predicate.P3 {
    public PRED_$read_token0_3(Term a1, Term a2, Term a3, Operation cont){
	LARG[0] = a1;
	LARG[1] = a2;
	LARG[2] = a3;
	this.cont = cont;
    }

    /* The a1 must be user, user_input, and
       java.io.PushbackReader, otherwise fails. */
    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1, a2, a3;
	a1 = LARG[0];
	a2 = LARG[1];
	a3 = LARG[2];

	Object stream = null;
	StringBuilder s;
	int type;
	Term token;

	// S_or_a
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
	if (! (stream instanceof PushbackReader))
	    throw new PermissionException(this, "input", "stream", a1, "");
	// read token
	s = new StringBuilder();
	try {
	    type = Token.read_token(s, (PushbackReader)stream);
	    switch(type) {
	    case Token.TOKEN_INTEGER:
	    	token = new IntegerTerm(Integer.parseInt(s.toString()));
	    	break;
	    case Token.TOKEN_LONG:
	    	token = new LongTerm(Long.parseLong(s.toString()));
	    	break;
	    case Token.TOKEN_DOUBLE:
	    	token = new DoubleTerm(Double.parseDouble(s.toString()));
	    	break;
	    case 'S':
			char[] chars = (s.toString()).toCharArray();
			token = Prolog.Nil;
			for (int i=chars.length; i>0; i--){
			    token = TermData.CONS(new IntegerTerm((int)chars[i-1]), token);
			}
			break;
	    default :
	    	token = SymbolTerm.create(s.toString());
	    	break;
	    }
	} catch (Exception e) {
	    throw new JavaException(this, 1, e);
	}
	if (! a2.unify(new IntegerTerm(type), engine.trail))
	    return engine.fail();
	if (! a3.unify(token, engine.trail))
	    return engine.fail();
	return cont;
    }
}

