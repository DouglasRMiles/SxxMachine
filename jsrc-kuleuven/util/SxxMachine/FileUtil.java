
package SxxMachine;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class FileUtil {

    private final static Logger log = Logger.getLogger(FileUtil.class);

    private static Set<File> removeFiles;

    private FileUtil() {
    }

    public static File createTempFolder(String name) throws IOException {
        File folder;
        do {
            folder = File.createTempFile(name, "tmpfolder");
        } while (!(folder.delete() && folder.mkdirs()));
        return folder;
    }

    public static synchronized void removeOnExit(File f) {
        if (removeFiles == null) {
            removeFiles = new TreeSet<File>();
            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    Set<File> todo = removeFiles;
                    removeFiles = null;
                    for (File f : todo) {
                        if (f.exists()) { //Kan ondertussen reeds opgekuist zijn
                            doRemoveRecursive(f, false);
                        }
                    }
                }
            });
        }
        removeFiles.add(f);
    }

    public static void removeRecursive(File f) {
        doRemoveRecursive(f, true);
        if (removeFiles != null)
            removeFiles.remove(f);
    }

    private static void doRemoveRecursive(File f, boolean doExtra) {
        if (f.isDirectory()) {
            for (File sub : f.listFiles())
                if (doExtra)
                    removeRecursive(sub);
                else
                    doRemoveRecursive(sub, doExtra);
        }
        if (!f.delete()) {
            log.warn("Could not remove file/directory: " + f);
        }
    }

}
