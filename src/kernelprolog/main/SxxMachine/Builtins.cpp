using namespace std;

#include "Builtins.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../terms/SxxMachine/true_.h"
#include "../../terms/SxxMachine/fail_.h"
#include "NameArity.h"
#include "ISTerm.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../../machine/SxxMachine/Nonvar.h"
#include "Init.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../terms/SxxMachine/Clause.h"
#include "../../terms/SxxMachine/Expect.h"
#include "../../io/SxxMachine/IO.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../terms/SxxMachine/Fluent.h"
#include "../../io/SxxMachine/CharReader.h"
#include "../../io/SxxMachine/ClauseReader.h"
#include "../../io/SxxMachine/CharWriter.h"
#include "../../io/SxxMachine/ClauseWriter.h"
#include "../../../machine/SxxMachine/LongTerm.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "../../fluents/SxxMachine/DataBase.h"
#include "../../terms/SxxMachine/Source.h"
#include "../../fluents/SxxMachine/IterableSource.h"
#include "../../fluents/SxxMachine/ListSource.h"
#include "../../io/SxxMachine/TermSource.h"
#include "../../fluents/SxxMachine/IntegerSource.h"
#include "../../fluents/SxxMachine/SourceLoop.h"
#include "../../terms/SxxMachine/Unfolder.h"
#include "../../terms/SxxMachine/Sink.h"
#include "../../fluents/SxxMachine/SourceMerger.h"
#include "../../fluents/SxxMachine/StringSink.h"
#include "../../fluents/SxxMachine/TermCollector.h"
#include "Method.h"
#include "NumberFormatException.h"

namespace SxxMachine
{

const unordered_map Builtins::builtinsMap = unordered_map();

	Builtins::Builtins() : HashDict(builtinsMap)
	{
		// add a line here for each new builtin

		// basics
		is_builtin tempVar();
		registerBI(&tempVar);
		registerBI(Prolog::True, true_::typeid);
		registerBI(Prolog::aFail, fail_::typeid);
		halt tempVar2();
		registerBI(&tempVar2);
		compute tempVar3();
		registerBI(&tempVar3);

		// I/O and trace related
		get_stdin tempVar4();
		registerBI(&tempVar4);
		get_stdout tempVar5();
		registerBI(&tempVar5);
		set_max_answers tempVar6();
		registerBI(&tempVar6);
		set_trace tempVar7();
		registerBI(&tempVar7);
		stack_dump tempVar8();
		registerBI(&tempVar8);
		consult tempVar9();
		registerBI(&tempVar9);
		reconsult tempVar10();
		registerBI(&tempVar10);
		reconsult_again tempVar11();
		registerBI(&tempVar11);

		// database
		at_key tempVar12();
		registerBI(&tempVar12);
		pred_to_string tempVar13();
		registerBI(&tempVar13);
		db_to_string tempVar14();
		registerBI(&tempVar14);

		new_db tempVar15();
		registerBI(&tempVar15);
		get_default_db tempVar16();
		registerBI(&tempVar16);
		db_remove tempVar17();
		registerBI(&tempVar17);
		db_add tempVar18();
		registerBI(&tempVar18);
		db_collect tempVar19();
		registerBI(&tempVar19);
		db_source tempVar20();
		registerBI(&tempVar20);

		// data structure builders/converters
		arg tempVar21();
		registerBI(&tempVar21);
		new_fun tempVar22();
		registerBI(&tempVar22);
		get_arity tempVar23();
		registerBI(&tempVar23);
		name_to_chars tempVar24();
		registerBI(&tempVar24);
		chars_to_name tempVar25();
		registerBI(&tempVar25);
		numbervars tempVar26();
		registerBI(&tempVar26);

		// fluent constructors
		unfolder_source tempVar27();
		registerBI(&tempVar27);
		answer_source tempVar28();
		registerBI(&tempVar28);

		source_list tempVar29();
		registerBI(&tempVar29);
		list_source tempVar30();
		registerBI(&tempVar30);

		term_source tempVar31();
		registerBI(&tempVar31);
		source_term tempVar32();
		registerBI(&tempVar32);

		integer_source tempVar33();
		registerBI(&tempVar33);
		source_loop tempVar34();
		registerBI(&tempVar34);

		// Fluent Modifiers

		set_persistent tempVar35();
		registerBI(&tempVar35);
		get_persistent tempVar36();
		registerBI(&tempVar36);

		// Input Sources
		file_char_reader tempVar37();
		registerBI(&tempVar37);
		char_file_writer tempVar38();
		registerBI(&tempVar38);

		file_clause_reader tempVar39();
		registerBI(&tempVar39);
		clause_file_writer tempVar40();
		registerBI(&tempVar40);

		// writable Sinks
		term_string_collector tempVar41();
		registerBI(&tempVar41);
		term_collector tempVar42();
		registerBI(&tempVar42);

		string_char_reader tempVar43();
		registerBI(&tempVar43);
		string_clause_reader tempVar44();
		registerBI(&tempVar44);

		// fluent controllers
		getfl tempVar45();
		registerBI(&tempVar45);
		putfl tempVar46();
		registerBI(&tempVar46);
		stop tempVar47();
		registerBI(&tempVar47);
		collect tempVar48();
		registerBI(&tempVar48);

		// fluent combinators
		split_source tempVar49();
		registerBI(&tempVar49);
		merge_sources tempVar50();
		registerBI(&tempVar50);
		// see compose_sources,append_sources,merge_sources in lib.pro

		// discharges a Source to a Sink
		discharge tempVar51();
		registerBI(&tempVar51);

		// OS and process interface
		system tempVar52();
		registerBI(&tempVar52);
		ctime tempVar53();
		registerBI(&tempVar53);
	}

