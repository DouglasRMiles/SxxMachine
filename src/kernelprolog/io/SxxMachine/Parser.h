#pragma once

#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include <string>
#include <vector>
#include <cmath>
#include <cctype>
#include <stdexcept>
#include <any>
#include "exceptionhelper.h"
#include "stringhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
	class HashDict;
	class Clause;
	class LongTerm;
	class Var;
	class StructureTerm;
}

namespace SxxMachine
{


	/**
	 * Lexicographic analyser reading from a stream
	 */
	class LexerHIDE : public StreamTokenizer
	{
	protected:
		Reader *input;

	public:
		virtual ~LexerHIDE()
		{
			delete input;
			delete dict;
		}

		LexerHIDE(Reader *I) throw(IOException);

		/**
		 * Path+File name based constructor Used in prolog2java
		 */

		LexerHIDE(const std::string &path, const std::string &s) throw(IOException); // stream

		/**
		 * String based constructor. Used in queries ended by \n + prolog2java.
		 */

		LexerHIDE(const std::string &s) throw(std::runtime_error);

		LexerHIDE() throw(IOException);

	private:
		static const std::string anonymous;

		static std::string char2string(int c);

		bool inClause = false;

	public:
		virtual bool atEOF();

		virtual bool atEOC();

	protected:
		static Term *make_const(const std::string &s);

	private:
		static Term *make_fun(const std::string &s);

		static Term *make_int(double n);

		static Term *make_real(double n);

		static Term *make_number(double nval);

		Term *make_var(const std::string &s);

		void wordChar(char c);

	public:
		HashDict *dict;

	private:
		Term *getWord(bool quoted) throw(IOException);

	protected:
		virtual Term *next() throw(IOException);
	};

	class varToken : public StructureTerm
	{
	public:
		varToken(Var *X, SymbolTerm *C, LongTerm *I);

		StructureTerm *clone() override;
	};

	class intToken : public StructureTerm
	{
	public:
		intToken(int i);
	};

	class realToken : public StructureTerm
	{
	public:
		realToken(double i);
	};

	class constToken : public StructureTerm
	{
	private:
		constToken(SymbolTerm *c);

	public:
		constToken(const std::string &s);
	};

	class stringToken : public StructureTerm
	{
	public:
		stringToken(constToken *c);
	};

	class funToken : public StructureTerm
	{
	public:
		funToken(const std::string &s);
	};

	class eocToken : public StructureTerm
	{
	public:
		eocToken();
	};

	class eofToken : public StructureTerm
	{
	public:
		eofToken();
	};

	class iffToken : public StructureTerm
	{
	public:
		iffToken(const std::string &s);
	};

	class KPToken : public SymbolTerm::Dynamic
	{
	public:
		KPToken(const std::string &s);
	};

	class lparToken : public KPToken
	{
	public:
		lparToken();
	};

	class rparToken : public KPToken
	{
	public:
		rparToken();
	};

	class lbraToken : public KPToken
	{
	public:
		lbraToken();
	};

	class rbraToken : public KPToken
	{
	public:
		rbraToken();
	};

	class barToken : public KPToken
	{
	public:
		barToken();
	};

	class commaToken : public KPToken
	{
	public:
		commaToken();
	};

	/**
	 * Simplified Prolog parser: Synatax supported: a0:-a1,...,an. - no operators (
	 * except toplevel :- and ,) - use quotes to create special symbol names, i.e.
	 * compute('+',1,2, Result) and write(':-'(a,','(b,c)))
	 */

	class Parser : public LexerHIDE
	{

	public:
		Parser(Reader *I) throw(IOException);

		/*
		 * used in prolog2java
		 */
		Parser(const std::string &p, const std::string &s) throw(IOException);

		Parser(const std::string &s) throw(std::runtime_error);

		/**
		 * Main Parser interface: reads a clause together with variable name information
		 */
		virtual Clause *readClause();

		static Clause *errorClause(std::runtime_error e, const std::string &type, int line, bool verbose);

		static bool isError(Clause *C);

		static void showError(Clause *C);

		static Clause *toClause(Term *T, HashDict *dict);

	private:
		Clause *readClauseOrEOF() throw(IOException);

		Term *getConjCont(Term *curr) throw(IOException);

	protected:
		Term *getTerm(Term *n) throw(IOException);

		virtual Term *getTerm() throw(IOException);

	private:
		std::vector<Term*> getArgs() throw(IOException);

		Term *getList() throw(IOException);

		Term *getListCont(Term *curr) throw(IOException);

		static std::string patchEOFString(const std::string &s);

	public:
		static Clause *clsFromString(const std::string &s);

	};

	class ParserException : public IOException
	{
	public:
		ParserException(const std::string &e, const std::string &f, Term *n);
	};

}
