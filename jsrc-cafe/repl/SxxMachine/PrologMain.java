package SxxMachine;

// CONS;
// S;
import static SxxMachine.pterm.TermData.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PushbackReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

import SxxMachine.pterm.TermData;

/**
 * Prolog Cafe launcher. The <code>PrologMain</code> class launchs the Prolog
 * Cafe system.<br>
 * The usage is as follows, where <code>package</code> is a package name, and
 * <code>predicate</code> is a predicate name (only atom).
 *
 * <pre>
 *   % java -cp $PLCAFEDIR/plcafe.jar SxxMachine.PrologMain package:predicate
 *   % java -cp $PLCAFEDIR/plcafe.jar SxxMachine.PrologMain predicate
 * </pre>
 *
 * Let us show a sample session for launching a small Prolog interpreter:
 * <code>SxxMachine:cafeteria/0</code>.<br>
 *
 * <pre>
 *    % java  -cp $PLCAFEDIR/plcafe.jar:$CLASSPATH SxxMachine.PrologMain SxxMachine:cafeteria
 *    Prolog Cafe X.X.X (YYY)
 *    Copyright(C) 1997-200X M.Banbara and N.Tamura
 *    | ?-
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PrologMain {
    /** Version information */
    public static final String VERSION = "Prolog Cafe 1.2.5 (mantis)";
    /** Copyright information */
    private static final String COPYRIGHT = "Copyright(C) 1997-2009 M.Banbara and N.Tamura";
    private static final String HEADER = "Prolog Cafe (" + COPYRIGHT + ")";

    public static BlockingPrologControl p;
    private static long reductionLimit;
    // First Files Init Each  -f
    private static List<File> toLoadF = new ArrayList<File>(4);
    // Load Files NoInit -l
    private static List<File> toLoadL = new ArrayList<File>(4);
    // Script Files InitNow [-s]
    private static List<File> toLoadS = new ArrayList<File>(4);

    private static int exitCode;
    private static String[] PROGRAM_ARGV;
    private static Term MAIN_GOAL;
    final private static Queue<String> pendingGoals = new LinkedList<String>();
    private static Queue<String> pendingInits = new LinkedList<String>();

    public static void main(String argv[]) {
        if (argv == null || argv.length == 0) {
            argv = new String[] { "--enable-io", "-l", "jsrc-pass20/tests/animal_string.pro", "-main", "cafeteria" };
        }
        PROGRAM_ARGV = argv;
        main(argv, null);
    }

    public static void main(String argv[], Term goal) {
        PROGRAM_ARGV = argv;
        MAIN_GOAL = goal;
        Term currentGoal = load(goal);
        run(currentGoal);
    }

    public static Term load(Term goal) {
        try {

            System.err.println(HEADER);

            p = new BlockingPrologControl();
            p.configureUserIO(System.in, System.out, System.err);
            p.setMaxDatabaseSize(InternalDatabase.DEFAULT_SIZE);

            reductionLimit = Long.MAX_VALUE;

            String argv[] = PROGRAM_ARGV;
            if (argv == null || argv.length == 0) {
                argv = new String[] { "--enable-io", Prolog.BUILTIN + ":cafeteria" };
            }
            for (int i = 0; i < argv.length; i++) {
                String arg = argv[i];
                if (arg.equals("--enable-io")) {
                    p.setEnabled(Prolog.Feature.IO, true);
                } else if (arg.equals("--enable-statistics")) {
                    p.setEnabled(Prolog.Feature.STATISTICS_RUNTIME, true);
                } else if (arg.startsWith("--max-database-size=")) {
                    String v = arg.substring(arg.indexOf('=') + 1);
                    p.setMaxDatabaseSize(Integer.parseInt(v, 10));
                } else if (arg.startsWith("--reduction-limit=")) {
                    String v = arg.substring(arg.indexOf('=') + 1);
                    reductionLimit = Long.parseLong(v, 10);

                } else if (arg.equals("-f") && i + 1 < argv.length) {
                    toLoadF.add(0, new File(argv[++i]));
                } else if (arg.equals("-l") && i + 1 < argv.length) {
                    toLoadL.add(new File(argv[++i]));
                } else if (arg.equals("-s") && i + 1 < argv.length) {
                    toLoadS.add(new File(argv[++i]));

                } else if (arg.equals("-main") && i + 1 < argv.length) {
                    MAIN_GOAL = parseAtomicGoal((argv[++i]));

                } else if (arg.equals("-i") && i + 1 < argv.length) {
                    pendingInits.add((argv[++i]));

                } else if (arg.equals("-g") && i + 1 < argv.length) {
                    pendingGoals.add((argv[++i]));

                } else if (arg.startsWith("-")) {
                    usage();
                    exit(1);
                } else if (i == argv.length - 1) {
                    goal = parseAtomicGoal(arg);
                } else {
                    usage();
                    goal = null;// "cafeteria";
                    // exit(1);
                }
            }

            p.setReductionLimit(reductionLimit);
            boolean enableInits = true;
            for (File file : toLoadF) {
                loadFile(file, enableInits);
            }
            initializePackages(p, goal);

            if (goal == null) {
                System.err.println();
                System.err.flush();
                goal = S(TermData.F(":", 2), SYM(Prolog.BUILTIN), createAtomic("cafeteria"));
            }

        } catch (HaltException e) {
            exit(e.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
            exit(1);
        } catch (Throwable e) {
            e.printStackTrace();
            exit(2);
        }
        return goal;
    }

    /**
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void doPendingCmdline() throws FileNotFoundException, IOException {
        doInits(pendingInits);
        boolean enableInits = false;
        for (File file : toLoadL) {
            loadFile(file, enableInits);
        }
        pendingInits.clear();

        for (File file : toLoadS) {
            loadFile(file, true);
        }
        doInits(pendingInits);
        doInits(pendingGoals);
    }

    /**
     * @param file
     * @throws IOException
     * @throws FileNotFoundException
     */
    private static void loadFile(File file, boolean enableInits) throws FileNotFoundException, IOException {
        Queue<String> savedPQueue = pendingInits;
        if (!enableInits) {
            pendingInits = new LinkedList();
        }
        try (FileReader src = new FileReader(file);
                BufferedReader buf = new BufferedReader(src);
                PushbackReader in = new PushbackReader(buf, Prolog.PUSHBACK_SIZE)) {
            Term path = createAtomic(file.getPath());
            if (!p.execute(Prolog.BUILTIN, "consult_stream", path, FFIObject(in))) {
                System.err.println();
                System.err.flush();
                System.exit(1);
            }
        }
        pendingInits = savedPQueue;
        if (enableInits) {
            doInits(pendingInits);
        }
        System.err.println();
        System.err.flush();

    }

    public static int run(Term goal) {
        try {
            doPendingCmdline();
            if (goal == null) {
                goal = MAIN_GOAL;
            }
            callGoal(goal);
        } catch (HaltException e) {
            exit(e.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
            exit(1);
        } catch (Throwable e) {
            e.printStackTrace();
            exit(2);
        }
        return exitCode;
    }

    /**
     * @param goal
     */
    private static void callGoal(Term goal) {
        p.execute(Prolog.BUILTIN, "call", goal);
    }

    /**
     *
     */
    private static void doInits(Queue<String> pendingInits) {
        while (!pendingInits.isEmpty()) {
            callGoal(parseAtomicGoal(pendingInits.poll()));
        }
    }

    private static int exit(int i) {
        exitCode = i;
        System.exit(exitCode);
        return exitCode;
    }

    /**
     * Returns a term for given string representation of atom goal, or
     * <code>null</code> if parsing fails.
     *
     * @param s
     *            a string representation of initial goal (ex. foge:main).
     * @return a term which corresponds to a given string, or <code>null</code> if
     *         parsing fails.
     */
    protected static Term parseAtomicGoal(String s) {
        StringTokenizer st = new StringTokenizer(s, ":");
        int i = st.countTokens();
        if (i == 1) {

            return S(F(":", 2), SYM("user"), createAtomic(st.nextToken()));
        } else if (i == 2) {
            return S(":", SYM(st.nextToken()), SYM(st.nextToken()));
        } else {
            return null;
        }
    }

    private static void initializePackages(BlockingPrologControl p, Term goal) {
        LinkedHashSet<String> set = new LinkedHashSet<>(3);
        set.add(Prolog.BUILTIN);
        set.add("user");
        if (goal != null) {
            set.add(goal.getPlainArg(0).getJavaString());
        }

        List<String> list = new ArrayList<>(set);
        Term done = SYM("true");
        Term head = Prolog.Nil;
        for (int i = list.size() - 1; 0 <= i; i--) {
            head = CONS(SYM(list.get(i)), head);
        }
        p.execute(Prolog.BUILTIN, "initialization", head, done);
        PredTable.runInits(p.engine);
    }

    private static void usage() {
        PrintStream e = System.err;
        e.println("usage:  java -jar cafeteria.jar [options] [goal]");
        e.println();
        e.println("  --enable-io           : enable file system access");
        e.println("  --enable-statistics   : enable statistics/2");
        e.println("  --max-database-size=N : maximum entries in dynamic database");
        e.println("  --reduction-limit=N   : max reductions during execution");
        e.println();
        e.println("   -f source.pl         : load file.pl  (may be repeated)");
        e.println();
        e.println("  goal :          predicate or package:predicate");
        e.println("                  (if not specified, runs interactive loop)");
    }

    /**
     * @param file_animal
     */
    public void run(PrologModule file_animal) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("PrologMain.run");

    }
}
