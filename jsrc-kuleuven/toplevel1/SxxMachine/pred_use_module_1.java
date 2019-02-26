
package SxxMachine;

public class pred_use_module_1 extends Code {

    private final static Logger log = Logger.getLogger(pred_use_module_1.class);

    @Override
    public int arity() {
        return 1;
    }

    private boolean loadModule(String moduleName, PrologMachine mach) {
        if (moduleName == null)
            return false;
        moduleName = moduleName.replace('/', '.').replace('\\', '.');
        PredikaatLoader l = mach.getPredikaatLoader();
        try {
            return loadModule(l.locateClass(moduleName), mach);
        } catch (ClassNotFoundException e) {
            try {
                return loadModule(l.locateClass(PredikaatLoader.class.getPackage().getName() + "." + moduleName), mach);
            } catch (ClassNotFoundException e1) {
            }
        }
        log.info("Could not locate module: " + moduleName);
        return false;
    }

    private boolean loadModule(Class module, PrologMachine mach) {
        if (!JpModule.class.isAssignableFrom(module))
            return false;
        if (mach.isModuleRegistered((Class<? extends JpModule>) module))
            return true;
        try {
            return loadModule((JpModule) module.newInstance(), mach);
        } catch (InstantiationException e) {
            log.error("Could not init module", e);
        } catch (IllegalAccessException e) {
            log.error("Could not access module", e);
        }
        return false;
    }

    private boolean loadModule(JpModule module, PrologMachine mach) {
        if (module == null)
            return false;
        if (mach.isModuleRegistered(module.getClass()))
            return true;
        return module.load(mach);
    }

    private boolean load(Term param, PrologMachine mach) {
        if (param instanceof AFunct) {
            AFunct f = (AFunct) param;
            if (f.arity() == 0) {
                param = JpFactory.CONST(f.fname());
            }
        }
        if (param instanceof Const) {
            Object o = ((Const) param).getValue();
            if (o instanceof String) {
                //Naam vd te laden module
                if (!loadModule((String) o, mach))
                    return false;
            } else if (o instanceof JpModule) {
                //Direct de te laden module
                if (!loadModule((JpModule) o, mach))
                    return false;
            } else if (o instanceof Class) {
                //Class die naar module wijst
                if (!loadModule((Class) o, mach))
                    return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term param = areg[0].dref();
        if (param.isCons()) {
            while (param.isCons()) {
                AFunct f = (AFunct) param;
                if (!load(f.args()[0].dref(), mach))
                    return mach.Fail0;
                param = f.args()[1].dref();
            }
            if (!param.isNil())
                return mach.Fail0;
        } else {
            if (!load(param, mach))
                return mach.Fail0;
        }
        areg[0] = areg[1];
        areg[1] = null;
        return mach.Call1;
    }

}
