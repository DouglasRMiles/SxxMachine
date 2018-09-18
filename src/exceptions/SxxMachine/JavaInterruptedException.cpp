using namespace std;

#include "JavaInterruptedException.h"

namespace SxxMachine
{

	JavaInterruptedException::JavaInterruptedException(InterruptedException *cause) : RuntimeException(cause)
	{
	}
}
