using namespace std;

#include "StructureTerm.h"
#include "Term.h"
#include "../../kernelprolog/terms/SxxMachine/Expect.h"
#include "Prolog.h"
#include "../../kernelprolog/terms/SxxMachine/Prog.h"
#include "Token.h"
#include "../../kernelprolog/main/SxxMachine/KPTrail.h"
#include "Nonvar.h"
#include "../../exceptions/SxxMachine/InternalException.h"
#include "SymbolTerm.h"
#include "Trail.h"
#include "../../kernelprolog/main/SxxMachine/Builtins.h"
#include "../../handcoded/SxxMachine/sxxtensions.h"
#include "Method.h"
#include "StringBuilder.h"
#include "StackOverflowError.h"

namespace SxxMachine
{

	wstring StructureTerm::getKey() override
	{
		if(true)
		{
			return ListTerm::getKey();
		}
		return name() + "/" + to_string(arityOrType());
	}

	Term* StructureTerm::getHead(Term* T)
	{
		T = T->dref();
		return (T->isConj()) ? Expect::asConj(T)->ArgDeRef(0) : T;
	}

	Term* StructureTerm::getTail(Term* T)
	{
		T = T->dref();
		return (T->isConj()) ? Expect::asConj(T)->ArgDeRef(1) : Prolog::True;
	}

	bool StructureTerm::isConj()
	{
		return name_RenamedTODO == "," && arityOrType() == 2;
	}

	bool StructureTerm::isConst()
	{
		// TODO Auto-generated method stub
		return true;
	}

	int StructureTerm::arityOrType() override
	{
		return argz.size();
	}

	StructureTerm::StructureTerm(const wstring& name, const int& arity) : StructureTerm(name, makeVars(arity))
	{
	}

	std::vector<Term*> StructureTerm::makeVars(const int& arity)
	{
		// TODO Auto-generated method stub
		std::vector<Term*> t(arity);
		for(int i = 0; i < t.size(); i++)
		{
			t[i] = V();
		}
		return t;
	}

	void StructureTerm::init(const int& arity)
	{
		argz = std::vector<Term*>(arity);
		for(int i = 0; i < arity; i++)
		{
			argz[i] = V();
		}
	}

	Term* StructureTerm::ArgDeRef(const int& i)
	{
		return argz[i]->dref();
	}

	Term* StructureTerm::ArgNoDeRef(const int& i)
	{
		return argz[i];
	}

	int StructureTerm::getIntArg(const int& i)
	{
		return static_cast<int>(Expect::asInt(ArgDeRef(i))->doubleValue());
	}

	void StructureTerm::setArg(const int& i, Term* T)
	{
		argz[i] = T;
	}

	int StructureTerm::unifyArg(const int& i, Term* T, Prog* p)
	{
		// return getArg(i).unify(T,p.getTrail())?1:0;
		return argz[i]->DO_Unify(T, p->getTrail()) ? 1 : 0;
	}

	wstring StructureTerm::funToString()
	{
		wstring name = this->name();
		if(argz.empty())
		{
			return Token::toQuotedString(name) + "()";
		}
		int l = argz.size();
		return Token::toQuotedString(name) + (l <= 0 ? "" : "(" + show_args() + ")");
	}

	wstring StructureTerm::pprint()
	{
		if(isCons())
		{
			return toListString();
		}
		return funToString();
	}

	wstring StructureTerm::toListString()
	{
		Term* h = ArgDeRef(0);
		Term* t = ArgDeRef(1);
		StringBuilder* s = new StringBuilder("[" + watchNull(h));
		for(;;)
		{
			if(t->isNil())
			{
				s->append("]");
				break;
			} else if(t->isCons())
			{
				h = t->ArgDeRef(0);
				t = Expect::asCons(t)->ArgDeRef(1);
				s->append("," + watchNull(h));
			} else
			{
				s->append("|" + watchNull(t) + "]");
				break;
			}
		}
		return s->toString();
	}

