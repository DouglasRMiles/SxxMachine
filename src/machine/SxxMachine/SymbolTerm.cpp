using namespace std;

#include "SymbolTerm.h"
#include "../../kernelprolog/terms/SxxMachine/Prog.h"
#include "../../kernelprolog/main/SxxMachine/Init.h"
#include "Token.h"
#include "Term.h"
#include "../../kernelprolog/main/SxxMachine/KPTrail.h"
#include "../../kernelprolog/terms/SxxMachine/Expect.h"
#include "OpVisitor.h"
#include "Trail.h"
#include "TermData.h"
#include "StructureTerm.h"
#include "../../exceptions/SxxMachine/PrologException.h"
#include "Prolog.h"

namespace SxxMachine
{

	int SymbolTerm::exec(Prog *p)
	{
		try
		{
			if (st_exec == nullptr)
			{
				Init::builtinDict->asBuiltin(this);
			}
			if (st_exec == nullptr)
			{
				return -1;
			}
			return static_cast<int>(st_exec->invoke(nullptr, p, this));
		}
		catch (const runtime_error &e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}

	bool SymbolTerm::isConst()
	{
		return true;
	}

	bool SymbolTerm::isNil()
	{
		return name_Renamed == "[]";
	}

	bool SymbolTerm::isTrueProc()
	{
		// TODO Auto-generated method stub
		return name() == "true";
	}

	wstring SymbolTerm::qname()
	{
		return MaybeQuoted(this->name_Renamed);
	}

	wstring SymbolTerm::MaybeQuoted(const wstring &sym)
	{
		if (true)
		{
			return Token::toQuotedString(sym);
		}
		if (0 == sym.length())
		{
			return "''";
		}
		if (!sym.find("\n") != wstring::npos)
		{
			return Token::toQuotedString(sym);
		}
		for (int i = 0; i < sym.length(); i++)
		{
			if (!islower(sym[i]))
			{
				return StringHelper::toString('\'') + sym + StringHelper::toString('\'');
			}
		}
		return sym;
	}

	SymbolTerm *SymbolTerm::toClone() throw(CloneNotSupportedException)
	{
		return this;
	}

	wstring SymbolTerm::pprint()
	{
		return qname();
	}

	bool SymbolTerm::bind(Term *that, KPTrail *trail)
	{
		if (!Nonvar::bind(that, trail))
		{
			return false;
		}
		if (name_Renamed != "")
		{
			//name = name.intern();
			wstring thatn = Expect::asConst(that)->name();
			if (thatn == name_Renamed)
			{
				return true;
			}
		}
		Term *thizf = functor();
		Term *thatf = that->functor();
		return thizf == thatf;
	}

	wstring SymbolTerm::getKey() override
	{
		return name() + "/" + to_string(arityOrType());
	}

	int SymbolTerm::arityOrType() override
	{
		return Term::CONST;
	}

	wstring SymbolTerm::toUnquoted()
	{
		return name();
	}

	int SymbolTerm::getIntArg(int i)
	{
		// TODO Auto-generated method stub
		oopsy();
		return Nonvar::getIntArg(i);
	}

	int SymbolTerm::unifyArg(int i, Term *a, Prog *p)
	{
		oopsy();
		return Nonvar::unifyArg(i, a, p);
	}

	Term *SymbolTerm::ArgNoDeRef(int i)
	{
		oopsy();
		return Nonvar::ArgNoDeRef(i);
	}

	int SymbolTerm::exec(Prog *p, ISTerm *thiz)
	{
		return exp->exec(p, this);
	}

	void SymbolTerm::setMethod(Method *b)
	{
		st_exec = b;
	}

	int SymbolTerm::type()
	{
		return TYPE_SYMBOL;
	}

	bool SymbolTerm::isSymbol()
	{
		return true;
	}

java::util::concurrent::ConcurrentHashMap<Key*, InternRef*> *const SymbolTerm::SYMBOL_TABLE = new java::util::concurrent::ConcurrentHashMap<Key*, InternRef*>();
ReferenceQueue<Interned*> *const SymbolTerm::DEAD = new ReferenceQueue<Interned*>();

	SymbolTerm::Key::Key(const wstring &n, int a) : name(n), arity(a)
	{
	}

	int SymbolTerm::Key::hashCode()
	{
		return this->name.hashCode();
	}

	bool SymbolTerm::Key::equals(any other)
	{
		Key *k = any_cast<Key*>(other);
		return this->arity == k->arity && this->name == k->name;
	}

	SymbolTerm::InternRef::InternRef(Key *key, Interned *sym) : WeakReference<Interned>(sym, DEAD), key(key)
	{
	}

	SymbolTerm::Dynamic::Dynamic(const wstring &name, int arity) : SymbolTerm(name, arity)
	{
	}

	SymbolTerm::Dynamic::Dynamic(const wstring &name) : SymbolTerm(name, -1)
	{
	}

	wstring SymbolTerm::Dynamic::toString()
	{
		int arity = this->arity();
		return "/*D*/" + name() + "/" + to_string(arity);
	}

	SymbolTerm::Interned::Interned(const wstring &name, int arity) : SymbolTerm(name, arity)
	{
	}

	wstring SymbolTerm::Interned::toString()
	{
		int arity = this->arity();
		if (arity == 0)
		{
			return name();
		}
		return name() + "/" + to_string(arity);
	}

	SymbolTerm::Partial::Partial(const wstring &name, int arity, int start, int finish) : SymbolTerm(name, arity, start, finish)
	{
	}

	wstring SymbolTerm::Partial::toString()
	{
		int arity = this->arity();
		return "/*P" + to_string(start_Renamed) + ":" + to_string(finish_Renamed) + "*/" + name() + "/" + to_string(arity);
	}

	bool SymbolTerm::Partial::equalsTerm(Term *obj, OpVisitor *comparator)
	{
		if (this == obj)
		{
			return true;
		}
		else if (obj->isSymbol())
		{
			SymbolTerm *that = obj->asSymbolTerm();
			int thisLength = this->finish_Renamed - this->start_Renamed;
			int thatLength = that->finish_Renamed - that->start_Renamed;
			return this->arity_Renamed == that->arity_Renamed && (thisLength == thatLength) && this->name_Renamed.regionMatches(this->start_Renamed, that->name_Renamed, that->start_Renamed, thisLength);
		}
		return false;
	}

	bool SymbolTerm::Partial::unifyImpl(Term *t, Trail *trail)
	{
		t = t->dref();
		OpVisitor *comparator = Term::Unifiable;
		return (t->isVar()) ? (t)->bind(this, trail) : equalsTerm(t, comparator);
	}

	int SymbolTerm::Partial::termHashCodeImpl()
	{
		int h = this->hash;
		if (h == 0 && this->finish_Renamed - this->start_Renamed > 0)
		{
			h = this->name_Renamed.substr(this->start_Renamed, this->finish_Renamed - this->start_Renamed)->hashCode(); // use the same hashCode function as in SymbolTerm
			this->hash = h;
		}
		return h;
	}

	wstring SymbolTerm::Partial::name()
	{
		return this->name_Renamed.substr(this->start_Renamed, this->finish_Renamed - this->start_Renamed);
	}

	any SymbolTerm::Partial::toJava()
	{
		return name();
	}

	void SymbolTerm::Partial::toStringImpl(int printingFlags, StringBuilder *sb)
	{
		wstring name = this->name();
		if (TermData::isQuoted(printingFlags))
		{
			Token::toQuotedString(name, sb);
		}
		else
		{
			sb->append(name);
		}
	}

SymbolTerm *const SymbolTerm::colon2 = intern(":", 2);
Term *const SymbolTerm::GOALS = intern("$goals");

	SymbolTerm *SymbolTerm::create(char c)
	{
		if (0 <= c && c <= 127)
		{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
			return intern(Character::toString(c), 0);
		}
		else
		{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
			return create(Character::toString(c));
		}
	}

	SymbolTerm *SymbolTerm::create(const wstring &_name)
	{
		return new Dynamic(_name, 0);
	}

	SymbolTerm *SymbolTerm::create(const wstring &_name, int arity)
	{
		// For a non-zero arity try to reuse the term, its probable this is a
		// structure term and those are more commonly declared in code
		// to be a type of object the code manipulates, therefore also very
		// likely to already be in the cache.
		if (arity != 0)
		{
			return softReuse(_name, arity);
		}
		return new Dynamic(_name, 0);
	}

	StructureTerm *SymbolTerm::create(const wstring &pkg, const wstring &name, int arity)
	{
		// This is likely a specific function that exists in code, so try to reuse
		// the symbols that are involved in the term.
		return new StructureTerm(colon2, softReuse(pkg, 0), softReuse(name, arity));
	}

	SymbolTerm *SymbolTerm::intern(const wstring &_name)
	{
		return intern(_name, 0);
	}

	SymbolTerm *SymbolTerm::intern(const wstring &_name, int _arity)
	{
		if (_name == "")
		{
			soopsy();
		}
		_name = _name.intern();
		Key *key = new Key(_name, _arity);
//JAVA TO C++ CONVERTER TODO TASK: Java wildcard generics are not converted to C++:
//ORIGINAL LINE: Reference<? extends Interned> ref = SYMBOL_TABLE.get(key);
		Reference<? extends Interned> *ref = SYMBOL_TABLE->get(key);
		if (ref != nullptr)
		{
			Interned *sym = ref->get();
			if (sym != nullptr)
			{
				return sym;
			}
			SYMBOL_TABLE->remove(key, ref);
			ref->enqueue();
		}
		gc();
		Interned *sym = new Interned(_name, _arity);
		InternRef *nref = new InternRef(key, sym);
		InternRef *oref = SYMBOL_TABLE->putIfAbsent(key, nref);
		if (oref != nullptr)
		{
			SymbolTerm *osym = oref->get();
			if (osym != nullptr)
			{
				return osym;
			}
		}
		return sym;
	}

	void SymbolTerm::gc()
	{
//JAVA TO C++ CONVERTER TODO TASK: Java wildcard generics are not converted to C++:
//ORIGINAL LINE: Reference<? extends Interned> ref;
		Reference<? extends Interned> *ref;
		while ((ref = DEAD->poll()) != nullptr)
		{
			SYMBOL_TABLE->remove((static_cast<InternRef*>(ref))->key, ref);
		}
	}

	SymbolTerm *SymbolTerm::softReuse(const wstring &_name, int _arity)
	{
		Key *key = new Key(_name, _arity);
//JAVA TO C++ CONVERTER TODO TASK: Java wildcard generics are not converted to C++:
//ORIGINAL LINE: Reference<? extends Interned> ref = SYMBOL_TABLE.get(key);
		Reference<? extends Interned> *ref = SYMBOL_TABLE->get(key);
		if (ref != nullptr)
		{
			Interned *sym = ref->get();
			if (sym != nullptr)
			{
				return sym;
			}
			SYMBOL_TABLE->remove(key, ref);
			ref->enqueue();
		}
		// If reuse wasn't possible, construct the term dynamically.
		return new Dynamic(_name, _arity);
	}

	SymbolTerm::SymbolTerm(const wstring &_name, int _arity) : quoted(Token::toQuotedString(name())), arity(_arity), start(0), finish(this->name_Renamed.length())
	{

			if (_name != "" && _name != "." && _name != ":-")
			{
				wstring is = _name.intern();
				if (is != _name)
				{
					throw runtime_error("const got uninterned string");
				}
			}
			name_Renamed = _name;

	}

	SymbolTerm::SymbolTerm(const wstring &_name, int _arity, int start, int finish) : quoted(Token::toQuotedString(name())), arity(_arity), start(start), finish(finish)
	{
		//		super(_name);
		name_Renamed = _name;
	}

	int SymbolTerm::arity()
	{
		return this->arity_Renamed;
	}

	wstring SymbolTerm::name()
	{
		return this->name_Renamed;
	}

	int SymbolTerm::start()
	{
		return this->start_Renamed;
	}

	int SymbolTerm::finish()
	{
		return this->finish_Renamed;
	}

	wstring SymbolTerm::base()
	{
		return this->name_Renamed;
	}

	SymbolTerm *SymbolTerm::subsymbol(int beginIndex)
	{
		if (beginIndex < 0)
		{
			throw StringIndexOutOfBoundsException(beginIndex);
		}
		int subLen = this->finish_Renamed - this->start_Renamed - beginIndex;
		if (subLen < 0)
		{
			throw StringIndexOutOfBoundsException(subLen);
		}
		return (beginIndex == 0) ? this : new Partial(this->name_Renamed, this->arity_Renamed, this->start_Renamed + beginIndex, this->finish_Renamed);
	}

	SymbolTerm *SymbolTerm::subsymbol(int beginIndex, int endIndex)
	{
		if (beginIndex < 0)
		{
			throw StringIndexOutOfBoundsException(beginIndex);
		}
		if (endIndex > this->finish_Renamed - this->start_Renamed)
		{
			throw StringIndexOutOfBoundsException(endIndex);
		}
		int subLen = endIndex - beginIndex;
		if (subLen < 0)
		{
			throw StringIndexOutOfBoundsException(subLen);
		}
		return ((beginIndex == 0) && (endIndex == this->finish_Renamed - this->start_Renamed)) ? this : new Partial(this->name_Renamed, this->arity_Renamed, this->start_Renamed + beginIndex, this->start_Renamed + endIndex);
	}

	SymbolTerm *SymbolTerm::concat(SymbolTerm *that)
	{
		StringBuilder *sb = new StringBuilder(this->finish_Renamed - this->start_Renamed + that->finish_Renamed - that->start());
		sb->append(this->name_Renamed, this->start_Renamed, this->finish_Renamed);
		sb->append(that->name_Renamed, that->start_Renamed, that->finish_Renamed);
		return SymbolTerm::create(sb->toString());
	}

	int SymbolTerm::length()
	{
		return this->finish_Renamed - this->start_Renamed;
	}

	bool SymbolTerm::unifyImpl(Term *t, Trail *trail)
	{
		t = t->dref(); // fast dereference
		return (t->isVar()) ? t->bind(this, trail) : ((dynamic_cast<Partial*>(t) != nullptr) ? t->unify(this, trail) : ((t->isSymbol()) && (this->arity_Renamed == (t->asSymbolTerm())->arity_Renamed) && this->name_Renamed == t->asSymbolTerm()->name_Renamed));
	}

	int SymbolTerm::termHashCodeImpl()
	{
		return this->name_Renamed.hashCode();
	}

	bool SymbolTerm::equalsTerm(Term *obj, OpVisitor *comparator)
	{
		return (dynamic_cast<Partial*>(obj) != nullptr) ? (static_cast<Partial*>(obj))->equalsTerm(this, comparator) : ((obj->isSymbol()) && (this->arity_Renamed == obj->asSymbolTerm()->arity_Renamed) && this->name_Renamed == obj->asSymbolTerm()->name_Renamed);
	}

	bool SymbolTerm::convertible(type_info type)
	{
		return convertible(wstring::typeid, type);
	}

	any SymbolTerm::toJava()
	{
		return this->name_Renamed;
	}

	void SymbolTerm::toStringImpl(int printingFlags, StringBuilder *sb)
	{
		wstring name = this->name_Renamed;
		if (Nonvar::isQuoted(printingFlags))
		{
			sb->append(quoted);
		}
		else
		{
			sb->append(name);
		}
	}

	wstring SymbolTerm::toAtomName() throw(PrologException)
	{
		return name();
	}

	int SymbolTerm::compareTo(Term *anotherTerm)
	{ // anotherTerm must be dereferenced.
		if ((anotherTerm->isVar()) || (anotherTerm->isNumber()))
		{
			return AFTER;
		}
		if (!(anotherTerm->isSymbol()))
		{
			return BEFORE;
		}
		if (this == anotherTerm)
		{
			return EQUAL;
		}
		int x = name().compare(anotherTerm->asSymbolTerm()->name());
		if (x != 0)
		{
			return x;
		}
		int y = this->arity_Renamed - anotherTerm->asSymbolTerm()->arity();
		//	if (y != 0)
		return y;
		//		throw new InternalException("SymbolTerm is not unique");
	}

	bool SymbolTerm::isImmutable()
	{
		return true;
	}

	bool SymbolTerm::IsNil()
	{
		if (Prolog::Nil == this)
		{
			return true;
		}
		if (this->name() == "[]")
		{
			//throw
		}
		return false;
	}

	SymbolTerm *SymbolTerm::internToken(const wstring &_name)
	{
		SymbolTerm *tok = intern(_name);
		return tok;
	}

	SymbolTerm *SymbolTerm::functor()
	{
		return this;
	}
}
