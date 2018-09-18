using namespace std;

#include "Parser.h"
#include "../../fluents/SxxMachine/HashDict.h"
#include "IO.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "../../terms/SxxMachine/Expect.h"
#include "../../../machine/SxxMachine/LongTerm.h"
#include "../../terms/SxxMachine/Clause.h"
#include "../../terms/SxxMachine/Var.h"
#include "../../main/SxxMachine/Builtins.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/Nonvar.h"

namespace SxxMachine
{

	LexerHIDE::LexerHIDE(Reader* I) throw(IOException) : java::io::StreamTokenizer(I)
	{
		this->input = I;
		parseNumbers();
		eolIsSignificant(true);
		ordinaryChar('.');
		ordinaryChar('-'); // creates problems with -1 etc.
		ordinaryChar('/');
		quoteChar('\'');
		quoteChar('\"');
		wordChar('$');
		wordChar('_');
		slashStarComments(true);
		commentChar('%');
		dict = new HashDict();
	}

	LexerHIDE::LexerHIDE(const wstring& path, const wstring& s) throw(IOException) : LexerHIDE(IO::url_or_file(path + s))
	{
	}

	LexerHIDE::LexerHIDE(const wstring& s) throw(runtime_error) : LexerHIDE(IO::string_to_stream(s))
	{
	}

	LexerHIDE::LexerHIDE() throw(IOException) : LexerHIDE(IO::input)
	{
	}

const wstring LexerHIDE::anonymous = (wstring("_")).intern();

	wstring LexerHIDE::char2string(const int& c)
	{
		return "" + StringHelper::toString(static_cast<char>(c));
	}

	bool LexerHIDE::atEOF()
	{
		bool yes = (TT_EOF == ttype);
		if(yes)
		{
			try
			{
				input->close();
			} catch(const IOException& e)
			{
				IO::trace("unable to close atEOF");
			}
		}
		return yes;
	}

	bool LexerHIDE::atEOC()
	{
		return !inClause;
	}

	Term* LexerHIDE::make_const(const wstring& s)
	{
		return new constToken(s);
	}

	Term* LexerHIDE::make_fun(const wstring& s)
	{
		return new funToken(s);
	}

	Term* LexerHIDE::make_int(const double& n)
	{
		return new intToken(static_cast<int>(n));
	}

	Term* LexerHIDE::make_real(const double& n)
	{
		return new realToken(n);
	}

	Term* LexerHIDE::make_number(const double& nval)
	{
		Term* T;
		if(floor(nval) == nval)
		{
			T = make_int(nval);
		} else
		{
			T = make_real(nval);
		}
		return T;
	}

	Term* LexerHIDE::make_var(const wstring& s)
	{
		s = s.intern();
		VariableTerm* X;
		long long occ;
		if(s == anonymous)
		{
			occ = 0;
			X = TermData::V();
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
			s = X->toString();
		} else
		{
			X = any_cast<VariableTerm*>(dict->get(s));
			if(X == nullptr)
			{
				occ = 1;
				X = TermData::V();
				X->varName = s;
			} else
			{
				occ = Expect::asInt(any_cast<Term*>(dict->get(X)))->longValue();
				occ++;
			}
		}
		LongTerm* I = TermData::Long(occ);
		dict->put(X, I);
		dict->put(s, X);
		return new varToken(X, TermData::F(s), I);
	}

	void LexerHIDE::wordChar(const char& c)
	{
		wordChars(c, c);
	}

	Term* LexerHIDE::getWord(const bool& quoted) throw(IOException)
	{
		Term* T;
		if(quoted && 0 == sval->length())
		{
			T = make_const("");
		}
		/*
		 * DO NOT DO THIS: quoting is meant to prevent it!!! else
		 * if("()[]|".indexOf(sval.charAt(0))>=0) { switch(sval.charAt(0)) { case '(':
		 * T=new lparToken(); break; case ')': T=new rparToken(); break; case '[': T=new
		 * lbraToken(); break; case ']': T=new rbraToken(); break; case '|': T=new
		 * barToken(); break; } }
		 */
		else
		{
			char c = sval->charAt(0);
			if(!quoted && (isupper(c) || '_' == c))
			{
				T = make_var(sval);
			} else
			{ // nonvar
				wstring s = sval;
				int nt = nextToken();
				pushBack();
				T = ('(' == nt) ? make_fun(s) : make_const(s);
			}
		}
		return T;
	}

