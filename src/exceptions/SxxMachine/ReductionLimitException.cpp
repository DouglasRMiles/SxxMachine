using namespace std;

#include "ReductionLimitException.h"

namespace SxxMachine
{

	ReductionLimitException::ReductionLimitException(long long limit) : RuntimeException(String::format("exceeded reduction limit of %d", limit))
	{
	}
}
