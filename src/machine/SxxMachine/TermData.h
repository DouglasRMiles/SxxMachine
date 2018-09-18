#ifndef TERMDATA
#define TERMDATA

#include "Operation.h"
#include "Predicate.h"
#include <string>
#include <vector>
#include <cmath>
#include <stdexcept>
#include <any>
#include <typeinfo>
#include <mutex>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class ListTerm; }
namespace SxxMachine { class VariableTerm; }
namespace SxxMachine { class Predicate; }
namespace SxxMachine { class LongTerm; }
namespace SxxMachine { class DoubleTerm; }
namespace SxxMachine { class IntegerTerm; }
namespace SxxMachine { class FFIObjectTerm; }
namespace SxxMachine { class ErrorTerm; }
namespace SxxMachine { class NumberTerm; }
namespace SxxMachine { class HashtableOfTerm; }
class StringBuilder;

namespace SxxMachine
{


	class TermData
	{

		/**
		 * @author Administrator
		 *
		 */
	public:
		class StaticPred : public Predicate, public Operation
		{

		public:
			std::string toString() override;

			void toString(StringBuilder* sb) override;

		private:
			Operation static_closure;
			// private String name;

		public:
			int predArity() override;

			std::string predName() override;

			StaticPred(const std::string& functor, Operation object, std::vector<Term*>& va, Operation cont);

			/*
			 * (non-Javadoc)
			 * 
			 * @see SxxMachine.Operation#exec(SxxMachine.Prolog)
			 */
			Operation exec(Prolog* engine) override;

		};

	public:
		static StructureTerm* S(const std::string& string, std::vector<Term> &s3);
		static StructureTerm* S(SymbolTerm* string, std::vector<Term> &s3);

		static StructureTerm* C(const std::string& string, std::vector<Term> &s3);

		static StructureTerm* C(SymbolTerm* string, std::vector<Term> &s3);
		//
		//  private static ListTerm Cons(Term _car, Term _cdr) {
		//    return TermData.CONS( _car, _cdr);
		//    //return new StructureTerm(ListTerm.SYM_DOT, _car, _cdr);
		//  }

		static ListTerm* CONS(Term* _car, Term* _cdr);

		static SymbolTerm* SYM(const std::string& s);

		static SymbolTerm* F(const std::string& s);

		static SymbolTerm* F(const std::string& s, const int& i);

		static VariableTerm* V(Prolog* engine);

		static VariableTerm* V();

		static Predicate* Op(Operation object, std::vector<Term*>& LARG, Operation cont);

		static Predicate* Op(Operation object, Term* a1, Term* a2, Operation cont);

		static Predicate* Op(Operation object, Term* a1, Term* a2, Term* a3, Operation cont);

		static Predicate* Op(Operation object, Term* a1, Operation cont);
		static LongTerm* Long(const std::string& s);
		static LongTerm* Long(long long t);

		static DoubleTerm* Float(const double& i);

		static constexpr int POS_INT_CACHE = 1024;
		static constexpr int NEG_INT_CACHE = 1024;
		static std::vector<IntegerTerm*> posInts;
		static std::vector<IntegerTerm*> negInts;

		static IntegerTerm* Integer(const int& i);

		static std::vector<Term*> VA(std::vector<Term> &array_RenamedTODO);

		static Term* Closure(Operation _op);

		static FFIObjectTerm* FFIObject(std::any _obj);

		static ErrorTerm* createErrorTerm(std::runtime_error error, Term* _functor, std::vector<Term> &_args);

		static ListTerm* LIST(Term* a1, std::vector<Term> &items);

		static bool isQuoted(const int& printingFlags);

		static Term* AND(Term* a1, Term* a2);

		/**
		 * @param r
		 * @return
		 */
		static NumberTerm* NarrowDouble(const double& r);

		static HashtableOfTerm* asHashtableOfTerm(std::any hash);

		static ErrorTerm* asErrorTerm(Term* a2);

	};

}


#endif	//#ifndef TERMDATA
