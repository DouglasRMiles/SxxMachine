
package SxxMachine;

import java.io.Reader;
import java.io.Writer;

public class ContextStreamProvider implements StreamProvider {

    private final PrologEngine engine;

    public ContextStreamProvider(PrologEngine eng) {
        super();
        if (eng == null)
            throw new NullPointerException();
        engine = eng;
    }

    @Override
    public Reader getReader() {
        return engine.getContext().getReader();
    }

    @Override
    public Writer getWriter() {
        return engine.getContext().getWriter();
    }

}
