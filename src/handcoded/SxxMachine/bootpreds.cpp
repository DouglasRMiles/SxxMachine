using namespace std;

#include "bootpreds.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../exceptions/SxxMachine/RepresentationException.h"
#include "../../builtin/SxxMachine/FILE_builtins.h"
#include "../../machine/SxxMachine/Token.h"
#include "../../machine/SxxMachine/OutOfLoop.h"
#include "../../machine/SxxMachine/PrologLogger.h"
#include "../../exceptions/SxxMachine/StopEngineException.h"
#include "../../machine/SxxMachine/Trail.h"
#include "../../machine/SxxMachine/Failure.h"
#include "../../machine/SxxMachine/TermData.h"
#include "../../exceptions/SxxMachine/ExistenceException.h"
#include "../../exceptions/SxxMachine/SystemException.h"
#include "../../exceptions/SxxMachine/TermException.h"
#include "../../machine/SxxMachine/HashtableOfTerm.h"
#include "../../machine/SxxMachine/OutOfScope.h"
#include "../../exceptions/SxxMachine/BuiltinException.h"
#include "../../exceptions/SxxMachine/PermissionException.h"
#include "../../exceptions/SxxMachine/InternalException.h"
#include "../../machine/SxxMachine/ListViewTerm.h"
#include "../../exceptions/SxxMachine/JavaException.h"
#include "../../exceptions/SxxMachine/EvaluationException.h"
#include "../../machine/SxxMachine/DoubleTerm.h"
#include "../../machine/SxxMachine/LineNumberPushbackReader.h"
#include "../../machine/SxxMachine/ErrorTerm.h"
#include "../../machine/SxxMachine/Mutex.h"
#include "../../exceptions/SxxMachine/SyntaxException.h"
#include "../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../exceptions/SxxMachine/JavaInterruptedException.h"
#include "../../machine/SxxMachine/LongTerm.h"
#include "../../machine/SxxMachine/Arithmetic.h"
#include "../../machine/SxxMachine/PredTable.h"

namespace SxxMachine
{
//	import static SxxMachine.TermData.Integer;
IntegerTerm *const bootpreds::int_0 = optional<int>(0);
IntegerTerm *const bootpreds::int_1 = optional<int>(1);
IntegerTerm *const bootpreds::int_2 = optional<int>(2);
IntegerTerm *const bootpreds::int_3 = optional<int>(3);
IntegerTerm *const bootpreds::int_4 = optional<int>(4);
IntegerTerm *const bootpreds::int_5 = optional<int>(6);
IntegerTerm *const bootpreds::int_6 = optional<int>(6);
IntegerTerm *const bootpreds::int_7 = optional<int>(7);
IntegerTerm *const bootpreds::int_8 = optional<int>(8);
IntegerTerm *const bootpreds::int_9 = optional<int>(9);
IntegerTerm *const bootpreds::int_10 = optional<int>(10);
IntegerTerm *const bootpreds::int_11 = optional<int>(11);
IntegerTerm *const bootpreds::int_12 = optional<int>(12);
IntegerTerm *const bootpreds::int_13 = optional<int>(13);
IntegerTerm *const bootpreds::int_14 = optional<int>(14);
IntegerTerm *const bootpreds::int_15 = optional<int>(15);
IntegerTerm *const bootpreds::int_16 = optional<int>(16);
IntegerTerm *const bootpreds::int_17 = optional<int>(17);
IntegerTerm *const bootpreds::int_18 = optional<int>(18);
IntegerTerm *const bootpreds::int_19 = optional<int>(19);
IntegerTerm *const bootpreds::int_20 = optional<int>(20);
IntegerTerm *const bootpreds::int_21 = optional<int>(21);
IntegerTerm *const bootpreds::int_22 = optional<int>(22);
IntegerTerm *const bootpreds::int_23 = optional<int>(23);
IntegerTerm *const bootpreds::int_24 = optional<int>(24);
IntegerTerm *const bootpreds::int_25 = optional<int>(25);
IntegerTerm *const bootpreds::int_100 = optional<int>(100);
IntegerTerm *const bootpreds::int_neg1 = optional<int>(-1);
IntegerTerm *const bootpreds::int_neg2 = optional<int>(-2);
IntegerTerm *const bootpreds::int_neg3 = optional<int>(-3);
IntegerTerm *const bootpreds::int_neg4 = optional<int>(-4);
IntegerTerm *const bootpreds::int_neg5 = optional<int>(-6);
IntegerTerm *const bootpreds::int_neg6 = optional<int>(-6);
IntegerTerm *const bootpreds::int_neg7 = optional<int>(-7);
IntegerTerm *const bootpreds::int_neg8 = optional<int>(-8);
IntegerTerm *const bootpreds::int_neg9 = optional<int>(-9);
IntegerTerm *const bootpreds::int_neg10 = optional<int>(-10);
IntegerTerm *const bootpreds::int_neg11 = optional<int>(-11);
IntegerTerm *const bootpreds::int_neg12 = optional<int>(-12);
IntegerTerm *const bootpreds::int_neg13 = optional<int>(-13);
IntegerTerm *const bootpreds::int_neg14 = optional<int>(-14);
IntegerTerm *const bootpreds::int_neg15 = optional<int>(-15);
IntegerTerm *const bootpreds::int_neg16 = optional<int>(-16);
IntegerTerm *const bootpreds::int_neg17 = optional<int>(-17);
IntegerTerm *const bootpreds::int_neg18 = optional<int>(-18);
IntegerTerm *const bootpreds::int_neg19 = optional<int>(-19);
IntegerTerm *const bootpreds::int_neg20 = optional<int>(-20);
IntegerTerm *const bootpreds::int_neg21 = optional<int>(-21);

