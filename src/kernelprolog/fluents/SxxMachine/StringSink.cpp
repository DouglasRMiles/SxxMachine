using namespace std;

#include "StringSink.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../main/SxxMachine/Builtins.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "StringBuilder.h"

namespace SxxMachine
{

	StringSink::StringSink(Prog* p) : Sink(p)
	{
		this->buffer = new StringBuilder();
	}

	int StringSink::putElement(Term* t)
	{
		buffer->append(t->toUnquoted());
		return 1;
	}

	void StringSink::stop()
	{
		buffer = nullptr;
	}

	Term* StringSink::collect()
	{
		return TermData::SYM(buffer->toString());
	}
}
