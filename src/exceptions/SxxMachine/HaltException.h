#ifndef HALTEXCEPTION
#define HALTEXCEPTION

#include "SystemException.h"

namespace SxxMachine
{

	class HaltException : public SystemException
	{
  private:
	  const int status;
  public:
	  HaltException(const int& status);
	  virtual int getStatus();
	};

}


#endif	//#ifndef HALTEXCEPTION