	wstring StructureTerm::conjToString()
	{
		Term* h = argz[0]->dref();
		Term* t = argz[1]->dref();
		StringBuilder* s = new StringBuilder(watchNull(h));
		for(;;)
		{
			if(!(t->isConj()))
			{
				s->append("," + t);
				break;
			} else
			{
				h = Expect::asConj(t)->argz[0]->dref();
				t = Expect::asConj(t)->argz[1]->dref();
				s->append("," + watchNull(h));
			}
		}
		return s->toString();
	}

	wstring StructureTerm::watchNull(Term* x)
	{
		return ((nullptr == x) ? "null" : x->pprint());
	}

	wstring StructureTerm::show_args()
	{
		StringBuilder* s = new StringBuilder(watchNull(argz[0]));
		for(int i = 1; i < argz.size(); i++)
		{
			s->append("," + watchNull(argz[i]));
		}
		return s->toString();
	}

	bool StructureTerm::bind(Term* that, KPTrail* trail)
	{
		return ListTerm::bind(that, trail) && argz.size() == Expect::asStruct(that)->argz.size();
	}

	bool StructureTerm::Unify_TO(Term* that, KPTrail* trail)
	{
		if(bind(that, trail))
		{
			Term* other = that;
			std::vector<Term*> otherargz = other->args();
			for(int i = 0; i < argz.size(); i++)
			{
				if(!argz[i]->DO_Unify(otherargz[i], trail))
				{
					return false;
				}
			}
			return true;
		} else
		{
			return that->bind(this, trail);
		}
	}

	Term* StructureTerm::carTokenOrSelf()
	{
		return argz[0];
	}

	StructureTerm* StructureTerm::toClone()
	{
		StructureTerm* f = nullptr;
		assert(getClass() == StructureTerm::typeid);
		// use of clone is needed for "polymorphic" copy
		if(functor_RenamedTODO != nullptr)
		{
			return new StructureTerm(functor_RenamedTODO, argz);
		}
		f = new StructureTerm(name_RenamedTODO, argz);

		return f;
	}

	StructureTerm* StructureTerm::unInitializedClone()
	{
		StructureTerm* f = toClone();
		f->argz = std::vector<Term*>(argz.size());
		return f;
	}

	StructureTerm* StructureTerm::initializedClone()
	{
		StructureTerm* f = toClone();
		f->init(argz.size());
		return f;
	}

	Term* StructureTerm::reaction(Term* that)
	{
		// IO.mes("TRACE>> "+name());
		StructureTerm* f = toClone();
		f->argz = std::vector<Term*>(argz.size());
		for(int i = 0; i < argz.size(); i++)
		{
			f->argz[i] = argz[i]->reaction(that);
		}
		return f;
	}

	Nonvar* StructureTerm::listify()
	{
		ListTerm* l = StructureTerm::createCons(F(name()), Prolog::Nil);
		ListTerm* curr = l;
		for(int i = 0; i < argz.size(); i++)
		{
			ListTerm* tail = StructureTerm::createCons(argz[i], Prolog::Nil);
			curr->argz[1] = tail;
			curr = tail;
		}
		return l;
	}

	bool StructureTerm::isClause()
	{
		return arityOrType() == 2 && name() == ":-";
	}

	StructureTerm* StructureTerm::createCons(Term* x0, Term* x1)
	{
		return CONS(x0, x1)->asStructureTerm();
	}

	StructureTerm* StructureTerm::createCons(const wstring& cons, Term* x0, Term* x1)
	{
		return S(cons, { x0, x1 });
	}

	StructureTerm* StructureTerm::S(const wstring& string, vector<Term> &x01)
	{
		// TODO Auto-generated method stub
		return new StructureTerm(string, x01);
	}

	StructureTerm* StructureTerm::S(const wstring& getName, const int& arity)
	{
		// TODO Auto-generated method stub
		return new StructureTerm(getName, arity);
	}

	Term* StructureTerm::car()
	{
		return this->argz[0];
	}

	Term* StructureTerm::cdr()
	{
		return this->argz[1];
	}

