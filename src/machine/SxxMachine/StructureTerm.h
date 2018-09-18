#ifndef STRUCTURETERM
#define STRUCTURETERM

#include "ListTerm.h"
#include "../../kernelprolog/main/SxxMachine/NameArity.h"
#include "Cloneable.h"
#include <string>
#include <vector>
#include <any>
#include <typeinfo>
#include "exceptionhelper.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }
namespace SxxMachine { class Prog; }
namespace SxxMachine { class KPTrail; }
namespace SxxMachine { class Nonvar; }
namespace SxxMachine { class Trail; }
namespace SxxMachine { class SymbolTerm; }
class Method;
class StringBuilder;
class StackOverflowError;

namespace SxxMachine
{

	/**
	 * Compound term. <br>
	 * The <code>StructureTerm</code> class represents a compound term but list.<br>
	 *
	 * <pre>
	 *  % father(abraham, X)
	 *  Term a1 = SymbolTerm.makeSymbol("abraham");
	 *  Term a2 = new VariableTerm();
	 *  Term[] a3 = {a1, a2};
	 *  Term a4 = SymbolTerm.makeSymbol("father", 2);
	 *  Term  t = new StructureTerm(a4, a3);
	 *  
	 *  Term functor = (t).functor();
	 *  Term[]  args = (t).args();
	 *  int    arity = (t).arity();
	 * </pre>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class StructureTerm : public ListTerm, public Cloneable, public NameArity
	{

	public:
		virtual ~StructureTerm()
		{
			delete functor;
			delete st_exec;
		}

		std::string getKey() override override;

		static Term* getHead(Term* T);

		static Term* getTail(Term* T);

		//public Term argz[];

		bool isConj() override;

		//  @Override
		//  public boolean isCons() {
		//      return name == "." && arityOrType() == 2;
		//  }

		bool isConst() override;

		//private String Name;

		int arityOrType() override final override;

		/*
		 * public StructureTerm(int arity) { //setDefaultName(); Arguments=new Term[arity]; }
		 */
		StructureTerm(const std::string& name, const int& arity);
		//  public StructureTerm(String name, Term... x0) {
		//      super(name);
		//      argz = x0;
		//  }

	private:
		static std::vector<Term*> makeVars(const int& arity);

	public:
		virtual void init(const int& arity);

		Term* ArgDeRef(const int& i) final override;

		Term* ArgNoDeRef(const int& i) final override;

		int getIntArg(const int& i) final override;

		void setArg(const int& i, Term* T) final override;

		int unifyArg(const int& i, Term* T, Prog* p) final override;

	protected:
		std::string funToString();

	public:
		std::string pprint() override;

		/**
		List printer.
		*/
		virtual std::string toListString();

		virtual std::string conjToString();

	protected:
		static std::string watchNull(Term* x);

	private:
		std::string show_args();

	public:
		bool bind(Term* that, KPTrail* trail) override;

		bool Unify_TO(Term* that, KPTrail* trail) override;

		Term* carTokenOrSelf() override;

		// stuff allowing polymorphic cloning of StructureTerm subclasses
		// without using reflection - should be probaly faster than
		// reflection classes - to check
		StructureTerm* toClone() override;

	protected:
		virtual StructureTerm* unInitializedClone();

		virtual StructureTerm* initializedClone();

	public:
		Term* reaction(Term* that) override;

		Nonvar* listify() override;

		bool isClause() override;

		static StructureTerm* createCons(Term* x0, Term* x1);

		static StructureTerm* createCons(const std::string& cons, Term* x0, Term* x1);

		static StructureTerm* S(const std::string& string, std::vector<Term> &x01);

		static StructureTerm* S(const std::string& getName, const int& arity);

		Term* car() override;

		/** Returns the value of <code>cdr</code>.
		 * @see #cdr
		 */
		Term* cdr() override;

		bool isCons() override;

		int type() override;

	private:
		bool isConsOL();

		/** Holds the functor symbol of this <code>StructureTerm</code>. */
		//private final String name;
		//protected String name;
	protected:
//JAVA TO C++ CONVERTER NOTE: Fields cannot have the same name as methods:
		Term* functor_RenamedTODO;
	private:
//JAVA TO C++ CONVERTER NOTE: Fields cannot have the same name as methods:
		std::string name_RenamedTODO;
		Method* st_exec;

		/** Holds the argument terms of this <code>StructureTerm</code>. */
		//public Term[] argz;
		//protected boolean immutable;
	public:
		bool isStructure() override;

		bool isAtomicValue() override;

		/**
		 * Constructs a new Prolog compound term
		 * such that <code>name</code> is the functor symbol, and
		 * <code>args</code> is the argument terms respectively.
		 */
		StructureTerm(const std::string& _name, std::vector<Term> &_args);

	private:
		void checkImmuatble();

	public:
		std::any toJava() override;

		/**
		 * Constructs a new Prolog compound term
		 * such that <code>_functor</code> is the functor symbol, and 
		 * <code>_args</code> is the argument terms respectively.
		 */
		StructureTerm(Term* _functor, std::vector<Term> &_args);

		/** 
		 * @return the <code>boolean</code> whose value is
		 * <code>convertible(List.class, type)</code>.
		 * @see Term#convertible(Class, Class)
		 */
		bool convertible(std::type_info type) override;

	private:
		static std::string checkFunctor(Term* _functor, std::vector<Term*>& _args);

