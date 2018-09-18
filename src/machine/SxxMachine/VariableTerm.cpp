using namespace std;

#include "VariableTerm.h"
#include "Trail.h"
#include "TermData.h"
#include "Term.h"
#include "Prolog.h"
#include "StructureTerm.h"
#include "../../repl/SxxMachine/BlockingPrologControl.h"
#include "Operation.h"
#include "PrologMachineCopy.h"
#include "OpVisitor.h"
#include "../../exceptions/SxxMachine/InternalException.h"
#include "../../kernelprolog/main/SxxMachine/KPTrail.h"

namespace SxxMachine
{

	Var *VariableTerm::toClone()
	{
	// TODO Auto-generated method stub
	return nullptr;
	}

	bool VariableTerm::unifyInt(int i, Trail *trail)
	{
	   return unify(TermData::Integer(i), trail);
	}

	wstring VariableTerm::toString()
	{
	  if (isCyclic > 0)
	  {
		return "/*cyclic*/" + variableName();
	  }
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
	  return Var::toString();
	}

	bool VariableTerm::isAtomicValue()
	{
		return (this->val != nullptr) && (this->val != this) && this->val->isAtomicValue();
	}

	bool VariableTerm::isVar()
	{
		return true;
	}

	bool VariableTerm::isNonvar()
	{
		return false;
	}

	VariableTerm::VariableTerm() : myID(nextID++)
	{
		//this.val = this;
		this->timeStamp = numeric_limits<long long>::min();
	}

	VariableTerm::VariableTerm(Prolog *engine) : myID(nextID++)
	{
		//this.val = this;
		if (engine != nullptr)
		{
			this->timeStamp = engine->getCPFTimeStamp();
		}
	}

	wstring VariableTerm::variableName()
	{
	if (this->varName != "")
	{
	  return this->varName;
	}
	return ("_" + Integer::toHexString(myID))->toUpperCase() + ((this->varName != "") ? "_" + this->varName : "");
	}

	int VariableTerm::type()
	{
	  return TYPE_VARIABLE;
	}

	bool VariableTerm::unifyImpl(Term *t, Trail *trail)
	{
	  if (t == this)
	  {
		  return true;
	  }
	  if (t == val)
	  {
		  return true;
	  }
	  return (this->val->isVar()) ? this->val->bind(t->dref(), trail) : this->val->unify(t, trail);
	}

	int VariableTerm::containsTermImpl(Term *variableTerm, Comparator *comparison)
	{
	  if (isCyclic > 0)
	  {
		  return isCyclic;
	  }
	  if (variableTerm == val)
	  {
		return 1;
	  }
	  if (variableTerm == this)
	  {
		return 1;
	  }
	  if (val != nullptr && val != this)
	  {
		return val->containsTerm(variableTerm,comparison);
	  }
	  return 0;
	}

	void VariableTerm::updateUpRef(Term *value)
	{
	  if (value == val || value == this)
	  {
		updateUpRefNoOccurs(value);
		return;
	  }
	  if (!value->isAtomicValue())
	  {
		isCyclic = value->containsTerm(this, equalsIdentical);
		if (isCyclic > 0)
		{
		  Prolog::Break("cyclic " + variableName());
		}
	  }
	  updateUpRefNoOccurs(value);
	}

	void VariableTerm::updateUpRefNoOccurs(Term *value)
	{
		if (value == this)
		{
		  isCyclic = 0;
		}
		if (this->upRef.empty() || this->upRef.empty())
		{ // short cut
			this->val = value;
			return;
		}
		Deque<VariableTerm*> *queue = new ArrayDeque<VariableTerm*>();
		queue->add(this);
		while (!queue->isEmpty())
		{
			VariableTerm *v = queue->poll();
			v->val = value;
			if (v->upRef.size() > 0)
			{
				for (auto u : v->upRef)
				{
					if (u->val != value)
					{ // queue only not visited variable terms
						queue->add(u);
					}
				}
			}
		}
	}

	void VariableTerm::bindUpRef(VariableTerm *upVariable)
	{
		if (this->upRef.empty())
		{
			this->upRef = vector<VariableTerm*>(4);
		}
		this->upRef.push_back(upVariable);
		upVariable->downRef = this;
		upVariable->updateUpRef(this->val);
	}

	Term *VariableTerm::freeze(Trail *trail, Term *newval)
	{
	  if (frozenProxy == nullptr)
	  {
		  frozenProxy = new VariableTerm();
	  }
	  IdentityHashMap<any, Term*> *copyHash = new IdentityHashMap<any, Term*>();
	  copyHash->put(this, frozenProxy);
	  Term *nextnewVal = newval->copy(copyHash, COPY_ALL);
	  return Var::freeze(trail, nextnewVal);
	}

