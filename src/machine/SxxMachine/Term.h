#ifndef TERM
#define TERM

#include "KPTerm.h"
#include "Undoable.h"
#include "Comparable.h"
#include <string>
#include <vector>
#include <iostream>
#include <stdexcept>
#include <any>
#include <typeinfo>
#include "exceptionhelper.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Trail; }
namespace SxxMachine { class ListTerm; }
namespace SxxMachine { class PrologException; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class FrozenData; }
namespace SxxMachine { class MapTerm; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class LongTerm; }
namespace SxxMachine { class ClosureTerm; }
namespace SxxMachine { class VariableTerm; }
namespace SxxMachine { class HashtableOfTerm; }
namespace SxxMachine { class NumberTerm; }
class StringBuilder;

namespace SxxMachine
{


	/**
	 * The superclass of classes for term structures.
	 * The subclasses of <code>Term</code> must override
	 * the <code>unify</code> method.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings({"unused","rawtypes"}) public abstract class Term extends KPTerm implements Comparable<Term>
	class Term : public KPTerm, public Comparable<Term*>
	{
		/** Holds an integer value <code>0</code>. */
	public:
		static constexpr int EQUAL = 0;
		/** Holds an integer value <code>1</code>. */
		static constexpr int AFTER = 1;
		/** Holds an integer value <code>-1</code>. */
		static constexpr int BEFORE = -1;

		static constexpr int JAVA = -4;
		static constexpr int FLOAT = -3;
		static constexpr int INT = -2;
		static constexpr int VAR = -1;
		static constexpr int CONST = 0;

		static constexpr int TYPE_CLOSURE = -6;
		static constexpr int TYPE_JAVA_OBJECT = -4;
		static constexpr int TYPE_DOUBLE = -3;
		static constexpr int TYPE_INTEGER = -2;
		static constexpr int TYPE_VARIABLE = -1;
		static constexpr int TYPE_SYMBOL = 0;
		static constexpr int TYPE_STRUCTURE = 1;
		static constexpr int TYPE_LIST = 2;


		static constexpr int COPY_ALL = 0;
		static constexpr int COPY_DEEPLY = 1;
		static constexpr int COPY_NO_ATTRS = 2;
		static constexpr int COPY_SAVE_ATTRS_COPY = 4;

		static constexpr Comparator* StrictEquals = nullptr;
		static constexpr Comparator* Unifiable = nullptr;
		static constexpr Comparator* Subsumes = nullptr;



		virtual ~Term()
		{
			delete fdata;
			delete zowner;
		}

	protected:
		virtual int containsTermImpl(Term* variableTerm, Comparator* comparison);
	  public:
		  int loopContainsTerm = 0;

		int containsTerm(Term* variableTerm, Comparator* comparison);

		/** One of the {@code TYPE_*} constants from {@code Term}. */
		virtual int type() = 0;
		int hashCode() override final;

	   int loopedHashCodeTerm = 0;
	   int termHashCode() final override;
		virtual int termHashCodeImpl() = 0;

