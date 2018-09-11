package com.googlecode.prolog_cafe.lang;

import static com.googlecode.prolog_cafe.lang.PredicateEncoder.encode;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import com.googlecode.prolog_cafe.exceptions.ExistenceException;
import com.googlecode.prolog_cafe.exceptions.PrologException;

/**
 * Prolog class loader.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PrologClassLoader extends ClassLoader {

	private final static Logger logger = Logger.getLogger(PrologClassLoader.class.getName());

	private final ConcurrentHashMap<Key, Constructor<? extends Predicate>> predicateCache =
			new ConcurrentHashMap<>();

	private static class NotFoundPredicate extends Predicate {

		public NotFoundPredicate(Operation cont) {
		}

		@Override
		public Operation exec(Prolog engine) throws PrologException {
			return null;
		}
	}

	private static Constructor<? extends Predicate> initNotFound() {
		try {
			return NotFoundPredicate.class.getConstructor(Operation.class);
		} catch (NoSuchMethodException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	private final static Constructor<? extends Predicate> NOT_FOUND = initNotFound();


	/**
	 * Initialize using the {@link ClassLoader#getSystemClassLoader()}.
	 */
	public PrologClassLoader() {
	}

	/**
	 * Initialize using a specific parent ClassLoader.
	 *
	 * @param parent source for all predicates in this context.
	 */
	public PrologClassLoader(ClassLoader parent) {
		super(parent);
	}

	/**
	 * Check whether the predicate class for the given arguments is defined.
	 *
	 * @param pkg     package name
	 * @param functor predicate name
	 * @param arity   predicate arity
	 * @return <code>true</code> if the predicate <code>pkg:functor/arity</code>
	 * is defined, otherwise <code>false</code>.
	 */
	public boolean definedPredicate(String pkg, String functor, int arity) {
		try {
			return findPredicate(pkg, functor, arity) != NOT_FOUND;
		} catch (ClassNotFoundException cnfe) {
			return false;
		}
	}

	/**
	 * Allocate a predicate and configure it with the specified arguments.
	 *
	 * @param pkg     package the predicate is in.
	 * @param functor name of the predicate.
	 * @param args    arguments to pass. The arity is derived from the arguments.
	 * @return the predicate encapsulating the logic and the arguments.
	 */
	public Predicate predicate(String pkg, String functor, Term... args) {
		return predicate(pkg, functor, Success.SUCCESS, args);
	}

	/**
	 * Allocate a predicate and configure it with the specified arguments.
	 *
	 * @param pkg     package the predicate is in.
	 * @param functor name of the predicate.
	 * @param cont    operation to execute if the predicate is successful. Usually
	 *                this is {@link Success#SUCCESS}.
	 * @param args    arguments to pass. The arity is derived from the arguments.
	 * @return the predicate encapsulating the logic and the arguments.
	 */
	public Predicate predicate(String pkg, String functor, Operation cont, Term... args) {
		int arity = args.length;
		try {
			Constructor<? extends Predicate> constructor = findPredicate(pkg, functor, arity);
			if (constructor != NOT_FOUND) {
				Object[] a = new Object[arity + 1];
				System.arraycopy(args, 0, a, 0, arity);
				a[arity] = cont;
				return constructor.newInstance(a);
			}
		} catch (Exception cause) {
			ExistenceException err2 = new ExistenceException(
					"procedure",
					term(pkg, functor, arity),
					cause.toString());
			err2.initCause(cause);
			throw err2;
		}
		throw new ExistenceException("procedure", term(pkg, functor, arity), "NOT_FOUND");
	}

	private static StructureTerm term(String pkg, String functor, int arity) {
		return new StructureTerm(":",
				SymbolTerm.create(pkg),
				new StructureTerm("/",
						SymbolTerm.create(functor),
						new IntegerTerm(arity)));
	}

	private Constructor<? extends Predicate> getConstructor(String pkg, String functor, int arity) throws ClassNotFoundException {
//		logger.info(pkg+":"+functor+"/"+arity);
		Class<?> clazz = Class.forName(encode(pkg, functor, arity), true, this);
		if (!Predicate.class.isAssignableFrom(clazz)) {
			throw new ClassNotFoundException(clazz.getName(),
					new ClassCastException("Does not extend " + Predicate.class));
		}
		Class[] params = new Class[arity + 1];
		Arrays.fill(params, 0, arity, Term.class);
		params[arity] = Operation.class;

		try {
			final Constructor<? extends Predicate> constructor = (Constructor<? extends Predicate>) clazz.getConstructor(params);
			constructor.setAccessible(true);
			return constructor;
		} catch (NoSuchMethodException e) {
			throw new ClassNotFoundException("Wrong constructor on " + clazz.getName(), e);
		}
	}


//	private Constructor<? extends Predicate> getConstructor(String pkg, String functor, int arity) throws ClassNotFoundException {
//		Class<?> clazz = Class.forName(
//				encode(pkg, functor, arity),
//				false /* avoid resolve */,
//				this);
//
//		if (!Predicate.class.isAssignableFrom(clazz)) {
//			throw new ClassNotFoundException(clazz.getName(),
//					new ClassCastException("Does not extend " + Predicate.class));
//		}
//
//		Class[] params = new Class[arity + 1];
//		Arrays.fill(params, 0, arity, Term.class);
//		params[arity] = Operation.class;
//
//		Constructor<? extends Predicate> cons;
//		try {
//			cons = (Constructor<? extends Predicate>) clazz.getDeclaredConstructor(params);
//		} catch (NoSuchMethodException e) {
//			throw new ClassNotFoundException("Wrong constructor on " + clazz.getName(), e);
//
//		} catch (SecurityException e) {
//			throw new ClassNotFoundException("Constructor not visible " + clazz.getName(), e);
//		}
//		cons.setAccessible(true);
//
//		try {
//			Class.forName(clazz.getName(), true /* resolve now */, this);
//		} catch (ClassNotFoundException e) {
//			throw new ClassNotFoundException("Cannot initialize " + clazz.getName(), e);
//
//		} catch (RuntimeException e) {
//			throw new ClassNotFoundException("Cannot initialize " + clazz.getName(), e);
//
//		} catch (LinkageError e) {
//			throw new ClassNotFoundException("Cannot initialize " + clazz.getName(), e);
//		}
//		return cons;
//	}

	private Constructor<? extends Predicate> findPredicate(String pkg, String functor, int arity) throws ClassNotFoundException {
		final Key key = new Key(pkg, functor, arity);
		Constructor<? extends Predicate> constructor = predicateCache.get(key);
		if (constructor==null){
			try {
				constructor = getConstructor(pkg, functor, arity);
				predicateCache.put(key, constructor);
			} catch (ClassNotFoundException e) {
				predicateCache.put(key, NOT_FOUND);
				throw e;
			}
		}
		return constructor;
	}

	private static final class Key {
		private final String pkg;
		private final String functor;
		private final int arity;

		Key(String pkg, String functor, int arity) {
			this.pkg = pkg;
			this.functor = functor;
			this.arity = arity;
		}

		@Override
		public int hashCode() {
			int h = pkg.hashCode();
			h = (h * 31) + functor.hashCode();
			h = (h * 31) + arity;
			return h;
		}

		@Override
		public boolean equals(Object other) {
			if (other instanceof Key) {
				Key b = (Key) other;
				return arity == b.arity && pkg.equals(b.pkg) && functor.equals(b.functor);
			}
			return false;
		}
	}
}
