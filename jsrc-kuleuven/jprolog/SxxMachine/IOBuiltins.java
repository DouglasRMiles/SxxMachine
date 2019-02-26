
package SxxMachine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

class pred_useOutputStream_2 extends Code {

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term handle = local_aregs[0].dref();
        Term stream = local_aregs[1].dref();
        Term continuation = local_aregs[2];
        if (!(stream instanceof Const))
            return mach.Fail0;
        Object str = ((Const) stream).getValue();
        Writer out;
        if (str instanceof OutputStream) {
            out = new OutputStreamWriter((OutputStream) str);
        } else if (str instanceof Writer) {
            out = (Writer) str;
        } else
            return mach.Fail0;
        IOLayer layer = mach.getIOLayer();
        layer.openOutStream(out, handle, null);
        local_aregs[2] = local_aregs[1] = null;
        local_aregs[0] = continuation;
        return mach.Call1;
    }

}

class pred_useInputStream_2 extends Code {

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term handle = local_aregs[0].dref();
        Term stream = local_aregs[1].dref();
        Term continuation = local_aregs[2];
        if (!(stream instanceof Const))
            return mach.Fail0;
        Object str = ((Const) stream).getValue();
        Reader in;
        if (str instanceof InputStream) {
            in = new InputStreamReader((InputStream) str);
        } else if (str instanceof Reader) {
            in = (Reader) str;
        } else
            return mach.Fail0;
        IOLayer layer = mach.getIOLayer();
        layer.openInStream(in, handle, null);
        local_aregs[2] = local_aregs[1] = null;
        local_aregs[0] = continuation;
        return mach.Call1;
    }

}

class pred_tell_1 extends Code {

    private final class UndoTellOp implements UnTrailOperation {
        private final PrologMachine mach;
        private final String fileS;

        private UndoTellOp(PrologMachine mach, String fileS) {
            this.mach = mach;
            this.fileS = fileS;
        }

        @Override
        public void unTrailSelf() {
            //Terug open doen
            mach.getAreg()[0] = JpFactory.CONST(fileS);
            exec(mach);
        }
    }

    private final static Logger log = Logger.getLogger(pred_tell_1.class);

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(final PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term file = local_aregs[0].dref();
        Term continuation = local_aregs[1];
        local_aregs[1] = null;
        local_aregs[0] = null;
        IOLayer layer = mach.getIOLayer();
        if (!(file instanceof Const)) {
            log.debug("Kan dit niet openen: " + file + " - " + file.getClass());
            return mach.Fail0;
        }
        if (layer.isOpen(file)) {
            log.info("Reeds open: " + file);
            return mach.Fail0;
        }
        Writer out = null;
        final String fileS = file.toString();
        try {
            out = new BufferedWriter(new FileWriter(fileS));
            if (!layer.openOutStream(out, file, new UndoTellOp(mach, fileS))) {
                log.debug("Kon stream niet registreren!");
                out.close();
                return mach.Fail0;
            }
        } catch (IOException ex) {
            log.error("Error openen stream", ex);
            if (out != null)
                try {
                    out.close();
                } catch (IOException exClose) {
                }
            return mach.Fail0;
        }
        local_aregs[0] = continuation;
        return mach.Call1;
    }

}

class pred_told_0 extends Code {

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Code exec(PrologMachine mach) {
        IOLayer layer = mach.getIOLayer();
        if (!layer.getStreamHandlerOut().closeCurrentStream())
            return mach.Fail0;
        return mach.Call1;
    }

}

class pred_seen_0 extends Code {

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Code exec(PrologMachine mach) {
        IOLayer layer = mach.getIOLayer();
        if (!layer.getStreamHandlerIn().closeCurrentStream())
            return mach.Fail0;
        return mach.Call1;
    }

}

class pred_see_1 extends Code {

    private final static Logger log = Logger.getLogger(pred_see_1.class);

    @Override
    public int arity() {
        return 1;
    }

    private Code open(final PrologMachine mach, Term file) {
        Reader in = null;
        final String fName = file.toString();
        IOLayer layer = mach.getIOLayer();
        try {
            in = new BufferedReader(new FileReader(fName));
            if (!layer.openInStream(in, file, null)) { //TODO: Kunnen bestanden opnieuw opgen gedaan worden om te lezen?
                log.debug("Kon stream niet registreren!");
                in.close();
                return mach.Fail0;
            }
        } catch (IOException ex) {
            log.error("Error openen stream", ex);
            if (in != null)
                try {
                    in.close();
                } catch (IOException exClose) {
                }
            return mach.Fail0;
        }
        return null;
    }

    @Override
    public Code exec(final PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term file = local_aregs[0].dref();
        Term continuation = local_aregs[1];
        local_aregs[1] = null;
        local_aregs[0] = null;
        IOLayer layer = mach.getIOLayer();
        if (!(file instanceof Const)) {
            log.debug("Kan dit niet openen: " + file + " - " + file.getClass());
            return mach.Fail0;
        }
        if (layer.isOpen(file)) {
            log.info("Reeds open: " + file);
            return mach.Fail0;
        }
        Code r = open(mach, file);
        if (r != null)
            return r;
        local_aregs[0] = continuation;
        return mach.Call1;
    }

}