	bool StructureTerm::isCons()
	{
		return argz.size() == 2 && (functor() == Prolog::SYM_DOT);
	}

	int StructureTerm::type()
	{
		if(isCons())
		{
			return TYPE_LIST;
		}
		return TYPE_STRUCTURE;
	}

	bool StructureTerm::isConsOL()
	{
		return false && isCons();
	}

	bool StructureTerm::isStructure()
	{
		return !isCons();
	}

	bool StructureTerm::isAtomicValue()
	{
		return false;
	}

	StructureTerm::StructureTerm(const wstring& _name, vector<Term> &_args) : ListTerm()
	{
		//this.name = name.intern();
		name_RenamedTODO = _name.intern();
		this->argz = _args;
		if(!Prolog::BE_FAST)
		{
			checkImmuatble();
		}
	}

	void StructureTerm::checkImmuatble()
	{
		if(this->argz.size() > 0)
		{
			int i = this->argz.size() - 1;
			while(i >= 0 && this->argz[i]->isImmutable())
			{
				i--;
			}
			this->immutable = i < 0;
		}
	}

	any StructureTerm::toJava()
	{
		if(isConsOL())
		{
			return ListTerm::toJava();
		}
		return this;
	}

	StructureTerm::StructureTerm(Term* _functor, vector<Term> &_args) : StructureTerm(checkFunctor(_functor, _args), _args)
	{
		this->functor_RenamedTODO = _functor;
	}

	bool StructureTerm::convertible(type_info type)
	{
		if(isConsOL())
		{
			return convertible(vector::typeid, type);
		}
		return true;
	}

	wstring StructureTerm::checkFunctor(Term* _functor, std::vector<Term*>& _args)
	{
		if(_functor == nullptr)
		{
			return "";
		}
		if(_args.size() > 0 && _functor->arity() != _args.size())
		{
			throw InternalException("Invalid argument length in StructureTerm");
		}
		return _functor->name();
	}

	Term* StructureTerm::functor()
	{
		return this->functor_RenamedTODO != nullptr ? this->functor_RenamedTODO : (this->functor_RenamedTODO = SymbolTerm::intern(this->name_RenamedTODO, this->argz.size()));
	}

	int StructureTerm::arity()
	{
		return this->argz.size();
	}

	std::vector<Term*> StructureTerm::args()
	{
		return this->argz;
	}

	wstring StructureTerm::name()
	{
		if(name_RenamedTODO == "")
		{
			name_RenamedTODO = functor_RenamedTODO->name();
			//  name = name.intern();
		}
		return name_RenamedTODO;
	}

	Term* StructureTerm::arg0(const int& nth)
	{
		if(isConsOL())
		{
			return ListTerm::arg0(nth);
		}
		return this->argz[nth];
	}

	bool StructureTerm::unifyImpl(Term* t, Trail* trail)
	{
		if(isConsOL())
		{
			return ListTerm::unifyImpl(t, trail);
		}
		t = t->dref(); // fast dereference //t = t.dereference();
		if(t->isVar())
		{
			return t->bind(this, trail);
		}
		//if ((t .isCons())) {
		// if(arity()!=2) return false;
		//if (!name().equals("."))return false; 
		//Prolog.M.getLogger().getJLogger().warning("Unify Cons<>Structure");

		//return false;
		//}
		if(!(t->isStructure()) && !(t->isCons()))
		{
			return false;
		}

		ListTerm* st = static_cast<ListTerm*>(t);
		if(this->argz.size() != st->argz.size())
		{
			return false;
		}
		if(this->name_RenamedTODO != "")
		{
			if(this->name_RenamedTODO != st->name())
			{
				return false;
			}
		} else
		{
			if(!this->functor_RenamedTODO->unify(st->functor(), trail))
			{
				return false;
			}
		}

		for(int i = 0; i < this->argz.size(); i++)
		{
			if(!this->argz[i]->unify(st->argz[i], trail))
			{
				return false;
			}
		}
		return true;
	}