	Operation bootpreds::PRED_between_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if (!(a1->isInteger()))
		{
			throw IllegalTypeException(thiz, 1, "integer", a1);
		}
		a2 = a2->dref();
		if (!(a2->isInteger()))
		{
			throw IllegalTypeException(thiz, 3, "integer", a2);
		}
		if (a1->intValue() < a2->intValue())
		{
			a3 = a3->dref();
			if (a3->isVariable())
			{
				a3->bind(a1, engine->trail);
			}
		}
		return cont;
	}

	Operation bootpreds::PRED_arg_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		std::vector<Term*> args;
		int arity, argNo;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if (!(a1->isInteger()))
		{
			throw IllegalTypeException(thiz, 1, "integer", a1);
		}
		a2 = a2->dref();
		if ((a2->isCons()))
		{
			args = std::vector<Term*>(2);
			args[0] = (a2)->car();
			args[1] = (a2)->cdr();
			arity = 2;
		}
		else if ((a2->isStructure()))
		{
			args = (a2)->args();
			arity = (a2)->arity();
		}
		else if ((a2->isVar()))
		{
			throw PInstantiationException(thiz, 2);
		}
		else
		{
			throw IllegalTypeException(thiz, 2, "compound", a2);
		}
		argNo = (a1)->intValue();
		if (argNo < 0)
		{
			throw IllegalDomainException(thiz, 1, "not_less_than_zero", a1);
		}
		if (argNo > arity || argNo < 1)
		{
			return engine->fail();
		}
		if (!a3->unify(args[argNo - 1], engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_atom_chars_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		a2 = a2->dref();
		if ((a1->isVar()))
		{ // atom_chars(-Atom, +CharList)
			if (a2->isNil())
			{
				if (!a1->unify(SYM(""), engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			else if ((a2->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			else if (!(a2->isCons()))
			{
				throw IllegalTypeException(thiz, 2, "list", a2);
			}
			StringBuilder *sb = new StringBuilder();
			Term *x = a2;
			while (!x->isNil())
			{
				if ((x->isVar()))
				{
					throw PInstantiationException(thiz, 2);
				}
				if (!(x->isCons()))
				{
					throw IllegalTypeException(thiz, 2, "list", a2);
				}
				Term *car = (x)->car()->dref();
				if ((car->isVar()))
				{
					throw PInstantiationException(thiz, 2);
				}
				if (!(car->isSymbol()) || (car)->name().length() != 1)
				{
					throw IllegalTypeException(thiz, 2, "character", a2);
				}
				sb->append((car)->name());
				x = (x)->cdr()->dref();
			}
			if (!a1->unify(SymbolTerm::create(sb->toString()), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		else if (a2->isNil() || (a2->isVar()) || (a2->isCons()))
		{ // atom_chars(+Atom,
																	// ?CharList)
			if (!(a1->isSymbol()))
			{
				throw IllegalTypeException(thiz, 1, "atom", a1);
			}
			wstring s = (a1)->name();
			Term *x = Prolog::Nil;
			for (int i = s.length(); i > 0; i--)
			{
				x = CONS(SymbolTerm::create(s.substr(i - 1, i - (i - 1))), x);
			}
			if (!a2->unify(x, engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		else
		{
			return engine->fail();
		}
	}

	Operation bootpreds::PRED_atom_codes_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		a2 = a2->dref();
		if ((a1->isVar()))
		{ // atom_codes(-Atom, +CharCodeList)
			StringBuilder *sb = new StringBuilder();
			Term *x = a2;
			while (!x->isNil())
			{
				if ((x->isVar()))
				{
					throw PInstantiationException(thiz, 2);
				}
				if (!(x->isCons()))
				{
					throw IllegalTypeException(thiz, 2, "list", a2);
				}
				Term *car = (x)->car()->dref();
				if ((car->isVar()))
				{
					throw PInstantiationException(thiz, 2);
				}
				if (!(car->isInteger()))
				{
					throw RepresentationException(thiz, 2, "character_code");
				}
				// car is an integer
				int i = (car)->intValue();
				if (!Character::isDefined(static_cast<char>(i)))
				{
					throw RepresentationException(thiz, 2, "character_code");
				}
				sb->append(static_cast<char>(i));
				x = (x)->cdr()->dref();
			}
			if (!a1->unify(SymbolTerm::create(sb->toString()), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		else
		{ // atom_codes(+Atom, ?CharCodeList)
			if (!(a1->isSymbol()))
			{
				throw IllegalTypeException(thiz, 1, "atom", a1);
			}
			std::vector<char> chars = (a1)->name().toCharArray();
			Term *x = Prolog::Nil;
			for (int i = chars.size(); i > 0; i--)
			{
				x = CONS(Integer(chars[i - 1]), x);
			}
			if (!a2->unify(x, engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
	}

SymbolTerm *const bootpreds::AC_2 = F("ac", 2);

	Operation bootpreds::PRED_atom_concat_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a3 = a3->dref();
		if ((a3->isSymbol()))
		{
			SymbolTerm *s3 = a3->asSymbolTerm();
			int endIndex = s3->length();
			Term *t = Prolog::Nil;
			for (int i = 0; i <= endIndex; i++)
			{
				std::vector<Term*> args = {s3->subsymbol(0, i), s3->subsymbol(i)};
				t = CONS(C(AC_2, args), t);
			}
			return Op(FILE_builtins::PRED_$member_in_reverse_2_static_exec, VA({C(AC_2, {a1, a2}), t}), cont);
		}
		else if (!(a3->isVar()))
		{
			throw IllegalTypeException(thiz, 3, "atom", a3);
		}
		// a3 is a variable
		a1 = a1->dref();
		a2 = a2->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if ((a2->isVar()))
		{
			throw PInstantiationException(thiz, 2);
		}
		if (!(a1->isSymbol()))
		{
			throw IllegalTypeException(thiz, 1, "integer", a1);
		}
		if (!(a2->isSymbol()))
		{
			throw IllegalTypeException(thiz, 2, "integer", a2);
		}
		wstring str3 = (a1)->name().concat((a2)->name());
		if (!a3->unify(SymbolTerm::create(str3), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_atomic_concat_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		if (!(a1->isNumber()) && !(a1->isSymbol()))
		{
			throw IllegalTypeException(thiz, 1, "atomic", a1);
		}
		if (!(a2->isNumber()) && !(a2->isSymbol()))
		{
			throw IllegalTypeException(thiz, 2, "atomic", a2);
		}
		if (LARG[2]->unify(SymbolTerm::create(a1->toAtomName() + a2->toAtomName()), engine->trail))
		{
			return cont;
		}
		return engine->fail();
	}

	Operation bootpreds::PRED_atom_length_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		int length;
		a1 = a1->dref();
		a2 = a2->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if (!(a1->isSymbol()))
		{
			throw IllegalTypeException(thiz, 1, "atom", a1);
		}
		length = (a1)->name().length();
		if ((a2->isVar()))
		{
			if (!a2->unifyInt((length), engine->trail))
			{
				return engine->fail();
			}
		}
		else if ((a2->isInteger()))
		{
			int n = (a2)->intValue();
			if (n < 0)
			{
				throw IllegalDomainException(thiz, 2, "not_less_than_zero", a2);
			}
			if (length != n)
			{
				return engine->fail();
			}
		}
		else
		{
			throw IllegalTypeException(thiz, 1, "integer", a2);
		}
		return cont;
	}

	Operation bootpreds::PRED_$atom_type0_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1, *a2;
		int type;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		if (!(a1->isSymbol()))
		{
			return engine->fail();
		}
		type = Token::getStringType(a1->name());
		if (!a2->unifyInt((type), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_$begin_exception_1_static_exec(Prolog *engine)
	{
		return PRED_$begin_exception_1::static_exec(engine);
	}

	int bootpreds::PRED_$begin_exception_1::predArity()
	{
		return 1;
	}

	bootpreds::PRED_$begin_exception_1::PRED_$begin_exception_1(Term *a1, Operation cont)
	{
		LARG[0] = a1;
		this->cont = cont;
	}

	Operation bootpreds::PRED_$begin_exception_1::exec(Prolog *engine)
	{ // Operation cont = engine.cont;
											// Term[] LARG = engine.AREGS;
											// Operation thiz = engine.pred;

		engine->setB0();
		engine->pushCatcherB(engine->B0);
		engine->trail->push([&] ()
		{
		engine->popCatcherB();
		});
		return cont;
	}

	Operation bootpreds::PRED_$begin_exception_1::static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		engine->setB0();
		engine->pushCatcherB(engine->B0);
		engine->trail->push([&] ()
		{
		engine->popCatcherB();
		});
		return cont;
	}

	Operation bootpreds::PRED_$begin_sync_2_static_exec(Prolog *engine)
	{
		return PRED_$begin_sync_2::static_exec(engine);
	}

	int bootpreds::PRED_$begin_sync_2::predArity()
	{
		// TODO Auto-generated method stub
		return 2;
	}

	bootpreds::PRED_$begin_sync_2::PRED_$begin_sync_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation bootpreds::PRED_$begin_sync_2::exec(Prolog *engine)
	{
		push_to_engine(engine);
		return static_exec(engine);
	}

	Operation bootpreds::PRED_$begin_sync_2::static_exec(Prolog *engine)
	{
		std::vector<Term*> LARG = engine->AREGS;
		BlockPredicate *thiz = static_cast<BlockPredicate*>(engine->pred);
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		any o = nullptr;
		Operation code = nullptr;
		// 1st. argument
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if (!(a1->isFFIObject()))
		{
			throw IllegalTypeException(thiz, 1, "java", a1);
		}
		o = a1->object();
		// 2nd. argument
		a2 = a2->dref();
		if (!(a2->isVar()))
		{
			throw IllegalTypeException(thiz, 2, "variable", a1);
		}
		a2->asVariableTerm()->bind(FFIObject(thiz), engine->trail);
		//
		code = thiz->cont;
		thiz->outOfScope = false;
		thiz->outOfLoop = false;
		OutOfLoop tempVar(thiz);
		engine->trail->push(&tempVar);
		PrologLogger *logger = engine->getLogger();
		try
		{
			while (true)
			{
				{
				lock_guard<mutex> lock(o);
					while (!thiz->outOfScope)
					{
						if (engine->halt != 0)
						{
							goto main_loopBreak;
						}
						// if (engine.control.isEngineStopped())
						// break main_loop;
						if (thiz->outOfLoop)
						{
							goto main_loopBreak;
						}
						logger->beforeExec(code);
						code = code(engine);
					}
				}
				while (thiz->outOfScope)
				{
					if (engine->halt != 0)
					{
						goto main_loopBreak;
					}
					// if (engine.control.isEngineStopped())
					// break main_loop;
					if (thiz->outOfLoop)
					{
						goto main_loopBreak;
					}
					logger->beforeExec(code);
					code = code(engine);
				}
				main_loopContinue:;
			}
			main_loopBreak:;
		}
		catch (const StopEngineException &see)
		{
			throw see;
		}
		catch (const runtime_error &e)
		{
			throw logger->execThrows(e);
		}
		return code;
	}

	Operation bootpreds::PRED_$builtin_member_2::static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		if (!(a2->isCons()))
		{
			return engine->fail();
		}

		Term * const value = (a2)->car();
		Term * const next = (a2)->cdr()->dref();

		if (!next->equalsTerm(Prolog::Nil))
		{
			engine->setB0();
			engine->AREGS = LARG;
			engine->AREGS[1] = FFIObject(std::vector<Term*> {next});
			engine->cont = cont;
			engine->jtry2(nullptr, PRED_$builtin_member_2::retry); // push new frame
																// with retry as next
		}
		return (a1->unify(value, engine->trail)) ? cont : engine->fail();
	}

	Operation bootpreds::PRED_$builtin_member_2::retry(Prolog *engine)
	{
		engine->retry(nullptr, PRED_$builtin_member_2::retry); // restore
															// engine.AREGS[0],
															// AREGS[1], cont
		std::vector<Term*> p = any_cast<std::vector<Term*>>(engine->AREGS[1]->toJava());
		Trail * const trail = engine->trail;
		constexpr int top = trail->top();
		Term *a2 = p[0];
		while (a2->isCons())
		{
			Term * const value = (a2)->car()->dref();
			a2 = (a2)->cdr()->dref();
			if (engine->AREGS[0]->unify(value, engine->trail))
			{
				p[0] = a2;
				return engine->cont;
			}
			trail->unwind(top);
		}
		return engine->trust(Failure::fail_0);
	}

	Operation bootpreds::PRED_$builtin_member_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		if (!(a2->isCons()))
		{
			return engine->fail();
		}
		Term * const value = (a2)->car();
		Term * const next = (a2)->cdr()->dref();
		if (!next->equalsTerm(Prolog::Nil))
		{
			engine->setB0();
			engine->AREGS = LARG;
			engine->AREGS[1] = TermData::FFIObject(std::vector<Term*> {next});
			engine->cont = cont;
			engine->jtry2(nullptr, bootpreds::retry_bi_member); // push new frame with
															// retry as next
		}
		return (a1->unify(value, engine->trail)) ? cont : engine->fail();
	}

	Operation bootpreds::retry_bi_member(Prolog *engine)
	{
		engine->retry(nullptr, bootpreds::retry_bi_member); // restore engine.AREGS[0],
														// AREGS[1], cont
		std::vector<Term*> p = any_cast<std::vector<Term*>>(engine->AREGS[1]->toJava());
		Trail * const trail = engine->trail;
		constexpr int top = trail->top();
		Term *a2 = p[0];
		while (a2->isCons())
		{
			Term * const value = (a2)->car()->dref();
			a2 = (a2)->cdr()->dref();
			if (engine->AREGS[0]->unify(value, engine->trail))
			{
				p[0] = a2;
				return engine->cont;
			}
			trail->unwind(top);
		}
		return engine->trust(Failure::fail_0);
	}

SymbolTerm *const bootpreds::SYM_SLASH_2 = F("/", 2);
SymbolTerm *const bootpreds::SYM_COLON_2 = F(":", 2);
std::vector<Term*> const bootpreds::NO_ARGS = std::vector<Term*>(0);

	Operation bootpreds::PRED_$call_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0]->dref(); // a1 must be atom of package name
		a2 = LARG[1]->dref(); // a2 must be callable name
		wstring functor;
		int arity;
		std::vector<Term*> args;
		// Class clazz;
		// Constructor constr;
		// Operation pred;
		try
		{
			if (!(a1->isSymbol()))
			{
				throw IllegalTypeException(thiz, 1, "atom", a1);
			}
			if ((a2->isSymbol()))
			{
				functor = a2->name();
				args = NO_ARGS; // new Term[]{};
				arity = 0;
			}
			else if ((a2->isStructure()))
			{
				functor = a2->name();
				args = (a2)->args();
				arity = a2->arity();
			}
			else
			{
				throw IllegalTypeException(thiz, 2, "callable", a2);
			}
			try
			{
				return engine->pcl->predicate(a1->name(), functor, {cont, args});
			}
			catch (const ExistenceException &e)
			{
				try
				{
					return engine->pcl->predicate(Prolog::BUILTIN, functor, {cont, args});
				}
				catch (const ExistenceException &e2)
				{
					if ((engine->getUnknown()) == "fail")
					{
						return engine->fail();
					}
					Term *what = C(SYM_COLON_2, {a1, C(SYM_SLASH_2, SymbolTerm::create(functor), Integer(arity))});
					wstring mt = e->what();
					ExistenceException *err = new ExistenceException(thiz, 0, "procedure", what, mt);
					err->initCause(e);
					throw err;
				}
			}
		}
		catch (const invalid_argument &e)
		{
			throw SystemException(e.what() + " in " + thiz);
		}
	}

	Operation bootpreds::PRED_$call_closure_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1;
		Predicate *code;
		// a1 must be closure
		a1 = LARG[0]->dref();
		if (!(a1->isClosure()))
		{
			return engine->fail();
		}
		code = a1->asClosureTerm()->getCode();
		code->cont = cont;
		return code;
	}

	Operation bootpreds::PRED_char_code_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		a2 = a2->dref();
		if ((a1->isVar()))
		{ // char_code(-Char, +CharCode)
			if ((a2->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			else if (!(a2->isInteger()))
			{
				throw IllegalTypeException(thiz, 2, "integer", a2);
			}
			int i = (a2)->intValue();
			if (!Character::isDefined(i))
			{
				throw RepresentationException(thiz, 2, "character_code");
			}
			if (!a1->unify(SymbolTerm::create(static_cast<char>(i)), engine->trail))
			{
				return engine->fail();
			}
		}
		else if ((a1->isSymbol()))
		{ // char_code(+Char, ?CharCode)
			wstring s = (a1)->name();
			if (s.length() != 1)
			{
				throw IllegalTypeException(thiz, 1, "character", a1);
			}
			if (!a2->unifyInt((s[0]), engine->trail))
			{
				return engine->fail();
			}
		}
		else
		{
			return engine->fail();
		}
		return cont;
	}

SymbolTerm *const bootpreds::SYM_FORCE_1 = F("force", 1);
SymbolTerm *const bootpreds::SYM_TRUE = SYM("true");
SymbolTerm *const bootpreds::SYM_FALSE = SYM("false");

	Operation bootpreds::PRED_close_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::IO, thiz, LARG[0]);
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		bool forceFlag = false;
		any stream = nullptr;
		// close options
		a2 = a2->dref();
		Term *tmp = a2;
		while (!tmp->isNil())
		{
			if ((tmp->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			if (!(tmp->isCons()))
			{
				throw IllegalTypeException(thiz, 2, "list", a2);
			}
			Term *car = (tmp)->car()->dref();
			if ((car->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			if ((car->isStructure()))
			{
				Term *functor = (car)->functor();
				std::vector<Term*> args = (car)->args();
				if (functor->equalsTerm(SYM_FORCE_1))
				{
					Term *bool_Renamed = args[0]->dref();
					if (bool_Renamed->equalsTerm(SYM_TRUE))
					{
						forceFlag = true;
					}
					else if (bool_Renamed->equalsTerm(SYM_FALSE))
					{
						forceFlag = false;
					}
					else
					{
						throw IllegalDomainException(thiz, 2, "close_option", car);
					}
				}
				else
				{
					throw IllegalDomainException(thiz, 2, "close_option", car);
				}
			}
			else
			{
				throw IllegalDomainException(thiz, 2, "close_option", car);
			}
			tmp = (tmp)->cdr()->dref();
		}
		// stream
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getStreamManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "stream", a1, "");
			}
			stream = (engine->getStreamManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			stream = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "stream_or_alias", a1);
		}
		if (dynamic_cast<PushbackReader*>(stream) != nullptr)
		{
			PushbackReader *in_Renamed = any_cast<PushbackReader*>(stream);
			if (in_Renamed->equals(engine->getUserInput()))
			{
				return cont;
			}
			if (in_Renamed->equals(engine->getCurrentInput()))
			{
				engine->setCurrentInput(engine->getUserInput());
			}
			try
			{
				in_Renamed->close();
			}
			catch (const IOException &e)
			{
				throw TermException(TermData::FFIObject(e));
			}
		}
		else if (dynamic_cast<PrintWriter*>(stream) != nullptr)
		{
			PrintWriter *out = any_cast<PrintWriter*>(stream);
			if (out->checkError())
			{
				if (!forceFlag)
				{
					throw SystemException("output stream error");
				}
			}
			out->flush();
			if (out->equals(engine->getUserOutput()) || out->equals(engine->getUserError()))
			{
				return cont;
			}
			if (out->equals(engine->getCurrentOutput()))
			{
				engine->setCurrentOutput(engine->getUserOutput());
			}
			out->close();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "stream_or_alias", a1);
		}
		// delete associated entries from the stream manager
		HashtableOfTerm *streamManager = engine->getStreamManager();
		if ((a1->isSymbol()))
		{
			streamManager->remove(engine->getStreamManager()->get(a1));
			streamManager->remove(a1);
		}
		else if ((a1->isFFIObject()))
		{
			Term *tmp2 = streamManager->get(a1);
			while (!tmp2->isNil())
			{
				Term *car = (tmp2)->car()->dref();
				if ((car->isStructure()))
				{
					Term *functor = (car)->functor();
					std::vector<Term*> args = (car)->args();
					if (functor->equalsTerm(SYM_ALIAS_1))
					{
						Term *alias = args[0]->dref();
						streamManager->remove(alias);
					}
				}
				tmp2 = (tmp2)->cdr()->dref();
			}
			streamManager->remove(a1);
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "stream_or_alias", a1);
		}
		return cont;
	}

	Operation bootpreds::PRED_$compare0_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a2 = LARG[1]->dref();
		Term *a3 = LARG[2]->dref();
		if (!LARG[0]->unifyInt((a2->compareTo(a3)), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_$compiled_predicate_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();
		Term *a3 = LARG[2]->dref();
		if (!engine->pcl->definedPredicate(a1->name(), (a2)->name(), (a3)->intValue()))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_$compiled_predicate_or_builtin_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();
		Term *a3 = LARG[2]->dref();
		if (!engine->pcl->definedPredicate(a1->name(), (a2)->name(), (a3)->intValue()) && !engine->pcl->definedPredicate(Prolog::BUILTIN, (a2)->name(), (a3)->intValue()))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_current_engine_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		if (!a1->unify(FFIObject(engine), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_current_input_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::IO, thiz, LARG[0]);
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			a1->asVariableTerm()->bind(TermData::FFIObject(engine->getCurrentInput()), engine->trail);
		}
		else if ((a1->isFFIObject()))
		{
			if (!a1->unify(TermData::FFIObject(engine->getCurrentInput()), engine->trail))
			{
				return engine->fail();
			}
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "stream", a1);
		}
		return cont;
	}

	Operation bootpreds::PRED_current_output_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::IO, thiz, LARG[0]);
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			a1->asVariableTerm()->bind(TermData::FFIObject(engine->getCurrentOutput()), engine->trail);
		}
		else if ((a1->isFFIObject()))
		{
			if (!a1->unify(TermData::FFIObject(engine->getCurrentOutput()), engine->trail))
			{
				return engine->fail();
			}
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "stream", a1);
		}
		return cont;
	}

	Operation bootpreds::PRED_$cut_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		// engine.setB0();
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		if (!(a1->isInteger()))
		{
			throw IllegalTypeException("integer", a1);
		}
		else
		{
			engine->cut(a1->intValue());
		}
		return cont;
	}

	Operation bootpreds::PRED_$end_exception_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		engine->setB0();
		constexpr int B = engine->popCatcherB();
		engine->trail->push([&] ()
		{
		engine->pushCatcherB(B);
		});
		return cont;
	}

	Operation bootpreds::PRED_$end_sync_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		if (!(a1->isFFIObject()))
		{
			throw IllegalTypeException(thiz, 1, "java", a1);
		}
		any obj = a1->object();
		if (!(dynamic_cast<PRED_$begin_sync_2*>(obj) != nullptr))
		{
			throw SystemException("a1 must be an object of PRED_$begin_sync_2: " + thiz);
		}
		PRED_$begin_sync_2 *p = (any_cast<PRED_$begin_sync_2*>(obj));
		p->outOfScope = true;
		OutOfScope tempVar(p);
		engine->trail->push(&tempVar);
		return cont;
	}

	Operation bootpreds::PRED_$erase_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1 = LARG[0];
		int idx;
		a1 = a1->dref();
		if (!(a1->isInteger()))
		{
			throw IllegalTypeException(thiz, 1, "integer", a1);
		}
		idx = (a1)->intValue();
		engine->internalDB->erase(idx);
		return cont;
	}

	Operation bootpreds::PRED_exists_directory_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::IO, thiz, LARG[0]);
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if (!(a1->isSymbol()))
		{
			throw IllegalDomainException(thiz, 1, "directory", a1);
		}
		File *file = new File(a1->name());
		if (file->isDirectory())
		{
			return cont;
		}
		else
		{
			return engine->fail();
		}
	}

	Operation bootpreds::PRED_exists_file_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::IO, thiz, LARG[0]);
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if (!(a1->isSymbol()))
		{
			throw IllegalDomainException(thiz, 1, "file", a1);
		}
		File *file = new File(a1->name());
		if (file->isFile())
		{
			return cont;
		}
		else
		{
			return engine->fail();
		}
	}

	Operation bootpreds::PRED_$fast_write_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1;
		a1 = LARG[0]->dref();
		PrintWriter *pw = engine->getCurrentOutput();
		pw->print(a1->toAtomName());
		return cont;
	}

	Operation bootpreds::PRED_$fast_write_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a2;
		a2 = LARG[1];
		PrintWriter *stream = toPrintWriter(engine, thiz, LARG[0]);
		// print term
		stream->print(a2->dref()->toAtomName());
		return cont;
	}

	Operation bootpreds::PRED_$fast_writeq_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1;
		a1 = LARG[0]->dref();
		engine->getCurrentOutput()->print(a1->toQuotedString());
		return cont;
	}

	Operation bootpreds::PRED_$fast_writeq_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// S_or_a
		PrintWriter *stream = toPrintWriter(engine, thiz, a1);
		// print term
		wstring qs = a2->dref()->toQuotedString();
		if ("/*" == qs)
		{
			qs = "'" + qs + "'";
		}
		stream->print(qs);
		return cont;
	}

	PrintWriter *bootpreds::toPrintWriter(Prolog *engine, Operation thiz, Term *a1) throw(BuiltinException)
	{
		any stream = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getStreamManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "stream", a1, "");
			}
			stream = (engine->getStreamManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			stream = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "stream_or_alias", a1);
		}
		if (!(dynamic_cast<Writer*>(stream) != nullptr))
		{
			throw PermissionException(thiz, "output", "stream", a1, "");
		}
		return any_cast<PrintWriter*>(stream);
	}

	Operation bootpreds::PRED_file_directory_name_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::IO, thiz, LARG[0]);
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if (!(a1->isSymbol()))
		{
			throw IllegalDomainException(thiz, 1, "file", a1);
		}
		File *file = new File(a1->name());
		File *dir = file->getParentFile();
		if (dir == nullptr)
		{
			throw IllegalDomainException(thiz, 1, "file", a1);
		}
		Term *a2 = LARG[1]->dref();
		if (a2->unify(SymbolTerm::create(dir->getPath()), engine->trail))
		{
			return cont;
		}
		else
		{
			return engine->fail();
		}
	}

	Operation bootpreds::PRED_flush_output_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		PrintWriter *stream = toPrintWriter(engine, thiz, LARG[0]);
		stream->flush();
		return cont;
	}

