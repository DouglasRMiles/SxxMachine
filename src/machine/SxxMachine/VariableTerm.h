#ifndef VARIABLETERM
#define VARIABLETERM

#include "Undoable.h"
#include "../../kernelprolog/terms/SxxMachine/Var.h"
#include <string>
#include <vector>
#include <limits>
#include <stdexcept>
#include <any>
#include <typeinfo>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Var; }
namespace SxxMachine { class Trail; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class KPTrail; }
class StringBuilder;

namespace SxxMachine
{



	/**
	 * Variable.<br>
	 * The <code>VariableTerm</code> class represents a logical variable.<br>
	 * For example,
	 * <pre>
	 *   Term t = new VariableTerm();
	 * </pre>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings({"rawtypes","unused"}) public class VariableTerm extends Var implements Undoable
	class VariableTerm : public Var, public Undoable
	{
	public:
		virtual ~VariableTerm()
		{
			delete downRef;
			delete val;
			delete frozenProxy;
		}

		Var* toClone() override;

  private:
	  static constexpr Comparator* equalsIdentical = nullptr;
  public:
	  bool unifyInt(const int& i, Trail* trail) override;
		/** Holds a term to which this variable is bound. Initial value is <code>this</code> (self-reference). */
		//private Term val;
		/** A CPF time stamp when this object is newly constructed. */
		long long timeStamp = 0;
		/** Variable terms, that reference to (use value of) this one */  
	private:
		std::vector<VariableTerm*> upRef;
		/** Opposite reference to upRef */
		VariableTerm* downRef = nullptr;
	public:
		Term* val = this;
	private:
		int isCyclic = 0;
	public:
		std::string toString() override;
		bool isAtomicValue() override;
		bool isVar() override;
		bool isNonvar() override;

		/** Constructs a new logical variable so that
		 * the <code>timeStamp</code> field is set to <code>Long.MIN_VALUE</code>.
		 */
		VariableTerm();
		/** Constructs a new logical variable so that
		 * the <code>timeStamp</code> field is set to the current value of
		 * <code>CPFTimeStamp</code> of the specified Prolog engine.
		 * @param engine Current Prolog engine.
		 * @see Prolog#getCPFTimeStamp
		 */
		VariableTerm(Prolog* engine);
		/** Returns a string representation of this object.*/
		virtual std::string variableName();

		int type() override;

		/** 
		 * Checks whether the argument term is unified with this one.
		 * If this is an unbound variable, the <code>unify</code> method binds this to 
		 * the dereferenced value of argument term: <code>bind(t.dereference(), trail)</code>,
		 * and returns <code>true</code>.
		 * Otherwise, it returns a <code>boolean</code> whose value is <code>val.unify(t, trail)</code>.
		 * @param t the term to be unified with.
		 * @param trail Trail Stack.
		 * @return <code>true</code> if succeeds, otherwise <code>false</code>.
		 * @see #val
		 * @see #bind(Term,Trail)
		 * @see Trail
		 */
	  bool unifyImpl(Term* t, Trail* trail) override final;


	  int containsTermImpl(Term* variableTerm, Comparator* comparison) override;

  private:
	  void updateUpRef(Term* value);

		void updateUpRefNoOccurs(Term* value);

		void bindUpRef(VariableTerm* upVariable);

  public:
	  VariableTerm* frozenProxy;
	  Term* freeze(Trail* trail, Term* newval) override;

		virtual bool FBind(Term* that, Trail* trail);
		/** 
		 * Binds this variable to a given term. 
		 * And pushs this variable to trail stack if necessary. 
		 * @param p a term to be bound.
		 * @param trail Trail Stack
		 * @see Trail
		 */
		bool pbind(Term* p, Trail* trail) final override;
	  bool bind(Term* p, Trail* trail) final override;
		/** 
		 * Checks whether this object is convertible with the given Java class type 
		 * if this variable is unbound.
		 * Otherwise, returns the value of <code>val.convertible(type)</code>.
		 * @param type the Java class type to compare with.
		 * @return <code>true</code> if this (or dereferenced term) is 
		 * convertible with <code>type</code>. Otherwise <code>false</code>.
		 * @see #val
		 */
		bool convertible(std::type_info type) override final;
		/** 
		 * Returns a copy of this object if unbound variable.
		 * Otherwise, returns the value of <code>val.copy(engine)</code>.
		 * @see #val
		 */
	protected:
		Term* copyImpl(IdentityHashMap<std::any, Term*>* copyHash, const int& deeply) override;
	public:
		bool isGround() override final;
		std::string name() override final;
		std::string toAtomName() override final;
		/** 
		 * Returns <code>this</code> if this variable is unbound.
		 * Otherwise, returns a Java object that corresponds to the dereferenced term:
		 * <code>val.toJava()</code>.
		 * @return a Java object defined in <em>Prolog Cafe interoperability with Java</em>.
		 * @see #val
		 */
		std::any toJava() override;

