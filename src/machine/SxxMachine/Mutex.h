#pragma once

#include <string>

namespace SxxMachine
{

	class Mutex
	{

	private:
		static ConcurrentMap<std::string, Lock*> *const LOCKS;

	public:
		static Lock *getInstance();

		static Lock *getInstance(const std::string &name);
	};

}
