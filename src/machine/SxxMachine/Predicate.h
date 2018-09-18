#ifndef PREDICATE
#define PREDICATE

#include "Operation.h"
#include "TermData.h"
#include <string>
#include <vector>
#include <stdexcept>
#include <typeinfo>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class PrologException; }
class StringBuilder;
class Field;

namespace SxxMachine
{

	/**
	 * Superclass of any predicate's implementation class.
	 * <p>
	 * Concrete implementations must provide a definition of the Operation's
	 * {@link Operation#exec(Prolog)} method. On a successful execution the
	 * method must return {@link #cont}.
	 * <p>
	 * To be compatible with the {@code am2j} compiler implementations must
	 * define a constructor matching the signature:
	 * <pre>
	 *   public ClassName(Term arg1, Term arg2, ..., Operation cont) {
	 *     // save arg1, arg2
	 *     this.cont = cont;
	 *   }
	 * </pre>
	 */
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings({"rawtypes","unused"}) public abstract class Predicate extends TermData implements Operation
	class Predicate : public TermData, public Operation
	{

  protected:
	  std::string name = ""; //getClass().getName();
	  /** Holds the argument terms of this <code>StructureTerm</code>. */
  public:
	  std::vector<Term*> LARG;

	  virtual int type();
	  Operation exec(Prolog* engine) throw(PrologException) override;

	  virtual std::string predName();

	  //abstract public int predArity(); 
	  virtual int predArity();
	  /**
	   * @param engine
	   */
	  virtual void push_to_engine(Prolog* engine);

	  /**
	   * Holds the continuation goal of this predicate.
	   * <p>
	   * In a Prolog program this is the next operation to perform if this operation
	   * was executed successfully.
	   */
	  Operation cont;
	//  protected Term[] LARG;

	  Predicate();
	  Predicate(const std::string& name, std::vector<Term*>& _args, Operation cont);

	  std::string toString() override;

	  virtual void toString(StringBuilder* sb);

	  virtual void toRest(const std::string& fixitive, StringBuilder* sb);

	  virtual void toStringLegacy(StringBuilder* sb);


  public:
	  class P0;
  public:
	  class P1;


  public:
	  class P2;
  public:
	  class P3;
  public:
	  class P4;

	public:
		class P5;
	};

}
  class Predicate::P0 : public Predicate
  {


public:
	int predArity() override;

	void toString(StringBuilder* sb) override;

	void push_to_engine(Prolog* engine) override;
  };
  class Predicate::P1 : public Predicate
  {

public:
	int predArity() override;

	void toString(StringBuilder* sb) override;

	void push_to_engine(Prolog* engine) override;
  };
  class Predicate::P2 : public Predicate
  {

public:
	P2(const std::string& name, std::vector<Term*>& _args, Operation cont);
	int predArity() override;

	P2();

	void toString(StringBuilder* sb) override;

	void push_to_engine(Prolog* engine) override;
  };
  class Predicate::P3 : public Predicate
  {


public:
	int predArity() override;
	void toString(StringBuilder* sb) override;

	void push_to_engine(Prolog* engine) override;

  };
  class Predicate::P4 : public Predicate
  {


public:
	void push_to_engine(Prolog* engine) override;

  };
	class Predicate::P5 : public Predicate
	{

  public:
	  void push_to_engine(Prolog* engine) override;

	  int predArity() = 0; override override;
	};


#endif	//#ifndef PREDICATE
