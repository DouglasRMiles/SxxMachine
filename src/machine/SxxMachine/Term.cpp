using namespace std;

#include "Term.h"
#include "Trail.h"
#include "Prolog.h"
#include "ListTerm.h"
#include "VariableTerm.h"
#include "SymbolTerm.h"
#include "../../handcoded/SxxMachine/sxxtensions.h"
#include "../../exceptions/SxxMachine/PrologException.h"
#include "StructureTerm.h"
#include "FrozenData.h"
#include "MapTerm.h"
#include "LongTerm.h"
#include "ClosureTerm.h"
#include "HashtableOfTerm.h"
#include "NumberTerm.h"
#include "StringBuilder.h"

namespace SxxMachine
{

	int Term::containsTermImpl(Term* variableTerm, Comparator* comparison)
	{
	  return 0;
	}

	int Term::containsTerm(Term* variableTerm, Comparator* comparison)
	{
		if(loopContainsTerm > 0)
		{
		  return loopContainsTerm;
		}
		try
		{
		  loopContainsTerm++;
		  return containsTermImpl(variableTerm, comparison);
		} finally
		{
		  loopContainsTerm--;
		}
	}

	int Term::hashCode()
	{
		return termHashCode();
	}

	int Term::termHashCode()
	{
	   if(loopedHashCodeTerm > 0)
	   {
		   return 1;
	   }
	   try
	   {
		 loopedHashCodeTerm++;
		 return termHashCodeImpl();
	   } catch(const runtime_error& e)
	   {
		 e.printStackTrace();
		 return System::identityHashCode(this);
	   } finally
	   {
		 loopedHashCodeTerm--;
	   }
	}

	bool Term::unify(Term* t, Trail* trail)
	{
	  Term* dref = drefAttrs();
	  if(dref != this)
	  {
		return dref->unify(t, trail);
	  }
	  if(loopedUnifyTerm > 0)
	  {
		  return true;
	  }
	  try
	  {
		loopedUnifyTerm++;
		return unifyImpl(t, trail);
	  } catch(const runtime_error& e)
	  {
		e.printStackTrace();
		return false;
	  } finally
	  {
		loopedUnifyTerm--;
	  }
	}

	bool Term::isVar()
	{
		return false;
	}

	bool Term::isInteger()
	{
		return false;
	}

	bool Term::isDouble()
	{
		return false;
	}

	bool Term::isLong()
	{
		return false;
	}

	bool Term::isNumber()
	{
		return false;
	}

	bool Term::isAtomicValue()
	{
		return true;
	}

	bool Term::isSymbol()
	{
		return false;
	}

	bool Term::isNil()
	{
		return Prolog::Nil->equalsTerm(this, StrictEquals);
	}

	bool Term::isCons()
	{
		return false;
	}

	bool Term::isStructure()
	{
		return false;
	}

	bool Term::isFFIObject()
	{
		return false;
	}

	bool Term::isClosure()
	{
		return false;
	}

	int Term::arity()
	{
		return 0;
	}

	std::vector<Term*> Term::args()
	{
		throw out_of_range(666);
	}

	Term* Term::arg0(const int& nth)
	{
		throw out_of_range(nth);
	}

	Term* Term::nth0(const int& nth)
	{
		throw out_of_range(nth);
	}

	Term* Term::car()
	{
		throw out_of_range(-1);
	}

	Term* Term::cdr()
	{
		throw out_of_range(-2);
	}

	int Term::length()
	{
		throw out_of_range(-3);
	}

	ListTerm* Term::add(Term* t)
	{
		throw out_of_range(-5);
	}

	ListTerm* Term::append(Term* t)
	{
		throw out_of_range(-5);
	}

	bool Term::convertible(type_info type)
	{
		return convertible(getClass(), type);
	}

	Term* Term::copyImpl(IdentityHashMap<any, Term*>* copyHash, const int& deeply)
	{
	  return this;
	}