	Term* LexerHIDE::next() throw(IOException)
	{
		int n = nextToken();
		inClause = true;
		Term* T;
		switch(n)
		{
		case TT_WORD:
			T = getWord(false);
			break;

		case '\'':
			T = getWord(true);
			break;

		case TT_NUMBER:
			T = make_number(nval);
			break;

		case TT_EOF:
			T = new eofToken();
			inClause = false;
			break;

		case TT_EOL:
			T = next();
			break;

		case '-':
			if(TT_NUMBER == nextToken())
			{
				T = make_number(-nval);
			} else
			{
				pushBack();
				T = make_const(char2string(n));
			}

			break;

		case ':':
			if('-' == nextToken())
			{
				T = new iffToken(":-");
			} else
			{
				pushBack();
				T = make_const(char2string(n));
			}
			break;

		case '.':
		{
			int c = nextToken();
			if(TT_EOL == c || TT_EOF == c)
			{
				inClause = false;
				// dict.clear(); ///!!!: this looses Var names
				T = new eocToken();
			} else
			{
				pushBack();
				T = make_const(char2string(n)); // !!!: sval is gone
			}
			break;

		}
		case '\"':
			T = new stringToken(static_cast<constToken*>(getWord(true)));
			break;

		case '(':
			T = new lparToken();
			break;
		case ')':
			T = new rparToken();
			break;
		case '[':
			T = new lbraToken();
			break;
		case ']':
			T = new rbraToken();
			break;
		case '|':
			T = new barToken();
			break;

		case ',':
			T = new commaToken();
			break;
		default:
			T = make_const(char2string(n));
		}
		// IO.mes("TOKEN:"+T);
		return T;
	}

	varToken::varToken(Var* X, SymbolTerm* C, LongTerm* I) : StructureTerm("varToken", 3)
	{
		argz = std::vector<Term*> { X, C, I };
	}

	StructureTerm* varToken::clone()
	{
		return new varToken(argz[0]->toVar(), argz[1]->asConst(), (argz[2]->asLongTerm()));
	}

	intToken::intToken(const int& i) : StructureTerm("intToken", TermData::Long(i))
	{
	}

	realToken::realToken(const double& i) : StructureTerm("realToken", TermData::Float(i))
	{
	}

	constToken::constToken(SymbolTerm* c) : StructureTerm("constToken", c)
	{
		setArg(0, Builtins::toConstBuiltin(c));
	}

	constToken::constToken(const wstring& s) : constToken(TermData::F(s))
	{
	}

	stringToken::stringToken(constToken* c) : StructureTerm("stringToken", (c->ArgDeRef(0)))
	{
	}

	funToken::funToken(const wstring& s) : StructureTerm("funToken", StructureTerm::S(s.intern()))
	{
	}

	eocToken::eocToken() : StructureTerm("eocToken", TermData::F("end_of_clause"))
	{
	}

	eofToken::eofToken() : StructureTerm("eofToken", Prolog::anEof)
	{
	}

	iffToken::iffToken(const wstring& s) : StructureTerm("iffToken", TermData::F(s))
	{
	}

	KPToken::KPToken(const wstring& s) : SymbolTerm::Dynamic(s,0)
	{
	}

	lparToken::lparToken() : KPToken("(")
	{
	}

	rparToken::rparToken() : KPToken(")")
	{
	}

	lbraToken::lbraToken() : KPToken("[")
	{
	}

	rbraToken::rbraToken() : KPToken("]")
	{
	}

	barToken::barToken() : KPToken("|")
	{
	}

