using namespace std;

#include "CompileException.h"

namespace SxxMachine
{

	CompileException::CompileException(const wstring &message) : Exception(message)
	{
	}

	CompileException::CompileException(runtime_error cause) : Exception(cause.getMessage(), cause)
	{
	}

	CompileException::CompileException(const wstring &message, runtime_error cause) : Exception(message, cause)
	{
	}
}
