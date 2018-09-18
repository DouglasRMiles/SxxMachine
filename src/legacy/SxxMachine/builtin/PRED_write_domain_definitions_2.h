#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <string>
#include "exceptionhelper.h"
#include "stringhelper.h"
#include "stringbuilder.h"
#include "tangible_filesystem.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Term;
	class Prolog;
	class PrologException;
}

namespace SxxMachine
{


	using PrologException = SxxMachine::PrologException;
	using Operation = SxxMachine::Operation;
	using P2 = SxxMachine::Predicate::P2;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	/**
	 * <p>write_domain_definitions(+OutputDir,+DomainDefinitionsList)
	 * <p>Writes domain definitions into properties file in the folder corresponding to package.
	 * <p>Arguments are:<UL>
	 * <LI> OutputDir - the base directory for output. It will be used as prefix for package directory</LI>
	 * <LI> DomainDefinitionsList - the list of domain definitions. Each item is expected to be complex StructureTerm:
	 * packageName:domainName = (aaa;bbb*;ccc(ddd,eee))</LI>
	 * </UL>
	 * <p>All items must reference the same package.
	 * <p>If the properties file already exist, its content will be merged with given domain definitions.
	 * The existing domain definition will be overwritten by new one.
	 * <p>The predicate is thread safe. Concurrent threads will write definitions sequentially, one by one, 
	 * merging the domain definitions, written earlier. The execution order for competing threads is not defined.   
	 *   
	 * @author semenov
	 *
	 */
	class PRED_write_domain_definitions_2 : public P2
	{

	public:
		PRED_write_domain_definitions_2();

		PRED_write_domain_definitions_2(Term *a0, Term *a1, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;

		/**
		 * Writes given domain definition as properties file for given package and destination folder.
		 * The method is static and synchronized to allow writing from  different threads.
		 * Writing from different processes will lead to unpredicted results. 
		 * @param folder
		 * @param packageName
		 * @param domains
		 */
	private:
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
		static void writeDomainDefinitions(const std::string &folder, const std::string &packageName, Properties *domains);
	};

}
