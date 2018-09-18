using namespace std;

#include "O1Queue.h"
#include "../../io/SxxMachine/IO.h"
#include "../../../machine/SxxMachine/Term.h"
#include "InterruptedException.h"
#include "CloneNotSupportedException.h"

namespace SxxMachine
{

	O1Queue::O1Queue(const int& size)
	{
		makeIt(size);
	}

	O1Queue::O1Queue() : O1Queue(0)
	{
	}

	O1Queue::O1Queue(vector V) : O1Queue(V.size() + MIN_QUEUE)
	{
		for(int i = 0; i < V.size(); i++)
		{
			enq(V[i]);
		}
	}

	void O1Queue::makeIt(const int& size)
	{
		size = (size < MIN_QUEUE) ? MIN_QUEUE : size;
		queue = std::vector<any>(size);
		head = tail = 0;
		// busy=false;
	}

	int O1Queue::count()
	{
		return (head <= tail) ? tail - head : queue.size() - head + tail;
	}

	bool O1Queue::requeue(const wstring& Mes)
	{
		int newSize = 2 * count();
		if(newSize > MAX_QUEUE || newSize < MIN_QUEUE)
		{
			return false;
		}
		IO::trace(Mes + "!!! " + toString());
		std::vector<any> nqueue(newSize);
		int j = 0;
		for(int i = head; i != tail; i = inc(i))
		{
			nqueue[j++] = queue[i];
		}
		queue = nqueue;
		head = 0;
		tail = j;
		return true;
	}

	void O1Queue::enterCritical()
	{
		while(busy)
		{
			try
			{
				wait();
			} catch(const InterruptedException& e)
			{
			}
		}
		busy = true;
	}

	void O1Queue::exitCritical()
	{
		busy = false;
		notifyAll();
	}

	bool O1Queue::enq(any V)
	{
		// enterCritical();
		if(inc(tail) == head)
		{ // full !!!
			if(!requeue("expanding"))
			{
				IO::errmes("Warning: queue overflow at:" + V);
				return false;
			}
		}
		queue[tail] = V;
		tail = inc(tail);
		// exitCritical();
		return true;
	}

	any O1Queue::deq()
	{
		// enterCritical();
		if(tail == head) // empty !!!
		{
			return nullptr;
		}
		if(4 * count() < queue.size())
		{
			requeue("shrinking");
		}
		any V = queue[head];
		head = inc(head);
		// exitCritical();
		return V;
	}

	int O1Queue::inc(const int& val)
	{
		return (val + 1) % queue.size();
	}

	bool O1Queue::isEmpty()
	{
		bool empty;
		// enterCritical();
		empty = tail == head;
		// exitCritical();
		return empty;
	}

	vector O1Queue::toVector()
	{
		// enterCritical(); DEADLOCKS!
		vector v = vector();
		for(int i = head; i != tail; i = inc(i))
		{
			v.push_back(queue[i]);
		}
		// exitCritical();
		return v;
	}

	Iterator* O1Queue::toEnumeration()
	{
		return toVector().begin();
	}

	wstring O1Queue::toString()
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		return to_string(count()) + "/" + queue.size() + "=>" + toVector().toString();
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	O1Queue* O1Queue::toClone()
	{
		O1Queue* R = nullptr;
		try
		{
			Term::soopsy();
			R = static_cast<O1Queue*>(__super::clone());
		} catch(const CloneNotSupportedException& e)
		{
			IO::errmes("O1Queue:toClone() " + e);
		}
		return R;
	}

	QueueIterator::QueueIterator(O1Queue* Q)
	{
		this->Q = Q->toClone();
	}

	any QueueIterator::getNext()
	{
		return Q->deq();
	}
}
