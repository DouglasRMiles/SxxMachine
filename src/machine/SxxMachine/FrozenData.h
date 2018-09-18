#pragma once

#include "Prolog.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
}

namespace SxxMachine
{

	class FrozenData
	{
  private:
	  Term *goals = Prolog::True;
	  Term *attrs = Prolog::Nil;

  public:
	  virtual ~FrozenData()
	  {
		  delete goals;
		  delete attrs;
	  }

	  FrozenData();

	  virtual Term *getGoals();

	  virtual Term *setGoals(Term *goals);

	  virtual Term *getAttrs();

	  virtual void setAttrs(Term *attrs);
	};
}