		/* Object */
		/**
		 * Checks <em>term equality</em> of two terms.
		 * This method returns a <code>boolean</code> whose value is
		 * (<code>this == obj</code>) if this variable is unbound.
		 * Otherwise, it returns the value of <code>val.equals(obj)</code>.
		 * @param obj the object to compare with. This must be dereferenced.
		 * @return <code>true</code> if this (or dereferenced term) is the same as the argument;
		 * <code>false</code> otherwise.
		 * @see #val
		 * @see #compareTo
		*/
		bool equalsTerm(Term* obj, Comparator* comparator) override;
		int termHashCodeImpl() override;
		/**
		 * Returns a string representation of this term if unbound.
		 * Otherwise, returns the value of dereferenced term:
		 * <code>val.toString()</code>
		 * @see #val
		 */
		int loopPrintingVar = 0;
		void toStringImpl(const int& printFlags, StringBuilder* sb) override;

		/**
		 * If unbound returns empty iterator, otherwise returns the value's iterator.
		 */
		Iterator<Term*>* iterator(const bool& skipSyntax) override;
		/* Undoable */
		void undo() override;
		/* Comparable */
		/** 
		 * Compares two terms in <em>Prolog standard order of terms</em>.<br>
		 * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
		 * <code>boolean</code> value as <code>t1.equals(t2)</code>.
		 * @param anotherTerm the term to compare with. It must be dereferenced.
		 * @return the value <code>0</code> if two terms are identical; 
		 * a value less than <code>0</code> if this term is <em>before</em> the <code>anotherTerm</code>;
		 * and a value greater than <code>0</code> if this term is <em>after</em> the <code>anotherTerm</code>.
		 */
		int compareTo(Term* anotherTerm) override;
		bool isImmutable() override final;

		static int nextID;
		const int myID;
		// Prolog mach;
		std::string varName = "";


		VariableTerm(const std::string& sval);

		VariableTerm(Prolog* m, const std::string& sval);

	  VariableTerm(Prolog* mach, long long currentChoice, StructureTerm* newgoals);
		VariableTerm(Prolog* mach, long long currentChoice);

//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("cast") @Override public Term dref()
	  Term* dref() override;

	//  public Term val;

	//  @Override
	//  public boolean isVar() {
	//      return true;
	//  }
	//
	//  public Var(String... s) {
	//      if(s.length>0 && s[0]!=null) {
	//          varName = s[0];
	//      }
	//      myID = ++ termHashCount;
	//      val = this;
	//  }

	  int arityOrType() override;

	  bool unbound() override final;
	//
	//  public Term dref() {
	//      return unbound() ? this : val.dref();
	//  }

	  virtual bool bind(Term* x, KPTrail* trail);

	//  public void undo() {
	//      val = this;
	//  }

	  bool Unify_TO(Term* that, KPTrail* trail) override;

	  virtual bool eq(Term* x);

	  std::string getKey() override;

	  Term* reaction(Term* agent) override;

	//  public String name() {
	//      return variableName();
	//  }
	//
	//  public String variableName() {
	//      if(varName!=null) 
	//          return varName+ "_" + Integer.toHexString(termHashCode());
	//      return "_" + Integer.toHexString(termHashCode());
	//  }

	  std::string pprint() override;

	// // public String varName;
	//  static int termHashCount = 666;
	// // final int myID;
	//  @Override
	//  public int termHashCodeImpl() {
	//      return myID;
	//  }

	  bool equalsTerm(Term* aneof) override;

	};

}


#endif	//#ifndef VARIABLETERM
