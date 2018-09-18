using namespace std;

#include "VarNumberer.h"
#include "../../fluents/SxxMachine/HashDict.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "PseudoVar.h"

namespace SxxMachine
{

	VarNumberer::VarNumberer()
	{
		dict = new HashDict();
		ctr = 0;
	}

	Term* VarNumberer::action(Term* place)
	{
		place = place->dref();
		// IO.trace(">>action: "+place);
		if(place->isVar())
		{
			SymbolTerm* root = any_cast<SymbolTerm*>(dict->get(place));
			if(nullptr == root)
			{
				root = new PseudoVar(ctr++);
				root->name_RenamedTODO = root->name_RenamedTODO + place->name();
				dict->put(place, root);
			}
			place = root;
		}
		// IO.trace("<<action: "+place);
		return place;
	}
}
