#ifndef REDUCTIONLIMITEXCEPTION
#define REDUCTIONLIMITEXCEPTION

#include "RuntimeException.h"
#include <stdexcept>

namespace SxxMachine
{

	/**
	 * Thrown if a goal exceeds the configured reduction limit.
	 *
	 * @see SxxMachine.PrologControl#setReductionLimit(long)
	 */
	class ReductionLimitException : public std::runtime_error
	{
  private:
	  static constexpr long long serialVersionUID = 1LL;

  public:
	  ReductionLimitException(long long limit);
	};

}


#endif	//#ifndef REDUCTIONLIMITEXCEPTION
