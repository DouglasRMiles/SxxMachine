using namespace std;

#include "ListTerm.h"
#include "Term.h"
#include "Trail.h"
#include "Prolog.h"
#include "SymbolTerm.h"
#include "StringBuilder.h"

namespace SxxMachine
{

	Term* ListTerm::ArgNoDeRef(const int& i)
	{
		return argz[i];
	}

	bool ListTerm::isCons()
	{
		return true;
	}

	bool ListTerm::isAtomicValue()
	{
		return false;
	}

	int ListTerm::containsTermImpl(Term* variableTerm, Comparator* comparison)
	{
		return car()->containsTerm(variableTerm, comparison) + cdr()->containsTerm(variableTerm, comparison);
	}

	ListTerm::ListTerm()
	{
		//super(s);
	}

	ListTerm::ListTerm(Term* _car, Term* _cdr)
	{
	//	super(".");
		//		// TODO assert _car!=null;
		//    	// TODO assert _cdr!=null;
		//    	//this.car = _car;
		//		//this.cdr = _cdr;
		argz = VA({ _car, _cdr });
		//		//this.immutable = this.argz[0].isImmutable() && this.argz[1].isImmutable();
	}

	Term* ListTerm::car()
	{
		return this->argz[0];
	}

	Term* ListTerm::cdr()
	{
		return this->argz[1];
	}

	bool ListTerm::unifyImpl(Term* t, Trail* trail)
	{
		Term* p = this;
		t = t->dref();
		while(t->isCons() && p->isCons() && p->car()->unify(t->car(), trail))
		{
			p = p->cdr()->dref();
			t = t->cdr()->dref();
		}
		if(t->isVar())
		{
			return t->bind(p, trail);
		}
		if(p->isVar())
		{
			return p->bind(t, trail);
		}
		return !(t->isCons()) && !(p->isCons()) && p->unify(t, trail);
	}

	void ListTerm::setCar(Term* t)
	{
		this->argz[0] = t;
	}

	void ListTerm::setCdr(Term* t)
	{
		this->argz[1] = t;
	}

	int ListTerm::type()
	{
		return TYPE_LIST;
	}

	bool ListTerm::convertible(type_info type)
	{
		return convertible(vector::typeid, type);
	}

	Term* ListTerm::copyImpl(IdentityHashMap<any, Term*>* copyHash, const int& deepCopy)
	{
		if(this->isImmutable())
		{
			return this;
		}
		Deque<ListTerm*>* stack = new ArrayDeque<ListTerm*>();
		Term* p = this;
		while(p->isCons() && !p->asListTerm()->immutable)
		{
			ListTerm* lt = static_cast<ListTerm*>(p);
			stack->push(lt);
			p = lt->cdr()->dref();
		}
		p = p->copy(copyHash, deepCopy);
		while(!stack->isEmpty())
		{
			ListTerm* lt = stack->pop();
			p = CONS(lt->car()->copy(copyHash, deepCopy), p);
		}
		return p;
	}

	bool ListTerm::isGround()
	{
		return this->argz[0]->isGround() && cdr()->isGround();
	}

	int ListTerm::arity()
	{
		return 2;
	}

	std::vector<Term*> ListTerm::args()
	{
		return argz;
	}

	Term* ListTerm::functor()
	{
		return Prolog::SYM_DOT;
	}

	wstring ListTerm::name()
	{
		return Prolog::SYM_DOT->name();
	}

	Term* ListTerm::arg0(const int& nth)
	{
		return nth0(nth);
	}

	Term* ListTerm::nth0(const int& nth)
	{
		Term* t = this;
		int old_nth = nth;
		while((t->isCons()) && 0 < nth)
		{
			nth--;
			t = (t)->cdr()->dref();
		}
		if((t->isCons()))
		{
			return t->car();
		}
		throw out_of_range(old_nth);
	}

	int ListTerm::length()
	{
		int count = 0;
		Term* t = this;
		while((t->isCons()))
		{
			count++;
			t = (t)->cdr()->dref();
		}
		return count;
	}

	any ListTerm::toJava()
	{
		vector<any> vec = vector<any>();
		Term* t = this;
		while((t->isCons()))
		{
			vec.push_back((t)->car()->dref()->toJava());
			t = (t)->cdr()->dref();
		}
		if(!t->isNil())
		{
			vec.push_back(t);
		}
		return vec;
	}

	void ListTerm::toQuotedString_old(const int& printFlags, StringBuilder* sb)
	{
		TermTreeIterator* it = new TermTreeIterator(this, true);
		while(it->hasNext())
		{
			Term* t = it->next();
			t->toQuotedString(0, sb);
			it++;
		}
	}

	void ListTerm::toStringImpl(const int& printingFlags, StringBuilder* sb)
	{
		Term* x = this;
		sb->append("[");
		for(;;)
		{
			x->car()->dref()->toQuotedString(1, sb);
			x = x->cdr()->dref();
			if(!(x->isCons()))
			{
				break;
			}
			sb->append(",");
		}
		if(!Prolog::Nil->equals(x))
		{
			sb->append("|");
			x->toQuotedString(printingFlags, sb);
		}
		sb->append("]");
	}

	bool ListTerm::equalsTerm(Term* obj, Comparator* comparator)
	{
		return obj->isCons() && this->argz[0]->equalsTerm((obj)->car()->dref(), comparator) && cdr()->equalsTerm((obj)->cdr()->dref(), comparator);
	}

