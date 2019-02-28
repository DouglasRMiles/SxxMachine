package SxxMachine;

/**
 * Minimal command line only Prolog main entry point
 */
public class KernelPrologMain {
    public static int init() {
        if (!Init.startProlog())
            return 0;
        Init.builtinDict = new Builtins();
        final String query = "reconsult('" + Init.default_lib + "')";
        Init.askProlog(query);
        return 1;
    }

    public static void main(String args[]) {
        if (0 == init())
            return;
        if (!Init.run(args))
            return;
        Init.standardTop(); // interactive
    }
}