	commaToken::commaToken() : KPToken(",")
	{
	}

	Parser::Parser(Reader* I) throw(IOException) : LexerHIDE(I)
	{
	}

	Parser::Parser(const wstring& p, const wstring& s) throw(IOException) : LexerHIDE(p, s)
	{
	}

	Parser::Parser(const wstring& s) throw(runtime_error) : LexerHIDE(s)
	{
	}

	Clause* Parser::readClause()
	{
		Clause* t = nullptr;
		bool verbose = false;
		try
		{
			t = readClauseOrEOF();
			// IO.mes("GOT Clause:"+t);
		}
		/**
		 * catch built exception clauses which are defined in lib.pro - allowing to
		 * recover or be quiet about such errors.
		 */
		catch(const ParserException& e)
		{
			t = errorClause(e, "syntax_error", lineno(), verbose);
			try
			{
				while(!atEOC() && !atEOF())
				{
					next();
				}
			} catch(const IOException& toIgnore)
			{
			}
		} catch(const IOException& e)
		{
			t = errorClause(e, "io_exception", lineno(), verbose);
		} catch(const runtime_error& e)
		{
			t = errorClause(e, "unexpected_syntax_exception", lineno(), true);
		}
		return t;
	}

	Clause* Parser::errorClause(runtime_error e, const wstring& type, const int& line, const bool& verbose)
	{

		wstring mes = e.what();
		if("" == mes)
		{
			mes = "unknown_error";
		}
		StructureTerm* f = StructureTerm::S("error", TermData::F(type), TermData::F(mes), StructureTerm::S("line", TermData::Integer(line)));
		Clause* C = new Clause(f, Prolog::True);
		if(verbose)
		{
			IO::errmes(type + " error at line:" + to_string(line));
			IO::errmes(C->pprint(), e);
		}
		return C;
	}

	bool Parser::isError(Clause* C)
	{
		Term* H = C->getHead();
		if(H->isStructure() && "error" == H->name() && H->arityOrType() == 3 && !(Expect::asStruct(H)->ArgDeRef(0)->dref()->isVar()))
		{
			return true;
		}
		return false;
	}

	void Parser::showError(Clause* C)
	{
		IO::errmes("*** " + C);
	}

	Clause* Parser::toClause(Term* T, HashDict* dict)
	{
		Clause* C = T->toClause(); // adds ...:-true if missing
		C->dict = dict;
		return C;
	}

	Clause* Parser::readClauseOrEOF() throw(IOException)
	{

		dict = new HashDict();

		Term* n = next();

		// IO.mes("readClauseOrEOF 0:"+n);

		if(n->isFunctor("eofToken"))
		{
			return nullptr; // $$toClause(n.token(),dict);
		}

		if(n->isFunctor("iffToken"))
		{
			n = next();
			Term* t = getTerm(n);
			Term* bs = getConjCont(t);
			Clause* C = new Clause(TermData::F("init"), bs);
			C->dict = dict;
			return C;
		}

		Term* h = getTerm(n);

		// IO.mes("readClauseOrEOF 1:"+h);

		n = next();

		// IO.mes("readClauseOrEOF 2:"+n);

		if(n->isFunctor("eocToken") || n->isFunctor("eofToken"))
		{
			return toClause(h, dict);
		}

		// IO.mes("readClauseOrEOF 3:"+b);

		Clause* C = nullptr;
		if(n->isFunctor("iffToken"))
		{
			Term* t = getTerm();
			Term* bs = getConjCont(t);
			C = new Clause(h, bs);
			C->dict = dict;
		} else if(n->isFunctor(","))
		{
			Term* b = getTerm();
			Term* bs = getConjCont(b);
			C = toClause(StructureTerm::createCons(",", h, bs), dict);
		} else
		{
			throw ParserException("':-' or '.' or ','", "bad body element", n);
		}
		return C;
	}

