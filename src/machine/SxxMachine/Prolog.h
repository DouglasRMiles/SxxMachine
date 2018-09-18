#ifndef PROLOG
#define PROLOG

#include "Operation.h"
#include "../../kernelprolog/main/SxxMachine/Builtins.h"
#include <string>
#include <unordered_map>
#include <vector>
#include <limits>
#include <stdexcept>
#include <any>
#include <mutex>
#include "exceptionhelper.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class PrologLogger; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class PrologControl; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class ChoicePointStack; }
namespace SxxMachine { class Trail; }
namespace SxxMachine { class PrologClassLoader; }
namespace SxxMachine { class InternalDatabase; }
namespace SxxMachine { class HashtableOfTerm; }
namespace SxxMachine { class ListTerm; }
namespace SxxMachine { class NameArity; }
namespace SxxMachine { class PrologMachineCopy; }
namespace SxxMachine { class Operation; }
namespace SxxMachine { class arg; }
namespace SxxMachine { class ChoicePointFrame; }
namespace SxxMachine { class Undoable; }
class StringBuilder;

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.TermData.CONS;

	/**
	 * Prolog engine.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.2
	 */
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("unused") public final class Prolog
	class Prolog final
	{
	private:
		PrologLogger* const  logger;
		static Logger* const  javaUtilLogger;
		static SymbolTerm* const  NONE;
		ConcurrentMap<std::string, std::any>* const  externalData = new ConcurrentHashMap<std::string, std::any>();
		/** Prolog thread */
	public:
		PrologControl* const  control;
		/** Argument registers */
		//public Term AREGS[0], AREGS[1], AREGS[2], AREGS[3], AREGS[4], AREGS[5], AREGS[6], AREGS[7];
		//public Term[] aregs;
		std::vector<Term*> AREGS;

	private:
		static std::vector<Term*> const  NO_REGISTERS;
		/** Continuation goal register */
	public:
		Operation cont;
		/** Choice point frame stack */
		ChoicePointStack* const  stack;
		/** Trail stack */
		Trail* const  trail;
		/** Cut pointer */
		int B0 = 0;
		/** Class loader */
		PrologClassLoader* pcl;
		/** Internal Database */
		InternalDatabase* internalDB;
		/** Current time stamp of choice point frame */
	private:
		long long CPFTimeStamp = 0;
		/** Stack for keeping B value of error catchers */
		std::vector<int> catchersB = std::vector<int>(256);
		int catchersBindex = -1;
		/**
		 * Exception level of continuation passing loop:
		 * <li><code>0</code> for no exception,
		 * <li><code>1</code> for <code>halt/0</code>,
		 * <li><code>1+N</code> for <code>halt(N)</code>.
		 * </ul>
		 */
	public:
		int halt = 0;
		/** <font color="red">Not supported yet</font>. Prolog implementation flag: <code>bounded</code>. */
	private:
		const bool bounded = false;
		/** Prolog implementation flag: <code>max_integer</code>. */
		static const int maxInteger = std::numeric_limits<int>::max();
		/** Prolog implementation flag: <code>min_integer</code>. */
		static const int minInteger = std::numeric_limits<int>::min();
		/** Prolog implementation flag: <code>integer_rounding_function</code>. */
		const std::string integerRoundingFunction = "down";
		/** <font color="red">Not supported yet</font>. Prolog implementation flag: <code>char_conversion</code>. */
		std::string charConversion;
		/** Prolog implementation flag: <code>debug</code>. */
		std::string debug;
		/** Prolog implementation flag: <code>max_arity</code>. */
	public:
		int maxArity = 255;
		/** Prolog implementation flag: <code>unknown</code>. */
	private:
		std::string unknown;
		/** <font color="red">Not supported yet</font>. Prolog implementation flag: <code>double_quotes</code>. */
		std::string doubleQuotes;
		/** Prolog implementation flag: <code>print_stack_trace</code>. */
		std::string printStackTrace;
		/** Holds an exception term for <code>catch/3</code> and <code>throw/1</code>. */
		Term* exception;
		/** Holds the start time as <code>long</code> for <code>statistics/2</code>. */
		long long startRuntime = 0;
		/** Holds the previous time as <code>long</code> for <code>statistics/2</code>. */
		long long previousRuntime = 0;
	//    /** Hashtable for creating a copy of term. */
	//    protected IdentityHashMap<Object, Term> copyHash;
		/** The size of the pushback buffer used for creating input streams. */
	public:
		static constexpr int PUSHBACK_SIZE = 256;
		/** Standard input stream. */
	private:
		PushbackReader* userInput;
		/** Standard output stream. */
		PrintWriter* userOutput;
		/** Standard error stream. */
		PrintWriter* userError;
		/** Current input stream. */
		PushbackReader* currentInput;
		/** Current output stream. */
		PrintWriter* currentOutput;
		/** Hashtable for managing input and output streams. */
	public:
		HashtableOfTerm* streamManager;
		/** Hashtable for managing internal databases. */
	private:
		HashtableOfTerm* const  hashManager;
		/** Name of the builtin package. */
	public:
		static const std::string BUILTIN;
		/** Holds an atom <code>[]<code> (empty list). */
		static SymbolTerm* const  Nil;
		static SymbolTerm* const  True;
		/* Some symbols for stream options */
	private:
		static SymbolTerm* const  SYM_MODE_1;
		static SymbolTerm* const  SYM_ALIAS_1;
		static SymbolTerm* const  SYM_TYPE_1;
		static SymbolTerm* const  SYM_READ;
		static SymbolTerm* const  SYM_APPEND;
		static SymbolTerm* const  SYM_INPUT;
		static SymbolTerm* const  SYM_OUTPUT;
		static SymbolTerm* const  SYM_TEXT;
		static SymbolTerm* const  SYM_USERINPUT;
		static SymbolTerm* const  SYM_USEROUTPUT;
		static SymbolTerm* const  SYM_USERERROR;
		static PrintWriter* const  NO_OUTPUT;

	private:
		class WriterAnonymousInnerClass : public Writer
		{
		public:
			WriterAnonymousInnerClass();

			void write(std::vector<char&>& cbuf, const int& off, const int& len) throw(IOException) override;
			void flush() throw(IOException) override;
			virtual ~WriterAnonymousInnerClass();
		};
	private:
		static PushbackReader* const  NO_INPUT;

	private:
		class ReaderAnonymousInnerClass : public Reader
		{
		public:
			ReaderAnonymousInnerClass();

			int read(std::vector<char&>& cbuf, const int& off, const int& len) throw(IOException) override;
			virtual ~ReaderAnonymousInnerClass();
		};

	public:
		static constexpr bool BE_SAFE = false;
		static bool BE_FAST;
		static constexpr bool CYCLIC_TERMS = true;
		static Prolog* M;
	public:
		enum class Feature
		{
			/** Enable the {@code java_*} predicates, supporting reflection in Prolog. */
			JAVA_REFLECTION,
			/** Access to the local filesystem and console. */
			IO,
			/** Track the running time of evaluations */
			STATISTICS_RUNTIME
		};
	protected:
		EnumSet<Feature>* const  features = EnumSet::allOf(Feature::typeid);
	public:
		Term* pendingGoals;
		int PENDING_INTERUPTS = 0;
		std::mutex INTERUPT_LOCK;
		ListTerm* lastPendingGoal;
		Term* assumptions;
	  Operation pred;
	  static SymbolTerm* const  anEof;
	  static SymbolTerm* const  aNo;
	  static SymbolTerm* const  aYes;
	  static NameArity* const  aFail; //new fail_();

	  /** A functor <code>'.' /2</code>. */
	  static SymbolTerm* const  SYM_DOT;
	  static SymbolTerm* const  SYM_CONJ;
	  static SymbolTerm* const  SYM_NECK;


		virtual ~Prolog()
		{
			delete logger;
			delete externalData;
			delete control;
			delete stack;
			delete trail;
			delete pcl;
			delete internalDB;
			delete exception;
			delete userInput;
			delete userOutput;
			delete userError;
			delete currentInput;
			delete currentOutput;
			delete streamManager;
			delete hashManager;
			delete features;
			delete pendingGoals;
			delete lastPendingGoal;
			delete assumptions;
		}

		Prolog(PrologControl* c);
		Prolog(PrologControl* c, PrologMachineCopy* pmc);
		/**
		 * Initializes some local instances only once.
		 * This <code>initOnce</code> method is invoked in the constructor
		 * and initializes the following instances:
		 * <ul>
		 *   <li><code>userInput</code>
		 *   <li><code>userOutput</code>
		 *   <li><code>userError</code>
		 *   <li><code>copyHash</code>
		 *   <li><code>streamManager</code>
		 * </ul>
		 */
	private:
		void initOnce(InputStream* in_RenamedTODO, PrintStream* out, PrintStream* err);
		/** Initializes this Prolog engine. */
	public:
		void init(InputStream* in_RenamedTODO, PrintStream* out, PrintStream* err);
		/** Ensure a feature is enabled, throwing if not. */
		void requireFeature(Prolog::Feature f, Operation goal, Term* arg);
		void pushCatcherB(const int& b);
	private:
		void ensureCatchersCapability();
	public:
		int popCatcherB();
		int peekCatcherB();
		/** Sets B0 to the top of the choice point stack.. */
		void setB0();
		/** Discards all choice points after the value of <code>i</code>. */
		void cut(const int& i);
		/** Discards all choice points after the value of <code>B0</code>. */
		void neckCut();
		/**
		 * Returns a copy of term <code>t</code>.
		 * @param t a term to be copied. It must be dereferenced.
		 */
		Term* copy(Term* t);
		/**
		 * Do backtrack.
		 * This method restores the value of <code>B0</code>
		 * and returns the backtrack point in current choice point.
		 */
		Operation fail();

	  /**
	   * Returns the <code>Predicate</code> object refered, respectively,
	   * <code>var</code>, <code>Int</code>, <code>flo</code>, <code>con</code>,
	   * <code>str</code>, or <code>lis</code>, depending on whether the
	   * dereferenced value of argument register <code>areg[1]</code> is a variable,
	   * integer, float, atom, compound term, or non-empty list, respectively.
	   */
	  Operation switch_on_term(Operation var, Operation Int, Operation flo, Operation con, Operation str, Operation lis);

		/**
		 * If the dereferenced value of arugment register <code>areg[1]</code>
		 * is an integer, float, atom, or compound term (except for non-empty list),
		 * this returns the <code>Predicate</code> object to which its key is mapped
		 * in hashtable <code>hash</code>.
		 *
		 * The key is calculated as follows:
		 * <ul>
		 *   <li>integer - itself
		 *   <li>float - itself
		 *   <li>atom - itself
		 *   <li>compound term - functor/arity
		 * </ul>
		 *
		 * If there is no mapping for the key of <code>areg[1]</code>,
		 * this returns <code>otherwise</code>.
		 */
		Operation switch_on_hash(std::unordered_map<Term*, Operation>& hash, Operation otherwise);
	// --Commented out by Inspection START (03.04.2017 11:14):
	//	/** Restores the argument registers and continuation goal register from the current choice point frame. */
	//	public final void restore() {
	//		stack.top.restore(this);
	//	}
	// --Commented out by Inspection STOP (03.04.2017 11:14)
		/** Creates a new choice point frame. */
		Operation jtry0(Operation p, Operation next);

		  Operation jtry1(Operation p, Operation next);
		  Operation jtry2(Operation p, Operation next);
		  Operation jtry3(Operation p, Operation next);
		  Operation jtry4(Operation p, Operation next);
		  Operation jtry5(Operation p, Operation next);
		  Operation jtry6(Operation p, Operation next);
		  Operation jtry7(Operation p, Operation next);
		  Operation jtry8(Operation p, Operation next);
		  Operation jtry(const int& arity, Operation p, Operation next);
	private:
		Operation finishjtry(Operation p, Operation next, ChoicePointFrame* entry);
		/**
		 * Resets all necessary information from the current choice point frame,
		 * updates its next clause field to <code>next</code>,
		 * and then returns <code>p</code>.
		 */
	public:
		Operation retry(Operation p, Operation next);
		/**
		 * Resets all necessary information from the current choice point frame,
		 * discard it, and then returns <code>p</code>.
		 */
		Operation trust(Operation p);
	private:
		Term* makeStreamProperty(SymbolTerm* _mode, SymbolTerm* io, SymbolTerm* _alias, SymbolTerm* _type);
		/** Returns the current time stamp of choice point frame. */
	public:
		long long getCPFTimeStamp();
		/** Returns the value of Prolog implementation flag: <code>bounded</code>. */
		bool isBounded();
		/** Returns the value of Prolog implementation flag: <code>max_integer</code>. */
		int getMaxInteger();
		/** Returns the value of Prolog implementation flag: <code>min_integer</code>. */
		int getMinInteger();
		/** Returns the value of Prolog implementation flag: <code>integer_rounding_function</code>. */
		std::string getIntegerRoundingFunction();
		/** Returns the value of Prolog implementation flag: <code>char_conversion</code>. */
		std::string getCharConversion();
		/** Sets the value of Prolog implementation flag: <code>char_conversion</code>. */
		void setCharConversion(const std::string& mode);
		/** Returns the value of Prolog implementation flag: <code>debug</code>. */
		std::string getDebug();
		/** Sets the value of Prolog implementation flag: <code>debug</code>. */
		void setDebug(const std::string& mode);
		/** Returns the value of Prolog implementation flag: <code>max_arity</code>. */
		int getMaxArity();
		/** Returns the value of Prolog implementation flag: <code>unknown</code>. */
		std::string getUnknown();
		/** Sets the value of Prolog implementation flag: <code>unknown</code>. */
		void setUnknown(const std::string& mode);
		/** Returns the value of Prolog implementation flag: <code>double_quotes</code>. */
		std::string getDoubleQuotes();
		/** Sets the value of Prolog implementation flag: <code>double_quotes</code>. */
		void setDoubleQuotes(const std::string& mode);
		/** Returns the value of Prolog implementation flag: <code>print_stack_trace</code>. */
		std::string getPrintStackTrace();
		/** Sets the value of Prolog implementation flag: <code>print_stack_trace</code>. */
		void setPrintStackTrace(const std::string& mode);
		/** Returns the value of <code>exception</code>. This is used in <code>catch/3</code>. */
		Term* getException();
		/** Sets the value of <code>exception</code>. This is used in <code>throw/1</code>. */
		void setException(Term* t);
		/** Returns the value of <code>startRuntime</code>. This is used in <code>statistics/2</code>. */
		long long getStartRuntime();
		/** Returns the value of <code>previousRuntime</code>. This is used in <code>statistics/2</code>. */
		long long getPreviousRuntime();
		/** Sets the value of <code>previousRuntime</code>. This is used in <code>statistics/2</code>. */
		void setPreviousRuntime(long long t);
		/** Returns the standard input stream. */
		PushbackReader* getUserInput();
		/** Returns the standard output stream. */
		PrintWriter* getUserOutput();
		/** Returns the standard error stream. */
		PrintWriter* getUserError();
		/** Returns the current input stream. */
		PushbackReader* getCurrentInput();
		/** Sets the current input stream to <code>in</code>. */
		void setCurrentInput(PushbackReader* in_RenamedTODO);
		/** Returns the current output stream. */
		PrintWriter* getCurrentOutput();
		/** Sets the current output stream to <code>out</code>. */
		void setCurrentOutput(PrintWriter* out);
		/** Returns the stream manager. */
		HashtableOfTerm* getStreamManager();
		/** Returns the hash manager. */
		HashtableOfTerm* getHashManager();
	//	public final Operation exec(Operation code){
	//		try {
	//			logger.beforeExec(code);
	//			return code.exec(this);
	//		} catch (RuntimeException t){
	//			throw logger.execThrows(t);
	//		}
	//	}
		std::any getExternalData(const std::string& key);
		void setExternalData(const std::string& key, std::any value);
		PrologLogger* getLogger();
		void push(Undoable* undoable);

		Term* popPendingGoals();
		   Term* peekPendingGoals();
		void pushPendingGoal(Term* goal);
		void addPendingGoal(Term* goal);

		void getStackTrace(StringBuilder* sb);

		std::string toString() override;

	  static void Break(const std::string& string);

	};

}


#endif	//#ifndef PROLOG
