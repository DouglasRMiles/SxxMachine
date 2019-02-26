
package SxxMachine;

import java.io.IOException;
import java.io.Writer;

public class DelegateWriter extends Writer {

    private final StreamProvider provider;

    public DelegateWriter(StreamProvider prov) {
        if (prov == null)
            throw new NullPointerException();
        provider = prov;
    }

    protected Writer getDelegate() {
        return provider.getWriter();
    }

    @Override
    public void close() throws IOException {
        getDelegate().close();
    }

    @Override
    public void flush() throws IOException {
        getDelegate().flush();
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        getDelegate().write(cbuf, off, len);
    }

}
