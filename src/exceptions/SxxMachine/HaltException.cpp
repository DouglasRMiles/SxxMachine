using namespace std;

#include "HaltException.h"

namespace SxxMachine
{

	HaltException::HaltException(const int& status) : SystemException("halt(" + status + ")"), status(status)
	{
	}

	int HaltException::getStatus()
	{
	  return this->status;
	}
}
