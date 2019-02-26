
package SxxMachine;

import javax.script.ScriptContext;

public class ContextGlobalVarsModule extends GlobalVarsModule {

    private final PrologEngine engine;

    protected ContextGlobalVarsModule(PrologEngine eng) {
        super();
        if (eng == null)
            throw new NullPointerException();
        engine = eng;
    }

    @Override
    protected VarTableIF createTable() {
        return new PrologEngineMap();
    }

    @Override
    public Class<? extends JpModule> getClassToRegister() {
        return GlobalVarsModule.class;
    }

    private JPrologBindings getBindings() {
        return engine.getContext().getBindings(ScriptContext.ENGINE_SCOPE);
    }

    private class PrologEngineMap implements VarTableIF {

        PrologEngineMap() {
            super();

        }

        @Override
        public Term get(Const cname) {
            return getBindings().getProlog(cname);
        }

        @Override
        public void put(Const cname, Term value) throws JPrologScriptException {
            getBindings().putProlog(cname, value);
        }

    }
}
