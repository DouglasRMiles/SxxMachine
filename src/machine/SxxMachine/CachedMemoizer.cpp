using namespace std;

#include "CachedMemoizer.h"
#include "CachedMemoizer.h"
#include "InterruptedException.h"

namespace SxxMachine
{

	optional<int> CachedMemoizer<T, U>::Examples::longCalculation(optional<int>& x)
	{
	  try
	  {
		delay(1'000);
	  } catch(const InterruptedException& ignored)
	  {
	  }
	  return x * 2;
	}

	void CachedMemoizer<T, U>::Examples::automaticMemoizationExample()
	{
	  long long startTime = System::currentTimeMillis();
	  optional<int> result1 = g->apply(1);
	  long long time1 = System::currentTimeMillis() - startTime;
	  startTime = System::currentTimeMillis();
	  optional<int> result2 = g->apply(1);
	  long long time2 = System::currentTimeMillis() - startTime;
	  cout << result1 << endl;
	  cout << result2 << endl;
	  cout << time1 << endl;
	  cout << time2 << endl;
	}

	void CachedMemoizer<T, U>::Examples::automaticMemoizationExample2()
	{
	  long long startTime = System::currentTimeMillis();
	  optional<int> result1 = f3m->apply(2).apply(3).apply(4);
	  long long time1 = System::currentTimeMillis() - startTime;
	  startTime = System::currentTimeMillis();
	  optional<int> result2 = f3m->apply(2).apply(3).apply(4);
	  long long time2 = System::currentTimeMillis() - startTime;
	  cout << result1 << endl;
	  cout << result2 << endl;
	  cout << time1 << endl;
	  cout << time2 << endl;
	}
}