	Term* Term::copy(IdentityHashMap<any, Term*>* copyHash, const int& deeply)
	{
	  Term* copy = copyHash->get(this);
	  if(copy != nullptr)
	  {
		  return copy;
	  }
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		if(drefAttrs->type() == this->type())
		{
		   return drefAttrs->copy(copyHash, deeply);
		} else
		{
		  //oopsy();
		  ///return drefAttrs.copy(copyHash, deeply);
		}
	  }
	  if(loopingCopyTerm == 1)
	  {
		VariableTerm* vt = new VariableTerm(Prolog::M);
		Term* cp = vt->copyImpl(copyHash, deeply);
		//copyHash.put(vt, cp);
		vt->val = this;
		copyHash->put(this, cp);
		return cp;
	  }
	  //if(loopingCopyTerm==2) return copyHash.get(this);
	  try
	  {
		loopingCopyTerm++;
		copy = copyImpl(copyHash, deeply);
		copyHash->put(this, copy);
		if((deeply&COPY_SAVE_ATTRS_COPY) != 0)
		{
		  Term* GoalsKey = SymbolTerm::GOALS;
		  if(this->isFVar())
		  {
			Term* goals1 = frozenGoals()->copy(copyHash, deeply);
			Term* sofar = copyHash->get(GoalsKey);
			Term* newsofar = sxxtensions::appendGoals(sofar,goals1);
			copyHash->put(GoalsKey, newsofar);
		  }
		  if(isAttvar())
		  {
			Term* attrs = getAttrs()->copy(copyHash, deeply);
			Term* goals1 = sxxtensions::get_attribute_goals(copy,attrs);
			Term* sofar = copyHash->get(GoalsKey);
			Term* newsofar = sxxtensions::appendGoals(sofar, goals1);
			copyHash->put(GoalsKey, newsofar);
		  }
		} else if((deeply & COPY_NO_ATTRS) == 0)
		{
		if(this->isFVar())
		{
		  Term* frozen = frozenGoals();
		  Term* newfroze = frozen->copy(copyHash, deeply);
		  copy->setGoals(newfroze);
		  assert(copy->isFVar());
		}
		if(isAttvar())
		{
		  copy->setAttrs(getAttrs()->copy(copyHash, deeply));
		}
	  }
		return copy;
	  } finally
	  {
		loopingCopyTerm--;
		// TODO: handle finally clause
	  }
	}

	void Term::oopsy()
	{
//JAVA TO C++ CONVERTER TODO TASK: This exception's constructor requires an argument:
//ORIGINAL LINE: new Exception().printStackTrace();
	  (runtime_error())->printStackTrace();
	}

	Term* Term::dref()
	{
		return this;
	}

	bool Term::isGround()
	{
		return true;
	}

	any Term::toJava()
	{
	return this;
	}

	bool Term::convertible(type_info from, type_info to)
	{
	if(from == nullptr)
	{
		return !to.isPrimitive();
	}
	if(to.isAssignableFrom(from))
	{
		return true;
	} else if(to.isPrimitive())
	{
		if(from.equals(Boolean::typeid))
		{
		return to.equals(Boolean::TYPE);
		} else if(from.equals(Byte::typeid))
		{
		return to.equals(Byte::TYPE) || to.equals(Short::TYPE) || to.equals(Integer::TYPE) || to.equals(Long::TYPE) || to.equals(Float::TYPE) || to.equals(Double::TYPE);
		} else if(from.equals(Short::typeid))
		{
		return to.equals(Short::TYPE) || to.equals(Integer::TYPE) || to.equals(Long::TYPE) || to.equals(Float::TYPE) || to.equals(Double::TYPE);
		} else if(from.equals(Character::typeid))
		{
		return to.equals(Character::TYPE) || to.equals(Integer::TYPE) || to.equals(Long::TYPE) || to.equals(Float::TYPE) || to.equals(Double::TYPE);
		} else if(from.equals(Integer::typeid))
		{
		return to.equals(Integer::TYPE) || to.equals(Long::TYPE) || to.equals(Float::TYPE) || to.equals(Double::TYPE);
		} else if(from.equals(Long::typeid))
		{
		return to.equals(Long::TYPE) || to.equals(Float::TYPE) || to.equals(Double::TYPE);
		} else if(from.equals(Float::typeid))
		{
		return to.equals(Float::TYPE) || to.equals(Double::TYPE);
		} else if(from.equals(Double::typeid))
		{
		return to.equals(Double::TYPE);
		}
	}
	return false;
	}

	bool Term::instanceOfTerm(any obj0)
	{
		if(!(dynamic_cast<Term*>(obj0) != nullptr))
		{
			return false;
		}
		Term* obj = any_cast<Term*>(obj0);
	return obj->isVar() || obj->isInteger() || obj->isLong() || obj->isDouble() || obj->isSymbol() || obj->isCons() || obj->isStructure() || obj->isFFIObject() || obj->isClosure();
	}

	Iterator<Term*>* Term::iterator(const bool& includeSyntax)
	{
		return Collections::emptyIterator<Term*>();
	}

	wstring Term::toQuotedString() throw(PrologException)
	{
	  if(loopPrintingTerm > 0)
	  {
		return "/*looped " + this->getClass().getName() + "@" + Integer::toHexString(System::identityHashCode(this)) + "*/";
	  }
	  StringBuilder* sb = new StringBuilder();
	  loopPrintingTerm++;
	  try
	  {
		toStringImpl(1, sb);
	  } finally
	  {
		loopPrintingTerm--;
	  }
	  return sb->toString();
	}

	wstring Term::toString()
	{
	  try
	  {
		return toQuotedString();
	  } catch(const runtime_error& e)
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
		try
		{
		  return toAtomName();
		} catch(const runtime_error& e1)
		{
		  // TODO Auto-generated catch block
		  e1.printStackTrace();
		}
		return e.what();
	  }
	}

	void Term::toQuotedString(const int& printFlags, StringBuilder* sb)
	{
	  if(loopPrintingTerm > 0)
	  {
		sb->append("/*looped*/");
		return;
	  }
	  loopPrintingTerm++;
	  try
	  {
		toStringImpl(printFlags, sb);
	  } finally
	  {
		loopPrintingTerm--;
	  }
	}

	void Term::toQuotedString_OLD(const int& printFlags, StringBuilder* sb)
	{
	  TermTreeIterator* it = new TermTreeIterator(this, true);
	  while(it->hasNext())
	  {
		it->next()->toQuotedString(printFlags, sb);
		  it++;
	  }
	}

	wstring Term::toAtomName() throw(PrologException)
	{
	  StringBuilder* sb = new StringBuilder();
	  toStringImpl(0, sb);
	  return sb->toString();
	}

	Term::TermTreeIterator::TermTreeIterator(Term* start, const bool& includeSyntax)
	{
		this->includeSyntax = includeSyntax;
		this->stack->push(Collections::singleton(start).begin());
	}

	bool Term::TermTreeIterator::hasNext()
	{
		while(!this->stack->isEmpty() && !this->stack->peek()->hasNext())
		{
			this->stack->pop();
		}
		return !this->stack->isEmpty();
	}

	Term* Term::TermTreeIterator::next()
	{
		while(!this->stack->isEmpty())
		{
			Iterator<Term*> i = this->stack->peek();
			if(i->hasNext())
			{
				Term* t = i->next();
				Iterator<Term*> it = t->iterator(includeSyntax);
				if(it->hasNext())
				{
					this->stack->push(it);
				} else
				{
					return t;
				}
			} else
			{
				this->stack->pop();
			}
		}
		throw NoSuchElementException();
	}

	bool Term::equalsTerm(Term* head)
	{
	  if(head == this)
	  {
		  return true;
	  }
	  return equalsTerm(head, StrictEquals);
	}

	bool Term::equals(any obj)
	{
		if(dynamic_cast<Term*>(obj) != nullptr)
		{
			return equalsTerm(any_cast<Term*>(obj), StrictEquals);
		}
		return false;
	}

	bool Term::isVariable()
	{
		return isVar();
	}

	bool Term::isNonvar()
	{
		return true;
	}

	bool Term::bind(Term* partial_RenamedTODO, Trail* trail)
	{
	   if(partial_RenamedTODO == this)
	   {
		   return true;
	   }
		throw NoSuchElementException("no bind on genral terms");
	}

	bool Term::equalsIdentical(Term* t)
	{
		return equalsTerm(t, StrictEquals);
	}

	Term::UndoAttributeReplacement::UndoAttributeReplacement(Term* thiz, Term* wasAttrs) : wasAttrs(wasAttrs), Termthis(thiz)
	{
	}

	void Term::UndoAttributeReplacement::undo()
	{
		this->Termthis->setAttrs(this->wasAttrs);
	}

	Term* Term::drefAttrs()
	{
	   // TODO Auto-generated method stub
		 if(fdata != nullptr)
		 {
			 return this;
		 }
		 Term* attterm = dref();
		 if(attterm == this)
		 {
			 return attterm;
		 }
		 return attterm->drefAttrs();
	}

	Term* Term::ArgNoDeRef(const int& i)
	{
		  return this->arg0(i);
	}

	Term* Term::findOrAttrValue(Trail* trail, const bool& createIfMissing, Term* name)
	{
		Term* drefAttrs = this->drefAttrs();
		if(drefAttrs != this)
		{
			return drefAttrs->findOrAttrValue(trail, createIfMissing, name);
		}
		if(sxxtensions::isNoGoal(this->getAttrs()))
		{
			if(!createIfMissing)
			{
				return Prolog::Nil;
			}
			Term* wasAttrs = this->getAttrs();
			StructureTerm* newatts = nullptr;
			this->setAttrs(Prolog::Nil);
			newatts = C("att", { name, nullptr, Prolog::Nil });
			if(trail != nullptr)
			{
				UndoAttributeReplacement tempVar(this, wasAttrs);
				trail->push(&tempVar);
			}
			return newatts;
		} else
		{
			Term* next = this->getAttrs();
			do
			{
				if(next->arg0(0)->equalsTerm(name, StrictEquals))
				{
					return next;
				}
				Term* nnext = next->arg0(2);
				if(nnext->name() != "att")
				{
					break;
				}
				next = nnext;
			} while(true);
			if(!createIfMissing)
			{
				return Prolog::Nil;
			}
			next->setarg0(trail, 2, C("att", { name, nullptr, Prolog::Nil }));
			return next;
		}
	}

	Term* Term::freeze(Trail* trail, Term* newval)
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		  return drefAttrs->freeze(trail, newval);
	  }
		  Term* prev = this->frozenGoals();
		  Term* newgoals = sxxtensions::appendGoals(newval, prev);
		  UndoableAnonymousInnerClass tempVar(this, prev);
		  trail->push(&tempVar);
		  return this->setGoals(newgoals);
	}

	Term::UndoableAnonymousInnerClass::UndoableAnonymousInnerClass(Term* outerInstance, SxxMachine::Term* prev)
	{
		this->outerInstance = outerInstance;
		this->prev = prev;
	}

	void Term::UndoableAnonymousInnerClass::undo()
	{
		outerInstance->setGoals(prev);
	}

	Term* Term::frozenGoals()
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		  return drefAttrs->frozenGoals();
	  }
	   return nullIs(this->getGoals(), Prolog::True);
	}

	bool Term::isAttvar()
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		  return drefAttrs->isAttvar();
	  }
	  if(fdata == nullptr)
	  {
		  return false;
	  }
		return this->getAttrs() != nullptr && this->getAttrs() != Prolog::Nil;
	}

	bool Term::isFrozen()
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		  return drefAttrs->isFrozen();
	  }
	  if(fdata == nullptr)
	  {
		  return false;
	  }
		return this->frozenGoals() != Prolog::True;
	}

	bool Term::IsList()
	{
		return false;
	}

	bool Term::IsNil()
	{
		return false;
	}

	long long Term::longValue()
	{
		Term* deref = this->drefAttrs();
		if(deref != this)
		{
			return deref->longValue();
		}
		cout << "general LongValue on terms not available" << endl;
		return -1;
	}

	Term* Term::nullIs(Term* attrs2, Term* valeu)
	{
		return attrs2 == nullptr ? valeu : attrs2;
	}

	void Term::putAttrValue(Trail* trail, Term* name, Term* val)
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		putAttrValue(trail, name, val);
		return;
	  }

		Term* wasAttrs = this->getAttrs();
		if(wasAttrs == nullptr || wasAttrs == Prolog::Nil)
		{
			Term* newatts = nullptr;
			newatts = C("att", { name, val, Prolog::Nil });
			if(trail != nullptr)
			{
				UndoableAnonymousInnerClass2 tempVar(this, wasAttrs);
				trail->push(&tempVar);
			}
			this->setAttrs(newatts);
			return;
		} else
		{
			Term* next = wasAttrs;
			do
			{
				if(wasAttrs->arg0(0)->equalsTerm(name, StrictEquals))
				{
					(wasAttrs)->setarg0(trail, 1, val);
					return;
				}
				Term* nnext = next->arg0(2);
				if(nnext->name() != "att")
				{
					break;
				}
				next = nnext;
			} while(true);
			next->setarg0(trail, 2, C("att", { name, val, Prolog::Nil }));
		}
	}

	Term::UndoableAnonymousInnerClass2::UndoableAnonymousInnerClass2(Term* outerInstance, SxxMachine::Term* wasAttrs)
	{
		this->outerInstance = outerInstance;
		this->wasAttrs = wasAttrs;
	}

	void Term::UndoableAnonymousInnerClass2::undo()
	{
	  outerInstance->setAttrs(wasAttrs);
	}

	void Term::setAttrs(Trail* trail, Term* newval)
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		setAttrs(trail, newval);
		return;
	  }

	  Term* prev = nullIs(this->getAttrs(),Prolog::Nil);
	  UndoableAnonymousInnerClass3 tempVar(this, prev);
	  trail->push(&tempVar);
	  this->setAttrs(newval);
	}

	Term::UndoableAnonymousInnerClass3::UndoableAnonymousInnerClass3(Term* outerInstance, SxxMachine::Term* prev)
	{
		this->outerInstance = outerInstance;
		this->prev = prev;
	}

	void Term::UndoableAnonymousInnerClass3::undo()
	{
		outerInstance->setAttrs(prev);
	}

	void Term::setGoals(Trail* trail, Term* newval)
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		  drefAttrs->setGoals(trail, newval);
	   return;
	  }
		Term * const prev = nullIs(this->getGoals(), Prolog::True);
		UndoableAnonymousInnerClass4 tempVar(this, prev);
		trail->push(&tempVar);
		this->setGoals(newval);
	}

	Term::UndoableAnonymousInnerClass4::UndoableAnonymousInnerClass4(Term* outerInstance, SxxMachine::Term* prev)
	{
		this->outerInstance = outerInstance;
		this->prev = prev;
	}

	void Term::UndoableAnonymousInnerClass4::undo()
	{
		outerInstance->setGoals(prev);
	}

	void Term::setarg0(Trail* trail, const int& i0, Term* value)
	{
	  cout << "general SetArg on terms not available" << endl;
	}

	Term* Term::setGoals(Term* newval)
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		  return drefAttrs->setGoals(newval);
	  }
	return getFdata()->setGoals(newval);
	}

	Term* Term::getGoals()
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		  return drefAttrs->getGoals();
	  }
	  if(fdata == nullptr)
	  {
		  return Prolog::True;
	  }
	  return getFdata()->getGoals();
	}

	void Term::setAttrs(Term* newval)
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		  drefAttrs->setAttrs(newval);
	  return;
	  }
	  getFdata()->setAttrs(newval);
	}

	Term* Term::getAttrs()
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		  return drefAttrs->getAttrs();
	  }
	  if(fdata == nullptr)
	  {
		  return Prolog::Nil;
	  }
	  return getFdata()->getAttrs();
	}

	bool Term::isFVar()
	{
	  Term* drefAttrs = this->drefAttrs();
	  if(drefAttrs != this)
	  {
		  return drefAttrs->isFVar();
	  }
		  return isVariable() && isFrozen();
	}

	int Term::intValue()
	{
	  return static_cast<int>(longValue());
	}

	bool Term::unifyInt(const int& i, Trail* trail)
	{
	  return intValue() == i;
	}

	SymbolTerm* Term::asSymbolTerm()
	{
	  return static_cast<SymbolTerm*>(this);
	}

	Term* Term::getValue()
	{
	  return this;
	}

	FrozenData* Term::getFdata()
	{
	  if(fdata == nullptr)
	  {
		  fdata = new FrozenData();
	  }
	  return fdata;
	}

	bool Term::isAlias()
	{
	  return false;
	}

	double Term::doubleValue()
	{
	  return longValue();
	}

	Term* Term::functor()
	{
	  // TODO Auto-generated method stub
	  cout << "general functor on terms not available" << endl;
	  return nullptr;
	}

	MapTerm* Term::join(Term* term)
	{
	  // TODO Auto-generated method stub
	  return nullptr;
	}

	bool Term::isMap()
	{
	  // TODO Auto-generated method stub
	  return false;
	}

	bool Term::pbind(Term* variableTerm, Trail* trail)
	{
	  // TODO Auto-generated method stub
	  oopsy();
	  return false;
	}

	void Term::toString(StringBuilder* sb)
	{
		 toStringImpl(1, sb);
	}

	any Term::object()
	{
		// TODO Auto-generated method stub
		return this;
	}

	type_info Term::getClazz()
	{
		return object().type();
	}

	StructureTerm* Term::asStructureTerm()
	{
		// TODO Auto-generated method stub
		return static_cast<StructureTerm*>(this);
	}

	void Term::setArg(const int& i, Term* value)
	{
	 setarg0(nullptr, i, value);
	}

	ListTerm* Term::asListTerm()
	{
		// TODO Auto-generated method stub
		return any_cast<ListTerm*>(object());
	}

	LongTerm* Term::asIntegerTerm()
	{
		// TODO Auto-generated method stub
		return any_cast<LongTerm*>(object());
	}

	ClosureTerm* Term::asClosureTerm()
	{
		// TODO Auto-generated method stub
		return any_cast<ClosureTerm*>(object());
	}

	VariableTerm* Term::asVariableTerm()
	{
		// TODO Auto-generated method stub
		return any_cast<VariableTerm*>(object());
	}

	LongTerm* Term::asLongTerm()
	{
		// TODO Auto-generated method stub
		return any_cast<LongTerm*>(object());
	}

	HashtableOfTerm* Term::asHashtableOfTerm()
	{
		// TODO Auto-generated method stub
		return any_cast<HashtableOfTerm*>(object());
	}

	NumberTerm* Term::asNumberTerm()
	{
		// TODO Auto-generated method stub
		return any_cast<NumberTerm*>(object());
	}

	MapTerm* Term::asMapTerm()
	{
		// TODO Auto-generated method stub
		return any_cast<MapTerm*>(object());
	}
}