	Term* Parser::getConjCont(Term* curr) throw(IOException)
	{

		Term* n = next();
		Term* t = nullptr;
		if(n->isFunctor("eocToken"))
		{
			t = curr;
		} else if(n->isFunctor(","))
		{
			Term* other = getTerm();
			t = StructureTerm::createCons(",", curr, getConjCont(other));
		}
		if(nullptr == t)
		{
			throw ParserException("'.'", "bad body element", n);
		}
		return t;
	}

	Term* Parser::getTerm(Term* n) throw(IOException)
	{
		Term* t = n->carTokenOrSelf();
		if(n->isFunctor("stringToken"))
		{
			t = (static_cast<Nonvar*>((static_cast<stringToken*>(n))->ArgDeRef(0)))->toChars();
			// IO.mes("getTerm:stringToken-->"+t);

		} else if(n->isFunctor("["))
		{
			t = getList();
		} else if(n->isFunctor("funToken"))
		{
			StructureTerm* f = static_cast<StructureTerm*>(t);
			f->argz = (getArgs());
			t = Builtins::toFunBuiltin(f);
		} else
		{
			; //throw new ParserException("var,int,real,constant,'[' or functor", "bad term", n);
		}
		return t;
	}

	Term* Parser::getTerm() throw(IOException)
	{
		Term* n = next();
		return getTerm(n);
	}

	std::vector<Term*> Parser::getArgs() throw(IOException)
	{
		 //break;
		Term* n = next();
		if(!(n->isFunctor("(")))
		{
			throw ParserException("'('", "in getArgs", n);
		}
		vector v = vector();
		Term* t = getTerm();
		v.push_back(t);
		for(;;)
		{
			n = next();
			if(n->isFunctor(")"))
			{
				int l = v.size();
				std::vector<Term*> args(l);
				// v.copyInto(Arguments);
				std::vector<any> as = v.toArray();
				for(int i = 0; i < l; i++)
				{
					args[i] = any_cast<Term*>(as[i]);
				}
				return args;
			} else if(n->isFunctor(","))
			{
				t = getTerm();
				v.push_back(t);
			} else
			{
				throw ParserException("',' or ')'", "bad arg", n);
			}
		}
	}

	Term* Parser::getList() throw(IOException)
	{
		Term* n = next();
		if(n->isFunctor("]"))
		{
			return Prolog::Nil;
		}
		Term* t = getTerm(n);
		return getListCont(t);
	}

	Term* Parser::getListCont(Term* curr) throw(IOException)
	{
		// IO.trace("curr: "+curr);
		Term* n = next();
		Term* t = nullptr;
		if(n->isFunctor("]"))
		{
			t = StructureTerm::createCons(curr, Prolog::Nil);
		} else if(n->isFunctor("|"))
		{
			t = StructureTerm::createCons(curr, getTerm());
			n = next();
			if(!(n->isFunctor("]")))
			{
				throw ParserException("']'", "bad list end after '|'", n);
			}
		} else if(n->isFunctor(","))
		{
			Term* other = getTerm();
			t = StructureTerm::createCons(curr, getListCont(other));
		}
		if(t == nullptr)
		{
			throw ParserException("| or ]", "bad list continuation", n);
		}
		return t;
	}

	wstring Parser::patchEOFString(const wstring& s)
	{
		if(!((int)s.rfind(".") >= s.length() - 2))
		{
			s = s + ".";
		}
		return s;
	}

	Clause* Parser::clsFromString(const wstring& s)
	{
		if("" == s)
		{
			return nullptr;
		}
		s = patchEOFString(s);
		Clause* t = nullptr;
		try
		{
			Parser* p;
			p = new Parser(s);
			t = p->readClause();
		} catch(const runtime_error& e)
		{ // nothing expected to catch
			IO::errmes("unexpected parsing error", e);
		}
		if(t->dict == nullptr)
		{
			t->ground = false;
		} else
		{
			t->ground = t->dict->isEmpty();
		}
		return t;
	}

	ParserException::ParserException(const wstring& e, const wstring& f, Term* n) : java::io::IOException("expected: " + e + ", found: " + f + "'" + n + "'")
	{
	}
}
