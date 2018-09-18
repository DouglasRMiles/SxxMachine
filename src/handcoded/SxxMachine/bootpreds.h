#pragma once

#include "../../machine/SxxMachine/FFIPredicate.h"
#include "../../legacy/SxxMachine/builtin/PRED_$begin_exception_1.h"
#include "../../machine/SxxMachine/BlockPredicate.h"
#include "../../legacy/SxxMachine/builtin/PRED_$begin_sync_2.h"
#include "../../legacy/SxxMachine/builtin/PRED_$builtin_member_2.h"
#include "../../machine/SxxMachine/Predicate.h"
#include "../../legacy/SxxMachine/builtin/PRED_keysort_2.h"
#include "../../machine/SxxMachine/Undoable.h"
#include <string>
#include <unordered_map>
#include <vector>
#include <cctype>
#include <stdexcept>
#include <any>
#include <typeinfo>
#include <optional>
#include <mutex>
#include "exceptionhelper.h"
#include "stringhelper.h"
#include "stringbuilder.h"
#include "tangible_filesystem.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class IntegerTerm;
	class Operation;
	class Prolog;
	class SymbolTerm;
	class PRED_$begin_exception_1;
	class Term;
	class PRED_$begin_sync_2;
	class BuiltinException;
	class IllegalDomainException;
	class PInstantiationException;
	class PermissionException;
	class ExistenceException;
	class FFIObjectTerm;
}

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.TermData.Integer;


