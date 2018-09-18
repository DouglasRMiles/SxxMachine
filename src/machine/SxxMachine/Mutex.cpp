using namespace std;

#include "Mutex.h"

namespace SxxMachine
{

java::util::concurrent::ConcurrentMap<wstring, java::util::concurrent::locks::Lock*>* const  Mutex::LOCKS = new java::util::concurrent::ConcurrentHashMap<wstring, java::util::concurrent::locks::Lock*>();

	Lock* Mutex::getInstance()
	{
		return new ReentrantLock();
	}

	Lock* Mutex::getInstance(const wstring& name)
	{
		Lock* lock = LOCKS->get(name);
		if(lock != nullptr)
		{
			return lock;
		}
		Lock* newLock = getInstance();
		lock = LOCKS->putIfAbsent(name, newLock);
		if(lock == nullptr)
		{
			lock = newLock;
		}
		return lock;
	}
}
