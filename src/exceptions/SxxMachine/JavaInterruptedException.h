#pragma once

#include <stdexcept>

namespace SxxMachine
{

	/**
	 * Thown when '$print_stack_trace/1' receives an InterruptedException
	 *
	 * @author Shawn Pearce (sop@google.com)
	 */
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("serial") public class JavaInterruptedException extends RuntimeException
	class JavaInterruptedException : public std::runtime_error
	{
  public:
	  JavaInterruptedException(InterruptedException *cause);
	};

}
