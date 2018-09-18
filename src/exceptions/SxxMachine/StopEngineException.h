#pragma once

#include <string>
#include <stdexcept>

namespace SxxMachine
{

	/**
	 * Created by semenov on 04.05.2017.
	 */
	class StopEngineException : public std::runtime_error
	{
	public:
		StopEngineException();
		StopEngineException(const std::string &message);
		StopEngineException(const std::string &message, std::runtime_error cause);
		StopEngineException(std::runtime_error cause);
		StopEngineException(const std::string &message, std::runtime_error cause, bool enableSuppression, bool writableStackTrace);
	};

}
