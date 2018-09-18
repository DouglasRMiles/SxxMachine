using namespace std;

#include "Trail.h"
#include "Undoable.h"
#include "Prolog.h"

namespace SxxMachine
{

	Trail::Trail(Prolog *m) : Trail(m,2048)
	{
	}

	Trail::Trail(Prolog *m, int pageSize) : Trail(m, pageSize, 1000)
	{
	}

	Trail::Trail(Prolog *m, int pageSize, int pages) : buffersList(new ArrayDeque<std::vector<Undoable*>>(pages)), pageSize(pageSize), mach(m)
	{
		this->buffer = std::vector<Undoable*>(pageSize);
		this->top_Renamed = -1;
		this->base = 0;
	}

	void Trail::init()
	{
		deleteAll();
	}

	void Trail::push(Undoable *t)
	{
		if (++this->top_Renamed >= this->pageSize)
		{
			this->buffersList->addLast(this->buffer);
			this->buffer = std::vector<Undoable*>(this->pageSize);
			this->top_Renamed = 0;
			this->base += this->pageSize;
		}
		this->buffer[this->top_Renamed] = t;
	}

	Undoable *Trail::pop()
	{
		Undoable *t = this->buffer[this->top_Renamed];
		this->buffer[this->top_Renamed--] = nullptr;
		if (this->top_Renamed < 0 && this->base > 0)
		{
			this->buffer = this->buffersList->pollLast();
			this->top_Renamed = this->buffer.size() - 1;
			this->base -= this->pageSize;
		}
		return t;
	}

	void Trail::deleteAll()
	{
		this->buffersList->clear();
		this->buffer = std::vector<Undoable*>(this->buffer.size());
		this->top_Renamed = -1;
		this->base = 0;
	}

	bool Trail::empty()
	{
		return this->base == 0 && this->top_Renamed == -1;
	}

	int Trail::max()
	{
		return this->base + this->pageSize;
	}

	int Trail::top()
	{
		return this->base + this->top_Renamed;
	}

	void Trail::unwind(int i)
	{
		while (this->base + this->top_Renamed > i)
		{
			Undoable *t = this->buffer[this->top_Renamed];
			this->buffer[this->top_Renamed--] = nullptr;
			if (this->top_Renamed < 0 && this->base > 0)
			{
				this->buffer = this->buffersList->pollLast();
				this->top_Renamed = this->pageSize-1;
				this->base -= this->pageSize;
			}
			t->undo();
		}
	}

	Prolog *Trail::getProlog()
	{
		// TODO Auto-generated method stub
		return this->mach;
	}
}
