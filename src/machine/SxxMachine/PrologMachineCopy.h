#ifndef PROLOGMACHINECOPY
#define PROLOGMACHINECOPY

#include <any>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class PrologControl; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class PrologClassLoader; }
namespace SxxMachine { class HashtableOfTerm; }
namespace SxxMachine { class InternalDatabase; }

namespace SxxMachine
{


	/**
	 * Backup of a Prolog interpreter that can later create a new interpreter.
	 * <p>
	 * A new interpreter can be bootstrapped by passing this copy object to a
	 * PrologControl constructor. Machine copies are primarily intended to let
	 * callers reuse the state constructed by running {@code consult(+File)} prior
	 * to perform any module initialization or predicate evaluation.
	 * <p>
	 * Only the PrologClassLoader, internal hash manager and database are copied.
	 * These are sections of an interpreter that relate to what code is available.
	 */
	class PrologMachineCopy
	{
	  /**
	   * Save the database of a current PrologControl.
	   *
	   * @param ctl control to copy the database of.
	   * @return the copy.
	   */
  public:
	  virtual ~PrologMachineCopy()
	  {
		  delete pcl;
		  delete hashManager;
		  delete internalDB;
	  }

	  static PrologMachineCopy* save(PrologControl* ctl);

	  /**
	   * Save the database of a current Prolog interpreter.
	   *
	   * @param engine interpreter to copy the database of.
	   * @return the copy.
	   */
	  static PrologMachineCopy* save(Prolog* engine);

	  static PrologMachineCopy* cloneCheap(Prolog* engine);

  protected:
	  PrologClassLoader* const  pcl;
	  HashtableOfTerm* const  hashManager;
	  InternalDatabase* const  internalDB;
  private:
//JAVA TO C++ CONVERTER NOTE: Fields cannot have the same name as methods:
	  bool noCopy_RenamedTODO = false;

	  PrologMachineCopy(Prolog* engine, const bool& deep);

  public:
	  virtual bool noCopy();

	};

}


#endif	//#ifndef PROLOGMACHINECOPY