	void Builtins::registerBI(NameArity* proto)
	{
		wstring key = proto->name() + "/" + to_string(proto->arityOrType());
		try
		{
			Method* m = proto->getClass().getDeclaredMethod("st_exec", Prog::typeid, ISTerm::typeid);
			// IO.mes("registering builtin: "+key);
			this->put(key, m);
		} catch(const runtime_error& e)
		{
			e.printStackTrace();
		}
	}

	void Builtins::registerBI(NameArity* proto, type_info c)
	{
		wstring key = proto->name() + "/" + to_string(proto->arityOrType());
		try
		{
			Method* m = c.getDeclaredMethod("st_exec", Prog::typeid, ISTerm::typeid);
			// IO.mes("registering builtin: "+key);
			this->put(key, m);
		} catch(const runtime_error& e)
		{
			e.printStackTrace();
		}

	}

	Nonvar* Builtins::asBuiltin(NameArity* S)
	{
		wstring key = S->getKey();
		Method* b = any_cast<Method*>(this->get(key));
		if(b != nullptr)
		{
			b->setAccessible(true);
			S->setMethod(b);
		}
		return static_cast<Nonvar*>(S);
	}

	Nonvar* Builtins::toConstBuiltin(NameArity* c)
	{
		if(c->name().length() == 0)
		{
			return static_cast<Nonvar*>(c);
		}
		if(c->name().equals(Prolog::Nil->name()))
		{
			return Prolog::Nil;
		}
		if(c->name().equals(Prolog::aNo->name()))
		{
			return Prolog::aNo;
		}
		if(c->name().equals(Prolog::aYes->name()))
		{
			return Prolog::aYes;
		}

		Nonvar* B = static_cast<Nonvar*>(Init::builtinDict->asBuiltin(c));
		if(nullptr == B)
		{
			// IO.mes("not a builtin:"+this);
			return static_cast<Nonvar*>(c);
		}
		return B;
	}

	StructureTerm* Builtins::toFunBuiltin(StructureTerm* f)
	{
		if(f->name() == ":-" && f->arityOrType() == 2)
		{
			return new Clause(f->argz[0], f->argz[1]);
		}
		if(f->name() == "," && f->arityOrType() == 2)
		{
			return StructureTerm::createCons(",", f->argz[0], f->argz[1]);
		}
		StructureTerm* B = Init::builtinDict->asBuiltin(f)->asStructureTerm();
		if(nullptr == B)
		{
			return f;
		}
		//B = B.funClone();
		//B.Arguments = f.Arguments;
		return B;
	}

	is_builtin::is_builtin() : FunBuiltin("is_builtin", 1)
	{
	}

	int is_builtin::st_exec(Prog* p, ISTerm* thiz)
	{

		return thiz->ArgDeRef(0)->isBuiltin() ? 1 : 0;
	}

