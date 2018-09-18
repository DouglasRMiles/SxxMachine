using namespace std;

#include "PredTable.h"
#include "Operation.h"
#include "Prolog.h"
#include "Success.h"

namespace SxxMachine
{

unordered_map<wstring, Operation> PredTable::predicateCache = unordered_map<wstring, Operation>();
unordered_map<wstring, Operation> PredTable::hiddenCache = unordered_map<wstring, Operation>();
unordered_map<wstring, Operation> PredTable::initsCache = unordered_map<wstring, Operation>();

	void PredTable::registerPredicate(const wstring& pkg, const wstring& functor, const int& arity, Operation cont)
	{
		registerPredicate(pkg, functor, arity, cont, false);
	}

	void PredTable::registerPredicate(const wstring& pkg, const wstring& functor, const int& arity, Operation cont, const bool& forced)
	{
		if(!storePred(keyString(pkg, functor, arity), cont, forced))
		{
		}
		if(!storePred(keyString("", functor, arity), cont, false))
		{
		}
	}

	bool PredTable::storePred(const wstring& key, Operation cont, const bool& forced)
	{
		Operation op = predicateCache[key];
		if(op == nullptr)
		{
			predicateCache.emplace(key, cont);
			return true;
		} else if(op == cont)
		{
			return true;
		}
		wstring oldmodule = moduleFromClass(op);
		if(cont == nullptr)
		{

			if(forced)
			{
				System::err::println("Deleting " + key + " which is implemented at " + oldmodule);
				predicateCache.erase(key);
				return true;
			} else
			{
				System::err::println("Not deleting " + key + " which is implemented at " + oldmodule);
				return false;
			}
		}
		wstring newmodule = moduleFromClass(cont);
		{
			if(op->getClass() != op->getClass())
			{
				if(!forced)
				{
					System::err::println("Not overriding " + key + " which is implemented at " + oldmodule + " with " + newmodule);
					hiddenCache.emplace(key, cont);
					return false;
				} else
				{
				}
			}
			hiddenCache.emplace(key, op);
			predicateCache.emplace(key, cont);
			System::err::println("Overriding " + key + " which is implemented at " + oldmodule + " with " + newmodule);
			return true;
		}
	}

	void PredTable::registerWMangle(const wstring& pkg, const wstring& functor, const wstring& mangle, const int& arity, Operation cont)
	{
		registerPredicate(pkg, functor, arity, cont);
		registerPredicate(pkg, mangle, arity, cont);
	}

	wstring PredTable::keyString(const wstring& pkg, const wstring& functor, const int& arity)
	{
		if(pkg == "" || isGlobal(pkg))
		{
			return PredFA(functor, arity);
		}
		return pkg + "::" + PredFA(functor, arity);
	}

	wstring PredTable::PredFA(const wstring& functor, const int& arity)
	{
		return "PRED_" + functor + "_" + to_string(arity);
	}

	bool PredTable::isGlobal(const wstring& pkg)
	{
		return pkg != "" && ("system" == pkg || Prolog::BUILTIN == pkg);
		// || "swi_supp".equals(pkg) || 
	}

	bool PredTable::isLocal(const wstring& pkg)
	{
		return pkg == "";
	}

	Operation PredTable::findPredicateOp(const wstring& pkg, const wstring& functor, const int& arity)
	{
		wstring key = keyString(pkg, functor, arity);
		Operation op = predicateCache[key];
		return op;
	}

	void PredTable::registerBuiltin(const wstring& functor, const int& arity, Operation cont)
	{
		wstring module = moduleFromClass(cont);
		if(arity == 0 && isEntryPoint(functor))
		{
			registerFileEntryPoint(module, functor, arity, cont);
		} else
		{
			registerPredicate("system", functor, arity, cont);
			registerPredicate(module, functor, arity, cont, true);
		}
	}

	bool PredTable::isEntryPoint(const wstring& functor)
	{

		return functor != "" && (functor == "main" || functor == "go" || functor == "top" || functor == "$init");
	}

	void PredTable::registerFileEntryPoint(const wstring& module, const wstring& functor, const int& arity, Operation cont)
	{
		wstring key = keyString(module, functor, arity);
		if(!StringHelper::startsWith(key, module))
		{
			key = module + "::" + key;
		}
		storePred(key, cont, false);
		if(!initsCache.containsValue(cont))
		{
			System::err::println("File " + module + " entry point: " + key);
			initsCache.emplace(key, cont);
		}
		registerPredicate(module, functor, arity, cont);
	}

	wstring PredTable::moduleFromClass(Operation op)
	{
		type_info class1 = op->getClass();
		type_info dc = class1.getDeclaringClass();
		if(dc != nullptr)
		{
			class1 = dc;
		}
		wstring moduleName = "" + class1.getName();
		int idx = (int)moduleName.find("$$");
		if(idx > 0)
		{
			moduleName = moduleName.substr(0, idx);
		}
		idx = (int)moduleName.find("_");
		if(idx > 0)
		{
			moduleName = moduleName.substr(idx + 1);
		}

		return moduleName;
	}

	void PredTable::registerBuiltin(const wstring& functor, const wstring& mangle, const int& arity, Operation cont)
	{
		registerBuiltin(functor, arity, cont);
		registerBuiltin(mangle, arity, cont);
	}

	void PredTable::runInits(Prolog* machine)
	{
		for(unordered_map<wstring, Operation>::const_iterator iterator = initsCache.begin(); iterator != initsCache.end(); ++iterator)
		{
			unordered_map::Entry<wstring, Operation> entry = (unordered_map::Entry<wstring, Operation>) *iterator;
			wstring name = entry.getKey();
			Operation oper = entry.getValue();
			int steps = 0;
			System::err::println("Running: " + name + " as " + oper);
			while(oper != nullptr && oper != Success::SUCCESS)
			{
				System::err::print(".");
				System::err::flush();
				steps++;
				oper = oper(machine);
			}
			System::err::println("\nDone " + to_string(steps));
			System::err::flush();
		}
		System::err::flush();
	}
}
