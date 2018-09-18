#ifndef COMPILER
#define COMPILER

#include <string>
#include <vector>
#include <list>
#include <stdexcept>
#include "exceptionhelper.h"
#include "stringhelper.h"
#include "tangible_filesystem.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class BufferingPrologControl; }
namespace SxxMachine { class CompileException; }
class SecurityException;

namespace SxxMachine
{

	/**
	 * The <code>Compiler</code> class provides methods for
	 * translating Prolog programs into Java programs.
	 *
	 * The <code>Compiler</code> class supports the following compiler options.
	 * All of them are set to <code>true</code> in default setting.
	 * <ul>
	 *   <li>Eliminate disjunctions
	 *   <li>Arithmetic compilation
	 *   <li>Inline expansion
	 *   <li>Optimisation of recursive call
	 *   <li>2nd. level indexing (<code>switch_on_hash</code>)
	 * </ul>
	 *
	 * Let us show a sample session for translating a Prolog program
	 * <code>$PLCAFEDIR/examples/prolog/list.pl</code> into Java.
	 * The <code>list.pl</code> contains predicates
	 * <code>append/3</code>, <code>nrev/2</code>, and <code>range/3</code>.
	 * <ul>
	 * <li>From Command line<br>
	 * <pre>
	 *    % java -cp $PLCAFEDIR/plcafe.jar SxxMachine.compiler.Compiler:$CLASSPATH $PLCAFEDIR/examples/prolog/list.pl
	 *    Prolog Cafe X.X.X (YYY)
	 *    Copyright(C) 1997-200X M.Banbara and N.Tamura
	 *    % ls
	 *    PRED_append_3.java      PRED_nrev_2.java        PRED_range_3.java
	 * </pre>
	 * <li>From Java program<br>
	 * <pre>
	 *    import SxxMachine.compiler.Compiler;
	 *    public class T {
	 *        public static void main(String argv[]) {
	 *            Compiler comp = new Compiler();
	 *	    comp.prologToJava(argv[0], ".");
	 *        }
	 *    }
	 * </pre>
	 * <pre>
	 *    % javac -classpath $PLCAFEDIR/plcafe.jar:$CLASSPATH T.java
	 *    % java -classpath $PLCAFEDIR/plcafe.jar:$CLASSPATH T $PLCAFEDIR/examples/prolog/list.pl
	 *    % ls
	 *    PRED_append_3.java      PRED_nrev_2.java        PRED_range_3.java
	 * </pre>
	 * </ul>
	 *
	 * It is noted that
	 * our Prolog-to-Java translator is originally witten in Prolog, and then bootstrapped.
	 * Please see the following two Prolog programs in details.
	 * <ul>
	 *   <li><code>$PLCAFEDIR/src/compiler/pl2am.pl</code><br>
	 *       Translates a Prolog program into a WAM-based intermediate code.
	 *   <li><code>$PLCAFEDIR/src/compiler/am2j.pl</code><br>
	 *       Translates a WAM-based intermediate code generated by <code>pl2am.pl</code>
	 *       into Java programs.
	 * </ul>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.2
	 */
	class Compiler
	{
	public:
		class Option final
		{
public:
		  static Option eliminateDisjunctions;
		  static Option arithmeticCompilation;
		  static Option inlineExpansion;
		  static Option optimiseRecursiveCall;
		  static Option switchOnHash;
		  static Option generateClosure;

private:
		  static std::vector<Option> valueList;

		  class StaticConstructor
		  {
		  public:
			  StaticConstructor();
		  };

		  static StaticConstructor staticConstructor;

public:
		  enum class InnerEnum
		  {
			  eliminateDisjunctions,
			  arithmeticCompilation,
			  inlineExpansion,
			  optimiseRecursiveCall,
			  switchOnHash,
			  generateClosure
		  };

		  const InnerEnum innerEnumValue;
private:
		  const std::string nameValue;
		  const int ordinalValue;
		  static int nextOrdinal;
	  public:
		  SymbolTerm* const  symbol;
		  const bool onByDefault;
		  Option(const std::string &name, InnerEnum innerEnum, Compiler* outerInstance, const std::string& symbol, const bool& onByDefault);

public:
			bool operator == (const Option &other);

			bool operator != (const Option &other);

			static std::vector<Option> values();

			int ordinal();

			std::string toString();

			static Option valueOf(const std::string &name);
		};
		/** Prolog context running the compiler/translater tools. */
	private:
		BufferingPrologControl* const  pcl;
		EnumSet<Option>* const  options;
		/** Initialize a new compiler instance. */
	public:
		virtual ~Compiler()
		{
			delete symbol;
			delete pcl;
			delete options;
		}

		Compiler();
		/**
		 * Translates a Prolog program into a WAM-based intermediate code.
		 *
		 * @param _prolog an input Prolog file
		 * @param _wam an output file for WAM-based intermediate code.
		*/
		virtual void prologToWAM(const std::string& _prolog, const std::string& _wam) throw(CompileException);
		/**
		 * Translates WAM-based intermediate code into Java source.
		 *
		 * @param _wam an input file for WAM-based intermediate code.
		 * @param _dir a destination directory for java files.
		 * @see #prologToWAM(String, String)
		*/
		virtual void wamToJavaSource(const std::string& _wam, const std::string& _dir) throw(CompileException);
		/**
		 * Translates a Prolog program into Java source files.
		 *
		 * @param prolog an input Prolog file
		 * @param dir a destination directory for java files. The directory must already exist.
		 * @see #prologToWAM(String, String)
		 * @see #wamToJavaSource(String, String)
		*/
		virtual void prologToJavaSource(const std::string& prolog, const std::string& dir) throw(CompileException);
		static void main(std::vector<std::string>& argv) throw(std::runtime_error);
	private:
		static Option findOptionByName(const std::string& optname);
		static void usage();
		static void banner();
		static bool fileExists(const std::string& _file);
	public:
		virtual bool isEnabled(Option opt);
		virtual void enable(Option opt);
		virtual void disable(Option opt);
		virtual void setEnabled(Option opt, const bool& on);
	private:
		void enableDefaultOptions();
	};

}


#endif	//#ifndef COMPILER
