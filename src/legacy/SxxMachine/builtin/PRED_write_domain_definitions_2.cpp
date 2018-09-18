using namespace std;

#include "PRED_write_domain_definitions_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/PrologException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../exceptions/SxxMachine/JavaException.h"

namespace SxxMachine
{
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using JavaException = SxxMachine::JavaException;
	using PrologException = SxxMachine::PrologException;
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using P2 = SxxMachine::Predicate::P2;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;

	PRED_write_domain_definitions_2::PRED_write_domain_definitions_2()
	{
	}

	PRED_write_domain_definitions_2::PRED_write_domain_definitions_2(Term *a0, Term *a1, Operation cont)
	{
		this->LARG[0] = a0; //0];
		this->LARG[1] = a1; //1];
		this->cont = cont;
	}

	Operation PRED_write_domain_definitions_2::exec(Prolog *engine) throw(PrologException)
	{
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();

		// input check
		// a1 is output directory
		if (!(dynamic_cast<SymbolTerm*>(a1) != nullptr))
		{
			throw IllegalTypeException(this, 1, "atom", a1);
		}
		// a2 is a list of domain definitions in form package:name = (aaa;bbb*;ccc(ddd,eee))
		if (!a2->isNil() && !(dynamic_cast<ListTerm*>(a2) != nullptr))
		{
			throw IllegalTypeException(this, 2, "list", a2);
		}
		// process domain definitions
		wstring packageName = "";
		Properties *p = new Properties();
		Term *lt = a2;
		while (!lt->isNil())
		{
			Term *t = lt->asListTerm()->car();
			lt = lt->asListTerm()->cdr();

			if (!(dynamic_cast<StructureTerm*>(t) != nullptr) || "=" != t->name() || t->arity() != 2)
			{
				throw IllegalDomainException(this, 2, "package:name = (aaa;bbb*;ccc(ddd,eee))", t);
			}
			Term *packageAndName = t->arg0(0);
			if (!(dynamic_cast<StructureTerm*>(packageAndName) != nullptr) || ":" != packageAndName->name() || packageAndName->arity() != 2)
			{
				throw IllegalDomainException(this, 2, "package:name = (aaa;bbb*;ccc(ddd,eee))", t);
			}
			Term *packageTerm = packageAndName->arg0(0);
			if (packageName == "")
			{
				packageName = packageTerm->name();
			}
			else if (packageName != packageTerm->name())
			{
				throw IllegalDomainException(this, 2, "same package in every list item", a2);
			}
			Term *name = packageAndName->arg0(1);

			Term *definition = t->arg0(1);
			StringBuilder *sb = new StringBuilder();
			Term *d = definition;
			while (";" == d->name())
			{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
				sb->append(d->arg0(0)->toString())->append(';');
				d = d->arg0(1);
			}
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
			sb->append(d->toString());
			p->put(name->name(), sb->toString());
		}
		if (packageName != "" && !p->isEmpty())
		{
			writeDomainDefinitions(a1->name(), packageName, p);
		}

		return cont;
	}

//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	void PRED_write_domain_definitions_2::writeDomainDefinitions(const wstring &folder, const wstring &packageName, Properties *domains)
	{
		if (folder == "" || "" == folder)
		{
			folder = ".";
		}
		File *dir = new File(folder, StringHelper::replace(packageName, '.',FileSystem::preferredSeparator()));
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
}
