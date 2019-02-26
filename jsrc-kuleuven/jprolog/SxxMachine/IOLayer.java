
package SxxMachine;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import java.util.TreeMap;

public class IOLayer {

    private final static Logger log = Logger.getLogger(IOLayer.class);

    private final StreamHandler<StreamGroup> streamIn;
    private final StreamHandler<Stream<PrintWriter>> streamOut;

    private final RunningPrologMachine mach;

    IOLayer(RunningPrologMachine mach, StreamProvider streamprovider) {
        super();
        if (mach == null || streamprovider == null)
            throw new NullPointerException();
        streamIn = new StreamHandler<StreamGroup>(new StreamGroup(new DelegateReader(streamprovider), null, mach));
        streamOut = new StreamHandler<Stream<PrintWriter>>(
                new Stream<PrintWriter>(new PrintWriter(new DelegateWriter(streamprovider)), null));
        this.mach = mach;
    }

    public boolean isOpen(Term handle) {
        return streamIn.isOpen(handle) || streamOut.isOpen(handle);
    }

    public PrintWriter getCurrentOutputStream() {
        return getStreamHandlerOut().getCurrentStream().getStream();
    }

    public StreamHandler<Stream<PrintWriter>> getStreamHandlerOut() {
        return streamOut;
    }

    public StreamHandler<StreamGroup> getStreamHandlerIn() {
        return streamIn;
    }

    public boolean openOutStream(Writer out, Term handle, UnTrailOperation reopenStream) {
        if (out == null || handle == null)
            throw new NullPointerException();
        if (!streamOut.canOpenStream(handle))
            return false;
        streamOut.openStream(new Stream<PrintWriter>(
                (out instanceof PrintWriter ? (PrintWriter) out : new PrintWriter(out)),
                reopenStream), handle.dref().fname());
        return true;
    }

    public boolean openInStream(Reader in, Term handle, UnTrailOperation reopenStream) {
        if (in == null || handle == null)
            throw new NullPointerException();
        if (!streamIn.canOpenStream(handle))
            return false;
        streamIn.openStream(new StreamGroup(in, reopenStream, mach), handle.dref().fname());
        return true;
    }

    public class StreamHandler<InternalStreamType extends Closeable> {

        private final class OpenStreamUndo implements UnTrailOperation {
            private final String name;

            private OpenStreamUndo(String name) {
                this.name = name;
            }

            @Override
            public void unTrailSelf() {
                closeStream(name);
            }
        }

        private final InternalStreamType defaultStream;
        private InternalStreamType currentStream;
        private final Map<String, InternalStreamType> openStreams;

        StreamHandler(InternalStreamType defaultStream) {
            if (defaultStream == null)
                throw new NullPointerException();
            openStreams = new TreeMap<String, InternalStreamType>();
            currentStream = null;
            this.defaultStream = defaultStream;
        }

        boolean canOpenStream(Term handle) {
            handle = handle.dref();
            if (!(handle instanceof Const))
                return false;
            final String name = handle.fname();
            if (openStreams.containsKey(name))
                return false;
            return true;
        }

        void openStream(InternalStreamType stream, final String name) {
            currentStream = stream;
            openStreams.put(name, stream);
            mach.trailEntry(new OpenStreamUndo(name));
        }

        public boolean closeInStream(Term handle) {
            if (handle == null)
                throw new NullPointerException();
            handle = handle.dref();
            if (!(handle instanceof Const))
                return false;
            return closeStream(handle.fname());
        }

        private boolean closeStream(String name) {
            if (!openStreams.containsKey(name))
                return false;
            final InternalStreamType sg = openStreams.remove(name);
            try {
                sg.close();
            } catch (final IOException ex) {
            }
            if (sg.equals(currentStream))
                currentStream = null;
            return true;
        }

        private String currentKey(InternalStreamType value) {
            for (final Map.Entry<String, InternalStreamType> e : openStreams.entrySet()) {
                if (e.getValue().equals(value))
                    return e.getKey();
            }
            return null;
        }

        public boolean closeCurrentStream() {
            if (currentStream == null)
                return false;
            openStreams.remove(currentKey(currentStream));
            try {
                currentStream.close();
            } catch (final IOException ex) {
            }
            currentStream = null;
            return true;
        }

        public boolean isOpen(Term handle) {
            handle = handle.dref();
            if (!(handle instanceof Const))
                return false;
            final String name = handle.fname();
            return openStreams.containsKey(name);
        }

        public InternalStreamType getCurrentStream() {
            if (currentStream == null)
                return defaultStream;
            return currentStream;
        }

    }

    public class Stream<T extends Closeable> implements Closeable {

        private T stream;
        private UnTrailOperation reopen;

        Stream(T stream, UnTrailOperation reopen) {
            if (stream == null)
                throw new NullPointerException();
            this.stream = stream;
            this.reopen = reopen;
        }

        @Override
        public void close() {
            try {
                stream.close();
            } catch (final IOException ex) {
                log.warn("Error sluiten stream", ex);
            }
            stream = null;
            if (reopen != null)
                mach.trailEntry(reopen);
            reopen = null;
        }

        public T getStream() {
            return stream;
        }

    }

    public class StreamGroup extends Stream<Reader> {

        private Lexer lex;

        StreamGroup(Reader in, UnTrailOperation reopen, RunningPrologMachine mach) {
            super(in, reopen);
            try {
                lex = new Lexer(in, mach);
            } catch (final Exception ex) {
                log.fatal("could not create lexer", ex);
            }
        }

        @Override
        public void close() {
            lex = null;
            super.close();
        }

        public Lexer getLexer() {
            return lex;
        }

    }

}