	Term* StructureTerm::copyImpl(IdentityHashMap<any, Term*>* copyHash, const int& deeply)
	{
		if(isConsOL())
		{
			return ListTerm::copyImpl(copyHash, deeply);
		}
		if(this->immutable)
		{
			return this;
		}
		std::vector<Term*> a(this->argz.size());
		int len = this->argz.size();
		bool cyclic = false;
		for(int i = 0; i < len; i++)
		{
			try
			{
				a[i] = this->argz[i]->copy(copyHash, deeply);
			} catch(const StackOverflowError& e)
			{
				// TODO: handle exception
				e->printStackTrace();
				cyclic = true;
				break;
			}
		}
		if(cyclic)
		{
			if(this->functor_RenamedTODO != nullptr)
			{
				return new StructureTerm(this->functor_RenamedTODO, a);
			}
			return new StructureTerm(name(), a);
		}
		if(this->functor_RenamedTODO != nullptr)
		{
			return new StructureTerm(this->functor_RenamedTODO, a);
		}
		return new StructureTerm(name(), a);
	}

	bool StructureTerm::isImmutable()
	{
		if(isConsOL())
		{
			return true;
		}
		return this->immutable;
	}

	bool StructureTerm::isGround()
	{
		for(auto t : this->argz)
		{
			if(!t->isGround())
			{
				return false;
			}
		}
		return true;
	}

	int StructureTerm::containsTermImpl(Term* variableTerm, Comparator* comparison)
	{
		int contains = 0;
		for(auto t : this->argz)
		{
			contains += t->containsTerm(variableTerm, comparison);
		}
		if(functor_RenamedTODO != nullptr)
		{
			return functor_RenamedTODO->containsTerm(variableTerm, comparison) + contains;
		}
		return contains;
	}

	bool StructureTerm::equalsTerm(Term* obj, Comparator* comparator)
	{
		if(isConsOL())
		{
			return ListTerm::equalsTerm(obj, comparator);
		}
		if(obj == this)
		{
			return true;
		}
		if(!(obj->isStructure()))
		{
			return false;
		}
		Term* st = obj;
		if(this->name_RenamedTODO != "")
		{
			if(this->name_RenamedTODO != st->name())
			{
				return false;
			}
		} else
		{
			if(!this->functor_RenamedTODO->equalsTerm(st->functor(), comparator))
			{
				return false;
			}
		}
		for(int i = 0; i < this->argz.size(); i++)
		{
			if(!this->argz[i]->equalsTerm(st->arg0(i)->dref(), comparator))
			{
				return false;
			}
		}
		return true;
	}

	int StructureTerm::termHashCodeImpl()
	{
		if(isConsOL())
		{
			return ListTerm::termHashCodeImpl();
		}
		int h = 1;
		h = 31 * h + name().hashCode();
		for(auto arg : this->argz)
		{
			h = 31 * h + arg->dref()->termHashCode();
		}
		return h;
	}

	void StructureTerm::toStringImpl(const int& printingFlags, StringBuilder* sb)
	{
		if(isCons())
		{
			toListStringImpl(printingFlags, sb);
			return;
		}
		if(this->functor_RenamedTODO != nullptr)
		{
			functor_RenamedTODO->toQuotedString(printingFlags, sb);
		} else
		{
			if(!isQuoted(printingFlags))
			{
				sb->append(name_RenamedTODO);
			} else
			{
				Token::toQuotedString(name_RenamedTODO, sb);
			}
		}
		sb->append('(');
		this->argz[0]->toQuotedString(printingFlags, sb);
		for(int i = 1; i < this->argz.size(); i++)
		{
			sb->append(',');
			Term* term = this->argz[i];
			term->toQuotedString(printingFlags, sb);
		}
		sb->append(')');
		/*
		 * TermTreeIterator it = new TermTreeIterator(this); while(it.hasNext()){
		 * it.next().toQuotedString(printingFlags, sb); }
		 */
	}

	void StructureTerm::toListStringImpl(const int& printingFlags, StringBuilder* sb)
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