	halt::halt() : ConstBuiltin("halt")
	{
	}

	int halt::st_exec(Prog* p, ISTerm* thiz)
	{
		Runtime::getRuntime().exit(0);
		return 1;
	}

	system::system() : FunBuiltin("system", 1)
	{
	}

	int system::st_exec(Prog* p, ISTerm* thiz)
	{

		wstring cmd = Expect::asConst(thiz->ArgDeRef(0))->name();
		return IO::system(cmd);
	}

	file_char_reader::file_char_reader() : FunBuiltin("file_char_reader", 2)
	{
	}

	int file_char_reader::st_exec(Prog* p, ISTerm* thiz)
	{

		Term* I = thiz->ArgDeRef(0);
		Fluent* f;
		if(I->isCharReader())
		{
			f = new CharReader(Expect::asCharReader(I)->reader, p);
		} else
		{
			wstring s = Expect::asConst(I)->name();
			f = new CharReader(s, p);
		}
		return thiz->unifyArg(1, f, p);
	}

	file_clause_reader::file_clause_reader() : FunBuiltin("file_clause_reader", 2)
	{
	}

	int file_clause_reader::st_exec(Prog* p, ISTerm* thiz)
	{

		Term* I = thiz->ArgDeRef(0);
		Fluent* f;
		if(I->isCharReader())
		{
			f = new ClauseReader(Expect::asCharReader(I)->reader, p);
		} else
		{
			wstring s = Expect::asConst(thiz->ArgDeRef(0))->name();
			f = new ClauseReader(s, p);
		}
		return thiz->unifyArg(1, f, p);
	}

	char_file_writer::char_file_writer() : FunBuiltin("char_file_writer", 2)
	{
	}

	int char_file_writer::st_exec(Prog* p, ISTerm* thiz)
	{

		wstring s = Expect::asConst(thiz->ArgDeRef(0))->name();
		Fluent* f = new CharWriter(s, p);
		return thiz->unifyArg(1, f, p);
	}

	clause_file_writer::clause_file_writer() : FunBuiltin("clause_file_writer", 2)
	{
	}

	int clause_file_writer::st_exec(Prog* p, ISTerm* thiz)
	{

		wstring s = Expect::asConst(thiz->ArgDeRef(0))->name();
		Fluent* f = new ClauseWriter(s, p);
		return thiz->unifyArg(1, f, p);
	}

	get_stdin::get_stdin() : FunBuiltin("get_stdin", 1)
	{
	}

	int get_stdin::st_exec(Prog* p, ISTerm* thiz)
	{

		ClauseReader tempVar(p);
		return thiz->unifyArg(0, &tempVar, p);
	}

	get_stdout::get_stdout() : FunBuiltin("get_stdout", 1)
	{
	}

	int get_stdout::st_exec(Prog* p, ISTerm* thiz)
	{

		ClauseWriter tempVar(p);
		return thiz->unifyArg(0, &tempVar, p);
	}

	get_arity::get_arity() : FunBuiltin("get_arity", 2)
	{
	}

	int get_arity::st_exec(Prog* p, ISTerm* thiz)
	{

		LongTerm* N = TermData::Integer(thiz->ArgDeRef(0)->arityOrType());
		return thiz->unifyArg(1, N, p);
	}

	stack_dump::stack_dump() : FunBuiltin("stack_dump", 1)
	{
	}

	int stack_dump::st_exec(Prog* p, ISTerm* thiz)
	{

		wstring s = thiz->ArgDeRef(0)->pprint();
		IO::errmes("User requested dump", (runtime_error(s)));
		return 1;
	}

	ctime::ctime() : FunBuiltin("ctime", 1)
	{
	}

	int ctime::st_exec(Prog* p, ISTerm* thiz)
	{

		Term* T = optional<long long>(System::currentTimeMillis() - t0);
		return thiz->unifyArg(0, T, p);
	}

	set_max_answers::set_max_answers() : FunBuiltin("set_max_answers", 1)
	{
	}

	int set_max_answers::st_exec(Prog* p, ISTerm* thiz)
	{

		IO::maxAnswers = thiz->getIntArg(0);
		return 1;
	}

	reconsult::reconsult() : FunBuiltin("reconsult", 1)
	{
	}

