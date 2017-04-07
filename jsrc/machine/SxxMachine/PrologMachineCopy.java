package com.googlecode.prolog_cafe.lang;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Backup of a Prolog interpreter that can later create a new interpreter.
 * <p>
 * A new interpreter can be bootstrapped by passing this copy object to a
 * PrologControl constructor. Machine copies are primarily intended to let
 * callers reuse the state constructed by running {@code consult(+File)} prior
 * to perform any module initialization or predicate evaluation.
 * <p>
 * Only the PrologClassLoader, internal hash manager and database are copied.
 * These are sections of an interpreter that relate to what code is available.
 */
public class PrologMachineCopy {
  /**
   * Save the database of a current PrologControl.
   *
   * @param ctl control to copy the database of.
   * @return the copy.
   */
  public static PrologMachineCopy save(PrologControl ctl) {
    return new PrologMachineCopy(ctl.engine);
  }

  /**
   * Save the database of a current Prolog interpreter.
   *
   * @param engine interpreter to copy the database of.
   * @return the copy.
   */
  public static PrologMachineCopy save(Prolog engine) {
    return new PrologMachineCopy(engine);
  }

  protected final PrologClassLoader pcl;
  protected final HashtableOfTerm hashManager;
  protected final InternalDatabase internalDB;

  private PrologMachineCopy(Prolog engine) {
    pcl = engine.pcl;

    // During backup, copy all terms using a single consistent copyHash.
    // This isolates the copy from the source interpreter, in case it gets
    // modified again later.
    //
    // During restore terms are not copied.
//    try {
//      engine.copyHash.clear();
      IdentityHashMap<VariableTerm,VariableTerm> copyHash = new IdentityHashMap<VariableTerm, VariableTerm>(); 
      hashManager = copyDeep(engine.getHashManager(), copyHash);
      internalDB = new InternalDatabase(engine.internalDB, true, copyHash);
//    } finally {
//      engine.copyHash.clear();
//    }
  }

  private static HashtableOfTerm copyDeep(HashtableOfTerm src, IdentityHashMap<VariableTerm,VariableTerm> copyHash) {
    HashtableOfTerm hm = new HashtableOfTerm();
    for (Map.Entry<Term, Term> e : src.entrySet()) {
      Term val = e.getValue().copy(copyHash);

      if (val.isJavaObject()) {
        JavaObjectTerm o = (JavaObjectTerm) val;
        if (o.obj instanceof HashtableOfTerm) {
          val = new JavaObjectTerm(copyDeep((HashtableOfTerm) o.obj, copyHash));
        }
      }

      hm.put(e.getKey().copy(copyHash), val);
    }
    return hm;
  }

  static HashtableOfTerm copyShallow(HashtableOfTerm src) {
    HashtableOfTerm hm = new HashtableOfTerm();
    for (Map.Entry<Term, Term> e : src.entrySet()) {
      Term val = e.getValue();

      if (val.isJavaObject()) {
        JavaObjectTerm o = (JavaObjectTerm) val;
        if (o.obj instanceof HashtableOfTerm) {
          val = new JavaObjectTerm(copyShallow((HashtableOfTerm) o.obj));
        }
      }

      hm.put(e.getKey(), val);
    }
    return hm;
  }
}
