package SxxMachine.builtin;

import java.util.regex.Pattern;

import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PInstantiationException;
import SxxMachine.JavaObjectTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;

/**
 * <code>regex_compile/2</code><br>
 *
 * <pre>
 *   'regex_compile'(+regex string, -Pattern object)
 * </pre>
 */
public class PRED_regex_compile_2 extends Predicate.P2 {

  public PRED_regex_compile_2(Term a1, Term a2, Operation cont) {
        arg1 = a1;
        arg2 = a2;
        this.cont = cont;
  }

  public Operation exec(Prolog engine) {
      engine.setB0();
      Term a1 = arg1.dereference();
      Term a2 = arg2.dereference();

      if ((a1 instanceof VariableTerm)) {
        throw new PInstantiationException(this, 1);
      }
      if (!(a1 instanceof SymbolTerm)) {
        throw new IllegalTypeException(this, 1, "atom", a1);
      }
      Pattern pattern = Pattern.compile(a1.name(), Pattern.MULTILINE);

      if (!a2.unify(new JavaObjectTerm(pattern), engine.trail)) {
        return engine.fail();
      }
      return cont;
  }
}