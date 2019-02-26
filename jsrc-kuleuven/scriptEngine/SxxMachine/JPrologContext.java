
package SxxMachine;

import java.util.ArrayList;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.SimpleScriptContext;

public class JPrologContext extends SimpleScriptContext {

    private final static Logger log = Logger.getLogger(JPrologContext.class);

    public JPrologContext() {
        super();
        engineScope = new JPrologBindings();
    }

    public JPrologContext(ScriptContext context) {
        this();
        setErrorWriter(context.getErrorWriter());
        setWriter(context.getWriter());
        setReader(context.getReader());
        setBindings(context.getBindings(ScriptContext.ENGINE_SCOPE), ScriptContext.ENGINE_SCOPE);
        setBindings(context.getBindings(ScriptContext.GLOBAL_SCOPE), ScriptContext.GLOBAL_SCOPE);
    }

    @Override
    public void setBindings(Bindings bindings, int scope) {
        if (bindings instanceof JPrologBindings)
            super.setBindings(bindings, scope);
        else {
            log.info("Invalid bindings - should be JPrologBindings - autoconverting");
            super.setBindings(new JPrologBindings(bindings), scope);
        }
    }

    @Override
    public JPrologBindings getBindings(int scope) {
        return (JPrologBindings) super.getBindings(scope);
    }

    @Override
    public java.util.List<Integer> getScopes() {
        return scopes;
    }

    private static java.util.List<Integer> scopes;
    static {
        scopes = new ArrayList<Integer>(2);
        scopes.add(ENGINE_SCOPE);
        scopes = java.util.Collections.unmodifiableList(scopes);
    }

}
