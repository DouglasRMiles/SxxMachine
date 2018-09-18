#ifndef PREDTABLE
#define PREDTABLE

#include <string>
#include <unordered_map>
#include <typeinfo>
#include "stringhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }

namespace SxxMachine
{


	class PredTable
	{

	public:
		static std::unordered_map<std::string, Operation> predicateCache;
		static std::unordered_map<std::string, Operation> hiddenCache;
		static std::unordered_map<std::string, Operation> initsCache;

		static void registerPredicate(const std::string& pkg, const std::string& functor, const int& arity, Operation cont);

		static void registerPredicate(const std::string& pkg, const std::string& functor, const int& arity, Operation cont, const bool& forced);

		static bool storePred(const std::string& key, Operation cont, const bool& forced);

		static void registerWMangle(const std::string& pkg, const std::string& functor, const std::string& mangle, const int& arity, Operation cont);

	private:
		static std::string keyString(const std::string& pkg, const std::string& functor, const int& arity);

		/**
		 * @param functor
		 * @param arity
		 * @return
		 */
		static std::string PredFA(const std::string& functor, const int& arity);

		/**
		 * @param pkg 
		 * @return
		 */
	public:
		static bool isGlobal(const std::string& pkg);

		static bool isLocal(const std::string& pkg);

		static Operation findPredicateOp(const std::string& pkg, const std::string& functor, const int& arity);

		static void registerBuiltin(const std::string& functor, const int& arity, Operation cont);

		/**
		 * @param functor
		 * @return
		 */
	private:
		static bool isEntryPoint(const std::string& functor);

		static void registerFileEntryPoint(const std::string& module, const std::string& functor, const int& arity, Operation cont);

		static std::string moduleFromClass(Operation op);

	public:
		static void registerBuiltin(const std::string& functor, const std::string& mangle, const int& arity, Operation cont);

		static void runInits(Prolog* machine);

	};

}


#endif	//#ifndef PREDTABLE
