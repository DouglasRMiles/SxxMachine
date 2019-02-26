
package SxxMachine;

import java.io.Reader;
import java.io.Writer;

public interface StreamProvider {

    public Reader getReader();

    public Writer getWriter();

}
