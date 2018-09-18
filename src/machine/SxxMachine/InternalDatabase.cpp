using namespace std;

#include "InternalDatabase.h"
#include "Term.h"
#include "../../exceptions/SxxMachine/SystemException.h"

namespace SxxMachine
{

	InternalDatabase::InternalDatabase() : InternalDatabase(DEFAULT_SIZE)
	{
	}

	InternalDatabase::InternalDatabase(const int& n) : reusableIndices(list<int>())
	{
		this->maxContents = n;
		this->buffer = std::vector<Term*>(min(this->maxContents, DEFAULT_SIZE));
		this->top = -1;
	}

	InternalDatabase* InternalDatabase::copyInternalDatabase(const bool& deepCopy, IdentityHashMap<any, Term*>* copyHash)
	{
		   return new InternalDatabase(this, deepCopy, copyHash);
	}

	InternalDatabase::InternalDatabase(InternalDatabase* src, const bool& deepCopy, IdentityHashMap<any, Term*>* copyHash) : reusableIndices(list<int>(src->reusableIndices))
	{
		this->maxContents = src->maxContents;
		this->buffer = std::vector<Term*>(src->buffer.size());
		this->top = src->top;
		int deeply = (deepCopy?Term::COPY_DEEPLY:0);
		if(deepCopy)
		{
			for(int i = 0; i <= this->top; i++)
			{
				Term* s = src->buffer[i];
				if(s != nullptr)
				{
					this->buffer[i] = s->copy(copyHash, deeply);
				}
			}
		} else if(0 <= this->top)
		{
			System::arraycopy(src->buffer, 0, this->buffer, 0, this->top + 1);
		}
	}

	int InternalDatabase::insert(Term* t)
	{
		try
		{
			if(this->reusableIndices.empty())
			{
				this->buffer[++this->top] = t;
				return this->top;
			} else
			{
				int i = this->reusableIndices.pop_front();
				this->buffer[i] = t;
				return i;
			}
		} catch(const out_of_range& e)
		{
			if(this->maxContents <= this->buffer.size())
			{
				throw SystemException("internal database capacity reached");
			}
			int len = this->buffer.size();
			std::vector<Term*> new_buffer(min(len + 10000, this->maxContents));
			System::arraycopy(this->buffer, 0, new_buffer, 0, len);
			this->buffer = new_buffer;
			this->buffer[this->top] = t;
			return this->top;
		}
	}

	Term* InternalDatabase::get(const int& i)
	{
		return this->buffer[i];
	}

	Term* InternalDatabase::erase(const int& i)
	{
		Term* t = this->buffer[i];
		this->buffer[i] = nullptr;
		this->reusableIndices.push_back(i);
		return t;
	}

	bool InternalDatabase::empty()
	{
		return this->top == -1;
	}

	void InternalDatabase::show()
	{
	if(empty())
	{
		cout << "{internal database is empty!}" << endl;
	}
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
	cout << "{reusable indices: " << this->reusableIndices.toString() << "}" << endl;
	for(int i = 0; i <= this->top; i++)
	{
		cout << "internal database[" << i << "]: ";
		cout << this->buffer[i] << endl;
	}
	}
}
