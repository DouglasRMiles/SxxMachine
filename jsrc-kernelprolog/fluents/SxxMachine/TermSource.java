package SxxMachine;

import SxxMachine.pterm.*;
import static SxxMachine.pterm.TermData.*;
import SxxMachine.pterm.SourceFluentTerm;
import SxxMachine.pterm.TermData;

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
            X = TermData.SYM(val.pprint());
        else if (pos <= TermData.asStruct(val).arityOrType())
            X = TermData.asStruct(val).getDrefArg(pos - 1);
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
