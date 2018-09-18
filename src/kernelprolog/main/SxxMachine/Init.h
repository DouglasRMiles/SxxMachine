#pragma once

#include <string>
#include <unordered_map>
#include <vector>
#include <stdexcept>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class DataBase;
	class Builtins;
	class Clause;
	class Term;
}

namespace SxxMachine
{


	/**
	  Initializes Prolog. Sets up shared data areas.
	  Ensures that lib.class, obtained from lib.pro->lib.java is loaded.
	*/
	class Init
	{
	public:
		static constexpr int version = 101;

		static std::string getInfo();

		static std::string default_lib;

		static DataBase *default_db;

		static Builtins *builtinDict;

		static Clause *getGoal(const std::string &line);

		static void run_query(const std::string &query);

		/**
		* reads a query from input strea
		*/
		static Clause *getGoal();

		/**
		* evalutes a query
		*/
		static void evalGoal(Clause *Goal);

		static bool moreAnswers(int i);

		/**
		*  evaluates and times a Goal querying program P
		*/

		static void timeGoal(Clause *Goal);

		/**
		*  (almost) standard Prolog-like toplevel in Java
		*  (will) print out variables and values
		*/
		static void standardTop();

		static void standardTop(const std::string &prompt);

		/**
		 Asks Prolog a query Answer, Goal and returns the
		 first solution of the form "the(Answer)" or the constant
		 "no" if no solution exists
		*/
		static Term *askProlog(Term *Answer, Term *Body);

		/**
		Asks Prolog a query Goal and returns the
		first solution of the form "the(Answer)" , where
		Answer is an instance of Goal or the constant
		"no" if no solution exists
		*/
		static Term *askProlog(Term *Goal);

		/**
		Asks Prolog a String query and gets back a string Answer
		of the form "the('[]'(VarsOfQuery))" containing a binding
		of the variables or the first solution to the query or "no"
		if no such solution exists
		*/
		static std::string askProlog(const std::string &query);

		static bool run(std::vector<std::string> &args);

		/**
		 Initialises key data areas. Runs a first query, which,
		 if suceeeds a true, otherwise false is returned
		*/
		static bool startProlog();

	};

}
