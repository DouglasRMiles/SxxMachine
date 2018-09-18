#pragma once

#include <string>
#include <stdexcept>

namespace SxxMachine
{

	/** Indicates compiling did not succeed. */
	class CompileException : public std::runtime_error
	{
  public:
	  CompileException(const std::string &message);
	  CompileException(std::runtime_error cause);
	  CompileException(const std::string &message, std::runtime_error cause);
	};

}
