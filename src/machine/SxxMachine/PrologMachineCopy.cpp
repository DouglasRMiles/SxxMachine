using namespace std;

#include "PrologMachineCopy.h"
#include "PrologControl.h"
#include "Prolog.h"
#include "PrologClassLoader.h"
#include "HashtableOfTerm.h"
#include "InternalDatabase.h"
#include "Term.h"

namespace SxxMachine
{

	PrologMachineCopy *PrologMachineCopy::save(PrologControl *ctl)
	{
	  return new PrologMachineCopy(ctl->engine, true);
	}

	PrologMachineCopy *PrologMachineCopy::save(Prolog *engine)
	{
	  return new PrologMachineCopy(engine, true);
	}

	PrologMachineCopy *PrologMachineCopy::cloneCheap(Prolog *engine)
	{
	  return new PrologMachineCopy(engine, false);
	}

	PrologMachineCopy::PrologMachineCopy(Prolog *engine, bool deep) : pcl(engine->pcl)
	{
	  // During backup, copy all terms using a single consistent copyHash.
	  // This isolates the copy from the source interpreter, in case it gets
	  // modified again later.
	  //
	  // During restore terms are not copied.
	  // try {
	  // engine.copyHash.clear();
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("unused") java.util.IdentityHashMap<Object, Term> copyHash = new java.util.IdentityHashMap<Object, Term>();
	  IdentityHashMap<any, Term*> *copyHash = new IdentityHashMap<any, Term*>();
	  if (deep)
	  {
		this->hashManager = engine->getHashManager()->copyDeep(copyHash);
		this->internalDB = engine->internalDB->copyInternalDatabase(true, copyHash);
	  }
	  else
	  {
		noCopy_Renamed = true;
		this->hashManager = engine->getHashManager();
		this->internalDB = engine->internalDB;
	  }
	  // } finally {
	  // engine.copyHash.clear();
	  // }
	}

	bool PrologMachineCopy::noCopy()
	{
	  // TODO Auto-generated method stub
	  return this->noCopy_Renamed;
	}
}
