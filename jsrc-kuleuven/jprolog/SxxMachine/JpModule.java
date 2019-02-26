
package SxxMachine;

/**
  * A module defines (i.e. loads) a number of predicates
  * in a Prolog machine.
  *  @author  toms
  *
  */
public abstract class JpModule {

    private final static Logger log = Logger.getLogger(JpModule.class);

    protected JpModule(Code[] code, String[] functors) {
        super();
        codes = code;
        this.functors = functors;
    }

    public final boolean load(PrologMachine machine) {
        if (!machine.registerModule(this))
            return false;
        for (int i = 0; i < codes.length; i++) {
            log.info("Registering " + functors[i]);
            machine.registerCode(codes[i], functors[i]);
        }
        for (final Code c : codes) {
            c.init(machine);
        }
        return true;
    }

    private final Code[] codes;
    private final String[] functors;

    public Class<? extends JpModule> getClassToRegister() {
        return getClass();
    }

}