//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings({ "rawtypes", "unchecked", "unused", "resource" }) public class bootpreds extends FFIPredicate
	class bootpreds : public FFIPredicate
	{

	public:
		static IntegerTerm *const int_0;
		static IntegerTerm *const int_1;
		static IntegerTerm *const int_2;
		static IntegerTerm *const int_3;
		static IntegerTerm *const int_4;
		static IntegerTerm *const int_5;
		static IntegerTerm *const int_6;
		static IntegerTerm *const int_7;
		static IntegerTerm *const int_8;
		static IntegerTerm *const int_9;
		static IntegerTerm *const int_10;
		static IntegerTerm *const int_11;
		static IntegerTerm *const int_12;
		static IntegerTerm *const int_13;
		static IntegerTerm *const int_14;
		static IntegerTerm *const int_15;
		static IntegerTerm *const int_16;
		static IntegerTerm *const int_17;
		static IntegerTerm *const int_18;
		static IntegerTerm *const int_19;
		static IntegerTerm *const int_20;
		static IntegerTerm *const int_21;
		static IntegerTerm *const int_22;
		static IntegerTerm *const int_23;
		static IntegerTerm *const int_24;
		static IntegerTerm *const int_25;
		static IntegerTerm *const int_100;

		static IntegerTerm *const int_neg1;
		static IntegerTerm *const int_neg2;
		static IntegerTerm *const int_neg3;
		static IntegerTerm *const int_neg4;
		static IntegerTerm *const int_neg5;
		static IntegerTerm *const int_neg6;
		static IntegerTerm *const int_neg7;
		static IntegerTerm *const int_neg8;
		static IntegerTerm *const int_neg9;
		static IntegerTerm *const int_neg10;
		static IntegerTerm *const int_neg11;
		static IntegerTerm *const int_neg12;
		static IntegerTerm *const int_neg13;
		static IntegerTerm *const int_neg14;
		static IntegerTerm *const int_neg15;
		static IntegerTerm *const int_neg16;
		static IntegerTerm *const int_neg17;
		static IntegerTerm *const int_neg18;
		static IntegerTerm *const int_neg19;
		static IntegerTerm *const int_neg20;
		static IntegerTerm *const int_neg21;
		/**
		 * <code>arg/3</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _between_3 extends Predicate.P3 {
		static Operation PRED_between_3_static_exec(Prolog *engine);

		/**
		 * <code>arg/3</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _arg_3 extends Predicate.P3 {
		static Operation PRED_arg_3_static_exec(Prolog *engine);

		/**
		 * <code>atom_chars/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _atom_chars_2 extends Predicate.P2 {
		static Operation PRED_atom_chars_2_static_exec(Prolog *engine);

		/**
		 * <code>atom_codes/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _atom_codes_2 extends Predicate.P2 {
		static Operation PRED_atom_codes_2_static_exec(Prolog *engine);

		/**
		 * <code>atom_concat/3</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _atom_concat_3 extends Predicate.P3 {
	private:
		static SymbolTerm *const AC_2;

	public:
		static Operation PRED_atom_concat_3_static_exec(Prolog *engine);

		/**
		 * atomic_concat(+Atomic1, +Atomic2, -Atom) Atom represents the text after
		 * converting Atomic1 and Atomic2 to text and concatenating the result: ?-
		 * atomic_concat(name, 42, X). X = name42. Created by semenov on 27.04.2017.
		 * http://www.swi-SxxMachine.org/pldoc/man?predicate=atomic_concat/3
		 */
		// _atomic_concat_3 extends Predicate.P3 {
		static Operation PRED_atomic_concat_3_static_exec(Prolog *engine);

		/**
		 * <code>atom_lengt/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _atom_length_2 extends Predicate.P2 {
		static Operation PRED_atom_length_2_static_exec(Prolog *engine);

		/**
		 * <code>'$atom_type0'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$atom_type0_2 extends Predicate.P2 {
		static Operation PRED_$atom_type0_2_static_exec(Prolog *engine);

		/**
		 * <code>'$begin_exception'/1</code><br>
		 * 
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.2
		 */
		static Operation PRED_$begin_exception_1_static_exec(Prolog *engine);

	public:
		class PRED_$begin_exception_1 : public BlockPredicate
		{
			/// private final Term arg1;

		public:
			int predArity() override;

			PRED_$begin_exception_1(Term *a1, Operation cont);

			Operation exec(Prolog *engine) override;

			static Operation static_exec(Prolog *engine);
		};

		/**
		 * <code>'$begin_sync'/2</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.2
		 */
	public:
		static Operation PRED_$begin_sync_2_static_exec(Prolog *engine);

	public:
		class PRED_$begin_sync_2 : public BlockPredicate
		{
			/// private final Term arg1, arg2;
		public:
			int predArity() override;

			PRED_$begin_sync_2(Term *a1, Term *a2, Operation cont);

			Operation exec(Prolog *engine) override;

			static Operation static_exec(Prolog *engine);
		};

		/**
		 * '$builtin_member'(X, [X|_]). '$builtin_member'(X, [_|L]) :-
		 * '$builtin_member'(X, L).
		 */

	public:
		class PRED_$builtin_member_2 : public Predicate::P2
		{

		public:
			static Operation static_exec(Prolog *engine);

		private:
			static Operation retry(Prolog *engine);
		};

		/**
		 * '$builtin_member'(X, [X|_]). '$builtin_member'(X, [_|L]) :-
		 * '$builtin_member'(X, L).
		 */
		// _$builtin_member_2 extends Predicate.P2 {
	public:
		static Operation PRED_$builtin_member_2_static_exec(Prolog *engine);

	private:
		static Operation retry_bi_member(Prolog *engine);

		// jlang.reflect.*;
		/**
		 * <code>'$call'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$call_2 extends Predicate.P2 {
		static SymbolTerm *const SYM_SLASH_2;
		static SymbolTerm *const SYM_COLON_2;
		static std::vector<Term*> const NO_ARGS;

	public:
		static Operation PRED_$call_2_static_exec(Prolog *engine);

		/**
		 * <code>'$call_closure'/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$call_closure_1 extends Predicate.P1 {
		static Operation PRED_$call_closure_1_static_exec(Prolog *engine);

		/**
		 * <code>char_code/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _char_code_2 extends Predicate.P2 {
		static Operation PRED_char_code_2_static_exec(Prolog *engine);

		/**
		 * <code>close/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _close_2 extends Predicate.P2 {
		// private static final SymbolTerm SYM_ALIAS_1 = F("alias", 1);
	private:
		static SymbolTerm *const SYM_FORCE_1;
		static SymbolTerm *const SYM_TRUE;
		static SymbolTerm *const SYM_FALSE;

	public:
		static Operation PRED_close_2_static_exec(Prolog *engine);

		// .IntegerTerm;
		// .Operation;
		// .Predicate;
		// .Prolog;
		// .Term;
		// _$compare0_3 extends Predicate.P3 {
		static Operation PRED_$compare0_3_static_exec(Prolog *engine);

		// .IntegerTerm;
		// .Operation;
		// .Predicate;
		// .Prolog;
		// .SymbolTerm;
		// .Term;
		// _$compiled_predicate_3 extends Predicate.P3 {
		static Operation PRED_$compiled_predicate_3_static_exec(Prolog *engine);

		// .IntegerTerm;
		// .Operation;
		// .Predicate;
		// .Prolog;
		// .SymbolTerm;
		// .Term;
		// _$compiled_predicate_or_builtin_3 extends Predicate.P3 {
		static Operation PRED_$compiled_predicate_or_builtin_3_static_exec(Prolog *engine);

		/**
		 * <code>current_engine/1</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _current_engine_1 extends Predicate.P1 {
		static Operation PRED_current_engine_1_static_exec(Prolog *engine);

		/**
		 * <code>current_input/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _current_input_1 extends Predicate.P1 {
		static Operation PRED_current_input_1_static_exec(Prolog *engine);

		/**
		 * <code>current_output/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _current_output_1 extends Predicate.P1 {
		static Operation PRED_current_output_1_static_exec(Prolog *engine);

		/**
		 * <code>'$cut'/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$cut_1 extends Predicate.P1 {
		static Operation PRED_$cut_1_static_exec(Prolog *engine);

		/**
		 * <code>'$end_exception'/1<code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$end_exception_1 extends Predicate.P1 {
		static Operation PRED_$end_exception_1_static_exec(Prolog *engine);

		/**
		 * <code>'$end_sync'/1</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$end_sync_1 extends Predicate.P1 {
		static Operation PRED_$end_sync_1_static_exec(Prolog *engine);

		/**
		 * <code>'$erase'/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _$erase_1 extends Predicate.P1 {
		static Operation PRED_$erase_1_static_exec(Prolog *engine);

		// jio.File;
		/** {@code exists_directory(+Directory)} */
		// _exists_directory_1 extends Predicate.P1 {
		static Operation PRED_exists_directory_1_static_exec(Prolog *engine);

		// jio.File;
		/** {@code exists_file(+File)} */
		// _exists_file_1 extends Predicate.P1 {
		static Operation PRED_exists_file_1_static_exec(Prolog *engine);

		/**
		 * <code>'$fast_write'/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$fast_write_1 extends Predicate.P1 {
		static Operation PRED_$fast_write_1_static_exec(Prolog *engine);

		// jio.PrintWriter;
		/**
		 * <code>'$fast_write'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$fast_write_2 extends Predicate.P2 {
		static Operation PRED_$fast_write_2_static_exec(Prolog *engine);

		/**
		 * <code>'$fast_writeq'/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$fast_writeq_1 extends Predicate.P1 {
		static Operation PRED_$fast_writeq_1_static_exec(Prolog *engine);

		// jio.PrintWriter;
		/**
		 * <code>'$fast_writeq'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$fast_writeq_2 extends Predicate.P2 {
		static Operation PRED_$fast_writeq_2_static_exec(Prolog *engine);

		static PrintWriter *toPrintWriter(Prolog *engine, Operation thiz, Term *a1) throw(BuiltinException);

		// jio.File;
		/** {@code file_directory_name(+File, -Directory)} */
		// _file_directory_name_2 extends Predicate.P2 {
		static Operation PRED_file_directory_name_2_static_exec(Prolog *engine);

		// jio.PrintWriter;
		/**
		 * <code>flush_output/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _flush_output_1 extends Predicate.P1 {
		static Operation PRED_flush_output_1_static_exec(Prolog *engine);

		/**
		 * <code>functor/3</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _functor_3 extends Predicate.P3 {
	private:
		static SymbolTerm *const SYM_DOT;

	public:
		static Operation PRED_functor_3_static_exec(Prolog *engine);

		// jio.*;
		/**
		 * <code>get/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _get_2 extends Predicate.P2 {
		static Operation PRED_get_2_static_exec(Prolog *engine);

		// jio.*;
		/**
		 * <code>get_byte/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 * @since 1.1
		 */
		// _get_byte_2 extends Predicate.P2 {
		static Operation PRED_get_byte_2_static_exec(Prolog *engine);

		/**
		 * @param engine
		 * @param thiz
		 * @param a1
		 * @return
		 * @throws PInstantiationException
		 * @throws ExistenceException
		 * @throws IllegalDomainException
		 * @throws PermissionException
		 */
		static PushbackReader *toPBReader(Prolog *engine, Operation thiz, Term *a1) throw(PInstantiationException, ExistenceException, IllegalDomainException, PermissionException);

		// jio.*;
		/**
		 * <code>get_char/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		//
		static bool inCharacter(Term *t);

		static Operation PRED_get_char_2_static_exec(Prolog *engine);

		// jio.*;
		/**
		 * <code>get_code/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _get_code_2 extends Predicate.P2 {
		static Operation PRED_get_code_2_static_exec(Prolog *engine);

		/**
		 * <code>'$get_current_B'/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$get_current_B_1 extends Predicate.P1 {
		static Operation PRED_$get_current_B_1_static_exec(Prolog *engine);

		/**
		 * <code>'$get_exception'/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$get_exception_1 extends Predicate.P1 {
		static Operation PRED_$get_exception_1_static_exec(Prolog *engine);

		/**
		 * <code>'$get_hash_manager'/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$get_hash_manager_1 extends Predicate.P1 {
		static Operation PRED_$get_hash_manager_1_static_exec(Prolog *engine);

		/**
		 * <code>'$get_instances'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _$get_instances_2 extends Predicate.P2 {
	private:
		static SymbolTerm *const COMMA;

	public:
		static Operation PRED_$get_instances_2_static_exec(Prolog *engine);

		/**
		 * <code>'$get_level'/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$get_level_1 extends Predicate.P1 {
		static Operation PRED_$get_level_1_static_exec(Prolog *engine);

	private:
		static SymbolTerm *const TRUE;
		static SymbolTerm *const FALSE;
		static SymbolTerm *const BOUNDED;
		static SymbolTerm *const MAX_INTEGER;
		static SymbolTerm *const MIN_INTEGER;
		static SymbolTerm *const INTEGER_ROUNDING_FUNCTION;
		static SymbolTerm *const MAX_ARITY;

		/**
		 * <code>'$get_prolog_impl_flag'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$get_prolog_impl_flag_2 extends Predicate.P2 {
	public:
		static Operation PRED_$get_prolog_impl_flag_2_static_exec(Prolog *engine);

		/**
		 * <code>'$get_stream_manager'/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$get_stream_manager_1 extends Predicate.P1 {
		static Operation PRED_$get_stream_manager_1_static_exec(Prolog *engine);

		/**
		 * <code>halt/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _halt_1 extends Predicate.P1 {
		static Operation PRED_halt_1_static_exec(Prolog *engine);

		// jutil.Hashtable;
		/**
		 * <code>'$hash_adda'/3</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$hash_adda_3 extends Predicate.P3 {

		static Operation PRED_$hash_adda_3_static_exec(Prolog *engine);

		// jutil.ArrayDeque;
		// jutil.Deque;
		// jutil.Hashtable;
		/**
		 * <code>'$hash_addz'/3</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$hash_addz_3 extends Predicate.P3 {

		static Operation PRED_$hash_addz_3_static_exec(Prolog *engine);

		// jutil.Hashtable;
		/**
		 * <code>hash_clear/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _hash_clear_1 extends Predicate.P1 {
		static Operation PRED_hash_clear_1_static_exec(Prolog *engine);

		// jutil.Hashtable;
		/**
		 * <code>hash_contains_key/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		static Operation PRED_hash_contains_key_2_static_exec(Prolog *engine);

		// jutil.Hashtable;
		/**
		 * <code>hash_get/3</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _hash_get_3 extends Predicate.P3 {
		static Operation PRED_hash_get_3_static_exec(Prolog *engine);

		/**
		 * <code>hash_is_empty/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _hash_is_empty_1 extends Predicate.P1 {
		static Operation PRED_hash_is_empty_1_static_exec(Prolog *engine);

		/**
		 * <code>hash_keys/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _hash_keys_2 extends Predicate.P2 {
		static Operation PRED_hash_keys_2_static_exec(Prolog *engine);

		// jutil.Hashtable;
		/**
		 * <code>hash_put/3</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _hash_put_3 extends Predicate.P3 {
		static Operation PRED_hash_put_3_static_exec(Prolog *engine);

		// .ExistenceException;
		// .HashtableOfTerm;
		// .IllegalDomainException;
		// .InternalException;
		// .FFIObjectTerm;
		// .Operation;
		// .PInstantiationException;
		// .Predicate;
		// .Prolog;
		// .Term;
		/**
		 * <code>hash_remove/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _hash_remove_2 extends Predicate.P2 {
		static Operation PRED_hash_remove_2_static_exec(Prolog *engine);

		// jutil.ArrayDeque;
		// jutil.Deque;
		// jutil.Hashtable;
		/**
		 * <code>'$hash_remove_first'/3</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$hash_remove_first_3 extends Predicate.P3 {
		//
		static Operation PRED_$hash_remove_first_3_static_exec(Prolog *engine);

		// jutil.Hashtable;
		/**
		 * <code>hash_size/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _hash_size_2 extends Predicate.P2 {
		static Operation PRED_hash_size_2_static_exec(Prolog *engine);

		/**
		 * <code>'$insert'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _$insert_2 extends Predicate.P2 {
		static Operation PRED_$insert_2_static_exec(Prolog *engine);

		// jlang.reflect.*;
		/**
		 * <code>java_constructor0/2</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _java_constructor0_2 extends FFIPredicate {

		static Operation PRED_java_constructor0_2_static_exec(Prolog *engine);

		// jutil.List;
		/**
		 * <code>java_conversion/2</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _java_conversion_2 extends Predicate.P2 {
		static Operation PRED_java_conversion_2_static_exec(Prolog *engine);

		static Term *inverseConversion(std::any o);

		static Operation PRED_java_declared_constructor0_2_static_exec(Prolog *engine);

		// jlang.reflect.*;
		/**
		 * <code>java_declared_method0/3</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _java_declared_method0_3 extends FFIPredicate {

		static Operation PRED_java_declared_method0_3_static_exec(Prolog *engine);

		// jlang.reflect.*;
		/**
		 * <code>java_get_declared_field0/3</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// extends FFIPredicate {
		static Operation PRED_java_get_declared_field0_3_static_exec(Prolog *engine);

		// jlang.reflect.*;
		/**
		 * <code>java_get_field0/3</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */

		static Operation PRED_java_get_field0_3_static_exec(Prolog *engine);

		static Term *toPrologTerm(std::any obj);

		// jlang.reflect.*;
		/**
		 * <code>java_method0/3</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _java_method0_3 extends FFIPredicate {
		static Operation PRED_java_method0_3_static_exec(Prolog *engine);

		// jlang.reflect.*;
		/**
		 * <code>java_set_declared_field0/3</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _java_set_declared_field0_3 extends FFIPredicate {

		static Operation PRED_java_set_declared_field0_3_static_exec(Prolog *engine);

		// jlang.reflect.*;
		/**
		 * <code>java_set_field0/3</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _java_set_field0_3 extends FFIPredicate {

		static Operation PRED_java_set_field0_3_static_exec(Prolog *engine);

		// jutil.Arrays;
		/**
		 * <code>keysort/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _keysort_2 extends Predicate.P2 {
	private:
		static SymbolTerm *const SYM_HYPHEN_2;

	public:
		static Operation PRED_keysort_2_static_exec(Prolog *engine);

	public:
		class KeySortComparator : public java::util::Comparator<Term*>
		{
		public:
			virtual int compare(Term *t1, Term *t2);
		};

		// .Predicate.P2;
		// jio.PushbackReader;
		// _line_count_2 extends P2 {
	public:
		static Operation PRED_line_count_2_static_exec(Prolog *engine);

		// jutil.logging.Level;
		// jutil.logging.Logger;
		// .Predicate.P2;
		// import static SxxMachine.PRED_loggable_1.LEVELS;
		/**
		 * <b>log(package:level, message)</b> - logs given <i>message</i> to the
		 * logger, corresponding to <i>package</i>, under the given <i>level</i>.
		 * <p>
		 * <i>package</i> is expected to be atom. (Variable will cause errors). If
		 * package is absent, then current package is automatically added by prolog
		 * compiler. So call log('INFO','message') is valid.
		 * <p>
		 * <i>level</i> can be either variable or atom. If it is a variable, it will
		 * be bound to current logging level of given package. If it is an atom, the
		 * current logging level of given package will be set to its value. Value can
		 * be one of
		 * 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
		 * (from highest to lowest). Also lower case variants without quotes are
		 * accepted. So log(info,'message') is valid.
		 * <p>
		 * <i>message</i> can be any term, including free variable. It will be
		 * converted to string using method {@link Object#toString()}
		 *
		 * <p>
		 * The predicate finds {@link Logger} instance, corresponding to given
		 * package, and calls its method {@link Logger#log(Level, String)} with level
		 * and message as arguments.
		 *
		 * @author semenov
		 *
		 */
		// _log_2 extends P2 {
		static Operation PRED_log_2_static_exec(Prolog *engine);

		// jutil.logging.Level;
		// jutil.logging.Logger;
		// .Predicate.P3;
		// import static SxxMachine.PRED_loggable_1.LEVELS;
		/**
		 * <b>log(package:level, format, arg1)</b> - logs message, specified by
		 * <i>format</i> and <i>arg1</i>, to the logger, corresponding to
		 * <i>package</i>, under the given <i>level</i>.
		 * <p>
		 * <i>package</i> is expected to be atom. (Variable will cause errors). If
		 * package is absent, then current package is automatically added by prolog
		 * compiler. So call log('INFO','%s','message') is valid.
		 * <p>
		 * <i>level</i> can be either variable or atom. If it is a variable, it will
		 * be bound to current logging level of given package. If it is an atom, the
		 * current logging level of given package will be set to its value. Value can
		 * be one of
		 * 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
		 * (from highest to lowest). Also lower case variants without quotes are
		 * accepted. So log(info,'%s','message') is valid.
		 * <p>
		 * <i>format</i> - is expected to be an atom, holding format string, that will
		 * be supplied to method {@link String#format(String, Object...)}. Variable
		 * will cause error.
		 * <p>
		 * <i>arg1</i> - can be any term, including free variable. It will be
		 * converted to string using method {@link Object#toString()}
		 *
		 * <p>
		 * The predicate finds {@link Logger} instance, corresponding to given
		 * package, and calls its method {@link Logger#log(Level, String)} with level
		 * and the result of {@link String#format(String, Object...)} call with format
		 * and arg1 as arguments.
		 *
		 * @author semenov
		 *
		 */
		// _log_3 extends P3 {
		static Operation PRED_log_3_static_exec(Prolog *engine);

		// jutil.logging.Level;
		// jutil.logging.Logger;
		// .Predicate.P4;
		// import static SxxMachine.PRED_loggable_1.LEVELS;
		/**
		 * <b>log(package:level, format, arg1, arg2)</b> - logs message, specified by
		 * <i>format</i> and <i>arg1</i>,<i>arg2</i> to the logger, corresponding to
		 * <i>package</i>, under the given <i>level</i>.
		 * <p>
		 * <i>package</i> is expected to be atom. (Variable will cause errors). If
		 * package is absent, then current package is automatically added by prolog
		 * compiler. So call log('INFO','%s','message') is valid.
		 * <p>
		 * <i>level</i> can be either variable or atom. If it is a variable, it will
		 * be bound to current logging level of given package. If it is an atom, the
		 * current logging level of given package will be set to its value. Value can
		 * be one of
		 * 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
		 * (from highest to lowest). Also lower case variants without quotes are
		 * accepted. So log(info,'%s','message') is valid.
		 * <p>
		 * <i>format</i> - is expected to be an atom, holding format string, that will
		 * be supplied to method {@link String#format(String, Object...)}. Variable
		 * will cause error.
		 * <p>
		 * <i>arg1</i> - can be any term, including free variable. It will be
		 * converted to string using method {@link Object#toString()}
		 * <p>
		 * <i>arg2</i> - can be any term, including free variable. It will be
		 * converted to string using method {@link Object#toString()}
		 * <p>
		 * The predicate finds {@link Logger} instance, corresponding to given
		 * package, and calls its method {@link Logger#log(Level, String)} with level
		 * and the result of {@link String#format(String, Object...)} call with
		 * <i>format</i> and <i>arg1</i>,<i>arg2</i> as arguments.
		 *
		 * @author semenov
		 *
		 */
		// _log_4 extends P4 {
		static Operation PRED_log_4_static_exec(Prolog *engine);

		// jutil.logging.Level;
		// jutil.logging.Logger;
		// import static SxxMachine.PRED_loggable_1.LEVELS;
		/**
		 * <b>log(package:level, format, arg1,... argN)</b> - logs message, specified
		 * by <i>format</i> and <i>arg1</i>...<i>argN</i> to the logger, corresponding
		 * to <i>package</i>, under the given <i>level</i>.
		 * <p>
		 * <i>package</i> is expected to be atom. (Variable will cause errors). If
		 * package is absent, then current package is automatically added by prolog
		 * compiler. So call log('INFO','%s','message') is valid.
		 * <p>
		 * <i>level</i> can be either variable or atom. If it is a variable, it will
		 * be bound to current logging level of given package. If it is an atom, the
		 * current logging level of given package will be set to its value. Value can
		 * be one of
		 * 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
		 * (from highest to lowest). Also lower case variants without quotes are
		 * accepted. So log(info,'%s','message') is valid.
		 * <p>
		 * <i>format</i> - is expected to be an atom, holding format string, that will
		 * be supplied to method {@link String#format(String, Object...)}. Variable
		 * will cause error.
		 * <p>
		 * <i>arg1</i> - can be any term, including free variable. It will be
		 * converted to string using method {@link Object#toString()}
		 * <p>
		 * ...
		 * <p>
		 * <i>argN</i> - can be any term, including free variable. It will be
		 * converted to string using method {@link Object#toString()}
		 * <p>
		 * The predicate finds {@link Logger} instance, corresponding to given
		 * package, and calls its method {@link Logger#log(Level, String)} with level
		 * and the result of {@link String#format(String, Object...)} call with
		 * <i>format</i> and <i>arg1</i>...<i>argN</i> as arguments.
		 *
		 * @author semenov
		 *
		 */
		// _log_5 extends Predicate {

		static Operation PRED_log_5_static_exec(Prolog *engine);

		// jutil.logging.Level;
		// jutil.logging.Logger;
		// import static SxxMachine.PRED_loggable_1.LEVELS;
		/**
		 * <b>log(package:level, format, arg1,... argN)</b> - logs message, specified
		 * by <i>format</i> and <i>arg1</i>...<i>argN</i> to the logger, corresponding
		 * to <i>package</i>, under the given <i>level</i>.
		 * <p>
		 * <i>package</i> is expected to be atom. (Variable will cause errors). If
		 * package is absent, then current package is automatically added by prolog
		 * compiler. So call log('INFO','%s','message') is valid.
		 * <p>
		 * <i>level</i> can be either variable or atom. If it is a variable, it will
		 * be bound to current logging level of given package. If it is an atom, the
		 * current logging level of given package will be set to its value. Value can
		 * be one of
		 * 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
		 * (from highest to lowest). Also lower case variants without quotes are
		 * accepted. So log(info,'%s','message') is valid.
		 * <p>
		 * <i>format</i> - is expected to be an atom, holding format string, that will
		 * be supplied to method {@link String#format(String, Object...)}. Variable
		 * will cause error.
		 * <p>
		 * <i>arg1</i> - can be any term, including free variable. It will be
		 * converted to string using method {@link Object#toString()}
		 * <p>
		 * ...
		 * <p>
		 * <i>argN</i> - can be any term, including free variable. It will be
		 * converted to string using method {@link Object#toString()}
		 * <p>
		 * The predicate finds {@link Logger} instance, corresponding to given
		 * package, and calls its method {@link Logger#log(Level, String)} with level
		 * and the result of {@link String#format(String, Object...)} call with
		 * <i>format</i> and <i>arg1</i>...<i>argN</i> as arguments.
		 *
		 * @author semenov
		 *
		 */
		// _log_6 extends Predicate {
		static Operation PRED_log_6_static_exec(Prolog *engine);

		// jutil.logging.Level;
		// jutil.logging.Logger;
		// import static SxxMachine.PRED_loggable_1.LEVELS;
		/**
		 * <b>log(package:level, format, arg1,... argN)</b> - logs message, specified
		 * by <i>format</i> and <i>arg1</i>...<i>argN</i> to the logger, corresponding
		 * to <i>package</i>, under the given <i>level</i>.
		 * <p>
		 * <i>package</i> is expected to be atom. (Variable will cause errors). If
		 * package is absent, then current package is automatically added by prolog
		 * compiler. So call log('INFO','%s','message') is valid.
		 * <p>
		 * <i>level</i> can be either variable or atom. If it is a variable, it will
		 * be bound to current logging level of given package. If it is an atom, the
		 * current logging level of given package will be set to its value. Value can
		 * be one of
		 * 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
		 * (from highest to lowest). Also lower case variants without quotes are
		 * accepted. So log(info,'%s','message') is valid.
		 * <p>
		 * <i>format</i> - is expected to be an atom, holding format string, that will
		 * be supplied to method {@link String#format(String, Object...)}. Variable
		 * will cause error.
		 * <p>
		 * <i>arg1</i> - can be any term, including free variable. It will be
		 * converted to string using method {@link Object#toString()}
		 * <p>
		 * ...
		 * <p>
		 * <i>argN</i> - can be any term, including free variable. It will be
		 * converted to string using method {@link Object#toString()}
		 * <p>
		 * The predicate finds {@link Logger} instance, corresponding to given
		 * package, and calls its method {@link Logger#log(Level, String)} with level
		 * and the result of {@link String#format(String, Object...)} call with
		 * <i>format</i> and <i>arg1</i>...<i>argN</i> as arguments.
		 *
		 * @author semenov
		 *
		 */
		// _log_7 extends Predicate {

		static Operation PRED_log_7_static_exec(Prolog *engine);

		// jutil.logging.Level;
		// jutil.logging.Logger;
		// .Predicate.P2;
		// import static SxxMachine.PRED_loggable_1.LEVELS;
		/**
		 * <b>log_error(package:level, error)</b> - logs given <i>error</i> to the
		 * logger, corresponding to <i>package</i>, under the given <i>level</i>. If
		 * possible, java and prolog stack traces are also written.
		 * <p>
		 * <i>package</i> is expected to be atom. (Variable will cause errors). If
		 * package is absent, then current package is automatically added by prolog
		 * compiler. So call log('INFO','message') is valid.
		 * <p>
		 * <i>level</i> can be either variable or atom. If it is a variable, it will
		 * be bound to current logging level of given package. If it is an atom, the
		 * current logging level of given package will be set to its value. Value can
		 * be one of
		 * 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
		 * (from highest to lowest). Also lower case variants without quotes are
		 * accepted. So log(info,'message') is valid.
		 * <p>
		 * <i>error</i> can be any term, including free variable.
		 *
		 * <p>
		 * The predicate finds {@link Logger} instance, corresponding to given
		 * package, and calls its method {@link Logger#log(Level, String)} with level
		 * and message as arguments.
		 *
		 * @author semenov
		 *
		 */
		// _log_error_2 extends P2 {
		static Operation PRED_log_error_2_static_exec(Prolog *engine);

		// jutil.HashMap;
		// jutil.Map;
		// jutil.logging.Level;
		// jutil.logging.Logger;
		// .Predicate.P1;
		/**
		 * <p>
		 * <b>loggable(package:level)</b> - succeed if given level is loggable for
		 * given package. If package is absent, then current package is automatically
		 * added by prolog compiler. So call loggable('INFO') is valid. Both package
		 * and level are expected to be atoms. (Variables will cause errors). Level
		 * can be one of
		 * 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
		 * (from highest to lowest). Also lower case variants without quotes are
		 * accepted.
		 *
		 * <p>
		 * The predicate finds {@link Logger} instance, corresponding to given
		 * package, and calls its {@link Logger#isLoggable(Level)} method with given
		 * level.
		 *
		 * @author semenov
		 *
		 */
		// _loggable_1 extends P1 {
		static const std::unordered_map<Term*, Level*> LEVELS;
		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static bootpreds::StaticConstructor staticConstructor;


	public:
		static Operation PRED_loggable_1_static_exec(Prolog *engine);

		// jutil.logging.Level;
		// jutil.logging.Logger;
		// .Predicate.P1;
		// import static SxxMachine.PRED_loggable_1.LEVELS;
		/**
		 * <p>
		 * <b>log_level(package:level)</b> - gets or sets logging level for given
		 * package.
		 * <p>
		 * <i>package</i> is expected to be atom. (Variable will cause errors). If
		 * package is absent, then current package is automatically added by prolog
		 * compiler. So call log_level('INFO') is valid.
		 * <p>
		 * <i>level</i> can be either variable or atom. If it is a variable, it will
		 * be bound to current logging level of given package. If it is an atom, the
		 * current logging level of given package will be set to its value. Value can
		 * be one of
		 * 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
		 * (from highest to lowest). Also lower case variants without quotes are
		 * accepted. So log_level(info) is valid.
		 *
		 * <p>
		 * If <i>level</i> is bound to atom value, the predicate finds {@link Logger}
		 * instance, corresponding to given package, and calls its
		 * {@link Logger#setLevel(Level)} method with given <i>level</i> value.
		 * <p>
		 * If level is free variable, the predicate finds {@link Logger} instance,
		 * corresponding to given package, calls its {@link Logger#getLevel()} method
		 * to find out it is level and binds the value to the <i>level</i> argument
		 *
		 * @author semenov
		 *
		 */
		// _log_level_1 extends P1 {
		static Operation PRED_log_level_1_static_exec(Prolog *engine);

		// jio.File;
		/** {@code make_directory(+Dir)} */
		// _make_directory_1 extends Predicate.P1 {
		static Operation PRED_make_directory_1_static_exec(Prolog *engine);

		// .Predicate.P1;
		/**
		 * <p>
		 * mutex_create(?MutexId)
		 * <p>
		 * Create a mutex. If MutexId is an atom, a named mutex is created. If it is a
		 * variable, an anonymous mutex reference is returned. There is no limit to
		 * the number of mutexes that can be created.
		 * <p>
		 * description is copied from swi prolog documentation
		 *
		 * @author semenov
		 *
		 */
		// _mutex_create_1 extends P1 {
		static Operation PRED_mutex_create_1_static_exec(Prolog *engine);

		// .Predicate.P1;
		// jutil.concurrent.locks.Lock;
		/**
		 * <p>
		 * mutex_lock_bt(+MutexId)
		 * <p>
		 * Lock the mutex. Prolog mutexes are recursive mutexes: they can be locked
		 * multiple times by the same thread. Only after unlocking it as many times as
		 * it is locked does the mutex become available for locking by other threads.
		 * If another thread has locked the mutex the calling thread is suspended
		 * until the mutex is unlocked.
		 * <p>
		 * If MutexId is an atom, and there is no current mutex with that name, the
		 * mutex is created automatically using mutex_create/1. This implies named
		 * mutexes need not be declared explicitly.
		 * <p>
		 * Please note that locking and unlocking mutexes should be paired carefully.
		 * Especially make sure to unlock mutexes even if the protected code fails or
		 * raises an exception. For most common cases, use with_mutex/2, which
		 * provides a safer way for handling Prolog-level mutexes. The predicate
		 * setup_call_cleanup/3 is another way to guarantee that the mutex is unlocked
		 * while retaining non-determinism.
		 * <p>
		 * description is copied from swi prolog documentation
		 *
		 * @author semenov
		 *
		 */
		// _mutex_lock_1 extends P1 {
		static Operation PRED_mutex_lock_1_static_exec(Prolog *engine);

		// .Predicate.P1;
		// jutil.concurrent.locks.Lock;
		/**
		 * <p>
		 * mutex_lock(+MutexId)
		 * <p>
		 * Lock the mutex. Prolog mutexes are recursive mutexes: they can be locked
		 * multiple times by the same thread. Only after unlocking it as many times as
		 * it is locked does the mutex become available for locking by other threads.
		 * If another thread has locked the mutex the calling thread is suspended
		 * until the mutex is unlocked.
		 * <p>
		 * If MutexId is an atom, and there is no current mutex with that name, the
		 * mutex is created automatically using mutex_create/1. This implies named
		 * mutexes need not be declared explicitly.
		 * <p>
		 * Please note that locking and unlocking mutexes should be paired carefully.
		 * Especially make sure to unlock mutexes even if the protected code fails or
		 * raises an exception. For most common cases, use with_mutex/2, which
		 * provides a safer way for handling Prolog-level mutexes. The predicate
		 * setup_call_cleanup/3 is another way to guarantee that the mutex is unlocked
		 * while retaining non-determinism.
		 * <p>
		 * the returned mutex is automatically unlocked on backtracking
		 * <p>
		 * description is copied from swi prolog documentation
		 *
		 * @author semenov
		 *
		 */
		// _mutex_lock_bt_1 extends P1 {
		static Operation PRED_mutex_lock_bt_1_static_exec(Prolog *engine);

		// .Predicate.P1;
		// jutil.concurrent.locks.Lock;
		/**
		 * <p>
		 * mutex_trylock(+MutexId) As mutex_lock/1, but if the mutex is held by
		 * another thread, this predicates fails immediately.
		 *
		 * <p>
		 * description is copied from swi prolog documentation
		 *
		 * @author semenov
		 *
		 */
		// _mutex_trylock_1 extends P1 {
		static Operation PRED_mutex_trylock_1_static_exec(Prolog *engine);

		// .Predicate.P1;
		// jutil.concurrent.locks.Lock;
		/**
		 * <p>
		 * mutex_unlock(+MutexId)
		 * <p>
		 * Unlock the mutex. This can only be called if the mutex is held by the
		 * calling thread. If this is not the case, a permission_error exception is
		 * raised.
		 * <p>
		 * description is copied from swi prolog documentation
		 *
		 * @author semenov
		 *
		 */
		// extends P1 {
		static Operation PRED_mutex_unlock_1_static_exec(Prolog *engine);

		/**
		 * <code>'$neck_cut'/0</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$neck_cut_0 extends Predicate.P0 {
		static Operation PRED_$neck_cut_0_static_exec(Prolog *engine);

		/**
		 * <code>new_hash/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _new_hash_2 extends Predicate.P2 {
	private:
		static SymbolTerm *const SYM_ALIAS_1;

	public:
		static Operation PRED_new_hash_2_static_exec(Prolog *engine);

		/**
		 * <code>nl/0</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _nl_0 extends Predicate.P0 { 
		static Operation PRED_nl_0_static_exec_bootpred(Prolog *engine);

		/**
		 * <code>number_chars/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _number_chars_2 extends Predicate.P2 {
		static Operation PRED_number_chars_2_static_exec(Prolog *engine);

		/**
		 * <code>number_codes/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _number_codes_2 extends Predicate.P2 {
		static Operation PRED_number_codes_2_static_exec(Prolog *engine);

	private:
		static SymbolTerm *const SYM_TEXT;
		static SymbolTerm *const SYM_READ;
		static SymbolTerm *const SYM_WRITE;
		static SymbolTerm *const SYM_APPEND;
		static SymbolTerm *const SYM_INPUT;
		static SymbolTerm *const SYM_OUTPUT;
		// private static final SymbolTerm SYM_ALIAS_1 = F("alias", 1);
		static SymbolTerm *const SYM_MODE_1;
		static SymbolTerm *const SYM_TYPE_1;
		static SymbolTerm *const SYM_FILE_NAME_1;
		static SymbolTerm *const SYM_CHARSET;
		static SymbolTerm *const SYM_AUTOCLOSE;

		// jio.*;
		// jnio.charset.Charset;
		// jutil.HashMap;
		// jutil.Map;
		/**
		 * <code>open/4</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _open_4 extends Predicate.P4 {
	public:
		static Operation PRED_open_4_static_exec(Prolog *engine);

		// @SuppressWarnings("unused")
		static std::unordered_map<SymbolTerm*, Term*> processOptions(Term *options);

	private:
		class CloseHelper : public Undoable
		{
		private:
			Prolog *const engine;
			FFIObjectTerm *const streamObject;
			Term *const alias;

		public:
			virtual ~CloseHelper()
			{
				delete engine;
				delete streamObject;
				delete alias;
			}

			CloseHelper(Prolog *engine, FFIObjectTerm *streamObject, Term *alias);

			void undo() override;
		};

		// jio.*;
		/**
		 * <code>peek_byte/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 * @since 1.1
		 */
		// _peek_byte_2 extends Predicate.P2 {

	public:
		static Operation PRED_peek_byte_2_static_exec(Prolog *engine);

		// jio.*;
		/**
		 * <code>peek_char/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _peek_char_2 extends Predicate.P2 {
	private:
		static SymbolTerm *const SYM_EOF;

	public:
		static Operation PRED_peek_char_2_static_exec(Prolog *engine);

		// jio.*;
		/**
		 * <code>peek_code/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _peek_code_2 extends Predicate.P2 {
	private:
		static IntegerTerm *const INT_EOF;

	public:
		static Operation PRED_peek_code_2_static_exec(Prolog *engine);

		/**
		 * <code>'$print_stack_trace'/1</code>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$print_stack_trace_1 extends Predicate.P1 {
		static Operation PRED_$print_stack_trace_1_static_exec(Prolog *engine);

		// jio.*;
		/**
		 * <code>put_byte/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 * @since 1.1
		 */
		// _put_byte_2 extends Predicate.P2 {
		static Operation PRED_put_byte_2_static_exec(Prolog *engine);

		// jio.*;
		/**
		 * <code>put_char/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _put_char_2 extends Predicate.P2 {
		static Operation PRED_put_char_2_static_exec(Prolog *engine);

		// jio.*;
		/**
		 * <code>put_code/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// extends Predicate.P2 {
		static Operation PRED_put_code_2_static_exec(Prolog *engine);

		/**
		 * <code>raise_exception/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _raise_exception_1 extends Predicate.P1 {
		static Operation PRED_raise_exception_1_static_exec(Prolog *engine);

		static Operation PRED_throw_1_static_exec(Prolog *engine);

		/**
		 * PREDICATE: $unify/2 from:
		 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtins.pl
		 */

		static Operation PRED_$unify_2_static_exec_builtins(Prolog *m);

		// jio.*;
		/**
		 * <code>read_line/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _read_line_2 extends Predicate.P2 {
		static Operation PRED_read_line_2_static_exec(Prolog *engine);

		static void cleanPendingWhiteSpace(PushbackReader *pbr) throw(IOException);

		// jio.*;
		/**
		 * <code>'$read_token0'/3</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 * @since 0.7
		 */
		// _$read_token0_3 extends Predicate.P3 {

		/*
		 * The a1 must be user, user_input, and java.io.PushbackReader, otherwise
		 * fails.
		 */
		static Operation PRED_$read_token0_3_static_exec(Prolog *engine);

		// jutil.regex.Pattern;
		/**
		 * <code>regex_compile/2</code><br>
		 *
		 * <pre>
		 *   'regex_compile'(+regex string, -Pattern object)
		 * </pre>
		 */
		// _regex_compile_2 extends Predicate.P2 {
		static Operation PRED_regex_compile_2_static_exec(Prolog *engine);

		// jutil.regex.Matcher;
		// jutil.regex.Pattern;
		/**
		 * <code>regex_match/3</code><br>
		 * <p>
		 *
		 * <pre>
		 *   'regex_match'(+Pattern object, +Chars, -Matches)
		 * </pre>
		 */
		// _regex_match_3 extends Predicate.P3 {
		static Operation PRED_regex_match_3_static_exec(Prolog *engine);

	private:
		static Operation regex_check(Prolog *engine);

		static Operation regex_next(Prolog *engine);

		static Operation regex_empty(Prolog *engine);

		static Term *getMatches(Matcher *matcher);

		// _reverse_2 extends Predicate.P2 {
	public:
		static Operation PRED_reverse_2_static_exec(Prolog *engine);

		/**
		 * <code>'$set_exception'/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$set_exception_1 extends Predicate.P1 {
		static Operation PRED_$set_exception_1_static_exec(Prolog *engine);

		// jio.PushbackReader;
		/**
		 * <code>set_input/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _set_input_1 extends Predicate.P1 {
		static Operation PRED_set_input_1_static_exec(Prolog *engine);

		// jio.PrintWriter;
		/**
		 * <code>set_output/1</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _set_output_1 extends Predicate.P1 {
		static Operation PRED_set_output_1_static_exec(Prolog *engine);

		/**
		 * <code>'$set_prolog_impl_flag'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$set_prolog_impl_flag_2 extends Predicate.P2 {
	private:
		static SymbolTerm *const CHAR_CONVERSION;
		static SymbolTerm *const DEBUG;
		static SymbolTerm *const UNKNOWN;
		static SymbolTerm *const DOUBLE_QUOTES;
		static SymbolTerm *const PRINT_STACK_TRACE;

	public:
		static Operation PRED_$set_prolog_impl_flag_2_static_exec(Prolog *engine);

		// jio.*;
		/**
		 * <code>skip/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _skip_2 extends Predicate.P2 {

		static Operation PRED_skip_2_static_exec(Prolog *engine);

		// jutil.Arrays;
		/**
		 * <code>sort/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _sort_2 extends Predicate.P2 {
		static Operation PRED_sort_2_static_exec(Prolog *engine);

		/**
		 * <code>'$statistics'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$statistics_2 extends Predicate.P2 {
	private:
		static SymbolTerm *const Nil;
		static SymbolTerm *const SYM_RUNTIME;
		static SymbolTerm *const SYM_TRAIL;
		static SymbolTerm *const SYM_CHOICE;

	public:
		static Operation PRED_$statistics_2_static_exec(Prolog *engine);

		// jio.*;
		/**
		 * <code>tab/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _tab_2 extends Predicate.P2 {
		static Operation PRED_tab_2_static_exec(Prolog *engine);

		/**
		 * <code>'$term_hash'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.1
		 */
		// _$term_hash_2 extends Predicate.P2 {
		static Operation PRED_$term_hash_2_static_exec(Prolog *engine);

		/**
		 * <code>'$univ'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// extends Predicate.P2 {
		static Operation PRED_$univ_2_static_exec(Prolog *engine);

		// .Predicate.P2;
		// jio.File;
		// jio.FileInputStream;
		// jio.FileOutputStream;
		// jio.IOException;
		// jutil.Properties;
		/**
		 * <p>
		 * write_domain_definitions(+OutputDir,+DomainDefinitionsList)
		 * <p>
		 * Writes domain definitions into properties file in the folder corresponding
		 * to package.
		 * <p>
		 * Arguments are:
		 * <UL>
		 * <LI>OutputDir - the base directory for output. It will be used as prefix
		 * for package directory</LI>
		 * <LI>DomainDefinitionsList - the list of domain definitions. Each item is
		 * expected to be complex StructureTerm: packageName:domainName =
		 * (aaa;bbb*;ccc(ddd,eee))</LI>
		 * </UL>
		 * <p>
		 * All items must reference the same package.
		 * <p>
		 * If the properties file already exist, its content will be merged with given
		 * domain definitions. The existing domain definition will be overwritten by
		 * new one.
		 * <p>
		 * The predicate is thread safe. Concurrent threads will write definitions
		 * sequentially, one by one, merging the domain definitions, written earlier.
		 * The execution order for competing threads is not defined.
		 *
		 * @author semenov
		 *
		 */
		// _write_domain_definitions_2 extends P2 {
		static Operation PRED_write_domain_definitions_2_static_exec(Prolog *engine);

		/**
		 * Writes given domain definition as properties file for given package and
		 * destination folder. The method is static and synchronized to allow writing
		 * from different threads. Writing from different processes will lead to
		 * unpredicted results.
		 *
		 * @param folder
		 * @param packageName
		 * @param domains
		 */
	private:
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
		static void writeDomainDefinitions(const std::string &folder, const std::string &packageName, Properties *domains);

		/**
		 * <code>'$write_toString'/2</code><br>
		 *
		 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
		 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
		 * @version 1.0
		 */
		// _$write_toString_2 extends Predicate.P2 {
	public:
		static Operation PRED_$write_toString_2_static_exec(Prolog *engine);

		static void loadFile();
	};

}
