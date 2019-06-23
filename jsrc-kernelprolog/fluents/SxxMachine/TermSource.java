package SxxMachine;

// *;
import static SxxMachine.pterm.TermData.*;

import SxxMachine.pterm.SourceFluentTerm;

/**
 * Maps a Term to an Source for iterating over its arguments
 */
public class TermSource extends SourceFluentTerm {
    public TermSource(Nonvar val, Prog p) {
        super(p);
        this.val = val;
        pos = 0;
    }

    private Nonvar val;

    private int pos;

    @Override
    public Term getElement() {
        Term X;
        if (null == val)
            X = null;
        else if (!(val.isCompound())) {
            X = val;
            val = null;
        } else if (0 == pos)
            X = SYM(val.fname());
        else if (pos <= val.arity())
            X = val.getDrefArg(pos - 1);
        else {
            X = null;
            val = null;
        }
        pos++;
        return X;
    }

    @Override
    public void stop() {
        val = null;
    }
}
