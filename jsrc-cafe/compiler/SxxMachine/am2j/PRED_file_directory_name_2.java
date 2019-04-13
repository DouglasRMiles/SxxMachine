package SxxMachine.am2j;

import static SxxMachine.pterm.TermData.*;
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

/** {@code file_directory_name(+File, -Directory)} */
public class PRED_file_directory_name_2 extends Predicate.P2 {
    public PRED_file_directory_name_2(Term a1, Term a2, Operation next) {

        ThizLARGs.setAreg0(a1);
        ThizLARGs.setAreg1(a2);
        cont = next;
    }

    @Override
    public Operation exec(Prolog engine) throws PrologException {
        engine.requireFeature(Prolog.Feature.IO, this, ThizLARGs.getPlainArg(0));
        engine.setB0();

        Term a1 = ThizLARGs.getTermDRef(0);
        if (a1 instanceof VariableTerm)
            throw new PInstantiationException(this, 1);
        if (!(a1 instanceof Functor))
            throw new IllegalDomainException(this, 1, "file", a1);

        File file = new File(a1.getJavaString());
        File dir = file.getParentFile();
        if (dir == null)
            throw new IllegalDomainException(this, 1, "file", a1);

        Term a2 = ThizLARGs.getTermDRef(1);
        if (a2.unify(createAtomic(dir.getPath()), engine.trail))
            return cont;
        else
            return engine.fail();
    }
}
