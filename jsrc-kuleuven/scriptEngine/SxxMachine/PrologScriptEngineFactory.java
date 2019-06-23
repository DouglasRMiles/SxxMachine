
package SxxMachine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;

public class PrologScriptEngineFactory implements ScriptEngineFactory {

    private final static List<String> EXT = Collections.unmodifiableList(Arrays.asList("pl"));
    private final static List<String> NAMES = Collections
            .unmodifiableList(Arrays.asList("prolog", "jprolog", "kuleuven prolog"));
    private final static List<String> MIMES = Collections
            .unmodifiableList(Arrays.asList("text/plain"));

    @Override
    public String getEngineName() {
        return "JProlog KULeuven prolog engine";
    }

    @Override
    public String getEngineVersion() {
        return "v2.0";
    }

    @Override
    public List<String> getExtensions() {
        return EXT;
    }

    @Override
    public String getLanguageName() {
        return "prolog";
    }

    @Override
    public String getLanguageVersion() {
        return "Prolog ISO-compatible and compatible with YAP";
    }

    @Override
    public String getMethodCallSyntax(String obj, String m, String... args) {
        if (obj != null && !obj.isEmpty())
            throw new IllegalArgumentException("OO not supported in JProlog");
        final StringBuilder builder = new StringBuilder(m.length() + args.length * 5);
        builder.append(m).append("(");
        boolean first = true;
        for (final String arg : args) {
            if (first)
                first = false;
            else
                builder.append(", ");
            builder.append(arg);
        }
        builder.append(")");
        return builder.toString();
    }

    @Override
    public List<String> getMimeTypes() {
        return MIMES;
    }

    @Override
    public List<String> getNames() {
        return NAMES;
    }

    @Override
    public String getOutputStatement(String toDisplay) {
        return "write('" + toDisplay + "')";
    }

    @Override
    public Object getParameter(String key) {
        if (key == null)
            throw new NullPointerException();
        if (ScriptEngine.ENGINE.equals(key))
            return getEngineName();
        if (ScriptEngine.ENGINE_VERSION.equals(key))
            return getEngineVersion();
        if (ScriptEngine.NAME.equals(key))
            return getNames();
        if (ScriptEngine.LANGUAGE.equals(key))
            return getLanguageName();
        if (ScriptEngine.LANGUAGE_VERSION.equals(key))
            return getLanguageVersion();
        //Er is ook een sleutel om op te vragen of de scriptengine thread-safe is,
        // de huidige implementatie is niet thread-safe en als resultaat moet daar
        // null voor teruggegeven worden
        return null;
    }

    @Override
    public String getProgram(String... statements) {
        final StringBuilder b = new StringBuilder(statements.length * 10);
        boolean first = true;
        for (final String str : statements) {
            if (first)
                first = false;
            else
                b.append(",\n");
            b.append(str);
        }
        return b.toString();
    }

    @Override
    public PrologEngine getScriptEngine() {
        return new PrologEngine(this);
    }

}
