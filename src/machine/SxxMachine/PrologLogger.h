#ifndef PROLOGLOGGER
#define PROLOGLOGGER

#include <string>
#include <vector>
#include <stdexcept>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Predicate; }
namespace SxxMachine { class ChoicePointFrame; }
namespace SxxMachine { class Operation; }
class StringBuilder;

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.TermData.Op;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.TermData.VA;


	/**
	 * <p>Logs executed predicates and their arguments to {@link Logger} instance given in constructor.
	 * <p>Writes the following data:
	 * <ul>
	 *  <li> level SEVERE - exception stack traces reported by {@link PrologControl#printStackTrace(Throwable)}
	 *  <li> level WARNING - nothing
	 *  <li> level INFO - nothing
	 *  <li> level CONFIG - nothing
	 *  <li> level FINE - logs executed  {@link Predicate}, their arguments . Intercepted exception stack traces.
	 *  <li> level FINER - info about engine try, retry, trust, fail and executed {@link Operation}
	 *  <li> level FINEST - nothing
	 * </ul>
	 *
	 *
	 * @author semenov
	 *
	 */
	class PrologLogger
	{
	private:
		Logger* const  logger;
		std::vector<Predicate*> stackFrame;
		int stackTop = 0;
		bool normalExecution = true;
		StringBuilder* const  stringBuilder = new StringBuilder(2048);
		std::vector<char> indent;
  public:
	  bool loggerEnable = false;
		virtual Logger* getJLogger();
		PrologLogger(Logger* logger);
		void init(ChoicePointFrame* initialChoicePointFrame);
		void fail(Operation next, ChoicePointFrame* entry);


#endif	//#ifndef PROLOGLOGGER