	bool VariableTerm::FBind(Term *that, Trail *trail)
	{
		VariableTerm *fv2 = this;
		if (that->isFVar())
		{
			VariableTerm *thatv = static_cast<VariableTerm*>(that);
			StructureTerm *newgoals = new StructureTerm(",", this->frozenGoals(), thatv->frozenGoals());
			VariableTerm *newfrv = new VariableTerm(trail->getProlog(), trail->top(), newgoals);
			trail->push(this);
			trail->push(thatv);
			if (isAttvar())
			{

			}

			this->val = thatv->val = newfrv;

		}
		else if (that->isVar())
		{
			return that->pbind(this, trail);
		}
		else
		{
		  if (false)
		  {
			Prolog *m = trail->getProlog();
			Term *g = this->frozenGoals();
			BlockingPrologControl *e2 = static_cast<BlockingPrologControl*>(m->control);
			Operation saved = e2->code;
			frozenProxy->pbind(that, trail);
			// freeze(X,integer(X)),X=1.
			e2->resultReady = false;
			std::vector<Term*> savedA1 = m->AREGS;
			Operation savedA2 = m->cont;
			m->cont = nullptr;
			int savedA3 = m->B0;
			e2->setPredicate(g);
			e2->executePredicate(false);
			try
			{
			  if (e2->result)
			  {
				fv2->pbind(frozenProxy->val, trail);
				e2->code = saved;
				return true;
			  }
			  else
			  {
				return false;
			  }
			}
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to the exception 'finally' clause:
			finally
			{
			  frozenProxy->undo();
			  e2->resultReady = false;
			  e2->code = saved;
			  m->AREGS = savedA1;
			  m->cont = savedA2;
			  m->B0 = savedA3;
			}
		  }

		  Prolog *m = trail->getProlog();
		  Term *g = this->frozenGoals();
		  BlockingPrologControl *e2 = new BlockingPrologControl(PrologMachineCopy::cloneCheap(m));
		  frozenProxy->pbind(that, trail);
		  e2->setPredicate(g);
		  if (e2->call())
		  {
			fv2->pbind(frozenProxy->val, trail);
			frozenProxy->undo();
			return true;
		  }
		  else
		  {
			frozenProxy->undo();
			 return false;
		  }
		//          m.push(new PopPendingGoals(m, m.pendingGoals));
		//          m.addPendingGoal(TermData.AND(g, new ClosureTerm(new Predicate() {
		//            @Override
		//            public int predArity() {
		//              return 0;
		//            }
		//            @Override
		//            public Operation exec(Prolog engine) throws PrologException {
		//              fv2.pbind(frozenProxy.val, trail);
		//              //VariableTerm.this.val = frozenProxy.val;
		//              return engine.cont;
		//            }
		//          })));

			//@TODO mach.ExceptionRaised = 1;
		}
		return true;
	}

	bool VariableTerm::pbind(Term *p, Trail *trail)
	{
	if (p->isVar())
	{
	  VariableTerm *v = static_cast<VariableTerm*>(p), *t = this;
	  if (v->timeStamp >= this->timeStamp)
	  {
		t = v;
		v = this;
	  }
	  v->bindUpRef(t);
	  if (t->timeStamp < trail->timeStamp)
	  {
		trail->push(t);
	  }
	  return true;
	}
	// update upRefs to use value t
	updateUpRef(p);
	this->downRef = nullptr;
	if (this->timeStamp < trail->timeStamp)
	{
	  trail->push(this);
	}
	return true;
	}

	bool VariableTerm::bind(Term *p, Trail *trail)
	{
		  if (this->isFVar())
		  {
			  return this->FBind(p, trail);
		  }
		  return pbind(p, trail);

	}

	bool VariableTerm::convertible(type_info type)
	{
		return (this->val != this)?this->val->convertible(type):convertible(this->getClass(), type);
	}

	Term *VariableTerm::copyImpl(IdentityHashMap<any, Term*> *copyHash, int deeply)
	{
		if (this->val->isVar())
		{
			Term *co = copyHash->get(this->val);
			if (co == nullptr)
			{
				co = new VariableTerm();
				copyHash->put(this->val, co);
			}
			return co;
		}
		else
		{
			return this->val->copy(copyHash, deeply);
		}
	}

	bool VariableTerm::isGround()
	{
	  if (isCyclic > 0)
	  {
		  return true;
	  }
		return (this->val != this) && this->val->isGround();
	}

	wstring VariableTerm::name()
	{
		return (this->val == this) ? "" : this->val->dref()->name();
	}

	wstring VariableTerm::toAtomName()
	{
	  return (this->val == this) ? variableName() : this->val->dref()->toAtomName();
	}

	any VariableTerm::toJava()
	{
	  if (isCyclic > 0)
	  {
		  return this;
	  }
		return (this->val != this) ? this->val->toJava() : this;
	}

