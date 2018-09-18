using namespace std;

#include "Predicate.h"
#include "Term.h"
#include "Prolog.h"
#include "../../exceptions/SxxMachine/PrologException.h"
#include "PredicateEncoder.h"
#include "StringBuilder.h"
#include "Field.h"

namespace SxxMachine
{

	int Predicate::type()
	{
	   return Term::TYPE_CLOSURE;
	}

	Operation Predicate::exec(Prolog* engine) throw(PrologException)
	{
	  // TODO Auto-generated method stub
	  throw runtime_error("" + this);
	}

	wstring Predicate::predName()
	{
	  if(name != "")
	  {
		  return name;
	  }
	  return PredicateEncoder::decodeFunctor(getClass().getName());
	}

	int Predicate::predArity()
	{
	  if(LARG.size() > 0)
	  {
		  return LARG.size();
	  }
	  return PredicateEncoder::decodeArity(getClass().getName());
	}

	void Predicate::push_to_engine(Prolog* engine)
	{
	  //int arity = predArity();
	  //System.arraycopy(LARG, 0, engine.AREGS, 0, arity);
		 engine->AREGS = this->LARG;
		 engine->cont = this->cont;
	}

	Predicate::Predicate()
	{
	  //super((String)null,(Term[])null);
	  if(LARG.empty())
	  {
		LARG = std::vector<Term*>(predArity());
	  }
	}

	Predicate::Predicate(const wstring& name, std::vector<Term*>& _args, Operation cont)
	{
	  //super(name,va);
	  this->name = name;
	  this->LARG = _args;
	  this->cont = cont;
	}

	wstring Predicate::toString()
	{
		StringBuilder* sb = new StringBuilder();
		toString(sb);
		return sb->toString();
	}

	void Predicate::toString(StringBuilder* sb)
	{
	  sb->append(predName());
	  if(LARG.size() > 0)
	  {
		sb->append('(');
		int len = LARG.size();
		if(len > 0)
		{
		  LARG[1]->toQuotedString(1, sb);
		  for(int j = 1; j < len; j++)
		  {
			Term* val = LARG[j];
			sb->append(", ");
			val->toQuotedString(1, sb);
		  }
		}
		sb->append(')');
	  } else
	  {
		sb->append("( ... )");
		// toStringLegacy(sb);
	  }
	}

	void Predicate::toRest(const wstring& fixitive, StringBuilder* sb)
	{
	  toString(sb);
	  if(cont == nullptr)
	  {
		  return;
	  }
	  if(dynamic_cast<Predicate*>(cont) != nullptr)
	  {
		sb->append(fixitive);
		(static_cast<Predicate*>(cont))->toRest(fixitive,sb);
	  } else
	  {
		sb->append(fixitive);
		sb->append(cont);
	  }
	}

	void Predicate::toStringLegacy(StringBuilder* sb)
	{
	  Deque<type_info>* toScan = new ArrayDeque<type_info>();
	  type_info clazz = getClass();
	  while(clazz != Predicate::typeid)
	  {
		toScan->addFirst(clazz);
		clazz = clazz.getSuperclass();
	  }
	  bool first = true;
	  int i = 1;
	  Field* f = nullptr;
	  Term* val = nullptr;
	  do
	  {
		if(LARG.size() > 0 && LARG.size() >= i)
		{
		  val = LARG[i];
		  if(first)
		  {
			sb->append('(');
			first = false;
		  } else
		  {
			sb->append(", ");
		}
		val->toQuotedString(0, sb);
		}
		  for(auto c : toScan)
		  {
			try
			{
			  f = c.getDeclaredField("arg" + to_string(i));
			  if((f->getModifiers() & Modifier::STATIC) == 0 && f->getType() == Term::typeid)
			  {
				  f->setAccessible(true);
				  val = static_cast<Term*>(f->get(this));
				  if(first)
				  {
					sb->append('(');
					first = false;
				  } else
				  {
					sb->append(", ");
				}
				val->toQuotedString(0, sb);
				  break;
			  }
			} catch(const runtime_error& e)
			{
			  f = nullptr;
		  }
			try
			{
			  f = c.getDeclaredField("LARGS");
			  if((f->getModifiers() & Modifier::STATIC) == 0 && f->getType() == std::vector<Term*>::typeid)
			  {
				  f->setAccessible(true);
				  std::vector<Term*> vala = static_cast<std::vector<Term*> >(f->get(this));
				  if(vala.size() > 0)
				  {
				  for(int j = 0; j < vala.size(); j++)
				  {
					if(first)
					{
					  sb->append('(');
					  first = false;
					} else
					{
					  sb->append(", ");
				  }
					vala[j]->toQuotedString(0, sb);
					break;
				  }

				  }
			  }
			} catch(const runtime_error& e)
			{
			  f = nullptr;
		  }
		  }
		  i++;
	  } while(f != nullptr);
	  if(!first)
	  {
		  sb->append(')');
	  }
	}

