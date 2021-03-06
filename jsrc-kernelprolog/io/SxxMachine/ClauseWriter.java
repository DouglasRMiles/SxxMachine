package SxxMachine;

// CONST;
import static SxxMachine.pterm.TermData.*;

/**
 * Writer
 */
public class ClauseWriter extends CharWriter {
    public ClauseWriter(String f, Prog p) {
        super(f, p);
    }

    public ClauseWriter(Prog p) {
        super(p);
    }

    @Override
    public int putElement(Term t) {
        if (null == writer)
            return 0;
        String s = null;
        if (t.isCompound() && "$string".equals(t.fname())) {
            s = charsToString(t.getDrefArg(0));
        } else {
            s = t.portrayTerm();
        }
        IO.print(writer, s);
        return 1;
    }
}
