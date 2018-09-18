#ifndef DATABASE
#define DATABASE

#include "BlackBoard.h"
#include <string>
#include <unordered_map>
#include <vector>
#include <stdexcept>
#include <any>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class pred_to_string; }
namespace SxxMachine { class Parser; }
namespace SxxMachine { class BlackBoard; }
namespace SxxMachine { class Clause; }
namespace SxxMachine { class HashDict; }
class StringBuilder;

namespace SxxMachine
{

	/**
	 * Implements a Term and Clause objects based blackboard (database).
	 */
	class DataBase : public BlackBoard
	{

	public:
		DataBase(std::unordered_map map);

	private:
		static SymbolTerm* yes;

		static SymbolTerm* no;

		/**
		 * Removes a matching Term from the blackboards and signals failure if no such
		 * term is found.
		 */
	public:
		virtual Term* cin(const std::string& k, Term* pattern);

		/**
		 * Adds a Term to the blackboard
		 */
		virtual Term* out(const std::string& k, Term* pattern, const bool& copying);

		/**
		 * Adds a copy of a Term to the blackboard
		 */

		// synchronized
		virtual Term* out(const std::string& key, Term* pattern);

	private:
		void all0(const int& max, std::vector To, const std::string& k, Term* FXs);

		Term* all1(const int& max, Term* FXs);

		Term* all2(const int& max, const std::string& k, Term* FXs);

		/**
		 * Returns a (possibly empty) list of matching Term objects
		 */
	public:
		virtual Term* all(const std::string& k, Term* FX);

		/**
		 * Gives an Iterator view to the O1Queue of Term or Clause objects stored at key k
		 * 
		 * @see O1Queue
		 * @see Term
		 * @see Clause
		 */
		Iterator* toEnumerationFor(const std::string& k) override;
		  virtual Iterator* toEnumerationFor(Term* first);


		/**
		 * Returns a formatted String representation of this PrologBlackboard object
		 */
		virtual std::string pprint();

		virtual std::string pred_to_string(const std::string& key);

		/**
		 * consults or reconsults a Prolog file by adding or overriding existing
		 * predicates to be extended to load from URLs transparently
		 */
		static bool fromFile(const std::string& f, const bool& overwrite);

		/**
		 * reconsults a file by overwritting similar predicates in memory
		 */
		static bool fromFile(const std::string& f);

	private:
		static std::string lastFile;

		/**
		 * reconsults the last reconsulted file
		 */
	public:
		static bool fromFile();

	private:
		static bool fileToProg(const std::string& fname, const bool& overwrite);

		/**
		 * Reads a set of clauses from a stream and adds them to the blackboard.
		 * Overwrites old predicates if asked to. Returns true if all went well.
		 */
	public:
		static bool streamToProg(Reader* sname, const bool& overwrite);

		DataBase* toClone() override;

	private:
		static bool streamToProg(const std::string& fname, Reader* sname, const bool& overwrite);

		static void apply_parser(Parser* p, const std::string& fname, BlackBoard* ktable);

		/**
		 * adds a Clause to the joint Linda and Predicate table
		 */
	public:
		static void addClause(Clause* C, HashDict* ktable);

		/**
		 * adds a Clause to the joint Linda and Predicate table
		 * 
		 * @see Clause
		 */
		static void processClause(Clause* C, HashDict* ktable);

	};

}


#endif	//#ifndef DATABASE
