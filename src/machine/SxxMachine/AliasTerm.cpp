using namespace std;

#include "AliasTerm.h"
#include "OpVisitor.h"
#include "Trail.h"
#include "Prolog.h"
#include "ListTerm.h"
#include "SymbolTerm.h"

namespace SxxMachine
{

	bool AliasTerm::useAlias()
	{
	  return (value != this && value != nullptr);
	}

	bool AliasTerm::isImmutable()
	{
	  return (useAlias() ? getValue()->isImmutable() : false);
	}

	Term *AliasTerm::getValue()
	{
	  return value;
	}

	void AliasTerm::setValue(Term *value)
	{
	  if (dynamic_cast<AliasTerm*>(value) != nullptr)
	  {
		value = value->getValue();
	  }
	  this->value = value;
	}

	int AliasTerm::type()
	{
	  return (useAlias() ? getValue()->type() : TYPE_VARIABLE);
	}

	int AliasTerm::termHashCodeImpl()
	{
	  return (useAlias() ? getValue()->termHashCode() : System::identityHashCode(getValue()));
	}

	bool AliasTerm::equalsTerm(Term *obj, OpVisitor *comparator)
	{
	  if (this == obj)
	  {
		  return true;
	  }

	  if (useAlias())
	  {
		  return getValue()->equalsTerm(obj, comparator);
	  }
	  if (!obj->isAlias())
	  {
		  return obj->equalsTerm(this, comparator);
	  }
	  return false;
	}

	bool AliasTerm::unifyImpl(Term *t, Trail *trail)
	{
	  return (useAlias() ? getValue()->unify(t, trail) : t->unify(this, trail));
	}

	int AliasTerm::compareTo(Term *o)
	{
	  return (useAlias() ? getValue()->compareTo(o) : o->compareTo(this));
	}

	wstring AliasTerm::name()
	{
	  return (useAlias() ? getValue()->name() : Term::toQuotedString());
	}

	bool AliasTerm::isVar()
	{
	  return (useAlias() ? getValue()->isVar() : Term::isVar());
	}

	bool AliasTerm::isInteger()
	{
	  return (useAlias() ? getValue()->isInteger() : Term::isInteger());
	}

	bool AliasTerm::isDouble()
	{
	  return (useAlias() ? getValue()->isDouble() : Term::isDouble());
	}

	bool AliasTerm::isLong()
	{

	  return (useAlias() ? getValue()->isLong() : Term::isLong());
	}

	bool AliasTerm::isNumber()
	{

	  return (useAlias() ? getValue()->isNumber() : Term::isNumber());
	}

	bool AliasTerm::isAtomicValue()
	{

	  return (useAlias() ? getValue()->isAtomicValue() : Term::isAtomicValue());
	}

	bool AliasTerm::isSymbol()
	{

	  return (useAlias() ? getValue()->isSymbol() : Term::isSymbol());
	}

	bool AliasTerm::isNil()
	{
	  return Prolog::Nil->equalsTerm(getValue(), StrictEquals);
	}

	bool AliasTerm::isCons()
	{

	  return (useAlias() ? getValue()->isCons() : Term::isCons());
	}

	bool AliasTerm::isStructure()
	{

	  return (useAlias() ? getValue()->isStructure() : Term::isStructure());
	}

	bool AliasTerm::isFFIObject()
	{

	  return (useAlias() ? getValue()->isFFIObject() : Term::isFFIObject());
	}

	bool AliasTerm::isClosure()
	{

	  return (useAlias() ? getValue()->isClosure() : Term::isClosure());
	}

	int AliasTerm::arity()
	{
	  return (useAlias() ? getValue()->arity() : Term::arity());
	}

	std::vector<Term*> AliasTerm::args()
	{

	  return (useAlias() ? getValue()->args() : Term::args());
	}

	Term *AliasTerm::arg0(int nth)
	{

	  return (useAlias() ? getValue()->arg0(nth) : Term::arg0(nth));
	}

	Term *AliasTerm::car()
	{

	  return (useAlias() ? getValue()->car() : Term::car());
	}

	Term *AliasTerm::cdr()
	{

	  return (useAlias() ? getValue()->cdr() : Term::cdr());
	}

	int AliasTerm::length()
	{

	  return (useAlias() ? getValue()->length() : Term::length());
	}

	ListTerm *AliasTerm::add(Term *t)
	{

	  return (useAlias() ? getValue()->add(t) : Term::add(t));
	}

	ListTerm *AliasTerm::append(Term *t)
	{

	  return (useAlias() ? getValue()->append(t) : Term::append(t));
	}

