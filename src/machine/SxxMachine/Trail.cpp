using namespace std;

#include "Trail.h"
#include "Undoable.h"
#include "Prolog.h"

namespace SxxMachine
{

	Trail::Trail(Prolog* m) : Trail(m,2048)
	{
	}

	Trail::Trail(Prolog* m, const int& pageSize) : Trail(m, pageSize, 1000)
	{
	}

	Trail::Trail(Prolog* m, const int& pageSize, const int& pages) : buffersList(new ArrayDeque<std::vector<Undoable*> >(pages)), pageSize(pageSize), mach(m)
	{
		this->buffer = std::vector<Undoable*>(pageSize);
		this->top_RenamedTODO = -1;
		this->base = 0;
	}

	void Trail::init()
	{
		deleteAll();
	}

	void Trail::push(Undoable* t)
	{
		if(++this->top_RenamedTODO >= this->pageSize)
		{
			this->buffersList->addLast(this->buffer);
			this->buffer = std::vector<Undoable*>(this->pageSize);
			this->top_RenamedTODO = 0;
			this->base += this->pageSize;
		}
		this->buffer[this->top_RenamedTODO] = t;
	}

	Undoable* Trail::pop()
	{
		Undoable* t = this->buffer[this->top_RenamedTODO];
		this->buffer[this->top_RenamedTODO--] = nullptr;
		if(this->top_RenamedTODO < 0 && this->base > 0)
		{
			this->buffer = this->buffersList->pollLast();
			this->top_RenamedTODO = this->buffer.size() - 1;
			this->base -= this->pageSize;
		}
		return t;
	}

	void Trail::deleteAll()
	{
		this->buffersList->clear();
		this->buffer = std::vector<Undoable*>(this->buffer.size());
		this->top_RenamedTODO = -1;
		this->base = 0;
	}

	bool Trail::empty()
	{
		return this->base == 0 && this->top_RenamedTODO == -1;
	}

	int Trail::max()
	{
		return this->base + this->pageSize;
	}

	int Trail::top()
	{
		return this->base + this->top_RenamedTODO;
	}

	void Trail::unwind(const int& i)
	{
		while(this->base + this->top_RenamedTODO > i)
		{
			Undoable* t = this->buffer[this->top_RenamedTODO];
			this->buffer[this->top_RenamedTODO--] = nullptr;
			if(this->top_RenamedTODO < 0 && this->base > 0)
			{
				this->buffer = this->buffersList->pollLast();
				this->top_RenamedTODO = this->pageSize-1;
				this->base -= this->pageSize;
			}
			t->undo();
		}
	}

	Prolog* Trail::getProlog()
	{
		// TODO Auto-generated method stub
		return this->mach;
	}
}
