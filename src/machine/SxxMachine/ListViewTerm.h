#pragma once

#include "ListTerm.h"
#include "SystemObject.h"
#include <string>
#include <vector>
#include <any>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Trail;
	class Term;
	class OpVisitor;
	class ListTerm;
}

namespace SxxMachine
{


	/**
	 * List term that allows tail addition to the list without recreating the list.
	 * This class behaves like a view for underlying List instance.
	 */
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("rawtypes") public class ListViewTerm extends ListTerm
	class ListViewTerm : public ListTerm
	{
		// the class is necessary to make ListTerm.isImmutable() to return false

	private:
		class MutableMarkerForLists final : public SystemObject
		{
		public:
			int type() override;

			bool unifyImpl(Term *t, Trail *trail) override;

			bool isImmutable() override;

			std::string name() override;

			void toStringImpl(int printFlags, StringBuilder *sb) override;
			int compareTo(Term *o) override;

			int termHashCodeImpl() override;

			bool equalsTerm(Term *obj, OpVisitor *comparator) override;
		};

	public:
		virtual ~ListViewTerm()
		{
			delete next;
		}

		std::string pprint() override;

		bool isImmutable() override;

	private:
		static Term *const NOT_IMMUTABLE;

		/** the list of terms */
		const std::vector<Term*> list;
		/**
		 * index of element in the {@link SxxMachine.ListViewTerm#list} represented by
		 * this instance
		 */
		const int index;
		/**
		 * holds next {@link SxxMachine.ListViewTerm} instance, the value is lazy
		 * initialized
		 */
		Term *next = nullptr;

		//final Term[] argz;

	public:
		ListViewTerm(Term *head);

	private:
		ListViewTerm(std::vector<Term*> &list, int index);

	public:
		ListTerm *add(Term *term) override;

		Term *cdr() override;

	protected:
		Term *copyImpl(IdentityHashMap<std::any, Term*> *copyHash, int deeply) override;

	public:
		Term *nth0(int nth) override;

		int length() override;

		std::vector toJava() override;

		bool isGround() override;

		Term *car() override;

		void setCar(Term *t) override;

		void setCdr(Term *t) override;

		std::vector<Term*> args() override;

		std::string name() override;

		Term *toClone() throw(CloneNotSupportedException) override;

		int arityOrType() override;
	};

}