	int reconsult::st_exec(Prog* p, ISTerm* thiz)
	{

		Term* a = thiz->ArgDeRef(0);
		wstring f = Expect::asConst(a)->name();
		return DataBase::fromFile(f) ? 1 : 0;
	}

	consult::consult() : FunBuiltin("consult", 1)
	{
	}

	int consult::st_exec(Prog* p, ISTerm* thiz)
	{

		wstring f = Expect::asConst(thiz->ArgDeRef(0))->name();
		IO::trace("consulting: " + f);
		return DataBase::fromFile(f, false) ? 1 : 0;
	}

	reconsult_again::reconsult_again() : ConstBuiltin("reconsult_again")
	{
	}

	int reconsult_again::st_exec(Prog* p, ISTerm* thiz)
	{

		return DataBase::fromFile() ? 1 : 0;
	}

	get_default_db::get_default_db() : FunBuiltin("get_default_db", 1)
	{
	}

	int get_default_db::st_exec(Prog* p, ISTerm* thiz)
	{

		return thiz->unifyArg(0, TermData::FFIObject(Init::default_db), p);
	}

	new_db::new_db() : FunBuiltin("new_db", 1)
	{
	}

	int new_db::st_exec(Prog* p, ISTerm* thiz)
	{

		DataBase tempVar(new unordered_map());
		return thiz->unifyArg(0, TermData::FFIObject(&tempVar), p);
	}

	db_add::db_add() : FunBuiltin("db_add", 2)
	{
	}

	int db_add::st_exec(Prog* p, ISTerm* thiz)
	{

		DataBase* db = any_cast<DataBase*>((thiz->ArgDeRef(0))->toObject());
		Term* X = thiz->ArgDeRef(1);
		// IO.mes("X==>"+X);
		wstring key = X->getKey();
		// IO.mes("key==>"+key);
		if("" == key)
		{
			return 0;
		}
		db->out(key, X);
		// IO.mes("res==>"+R);
		return 1;
	}

	db_remove::db_remove() : FunBuiltin("db_remove", 3)
	{
	}

	int db_remove::st_exec(Prog* p, ISTerm* thiz)
	{

		DataBase* db = any_cast<DataBase*>((thiz->ArgDeRef(0))->toObject());
		Term* X = thiz->ArgDeRef(1);
		Term* R = db->cin(X->getKey(), X);
		return thiz->unifyArg(2, R, p);
	}

	db_collect::db_collect() : FunBuiltin("db_collect", 3)
	{
	}

	int db_collect::st_exec(Prog* p, ISTerm* thiz)
	{

		DataBase* db = any_cast<DataBase*>((thiz->ArgDeRef(0))->toObject());
		Term* X = thiz->ArgDeRef(1);
		Term* R = db->all(X->getKey(), X);
		return thiz->unifyArg(2, R, p);
	}

	db_source::db_source() : FunBuiltin("db_source", 2)
	{
	}

	int db_source::st_exec(Prog* p, ISTerm* thiz)
	{

		DataBase* db = any_cast<DataBase*>((thiz->ArgDeRef(0))->toObject());
		Source* S = new IterableSource(db->toEnumeration(), p);
		return thiz->unifyArg(1, S, p);
	}

	at_key::at_key() : FunBuiltin("at_key", 2)
	{
	}

	int at_key::st_exec(Prog* p, ISTerm* thiz)
	{

		Term* R = Init::default_db->all(thiz->ArgDeRef(0)->getKey(), TermData::V());
		return thiz->unifyArg(1, R, p);
	}

	pred_to_string::pred_to_string() : FunBuiltin("pred_to_string", 2)
	{
	}

	int pred_to_string::st_exec(Prog* p, ISTerm* thiz)
	{

		wstring key = thiz->ArgDeRef(0)->getKey();
		wstring listing = Init::default_db->pred_to_string(key);
		if("" == listing)
		{
			return 0;
		}
		Nonvar* R = TermData::F(listing);
		return thiz->unifyArg(1, R, p);
	}

	db_to_string::db_to_string() : FunBuiltin("db_to_string", 1)
	{
	}

	int db_to_string::st_exec(Prog* p, ISTerm* thiz)
	{

		return thiz->unifyArg(0, TermData::F(Init::default_db->pprint()), p);
	}

