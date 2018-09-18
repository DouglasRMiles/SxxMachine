#pragma once

#include "../../fluents/SxxMachine/HashDict.h"
#include "../../terms/SxxMachine/FunBuiltin.h"
#include "../../terms/SxxMachine/ConstBuiltin.h"
#include <string>
#include <unordered_map>
#include <cmath>
#include <stdexcept>
#include <any>
#include <typeinfo>
#include <optional>
#include "exceptionhelper.h"
#include "stringhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class NameArity;
	class Nonvar;
	class StructureTerm;
	class ISTerm;
	class Prog;
}

namespace SxxMachine
{


	/**
	 * This class contains a dictionary of all builtins i.e. Java based classes
	 * callable from Prolog. They should provide a constructor and an exec method.
	 * 
	 * @author Paul Tarau
	 */
	class Builtins : public HashDict
	{

	//	static  class STermUnused implements ISTerm {
	//		Term[] argz;
	//
	//		STermUnused(ExecProg ep, Term[] args) {
	//			exp = ep;
	//			argz = args;
	//		}
	//
	//	}

	private:
		static const std::unordered_map builtinsMap;

		/**
		 * This constructor registers builtins. Please put a header here if you add a
		 * builtin at the bottom of this file.
		 */
	public:
		Builtins();

		/**
		 * registers a symbol as name of a builtin
		 */
		virtual void registerBI(NameArity *proto);

		virtual void registerBI(NameArity *proto, std::type_info c);

		/**
		 * Creates a new builtin
		 */
		virtual Nonvar *asBuiltin(NameArity *S);

		static Nonvar *toConstBuiltin(NameArity *c);

		static StructureTerm *toFunBuiltin(StructureTerm *f);

	}; // end Builtins

	// Code for actual kernel Builtins:
	// add your own builtins in UserBuiltins.java, by cloning the closest example:-)

	/**
	 * checks if something is a builtin
	 */
	class is_builtin final : public FunBuiltin
	{
	public:
		is_builtin();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * does its best to halt the program:-)
	 */
	class halt final : public ConstBuiltin
	{
	public:
		halt();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Calls an external program
	 */
	class system final : public FunBuiltin
	{
	public:
		system();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * opens a reader returning the content of a file char by char
	 */
	class file_char_reader final : public FunBuiltin
	{
	public:
		file_char_reader();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * opens a reader returning clauses from a file
	 */
	class file_clause_reader final : public FunBuiltin
	{
	public:
		file_clause_reader();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * opens a writer which puts characters to a file one by one
	 */
	class char_file_writer final : public FunBuiltin
	{
	public:
		char_file_writer();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * opens a writer which puts characters to a file one by one
	 */
	class clause_file_writer final : public FunBuiltin
	{
	public:
		clause_file_writer();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * get the standard output (a reader)
	 */
	class get_stdin final : public FunBuiltin
	{
	public:
		get_stdin();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * get standard output (a writer)
	 */
	class get_stdout final : public FunBuiltin
	{
	public:
		get_stdout();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * gets an arity for any term: n>0 for f(A1,...,An) 0 for a constant like a -1
	 * for a variable like X -2 for an integer like 13 -3 for real like 3.14 -4 for
	 * a wrapped JavaObject;
	 * 
	 * @see Term#getArity
	 */
	class get_arity final : public FunBuiltin
	{
	public:
		get_arity();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Dumps the current Java Stack
	 */
	class stack_dump final : public FunBuiltin
	{

	public:
		stack_dump();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * returns the real time spent up to now
	 */
	class ctime final : public FunBuiltin
	{

	public:
		ctime();

	private:
		static const long long t0 = System::currentTimeMillis();

	public:
		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * sets max answer counter for toplevel query if == 0, it will prompt the user
	 * for more answers if > 0 it will not print more than IO.maxAnswers if < 0 it
	 * will print them out all
	 */
	class set_max_answers final : public FunBuiltin
	{
	public:
		set_max_answers();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * reconsults a file of clauses while overwriting old predicate definitions
	 * 
	 * @see consult
	 * 
	 */

	class reconsult final : public FunBuiltin
	{
	public:
		reconsult();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * consults a file of clauses while adding clauses to existing predicate
	 * definitions
	 * 
	 * @see reconsult
	 */
	class consult final : public FunBuiltin
	{
	public:
		consult();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * shorthand for reconsulting the last file
	 */
	class reconsult_again final : public ConstBuiltin
	{
	public:
		reconsult_again();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * gets default database
	 */
	class get_default_db final : public FunBuiltin
	{
	public:
		get_default_db();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	// databse operations

	/**
	 * creates new database
	 */
	class new_db final : public FunBuiltin
	{
	public:
		new_db();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Puts a term on the local blackboard
	 */
	class db_add final : public FunBuiltin
	{

	public:
		db_add();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * removes a matching term if available, fails otherwise
	 */
	class db_remove final : public FunBuiltin
	{

	public:
		db_remove();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * collects all matching terms in a (possibly empty) list
	 * 
	 * @see out
	 * @see in
	 */
	class db_collect final : public FunBuiltin
	{

	public:
		db_collect();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Maps a DataBase to a Source enumerating its elements
	 */
	class db_source final : public FunBuiltin
	{

