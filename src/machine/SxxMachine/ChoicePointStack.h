#ifndef CHOICEPOINTSTACK
#define CHOICEPOINTSTACK

#include <vector>
#include <limits>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Trail; }
namespace SxxMachine { class ChoicePointFrame; }
namespace SxxMachine { class Operation; }
namespace SxxMachine { template<typename Ttypename U>class BiConsumer; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class Term; }

namespace SxxMachine
{

	//import java.util.function.BiConsumer;
	/**
	 * Choice point frame stack.<br>
	 * The <code>CPFStack</code> class represents a stack of choice point frames.<br>
	 * Each choice point frame has the following fields:
	 * <ul>
	 * <li><em>arguments</em>
	 * <li><em>continuation goal</em>
	 * <li><em>next clause</em>
	 * <li><em>trail pointer</em>
	 * <li><em>cut point</em>
	 * <li><em>time stamp</em>
	 * </ul>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0 
	 */
	class ChoicePointStack final
	{
	  /** Trail of the associated Prolog instance. */
  private:
	  Trail* const  trail;
	  /** Top of the stack. */
  public:
//JAVA TO C++ CONVERTER NOTE: Fields cannot have the same name as methods:
	  ChoicePointFrame* top_RenamedTODO;
	  /**
	   * Current level/depth of the stack.
	   * <p>
	   * This matches the length of the chain stored in {@link #top}.
	   */
  private:
	  int level = 0;
	  std::vector<ChoicePointFrame*> frames;
  public:
	  virtual ~ChoicePointStack()
	  {
		  delete trail;
		  delete top;
	  }

	  ChoicePointStack(Trail* trail);
  private:
	  void doubleFramesCapacity();

  public:
	  ChoicePointFrame* push(Prolog* engine, Operation next, BiConsumer<ChoicePointFrame*, Prolog*>* restore);
	   ChoicePointFrame* push(Prolog* engine, const int& arity, Operation next);
	  ChoicePointFrame* push(Prolog* engine, std::vector<Term*>& AREGS, const int& arity, Operation next);
  private:
	  static void restoreN(ChoicePointFrame* frame, Prolog* engine);

  public:
	  static void restore0(ChoicePointFrame* frame, Prolog* engine);

	  /** Discards all choice points after the value of <code>i</code>. */
	  void cut(const int& i);
	  /** Discards the top of choice points. */
	  void delete_RenamedTODO();
	  /** Discards all choice points. */
	  void init();

  private:
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("unused") private void updateTrailTimeStamp()
	  void updateTrailTimeStamp();
	  /** Get the current top of the stack. */
  public:
	  int top();
	  /** Get the maximum number of choice points permitted on the stack. */
	  int max();
	  /** Shows the contents of this <code>CPFStack</code>. */
	/*  public void show() {
	    if (top == null) {
	      System.out.println("{choice point stack is empty!}");
	      return;
	    }
	    for (ChoicePointFrame e = top; e != null; e = e.prior) {
	      System.out.println(e);
	    }
	  }*/
	};

}


#endif	//#ifndef CHOICEPOINTSTACK