		/*public StructureTerm(String string, Term a0,Term a1, Term a2,Term a3, Term a4, Term a5) {
			this(string, new Term[] {a0,a1,a2,a3,a4,a5});
		}
		public StructureTerm(String string, Term a0,Term a1, Term a2,Term a3, Term a4) {
			this(string, new Term[] {a0,a1,a2,a3,a4});
		}
		public StructureTerm(String string, Term a0,Term a1, Term a2,Term a3) {
			this(string, new Term[] {a0,a1,a2,a3});
		}
		public StructureTerm(String string, Term a0,Term a1, Term a2) {
			this(string, new Term[] {a0,a1,a2});
		}
		public StructureTerm(String string, Term a0,Term a1) {
			this(string, new Term[] {a0,a1});
		}
		public StructureTerm(String string, Term a0) {
			this(string, new Term[] {a0});
		}
		public StructureTerm(SymbolTerm string, Term a0,Term a1, Term a2,Term a3, Term a4, Term a5) {
			this(string, new Term[] {a0,a1,a2,a3,a4,a5});
		}
		public StructureTerm(SymbolTerm string, Term a0,Term a1, Term a2,Term a3, Term a4) {
			this(string, new Term[] {a0,a1,a2,a3,a4});
		}
		public StructureTerm(SymbolTerm string, Term a0,Term a1, Term a2,Term a3) {
			this(string, new Term[] {a0,a1,a2,a3});
		}
		public StructureTerm(SymbolTerm string, Term a0,Term a1, Term a2) {
			this(string, new Term[] {a0,a1,a2});
		}
		public StructureTerm(SymbolTerm string, Term a0,Term a1) {
			this(string, new Term[] {a0,a1});
		}
		public StructureTerm(SymbolTerm string, Term a0) {
			this(string, new Term[] {a0});    	
		}
		
		/** Returns the functor symbol of this <code>StructureTerm</code>.
		 * @return the value of <code>functor</code>.
		 * @see #functor
		 */
	public:
		Term* functor() final override;

		/** Returns the arity of this <code>StructureTerm</code>.
		 * @return the value of <code>arity</code>.
		 * @see #arity
		 */
		int arity() override;

		/** Returns the argument terms of this <code>StructureTerm</code>.
		 * @return the value of <code>args</code>.
		 * @see #argsIt
		 */
		std::vector<Term*> args() override final;

		/** Returns the string representation of functor symbol of this <code>StructureTerm</code>.
		 * @return a <code>String</code> whose value is <code>functor.name()</code>.
		 * @see #functor
		 * @see SymbolTerm#name
		 */
		std::string name() override final;

		Term* arg0(const int& nth) override final;

		bool unifyImpl(Term* t, Trail* trail) override final;

	protected:
		Term* copyImpl(IdentityHashMap<std::any, Term*>* copyHash, const int& deeply) override;

	public:
		bool isImmutable() override final;

		bool isGround() override;

		int containsTermImpl(Term* variableTerm, Comparator* comparison) override;

		/* Object */
		/**
		 * Checks <em>term equality</em> of two terms.
		 * The result is <code>true</code> if and only if the argument is an instance of
		 * <code>StructureTerm</code>, has the same functor symbol and arity, and
		 * all corresponding pairs of arguments in the two compound terms are <em>term-equal</em>.
		 * @param obj the object to compare with. This must be dereferenced.
		 * @return <code>true</code> if the given object represents a Prolog compound term
		 * equivalent to this <code>StructureTerm</code>, false otherwise.
		 * @see #compareTo
		 */
		bool equalsTerm(Term* obj, Comparator* comparator) override;

		int termHashCodeImpl() override;

		/** Adds a string representation of this <code>StructureTerm</code> to given StringBuilder instance. 
		 * Non recursive implementation
		 * */
		void toStringImpl(const int& printingFlags, StringBuilder* sb) override;

		virtual void toListStringImpl(const int& printingFlags, StringBuilder* sb);

		virtual Iterator<Term*>* listIterator(const bool& includeSyntax);

		Iterator<Term*>* iterator(const bool& includeSyntax) override;

	private:
		class StructureTermIterator : public Iterator<Term*>
		{
		private:
			static SymbolTerm* const  COMMA;
			static SymbolTerm* const  RIGHT_BRACKET;
			static SymbolTerm* const  LEFT_BRACKET;
			int index = -2;
			Term* const  functorIt;
			std::vector<Term*> const  argsIt;
			const int length;
			bool comma = false;
			bool includeSyntax = false;

		public:
			virtual ~StructureTermIterator()
			{
				delete functorIt;
			}

			StructureTermIterator(Term* functor, std::vector<Term*>& args, const bool& includeSyntax);

			bool hasNext() override;

			Term* next() override;
		};

		/* Comparable */
		/** 
		 * Compares two terms in <em>Prolog standard order of terms</em>.<br>
		 * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
		 * <code>boolean</code> value as <code>t1.equals(t2)</code>.
		 * @param anotherTerm the term to compared with. It must be dereferenced.
		 * @return the value <code>0</code> if two terms are identical; 
		 * a value less than <code>0</code> if this term is <em>before</em> the <code>anotherTerm</code>;
		 * and a value greater than <code>0</code> if this term is <em>after</em> the <code>anotherTerm</code>.
		 */
	public:
		int compareTo(Term* anotherTerm) override;

		void setarg0(Trail* trail, const int& i, Term* val) override;

		// @Override
		void setCar(Term* t) override;

		//  @Override
		void setCdr(Term* t) override;

		void setMethod(Method* b) override;

	};

}


#endif	//#ifndef STRUCTURETERM
