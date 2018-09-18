#ifndef CHOICEPOINTFRAME
#define CHOICEPOINTFRAME

#include "Operation.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class Term; }

// Copyright 2011 Google Inc. All Rights Reserved.
namespace SxxMachine
{

	//import java.util.function.BiConsumer;



	template<typename T, typename U>
	class BiConsumer
	{

		/**
		 * Performs this operation on the given arguments.
		 *
		 * @param t the first input argument
		 * @param u the second input argument
		 */
	public:
		virtual void accept(T t, U u) = 0;

		/**
		 * Returns a composed {@code BiConsumer} that performs, in sequence, this
		 * operation followed by the {@code after} operation. If performing either
		 * operation throws an exception, it is relayed to the caller of the
		 * composed operation.  If performing this operation throws an exception,
		 * the {@code after} operation will not be performed.
		 *
		 * @param after the operation to perform after this operation
		 * @return a composed {@code BiConsumer} that performs in sequence this
		 * operation followed by the {@code after} operation
		 * @throws NullPointerException if {@code after} is null
		 */
//JAVA TO C++ CONVERTER TODO TASK: There is no equivalent in C++ to Java default interface methods:
//		default BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> after)
	//	{
	//		Objects.requireNonNull(after);
	//
	//		return (l, r) ->
	//		{
	//			accept(l, r);
	//			after.accept(l, r);
	//		};
	//	}
	};

	/**
	 * Choice point frame.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class ChoicePointFrame
	{
	  //public final Term[] AREGS = null;
  public:
	  long long timeStamp = 0;
	  Operation cont; // continuation goal
	  Operation bp; // next clause
	  int tr = 0; // trail pointer
	  int b0 = 0; // cut point
	  Operation ownerPredicate; // used in PrologLogger
	  int loggerStackTop = 0; // used in PrologLogger
//JAVA TO C++ CONVERTER NOTE: Fields cannot have the same name as methods:
	  BiConsumer<ChoicePointFrame*, Prolog*>* restore_RenamedTODO; // method to restore the engine from stack
	  std::vector<Term*> AREGS;
	  int arity = -1;
	  //Term[] aregs;
	  //public ChoicePointFrame prior;
		virtual ~ChoicePointFrame()
		{
			delete restore;
		}

		virtual void restore(Prolog* engine);

		std::string toString() override;
	};

}


#endif	//#ifndef CHOICEPOINTFRAME