SymbolTerm *const bootpreds::SYM_DOT = SYM(".");

	Operation bootpreds::PRED_functor_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// functor(?X,+Y,+Z)
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			a2 = a2->dref();
			if ((a2->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			if (!(a2->isSymbol()) && !(a2->isNumber()) && !(a2->isFFIObject()) && !(a2->isClosure()))
			{
				throw IllegalTypeException(thiz, 2, "atomic", a2);
			}
			a3 = a3->dref();
			if ((a3->isVar()))
			{
				throw PInstantiationException(thiz, 3);
			}
			if (!(a3->isInteger()))
			{
				throw IllegalTypeException(thiz, 3, "integer", a3);
			}
			int n = (a3)->intValue();
			if (n < 0)
			{
				throw IllegalDomainException(thiz, 3, "not_less_than_zero", a3);
			}
			if (n == 0)
			{
				if (!a1->unify(a2, engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			if (!(a2->isSymbol()))
			{
				throw IllegalTypeException(thiz, 2, "atom", a2);
			}
			if (n == 2 && a2->equalsTerm(SYM_DOT))
			{
				Term *t = CONS(V(engine), V(engine));
				if (!a1->unify(t, engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			std::vector<Term*> args(n);
			for (int i = 0; i < n; i++)
			{
				args[i] = V(engine);
			}
			SymbolTerm *sym = SymbolTerm::create((a2)->name(), n);
			if (!a1->unify(C(sym, args), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		// functor(+X,?Y,?Z)
		Term *functor;
		IntegerTerm *arity;
		if ((a1->isSymbol()) || (a1->isNumber()) || (a1->isFFIObject()) || (a1->isClosure()))
		{
			functor = a1;
			arity = optional<int>(0);
		}
		else if ((a1->isCons()))
		{
			functor = SYM_DOT;
			arity = optional<int>(2);
		}
		else if ((a1->isStructure()))
		{
			functor = SymbolTerm::create(a1->name());
			arity = optional<int>(a1->arity());
		}
		else
		{
			return engine->fail();
		}
		if (!a2->unify(functor, engine->trail))
		{
			return engine->fail();
		}
		if (!a3->unify(arity, engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_get_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// Char
		a2 = a2->dref();
		if (!(a2->isVar()))
		{
			if (!(a2->isInteger()))
			{
				throw IllegalTypeException(thiz, 2, "integer", a2);
			}
			int n = (a2)->intValue();
			if (n != -1 && !Character::isDefined(n))
			{
				throw RepresentationException(thiz, 2, "in_character_code");
			}
		}
		// S_or_a
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		// read a non-blank single character
		try
		{
			PushbackReader *in_Renamed = stream;
			int c = in_Renamed->read();
			while (isspace(static_cast<char>(c)))
			{
				c = in_Renamed->read();
			}
			if (c < 0)
			{ // EOF
				if (!a2->unify(INT_EOF, engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			if (!Character::isDefined(c))
			{
				throw RepresentationException(thiz, 0, "character");
			}
			if (!a2->unifyInt((c), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const IOException &e)
		{
			throw TermException(TermData::FFIObject(e));
		}
	}

	Operation bootpreds::PRED_get_byte_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// InByte
		a2 = a2->dref();
		if (!(a2->isVar()))
		{
			if (!(a2->isInteger()))
			{
				throw IllegalTypeException(thiz, 2, "in_byte", a2);
			}
			int n = (a2)->intValue();
			if (n != -1 && (n < 0 || n > 255))
			{
				throw RepresentationException(thiz, 2, "in_byte");
			}
		}
		// S_or_a
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		// read single byte
		try
		{
			int c = stream->read();
			if (c < 0)
			{ // EOF
				if (!a2->unify(INT_EOF, engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			if (c > 255)
			{
				throw RepresentationException(thiz, 0, "byte");
			}
			if (!a2->unifyInt((c), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const IOException &e)
		{
			throw TermException(TermData::FFIObject(e));
		}
	}

	PushbackReader *bootpreds::toPBReader(Prolog *engine, Operation thiz, Term *a1) throw(PInstantiationException, ExistenceException, IllegalDomainException, PermissionException)
	{
		any stream = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getStreamManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "stream", a1, "");
			}
			stream = (engine->getStreamManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			stream = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "stream_or_alias", a1);
		}
		if (!(dynamic_cast<PushbackReader*>(stream) != nullptr))
		{
			throw PermissionException(thiz, "input", "stream", a1, "");
		}
		return any_cast<PushbackReader*>(stream);
	}

	bool bootpreds::inCharacter(Term *t)
	{
		return (t->isSymbol()) && (t->equalsTerm(SYM_EOF) || (t)->name().length() == 1);
	}

	Operation bootpreds::PRED_get_char_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// Char
		a2 = a2->dref();
		if (!(a2->isVar()) && !inCharacter(a2))
		{
			throw IllegalTypeException(thiz, 2, "in_character", a2);
		}
		// S_or_a
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		// read single character
		try
		{
			int c = stream->read();
			if (c < 0)
			{ // EOF
				if (!a2->unify(SYM_EOF, engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			if (!Character::isDefined(c))
			{
				throw RepresentationException(thiz, 0, "character");
			}
			if (!a2->unify(SymbolTerm::create(static_cast<char>(c)), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const IOException &e)
		{
			throw TermException(TermData::FFIObject(e));
		}
	}

	Operation bootpreds::PRED_get_code_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// Char
		a2 = a2->dref();
		if (!(a2->isVar()))
		{
			if (!(a2->isInteger()))
			{
				throw IllegalTypeException(thiz, 2, "integer", a2);
			}
			int n = (a2)->intValue();
			if (n != -1 && !Character::isDefined(n))
			{
				throw RepresentationException(thiz, 2, "in_character_code");
			}
		}
		// S_or_a
		// S_or_a
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		// read single character
		try
		{
			int c = stream->read();
			if (c < 0)
			{ // EOF
				if (!a2->unify(INT_EOF, engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			if (!Character::isDefined(c))
			{
				throw RepresentationException(thiz, 0, "character");
			}
			if (!a2->unifyInt((c), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const IOException &e)
		{
			throw TermException(TermData::FFIObject(e));
		}
	}

	Operation bootpreds::PRED_$get_current_B_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		if (!a1->unifyInt((engine->stack->top()), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_$get_exception_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		if (!a1->unify(engine->getException(), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_$get_hash_manager_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		if (!(a1->isVar()))
		{
			throw IllegalTypeException(thiz, 1, "variable", a1);
		}
		if (!a1->unify(TermData::FFIObject(engine->getHashManager()), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

SymbolTerm *const bootpreds::COMMA = F(",", 2);

	Operation bootpreds::PRED_$get_instances_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// int idx;
		a1 = a1->dref();
		if (a1->isNil())
		{
			return engine->fail();
		}
		if (!(a1->isCons()))
		{
			throw IllegalTypeException(thiz, 1, "list", a1);
		}
		Term *x = Prolog::Nil;
		Term *tmp = a1;
		while (!tmp->isNil())
		{
			if (!(tmp->isCons()))
			{
				throw IllegalTypeException(thiz, 1, "list", a1);
			}
			Term *car = (tmp)->car()->dref();
			if ((car->isVar()))
			{
				throw PInstantiationException(thiz, 1);
			}
			if (!(car->isInteger()))
			{
				throw RepresentationException(thiz, 1, "integer");
			}
			// car is an integer
			int i = (car)->intValue();
			Term *e = engine->internalDB->get(i);
			if (e != nullptr)
			{
				x = CONS(C(COMMA, {e, car}), x);
			}
			tmp = (tmp)->cdr()->dref();
		}
		if (!a2->unify(x, engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_$get_level_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		// engine.setB0();
		Term *a1;
		a1 = LARG[0];
		if (!a1->unifyInt((engine->B0), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

SymbolTerm *const bootpreds::TRUE = SYM("true");
SymbolTerm *const bootpreds::FALSE = SYM("false");
SymbolTerm *const bootpreds::BOUNDED = SYM("bounded");
SymbolTerm *const bootpreds::MAX_INTEGER = SYM("max_integer");
SymbolTerm *const bootpreds::MIN_INTEGER = SYM("min_integer");
SymbolTerm *const bootpreds::INTEGER_ROUNDING_FUNCTION = SYM("integer_rounding_function");
SymbolTerm *const bootpreds::MAX_ARITY = SYM("max_arity");

	Operation bootpreds::PRED_$get_prolog_impl_flag_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		a2 = a2->dref();
		if (a1->equalsTerm(BOUNDED))
		{
			if (engine->isBounded())
			{
				if (!a2->unify(TRUE, engine->trail))
				{
					return engine->fail();
				}
			}
			else
			{
				if (!a2->unify(FALSE, engine->trail))
				{
					return engine->fail();
				}
			}
		}
		else if (a1->equalsTerm(MAX_INTEGER))
		{
			if (!a2->unifyInt((engine->getMaxInteger()), engine->trail))
			{
				return engine->fail();
			}
		}
		else if (a1->equalsTerm(MIN_INTEGER))
		{
			if (!a2->unifyInt((engine->getMinInteger()), engine->trail))
			{
				return engine->fail();
			}
		}
		else if (a1->equalsTerm(INTEGER_ROUNDING_FUNCTION))
		{
			if (!a2->unify(SYM(engine->getIntegerRoundingFunction()), engine->trail))
			{
				return engine->fail();
			}
		}
		else if (a1->equalsTerm(CHAR_CONVERSION))
		{
			if (!a2->unify(SYM(engine->getCharConversion()), engine->trail))
			{
				return engine->fail();
			}
		}
		else if (a1->equalsTerm(DEBUG))
		{
			if (!a2->unify(SYM(engine->getDebug()), engine->trail))
			{
				return engine->fail();
			}
		}
		else if (a1->equalsTerm(MAX_ARITY))
		{
			if (!a2->unifyInt((engine->getMaxArity()), engine->trail))
			{
				return engine->fail();
			}
		}
		else if (a1->equalsTerm(UNKNOWN))
		{
			if (!a2->unify(SYM(engine->getUnknown()), engine->trail))
			{
				return engine->fail();
			}
		}
		else if (a1->equalsTerm(DOUBLE_QUOTES))
		{
			if (!a2->unify(SYM(engine->getDoubleQuotes()), engine->trail))
			{
				return engine->fail();
			}
		}
		else if (a1->equalsTerm(PRINT_STACK_TRACE))
		{
			if (!a2->unify(SYM(engine->getPrintStackTrace()), engine->trail))
			{
				return engine->fail();
			}
		}
		else
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_$get_stream_manager_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		if (!(a1->isVar()))
		{
			throw IllegalTypeException(thiz, 1, "variable", a1);
		}
		if (!a1->unify(TermData::FFIObject(engine->getStreamManager()), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_halt_1_static_exec(Prolog *engine)
	{
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1 = LARG[0];
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if (!(a1->isInteger()))
		{
			throw IllegalTypeException(thiz, 1, "integer", a1);
		}
		engine->halt = 1 + (a1)->intValue();
		return nullptr;
	}

	Operation bootpreds::PRED_$hash_adda_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		any hash = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getHashManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "hash", a1, "");
			}
			hash = (engine->getHashManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			hash = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "hash_or_alias", a1);
		}
		if (!(HashtableOfTerm::isHashtableOfTerm(hash)))
		{
			throw InternalException(thiz + ": Hash is not HashtableOfTerm");
		}
		a2 = a2->dref();
		Term *elem = TermData::asHashtableOfTerm(hash)->get(a2);
		if (elem == nullptr)
		{
			elem = Nil;
		}
		a3 = a3->dref();
		asHashtableOfTerm(hash)->put(a2, CONS(a3, elem));
		return cont;
	}

	Operation bootpreds::PRED_$hash_addz_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		any hash = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getHashManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "hash", a1, "");
			}
			hash = (engine->getHashManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			hash = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "hash_or_alias", a1);
		}
		if (!(HashtableOfTerm::isHashtableOfTerm(hash)))
		{
			throw InternalException(thiz + ": Hash is not HashtableOfTerm");
		}
		a2 = a2->dref();
		a3 = a3->dref();
		Term *elem = asHashtableOfTerm(hash)->get(a2);
		if (elem == nullptr || Nil->equalsTerm(elem))
		{
			elem = new ListViewTerm(a3);
		}
		else if (elem->isCons())
		{
			elem = (elem)->add(a3);
		}
		else
		{
			throw InternalException(thiz + ": elem is not a ListTerm");
		}
		asHashtableOfTerm(hash)->put(a2, elem);
		return cont;
	}

	Operation bootpreds::PRED_hash_clear_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		any hash = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getHashManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "hash", a1, "");
			}
			hash = (engine->getHashManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			hash = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "hash_or_alias", a1);
		}
		if (!(HashtableOfTerm::isHashtableOfTerm(hash)))
		{
			throw InternalException(thiz + ": Hash is not HashtableOfTerm");
		}
		asHashtableOfTerm(hash)->clear();
		return cont;
	}

	Operation bootpreds::PRED_hash_contains_key_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();
		any hash = nullptr;
		if ((a1->isFFIObject()))
		{
			hash = a1->object();
		}
		else if ((a1->isSymbol()))
		{
			Term *t = engine->getHashManager()->get(a1);
			if (t == nullptr)
			{
				throw ExistenceException(thiz, 1, "hash", a1, "");
			}
			hash = t->object();
		}
		else if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "hash_or_alias", a1);
		}
		if (HashtableOfTerm::isHashtableOfTerm(hash))
		{
			if (asHashtableOfTerm(hash)->containsKey(a2))
			{
				return cont;
			}
			return engine->fail();
		}
		throw InternalException(thiz + ": Hash is not HashtableOfTerm");
	}

	Operation bootpreds::PRED_hash_get_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		any hash = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getHashManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "hash", a1, "");
			}
			hash = (engine->getHashManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			hash = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "hash_or_alias", a1);
		}
		if (!(HashtableOfTerm::isHashtableOfTerm(hash)))
		{
			throw InternalException(thiz + ": Hash is not HashtableOfTerm");
		}
		a2 = a2->dref();
		Term *elem = asHashtableOfTerm(hash)->get(a2);
		if (elem == nullptr)
		{
			elem = Prolog::Nil;
		}
		if (!a3->unify(elem, engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_hash_is_empty_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		any hash = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getHashManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "hash", a1, "");
			}
			hash = (engine->getHashManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			hash = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "hash_or_alias", a1);
		}
		if (!(HashtableOfTerm::isHashtableOfTerm(hash)))
		{
			throw InternalException(thiz + ": Hash is not HashtableOfTerm");
		}
		if (!asHashtableOfTerm(hash)->isEmpty())
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_hash_keys_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		any hash = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getHashManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "hash", a1, "");
			}
			hash = (engine->getHashManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			hash = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "hash_or_alias", a1);
		}
		if (!(HashtableOfTerm::isHashtableOfTerm(hash)))
		{
			throw InternalException(thiz + ": Hash is not HashtableOfTerm");
		}
		Term *keys = Prolog::Nil;
		for (auto t : asHashtableOfTerm(hash))
		{
			keys = CONS(t->first, keys);
		}
		if (!a2->unify(keys, engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_hash_put_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		any hash = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getHashManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "hash", a1, "");
			}
			hash = (engine->getHashManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			hash = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "hash_or_alias", a1);
		}
		if (!(HashtableOfTerm::isHashtableOfTerm(hash)))
		{
			throw InternalException(thiz + ": Hash is not HashtableOfTerm");
		}
		a2 = a2->dref();
		a3 = a3->dref();
		(any_cast<Term*>(hash)).asHashtableOfTerm().put(a2, a3);
		return cont;
	}

	Operation bootpreds::PRED_hash_remove_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		any hash = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getHashManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "hash", a1, "");
			}
			hash = (engine->getHashManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			hash = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "hash_or_alias", a1);
		}
		if (!(HashtableOfTerm::isHashtableOfTerm(hash)))
		{
			throw InternalException(thiz + ": Hash is not HashtableOfTerm");
		}
		a2 = a2->dref();
		asHashtableOfTerm(hash)->remove(a2);
		return cont;
	}

	Operation bootpreds::PRED_$hash_remove_first_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		any hash = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getHashManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "hash", a1, "");
			}
			hash = (engine->getHashManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			hash = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "hash_or_alias", a1);
		}
		if (!(HashtableOfTerm::isHashtableOfTerm(hash)))
		{
			throw InternalException(thiz + ": Hash is not HashtableOfTerm");
		}
		a2 = a2->dref();
		Term *elem = asHashtableOfTerm(hash)->get(a2);
		if (elem == nullptr || elem->isNil())
		{
			return cont;
		}
		a3 = a3->dref();
		Deque<Term*> *stack = new ArrayDeque<Term*>();
		Term *t = elem->dref();
		while (t->isCons())
		{
			Term *lt = t;
			Term *y = lt->car()->dref();
			t = lt->cdr();
			if (y->equalsTerm(a3))
			{
				break;
			}
			stack->push(y);
		}
		while (!stack->isEmpty())
		{
			t = CONS(stack->pop(), t);
		}
		elem = t;
		if (elem->isNil() && (a2->isInteger()))
		{
			asHashtableOfTerm(hash)->remove(a2);
			// System.out.println("################ key " + a2 + " is removed");
		}
		else
		{
			asHashtableOfTerm(hash)->put(a2, elem);
		}
		return cont;
	}

	Operation bootpreds::PRED_hash_size_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		any hash = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if ((a1->isSymbol()))
		{
			if (!engine->getHashManager()->containsKey(a1))
			{
				throw ExistenceException(thiz, 1, "hash", a1, "");
			}
			hash = (engine->getHashManager()->get(a1)).object();
		}
		else if ((a1->isFFIObject()))
		{
			hash = a1->object();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "hash_or_alias", a1);
		}
		if (!(HashtableOfTerm::isHashtableOfTerm(hash)))
		{
			throw InternalException(thiz + ": Hash is not HashtableOfTerm");
		}
		a2 = a2->dref();
		if (!(a2->isVar()) && !(a2->isInteger()))
		{
			throw IllegalTypeException(thiz, 1, "integer", a2);
		}
		if (!a2->unifyInt((asHashtableOfTerm(hash)->size()), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_$insert_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		int idx;
		a2 = a2->dref();
		if (!(a2->isVar()))
		{
			throw IllegalTypeException(thiz, 2, "variable", a2);
		}
		a1 = a1->dref();
		idx = engine->internalDB->insert(a1);
		if (!a2->unifyInt((idx), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_java_constructor0_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::JAVA_REFLECTION, thiz, LARG[0]);
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		type_info clazz = nullptr;
		any instance = nullptr;
		int arity;
		std::vector<Constructor*> constrs;
		std::vector<Term*> pArgs;
		std::vector<any> jArgs;
		Constructor *c = nullptr;
		try
		{
			// 2nd. argument (unbound variable)
			a2 = a2->dref();
			if (!(a2->isVar()))
			{
				throw IllegalTypeException(thiz, 2, "variable", a2);
			}
			// 1st. argument (atom or callable term)
			a1 = a1->dref();
			if ((a1->isVar()))
			{
				throw PInstantiationException(thiz, 1);
			}
			if (!(a1->isSymbol()) && !(a1->isStructure()))
			{
				throw IllegalTypeException(thiz, 1, "callable", a1);
			}
			if ((a1->isSymbol()))
			{ // No argument constructor
				clazz = type_info::forName(a1->name());
				instance = clazz.newInstance();
				if (!a2->unify(toPrologTerm(instance), engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			// Parameterized constructor
			clazz = type_info::forName(a1->name());
			arity = a1->arity();
			constrs = clazz.getConstructors();
			if (constrs.empty())
			{
				throw ExistenceException(thiz, 1, "constructor", a1, "");
			}
			pArgs = a1->args();
			jArgs = std::vector<any>(arity);
			for (int i = 0; i < arity; i++)
			{
				pArgs[i] = pArgs[i]->dref();
				if (!(pArgs[i]->isFFIObject()))
				{
					pArgs[i] = TermData::FFIObject(pArgs[i]);
				}
				jArgs[i] = pArgs[i]->toJava();
			}
			for (auto constr : constrs)
			{
				if (checkParameterTypes(constr->getParameterTypes(), pArgs))
				{
					try
					{
						c = constr;
						// c.setAccessible(true);
						instance = c->newInstance(jArgs);
						break; // Succeeds to create new instance
					}
					catch (const runtime_error &e)
					{
						c = nullptr; // Back to loop
					}
				}
			}
			if (c == nullptr)
			{
				throw ExistenceException(thiz, 1, "constructor", a1, "");
			}
			if (!a2->unify(toPrologTerm(instance), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const ClassNotFoundException &e)
		{ // Class.forName(..)
			throw JavaException(thiz, 1, e);
		}
		catch (const InstantiationException &e)
		{ // Class.forName(..) or
												// Constructor.newInstance()
			throw JavaException(thiz, 1, e);
		}
		catch (const IllegalAccessException &e)
		{ // Class.forName(..) or
												// Constructor.newInstance()
			throw JavaException(thiz, 1, e);
		}
		catch (const SecurityException &e)
		{ // Class.getConstructors()
			throw JavaException(thiz, 1, e);
		}
		catch (const invalid_argument &e)
		{ // Constructor.newInstance()
			throw JavaException(thiz, 1, e);
		}
	}

	Operation bootpreds::PRED_java_conversion_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		a2 = a2->dref();
		if ((a1->isVar()))
		{ // a1 = var
			if ((a2->isFFIObject()))
			{ // a1 = var /\ a2 = java
				a1->asVariableTerm()->bind(inverseConversion((a2)->object()), engine->trail);
			}
			else
			{ // a1 = var /\ a2 = nonjava
				a1->asVariableTerm()->bind(a2, engine->trail);
			}
		}
		else if (!(a2->isVar()))
		{ // a1 = nonvar /\ a2 = nonvar
			throw IllegalTypeException(thiz, 2, "variable", a2);
		}
		else
		{ // a1 = nonvar /\ a2 = var
			// (a1 = java \/ a1 = str \/ a1 = clo) /\ a2 = var
			if ((a1->isFFIObject()) || (a1->isStructure()) || (a1->isClosure()))
			{
				a2->asVariableTerm()->bind(a1, engine->trail);
			}
			else
			{ // a1 != java /\ a1 != str /\ a1 != clo /\ a2 = var
				a2->asVariableTerm()->bind(TermData::FFIObject(a1->toJava()), engine->trail);
			}
		}
		return cont;
	}

	Term *bootpreds::inverseConversion(any o)
	{
		if (o == nullptr)
		{
			throw EvaluationException(nullptr, 2, "undefined");
		}
		else if (dynamic_cast<optional<char>>(o) != nullptr || dynamic_cast<optional<short>>(o) != nullptr || dynamic_cast<optional<int>>(o) != nullptr || dynamic_cast<optional<long long>>(o) != nullptr)
		{
			return optional<int>((any_cast<Number*>(o)).intValue());
		}
		else if (dynamic_cast<optional<float>>(o) != nullptr || dynamic_cast<optional<double>>(o) != nullptr)
		{
			return new DoubleTerm((any_cast<Number*>(o)).doubleValue());
		}
		else if (dynamic_cast<wstring>(o) != nullptr)
		{
			return SymbolTerm::create(any_cast<wstring>(o));
		}
		else if (dynamic_cast<vector>(o) != nullptr)
		{
			vector v = any_cast<vector>(o);
			Term *t = Prolog::Nil;
			for (int i = v.size(); i > 0; i--)
			{
				t = CONS(inverseConversion(v[i - 1]), t);
			}
			return t;
		}
		return TermData::FFIObject(o);
	}

	Operation bootpreds::PRED_java_declared_constructor0_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::JAVA_REFLECTION, thiz, LARG[0]);
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		type_info clazz = nullptr;
		any instance = nullptr;
		int arity;
		std::vector<Constructor*> constrs;
		std::vector<Term*> pArgs;
		std::vector<any> jArgs;
		Constructor *c = nullptr;
		// 2nd. argument (unbound variable)
		a2 = a2->dref();
		if (!(a2->isVar()))
		{
			throw IllegalTypeException(thiz, 2, "variable", a2);
		}
		// 1st. argument (atom or callable term)
		try
		{
			a1 = a1->dref();
			if ((a1->isVar()))
			{
				throw PInstantiationException(thiz, 1);
			}
			if (!(a1->isSymbol()) && !(a1->isStructure()))
			{
				throw IllegalTypeException(thiz, 1, "callable", a1);
			}
			if ((a1->isSymbol()))
			{ // No argument constructor
				clazz = type_info::forName(a1->name());
				c = clazz.getDeclaredConstructor();
				if (c == nullptr)
				{
					throw ExistenceException(thiz, 1, "constructor", a1, "");
				}
				c->setAccessible(true);
				instance = c->newInstance();
				if (!a2->unify(toPrologTerm(instance), engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			// Parameterized constructor
			clazz = type_info::forName(a1->name());
			arity = a1->arity();
			constrs = clazz.getDeclaredConstructors();
			if (constrs.empty())
			{
				throw ExistenceException(thiz, 1, "constructor", a1, "");
			}
			pArgs = a1->args();
			jArgs = std::vector<any>(arity);
			for (int i = 0; i < arity; i++)
			{
				pArgs[i] = pArgs[i]->dref();
				if (!(pArgs[i]->isFFIObject()))
				{
					pArgs[i] = TermData::FFIObject(pArgs[i]);
				}
				jArgs[i] = pArgs[i]->toJava();
			}
			for (auto constr : constrs)
			{
				if (checkParameterTypes(constr->getParameterTypes(), pArgs))
				{
					try
					{
						c = constr;
						c->setAccessible(true);
						instance = c->newInstance(jArgs);
						break; // Succeeds to create new instance
					}
					catch (const runtime_error &e)
					{
						c = nullptr; // Back to loop
					}
				}
			}
			if (c == nullptr)
			{
				throw ExistenceException(thiz, 1, "constructor", a1, "");
			}
			if (!a2->unify(toPrologTerm(instance), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const ClassNotFoundException &e)
		{ // Class.forName(..)
			throw JavaException(thiz, 1, e);
		}
		catch (const InstantiationException &e)
		{ // Class.forName(..) or
												// Constructor.newInstance()
			throw JavaException(thiz, 1, e);
		}
		catch (const IllegalAccessException &e)
		{ // Class.forName(..) or
												// Constructor.newInstance()
			throw JavaException(thiz, 1, e);
		}
		catch (const NoSuchMethodException &e)
		{ // Class.getDeclaredConstructor()
			throw JavaException(thiz, 1, e);
		}
		catch (const SecurityException &e)
		{ // Class.getDeclaredConstructors()
			throw JavaException(thiz, 1, e);
		}
		catch (const invalid_argument &e)
		{ // Constructor.newInstance()
			throw JavaException(thiz, 1, e);
		}
		catch (const InvocationTargetException &e)
		{ // Constructor.newInstance()
			throw JavaException(thiz, 1, e);
		}
	}

	Operation bootpreds::PRED_java_declared_method0_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::JAVA_REFLECTION, thiz, LARG[0]);
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		type_info clazz = nullptr;
		any instance = nullptr;
		std::vector<Method*> methods;
		Method *m = nullptr;
		any value = nullptr;
		int arity;
		std::vector<Term*> pArgs;
		std::vector<any> jArgs;
		wstring methodName = "";
		// 3rd. argument (unbound variable)
		a3 = a3->dref();
		if (!(a3->isVar()))
		{
			throw IllegalTypeException(thiz, 3, "variable", a3);
		}
		try
		{
			// 1st. argument (atom or java term)
			a1 = a1->dref();
			if ((a1->isVar()))
			{
				throw PInstantiationException(thiz, 1);
			}
			else if ((a1->isSymbol()))
			{ // class
				clazz = type_info::forName(a1->name());
			}
			else if ((a1->isFFIObject()))
			{ // instance
				instance = a1->object();
				clazz = a1->getClazz();
			}
			else
			{
				throw IllegalTypeException(thiz, 1, "atom_or_java", a1);
			}
			// 2nd. argument (atom or callable term)
			a2 = a2->dref();
			if ((a2->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			else if ((a2->isSymbol()))
			{ // No argument method
				m = clazz.getDeclaredMethod((a2)->name());
				m->setAccessible(true);
				value = m->invoke(instance);
			}
			else if ((a2->isStructure()))
			{ // Parameterized method
				methodName = (a2)->name();
				arity = (a2)->arity();
				methods = clazz.getDeclaredMethods();
				if (methods.empty())
				{
					throw ExistenceException(thiz, 2, "method", a2, "");
				}
				pArgs = (a2)->args();
				jArgs = std::vector<any>(arity);
				for (int i = 0; i < arity; i++)
				{
					pArgs[i] = pArgs[i]->dref();
					if (!(pArgs[i]->isFFIObject()))
					{
						pArgs[i] = TermData::FFIObject(pArgs[i]);
					}
					jArgs[i] = pArgs[i]->toJava();
				}
				for (auto method : methods)
				{
					if (method->getName().equals(methodName) && checkParameterTypes(method->getParameterTypes(), pArgs))
					{
						try
						{
							m = method;
							m->setAccessible(true);
							value = m->invoke(instance, jArgs);
							break; // Succeeds to invoke the method
						}
						catch (const runtime_error &e)
						{
							m = nullptr; // Back to loop
						}
					}
				}
				if (m == nullptr)
				{
					throw ExistenceException(thiz, 2, "method", a2, "");
				}
			}
			else
			{
				throw IllegalTypeException(thiz, 2, "callable", a2);
			}
			if (value == nullptr)
			{
				return cont;
			}
			if (!a3->unify(toPrologTerm(value), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const ClassNotFoundException &e)
		{ // Class.forName
			throw JavaException(thiz, 1, e);
		}
		catch (const NoSuchMethodException &e)
		{ // Class.getDeclaredMethod
			throw JavaException(thiz, 2, e);
		}
		catch (const SecurityException &e)
		{ // Class.getDeclaredMethods
			throw JavaException(thiz, 2, e);
		}
		catch (const IllegalAccessException &e)
		{ // Method.invoke
			throw JavaException(thiz, 2, e);
		}
		catch (const invalid_argument &e)
		{ // Method.invoke
			throw JavaException(thiz, 2, e);
		}
		catch (const InvocationTargetException &e)
		{ // Method.invoke
			throw JavaException(thiz, 2, e);
		}
		catch (const NullPointerException &e)
		{ // Method.invoke
			throw JavaException(thiz, 2, e);
		}
	}

	Operation bootpreds::PRED_java_get_declared_field0_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::JAVA_REFLECTION, thiz, LARG[0]);
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		type_info clazz = nullptr;
		any instance = nullptr;
		Field *field = nullptr;
		any value = nullptr;
		// 3rd. argument (unbound variable)
		a3 = a3->dref();
		if (!(a3->isVar()))
		{
			throw IllegalTypeException(thiz, 3, "variable", a3);
		}
		try
		{
			// 1st. argument (atom or java term)
			a1 = a1->dref();
			if ((a1->isVar()))
			{
				throw PInstantiationException(thiz, 1);
			}
			else if ((a1->isSymbol()))
			{ // class
				clazz = type_info::forName(a1->name());
			}
			else if ((a1->isFFIObject()))
			{ // instance
				instance = a1->object();
				clazz = a1->getClazz();
			}
			else
			{
				throw IllegalTypeException(thiz, 1, "atom_or_java", a1);
			}
			// 2nd. argument (atom)
			a2 = a2->dref();
			if ((a2->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			else if (!(a2->isSymbol()))
			{
				throw IllegalTypeException(thiz, 2, "atom", a2);
			}
			field = clazz.getDeclaredField((a2)->name());
			field->setAccessible(true);
			value = field->get(instance);
			// 3rd. argument
			if (value == nullptr)
			{
				return cont;
			}
			if (!a3->unify(toPrologTerm(value), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const ClassNotFoundException &e)
		{ // Class.forName
			throw JavaException(thiz, 1, e);
		}
		catch (const NoSuchFieldException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const SecurityException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const NullPointerException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const IllegalAccessException &e)
		{ // Field.get(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const invalid_argument &e)
		{ // Field.get(..)
			throw JavaException(thiz, 2, e);
		}
	}

	Operation bootpreds::PRED_java_get_field0_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::JAVA_REFLECTION, thiz, LARG[0]);
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		type_info clazz = nullptr;
		any instance = nullptr;
		Field *field = nullptr;
		any value = nullptr;
		// 3rd. argument (unbound variable)
		a3 = a3->dref();
		if (!(a3->isVar()))
		{
			throw IllegalTypeException(thiz, 3, "variable", a3);
		}
		try
		{
			// 1st. argument (atom or java term)
			a1 = a1->dref();
			if ((a1->isVar()))
			{
				throw PInstantiationException(thiz, 1);
			}
			else if ((a1->isSymbol()))
			{ // class
				clazz = type_info::forName(a1->name());
			}
			else if ((a1->isFFIObject()))
			{ // instance
				instance = a1->object();
				clazz = a1->getClazz();
			}
			else
			{
				throw IllegalTypeException(thiz, 1, "atom_or_java", a1);
			}
			// 2nd. argument (atom)
			a2 = a2->dref();
			if ((a2->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			else if (!(a2->isSymbol()))
			{
				throw IllegalTypeException(thiz, 2, "atom", a2);
			}
			field = clazz.getField((a2)->name());
			value = field->get(instance);
			// 3rd. argument
			if (value == nullptr)
			{
				return cont;
			}
			if (!a3->unify(toPrologTerm(value), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const ClassNotFoundException &e)
		{ // Class.forName
			throw JavaException(thiz, 1, e);
		}
		catch (const NoSuchFieldException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const SecurityException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const NullPointerException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const IllegalAccessException &e)
		{ // Field.get(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const invalid_argument &e)
		{ // Field.get(..)
			throw JavaException(thiz, 2, e);
		}
	}

	Term *bootpreds::toPrologTerm(any obj)
	{
		if (Term::instanceOfTerm(obj))
		{
			return any_cast<Term*>(obj);
		}
		else
		{
			return TermData::FFIObject(obj);
		}
	}

	Operation bootpreds::PRED_java_method0_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::JAVA_REFLECTION, thiz, LARG[0]);
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		type_info clazz = nullptr;
		any instance = nullptr;
		std::vector<Method*> methods;
		Method *m = nullptr;
		any value = nullptr;
		int arity;
		std::vector<Term*> pArgs;
		std::vector<any> jArgs;
		wstring methodName = "";
		// 3rd. argument (unbound variable)
		a3 = a3->dref();
		if (!(a3->isVar()))
		{
			throw IllegalTypeException(thiz, 3, "variable", a3);
		}
		try
		{
			// 1st. argument (atom or java term)
			a1 = a1->dref();
			if ((a1->isVar()))
			{
				throw PInstantiationException(thiz, 1);
			}
			else if ((a1->isSymbol()))
			{ // class
				clazz = type_info::forName(a1->name());
			}
			else if ((a1->isFFIObject()))
			{ // instance
				instance = a1->object();
				clazz = a1->getClazz();
			}
			else
			{
				throw IllegalTypeException(thiz, 1, "atom_or_java", a1);
			}
			// 2nd. argument (atom or callable term)
			a2 = a2->dref();
			if ((a2->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			else if ((a2->isSymbol()))
			{ // No argument method
				m = clazz.getMethod((a2)->name());
				// m.setAccessible(true);
				value = m->invoke(instance);
			}
			else if ((a2->isStructure()))
			{ // Parameterized method
				methodName = (a2)->name();
				arity = (a2)->arity();
				methods = clazz.getMethods();
				if (methods.empty())
				{
					throw ExistenceException(thiz, 2, "method", a2, "");
				}
				pArgs = (a2)->args();
				jArgs = std::vector<any>(arity);
				for (int i = 0; i < arity; i++)
				{
					pArgs[i] = pArgs[i]->dref();
					if (!(pArgs[i]->isFFIObject()))
					{
						pArgs[i] = TermData::FFIObject(pArgs[i]);
					}
					jArgs[i] = pArgs[i]->toJava();
				}
				for (auto method : methods)
				{
					if (method->getName().equals(methodName) && checkParameterTypes(method->getParameterTypes(), pArgs))
					{
						try
						{
							m = method;
							// m.setAccessible(true);
							value = m->invoke(instance, jArgs);
							break; // Succeeds to invoke the method
						}
						catch (const runtime_error &e)
						{
							m = nullptr; // Back to loop
						}
					}
				}
				if (m == nullptr)
				{
					throw ExistenceException(thiz, 2, "method", a2, "");
				}
			}
			else
			{
				throw IllegalTypeException(thiz, 2, "callable", a2);
			}
			if (value == nullptr)
			{
				return cont;
			}
			if (!a3->unify(toPrologTerm(value), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const ClassNotFoundException &e)
		{ // Class.forName
			throw JavaException(thiz, 1, e);
		}
		catch (const NoSuchMethodException &e)
		{ // Class.getDeclaredMethod
			throw JavaException(thiz, 2, e);
		}
		catch (const SecurityException &e)
		{ // Class.getDeclaredMethods
			throw JavaException(thiz, 2, e);
		}
		catch (const IllegalAccessException &e)
		{ // Method.invoke
			throw JavaException(thiz, 2, e);
		}
		catch (const invalid_argument &e)
		{ // Method.invoke
			throw JavaException(thiz, 2, e);
		}
		catch (const InvocationTargetException &e)
		{ // Method.invoke
			throw JavaException(thiz, 2, e);
		}
		catch (const NullPointerException &e)
		{ // Method.invoke
			throw JavaException(thiz, 2, e);
		}
	}

	Operation bootpreds::PRED_java_set_declared_field0_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::JAVA_REFLECTION, thiz, LARG[0]);
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		type_info clazz = nullptr;
		any instance = nullptr;
		Field *field = nullptr;
		any value = nullptr;
		try
		{
			// 1st. argument (atom or java term)
			a1 = a1->dref();
			if ((a1->isVar()))
			{
				throw PInstantiationException(thiz, 1);
			}
			else if ((a1->isSymbol()))
			{ // class
				clazz = type_info::forName(a1->name());
			}
			else if ((a1->isFFIObject()))
			{ // instance
				instance = a1->object();
				clazz = a1->getClazz();
			}
			else
			{
				throw IllegalTypeException(thiz, 1, "atom_or_java", a1);
			}
			// 2nd. argument (atom)
			a2 = a2->dref();
			if ((a2->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			else if (!(a2->isSymbol()))
			{
				throw IllegalTypeException(thiz, 2, "atom", a2);
			}
			field = clazz.getDeclaredField((a2)->name());
			// 3rd. argument (term)
			a3 = a3->dref();
			if ((a3->isFFIObject()))
			{
				value = a3->toJava();
			}
			else
			{
				value = a3;
			}
			field->setAccessible(true);
			field->set(instance, value);
			return cont;
		}
		catch (const ClassNotFoundException &e)
		{ // Class.forName
			throw JavaException(thiz, 1, e);
		}
		catch (const NoSuchFieldException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const SecurityException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const NullPointerException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const IllegalAccessException &e)
		{ // Field.get(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const invalid_argument &e)
		{ // Field.get(..)
			throw JavaException(thiz, 2, e);
		}
	}

	Operation bootpreds::PRED_java_set_field0_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::JAVA_REFLECTION, thiz, LARG[0]);
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		type_info clazz = nullptr;
		any instance = nullptr;
		Field *field = nullptr;
		any value = nullptr;
		try
		{
			// 1st. argument (atom or java term)
			a1 = a1->dref();
			if ((a1->isVar()))
			{
				throw PInstantiationException(thiz, 1);
			}
			else if ((a1->isSymbol()))
			{ // class
				clazz = type_info::forName(a1->name());
			}
			else if ((a1->isFFIObject()))
			{ // instance
				instance = a1->object();
				clazz = a1->getClazz();
			}
			else
			{
				throw IllegalTypeException(thiz, 1, "atom_or_java", a1);
			}
			// 2nd. argument (atom)
			a2 = a2->dref();
			if ((a2->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			else if (!(a2->isSymbol()))
			{
				throw IllegalTypeException(thiz, 2, "atom", a2);
			}
			field = clazz.getField((a2)->name());
			// 3rd. argument (term)
			a3 = a3->dref();
			if ((a3->isFFIObject()))
			{
				value = a3->toJava();
			}
			else
			{
				value = a3;
			}
			field->set(instance, value);
			return cont;
		}
		catch (const ClassNotFoundException &e)
		{ // Class.forName
			throw JavaException(thiz, 1, e);
		}
		catch (const NoSuchFieldException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const SecurityException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const NullPointerException &e)
		{ // Class.getField(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const IllegalAccessException &e)
		{ // Field.get(..)
			throw JavaException(thiz, 2, e);
		}
		catch (const invalid_argument &e)
		{ // Field.get(..)
			throw JavaException(thiz, 2, e);
		}
	}

SymbolTerm *const bootpreds::SYM_HYPHEN_2 = F("-", 2);

	Operation bootpreds::PRED_keysort_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		int len;
		Term *tmp;
		std::vector<Term*> list;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if (a1->equalsTerm(Prolog::Nil))
		{
			if (!a2->unify(Prolog::Nil, engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		else if (!(a1->isCons()))
		{
			throw IllegalTypeException(thiz, 1, "list", a1);
		}
		len = (a1)->length();
		list = std::vector<Term*>(len);
		tmp = a1;
		for (int i = 0; i < len; i++)
		{
			if (!(tmp->isCons()))
			{
				throw IllegalTypeException(thiz, 1, "list", a1);
			}
			list[i] = (tmp)->car()->dref();
			if (list[i]->isVar())
			{
				throw PInstantiationException(thiz, 1);
			}
			if (!(list[i]->isStructure()))
			{
				throw IllegalTypeException(thiz, 1, "key_value_pair", a1);
			}
			if (!(list[i])->functor()->equalsTerm(SYM_HYPHEN_2))
			{
				throw IllegalTypeException(thiz, 1, "key_value_pair", a1);
			}
			tmp = (tmp)->cdr()->dref();
		}
		if (!tmp->equalsTerm(Prolog::Nil))
		{
			throw PInstantiationException(thiz, 1);
		}
		try
		{
			KeySortComparator tempVar();
			Arrays::sort(list, &tempVar);
		}
		catch (const BuiltinException &e)
		{
			e->goal = thiz;
			e->argNo = 1;
			throw e;
		}
		catch (const ClassCastException &e1)
		{
			throw JavaException(thiz, 1, e1);
		}
		tmp = Prolog::Nil;
		for (int i = list.size() - 1; i >= 0; i--)
		{
			tmp = CONS(list[i], tmp);
		}
		if (!a2->unify(tmp, engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	int bootpreds::KeySortComparator::compare(Term *t1, Term *t2)
	{
		Term *arg1 = (t1)->args()[0]->dref();
		Term *arg2 = (t2)->args()[0]->dref();
		return arg1->compareTo(arg2);
	}

	Operation bootpreds::PRED_line_count_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// S_or_a
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		// get line number
		if (!(dynamic_cast<LineNumberPushbackReader*>(stream) != nullptr) || !a2->unifyInt(((static_cast<LineNumberPushbackReader*>(stream))->getLineNumber() + 1), engine->trail))
		{
			// if (!a2.unifyInt((0),engine.trail)){ // uncomment this for creating
			// patch and comment two lines above
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_log_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		if (!(a1->isStructure()) || a1->arity() != 2)
		{
			throw IllegalTypeException(thiz, 1, "package:level", a1);
		}
		Logger * const logger = Logger::getLogger(a1->arg0(0)->name());
		Level * const level = LEVELS.getOrDefault(a1->arg0(1), Level::INFO);
		logger->log(level, a2::toAtomName);
		return cont;
	}

	Operation bootpreds::PRED_log_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		Term * const a3 = LARG[2]->dref();
		if (!(a1->isStructure()) || a1->arity() != 2)
		{
			throw IllegalTypeException(thiz, 1, "package:level", a1);
		}
		if (!(a2->isSymbol()))
		{
			throw IllegalTypeException(thiz, 2, "atom", a2);
		}
		Logger * const logger = Logger::getLogger(a1->arg0(0)->name());
		Level * const level = LEVELS.getOrDefault(a1->arg0(1), Level::INFO);
		logger->log(level, [&] ()
		{
		wstring::format(a2->name(), a3->toJava());
		});
		return cont;
	}

	Operation bootpreds::PRED_log_4_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		Term * const a3 = LARG[2]->dref();
		Term * const a4 = LARG[3]->dref();
		if (!(a1->isStructure()) || a1->arity() != 2)
		{
			throw IllegalTypeException(thiz, 1, "package:level", a1);
		}
		if (!(a2->isSymbol()))
		{
			throw IllegalTypeException(thiz, 2, "atom", a2);
		}
		Logger * const logger = Logger::getLogger(a1->arg0(0)->name());
		Level * const level = LEVELS.getOrDefault(a1->arg0(1), Level::INFO);
		logger->log(level, [&] ()
		{
		wstring::format(a2->name(), a3->toJava(), a4->toJava());
		});
		return cont;
	}

	Operation bootpreds::PRED_log_5_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		Term * const a3 = LARG[2]->dref();
		Term * const a4 = LARG[3]->dref();
		Term * const a5 = LARG[4]->dref();
		if (!(a1->isStructure()) || a1->arity() != 2)
		{
			throw IllegalTypeException(thiz, 1, "package:level", a1);
		}
		if (!(a2->isSymbol()))
		{
			throw IllegalTypeException(thiz, 2, "atom", a2);
		}
		Logger * const logger = Logger::getLogger(a1->arg0(0)->name());
		Level * const level = LEVELS.getOrDefault(a1->arg0(1), Level::INFO);
		logger->log(level, [&] ()
		{
		wstring::format(a2->name(), a3->toJava(), a4->toJava(), a5->toJava());
		});
		return cont;
	}

	Operation bootpreds::PRED_log_6_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		Term * const a3 = LARG[2]->dref();
		Term * const a4 = LARG[3]->dref();
		Term * const a5 = LARG[4]->dref();
		Term * const a6 = LARG[5]->dref();
		if (!(a1->isStructure()) || a1->arity() != 2)
		{
			throw IllegalTypeException(thiz, 1, "package:level", a1);
		}
		if (!(a2->isSymbol()))
		{
			throw IllegalTypeException(thiz, 2, "atom", a2);
		}
		Logger * const logger = Logger::getLogger(a1->arg0(0)->name());
		Level * const level = LEVELS.getOrDefault(a1->arg0(1), Level::INFO);
		logger->log(level, [&] ()
		{
		wstring::format(a2->name(), a3->toJava(), a4->toJava(), a5->toJava(), a6->toJava());
		});
		return cont;
	}

	Operation bootpreds::PRED_log_7_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		Term * const a3 = LARG[2]->dref();
		Term * const a4 = LARG[3]->dref();
		Term * const a5 = LARG[4]->dref();
		Term * const a6 = LARG[5]->dref();
		Term * const a7 = LARG[6]->dref();
		if (!(a1->isStructure()) || a1->arity() != 2)
		{
			throw IllegalTypeException(thiz, 1, "package:level", a1);
		}
		if (!(a2->isSymbol()))
		{
			throw IllegalTypeException(thiz, 2, "atom", a2);
		}
		Logger * const logger = Logger::getLogger(a1->arg0(0)->name());
		Level * const level = LEVELS.getOrDefault(a1->arg0(1), Level::INFO);
		logger->log(level, [&] ()
		{
		wstring::format(a2->name(), a3->toJava(), a4->toJava(), a5->toJava(), a6->toJava(), a7->toJava());
		});
		return cont;
	}

	Operation bootpreds::PRED_log_error_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();
		if (!(a1->isStructure()) || a1->arity() != 2)
		{
			throw IllegalTypeException(thiz, 1, "package:level", a1);
		}
		Logger * const logger = Logger::getLogger(a1->arg0(0)->name());
		Level * const level = LEVELS.getOrDefault(a1->arg0(1), Level::INFO);
		if (logger->isLoggable(level))
		{
			runtime_error t = nullptr;
			if (a2->isFFIObject() && (dynamic_cast<runtime_error>(a2->toJava()) != nullptr))
			{
				t = any_cast<runtime_error>(a2->toJava());
			}
			else if (dynamic_cast<ErrorTerm*>(a2) != nullptr)
			{
				t = TermData::asErrorTerm(a2)->getThrowable();
			}
			logger->log(level, a2->toAtomName());
			if (t != nullptr)
			{
				logger->log(level, "", t);
			}
		}
		return cont;
	}

const unordered_map<Term*, java::util::logging::Level*> bootpreds::LEVELS = unordered_map<Term*, java::util::logging::Level*>();

	bootpreds::StaticConstructor::StaticConstructor()
	{
	LEVELS.emplace(SYM("ALL"), Level::ALL);
	LEVELS.emplace(SYM("all"), Level::ALL);
	LEVELS.emplace(SYM("FINEST"), Level::FINEST);
	LEVELS.emplace(SYM("finest"), Level::FINEST);
	LEVELS.emplace(SYM("FINER"), Level::FINER);
	LEVELS.emplace(SYM("finer"), Level::FINER);
	LEVELS.emplace(SYM("FINE"), Level::FINE);
	LEVELS.emplace(SYM("fine"), Level::FINE);
	LEVELS.emplace(SYM("INFO"), Level::INFO);
	LEVELS.emplace(SYM("info"), Level::INFO);
	LEVELS.emplace(SYM("CONFIG"), Level::CONFIG);
	LEVELS.emplace(SYM("config"), Level::CONFIG);
	LEVELS.emplace(SYM("WARNING"), Level::WARNING);
	LEVELS.emplace(SYM("warning"), Level::WARNING);
	LEVELS.emplace(SYM("SEVERE"), Level::SEVERE);
	LEVELS.emplace(SYM("severe"), Level::SEVERE);
	}

bootpreds::StaticConstructor bootpreds::staticConstructor;

	Operation bootpreds::PRED_loggable_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term *a1 = LARG[0]->dref();
		if (!(a1->isStructure()) || a1->arity() != 2)
		{
			throw IllegalTypeException(thiz, 1, "package:level", a1);
		}
		Logger *logger = Logger::getLogger(a1->arg0(0)->name());
		if (!logger->isLoggable(LEVELS.getOrDefault(a1->arg0(1), Level::INFO)))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_log_level_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term * const a1 = LARG[0]->dref();
		if (!(a1->isStructure()) || a1->arity() != 2)
		{
			throw IllegalTypeException(thiz, 1, "package:level", a1);
		}
		Term * const packageTerm = a1->arg0(0);
		Logger * const logger = Logger::getLogger(packageTerm->name());
		Term * const levelTerm = a1->arg0(1);
		if ((levelTerm->isVar()))
		{
			// obtain logger's level, which may be inherited from parent
			Level *level = nullptr;
			for (Logger *l = logger; l != nullptr && (level = l->getLevel()) == nullptr; l = l->getParent())
			{
			}
			if (level == nullptr)
			{
				level = Level::INFO;
			}
			if (!levelTerm->unify(SymbolTerm::create(level->getName()), engine->trail))
			{
				return engine->fail();
			}
		}
		else if (levelTerm->isSymbol())
		{
			logger->setLevel(LEVELS.getOrDefault(levelTerm, Level::INFO));
		}
		else
		{
			throw IllegalTypeException(thiz, 1, "package:level", a1);
		}
		return cont;
	}

	Operation bootpreds::PRED_make_directory_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::IO, thiz, LARG[0]);
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if (!(a1->isSymbol()))
		{
			throw IllegalDomainException(thiz, 1, "dir", a1);
		}
		File *file = new File(a1->name());
		if (file->mkdir())
		{
			return cont;
		}
		else
		{
			throw PermissionException(thiz, "open", "dir", a1, "cannot create");
		}
	}

	Operation bootpreds::PRED_mutex_create_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term *a1 = LARG[0]->dref();
		if ((a1->isSymbol()))
		{
			Mutex::getInstance(a1->name());
		}
		else if ((a1->isVar()))
		{
			if (!a1->unify(TermData::FFIObject(Mutex::getInstance()), engine->trail))
			{
				return engine->fail();
			}
		}
		else
		{
			throw IllegalTypeException(thiz, 1, "atom or variable", a1);
		}
		return cont;
	}

	Operation bootpreds::PRED_mutex_lock_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term *a1 = LARG[0]->dref();
		Lock *lock;
		if ((a1->isSymbol()))
		{
			lock = Mutex::getInstance(a1->name());
		}
		else if ((a1->isFFIObject()) && (dynamic_cast<Lock*>(a1->toJava()) != nullptr))
		{
			lock = any_cast<Lock*>(a1->toJava());
		}
		else
		{
			throw IllegalTypeException(thiz, 1, "atom or JavaObjectTerm(Lock)", a1);
		}
		lock->lock();
		return cont;
	}

	Operation bootpreds::PRED_mutex_lock_bt_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term *a1 = LARG[0]->dref();
		Lock * const lock;
		if ((a1->isSymbol()))
		{
			lock = Mutex::getInstance(a1->name());
		}
		else if ((a1->isFFIObject()) && (dynamic_cast<Lock*>(a1->toJava()) != nullptr))
		{
			lock = any_cast<Lock*>(a1->toJava());
		}
		else
		{
			throw IllegalTypeException(thiz, 1, "atom or JavaObjectTerm(Lock)", a1);
		}
		lock->lock();
		engine->trail->push([&] ()
		{
		try
		{
			lock->unlock();
		}
		catch (const IllegalMonitorStateException &e)
		{
		}
		});
		return cont;
	}

	Operation bootpreds::PRED_mutex_trylock_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term *a1 = LARG[0]->dref();
		Lock *lock;
		if ((a1->isSymbol()))
		{
			lock = Mutex::getInstance(a1->name());
		}
		else if ((a1->isFFIObject()) && (dynamic_cast<Lock*>(a1->toJava()) != nullptr))
		{
			lock = any_cast<Lock*>(a1->toJava());
		}
		else
		{
			throw IllegalTypeException(thiz, 1, "atom or JavaObjectTerm(Lock)", a1);
		}
		if (!lock->tryLock())
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_mutex_unlock_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term *a1 = LARG[0]->dref();
		Lock *lock;
		if ((a1->isSymbol()))
		{
			lock = Mutex::getInstance(a1->name());
		}
		else if ((a1->isFFIObject()) && (dynamic_cast<Lock*>(a1->toJava()) != nullptr))
		{
			lock = any_cast<Lock*>(a1->toJava());
		}
		else
		{
			throw IllegalTypeException(thiz, 1, "atom or JavaObjectTerm(Lock)", a1);
		}
		lock->unlock();
		return cont;
	}

	Operation bootpreds::PRED_$neck_cut_0_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		// engine.setB0();
		engine->neckCut();
		return cont;
	}

SymbolTerm *const bootpreds::SYM_ALIAS_1 = F("alias", 1);

	Operation bootpreds::PRED_new_hash_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		if (!(a1->isVar()))
		{
			throw IllegalTypeException(thiz, 1, "variable", a1);
		}
		HashtableOfTerm tempVar();
		Term *newHash = TermData::FFIObject(&tempVar);
		a2 = a2->dref();
		if (a2->isNil())
		{
			if (!a1->unify(newHash, engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		else if (!(a2->isCons()))
		{
			throw IllegalTypeException(thiz, 2, "list", a2);
		}
		// a2 is list
		Term *tmp = a2;
		while (!tmp->isNil())
		{
			if ((tmp->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			if (!(tmp->isCons()))
			{
				throw IllegalTypeException(thiz, 2, "list", a2);
			}
			Term *car = (tmp)->car()->dref();
			if ((car->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			if ((car->isStructure()))
			{
				Term *functor = (car)->functor();
				std::vector<Term*> args = (car)->args();
				if (functor->equalsTerm(SYM_ALIAS_1))
				{
					Term *alias = args[0]->dref();
					if (!(alias->isSymbol()))
					{
						throw IllegalDomainException(thiz, 2, "hash_option", car);
					}
					else
					{
						if (engine->getHashManager()->containsKey(alias))
						{
							throw PermissionException(thiz, "new", "hash", car, "");
						}
						engine->getHashManager()->put(alias, newHash);
					}
				}
				else
				{
					throw IllegalDomainException(thiz, 2, "hash_option", car);
				}
			}
			else
			{
				throw IllegalDomainException(thiz, 2, "hash_option", car);
			}
			tmp = (tmp)->cdr()->dref();
		}
		if (!a1->unify(newHash, engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_nl_0_static_exec_bootpred(Prolog *engine)
	{
		Operation cont = engine->cont;
		engine->setB0();
		engine->getCurrentOutput()->println();
		return cont;
	}

	Operation bootpreds::PRED_number_chars_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		a2 = a2->dref();
		if (a2->isNil())
		{
			throw SyntaxException(thiz, 2, "character_code_list", a2, "");
		}
		if ((a1->isVar()))
		{ // number_chars(-Number, +CharList)
			if ((a2->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			else if (!(a2->isCons()))
			{
				throw IllegalTypeException(thiz, 2, "list", a2);
			}
			StringBuilder *sb = new StringBuilder();
			Term *x = a2;
			while (!x->isNil())
			{
				if ((x->isVar()))
				{
					throw PInstantiationException(thiz, 2);
				}
				if (!(x->isCons()))
				{
					throw IllegalTypeException(thiz, 2, "list", a2);
				}
				Term *car = (x)->car()->dref();
				if ((car->isVar()))
				{
					throw PInstantiationException(thiz, 2);
				}
				if (!(car->isSymbol()) || (car)->name().length() != 1)
				{
					throw IllegalTypeException(thiz, 2, "character", a2);
				}
				sb->append((car)->name());
				x = (x)->cdr()->dref();
			}
			try
			{
				if (!a1->unifyInt((static_cast<Integer>(sb->toString())), engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			catch (const NumberFormatException &e)
			{
			}
			try
			{
				DoubleTerm tempVar(static_cast<Double>(sb->toString()));
				if (!a1->unify(&tempVar, engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			catch (const NumberFormatException &e)
			{
				throw SyntaxException(thiz, 2, "character_code_list", a2, "");
			}
		}
		else if ((a1->isNumber()))
		{ // number_chars(+Number, ?CharList)
			wstring s = a1->toAtomName();
			Term *y = Prolog::Nil;
			for (int i = s.length() - 1; i >= 0; i--)
			{
				y = CONS(SymbolTerm::create(s[i]), y);
			}
			if (!a2->unify(y, engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		else
		{
			throw IllegalTypeException(thiz, 1, "number", a1);
		}
	}

	Operation bootpreds::PRED_number_codes_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		a2 = a2->dref();
		if (a2->isNil())
		{
			throw SyntaxException(thiz, 2, "character_code_list", a2, "");
		}
		if ((a1->isVar()))
		{ // number_codes(-Number, +CharCodeList)
			StringBuilder *sb = new StringBuilder();
			Term *x = a2;
			while (!x->isNil())
			{
				if ((x->isVar()))
				{
					throw PInstantiationException(thiz, 2);
				}
				if (!(x->isCons()))
				{
					throw IllegalTypeException(thiz, 2, "list", a2);
				}
				Term *car = (x)->car()->dref();
				if ((car->isVar()))
				{
					throw PInstantiationException(thiz, 2);
				}
				if (!(car->isInteger()))
				{
					throw RepresentationException(thiz, 2, "character_code");
				}
				// car is an integer
				int i = (car)->intValue();
				if (!Character::isDefined(static_cast<char>(i)))
				{
					throw RepresentationException(thiz, 2, "character_code");
				}
				sb->append(static_cast<char>(i));
				x = (x)->cdr()->dref();
			}
			try
			{
				if (!a1->unifyInt((static_cast<Integer>(sb->toString())), engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			catch (const NumberFormatException &e)
			{
			}
			try
			{
				DoubleTerm tempVar(static_cast<Double>(sb->toString()));
				if (!a1->unify(&tempVar, engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			catch (const NumberFormatException &e)
			{
				throw SyntaxException(thiz, 2, "character_code_list", a2, "");
			}
		}
		else if ((a1->isNumber()))
		{ // number_codes(+Number, ?CharCodeList)
			std::vector<char> chars = a1->toAtomName().toCharArray();
			Term *y = Prolog::Nil;
			for (int i = chars.size(); i > 0; i--)
			{
				y = CONS(Integer(chars[i - 1]), y);
			}
			if (!a2->unify(y, engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		else
		{
			throw IllegalTypeException(thiz, 1, "number", a1);
		}
	}

SymbolTerm *const bootpreds::SYM_TEXT = SYM("text");
SymbolTerm *const bootpreds::SYM_READ = SYM("read");
SymbolTerm *const bootpreds::SYM_WRITE = SYM("write");
SymbolTerm *const bootpreds::SYM_APPEND = SYM("append");
SymbolTerm *const bootpreds::SYM_INPUT = SYM("input");
SymbolTerm *const bootpreds::SYM_OUTPUT = SYM("output");
SymbolTerm *const bootpreds::SYM_MODE_1 = F("mode", 1);
SymbolTerm *const bootpreds::SYM_TYPE_1 = F("type", 1);
SymbolTerm *const bootpreds::SYM_FILE_NAME_1 = F("file_name", 1);
SymbolTerm *const bootpreds::SYM_CHARSET = F("charset", 1);
SymbolTerm *const bootpreds::SYM_AUTOCLOSE = F("autoclose", 1);

	Operation bootpreds::PRED_open_4_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->requireFeature(Prolog::Feature::IO, thiz, LARG[0]);
		engine->setB0();
		File *file = nullptr;
		wstring resourceName = "";
		Term *alias = nullptr;
		Term *opts = Prolog::Nil;
		FFIObjectTerm *streamObject;
		Term *a1, *a2, *a3, *a4;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		// stream
		a3 = a3->dref();
		if (!(a3->isVar()))
		{
			throw IllegalTypeException(thiz, 3, "variable", a3);
		}
		// source_sink
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if ((a1->isSymbol()))
		{
			file = new File(a1->name());
		}
		else if ((a1->isStructure()) && ":" == a1->name() && 2 == a1->arity())
		{
			Term *pkg = a1->arg0(0)->dref();
			Term *name = a1->arg0(1)->dref();
			if (!(pkg->isSymbol()) || !(name->isSymbol()))
			{
				throw IllegalDomainException(thiz, 1, "source_sink", a1);
			}
			resourceName = '/' + StringHelper::replace(pkg->name(), '.', '/') + StringHelper::toString('/') + name->name();
		}
		else
		{
			throw IllegalDomainException(thiz, 1, "source_sink", a1);
		}
		// io_mode
		a2 = a2->dref();
		if ((a2->isVar()))
		{
			throw PInstantiationException(thiz, 2);
		}
		if (!(a2->isSymbol()))
		{
			throw IllegalTypeException(thiz, 2, "atom", a2);
		}
		if (resourceName != "" && !a2->equalsTerm(SYM_READ))
		{ // writing to
																// resources is
																// prohibited
			throw PermissionException(thiz, "open", "source_sink", a1, "");
		}
		unordered_map<SymbolTerm*, Term*> options = processOptions(a4->dref());
		Charset *charset = Charset::defaultCharset();
		if (options.find(SYM_CHARSET) != options.end())
		{
			Term *charsetOption = options[SYM_CHARSET];
			if (charsetOption->arity() != 1 || !(charsetOption->arg0(0)->isSymbol()))
			{
				throw IllegalDomainException(thiz, 4, "stream_option", charsetOption);
			}
			wstring charsetName = charsetOption->arg0(0)->dref()->name();
			charset = Charset::forName(charsetName);
		}
		try
		{
			if (a2->equalsTerm(SYM_READ))
			{
				InputStream *inputStream = nullptr;
				if (resourceName != "")
				{
					inputStream = bootpreds::typeid->getResourceAsStream(resourceName);
				}
				else if (file->exists())
				{
					inputStream = new FileInputStream(file);
				}
				if (inputStream == nullptr)
				{
					throw ExistenceException(thiz, 1, "source_sink", a1, "");
				}
				BufferedReader tempVar(new InputStreamReader(inputStream, charset));
				PushbackReader *in_Renamed = new LineNumberPushbackReader(&tempVar, Prolog::PUSHBACK_SIZE);
				streamObject = TermData::FFIObject(in_Renamed);
				opts = CONS(SYM_INPUT, opts);
			}
			else if (a2->equalsTerm(SYM_WRITE))
			{
				File *parentFile = file->getParentFile();
				if (parentFile != nullptr)
				{
					parentFile->mkdirs();
				}
				BufferedWriter tempVar2(new OutputStreamWriter(new FileOutputStream(file, false), charset));
				PrintWriter *out = new PrintWriter(&tempVar2);
				streamObject = TermData::FFIObject(out);
				opts = CONS(SYM_OUTPUT, opts);
			}
			else if (a2->equalsTerm(SYM_APPEND))
			{
				File *parentFile = file->getParentFile();
				if (parentFile != nullptr)
				{
					parentFile->mkdirs();
				}
				BufferedWriter tempVar3(new OutputStreamWriter(new FileOutputStream(file, true), charset));
				PrintWriter *out = new PrintWriter(&tempVar3);
				streamObject = TermData::FFIObject(out);
				opts = CONS(SYM_OUTPUT, opts);
			}
			else
			{
				throw IllegalDomainException(thiz, 2, "io_mode", a2);
			}
		}
		catch (const IOException &e)
		{
			throw PermissionException(thiz, "open", "source_sink", a1, "");
		}
		if (engine->getStreamManager()->containsKey(streamObject))
		{
			throw InternalException("stream object is duplicated");
		}
		// stream_options
		if (options.find(SYM_ALIAS_1) != options.end())
		{
			Term *aliasOption = options[SYM_ALIAS_1];
			if (aliasOption->arity() != 1 || !(aliasOption->arg0(0)->isSymbol()))
			{
				throw IllegalDomainException(thiz, 4, "stream_option", aliasOption);
			}
			alias = aliasOption->arg0(0)->dref();
			if (engine->getStreamManager()->containsKey(alias))
			{
				throw PermissionException(thiz, "open", "source_sink", aliasOption, "");
			}
		}
		opts = CONS(C(SYM_TYPE_1, SYM_TEXT), opts);
		opts = CONS(C(SYM_MODE_1, {a2}), opts);
		opts = CONS(C(SYM_FILE_NAME_1, file == nullptr ? a1 : SymbolTerm::create(file->getAbsolutePath())), opts);
		if (alias != nullptr)
		{
			engine->getStreamManager()->put(alias, streamObject);
			opts = CONS(C(SYM_ALIAS_1, {alias}), opts);
		}
		a3->asVariableTerm()->bind(streamObject, engine->trail);
		engine->getStreamManager()->put(streamObject, opts);
		if (options.find(SYM_AUTOCLOSE) != options.end())
		{
			Term *autoCloseOption = options[SYM_AUTOCLOSE];
			if (autoCloseOption->arity() != 1 || !(autoCloseOption->arg0(0)->isSymbol()))
			{
				throw IllegalDomainException(thiz, 4, "stream_option", autoCloseOption);
			}
			if ("true" == autoCloseOption->arg0(0)->name())
			{
				CloseHelper tempVar4(engine, streamObject, alias);
				engine->trail->push(&tempVar4);
			}
		}
		return cont;
	}

	unordered_map<SymbolTerm*, Term*> bootpreds::processOptions(Term *options)
	{
		Operation thiz = Prolog::M->pred;
		unordered_map<SymbolTerm*, Term*> result = unordered_map<SymbolTerm*, Term*>();
		Term *p = options;
		while (!p->isNil())
		{
			// type check
			if ((p->isVar()))
			{
				throw PInstantiationException(thiz, 4);
			}
			if (!(p->isCons()))
			{
				throw IllegalTypeException(thiz, 4, "list", options);
			}
			Term *option = (p)->car()->dref();
			if ((option->isVar()))
			{
				throw PInstantiationException(thiz, 4);
			}
			if ((option->isStructure()))
			{
				SymbolTerm *functor = (option)->functor()->asSymbolTerm();
				result.emplace(functor, option);
			}
			else
			{
				throw IllegalDomainException(thiz, 4, "stream_option", option);
			}
			p = (p)->cdr()->dref();
		}
		return result;
	}

	bootpreds::CloseHelper::CloseHelper(Prolog *engine, FFIObjectTerm *streamObject, Term *alias) : engine(engine), streamObject(streamObject), alias(alias)
	{
	}

	void bootpreds::CloseHelper::undo()
	{
		this->engine->getStreamManager()->remove(this->streamObject);
		if (this->alias != nullptr)
		{
			this->engine->getStreamManager()->remove(this->alias);
		}
		Closeable *closeable = any_cast<Closeable*>(this->streamObject->object());
		try
		{
			delete closeable;
		}
		catch (const IOException &e)
		{
			throw JavaException(e);
		}
	}

	Operation bootpreds::PRED_peek_byte_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// InByte
		a2 = a2->dref();
		if (!(a2->isVar()))
		{
			if (!(a2->isInteger()))
			{
				throw IllegalTypeException(thiz, 2, "in_byte", a2);
			}
			int n = (a2)->intValue();
			if (n != -1 && (n < 0 || n > 255))
			{
				throw RepresentationException(thiz, 2, "in_byte");
			}
		}
		// S_or_a
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		// read single byte
		try
		{
			int c = stream->read();
			if (c < 0)
			{ // EOF
				if (!a2->unify(INT_EOF, engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			if (c > 255)
			{
				throw RepresentationException(thiz, 0, "byte");
			}
			stream->unread(c);
			if (!a2->unifyInt((c), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const IOException &e)
		{
			throw TermException(TermData::FFIObject(e));
		}
	}

SymbolTerm *const bootpreds::SYM_EOF = SYM("end_of_file");

	Operation bootpreds::PRED_peek_char_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// Char
		a2 = a2->dref();
		if (!(a2->isVar()) && !inCharacter(a2))
		{
			throw IllegalTypeException(thiz, 2, "in_character", a2);
		}
		// S_or_a
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		// read single character
		try
		{
			int c = stream->read();
			if (c < 0)
			{ // EOF
				if (!a2->unify(SYM_EOF, engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			if (!Character::isDefined(c))
			{
				throw RepresentationException(thiz, 0, "character");
			}
			stream->unread(c);
			if (!a2->unify(SymbolTerm::create(static_cast<char>(c)), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const IOException &e)
		{
			throw TermException(TermData::FFIObject(e));
		}
	}

IntegerTerm *const bootpreds::INT_EOF = optional<int>(-1);

	Operation bootpreds::PRED_peek_code_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// Char
		a2 = a2->dref();
		if (!(a2->isVar()))
		{
			if (!(a2->isInteger()))
			{
				throw IllegalTypeException(thiz, 2, "integer", a2);
			}
			int n = (a2)->intValue();
			if (n != -1 && !Character::isDefined(n))
			{
				throw RepresentationException(thiz, 2, "in_character_code");
			}
		}
		// S_or_a
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		// read single character
		try
		{
			int c = stream->read();
			if (c < 0)
			{ // EOF
				if (!a2->unify(INT_EOF, engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			if (!Character::isDefined(c))
			{
				throw RepresentationException(thiz, 0, "character");
			}
			stream->unread(c);
			if (!a2->unifyInt((c), engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const IOException &e)
		{
			throw TermException(TermData::FFIObject(e));
		}
	}

	Operation bootpreds::PRED_$print_stack_trace_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if (!(a1->isFFIObject()))
		{
			throw IllegalTypeException(thiz, 1, "java", a1);
		}
		any obj = a1->object();
		if (dynamic_cast<InterruptedException*>(obj) != nullptr)
		{
			throw JavaInterruptedException(any_cast<InterruptedException*>(obj));
		}
		if (engine->getPrintStackTrace() == "on")
		{
			engine->control->printStackTrace(any_cast<runtime_error>(obj));
		}
		return cont;
	}

	Operation bootpreds::PRED_put_byte_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a2;
		a2 = LARG[1];
		int c;
		// Byte
		a2 = a2->dref();
		if ((a2->isVar()))
		{
			throw PInstantiationException(thiz, 2);
		}
		if (!(a2->isInteger()))
		{
			throw IllegalTypeException(thiz, 2, "byte", a2);
		}
		c = (a2)->intValue();
		if (c < 0 || c > 255)
		{
			throw IllegalTypeException(thiz, 2, "byte", a2);
		}
		// S_or_a
		PrintWriter *stream = toPrintWriter(engine, thiz, LARG[0]);
		// print single byte
		stream->print(static_cast<char>(c));
		return cont;
	}

	Operation bootpreds::PRED_put_char_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a2;
		a2 = LARG[1];
		wstring str;
		char c;
		// Char
		a2 = a2->dref();
		if ((a2->isVar()))
		{
			throw PInstantiationException(thiz, 2);
		}
		if (!(a2->isSymbol()))
		{
			throw IllegalTypeException(thiz, 2, "character", a2);
		}
		// S_or_a
		PrintWriter *stream = toPrintWriter(engine, thiz, LARG[0]);
		// print single character
		str = (a2)->name();
		if (str.length() != 1)
		{
			throw IllegalTypeException(thiz, 2, "character", a2);
		}
		c = str[0];
		if (!Character::isDefined(c))
		{
			throw RepresentationException(thiz, 2, "character");
		}
		stream->print(c);
		return cont;
	}

	Operation bootpreds::PRED_put_code_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a2;
		a2 = LARG[1];
		int c;
		// Char
		a2 = a2->dref();
		if ((a2->isVar()))
		{
			throw PInstantiationException(thiz, 2);
		}
		if (!(a2->isInteger()))
		{
			throw IllegalTypeException(thiz, 2, "integer", a2);
		}
		// S_or_a
		PrintWriter *stream = toPrintWriter(engine, thiz, LARG[0]);
		// print single character
		c = (a2)->intValue();
		if (!Character::isDefined(c))
		{
			throw RepresentationException(thiz, 2, "character");
		}
		stream->print(static_cast<char>(c));
		return cont;
	}

	Operation bootpreds::PRED_raise_exception_1_static_exec(Prolog *engine)
	{
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		throw TermException(a1);
	}

	Operation bootpreds::PRED_throw_1_static_exec(Prolog *engine)
	{
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		throw TermException(a1);
	}

	Operation bootpreds::PRED_$unify_2_static_exec_builtins(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// '$unify'(A,B):-'$unify'(A,B)
		m->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// '$unify'(A,B):-['$unify'(A,B)]
		// START inline expansion of $unify(a(1),a(2))
		if (!a1->unify(a2, m->trail))
		{
			return m->fail();
		}
		// END inline expansion
		return cont;
	}

	Operation bootpreds::PRED_read_line_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		wstring line;
		std::vector<char> chars;
		Term *t;
		// S_or_a
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		// read line
		try
		{
			PushbackReader *pbr = stream;
			cleanPendingWhiteSpace(pbr);
			BufferedReader tempVar(pbr);
			line = (&tempVar)->readLine();
			if (line == "")
			{ // end_of_stream
				if (!a2->unifyInt((-1), engine->trail))
				{
					return engine->fail();
				}
				return cont;
			}
			chars = line.toCharArray();
			t = Prolog::Nil;
			for (int i = chars.size(); i > 0; i--)
			{
				if (!Character::isDefined(static_cast<int>(chars[i - 1])))
				{
					throw RepresentationException(thiz, 0, "character");
				}
				t = CONS(Integer(chars[i - 1]), t);
			}
			if (!a2->unify(t, engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		catch (const IOException &e)
		{
			throw TermException(TermData::FFIObject(e));
		}
	}

	void bootpreds::cleanPendingWhiteSpace(PushbackReader *pbr) throw(IOException)
	{
		while (pbr->ready())
		{
			int curr = static_cast<char>(pbr->read());
			if (curr != 13 && curr != 10 && curr != 0)
			{
				pbr->unread(1);
				return;
			}
		}
	}

	Operation bootpreds::PRED_$read_token0_3_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		StringBuilder *s;
		int type;
		Term *token;
		// S_or_a
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		// read token
		s = new StringBuilder();
		try
		{
			type = Token::read_token(s, stream);
			switch (type)
			{
			case Token::TOKEN_INTEGER:
				token = optional<int>(static_cast<Integer>(s->toString()));
				break;
			case Token::TOKEN_LONG:
				token = new LongTerm(static_cast<long long>(s->toString()));
				break;
			case Token::TOKEN_DOUBLE:
				token = new DoubleTerm(static_cast<Double>(s->toString()));
				break;
			case 'S':
			{
				std::vector<char> chars = (s->toString()).toCharArray();
				token = Prolog::Nil;
				for (int i = chars.size(); i > 0; i--)
				{
					token = CONS(Integer(chars[i - 1]), token);
				}
				break;
			}
			default:
				token = SymbolTerm::create(s->toString());
				break;
			}
		}
		catch (const runtime_error &e)
		{
			throw JavaException(thiz, 1, e);
		}
		if (!a2->unifyInt((type), engine->trail))
		{
			return engine->fail();
		}
		if (!a3->unify(token, engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_regex_compile_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if (!(a1->isSymbol()))
		{
			throw IllegalTypeException(thiz, 1, "atom", a1);
		}
		Pattern *pattern = Pattern::compile(a1->name(), Pattern::MULTILINE);
		if (!a2->unify(TermData::FFIObject(pattern), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_regex_match_3_static_exec(Prolog *engine)
	{
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		Pattern *pattern = any_cast<Pattern*>(a1->object());
		if ((a2->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		if (!(a2->isSymbol()))
		{
			throw IllegalTypeException(thiz, 1, "atom", a2);
		}
		Matcher *matcher = pattern->matcher(a2->name());
		if (!matcher->find())
		{
			return engine->fail();
		}
		engine->AREGS[0] = TermData::FFIObject(matcher);
		engine->AREGS[1] = LARG[2];
		return engine->jtry2(bootpreds::regex_check, bootpreds::regex_next);
	}

	Operation bootpreds::regex_check(Prolog *engine)
	{
		Term *a1 = engine->AREGS[0];
		Term *result = engine->AREGS[1];
		Matcher *matcher = any_cast<Matcher*>(a1->object());
		Term *matches = getMatches(matcher);
		if (matches == Prolog::Nil || !result->unify(matches, engine->trail))
		{
			return engine->fail();
		}
		return engine->cont;
	}

	Operation bootpreds::regex_next(Prolog *engine)
	{
		return engine->trust(bootpreds::regex_empty);
	}

	Operation bootpreds::regex_empty(Prolog *engine)
	{
		Term *a1 = engine->AREGS[0];
		Matcher *matcher = any_cast<Matcher*>(a1->object());
		if (!matcher->find())
		{
			return engine->fail();
		}
		return engine->jtry2(bootpreds::regex_check, bootpreds::regex_next);
	}

	Term *bootpreds::getMatches(Matcher *matcher)
	{
		Term *list = Prolog::Nil;
		for (int i = matcher->groupCount(); i >= 0; i--)
		{
			SymbolTerm *match = SymbolTerm::create(matcher->group(i));
			list = CONS(match, list);
		}
		return list;
	}

	Operation bootpreds::PRED_reverse_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();
		if (a1->isCons() || a1->isNil())
		{
			Term *r = Prolog::Nil;
			while (a1->isCons())
			{
				r = CONS(a1->car(), r);
				a1 = (a1)->cdr();
			}
			if (a1->isNil() && a2->unify(r, engine->trail))
			{
				return cont;
			}
		}
		return engine->fail();
	}

	Operation bootpreds::PRED_$set_exception_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		engine->setException(a1);
		return cont;
	}

	Operation bootpreds::PRED_set_input_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1;
		a1 = LARG[0];
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		engine->setCurrentInput(stream);
		return cont;
	}

	Operation bootpreds::PRED_set_output_1_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		Operation thiz = engine->pred;
		engine->setB0();
		// S_or_a
		PrintWriter *stream = toPrintWriter(engine, thiz, engine->AREGS[0]);
		engine->setCurrentOutput(stream);
		return cont;
	}

SymbolTerm *const bootpreds::CHAR_CONVERSION = SYM("char_conversion");
SymbolTerm *const bootpreds::DEBUG = SYM("debug");
SymbolTerm *const bootpreds::UNKNOWN = SYM("unknown");
SymbolTerm *const bootpreds::DOUBLE_QUOTES = SYM("double_quotes");
SymbolTerm *const bootpreds::PRINT_STACK_TRACE = SYM("print_stack_trace");

	Operation bootpreds::PRED_$set_prolog_impl_flag_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		a2 = a2->dref();
		if (a1->equalsTerm(CHAR_CONVERSION))
		{
			if (!(a2->isSymbol()))
			{
				return engine->fail();
			}
			engine->setCharConversion((a2)->name());
		}
		else if (a1->equalsTerm(DEBUG))
		{
			if (!(a2->isSymbol()))
			{
				return engine->fail();
			}
			engine->setDebug((a2)->name());
		}
		else if (a1->equalsTerm(UNKNOWN))
		{
			if (!(a2->isSymbol()))
			{
				return engine->fail();
			}
			engine->setUnknown((a2)->name());
		}
		else if (a1->equalsTerm(DOUBLE_QUOTES))
		{
			if (!(a2->isSymbol()))
			{
				return engine->fail();
			}
			engine->setDoubleQuotes((a2)->name());
		}
		else if (a1->equalsTerm(PRINT_STACK_TRACE))
		{
			if (!(a2->isSymbol()))
			{
				return engine->fail();
			}
			engine->setPrintStackTrace((a2)->name());
		}
		else
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_skip_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		int n;
		// Char
		a2 = a2->dref();
		if ((a2->isVar()))
		{
			throw PInstantiationException(thiz, 2);
		}
		if (!(a2->isInteger()))
		{
			try
			{
				a2 = Arithmetic::evaluate(a2);
			}
			catch (const BuiltinException &e)
			{
				e->goal = thiz;
				e->argNo = 2;
				throw e;
			}
		}
		n = a2->asNumberTerm()->intValue();
		if (!Character::isDefined(n))
		{
			throw RepresentationException(thiz, 2, "character_code");
		}
		// S_or_a
		PushbackReader *stream = toPBReader(engine, thiz, a1);
		// skip
		try
		{
			PushbackReader *in_Renamed = stream;
			int c = in_Renamed->read();
			while (c != n)
			{
				c = in_Renamed->read();
				if (c == -1) // EOF
				{
					return cont;
				}
				if (!Character::isDefined(c))
				{
					throw RepresentationException(thiz, 0, "character");
				}
			}
			return cont;
		}
		catch (const IOException &e)
		{
			throw TermException(TermData::FFIObject(e));
		}
	}

	Operation bootpreds::PRED_sort_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		int len;
		Term *tmp; // , tmp2;
		std::vector<Term*> list;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if (a1->equalsTerm(Prolog::Nil))
		{
			if (!a2->unify(Prolog::Nil, engine->trail))
			{
				return engine->fail();
			}
			return cont;
		}
		else if (!(a1->isCons()))
		{
			throw IllegalTypeException(thiz, 1, "list", a1);
		}
		len = (a1)->length();
		list = std::vector<Term*>(len);
		tmp = a1;
		for (int i = 0; i < len; i++)
		{
			if (!(tmp->isCons()))
			{
				throw IllegalTypeException(thiz, 1, "list", a1);
			}
			list[i] = (tmp)->car()->dref();
			tmp = (tmp)->cdr()->dref();
		}
		if (!tmp->equalsTerm(Prolog::Nil))
		{
			throw PInstantiationException(thiz, 1);
		}
		try
		{
			Arrays::sort(list);
		}
		catch (const ClassCastException &e)
		{
			throw JavaException(thiz, 1, e);
		}
		tmp = Prolog::Nil;
		any tmp2 = nullptr;
		for (int i = list.size() - 1; i >= 0; i--)
		{
			if (!list[i]->equals(tmp2))
			{
				tmp = CONS(list[i], tmp);
			}
			tmp2 = list[i];
		}
		if (!a2->unify(tmp, engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

SymbolTerm *const bootpreds::Nil = Prolog::Nil;
SymbolTerm *const bootpreds::SYM_RUNTIME = SYM("runtime");
SymbolTerm *const bootpreds::SYM_TRAIL = SYM("trail");
SymbolTerm *const bootpreds::SYM_CHOICE = SYM("choice");

	Operation bootpreds::PRED_$statistics_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		Term *result = nullptr;
		a1 = a1->dref();
		if ((a1->isVar()))
		{
			throw PInstantiationException(thiz, 1);
		}
		else if (!(a1->isSymbol()))
		{
			throw IllegalTypeException(thiz, 1, "atom", a1);
		}
		else if (a1->equalsTerm(SYM_RUNTIME))
		{
			engine->requireFeature(Prolog::Feature::STATISTICS_RUNTIME, thiz, a1);
			long long val1, val2;
			Term *start, *previous;
			val1 = System::currentTimeMillis() - engine->getStartRuntime();
			val2 = val1 - engine->getPreviousRuntime();
			engine->setPreviousRuntime(val1);
			start = optional<int>(static_cast<int>(val1));
			previous = optional<int>(static_cast<int>(val2));
			result = CONS(start, CONS(previous, Nil));
		}
		else if (a1->equalsTerm(SYM_TRAIL))
		{
			int top, max;
			Term *free, *used;
			top = engine->trail->top();
			max = engine->trail->max();
			used = optional<int>(top);
			free = optional<int>(max - top);
			result = CONS(used, CONS(free, Nil));
		}
		else if (a1->equalsTerm(SYM_CHOICE))
		{
			int top, max;
			Term *free, *used;
			top = engine->stack->top();
			max = engine->stack->max();
			used = optional<int>(top);
			free = optional<int>(max - top);
			result = CONS(used, CONS(free, Nil));
		}
		else
		{
			return engine->fail();
		}
		if (!a2->unify(result, engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_tab_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a2;
		a2 = LARG[1];
		int n;
		// String s = "";
		// Char
		a2 = a2->dref();
		if ((a2->isVar()))
		{
			throw PInstantiationException(thiz, 2);
		}
		if (!(a2->isInteger()))
		{
			try
			{
				a2 = Arithmetic::evaluate(a2);
			}
			catch (const BuiltinException &e)
			{
				e->goal = thiz;
				e->argNo = 2;
				throw e;
			}
		}
		n = a2->asNumberTerm()->intValue();
		// S_or_a
		PrintWriter *stream = toPrintWriter(engine, thiz, engine->AREGS[0]);
		// tab
		for (int i = 0; i < n; i++)
		{
			// s.append(" ");
			stream->print(" ");
		}
		return cont;
	}

	Operation bootpreds::PRED_$term_hash_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		if (!a2->unifyInt((a1->termHashCode()), engine->trail))
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_$univ_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		a1 = a1->dref();
		if ((a1->isSymbol()) || (a1->isNumber()) || (a1->isFFIObject()) || (a1->isClosure()))
		{
			if (!a2->unify(CONS(a1, Nil), engine->trail))
			{
				return engine->fail();
			}
		}
		else if ((a1->isCons()))
		{
			Term *t = CONS(a1->cdr(), Nil);
			t = CONS(a1->car(), t);
			t = CONS(SYM_DOT, t);
			if (!a2->unify(t, engine->trail))
			{
				return engine->fail();
			}
		}
		else if ((a1->isStructure()))
		{
			SymbolTerm *sym = SymbolTerm::create(a1->functor()->name());
			std::vector<Term*> args = a1->args();
			Term *t = Nil;
			for (int i = args.size(); i > 0; i--)
			{
				t = CONS(args[i - 1], t);
			}
			if (!a2->unify(CONS(sym, t), engine->trail))
			{
				return engine->fail();
			}
		}
		else if ((a1->isVar()))
		{
			a2 = a2->dref();
			if ((a2->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			else if (a2->isNil())
			{
				throw IllegalDomainException(thiz, 2, "non_empty_list", a2);
			}
			else if (!(a2->isCons()))
			{
				throw IllegalTypeException(thiz, 2, "list", a2);
			}
			Term *head = (a2)->car()->dref();
			Term *tail = (a2)->cdr()->dref();
			if ((head->isVar()))
			{
				throw PInstantiationException(thiz, 2);
			}
			if (tail->isNil())
			{
				if ((head->isSymbol()) || (head->isNumber()) || (head->isFFIObject()) || (head->isClosure()))
				{
					if (!a1->unify(head, engine->trail))
					{
						return engine->fail();
					}
					return cont;
				}
				else
				{
					throw IllegalTypeException(thiz, 2, "atomic", head);
				}
			}
			if (!(head->isSymbol()))
			{
				throw IllegalTypeException(thiz, 2, "atom", head);
			}
			Term *x = tail;
			while (!x->isNil())
			{
				if ((x->isVar()))
				{
					throw PInstantiationException(thiz, 2);
				}
				if (!(x->isCons()))
				{
					throw IllegalTypeException(thiz, 2, "list", a2);
				}
				x = (x)->cdr()->dref();
			}
			int n = (a2)->length() - 1;
			SymbolTerm *sym = SymbolTerm::create((head)->name(), n);
			std::vector<Term*> args(n);
			for (int i = 0; i < n; i++)
			{
				args[i] = (tail)->car()->dref();
				tail = (tail)->cdr()->dref();
			}
			Term *t = nullptr;
			if (SYM_DOT->equalsTerm(head))
			{
				if (n != 2)
				{
					throw IllegalDomainException(thiz, 2, "['.',head,tail]", a2);
				}
				t = CONS(args[0], args[1]);
			}
			else
			{
				t = C(sym, args);
			}
			if (!a1->unify(t, engine->trail))
			{
				return engine->fail();
			}
		}
		else
		{
			return engine->fail();
		}
		return cont;
	}

	Operation bootpreds::PRED_write_domain_definitions_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();
		// input check
		// a1 is output directory
		if (!(a1->isSymbol()))
		{
			throw IllegalTypeException(thiz, 1, "atom", a1);
		}
		// a2 is a list of domain definitions in form package:name =
		// (aaa;bbb*;ccc(ddd,eee))
		if (!a2->isNil() && !(a2->isCons()))
		{
			throw IllegalTypeException(thiz, 2, "list", a2);
		}
		// process domain definitions
		wstring packageName = "";
		Properties *p = new Properties();
		Term *lt = a2;
		while (!lt->isNil())
		{
			Term *t = (lt)->car();
			lt = (lt)->cdr();
			if (!(t->isStructure()) || "=" != t->name() || t->arity() != 2)
			{
				throw IllegalDomainException(thiz, 2, "package:name = (aaa;bbb*;ccc(ddd,eee))", t);
			}
			Term *packageAndName = t->arg0(0);
			if (!(packageAndName->isStructure()) || ":" != packageAndName->name() || packageAndName->arity() != 2)
			{
				throw IllegalDomainException(thiz, 2, "package:name = (aaa;bbb*;ccc(ddd,eee))", t);
			}
			Term *packageTerm = packageAndName->arg0(0);
			if (packageName == "")
			{
				packageName = packageTerm->name();
			}
			else if (packageName != packageTerm->name())
			{
				throw IllegalDomainException(thiz, 2, "same package in every list item", a2);
			}
			Term *name = packageAndName->arg0(1);
			Term *definition = t->arg0(1);
			StringBuilder *sb = new StringBuilder();
			Term *d = definition;
			while (";" == d->name())
			{
				sb->append(d->arg0(0)->toAtomName())->append(';');
				d = d->arg0(1);
			}
			sb->append(d->toAtomName());
			p->put(name->name(), sb->toString());
		}
		if (packageName != "" && !p->isEmpty())
		{
			writeDomainDefinitions(a1->name(), packageName, p);
		}
		return cont;
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	void bootpreds::writeDomainDefinitions(const wstring &folder, const wstring &packageName, Properties *domains)
	{
		if (folder == "" || "" == folder)
		{
			folder = ".";
		}
		File *dir = new File(folder, StringHelper::replace(packageName, '.', FileSystem::preferredSeparator()));
		File *file = new File(dir, "domain.properties");
		Properties *p = new Properties();
		if (file->exists())
		{
			// read the file first
			FileInputStream *in_Renamed = nullptr;
			try
			{
				in_Renamed = new FileInputStream(file);
				p->load(in_Renamed);
			}
			catch (const IOException &e)
			{
				throw JavaException(e);
			}
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to the exception 'finally' clause:
			finally
			{
				if (in_Renamed != nullptr)
				{
					try
					{
						in_Renamed->close();
					}
					catch (const IOException &e)
					{
						// ignore since we can do nothing about it
					}
				}
			}
		}
		p->putAll(domains);
		FileOutputStream *out = nullptr;
		try
		{
			out = new FileOutputStream(file);
			p->store(out, "");
		}
		catch (const IOException &e)
		{
			throw JavaException(e);
		}
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to the exception 'finally' clause:
		finally
		{
			if (out != nullptr)
			{
				try
				{
					out->close();
				}
				catch (const IOException &e)
				{
					// ignore since we can do nothing about it
				}
			}
		}
	}

	Operation bootpreds::PRED_$write_toString_2_static_exec(Prolog *engine)
	{
		Operation cont = engine->cont;
		std::vector<Term*> LARG = engine->AREGS;
		Operation thiz = engine->pred;
		engine->setB0();
		Term *a2;
		a2 = LARG[1];
		// S_or_a
		PrintWriter *stream = toPrintWriter(engine, thiz, engine->AREGS[0]);
		a2 = a2->dref();
		if (!(a2->isFFIObject()))
		{
			throw IllegalTypeException(thiz, 2, "java", a2);
		}
		// print java
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		stream->print((a2)->object().toString());
		return cont;
	}

	void bootpreds::loadFile()
	{
		// PredTable.register("assert",2,PRED_assert_2(null,null,null));
		// PredTable.register("asserta",2,PRED_asserta_2(null,null,null));
		// PredTable.register("assertz",2,PRED_assertz_2(null,null,null));
		// PredTable.register("erase",1,PRED_erase(null,null));
		// PredTable.register("db_assert",2,PRED_db_assert_2(null,null,null));
		// PredTable.register("db_asserta",2,PRED_db_asserta_2(null,null,null));
		// PredTable.register("db_assertz",2,PRED_db_assertz_2(null,null,null));
		// PredTable.register("db_retract",2,PRED_db_retract_2(null,null,null));
		// PredTable.register("db_retractall",2,PRED_db_retractall_2(null,null,null));
		// PredTable.register("db_save","save",2,PRED_db_save_2(null,null,null));
		PredTable::registerBuiltin("$atom_type0", 2, bootpreds::PRED_$atom_type0_2_static_exec);
		PredTable::registerBuiltin("$begin_exception", 1, PRED_$begin_exception_1::static_exec);
		PredTable::registerBuiltin("$begin_sync", 2, PRED_$begin_sync_2::static_exec);
		PredTable::registerBuiltin("$call", 2, bootpreds::PRED_$call_2_static_exec);
		PredTable::registerBuiltin("$call_closure", 1, bootpreds::PRED_$call_closure_1_static_exec);
		PredTable::registerBuiltin("$cut", 1, bootpreds::PRED_$cut_1_static_exec);
		PredTable::registerBuiltin("$end_exception", 1, bootpreds::PRED_$end_exception_1_static_exec);
		PredTable::registerBuiltin("$end_sync", 1, bootpreds::PRED_$end_sync_1_static_exec);
		PredTable::registerBuiltin("$erase", 1, bootpreds::PRED_$erase_1_static_exec);
		PredTable::registerBuiltin("$fast_write", 1, bootpreds::PRED_$fast_write_1_static_exec);
		PredTable::registerBuiltin("$fast_write", 2, bootpreds::PRED_$fast_write_2_static_exec);
		PredTable::registerBuiltin("$fast_writeq", 1, bootpreds::PRED_$fast_writeq_1_static_exec);
		PredTable::registerBuiltin("$fast_writeq", 2, bootpreds::PRED_$fast_writeq_2_static_exec);
		PredTable::registerBuiltin("$get_current_B", 1, bootpreds::PRED_$get_current_B_1_static_exec);
		PredTable::registerBuiltin("$get_exception", 1, bootpreds::PRED_$get_exception_1_static_exec);
		PredTable::registerBuiltin("$get_hash_manager", 1, bootpreds::PRED_$get_hash_manager_1_static_exec);
		PredTable::registerBuiltin("$get_instances", 2, bootpreds::PRED_$get_instances_2_static_exec);
		PredTable::registerBuiltin("$get_level", 1, bootpreds::PRED_$get_level_1_static_exec);
		PredTable::registerBuiltin("$get_prolog_impl_flag", 2, bootpreds::PRED_$get_prolog_impl_flag_2_static_exec);
		PredTable::registerBuiltin("$get_stream_manager", 1, bootpreds::PRED_$get_stream_manager_1_static_exec);
		PredTable::registerBuiltin("$hash_adda", 3, bootpreds::PRED_$hash_adda_3_static_exec);
		PredTable::registerBuiltin("$hash_addz", 3, bootpreds::PRED_$hash_addz_3_static_exec);
		PredTable::registerBuiltin("$hash_remove_first", 3, bootpreds::PRED_$hash_remove_first_3_static_exec);
		PredTable::registerBuiltin("$insert", 2, bootpreds::PRED_$insert_2_static_exec);
		PredTable::registerBuiltin("$neck_cut", 0, bootpreds::PRED_$neck_cut_0_static_exec);
		PredTable::registerBuiltin("$print_stack_trace", 1, bootpreds::PRED_$print_stack_trace_1_static_exec);
		PredTable::registerBuiltin("$read_token0", 3, bootpreds::PRED_$read_token0_3_static_exec);
		PredTable::registerBuiltin("$set_exception", 1, bootpreds::PRED_$set_exception_1_static_exec);
		PredTable::registerBuiltin("$set_prolog_impl_flag", 2, bootpreds::PRED_$set_prolog_impl_flag_2_static_exec);
		PredTable::registerBuiltin("$statistics", 2, bootpreds::PRED_$statistics_2_static_exec);
		PredTable::registerBuiltin("$term_hash", 2, bootpreds::PRED_$term_hash_2_static_exec);
		PredTable::registerBuiltin("$univ", 2, bootpreds::PRED_$univ_2_static_exec);
		PredTable::registerBuiltin("$write_toString", 2, bootpreds::PRED_$write_toString_2_static_exec);
		PredTable::registerBuiltin("arg", 3, bootpreds::PRED_arg_3_static_exec);
		PredTable::registerBuiltin("atom_chars", 2, bootpreds::PRED_atom_chars_2_static_exec);
		PredTable::registerBuiltin("atom_codes", 2, bootpreds::PRED_atom_codes_2_static_exec);
		PredTable::registerBuiltin("atom_concat", 3, bootpreds::PRED_atom_concat_3_static_exec);
		PredTable::registerBuiltin("atom_length", 2, bootpreds::PRED_atom_length_2_static_exec);
		PredTable::registerBuiltin("char_code", 2, bootpreds::PRED_char_code_2_static_exec);
		PredTable::registerBuiltin("close", 2, bootpreds::PRED_close_2_static_exec);
		PredTable::registerBuiltin("current_engine", 1, bootpreds::PRED_current_engine_1_static_exec);
		PredTable::registerBuiltin("current_input", 1, bootpreds::PRED_current_input_1_static_exec);
		PredTable::registerBuiltin("current_output", 1, bootpreds::PRED_current_output_1_static_exec);
		PredTable::registerBuiltin("flush_output", 1, bootpreds::PRED_flush_output_1_static_exec);
		PredTable::registerBuiltin("functor", 3, bootpreds::PRED_functor_3_static_exec);
		PredTable::registerBuiltin("get", 2, bootpreds::PRED_get_2_static_exec);
		PredTable::registerBuiltin("get_byte", 2, bootpreds::PRED_get_byte_2_static_exec);
		PredTable::registerBuiltin("get_char", 2, bootpreds::PRED_get_char_2_static_exec);
		PredTable::registerBuiltin("get_code", 2, bootpreds::PRED_get_code_2_static_exec);
		PredTable::registerBuiltin("halt", 1, bootpreds::PRED_halt_1_static_exec);
		PredTable::registerBuiltin("hash_clear", 1, bootpreds::PRED_hash_clear_1_static_exec);
		PredTable::registerBuiltin("hash_contains_key", 2, bootpreds::PRED_hash_contains_key_2_static_exec);
		PredTable::registerBuiltin("hash_get", 3, bootpreds::PRED_hash_get_3_static_exec);
		PredTable::registerBuiltin("hash_is_empty", 1, bootpreds::PRED_hash_is_empty_1_static_exec);
		PredTable::registerBuiltin("hash_keys", 2, bootpreds::PRED_hash_keys_2_static_exec);
		PredTable::registerBuiltin("hash_put", 3, bootpreds::PRED_hash_put_3_static_exec);
		PredTable::registerBuiltin("hash_remove", 2, bootpreds::PRED_hash_remove_2_static_exec);
		PredTable::registerBuiltin("hash_size", 2, bootpreds::PRED_hash_size_2_static_exec);
		PredTable::registerBuiltin("java_constructor0", 2, bootpreds::PRED_java_constructor0_2_static_exec);
		PredTable::registerBuiltin("java_conversion", 2, bootpreds::PRED_java_conversion_2_static_exec);
		PredTable::registerBuiltin("java_declared_constructor0", 2, bootpreds::PRED_java_declared_constructor0_2_static_exec);
		PredTable::registerBuiltin("java_declared_method0", 3, bootpreds::PRED_java_declared_method0_3_static_exec);
		PredTable::registerBuiltin("java_get_declared_field0", 3, bootpreds::PRED_java_get_declared_field0_3_static_exec);
		PredTable::registerBuiltin("java_get_field0", 3, bootpreds::PRED_java_get_field0_3_static_exec);
		PredTable::registerBuiltin("java_method0", 3, bootpreds::PRED_java_method0_3_static_exec);
		PredTable::registerBuiltin("java_set_declared_field0", 3, bootpreds::PRED_java_set_declared_field0_3_static_exec);
		PredTable::registerBuiltin("java_set_field0", 3, bootpreds::PRED_java_set_field0_3_static_exec);
		PredTable::registerBuiltin("keysort", 2, bootpreds::PRED_keysort_2_static_exec);
		PredTable::registerBuiltin("log", 2, bootpreds::PRED_log_2_static_exec);
		PredTable::registerBuiltin("log", 3, bootpreds::PRED_log_3_static_exec);
		PredTable::registerBuiltin("log", 4, bootpreds::PRED_log_4_static_exec);
		PredTable::registerBuiltin("log", 5, bootpreds::PRED_log_5_static_exec);
		PredTable::registerBuiltin("log", 6, bootpreds::PRED_log_6_static_exec);
		PredTable::registerBuiltin("log", 7, bootpreds::PRED_log_7_static_exec);
		PredTable::registerBuiltin("log_error", 2, bootpreds::PRED_log_error_2_static_exec);
		PredTable::registerBuiltin("log_level", 1, bootpreds::PRED_log_level_1_static_exec);
		PredTable::registerBuiltin("loggable", 1, bootpreds::PRED_loggable_1_static_exec);
		PredTable::registerBuiltin("new_hash", 2, bootpreds::PRED_new_hash_2_static_exec);
		PredTable::registerBuiltin("nl", 0, bootpreds::PRED_nl_0_static_exec_bootpred);
		PredTable::registerBuiltin("number_chars", 2, bootpreds::PRED_number_chars_2_static_exec);
		PredTable::registerBuiltin("number_codes", 2, bootpreds::PRED_number_codes_2_static_exec);
		PredTable::registerBuiltin("open", 4, bootpreds::PRED_open_4_static_exec);
		PredTable::registerBuiltin("peek_byte", 2, bootpreds::PRED_peek_byte_2_static_exec);
		PredTable::registerBuiltin("peek_char", 2, bootpreds::PRED_peek_char_2_static_exec);
		PredTable::registerBuiltin("peek_code", 2, bootpreds::PRED_peek_code_2_static_exec);
		PredTable::registerBuiltin("put_byte", 2, bootpreds::PRED_put_byte_2_static_exec);
		PredTable::registerBuiltin("put_char", 2, bootpreds::PRED_put_char_2_static_exec);
		PredTable::registerBuiltin("put_code", 2, bootpreds::PRED_put_code_2_static_exec);
		PredTable::registerBuiltin("raise_exception", 1, bootpreds::PRED_raise_exception_1_static_exec);
		PredTable::registerBuiltin("read_line", 2, bootpreds::PRED_read_line_2_static_exec);
		PredTable::registerBuiltin("regex_compile", 2, bootpreds::PRED_regex_compile_2_static_exec);
		PredTable::registerBuiltin("regex_match", 3, bootpreds::PRED_regex_match_3_static_exec);
		PredTable::registerBuiltin("set_input", 1, bootpreds::PRED_set_input_1_static_exec);
		PredTable::registerBuiltin("set_output", 1, bootpreds::PRED_set_output_1_static_exec);
		PredTable::registerBuiltin("skip", 2, bootpreds::PRED_skip_2_static_exec);
		PredTable::registerBuiltin("sort", 2, bootpreds::PRED_sort_2_static_exec);
		PredTable::registerBuiltin("tab", 2, bootpreds::PRED_tab_2_static_exec);
		PredTable::registerBuiltin("write_domain_definitions", 2, bootpreds::PRED_write_domain_definitions_2_static_exec);
		// PredTable.register("$current_operator", "$current_operator", 3,
		// bootpreds::PRED_$current_operator_3.class);
	}
}