		/** Holds a term to which this variable is bound. Initial value is <code>this</code> (self-reference). 
		 * Moved from VariableTerm here in order to force inlining of method {@link #drefAttrs()}*/
	   //  public Term val = this;
		/**
		 * Checks whether the argument term is unified with this one.
		 * @param t the term to be unified with.
		 * @param trail Trail Stack.
		 * @return <code>true</code> if succeeds, otherwise <code>false</code>.
		 */
		int loopedUnifyTerm = 0;
		bool unify(Term* t, Trail* trail);
		virtual bool unifyImpl(Term* t, Trail* trail) = 0;
		/** 
		 * 
		 * @return true if this term is immutable, i.e. can not be changed
		 */
		virtual bool isImmutable() = 0;
		/**
		 * Check whether this term is a logical variable.
		 * @return <code>true</code> if <code>this .isVariable()</code>,
		 * otherwise <code>false</code>.
		 * @see VariableTerm
		 */
		bool isVar() override;
		/**
		 * Check whether this term is an integer.
		 * @return <code>true</code> if <code>this .isInteger()</code>,
		 * otherwise <code>false</code>.
		 * @see IntegerTerm
		 */
		virtual bool isInteger();
		/**
		 * Check whether this term is a float.
		 * @return <code>true</code> if <code>this .isDouble()</code>,
		 * otherwise <code>false</code>.
		 * @see DoubleTerm
		 */
		virtual bool isDouble();
		/**
		 * Check whether this term is a long.
		 * @return <code>true</code> if <code>this .isLong()</code>,
		 * otherwise <code>false</code>.
		 * @see LongTerm
		 */
		bool isLong() override;
		/**
		 * Check whether this term is a number.
		 * @return <code>true</code> if <code>this .isInteger() || this .isDouble()</code>,
		 * otherwise <code>false</code>.
		 * @see IntegerTerm
		 * @see DoubleTerm
		 */
		bool isNumber() override;
		virtual bool isAtomicValue();
		/**
		 * Check whether this term is an atom.
		 * @return <code>true</code> if <code>this .isSymbol()</code>,
		 * otherwise <code>false</code>.
		 * @see SymbolTerm
		 */
		virtual bool isSymbol();
		/** Check whether this term is an empty list. */
		bool isNil() override;
		/**
		 * Check whether this term is a list structure.
		 * @return <code>true</code> if <code>this .isList()</code>,
		 * otherwise <code>false</code>.
		 * []/0 == false;
		 * @see ListTerm
		 */
		bool isCons() override;
		/**
		 * Check whether this term is a compound term.
		 * @return <code>true</code> if <code>this .isStructure()</code>,
		 * otherwise <code>false</code>.
		 * @see StructureTerm
		 */
		bool isStructure() override;
		/**
		 * Check whether this term is a java term.
		 * @return <code>true</code> if <code>this .isJavaObject()</code>,
		 * otherwise <code>false</code>.
		 * @see FFIObjectTerm
		 */
		virtual bool isFFIObject();
		/**
		 * Check whether this term is a closure term.
		 * @return <code>true</code> if <code>this .isClosure()</code>,
		 * otherwise <code>false</code>.
		 * @see ClosureTerm
		 */
		virtual bool isClosure();
		/** @return the name of this Term, if {@link #isStructure()}. */
		std::string name() = 0 override;
		/** @return the arity of this Term, if {@link #isStructure()}. */
		virtual int arity();
		virtual std::vector<Term*> args();
		virtual Term* arg0(const int& nth);
		/** @return get the nth argument of {@link #isStructure()} or {@link #isCons()}. */
		virtual Term* nth0(const int& nth);
		virtual Term* car();
		virtual Term* cdr();
		virtual int length();
		virtual ListTerm* add(Term* t);
		virtual ListTerm* append(Term* t);
		/**
		 * Check whether this object is convertible with the given Java class type.
		 * @param type the Java class type to compare with.
		 * @return <code>true</code> if this is convertible with
		 * <code>type</code>. Otherwise <code>false</code>.
		 * @see #convertible(Class, Class)
		 */

		virtual bool convertible(std::type_info type);
		/** Returns a copy of this object. 
		 * @param deeply TODO*/
	protected:
		virtual Term* copyImpl(IdentityHashMap<std::any, Term*>* copyHash, const int& deeply);
	public:
		int loopingCopyTerm = 0;
		Term* copy(IdentityHashMap<std::any, Term*>* copyHash, const int& deeply);
		void oopsy() override;

		/** Returns the dereference value of this term. */
		Term* dref() override;
		/**
		 * Check whether this term is a ground term.
		 * @return <code>true</code> if ground, otherwise <code>false</code>.
		 */
		virtual bool isGround();
		/**
		 * Returns a Java object that corresponds to this term
		 * if defined in <em>Prolog Cafe interoperability with Java</em>.
		 * Otherwise, returns <code>this</code>.
		 * @return a Java object if defined in <em>Prolog Cafe interoperability with Java</em>,
		 * otherwise <code>this</code>.
		 */
		virtual std::any toJava();
		/**
		 * Check whether there is a widening conversion from <code>from</code> to <code>to</code>.
		 */
	protected:
		static bool convertible(std::type_info from, std::type_info to);
		/** Checks whether a given object is an instance of Prolog term. */
	public:
		static bool instanceOfTerm(std::any obj0);
		/** 
		 * <p>Returns Iterator over terms that make up this term. 
		 * Should return empty iterator if this term is not compound, 
		 * i.e SymbolTerm, NumberTerm, etc.
		 * <p>The method is used in non-recursive implementation of {@link #toString()}
		 *  */
		virtual Iterator<Term*>* iterator(const bool& includeSyntax);

		/** Adds a string representation of this term to given StringBuilder instance. 
		 * @param printFlags && 1 = quoted*/
	  virtual std::string toQuotedString() throw(PrologException);
  protected:
	  int loopPrintingTerm = 0;
		/** Returns a string representation of this term. */
	public:
		std::string toString() override;

  protected:
	  void toStringImpl(const int& printFlags, StringBuilder* sb) = 0 override;

	  /** Returns a string representation of this term. */
  public:
	  void toQuotedString(const int& printFlags, StringBuilder* sb);

	  void toQuotedString_OLD(const int& printFlags, StringBuilder* sb);

	  /** Returns a unquoted string representation of this term. */
	  virtual std::string toAtomName() throw(PrologException);

		/**
		 * Iterator over all terms that make up this term. 
		 * Uses DFS to iterate over terms tree. 
		 */
	public:
		class TermTreeIterator : public Iterator<Term*>
		{
		private:
			Deque<Iterator<Term*>*>* const  stack = new ArrayDeque<Iterator<Term*>*>();
		public:
			bool includeSyntax = false;
			virtual ~TermTreeIterator()
			{
				delete stack;
			}

			TermTreeIterator(Term* start, const bool& includeSyntax);

