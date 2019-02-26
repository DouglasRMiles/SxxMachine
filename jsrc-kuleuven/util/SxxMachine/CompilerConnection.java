
package SxxMachine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class CompilerConnection {

    private final static String PACKAGENAME = "be" + File.separator + "kuleuven" + File.separator + "jProlog";

    private CompilerConnection() {
    }

    public static boolean compileCompletly(Reader in) throws IOException, PrologCompileException {
        return compileCompletly(in, new PrologMachine());
    }

    public static boolean compileCompletly(Reader in, PrologMachine mach) throws IOException, PrologCompileException {
        return compileCompletly(in, mach, null);
    }

    public static boolean compileCompletly(Reader in, PrologMachine mach, CompilerSettings compSettings)
            throws IOException, PrologCompileException {
        final File targetFolder = FileUtil.createTempFolder("prolog2java");
        if (!compileCompletly(in, targetFolder, mach, compSettings)) {
            FileUtil.removeRecursive(targetFolder);
            return false;
        }
        mach.getPredikaatLoader().addCleanupListener(new CleanupListener() {
            @Override
            public void doCleanup(PredikaatLoader loader) {
                //bij verwijderen predikaatloader - als afsluiten app eerst komt, 
                //zal dit mogelijk niet opgeroepen worden
                FileUtil.removeRecursive(targetFolder);
            }
        });
        FileUtil.removeOnExit(targetFolder); //verwijderen van gecompileerde data
        testToRunQuery(mach, targetFolder);
        return true;
    }

    private static void testToRunQuery(PrologMachine mach, final File targetFolder)
            throws IOException, PrologCompileException {
        File location = new File(targetFolder, PACKAGENAME);
        File queryFile = new File(location, "query.class");
        if (queryFile.exists()) {
            runQuery(mach, location);
        }
    }

    private static void runQuery(PrologMachine mach, File location) throws IOException, PrologCompileException {
        File tmpFolder = FileUtil.createTempFolder("prolog2java");
        moveToRunLocation(location, tmpFolder);
        try {
            if (!mach.runQuery(tmpFolder))
                throw new PrologCompileException("Could not correctly compile and load code");
        } catch (PrologCompileException ex) {
            throw ex;
        } catch (JPrologScriptException e) {
            throw new PrologCompileException(e);
        } finally {
            FileUtil.removeRecursive(tmpFolder);
        }
    }

    private static void moveToRunLocation(File location, File tmpFolder) {
        File newTarget = new File(tmpFolder, PACKAGENAME);
        newTarget.mkdirs();
        for (File f : location.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().startsWith("query");
            }
        })) {
            File newName = new File(newTarget, f.getName());
            if (!f.renameTo(newName))
                throw new IllegalStateException("Could not move file: " + f);
        }
    }

    public static boolean compileCompletly(Reader in, File targetFolder, CompilerSettings compSettings)
            throws IOException, PrologCompileException {
        return compileCompletly(in, targetFolder, new PrologMachine(), compSettings);
    }

    public static boolean compileCompletly(Reader in, File targetFolder, PrologMachine mach,
            CompilerSettings compSettings) throws IOException, PrologCompileException {
        if (!compileToJava(in, targetFolder, mach, compSettings))
            return false;
        java.util.List<File> srcFiles;
        try {
            srcFiles = compileJavaToByteCode(targetFolder, targetFolder);
        } catch (IllegalStateException ex) {
            return false;
        }
        for (File f : srcFiles) {
            if (!f.delete())
                f.deleteOnExit(); //src-files verwijderen
        }
        mach.getPredikaatLoader().addURL(targetFolder);
        return true;
    }

    public static boolean compileToJava(File prologFile, File targetFolder) throws IOException, PrologCompileException {
        return compileToJava(prologFile, targetFolder, new PrologMachine(), null);
    }

    private static boolean compileToJava(File prologFile, File targetFolder, PrologMachine mach,
            CompilerSettings compSettings) throws IOException, PrologCompileException {
        return compileToJava(new BufferedReader(new FileReader(prologFile)), targetFolder, mach, compSettings);
    }

    public static boolean compileToJava(Reader in, File targetFolder) throws PrologCompileException {
        return compileToJava(in, targetFolder, null);
    }

    public static boolean compileToJava(Reader in, File targetFolder, CompilerSettings compSettings)
            throws PrologCompileException {
        return compileToJava(in, targetFolder, new PrologMachine(), compSettings);
    }

    private static boolean compileToJava(Reader in, File targetFolder, PrologMachine mach,
            CompilerSettings compSettings) throws PrologCompileException {
        Const stream = JpFactory.CONST(in);
        Const target = JpFactory.CONST(targetFolder);
        try {
            try {
                return mach.solveGoalOnce(JpFactory
                        .S("compstream", stream, target), compSettings) == ErrorStatus.NORMALEXIT;
            } finally {
                try {
                    in.close();
                } catch (IOException ex) {
                }
            }
        } catch (JPrologScriptException ex) {
            throw new PrologCompileException(ex);
        }
    }

    public static java.util.List<File> compileJavaToByteCode(File source, File target)
            throws IOException, IllegalStateException {
        JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager sjfm = jc.getStandardFileManager(null, null, null);
        java.util.List<File> files = locateFiles(source);
        Iterable<? extends JavaFileObject> fileObjects = sjfm.getJavaFileObjectsFromFiles(files);
        String[] options = new String[] { "-d", target.getAbsolutePath() };
        boolean res = jc.getTask(null, sjfm, null, java.util.Arrays.asList(options), null, fileObjects).call();
        sjfm.close();
        if (!res)
            throw new IllegalStateException("Could not compile input");
        return files;
    }

    private static java.util.List<File> locateFiles(File source) {
        if (source.isFile())
            return java.util.Collections.singletonList(source);
        java.util.List<File> files = new java.util.ArrayList<File>();
        for (File f : source.listFiles()) {
            if (f.isDirectory()) {
                files.addAll(locateFiles(f));
            } else if (f.getName().toLowerCase().endsWith(".java")) {
                //Opnemen voor compilatie
                files.add(f);
            }
        }
        return files;
    }

}
