#ifndef O1QUEUE
#define O1QUEUE

#include <string>
#include <vector>
#include <any>
#include "exceptionhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
class InterruptedException;
class CloneNotSupportedException;

namespace SxxMachine
{


	/**
	  Generic dynamic Queue with (amortized) O(1)
	  enq/deq (add and remove) operations
	*/
	class O1Queue
	{
	public:
		static constexpr int MIN_QUEUE = 4;

		static const int MAX_QUEUE = 1 << 24;

	private:
		int head = 0, tail = 0;

		bool busy = false;

		std::vector<std::any> queue;

	public:
		O1Queue(const int& size);

		O1Queue();

		O1Queue(std::vector V);

		// synchronized
	private:
		void makeIt(const int& size);

		int count();

		/**
		Dynamically resizes the queue
		*/
		bool requeue(const std::string& Mes);

		void enterCritical();

		void exitCritical();

		/**
		Adds an element to the end of the queue
		*/
		// synchronized
	public:
		bool enq(std::any V);

		/**
		Removes the first element of the queue 
		*/
		// synchronized
		std::any deq();

	private:
		int inc(const int& val);

		// synchronized
	public:
		bool isEmpty();

		// synchronized
		virtual std::vector toVector();

		virtual Iterator* toEnumeration();

		virtual std::string toString();

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
		virtual O1Queue* toClone();

	};

	class QueueIterator
	{
	public:
		virtual ~QueueIterator()
		{
			delete Q;
		}

		QueueIterator(O1Queue* Q);

	private:
		O1Queue* Q;

	public:
		virtual std::any getNext();
	};

}


#endif	//#ifndef O1QUEUE
