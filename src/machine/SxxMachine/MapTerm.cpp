using namespace std;

#include "MapTerm.h"
#include "SymbolTerm.h"
#include "Term.h"
#include "Trail.h"
#include "Prolog.h"
#include "OpVisitor.h"

namespace SxxMachine
{

SymbolTerm *const MapTerm::SYM_DOT = SymbolTerm::intern(".", 2);

	bool MapTerm::isMap()
	{
		return true;
	}

	bool MapTerm::isAtomicValue()
	{
		return false;
	}

	int MapTerm::containsTermImpl(Term *variableTerm, Comparator *comparison)
	{
	  return car()->containsTerm(variableTerm,comparison) + cdr()->containsTerm(variableTerm,comparison);
	}

	MapTerm::MapTerm(Term *_car, Term *_cdr) : argz(VA({_car, _cdr}))
	{
		// TODO assert _car!=null;
		// TODO assert _cdr!=null;
		//this.car = _car;
		//this.cdr = _cdr;
		//this.immutable = this.argz[0].isImmutable() && this.argz[1].isImmutable();
	}

	Term *MapTerm::car()
	{
		return this->argz[0];
	}

	Term *MapTerm::cdr()
	{
		return this->argz[1];
	}

//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("unused") @Override public final boolean unifyImpl(Term t, Trail trail)
	bool MapTerm::unifyImpl(Term *t, Trail *trail)
	{
		Term *p = this;
		t = t->dref();
		while ((t->isMap()) && (p->isMap()) && (p)->car()->unify((t)->car(), trail))
		{
			p = (p)->cdr()->dref();
			t = (t)->cdr()->dref();
		}
		if (t->isVar())
		{
			return t->asVariableTerm()->bind(p, trail);
		}
		if (p->isVar())
		{
			return p->asVariableTerm()->bind(t, trail);
		}
		if (true)
		{
		  return !(t->isMap()) && !(p->isMap()) && p->unify(t, trail);
		}

		if (t->isMap())
		{
		  if (p->isAtomicValue())
		  {
			  return false;
		  }
		  return t->unify(p, trail);
		}
		if (p->isMap())
		{
		  if (t->isAtomicValue())
		  {
			  return false;
		  }
		  return p->unify(t, trail);
		}
		return p->unify(t, trail);
	}

	void MapTerm::setCar(Term *t)
	{
		this->argz[0] = t;
	}

	void MapTerm::setCdr(Term *t)
	{
		this->argz[1] = t;
	}

	int MapTerm::type()
	{
	  return TYPE_LIST;
	}

	bool MapTerm::convertible(type_info type)
	{
		return convertible(vector::typeid, type);
	}

	Term *MapTerm::copyImpl(IdentityHashMap<any, Term*> *copyHash, int deeply)
	{
		if (this->immutable)
		{
			return this;
		}
		Deque<MapTerm*> *stack = new ArrayDeque<MapTerm*>();
		Term *p = this;
		while (p->isMap() && !p->asMapTerm()->immutable)
		{
			MapTerm *lt = static_cast<MapTerm*>(p);
			stack->push(lt);
			p = lt->cdr()->dref();
		}
		p = p->copy(copyHash, deeply);
		while (!stack->isEmpty())
		{
			MapTerm *lt = stack->pop();
			p = MAP(lt->argz[0]->copy(copyHash, deeply), p);
		}
		return p;
	}

	bool MapTerm::isGround()
	{
		return this->argz[0]->isGround() && cdr()->isGround();
	}

	int MapTerm::arity()
	{
	   return 2;
	}

	std::vector<Term*> MapTerm::args()
	{
	  return argz;
	}

	SymbolTerm *MapTerm::functor()
	{
	  return SYM_DOT;
	}

	wstring MapTerm::name()
	{
		return SYM_DOT->name();
	}

	Term *MapTerm::arg0(int nth)
	{
	  Term *t = this;
	  int old_nth = nth;
	  while ((t->isMap()) && 0 < nth)
	  {
		nth--;
		t = (t)->cdr()->dref();
	  }
	  if ((t->isMap()))
	  {
		return t->car();
	  }
	  throw out_of_range(old_nth);
	}

	int MapTerm::length()
	{
	int count = 0;
	Term *t = this;
	while ((t->isMap()))
	{
		count++;
		t = (t)->cdr()->dref();
	}
	return count;
	}

	vector MapTerm::toJava()
	{
		vector<any> vec = vector<any>();
		Term *t = this;
		while ((t->isMap()))
		{
			vec.push_back((t)->car()->dref()->toJava());
			t = (t)->cdr()->dref();
		}
		if (!t->isNil())
		{
			vec.push_back(t);
		}
		return vec;
	}

	void MapTerm::toQuotedString_old(int printFlags, StringBuilder *sb)
	{
		TermTreeIterator *it = new TermTreeIterator(this,true);
		while (it->hasNext())
		{
			Term *t = it->next();
			t->toQuotedString(0, sb);
			it++;
		}
	}

	void MapTerm::toStringImpl(int printingFlags, StringBuilder *sb)
	{
	  Term *x = this;
	  sb->append("[");
	  for (;;)
	  {
		x->car()->dref()->toQuotedString(1, sb);
		x = x->cdr()->dref();
		if (!(x->isMap()))
		{
			break;
		}
		sb->append(",");
	  }
	  if (!Prolog::Nil->equals(x))
	  {
		sb->append("|");
		x->toQuotedString(printingFlags, sb);
	  }
	  sb->append("]");
	}

	bool MapTerm::equalsTerm(Term *obj, OpVisitor *comparator)
	{
		return obj->isMap() && this->argz[0]->equalsTerm((obj)->car()->dref(), comparator) && cdr()->equalsTerm((obj)->cdr()->dref(), comparator);
	}

