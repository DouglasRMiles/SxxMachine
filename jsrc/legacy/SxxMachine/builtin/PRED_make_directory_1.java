package SxxMachine;

import java.io.File;

import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.IllegalDomainException;
import SxxMachine.PInstantiationException;
import SxxMachine.PermissionException;
import SxxMachine.PrologException;

/** {@code make_directory(+Dir)} */
public class PRED_make_directory_1 extends Predicate.P1 {
  public PRED_make_directory_1(Term a1, Operation next) {
    LARG[0] = a1;
    cont = next;
  }

  @Override
  public Operation exec(Prolog engine) throws PrologException {
    engine.requireFeature(Prolog.Feature.IO, this, LARG[0]);
    engine.setB0();

    Term a1 = LARG[0].dref();
    if ((a1 instanceof VariableTerm)) throw new PInstantiationException(this, 1);
    if (!(a1 instanceof SymbolTerm)) throw new IllegalDomainException(this, 1, "dir", a1);

    File file = new File(a1.asSymbolTerm().name());
    if (file.mkdir())
      return cont;
    else
      throw new PermissionException(this, "open", "dir", a1, "cannot create");
  }
}