	public:
		db_source();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * collects all matching terms in a (possibly empty) list
	 */
	class at_key final : public FunBuiltin
	{

	public:
		at_key();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Returns a representation of predicate as a string constant
	 */
	class pred_to_string final : public FunBuiltin
	{

	public:
		pred_to_string();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * lists all the local blackboard to a string (Linda terms + clauses)
	 */
	class db_to_string final : public FunBuiltin
	{
	public:
		db_to_string();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * arg(I,Term,X) unifies X with the I-the argument of functor T
	 */
	class arg final : public FunBuiltin
	{
	public:
		arg();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * new_fun(F,N,T) creates a term T based on functor F with arity N and new free
	 * varables as arguments
	 */
	class new_fun final : public FunBuiltin
	{
	public:
		new_fun();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * converts a name to a list of chars
	 */
	class name_to_chars final : public FunBuiltin
	{
	public:
		name_to_chars();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * converts a name to a list of chars
	 */
	class chars_to_name final : public FunBuiltin
	{
	public:
		chars_to_name();

		static int st_exec(Prog *p, ISTerm *thiz);

	};

	/**
	 * returns a copy of a Term with variables uniformly replaced with constants
	 */
	class numbervars final : public FunBuiltin
	{
	public:
		numbervars();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Performs simple arithmetic operations like compute('+',1,2,Result)
	 */
	class compute final : public FunBuiltin
	{
	public:
		compute();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * controls trace levels for debugging
	 */
	class set_trace final : public FunBuiltin
	{
	public:
		set_trace();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Explores a finite iterator and return its successive values as a list.
	 */

	class source_list final : public FunBuiltin
	{
	public:
		source_list();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * maps a List to a Source
	 */
	class list_source final : public FunBuiltin
	{

	public:
		list_source();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * maps a Term to a Source
	 */
	class term_source final : public FunBuiltin
	{

	public:
		term_source();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Creates an Integer Source which advances at most Fuel (infinite if Fule==0)
	 * Steps computing each time x:= a*x+b. Called as:
	 * integer_source(Fuel,A,X,B,NewSource)
	 */
	class integer_source final : public FunBuiltin
	{

	public:
		integer_source();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Builds a Looping Source from a Source.
	 */
	class source_loop final : public FunBuiltin
	{
	public:
		source_loop();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Builds a Source from a Term
	 */
	class source_term final : public FunBuiltin
	{

	public:
		source_term();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	// Solvers and iterators over clauses

	/**
	 * When called as answer_source(X,G,R), it builds a new clause and maps it to an
	 * AnswerSource LD-resolution interpreter which will return one answer at a time
	 * of the form "the(X)" using G as initial resolvent and "no" when no more
	 * answers are available.
	 */
	class answer_source final : public FunBuiltin
	{
	public:
		answer_source();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Builds a new clause H:-B and maps it to an iterator
	 */
	class unfolder_source final : public FunBuiltin
	{
	public:
		unfolder_source();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * generic Source advancement step, similar to an iterator's nextElement
	 * operation, gets one element from the Source
	 */

	class getfl final : public FunBuiltin
	{
	public:
		getfl();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * generic Sink advancement step, sends one element to the Sink
	 */

	class putfl final : public FunBuiltin
	{
	public:
		putfl();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * frees a Fluent's resources and ensures it cannot produce/consume any new
	 * values
	 */
	class stop final : public FunBuiltin
	{
	public:
		stop();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Splits a (finite) Source in two new ones which inherit the current state of
	 * the parent.
	 */
	class split_source final : public FunBuiltin
	{
	public:
		split_source();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Merges all Sources contained in a List into one Source.
	 */
	class merge_sources final : public FunBuiltin
	{
	public:
		merge_sources();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Flushes to a Sink the content of a Source Fluent
	 */
	class discharge final : public FunBuiltin
	{
	public:
		discharge();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Collects a reference to or the content of a Sink
	 */

	class collect final : public FunBuiltin
	{
	public:
		collect();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Builds a StringSink which concatenates String representations of Terms with
	 * put/1 and the return their concatenation with collect/1
	 */
	class term_string_collector final : public FunBuiltin
	{
	public:
		term_string_collector();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Builds a TermCollector Sink which accumulates Terms with put/1 and the return
	 * them with collect/1
	 */
	class term_collector final : public FunBuiltin
	{
	public:
		term_collector();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Creates a char reader from a String.
	 */
	class string_char_reader final : public FunBuiltin
	{
	public:
		string_char_reader();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Creates a clause reader from a String.
	 */
	class string_clause_reader final : public FunBuiltin
	{
	public:
		string_clause_reader();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * set_persistent(Fluent,yes) makes a Fluent persistent - i.e. likely to keep
	 * its state on backtracking. This assumes that the Fluent remains accessible by
	 * being saved in a Database or as element of a Fluent with longer life span.
	 * 
	 * set_persistent(Fluent,no) makes the Fluent perish on backtracking (default
	 * behavior)
	 */
	class set_persistent final : public FunBuiltin
	{
	public:
		set_persistent();

		static int st_exec(Prog *p, ISTerm *thiz);
	};

	/**
	 * Gets the yes/no persistentcy value of a Fluent.
	 */
	class get_persistent final : public FunBuiltin
	{
	public:
		get_persistent();

		static int st_exec(Prog *p, ISTerm *thiz);

	};

}
