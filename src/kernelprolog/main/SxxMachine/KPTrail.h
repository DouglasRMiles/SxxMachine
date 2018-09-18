#ifndef KPTRAIL
#define KPTRAIL

#include <string>
#include <vector>
#include <any>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }

namespace SxxMachine
{


	/**
	 * Implements a stack of undo actions for backtracking, and in particular,
	 * resetting a Var's Ref fiels to unbound (i.e. this).
	 * 
	 * 
	 * @see Term
	 * @see Var
	 */
	class KPTrail
	{
  public:
	  void push(Term* var);

	  Term* pop();

	  std::vector<Term*> stack = std::vector<Term*>();

  private:
	  std::any remove(const int& i);

  public:
	  virtual bool isEmpty();

	  virtual int size();

  private:
	  void add(Term* x);

  public:
//JAVA TO C++ CONVERTER TODO TASK: No base class can be determined:
	  KPTrail(); //super();

	  virtual std::string name();

	  virtual std::string pprint();

	  /**
	   * Used to undo bindings after unification, if we intend to leave no side
	   * effects.
	   */

	  // synchronized
	  void unwind(const int& to);

	  virtual std::string stat();
	};

}


#endif	//#ifndef KPTRAIL
