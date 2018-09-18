using namespace std;

#include "ChoicePointStack.h"
#include "Trail.h"
#include "ChoicePointFrame.h"
#include "Operation.h"
#include "Prolog.h"
#include "Term.h"

namespace SxxMachine
{

	ChoicePointStack::ChoicePointStack(Trail *trail) : trail(trail)
	{
	  this->level = -1;
	  this->frames = std::vector<ChoicePointFrame*>(256);
	}

	void ChoicePointStack::doubleFramesCapacity()
	{
	  std::vector<ChoicePointFrame*> newFrames(this->frames.size() << 2);
	  System::arraycopy(this->frames, 0, newFrames, 0, this->frames.size());
	  this->frames = newFrames;
	}

	ChoicePointFrame *ChoicePointStack::push(Prolog *engine, Operation next, BiConsumer<ChoicePointFrame*, Prolog*> *restore)
	{
	  this->level++;
	  if (this->level >= this->frames.size())
	  {
		doubleFramesCapacity();
	  }
	  if (this->frames[this->level] == nullptr)
	  {
		this->frames[this->level] = new ChoicePointFrame();
	  }
	  this->top_Renamed = this->frames[this->level];
	  this->top_Renamed->b0 = engine->B0;
	  this->top_Renamed->tr = engine->trail->top();
	  this->top_Renamed->bp = next;
	  this->top_Renamed->timeStamp = this->trail->timeStamp;
	  this->top_Renamed->cont = engine->cont;
	  this->top_Renamed->restore_Renamed = restore;
	  return this->top_Renamed;
	}

	ChoicePointFrame *ChoicePointStack::push(Prolog *engine, int arity, Operation next)
	{
	 return push(engine, engine->AREGS, arity, next);
	}

	ChoicePointFrame *ChoicePointStack::push(Prolog *engine, std::vector<Term*> &AREGS, int arity, Operation next)
	{
	  ChoicePointFrame *topFrame = push(engine, next, ChoicePointStack::restoreN);
	  if (topFrame->arity != arity)
	  {
		topFrame->arity = arity;
		topFrame->AREGS = std::vector<Term*>(arity);
	  }
	  System::arraycopy(AREGS, 0, topFrame->AREGS, 0, topFrame->AREGS.size());
	  return topFrame;
	}

	void ChoicePointStack::restoreN(ChoicePointFrame *frame, Prolog *engine)
	{
	  engine->cont = frame->cont;
	  engine->AREGS = frame->AREGS;
	  //System.arraycopy(frame.AREGS, 0, engine.AREGS, 0, frame.arity);
	}

	void ChoicePointStack::restore0(ChoicePointFrame *frame, Prolog *engine)
	{
	  engine->cont = frame->cont;
	}

	void ChoicePointStack::cut(int i)
	{
	  if (this->level > i)
	  {
		Arrays::fill(this->frames, i + 1, this->level + 1, nullptr);
		this->level = i;
		this->top_Renamed = this->frames[this->level];
	  }
	  this->trail->timeStamp = this->top_Renamed->timeStamp;
	}

	void ChoicePointStack::delete_Renamed()
	{
	  this->level--;
	  this->top_Renamed = this->frames[this->level];
	  this->trail->timeStamp = this->top_Renamed->timeStamp;
	}

	void ChoicePointStack::init()
	{
	  this->top_Renamed = nullptr;
	  this->level = -1;
	  this->trail->timeStamp = numeric_limits<long long>::min();
	  Arrays::fill(this->frames, nullptr);
	}

//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("unused") private void updateTrailTimeStamp()
	void ChoicePointStack::updateTrailTimeStamp()
	{
	  this->trail->timeStamp = this->top_Renamed != nullptr ? this->top_Renamed->timeStamp : numeric_limits<long long>::min();
	}

	int ChoicePointStack::top()
	{
	  return this->level;
	}

	int ChoicePointStack::max()
	{
	  // Since the stack is represented as a linked list, there is no limit.
	  return numeric_limits<int>::max();
	}
}
