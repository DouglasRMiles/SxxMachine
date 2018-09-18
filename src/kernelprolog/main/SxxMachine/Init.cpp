using namespace std;

#include "Init.h"
#include "../../fluents/SxxMachine/DataBase.h"
#include "Builtins.h"
#include "../../terms/SxxMachine/Clause.h"
#include "../../io/SxxMachine/IO.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../terms/SxxMachine/Expect.h"

namespace SxxMachine
{

	wstring Init::getInfo()
	{
		wstring s = "Kernel Prolog " + to_string(version / 100.0) + "\n" + "Copyright (c) Paul Tarau 1999-2011\n";
		return s;
	}

wstring Init::default_lib = "jsrc/kernelprolog/main/SxxMachine/lib.pro";
DataBase* Init::default_db;
Builtins* Init::builtinDict;

	Clause* Init::getGoal(const wstring& line)
	{
		Clause* G = Clause::goalFromString(line);
		// IO.mes("getGoal: "+G+" DICT: "+G.dict); //OK
		return G;
	}

	void Init::run_query(const wstring& query)
	{
		Clause* Goal = getGoal(query);
		timeGoal(Goal);
	}

	Clause* Init::getGoal()
	{
		return getGoal(IO::promptln("?- "));
	}

	void Init::evalGoal(Clause* Goal)
	{
		Clause* NamedGoal = Goal->cnumbervars(false);
		Term* Names = NamedGoal->getHead();
		if(!(Names->isStructure()))
		{ // no vars in Goal
			Term* Result = Prog::firstSolution(Goal->getHead(), Goal->getBody());
			if(!Prolog::aNo->equalsTerm(Result))
			{
				Result = Prolog::aYes;
			}
			IO::println(Result->pprint());
			return;
		}

		Prog* E = new Prog(Goal, nullptr);

		for(int i = 0;; i++)
		{
			Term* R = Prog::ask_engine(E);
			// IO.mes("GOAL:"+Goal+"\nANSWER: "+R);
			if(R == nullptr)
			{
				IO::println("no");
				break;
			}
			if(Names->isStructure())
			{
				Term* NamedR = R->numbervars();
				for(int j = 0; j < Names->arityOrType(); j++)
				{
					IO::println(Expect::asStruct(Names)->ArgDeRef(j) + "=" + NamedR->ArgDeRef(j));
				}
				// IO.println(";");
				if(!moreAnswers(i))
				{
					E->stop();
					break;
				}
			}
		}
	}

	bool Init::moreAnswers(const int& i)
	{
		if(IO::maxAnswers == 0)
		{ // under user control
			wstring more = IO::promptln("; for more, <enter> to stop: ");
			return more == ";";
		} else if(i < IO::maxAnswers || IO::maxAnswers < 0)
		{
			IO::println(";"); // print all remaining
			return true;
		} else
		{ // i >= ...}
			IO::println(";");
			IO::println("No more answers computed, max reached! (" + to_string(IO::maxAnswers) + ")");
			return false;
		}
	}

	void Init::timeGoal(Clause* Goal)
	{
		long long t1 = System::currentTimeMillis();
		try
		{
			evalGoal(Goal);
		} catch(const runtime_error& e)
		{
			IO::errmes("Execution error in goal:\n  " + Goal->pprint() + ".\n", e);
		}
		long long t2 = System::currentTimeMillis();
		IO::println("Time: " + to_string((t2 - t1) / 1000.0) + " sec");
	}

	void Init::standardTop()
	{
		standardTop("?- ");
	}

	void Init::standardTop(const wstring& prompt)
	{
		for(;;)
		{
			Clause* G = getGoal(IO::promptln(prompt));
			if(nullptr == G)
			{
				continue;
			}
			IO::peer = nullptr;
			timeGoal(G);
		}
	}

	Term* Init::askProlog(Term* Answer, Term* Body)
	{
		return Prog::firstSolution(Answer, Body);
	}

	Term* Init::askProlog(Term* Goal)
	{
		return askProlog(Goal, Goal);
	}

	wstring Init::askProlog(const wstring& query)
	{
		Clause* Goal = getGoal(query);
		Term* Body = Goal->getBody();
		return askProlog(Body)->pprint();
	}

	bool Init::run(std::vector<wstring>& args)
	{
		if(nullptr != args)
		{
			for(int i = 0; i < args.size(); i++)
			{
				wstring result = askProlog(args[i]);
				IO::trace(result);
				if("no" == result.intern())
				{
					IO::errmes("failing cmd line argument: " + args[i]);
					return false;
				}
			}
		}
		return true;
	}

	bool Init::startProlog()
	{
		// should be final for expiration mechanism (it should avoid overriding!)
		IO::println(getInfo());
		default_db = new DataBase(unordered_map());
		return true;
	}
}
