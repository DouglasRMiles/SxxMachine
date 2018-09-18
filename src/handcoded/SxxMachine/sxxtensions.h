#pragma once

#include "../../machine/SxxMachine/TermData.h"
#include "../../machine/SxxMachine/Undoable.h"
#include "../../machine/SxxMachine/StructureTerm.h"
#include <any>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Prolog;
	class Term;
	class VariableTerm;
}

namespace SxxMachine
{


	class sxxtensions : public TermData
	{
	public:
		static Operation PRED_string_1_static_exec(Prolog *e);

		static Operation PRED_string_codes_2_static_exec(Prolog *e);

		static Operation PRED_prolog_load_context_2_static_exec(Prolog *e);

		static Operation PRED_phrase_2_static_exec(Prolog *e);

		static Operation PRED_phrase_3_static_exec(Prolog *e);

		static Operation PRED_predicate_property_2_static_exec(Prolog *e);

		static Operation PRED_memberchk_2_static_exec(Prolog *e);

		static Operation PRED_setup_call_cleanup_3_static_exec(Prolog *e);

		static Operation PRED_succ_2_static_exec(Prolog *e);

		static Operation PRED_recorda_3_static_exec(Prolog *e);

		static Operation PRED_recorded_3_static_exec(Prolog *e);

		static Operation PRED_erase1_static_exec(Prolog *e);

		static Operation PRED_clause_property_2_static_exec(Prolog *e);

		static Operation PRED_$skip_list_3_static_exec(Prolog *e);

		static Operation PRED_absolute_file_name_3_static_exec(Prolog *e);

		static Operation PRED_pairs_keys_2_static_exec(Prolog *e);

		static Operation PRED_sort_4_static_exec(Prolog *e);

		static Operation PRED_$set_predicate_attribute_3_static_exec(Prolog *e);

		static Operation PRED_debug_3_static_exec(Prolog *e);

		static Operation PRED_$atom_completions_2_static_exec(Prolog *e);

		static Operation PRED_expand_file_name_2_static_exec(Prolog *e);

		static Operation PRED_forall_2_static_exec(Prolog *e);

		static Operation PRED_number_3_static_exec(Prolog *e);

		static Operation PRED_unify_3_static_exec(Prolog *e);

		static Operation PRED_code_type_2_static_exec(Prolog *e);

		static Operation PRED_read_string_5_static_exec(Prolog *e);

		static Operation PRED_option_3_static_exec(Prolog *e);

		static Operation PRED_assert_2_static_exec(Prolog *e);

		static Operation PRED_time_1_static_exec(Prolog *e);

		static Operation PRED_garbage_collect_0_static_exec(Prolog *e);

		static Operation PRED_compile_predicates_1_static_exec(Prolog *e);

		static Operation PRED_f2_pos_6_static_exec(Prolog *e);

		static Operation PRED_type_error_2_static_exec(Prolog *e);

		static Operation PRED_compile_aux_clauses_1_static_exec(Prolog *e);

		static Operation PRED_$expand_closure_3_static_exec(Prolog *e);

		static Operation PRED_style_check_1_static_exec(Prolog *e);

		static Operation PRED_erase_1_static_exec(Prolog *e);

		static Operation PRED_must_be_2_static_exec(Prolog *e);

		static Operation PRED_format_1_static_exec(Prolog *e);

		static Operation PRED_format_2_static_exec(Prolog *e);

		static Operation PRED_format_3_static_exec(Prolog *e);

		static Operation PRED_compound_name_arity_3_static_exec(Prolog *e);

		static Operation PRED_compound_name_arguments_3_static_exec(Prolog *e);

		static Operation PRED_load_foreign_library_1_static_exec(Prolog *e);

		static Operation PRED_atomic_list_concat_2_static_exec(Prolog *e);

		static Operation PRED_read_term_3_static_exec(Prolog *e);