	int MapTerm::termHashCodeImpl()
	{
		int h = 1;
		h = 31*h + SYM_DOT->termHashCode();
		h = 31*h + this->argz[0]->dref().termHashCode();
		h = 31*h + cdr()->dref()->termHashCode();
		return h;
	}

	Iterator<Term*> *MapTerm::iterator(bool includeSyntax)
	{
		return new ListTermIterator(this,includeSyntax);
	}

SymbolTerm *const MapTerm::ListTermIterator::LEFT_BRACKET = SymbolTerm::internToken("[");
SymbolTerm *const MapTerm::ListTermIterator::SEPARATOR = SymbolTerm::internToken("|");
SymbolTerm *const MapTerm::ListTermIterator::RIGHT_BRACKET = SymbolTerm::internToken("]");
SymbolTerm *const MapTerm::ListTermIterator::COMMA = SymbolTerm::internToken(",");

	MapTerm::ListTermIterator::ListTermIterator(Term *start, bool includeSyntax)
	{
	   this->includeSyntax = includeSyntax;
		this->current = start;
	}

	bool MapTerm::ListTermIterator::hasNext()
	{
		return this->current != nullptr && (this->tail.empty() || this->index < this->tail.size());
	}

	Term *MapTerm::ListTermIterator::next()
	{
		Term *result;
		if (this->first && includeSyntax)
		{
			this->first = false;
			return LEFT_BRACKET;
		}
		else if (this->comma && includeSyntax)
		{
			this->comma = false;
			return COMMA;
		}
		else if (this->current->isMap())
		{
			result = (this->current)->car();
			this->current = (this->current)->cdr()->dref();
			this->comma = (this->current->isMap());
		}
		else if (this->current->isNil() && includeSyntax)
		{
			result = RIGHT_BRACKET;
			this->current = nullptr;
		}
		else if (this->tail.empty())
		{
			this->tail = std::vector<Term*>{this->current, RIGHT_BRACKET};
			result = SEPARATOR;
			this->index = 0;
		}
		else if (this->index < this->tail.size())
		{
			result = this->tail[this->index];
			this->index++;
		}
		else
		{
			throw NoSuchElementException();
		}
		return result;
	}

	int MapTerm::compareTo(Term *anotherTerm)
	{ // anotherTerm must be dereferenced.
	if ((anotherTerm->isVar()) || (anotherTerm->isNumber()) || (anotherTerm->isSymbol()))
	{
		return AFTER;
	}
	if ((anotherTerm->isStructure()))
	{
		int arity = anotherTerm->arity();
		if (2 != arity)
		{
		return (2 - arity);
		}
		Term *functor = (anotherTerm)->functor();
		if (!SYM_DOT->equalsTerm(functor))
		{
		return SYM_DOT->compareTo(functor);
		}
	}
	std::vector<Term*> args(2);
	if ((anotherTerm->isMap()))
	{
		args[0] = (anotherTerm)->car();
		args[1] = (anotherTerm)->cdr();
	}
	else if ((anotherTerm->isStructure()))
	{
		args = (anotherTerm)->args();
	}
	else
	{
		return BEFORE;
	}
	Term *tmp = this->argz[0];
	int rc;
	for (int i = 0; i < 2; i++)
	{
		rc = tmp->compareTo(args[i]->dref());
		if (rc != EQUAL)
		{
		return rc;
		}
		tmp = cdr();
	}
	return EQUAL;
	}

	bool MapTerm::isImmutable()
	{
		return this->immutable;
	}

	MapTerm *MapTerm::join(Term *term)
	{
	  if (isImmutable())
	  {
		return joinToCopy(term);
	  }
	  Term * const cdr = argz[1];
	  if (cdr->isMap())
	  {
		  return cdr->join(term);
	  }
	  if (cdr == Prolog::Nil)
	  {
		// proper list
		MapTerm *acdr = MAP(term, cdr);
		argz[1] = acdr;

	  }
	  else
	  {
		// improper list?
		MapTerm *acdr = MAP(term, cdr);
		argz[1] = acdr;
	  }
	  return this;
	}

	MapTerm *MapTerm::joinToCopy(Term *term)
	{
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("unused") java.util.Deque<Term> stack = new java.util.ArrayDeque<Term>();
		Deque<Term*> *stack = new ArrayDeque<Term*>();
		Term *t = this;
		while (t->isMap())
		{
			MapTerm *lt = static_cast<MapTerm*>(t);
			stack->push(lt->argz[0]->dref());
			t = lt->cdr()->dref();
		}
		t = term->isNil() ? term : MAP(term, Prolog::Nil);
		while (!stack->isEmpty())
		{
			t = MAP(stack->pop(), t);
		}
		return static_cast<MapTerm*>(t);
	}

	MapTerm *MapTerm::joinTo(Term *term)
	{
	   if (isImmutable())
	   {
		 throw NoSuchElementException("isImmutable: " + this);
		 //return joinToCopy(term);
	   }
	   Term * const cdr = argz[1];
	   if (cdr->isMap())
	   {
		   return cdr->join(term);
	   }
	   if (cdr == Prolog::Nil)
	   {
		 // proper list
		 MapTerm *acdr = MAP(term, cdr);
		 argz[1] = acdr;
		 return acdr;
	   }
	   else
	   {
		 // improper list?
		 MapTerm *acdr = MAP(cdr, term);
		 argz[1] = acdr;
		 return acdr;
	   }
	}

	MapTerm *MapTerm::MAP(Term *_car, Term *_cdr)
	{
	  // TODO Auto-generated method stub
	  return new MapTerm(_car, _cdr);
	}
}