	bool AliasTerm::convertible(type_info type)
	{

	  return (useAlias() ? getValue()->convertible(type) : Term::convertible(type));
	}

	Term *AliasTerm::copyImpl(IdentityHashMap<any, Term*> *copyHash, int deeply)
	{

	  return (useAlias() ? getValue()->copy(copyHash, deeply) : Term::copy(copyHash, deeply));
	}

	Term *AliasTerm::dref()
	{

	  return (useAlias() ? getValue()->dref() : Term::dref());
	}

	bool AliasTerm::isGround()
	{

	  return (useAlias() ? getValue()->isGround() : Term::isGround());
	}

	any AliasTerm::toJava()
	{

	  return (useAlias() ? getValue()->toJava() : Term::toJava());
	}

	bool AliasTerm::equals(any obj)
	{
	  if (getValue() == obj)
	  {
		  return false; // ???
	  }
	  if (this == obj)
	  {
		  return true;
	  }
	  return (useAlias() ? getValue()->equals(obj) : Term::equals(obj));
	}

	bool AliasTerm::isVariable()
	{

	  return (useAlias() ? getValue()->isVariable() : Term::isVariable());
	}

	bool AliasTerm::isNonvar()
	{

	  return (useAlias() ? getValue()->isNonvar() : Term::isNonvar());
	}

	bool AliasTerm::bind(Term *partial_Renamed, Trail *trail)
	{

	  return (useAlias() ? getValue()->bind(partial_Renamed, trail) : Term::bind(partial_Renamed, trail));
	}

	bool AliasTerm::equalsIdentical(Term *t)
	{

	  return (useAlias() ? getValue()->equalsIdentical(t) : Term::equalsIdentical(t));
	}

	Term *AliasTerm::findOrAttrValue(Trail *trail, bool createIfMissing, Term *name)
	{

	  return (useAlias() ? getValue()->findOrAttrValue(trail, createIfMissing, name) : Term::findOrAttrValue(trail, createIfMissing, name));
	}

	Term *AliasTerm::freeze(Trail *trail, Term *newval)
	{

	  return (useAlias() ? getValue()->freeze(trail, newval) : Term::freeze(trail, newval));
	}

	Term *AliasTerm::frozenGoals()
	{

	  return (useAlias() ? getValue()->frozenGoals() : Term::frozenGoals());
	}

	bool AliasTerm::isAttvar()
	{

	  return (useAlias() ? getValue()->isAttvar() : Term::isAttvar());
	}

	bool AliasTerm::isFrozen()
	{

	  return (useAlias() ? getValue()->isFrozen() : Term::isFrozen());
	}

	bool AliasTerm::IsList()
	{

	  return (useAlias() ? getValue()->IsList() : Term::IsList());
	}

	bool AliasTerm::IsNil()
	{

	  return (useAlias() ? getValue()->IsNil() : Term::IsNil());
	}

	long long AliasTerm::longValue()
	{

	  return (useAlias() ? getValue()->longValue() : Term::longValue());
	}

	void AliasTerm::putAttrValue(Trail *trail, Term *name, Term *val)
	{

	  if (useAlias())
	  {
		getValue()->putAttrValue(trail, name, val);
	  }
	  else
	  {
		Term::putAttrValue(trail, name, val);
	  }
	}

	void AliasTerm::setarg0(Trail *trail, int i0, Term *value)
	{
	  value->setarg0(trail, i0, value);
	}

	void AliasTerm::setAttrs(Trail *trail, Term *newval)
	{

	  if (useAlias())
	  {
		getValue()->setAttrs(trail, newval);
	  }
	  else
	  {
		Term::setAttrs(trail, newval);
	  }
	}

	void AliasTerm::setGoals(Trail *trail, Term *newval)
	{

	  if (useAlias())
	  {
		getValue()->setGoals(trail, newval);
	  }
	  else
	  {
		Term::setGoals(trail, newval);
	  }
	}

	bool AliasTerm::isFVar()
	{

	  return (useAlias() ? getValue()->isFVar() : Term::isFVar());
	}

	int AliasTerm::intValue()
	{

	  return (useAlias() ? getValue()->intValue() : Term::intValue());
	}

	bool AliasTerm::unifyInt(int i, Trail *trail)
	{

	  return (useAlias() ? getValue()->unifyInt(i, trail) : Term::unifyInt(i, trail));
	}

	SymbolTerm *AliasTerm::asSymbolTerm()
	{

	  return (useAlias() ? getValue()->asSymbolTerm() : Term::asSymbolTerm());
	}

	bool AliasTerm::isAlias()
	{
	  return true;
	}
}
