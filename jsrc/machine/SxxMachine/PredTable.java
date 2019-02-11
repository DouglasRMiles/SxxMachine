package SxxMachine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PredTable {

	public static Map<String, Operation> predicateCache = new HashMap<String, Operation>();
	public static Map<String, Operation> hiddenCache = new HashMap<String, Operation>();
	public static Map<String, Operation> initsCache = new HashMap<String, Operation>();

	public static void registerPredicate(String pkg, String functor, int arity, Operation cont) {
		registerPredicate(pkg, functor, arity, cont, false);
	}

	public static void registerPredicate(String pkg, String functor, int arity, Operation cont, boolean forced) {
		if (!storePred(keyString(pkg, functor, arity), cont, forced)) {
		}
		if (!storePred(keyString(null, functor, arity), cont, false)) {
		}
	}

	public static boolean storePred(String key, Operation cont, boolean forced) {
		Operation op = predicateCache.get(key);
		if (op == null) {
			predicateCache.put(key, cont);
			return true;
		} else if (op == cont) {
			return true;
		}
		String oldmodule = moduleFromClass(op);
		if (cont == null) {

			if (forced) {
				System.err.println("Deleting " + key + " which is implemented at " + oldmodule);
				predicateCache.remove(key);
				return true;
			} else {
				System.err.println("Not deleting " + key + " which is implemented at " + oldmodule);
				return false;
			}
		}
		String newmodule = moduleFromClass(cont);
		{
			if (op.getClass() != op.getClass()) {
				if (!forced) {
					System.err.println(
							"Not overriding " + key + " which is implemented at " + oldmodule + " with " + newmodule);
					hiddenCache.put(key, cont);
					return false;
				} else {
				}
			}
			hiddenCache.put(key, op);
			predicateCache.put(key, cont);
			System.err.println("Overriding " + key + " which is implemented at " + oldmodule + " with " + newmodule);
			return true;
		}
	}

	public static void registerWMangle(String pkg, String functor, String mangle, int arity, Operation cont) {
		registerPredicate(pkg, functor, arity, cont);
		registerPredicate(pkg, mangle, arity, cont);
	}

	private static String keyString(String pkg, String functor, int arity) {
		if (pkg == null || isGlobal(pkg))
			return PredFA(functor, arity);
		return pkg + "::" + PredFA(functor, arity);
	}

	/**
	 * @param functor
	 * @param arity
	 * @return
	 */
	private static String PredFA(String functor, int arity) {
		return "PRED_" + functor + "_" + arity;
	}

	/**
	 * @param pkg
	 * @return
	 */
	public static boolean isGlobal(String pkg) {
		return pkg != null && ("system".equals(pkg) || Prolog.BUILTIN.equals(pkg));
		// || "swi_supp".equals(pkg) ||
	}

	public static boolean isLocal(String pkg) {
		return pkg == null;
	}

	public static Operation findPredicateOp(String pkg, String functor, int arity) {
		String key = keyString(pkg, functor, arity);
		Operation op = predicateCache.get(key);
		return op;
	}

	public static void registerBuiltin(String functor, int arity, Operation cont) {
		String module = moduleFromClass(cont);
		if (arity == 0 && isEntryPoint(functor)) {
			registerFileEntryPoint(module, functor, arity, cont);
		} else {
			registerPredicate("system", functor, arity, cont);
			registerPredicate(module, functor, arity, cont, true);
		}
	}

	/**
	 * @param functor
	 * @return
	 */
	private static boolean isEntryPoint(String functor) {

		return functor != null
				&& (functor.equals("main") || functor.equals("go") || functor.equals("top") || functor.equals("$init"));
	}

	private static void registerFileEntryPoint(String module, String functor, int arity, Operation cont) {
		String key = keyString(module, functor, arity);
		if (!key.startsWith(module)) {
			key = module + "::" + key;
		}
		storePred(key, cont, false);
		if (!initsCache.containsValue(cont)) {
			System.err.println("File " + module + " entry point: " + key);
			initsCache.put(key, cont);
		}
		registerPredicate(module, functor, arity, cont);
	}

	private static String moduleFromClass(Operation op) {
		Class class1 = op.getClass();
		Class dc = class1.getDeclaringClass();
		if (dc != null) {
			class1 = dc;
		}
		String moduleName = "" + class1.getName();
		int idx = moduleName.indexOf("$$");
		if (idx > 0) {
			moduleName = moduleName.substring(0, idx);
		}
		idx = moduleName.indexOf("_");
		if (idx > 0) {
			moduleName = moduleName.substring(idx + 1);
		}

		return moduleName;
	}

	public static void registerBuiltin(String functor, String mangle, int arity, Operation cont) {
		registerBuiltin(functor, arity, cont);
		registerBuiltin(mangle, arity, cont);
	}

	public static void runInits(Prolog machine) {
		for (Iterator<Entry<String, Operation>> iterator = initsCache.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, Operation> entry = iterator.next();
			String name = entry.getKey();
			Operation oper = entry.getValue();
			int steps = 0;
			System.err.println("Running: " + name + " as " + oper);
			while (oper != null && oper != Success.SUCCESS) {
				System.err.print(".");
				System.err.flush();
				steps++;
				oper = oper.exec(machine);
			}
			System.err.println("\nDone " + steps);
			System.err.flush();
		}
		System.err.flush();
	}

}
