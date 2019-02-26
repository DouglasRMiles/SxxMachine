
package SxxMachine;

import java.io.IOException;
import java.io.Reader;

public class DelegateReader extends Reader {

    private final StreamProvider provider;

    public DelegateReader(StreamProvider prov) {
        if (prov == null)
            throw new NullPointerException();
        provider = prov;
    }

    protected Reader getDelegate() {
        return provider.getReader();
    }

    @Override
    public void close() throws IOException {
        getDelegate().close();
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return getDelegate().read(cbuf, off, len);
    }

}
