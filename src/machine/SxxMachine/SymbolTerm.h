#ifndef SYMBOLTERM
#define SYMBOLTERM

#include "Nonvar.h"
#include "../../kernelprolog/main/SxxMachine/ISTerm.h"
#include "../../kernelprolog/main/SxxMachine/NameArity.h"
#include "../../kernelprolog/main/SxxMachine/ExecProg.h"
#include "WeakReference.h"
#include <string>
#include <cctype>
#include <stdexcept>
#include <any>
#include <typeinfo>
#include "stringhelper.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Prog; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class KPTrail; }
namespace SxxMachine { class ISTerm; }
namespace SxxMachine { class Key; }
namespace SxxMachine { class InternRef; }
namespace SxxMachine { class Interned; }
namespace SxxMachine { class Trail; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class PrologException; }
class Method;
class ReferenceQueue;
class StringBuilder;
class Reference;

namespace SxxMachine
{


	/**
	 * Atom.<br>
	 * The <code>SymbolTerm</code> class represents a Prolog atom.<br>
	 *
	 * <pre>
	 *   Term t = SymbolTerm.makeSymbol("kobe");
	 *   String name = t.asSymbolTerm().name();
	 * </pre>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings({ "unused", "rawtypes" }) public abstract class SymbolTerm extends Nonvar implements NameArity, ISTerm
	class SymbolTerm : public Nonvar, public NameArity, public ISTerm
	{
	public:
		virtual ~SymbolTerm()
		{
			delete st_exec;
		}

		int exec(Prog* p) override;

		bool isConst() override;


		bool isNil() override;

//JAVA TO C++ CONVERTER NOTE: Fields cannot have the same name as methods:
		std::string name_RenamedTODO;

		bool isTrueProc() override;

		virtual std::string qname();

		static std::string MaybeQuoted(const std::string& sym);

		SymbolTerm* toClone() throw(CloneNotSupportedException) override;

		std::string pprint() override;

		bool bind(Term* that, KPTrail* trail) override;

		std::string getKey() override override;

		/**
		 * returns an arity normally defined as 0
		 * 
		 * @see Term#CONST
		 */
		int arityOrType() override override;

		/**
		 * creates a ConstBuiltin from a Const known to be registered as being a builtin
		 * while returning its argument unchanged if it is just a plain Prolog constant
		 * with no builtin code attached to it
		 */

		std::string toUnquoted() override;

		int getIntArg(const int& i) override;

		int unifyArg(const int& i, Term* a, Prog* p) override;

		Term* ArgNoDeRef(const int& i) override;

		ExecProg exp;

		virtual int exec(Prog* p, ISTerm* thiz);

	private:
		Method* st_exec;

	public:
		void setMethod(Method* b) override;

		int type() override;

		bool isSymbol() override;

		/** Symbol table. */
	private:
		static ConcurrentHashMap<Key*, InternRef*>* const  SYMBOL_TABLE;
		static ReferenceQueue<Interned*>* const  DEAD;

	private:
		class Key final
		{
		public:
			const std::string name;
			const int arity;

			Key(const std::string& n, const int& a);

			int hashCode() override;

			bool equals(std::any other) override;
		};

	private:
		class InternRef final : public WeakReference<Interned*>
		{
		public:
			Key* const  key;

			virtual ~InternRef()
			{
				delete key;
			}

			InternRef(Key* key, Interned* sym);
		};

	public:
		class Dynamic;

	public:
		class Interned;

	public:
		class Partial;

	private:
		static SymbolTerm* const  colon2;
	public:
		static Term* const  GOALS;

		/** Returns a Prolog atom for the given character. */
		static SymbolTerm* create(const char& c);

		/** Returns a Prolog atom for the given name. */
		static SymbolTerm* create(const std::string& _name);

		/** Returns a Prolog atom for the given name. */
		static SymbolTerm* create(const std::string& _name, const int& arity);

		/** Returns a Prolog functor for the given name and arity. */
		static StructureTerm* create(const std::string& pkg, const std::string& name, const int& arity);

		/** Returns a Prolog atom for the given name. */
		static SymbolTerm* intern(const std::string& _name);

		/** Returns a Prolog functor for the given name and arity. */
		static SymbolTerm* intern(const std::string& _name, const int& _arity);

		static void gc();

	private:
		static SymbolTerm* softReuse(const std::string& _name, const int& _arity);

