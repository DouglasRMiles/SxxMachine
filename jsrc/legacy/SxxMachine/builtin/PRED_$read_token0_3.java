package SxxMachine.builtin;

import java.io.PushbackReader;

import SxxMachine.exceptions.ExistenceException;
import SxxMachine.exceptions.IllegalDomainException;
import SxxMachine.exceptions.JavaException;
import SxxMachine.exceptions.PInstantiationException;
import SxxMachine.exceptions.PermissionException;
import SxxMachine.DoubleTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.JavaObjectTerm;
import SxxMachine.ListTerm;
import SxxMachine.LongTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.Token;
import SxxMachine.VariableTerm;
/**
 * <code>'$read_token0'/3</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 * @since 0.7
 */
class PRED_$read_token0_3 extends Predicate.P3 {
    public PRED_$read_token0_3(Term a1, Term a2, Term a3, Operation cont){
	arg1 = a1;
	arg2 = a2;
	arg3 = a3;
	this.cont = cont;
    }

    /* The a1 must be user, user_input, and
       java.io.PushbackReader, otherwise fails. */
    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1, a2, a3;
	a1 = arg1;
	a2 = arg2;
	a3 = arg3;

	Object stream = null;
	StringBuilder s;
	int type;
	Term token;

	// S_or_a
	a1 = a1.dereference();
	if ((a1 instanceof VariableTerm)) {
	    throw new PInstantiationException(this, 1);
	} else if ((a1 instanceof SymbolTerm)) {
	    if (! engine.getStreamManager().containsKey(a1))
		throw new ExistenceException(this, 1, "stream", a1, "");
	    stream = ((JavaObjectTerm) engine.getStreamManager().get(a1)).object();
	} else if ((a1 instanceof JavaObjectTerm)) {
	    stream = ((JavaObjectTerm) a1).object();
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
			    token = new ListTerm(new IntegerTerm((int)chars[i-1]), token);
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

