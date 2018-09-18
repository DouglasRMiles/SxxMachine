using namespace std;

#include "TermData.h"
#include "Term.h"
#include "PredicateEncoder.h"
#include "Prolog.h"
#include "StructureTerm.h"
#include "SymbolTerm.h"
#include "ListTerm.h"
#include "VariableTerm.h"
#include "LongTerm.h"
#include "DoubleTerm.h"
#include "IntegerTerm.h"
#include "ClosureTerm.h"
#include "FFIObjectTerm.h"
#include "ErrorTerm.h"
#include "NumberTerm.h"
#include "HashtableOfTerm.h"

namespace SxxMachine
{

	wstring TermData::StaticPred::toString()
	{
		StringBuilder *sb = new StringBuilder();
		toString(sb);
		return sb->toString();
	}

	void TermData::StaticPred::toString(StringBuilder *sb)
	{
		sb->append(predName());
		bool first = true;
		if (LARG.size() > 0)
		{
			for (int j = 0; j < LARG.size(); j++)
			{
				Term *val = LARG[j];
				if (first)
				{
					sb->append('(');
					first = false;
				}
				else
				{
					sb->append(", ");
				}
				val->toQuotedString(0, sb);
			}
			if (!first)
			{
				sb->append(')');
			}
		}
		else
		{
			sb->append("( ... )");

			// toStringLegacy(sb);
		}

	}

	int TermData::StaticPred::predArity()
	{
		if (LARG.empty())
		{
			return -1;
		}
		return LARG.size();
	}

	wstring TermData::StaticPred::predName()
	{
		wstring name = this->name;
		if (name == "")
		{
			type_info c = static_closure->getClass();
			name = c.getName();

			int index = (int)name.find("$$Lambda$");
			if (index > 0)
			{
				name = name.substr(0, index);
			}
			index = (int)name.find("PRED_");
			if (index > 0)
			{
				name = name.substr(index);
			}
			try
			{
				name = PredicateEncoder::decodeFunctor(name);
			}
			catch (const runtime_error &e)
			{
				return name;
			}
			if (name != "")
			{
				this->name = name;
			}
			else
			{
				name = "exec=" + static_closure;
			}
		}
		return name;
	}

	TermData::StaticPred::StaticPred(const wstring &functor, Operation object, std::vector<Term*> &va, Operation cont) : Predicate(functor, va, cont)
	{

		this->static_closure = object;
	}

	Operation TermData::StaticPred::exec(Prolog *engine)
	{
		push_to_engine(engine);
		return static_closure(engine);
	}

	StructureTerm *TermData::S(const wstring &string, vector<Term> &s3)
	{
		return new StructureTerm(string, s3);
	}

	StructureTerm *TermData::S(SymbolTerm *string, vector<Term> &s3)
	{
		return new StructureTerm(string, s3);
	}

	StructureTerm *TermData::C(const wstring &string, vector<Term> &s3)
	{
		return new StructureTerm(string, s3);
	}

	StructureTerm *TermData::C(SymbolTerm *string, vector<Term> &s3)
	{
		return new StructureTerm(string, s3);
	}

	ListTerm *TermData::CONS(Term *_car, Term *_cdr)
	{
		//if(false) return Cons(_car, _cdr);
		return new StructureTerm(Prolog::SYM_DOT, _car, _cdr);
	}

	SymbolTerm *TermData::SYM(const wstring &s)
	{
		return SymbolTerm::intern(s);
	}

	SymbolTerm *TermData::F(const wstring &s)
	{
		return SymbolTerm::intern(s);
	}

	SymbolTerm *TermData::F(const wstring &s, int i)
	{
		return SymbolTerm::intern(s, i);
	}

	VariableTerm *TermData::V(Prolog *engine)
	{
		return new VariableTerm(engine);
	}

	VariableTerm *TermData::V()
	{
		return new VariableTerm(Prolog::M);
	}

	Predicate *TermData::Op(Operation object, std::vector<Term*> &LARG, Operation cont)
	{
		return new TermData::StaticPred(nullptr, object, LARG, cont);
	}