		virtual Operation PRED_cputime_1_static_exec(Prolog *m);

		static bool DoSetArg3(Prolog *m, Term *arg1, Term *arg2, Term *arg3);

		static bool DoSetArg3_p2(Prolog *m, int i, Term *arg2, Term *arg3);

		static Operation PRED_setarg_3_static_exec(Prolog *m);

		// A = foo(1),setarg(1,A,2)
		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static sxxtensions::StaticConstructor staticConstructor;


		// A = foo(1), findall(A, (nb_setarg(1,A,2) ; true), L), [foo(2),foo(2)] = L.

	public:
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("unused") static boolean NonBacktrackingSetArg(Prolog m, Term arg1, Term arg2, Term arg3)
		static bool NonBacktrackingSetArg(Prolog *m, Term *arg1, Term *arg2, Term *arg3);

		static Operation PRED_nb_setarg_3_static_exec(Prolog *m);

	public:
		class SetArgTrail final : public StructureTerm, public Undoable
		{
		public:
			Term *OldValue;
			VariableTerm *Which;
			Prolog *m;

			virtual ~SetArgTrail()
			{
				delete OldValue;
				delete Which;
				delete m;
			}

			SetArgTrail(Term *old, VariableTerm *changed, Prolog *m);

			void undo() override override;

		};

	public:
		class PopPendingGoals final : public StructureTerm, public Undoable
		{
		public:
			Prolog *m;
			Term *old;

			virtual ~PopPendingGoals()
			{
				delete m;
				delete old;
			}

			PopPendingGoals(Prolog *m, Term *o);

			void undo() override override;

		};

	public:
		class PopAssumptions final : public StructureTerm, public Undoable
		{
		public:
			Prolog *m;
			Term *old;

			virtual ~PopAssumptions()
			{
				delete m;
				delete old;
			}

			PopAssumptions(Prolog *m, Term *o);

			void undo() override override;

		};


	public:
		static Operation PRED_freeze_2_static_exec(Prolog *m);

		static Operation PRED_frozen_2_static_exec(Prolog *m);
		// package TauMachine.builtin;

		// import TauMachine.Operation;
		// import TauMachine.Predicate;
		// import TauMachine.Prolog;
		// import TauMachine.Term;

		static Operation PRED_copy_term_3_static_exec(Prolog *m);

		static Operation PRED_copy_term_nat_2_static_exec(Prolog *m);

		static Operation PRED_copy_term_att_2_static_exec(Prolog *m);

		static Operation PRED_attvar_1_static_exec(Prolog *m);

		static Operation PRED_get_attr_3_static_exec(Prolog *m);

		static Operation PRED_get_attrs_2_static_exec(Prolog *m);

		static Operation PRED_put_attr_3_static_exec(Prolog *m);

		static Operation PRED_put_attrs_2_static_exec(Prolog *m);

		static Operation PRED_peek_pending_1_static_exec(Prolog *const m);

		static Operation PRED_add_pending_1_static_exec(Prolog *const m);

		static Operation PRED_push_pending_1_static_exec(Prolog *const m);

		static Operation PRED_undo_1_static_exec(Prolog *const m);

	private:
		class UndoableAnonymousInnerClass : public Undoable
		{
		private:
			SxxMachine::Prolog *m;
			SxxMachine::Term *a1;

		public:
			virtual ~UndoableAnonymousInnerClass()
			{
				delete m;
				delete a1;
			}

			UndoableAnonymousInnerClass(SxxMachine::Prolog *m, SxxMachine::Term *a1);

			void undo() override;
		};

	public:
		static Operation PRED_assume_1_static_exec(Prolog *m);

		static Operation PRED_allassumed_1_static_exec(Prolog *m);

		static void loadFile();

		static Term *get_attribute_goals(Term *copy, Term *frozen);

		static Term *appendGoals(Term *sofar, Term *goals1);

		static bool isNoGoal(Term *sofar);
	};

}