		/** Holds a string representation of this <code>SymbolTerm</code>.
		 *  The string can be shared (partially) with other <code>SymbolTerm</code> instances */
		// protected final String name;
	protected:
		const std::string quoted;
		/** Holds the arity of this <code>SymbolTerm</code>. */
//JAVA TO C++ CONVERTER NOTE: Fields cannot have the same name as methods:
		const int arity_RenamedTODO;
		/** Holds start index in name */
//JAVA TO C++ CONVERTER NOTE: Fields cannot have the same name as methods:
		const int start_RenamedTODO;
		/** Holds end Index in name */
//JAVA TO C++ CONVERTER NOTE: Fields cannot have the same name as methods:
		const int finish_RenamedTODO;

		/** Constructs a new Prolog atom (or functor) with the given symbol name and arity. */
		SymbolTerm(const std::string& _name, const int& _arity);

		/** Constructs a new Prolog atom (or functor) with the given symbol name, arity and start/finish. */
		SymbolTerm(const std::string& _name, const int& _arity, const int& start, const int& finish);

		/** Returns the arity of this <code>SymbolTerm</code>.
		 * @return the value of <code>arity</code>.
		 * @see #arity
		 */
	public:
		int arity() override final;

		/** Returns the string representation of this <code>SymbolTerm</code>.
		 * @return the value of <code>name</code>.
		 * @see #name
		 */
		std::string name() override;

		int start();

		int finish();

		std::string base();

		/**
		 * Creates and return new {@link SymbolTerm} instance that shares the name string with this instance,
		 * but name of new instance is a substring of this name starting from given beginIndex.
		 * @param beginIndex
		 * @return
		 */
		virtual SymbolTerm* subsymbol(const int& beginIndex);

		/**
		 * Creates and return new {@link SymbolTerm} instance that shares the name string with this instance,
		 * but name of new instance is a substring of this name starting from given beginIndex and ending before endIndex.
		 * @param beginIndex
		 * @param endIndex
		 * @return
		 */
		virtual SymbolTerm* subsymbol(const int& beginIndex, const int& endIndex);

		virtual SymbolTerm* concat(SymbolTerm* that);

		/**
		 * Returns the name length
		 * @return
		 */
		int length() override;

		// TODO startsWith(), endsWith(), indexOf()
		/* Term */
		bool unifyImpl(Term* t, Trail* trail) override;

		int termHashCodeImpl() override;

		bool equalsTerm(Term* obj, Comparator* comparator) override;

		//    private static boolean eq(SymbolTerm a, Term b0) {
		//      if (a == b0) {
		//        return true;
		//      } else if (b0 .isSymbol() && (a instanceof Dynamic || b0 instanceof Dynamic)) {
		//        SymbolTerm b = (SymbolTerm) b0;
		//        return a.arity == b.arity && a.name.equals(b.name);
		//      } else {
		//        return false;
		//      }
		//    }
		/**
		 * @return the <code>boolean</code> whose value is
		 * <code>convertible(String.class, type)</code>.
		 * @see Term#convertible(Class, Class)
		 */
		bool convertible(std::type_info type) override;

		/**
		 * Returns a <code>java.lang.String</code> corresponds to this <code>SymbolTerm</code>
		 * according to <em>Prolog Cafe interoperability with Java</em>.
		 * @return a <code>java.lang.String</code> object equivalent to
		 * this <code>SymbolTerm</code>.
		 */
		std::any toJava() override;

		void toStringImpl(const int& printingFlags, StringBuilder* sb) override;

		std::string toAtomName() throw(PrologException) override;

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
		int compareTo(Term* anotherTerm) override;

		bool isImmutable() override final;

		bool IsNil() override;

		static SymbolTerm* internToken(const std::string& _name);

		SymbolTerm* functor() override;

	};

}
	class SymbolTerm::Dynamic : public SymbolTerm
	{
	protected:
		Dynamic(const std::string& name, const int& arity);

		Dynamic(const std::string& name);

	public:
		std::string toString() override;
	};
	class SymbolTerm::Interned final : public SymbolTerm
	{
	public:
		Interned(const std::string& name, const int& arity);

		std::string toString() override;
	};
	class SymbolTerm::Partial final : public SymbolTerm
	{
	private:
		int hash = 0;

	public:
		Partial(const std::string& name, const int& arity, const int& start, const int& finish);

		std::string toString() override;

		bool equalsTerm(Term* obj, Comparator* comparator) override;

		bool unifyImpl(Term* t, Trail* trail) override;

		int termHashCodeImpl() override;

		std::string name() override final;

		std::any toJava() override;

		void toStringImpl(const int& printingFlags, StringBuilder* sb) override;
	};


#endif	//#ifndef SYMBOLTERM