	Predicate *TermData::Op(Operation object, Term *a1, Term *a2, Operation cont)
	{
		return new TermData::StaticPred(nullptr, object, VA({a1, a2}), cont);
	}

	Predicate *TermData::Op(Operation object, Term *a1, Term *a2, Term *a3, Operation cont)
	{
		return new TermData::StaticPred(nullptr, object, VA({a1, a2, a3}), cont);
	}

	Predicate *TermData::Op(Operation object, Term *a1, Operation cont)
	{
		return new TermData::StaticPred(nullptr, object, VA({a1}), cont);
	}

	LongTerm *TermData::Long(const wstring &s)
	{
		BigInteger tempVar(s);
		return new LongTerm(&tempVar);
	}

	LongTerm *TermData::Long(long long t)
	{
		int i = static_cast<int>(t);
		if ((static_cast<long long>(i)) == t)
		{
			return TermData::Integer(i);
		}
		return new LongTerm(t);
	}

	DoubleTerm *TermData::Float(double i)
	{
		return new DoubleTerm(i);
	}

std::vector<IntegerTerm*> TermData::posInts(POS_INT_CACHE);
std::vector<IntegerTerm*> TermData::negInts(NEG_INT_CACHE);

	IntegerTerm *TermData::Integer(int i)
	{
		if (i < POS_INT_CACHE)
		{
			if (i < 0)
			{
				if (i >= -NEG_INT_CACHE)
				{
					int idx = -i;
					if (negInts.size() > 0)
					{
						{
							lock_guard<mutex> lock(negInts);
							IntegerTerm *ret = negInts[idx];
							if (ret == nullptr)
							{
								negInts[idx] = ret = new IntegerTerm(i);
							}
							return ret;
						}
					}
				}
			}
			else
			{
				if (posInts.size() > 0)
				{
					{
						lock_guard<mutex> lock(posInts);
						IntegerTerm *ret = posInts[i];
						if (ret == nullptr)
						{
							posInts[i] = ret = new IntegerTerm(i);
						}
						return ret;
					}
				}
			}
		}
		return new IntegerTerm(i);
	}

	std::vector<Term*> TermData::VA(vector<Term> &array_Renamed)
	{
		return array_Renamed;
	}

	Term *TermData::Closure(Operation _op)
	{
		return new ClosureTerm(static_cast<Predicate*>(_op));
	}

	FFIObjectTerm *TermData::FFIObject(any _obj)
	{
		return new FFIObjectTerm(_obj);
	}

	ErrorTerm *TermData::createErrorTerm(runtime_error error, Term *_functor, vector<Term> &_args)
	{
		return new ErrorTerm(error, _functor, _args);
	}

	ListTerm *TermData::LIST(Term *a1, vector<Term> &items)
	{
		int len = items->length;
		if (len == 0)
		{
			return CONS(a1, Prolog::Nil);
		}
		ListTerm *t = CONS(items[len - 1], Prolog::Nil);
		for (int i = len - 2; i >= 0; i--)
		{
			t = CONS(items[i], t);
		}
		return t;
	}

	bool TermData::isQuoted(int printingFlags)
	{
		return (printingFlags & 1) != 0;
	}

	Term *TermData::AND(Term *a1, Term *a2)
	{
		return new StructureTerm(Prolog::SYM_CONJ, a1, a2);
	}

	NumberTerm *TermData::NarrowDouble(double r)
	{
		NumberTerm *T;
		if (floor(r) == r)
		{
			T = TermData::Long(static_cast<long long>(r));
		}
		else
		{
			T = TermData::Float(r);
		}
		return T;
	}

	HashtableOfTerm *TermData::asHashtableOfTerm(any hash)
	{
		// TODO Auto-generated method stub
		return any_cast<HashtableOfTerm*>(hash);
	}

	ErrorTerm *TermData::asErrorTerm(Term *a2)
	{
		// TODO Auto-generated method stub
		return static_cast<ErrorTerm*>(a2);
	}
}
