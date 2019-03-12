package SxxMachine;

// CONST;
import static SxxMachine.pterm.TermData.*;

import SxxMachine.pterm.SinkFluentTerm;

/**
 * Builds Fluents from Java Streams
 */
public class StringSink extends SinkFluentTerm {
    protected StringBuffer buffer;

    public StringSink(Prog p) {
        super(p);
        this.buffer = new StringBuffer();
    }

    @Override
    public int putElement(Term t) {
        buffer.append(t.getJavaString());
        return 1;
    }

    @Override
    public void stop() {
        buffer = null;
    }

    @Override
    public Term collect() {
        return SYM(buffer.toString());
    }
}
