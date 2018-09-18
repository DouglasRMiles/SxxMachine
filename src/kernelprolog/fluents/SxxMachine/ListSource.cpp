using namespace std;

#include "ListSource.h"
#include "../../../machine/SxxMachine/Nonvar.h"
#include "../../terms/SxxMachine/Prog.h"

namespace SxxMachine
{

	ListSource::ListSource(Nonvar *xs, Prog *p) : IterableSource(Copier::ConsToVector(xs), p)
	{
	}
}
