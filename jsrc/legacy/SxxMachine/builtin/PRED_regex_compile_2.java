package SxxMachine;

import java.util.regex.Pattern;

import SxxMachine.FFIObjectTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.IllegalTypeException;
import SxxMachine.PInstantiationException;

/**
 * <code>regex_compile/2</code><br>
 *
 * <pre>
 *   'regex_compile'(+regex string, -Pattern object)
 * </pre>
 */
public class PRED_regex_compile_2 extends Predicate.P2 {

  public PRED_regex_compile_2(Term a1, Term a2, Operation cont) {
        LARG[0] = a1;
        LARG[1] = a2;
        this.cont = cont;
  }

  public Operation exec(Prolog engine) {
      engine.setB0();
      Term a1 = LARG[0].dref();
      Term a2 = LARG[1].dref();

      if ((a1 instanceof VariableTerm)) {
        throw new PInstantiationException(this, 1);
      }
      if (!(a1 instanceof SymbolTerm)) {
        throw new IllegalTypeException(this, 1, "atom", a1);
      }
      Pattern pattern = Pattern.compile(a1.name(), Pattern.MULTILINE);

      if (!a2.unify(new FFIObjectTerm(pattern), engine.trail)) {
        return engine.fail();
      }
      return cont;
  }
}