			bool hasNext() override;
			Term* next() override;
		};

	public:
		bool equalsTerm(Term* head) override;
		virtual bool equalsTerm(Term* obj, Comparator* comparator) = 0;

		bool equals(std::any obj) override;
		virtual bool isVariable();
		virtual bool isNonvar();
		virtual bool bind(Term* partial_RenamedTODO, Trail* trail);
		virtual bool equalsIdentical(Term* t);


	public:
		class UndoAttributeReplacement final : public Undoable
		{
		private:
			Term* const  wasAttrs;
			Term* const  Termthis;

		public:
			virtual ~UndoAttributeReplacement()
			{
				delete wasAttrs;
				delete Termthis;
			}

			UndoAttributeReplacement(Term* thiz, Term* wasAttrs);

			void undo() override;
		};


 public:
	 virtual Term* drefAttrs();

	  virtual Term* ArgNoDeRef(const int& i);

		virtual Term* findOrAttrValue(Trail* trail, const bool& createIfMissing, Term* name);

	  virtual Term* freeze(Trail* trail, Term* newval);

	private:
		class UndoableAnonymousInnerClass : public Undoable
		{
		private:
			Term* outerInstance;

			SxxMachine::Term* prev;

		public:
			virtual ~UndoableAnonymousInnerClass()
			{
				delete prev;
			}

			UndoableAnonymousInnerClass(Term* outerInstance, SxxMachine::Term* prev);

			void undo() override;
		};

	public:
		virtual Term* frozenGoals();

		virtual bool isAttvar();

		virtual bool isFrozen();

		virtual bool IsList();

		virtual bool IsNil();

		virtual long long longValue();

		static Term* nullIs(Term* attrs2, Term* valeu);

		virtual void putAttrValue(Trail* trail, Term* name, Term* val);

	private:
		class UndoableAnonymousInnerClass2 : public Undoable
		{
		private:
			Term* outerInstance;

			SxxMachine::Term* wasAttrs;

		public:
			virtual ~UndoableAnonymousInnerClass2()
			{
				delete wasAttrs;
			}

			UndoableAnonymousInnerClass2(Term* outerInstance, SxxMachine::Term* wasAttrs);

			void undo() override;
		};
	public:
		virtual void setAttrs(Trail* trail, Term* newval);

  private:
	  class UndoableAnonymousInnerClass3 : public Undoable
	  {
	  private:
		  Term* outerInstance;

		  SxxMachine::Term* prev;

	  public:
		  virtual ~UndoableAnonymousInnerClass3()
		  {
			  delete prev;
		  }

		  UndoableAnonymousInnerClass3(Term* outerInstance, SxxMachine::Term* prev);

		  void undo() override;
	  };

  public:
	  virtual void setGoals(Trail* trail, Term* newval);

  private:
	  class UndoableAnonymousInnerClass4 : public Undoable
	  {
	  private:
		  Term* outerInstance;

		  SxxMachine::Term* prev;

	  public:
		  virtual ~UndoableAnonymousInnerClass4()
		  {
			  delete prev;
		  }

		  UndoableAnonymousInnerClass4(Term* outerInstance, SxxMachine::Term* prev);

		  void undo() override;
	  };
  public:
	  virtual void setarg0(Trail* trail, const int& i0, Term* value);


	  virtual Term* setGoals(Term* newval);

private:
	Term* getGoals();

public:
	virtual void setAttrs(Term* newval);

	virtual Term* getAttrs();


	  virtual bool isFVar();
	  int intValue() override;
	  virtual bool unifyInt(const int& i, Trail* trail);
	  virtual SymbolTerm* asSymbolTerm();

	  /**
	   * @return the value
	   */
	  virtual Term* getValue();
	  /**
	   * @return the fdata
	   */
	  virtual FrozenData* getFdata();
  private:
	  FrozenData* fdata = nullptr;
	  /**
	   * @param fdata the fdata to set
	   */
	  //public void setFdata(FrozenData fdata) {
		//this.fdata = fdata;
	  //}
  public:
	  virtual bool isAlias();
	  double doubleValue() override;
	  virtual Term* functor();

	  Term* zowner;


	  virtual MapTerm* join(Term* term);

	  virtual bool isMap();

	  virtual bool pbind(Term* variableTerm, Trail* trail);

	virtual void toString(StringBuilder* sb);

	virtual std::any object();

	virtual std::type_info getClazz();
	virtual StructureTerm* asStructureTerm();

	 virtual void setArg(const int& i, Term* value);
		// 

	virtual ListTerm* asListTerm();

	virtual LongTerm* asIntegerTerm();

	virtual ClosureTerm* asClosureTerm();

	virtual VariableTerm* asVariableTerm();

	virtual LongTerm* asLongTerm();

	virtual HashtableOfTerm* asHashtableOfTerm();

	virtual NumberTerm* asNumberTerm();

	virtual MapTerm* asMapTerm();
	};

}


#endif	//#ifndef TERM
