package SxxMachine.am2j;

import java.io.File;

import SxxMachine.Functor;
import SxxMachine.IllegalDomainException;
import SxxMachine.Operation;
import SxxMachine.PInstantiationException;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.PrologException;
import SxxMachine.Term;
import SxxMachine.pterm.VariableTerm;

/** {@code exists_directory(+Directory)} */
public class PRED_exists_directory_1 extends Predicate.P1 {
    public PRED_exists_directory_1(Term a1, Operation next) {
        final Term[] ThizLARGs = this.ThizLARGs.getBacking();
        ThizLARGs[0] = a1;
        cont = next;
    }

    @Override
    public Operation exec(Prolog engine) throws PrologException {
        final Term[] ThizLARGs = this.ThizLARGs.getBacking();
        engine.requireFeature(Prolog.Feature.IO, this, ThizLARGs[0]);
        engine.setB0();

        Term a1 = ThizLARGs[0].dref();
        if (a1 instanceof VariableTerm)
            throw new PInstantiationException(this, 1);
        if (!(a1 instanceof Functor))
            throw new IllegalDomainException(this, 1, "directory", a1);

        File file = new File(a1.getJavaString());
        if (file.isDirectory())
            return cont;
        else
            return engine.fail();
    }
}
