#pragma once

#include "SystemException.h"

namespace SxxMachine
{

	class HaltException : public SystemException
	{
  private:
	  const int status;
  public:
	  HaltException(int status);
	  virtual int getStatus();
	};

}
