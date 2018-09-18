#pragma once

#include <string>
#include <unordered_map>
#include <stdexcept>
#include <any>

namespace SxxMachine
{


	/**
	 * General purpose dictionary
	 */
	class HashDict
	{
	public:
		HashDict(std::unordered_map map2);

		HashDict();

		virtual std::string name();

		virtual std::string stat();

		//@Override
		virtual HashDict *toClone();

		virtual int size();

		virtual std::any get(std::any k);

		virtual std::any put(std::any k, std::any v);

		virtual void remove(const std::string &k);

		virtual Set *keySet();

		const std::unordered_map map;

		virtual bool isEmpty();

	private:
		void oopsy();

	};

}