	int ListTerm::termHashCodeImpl()
	{
		int h = 1;
		h = 31 * h + Prolog::SYM_DOT->termHashCode();
		h = 31 * h + this->car()->dref()->termHashCode();
		h = 31 * h + cdr()->dref()->termHashCode();
		return h;
	}

	Iterator<Term*>* ListTerm::iterator(const bool& includeSyntax)
	{
		return new ListTermIterator(this, includeSyntax);
	}

SymbolTerm* const  ListTerm::ListTermIterator::LEFT_BRACKET = SymbolTerm::internToken("[");
SymbolTerm* const  ListTerm::ListTermIterator::SEPARATOR = SymbolTerm::internToken("|");
SymbolTerm* const  ListTerm::ListTermIterator::RIGHT_BRACKET = SymbolTerm::internToken("]");
SymbolTerm* const  ListTerm::ListTermIterator::COMMA = SymbolTerm::internToken(",");

	ListTerm::ListTermIterator::ListTermIterator(Term* start, const bool& includeSyntax)
	{
		this->includeSyntax = includeSyntax;
		this->current = start;
	}

	bool ListTerm::ListTermIterator::hasNext()
	{
		return this->current != nullptr && (this->tail.empty() || this->index < this->tail.size());
	}

	Term* ListTerm::ListTermIterator::next()
	{
		Term* result;
		if(this->first && includeSyntax)
		{
			this->first = false;
			return LEFT_BRACKET;
		} else if(this->comma && includeSyntax)
		{
			this->comma = false;
			return COMMA;
		} else if(this->current->isCons())
		{
			result = (this->current)->car();
			this->current = (this->current)->cdr()->dref();
			this->comma = (this->current->isCons());
		} else if(this->current->isNil() && includeSyntax)
		{
			result = RIGHT_BRACKET;
			this->current = nullptr;
		} else if(this->tail.empty())
		{
			this->tail = std::vector<Term*> { this->current, RIGHT_BRACKET };
			result = SEPARATOR;
			this->index = 0;
		} else if(this->index < this->tail.size())
		{
			result = this->tail[this->index];
			this->index++;
		} else
		{
			throw NoSuchElementException();
		}
		return result;
	}

	int ListTerm::compareTo(Term* otherterm)
	{ // otherterm must be dereferenced.
		if((otherterm->isVar()) || (otherterm->isNumber()) || (otherterm->isSymbol()))
		{
			return AFTER;
		}
		if((otherterm->isStructure()))
		{
			int arity = otherterm->arity();
			if(2 != arity)
			{
				return (2 - arity);
			}
			Term* functor = (otherterm)->functor();
			if(!Prolog::SYM_DOT->equalsTerm(functor, StrictEquals))
			{
				return Prolog::SYM_DOT->compareTo(functor);
			}
		}
		std::vector<Term*> args(2);
		if((otherterm->isCons()))
		{
			args[0] = (otherterm)->car();
			args[1] = (otherterm)->cdr();
		} else if((otherterm->isStructure()))
		{
			args = (otherterm)->args();
		} else
		{
			return BEFORE;
		}
		Term* tmp = this->argz[0];
		int rc;
		for(int i = 0; i < 2; i++)
		{
			rc = tmp->compareTo(args[i]->dref());
			if(rc != EQUAL)
			{
				return rc;
			}
			tmp = cdr();
		}
		return EQUAL;
	}

	bool ListTerm::isImmutable()
	{
		return this->immutable;
	}

	ListTerm* ListTerm::add(Term* term)
	{
		if(isImmutable())
		{
			return addToCopy(term);
		}
		Term * const cdr = argz[1];
		if(cdr->isCons())
		{
			return cdr->add(term);
		}
		if(cdr == Prolog::Nil)
		{
			// proper list
			ListTerm* acdr = CONS(term, cdr);
			argz[1] = acdr;

		} else
		{
			// improper list?
			ListTerm* acdr = CONS(term, cdr);
			argz[1] = acdr;
		}
		return this;
	}

	ListTerm* ListTerm::addToCopy(Term* term)
	{
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("unused") java.util.Deque<Term> stack = new java.util.ArrayDeque<Term>();
		Deque<Term*>* stack = new ArrayDeque<Term*>();
		Term* t = this;
		while(t->isCons())
		{
			ListTerm* lt = static_cast<ListTerm*>(t);
			stack->push(lt->argz[0]->dref());
			t = lt->cdr()->dref();
		}
		t = term->isNil() ? term : CONS(term, Prolog::Nil);
		while(!stack->isEmpty())
		{
			t = CONS(stack->pop(), t);
		}
		return static_cast<ListTerm*>(t);
	}

	ListTerm* ListTerm::append(Term* term)
	{
		if(isImmutable())
		{
			throw NoSuchElementException("isImmutable: " + this);
			//return addToCopy(term);
		}
		Term * const cdr = argz[1];
		if(cdr->isCons())
		{
			return cdr->add(term);
		}
		if(cdr == Prolog::Nil)
		{
			// proper list
			ListTerm* acdr = CONS(term, cdr);
			argz[1] = acdr;
			return acdr;
		} else
		{
			// improper list?
			ListTerm* acdr = CONS(cdr, term);
			argz[1] = acdr;
			return acdr;
		}
	}
}
