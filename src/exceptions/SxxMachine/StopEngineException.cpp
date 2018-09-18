using namespace std;

#include "StopEngineException.h"

namespace SxxMachine
{

	StopEngineException::StopEngineException()
	{
	}

	StopEngineException::StopEngineException(const wstring& message) : RuntimeException(message)
	{
	}

	StopEngineException::StopEngineException(const wstring& message, runtime_error cause) : RuntimeException(message, cause)
	{
	}

	StopEngineException::StopEngineException(runtime_error cause) : RuntimeException(cause)
	{
	}

	StopEngineException::StopEngineException(const wstring& message, runtime_error cause, const bool& enableSuppression, const bool& writableStackTrace) : RuntimeException(message, cause, enableSuppression, writableStackTrace)
	{
	}
}
