using namespace std;

#include "ChoicePointFrame.h"
#include "Prolog.h"
#include "Term.h"

namespace SxxMachine
{

	void ChoicePointFrame::restore(Prolog* engine)
	{
	  engine->cont = this->cont;
	}

	wstring ChoicePointFrame::toString()
	{
	return ChoicePointFrame::typeid->getName() + '{' +
			"time:" + to_string(this->timeStamp) +
			" cont:" + this->cont +
			" bp:" + this->bp +
			" tr:" + to_string(this->tr) +
			" b0:" + to_string(this->b0) +
			'}';
	}
}