	arg::arg() : FunBuiltin("arg", 3)
	{
	}

	int arg::st_exec(Prog* p, ISTerm* thiz)
	{

		int i = thiz->getIntArg(0);
		Term* F = thiz->ArgDeRef(1);
		Term* A = (i == 0) ? TermData::F(F->name()) : ((i == -1) ? TermData::Integer(F->arityOrType()) : F->args()[i - 1]);
		return thiz->unifyArg(2, A, p);
	}

	new_fun::new_fun() : FunBuiltin("new_fun", 3)
	{
	}

	int new_fun::st_exec(Prog* p, ISTerm* thiz)
	{

		wstring s = Expect::asConst(thiz->ArgDeRef(0))->name();
		int i = thiz->getIntArg(1);
		Term* T;
		if(i == 0)
		{
			T = Builtins::toConstBuiltin(TermData::F(s));
		} else
		{
			StructureTerm* F = StructureTerm::S(s);
			F->init(i);
			T = Builtins::toFunBuiltin(F);
		}
		return thiz->unifyArg(2, T, p);
	}

	name_to_chars::name_to_chars() : FunBuiltin("name_to_chars", 2)
	{
	}

	int name_to_chars::st_exec(Prog* p, ISTerm* thiz)
	{

		Term* Cs = (static_cast<Nonvar*>(thiz->ArgDeRef(0)))->toChars();
		return thiz->unifyArg(1, Cs, p);
	}

	chars_to_name::chars_to_name() : FunBuiltin("chars_to_name", 3)
	{
	}

	int chars_to_name::st_exec(Prog* p, ISTerm* thiz)
	{

		int convert = thiz->getIntArg(0);
		wstring s = Nonvar::charsToString(static_cast<Nonvar*>(thiz->ArgDeRef(1)));
		Nonvar* T = TermData::F(s);
		if(convert > 0)
		{
			try
			{
				double r = stod(s).doubleValue();
				T = TermData::NarrowDouble(r);
			} catch(const NumberFormatException& e)
			{
			}
		}
		return thiz->unifyArg(2, T, p);
	}

	numbervars::numbervars() : FunBuiltin("numbervars", 2)
	{
	}

	int numbervars::st_exec(Prog* p, ISTerm* thiz)
	{

		Term* T = thiz->ArgDeRef(0)->numbervars();
		return thiz->unifyArg(1, T, p);
	}

	compute::compute() : FunBuiltin("compute", 4)
	{
	}

	int compute::st_exec(Prog* p, ISTerm* thiz)
	{

		Term* o = thiz->ArgDeRef(0);
		Term* a = thiz->ArgDeRef(1);
		Term* b = thiz->ArgDeRef(2);
		if(!(o->isConst()) || !(a->isNumber()) || !(b->isNumber()))
		{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
			IO::errmes("bad arithmetic operation (" + o + "): " + a + "," + b + "\nprog: " + p->toString());
		}
		wstring opname = Expect::asConst(o)->name();
		double x = a->doubleValue();
		double y = b->doubleValue();
		double r;
		char op = opname[0];
		switch(op)
		{
		case '+':
			r = x + y;
			break;
		case '-':
			r = x - y;
			break;
		case '*':
			r = x * y;
			break;
		case '/':
			r = x / y;
			break;
		case ':':
			r = static_cast<int>(x / y);
			break;
		case '%':
			r = x % y;
			break;
		case '?':
			r = (x < y) ? (-1) : (x == y ? 0 : 1);
			break; // compares!
		case 'p':
			r = pow(x, y);
			break;
		case 'l':
			r = log(y) / log(x);
			break;
		case 'r':
			r = x * Math::random() + y;
			break;
		case '<':
			r = static_cast<long long>(x) << static_cast<long long>(y);
			break;
		case '>':
			r = static_cast<long long>(x) >> static_cast<long long>(y);
			break;

		default:
			IO::errmes("bad arithmetic operation <" + StringHelper::toString(op) + "> on " + to_string(x) + " and " + to_string(y));
			return 0;
		}
		Term* R = TermData::NarrowDouble(r);
		return thiz->unifyArg(3, R, p);
	}

	set_trace::set_trace() : FunBuiltin("set_trace", 1)
	{
	}

