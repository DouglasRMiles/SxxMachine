
package SxxMachine;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.LinkedList;

public class PredikaatLoader {

    private final static Logger log = Logger.getLogger(PredikaatLoader.class);

    private static final String EXCEPTION_SEARCHING = "Exception while searching";
    private static final String EXCEPTION__SEARCHING_PREDIKAATLOADER = EXCEPTION_SEARCHING + " in predikaatloader";

    private final static String EXCEPTIONMESSAGE = "Exception while adding url to predikaatloader";

    private final ClassLoader loader;
    private final LinkedList<CleanupListener> cleanupListeners;

    PredikaatLoader() {
        loader = createClassLoader(PredikaatLoader.class.getClassLoader());
        cleanupListeners = new LinkedList<CleanupListener>();
    }

    private ClassLoader createClassLoader(final ClassLoader parent) {
        return AccessController.doPrivileged(new PrivilegedAction<URLClassLoader>() {
            @Override
            public URLClassLoader run() {
                return new URLClassLoader(new URL[] {}, parent);
            }
        });
    }

    @Override
    protected void finalize() throws Throwable {
        for (CleanupListener cl : cleanupListeners)
            cl.doCleanup(this);
        super.finalize();
    }

    public void addURL(File file) throws MalformedURLException {
        addURL(file.toURI().toURL());
    }

    public void addURL(URL url) {
        addUrl(url, loader);
    }

    private void addUrl(final URL url, ClassLoader loader) {
        final Method m;
        try {
            m = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
        } catch (SecurityException e) {
            //Komen we normaalgezien niet, anders aanpassing in java
            log.fatal("SecurityException while adding url to predikaatloader", e);
            return;
        } catch (NoSuchMethodException e) {
            //Komen we normaalgezien niet, anders aanpassing in java
            log.fatal(EXCEPTIONMESSAGE, e);
            return;
        }
        AccessController.doPrivileged(new PrivilegedAction<Object>() {
            @Override
            public Object run() {
                m.setAccessible(true);
                return null;
            }
        });
        try {
            m.invoke(loader, url);
        } catch (IllegalArgumentException e) {
            //Komen we normaalgezien niet, anders aanpassing in java
            log.fatal(EXCEPTIONMESSAGE, e);
            return;
        } catch (IllegalAccessException e) {
            //Komen we normaalgezien niet, anders aanpassing in java
            log.fatal(EXCEPTIONMESSAGE, e);
            return;
        } catch (InvocationTargetException e) {
            //Komen we normaalgezien niet, anders aanpassing in java
            log.fatal(EXCEPTIONMESSAGE, e);
            return;
        }
    }

    public Class<?> locateTemporaryClass(File folder, String query)
            throws MalformedURLException, ClassNotFoundException {
        ClassLoader tmp = createClassLoader(loader);
        addUrl(folder.toURI().toURL(), tmp);
        return locateClass(query, tmp);
    }

    public Class<?> locateClass(String className) throws ClassNotFoundException {
        return locateClass(className, loader);
    }

    public Class<?> locateClass(String className, ClassLoader loader) throws ClassNotFoundException {
        try {
            //Eerst op deze manier proberen, kan zijn dat anders standaardpredikaten
            // niet correct gevonden worden als omgeving in een container draait of iets dergelijks
            return Class.forName(className);
        } catch (ClassNotFoundException ex) {
            return locateClassWithClassLoader(className, loader);
        }
    }

    private Class<?> locateClassWithClassLoader(String className, ClassLoader loader) throws ClassNotFoundException {
        Method m;
        try {
            m = ClassLoader.class.getDeclaredMethod("findClass", String.class);
        } catch (SecurityException e) {
            //Komen we normaalgezien niet, anders aanpassing in java
            log.fatal(EXCEPTION__SEARCHING_PREDIKAATLOADER, e);
            throw new ClassNotFoundException(EXCEPTION_SEARCHING, e);
        } catch (NoSuchMethodException e) {
            //Komen we normaalgezien niet, anders aanpassing in java
            log.fatal(EXCEPTION__SEARCHING_PREDIKAATLOADER, e);
            throw new ClassNotFoundException(EXCEPTION_SEARCHING, e);
        }
        m.setAccessible(true);
        try {
            return (Class) m.invoke(loader, className);
        } catch (IllegalArgumentException e) {
            //Komen we normaalgezien niet, anders aanpassing in java
            log.fatal(EXCEPTION__SEARCHING_PREDIKAATLOADER, e);
            throw new ClassNotFoundException(EXCEPTION_SEARCHING, e);
        } catch (IllegalAccessException e) {
            //Komen we normaalgezien niet, anders aanpassing in java
            log.fatal(EXCEPTION__SEARCHING_PREDIKAATLOADER, e);
            throw new ClassNotFoundException(EXCEPTION_SEARCHING, e);
        } catch (InvocationTargetException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ClassNotFoundException)
                throw (ClassNotFoundException) cause;
            throw new ClassNotFoundException("Error while getting class", e);
        }
    }

    public void addCleanupListener(CleanupListener listener) {
        cleanupListeners.add(listener);
    }

}
