using namespace std;

#include "PRED_open_4.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../exceptions/SxxMachine/PermissionException.h"
#include "../../../exceptions/SxxMachine/ExistenceException.h"
#include "../../../machine/SxxMachine/LineNumberPushbackReader.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "../../../exceptions/SxxMachine/InternalException.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../exceptions/SxxMachine/JavaException.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using LineNumberPushbackReader = SxxMachine::LineNumberPushbackReader;
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using Undoable = SxxMachine::Undoable;
	using VariableTerm = SxxMachine::VariableTerm;
	using ExistenceException = SxxMachine::ExistenceException;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using InternalException = SxxMachine::InternalException;
	using JavaException = SxxMachine::JavaException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using PermissionException = SxxMachine::PermissionException;
SxxMachine::SymbolTerm *const PRED_open_4::SYM_TEXT = SxxMachine::SymbolTerm::intern("text");
SxxMachine::SymbolTerm *const PRED_open_4::SYM_READ = SxxMachine::SymbolTerm::intern("read");
SxxMachine::SymbolTerm *const PRED_open_4::SYM_WRITE = SxxMachine::SymbolTerm::intern("write");
SxxMachine::SymbolTerm *const PRED_open_4::SYM_APPEND = SxxMachine::SymbolTerm::intern("append");
SxxMachine::SymbolTerm *const PRED_open_4::SYM_INPUT = SxxMachine::SymbolTerm::intern("input");
SxxMachine::SymbolTerm *const PRED_open_4::SYM_OUTPUT = SxxMachine::SymbolTerm::intern("output");
SxxMachine::SymbolTerm *const PRED_open_4::SYM_ALIAS_1 = SxxMachine::SymbolTerm::intern("alias", 1);
SxxMachine::SymbolTerm *const PRED_open_4::SYM_MODE_1 = SxxMachine::SymbolTerm::intern("mode", 1);
SxxMachine::SymbolTerm *const PRED_open_4::SYM_TYPE_1 = SxxMachine::SymbolTerm::intern("type", 1);
SxxMachine::SymbolTerm *const PRED_open_4::SYM_FILE_NAME_1 = SxxMachine::SymbolTerm::intern("file_name", 1);
SxxMachine::SymbolTerm *const PRED_open_4::SYM_CHARSET = SxxMachine::SymbolTerm::intern("charset", 1);
SxxMachine::SymbolTerm *const PRED_open_4::SYM_AUTOCLOSE = SxxMachine::SymbolTerm::intern("autoclose", 1);

	PRED_open_4::PRED_open_4(Term *a1, Term *a2, Term *a3, Term *a4, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		LARG[2] = a3;
		LARG[3] = a4;
		this->cont = cont;
	}

	Operation PRED_open_4::exec(Prolog *engine)
	{
		engine->requireFeature(Prolog::Feature::IO, this, LARG[0]);
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
		if (!(dynamic_cast<VariableTerm*>(a3) != nullptr))
		{
			throw IllegalTypeException(this, 3, "variable", a3);
		}
		// source_sink
		a1 = a1->dref();
		if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
		{
			throw PInstantiationException(this, 1);
		}
		if ((dynamic_cast<SymbolTerm*>(a1) != nullptr))
		{
			file = new File(a1->asSymbolTerm()->name());
		}
		else if ((dynamic_cast<StructureTerm*>(a1) != nullptr) && ":" == a1->name() && 2 == a1->arity())
		{
			Term *pkg = a1->arg0(0)->dref();
			Term *name = a1->arg0(1)->dref();
			if (!(dynamic_cast<SymbolTerm*>(pkg) != nullptr) || !(dynamic_cast<SymbolTerm*>(name) != nullptr))
			{
				throw IllegalDomainException(this, 1, "source_sink", a1);
			}
			resourceName = '/' + StringHelper::replace(pkg->name(), '.', '/') + StringHelper::toString('/') + name->name();
		}
		else
		{
			throw IllegalDomainException(this, 1, "source_sink", a1);
		}
		// io_mode
		a2 = a2->dref();
		if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
		{
			throw PInstantiationException(this, 2);
		}
		if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{
			throw IllegalTypeException(this, 2, "atom", a2);
		}
		if (resourceName != "" && !a2->equals(SYM_READ))
		{ // writing to resources is prohibited
			throw PermissionException(this, "open", "source_sink", a1, "");
		}

		unordered_map<SymbolTerm*, Term*> options = processOptions(a4->dref());
		Charset *charset = Charset::defaultCharset();
		if (options.find(SYM_CHARSET) != options.end())
		{
			Term *charsetOption = options[SYM_CHARSET];
			if (charsetOption->arity() != 1 || !(dynamic_cast<SymbolTerm*>(charsetOption->arg0(0)) != nullptr))
			{
				throw IllegalDomainException(this, 4, "stream_option", charsetOption);
			}
			wstring charsetName = charsetOption->arg0(0)->dref()->name();
			charset = Charset::forName(charsetName);
		}
		try
		{
			if (a2->equals(SYM_READ))
			{
				InputStream *inputStream = nullptr;
				if (resourceName != "")
				{
					inputStream = PRED_open_4::typeid->getResourceAsStream(resourceName);
				}
				else if (file->exists())
				{
					inputStream = new FileInputStream(file);
				}
				if (inputStream == nullptr)
				{
					throw ExistenceException(this, 1, "source_sink", a1, "");
				}
				BufferedReader tempVar(new InputStreamReader(inputStream, charset));
				PushbackReader *in_Renamed = new LineNumberPushbackReader(&tempVar, Prolog::PUSHBACK_SIZE);
				streamObject = new FFIObjectTerm(in_Renamed);
				opts = TermData::CONS(SYM_INPUT, opts);
			}
			else if (a2->equals(SYM_WRITE))
			{
				File *parentFile = file->getParentFile();
				if (parentFile != nullptr)
				{
					parentFile->mkdirs();
				}
				BufferedWriter tempVar2(new OutputStreamWriter(new FileOutputStream(file, false),charset));
				PrintWriter *out = new PrintWriter(&tempVar2);
				streamObject = new FFIObjectTerm(out);
				opts = TermData::CONS(SYM_OUTPUT, opts);
			}
			else if (a2->equals(SYM_APPEND))
			{
				File *parentFile = file->getParentFile();
				if (parentFile != nullptr)
				{
					parentFile->mkdirs();
				}
				BufferedWriter tempVar3(new OutputStreamWriter(new FileOutputStream(file, true),charset));
				PrintWriter *out = new PrintWriter(&tempVar3);
				streamObject = new FFIObjectTerm(out);
				opts = TermData::CONS(SYM_OUTPUT, opts);
			}
			else
			{
				throw IllegalDomainException(this, 2, "io_mode", a2);
			}
		}
		catch (const IOException &e)
		{
			throw PermissionException(this, "open", "source_sink", a1, "");
		}
		if (engine->getStreamManager()->containsKey(streamObject))
		{
			throw InternalException("stream object is duplicated");
		}
		// stream_options
		if (options.find(SYM_ALIAS_1) != options.end())
		{
			Term *aliasOption = options[SYM_ALIAS_1];
			if (aliasOption->arity() != 1 || !(dynamic_cast<SymbolTerm*>(aliasOption->arg0(0)) != nullptr))
			{
				throw IllegalDomainException(this, 4, "stream_option", aliasOption);
			}
			alias = aliasOption->arg0(0)->dref();
			if (engine->getStreamManager()->containsKey(alias))
			{
				throw PermissionException(this, "open", "source_sink", aliasOption, "");
			}
		}


		StructureTerm tempVar4(SYM_TYPE_1, SYM_TEXT);
		opts = TermData::CONS(&tempVar4, opts);
		StructureTerm tempVar5(SYM_MODE_1, a2);
		opts = TermData::CONS(&tempVar5, opts);
		StructureTerm tempVar6(SYM_FILE_NAME_1, file == nullptr?a1:SymbolTerm::create(file->getAbsolutePath()));
		opts = TermData::CONS(&tempVar6, opts);
		if (alias != nullptr)
		{
			engine->getStreamManager()->put(alias, streamObject);
			StructureTerm tempVar7(SYM_ALIAS_1, alias);
			opts = TermData::CONS(&tempVar7, opts);
		}
		a3->asVariableTerm()->bind(streamObject, engine->trail);
		engine->getStreamManager()->put(streamObject, opts);

		if (options.find(SYM_AUTOCLOSE) != options.end())
		{
			Term *autoCloseOption = options[SYM_AUTOCLOSE];
			if (autoCloseOption->arity() != 1 || !(dynamic_cast<SymbolTerm*>(autoCloseOption->arg0(0)) != nullptr))
			{
				throw IllegalDomainException(this, 4, "stream_option", autoCloseOption);
			}
			if ("true" == autoCloseOption->arg0(0)->name())
			{
				CloseHelper tempVar8(engine, streamObject, alias);
				engine->trail->push(&tempVar8);
			}
		}
		return cont;
	}

	unordered_map<SymbolTerm*, Term*> PRED_open_4::processOptions(Term *options)
	{
		unordered_map<SymbolTerm*, Term*> result = unordered_map<SymbolTerm*, Term*>();
		Term *p = options;
		while (!p->isNil())
		{
			// type check
			if ((dynamic_cast<VariableTerm*>(p) != nullptr))
			{
				throw PInstantiationException(this, 4);
			}
			if (!(dynamic_cast<ListTerm*>(p) != nullptr))
			{
				throw IllegalTypeException(this, 4, "list", options);
			}

			Term *option = p->asListTerm()->car()->dref();
			if ((dynamic_cast<VariableTerm*>(option) != nullptr))
			{
				throw PInstantiationException(this, 4);
			}
			if ((dynamic_cast<StructureTerm*>(option) != nullptr))
			{
				Term *functor = (option)->functor();
				result.emplace(static_cast<SymbolTerm*>(functor), option);
			}
			else
			{
				throw IllegalDomainException(this, 4, "stream_option", option);
			}
			p = p->asListTerm()->cdr()->dref();
		}
		return result;
	}

	PRED_open_4::CloseHelper::CloseHelper(Prolog *engine, FFIObjectTerm *streamObject, Term *alias) : engine(engine), streamObject(streamObject), alias(alias)
	{
	}

	void PRED_open_4::CloseHelper::undo()
	{
		engine->getStreamManager()->remove(streamObject);
		if (alias != nullptr)
		{
			engine->getStreamManager()->remove(alias);
		}
		Closeable *closeable = any_cast<Closeable*>(streamObject->object());
		try
		{
			delete closeable;
		}
		catch (const IOException &e)
		{
			throw JavaException(e);
		}
	}
}
