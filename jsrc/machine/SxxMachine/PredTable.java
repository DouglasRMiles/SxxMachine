package SxxMachine;

import SxxMachine.exceptions.*;


import java.util.HashMap;
import java.util.Map;

public class PredTable {


  public static Map<String, Operation> predicateCache =
      new HashMap<String, Operation>();

  public static void registerPredicate(String pkg, String functor, int arity,
      Operation cont) {
    storePred(cont, keyString(null, functor, arity));
    storePred(cont, keyString(pkg, functor, arity));
  }

  private static void storePred(Operation cont, String key) {
    Operation op = predicateCache.get(key);
    if (op == null) {
      predicateCache.put(key, cont);
    }
  }

  public static void registerWMangle(String pkg, String functor, String mangle,
      int arity, Operation cont) {
    registerPredicate(pkg, functor, arity, cont);
    registerPredicate(pkg, mangle, arity, cont);
  }

  private static String keyString(String pkg, String functor, int arity) {
    if (pkg == null || "system".equals(pkg) || Prolog.BUILTIN.equals(pkg))
      return "PRED_" + functor + "_" + arity;
    return pkg + "::PRED_" + functor + "_" + arity;
  }


  public static Operation findPredicateOp(String pkg, String functor,
      int arity) {
    String key = keyString(pkg, functor, arity);
    Operation op = predicateCache.get(key);
    return op;
  }

  public static void registerBuiltin(String functor, int arity,
      Operation cont) {
    registerPredicate("system", functor, arity, cont);

  }
    public static void registerBuiltin(String functor, String mangle,
        int arity, Operation cont) {
      registerBuiltin(functor, arity, cont);
      registerBuiltin( mangle, arity, cont);
    }

}
