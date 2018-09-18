#ifndef PROLOGEXCEPTION
#define PROLOGEXCEPTION

#include "RuntimeException.h"
#include <string>
#include <vector>
#include <stdexcept>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }
namespace SxxMachine { class Operation; }
class StringBuilder;

namespace SxxMachine
{



	/**
	 * The superclass of classes for Prolog exceptions.<br>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class PrologException : public std::runtime_error
	{
	  /** Constructs a new Prolog exception. */
  public:
	  PrologException();

	  PrologException(const std::string& s);

	  virtual std::string getMessage() = 0;
	  /** Returns the message term of this object. */
	  virtual Term* getMessageTerm() = 0;

  private:
	  std::vector<Operation> prologStackElement;

  public:
	  virtual std::vector<Operation> getPrologStackTrace();

	  virtual void setPrologStackTrace(std::vector<Operation>& stack);

	  virtual bool hasPrologStackTrace();

	  void printStackTrace(PrintStream* s) override;

  private:
	  StringBuilder* printOp(Operation o);

  public:
	  void printStackTrace(PrintWriter* s) override;
	};

}


#endif	//#ifndef PROLOGEXCEPTION