	int Predicate::P0::predArity()
	{
	  return 0;
	}

	void Predicate::P0::toString(StringBuilder* sb)
	{
	  sb->append(predName());
	  sb->append('(');
	  sb->append(')');
	}

	void Predicate::P0::push_to_engine(Prolog* engine)
	{
	  engine->cont = this->cont;
	}

	int Predicate::P1::predArity()
	{
	  return 1;
	}

	void Predicate::P1::toString(StringBuilder* sb)
	{
	  sb->append(predName());
		sb->append('(');
		this->LARG[0]->toQuotedString(0, sb);
		sb->append(')');
	}

	void Predicate::P1::push_to_engine(Prolog* engine)
	{
	  engine->AREGS[0] = this->LARG[0];
	  engine->cont = this->cont;
	}

	Predicate::P2::P2(const wstring& name, std::vector<Term*>& _args, Operation cont) : Predicate(name,_args,cont)
	{
	}

	int Predicate::P2::predArity()
	{
	  return 2;
	}

	Predicate::P2::P2()
	{
	}

	void Predicate::P2::toString(StringBuilder* sb)
	{
	  sb->append(predName());
		sb->append('(');
		this->LARG[0]->toQuotedString(0, sb);
		sb->append(", ");
		this->LARG[1]->toQuotedString(0, sb);
		sb->append(')');
	}

	void Predicate::P2::push_to_engine(Prolog* engine)
	{
	  engine->setB0();
	  engine->AREGS[0] = this->LARG[0];
	  engine->AREGS[1] = this->LARG[1];
	  engine->cont = this->cont;
	}

	int Predicate::P3::predArity()
	{
	  return 3;
	}

	void Predicate::P3::toString(StringBuilder* sb)
	{
		sb->append(predName());
		sb->append('(');
		this->LARG[0]->toQuotedString(0, sb);
		sb->append(", ");
		this->LARG[1]->toQuotedString(0, sb);
		sb->append(", ");
		this->LARG[2]->toQuotedString(0, sb);
		sb->append(')');
	}

	void Predicate::P3::push_to_engine(Prolog* engine)
	{
	  engine->AREGS[0] = this->LARG[0];
	  engine->AREGS[1] = this->LARG[1];
	  engine->AREGS[2] = this->LARG[2];
	  engine->cont = this->cont;
	}

	void Predicate::P4::push_to_engine(Prolog* engine)
	{
	  engine->AREGS[0] = this->LARG[0];
	  engine->AREGS[1] = this->LARG[1];
	  engine->AREGS[2] = this->LARG[2];
	  engine->AREGS[3] = this->LARG[3];
	  int predArity = this->predArity();
	  if(predArity > 4)
	  {
		throw runtime_error("Missing Method Error: Push to engine");
	  }
	  engine->cont = this->cont;
	}

	void Predicate::P5::push_to_engine(Prolog* engine)
	{
	  engine->AREGS[0] = this->LARG[0];
	  engine->AREGS[1] = this->LARG[1];
	  engine->AREGS[2] = this->LARG[2];
	  engine->AREGS[3] = this->LARG[3];
	  engine->AREGS[4] = this->LARG[4];
	  int predArity = this->predArity();
	  if(predArity > 5)
	  {
		throw runtime_error("Missing Method Error: Push to engine");
	  }
	  engine->cont = this->cont;
	}
}
