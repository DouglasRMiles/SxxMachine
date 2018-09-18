#ifndef PROLOGCLASSLOADER
#define PROLOGCLASSLOADER

#include "Operation.h"
#include "ClassLoader.h"
#include <string>
#include <unordered_map>
#include <vector>
#include <stdexcept>
#include <any>
#include "exceptionhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Key; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class PrologException; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class StructureTerm; }
class ClassNotFoundException;

namespace SxxMachine
{


	/**
	 * Prolog class loader.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.1
	 */
	class PrologClassLoader : public ClassLoader
	{

	  private:
		  class StaticConstructor
		  {
		  public:
			  StaticConstructor();
		  };

	  private:
		  static PrologClassLoader::StaticConstructor staticConstructor;

	  // private final static Logger logger =
	  // Logger.getLogger(PrologClassLoader.class.getName());
	  const std::unordered_map<Key*, Operation> predicateCache = new ConcurrentHashMap<Key*, Operation>();

  private:
	  class NotFoundPredicate : public Operation
	  {
	public:
		NotFoundPredicate();

		Operation exec(Prolog* engine) throw(PrologException) override;
	  };


  private:
	  static const Operation NOT_FOUND;

	  /**
	   * Initialize using the {@link ClassLoader#getSystemClassLoader()}.
	   */
  public:
	  PrologClassLoader();

	  /**
	   * Initialize using a specific parent ClassLoader.
	   *
	   * @param parent source for all predicates in this context.
	   */
	  PrologClassLoader(ClassLoader* parent);

	  /**
	   * Check whether the predicate class for the given arguments is defined.
	   *
	   * @param pkg package name
	   * @param functor predicate name
	   * @param arity predicate arity
	   * @return <code>true</code> if the predicate <code>pkg:functor/arity</code>
	   *         is defined, otherwise <code>false</code>.
	   */
	  virtual bool definedPredicate(const std::string& pkg, const std::string& functor, const int& arity);

	  /**
	   * Allocate a predicate and configure it with the specified arguments.
	   *
	   * @param pkg package the predicate is in.
	   * @param functor name of the predicate.
	   * @param args arguments to pass. The arity is derived from the arguments.
	   * @return the predicate encapsulating the logic and the arguments.
	   */
	  virtual Operation predicate(const std::string& pkg, const std::string& functor, std::vector<Term> &args);

	  /**
	   * Allocate a predicate and configure it with the specified arguments.
	   *
	   * @param pkg package the predicate is in.
	   * @param functor name of the predicate.
	   * @param cont operation to execute if the predicate is successful. Usually
	   *        this is {@link Success#SUCCESS}.
	   * @param args arguments to pass. The arity is derived from the arguments.
	   * @return the predicate encapsulating the logic and the arguments.
	   */
	  virtual Operation predicate(const std::string& pkg, const std::string& functor, Operation cont, std::vector<Term> &args);

  private:
	  static StructureTerm* term(const std::string& pkg, const std::string& functor, const int& arity);


	  // private Operation getConstructor(String pkg, String functor, int arity)
	  // throws ClassNotFoundException {
	  // Class<?> clazz = Class.forName(
	  // encode(pkg, functor, arity),
	  // false /* avoid resolve */,
	  // this);
	  //
	  // if (!Predicate.class.isAssignableFrom(clazz)) {
	  // throw new ClassNotFoundException(clazz.getName(),
	  // new ClassCastException("Does not extend " + Predicate.class));
	  // }
	  //
	  // Class[] params = new Class[arity + 1];
	  // Arrays.fill(params, 0, arity, Term.class);
	  // params[arity] = Operation.class;
	  //
	  // Constructor<? extends Predicate> cons;
	  // try {
	  // cons = (Constructor<? extends Predicate>)
	  // clazz.getDeclaredConstructor(params);
	  // } catch (NoSuchMethodException e) {
	  // throw new ClassNotFoundException("Wrong constructor on " + clazz.getName(),
	  // e);
	  //
	  // } catch (SecurityException e) {
	  // throw new ClassNotFoundException("Constructor not visible " +
	  // clazz.getName(), e);
	  // }
	  // cons.setAccessible(true);
	  //
	  // try {
	  // Class.forName(clazz.getName(), true /* resolve now */, this);
	  // } catch (ClassNotFoundException e) {
	  // throw new ClassNotFoundException("Cannot initialize " + clazz.getName(),
	  // e);
	  //
	  // } catch (RuntimeException e) {
	  // throw new ClassNotFoundException("Cannot initialize " + clazz.getName(),
	  // e);
	  //
	  // } catch (LinkageError e) {
	  // throw new ClassNotFoundException("Cannot initialize " + clazz.getName(),
	  // e);
	  // }
	  // return cons;
	  // }
	  Operation findPredicate(const std::string& pkg, const std::string& functor, const int& arity) throw(ClassNotFoundException);

	  Operation getConstructor(const std::string& pkg, const std::string& functor, const int& arity);

  public:
	  class Key final
	  {
	private:
		const std::string pkg;
		const std::string functor;
		const int arity;

	public:
		Key(const std::string& pkg, const std::string& functor, const int& arity);

		int hashCode() override;

		bool equals(std::any other) override;
	  };
	};

}


#endif	//#ifndef PROLOGCLASSLOADER
