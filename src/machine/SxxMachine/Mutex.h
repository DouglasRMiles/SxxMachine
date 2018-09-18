#ifndef MUTEX
#define MUTEX

#include <string>

namespace SxxMachine
{

	class Mutex
	{

	private:
		static ConcurrentMap<std::string, Lock*>* const  LOCKS;

	public:
		static Lock* getInstance();

		static Lock* getInstance(const std::string& name);
	};

}


#endif	//#ifndef MUTEX
