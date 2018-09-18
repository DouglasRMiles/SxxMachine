#ifndef ALIASTERM
#define ALIASTERM

#include "Term.h"
#include "Comparable.h"
#include <string>
#include <vector>
#include <any>
#include <typeinfo>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }
namespace SxxMachine { class Trail; }
namespace SxxMachine { class ListTerm; }
namespace SxxMachine { class SymbolTerm; }

namespace SxxMachine
{


	/**
	 * The superclass of classes for term structures. The subclasses of
	 * <code>Term</code> must override the <code>unify</code> method.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class AliasTerm : public Term, public Comparable<Term*>
	{

  private:
	  Term* value;
  public:
	  virtual ~AliasTerm()
	  {
		  delete value;
	  }

  protected:
	  virtual bool useAlias();


	  /**
	   * 
	   * @return value //true if this term is immutable, i.e. can not be changed
	   */
  public:
	  bool isImmutable() override;

	  /**
	   * @return the value
	   */
	  Term* getValue() override;

	  /**
	   * @param value the value to set
	   */
	  virtual void setValue(Term* value);

	  /** One of the {@code TYPE_*} constants from {@code Term}. */
	  int type() override;

	  int termHashCodeImpl() override;

	  bool equalsTerm(Term* obj, Comparator* comparator) override;


	  bool unifyImpl(Term* t, Trail* trail) override;

	  int compareTo(Term* o) override;

	  /**
	   * Adds a string representation of this term to given StringBuilder instance.
	   */
	  void toStringImpl(const int& printFlags, StringBuilder* sb) = 0 override;

	  /** @return value //the name of this Term, if {@link #isStructure()}. */
	  std::string name() override;

	  /**
	   * Check whether this term is a logical variable.
	   * 
	   * @return value //<code>true</code> if <code>this .isVariable()</code>,
	   *         otherwise <code>false</code>.
	   * @see VariableTerm
	   */
	  bool isVar() override;

	  /**
	   * Check whether this term is an integer.
	   * 
	   * @return value //<code>true</code> if <code>this .isInteger()</code>,
	   *         otherwise <code>false</code>.
	   * @see IntegerTerm
	   */
	  bool isInteger() override;

	  /**
	   * Check whether this term is a float.
	   * 
	   * @return value //<code>true</code> if <code>this .isDouble()</code>,
	   *         otherwise <code>false</code>.
	   * @see DoubleTerm
	   */
	  bool isDouble() override;

	  /**
	   * Check whether this term is a long.
	   * 
	   * @return value //<code>true</code> if <code>this .isLong()</code>, otherwise
	   *         <code>false</code>.
	   * @see LongTerm
	   */
	  bool isLong() override;

	  /**
	   * Check whether this term is a number.
	   * 
	   * @return value //<code>true</code> if
	   *         <code>this .isInteger() || this .isDouble()</code>, otherwise
	   *         <code>false</code>.
	   * @see IntegerTerm
	   * @see DoubleTerm
	   */
	  bool isNumber() override;

	  bool isAtomicValue() override;

	  /**
	   * Check whether this term is an atom.
	   * 
	   * @return value //<code>true</code> if <code>this .isSymbol()</code>,
	   *         otherwise <code>false</code>.
	   * @see SymbolTerm
	   */
	  bool isSymbol() override;

	  /** Check whether this term is an empty list. */
	  bool isNil() override;

	  /**
	   * Check whether this term is a list structure.
	   * 
	   * @return value //<code>true</code> if <code>this .isList()</code>, otherwise
	   *         <code>false</code>. []/0 == false;
	   * @see ListTerm
	   */
	  bool isCons() override;

	  /**
	   * Check whether this term is a compound term.
	   * 
	   * @return value //<code>true</code> if <code>this .isStructure()</code>,
	   *         otherwise <code>false</code>.
	   * @see StructureTerm
	   */
	  bool isStructure() override;

	  /**
	   * Check whether this term is a java term.
	   * 
	   * @return value //<code>true</code> if <code>this .isJavaObject()</code>,
	   *         otherwise <code>false</code>.
	   * @see FFIObjectTerm
	   */
	  bool isFFIObject() override;

	  /**
	   * Check whether this term is a closure term.
	   * 
	   * @return value //<code>true</code> if <code>this .isClosure()</code>,
	   *         otherwise <code>false</code>.
	   * @see ClosureTerm
	   */
	  bool isClosure() override;


	  /** @return value //the arity of this Term, if {@link #isStructure()}. */
	  int arity() override;

	  std::vector<Term*> args() override;

	  /**
	   * @return value //get the nth argument of {@link #isStructure()} or
	   *         {@link #isCons()}.
	   */
	  Term* arg0(const int& nth) override;

	  Term* car() override;

	  Term* cdr() override;


	  int length() override;

	  ListTerm* add(Term* t) override;

	  ListTerm* append(Term* t) override;


	  bool convertible(std::type_info type) override;

	  /** Returns a copy of this object. */
  protected:
	  Term* copyImpl(IdentityHashMap<std::any, Term*>* copyHash, const int& deeply) override;

	  /** Returns the dereference value of this term. */
  public:
	  Term* dref() override;

	  /**
	   * Check whether this term is a ground term.
	   * 
	   * @return value //<code>true</code> if ground, otherwise <code>false</code>.
	   */
	  bool isGround() override;

	  /**
	   * Returns a Java object that corresponds to this term if defined in
	   * <em>Prolog Cafe interoperability with Java</em>. Otherwise, returns
	   * <code>this</code>.
	   * 
	   * @return value //a Java object if defined in <em>Prolog Cafe
	   *         interoperability with Java</em>, otherwise <code>this</code>.
	   */
	  std::any toJava() override;

	  bool equals(std::any obj) override;

	  bool isVariable() override;

	  bool isNonvar() override;

	  bool bind(Term* partial_RenamedTODO, Trail* trail) override;

	  bool equalsIdentical(Term* t) override;

	  Term* findOrAttrValue(Trail* trail, const bool& createIfMissing, Term* name) override;

	  Term* freeze(Trail* trail, Term* newval) override;

	  Term* frozenGoals() override;

	  bool isAttvar() override;

	  bool isFrozen() override;

	  bool IsList() override;

	  bool IsNil() override;

	  long long longValue() override;

	  void putAttrValue(Trail* trail, Term* name, Term* val) override;

	  void setarg0(Trail* trail, const int& i0, Term* value) override;

	  void setAttrs(Trail* trail, Term* newval) override;

	  void setGoals(Trail* trail, Term* newval) override;

	  bool isFVar() override;

	  int intValue() override;

	  bool unifyInt(const int& i, Trail* trail) override;

	  SymbolTerm* asSymbolTerm() override;
	  bool isAlias() override;
	};

}


#endif	//#ifndef ALIASTERM
