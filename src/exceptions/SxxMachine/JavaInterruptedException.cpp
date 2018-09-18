using namespace std;

#include "JavaInterruptedException.h"
#include "InterruptedException.h"

namespace SxxMachine
{

	JavaInterruptedException::JavaInterruptedException(InterruptedException* cause) : RuntimeException(cause)
	{
	}
}
