using namespace std;

#include "ListViewTerm.h"
#include "Trail.h"
#include "Term.h"
#include "OpVisitor.h"
#include "Prolog.h"
#include "TermData.h"

namespace SxxMachine
{

	int ListViewTerm::MutableMarkerForLists::type()
	{
		return TYPE_LIST;
	}

	bool ListViewTerm::MutableMarkerForLists::unifyImpl(Term *t, Trail *trail)
	{
		return false;
	}

	bool ListViewTerm::MutableMarkerForLists::isImmutable()
	{
		return false;
	}

	wstring ListViewTerm::MutableMarkerForLists::name()
	{
		return "";
	}

	void ListViewTerm::MutableMarkerForLists::toStringImpl(int printFlags, StringBuilder *sb)
	{
	}

	int ListViewTerm::MutableMarkerForLists::compareTo(Term *o)
	{
		return 0;
	}

	int ListViewTerm::MutableMarkerForLists::termHashCodeImpl()
	{
		return System::identityHashCode(this);
	}

	bool ListViewTerm::MutableMarkerForLists::equalsTerm(Term *obj, OpVisitor *comparator)
	{
		return this == obj;
	}

	wstring ListViewTerm::pprint()
	{
		return ListTerm::toQuotedString();
	}

	bool ListViewTerm::isImmutable()
	{
		return false;
	}

Term *const ListViewTerm::NOT_IMMUTABLE = new MutableMarkerForLists();

	ListViewTerm::ListViewTerm(Term *head) : ListTerm(head, NOT_IMMUTABLE), list(vector<>()), index(0)
	{
		//this.argz = VA(head, NOT_IMMUTABLE);
		this->list.push_back(head);
	}

	ListViewTerm::ListViewTerm(vector<Term*> &list, int index) : ListTerm(list.get(index), NOT_IMMUTABLE), list(list), index(index)
	{
		//this.argz = VA(list.get(index), NOT_IMMUTABLE);//super(list.get(index), NOT_IMMUTABLE); // makes isImmutable to return false
	}

	ListTerm *ListViewTerm::add(Term *term)
	{
		this->list.push_back(term);
		return this;
	}

	Term *ListViewTerm::cdr()
	{
		if (this->next != nullptr)
		{
			return this->next;
		}
		else if (this->index + 1 < this->list.size())
		{
			return this->next = new ListViewTerm(this->list, this->index + 1);
		}
		else
		{
			return Prolog::Nil;
		}
	}

	Term *ListViewTerm::copyImpl(IdentityHashMap<any, Term*> *copyHash, int deeply)
	{
		Term *result = Prolog::Nil;
		for (int i = this->list.size() - 1; i >= this->index; i--)
		{
			result = TermData::CONS(this->list[i]->copy(copyHash, deeply), result);
		}
		return result;
	}

	Term *ListViewTerm::nth0(int nth)
	{
		return this->list[this->index + nth];
	}

	int ListViewTerm::length()
	{
		return this->list.size() - this->index;
	}

	vector ListViewTerm::toJava()
	{
		return Collections::unmodifiableList(this->list.subList(this->index, this->list.size()));
	}

	bool ListViewTerm::isGround()
	{
		for (int i = this->list.size() - 1; i >= this->index; i--)
		{
			if (!this->list[i]->isGround())
			{
				return false;
			}
		}
		return true;
	}

	Term *ListViewTerm::car()
	{
		// TODO Auto-generated method stub
		return nth0(0);
	}

	void ListViewTerm::setCar(Term *t)
	{
		Prolog::Break("SETCAR");
		argz[0] = t;

	}

	void ListViewTerm::setCdr(Term *t)
	{
		Prolog::Break("SETCDR");
		argz[1] = t;
	}

	std::vector<Term*> ListViewTerm::args()
	{
		// TODO Auto-generated method stub
		Prolog::Break("ARGS");
		return argz;
	}

	wstring ListViewTerm::name()
	{
		return Prolog::SYM_DOT->name();
	}

	Term *ListViewTerm::toClone() throw(CloneNotSupportedException)
	{
		return new ListViewTerm(list,index);
	}

	int ListViewTerm::arityOrType()
	{
		return type();
	}
}
