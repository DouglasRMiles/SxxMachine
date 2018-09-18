#pragma once

#include <unordered_map>
#include <iostream>
#include <functional>
#include <optional>
#include "exceptionhelper.h"

namespace SxxMachine
{



	template<typename T, typename U>
	class CachedMemoizer
	{

  private:
	  const std::unordered_map<T, U> cache = new ConcurrentHashMap<T, U>();

	  CachedMemoizer()
	  {
	  }

	  internal *std::function<U(T)
	  {
		return [&] (std::any input)
		{
		cache.computeIfAbsent(input, function::apply);
		};
	  }

  public:
	  static std::function<U<T, *U>(T)
	  {
		CachedMemoizer<T, U> tempVar();
		return (&tempVar)->doMemoize(function);
	  }

  public:
	  class Examples
	  {
		// example use
	public:
		virtual ~Examples()
		{
			delete f;
			delete g;
			delete f3;
			delete f3m;
		}

		virtual std::optional<int> longCalculation(std::optional<int> &x);

		std::function<int(int)> f = this::longCalculation;
		std::function<int(int)> g = CachedMemoizer::memoize(f);

		virtual void automaticMemoizationExample();

		std::function<std::function<std::function<int(int)>>> f3 = [&] (std::any x)
		{
	[&] (std::any y)
	{
		[&] (std::any z)
		{
		return longCalculation(x) + longCalculation(y) - longCalculation(z);
		};
	};
		};
		std::function<std::function<std::function<int(int)>>> f3m = memoize([&] (std::any x)
		{
	memoize([&] (std::any y)
	{
		memoize([&] (std::any z)
		{
		return longCalculation(x) + longCalculation(y) - longCalculation(z);
		});
	});
		});

		virtual void automaticMemoizationExample2();
	  };
	};

}
