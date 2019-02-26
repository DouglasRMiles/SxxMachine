
package SxxMachine;

public class ParameterConverter extends JpModule {

    private final ParameterConverter2Prolog toProlog;
    private final ParameterConverter2java toJava;

    private final PrologMachine engine;

    public ParameterConverter(PrologMachine engine) {
        super(new Code[0], new String[0]);
        if (engine == null)
            throw new NullPointerException();
        this.engine = engine;
        if (!engine.isRegisteredOrRegister(this))
            throw new IllegalStateException();
        toProlog = new ParameterConverter2Prolog();
        toJava = new ParameterConverter2java();
    }

    public static ParameterConverter getConverterForEngine(PrologMachine mach) {
        if (mach.isModuleRegistered(ParameterConverter.class))
            return mach.getRegisteredModule(ParameterConverter.class);
        return new ParameterConverter(mach);
    }

    public ConvertieData makeParams(Object... args) {
        return toProlog.makeParams(args, engine);
    }

    public Object[] getParamRes(ConvertieData data, Term... ar) throws JPrologScriptException {
        return toJava.getParamRes(ar, (data == null ? null : data.getVarMap())); //FIXME
    }

    public Object[] getParamRes(Term... ar) throws JPrologScriptException {
        return getParamRes(null, ar);
    }

}