	int set_trace::st_exec(Prog* p, ISTerm* thiz)
	{

		Prog::tracing = thiz->getIntArg(0);
		return 1;
	}

	source_list::source_list() : FunBuiltin("source_list", 2)
	{
	}

	int source_list::st_exec(Prog* p, ISTerm* thiz)
	{

		Source* S = static_cast<Source*>(thiz->ArgDeRef(0));
		Term* Xs = S->toList();
		return thiz->unifyArg(1, Xs, p);
	}

	list_source::list_source() : FunBuiltin("list_source", 2)
	{
	}

	int list_source::st_exec(Prog* p, ISTerm* thiz)
	{

		Source* E = new ListSource(static_cast<Nonvar*>(thiz->ArgDeRef(0)), p);
		return thiz->unifyArg(1, E, p);
	}

	term_source::term_source() : FunBuiltin("term_source", 2)
	{
	}

	int term_source::st_exec(Prog* p, ISTerm* thiz)
	{

		TermSource* E = new TermSource(static_cast<Nonvar*>(thiz->ArgDeRef(0)), p);
		return thiz->unifyArg(1, E, p);
	}

	integer_source::integer_source() : FunBuiltin("integer_source", 5)
	{
	}

	int integer_source::st_exec(Prog* p, ISTerm* thiz)
	{

		IntegerSource* E = new IntegerSource(Expect::asInt(thiz->ArgDeRef(0))->longValue(), Expect::asInt(thiz->ArgDeRef(1))->longValue(), Expect::asInt(thiz->ArgDeRef(2))->longValue(), Expect::asInt(thiz->ArgDeRef(3))->longValue(), p);
		return thiz->unifyArg(4, E, p);
	}

	source_loop::source_loop() : FunBuiltin("source_loop", 2)
	{
	}

	int source_loop::st_exec(Prog* p, ISTerm* thiz)
	{

		Source* s = static_cast<Source*>(thiz->ArgDeRef(0));
		SourceLoop tempVar(s, p);
		return thiz->unifyArg(1, &tempVar, p);
	}

	source_term::source_term() : FunBuiltin("source_term", 2)
	{
	}

	int source_term::st_exec(Prog* p, ISTerm* thiz)
	{

		Source* S = static_cast<Source*>(thiz->ArgDeRef(0));
		Term* Xs = Builtins::toFunBuiltin(Expect::asStruct(S->toFun()));
		return thiz->unifyArg(1, Xs, p);
	}

	answer_source::answer_source() : FunBuiltin("answer_source", 3)
	{
	}

	int answer_source::st_exec(Prog* p, ISTerm* thiz)
	{

		Clause* goal = new Clause(thiz->ArgDeRef(0), thiz->ArgDeRef(1));
		Prog* U = new Prog(goal, p);
		return thiz->unifyArg(2, U, p);
	}

	unfolder_source::unfolder_source() : FunBuiltin("unfolder_source", 2)
	{
	}

	int unfolder_source::st_exec(Prog* p, ISTerm* thiz)
	{

		Clause* goal = thiz->ArgDeRef(0)->toClause();
		Prog* newp = new Prog(goal, p);
		Unfolder* S = new Unfolder(goal, newp);
		return thiz->unifyArg(1, S, p);
	}

	getfl::getfl() : FunBuiltin("getfl", 2)
	{
	}

	int getfl::st_exec(Prog* p, ISTerm* thiz)
	{

		//IO.mes("<<"+thiz.ArgNoDeRef(0)+"\n"+p+p.getTrail().pprint());
		Term* t = thiz->ArgDeRef(0);
		Source* S = t->asSource();
		Term* A = Expect::the(S->getElement());
		//if(null==A) A=Nonvar.aNo;
		//else A=new Fun("the",A);
		// IO.mes(">>"+A+"\n"+p+p.getTrail().pprint());
		return thiz->unifyArg(1, A, p);
	}

	putfl::putfl() : FunBuiltin("putfl", 2)
	{
	}

	int putfl::st_exec(Prog* p, ISTerm* thiz)
	{

		Sink* S = static_cast<Sink*>(thiz->ArgDeRef(0));
		Term* X = thiz->ArgDeRef(1);
		if(0 == S->putElement(X))
		{
			IO::errmes("error in putElement: " + X);
		}
		return 1;
	}