	Iterator<Term*>* StructureTerm::listIterator(const bool& includeSyntax)
	{
		return new ListTermIterator(this, includeSyntax);
	}

	Iterator<Term*>* StructureTerm::iterator(const bool& includeSyntax)
	{
		if(isConsOL())
		{
			return listIterator(includeSyntax);
		}
		return new StructureTermIterator(functor(), this->argz, includeSyntax);
	}

SymbolTerm* const  StructureTerm::StructureTermIterator::COMMA = SymbolTerm::intern(",");
SymbolTerm* const  StructureTerm::StructureTermIterator::RIGHT_BRACKET = SymbolTerm::intern(")");
SymbolTerm* const  StructureTerm::StructureTermIterator::LEFT_BRACKET = SymbolTerm::intern("(");

	StructureTerm::StructureTermIterator::StructureTermIterator(Term* functor, std::vector<Term*>& args, const bool& includeSyntax) : functorIt(functor), argsIt(args), length(args.size())
	{
		this->includeSyntax = includeSyntax;
	}

	bool StructureTerm::StructureTermIterator::hasNext()
	{
		return this->index <= this->length;
	}

	Term* StructureTerm::StructureTermIterator::next()
	{
		if(!includeSyntax)
		{
			if(index == -1)
			{
				index++;
			} else
			{
				if(index == length)
				{
					index++;
				}
			}
		}
		Term* result;
		if(this->index == -2)
		{
			result = this->functorIt;
		} else if(this->index == -1)
		{
			result = LEFT_BRACKET;
		} else if(this->comma)
		{
			this->comma = false;
			return COMMA;
		} else if(this->index < this->length)
		{
			result = this->argsIt[this->index];
			this->comma = (this->index != this->length - 1);
		} else
		{
			result = RIGHT_BRACKET;
		}
		this->index++;
		return result;
	}

	int StructureTerm::compareTo(Term* anotherTerm)
	{ // anotherTerm must be dereferenced.
		if(isConsOL())
		{
			return compareTo(anotherTerm);
		}
		Term* functor,* functor2;
		std::vector<Term*> args2;
		int arity2, rc;
		if((anotherTerm->isVar()) || (anotherTerm->isNumber()) || (anotherTerm->isSymbol()))
		{
			return AFTER;
		}
		if((anotherTerm->isCons()))
		{
			ListTerm* t = static_cast<ListTerm*>(anotherTerm);
			functor2 = Prolog::SYM_DOT;
			args2 = std::vector<Term*>(2);
			args2[0] = t->car();
			args2[1] = t->cdr();
			arity2 = 2;
		} else if((anotherTerm->isStructure()))
		{
			Term* s = anotherTerm;
			functor2 = s->functor();
			args2 = s->args();
			arity2 = s->arity();
		} else
		{
			return BEFORE;
		}
		if(this->argz.size() != arity2)
		{
			return (this->argz.size() - arity2);
		}
		functor = this->functor();
		if(!functor->equalsTerm(functor2, StrictEquals))
		{
			return functor->compareTo(functor2);
		}
		for(int i = 0; i < this->argz.size(); i++)
		{
			rc = this->argz[i]->compareTo(args2[i]->dref());
			if(rc != EQUAL)
			{
				return rc;
			}
		}
		return EQUAL;
	}

	void StructureTerm::setarg0(Trail* trail, const int& i, Term* val)
	{
		if(isConsOL())
		{
			ListTerm::setarg0(trail, i, val);
			return;
		}
		if(trail == nullptr)
		{
			argz[i] = val;
		} else
		{
			sxxtensions::DoSetArg3_p2(trail->getProlog(), i + 1, this, val);
		}
	}

	void StructureTerm::setCar(Term* t)
	{
		assert(isCons());
		argz[0] = t;

	}

	void StructureTerm::setCdr(Term* t)
	{
		assert(isCons());
		argz[1] = t;

	}

	void StructureTerm::setMethod(Method* b)
	{
		st_exec = b;
	}
}
