#ifndef BLACKBOARD
#define BLACKBOARD

#include "HashDict.h"
#include <string>
#include <unordered_map>
#include <vector>
#include <any>
#include "exceptionhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }

namespace SxxMachine
{


	/**
	This class implementes generic multiple tuples by key
	operations for use by the PrologBlackBoard class implementing
	Linda operations on Prolog terms. It uses the O1Queue class for
	keeping elements of type Term sharing the same key.
	
	@see PrologBlackBoard
	@see O1Queue
	@see Term
	*/
	class BlackBoard : public HashDict
	{

		/**
		 creates a new BlackBoard 
		 @see Term
		*/
	public:
		BlackBoard(std::unordered_map map);

		BlackBoard* toClone() override;

		/**
		 Removes the first Term having key k
		 or the first enumerated key if k is null
		*/
		// synchronized
	private:
		Term* pick(const std::string& k);

		void addBack(const std::string& k, std::vector V);

		/**
		 Removes the first matching Term or Clause from the
		 blackboard, to be used by Linda in/1 operation in
		 PrologBlackBoard
		
		 @see PrologBlackBoard#in()
		*/

		// synchronized
	protected:
		Term* take(const std::string& k, Term* pattern);

		/**
		 Adds a Term or Clause
		 to the the blackboard, to be used by Linda out/1 operation
		
		 @see PrologBlackBoard
		
		*/
		// synchronized
		void add(const std::string& k, Term* value);

		/** This gives an enumeration view for the sequence of
		   objects kept under key k.
		*/
		// synchronized
	public:
		virtual Iterator* toEnumerationFor(const std::string& k);

		// synchronized
		virtual Iterator* toEnumeration();

	};

	/**
	   Generates an Iterator view of the blackboard
	   @see Iterator
	*/

	class BBoardEnumerator : public Iterator
	{
	public:
		virtual ~BBoardEnumerator()
		{
			delete EQ;
			delete EH;
		}

		BBoardEnumerator(Iterator* EH);

	private:
		Iterator* EQ;

		Iterator* EH;

		// synchronized
	public:
		virtual bool hasNext();

		// synchronized
		virtual std::any next();

		virtual void remove();
	};

}


#endif	//#ifndef BLACKBOARD