	stop::stop() : FunBuiltin("stop", 1)
	{
	}

	int stop::st_exec(Prog* p, ISTerm* thiz)
	{

		Fluent* S = static_cast<Fluent*>(thiz->ArgDeRef(0));
		S->stop();
		return 1;
	}

	split_source::split_source() : FunBuiltin("split_source", 3)
	{
	}

	int split_source::st_exec(Prog* p, ISTerm* thiz)
	{

		Source* original = static_cast<Source*>(thiz->ArgDeRef(0));
		Nonvar* Xs = original->toList();
		ListSource tempVar(Xs, p);
		ListSource tempVar2(Xs, p);
		return (thiz->unifyArg(1, &tempVar, p) > 0 && thiz->unifyArg(2, &tempVar2, p) > 0) ? 1 : 0;
	}

	merge_sources::merge_sources() : FunBuiltin("merge_sources", 2)
	{
	}

	int merge_sources::st_exec(Prog* p, ISTerm* thiz)
	{

		Nonvar* list = static_cast<Nonvar*>(thiz->ArgDeRef(0));
		SourceMerger tempVar(list, p);
		return thiz->unifyArg(1, &tempVar, p);
	}

	discharge::discharge() : FunBuiltin("discharge", 2)
	{
	}

	int discharge::st_exec(Prog* p, ISTerm* thiz)
	{

		Source* from = static_cast<Source*>(thiz->ArgDeRef(0));
		Sink* to = static_cast<Sink*>(thiz->ArgDeRef(1));
		for(;;)
		{
			Term* X = from->getElement();
			if(nullptr == X)
			{
				to->stop();
				break;
			} else
			{
				to->putElement(X);
			}
		}
		return 1;
	}

	collect::collect() : FunBuiltin("collect", 2)
	{
	}

	int collect::st_exec(Prog* p, ISTerm* thiz)
	{

		Sink* s = static_cast<Sink*>(thiz->ArgDeRef(0));
		Term* X = s->collect();
		if(nullptr == X)
		{
			X = Prolog::aNo;
		} else
		{
			X = StructureTerm::S("the", { X });
		}
		return thiz->unifyArg(1, X, p);
	}

	term_string_collector::term_string_collector() : FunBuiltin("term_string_collector", 1)
	{
	}

	int term_string_collector::st_exec(Prog* p, ISTerm* thiz)
	{

		StringSink tempVar(p);
		return thiz->unifyArg(0, &tempVar, p);
	}

	term_collector::term_collector() : FunBuiltin("term_collector", 1)
	{
	}

	int term_collector::st_exec(Prog* p, ISTerm* thiz)
	{

		TermCollector tempVar(p);
		return thiz->unifyArg(0, &tempVar, p);
	}

	string_char_reader::string_char_reader() : FunBuiltin("string_char_reader", 2)
	{
	}

	int string_char_reader::st_exec(Prog* p, ISTerm* thiz)
	{

		CharReader tempVar(thiz->ArgDeRef(0), p);
		return thiz->unifyArg(1, &tempVar, p);
	}

	string_clause_reader::string_clause_reader() : FunBuiltin("string_clause_reader", 2)
	{
	}

	int string_clause_reader::st_exec(Prog* p, ISTerm* thiz)
	{

		ClauseReader tempVar(thiz->ArgDeRef(0), p);
		return thiz->unifyArg(1, &tempVar, p);
	}

	set_persistent::set_persistent() : FunBuiltin("set_persistent", 2)
	{
	}

	int set_persistent::st_exec(Prog* p, ISTerm* thiz)
	{

		Fluent* F = static_cast<Fluent*>(thiz->ArgDeRef(0));
		Nonvar* R = static_cast<Nonvar*>(thiz->ArgDeRef(1));
		bool yesno = !R->equalsTerm(Prolog::aNo);
		F->setPersistent(yesno);
		return 1;
	}

	get_persistent::get_persistent() : FunBuiltin("get_persistent", 2)
	{
	}

	int get_persistent::st_exec(Prog* p, ISTerm* thiz)
	{

		Fluent* F = static_cast<Fluent*>(thiz->ArgDeRef(0));
		Term* R = F->getPersistent() ? Prolog::aYes : Prolog::aNo;
		return thiz->unifyArg(1, R, p);
	}
}
