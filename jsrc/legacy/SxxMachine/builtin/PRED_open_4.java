package SxxMachine.builtin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import SxxMachine.FFIObjectTerm;
import SxxMachine.LineNumberPushbackReader;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.Undoable;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.ExistenceException;
import SxxMachine.exceptions.IllegalDomainException;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.InternalException;
import SxxMachine.exceptions.JavaException;
import SxxMachine.exceptions.PInstantiationException;
import SxxMachine.exceptions.PermissionException;

/**
 * <code>open/4</code><br>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PRED_open_4 extends Predicate.P4 {
	private static final SymbolTerm SYM_TEXT = SymbolTerm.intern("text");
	private static final SymbolTerm SYM_READ = SymbolTerm.intern("read");
	private static final SymbolTerm SYM_WRITE = SymbolTerm.intern("write");
	private static final SymbolTerm SYM_APPEND = SymbolTerm.intern("append");
	private static final SymbolTerm SYM_INPUT = SymbolTerm.intern("input");
	private static final SymbolTerm SYM_OUTPUT = SymbolTerm.intern("output");
	private static final SymbolTerm SYM_ALIAS_1 = SymbolTerm.intern("alias", 1);
	private static final SymbolTerm SYM_MODE_1 = SymbolTerm.intern("mode", 1);
	private static final SymbolTerm SYM_TYPE_1 = SymbolTerm.intern("type", 1);
	private static final SymbolTerm SYM_FILE_NAME_1 = SymbolTerm.intern("file_name", 1);
	private static final SymbolTerm SYM_CHARSET = SymbolTerm.intern("charset", 1);
	private static final SymbolTerm SYM_AUTOCLOSE = SymbolTerm.intern("autoclose", 1);

	public PRED_open_4(Term a1, Term a2, Term a3, Term a4, Operation cont) {
		LARG[0] = a1;
		LARG[1] = a2;
		LARG[2] = a3;
		LARG[3] = a4;
		this.cont = cont;
	}

	public Operation exec(Prolog engine) {
		engine.requireFeature(Prolog.Feature.IO, this, LARG[0]);
		engine.setB0();
		File file = null;
		String resourceName = null;
		Term alias = null;
		Term opts = Prolog.Nil;
		FFIObjectTerm streamObject;
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];

		// stream
		a3 = a3.dref();
		if (!(a3 instanceof VariableTerm))
			throw new IllegalTypeException(this, 3, "variable", a3);
		// source_sink
		a1 = a1.dref();
		if ((a1 instanceof VariableTerm))
			throw new PInstantiationException(this, 1);
		if ((a1 instanceof SymbolTerm)){
			file = new File(a1.asSymbolTerm().name());
		} else if ((a1 instanceof StructureTerm) && ":".equals(a1.name()) && 2==a1.arity()){
			Term pkg = a1.arg0(0).dref();
			Term name = a1.arg0(1).dref();
			if (!(pkg instanceof SymbolTerm) || !(name instanceof SymbolTerm)){
				throw new IllegalDomainException(this, 1, "source_sink", a1);
			}
			resourceName = '/' + pkg.name().replace('.', '/') + '/' + name.name();
		} else {
			throw new IllegalDomainException(this, 1, "source_sink", a1);
		}
		// io_mode
		a2 = a2.dref();
		if ((a2 instanceof VariableTerm))
			throw new PInstantiationException(this, 2);
		if (!(a2 instanceof SymbolTerm))
			throw new IllegalTypeException(this, 2, "atom", a2);
		if (resourceName!=null && !a2.equals(SYM_READ)){ // writing to resources is prohibited
			throw new PermissionException(this, "open", "source_sink", a1, "");
		}

		Map<SymbolTerm, Term> options = processOptions(a4.dref());
		Charset charset = Charset.defaultCharset();
		if (options.containsKey(SYM_CHARSET)){
			Term charsetOption = options.get(SYM_CHARSET);
			if (charsetOption.arity()!=1 || !(charsetOption.arg0(0) instanceof SymbolTerm)){
				throw new IllegalDomainException(this, 4, "stream_option", charsetOption);
			}
			String charsetName = charsetOption.arg0(0).dref().name();
			charset = Charset.forName(charsetName);
		}
		try {
			if (a2.equals(SYM_READ)) {
				InputStream inputStream = null;
				if (resourceName!=null){
					inputStream = PRED_open_4.class.getResourceAsStream(resourceName);
				} else if (file.exists()) {
					inputStream = new FileInputStream(file);
				}
				if (inputStream==null) {
					throw new ExistenceException(this, 1, "source_sink", a1, "");
				}
				PushbackReader in = new LineNumberPushbackReader(new BufferedReader(
						new InputStreamReader(inputStream, charset)), Prolog.PUSHBACK_SIZE);
				streamObject = new FFIObjectTerm(in);
				opts = TermData.CONS(SYM_INPUT, opts);
			} else if (a2.equals(SYM_WRITE)) {
				File parentFile = file.getParentFile();
				if (parentFile!=null) {
					parentFile.mkdirs();
				}
				PrintWriter out = new PrintWriter(new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream(file, false),charset)));
				streamObject = new FFIObjectTerm(out);
				opts = TermData.CONS(SYM_OUTPUT, opts);
			} else if (a2.equals(SYM_APPEND)) {
				File parentFile = file.getParentFile();
				if (parentFile!=null) {
					parentFile.mkdirs();
				}
				PrintWriter out = new PrintWriter(new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream(file, true),charset)));
				streamObject = new FFIObjectTerm(out);
				opts = TermData.CONS(SYM_OUTPUT, opts);
			} else {
				throw new IllegalDomainException(this, 2, "io_mode", a2);
			}
		} catch (IOException e) {
			throw new PermissionException(this, "open", "source_sink", a1, "");
		}
		if (engine.getStreamManager().containsKey(streamObject))
			throw new InternalException("stream object is duplicated");
		// stream_options
		if (options.containsKey(SYM_ALIAS_1)){
			Term aliasOption = options.get(SYM_ALIAS_1);
			if (aliasOption.arity()!=1 || !(aliasOption.arg0(0) instanceof SymbolTerm)){
				throw new IllegalDomainException(this, 4, "stream_option", aliasOption);
			}
			alias = aliasOption.arg0(0).dref();
			if (engine.getStreamManager().containsKey(alias))
				throw new PermissionException(this, "open", "source_sink", aliasOption, "");
		}


		opts = TermData.CONS(new StructureTerm(SYM_TYPE_1, SYM_TEXT), opts);
		opts = TermData.CONS(new StructureTerm(SYM_MODE_1, a2), opts);
		opts = TermData.CONS(new StructureTerm(SYM_FILE_NAME_1, file==null?a1:SymbolTerm.create(file.getAbsolutePath())), opts);
		if (alias != null) {
			engine.getStreamManager().put(alias, streamObject);
			opts = TermData.CONS(new StructureTerm(SYM_ALIAS_1, alias), opts);
		}
		a3.asVariableTerm().bind(streamObject, engine.trail);
		engine.getStreamManager().put(streamObject, opts);

		if (options.containsKey(SYM_AUTOCLOSE)) {
			Term autoCloseOption = options.get(SYM_AUTOCLOSE);
			if (autoCloseOption.arity()!=1 || !(autoCloseOption.arg0(0) instanceof SymbolTerm) ){
				throw new IllegalDomainException(this, 4, "stream_option", autoCloseOption);
			}
			if ("true".equals(autoCloseOption.arg0(0).name())){
				engine.trail.push(new CloseHelper(engine, streamObject, alias));
			}
		}
		return cont;
	}

	private Map<SymbolTerm, Term> processOptions(Term options) {
		Map<SymbolTerm, Term> result = new HashMap<SymbolTerm, Term>();
		Term p = options;
		while (!p.isNil()) {
			// type check
			if ((p instanceof VariableTerm))
				throw new PInstantiationException(this, 4);
			if (!(p instanceof ListTerm))
				throw new IllegalTypeException(this, 4, "list", options);

			Term option = p.asListTerm().car().dref();
			if ((option instanceof VariableTerm))
				throw new PInstantiationException(this, 4);
			if ((option instanceof StructureTerm)) {
				Term functor = ( option).functor();
				result.put((SymbolTerm) functor, option);
			} else {
				throw new IllegalDomainException(this, 4, "stream_option", option);
			}
			p = p.asListTerm().cdr().dref();
		}
		return result;
	}

	private static class CloseHelper implements Undoable {

		private final Prolog engine;
		private final FFIObjectTerm streamObject;
		private final Term alias;

		public CloseHelper(Prolog engine, FFIObjectTerm streamObject, Term alias) {
			this.engine = engine;
			this.streamObject = streamObject;
			this.alias = alias;
		}


		@Override
		public void undo() {
			engine.getStreamManager().remove(streamObject);
			if (alias!=null){
				engine.getStreamManager().remove(alias);
			}
			Closeable closeable = (Closeable) streamObject.object();
			try {
				closeable.close();
			} catch(IOException e){
				throw new JavaException(e);
			}
		}

	}

}
