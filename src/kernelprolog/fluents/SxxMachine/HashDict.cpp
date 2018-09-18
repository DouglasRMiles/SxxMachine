using namespace std;

#include "HashDict.h"

namespace SxxMachine
{

	HashDict::HashDict(unordered_map map2) : map(map2)
	{
	}

	HashDict::HashDict() : HashDict(new HashMap())
	{
	}

	wstring HashDict::name()
	{
		return getClass().getName() + hashCode();
	}

	wstring HashDict::stat()
	{
		return "BlackBoard: " + to_string(size());
	}

	HashDict* HashDict::toClone()
	{
		//soopsy();
		//HashDict other = (HashDict) super.toClone();
		unordered_map map2 = unordered_map();
		HashDict* other = new HashDict(map2);
		map.putAll(map2);
		return other;
	}

	int HashDict::size()
	{
		//		if (super.size() != map.size()) {
		//			oopsy();
		//		}
		return map.size();
	}

	any HashDict::get(any k)
	{
		any o1 = map[k];
		//		Object o2 = super.get(k);
		//		if (o1 != o2) {
		//			oopsy();
		//		}
		return o1;
	}

	any HashDict::put(any k, any v)
	{
		any o1 = map.emplace(k, v);
		//		Object o2 = super.put(k, v);
		//		if (o1 != o2) {
		//			oopsy();
		//		}
		return o1;
	}

	void HashDict::remove(const wstring& k)
	{
		//super.remove(k);
		map.erase(k);
	}

	Set* HashDict::keySet()
	{
		//		if (map.keySet().size() != super.keySet().size()) {
		//			oopsy();
		//		}
		return map.keySet();
	}

	bool HashDict::isEmpty()
	{
		//		if (super.isEmpty() != map.isEmpty()) {
		//			oopsy();
		//		}
		return map.empty();
	}

	void HashDict::oopsy()
	{
//JAVA TO C++ CONVERTER TODO TASK: This exception's constructor requires an argument:
//ORIGINAL LINE: new Exception().printStackTrace();
		(runtime_error())->printStackTrace();

	}
}