	bool VariableTerm::equalsTerm(Term *obj, OpVisitor *comparator)
	{
	  if (isCyclic > 0)
	  {
		  return obj == val;
	  }
	  return (this->val == this) ? this == obj : (this == obj || this->val->equalsTerm(obj, comparator));
	}

	int VariableTerm::termHashCodeImpl()
	{
	  try
	  {
		return (this->val == this) ? myID : this->val->termHashCode();
	  }
	  catch (const runtime_error &e)
	  {
		// TODO: handle exception
		return myID; // System.identityHashCode(this);
	  }
	}

	void VariableTerm::toStringImpl(int printFlags, StringBuilder *sb)
	{
	  toString();
	  if (isCyclic > 0)
	  {
		//System.out.print(""+variableName());
		sb->append(variableName());
		return;
	  }
		if (loopPrintingVar > 0 || this->val == nullptr || this->val == this)
		{
		  sb->append(variableName());
		}
		else
		{
		  try
		  {
			loopPrintingVar++;
			this->val->toQuotedString(printFlags, sb);
		  }
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to the exception 'finally' clause:
		  finally
		  {
			loopPrintingVar--;
		  }
		}
	}

	Iterator<Term*> *VariableTerm::iterator(bool skipSyntax)
	{
		return (this->val->isVar()) ? Collections::emptyIterator() : this->val->iterator(skipSyntax);
	}

	void VariableTerm::undo()
	{
		// remove self from references of bound variables
		if (this->downRef != nullptr)
		{
			// do not use downRef.upRef.remove(this), because it uses equals() which is overriden and is not equivalent to ==
			vector<VariableTerm*>::const_iterator it = this->downRef->upRef.begin();
			while (it != this->downRef->upRef.end())
			{
				if (*it == this)
				{
					(*it)->remove();
					break;
				}
				it++;
			}
			this->downRef = nullptr;
		}
		// update references 
		updateUpRefNoOccurs(this);
	}

	int VariableTerm::compareTo(Term *anotherTerm)
	{ // anotherTerm must be dereferenced.
		if (this->val != this)
		{
			return this->val->compareTo(anotherTerm);
		}
		if (!(anotherTerm->isVar()))
		{
			return BEFORE;
		}
		if (this == anotherTerm)
		{
			return EQUAL;
		}
		int x = this->termHashCode() - anotherTerm->termHashCode();
		if (x != 0)
		{
			return x;
		}
		throw InternalException("VariableTerm is not unique");
	}

	bool VariableTerm::isImmutable()
	{
		return false;
	}

int VariableTerm::nextID = 0;

	VariableTerm::VariableTerm(const wstring &sval) : VariableTerm(Prolog::M, sval)
	{
	}

	VariableTerm::VariableTerm(Prolog *m, const wstring &sval) : myID(nextID++)
	{
		this->val = this;
		this->varName = sval;
		Prolog *mach = m;
		this->timeStamp = mach->getCPFTimeStamp();
	}

	VariableTerm::VariableTerm(Prolog *mach, long long currentChoice, StructureTerm *newgoals) : myID(nextID++)
	{
		  this->val = this;
		  this->timeStamp = currentChoice;
		  this->getFdata()->setGoals(newgoals);
	}

	VariableTerm::VariableTerm(Prolog *mach, long long currentChoice) : myID(nextID++)
	{
		this->val = this;
		this->timeStamp = currentChoice;
	}

//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("cast") @Override public Term dref()
	Term *VariableTerm::dref()
	{
		  if ((this->val == this) || !(dynamic_cast<Term*>(this->val) != nullptr))
		  {
			  return this;
		  }
		  return this->val->dref();
	}

	int VariableTerm::arityOrType()
	{
		return Term::VAR;
	}

	bool VariableTerm::unbound()
	{
		return val == this;
	}

	bool VariableTerm::bind(Term *x, KPTrail *trail)
	{
	   if (x == val)
	   {
		   return true;
	   }
		val = x;
		trail->push(this);
		return true;
	}

	bool VariableTerm::Unify_TO(Term *that, KPTrail *trail)
	{
		// expects: this, that are dereferenced
		// return (this==that)?true:Ref.bind_to(that,trail);
		return val->bind(that, trail);
	}

	bool VariableTerm::eq(Term *x)
	{ // not a term compare!
		return dref() == x->dref();
	}

	wstring VariableTerm::getKey()
	{
		Term *t = dref();
		if (t->isVar())
		{
			return "";
		}
		else
		{
			return t->getKey();
		}
	}

	Term *VariableTerm::reaction(Term *agent)
	{

		Term *R = agent->action(dref());

		if (!(R->isVar()))
		{
			R = R->reaction(agent);
		}

		return R;
	}

	wstring VariableTerm::pprint()
	{
		return unbound() ? name() : dref()->pprint();
	}

	bool VariableTerm::equalsTerm(Term *aneof)
	{
		return aneof == this;
	}
}
