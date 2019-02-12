package SxxMachine;
 
import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.locks.*;
import java.util.logging.*;
import static SxxMachine.bootpreds.*;
import static SxxMachine.bootpreds.LEVELS;
import static SxxMachine.FILE_builtins.*;
import static SxxMachine.FILE_cafeteria.*;
import static SxxMachine.FILE_io.*;
import static SxxMachine.FILE_swi_supp.*;
import static SxxMachine.FILE_system.*;
import static SxxMachine.sxxtensions.*;
import static SxxMachine.Failure.*;
import static SxxMachine.Predicate.*;
import static SxxMachine.Prolog.*;
import static SxxMachine.Success.*;
import static SxxMachine.SymbolTerm.*;
import static SxxMachine.TermData.*;
import SxxMachine.*;
import SxxMachine.bootpreds.*;
import SxxMachine.bootpreds.PRED_$begin_exception_1;
import SxxMachine.bootpreds.PRED_$begin_sync_2;
import SxxMachine.bootpreds.PRED_$builtin_member_2;
import SxxMachine.FILE_builtins.*;
import SxxMachine.sxxtensions.*;
public class FILE_builtins extends bootpreds {
/** PREDICATE: (package)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((package)/1,non-(public))




    public static Operation PRED_package_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // package A:-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // package A:-[]
        return cont;
    }
/** PREDICATE: true/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(true/0,public)




    public static Operation PRED_true_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // true:-true
        m.setB0();
    // true:-[]
        return cont;
    }
/** PREDICATE: otherwise/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(otherwise/0,public)




    public static Operation PRED_otherwise_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // otherwise:-true
        m.setB0();
    // otherwise:-[]
        return cont;
    }
/** PREDICATE: fail/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(fail/0,public)




    public static Operation PRED_fail_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // fail:-fail
        m.setB0();
    // fail:-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: false/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(false/0,public)




    public static Operation PRED_false_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // false:-fail
        m.setB0();
    // false:-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: !/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(!/0,public)




    public static Operation PRED_$0021_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // !:-true
        m.setB0();
    // !:-[]
        return cont;
    }
/** PREDICATE: (^)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((^)/2,public)
        final static SymbolTerm FUNCTOR_module_colon_2 = F(":",2);
        final static SymbolTerm ATOM_SxxMachine = SYM("SxxMachine");




    public static Operation PRED_$005E_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A^B:-call(B)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // A^B:-[call('SxxMachine':B)]
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op(FILE_system::PRED_call_1_static_exec, VA(a3), cont);
    }
/** PREDICATE: (,)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((',')/2,public)




    public static Operation PRED_$002C_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A,B:-call(A),call(B)
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // A,B:-[call('SxxMachine':A),call('SxxMachine':B)]
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op(FILE_system::PRED_call_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_call_1_static_exec, VA(a4), cont));
    }
/** PREDICATE: (;)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((;)/2,public)
        final static SymbolTerm FUNCTOR_$002D$003E_2 = F("->",2);




    public static Operation PRED_$003B_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$003B_2_var, FILE_builtins::$003B_2_int, FILE_builtins::$003B_2_int, FILE_builtins::$003B_2_int, FILE_builtins::$003B_2_var, FILE_builtins::$003B_2_int); 
    }

    private final static Operation $003B_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::$003B_2_var_1);
        return $003B_2_1(m);
    }

    private final static Operation $003B_2_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$003B_2_var_2);
        return $003B_2_2(m);
    }

    private final static Operation $003B_2_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$003B_2_var_3);
        return $003B_2_3(m);
    }

    private final static Operation $003B_2_var_3(Prolog m) { 
        m.trust(null);
        return $003B_2_4(m);
    }

    private final static Operation $003B_2_int(Prolog m) { 
        m.jtry2(null, FILE_builtins::$003B_2_int_1);
        return $003B_2_1(m);
    }

    private final static Operation $003B_2_int_1(Prolog m) { 
        m.trust(null);
        return $003B_2_2(m);
    }

    private final static Operation $003B_2_1(Prolog m) { 
    // A;B:-A\=(C->D),call(A)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // A;B:-['$not_unifiable'(A,(C->D)),call('SxxMachine':A)]
    // put_str_args([void,void],y(1)),put_str(@('FUNCTOR_$002D$003E_2'),y(1),a(3))
        a3 =  S( FUNCTOR_$002D$003E_2 , m.mkvar3(), m.mkvar3());
 ;
        //START inline expansion of $not_unifiable(a(1),a(3))
        if (a1.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
        return //
 Op(FILE_system::PRED_call_1_static_exec, VA(a4), cont);
    }

    private final static Operation $003B_2_2(Prolog m) { 
    // A;B:-B\=(C->D),call(B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // A;B:-['$not_unifiable'(B,(C->D)),call('SxxMachine':B)]
    // put_str_args([void,void],y(1)),put_str(@('FUNCTOR_$002D$003E_2'),y(1),a(3))
        a3 =  S( FUNCTOR_$002D$003E_2 , m.mkvar3(), m.mkvar3());
 ;
        //START inline expansion of $not_unifiable(a(2),a(3))
        if (a2.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op(FILE_system::PRED_call_1_static_exec, VA(a4), cont);
    }

    private final static Operation $003B_2_3(Prolog m) { 
    // A->B;C:-call(A),!,call(B)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // A->B;C:-['$get_level'(D),call('SxxMachine':A),'$cut'(D),call('SxxMachine':B)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(3)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a3);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
        return //
 Op(FILE_system::PRED_call_1_static_exec, VA(a6), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_call_1_static_exec, VA(a7), cont)));
    }

    private final static Operation $003B_2_4(Prolog m) { 
    // A->B;C:-call(C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // A->B;C:-[call('SxxMachine':C)]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$002D$003E_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op(FILE_system::PRED_call_1_static_exec, VA(a3), cont);
    }
/** PREDICATE: (->)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((->)/2,public)




    public static Operation PRED_$002D$003E_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A->B:-call(A),!,call(B)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A->B:-['$get_level'(C),call('SxxMachine':A),'$cut'(C),call('SxxMachine':B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op(FILE_system::PRED_call_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_call_1_static_exec, VA(a5), cont)));
    }
/** PREDICATE: call/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(call/1,public)
        final static SymbolTerm ATOM_user = SYM("user");
        final static SymbolTerm ATOM_interpret = SYM("interpret");




    public static Operation PRED_call_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // call(A):-'$get_current_B'(B),'$meta_call'(A,user,B,0,interpret)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // call(A):-['$get_current_B'(B),'$meta_call'(A,user,B,0,interpret)]
        a2 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$get_current_B_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a1,  ATOM_user , a2,  int_0 ,  ATOM_interpret ), cont));
    }
/** PREDICATE: $meta_call/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$meta_call'/5,non-(public))
        final static SymbolTerm ATOM_var = SYM("var");
        final static SymbolTerm FUNCTOR_call_1 = F("call",1);
        final static SymbolTerm ATOM_trace = SYM("trace");
        final static SymbolTerm ATOM_debug = SYM("debug");
        final static SymbolTerm ATOM_notrace = SYM("notrace");
        final static SymbolTerm ATOM_nodebug = SYM("nodebug");
        final static SymbolTerm FUNCTOR_spy_1 = F("spy",1);
        final static SymbolTerm FUNCTOR_nospy_1 = F("nospy",1);
        final static SymbolTerm ATOM_nospyall = SYM("nospyall");
        final static SymbolTerm FUNCTOR_leash_1 = F("leash",1);
        final static SymbolTerm FUNCTOR_$005E_2 = F("^",2);
        final static SymbolTerm ATOM_$0021 = SYM("!");
        final static SymbolTerm ATOM_no = SYM("no");
        final static SymbolTerm FUNCTOR_context_2 = F("context",2);
        final static SymbolTerm ATOM_if = SYM("if");
        final static SymbolTerm ATOM_cut = SYM("cut");
    private static final StructureTerm L_$meta_call_5_s21 = S( FUNCTOR_context_2 ,  ATOM_if ,  ATOM_cut );
        final static SymbolTerm FUNCTOR_$002C_2 = F(",",2);
        final static SymbolTerm FUNCTOR_or_2 = F(";",2);
        final static SymbolTerm FUNCTOR_$005C$002B_1 = F("\\+",1);
        final static SymbolTerm FUNCTOR_findall_3 = F("findall",3);
        final static SymbolTerm FUNCTOR_bagof_3 = F("bagof",3);
        final static SymbolTerm FUNCTOR_setof_3 = F("setof",3);
        final static SymbolTerm FUNCTOR_once_1 = F("once",1);
        final static SymbolTerm FUNCTOR_on_exception_3 = F("on_exception",3);
        final static SymbolTerm FUNCTOR_catch_3 = F("catch",3);
        final static SymbolTerm FUNCTOR_synchronized_2 = F("synchronized",2);
        final static SymbolTerm FUNCTOR_clause_2 = F("clause",2);
        final static SymbolTerm FUNCTOR_assert_1 = F("assert",1);
        final static SymbolTerm FUNCTOR_assertz_1 = F("assertz",1);
        final static SymbolTerm FUNCTOR_asserta_1 = F("asserta",1);
        final static SymbolTerm FUNCTOR_retract_1 = F("retract",1);
        final static SymbolTerm FUNCTOR_abolish_1 = F("abolish",1);
        final static SymbolTerm FUNCTOR_retractall_1 = F("retractall",1);
        final static SymbolTerm FUNCTOR_type_1 = F("type",1);
        final static SymbolTerm ATOM_callable = SYM("callable");
    private static final StructureTerm L_$meta_call_5_s44 = S( FUNCTOR_type_1 ,  ATOM_callable );

    // private final Term arg5;




    public static Operation PRED_$meta_call_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $meta_call_5_top(m);
    }

    private final static Operation $meta_call_5_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$meta_call_5_var, FILE_builtins::$meta_call_5_int, FILE_builtins::$meta_call_5_int, FILE_builtins::$meta_call_5_con, FILE_builtins::$meta_call_5_str, FILE_builtins::$meta_call_5_lis); 
    }

    private final static Operation $meta_call_5_var(Prolog m) { 
        m.jtry5(null, FILE_builtins::$meta_call_5_var_1);
        return $meta_call_5_1(m);
    }

    private final static Operation $meta_call_5_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_2);
        return $meta_call_5_2(m);
    }

    private final static Operation $meta_call_5_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_3);
        return $meta_call_5_3(m);
    }

    private final static Operation $meta_call_5_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_4);
        return $meta_call_5_4(m);
    }

    private final static Operation $meta_call_5_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_5);
        return $meta_call_5_5(m);
    }

    private final static Operation $meta_call_5_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_6);
        return $meta_call_5_6(m);
    }

    private final static Operation $meta_call_5_var_6(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_7);
        return $meta_call_5_7(m);
    }

    private final static Operation $meta_call_5_var_7(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_8);
        return $meta_call_5_8(m);
    }

    private final static Operation $meta_call_5_var_8(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_9);
        return $meta_call_5_9(m);
    }

    private final static Operation $meta_call_5_var_9(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_10);
        return $meta_call_5_10(m);
    }

    private final static Operation $meta_call_5_var_10(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_11);
        return $meta_call_5_11(m);
    }

    private final static Operation $meta_call_5_var_11(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_12);
        return $meta_call_5_12(m);
    }

    private final static Operation $meta_call_5_var_12(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_13);
        return $meta_call_5_13(m);
    }

    private final static Operation $meta_call_5_var_13(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_14);
        return $meta_call_5_14(m);
    }

    private final static Operation $meta_call_5_var_14(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_15);
        return $meta_call_5_15(m);
    }

    private final static Operation $meta_call_5_var_15(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_16);
        return $meta_call_5_16(m);
    }

    private final static Operation $meta_call_5_var_16(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_17);
        return $meta_call_5_17(m);
    }

    private final static Operation $meta_call_5_var_17(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_18);
        return $meta_call_5_18(m);
    }

    private final static Operation $meta_call_5_var_18(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_19);
        return $meta_call_5_19(m);
    }

    private final static Operation $meta_call_5_var_19(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_20);
        return $meta_call_5_20(m);
    }

    private final static Operation $meta_call_5_var_20(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_21);
        return $meta_call_5_21(m);
    }

    private final static Operation $meta_call_5_var_21(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_22);
        return $meta_call_5_22(m);
    }

    private final static Operation $meta_call_5_var_22(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_23);
        return $meta_call_5_23(m);
    }

    private final static Operation $meta_call_5_var_23(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_24);
        return $meta_call_5_24(m);
    }

    private final static Operation $meta_call_5_var_24(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_25);
        return $meta_call_5_25(m);
    }

    private final static Operation $meta_call_5_var_25(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_26);
        return $meta_call_5_26(m);
    }

    private final static Operation $meta_call_5_var_26(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_27);
        return $meta_call_5_27(m);
    }

    private final static Operation $meta_call_5_var_27(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_28);
        return $meta_call_5_28(m);
    }

    private final static Operation $meta_call_5_var_28(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_29);
        return $meta_call_5_29(m);
    }

    private final static Operation $meta_call_5_var_29(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_30);
        return $meta_call_5_30(m);
    }

    private final static Operation $meta_call_5_var_30(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_31);
        return $meta_call_5_31(m);
    }

    private final static Operation $meta_call_5_var_31(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_32);
        return $meta_call_5_32(m);
    }

    private final static Operation $meta_call_5_var_32(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_33);
        return $meta_call_5_33(m);
    }

    private final static Operation $meta_call_5_var_33(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_34);
        return $meta_call_5_34(m);
    }

    private final static Operation $meta_call_5_var_34(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_35);
        return $meta_call_5_35(m);
    }

    private final static Operation $meta_call_5_var_35(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_var_36);
        return $meta_call_5_36(m);
    }

    private final static Operation $meta_call_5_var_36(Prolog m) { 
        m.trust(null);
        return $meta_call_5_37(m);
    }

    private final static Operation $meta_call_5_int(Prolog m) { 
        m.jtry5(null, FILE_builtins::$meta_call_5_int_1);
        return $meta_call_5_1(m);
    }

    private final static Operation $meta_call_5_int_1(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_int_2);
        return $meta_call_5_2(m);
    }

    private final static Operation $meta_call_5_int_2(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_int_3);
        return $meta_call_5_36(m);
    }

    private final static Operation $meta_call_5_int_3(Prolog m) { 
        m.trust(null);
        return $meta_call_5_37(m);
    }

    private final static Operation $meta_call_5_con(Prolog m) { 
        m.jtry5(null, FILE_builtins::$meta_call_5_con_1);
        return $meta_call_5_1(m);
    }

    private final static Operation $meta_call_5_con_1(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_con_2);
        return $meta_call_5_2(m);
    }

    private final static Operation $meta_call_5_con_2(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_con_3);
        return $meta_call_5_3(m);
    }

    private final static Operation $meta_call_5_con_3(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_con_4);
        return $meta_call_5_4(m);
    }

    private final static Operation $meta_call_5_con_4(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_con_5);
        return $meta_call_5_5(m);
    }

    private final static Operation $meta_call_5_con_5(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_con_6);
        return $meta_call_5_6(m);
    }

    private final static Operation $meta_call_5_con_6(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_con_7);
        return $meta_call_5_7(m);
    }

    private final static Operation $meta_call_5_con_7(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_con_8);
        return $meta_call_5_10(m);
    }

    private final static Operation $meta_call_5_con_8(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_con_9);
        return $meta_call_5_15(m);
    }

    private final static Operation $meta_call_5_con_9(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_con_10);
        return $meta_call_5_16(m);
    }

    private final static Operation $meta_call_5_con_10(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_con_11);
        return $meta_call_5_36(m);
    }

    private final static Operation $meta_call_5_con_11(Prolog m) { 
        m.trust(null);
        return $meta_call_5_37(m);
    }

    private final static Operation $meta_call_5_str(Prolog m) { 
        m.jtry5(null, FILE_builtins::$meta_call_5_str_1);
        return $meta_call_5_1(m);
    }

    private final static Operation $meta_call_5_str_1(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_2);
        return $meta_call_5_2(m);
    }

    private final static Operation $meta_call_5_str_2(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_3);
        return $meta_call_5_8(m);
    }

    private final static Operation $meta_call_5_str_3(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_4);
        return $meta_call_5_9(m);
    }

    private final static Operation $meta_call_5_str_4(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_5);
        return $meta_call_5_11(m);
    }

    private final static Operation $meta_call_5_str_5(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_6);
        return $meta_call_5_13(m);
    }

    private final static Operation $meta_call_5_str_6(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_7);
        return $meta_call_5_14(m);
    }

    private final static Operation $meta_call_5_str_7(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_8);
        return $meta_call_5_17(m);
    }

    private final static Operation $meta_call_5_str_8(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_9);
        return $meta_call_5_18(m);
    }

    private final static Operation $meta_call_5_str_9(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_10);
        return $meta_call_5_19(m);
    }

    private final static Operation $meta_call_5_str_10(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_11);
        return $meta_call_5_20(m);
    }

    private final static Operation $meta_call_5_str_11(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_12);
        return $meta_call_5_21(m);
    }

    private final static Operation $meta_call_5_str_12(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_13);
        return $meta_call_5_22(m);
    }

    private final static Operation $meta_call_5_str_13(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_14);
        return $meta_call_5_23(m);
    }

    private final static Operation $meta_call_5_str_14(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_15);
        return $meta_call_5_24(m);
    }

    private final static Operation $meta_call_5_str_15(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_16);
        return $meta_call_5_25(m);
    }

    private final static Operation $meta_call_5_str_16(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_17);
        return $meta_call_5_26(m);
    }

    private final static Operation $meta_call_5_str_17(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_18);
        return $meta_call_5_27(m);
    }

    private final static Operation $meta_call_5_str_18(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_19);
        return $meta_call_5_28(m);
    }

    private final static Operation $meta_call_5_str_19(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_20);
        return $meta_call_5_29(m);
    }

    private final static Operation $meta_call_5_str_20(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_21);
        return $meta_call_5_30(m);
    }

    private final static Operation $meta_call_5_str_21(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_22);
        return $meta_call_5_31(m);
    }

    private final static Operation $meta_call_5_str_22(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_23);
        return $meta_call_5_32(m);
    }

    private final static Operation $meta_call_5_str_23(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_24);
        return $meta_call_5_33(m);
    }

    private final static Operation $meta_call_5_str_24(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_25);
        return $meta_call_5_34(m);
    }

    private final static Operation $meta_call_5_str_25(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_26);
        return $meta_call_5_35(m);
    }

    private final static Operation $meta_call_5_str_26(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_str_27);
        return $meta_call_5_36(m);
    }

    private final static Operation $meta_call_5_str_27(Prolog m) { 
        m.trust(null);
        return $meta_call_5_37(m);
    }

    private final static Operation $meta_call_5_lis(Prolog m) { 
        m.jtry5(null, FILE_builtins::$meta_call_5_lis_1);
        return $meta_call_5_1(m);
    }

    private final static Operation $meta_call_5_lis_1(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_lis_2);
        return $meta_call_5_2(m);
    }

    private final static Operation $meta_call_5_lis_2(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_lis_3);
        return $meta_call_5_12(m);
    }

    private final static Operation $meta_call_5_lis_3(Prolog m) { 
        m.retry(null, FILE_builtins::$meta_call_5_lis_4);
        return $meta_call_5_36(m);
    }

    private final static Operation $meta_call_5_lis_4(Prolog m) { 
        m.trust(null);
        return $meta_call_5_37(m);
    }

    private final static Operation $meta_call_5_1(Prolog m) { 
    // '$meta_call'(A,B,C,D,E):-var(A),!,illarg(var,call(A),1)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(A,B,C,D,E):-['$get_level'(F),var(A),'$cut'(F),illarg(var,call(A),1)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_call_1'),y(1),a(7))
        a7 =  S( FUNCTOR_call_1 , a1);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a7,  int_1 ), cont);
    }

    private final static Operation $meta_call_5_2(Prolog m) { 
    // '$meta_call'(A,B,C,D,E):-closure(A),!,'$call_closure'(A)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(A,B,C,D,E):-['$get_level'(F),closure(A),'$cut'(F),'$call_closure'(A)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of closure(a(1))
        a1 = a1.dref();
        if (! (a1 .isClosure())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$call_closure_1_static_exec, VA(a1), cont);
    }

    private final static Operation $meta_call_5_3(Prolog m) { 
    // '$meta_call'(true,A,B,C,D):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(true,A,B,C,D):-['$neck_cut']
        if (!  Prolog.True .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $meta_call_5_4(Prolog m) { 
    // '$meta_call'(trace,A,B,C,D):-!,trace
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(trace,A,B,C,D):-['$neck_cut',trace]
        if (!  ATOM_trace .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_trace_0_static_exec, VA(), cont);
    }

    private final static Operation $meta_call_5_5(Prolog m) { 
    // '$meta_call'(debug,A,B,C,D):-!,debug
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(debug,A,B,C,D):-['$neck_cut',debug]
        if (!  ATOM_debug .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_debug_0_static_exec, VA(), cont);
    }

    private final static Operation $meta_call_5_6(Prolog m) { 
    // '$meta_call'(notrace,A,B,C,D):-!,notrace
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(notrace,A,B,C,D):-['$neck_cut',notrace]
        if (!  ATOM_notrace .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_notrace_0_static_exec, VA(), cont);
    }

    private final static Operation $meta_call_5_7(Prolog m) { 
    // '$meta_call'(nodebug,A,B,C,D):-!,nodebug
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(nodebug,A,B,C,D):-['$neck_cut',nodebug]
        if (!  ATOM_nodebug .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_nodebug_0_static_exec, VA(), cont);
    }

    private final static Operation $meta_call_5_8(Prolog m) { 
    // '$meta_call'(spy(A),B,C,D,E):-!,spy(A)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(spy(A),B,C,D,E):-['$neck_cut',spy(A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_spy_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_spy_1_static_exec, VA(a6), cont);
    }

    private final static Operation $meta_call_5_9(Prolog m) { 
    // '$meta_call'(nospy(A),B,C,D,E):-!,nospy(A)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(nospy(A),B,C,D,E):-['$neck_cut',nospy(A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_nospy_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_nospy_1_static_exec, VA(a6), cont);
    }

    private final static Operation $meta_call_5_10(Prolog m) { 
    // '$meta_call'(nospyall,A,B,C,D):-!,nospyall
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(nospyall,A,B,C,D):-['$neck_cut',nospyall]
        if (!  ATOM_nospyall .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_nospyall_0_static_exec, VA(), cont);
    }

    private final static Operation $meta_call_5_11(Prolog m) { 
    // '$meta_call'(leash(A),B,C,D,E):-!,leash(A)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(leash(A),B,C,D,E):-['$neck_cut',leash(A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_leash_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_leash_1_static_exec, VA(a6), cont);
    }

    private final static Operation $meta_call_5_12(Prolog m) { 
    // '$meta_call'([A|B],C,D,E,F):-!,consult([A|B])
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'([A|B],C,D,E,F):-['$neck_cut',consult([A|B])]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a6 = a1.car();
            a7 = a1.cdr();
        } else if (a1.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a1.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a8 = CONS(a6, a7);
        return //
 Op(FILE_system::PRED_consult_1_static_exec, VA(a8), cont);
    }

    private final static Operation $meta_call_5_13(Prolog m) { 
    // '$meta_call'(A^B,C,D,E,F):-!,'$meta_call'(B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(A^B,C,D,E,F):-['$neck_cut','$meta_call'(B,C,D,E,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$005E_2 , m.trail, m.DONT_CARE1(), a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
m.cont = cont;
        return $meta_call_5_top(m);
    }

    private final static Operation $meta_call_5_14(Prolog m) { 
    // '$meta_call'(A:B,C,D,E,F):-!,'$meta_call'(B,A,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(A:B,C,D,E,F):-['$neck_cut','$meta_call'(B,A,D,E,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a7;
        m.AREGS[1] = a6;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
m.cont = cont;
        return $meta_call_5_top(m);
    }

    private final static Operation $meta_call_5_15(Prolog m) { 
    // '$meta_call'(!,A,no,B,C):-!,illarg(context(if,cut),!,0)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(!,A,no,B,C):-['$neck_cut',illarg(context(if,cut),!,0)]
        if (!  ATOM_$0021 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_no .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$meta_call_5_s21,  ATOM_$0021 ,  int_0 ), cont);
    }

    private final static Operation $meta_call_5_16(Prolog m) { 
    // '$meta_call'(!,A,B,C,D):-!,'$cut'(B)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(!,A,B,C,D):-['$get_level'(E),'$neck_cut','$cut'(B)]
        if (!  ATOM_$0021 .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $get_level(void)
        if (! m.mkvar3().unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $meta_call_5_17(Prolog m) { 
    // '$meta_call'((A,B),C,D,E,F):-!,'$meta_call'(A,C,D,E,F),'$meta_call'(B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'((A,B),C,D,E,F):-['$neck_cut','$meta_call'(A,C,D,E,F),'$meta_call'(B,C,D,E,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002C_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a7, a2, a3, a4, a5), cont);
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.cont = p1;
        return $meta_call_5_top(m);
    }

    private final static Operation $meta_call_5_18(Prolog m) { 
    // '$meta_call'((A->B;C),D,E,F,G):-!,'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'((A->B;C),D,E,F,G):-['$neck_cut','$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F,G)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_or_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a8, a9)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_static_exec, VA(a8, a9, a7, a2, a3, a4, a5), cont);
    }

    private final static Operation $meta_call_5_19(Prolog m) { 
    // '$meta_call'((A->B),C,D,E,F):-!,'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'((A->B),C,D,E,F):-['$neck_cut','$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec, VA(a6, a7, a2, a3, a4, a5), cont);
    }

    private final static Operation $meta_call_5_20(Prolog m) { 
    // '$meta_call'((A;B),C,D,E,F):-!,'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'((A;B),C,D,E,F):-['$neck_cut','$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_or_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec, VA(a6, a7, a2, a3, a4, a5), cont);
    }

    private final static Operation $meta_call_5_21(Prolog m) { 
    // '$meta_call'(\+A,B,C,D,E):-!,'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,D,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(\+A,B,C,D,E):-['$neck_cut','$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,D,E)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$005C$002B_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec, VA(a6, a2, a4, a5), cont);
    }

    private final static Operation $meta_call_5_22(Prolog m) { 
    // '$meta_call'(findall(A,B,C),D,E,F,G):-!,findall(A,'$meta_call'(B,D,E,F,G),C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(findall(A,B,C),D,E,F,G):-['$neck_cut',findall(A,'SxxMachine':'$meta_call'(B,D,E,F,G),C)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_findall_3 , m.trail, a6, a7, a8)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a9 = Closure( //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a7, a2, a3, a4, a5), null));
        return //
 Op(FILE_system::PRED_findall_3_static_exec, VA(a6, a9, a8), cont);
    }

    private final static Operation $meta_call_5_23(Prolog m) { 
    // '$meta_call'(bagof(A,B,C),D,E,F,G):-!,bagof(A,'$meta_call'(B,D,E,F,G),C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(bagof(A,B,C),D,E,F,G):-['$neck_cut',bagof(A,'SxxMachine':'$meta_call'(B,D,E,F,G),C)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_bagof_3 , m.trail, a6, a7, a8)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a9 = Closure( //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a7, a2, a3, a4, a5), null));
        return //
 Op(FILE_system::PRED_bagof_3_static_exec, VA(a6, a9, a8), cont);
    }

    private final static Operation $meta_call_5_24(Prolog m) { 
    // '$meta_call'(setof(A,B,C),D,E,F,G):-!,setof(A,'$meta_call'(B,D,E,F,G),C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(setof(A,B,C),D,E,F,G):-['$neck_cut',setof(A,'SxxMachine':'$meta_call'(B,D,E,F,G),C)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_setof_3 , m.trail, a6, a7, a8)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a9 = Closure( //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a7, a2, a3, a4, a5), null));
        return //
 Op(FILE_system::PRED_setof_3_static_exec, VA(a6, a9, a8), cont);
    }

    private final static Operation $meta_call_5_25(Prolog m) { 
    // '$meta_call'(once(A),B,C,D,E):-!,once('$meta_call'(A,B,C,D,E))
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(once(A),B,C,D,E):-['$neck_cut',once('SxxMachine':'$meta_call'(A,B,C,D,E))]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_once_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a7 = Closure( //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a6, a2, a3, a4, a5), null));
        return //
 Op(FILE_system::PRED_once_1_static_exec, VA(a7), cont);
    }

    private final static Operation $meta_call_5_26(Prolog m) { 
    // '$meta_call'(on_exception(A,B,C),D,E,F,G):-!,on_exception(A,'$meta_call'(B,D,E,F,G),'$meta_call'(C,D,E,F,G))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(on_exception(A,B,C),D,E,F,G):-['$neck_cut',on_exception(A,'SxxMachine':'$meta_call'(B,D,E,F,G),'SxxMachine':'$meta_call'(C,D,E,F,G))]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_on_exception_3 , m.trail, a6, a7, a8)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a9 = Closure( //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a7, a2, a3, a4, a5), null));
        a10 = Closure( //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a8, a2, a3, a4, a5), null));
        return //
 Op(FILE_system::PRED_on_exception_3_static_exec, VA(a6, a9, a10), cont);
    }

    private final static Operation $meta_call_5_27(Prolog m) { 
    // '$meta_call'(catch(A,B,C),D,E,F,G):-!,catch('$meta_call'(A,D,E,F,G),B,'$meta_call'(C,D,E,F,G))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(catch(A,B,C),D,E,F,G):-['$neck_cut',catch('SxxMachine':'$meta_call'(A,D,E,F,G),B,'SxxMachine':'$meta_call'(C,D,E,F,G))]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_catch_3 , m.trail, a6, a7, a8)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a9 = Closure( //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a6, a2, a3, a4, a5), null));
        a10 = Closure( //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a8, a2, a3, a4, a5), null));
        return //
 Op(FILE_builtins::PRED_catch_3_static_exec, VA(a9, a7, a10), cont);
    }

    private final static Operation $meta_call_5_28(Prolog m) { 
    // '$meta_call'(synchronized(A,B),C,D,E,F):-!,synchronized(A,'$meta_call'(B,C,D,E,F))
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(synchronized(A,B),C,D,E,F):-['$neck_cut',synchronized(A,'SxxMachine':'$meta_call'(B,C,D,E,F))]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_synchronized_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a8 = Closure( //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a7, a2, a3, a4, a5), null));
        return //
 Op(FILE_system::PRED_synchronized_2_static_exec, VA(a6, a8), cont);
    }

    private final static Operation $meta_call_5_29(Prolog m) { 
    // '$meta_call'(clause(A,B),C,D,E,F):-!,clause(C:A,B)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(clause(A,B),C,D,E,F):-['$neck_cut',clause(C:A,B)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_clause_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(2),a(6)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(8))
        a8 =  S( FUNCTOR_module_colon_2 , a2, a6);
 ;
        return //
 Op(FILE_system::PRED_clause_2_static_exec, VA(a8, a7), cont);
    }

    private final static Operation $meta_call_5_30(Prolog m) { 
    // '$meta_call'(assert(A),B,C,D,E):-!,assertz(B:A)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(assert(A),B,C,D,E):-['$neck_cut',assertz(B:A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_assert_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(2),a(6)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a2, a6);
 ;
        return //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(a7), cont);
    }

    private final static Operation $meta_call_5_31(Prolog m) { 
    // '$meta_call'(assertz(A),B,C,D,E):-!,assertz(B:A)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(assertz(A),B,C,D,E):-['$neck_cut',assertz(B:A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_assertz_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(2),a(6)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a2, a6);
 ;
        return //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(a7), cont);
    }

    private final static Operation $meta_call_5_32(Prolog m) { 
    // '$meta_call'(asserta(A),B,C,D,E):-!,asserta(B:A)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(asserta(A),B,C,D,E):-['$neck_cut',asserta(B:A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_asserta_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(2),a(6)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a2, a6);
 ;
        return //
 Op(FILE_system::PRED_asserta_1_static_exec, VA(a7), cont);
    }

    private final static Operation $meta_call_5_33(Prolog m) { 
    // '$meta_call'(retract(A),B,C,D,E):-!,retract(B:A)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(retract(A),B,C,D,E):-['$neck_cut',retract(B:A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_retract_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(2),a(6)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a2, a6);
 ;
        return //
 Op(FILE_system::PRED_retract_1_static_exec, VA(a7), cont);
    }

    private final static Operation $meta_call_5_34(Prolog m) { 
    // '$meta_call'(abolish(A),B,C,D,E):-!,abolish(B:A)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(abolish(A),B,C,D,E):-['$neck_cut',abolish(B:A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_abolish_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(2),a(6)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a2, a6);
 ;
        return //
 Op(FILE_system::PRED_abolish_1_static_exec, VA(a7), cont);
    }

    private final static Operation $meta_call_5_35(Prolog m) { 
    // '$meta_call'(retractall(A),B,C,D,E):-!,retractall(B:A)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(retractall(A),B,C,D,E):-['$neck_cut',retractall(B:A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_retractall_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(2),a(6)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a2, a6);
 ;
        return //
 Op(FILE_system::PRED_retractall_1_static_exec, VA(a7), cont);
    }

    private final static Operation $meta_call_5_36(Prolog m) { 
    // '$meta_call'(A,B,C,D,E):-atom(B),callable(A),!,'$meta_call'(E,D,B,A)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(A,B,C,D,E):-['$get_level'(F),atom(B),callable(A),'$cut'(F),'$meta_call'(E,D,B,A)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(2))
        a2 = a2.dref();
        if (! (a2 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_callable_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a6), //
 Op(FILE_system::PRED_$meta_call_4_static_exec, VA(a5, a4, a2, a1), cont)));
    }

    private final static Operation $meta_call_5_37(Prolog m) { 
    // '$meta_call'(A,B,C,D,E):-illarg(type(callable),call(B:A),1)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$meta_call'(A,B,C,D,E):-[illarg(type(callable),call(B:A),1)]
    // put_str_args([a(2),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(6))
        a6 =  S( FUNCTOR_module_colon_2 , a2, a1);
 ;
    // put_str_args([a(6)],y(2)),put_str(@('FUNCTOR_call_1'),y(2),a(7))
        a7 =  S( FUNCTOR_call_1 , a6);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$meta_call_5_s44, a7,  int_1 ), cont);
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/7,non-(public))

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_builtins::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F,G):-'$meta_call'(A,D,no,F,G),!,'$meta_call'(B,D,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F,G):-['$get_level'(H),'$meta_call'(A,D,no,F,G),'$cut'(H),'$meta_call'(B,D,E,F,G)]
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a1, a4,  ATOM_no , a6, a7), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a8), //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a2, a4, a5, a6, a7), cont)));
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F,G):-'$meta_call'(C,D,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F,G):-['$meta_call'(C,D,E,F,G)]
        return //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a3, a4, a5, a6, a7), cont);
    }
/** PREDICATE: $dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/6,non-(public))

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_builtins::$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_1);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_1(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_2(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_1(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-'$meta_call'(A,C,no,E,F),!,'$meta_call'(B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-['$get_level'(G),'$meta_call'(A,C,no,E,F),'$cut'(G),'$meta_call'(B,C,D,E,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a1, a3,  ATOM_no , a5, a6), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a7), //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a2, a3, a4, a5, a6), cont)));
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_2(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-fail
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/6,non-(public))

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_builtins::$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_1);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_1(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_2(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_1(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-'$meta_call'(A,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-['$meta_call'(A,C,D,E,F)]
        return //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a1, a3, a4, a5, a6), cont);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_2(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-'$meta_call'(B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-['$meta_call'(B,C,D,E,F)]
        return //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a2, a3, a4, a5, a6), cont);
    }
/** PREDICATE: $dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/4,non-(public))




    public static Operation PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_builtins::$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_sub_1);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_1(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_2(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_1(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-'$meta_call'(A,B,no,C,D),!,fail
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-['$get_level'(E),'$meta_call'(A,B,no,C,D),'$cut'(E),fail]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a1, a2,  ATOM_no , a3, a4), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a5), fail_0));
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_2(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-[]
        return cont;
    }
/** PREDICATE: $meta_call/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$meta_call'/4,non-(public))
        final static SymbolTerm FUNCTOR_$002F_2 = F("/",2);




    public static Operation PRED_$meta_call_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$meta_call_4_var, fail_0, fail_0, FILE_builtins::$meta_call_4_var, fail_0, fail_0); 
    }

    private final static Operation $meta_call_4_var(Prolog m) { 
        m.jtry4(null, FILE_builtins::$meta_call_4_var_1);
        return $meta_call_4_1(m);
    }

    private final static Operation $meta_call_4_var_1(Prolog m) { 
        m.trust(null);
        return $meta_call_4_2(m);
    }

    private final static Operation $meta_call_4_1(Prolog m) { 
    // '$meta_call'(trace,A,B,C):-!,functor(C,D,E),'$trace_goal'(C,B,D/E,A)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$meta_call'(trace,A,B,C):-['$neck_cut',functor(C,D,E),'$trace_goal'(C,B,D/E,A)]
        if (!  ATOM_trace .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
    // put_str_args([a(5),a(6)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(7))
        a7 =  S( FUNCTOR_$002F_2 , a5, a6);
 ;
        return //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a4, a5, a6), //
 Op(FILE_system::PRED_$trace_goal_4_static_exec, VA(a4, a3, a7, a2), cont));
    }

    private final static Operation $meta_call_4_2(Prolog m) { 
    // '$meta_call'(interpret,A,B,C):-functor(C,D,E),'$call_internal'(C,B,D/E,A,interpret)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$meta_call'(interpret,A,B,C):-[functor(C,D,E),'$call_internal'(C,B,D/E,A,interpret)]
        if (!  ATOM_interpret .unify(a1, m.trail))
            return m.fail();
        a5 = m.mkvar1();
        a6 = m.mkvar1();
    // put_str_args([a(5),a(6)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(7))
        a7 =  S( FUNCTOR_$002F_2 , a5, a6);
 ;
        return //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a4, a5, a6), //
 Op(FILE_system::PRED_$call_internal_5_static_exec, VA(a4, a3, a7, a2,  ATOM_interpret ), cont));
    }
/** PREDICATE: $call_internal/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$call_internal'/5,non-(public))
        final static SymbolTerm FUNCTOR_$002B_2 = F("+",2);

    // private final Term arg5;




    public static Operation PRED_$call_internal_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_builtins::$call_internal_5_sub_1);
        return $call_internal_5_1(m);
    }

    private final static Operation $call_internal_5_sub_1(Prolog m) { 
        m.trust(null);
        return $call_internal_5_2(m);
    }

    private final static Operation $call_internal_5_1(Prolog m) { 
    // '$call_internal'(A,B,C,D,E):-'$new_internal_database'(B),hash_contains_key(B,C),!,'$get_current_B'(F),G is D+1,clause(B:A,H),'$meta_call'(H,B,F,G,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$call_internal'(A,B,C,D,E):-['$get_level'(F),'$new_internal_database'(B),hash_contains_key(B,C),'$cut'(F),'$get_current_B'(G),H is D+1,clause(B:A,I),'$meta_call'(I,B,G,H,E)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        a8 = m.mkvar1();
    // put_str_args([a(4),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(9))
        a9 =  S( FUNCTOR_$002B_2 , a4,  int_1 );
 ;
    // put_str_args([a(2),a(1)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(10))
        a10 =  S( FUNCTOR_module_colon_2 , a2, a1);
 ;
        a11 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$new_internal_database_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_hash_contains_key_2_static_exec, VA(a2, a3), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a6), //
 Op(FILE_system::PRED_$get_current_B_1_static_exec, VA(a7), //
 Op(FILE_builtins::PRED_is_2_static_exec, VA(a8, a9), //
 Op(FILE_system::PRED_clause_2_static_exec, VA(a10, a11), //
 Op(FILE_system::PRED_$meta_call_5_static_exec, VA(a11, a2, a7, a8, a5), cont)))))));
    }

    private final static Operation $call_internal_5_2(Prolog m) { 
    // '$call_internal'(A,B,C,D,E):-'$call'(B,A)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$call_internal'(A,B,C,D,E):-['$call'(B,A)]
        return //
 Op(FILE_system::PRED_$call_2_static_exec, VA(a2, a1), cont);
    }
/** PREDICATE: catch/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(catch/3,public)




    public static Operation PRED_catch_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // catch(A,B,C):-on_exception(B,A,C)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // catch(A,B,C):-[on_exception(B,'SxxMachine':A,'SxxMachine':C)]
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a3);
 ;
        return //
 Op(FILE_system::PRED_on_exception_3_static_exec, VA(a2, a4, a5), cont);
    }
/** PREDICATE: throw/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(throw/1,public)




    public static Operation PRED_throw_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // throw(A):-raise_exception(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // throw(A):-[raise_exception(A)]
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: on_exception/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(on_exception/3,public)
    private static final StructureTerm L_on_exception_3_s4 = S( FUNCTOR_type_1 ,  ATOM_callable );




    public static Operation PRED_on_exception_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::on_exception_3_sub_1);
        return on_exception_3_1(m);
    }

    private final static Operation on_exception_3_sub_1(Prolog m) { 
        m.trust(null);
        return on_exception_3_2(m);
    }

    private final static Operation on_exception_3_1(Prolog m) { 
    // on_exception(A,B,C):-callable(B),!,'$on_exception'(A,B,C)
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // on_exception(A,B,C):-['$get_level'(D),callable(B),'$cut'(D),'$on_exception'(A,B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_callable_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$on_exception_3_static_exec, VA(a1, a2, a3), cont)));
    }

    private final static Operation on_exception_3_2(Prolog m) { 
    // on_exception(A,B,C):-illarg(type(callable),on_exception(A,B,C),2)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // on_exception(A,B,C):-[illarg(type(callable),on_exception(A,B,C),2)]
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_on_exception_3'),y(1),a(4))
        a4 =  S( FUNCTOR_on_exception_3 , a1, a2, a3);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_on_exception_3_s4, a4,  int_2 ), cont);
    }
/** PREDICATE: $on_exception/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$on_exception'/3,non-(public))
        final static SymbolTerm ATOM_$0024none = SYM("$none");




    public static Operation PRED_$on_exception_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$on_exception_3_sub_1);
        return $on_exception_3_1(m);
    }

    private final static Operation $on_exception_3_sub_1(Prolog m) { 
        m.trust(null);
        return $on_exception_3_2(m);
    }

    private final static Operation $on_exception_3_1(Prolog m) { 
    // '$on_exception'(A,B,C):-'$set_exception'('$none'),'$begin_exception'(D),call(B),'$end_exception'(D)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$on_exception'(A,B,C):-['$set_exception'('$none'),'$begin_exception'(D),call('SxxMachine':B),'$end_exception'(D)]
        a4 = m.mkvar1();
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op(FILE_system::PRED_$set_exception_1_static_exec, VA( ATOM_$0024none ), //
 Op(FILE_system::PRED_$begin_exception_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_call_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_$end_exception_1_static_exec, VA(a4), cont))));
    }

    private final static Operation $on_exception_3_2(Prolog m) { 
    // '$on_exception'(A,B,C):-'$get_exception'(D),D\=='$none','$catch_and_throw'(D,A,C)
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$on_exception'(A,B,C):-['$get_exception'(D),'$inequality_of_term'(D,'$none'),'$catch_and_throw'(D,A,C)]
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$get_exception_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$inequality_of_term_2_static_exec, VA(a4,  ATOM_$0024none ), //
 Op(FILE_system::PRED_$catch_and_throw_3_static_exec, VA(a4, a1, a3), cont)));
    }
/** PREDICATE: $catch_and_throw/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$catch_and_throw'/3,non-(public))




    public static Operation PRED_$catch_and_throw_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$catch_and_throw_3_sub_1);
        return $catch_and_throw_3_1(m);
    }

    private final static Operation $catch_and_throw_3_sub_1(Prolog m) { 
        m.trust(null);
        return $catch_and_throw_3_2(m);
    }

    private final static Operation $catch_and_throw_3_1(Prolog m) { 
    // '$catch_and_throw'(A,A,B):-!,'$set_exception'('$none'),call(B)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$catch_and_throw'(A,A,B):-['$neck_cut','$set_exception'('$none'),call('SxxMachine':B)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(3)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a3);
 ;
        return //
 Op(FILE_system::PRED_$set_exception_1_static_exec, VA( ATOM_$0024none ), //
 Op(FILE_system::PRED_call_1_static_exec, VA(a4), cont));
    }

    private final static Operation $catch_and_throw_3_2(Prolog m) { 
    // '$catch_and_throw'(A,B,C):-raise_exception(A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$catch_and_throw'(A,B,C):-[raise_exception(A)]
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: (=)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((=)/2,public)




    public static Operation PRED_$003D_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A=B:-A=B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A=B:-['$unify'(A,B)]
        //START inline expansion of $unify(a(1),a(2))
        if (! a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $unify/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$unify'/2,public)




    public static Operation PRED_$unify_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$unify'(A,B):-'$unify'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$unify'(A,B):-['$unify'(A,B)]
        //START inline expansion of $unify(a(1),a(2))
        if (! a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (\=)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((\=)/2,public)




    public static Operation PRED_$005C$003D_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A\=B:-A\=B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A\=B:-['$not_unifiable'(A,B)]
        //START inline expansion of $not_unifiable(a(1),a(2))
        if (a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $not_unifiable/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$not_unifiable'/2,public)




    public static Operation PRED_$not_unifiable_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$not_unifiable'(A,B):-'$not_unifiable'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$not_unifiable'(A,B):-['$not_unifiable'(A,B)]
        //START inline expansion of $not_unifiable(a(1),a(2))
        if (a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: var/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(var/1,public)




    public static Operation PRED_var_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // var(A):-var(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // var(A):-[var(A)]
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: atom/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(atom/1,public)




    public static Operation PRED_atom_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // atom(A):-atom(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // atom(A):-[atom(A)]
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: integer/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(integer/1,public)




    public static Operation PRED_integer_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // integer(A):-integer(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // integer(A):-[integer(A)]
        //START inline expansion of integer(a(1))
        a1 = a1.dref();
        if (! (a1 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: long/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(long/1,public)




    public static Operation PRED_long_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // long(A):-long(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // long(A):-[long(A)]
        //START inline expansion of long(a(1))
        a1 = a1.dref();
        if (! (a1 .isLong())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: float/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(float/1,public)




    public static Operation PRED_float_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // float(A):-float(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // float(A):-[float(A)]
        //START inline expansion of float(a(1))
        a1 = a1.dref();
        if (! (a1 .isDouble())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: atomic/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(atomic/1,public)




    public static Operation PRED_atomic_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // atomic(A):-atomic(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // atomic(A):-[atomic(A)]
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: nonvar/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(nonvar/1,public)




    public static Operation PRED_nonvar_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // nonvar(A):-nonvar(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // nonvar(A):-[nonvar(A)]
        //START inline expansion of nonvar(a(1))
        a1 = a1.dref();
        if ((a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: number/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(number/1,public)




    public static Operation PRED_number_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // number(A):-number(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // number(A):-[number(A)]
        //START inline expansion of number(a(1))
        a1 = a1.dref();
        if (! a1.isNumber()) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: java/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(java/1,public)




    public static Operation PRED_java_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // java(A):-java(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // java(A):-[java(A)]
        //START inline expansion of java(a(1))
        a1 = a1.dref();
        if (! (a1 .isFFIObject())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: java/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(java/2,public)




    public static Operation PRED_java_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // java(A,B):-java(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // java(A,B):-[java(A,B)]
        //START inline expansion of java(a(1),a(2))
        a1 = a1.dref();
        if (! (a1 .isFFIObject())) {
            return m.fail();
        }
        if (! a2.unify(SYM(((FFIObjectTerm) a1).object().getClass().getName()), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: closure/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(closure/1,public)




    public static Operation PRED_closure_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // closure(A):-closure(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // closure(A):-[closure(A)]
        //START inline expansion of closure(a(1))
        a1 = a1.dref();
        if (! (a1 .isClosure())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: ground/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(ground/1,public)




    public static Operation PRED_ground_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // ground(A):-ground(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // ground(A):-[ground(A)]
        //START inline expansion of ground(a(1))
        a1 = a1.dref();
        if (! a1.isGround()) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: compound/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(compound/1,public)




    public static Operation PRED_compound_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // compound(A):-nonvar(A),functor(A,B,C),C>0
        m.setB0();
         Term a1, a2, a3;
        Operation p1, p2;
        a1 = LARG[0];
    // compound(A):-[nonvar(A),functor(A,B,C),D is 0,'$greater_than'(C,D)]
        //START inline expansion of nonvar(a(1))
        a1 = a1.dref();
        if ((a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        return //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a1, m.DONT_CARE2(), a2), //
 Op(FILE_builtins::PRED_is_2_static_exec, VA(a3,  int_0 ), //
 Op(FILE_system::PRED_$greater_than_2_static_exec, VA(a2, a3), cont)));
    }
/** PREDICATE: callable/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(callable/1,public)




    public static Operation PRED_callable_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::callable_1_sub_1);
        return callable_1_1(m);
    }

    private final static Operation callable_1_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::callable_1_sub_2);
        return callable_1_2(m);
    }

    private final static Operation callable_1_sub_2(Prolog m) { 
        m.trust(null);
        return callable_1_3(m);
    }

    private final static Operation callable_1_1(Prolog m) { 
    // callable(A):-atom(A),!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // callable(A):-['$get_level'(B),atom(A),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation callable_1_2(Prolog m) { 
    // callable(A):-compound(A),!
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // callable(A):-['$get_level'(B),compound(A),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_compound_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), cont));
    }

    private final static Operation callable_1_3(Prolog m) { 
    // callable(A):-closure(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // callable(A):-[closure(A)]
        //START inline expansion of closure(a(1))
        a1 = a1.dref();
        if (! (a1 .isClosure())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (==)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((==)/2,public)




    public static Operation PRED_$003D$003D_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A==B:-A==B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A==B:-['$equality_of_term'(A,B)]
        //START inline expansion of $equality_of_term(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (! a1.equalsTerm(a2)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $equality_of_term/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$equality_of_term'/2,public)




    public static Operation PRED_$equality_of_term_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$equality_of_term'(A,B):-'$equality_of_term'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$equality_of_term'(A,B):-['$equality_of_term'(A,B)]
        //START inline expansion of $equality_of_term(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (! a1.equalsTerm(a2)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (\==)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((\==)/2,public)




    public static Operation PRED_$005C$003D$003D_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A\==B:-A\==B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A\==B:-['$inequality_of_term'(A,B)]
        //START inline expansion of $inequality_of_term(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.equalsTerm(a2)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $inequality_of_term/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$inequality_of_term'/2,public)




    public static Operation PRED_$inequality_of_term_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$inequality_of_term'(A,B):-'$inequality_of_term'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$inequality_of_term'(A,B):-['$inequality_of_term'(A,B)]
        //START inline expansion of $inequality_of_term(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.equalsTerm(a2)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (@<)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((@<)/2,public)




    public static Operation PRED_$0040$003C_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A@<B:-A@<B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A@<B:-['$before'(A,B)]
        //START inline expansion of $before(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.compareTo(a2) >= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $before/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$before'/2,public)




    public static Operation PRED_$before_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$before'(A,B):-'$before'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$before'(A,B):-['$before'(A,B)]
        //START inline expansion of $before(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.compareTo(a2) >= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (@>)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((@>)/2,public)




    public static Operation PRED_$0040$003E_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A@>B:-A@>B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A@>B:-['$after'(A,B)]
        //START inline expansion of $after(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.compareTo(a2) <= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $after/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$after'/2,public)




    public static Operation PRED_$after_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$after'(A,B):-'$after'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$after'(A,B):-['$after'(A,B)]
        //START inline expansion of $after(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.compareTo(a2) <= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (@=<)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((@=<)/2,public)




    public static Operation PRED_$0040$003D$003C_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A@=<B:-A@=<B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A@=<B:-['$not_after'(A,B)]
        //START inline expansion of $not_after(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.compareTo(a2) > 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $not_after/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$not_after'/2,public)




    public static Operation PRED_$not_after_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$not_after'(A,B):-'$not_after'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$not_after'(A,B):-['$not_after'(A,B)]
        //START inline expansion of $not_after(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.compareTo(a2) > 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (@>=)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((@>=)/2,public)




    public static Operation PRED_$0040$003E$003D_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A@>=B:-A@>=B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A@>=B:-['$not_before'(A,B)]
        //START inline expansion of $not_before(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.compareTo(a2) < 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $not_before/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$not_before'/2,public)




    public static Operation PRED_$not_before_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$not_before'(A,B):-'$not_before'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$not_before'(A,B):-['$not_before'(A,B)]
        //START inline expansion of $not_before(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.compareTo(a2) < 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: ?= / 2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(?= / 2,public)




    public static Operation PRED_$003F$003D_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // ?=(A,B):- ?=(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // ?=(A,B):-['$identical_or_cannot_unify'(A,B)]
        //START inline expansion of $identical_or_cannot_unify(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (! a1.equalsIdentical(a2) && a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $identical_or_cannot_unify/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$identical_or_cannot_unify'/2,public)




    public static Operation PRED_$identical_or_cannot_unify_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$identical_or_cannot_unify'(A,B):-'$identical_or_cannot_unify'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$identical_or_cannot_unify'(A,B):-['$identical_or_cannot_unify'(A,B)]
        //START inline expansion of $identical_or_cannot_unify(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (! a1.equalsIdentical(a2) && a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: compare/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(compare/3,public)




    public static Operation PRED_compare_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // compare(A,B,C):-'$compare0'(D,B,C),'$map_compare_op'(D,A)
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // compare(A,B,C):-['$compare0'(D,B,C),'$map_compare_op'(D,A)]
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$compare0_3_static_exec, VA(a4, a2, a3), //
 Op(FILE_system::PRED_$map_compare_op_2_static_exec, VA(a4, a1), cont));
    }
/** PREDICATE: $map_compare_op/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$map_compare_op'/2,non-(public))
        final static SymbolTerm ATOM_$003D = SYM("=");
        final static SymbolTerm ATOM_$003C = SYM("<");
        final static SymbolTerm ATOM_$003E = SYM(">");




    public static Operation PRED_$map_compare_op_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$map_compare_op_2_sub_1);
        return $map_compare_op_2_1(m);
    }

    private final static Operation $map_compare_op_2_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$map_compare_op_2_sub_2);
        return $map_compare_op_2_2(m);
    }

    private final static Operation $map_compare_op_2_sub_2(Prolog m) { 
        m.trust(null);
        return $map_compare_op_2_3(m);
    }

    private final static Operation $map_compare_op_2_1(Prolog m) { 
    // '$map_compare_op'(A,B):-A=:=0,!,B=(=)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$map_compare_op'(A,B):-['$get_level'(C),D is 0,'$arith_equal'(A,D),'$cut'(C),'$unify'(B,=)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        //START inline expansion of a(4)is@(int_0)
        if (! a4.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $arith_equal(a(1),a(4))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a4)) != 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(2),@(ATOM_$003D))
        if (! a2.unify(ATOM_$003D, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $map_compare_op_2_2(Prolog m) { 
    // '$map_compare_op'(A,B):-A<0,!,B=(<)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$map_compare_op'(A,B):-['$get_level'(C),D is 0,'$less_than'(A,D),'$cut'(C),'$unify'(B,<)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        //START inline expansion of a(4)is@(int_0)
        if (! a4.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_than(a(1),a(4))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a4)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(2),@(ATOM_$003C))
        if (! a2.unify(ATOM_$003C, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $map_compare_op_2_3(Prolog m) { 
    // '$map_compare_op'(A,B):-A>0,!,B=(>)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$map_compare_op'(A,B):-['$get_level'(C),D is 0,'$greater_than'(A,D),'$cut'(C),'$unify'(B,>)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        //START inline expansion of a(4)is@(int_0)
        if (! a4.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_than(a(1),a(4))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a4)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(2),@(ATOM_$003E))
        if (! a2.unify(ATOM_$003E, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (=..)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((=..)/2,public)




    public static Operation PRED_$003D$002E$002E_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A=..B:-A=..B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A=..B:-['$univ'(A,B)]
        return //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: copy_term/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(copy_term/2,public)




    public static Operation PRED_copy_term_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // copy_term(A,B):-copy_term(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // copy_term(A,B):-[copy_term(A,B)]
        //START inline expansion of copy_term(a(1),a(2))
        a1 = a1.dref();
        if (! a2.unify(m.copy(a1), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (is)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((is)/2,public)




    public static Operation PRED_is_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A is B:-A is B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A is B:-[A is B]
        //START inline expansion of a(1)is a(2)
        if (! a1.unify(Arithmetic.evaluate(a2), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $abs/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$abs'/2,public)




    public static Operation PRED_$abs_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$abs'(A,B):-'$abs'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$abs'(A,B):-['$abs'(A,B)]
        //START inline expansion of $abs(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).abs(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $asin/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$asin'/2,public)




    public static Operation PRED_$asin_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$asin'(A,B):-'$asin'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$asin'(A,B):-['$asin'(A,B)]
        //START inline expansion of $asin(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).asin(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $acos/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$acos'/2,public)




    public static Operation PRED_$acos_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$acos'(A,B):-'$acos'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$acos'(A,B):-['$acos'(A,B)]
        //START inline expansion of $acos(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).acos(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $atan/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$atan'/2,public)




    public static Operation PRED_$atan_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$atan'(A,B):-'$atan'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$atan'(A,B):-['$atan'(A,B)]
        //START inline expansion of $atan(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).atan(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $bitwise_conj/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$bitwise_conj'/3,public)




    public static Operation PRED_$bitwise_conj_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$bitwise_conj'(A,B,C):-'$bitwise_conj'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$bitwise_conj'(A,B,C):-['$bitwise_conj'(A,B,C)]
        //START inline expansion of $bitwise_conj(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).and(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $bitwise_disj/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$bitwise_disj'/3,public)




    public static Operation PRED_$bitwise_disj_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$bitwise_disj'(A,B,C):-'$bitwise_disj'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$bitwise_disj'(A,B,C):-['$bitwise_disj'(A,B,C)]
        //START inline expansion of $bitwise_disj(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).or(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $bitwise_exclusive_or/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$bitwise_exclusive_or'/3,public)




    public static Operation PRED_$bitwise_exclusive_or_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$bitwise_exclusive_or'(A,B,C):-'$bitwise_exclusive_or'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$bitwise_exclusive_or'(A,B,C):-['$bitwise_exclusive_or'(A,B,C)]
        //START inline expansion of $bitwise_exclusive_or(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).xor(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $bitwise_neg/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$bitwise_neg'/2,public)




    public static Operation PRED_$bitwise_neg_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$bitwise_neg'(A,B):-'$bitwise_neg'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$bitwise_neg'(A,B):-['$bitwise_neg'(A,B)]
        //START inline expansion of $bitwise_neg(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).not(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $ceil/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$ceil'/2,public)




    public static Operation PRED_$ceil_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$ceil'(A,B):-'$ceil'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$ceil'(A,B):-['$ceil'(A,B)]
        //START inline expansion of $ceil(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).ceil(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $cos/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$cos'/2,public)




    public static Operation PRED_$cos_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$cos'(A,B):-'$cos'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$cos'(A,B):-['$cos'(A,B)]
        //START inline expansion of $cos(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).cos(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $degrees/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$degrees'/2,public)




    public static Operation PRED_$degrees_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$degrees'(A,B):-'$degrees'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$degrees'(A,B):-['$degrees'(A,B)]
        //START inline expansion of $degrees(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).toDegrees(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $exp/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$exp'/2,public)




    public static Operation PRED_$exp_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$exp'(A,B):-'$exp'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$exp'(A,B):-['$exp'(A,B)]
        //START inline expansion of $exp(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).exp(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $float/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$float'/2,public)




    public static Operation PRED_$float_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$float'(A,B):-'$float'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$float'(A,B):-['$float'(A,B)]
        //START inline expansion of $float(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).toFloat(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $float_integer_part/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$float_integer_part'/2,public)




    public static Operation PRED_$float_integer_part_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$float_integer_part'(A,B):-'$float_integer_part'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$float_integer_part'(A,B):-['$float_integer_part'(A,B)]
        //START inline expansion of $float_integer_part(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).floatIntPart(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $float_fractional_part/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$float_fractional_part'/2,public)




    public static Operation PRED_$float_fractional_part_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$float_fractional_part'(A,B):-'$float_fractional_part'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$float_fractional_part'(A,B):-['$float_fractional_part'(A,B)]
        //START inline expansion of $float_fractional_part(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).floatFractPart(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $float_quotient/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$float_quotient'/3,public)




    public static Operation PRED_$float_quotient_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$float_quotient'(A,B,C):-'$float_quotient'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$float_quotient'(A,B,C):-['$float_quotient'(A,B,C)]
        //START inline expansion of $float_quotient(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).divide(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $floor/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$floor'/2,public)




    public static Operation PRED_$floor_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$floor'(A,B):-'$floor'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$floor'(A,B):-['$floor'(A,B)]
        //START inline expansion of $floor(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).floor(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $int_quotient/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$int_quotient'/3,public)




    public static Operation PRED_$int_quotient_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$int_quotient'(A,B,C):-'$int_quotient'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$int_quotient'(A,B,C):-['$int_quotient'(A,B,C)]
        //START inline expansion of $int_quotient(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).intDivide(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $log/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$log'/2,public)




    public static Operation PRED_$log_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$log'(A,B):-'$log'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$log'(A,B):-['$log'(A,B)]
        //START inline expansion of $log(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).log(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $max/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$max'/3,public)




    public static Operation PRED_$max_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$max'(A,B,C):-'$max'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$max'(A,B,C):-['$max'(A,B,C)]
        //START inline expansion of $max(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).max(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $min/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$min'/3,public)




    public static Operation PRED_$min_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$min'(A,B,C):-'$min'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$min'(A,B,C):-['$min'(A,B,C)]
        //START inline expansion of $min(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).min(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $minus/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$minus'/3,public)




    public static Operation PRED_$minus_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$minus'(A,B,C):-'$minus'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$minus'(A,B,C):-['$minus'(A,B,C)]
        //START inline expansion of $minus(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).subtract(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $mod/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$mod'/3,public)




    public static Operation PRED_$mod_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$mod'(A,B,C):-'$mod'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$mod'(A,B,C):-['$mod'(A,B,C)]
        //START inline expansion of $mod(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).mod(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $multi/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$multi'/3,public)




    public static Operation PRED_$multi_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$multi'(A,B,C):-'$multi'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$multi'(A,B,C):-['$multi'(A,B,C)]
        //START inline expansion of $multi(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).multiply(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $plus/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$plus'/3,public)




    public static Operation PRED_$plus_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$plus'(A,B,C):-'$plus'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$plus'(A,B,C):-['$plus'(A,B,C)]
        //START inline expansion of $plus(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).add(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $pow/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$pow'/3,public)




    public static Operation PRED_$pow_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$pow'(A,B,C):-'$pow'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$pow'(A,B,C):-['$pow'(A,B,C)]
        //START inline expansion of $pow(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).pow(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $radians/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$radians'/2,public)




    public static Operation PRED_$radians_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$radians'(A,B):-'$radians'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$radians'(A,B):-['$radians'(A,B)]
        //START inline expansion of $radians(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).toRadians(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $rint/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$rint'/2,public)




    public static Operation PRED_$rint_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$rint'(A,B):-'$rint'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$rint'(A,B):-['$rint'(A,B)]
        //START inline expansion of $rint(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).rint(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $round/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$round'/2,public)




    public static Operation PRED_$round_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$round'(A,B):-'$round'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$round'(A,B):-['$round'(A,B)]
        //START inline expansion of $round(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).round(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $shift_left/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$shift_left'/3,public)




    public static Operation PRED_$shift_left_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$shift_left'(A,B,C):-'$shift_left'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$shift_left'(A,B,C):-['$shift_left'(A,B,C)]
        //START inline expansion of $shift_left(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).shiftLeft(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $shift_right/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$shift_right'/3,public)




    public static Operation PRED_$shift_right_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$shift_right'(A,B,C):-'$shift_right'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$shift_right'(A,B,C):-['$shift_right'(A,B,C)]
        //START inline expansion of $shift_right(a(1),a(2),a(3))
        if (! a3.unify(Arithmetic.evaluate(a1).shiftRight(Arithmetic.evaluate(a2)), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $sign/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$sign'/2,public)




    public static Operation PRED_$sign_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$sign'(A,B):-'$sign'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$sign'(A,B):-['$sign'(A,B)]
        //START inline expansion of $sign(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).signum(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $sin/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$sin'/2,public)




    public static Operation PRED_$sin_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$sin'(A,B):-'$sin'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$sin'(A,B):-['$sin'(A,B)]
        //START inline expansion of $sin(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).sin(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $sqrt/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$sqrt'/2,public)




    public static Operation PRED_$sqrt_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$sqrt'(A,B):-'$sqrt'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$sqrt'(A,B):-['$sqrt'(A,B)]
        //START inline expansion of $sqrt(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).sqrt(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $tan/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$tan'/2,public)




    public static Operation PRED_$tan_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$tan'(A,B):-'$tan'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$tan'(A,B):-['$tan'(A,B)]
        //START inline expansion of $tan(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).tan(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $truncate/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$truncate'/2,public)




    public static Operation PRED_$truncate_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$truncate'(A,B):-'$truncate'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$truncate'(A,B):-['$truncate'(A,B)]
        //START inline expansion of $truncate(a(1),a(2))
        if (! a2.unify(Arithmetic.evaluate(a1).truncate(), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (=:=)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((=:=)/2,public)




    public static Operation PRED_$003D$003A$003D_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A=:=B:-A=:=B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A=:=B:-['$arith_equal'(A,B)]
        //START inline expansion of $arith_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) != 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $arith_equal/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$arith_equal'/2,public)




    public static Operation PRED_$arith_equal_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$arith_equal'(A,B):-'$arith_equal'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$arith_equal'(A,B):-['$arith_equal'(A,B)]
        //START inline expansion of $arith_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) != 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (=\=)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((=\=)/2,public)




    public static Operation PRED_$003D$005C$003D_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A=\=B:-A=\=B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A=\=B:-['$arith_not_equal'(A,B)]
        //START inline expansion of $arith_not_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) == 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $arith_not_equal/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$arith_not_equal'/2,public)




    public static Operation PRED_$arith_not_equal_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$arith_not_equal'(A,B):-'$arith_not_equal'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$arith_not_equal'(A,B):-['$arith_not_equal'(A,B)]
        //START inline expansion of $arith_not_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) == 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (<)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((<)/2,public)




    public static Operation PRED_$003C_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A<B:-A<B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A<B:-['$less_than'(A,B)]
        //START inline expansion of $less_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $less_than/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$less_than'/2,public)




    public static Operation PRED_$less_than_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$less_than'(A,B):-'$less_than'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$less_than'(A,B):-['$less_than'(A,B)]
        //START inline expansion of $less_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (=<)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((=<)/2,public)




    public static Operation PRED_$003D$003C_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A=<B:-A=<B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A=<B:-['$less_or_equal'(A,B)]
        //START inline expansion of $less_or_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $less_or_equal/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$less_or_equal'/2,public)




    public static Operation PRED_$less_or_equal_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$less_or_equal'(A,B):-'$less_or_equal'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$less_or_equal'(A,B):-['$less_or_equal'(A,B)]
        //START inline expansion of $less_or_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (>)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((>)/2,public)




    public static Operation PRED_$003E_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A>B:-A>B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A>B:-['$greater_than'(A,B)]
        //START inline expansion of $greater_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $greater_than/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$greater_than'/2,public)




    public static Operation PRED_$greater_than_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$greater_than'(A,B):-'$greater_than'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$greater_than'(A,B):-['$greater_than'(A,B)]
        //START inline expansion of $greater_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (>=)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((>=)/2,public)




    public static Operation PRED_$003E$003D_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A>=B:-A>=B
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // A>=B:-['$greater_or_equal'(A,B)]
        //START inline expansion of $greater_or_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) < 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $greater_or_equal/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$greater_or_equal'/2,public)




    public static Operation PRED_$greater_or_equal_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$greater_or_equal'(A,B):-'$greater_or_equal'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$greater_or_equal'(A,B):-['$greater_or_equal'(A,B)]
        //START inline expansion of $greater_or_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) < 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: clause/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(clause/2,public)
        final static SymbolTerm ATOM_access = SYM("access");
        final static SymbolTerm ATOM_private_procedure = SYM("private_procedure");
        final static SymbolTerm FUNCTOR_$003A$002D_2 = F(":-",2);




    public static Operation PRED_clause_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // clause(A,B):-'$head_to_term'(A,C,D:E,clause(A,B)),'$new_internal_database'(D),'$check_procedure_permission'(D:E,access,private_procedure,clause(A,B)),'$clause_internal'(D,E,C,F,G),copy_term(F,(C:-B))
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
        a2 = LARG[1];
    // clause(A,B):-['$head_to_term'(A,C,D:E,clause(A,B)),'$new_internal_database'(D),'$check_procedure_permission'(D:E,access,private_procedure,clause(A,B)),'$clause_internal'(D,E,C,F,G),copy_term(F,(C:-B))]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(6))
        a6 =  S( FUNCTOR_module_colon_2 , a4, a5);
 ;
    // put_str_args([a(1),a(2)],y(2)),put_str(@('FUNCTOR_clause_2'),y(2),a(7))
        a7 =  S( FUNCTOR_clause_2 , a1, a2);
 ;
    // put_str_args([a(4),a(5)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(8))
        a8 =  S( FUNCTOR_module_colon_2 , a4, a5);
 ;
    // put_str_args([a(1),a(2)],y(4)),put_str(@('FUNCTOR_clause_2'),y(4),a(9))
        a9 =  S( FUNCTOR_clause_2 , a1, a2);
 ;
        a10 = m.mkvar1();
    // put_str_args([a(3),a(2)],y(5)),put_str(@('FUNCTOR_$003A$002D_2'),y(5),a(11))
        a11 =  S( FUNCTOR_$003A$002D_2 , a3, a2);
 ;
        return //
 Op(FILE_system::PRED_$head_to_term_4_static_exec, VA(a1, a3, a6, a7), //
 Op(FILE_system::PRED_$new_internal_database_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$check_procedure_permission_4_static_exec, VA(a8,  ATOM_access ,  ATOM_private_procedure , a9), //
 Op(FILE_system::PRED_$clause_internal_5_static_exec, VA(a4, a5, a3, a10, m.DONT_CARE2()), //
 Op(FILE_system::PRED_copy_term_2_static_exec, VA(a10, a11), cont)))));
    }
/** PREDICATE: $head_to_term/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$head_to_term'/4,non-(public))




    public static Operation PRED_$head_to_term_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$head_to_term'(A,B,C:D/E,F):-'$head_to_term'(A,B,user,C,F),functor(B,D,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // '$head_to_term'(A,B,C:D/E,F):-['$head_to_term'(A,B,user,C,F),functor(B,D,E)]
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_module_colon_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002F_2 , m.trail, a7, a8)){
                return m.fail();
            }
        return //
 Op(FILE_system::PRED_$head_to_term_5_static_exec, VA(a1, a2,  ATOM_user , a5, a4), //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a2, a7, a8), cont));
    }
/** PREDICATE: $head_to_term/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$head_to_term'/5,non-(public))
    private static final StructureTerm L_$head_to_term_5_s7 = S( FUNCTOR_type_1 ,  ATOM_callable );

    // private final Term arg5;




    public static Operation PRED_$head_to_term_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $head_to_term_5_top(m);
    }

    private final static Operation $head_to_term_5_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$head_to_term_5_var, FILE_builtins::$head_to_term_5_int, FILE_builtins::$head_to_term_5_int, FILE_builtins::$head_to_term_5_int, FILE_builtins::$head_to_term_5_var, FILE_builtins::$head_to_term_5_int); 
    }

    private final static Operation $head_to_term_5_var(Prolog m) { 
        m.jtry5(null, FILE_builtins::$head_to_term_5_var_1);
        return $head_to_term_5_1(m);
    }

    private final static Operation $head_to_term_5_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$head_to_term_5_var_2);
        return $head_to_term_5_2(m);
    }

    private final static Operation $head_to_term_5_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$head_to_term_5_var_3);
        return $head_to_term_5_3(m);
    }

    private final static Operation $head_to_term_5_var_3(Prolog m) { 
        m.trust(null);
        return $head_to_term_5_4(m);
    }

    private final static Operation $head_to_term_5_int(Prolog m) { 
        m.jtry5(null, FILE_builtins::$head_to_term_5_int_1);
        return $head_to_term_5_1(m);
    }

    private final static Operation $head_to_term_5_int_1(Prolog m) { 
        m.retry(null, FILE_builtins::$head_to_term_5_int_2);
        return $head_to_term_5_3(m);
    }

    private final static Operation $head_to_term_5_int_2(Prolog m) { 
        m.trust(null);
        return $head_to_term_5_4(m);
    }

    private final static Operation $head_to_term_5_1(Prolog m) { 
    // '$head_to_term'(A,B,C,D,E):-var(A),!,illarg(var,E,1)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$head_to_term'(A,B,C,D,E):-['$get_level'(F),var(A),'$cut'(F),illarg(var,E,1)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a5,  int_1 ), cont);
    }

    private final static Operation $head_to_term_5_2(Prolog m) { 
    // '$head_to_term'(A:B,C,D,E,F):-!,'$head_to_term'(B,C,A,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$head_to_term'(A:B,C,D,E,F):-['$neck_cut','$head_to_term'(B,C,A,E,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
m.cont = cont;
        return $head_to_term_5_top(m);
    }

    private final static Operation $head_to_term_5_3(Prolog m) { 
    // '$head_to_term'(A,A,B,B,C):-callable(A),atom(B),!
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$head_to_term'(A,A,B,B,C):-['$get_level'(D),callable(A),atom(B),'$cut'(D)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_callable_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_atom_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a6), cont)));
    }

    private final static Operation $head_to_term_5_4(Prolog m) { 
    // '$head_to_term'(A,B,C,D,E):-illarg(type(callable),E,1)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$head_to_term'(A,B,C,D,E):-[illarg(type(callable),E,1)]
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$head_to_term_5_s7, a5,  int_1 ), cont);
    }
/** PREDICATE: $new_internal_database/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$new_internal_database'/1,non-(public))




    public static Operation PRED_$new_internal_database_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$new_internal_database'(A):-atom(A),'$get_hash_manager'(B),'$new_internal_database'(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // '$new_internal_database'(A):-[atom(A),'$get_hash_manager'(B),'$new_internal_database'(B,A)]
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        a2 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$get_hash_manager_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_$new_internal_database_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: $new_internal_database/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$new_internal_database'/2,non-(public))
        final static SymbolTerm FUNCTOR_alias_1 = F("alias",1);




    public static Operation PRED_$new_internal_database_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$new_internal_database_2_sub_1);
        return $new_internal_database_2_1(m);
    }

    private final static Operation $new_internal_database_2_sub_1(Prolog m) { 
        m.trust(null);
        return $new_internal_database_2_2(m);
    }

    private final static Operation $new_internal_database_2_1(Prolog m) { 
    // '$new_internal_database'(A,B):-hash_contains_key(A,B),!
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$new_internal_database'(A,B):-['$get_level'(C),hash_contains_key(A,B),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_hash_contains_key_2_static_exec, VA(a1, a2), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation $new_internal_database_2_2(Prolog m) { 
    // '$new_internal_database'(A,B):-new_hash(C,[alias(B)]),'$init_internal_database'(B)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$new_internal_database'(A,B):-[new_hash(C,[alias(B)]),'$init_internal_database'(B)]
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_alias_1'),y(1),a(3))
        a3 =  S( FUNCTOR_alias_1 , a2);
 ;
        a4 = CONS(a3,  Prolog.Nil );
        return //
 Op(FILE_system::PRED_new_hash_2_static_exec, VA(m.DONT_CARE2(), a4), //
 Op(FILE_system::PRED_$init_internal_database_1_static_exec, VA(a2), cont));
    }
/** PREDICATE: $init_internal_database/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$init_internal_database'/1,non-(public))
        final static SymbolTerm ATOM_$0024init = SYM("$init");




    public static Operation PRED_$init_internal_database_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$init_internal_database_1_sub_1);
        return $init_internal_database_1_1(m);
    }

    private final static Operation $init_internal_database_1_sub_1(Prolog m) { 
        m.trust(null);
        return $init_internal_database_1_2(m);
    }

    private final static Operation $init_internal_database_1_1(Prolog m) { 
    // '$init_internal_database'(A):-'$compiled_predicate'(A,'$init',0),findall(B,A:'$init',C),!
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$init_internal_database'(A):-['$get_level'(B),'$compiled_predicate'(A,'$init',0),findall(C,A:'$init',D),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),@('ATOM_$0024init')],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 , a1,  ATOM_$0024init );
 ;
        return //
 Op(FILE_system::PRED_$compiled_predicate_3_static_exec, VA(a1,  ATOM_$0024init ,  int_0 ), //
 Op(FILE_system::PRED_findall_3_static_exec, VA(m.DONT_CARE2(), a3, m.DONT_CARE2()), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), cont)));
    }

    private final static Operation $init_internal_database_1_2(Prolog m) { 
    // '$init_internal_database'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$init_internal_database'(A):-[]
        return cont;
    }
/** PREDICATE: $defined_internal_database/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$defined_internal_database'/1,non-(public))




    public static Operation PRED_$defined_internal_database_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$defined_internal_database'(A):-atom(A),'$get_hash_manager'(B),hash_contains_key(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // '$defined_internal_database'(A):-[atom(A),'$get_hash_manager'(B),hash_contains_key(B,A)]
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        a2 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$get_hash_manager_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_hash_contains_key_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: $clause_internal/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$clause_internal'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$clause_internal_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$clause_internal'(A,B,C,D,E):-hash_contains_key(A,B),'$get_indices'(A,B,C,F),'$get_instances'(F,G),'$clause_internal0'(G,D,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // '$clause_internal'(A,B,C,D,E):-[hash_contains_key(A,B),'$get_indices'(A,B,C,F),'$get_instances'(F,G),'$clause_internal0'(G,D,E)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op(FILE_system::PRED_hash_contains_key_2_static_exec, VA(a1, a2), //
 Op(FILE_system::PRED_$get_indices_4_static_exec, VA(a1, a2, a3, a6), //
 Op(FILE_system::PRED_$get_instances_2_static_exec, VA(a6, a7), //
 Op(FILE_system::PRED_$clause_internal0_3_static_exec, VA(a7, a4, a5), cont))));
    }
/** PREDICATE: $clause_internal0/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$clause_internal0'/3,non-(public))




    public static Operation PRED_$clause_internal0_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$clause_internal0_3_var, FILE_builtins::$clause_internal0_3_3, FILE_builtins::$clause_internal0_3_3, FILE_builtins::$clause_internal0_3_con, FILE_builtins::$clause_internal0_3_3, FILE_builtins::$clause_internal0_3_lis); 
    }

    private final static Operation $clause_internal0_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$clause_internal0_3_var_1);
        return $clause_internal0_3_1(m);
    }

    private final static Operation $clause_internal0_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$clause_internal0_3_var_2);
        return $clause_internal0_3_2(m);
    }

    private final static Operation $clause_internal0_3_var_2(Prolog m) { 
        m.trust(null);
        return $clause_internal0_3_3(m);
    }

    private final static Operation $clause_internal0_3_con(Prolog m) { 
        m.jtry3(null, FILE_builtins::$clause_internal0_3_con_1);
        return $clause_internal0_3_1(m);
    }

    private final static Operation $clause_internal0_3_con_1(Prolog m) { 
        m.trust(null);
        return $clause_internal0_3_3(m);
    }

    private final static Operation $clause_internal0_3_lis(Prolog m) { 
        m.jtry3(null, FILE_builtins::$clause_internal0_3_lis_1);
        return $clause_internal0_3_2(m);
    }

    private final static Operation $clause_internal0_3_lis_1(Prolog m) { 
        m.trust(null);
        return $clause_internal0_3_3(m);
    }

    private final static Operation $clause_internal0_3_1(Prolog m) { 
    // '$clause_internal0'([],A,B):-fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$clause_internal0'([],A,B):-[fail]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $clause_internal0_3_2(Prolog m) { 
    // '$clause_internal0'([(A,B)],A,B):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$clause_internal0'([(A,B)],A,B):-['$neck_cut']
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            if (!  Prolog.Nil .unify(a1.cdr(), m.trail))
                return m.fail();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
             a1.bind(CONS(a4,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_$002C_2 , m.trail, a5, a6)){
                return m.fail();
            }
        if (! a5.unify(a2, m.trail))
            return m.fail();
        if (! a6.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $clause_internal0_3_3(Prolog m) { 
    // '$clause_internal0'(A,B,C):-'$builtin_member'((B,C),A)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$clause_internal0'(A,B,C):-['$builtin_member'((B,C),A)]
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_$002C_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$002C_2 , a2, a3);
 ;
        return //
 Op(FILE_system::PRED_$builtin_member_2_static_exec, VA(a4, a1), cont);
    }
/** PREDICATE: $dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/3,non-(public))




    public static Operation PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-hash_contains_key(B,C),!,hash_get(B,C,A)
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-['$get_level'(D),hash_contains_key(B,C),'$cut'(D),hash_get(B,C,A)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_hash_contains_key_2_static_exec, VA(a2, a3), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_hash_get_3_static_exec, VA(a2, a3, a1), cont)));
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-hash_get(B,var,A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-[hash_get(B,var,A)]
        return //
 Op(FILE_system::PRED_hash_get_3_static_exec, VA(a2,  ATOM_var , a1), cont);
    }
/** PREDICATE: $get_indices/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$get_indices'/4,non-(public))




    public static Operation PRED_$get_indices_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$get_indices'(A,B,C,D):-'$new_indexing_hash'(A,B,E),'$calc_indexing_key'(C,F),'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(D,E,F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // '$get_indices'(A,B,C,D):-['$new_indexing_hash'(A,B,E),'$calc_indexing_key'(C,F),'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(D,E,F)]
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$new_indexing_hash_3_static_exec, VA(a1, a2, a5), //
 Op(FILE_system::PRED_$calc_indexing_key_2_static_exec, VA(a3, a6), //
 Op(FILE_system::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec, VA(a4, a5, a6), cont)));
    }
/** PREDICATE: $new_indexing_hash/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$new_indexing_hash'/3,public)
        final static SymbolTerm ATOM_all = SYM("all");
        final static SymbolTerm ATOM_lis = SYM("lis");
        final static SymbolTerm ATOM_str = SYM("str");




    public static Operation PRED_$new_indexing_hash_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$new_indexing_hash_3_sub_1);
        return $new_indexing_hash_3_1(m);
    }

    private final static Operation $new_indexing_hash_3_sub_1(Prolog m) { 
        m.trust(null);
        return $new_indexing_hash_3_2(m);
    }

    private final static Operation $new_indexing_hash_3_1(Prolog m) { 
    // '$new_indexing_hash'(A,B,C):-hash_contains_key(A,B),!,hash_get(A,B,C)
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$new_indexing_hash'(A,B,C):-['$get_level'(D),hash_contains_key(A,B),'$cut'(D),hash_get(A,B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_hash_contains_key_2_static_exec, VA(a1, a2), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_hash_get_3_static_exec, VA(a1, a2, a3), cont)));
    }

    private final static Operation $new_indexing_hash_3_2(Prolog m) { 
    // '$new_indexing_hash'(A,B,C):-new_hash(C),hash_put(C,all,[]),hash_put(C,var,[]),hash_put(C,lis,[]),hash_put(C,str,[]),hash_put(A,B,C)
         Term a1, a2, a3;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$new_indexing_hash'(A,B,C):-[new_hash(C),hash_put(C,all,[]),hash_put(C,var,[]),hash_put(C,lis,[]),hash_put(C,str,[]),hash_put(A,B,C)]
        return //
 Op(FILE_system::PRED_new_hash_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_hash_put_3_static_exec, VA(a3,  ATOM_all ,  Prolog.Nil ), //
 Op(FILE_system::PRED_hash_put_3_static_exec, VA(a3,  ATOM_var ,  Prolog.Nil ), //
 Op(FILE_system::PRED_hash_put_3_static_exec, VA(a3,  ATOM_lis ,  Prolog.Nil ), //
 Op(FILE_system::PRED_hash_put_3_static_exec, VA(a3,  ATOM_str ,  Prolog.Nil ), //
 Op(FILE_system::PRED_hash_put_3_static_exec, VA(a1, a2, a3), cont))))));
    }
/** PREDICATE: $calc_indexing_key/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$calc_indexing_key'/2,non-(public))




    public static Operation PRED_$calc_indexing_key_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$calc_indexing_key_2_sub_1);
        return $calc_indexing_key_2_1(m);
    }

    private final static Operation $calc_indexing_key_2_sub_1(Prolog m) { 
        m.trust(null);
        return $calc_indexing_key_2_2(m);
    }

    private final static Operation $calc_indexing_key_2_1(Prolog m) { 
    // '$calc_indexing_key'(A,all):-atom(A),!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$calc_indexing_key'(A,all):-['$get_level'(B),atom(A),'$cut'(B)]
        if (!  ATOM_all .unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $calc_indexing_key_2_2(Prolog m) { 
    // '$calc_indexing_key'(A,B):-arg(1,A,C),'$calc_indexing_key0'(C,B)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$calc_indexing_key'(A,B):-[arg(1,A,C),'$calc_indexing_key0'(C,B)]
        a3 = m.mkvar1();
        return //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_1 , a1, a3), //
 Op(FILE_system::PRED_$calc_indexing_key0_2_static_exec, VA(a3, a2), cont));
    }
/** PREDICATE: $calc_indexing_key0/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$calc_indexing_key0'/2,non-(public))
        final static SymbolTerm ATOM_term = SYM("term");
    private static final StructureTerm L_$calc_indexing_key0_2_s7 = S( FUNCTOR_type_1 ,  ATOM_term );
        final static SymbolTerm FUNCTOR_$0024calc_indexing_key0_2 = F("$calc_indexing_key0",2);




    public static Operation PRED_$calc_indexing_key0_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$calc_indexing_key0_2_sub_1);
        return $calc_indexing_key0_2_1(m);
    }

    private final static Operation $calc_indexing_key0_2_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$calc_indexing_key0_2_sub_2);
        return $calc_indexing_key0_2_2(m);
    }

    private final static Operation $calc_indexing_key0_2_sub_2(Prolog m) { 
        m.retry(null, FILE_builtins::$calc_indexing_key0_2_sub_3);
        return $calc_indexing_key0_2_3(m);
    }

    private final static Operation $calc_indexing_key0_2_sub_3(Prolog m) { 
        m.retry(null, FILE_builtins::$calc_indexing_key0_2_sub_4);
        return $calc_indexing_key0_2_4(m);
    }

    private final static Operation $calc_indexing_key0_2_sub_4(Prolog m) { 
        m.trust(null);
        return $calc_indexing_key0_2_5(m);
    }

    private final static Operation $calc_indexing_key0_2_1(Prolog m) { 
    // '$calc_indexing_key0'(A,all):-var(A),!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$calc_indexing_key0'(A,all):-['$get_level'(B),var(A),'$cut'(B)]
        if (!  ATOM_all .unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $calc_indexing_key0_2_2(Prolog m) { 
    // '$calc_indexing_key0'(A,lis):-A=[B|C],!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$calc_indexing_key0'(A,lis):-['$get_level'(B),'$unify'(A,[C|D]),'$cut'(B)]
        if (!  ATOM_lis .unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = CONS(m.DONT_CARE1(), m.DONT_CARE1());
        //START inline expansion of $unify(a(1),a(4))
        if (! a1.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $calc_indexing_key0_2_3(Prolog m) { 
    // '$calc_indexing_key0'(A,str):-compound(A),!
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$calc_indexing_key0'(A,str):-['$get_level'(B),compound(A),'$cut'(B)]
        if (!  ATOM_str .unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_compound_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation $calc_indexing_key0_2_4(Prolog m) { 
    // '$calc_indexing_key0'(A,B):-ground(A),!,'$term_hash'(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$calc_indexing_key0'(A,B):-['$get_level'(C),ground(A),'$cut'(C),'$term_hash'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of ground(a(1))
        a1 = a1.dref();
        if (! a1.isGround()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$term_hash_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation $calc_indexing_key0_2_5(Prolog m) { 
    // '$calc_indexing_key0'(A,B):-illarg(type(term),'$calc_indexing_key0'(A,B),1)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$calc_indexing_key0'(A,B):-[illarg(type(term),'$calc_indexing_key0'(A,B),1)]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_$0024calc_indexing_key0_2'),y(1),a(3))
        a3 =  S( FUNCTOR_$0024calc_indexing_key0_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$calc_indexing_key0_2_s7, a3,  int_1 ), cont);
    }
/** PREDICATE: $check_procedure_permission/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$check_procedure_permission'/4,non-(public))
        final static SymbolTerm FUNCTOR_permission_4 = F("permission",4);




    public static Operation PRED_$check_procedure_permission_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$check_procedure_permission_4_var, FILE_builtins::$check_procedure_permission_4_3, FILE_builtins::$check_procedure_permission_4_3, FILE_builtins::$check_procedure_permission_4_3, FILE_builtins::$check_procedure_permission_4_var, FILE_builtins::$check_procedure_permission_4_3); 
    }

    private final static Operation $check_procedure_permission_4_var(Prolog m) { 
        m.jtry4(null, FILE_builtins::$check_procedure_permission_4_var_1);
        return $check_procedure_permission_4_1(m);
    }

    private final static Operation $check_procedure_permission_4_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$check_procedure_permission_4_var_2);
        return $check_procedure_permission_4_2(m);
    }

    private final static Operation $check_procedure_permission_4_var_2(Prolog m) { 
        m.trust(null);
        return $check_procedure_permission_4_3(m);
    }

    private final static Operation $check_procedure_permission_4_1(Prolog m) { 
    // '$check_procedure_permission'(A:B/C,D,E,F):-hash_contains_key(A,B/C),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$check_procedure_permission'(A:B/C,D,E,F):-['$get_level'(G),hash_contains_key(A,B/C),'$cut'(G)]
        a1 = a1.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002F_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(7),a(8)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$002F_2 , a7, a8);
 ;
        return //
 Op(FILE_system::PRED_hash_contains_key_2_static_exec, VA(a5, a10), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a9), cont));
    }

    private final static Operation $check_procedure_permission_4_2(Prolog m) { 
    // '$check_procedure_permission'(A:B/C,D,E,F):-'$compiled_predicate_or_builtin'(A,B,C),!,illarg(permission(D,E,A:B/C,G),F,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$check_procedure_permission'(A:B/C,D,E,F):-['$get_level'(G),'$compiled_predicate_or_builtin'(A,B,C),'$cut'(G),illarg(permission(D,E,A:B/C,H),F,I)]
        a1 = a1.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002F_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(7),a(8)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$002F_2 , a7, a8);
 ;
    // put_str_args([a(5),a(10)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(11))
        a11 =  S( FUNCTOR_module_colon_2 , a5, a10);
 ;
    // put_str_args([a(2),a(3),a(11),void],y(3)),put_str(@('FUNCTOR_permission_4'),y(3),a(12))
        a12 =  S( FUNCTOR_permission_4 , a2, a3, a11, m.mkvar3());
 ;
        return //
 Op(FILE_system::PRED_$compiled_predicate_or_builtin_3_static_exec, VA(a5, a7, a8), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a9), //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(a12, a4, m.DONT_CARE2()), cont)));
    }

    private final static Operation $check_procedure_permission_4_3(Prolog m) { 
    // '$check_procedure_permission'(A,B,C,D):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$check_procedure_permission'(A,B,C,D):-[]
        return cont;
    }
/** PREDICATE: (initialization)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((initialization)/2,public)




    public static Operation PRED_initialization_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::initialization_2_var, fail_0, fail_0, FILE_builtins::initialization_2_1, fail_0, FILE_builtins::initialization_2_2); 
    }

    private final static Operation initialization_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::initialization_2_var_1);
        return initialization_2_1(m);
    }

    private final static Operation initialization_2_var_1(Prolog m) { 
        m.trust(null);
        return initialization_2_2(m);
    }

    private final static Operation initialization_2_1(Prolog m) { 
    // initialization([],A):-!,once(A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // initialization([],A):-['$neck_cut',once('SxxMachine':A)]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op(FILE_system::PRED_once_1_static_exec, VA(a3), cont);
    }

    private final static Operation initialization_2_2(Prolog m) { 
    // initialization([A|B],C):-'$new_internal_database'(A),initialization(B,C)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // initialization([A|B],C):-['$new_internal_database'(A),initialization(B,C)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
            a4 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
            a4 = m.mkvar2();
             a1.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_$new_internal_database_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_initialization_2_static_exec, VA(a4, a2), cont));
    }
/** PREDICATE: assert/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(assert/1,public)




    public static Operation PRED_assert_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // assert(A):-assertz(A)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // assert(A):-[assertz('SxxMachine':A)]
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
        return //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: assertz/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(assertz/1,public)
        final static SymbolTerm ATOM_modify = SYM("modify");
        final static SymbolTerm ATOM_static_procedure = SYM("static_procedure");
        final static SymbolTerm ATOM_z = SYM("z");




    public static Operation PRED_assertz_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::assertz_1_sub_1);
        return assertz_1_1(m);
    }

    private final static Operation assertz_1_sub_1(Prolog m) { 
        m.trust(null);
        return assertz_1_2(m);
    }

    private final static Operation assertz_1_1(Prolog m) { 
    // assertz(A):-'$term_to_clause'(A,B,C:D,assertz(A)),'$new_internal_database'(C),'$check_procedure_permission'(C:D,modify,static_procedure,assertz(A)),copy_term(B,E),'$insert'(E,F),'$update_indexing'(C,D,B,F,z),fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // assertz(A):-['$term_to_clause'(A,B,C:D,assertz(A)),'$new_internal_database'(C),'$check_procedure_permission'(C:D,modify,static_procedure,assertz(A)),copy_term(B,E),'$insert'(E,F),'$update_indexing'(C,D,B,F,z),fail]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 , a3, a4);
 ;
    // put_str_args([a(1)],y(2)),put_str(@('FUNCTOR_assertz_1'),y(2),a(6))
        a6 =  S( FUNCTOR_assertz_1 , a1);
 ;
    // put_str_args([a(3),a(4)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a3, a4);
 ;
    // put_str_args([a(1)],y(4)),put_str(@('FUNCTOR_assertz_1'),y(4),a(8))
        a8 =  S( FUNCTOR_assertz_1 , a1);
 ;
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$term_to_clause_4_static_exec, VA(a1, a2, a5, a6), //
 Op(FILE_system::PRED_$new_internal_database_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$check_procedure_permission_4_static_exec, VA(a7,  ATOM_modify ,  ATOM_static_procedure , a8), //
 Op(FILE_system::PRED_copy_term_2_static_exec, VA(a2, a9), //
 Op(FILE_system::PRED_$insert_2_static_exec, VA(a9, a10), //
 Op(FILE_system::PRED_$update_indexing_5_static_exec, VA(a3, a4, a2, a10,  ATOM_z ), fail_0))))));
    }

    private final static Operation assertz_1_2(Prolog m) { 
    // assertz(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // assertz(A):-[]
        return cont;
    }
/** PREDICATE: asserta/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(asserta/1,public)
        final static SymbolTerm ATOM_a = SYM("a");




    public static Operation PRED_asserta_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::asserta_1_sub_1);
        return asserta_1_1(m);
    }

    private final static Operation asserta_1_sub_1(Prolog m) { 
        m.trust(null);
        return asserta_1_2(m);
    }

    private final static Operation asserta_1_1(Prolog m) { 
    // asserta(A):-'$term_to_clause'(A,B,C:D,asserta(A)),'$new_internal_database'(C),'$check_procedure_permission'(C:D,modify,static_procedure,asserta(A)),copy_term(B,E),'$insert'(E,F),'$update_indexing'(C,D,B,F,a),fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // asserta(A):-['$term_to_clause'(A,B,C:D,asserta(A)),'$new_internal_database'(C),'$check_procedure_permission'(C:D,modify,static_procedure,asserta(A)),copy_term(B,E),'$insert'(E,F),'$update_indexing'(C,D,B,F,a),fail]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 , a3, a4);
 ;
    // put_str_args([a(1)],y(2)),put_str(@('FUNCTOR_asserta_1'),y(2),a(6))
        a6 =  S( FUNCTOR_asserta_1 , a1);
 ;
    // put_str_args([a(3),a(4)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a3, a4);
 ;
    // put_str_args([a(1)],y(4)),put_str(@('FUNCTOR_asserta_1'),y(4),a(8))
        a8 =  S( FUNCTOR_asserta_1 , a1);
 ;
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$term_to_clause_4_static_exec, VA(a1, a2, a5, a6), //
 Op(FILE_system::PRED_$new_internal_database_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$check_procedure_permission_4_static_exec, VA(a7,  ATOM_modify ,  ATOM_static_procedure , a8), //
 Op(FILE_system::PRED_copy_term_2_static_exec, VA(a2, a9), //
 Op(FILE_system::PRED_$insert_2_static_exec, VA(a9, a10), //
 Op(FILE_system::PRED_$update_indexing_5_static_exec, VA(a3, a4, a2, a10,  ATOM_a ), fail_0))))));
    }

    private final static Operation asserta_1_2(Prolog m) { 
    // asserta(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // asserta(A):-[]
        return cont;
    }
/** PREDICATE: abolish/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(abolish/1,public)




    public static Operation PRED_abolish_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::abolish_1_sub_1);
        return abolish_1_1(m);
    }

    private final static Operation abolish_1_sub_1(Prolog m) { 
        m.trust(null);
        return abolish_1_2(m);
    }

    private final static Operation abolish_1_1(Prolog m) { 
    // abolish(A):-'$term_to_predicateindicator'(A,B:C,abolish(A)),'$new_internal_database'(B),'$check_procedure_permission'(B:C,modify,static_procedure,abolish(A)),'$new_indexing_hash'(B,C,D),hash_get(D,all,E),'$erase_all'(E),hash_remove(B,C),fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // abolish(A):-['$term_to_predicateindicator'(A,B:C,abolish(A)),'$new_internal_database'(B),'$check_procedure_permission'(B:C,modify,static_procedure,abolish(A)),'$new_indexing_hash'(B,C,D),hash_get(D,all,E),'$erase_all'(E),hash_remove(B,C),fail]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 , a2, a3);
 ;
    // put_str_args([a(1)],y(2)),put_str(@('FUNCTOR_abolish_1'),y(2),a(5))
        a5 =  S( FUNCTOR_abolish_1 , a1);
 ;
    // put_str_args([a(2),a(3)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(6))
        a6 =  S( FUNCTOR_module_colon_2 , a2, a3);
 ;
    // put_str_args([a(1)],y(4)),put_str(@('FUNCTOR_abolish_1'),y(4),a(7))
        a7 =  S( FUNCTOR_abolish_1 , a1);
 ;
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$term_to_predicateindicator_3_static_exec, VA(a1, a4, a5), //
 Op(FILE_system::PRED_$new_internal_database_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_$check_procedure_permission_4_static_exec, VA(a6,  ATOM_modify ,  ATOM_static_procedure , a7), //
 Op(FILE_system::PRED_$new_indexing_hash_3_static_exec, VA(a2, a3, a8), //
 Op(FILE_system::PRED_hash_get_3_static_exec, VA(a8,  ATOM_all , a9), //
 Op(FILE_system::PRED_$erase_all_1_static_exec, VA(a9), //
 Op(FILE_system::PRED_hash_remove_2_static_exec, VA(a2, a3), fail_0)))))));
    }

    private final static Operation abolish_1_2(Prolog m) { 
    // abolish(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // abolish(A):-[]
        return cont;
    }
/** PREDICATE: retract/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(retract/1,public)




    public static Operation PRED_retract_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // retract(A):-'$clause_to_term'(A,B,C:D,retract(A)),'$new_internal_database'(C),'$check_procedure_permission'(C:D,access,static_procedure,retract(A)),B=(E:-F),'$clause_internal'(C,D,E,G,H),copy_term(G,B),'$erase'(H),'$rehash_indexing'(C,D,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4, p5, p6, p7;
        a1 = LARG[0];
    // retract(A):-['$clause_to_term'(A,B,C:D,retract(A)),'$new_internal_database'(C),'$check_procedure_permission'(C:D,access,static_procedure,retract(A)),'$unify'(B,(E:-F)),'$clause_internal'(C,D,E,G,H),copy_term(G,B),'$erase'(H),'$rehash_indexing'(C,D,H)]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 , a3, a4);
 ;
    // put_str_args([a(1)],y(2)),put_str(@('FUNCTOR_retract_1'),y(2),a(6))
        a6 =  S( FUNCTOR_retract_1 , a1);
 ;
    // put_str_args([a(3),a(4)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a3, a4);
 ;
    // put_str_args([a(1)],y(4)),put_str(@('FUNCTOR_retract_1'),y(4),a(8))
        a8 =  S( FUNCTOR_retract_1 , a1);
 ;
        a9 = m.mkvar1();
    // put_str_args([a(9),void],y(5)),put_str(@('FUNCTOR_$003A$002D_2'),y(5),a(10))
        a10 =  S( FUNCTOR_$003A$002D_2 , a9, m.mkvar3());
 ;
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$clause_to_term_4_static_exec, VA(a1, a2, a5, a6), //
 Op(FILE_system::PRED_$new_internal_database_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$check_procedure_permission_4_static_exec, VA(a7,  ATOM_access ,  ATOM_static_procedure , a8), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a2, a10), //
 Op(FILE_system::PRED_$clause_internal_5_static_exec, VA(a3, a4, a9, a11, a12), //
 Op(FILE_system::PRED_copy_term_2_static_exec, VA(a11, a2), //
 Op(FILE_system::PRED_$erase_1_static_exec, VA(a12), //
 Op(FILE_system::PRED_$rehash_indexing_3_static_exec, VA(a3, a4, a12), cont))))))));
    }
/** PREDICATE: retractall/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(retractall/1,public)




    public static Operation PRED_retractall_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::retractall_1_sub_1);
        return retractall_1_1(m);
    }

    private final static Operation retractall_1_sub_1(Prolog m) { 
        m.trust(null);
        return retractall_1_2(m);
    }

    private final static Operation retractall_1_1(Prolog m) { 
    // retractall(A):-'$head_to_term'(A,B,C:D,retractall(A)),'$new_internal_database'(C),'$check_procedure_permission'(C:D,access,static_procedure,retractall(A)),'$clause_internal'(C,D,B,E,F),copy_term(E,(B:-G)),'$erase'(F),'$rehash_indexing'(C,D,F),fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // retractall(A):-['$head_to_term'(A,B,C:D,retractall(A)),'$new_internal_database'(C),'$check_procedure_permission'(C:D,access,static_procedure,retractall(A)),'$clause_internal'(C,D,B,E,F),copy_term(E,(B:-G)),'$erase'(F),'$rehash_indexing'(C,D,F),fail]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 , a3, a4);
 ;
    // put_str_args([a(1)],y(2)),put_str(@('FUNCTOR_retractall_1'),y(2),a(6))
        a6 =  S( FUNCTOR_retractall_1 , a1);
 ;
    // put_str_args([a(3),a(4)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a3, a4);
 ;
    // put_str_args([a(1)],y(4)),put_str(@('FUNCTOR_retractall_1'),y(4),a(8))
        a8 =  S( FUNCTOR_retractall_1 , a1);
 ;
        a9 = m.mkvar1();
        a10 = m.mkvar1();
    // put_str_args([a(2),void],y(5)),put_str(@('FUNCTOR_$003A$002D_2'),y(5),a(11))
        a11 =  S( FUNCTOR_$003A$002D_2 , a2, m.mkvar3());
 ;
        return //
 Op(FILE_system::PRED_$head_to_term_4_static_exec, VA(a1, a2, a5, a6), //
 Op(FILE_system::PRED_$new_internal_database_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$check_procedure_permission_4_static_exec, VA(a7,  ATOM_access ,  ATOM_static_procedure , a8), //
 Op(FILE_system::PRED_$clause_internal_5_static_exec, VA(a3, a4, a2, a9, a10), //
 Op(FILE_system::PRED_copy_term_2_static_exec, VA(a9, a11), //
 Op(FILE_system::PRED_$erase_1_static_exec, VA(a10), //
 Op(FILE_system::PRED_$rehash_indexing_3_static_exec, VA(a3, a4, a10), fail_0)))))));
    }

    private final static Operation retractall_1_2(Prolog m) { 
    // retractall(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // retractall(A):-[]
        return cont;
    }
/** PREDICATE: $term_to_clause/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$term_to_clause'/4,non-(public))




    public static Operation PRED_$term_to_clause_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$term_to_clause'(A,B,C:D/E,F):-'$term_to_clause'(A,B,user,C,F),B=(G:-H),functor(G,D,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // '$term_to_clause'(A,B,C:D/E,F):-['$term_to_clause'(A,B,user,C,F),'$unify'(B,(G:-H)),functor(G,D,E)]
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_module_colon_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002F_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a9 = m.mkvar1();
    // put_str_args([a(9),void],y(1)),put_str(@('FUNCTOR_$003A$002D_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$003A$002D_2 , a9, m.mkvar3());
 ;
        return //
 Op(FILE_system::PRED_$term_to_clause_5_static_exec, VA(a1, a2,  ATOM_user , a5, a4), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a2, a10), //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a9, a7, a8), cont)));
    }
/** PREDICATE: $term_to_clause/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$term_to_clause'/5,non-(public))
        final static SymbolTerm ATOM_atom = SYM("atom");
    private static final StructureTerm L_$term_to_clause_5_s7 = S( FUNCTOR_type_1 ,  ATOM_atom );

    // private final Term arg5;




    public static Operation PRED_$term_to_clause_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $term_to_clause_5_top(m);
    }

    private final static Operation $term_to_clause_5_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$term_to_clause_5_var, FILE_builtins::$term_to_clause_5_int, FILE_builtins::$term_to_clause_5_int, FILE_builtins::$term_to_clause_5_int, FILE_builtins::$term_to_clause_5_var, FILE_builtins::$term_to_clause_5_int); 
    }

    private final static Operation $term_to_clause_5_var(Prolog m) { 
        m.jtry5(null, FILE_builtins::$term_to_clause_5_var_1);
        return $term_to_clause_5_1(m);
    }

    private final static Operation $term_to_clause_5_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_clause_5_var_2);
        return $term_to_clause_5_2(m);
    }

    private final static Operation $term_to_clause_5_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_clause_5_var_3);
        return $term_to_clause_5_3(m);
    }

    private final static Operation $term_to_clause_5_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_clause_5_var_4);
        return $term_to_clause_5_4(m);
    }

    private final static Operation $term_to_clause_5_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_clause_5_var_5);
        return $term_to_clause_5_5(m);
    }

    private final static Operation $term_to_clause_5_var_5(Prolog m) { 
        m.trust(null);
        return $term_to_clause_5_6(m);
    }

    private final static Operation $term_to_clause_5_int(Prolog m) { 
        m.jtry5(null, FILE_builtins::$term_to_clause_5_int_1);
        return $term_to_clause_5_1(m);
    }

    private final static Operation $term_to_clause_5_int_1(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_clause_5_int_2);
        return $term_to_clause_5_2(m);
    }

    private final static Operation $term_to_clause_5_int_2(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_clause_5_int_3);
        return $term_to_clause_5_4(m);
    }

    private final static Operation $term_to_clause_5_int_3(Prolog m) { 
        m.trust(null);
        return $term_to_clause_5_6(m);
    }

    private final static Operation $term_to_clause_5_1(Prolog m) { 
    // '$term_to_clause'(A,B,C,D,E):-var(A),!,illarg(var,E,1)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_clause'(A,B,C,D,E):-['$get_level'(F),var(A),'$cut'(F),illarg(var,E,1)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a5,  int_1 ), cont);
    }

    private final static Operation $term_to_clause_5_2(Prolog m) { 
    // '$term_to_clause'(A,B,C,D,E):-var(C),!,illarg(var,E,1)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_clause'(A,B,C,D,E):-['$get_level'(F),var(C),'$cut'(F),illarg(var,E,1)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(3))
        a3 = a3.dref();
        if (! (a3 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a5,  int_1 ), cont);
    }

    private final static Operation $term_to_clause_5_3(Prolog m) { 
    // '$term_to_clause'(A:B,C,D,E,F):-!,'$term_to_clause'(B,C,A,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_clause'(A:B,C,D,E,F):-['$neck_cut','$term_to_clause'(B,C,A,E,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
m.cont = cont;
        return $term_to_clause_5_top(m);
    }

    private final static Operation $term_to_clause_5_4(Prolog m) { 
    // '$term_to_clause'(A,B,C,D,E):-'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(C),!,illarg(type(atom),E,1)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_clause'(A,B,C,D,E):-['$get_level'(F),'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(C),'$cut'(F),illarg(type(atom),E,1)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a6), //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$term_to_clause_5_s7, a5,  int_1 ), cont)));
    }

    private final static Operation $term_to_clause_5_5(Prolog m) { 
    // '$term_to_clause'((A:-B),(C:-D),E,E,F):-!,'$term_to_head'(A,C,E,F),'$term_to_body'(B,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_clause'((A:-B),(C:-D),E,E,F):-['$neck_cut','$term_to_head'(A,C,E,F),'$term_to_body'(B,D,E,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a2 = a2.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a8, a9)){
                return m.fail();
            }
        if (! a3.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$term_to_head_4_static_exec, VA(a6, a8, a3, a5), //
 Op(FILE_system::PRED_$term_to_body_4_static_exec, VA(a7, a9, a3, a5), cont));
    }

    private final static Operation $term_to_clause_5_6(Prolog m) { 
    // '$term_to_clause'(A,(B:-true),C,C,D):-'$term_to_head'(A,B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_clause'(A,(B:-true),C,C,D):-['$term_to_head'(A,B,C,D)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a6,  Prolog.True )){
                return m.fail();
            }
        if (! a3.unify(a4, m.trail))
            return m.fail();
        return //
 Op(FILE_system::PRED_$term_to_head_4_static_exec, VA(a1, a6, a3, a5), cont);
    }
/** PREDICATE: $dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))




    public static Operation PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-atom(A),!,fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),atom(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $term_to_head/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$term_to_head'/4,non-(public))
    private static final StructureTerm L_$term_to_head_4_s4 = S( FUNCTOR_type_1 ,  ATOM_callable );




    public static Operation PRED_$term_to_head_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_builtins::$term_to_head_4_sub_1);
        return $term_to_head_4_1(m);
    }

    private final static Operation $term_to_head_4_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_head_4_sub_2);
        return $term_to_head_4_2(m);
    }

    private final static Operation $term_to_head_4_sub_2(Prolog m) { 
        m.trust(null);
        return $term_to_head_4_3(m);
    }

    private final static Operation $term_to_head_4_1(Prolog m) { 
    // '$term_to_head'(A,A,B,C):-atom(A),!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$term_to_head'(A,A,B,C):-['$get_level'(D),atom(A),'$cut'(D)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(5))
        a5 = a5.dref();
                  m.cut( a5.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $term_to_head_4_2(Prolog m) { 
    // '$term_to_head'(A,A,B,C):-compound(A),!
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$term_to_head'(A,A,B,C):-['$get_level'(D),compound(A),'$cut'(D)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_compound_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a5), cont));
    }

    private final static Operation $term_to_head_4_3(Prolog m) { 
    // '$term_to_head'(A,B,C,D):-illarg(type(callable),D,1)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$term_to_head'(A,B,C,D):-[illarg(type(callable),D,1)]
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$term_to_head_4_s4, a4,  int_1 ), cont);
    }
/** PREDICATE: $term_to_body/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$term_to_body'/4,non-(public))




    public static Operation PRED_$term_to_body_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$term_to_body'(A,B,C,D):-'$localize_body'(A,C,B)
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // '$term_to_body'(A,B,C,D):-['$localize_body'(A,C,B)]
        return //
 Op(FILE_system::PRED_$localize_body_3_static_exec, VA(a1, a3, a2), cont);
    }
/** PREDICATE: $localize_body/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$localize_body'/3,non-(public))




    public static Operation PRED_$localize_body_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $localize_body_3_top(m);
    }

    private final static Operation $localize_body_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$localize_body_3_var, FILE_builtins::$localize_body_3_int, FILE_builtins::$localize_body_3_int, FILE_builtins::$localize_body_3_int, FILE_builtins::$localize_body_3_var, FILE_builtins::$localize_body_3_int); 
    }

    private final static Operation $localize_body_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$localize_body_3_var_1);
        return $localize_body_3_1(m);
    }

    private final static Operation $localize_body_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_var_2);
        return $localize_body_3_2(m);
    }

    private final static Operation $localize_body_3_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_var_3);
        return $localize_body_3_3(m);
    }

    private final static Operation $localize_body_3_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_var_4);
        return $localize_body_3_4(m);
    }

    private final static Operation $localize_body_3_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_var_5);
        return $localize_body_3_5(m);
    }

    private final static Operation $localize_body_3_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_var_6);
        return $localize_body_3_6(m);
    }

    private final static Operation $localize_body_3_var_6(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_var_7);
        return $localize_body_3_7(m);
    }

    private final static Operation $localize_body_3_var_7(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_var_8);
        return $localize_body_3_8(m);
    }

    private final static Operation $localize_body_3_var_8(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_var_9);
        return $localize_body_3_9(m);
    }

    private final static Operation $localize_body_3_var_9(Prolog m) { 
        m.trust(null);
        return $localize_body_3_10(m);
    }

    private final static Operation $localize_body_3_int(Prolog m) { 
        m.jtry3(null, FILE_builtins::$localize_body_3_int_1);
        return $localize_body_3_1(m);
    }

    private final static Operation $localize_body_3_int_1(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_int_2);
        return $localize_body_3_6(m);
    }

    private final static Operation $localize_body_3_int_2(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_int_3);
        return $localize_body_3_7(m);
    }

    private final static Operation $localize_body_3_int_3(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_int_4);
        return $localize_body_3_8(m);
    }

    private final static Operation $localize_body_3_int_4(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_body_3_int_5);
        return $localize_body_3_9(m);
    }

    private final static Operation $localize_body_3_int_5(Prolog m) { 
        m.trust(null);
        return $localize_body_3_10(m);
    }

    private final static Operation $localize_body_3_1(Prolog m) { 
    // '$localize_body'(A,B,C):-var(A),!,'$localize_body'(call(A),B,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$localize_body'(A,B,C):-['$get_level'(D),var(A),'$cut'(D),'$localize_body'(call(A),B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_call_1'),y(1),a(5))
        a5 =  S( FUNCTOR_call_1 , a1);
 ;
        m.AREGS[0] = a5;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
m.cont = cont;
        return $localize_body_3_top(m);
    }

    private final static Operation $localize_body_3_2(Prolog m) { 
    // '$localize_body'(A:B,C,D):-!,'$localize_body'(B,A,D)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$localize_body'(A:B,C,D):-['$neck_cut','$localize_body'(B,A,D)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a4, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a5;
        m.AREGS[1] = a4;
        m.AREGS[2] = a3;
m.cont = cont;
        return $localize_body_3_top(m);
    }

    private final static Operation $localize_body_3_3(Prolog m) { 
    // '$localize_body'((A,B),C,(D,E)):-!,'$localize_body'(A,C,D),'$localize_body'(B,C,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$localize_body'((A,B),C,(D,E)):-['$neck_cut','$localize_body'(A,C,D),'$localize_body'(B,C,E)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002C_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002C_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op(FILE_system::PRED_$localize_body_3_static_exec, VA(a5, a2, a7), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
        m.cont = p1;
        return $localize_body_3_top(m);
    }

    private final static Operation $localize_body_3_4(Prolog m) { 
    // '$localize_body'((A->B),C,(D->E)):-!,'$localize_body'(A,C,D),'$localize_body'(B,C,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$localize_body'((A->B),C,(D->E)):-['$neck_cut','$localize_body'(A,C,D),'$localize_body'(B,C,E)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op(FILE_system::PRED_$localize_body_3_static_exec, VA(a5, a2, a7), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
        m.cont = p1;
        return $localize_body_3_top(m);
    }

    private final static Operation $localize_body_3_5(Prolog m) { 
    // '$localize_body'((A;B),C,(D;E)):-!,'$localize_body'(A,C,D),'$localize_body'(B,C,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$localize_body'((A;B),C,(D;E)):-['$neck_cut','$localize_body'(A,C,D),'$localize_body'(B,C,E)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_or_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_or_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op(FILE_system::PRED_$localize_body_3_static_exec, VA(a5, a2, a7), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
        m.cont = p1;
        return $localize_body_3_top(m);
    }

    private final static Operation $localize_body_3_6(Prolog m) { 
    // '$localize_body'(A,B,C):-functor(A,D,E),'$builtin_meta_predicates'(D,E,F),!,A=..[D|G],'$localize_args'(F,G,B,H),C=..[D|H]
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$localize_body'(A,B,C):-['$get_level'(D),functor(A,E,F),'$builtin_meta_predicates'(E,F,G),'$cut'(D),'$univ'(A,[E|H]),'$localize_args'(G,H,B,I),'$univ'(C,[E|I])]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = CONS(a5, a8);
        a10 = m.mkvar1();
        a11 = CONS(a5, a10);
        return //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a1, a5, a6), //
 Op(FILE_system::PRED_$builtin_meta_predicates_3_static_exec, VA(a5, a6, a7), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a1, a9), //
 Op(FILE_system::PRED_$localize_args_4_static_exec, VA(a7, a8, a2, a10), //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a3, a11), cont))))));
    }

    private final static Operation $localize_body_3_7(Prolog m) { 
    // '$localize_body'(A,B,call(B:A)):-var(B),!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$localize_body'(A,B,call(B:A)):-['$get_level'(C),var(B),'$cut'(C)]
        a3 = a3.dref();
            a4 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_call_1 , m.trail, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_module_colon_2 , m.trail, a2, a1)){
                return m.fail();
            }
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(5))
        a5 = a5.dref();
                  m.cut( a5.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $localize_body_3_8(Prolog m) { 
    // '$localize_body'(A,user,A):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$localize_body'(A,user,A):-['$neck_cut']
        if (!  ATOM_user .unify(a2, m.trail))
            return m.fail();
        if (! a1.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $localize_body_3_9(Prolog m) { 
    // '$localize_body'(A,B,A):-system_predicate(A),!
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$localize_body'(A,B,A):-['$get_level'(C),system_predicate(A),'$cut'(C)]
        if (! a1.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_system_predicate_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation $localize_body_3_10(Prolog m) { 
    // '$localize_body'(A,B,B:A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$localize_body'(A,B,B:A):-[]
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_module_colon_2 , m.trail, a2, a1)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: $localize_args/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$localize_args'/4,non-(public))
        final static SymbolTerm ATOM_module_colon = SYM(":");




    public static Operation PRED_$localize_args_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $localize_args_4_top(m);
    }

    private final static Operation $localize_args_4_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$localize_args_4_var, fail_0, fail_0, FILE_builtins::$localize_args_4_1, fail_0, FILE_builtins::$localize_args_4_lis); 
    }

    private final static Operation $localize_args_4_var(Prolog m) { 
        m.jtry4(null, FILE_builtins::$localize_args_4_var_1);
        return $localize_args_4_1(m);
    }

    private final static Operation $localize_args_4_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$localize_args_4_var_2);
        return $localize_args_4_2(m);
    }

    private final static Operation $localize_args_4_var_2(Prolog m) { 
        m.trust(null);
        return $localize_args_4_3(m);
    }

    private final static Operation $localize_args_4_lis(Prolog m) { 
        m.jtry4(null, FILE_builtins::$localize_args_4_lis_1);
        return $localize_args_4_2(m);
    }

    private final static Operation $localize_args_4_lis_1(Prolog m) { 
        m.trust(null);
        return $localize_args_4_3(m);
    }

    private final static Operation $localize_args_4_1(Prolog m) { 
    // '$localize_args'([],[],A,[]):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$localize_args'([],[],A,[]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $localize_args_4_2(Prolog m) { 
    // '$localize_args'([:|A],[B|C],D,[D:B|E]):-'$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(B,F,G),!,'$localize_args'(A,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$localize_args'([:|A],[B|C],D,[D:B|E]):-['$get_level'(F),'$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(B,G,H),'$cut'(F),'$localize_args'(A,C,D,E)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        if (!  ATOM_module_colon .unify(a1.car(), m.trail))
                return m.fail();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a5 = m.mkvar2();
             a1.bind(CONS( ATOM_module_colon , a5), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
                        a8 = a4.car();
            a9 = a4.cdr();
        } else if (a4.isVar()){
            a8 = m.mkvar2();
            a9 = m.mkvar2();
             a4.bind(CONS(a8, a9), m.trail);
        } else {
            return m.fail();
        }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a6)){
                return m.fail();
            }
        a10 = m.mkvar1();
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec, VA(a6, m.DONT_CARE2(), m.DONT_CARE2()), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a10), //
 Op(FILE_system::PRED_$localize_args_4_static_exec, VA(a5, a7, a3, a9), cont)));
    }

    private final static Operation $localize_args_4_3(Prolog m) { 
    // '$localize_args'([A|B],[C|D],E,[C|F]):-'$localize_args'(B,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$localize_args'([A|B],[C|D],E,[C|F]):-['$localize_args'(B,D,E,F)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a5 = a1.cdr();
        } else if (a1.isVar()){
            a5 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a5), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a6.unify(a4.car(), m.trail))
                return m.fail();
            a8 = a4.cdr();
        } else if (a4.isVar()){
            a8 = m.mkvar2();
             a4.bind(CONS(a6, a8), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a5;
        m.AREGS[1] = a7;
        m.AREGS[2] = a3;
        m.AREGS[3] = a8;
m.cont = cont;
        return $localize_args_4_top(m);
    }
/** PREDICATE: $dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/3,non-(public))




    public static Operation PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-var(A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-[var(A)]
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-A\=B:C
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-['$not_unifiable'(A,B:C)]
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 , a2, a3);
 ;
        //START inline expansion of $not_unifiable(a(1),a(4))
        if (a1.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $builtin_meta_predicates/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$builtin_meta_predicates'/3,non-(public))
        final static SymbolTerm ATOM_$005E = SYM("^");
        final static SymbolTerm ATOM_$003F = SYM("?");
    private static final ListTerm L_$builtin_meta_predicates_3_s6 = CONS( ATOM_module_colon ,  Prolog.Nil );
    private static final ListTerm L_$builtin_meta_predicates_3_s7 = CONS( ATOM_$003F , L_$builtin_meta_predicates_3_s6);
        final static SymbolTerm ATOM_call = SYM("call");
        final static SymbolTerm ATOM_once = SYM("once");
        final static SymbolTerm ATOM_$005C$002B = SYM("\\+");
        final static SymbolTerm ATOM_findall = SYM("findall");
    private static final ListTerm L_$builtin_meta_predicates_3_s14 = CONS( ATOM_$003F ,  Prolog.Nil );
    private static final ListTerm L_$builtin_meta_predicates_3_s15 = CONS( ATOM_module_colon , L_$builtin_meta_predicates_3_s14);
    private static final ListTerm L_$builtin_meta_predicates_3_s16 = CONS( ATOM_$003F , L_$builtin_meta_predicates_3_s15);
        final static SymbolTerm ATOM_setof = SYM("setof");
        final static SymbolTerm ATOM_bagof = SYM("bagof");
        final static SymbolTerm ATOM_on_exception = SYM("on_exception");
    private static final ListTerm L_$builtin_meta_predicates_3_s20 = CONS( ATOM_module_colon , L_$builtin_meta_predicates_3_s6);
    private static final ListTerm L_$builtin_meta_predicates_3_s21 = CONS( ATOM_$003F , L_$builtin_meta_predicates_3_s20);
        final static SymbolTerm ATOM_catch = SYM("catch");
    private static final ListTerm L_$builtin_meta_predicates_3_s23 = CONS( ATOM_module_colon , L_$builtin_meta_predicates_3_s7);
        final static SymbolTerm ATOM_synchronized = SYM("synchronized");
        final static SymbolTerm ATOM_freeze = SYM("freeze");




    public static Operation PRED_$builtin_meta_predicates_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$builtin_meta_predicates_3_var, fail_0, fail_0, FILE_builtins::$builtin_meta_predicates_3_var, fail_0, fail_0); 
    }

    private final static Operation $builtin_meta_predicates_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$builtin_meta_predicates_3_var_1);
        return $builtin_meta_predicates_3_1(m);
    }

    private final static Operation $builtin_meta_predicates_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_meta_predicates_3_var_2);
        return $builtin_meta_predicates_3_2(m);
    }

    private final static Operation $builtin_meta_predicates_3_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_meta_predicates_3_var_3);
        return $builtin_meta_predicates_3_3(m);
    }

    private final static Operation $builtin_meta_predicates_3_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_meta_predicates_3_var_4);
        return $builtin_meta_predicates_3_4(m);
    }

    private final static Operation $builtin_meta_predicates_3_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_meta_predicates_3_var_5);
        return $builtin_meta_predicates_3_5(m);
    }

    private final static Operation $builtin_meta_predicates_3_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_meta_predicates_3_var_6);
        return $builtin_meta_predicates_3_6(m);
    }

    private final static Operation $builtin_meta_predicates_3_var_6(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_meta_predicates_3_var_7);
        return $builtin_meta_predicates_3_7(m);
    }

    private final static Operation $builtin_meta_predicates_3_var_7(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_meta_predicates_3_var_8);
        return $builtin_meta_predicates_3_8(m);
    }

    private final static Operation $builtin_meta_predicates_3_var_8(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_meta_predicates_3_var_9);
        return $builtin_meta_predicates_3_9(m);
    }

    private final static Operation $builtin_meta_predicates_3_var_9(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_meta_predicates_3_var_10);
        return $builtin_meta_predicates_3_10(m);
    }

    private final static Operation $builtin_meta_predicates_3_var_10(Prolog m) { 
        m.trust(null);
        return $builtin_meta_predicates_3_11(m);
    }

    private final static Operation $builtin_meta_predicates_3_1(Prolog m) { 
    // '$builtin_meta_predicates'(^,2,[?,:]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_meta_predicates'(^,2,[?,:]):-[]
        if (!  ATOM_$005E .unify(a1, m.trail))
            return m.fail();
        if (!  int_2 .unify(a2, m.trail))
            return m.fail();
        if (! L_$builtin_meta_predicates_3_s7.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $builtin_meta_predicates_3_2(Prolog m) { 
    // '$builtin_meta_predicates'(call,1,[:]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_meta_predicates'(call,1,[:]):-[]
        if (!  ATOM_call .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a2, m.trail))
            return m.fail();
        if (! L_$builtin_meta_predicates_3_s6.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $builtin_meta_predicates_3_3(Prolog m) { 
    // '$builtin_meta_predicates'(once,1,[:]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_meta_predicates'(once,1,[:]):-[]
        if (!  ATOM_once .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a2, m.trail))
            return m.fail();
        if (! L_$builtin_meta_predicates_3_s6.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $builtin_meta_predicates_3_4(Prolog m) { 
    // '$builtin_meta_predicates'(\+,1,[:]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_meta_predicates'(\+,1,[:]):-[]
        if (!  ATOM_$005C$002B .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a2, m.trail))
            return m.fail();
        if (! L_$builtin_meta_predicates_3_s6.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $builtin_meta_predicates_3_5(Prolog m) { 
    // '$builtin_meta_predicates'(findall,3,[?,:,?]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_meta_predicates'(findall,3,[?,:,?]):-[]
        if (!  ATOM_findall .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a2, m.trail))
            return m.fail();
        if (! L_$builtin_meta_predicates_3_s16.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $builtin_meta_predicates_3_6(Prolog m) { 
    // '$builtin_meta_predicates'(setof,3,[?,:,?]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_meta_predicates'(setof,3,[?,:,?]):-[]
        if (!  ATOM_setof .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a2, m.trail))
            return m.fail();
        if (! L_$builtin_meta_predicates_3_s16.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $builtin_meta_predicates_3_7(Prolog m) { 
    // '$builtin_meta_predicates'(bagof,3,[?,:,?]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_meta_predicates'(bagof,3,[?,:,?]):-[]
        if (!  ATOM_bagof .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a2, m.trail))
            return m.fail();
        if (! L_$builtin_meta_predicates_3_s16.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $builtin_meta_predicates_3_8(Prolog m) { 
    // '$builtin_meta_predicates'(on_exception,3,[?,:,:]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_meta_predicates'(on_exception,3,[?,:,:]):-[]
        if (!  ATOM_on_exception .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a2, m.trail))
            return m.fail();
        if (! L_$builtin_meta_predicates_3_s21.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $builtin_meta_predicates_3_9(Prolog m) { 
    // '$builtin_meta_predicates'(catch,3,[:,?,:]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_meta_predicates'(catch,3,[:,?,:]):-[]
        if (!  ATOM_catch .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a2, m.trail))
            return m.fail();
        if (! L_$builtin_meta_predicates_3_s23.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $builtin_meta_predicates_3_10(Prolog m) { 
    // '$builtin_meta_predicates'(synchronized,2,[?,:]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_meta_predicates'(synchronized,2,[?,:]):-[]
        if (!  ATOM_synchronized .unify(a1, m.trail))
            return m.fail();
        if (!  int_2 .unify(a2, m.trail))
            return m.fail();
        if (! L_$builtin_meta_predicates_3_s7.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $builtin_meta_predicates_3_11(Prolog m) { 
    // '$builtin_meta_predicates'(freeze,2,[?,:]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_meta_predicates'(freeze,2,[?,:]):-[]
        if (!  ATOM_freeze .unify(a1, m.trail))
            return m.fail();
        if (!  int_2 .unify(a2, m.trail))
            return m.fail();
        if (! L_$builtin_meta_predicates_3_s7.unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $clause_to_term/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$clause_to_term'/4,non-(public))




    public static Operation PRED_$clause_to_term_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$clause_to_term'(A,B,C:D/E,F):-'$clause_to_term'(A,B,user,C,F),B=(G:-H),functor(G,D,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // '$clause_to_term'(A,B,C:D/E,F):-['$clause_to_term'(A,B,user,C,F),'$unify'(B,(G:-H)),functor(G,D,E)]
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_module_colon_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002F_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a9 = m.mkvar1();
    // put_str_args([a(9),void],y(1)),put_str(@('FUNCTOR_$003A$002D_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$003A$002D_2 , a9, m.mkvar3());
 ;
        return //
 Op(FILE_system::PRED_$clause_to_term_5_static_exec, VA(a1, a2,  ATOM_user , a5, a4), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a2, a10), //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a9, a7, a8), cont)));
    }
/** PREDICATE: $clause_to_term/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$clause_to_term'/5,non-(public))
    private static final StructureTerm L_$clause_to_term_5_s7 = S( FUNCTOR_type_1 ,  ATOM_atom );

    // private final Term arg5;




    public static Operation PRED_$clause_to_term_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $clause_to_term_5_top(m);
    }

    private final static Operation $clause_to_term_5_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$clause_to_term_5_var, FILE_builtins::$clause_to_term_5_int, FILE_builtins::$clause_to_term_5_int, FILE_builtins::$clause_to_term_5_int, FILE_builtins::$clause_to_term_5_var, FILE_builtins::$clause_to_term_5_int); 
    }

    private final static Operation $clause_to_term_5_var(Prolog m) { 
        m.jtry5(null, FILE_builtins::$clause_to_term_5_var_1);
        return $clause_to_term_5_1(m);
    }

    private final static Operation $clause_to_term_5_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$clause_to_term_5_var_2);
        return $clause_to_term_5_2(m);
    }

    private final static Operation $clause_to_term_5_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$clause_to_term_5_var_3);
        return $clause_to_term_5_3(m);
    }

    private final static Operation $clause_to_term_5_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$clause_to_term_5_var_4);
        return $clause_to_term_5_4(m);
    }

    private final static Operation $clause_to_term_5_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$clause_to_term_5_var_5);
        return $clause_to_term_5_5(m);
    }

    private final static Operation $clause_to_term_5_var_5(Prolog m) { 
        m.trust(null);
        return $clause_to_term_5_6(m);
    }

    private final static Operation $clause_to_term_5_int(Prolog m) { 
        m.jtry5(null, FILE_builtins::$clause_to_term_5_int_1);
        return $clause_to_term_5_1(m);
    }

    private final static Operation $clause_to_term_5_int_1(Prolog m) { 
        m.retry(null, FILE_builtins::$clause_to_term_5_int_2);
        return $clause_to_term_5_2(m);
    }

    private final static Operation $clause_to_term_5_int_2(Prolog m) { 
        m.retry(null, FILE_builtins::$clause_to_term_5_int_3);
        return $clause_to_term_5_4(m);
    }

    private final static Operation $clause_to_term_5_int_3(Prolog m) { 
        m.trust(null);
        return $clause_to_term_5_6(m);
    }

    private final static Operation $clause_to_term_5_1(Prolog m) { 
    // '$clause_to_term'(A,B,C,D,E):-var(A),!,illarg(var,E,1)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$clause_to_term'(A,B,C,D,E):-['$get_level'(F),var(A),'$cut'(F),illarg(var,E,1)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a5,  int_1 ), cont);
    }

    private final static Operation $clause_to_term_5_2(Prolog m) { 
    // '$clause_to_term'(A,B,C,D,E):-var(C),!,illarg(var,E,1)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$clause_to_term'(A,B,C,D,E):-['$get_level'(F),var(C),'$cut'(F),illarg(var,E,1)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(3))
        a3 = a3.dref();
        if (! (a3 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a5,  int_1 ), cont);
    }

    private final static Operation $clause_to_term_5_3(Prolog m) { 
    // '$clause_to_term'(A:B,C,D,E,F):-!,'$clause_to_term'(B,C,A,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$clause_to_term'(A:B,C,D,E,F):-['$neck_cut','$clause_to_term'(B,C,A,E,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
m.cont = cont;
        return $clause_to_term_5_top(m);
    }

    private final static Operation $clause_to_term_5_4(Prolog m) { 
    // '$clause_to_term'(A,B,C,D,E):-'$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(C),!,illarg(type(atom),E,1)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$clause_to_term'(A,B,C,D,E):-['$get_level'(F),'$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(C),'$cut'(F),illarg(type(atom),E,1)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a6), //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$clause_to_term_5_s7, a5,  int_1 ), cont)));
    }

    private final static Operation $clause_to_term_5_5(Prolog m) { 
    // '$clause_to_term'((A:-B),(C:-B),D,D,E):-!,'$head_to_term'(A,C,F,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$clause_to_term'((A:-B),(C:-B),D,D,E):-['$neck_cut','$head_to_term'(A,C,F,E)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a2 = a2.dref();
            a8 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a8, a7)){
                return m.fail();
            }
        if (! a3.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$head_to_term_4_static_exec, VA(a6, a8, m.DONT_CARE2(), a5), cont);
    }

    private final static Operation $clause_to_term_5_6(Prolog m) { 
    // '$clause_to_term'(A,(B:-true),C,C,D):-'$head_to_term'(A,B,E,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$clause_to_term'(A,(B:-true),C,C,D):-['$head_to_term'(A,B,E,D)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a6,  Prolog.True )){
                return m.fail();
            }
        if (! a3.unify(a4, m.trail))
            return m.fail();
        return //
 Op(FILE_system::PRED_$head_to_term_4_static_exec, VA(a1, a6, m.DONT_CARE2(), a5), cont);
    }
/** PREDICATE: $dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))




    public static Operation PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-atom(A),!,fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),atom(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $term_to_predicateindicator/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$term_to_predicateindicator'/3,non-(public))




    public static Operation PRED_$term_to_predicateindicator_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$term_to_predicateindicator'(A,B:C,D):-'$term_to_predicateindicator'(A,C,user,B,D)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$term_to_predicateindicator'(A,B:C,D):-['$term_to_predicateindicator'(A,C,user,B,D)]
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_module_colon_2 , m.trail, a4, a5)){
                return m.fail();
            }
        return //
 Op(FILE_system::PRED_$term_to_predicateindicator_5_static_exec, VA(a1, a5,  ATOM_user , a4, a3), cont);
    }
/** PREDICATE: $term_to_predicateindicator/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$term_to_predicateindicator'/5,non-(public))
        final static SymbolTerm ATOM_predicate_indicator = SYM("predicate_indicator");
    private static final StructureTerm L_$term_to_predicateindicator_5_s8 = S( FUNCTOR_type_1 ,  ATOM_predicate_indicator );
    private static final StructureTerm L_$term_to_predicateindicator_5_s11 = S( FUNCTOR_type_1 ,  ATOM_atom );
        final static SymbolTerm ATOM_integer = SYM("integer");
    private static final StructureTerm L_$term_to_predicateindicator_5_s14 = S( FUNCTOR_type_1 ,  ATOM_integer );

    // private final Term arg5;




    public static Operation PRED_$term_to_predicateindicator_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $term_to_predicateindicator_5_top(m);
    }

    private final static Operation $term_to_predicateindicator_5_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$term_to_predicateindicator_5_var, FILE_builtins::$term_to_predicateindicator_5_int, FILE_builtins::$term_to_predicateindicator_5_int, FILE_builtins::$term_to_predicateindicator_5_int, FILE_builtins::$term_to_predicateindicator_5_var, FILE_builtins::$term_to_predicateindicator_5_int); 
    }

    private final static Operation $term_to_predicateindicator_5_var(Prolog m) { 
        m.jtry5(null, FILE_builtins::$term_to_predicateindicator_5_var_1);
        return $term_to_predicateindicator_5_1(m);
    }

    private final static Operation $term_to_predicateindicator_5_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_predicateindicator_5_var_2);
        return $term_to_predicateindicator_5_2(m);
    }

    private final static Operation $term_to_predicateindicator_5_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_predicateindicator_5_var_3);
        return $term_to_predicateindicator_5_3(m);
    }

    private final static Operation $term_to_predicateindicator_5_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_predicateindicator_5_var_4);
        return $term_to_predicateindicator_5_4(m);
    }

    private final static Operation $term_to_predicateindicator_5_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_predicateindicator_5_var_5);
        return $term_to_predicateindicator_5_5(m);
    }

    private final static Operation $term_to_predicateindicator_5_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_predicateindicator_5_var_6);
        return $term_to_predicateindicator_5_6(m);
    }

    private final static Operation $term_to_predicateindicator_5_var_6(Prolog m) { 
        m.trust(null);
        return $term_to_predicateindicator_5_7(m);
    }

    private final static Operation $term_to_predicateindicator_5_int(Prolog m) { 
        m.jtry5(null, FILE_builtins::$term_to_predicateindicator_5_int_1);
        return $term_to_predicateindicator_5_1(m);
    }

    private final static Operation $term_to_predicateindicator_5_int_1(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_predicateindicator_5_int_2);
        return $term_to_predicateindicator_5_2(m);
    }

    private final static Operation $term_to_predicateindicator_5_int_2(Prolog m) { 
        m.retry(null, FILE_builtins::$term_to_predicateindicator_5_int_3);
        return $term_to_predicateindicator_5_4(m);
    }

    private final static Operation $term_to_predicateindicator_5_int_3(Prolog m) { 
        m.trust(null);
        return $term_to_predicateindicator_5_7(m);
    }

    private final static Operation $term_to_predicateindicator_5_1(Prolog m) { 
    // '$term_to_predicateindicator'(A,B,C,D,E):-var(A),!,illarg(var,E,1)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_predicateindicator'(A,B,C,D,E):-['$get_level'(F),var(A),'$cut'(F),illarg(var,E,1)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a5,  int_1 ), cont);
    }

    private final static Operation $term_to_predicateindicator_5_2(Prolog m) { 
    // '$term_to_predicateindicator'(A,B,C,D,E):-var(C),!,illarg(var,E,1)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_predicateindicator'(A,B,C,D,E):-['$get_level'(F),var(C),'$cut'(F),illarg(var,E,1)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(3))
        a3 = a3.dref();
        if (! (a3 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a5,  int_1 ), cont);
    }

    private final static Operation $term_to_predicateindicator_5_3(Prolog m) { 
    // '$term_to_predicateindicator'(A:B,C,D,E,F):-!,'$term_to_predicateindicator'(B,C,A,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_predicateindicator'(A:B,C,D,E,F):-['$neck_cut','$term_to_predicateindicator'(B,C,A,E,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
m.cont = cont;
        return $term_to_predicateindicator_5_top(m);
    }

    private final static Operation $term_to_predicateindicator_5_4(Prolog m) { 
    // '$term_to_predicateindicator'(A,B,C,D,E):-A\=F/G,!,illarg(type(predicate_indicator),E,1)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_predicateindicator'(A,B,C,D,E):-['$get_level'(F),'$not_unifiable'(A,G/H),'$cut'(F),illarg(type(predicate_indicator),E,1)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void,void],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(7))
        a7 =  S( FUNCTOR_$002F_2 , m.mkvar3(), m.mkvar3());
 ;
        //START inline expansion of $not_unifiable(a(1),a(7))
        if (a1.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$term_to_predicateindicator_5_s8, a5,  int_1 ), cont);
    }

    private final static Operation $term_to_predicateindicator_5_5(Prolog m) { 
    // '$term_to_predicateindicator'(A/B,C,D,E,F):-'$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A),!,illarg(type(atom),F,1)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_predicateindicator'(A/B,C,D,E,F):-['$get_level'(G),'$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A),'$cut'(G),illarg(type(atom),F,1)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002F_2 , m.trail, a6, m.DONT_CARE1())){
                return m.fail();
            }
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a6), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a7), //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$term_to_predicateindicator_5_s11, a5,  int_1 ), cont)));
    }

    private final static Operation $term_to_predicateindicator_5_6(Prolog m) { 
    // '$term_to_predicateindicator'(A/B,C,D,E,F):-'$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(B),!,illarg(type(integer),F,1)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_predicateindicator'(A/B,C,D,E,F):-['$get_level'(G),'$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(B),'$cut'(G),illarg(type(integer),F,1)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002F_2 , m.trail, m.DONT_CARE1(), a6)){
                return m.fail();
            }
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a6), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a7), //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$term_to_predicateindicator_5_s14, a5,  int_1 ), cont)));
    }

    private final static Operation $term_to_predicateindicator_5_7(Prolog m) { 
    // '$term_to_predicateindicator'(A,A,B,B,C):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$term_to_predicateindicator'(A,A,B,B,C):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))




    public static Operation PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-atom(A),!,fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),atom(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))




    public static Operation PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-integer(A),!,fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),integer(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of integer(a(1))
        a1 = a1.dref();
        if (! (a1 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $update_indexing/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$update_indexing'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$update_indexing_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$update_indexing'(A,B,C,D,E):-'$new_indexing_hash'(A,B,F),'$gen_indexing_keys'(C,F,G),'$update_indexing_hash'(E,G,F,D)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // '$update_indexing'(A,B,C,D,E):-['$new_indexing_hash'(A,B,F),'$gen_indexing_keys'(C,F,G),'$update_indexing_hash'(E,G,F,D)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$new_indexing_hash_3_static_exec, VA(a1, a2, a6), //
 Op(FILE_system::PRED_$gen_indexing_keys_3_static_exec, VA(a3, a6, a7), //
 Op(FILE_system::PRED_$update_indexing_hash_4_static_exec, VA(a5, a7, a6, a4), cont)));
    }
/** PREDICATE: $gen_indexing_keys/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$gen_indexing_keys'/3,non-(public))
    private static final ListTerm L_$gen_indexing_keys_3_s4 = CONS( ATOM_all ,  Prolog.Nil );




    public static Operation PRED_$gen_indexing_keys_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$gen_indexing_keys_3_var, fail_0, fail_0, fail_0, FILE_builtins::$gen_indexing_keys_3_var, fail_0); 
    }

    private final static Operation $gen_indexing_keys_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$gen_indexing_keys_3_var_1);
        return $gen_indexing_keys_3_1(m);
    }

    private final static Operation $gen_indexing_keys_3_var_1(Prolog m) { 
        m.trust(null);
        return $gen_indexing_keys_3_2(m);
    }

    private final static Operation $gen_indexing_keys_3_1(Prolog m) { 
    // '$gen_indexing_keys'((A:-B),C,[all]):-atom(A),!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$gen_indexing_keys'((A:-B),C,[all]):-['$get_level'(D),atom(A),'$cut'(D)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a4, m.DONT_CARE1())){
                return m.fail();
            }
        if (! L_$gen_indexing_keys_3_s4.unify(a3, m.trail))
            return m.fail();
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(4))
        a4 = a4.dref();
        if (! (a4 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(5))
        a5 = a5.dref();
                  m.cut( a5.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $gen_indexing_keys_3_2(Prolog m) { 
    // '$gen_indexing_keys'((A:-B),C,D):-arg(1,A,E),'$gen_indexing_keys0'(E,C,D)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$gen_indexing_keys'((A:-B),C,D):-[arg(1,A,E),'$gen_indexing_keys0'(E,C,D)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a4, m.DONT_CARE1())){
                return m.fail();
            }
        a5 = m.mkvar1();
        return //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_1 , a4, a5), //
 Op(FILE_system::PRED_$gen_indexing_keys0_3_static_exec, VA(a5, a2, a3), cont));
    }
/** PREDICATE: $gen_indexing_keys0/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$gen_indexing_keys0'/3,non-(public))
    private static final ListTerm L_$gen_indexing_keys0_3_s4 = CONS( ATOM_lis ,  Prolog.Nil );
    private static final ListTerm L_$gen_indexing_keys0_3_s5 = CONS( ATOM_all , L_$gen_indexing_keys0_3_s4);
    private static final ListTerm L_$gen_indexing_keys0_3_s7 = CONS( ATOM_str ,  Prolog.Nil );
    private static final ListTerm L_$gen_indexing_keys0_3_s8 = CONS( ATOM_all , L_$gen_indexing_keys0_3_s7);
    private static final StructureTerm L_$gen_indexing_keys0_3_s12 = S( FUNCTOR_type_1 ,  ATOM_term );
        final static SymbolTerm FUNCTOR_$0024gen_indexing_keys0_3 = F("$gen_indexing_keys0",3);




    public static Operation PRED_$gen_indexing_keys0_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$gen_indexing_keys0_3_sub_1);
        return $gen_indexing_keys0_3_1(m);
    }

    private final static Operation $gen_indexing_keys0_3_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$gen_indexing_keys0_3_sub_2);
        return $gen_indexing_keys0_3_2(m);
    }

    private final static Operation $gen_indexing_keys0_3_sub_2(Prolog m) { 
        m.retry(null, FILE_builtins::$gen_indexing_keys0_3_sub_3);
        return $gen_indexing_keys0_3_3(m);
    }

    private final static Operation $gen_indexing_keys0_3_sub_3(Prolog m) { 
        m.retry(null, FILE_builtins::$gen_indexing_keys0_3_sub_4);
        return $gen_indexing_keys0_3_4(m);
    }

    private final static Operation $gen_indexing_keys0_3_sub_4(Prolog m) { 
        m.trust(null);
        return $gen_indexing_keys0_3_5(m);
    }

    private final static Operation $gen_indexing_keys0_3_1(Prolog m) { 
    // '$gen_indexing_keys0'(A,B,C):-var(A),!,hash_keys(B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$gen_indexing_keys0'(A,B,C):-['$get_level'(D),var(A),'$cut'(D),hash_keys(B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_hash_keys_2_static_exec, VA(a2, a3), cont);
    }

    private final static Operation $gen_indexing_keys0_3_2(Prolog m) { 
    // '$gen_indexing_keys0'(A,B,[all,lis]):-A=[C|D],!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$gen_indexing_keys0'(A,B,[all,lis]):-['$get_level'(C),'$unify'(A,[D|E]),'$cut'(C)]
        if (! L_$gen_indexing_keys0_3_s5.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = CONS(m.DONT_CARE1(), m.DONT_CARE1());
        //START inline expansion of $unify(a(1),a(5))
        if (! a1.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $gen_indexing_keys0_3_3(Prolog m) { 
    // '$gen_indexing_keys0'(A,B,[all,str]):-compound(A),!
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$gen_indexing_keys0'(A,B,[all,str]):-['$get_level'(C),compound(A),'$cut'(C)]
        if (! L_$gen_indexing_keys0_3_s8.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_compound_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation $gen_indexing_keys0_3_4(Prolog m) { 
    // '$gen_indexing_keys0'(A,B,[all,C]):-ground(A),!,'$term_hash'(A,C),'$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$gen_indexing_keys0'(A,B,[all,C]):-['$get_level'(D),ground(A),'$cut'(D),'$term_hash'(A,C),'$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(B,C,E)]
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (!  ATOM_all .unify(a3.car(), m.trail))
                return m.fail();
            a4 = a3.cdr();
        } else if (a3.isVar()){
            a4 = m.mkvar2();
             a3.bind(CONS( ATOM_all , a4), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
                        a5 = a4.car();
            if (!  Prolog.Nil .unify(a4.cdr(), m.trail))
                return m.fail();
        } else if (a4.isVar()){
            a5 = m.mkvar2();
             a4.bind(CONS(a5,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of ground(a(1))
        a1 = a1.dref();
        if (! a1.isGround()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$term_hash_2_static_exec, VA(a1, a5), //
 Op(FILE_system::PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec, VA(a2, a5, m.DONT_CARE2()), cont));
    }

    private final static Operation $gen_indexing_keys0_3_5(Prolog m) { 
    // '$gen_indexing_keys0'(A,B,C):-illarg(type(term),'$gen_indexing_keys0'(A,B,C),1)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$gen_indexing_keys0'(A,B,C):-[illarg(type(term),'$gen_indexing_keys0'(A,B,C),1)]
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_$0024gen_indexing_keys0_3'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024gen_indexing_keys0_3 , a1, a2, a3);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$gen_indexing_keys0_3_s12, a4,  int_1 ), cont);
    }
/** PREDICATE: $dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/3,non-(public))




    public static Operation PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1);
        return $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(m);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(m);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog m) { 
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-hash_contains_key(A,B),!,true
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-['$get_level'(D),hash_contains_key(A,B),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_hash_contains_key_2_static_exec, VA(a1, a2), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog m) { 
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-hash_get(A,var,C),hash_put(A,B,C)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-[hash_get(A,var,C),hash_put(A,B,C)]
        return //
 Op(FILE_system::PRED_hash_get_3_static_exec, VA(a1,  ATOM_var , a3), //
 Op(FILE_system::PRED_hash_put_3_static_exec, VA(a1, a2, a3), cont));
    }
/** PREDICATE: $update_indexing_hash/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$update_indexing_hash'/4,non-(public))




    public static Operation PRED_$update_indexing_hash_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$update_indexing_hash_4_var, fail_0, fail_0, FILE_builtins::$update_indexing_hash_4_var, fail_0, fail_0); 
    }

    private final static Operation $update_indexing_hash_4_var(Prolog m) { 
        m.jtry4(null, FILE_builtins::$update_indexing_hash_4_var_1);
        return $update_indexing_hash_4_1(m);
    }

    private final static Operation $update_indexing_hash_4_var_1(Prolog m) { 
        m.trust(null);
        return $update_indexing_hash_4_2(m);
    }

    private final static Operation $update_indexing_hash_4_1(Prolog m) { 
    // '$update_indexing_hash'(a,A,B,C):-!,'$hash_addz_all'(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$update_indexing_hash'(a,A,B,C):-['$neck_cut','$hash_addz_all'(A,B,C)]
        if (!  ATOM_a .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$hash_addz_all_3_static_exec, VA(a2, a3, a4), cont);
    }

    private final static Operation $update_indexing_hash_4_2(Prolog m) { 
    // '$update_indexing_hash'(z,A,B,C):-!,'$hash_adda_all'(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$update_indexing_hash'(z,A,B,C):-['$neck_cut','$hash_adda_all'(A,B,C)]
        if (!  ATOM_z .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$hash_adda_all_3_static_exec, VA(a2, a3, a4), cont);
    }
/** PREDICATE: $hash_adda_all/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$hash_adda_all'/3,non-(public))




    public static Operation PRED_$hash_adda_all_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$hash_adda_all_3_var, fail_0, fail_0, FILE_builtins::$hash_adda_all_3_1, fail_0, FILE_builtins::$hash_adda_all_3_2); 
    }

    private final static Operation $hash_adda_all_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$hash_adda_all_3_var_1);
        return $hash_adda_all_3_1(m);
    }

    private final static Operation $hash_adda_all_3_var_1(Prolog m) { 
        m.trust(null);
        return $hash_adda_all_3_2(m);
    }

    private final static Operation $hash_adda_all_3_1(Prolog m) { 
    // '$hash_adda_all'([],A,B):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$hash_adda_all'([],A,B):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $hash_adda_all_3_2(Prolog m) { 
    // '$hash_adda_all'([A|B],C,D):-'$hash_adda'(C,A,D),'$hash_adda_all'(B,C,D)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$hash_adda_all'([A|B],C,D):-['$hash_adda'(C,A,D),'$hash_adda_all'(B,C,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_$hash_adda_3_static_exec, VA(a2, a4, a3), //
 Op(FILE_system::PRED_$hash_adda_all_3_static_exec, VA(a5, a2, a3), cont));
    }
/** PREDICATE: $hash_addz_all/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$hash_addz_all'/3,non-(public))




    public static Operation PRED_$hash_addz_all_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$hash_addz_all_3_var, fail_0, fail_0, FILE_builtins::$hash_addz_all_3_1, fail_0, FILE_builtins::$hash_addz_all_3_2); 
    }

    private final static Operation $hash_addz_all_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$hash_addz_all_3_var_1);
        return $hash_addz_all_3_1(m);
    }

    private final static Operation $hash_addz_all_3_var_1(Prolog m) { 
        m.trust(null);
        return $hash_addz_all_3_2(m);
    }

    private final static Operation $hash_addz_all_3_1(Prolog m) { 
    // '$hash_addz_all'([],A,B):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$hash_addz_all'([],A,B):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $hash_addz_all_3_2(Prolog m) { 
    // '$hash_addz_all'([A|B],C,D):-'$hash_addz'(C,A,D),'$hash_addz_all'(B,C,D)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$hash_addz_all'([A|B],C,D):-['$hash_addz'(C,A,D),'$hash_addz_all'(B,C,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_$hash_addz_3_static_exec, VA(a2, a4, a3), //
 Op(FILE_system::PRED_$hash_addz_all_3_static_exec, VA(a5, a2, a3), cont));
    }
/** PREDICATE: $erase_all/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$erase_all'/1,non-(public))




    public static Operation PRED_$erase_all_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$erase_all_1_var, fail_0, fail_0, FILE_builtins::$erase_all_1_1, fail_0, FILE_builtins::$erase_all_1_2); 
    }

    private final static Operation $erase_all_1_var(Prolog m) { 
        m.jtry1(null, FILE_builtins::$erase_all_1_var_1);
        return $erase_all_1_1(m);
    }

    private final static Operation $erase_all_1_var_1(Prolog m) { 
        m.trust(null);
        return $erase_all_1_2(m);
    }

    private final static Operation $erase_all_1_1(Prolog m) { 
    // '$erase_all'([]):-!
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$erase_all'([]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $erase_all_1_2(Prolog m) { 
    // '$erase_all'([A|B]):-'$erase'(A),'$erase_all'(B)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$erase_all'([A|B]):-['$erase'(A),'$erase_all'(B)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a2 = a1.car();
            a3 = a1.cdr();
        } else if (a1.isVar()){
            a2 = m.mkvar2();
            a3 = m.mkvar2();
             a1.bind(CONS(a2, a3), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_$erase_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_$erase_all_1_static_exec, VA(a3), cont));
    }
/** PREDICATE: $rehash_indexing/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$rehash_indexing'/3,non-(public))




    public static Operation PRED_$rehash_indexing_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$rehash_indexing'(A,B,C):-'$new_indexing_hash'(A,B,D),hash_keys(D,E),'$remove_index_all'(E,D,C)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$rehash_indexing'(A,B,C):-['$new_indexing_hash'(A,B,D),hash_keys(D,E),'$remove_index_all'(E,D,C)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$new_indexing_hash_3_static_exec, VA(a1, a2, a4), //
 Op(FILE_system::PRED_hash_keys_2_static_exec, VA(a4, a5), //
 Op(FILE_system::PRED_$remove_index_all_3_static_exec, VA(a5, a4, a3), cont)));
    }
/** PREDICATE: $remove_index_all/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$remove_index_all'/3,non-(public))




    public static Operation PRED_$remove_index_all_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$remove_index_all_3_var, fail_0, fail_0, FILE_builtins::$remove_index_all_3_1, fail_0, FILE_builtins::$remove_index_all_3_2); 
    }

    private final static Operation $remove_index_all_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$remove_index_all_3_var_1);
        return $remove_index_all_3_1(m);
    }

    private final static Operation $remove_index_all_3_var_1(Prolog m) { 
        m.trust(null);
        return $remove_index_all_3_2(m);
    }

    private final static Operation $remove_index_all_3_1(Prolog m) { 
    // '$remove_index_all'([],A,B):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$remove_index_all'([],A,B):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $remove_index_all_3_2(Prolog m) { 
    // '$remove_index_all'([A|B],C,D):-'$hash_remove_first'(C,A,D),'$remove_index_all'(B,C,D)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$remove_index_all'([A|B],C,D):-['$hash_remove_first'(C,A,D),'$remove_index_all'(B,C,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_$hash_remove_first_3_static_exec, VA(a2, a4, a3), //
 Op(FILE_system::PRED_$remove_index_all_3_static_exec, VA(a5, a2, a3), cont));
    }
/** PREDICATE: findall/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(findall/3,public)
    private static final StructureTerm L_findall_3_s4 = S( FUNCTOR_type_1 ,  ATOM_callable );




    public static Operation PRED_findall_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::findall_3_sub_1);
        return findall_3_1(m);
    }

    private final static Operation findall_3_sub_1(Prolog m) { 
        m.trust(null);
        return findall_3_2(m);
    }

    private final static Operation findall_3_1(Prolog m) { 
    // findall(A,B,C):-callable(B),!,new_hash(D),'$findall'(D,A,B,C)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // findall(A,B,C):-['$get_level'(D),callable(B),'$cut'(D),new_hash(E),'$findall'(E,A,B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        return //
 Op(FILE_system::PRED_callable_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_new_hash_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_$findall_4_static_exec, VA(a5, a1, a2, a3), cont))));
    }

    private final static Operation findall_3_2(Prolog m) { 
    // findall(A,B,C):-illarg(type(callable),findall(A,B,C),2)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // findall(A,B,C):-[illarg(type(callable),findall(A,B,C),2)]
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_findall_3'),y(1),a(4))
        a4 =  S( FUNCTOR_findall_3 , a1, a2, a3);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_findall_3_s4, a4,  int_2 ), cont);
    }
/** PREDICATE: $findall/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$findall'/4,non-(public))
        final static SymbolTerm ATOM_$0024FINDALL = SYM("$FINDALL");




    public static Operation PRED_$findall_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_builtins::$findall_4_sub_1);
        return $findall_4_1(m);
    }

    private final static Operation $findall_4_sub_1(Prolog m) { 
        m.trust(null);
        return $findall_4_2(m);
    }

    private final static Operation $findall_4_1(Prolog m) { 
    // '$findall'(A,B,C,D):-call(C),copy_term(B,E),'$hash_addz'(A,'$FINDALL',E),fail
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$findall'(A,B,C,D):-[call('SxxMachine':C),copy_term(B,E),'$hash_addz'(A,'$FINDALL',E),fail]
    // put_str_args([@('ATOM_SxxMachine'),a(3)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a3);
 ;
        a6 = m.mkvar1();
        return //
 Op(FILE_system::PRED_call_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_copy_term_2_static_exec, VA(a2, a6), //
 Op(FILE_system::PRED_$hash_addz_3_static_exec, VA(a1,  ATOM_$0024FINDALL , a6), fail_0)));
    }

    private final static Operation $findall_4_2(Prolog m) { 
    // '$findall'(A,B,C,D):-hash_get(A,'$FINDALL',D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$findall'(A,B,C,D):-[hash_get(A,'$FINDALL',D)]
        return //
 Op(FILE_system::PRED_hash_get_3_static_exec, VA(a1,  ATOM_$0024FINDALL , a4), cont);
    }
/** PREDICATE: bagof/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(bagof/3,public)
    private static final StructureTerm L_bagof_3_s4 = S( FUNCTOR_type_1 ,  ATOM_callable );




    public static Operation PRED_bagof_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::bagof_3_sub_1);
        return bagof_3_1(m);
    }

    private final static Operation bagof_3_sub_1(Prolog m) { 
        m.trust(null);
        return bagof_3_2(m);
    }

    private final static Operation bagof_3_1(Prolog m) { 
    // bagof(A,B,C):-callable(B),!,'$bagof'(A,B,C)
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // bagof(A,B,C):-['$get_level'(D),callable(B),'$cut'(D),'$bagof'(A,B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_callable_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$bagof_3_static_exec, VA(a1, a2, a3), cont)));
    }

    private final static Operation bagof_3_2(Prolog m) { 
    // bagof(A,B,C):-illarg(type(callable),bagof(A,B,C),2)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // bagof(A,B,C):-[illarg(type(callable),bagof(A,B,C),2)]
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_bagof_3'),y(1),a(4))
        a4 =  S( FUNCTOR_bagof_3 , a1, a2, a3);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_bagof_3_s4, a4,  int_2 ), cont);
    }
/** PREDICATE: setof/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(setof/3,public)
    private static final StructureTerm L_setof_3_s4 = S( FUNCTOR_type_1 ,  ATOM_callable );




    public static Operation PRED_setof_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::setof_3_sub_1);
        return setof_3_1(m);
    }

    private final static Operation setof_3_sub_1(Prolog m) { 
        m.trust(null);
        return setof_3_2(m);
    }

    private final static Operation setof_3_1(Prolog m) { 
    // setof(A,B,C):-callable(B),!,'$bagof'(A,B,D),sort(D,C)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // setof(A,B,C):-['$get_level'(D),callable(B),'$cut'(D),'$bagof'(A,B,E),sort(E,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        return //
 Op(FILE_system::PRED_callable_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$bagof_3_static_exec, VA(a1, a2, a5), //
 Op(FILE_system::PRED_sort_2_static_exec, VA(a5, a3), cont))));
    }

    private final static Operation setof_3_2(Prolog m) { 
    // setof(A,B,C):-illarg(type(callable),setof(A,B,C),2)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // setof(A,B,C):-[illarg(type(callable),setof(A,B,C),2)]
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_setof_3'),y(1),a(4))
        a4 =  S( FUNCTOR_setof_3 , a1, a2, a3);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_setof_3_s4, a4,  int_2 ), cont);
    }
/** PREDICATE: $bagof/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$bagof'/3,non-(public))
        final static SymbolTerm ATOM_$0024witness = SYM("$witness");




    public static Operation PRED_$bagof_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$bagof_3_sub_1);
        return $bagof_3_1(m);
    }

    private final static Operation $bagof_3_sub_1(Prolog m) { 
        m.trust(null);
        return $bagof_3_2(m);
    }

    private final static Operation $bagof_3_1(Prolog m) { 
    // '$bagof'(A,B,C):-'$free_variables_set'(B,A,D),D\==[],!,E=..['$witness'|D],findall(E+A,B,F),'$bagof_instances'(F,E,G),C=G
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$bagof'(A,B,C):-['$get_level'(D),'$free_variables_set'(B,A,E),'$inequality_of_term'(E,[]),'$cut'(D),'$univ'(F,['$witness'|E]),findall(F+A,'SxxMachine':B,G),'$bagof_instances'(G,F,H),'$unify'(C,H)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = CONS( ATOM_$0024witness , a5);
    // put_str_args([a(6),a(1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(8))
        a8 =  S( FUNCTOR_$002B_2 , a6, a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$free_variables_set_3_static_exec, VA(a2, a1, a5), //
 Op(FILE_system::PRED_$inequality_of_term_2_static_exec, VA(a5,  Prolog.Nil ), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a6, a7), //
 Op(FILE_system::PRED_findall_3_static_exec, VA(a8, a9, a10), //
 Op(FILE_system::PRED_$bagof_instances_3_static_exec, VA(a10, a6, a11), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a3, a11), cont)))))));
    }

    private final static Operation $bagof_3_2(Prolog m) { 
    // '$bagof'(A,B,C):-findall(A,B,C),C\==[]
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$bagof'(A,B,C):-[findall(A,'SxxMachine':B,C),'$inequality_of_term'(C,[])]
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op(FILE_system::PRED_findall_3_static_exec, VA(a1, a4, a3), //
 Op(FILE_system::PRED_$inequality_of_term_2_static_exec, VA(a3,  Prolog.Nil ), cont));
    }
/** PREDICATE: $bagof_instances/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$bagof_instances'/3,non-(public))




    public static Operation PRED_$bagof_instances_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$bagof_instances_3_var, FILE_builtins::$bagof_instances_3_2, FILE_builtins::$bagof_instances_3_2, FILE_builtins::$bagof_instances_3_var, FILE_builtins::$bagof_instances_3_2, FILE_builtins::$bagof_instances_3_2); 
    }

    private final static Operation $bagof_instances_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$bagof_instances_3_var_1);
        return $bagof_instances_3_1(m);
    }

    private final static Operation $bagof_instances_3_var_1(Prolog m) { 
        m.trust(null);
        return $bagof_instances_3_2(m);
    }

    private final static Operation $bagof_instances_3_1(Prolog m) { 
    // '$bagof_instances'([],A,B):-fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$bagof_instances'([],A,B):-[fail]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $bagof_instances_3_2(Prolog m) { 
    // '$bagof_instances'(A,B,C):-A=[D+E|F],'$variants_subset'(F,D,G,H,I),'$bagof_instances0'(I,B,C,[D+E|G],[E|H])
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$bagof_instances'(A,B,C):-['$unify'(A,[D+E|F]),'$variants_subset'(F,D,G,H,I),'$bagof_instances0'(I,B,C,[D+E|G],[E|H])]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a4, a5);
 ;
        a7 = m.mkvar1();
        a8 = CONS(a6, a7);
        //START inline expansion of $unify(a(1),a(8))
        if (! a1.unify(a8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(2)),put_str(@('FUNCTOR_$002B_2'),y(2),a(12))
        a12 =  S( FUNCTOR_$002B_2 , a4, a5);
 ;
        a13 = CONS(a12, a9);
        a14 = CONS(a5, a10);
        return //
 Op(FILE_system::PRED_$variants_subset_5_static_exec, VA(a7, a4, a9, a10, a11), //
 Op(FILE_system::PRED_$bagof_instances0_5_static_exec, VA(a11, a2, a3, a13, a14), cont));
    }
/** PREDICATE: $bagof_instances0/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$bagof_instances0'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$bagof_instances0_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_builtins::$bagof_instances0_5_sub_1);
        return $bagof_instances0_5_1(m);
    }

    private final static Operation $bagof_instances0_5_sub_1(Prolog m) { 
        m.trust(null);
        return $bagof_instances0_5_2(m);
    }

    private final static Operation $bagof_instances0_5_1(Prolog m) { 
    // '$bagof_instances0'(A,B,C,D,E):-'$unify_witness'(D,B),C=E
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$bagof_instances0'(A,B,C,D,E):-['$unify_witness'(D,B),'$unify'(C,E)]
        return //
 Op(FILE_system::PRED_$unify_witness_2_static_exec, VA(a4, a2), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a3, a5), cont));
    }

    private final static Operation $bagof_instances0_5_2(Prolog m) { 
    // '$bagof_instances0'(A,B,C,D,E):-'$bagof_instances'(A,B,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$bagof_instances0'(A,B,C,D,E):-['$bagof_instances'(A,B,C)]
        return //
 Op(FILE_system::PRED_$bagof_instances_3_static_exec, VA(a1, a2, a3), cont);
    }
/** PREDICATE: $variants_subset/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$variants_subset'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$variants_subset_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $variants_subset_5_top(m);
    }

    private final static Operation $variants_subset_5_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$variants_subset_5_var, fail_0, fail_0, FILE_builtins::$variants_subset_5_1, fail_0, FILE_builtins::$variants_subset_5_lis); 
    }

    private final static Operation $variants_subset_5_var(Prolog m) { 
        m.jtry5(null, FILE_builtins::$variants_subset_5_var_1);
        return $variants_subset_5_1(m);
    }

    private final static Operation $variants_subset_5_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$variants_subset_5_var_2);
        return $variants_subset_5_2(m);
    }

    private final static Operation $variants_subset_5_var_2(Prolog m) { 
        m.trust(null);
        return $variants_subset_5_3(m);
    }

    private final static Operation $variants_subset_5_lis(Prolog m) { 
        m.jtry5(null, FILE_builtins::$variants_subset_5_lis_1);
        return $variants_subset_5_2(m);
    }

    private final static Operation $variants_subset_5_lis_1(Prolog m) { 
        m.trust(null);
        return $variants_subset_5_3(m);
    }

    private final static Operation $variants_subset_5_1(Prolog m) { 
    // '$variants_subset'([],A,[],[],[]):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$variants_subset'([],A,[],[],[]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a5, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $variants_subset_5_2(Prolog m) { 
    // '$variants_subset'([A+B|C],D,[A+B|E],[B|F],G):-'$term_variant'(D,A),!,'$variants_subset'(C,D,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$variants_subset'([A+B|C],D,[A+B|E],[B|F],G):-['$get_level'(H),'$term_variant'(D,A),'$cut'(H),'$variants_subset'(C,D,E,F,G)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a6 = a1.car();
            a7 = a1.cdr();
        } else if (a1.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a1.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002B_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a3 = a3.dref();
        if (a3 .isCons()){
                        a10 = a3.car();
            a11 = a3.cdr();
        } else if (a3.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a3.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_$002B_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a9.unify(a4.car(), m.trail))
                return m.fail();
            a12 = a4.cdr();
        } else if (a4.isVar()){
            a12 = m.mkvar2();
             a4.bind(CONS(a9, a12), m.trail);
        } else {
            return m.fail();
        }
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$term_variant_2_static_exec, VA(a2, a8), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a13), //
 Op(FILE_system::PRED_$variants_subset_5_static_exec, VA(a7, a2, a11, a12, a5), cont)));
    }

    private final static Operation $variants_subset_5_3(Prolog m) { 
    // '$variants_subset'([A|B],C,D,E,[A|F]):-'$variants_subset'(B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$variants_subset'([A|B],C,D,E,[A|F]):-['$variants_subset'(B,C,D,E,F)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a6 = a1.car();
            a7 = a1.cdr();
        } else if (a1.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a1.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a5 = a5.dref();
        if (a5 .isCons()){
                        if (! a6.unify(a5.car(), m.trail))
                return m.fail();
            a8 = a5.cdr();
        } else if (a5.isVar()){
            a8 = m.mkvar2();
             a5.bind(CONS(a6, a8), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a8;
m.cont = cont;
        return $variants_subset_5_top(m);
    }
/** PREDICATE: $term_variant/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$term_variant'/2,non-(public))




    public static Operation PRED_$term_variant_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$term_variant'(A,B):-new_hash(C),'$term_variant'(A,B,C)
        m.setB0();
         Term a1, a2, a3;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$term_variant'(A,B):-[new_hash(C),'$term_variant'(A,B,C)]
        a3 = m.mkvar1();
        return //
 Op(FILE_system::PRED_new_hash_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$term_variant_3_static_exec, VA(a1, a2, a3), cont));
    }
/** PREDICATE: $dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/4,non-(public))




    public static Operation PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_builtins::$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_sub_1);
        return $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_1(m);
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_2(m);
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_1(Prolog m) { 
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-hash_contains_key(C,A),!,hash_get(C,A,D),B==D
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-['$get_level'(E),hash_contains_key(C,A),'$cut'(E),hash_get(C,A,D),'$equality_of_term'(B,D)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_hash_contains_key_2_static_exec, VA(a3, a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_hash_get_3_static_exec, VA(a3, a1, a4), //
 Op(FILE_system::PRED_$equality_of_term_2_static_exec, VA(a2, a4), cont))));
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_2(Prolog m) { 
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-var(B),hash_put(C,A,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-[var(B),hash_put(C,A,B)]
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_hash_put_3_static_exec, VA(a3, a1, a2), cont);
    }
/** PREDICATE: $term_variant/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$term_variant'/3,non-(public))




    public static Operation PRED_$term_variant_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $term_variant_3_top(m);
    }

    private final static Operation $term_variant_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$term_variant_3_var, FILE_builtins::$term_variant_3_int, FILE_builtins::$term_variant_3_int, FILE_builtins::$term_variant_3_int, FILE_builtins::$term_variant_3_int, FILE_builtins::$term_variant_3_var); 
    }

    private final static Operation $term_variant_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$term_variant_3_var_1);
        return $term_variant_3_1(m);
    }

    private final static Operation $term_variant_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$term_variant_3_var_2);
        return $term_variant_3_2(m);
    }

    private final static Operation $term_variant_3_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$term_variant_3_var_3);
        return $term_variant_3_3(m);
    }

    private final static Operation $term_variant_3_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$term_variant_3_var_4);
        return $term_variant_3_4(m);
    }

    private final static Operation $term_variant_3_var_4(Prolog m) { 
        m.trust(null);
        return $term_variant_3_5(m);
    }

    private final static Operation $term_variant_3_int(Prolog m) { 
        m.jtry3(null, FILE_builtins::$term_variant_3_int_1);
        return $term_variant_3_1(m);
    }

    private final static Operation $term_variant_3_int_1(Prolog m) { 
        m.retry(null, FILE_builtins::$term_variant_3_int_2);
        return $term_variant_3_2(m);
    }

    private final static Operation $term_variant_3_int_2(Prolog m) { 
        m.retry(null, FILE_builtins::$term_variant_3_int_3);
        return $term_variant_3_3(m);
    }

    private final static Operation $term_variant_3_int_3(Prolog m) { 
        m.trust(null);
        return $term_variant_3_5(m);
    }

    private final static Operation $term_variant_3_1(Prolog m) { 
    // '$term_variant'(A,B,C):-var(A),!,'$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$term_variant'(A,B,C):-['$get_level'(D),var(A),'$cut'(D),'$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,E)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec, VA(a1, a2, a3, m.DONT_CARE2()), cont);
    }

    private final static Operation $term_variant_3_2(Prolog m) { 
    // '$term_variant'(A,B,C):-ground(A),!,A==B
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$term_variant'(A,B,C):-['$get_level'(D),ground(A),'$cut'(D),'$equality_of_term'(A,B)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of ground(a(1))
        a1 = a1.dref();
        if (! a1.isGround()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (! a1.equalsTerm(a2)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $term_variant_3_3(Prolog m) { 
    // '$term_variant'(A,B,C):-var(B),!,fail
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$term_variant'(A,B,C):-['$get_level'(D),var(B),'$cut'(D),fail]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $term_variant_3_4(Prolog m) { 
    // '$term_variant'([A|B],[C|D],E):-!,'$term_variant'(A,C,E),'$term_variant'(B,D,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$term_variant'([A|B],[C|D],E):-['$neck_cut','$term_variant'(A,C,E),'$term_variant'(B,D,E)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op(FILE_system::PRED_$term_variant_3_static_exec, VA(a5, a7, a3), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a6;
        m.AREGS[2] = a3;
        m.cont = p1;
        return $term_variant_3_top(m);
    }

    private final static Operation $term_variant_3_5(Prolog m) { 
    // '$term_variant'(A,B,C):-A=..D,B=..E,'$term_variant'(D,E,C)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$term_variant'(A,B,C):-['$univ'(A,D),'$univ'(B,E),'$term_variant'(D,E,C)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a1, a4), //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a2, a5), //
 Op(FILE_system::PRED_$term_variant_3_static_exec, VA(a4, a5, a3), cont)));
    }
/** PREDICATE: $unify_witness/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$unify_witness'/2,non-(public))




    public static Operation PRED_$unify_witness_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $unify_witness_2_top(m);
    }

    private final static Operation $unify_witness_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$unify_witness_2_var, fail_0, fail_0, FILE_builtins::$unify_witness_2_1, fail_0, FILE_builtins::$unify_witness_2_2); 
    }

    private final static Operation $unify_witness_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::$unify_witness_2_var_1);
        return $unify_witness_2_1(m);
    }

    private final static Operation $unify_witness_2_var_1(Prolog m) { 
        m.trust(null);
        return $unify_witness_2_2(m);
    }

    private final static Operation $unify_witness_2_1(Prolog m) { 
    // '$unify_witness'([],A):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$unify_witness'([],A):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $unify_witness_2_2(Prolog m) { 
    // '$unify_witness'([A+B|C],A):-'$unify_witness'(C,A)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$unify_witness'([A+B|C],A):-['$unify_witness'(C,A)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
            a4 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
            a4 = m.mkvar2();
             a1.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002B_2 , m.trail, a5, m.DONT_CARE1())){
                return m.fail();
            }
        if (! a5.unify(a2, m.trail))
            return m.fail();
        m.AREGS[0] = a4;
        m.AREGS[1] = a5;
m.cont = cont;
        return $unify_witness_2_top(m);
    }
/** PREDICATE: $variables_set/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$variables_set'/2,non-(public))




    public static Operation PRED_$variables_set_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$variables_set'(A,B):-'$variables_set'(A,[],B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$variables_set'(A,B):-['$variables_set'(A,[],B)]
        return //
 Op(FILE_system::PRED_$variables_set_3_static_exec, VA(a1,  Prolog.Nil , a2), cont);
    }
/** PREDICATE: $variables_set/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$variables_set'/3,non-(public))




    public static Operation PRED_$variables_set_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $variables_set_3_top(m);
    }

    private final static Operation $variables_set_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$variables_set_3_var, FILE_builtins::$variables_set_3_int, FILE_builtins::$variables_set_3_int, FILE_builtins::$variables_set_3_int, FILE_builtins::$variables_set_3_int, FILE_builtins::$variables_set_3_var); 
    }

    private final static Operation $variables_set_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$variables_set_3_var_1);
        return $variables_set_3_1(m);
    }

    private final static Operation $variables_set_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$variables_set_3_var_2);
        return $variables_set_3_2(m);
    }

    private final static Operation $variables_set_3_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$variables_set_3_var_3);
        return $variables_set_3_3(m);
    }

    private final static Operation $variables_set_3_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$variables_set_3_var_4);
        return $variables_set_3_4(m);
    }

    private final static Operation $variables_set_3_var_4(Prolog m) { 
        m.trust(null);
        return $variables_set_3_5(m);
    }

    private final static Operation $variables_set_3_int(Prolog m) { 
        m.jtry3(null, FILE_builtins::$variables_set_3_int_1);
        return $variables_set_3_1(m);
    }

    private final static Operation $variables_set_3_int_1(Prolog m) { 
        m.retry(null, FILE_builtins::$variables_set_3_int_2);
        return $variables_set_3_2(m);
    }

    private final static Operation $variables_set_3_int_2(Prolog m) { 
        m.retry(null, FILE_builtins::$variables_set_3_int_3);
        return $variables_set_3_3(m);
    }

    private final static Operation $variables_set_3_int_3(Prolog m) { 
        m.trust(null);
        return $variables_set_3_5(m);
    }

    private final static Operation $variables_set_3_1(Prolog m) { 
    // '$variables_set'(A,B,B):-var(A),'$builtin_memq'(A,B),!
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$variables_set'(A,B,B):-['$get_level'(C),var(A),'$builtin_memq'(A,B),'$cut'(C)]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$builtin_memq_2_static_exec, VA(a1, a2), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation $variables_set_3_2(Prolog m) { 
    // '$variables_set'(A,B,[A|B]):-var(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$variables_set'(A,B,[A|B]):-['$get_level'(C),var(A),'$cut'(C)]
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a1.unify(a3.car(), m.trail))
                return m.fail();
            if (! a2.unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
             a3.bind(CONS(a1, a2), m.trail);
        } else {
            return m.fail();
        }
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $variables_set_3_3(Prolog m) { 
    // '$variables_set'(A,B,B):-atomic(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$variables_set'(A,B,B):-['$get_level'(C),atomic(A),'$cut'(C)]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $variables_set_3_4(Prolog m) { 
    // '$variables_set'([A|B],C,D):-!,'$variables_set'(A,C,E),'$variables_set'(B,E,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$variables_set'([A|B],C,D):-['$neck_cut','$variables_set'(A,C,E),'$variables_set'(B,E,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a6 = m.mkvar1();
        p1 = //
 Op(FILE_system::PRED_$variables_set_3_static_exec, VA(a5, a6, a3), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
        m.cont = p1;
        return $variables_set_3_top(m);
    }

    private final static Operation $variables_set_3_5(Prolog m) { 
    // '$variables_set'(A,B,C):-A=..D,'$variables_set'(D,B,C)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$variables_set'(A,B,C):-['$univ'(A,D),'$variables_set'(D,B,C)]
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a1, a4), //
 Op(FILE_system::PRED_$variables_set_3_static_exec, VA(a4, a2, a3), cont));
    }
/** PREDICATE: $builtin_memq/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$builtin_memq'/2,non-(public))




    public static Operation PRED_$builtin_memq_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $builtin_memq_2_top(m);
    }

    private final static Operation $builtin_memq_2_top(Prolog m) { 
        m.setB0();
        m.jtry2(null, FILE_builtins::$builtin_memq_2_sub_1);
        return $builtin_memq_2_1(m);
    }

    private final static Operation $builtin_memq_2_sub_1(Prolog m) { 
        m.trust(null);
        return $builtin_memq_2_2(m);
    }

    private final static Operation $builtin_memq_2_1(Prolog m) { 
    // '$builtin_memq'(A,[B|C]):-A==B,!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$builtin_memq'(A,[B|C]):-['$get_level'(D),'$equality_of_term'(A,B),'$cut'(D)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a3 = a2.car();
        } else if (a2.isVar()){
            a3 = m.mkvar2();
             a2.bind(CONS(a3, m.DONTCARE("cons(a(2))")), m.trail);
        } else {
            return m.fail();
        }
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),a(3))
        a1 = a1.dref();
        a3 = a3.dref();
        if (! a1.equalsTerm(a3)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $builtin_memq_2_2(Prolog m) { 
    // '$builtin_memq'(A,[B|C]):-'$builtin_memq'(A,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$builtin_memq'(A,[B|C]):-['$builtin_memq'(A,C)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a3 = a2.cdr();
        } else if (a2.isVar()){
            a3 = m.mkvar2();
             a2.bind(CONS(m.DONTCARE("cons(a(2))"), a3), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a1;
        m.AREGS[1] = a3;
m.cont = cont;
        return $builtin_memq_2_top(m);
    }
/** PREDICATE: $existential_variables_set/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$existential_variables_set'/2,non-(public))




    public static Operation PRED_$existential_variables_set_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$existential_variables_set'(A,B):-'$existential_variables_set'(A,[],B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$existential_variables_set'(A,B):-['$existential_variables_set'(A,[],B)]
        return //
 Op(FILE_system::PRED_$existential_variables_set_3_static_exec, VA(a1,  Prolog.Nil , a2), cont);
    }
/** PREDICATE: $existential_variables_set/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$existential_variables_set'/3,non-(public))
        final static SymbolTerm FUNCTOR_$0024meta_call_5 = F("$meta_call",5);




    public static Operation PRED_$existential_variables_set_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $existential_variables_set_3_top(m);
    }

    private final static Operation $existential_variables_set_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$existential_variables_set_3_var, FILE_builtins::$existential_variables_set_3_int, FILE_builtins::$existential_variables_set_3_int, FILE_builtins::$existential_variables_set_3_int, FILE_builtins::$existential_variables_set_3_var, FILE_builtins::$existential_variables_set_3_int); 
    }

    private final static Operation $existential_variables_set_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$existential_variables_set_3_var_1);
        return $existential_variables_set_3_1(m);
    }

    private final static Operation $existential_variables_set_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$existential_variables_set_3_var_2);
        return $existential_variables_set_3_2(m);
    }

    private final static Operation $existential_variables_set_3_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$existential_variables_set_3_var_3);
        return $existential_variables_set_3_3(m);
    }

    private final static Operation $existential_variables_set_3_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$existential_variables_set_3_var_4);
        return $existential_variables_set_3_4(m);
    }

    private final static Operation $existential_variables_set_3_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$existential_variables_set_3_var_5);
        return $existential_variables_set_3_5(m);
    }

    private final static Operation $existential_variables_set_3_var_5(Prolog m) { 
        m.trust(null);
        return $existential_variables_set_3_6(m);
    }

    private final static Operation $existential_variables_set_3_int(Prolog m) { 
        m.jtry3(null, FILE_builtins::$existential_variables_set_3_int_1);
        return $existential_variables_set_3_1(m);
    }

    private final static Operation $existential_variables_set_3_int_1(Prolog m) { 
        m.retry(null, FILE_builtins::$existential_variables_set_3_int_2);
        return $existential_variables_set_3_2(m);
    }

    private final static Operation $existential_variables_set_3_int_2(Prolog m) { 
        m.trust(null);
        return $existential_variables_set_3_6(m);
    }

    private final static Operation $existential_variables_set_3_1(Prolog m) { 
    // '$existential_variables_set'(A,B,B):-var(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$existential_variables_set'(A,B,B):-['$get_level'(C),var(A),'$cut'(C)]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $existential_variables_set_3_2(Prolog m) { 
    // '$existential_variables_set'(A,B,B):-atomic(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$existential_variables_set'(A,B,B):-['$get_level'(C),atomic(A),'$cut'(C)]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $existential_variables_set_3_3(Prolog m) { 
    // '$existential_variables_set'(A:B,C,D):-!,'$existential_variables_set'(B,C,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$existential_variables_set'(A:B,C,D):-['$neck_cut','$existential_variables_set'(B,C,D)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, m.DONT_CARE1(), a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
m.cont = cont;
        return $existential_variables_set_3_top(m);
    }

    private final static Operation $existential_variables_set_3_4(Prolog m) { 
    // '$existential_variables_set'(A^B,C,D):-!,'$variables_set'(A,C,E),'$existential_variables_set'(B,E,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$existential_variables_set'(A^B,C,D):-['$neck_cut','$variables_set'(A,C,E),'$existential_variables_set'(B,E,D)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$005E_2 , m.trail, a4, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a6 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$variables_set_3_static_exec, VA(a4, a2, a6), //
 Op(FILE_system::PRED_$existential_variables_set_3_static_exec, VA(a5, a6, a3), cont));
    }

    private final static Operation $existential_variables_set_3_5(Prolog m) { 
    // '$existential_variables_set'('$meta_call'(A,B,C,D,E),F,G):-!,'$existential_variables_set'(A,F,G)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$existential_variables_set'('$meta_call'(A,B,C,D,E),F,G):-['$neck_cut','$existential_variables_set'(A,F,G)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$0024meta_call_5 , m.trail, a4, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
m.cont = cont;
        return $existential_variables_set_3_top(m);
    }

    private final static Operation $existential_variables_set_3_6(Prolog m) { 
    // '$existential_variables_set'(A,B,B):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$existential_variables_set'(A,B,B):-[]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $free_variables_set/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$free_variables_set'/3,non-(public))




    public static Operation PRED_$free_variables_set_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$free_variables_set'(A,B,C):-'$variables_set'(A,D),'$variables_set'(B,E),'$existential_variables_set'(A,E,F),'$builtin_set_diff'(D,F,C),!
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$free_variables_set'(A,B,C):-['$get_level'(D),'$variables_set'(A,E),'$variables_set'(B,F),'$existential_variables_set'(A,F,G),'$builtin_set_diff'(E,G,C),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$variables_set_2_static_exec, VA(a1, a5), //
 Op(FILE_system::PRED_$variables_set_2_static_exec, VA(a2, a6), //
 Op(FILE_system::PRED_$existential_variables_set_3_static_exec, VA(a1, a6, a7), //
 Op(FILE_system::PRED_$builtin_set_diff_3_static_exec, VA(a5, a7, a3), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), cont)))));
    }
/** PREDICATE: $builtin_set_diff/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$builtin_set_diff'/3,non-(public))




    public static Operation PRED_$builtin_set_diff_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$builtin_set_diff'(A,B,C):-sort(A,D),sort(B,E),'$builtin_set_diff0'(D,E,C)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$builtin_set_diff'(A,B,C):-[sort(A,D),sort(B,E),'$builtin_set_diff0'(D,E,C)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op(FILE_system::PRED_sort_2_static_exec, VA(a1, a4), //
 Op(FILE_system::PRED_sort_2_static_exec, VA(a2, a5), //
 Op(FILE_system::PRED_$builtin_set_diff0_3_static_exec, VA(a4, a5, a3), cont)));
    }
/** PREDICATE: $builtin_set_diff0/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$builtin_set_diff0'/3,non-(public))




    public static Operation PRED_$builtin_set_diff0_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $builtin_set_diff0_3_top(m);
    }

    private final static Operation $builtin_set_diff0_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$builtin_set_diff0_3_var, FILE_builtins::$builtin_set_diff0_3_2, FILE_builtins::$builtin_set_diff0_3_2, FILE_builtins::$builtin_set_diff0_3_con, FILE_builtins::$builtin_set_diff0_3_2, FILE_builtins::$builtin_set_diff0_3_lis); 
    }

    private final static Operation $builtin_set_diff0_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$builtin_set_diff0_3_var_1);
        return $builtin_set_diff0_3_1(m);
    }

    private final static Operation $builtin_set_diff0_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_set_diff0_3_var_2);
        return $builtin_set_diff0_3_2(m);
    }

    private final static Operation $builtin_set_diff0_3_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_set_diff0_3_var_3);
        return $builtin_set_diff0_3_3(m);
    }

    private final static Operation $builtin_set_diff0_3_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_set_diff0_3_var_4);
        return $builtin_set_diff0_3_4(m);
    }

    private final static Operation $builtin_set_diff0_3_var_4(Prolog m) { 
        m.trust(null);
        return $builtin_set_diff0_3_5(m);
    }

    private final static Operation $builtin_set_diff0_3_con(Prolog m) { 
        m.jtry3(null, FILE_builtins::$builtin_set_diff0_3_con_1);
        return $builtin_set_diff0_3_1(m);
    }

    private final static Operation $builtin_set_diff0_3_con_1(Prolog m) { 
        m.trust(null);
        return $builtin_set_diff0_3_2(m);
    }

    private final static Operation $builtin_set_diff0_3_lis(Prolog m) { 
        m.jtry3(null, FILE_builtins::$builtin_set_diff0_3_lis_1);
        return $builtin_set_diff0_3_2(m);
    }

    private final static Operation $builtin_set_diff0_3_lis_1(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_set_diff0_3_lis_2);
        return $builtin_set_diff0_3_3(m);
    }

    private final static Operation $builtin_set_diff0_3_lis_2(Prolog m) { 
        m.retry(null, FILE_builtins::$builtin_set_diff0_3_lis_3);
        return $builtin_set_diff0_3_4(m);
    }

    private final static Operation $builtin_set_diff0_3_lis_3(Prolog m) { 
        m.trust(null);
        return $builtin_set_diff0_3_5(m);
    }

    private final static Operation $builtin_set_diff0_3_1(Prolog m) { 
    // '$builtin_set_diff0'([],A,[]):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_set_diff0'([],A,[]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $builtin_set_diff0_3_2(Prolog m) { 
    // '$builtin_set_diff0'(A,[],A):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_set_diff0'(A,[],A):-['$neck_cut']
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        if (! a1.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $builtin_set_diff0_3_3(Prolog m) { 
    // '$builtin_set_diff0'([A|B],[C|D],E):-A==C,!,'$builtin_set_diff0'(B,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_set_diff0'([A|B],[C|D],E):-['$get_level'(F),'$equality_of_term'(A,C),'$cut'(F),'$builtin_set_diff0'(B,D,E)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(4),a(6))
        a4 = a4.dref();
        a6 = a6.dref();
        if (! a4.equalsTerm(a6)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(8))
        a8 = a8.dref();
                  m.cut( a8.intValue());
        //END inline expansion
        m.AREGS[0] = a5;
        m.AREGS[1] = a7;
        m.AREGS[2] = a3;
m.cont = cont;
        return $builtin_set_diff0_3_top(m);
    }

    private final static Operation $builtin_set_diff0_3_4(Prolog m) { 
    // '$builtin_set_diff0'([A|B],[C|D],[A|E]):-A@<C,!,'$builtin_set_diff0'(B,[C|D],E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_set_diff0'([A|B],[C|D],[A|E]):-['$get_level'(F),'$before'(A,C),'$cut'(F),'$builtin_set_diff0'(B,[C|D],E)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a4.unify(a3.car(), m.trail))
                return m.fail();
            a8 = a3.cdr();
        } else if (a3.isVar()){
            a8 = m.mkvar2();
             a3.bind(CONS(a4, a8), m.trail);
        } else {
            return m.fail();
        }
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $before(a(4),a(6))
        a4 = a4.dref();
        a6 = a6.dref();
        if (a4.compareTo(a6) >= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(9))
        a9 = a9.dref();
                  m.cut( a9.intValue());
        //END inline expansion
        a10 = CONS(a6, a7);
        m.AREGS[0] = a5;
        m.AREGS[1] = a10;
        m.AREGS[2] = a8;
m.cont = cont;
        return $builtin_set_diff0_3_top(m);
    }

    private final static Operation $builtin_set_diff0_3_5(Prolog m) { 
    // '$builtin_set_diff0'([A|B],[C|D],[C|E]):-'$builtin_set_diff0'([A|B],D,[C|E])
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_set_diff0'([A|B],[C|D],[C|E]):-['$builtin_set_diff0'([A|B],D,[C|E])]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a6.unify(a3.car(), m.trail))
                return m.fail();
            a8 = a3.cdr();
        } else if (a3.isVar()){
            a8 = m.mkvar2();
             a3.bind(CONS(a6, a8), m.trail);
        } else {
            return m.fail();
        }
        a9 = CONS(a4, a5);
        a10 = CONS(a6, a8);
        m.AREGS[0] = a9;
        m.AREGS[1] = a7;
        m.AREGS[2] = a10;
m.cont = cont;
        return $builtin_set_diff0_3_top(m);
    }
/** PREDICATE: read/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(read/1,public)




    public static Operation PRED_read_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // read(A):-current_input(B),read(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // read(A):-[current_input(B),read(B,A)]
        a2 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_input_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_read_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: read/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(read/2,public)




    public static Operation PRED_read_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // read(A,B):-read_tokens(A,C,D),parse_tokens(B,C),!
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
    // read(A,B):-['$get_level'(C),read_tokens(A,D,E),parse_tokens(B,D),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_read_tokens_3_static_exec, VA(a1, a4, m.DONT_CARE2()), //
 Op(FILE_system::PRED_parse_tokens_2_static_exec, VA(a2, a4), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), cont)));
    }
/** PREDICATE: read_with_variables/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(read_with_variables/2,public)




    public static Operation PRED_read_with_variables_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // read_with_variables(A,B):-current_input(C),read_with_variables(C,A,B)
        m.setB0();
         Term a1, a2, a3;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // read_with_variables(A,B):-[current_input(C),read_with_variables(C,A,B)]
        a3 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_input_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_read_with_variables_3_static_exec, VA(a3, a1, a2), cont));
    }
/** PREDICATE: read_with_variables/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(read_with_variables/3,public)




    public static Operation PRED_read_with_variables_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // read_with_variables(A,B,C):-read_tokens(A,D,C),parse_tokens(B,D),!
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // read_with_variables(A,B,C):-['$get_level'(D),read_tokens(A,E,C),parse_tokens(B,E),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        return //
 Op(FILE_system::PRED_read_tokens_3_static_exec, VA(a1, a5, a3), //
 Op(FILE_system::PRED_parse_tokens_2_static_exec, VA(a2, a5), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), cont)));
    }
/** PREDICATE: read_line/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(read_line/1,public)




    public static Operation PRED_read_line_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // read_line(A):-current_input(B),read_line(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // read_line(A):-[current_input(B),read_line(B,A)]
        a2 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_input_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_read_line_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: read_token/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(read_token/2,non-(public))




    public static Operation PRED_read_token_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // read_token(A,B):-'$read_token0'(A,C,D),'$read_token1'([C],D,B)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // read_token(A,B):-['$read_token0'(A,C,D),'$read_token1'([C],D,B)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = CONS(a3,  Prolog.Nil );
        return //
 Op(FILE_system::PRED_$read_token0_3_static_exec, VA(a1, a3, a4), //
 Op(FILE_system::PRED_$read_token1_3_static_exec, VA(a5, a4, a2), cont));
    }
/** PREDICATE: $read_token1/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$read_token1'/3,non-(public))
    private static final ListTerm L_$read_token1_3_s3 = CONS( int_neg2 ,  Prolog.Nil );
        final static SymbolTerm FUNCTOR_error_1 = F("error",1);
        final static IntegerTerm int_73 = Integer(73);
    private static final ListTerm L_$read_token1_3_s6 = CONS( int_73 ,  Prolog.Nil );
        final static SymbolTerm FUNCTOR_number_1 = F("number",1);
        final static IntegerTerm int_76 = Integer(76);
    private static final ListTerm L_$read_token1_3_s9 = CONS( int_76 ,  Prolog.Nil );
        final static IntegerTerm int_68 = Integer(68);
    private static final ListTerm L_$read_token1_3_s11 = CONS( int_68 ,  Prolog.Nil );
        final static IntegerTerm int_65 = Integer(65);
    private static final ListTerm L_$read_token1_3_s13 = CONS( int_65 ,  Prolog.Nil );
        final static SymbolTerm FUNCTOR_atom_1 = F("atom",1);
        final static IntegerTerm int_86 = Integer(86);
    private static final ListTerm L_$read_token1_3_s16 = CONS( int_86 ,  Prolog.Nil );
        final static SymbolTerm FUNCTOR_var_1 = F("var",1);
        final static IntegerTerm int_83 = Integer(83);
    private static final ListTerm L_$read_token1_3_s19 = CONS( int_83 ,  Prolog.Nil );
        final static SymbolTerm FUNCTOR_string_1 = F("string",1);




    public static Operation PRED_$read_token1_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$read_token1_3_var, FILE_builtins::$read_token1_3_8, FILE_builtins::$read_token1_3_8, FILE_builtins::$read_token1_3_8, FILE_builtins::$read_token1_3_8, FILE_builtins::$read_token1_3_var); 
    }

    private final static Operation $read_token1_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$read_token1_3_var_1);
        return $read_token1_3_1(m);
    }

    private final static Operation $read_token1_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$read_token1_3_var_2);
        return $read_token1_3_2(m);
    }

    private final static Operation $read_token1_3_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$read_token1_3_var_3);
        return $read_token1_3_3(m);
    }

    private final static Operation $read_token1_3_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$read_token1_3_var_4);
        return $read_token1_3_4(m);
    }

    private final static Operation $read_token1_3_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$read_token1_3_var_5);
        return $read_token1_3_5(m);
    }

    private final static Operation $read_token1_3_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$read_token1_3_var_6);
        return $read_token1_3_6(m);
    }

    private final static Operation $read_token1_3_var_6(Prolog m) { 
        m.retry(null, FILE_builtins::$read_token1_3_var_7);
        return $read_token1_3_7(m);
    }

    private final static Operation $read_token1_3_var_7(Prolog m) { 
        m.trust(null);
        return $read_token1_3_8(m);
    }

    private final static Operation $read_token1_3_1(Prolog m) { 
    // '$read_token1'([-2],A,error(A)):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$read_token1'([-2],A,error(A)):-['$neck_cut']
        if (! L_$read_token1_3_s3.unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_error_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $read_token1_3_2(Prolog m) { 
    // '$read_token1'([73],A,number(A)):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$read_token1'([73],A,number(A)):-['$neck_cut']
        if (! L_$read_token1_3_s6.unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_number_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $read_token1_3_3(Prolog m) { 
    // '$read_token1'([76],A,number(A)):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$read_token1'([76],A,number(A)):-['$neck_cut']
        if (! L_$read_token1_3_s9.unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_number_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $read_token1_3_4(Prolog m) { 
    // '$read_token1'([68],A,number(A)):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$read_token1'([68],A,number(A)):-['$neck_cut']
        if (! L_$read_token1_3_s11.unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_number_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $read_token1_3_5(Prolog m) { 
    // '$read_token1'([65],A,atom(A)):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$read_token1'([65],A,atom(A)):-['$neck_cut']
        if (! L_$read_token1_3_s13.unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_atom_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $read_token1_3_6(Prolog m) { 
    // '$read_token1'([86],A,var(A)):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$read_token1'([86],A,var(A)):-['$neck_cut']
        if (! L_$read_token1_3_s16.unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_var_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $read_token1_3_7(Prolog m) { 
    // '$read_token1'([83],A,string(A)):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$read_token1'([83],A,string(A)):-['$neck_cut']
        if (! L_$read_token1_3_s19.unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_string_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $read_token1_3_8(Prolog m) { 
    // '$read_token1'(A,B,B):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$read_token1'(A,B,B):-['$neck_cut']
        if (! a2.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }
/** PREDICATE: read_tokens/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(read_tokens/3,non-(public))




    public static Operation PRED_read_tokens_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // read_tokens(A,B,C):-'$read_tokens'(A,B,C,[]),!
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // read_tokens(A,B,C):-['$get_level'(D),'$read_tokens'(A,B,C,[]),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$read_tokens_4_static_exec, VA(a1, a2, a3,  Prolog.Nil ), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), cont));
    }
/** PREDICATE: $read_tokens/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$read_tokens'/4,non-(public))




    public static Operation PRED_$read_tokens_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$read_tokens'(A,B,C,D):-read_token(A,E),'$read_tokens1'(A,E,B,C,D)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // '$read_tokens'(A,B,C,D):-[read_token(A,E),'$read_tokens1'(A,E,B,C,D)]
        a5 = m.mkvar1();
        return //
 Op(FILE_system::PRED_read_token_2_static_exec, VA(a1, a5), //
 Op(FILE_system::PRED_$read_tokens1_5_static_exec, VA(a1, a5, a2, a3, a4), cont));
    }
/** PREDICATE: $read_tokens1/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$read_tokens1'/5,non-(public))
        final static SymbolTerm ATOM_user_error = SYM("user_error");
        final static SymbolTerm ATOM_$007BSYNTAX$0020ERROR$007D = SYM("{SYNTAX ERROR}");
        final static SymbolTerm ATOM_$002A$002A$0020 = SYM("** ");
        final static SymbolTerm ATOM_$0020$002A$002A = SYM(" **");
        final static SymbolTerm ATOM_end_of_file = SYM("end_of_file");
        final static SymbolTerm ATOM_$002E = SYM(".");
    private static final ListTerm L_$read_tokens1_5_s9 = CONS( ATOM_$002E ,  Prolog.Nil );
    private static final ListTerm L_$read_tokens1_5_s10 = CONS( ATOM_end_of_file , L_$read_tokens1_5_s9);
        final static SymbolTerm ATOM__ = SYM("_");
    private static final StructureTerm L_$read_tokens1_5_s14 = S( FUNCTOR_var_1 ,  ATOM__ );
        final static SymbolTerm FUNCTOR_var_2 = F("var",2);
        final static SymbolTerm FUNCTOR_$003D_2 = F("=",2);

    // private final Term arg5;




    public static Operation PRED_$read_tokens1_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_builtins::$read_tokens1_5_sub_1);
        return $read_tokens1_5_1(m);
    }

    private final static Operation $read_tokens1_5_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$read_tokens1_5_sub_2);
        return $read_tokens1_5_2(m);
    }

    private final static Operation $read_tokens1_5_sub_2(Prolog m) { 
        m.retry(null, FILE_builtins::$read_tokens1_5_sub_3);
        return $read_tokens1_5_3(m);
    }

    private final static Operation $read_tokens1_5_sub_3(Prolog m) { 
        m.retry(null, FILE_builtins::$read_tokens1_5_sub_4);
        return $read_tokens1_5_4(m);
    }

    private final static Operation $read_tokens1_5_sub_4(Prolog m) { 
        m.retry(null, FILE_builtins::$read_tokens1_5_sub_5);
        return $read_tokens1_5_5(m);
    }

    private final static Operation $read_tokens1_5_sub_5(Prolog m) { 
        m.retry(null, FILE_builtins::$read_tokens1_5_sub_6);
        return $read_tokens1_5_6(m);
    }

    private final static Operation $read_tokens1_5_sub_6(Prolog m) { 
        m.trust(null);
        return $read_tokens1_5_7(m);
    }

    private final static Operation $read_tokens1_5_1(Prolog m) { 
    // '$read_tokens1'(A,error(B),[],C,D):-!,write(user_error,'{SYNTAX ERROR}'),nl(user_error),write(user_error,'** '),write(user_error,B),write(user_error,' **'),nl(user_error),flush_output(user_error),'$read_tokens_until_fullstop'(A),fail
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$read_tokens1'(A,error(B),[],C,D):-['$neck_cut',write(user_error,'{SYNTAX ERROR}'),nl(user_error),write(user_error,'** '),write(user_error,B),write(user_error,' **'),nl(user_error),flush_output(user_error),'$read_tokens_until_fullstop'(A),fail]
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_error_1 , m.trail, a6)){
                return m.fail();
            }
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BSYNTAX$0020ERROR$007D ), //
 Op(FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op(FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$002A$002A$0020 ), //
 Op(FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error , a6), //
 Op(FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020$002A$002A ), //
 Op(FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op(FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), //
 Op(FILE_system::PRED_$read_tokens_until_fullstop_1_static_exec, VA(a1), fail_0))))))));
    }

    private final static Operation $read_tokens1_5_2(Prolog m) { 
    // '$read_tokens1'(A,end_of_file,[end_of_file,'.'],[],B):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$read_tokens1'(A,end_of_file,[end_of_file,'.'],[],B):-['$neck_cut']
        if (!  ATOM_end_of_file .unify(a2, m.trail))
            return m.fail();
        if (! L_$read_tokens1_5_s10.unify(a3, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $read_tokens1_5_3(Prolog m) { 
    // '$read_tokens1'(A,'.',['.'],[],B):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$read_tokens1'(A,'.',['.'],[],B):-['$neck_cut']
        if (!  ATOM_$002E .unify(a2, m.trail))
            return m.fail();
        if (! L_$read_tokens1_5_s9.unify(a3, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $read_tokens1_5_4(Prolog m) { 
    // '$read_tokens1'(A,var('_'),[var('_',B)|C],['_'=B|D],E):-!,'$read_tokens'(A,C,D,['_'=B|E])
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$read_tokens1'(A,var('_'),[var('_',B)|C],['_'=B|D],E):-['$neck_cut','$read_tokens'(A,C,D,['_'=B|E])]
        if (! L_$read_tokens1_5_s14.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a6 = a3.car();
            a7 = a3.cdr();
        } else if (a3.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a3.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_var_2 , m.trail,  ATOM__ , a8)){
                return m.fail();
            }
        a4 = a4.dref();
        if (a4 .isCons()){
                        a9 = a4.car();
            a10 = a4.cdr();
        } else if (a4.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a4.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_$003D_2 , m.trail,  ATOM__ , a8)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([@('ATOM__'),a(8)],y(1)),put_str(@('FUNCTOR_$003D_2'),y(1),a(11))
        a11 =  S( FUNCTOR_$003D_2 ,  ATOM__ , a8);
 ;
        a12 = CONS(a11, a5);
        return //
 Op(FILE_system::PRED_$read_tokens_4_static_exec, VA(a1, a7, a10, a12), cont);
    }

    private final static Operation $read_tokens1_5_5(Prolog m) { 
    // '$read_tokens1'(A,var(B),[var(B,C)|D],E,F):-'$mem_pair'(B=C,F),!,'$read_tokens'(A,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$read_tokens1'(A,var(B),[var(B,C)|D],E,F):-['$get_level'(G),'$mem_pair'(B=C,F),'$cut'(G),'$read_tokens'(A,D,E,F)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_var_1 , m.trail, a6)){
                return m.fail();
            }
        a3 = a3.dref();
        if (a3 .isCons()){
                        a7 = a3.car();
            a8 = a3.cdr();
        } else if (a3.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a3.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_var_2 , m.trail, a6, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(6),a(9)],y(1)),put_str(@('FUNCTOR_$003D_2'),y(1),a(11))
        a11 =  S( FUNCTOR_$003D_2 , a6, a9);
 ;
        return //
 Op(FILE_system::PRED_$mem_pair_2_static_exec, VA(a11, a5), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a10), //
 Op(FILE_system::PRED_$read_tokens_4_static_exec, VA(a1, a8, a4, a5), cont)));
    }

    private final static Operation $read_tokens1_5_6(Prolog m) { 
    // '$read_tokens1'(A,var(B),[var(B,C)|D],[B=C|E],F):-!,'$read_tokens'(A,D,E,[B=C|F])
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$read_tokens1'(A,var(B),[var(B,C)|D],[B=C|E],F):-['$neck_cut','$read_tokens'(A,D,E,[B=C|F])]
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_var_1 , m.trail, a6)){
                return m.fail();
            }
        a3 = a3.dref();
        if (a3 .isCons()){
                        a7 = a3.car();
            a8 = a3.cdr();
        } else if (a3.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a3.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_var_2 , m.trail, a6, a9)){
                return m.fail();
            }
        a4 = a4.dref();
        if (a4 .isCons()){
                        a10 = a4.car();
            a11 = a4.cdr();
        } else if (a4.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a4.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_$003D_2 , m.trail, a6, a9)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(6),a(9)],y(1)),put_str(@('FUNCTOR_$003D_2'),y(1),a(12))
        a12 =  S( FUNCTOR_$003D_2 , a6, a9);
 ;
        a13 = CONS(a12, a5);
        return //
 Op(FILE_system::PRED_$read_tokens_4_static_exec, VA(a1, a8, a11, a13), cont);
    }

    private final static Operation $read_tokens1_5_7(Prolog m) { 
    // '$read_tokens1'(A,B,[B|C],D,E):-'$read_tokens'(A,C,D,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$read_tokens1'(A,B,[B|C],D,E):-['$read_tokens'(A,C,D,E)]
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a2.unify(a3.car(), m.trail))
                return m.fail();
            a6 = a3.cdr();
        } else if (a3.isVar()){
            a6 = m.mkvar2();
             a3.bind(CONS(a2, a6), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_$read_tokens_4_static_exec, VA(a1, a6, a4, a5), cont);
    }
/** PREDICATE: $mem_pair/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$mem_pair'/2,non-(public))




    public static Operation PRED_$mem_pair_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $mem_pair_2_top(m);
    }

    private final static Operation $mem_pair_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$mem_pair_2_var, FILE_builtins::$mem_pair_2_2, FILE_builtins::$mem_pair_2_2, FILE_builtins::$mem_pair_2_2, FILE_builtins::$mem_pair_2_var, FILE_builtins::$mem_pair_2_2); 
    }

    private final static Operation $mem_pair_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::$mem_pair_2_var_1);
        return $mem_pair_2_1(m);
    }

    private final static Operation $mem_pair_2_var_1(Prolog m) { 
        m.trust(null);
        return $mem_pair_2_2(m);
    }

    private final static Operation $mem_pair_2_1(Prolog m) { 
    // '$mem_pair'(A=B,[C=D|E]):-A==C,!,B=D
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$mem_pair'(A=B,[C=D|E]):-['$get_level'(F),'$equality_of_term'(A,C),'$cut'(F),'$unify'(B,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003D_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a5 = a2.car();
        } else if (a2.isVar()){
            a5 = m.mkvar2();
             a2.bind(CONS(a5, m.DONTCARE("cons(a(2))")), m.trail);
        } else {
            return m.fail();
        }
        a5 = a5.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_$003D_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(3),a(6))
        a3 = a3.dref();
        a6 = a6.dref();
        if (! a3.equalsTerm(a6)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(8))
        a8 = a8.dref();
                  m.cut( a8.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(4),a(7))
        if (! a4.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $mem_pair_2_2(Prolog m) { 
    // '$mem_pair'(A,[B|C]):-'$mem_pair'(A,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$mem_pair'(A,[B|C]):-['$mem_pair'(A,C)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a3 = a2.cdr();
        } else if (a2.isVar()){
            a3 = m.mkvar2();
             a2.bind(CONS(m.DONTCARE("cons(a(2))"), a3), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a1;
        m.AREGS[1] = a3;
m.cont = cont;
        return $mem_pair_2_top(m);
    }
/** PREDICATE: $read_tokens_until_fullstop/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$read_tokens_until_fullstop'/1,non-(public))




    public static Operation PRED_$read_tokens_until_fullstop_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$read_tokens_until_fullstop'(A):-read_token(A,B),'$read_tokens_until_fullstop'(A,B)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // '$read_tokens_until_fullstop'(A):-[read_token(A,B),'$read_tokens_until_fullstop'(A,B)]
        a2 = m.mkvar1();
        return //
 Op(FILE_system::PRED_read_token_2_static_exec, VA(a1, a2), //
 Op(FILE_system::PRED_$read_tokens_until_fullstop_2_static_exec, VA(a1, a2), cont));
    }
/** PREDICATE: $read_tokens_until_fullstop/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$read_tokens_until_fullstop'/2,non-(public))




    public static Operation PRED_$read_tokens_until_fullstop_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$read_tokens_until_fullstop_2_sub_1);
        return $read_tokens_until_fullstop_2_1(m);
    }

    private final static Operation $read_tokens_until_fullstop_2_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$read_tokens_until_fullstop_2_sub_2);
        return $read_tokens_until_fullstop_2_2(m);
    }

    private final static Operation $read_tokens_until_fullstop_2_sub_2(Prolog m) { 
        m.trust(null);
        return $read_tokens_until_fullstop_2_3(m);
    }

    private final static Operation $read_tokens_until_fullstop_2_1(Prolog m) { 
    // '$read_tokens_until_fullstop'(A,end_of_file):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$read_tokens_until_fullstop'(A,end_of_file):-['$neck_cut']
        if (!  ATOM_end_of_file .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $read_tokens_until_fullstop_2_2(Prolog m) { 
    // '$read_tokens_until_fullstop'(A,'.'):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$read_tokens_until_fullstop'(A,'.'):-['$neck_cut']
        if (!  ATOM_$002E .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $read_tokens_until_fullstop_2_3(Prolog m) { 
    // '$read_tokens_until_fullstop'(A,B):-read_token(A,C),'$read_tokens_until_fullstop'(A,C)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$read_tokens_until_fullstop'(A,B):-[read_token(A,C),'$read_tokens_until_fullstop'(A,C)]
        a3 = m.mkvar1();
        return //
 Op(FILE_system::PRED_read_token_2_static_exec, VA(a1, a3), //
 Op(FILE_system::PRED_$read_tokens_until_fullstop_2_static_exec, VA(a1, a3), cont));
    }
/** PREDICATE: parse_tokens/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(parse_tokens/2,non-(public))
        final static SymbolTerm FUNCTOR_$0024tokens_1 = F("$tokens",1);
        final static IntegerTerm int_1201 = Integer(1201);
    private static final ListTerm L_parse_tokens_2_s7 = CONS( ATOM_$002E ,  Prolog.Nil );




    public static Operation PRED_parse_tokens_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // parse_tokens(A,B):-retractall('$tokens'(C)),assertz('$tokens'(B)),'$parse_tokens'(A,1201,B,['.']),retract('$tokens'(B)),!
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
        a2 = LARG[1];
    // parse_tokens(A,B):-['$get_level'(C),retractall('SxxMachine':'$tokens'(D)),assertz('SxxMachine':'$tokens'(B)),'$parse_tokens'(A,1201,B,['.']),retract('SxxMachine':'$tokens'(B)),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_$0024tokens_1'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024tokens_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
    // put_str_args([a(2)],y(3)),put_str(@('FUNCTOR_$0024tokens_1'),y(3),a(6))
        a6 =  S( FUNCTOR_$0024tokens_1 , a2);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(6)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a6);
 ;
    // put_str_args([a(2)],y(5)),put_str(@('FUNCTOR_$0024tokens_1'),y(5),a(8))
        a8 =  S( FUNCTOR_$0024tokens_1 , a2);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(8)],y(6)),put_str(@('FUNCTOR_module_colon_2'),y(6),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a8);
 ;
        return //
 Op(FILE_system::PRED_retractall_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(a7), //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a1,  int_1201 , a2, L_parse_tokens_2_s7), //
 Op(FILE_system::PRED_retract_1_static_exec, VA(a9), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), cont)))));
    }
/** PREDICATE: $parse_tokens/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens'/4,non-(public))




    public static Operation PRED_$parse_tokens_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$parse_tokens'(A,B,C,D):-'$parse_tokens_skip_spaces'(C,E),'$parse_tokens1'(B,F,G,E,H),(!,I=H),'$parse_tokens_skip_spaces'(I,J),'$parse_tokens2'(B,F,G,A,K,J,L),!,D=L
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4, p5, p6, p7;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // '$parse_tokens'(A,B,C,D):-['$get_level'(E),'$parse_tokens_skip_spaces'(C,F),'$parse_tokens1'(B,G,H,F,I),'$cut'(E),'$unify'(J,I),'$parse_tokens_skip_spaces'(J,K),'$parse_tokens2'(B,G,H,A,L,K,M),'$cut'(E),'$unify'(D,M)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a3, a6), //
 Op(FILE_system::PRED_$parse_tokens1_5_static_exec, VA(a2, a7, a8, a6, a9), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a10, a9), //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a10, a11), //
 Op(FILE_system::PRED_$parse_tokens2_7_static_exec, VA(a2, a7, a8, a1, m.DONT_CARE2(), a11, a12), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a4, a12), cont))))))));
    }
/** PREDICATE: $parse_tokens1/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens1'/5,non-(public))
        final static SymbolTerm ATOM_cannot = SYM("cannot");
        final static SymbolTerm ATOM_start = SYM("start");
        final static SymbolTerm ATOM_an = SYM("an");
        final static SymbolTerm ATOM_expression = SYM("expression");
    private static final ListTerm L_$parse_tokens1_5_s6 = CONS( ATOM_expression ,  Prolog.Nil );
    private static final ListTerm L_$parse_tokens1_5_s7 = CONS( ATOM_an , L_$parse_tokens1_5_s6);
    private static final ListTerm L_$parse_tokens1_5_s8 = CONS( ATOM_start , L_$parse_tokens1_5_s7);
    private static final ListTerm L_$parse_tokens1_5_s9 = CONS( ATOM_cannot , L_$parse_tokens1_5_s8);

    // private final Term arg5;




    public static Operation PRED_$parse_tokens1_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_builtins::$parse_tokens1_5_sub_1);
        return $parse_tokens1_5_1(m);
    }

    private final static Operation $parse_tokens1_5_sub_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens1_5_2(m);
    }

    private final static Operation $parse_tokens1_5_1(Prolog m) { 
    // '$parse_tokens1'(A,B,C,D,E):-'$parse_tokens_peep_next'(F,D,G),('$parse_tokens_is_starter'(F),H=G),(!,I=H),'$parse_tokens_before_op'(A,B,C,I,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens1'(A,B,C,D,E):-['$get_level'(F),'$parse_tokens_peep_next'(G,D,H),'$parse_tokens_is_starter'(G),'$unify'(I,H),'$cut'(F),'$unify'(J,I),'$parse_tokens_before_op'(A,B,C,J,E)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_peep_next_3_static_exec, VA(a7, a4, a8), //
 Op(FILE_system::PRED_$parse_tokens_is_starter_1_static_exec, VA(a7), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a9, a8), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a6), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a10, a9), //
 Op(FILE_system::PRED_$parse_tokens_before_op_5_static_exec, VA(a1, a2, a3, a10, a5), cont))))));
    }

    private final static Operation $parse_tokens1_5_2(Prolog m) { 
    // '$parse_tokens1'(A,B,C,D,E):-'$parse_tokens_peep_next'(F,D,G),'$parse_tokens_error'([F,cannot,start,an,expression],G,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens1'(A,B,C,D,E):-['$parse_tokens_peep_next'(F,D,G),'$parse_tokens_error'([F,cannot,start,an,expression],G,E)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = CONS(a6, L_$parse_tokens1_5_s9);
        return //
 Op(FILE_system::PRED_$parse_tokens_peep_next_3_static_exec, VA(a6, a4, a7), //
 Op(FILE_system::PRED_$parse_tokens_error_3_static_exec, VA(a8, a7, a5), cont));
    }
/** PREDICATE: $parse_tokens2/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens2'/7,non-(public))
        final static SymbolTerm ATOM_operator = SYM("operator");
        final static SymbolTerm ATOM_expected = SYM("expected");
        final static SymbolTerm ATOM_after = SYM("after");
    private static final ListTerm L_$parse_tokens2_7_s6 = CONS( ATOM_expression ,  Prolog.Nil );
    private static final ListTerm L_$parse_tokens2_7_s7 = CONS( ATOM_after , L_$parse_tokens2_7_s6);
    private static final ListTerm L_$parse_tokens2_7_s8 = CONS( ATOM_expected , L_$parse_tokens2_7_s7);
    private static final ListTerm L_$parse_tokens2_7_s9 = CONS( ATOM_operator , L_$parse_tokens2_7_s8);

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_$parse_tokens2_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_builtins::$parse_tokens2_7_sub_1);
        return $parse_tokens2_7_1(m);
    }

    private final static Operation $parse_tokens2_7_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens2_7_sub_2);
        return $parse_tokens2_7_2(m);
    }

    private final static Operation $parse_tokens2_7_sub_2(Prolog m) { 
        m.trust(null);
        return $parse_tokens2_7_3(m);
    }

    private final static Operation $parse_tokens2_7_1(Prolog m) { 
    // '$parse_tokens2'(A,B,C,B,C,D,E):-'$parse_tokens_peep_next'(F,D,G),('$parse_tokens_is_terminator'(F),H=G),(C=<A,I=H),!,E=I
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$parse_tokens2'(A,B,C,B,C,D,E):-['$get_level'(F),'$parse_tokens_peep_next'(G,D,H),'$parse_tokens_is_terminator'(G),'$unify'(I,H),'$less_or_equal'(C,A),'$unify'(J,I),'$cut'(F),'$unify'(E,J)]
        if (! a2.unify(a4, m.trail))
            return m.fail();
        if (! a3.unify(a5, m.trail))
            return m.fail();
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_peep_next_3_static_exec, VA(a9, a6, a10), //
 Op(FILE_system::PRED_$parse_tokens_is_terminator_1_static_exec, VA(a9), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a11, a10), //
 Op(FILE_system::PRED_$less_or_equal_2_static_exec, VA(a3, a1), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a12, a11), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a8), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a7, a12), cont)))))));
    }

    private final static Operation $parse_tokens2_7_2(Prolog m) { 
    // '$parse_tokens2'(A,B,C,D,E,F,G):-'$parse_tokens_peep_next'(H,F,I),('$parse_tokens_is_post_in_op'(H),J=I),(!,K=J),'$parse_tokens_post_in_ops'(A,B,C,D,E,K,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$parse_tokens2'(A,B,C,D,E,F,G):-['$get_level'(H),'$parse_tokens_peep_next'(I,F,J),'$parse_tokens_is_post_in_op'(I),'$unify'(K,J),'$cut'(H),'$unify'(L,K),'$parse_tokens_post_in_ops'(A,B,C,D,E,L,G)]
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_peep_next_3_static_exec, VA(a9, a6, a10), //
 Op(FILE_system::PRED_$parse_tokens_is_post_in_op_1_static_exec, VA(a9), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a11, a10), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a8), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a12, a11), //
 Op(FILE_system::PRED_$parse_tokens_post_in_ops_7_static_exec, VA(a1, a2, a3, a4, a5, a12, a7), cont))))));
    }

    private final static Operation $parse_tokens2_7_3(Prolog m) { 
    // '$parse_tokens2'(A,B,C,D,E,F,G):-'$parse_tokens_error'([operator,expected,after,expression],F,G)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$parse_tokens2'(A,B,C,D,E,F,G):-['$parse_tokens_error'([operator,expected,after,expression],F,G)]
        return //
 Op(FILE_system::PRED_$parse_tokens_error_3_static_exec, VA(L_$parse_tokens2_7_s9, a6, a7), cont);
    }
/** PREDICATE: $parse_tokens_before_op/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_before_op'/5,non-(public))
        final static SymbolTerm ATOM_$0020 = SYM(" ");
        final static SymbolTerm ATOM_$002D = SYM("-");
    private static final StructureTerm L_$parse_tokens_before_op_5_s8 = S( FUNCTOR_atom_1 ,  ATOM_$002D );
        final static SymbolTerm FUNCTOR_$002D_1 = F("-",1);
        final static SymbolTerm ATOM_$0028 = SYM("(");
        final static SymbolTerm ATOM_$0029 = SYM(")");
        final static SymbolTerm ATOM_$007B = SYM("{");
        final static SymbolTerm ATOM_$005B = SYM("[");
        final static SymbolTerm ATOM_fx = SYM("fx");
        final static SymbolTerm FUNCTOR_$002D_2 = F("-",2);
        final static SymbolTerm ATOM_fy = SYM("fy");

    // private final Term arg5;




    public static Operation PRED_$parse_tokens_before_op_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $parse_tokens_before_op_5_top(m);
    }

    private final static Operation $parse_tokens_before_op_5_top(Prolog m) { 
        m.setB0();
        m.jtry5(null, FILE_builtins::$parse_tokens_before_op_5_sub_1);
        return $parse_tokens_before_op_5_1(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_before_op_5_sub_2);
        return $parse_tokens_before_op_5_2(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_2(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_before_op_5_sub_3);
        return $parse_tokens_before_op_5_3(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_3(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_before_op_5_sub_4);
        return $parse_tokens_before_op_5_4(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_4(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_before_op_5_sub_5);
        return $parse_tokens_before_op_5_5(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_5(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_before_op_5_sub_6);
        return $parse_tokens_before_op_5_6(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_6(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_before_op_5_sub_7);
        return $parse_tokens_before_op_5_7(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_7(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_before_op_5_sub_8);
        return $parse_tokens_before_op_5_8(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_8(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_before_op_5_sub_9);
        return $parse_tokens_before_op_5_9(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_9(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_before_op_5_sub_10);
        return $parse_tokens_before_op_5_10(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_10(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_before_op_5_sub_11);
        return $parse_tokens_before_op_5_11(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_11(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_before_op_5_sub_12);
        return $parse_tokens_before_op_5_12(m);
    }

    private final static Operation $parse_tokens_before_op_5_sub_12(Prolog m) { 
        m.trust(null);
        return $parse_tokens_before_op_5_13(m);
    }

    private final static Operation $parse_tokens_before_op_5_1(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,C,[' '|D],E):-(!,F=D),'$parse_tokens_before_op'(A,B,C,F,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,C,[' '|D],E):-['$neck_cut','$unify'(F,D),'$parse_tokens_before_op'(A,B,C,F,E)]
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (!  ATOM_$0020 .unify(a4.car(), m.trail))
                return m.fail();
            a6 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
             a4.bind(CONS( ATOM_$0020 , a6), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a7 = m.mkvar1();
        //START inline expansion of $unify(a(7),a(6))
        if (! a7.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a1;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a7;
        m.AREGS[4] = a5;
m.cont = cont;
        return $parse_tokens_before_op_5_top(m);
    }

    private final static Operation $parse_tokens_before_op_5_2(Prolog m) { 
    // '$parse_tokens_before_op'(A,end_of_file,0,[end_of_file|B],C):-!,C=B
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,end_of_file,0,[end_of_file|B],C):-['$neck_cut','$unify'(C,B)]
        if (!  ATOM_end_of_file .unify(a2, m.trail))
            return m.fail();
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (!  ATOM_end_of_file .unify(a4.car(), m.trail))
                return m.fail();
            a6 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
             a4.bind(CONS( ATOM_end_of_file , a6), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of $unify(a(5),a(6))
        if (! a5.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $parse_tokens_before_op_5_3(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,0,[number(B)|C],D):-!,D=C
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,0,[number(B)|C],D):-['$neck_cut','$unify'(D,C)]
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        a6 = a4.car();
            a7 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a4.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_number_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of $unify(a(5),a(7))
        if (! a5.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $parse_tokens_before_op_5_4(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,0,[atom(-)|C],D):-C=[number(E)|F],(!,G=F),B is -E,D=G
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,0,[atom(-)|C],D):-['$get_level'(E),'$unify'(C,[number(F)|G]),'$cut'(E),'$unify'(H,G),B is -F,'$unify'(D,H)]
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! L_$parse_tokens_before_op_5_s8.unify(a4.car(), m.trail))
                return m.fail();
            a6 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
             a4.bind(CONS(L_$parse_tokens_before_op_5_s8, a6), m.trail);
        } else {
            return m.fail();
        }
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
    // put_str_args([a(8)],y(1)),put_str(@('FUNCTOR_number_1'),y(1),a(9))
        a9 =  S( FUNCTOR_number_1 , a8);
 ;
        a10 = m.mkvar1();
        a11 = CONS(a9, a10);
        //START inline expansion of $unify(a(6),a(11))
        if (! a6.unify(a11, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        a12 = m.mkvar1();
        //START inline expansion of $unify(a(12),a(10))
        if (! a12.unify(a10, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(8)],y(2)),put_str(@('FUNCTOR_$002D_1'),y(2),a(13))
        a13 =  S( FUNCTOR_$002D_1 , a8);
 ;
        //START inline expansion of a(2)is a(13)
        if (! a2.unify(Arithmetic.evaluate(a13), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(5),a(12))
        if (! a5.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $parse_tokens_before_op_5_5(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,0,[var(C,B)|D],E):-!,E=D
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,0,[var(C,B)|D],E):-['$neck_cut','$unify'(E,D)]
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        a6 = a4.car();
            a7 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a4.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_var_2 , m.trail, m.DONT_CARE1(), a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of $unify(a(5),a(7))
        if (! a5.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $parse_tokens_before_op_5_6(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,0,[string(B)|C],D):-!,D=C
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,0,[string(B)|C],D):-['$neck_cut','$unify'(D,C)]
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        a6 = a4.car();
            a7 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a4.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_string_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of $unify(a(5),a(7))
        if (! a5.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $parse_tokens_before_op_5_7(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,0,['('|C],D):-(!,E=C),'$parse_tokens'(B,1201,E,F),'$parse_tokens_expect'(')',F,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,0,['('|C],D):-['$neck_cut','$unify'(E,C),'$parse_tokens'(B,1201,E,F),'$parse_tokens_expect'(')',F,D)]
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (!  ATOM_$0028 .unify(a4.car(), m.trail))
                return m.fail();
            a6 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
             a4.bind(CONS( ATOM_$0028 , a6), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a7 = m.mkvar1();
        //START inline expansion of $unify(a(7),a(6))
        if (! a7.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a2,  int_1201 , a7, a8), //
 Op(FILE_system::PRED_$parse_tokens_expect_3_static_exec, VA( ATOM_$0029 , a8, a5), cont));
    }

    private final static Operation $parse_tokens_before_op_5_8(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,0,['{'|C],D):-(!,E=C),'$parse_tokens_skip_spaces'(E,F),'$parse_tokens_brace'(B,F,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,0,['{'|C],D):-['$neck_cut','$unify'(E,C),'$parse_tokens_skip_spaces'(E,F),'$parse_tokens_brace'(B,F,D)]
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (!  ATOM_$007B .unify(a4.car(), m.trail))
                return m.fail();
            a6 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
             a4.bind(CONS( ATOM_$007B , a6), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a7 = m.mkvar1();
        //START inline expansion of $unify(a(7),a(6))
        if (! a7.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a7, a8), //
 Op(FILE_system::PRED_$parse_tokens_brace_3_static_exec, VA(a2, a8, a5), cont));
    }

    private final static Operation $parse_tokens_before_op_5_9(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,0,['['|C],D):-(!,E=C),'$parse_tokens_skip_spaces'(E,F),'$parse_tokens_list'(B,F,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,0,['['|C],D):-['$neck_cut','$unify'(E,C),'$parse_tokens_skip_spaces'(E,F),'$parse_tokens_list'(B,F,D)]
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (!  ATOM_$005B .unify(a4.car(), m.trail))
                return m.fail();
            a6 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
             a4.bind(CONS( ATOM_$005B , a6), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a7 = m.mkvar1();
        //START inline expansion of $unify(a(7),a(6))
        if (! a7.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a7, a8), //
 Op(FILE_system::PRED_$parse_tokens_list_3_static_exec, VA(a2, a8, a5), cont));
    }

    private final static Operation $parse_tokens_before_op_5_10(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,0,[atom(C)|D],E):-D=['('|F],(!,G=F),'$parse_tokens_skip_spaces'(G,H),'$parse_tokens_args'(I,H,J),B=..[C|I],E=J
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,0,[atom(C)|D],E):-['$get_level'(F),'$unify'(D,['('|G]),'$cut'(F),'$unify'(H,G),'$parse_tokens_skip_spaces'(H,I),'$parse_tokens_args'(J,I,K),'$univ'(B,[C|J]),'$unify'(E,K)]
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        a6 = a4.car();
            a7 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a4.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_atom_1 , m.trail, a8)){
                return m.fail();
            }
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        a11 = CONS( ATOM_$0028 , a10);
        //START inline expansion of $unify(a(7),a(11))
        if (! a7.unify(a11, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(9))
        a9 = a9.dref();
                  m.cut( a9.intValue());
        //END inline expansion
        a12 = m.mkvar1();
        //START inline expansion of $unify(a(12),a(10))
        if (! a12.unify(a10, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = CONS(a8, a14);
        return //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a12, a13), //
 Op(FILE_system::PRED_$parse_tokens_args_3_static_exec, VA(a14, a13, a15), //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a2, a16), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a5, a15), cont))));
    }

    private final static Operation $parse_tokens_before_op_5_11(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,C,[atom(D)|E],F):-(current_op(C,fx,D),G=E),(C=<A,H=G),'$parse_tokens_skip_spaces'(H,I),'$parse_tokens_peep_next'(J,I,K),('$parse_tokens_is_starter'(J),L=K),('$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(J),M=L),(!,N=M),(O is C-1,P=N),'$parse_tokens'(Q,O,P,R),(functor(B,D,1),S=R),arg(1,B,Q),F=S
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,C,[atom(D)|E],F):-['$get_level'(G),current_op(C,fx,D),'$unify'(H,E),'$less_or_equal'(C,A),'$unify'(I,H),'$parse_tokens_skip_spaces'(I,J),'$parse_tokens_peep_next'(K,J,L),'$parse_tokens_is_starter'(K),'$unify'(M,L),'$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(K),'$unify'(N,M),'$cut'(G),'$unify'(O,N),P is C-1,'$unify'(Q,O),'$parse_tokens'(R,P,Q,S),functor(B,D,1),'$unify'(T,S),arg(1,B,R),'$unify'(F,T)]
        a4 = a4.dref();
        if (a4 .isCons()){
                        a6 = a4.car();
            a7 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a4.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_atom_1 , m.trail, a8)){
                return m.fail();
            }
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
    // put_str_args([a(3),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(19))
        a19 =  S( FUNCTOR_$002D_2 , a3,  int_1 );
 ;
        a20 = m.mkvar1();
        a21 = m.mkvar1();
        a22 = m.mkvar1();
        a23 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_op_3_static_exec, VA(a3,  ATOM_fx , a8), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a10, a7), //
 Op(FILE_system::PRED_$less_or_equal_2_static_exec, VA(a3, a1), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a11, a10), //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a11, a12), //
 Op(FILE_system::PRED_$parse_tokens_peep_next_3_static_exec, VA(a13, a12, a14), //
 Op(FILE_system::PRED_$parse_tokens_is_starter_1_static_exec, VA(a13), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a15, a14), //
 Op(FILE_system::PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a13), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a16, a15), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a9), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a17, a16), //
 Op(FILE_builtins::PRED_is_2_static_exec, VA(a18, a19), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a20, a17), //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a21, a18, a20, a22), //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a2, a8,  int_1 ), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a23, a22), //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_1 , a2, a21), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a5, a23), cont)))))))))))))))))));
    }

    private final static Operation $parse_tokens_before_op_5_12(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,C,[atom(D)|E],F):-(current_op(C,fy,D),G=E),(C=<A,H=G),'$parse_tokens_skip_spaces'(H,I),'$parse_tokens_peep_next'(J,I,K),('$parse_tokens_is_starter'(J),L=K),('$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(J),M=L),(!,N=M),'$parse_tokens'(O,C,N,P),(functor(B,D,1),Q=P),arg(1,B,O),F=Q
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,C,[atom(D)|E],F):-['$get_level'(G),current_op(C,fy,D),'$unify'(H,E),'$less_or_equal'(C,A),'$unify'(I,H),'$parse_tokens_skip_spaces'(I,J),'$parse_tokens_peep_next'(K,J,L),'$parse_tokens_is_starter'(K),'$unify'(M,L),'$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(K),'$unify'(N,M),'$cut'(G),'$unify'(O,N),'$parse_tokens'(P,C,O,Q),functor(B,D,1),'$unify'(R,Q),arg(1,B,P),'$unify'(F,R)]
        a4 = a4.dref();
        if (a4 .isCons()){
                        a6 = a4.car();
            a7 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a4.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_atom_1 , m.trail, a8)){
                return m.fail();
            }
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_op_3_static_exec, VA(a3,  ATOM_fy , a8), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a10, a7), //
 Op(FILE_system::PRED_$less_or_equal_2_static_exec, VA(a3, a1), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a11, a10), //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a11, a12), //
 Op(FILE_system::PRED_$parse_tokens_peep_next_3_static_exec, VA(a13, a12, a14), //
 Op(FILE_system::PRED_$parse_tokens_is_starter_1_static_exec, VA(a13), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a15, a14), //
 Op(FILE_system::PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a13), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a16, a15), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a9), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a17, a16), //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a18, a3, a17, a19), //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a2, a8,  int_1 ), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a20, a19), //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_1 , a2, a18), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a5, a20), cont)))))))))))))))));
    }

    private final static Operation $parse_tokens_before_op_5_13(Prolog m) { 
    // '$parse_tokens_before_op'(A,B,0,[atom(B)|C],C):-true
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$parse_tokens_before_op'(A,B,0,[atom(B)|C],C):-[]
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        a6 = a4.car();
            a7 = a4.cdr();
        } else if (a4.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a4.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_atom_1 , m.trail, a2)){
                return m.fail();
            }
        if (! a7.unify(a5, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))




    public static Operation PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-'$parse_tokens_is_post_in_op'(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),'$parse_tokens_is_post_in_op'(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$parse_tokens_is_post_in_op_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))




    public static Operation PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-'$parse_tokens_is_post_in_op'(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),'$parse_tokens_is_post_in_op'(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$parse_tokens_is_post_in_op_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $parse_tokens_brace/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_brace'/3,non-(public))
        final static SymbolTerm ATOM_$007B$007D = SYM("{}");
        final static SymbolTerm ATOM_$007D = SYM("}");
        final static SymbolTerm FUNCTOR_$007B$007D_1 = F("{}",1);




    public static Operation PRED_$parse_tokens_brace_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_brace_3_var, FILE_builtins::$parse_tokens_brace_3_2, FILE_builtins::$parse_tokens_brace_3_2, FILE_builtins::$parse_tokens_brace_3_var, FILE_builtins::$parse_tokens_brace_3_2, FILE_builtins::$parse_tokens_brace_3_2); 
    }

    private final static Operation $parse_tokens_brace_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$parse_tokens_brace_3_var_1);
        return $parse_tokens_brace_3_1(m);
    }

    private final static Operation $parse_tokens_brace_3_var_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_brace_3_2(m);
    }

    private final static Operation $parse_tokens_brace_3_1(Prolog m) { 
    // '$parse_tokens_brace'({},['}'|A],B):-!,B=A
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_brace'({},['}'|A],B):-['$neck_cut','$unify'(B,A)]
        if (!  ATOM_$007B$007D .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (!  ATOM_$007D .unify(a2.car(), m.trail))
                return m.fail();
            a4 = a2.cdr();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
             a2.bind(CONS( ATOM_$007D , a4), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of $unify(a(3),a(4))
        if (! a3.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $parse_tokens_brace_3_2(Prolog m) { 
    // '$parse_tokens_brace'(A,B,C):-'$parse_tokens'(D,1201,B,E),'$parse_tokens_expect'('}',E,F),A={D},C=F
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_brace'(A,B,C):-['$parse_tokens'(D,1201,B,E),'$parse_tokens_expect'('}',E,F),'$unify'(A,{D}),'$unify'(C,F)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = m.mkvar1();
    // put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_$007B$007D_1'),y(1),a(7))
        a7 =  S( FUNCTOR_$007B$007D_1 , a4);
 ;
        return //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a4,  int_1201 , a2, a5), //
 Op(FILE_system::PRED_$parse_tokens_expect_3_static_exec, VA( ATOM_$007D , a5, a6), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a1, a7), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a3, a6), cont))));
    }
/** PREDICATE: $parse_tokens_list/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_list'/3,non-(public))
        final static SymbolTerm ATOM_Nil = SYM("[]");
        final static SymbolTerm ATOM_$005D = SYM("]");
        final static IntegerTerm int_999 = Integer(999);




    public static Operation PRED_$parse_tokens_list_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_list_3_var, fail_0, fail_0, FILE_builtins::$parse_tokens_list_3_1, fail_0, FILE_builtins::$parse_tokens_list_3_2); 
    }

    private final static Operation $parse_tokens_list_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$parse_tokens_list_3_var_1);
        return $parse_tokens_list_3_1(m);
    }

    private final static Operation $parse_tokens_list_3_var_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_list_3_2(m);
    }

    private final static Operation $parse_tokens_list_3_1(Prolog m) { 
    // '$parse_tokens_list'('[]',[']'|A],B):-!,B=A
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_list'('[]',[']'|A],B):-['$neck_cut','$unify'(B,A)]
        if (!  ATOM_Nil .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (!  ATOM_$005D .unify(a2.car(), m.trail))
                return m.fail();
            a4 = a2.cdr();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
             a2.bind(CONS( ATOM_$005D , a4), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of $unify(a(3),a(4))
        if (! a3.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $parse_tokens_list_3_2(Prolog m) { 
    // '$parse_tokens_list'([A|B],C,D):-'$parse_tokens'(A,999,C,E),'$parse_tokens_skip_spaces'(E,F),'$parse_tokens_list_rest'(B,F,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_list'([A|B],C,D):-['$parse_tokens'(A,999,C,E),'$parse_tokens_skip_spaces'(E,F),'$parse_tokens_list_rest'(B,F,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a4,  int_999 , a2, a6), //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a6, a7), //
 Op(FILE_system::PRED_$parse_tokens_list_rest_3_static_exec, VA(a5, a7, a3), cont)));
    }
/** PREDICATE: $parse_tokens_list_rest/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_list_rest'/3,non-(public))
        final static SymbolTerm ATOM_$007C = SYM("|");
        final static SymbolTerm ATOM_$002C = SYM(",");




    public static Operation PRED_$parse_tokens_list_rest_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_list_rest_3_var, FILE_builtins::$parse_tokens_list_rest_3_1, FILE_builtins::$parse_tokens_list_rest_3_1, FILE_builtins::$parse_tokens_list_rest_3_con, FILE_builtins::$parse_tokens_list_rest_3_1, FILE_builtins::$parse_tokens_list_rest_3_lis); 
    }

    private final static Operation $parse_tokens_list_rest_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$parse_tokens_list_rest_3_var_1);
        return $parse_tokens_list_rest_3_1(m);
    }

    private final static Operation $parse_tokens_list_rest_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_list_rest_3_var_2);
        return $parse_tokens_list_rest_3_2(m);
    }

    private final static Operation $parse_tokens_list_rest_3_var_2(Prolog m) { 
        m.trust(null);
        return $parse_tokens_list_rest_3_3(m);
    }

    private final static Operation $parse_tokens_list_rest_3_con(Prolog m) { 
        m.jtry3(null, FILE_builtins::$parse_tokens_list_rest_3_con_1);
        return $parse_tokens_list_rest_3_1(m);
    }

    private final static Operation $parse_tokens_list_rest_3_con_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_list_rest_3_3(m);
    }

    private final static Operation $parse_tokens_list_rest_3_lis(Prolog m) { 
        m.jtry3(null, FILE_builtins::$parse_tokens_list_rest_3_lis_1);
        return $parse_tokens_list_rest_3_1(m);
    }

    private final static Operation $parse_tokens_list_rest_3_lis_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_list_rest_3_2(m);
    }

    private final static Operation $parse_tokens_list_rest_3_1(Prolog m) { 
    // '$parse_tokens_list_rest'(A,['|'|B],C):-(!,D=B),'$parse_tokens'(A,999,D,E),'$parse_tokens_expect'(']',E,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_list_rest'(A,['|'|B],C):-['$neck_cut','$unify'(D,B),'$parse_tokens'(A,999,D,E),'$parse_tokens_expect'(']',E,C)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (!  ATOM_$007C .unify(a2.car(), m.trail))
                return m.fail();
            a4 = a2.cdr();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
             a2.bind(CONS( ATOM_$007C , a4), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a5 = m.mkvar1();
        //START inline expansion of $unify(a(5),a(4))
        if (! a5.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a6 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a1,  int_999 , a5, a6), //
 Op(FILE_system::PRED_$parse_tokens_expect_3_static_exec, VA( ATOM_$005D , a6, a3), cont));
    }

    private final static Operation $parse_tokens_list_rest_3_2(Prolog m) { 
    // '$parse_tokens_list_rest'([A|B],[','|C],D):-(!,E=C),'$parse_tokens'(A,999,E,F),'$parse_tokens_skip_spaces'(F,G),'$parse_tokens_list_rest'(B,G,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_list_rest'([A|B],[','|C],D):-['$neck_cut','$unify'(E,C),'$parse_tokens'(A,999,E,F),'$parse_tokens_skip_spaces'(F,G),'$parse_tokens_list_rest'(B,G,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (!  ATOM_$002C .unify(a2.car(), m.trail))
                return m.fail();
            a6 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
             a2.bind(CONS( ATOM_$002C , a6), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a7 = m.mkvar1();
        //START inline expansion of $unify(a(7),a(6))
        if (! a7.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a4,  int_999 , a7, a8), //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a8, a9), //
 Op(FILE_system::PRED_$parse_tokens_list_rest_3_static_exec, VA(a5, a9, a3), cont)));
    }

    private final static Operation $parse_tokens_list_rest_3_3(Prolog m) { 
    // '$parse_tokens_list_rest'('[]',A,B):-'$parse_tokens_expect'(']',A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_list_rest'('[]',A,B):-['$parse_tokens_expect'(']',A,B)]
        if (!  ATOM_Nil .unify(a1, m.trail))
            return m.fail();
        return //
 Op(FILE_system::PRED_$parse_tokens_expect_3_static_exec, VA( ATOM_$005D , a2, a3), cont);
    }
/** PREDICATE: $parse_tokens_args/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_args'/3,non-(public))




    public static Operation PRED_$parse_tokens_args_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_args_3_var, fail_0, fail_0, FILE_builtins::$parse_tokens_args_3_1, fail_0, FILE_builtins::$parse_tokens_args_3_2); 
    }

    private final static Operation $parse_tokens_args_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$parse_tokens_args_3_var_1);
        return $parse_tokens_args_3_1(m);
    }

    private final static Operation $parse_tokens_args_3_var_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_args_3_2(m);
    }

    private final static Operation $parse_tokens_args_3_1(Prolog m) { 
    // '$parse_tokens_args'('[]',[')'|A],B):-!,B=A
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_args'('[]',[')'|A],B):-['$neck_cut','$unify'(B,A)]
        if (!  ATOM_Nil .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (!  ATOM_$0029 .unify(a2.car(), m.trail))
                return m.fail();
            a4 = a2.cdr();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
             a2.bind(CONS( ATOM_$0029 , a4), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of $unify(a(3),a(4))
        if (! a3.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $parse_tokens_args_3_2(Prolog m) { 
    // '$parse_tokens_args'([A|B],C,D):-'$parse_tokens'(A,999,C,E),'$parse_tokens_skip_spaces'(E,F),'$parse_tokens_args_rest'(B,F,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_args'([A|B],C,D):-['$parse_tokens'(A,999,C,E),'$parse_tokens_skip_spaces'(E,F),'$parse_tokens_args_rest'(B,F,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a4,  int_999 , a2, a6), //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a6, a7), //
 Op(FILE_system::PRED_$parse_tokens_args_rest_3_static_exec, VA(a5, a7, a3), cont)));
    }
/** PREDICATE: $parse_tokens_args_rest/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_args_rest'/3,non-(public))




    public static Operation PRED_$parse_tokens_args_rest_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_args_rest_3_var, fail_0, fail_0, FILE_builtins::$parse_tokens_args_rest_3_2, fail_0, FILE_builtins::$parse_tokens_args_rest_3_1); 
    }

    private final static Operation $parse_tokens_args_rest_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$parse_tokens_args_rest_3_var_1);
        return $parse_tokens_args_rest_3_1(m);
    }

    private final static Operation $parse_tokens_args_rest_3_var_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_args_rest_3_2(m);
    }

    private final static Operation $parse_tokens_args_rest_3_1(Prolog m) { 
    // '$parse_tokens_args_rest'([A|B],[','|C],D):-(!,E=C),'$parse_tokens'(A,999,E,F),'$parse_tokens_skip_spaces'(F,G),'$parse_tokens_args_rest'(B,G,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_args_rest'([A|B],[','|C],D):-['$neck_cut','$unify'(E,C),'$parse_tokens'(A,999,E,F),'$parse_tokens_skip_spaces'(F,G),'$parse_tokens_args_rest'(B,G,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (!  ATOM_$002C .unify(a2.car(), m.trail))
                return m.fail();
            a6 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
             a2.bind(CONS( ATOM_$002C , a6), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a7 = m.mkvar1();
        //START inline expansion of $unify(a(7),a(6))
        if (! a7.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a4,  int_999 , a7, a8), //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a8, a9), //
 Op(FILE_system::PRED_$parse_tokens_args_rest_3_static_exec, VA(a5, a9, a3), cont)));
    }

    private final static Operation $parse_tokens_args_rest_3_2(Prolog m) { 
    // '$parse_tokens_args_rest'('[]',A,B):-'$parse_tokens_expect'(')',A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_args_rest'('[]',A,B):-['$parse_tokens_expect'(')',A,B)]
        if (!  ATOM_Nil .unify(a1, m.trail))
            return m.fail();
        return //
 Op(FILE_system::PRED_$parse_tokens_expect_3_static_exec, VA( ATOM_$0029 , a2, a3), cont);
    }
/** PREDICATE: $parse_tokens_post_in_ops/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_post_in_ops'/7,non-(public))

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_$parse_tokens_post_in_ops_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_builtins::$parse_tokens_post_in_ops_7_sub_1);
        return $parse_tokens_post_in_ops_7_1(m);
    }

    private final static Operation $parse_tokens_post_in_ops_7_sub_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_post_in_ops_7_2(m);
    }

    private final static Operation $parse_tokens_post_in_ops_7_1(Prolog m) { 
    // '$parse_tokens_post_in_ops'(A,B,C,D,E,F,G):-'$parse_tokens_skip_spaces'(F,H),H=[I|J],'$parse_tokens_op'(I,A,B,C,K,L,J,M),'$parse_tokens_post_in_ops'(A,K,L,D,E,M,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$parse_tokens_post_in_ops'(A,B,C,D,E,F,G):-['$parse_tokens_skip_spaces'(F,H),'$unify'(H,[I|J]),'$parse_tokens_op'(I,A,B,C,K,L,J,M),'$parse_tokens_post_in_ops'(A,K,L,D,E,M,G)]
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = CONS(a9, a10);
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a6, a8), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a8, a11), //
 Op(FILE_system::PRED_$parse_tokens_op_8_static_exec, VA(a9, a1, a2, a3, a12, a13, a10, a14), //
 Op(FILE_system::PRED_$parse_tokens_post_in_ops_7_static_exec, VA(a1, a12, a13, a4, a5, a14, a7), cont))));
    }

    private final static Operation $parse_tokens_post_in_ops_7_2(Prolog m) { 
    // '$parse_tokens_post_in_ops'(A,B,C,B,C,D,E):-C=<A,E=D
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$parse_tokens_post_in_ops'(A,B,C,B,C,D,E):-['$less_or_equal'(C,A),'$unify'(E,D)]
        if (! a2.unify(a4, m.trail))
            return m.fail();
        if (! a3.unify(a5, m.trail))
            return m.fail();
        //START inline expansion of $less_or_equal(a(3),a(1))
        if (Arithmetic.evaluate(a3).arithCompareTo(Arithmetic.evaluate(a1)) > 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(7),a(6))
        if (! a7.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $parse_tokens_op/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_op'/8,non-(public))
    private static final StructureTerm L_$parse_tokens_op_8_s4 = S( FUNCTOR_atom_1 ,  ATOM_$002C );
        final static SymbolTerm ATOM_or = SYM(";");
    private static final StructureTerm L_$parse_tokens_op_8_s8 = S( FUNCTOR_atom_1 ,  ATOM_or );
        final static SymbolTerm ATOM_xf = SYM("xf");
        final static SymbolTerm ATOM_yf = SYM("yf");
        final static SymbolTerm ATOM_xfx = SYM("xfx");
        final static SymbolTerm ATOM_xfy = SYM("xfy");
        final static SymbolTerm ATOM_yfx = SYM("yfx");

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_$parse_tokens_op_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $parse_tokens_op_8_top(m);
    }

    private final static Operation $parse_tokens_op_8_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_op_8_var, fail_0, fail_0, FILE_builtins::$parse_tokens_op_8_con, FILE_builtins::$parse_tokens_op_8_str, fail_0); 
    }

    private final static Operation $parse_tokens_op_8_var(Prolog m) { 
        m.jtry8(null, FILE_builtins::$parse_tokens_op_8_var_1);
        return $parse_tokens_op_8_1(m);
    }

    private final static Operation $parse_tokens_op_8_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_op_8_var_2);
        return $parse_tokens_op_8_2(m);
    }

    private final static Operation $parse_tokens_op_8_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_op_8_var_3);
        return $parse_tokens_op_8_3(m);
    }

    private final static Operation $parse_tokens_op_8_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_op_8_var_4);
        return $parse_tokens_op_8_4(m);
    }

    private final static Operation $parse_tokens_op_8_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_op_8_var_5);
        return $parse_tokens_op_8_5(m);
    }

    private final static Operation $parse_tokens_op_8_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_op_8_var_6);
        return $parse_tokens_op_8_6(m);
    }

    private final static Operation $parse_tokens_op_8_var_6(Prolog m) { 
        m.trust(null);
        return $parse_tokens_op_8_7(m);
    }

    private final static Operation $parse_tokens_op_8_con(Prolog m) { 
        m.jtry8(null, FILE_builtins::$parse_tokens_op_8_con_1);
        return $parse_tokens_op_8_1(m);
    }

    private final static Operation $parse_tokens_op_8_con_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_op_8_2(m);
    }

    private final static Operation $parse_tokens_op_8_str(Prolog m) { 
        m.jtry8(null, FILE_builtins::$parse_tokens_op_8_str_1);
        return $parse_tokens_op_8_3(m);
    }

    private final static Operation $parse_tokens_op_8_str_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_op_8_str_2);
        return $parse_tokens_op_8_4(m);
    }

    private final static Operation $parse_tokens_op_8_str_2(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_op_8_str_3);
        return $parse_tokens_op_8_5(m);
    }

    private final static Operation $parse_tokens_op_8_str_3(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_op_8_str_4);
        return $parse_tokens_op_8_6(m);
    }

    private final static Operation $parse_tokens_op_8_str_4(Prolog m) { 
        m.trust(null);
        return $parse_tokens_op_8_7(m);
    }

    private final static Operation $parse_tokens_op_8_1(Prolog m) { 
    // '$parse_tokens_op'(',',A,B,C,D,E,F,G):-(!,H=F),'$parse_tokens_op'(atom(','),A,B,C,D,E,H,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$parse_tokens_op'(',',A,B,C,D,E,F,G):-['$neck_cut','$unify'(H,F),'$parse_tokens_op'(atom(','),A,B,C,D,E,H,G)]
        if (!  ATOM_$002C .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a9 = m.mkvar1();
        //START inline expansion of $unify(a(9),a(7))
        if (! a9.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = L_$parse_tokens_op_8_s4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
        m.AREGS[6] = a9;
        m.AREGS[7] = a8;
m.cont = cont;
        return $parse_tokens_op_8_top(m);
    }

    private final static Operation $parse_tokens_op_8_2(Prolog m) { 
    // '$parse_tokens_op'('|',A,B,C,D,E,F,G):-(!,H=F),'$parse_tokens_op'(atom(;),A,B,C,D,E,H,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$parse_tokens_op'('|',A,B,C,D,E,F,G):-['$neck_cut','$unify'(H,F),'$parse_tokens_op'(atom(;),A,B,C,D,E,H,G)]
        if (!  ATOM_$007C .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a9 = m.mkvar1();
        //START inline expansion of $unify(a(9),a(7))
        if (! a9.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = L_$parse_tokens_op_8_s8;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
        m.AREGS[6] = a9;
        m.AREGS[7] = a8;
m.cont = cont;
        return $parse_tokens_op_8_top(m);
    }

    private final static Operation $parse_tokens_op_8_3(Prolog m) { 
    // '$parse_tokens_op'(atom(A),B,C,D,E,F,G,H):-(current_op(F,xf,A),I=G),(F=<B,J=I),(D<F,K=J),(functor(E,A,1),L=K),arg(1,E,C),H=L
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$parse_tokens_op'(atom(A),B,C,D,E,F,G,H):-[current_op(F,xf,A),'$unify'(I,G),'$less_or_equal'(F,B),'$unify'(J,I),'$less_than'(D,F),'$unify'(K,J),functor(E,A,1),'$unify'(L,K),arg(1,E,C),'$unify'(H,L)]
        a1 = a1.dref();
            a9 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_atom_1 , m.trail, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_op_3_static_exec, VA(a6,  ATOM_xf , a9), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a10, a7), //
 Op(FILE_system::PRED_$less_or_equal_2_static_exec, VA(a6, a2), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a11, a10), //
 Op(FILE_system::PRED_$less_than_2_static_exec, VA(a4, a6), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a12, a11), //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a5, a9,  int_1 ), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a13, a12), //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_1 , a5, a3), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a8, a13), cont))))))))));
    }

    private final static Operation $parse_tokens_op_8_4(Prolog m) { 
    // '$parse_tokens_op'(atom(A),B,C,D,E,F,G,H):-(current_op(F,yf,A),I=G),(F=<B,J=I),(D=<F,K=J),(functor(E,A,1),L=K),arg(1,E,C),H=L
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$parse_tokens_op'(atom(A),B,C,D,E,F,G,H):-[current_op(F,yf,A),'$unify'(I,G),'$less_or_equal'(F,B),'$unify'(J,I),'$less_or_equal'(D,F),'$unify'(K,J),functor(E,A,1),'$unify'(L,K),arg(1,E,C),'$unify'(H,L)]
        a1 = a1.dref();
            a9 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_atom_1 , m.trail, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_op_3_static_exec, VA(a6,  ATOM_yf , a9), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a10, a7), //
 Op(FILE_system::PRED_$less_or_equal_2_static_exec, VA(a6, a2), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a11, a10), //
 Op(FILE_system::PRED_$less_or_equal_2_static_exec, VA(a4, a6), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a12, a11), //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a5, a9,  int_1 ), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a13, a12), //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_1 , a5, a3), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a8, a13), cont))))))))));
    }

    private final static Operation $parse_tokens_op_8_5(Prolog m) { 
    // '$parse_tokens_op'(atom(A),B,C,D,E,F,G,H):-(current_op(F,xfx,A),I=G),(F=<B,J=I),(D<F,K=J),(L is F-1,M=K),'$parse_tokens'(N,L,M,O),(!,P=O),(functor(E,A,2),Q=P),(arg(1,E,C),R=Q),arg(2,E,N),H=R
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$parse_tokens_op'(atom(A),B,C,D,E,F,G,H):-['$get_level'(I),current_op(F,xfx,A),'$unify'(J,G),'$less_or_equal'(F,B),'$unify'(K,J),'$less_than'(D,F),'$unify'(L,K),M is F-1,'$unify'(N,L),'$parse_tokens'(O,M,N,P),'$cut'(I),'$unify'(Q,P),functor(E,A,2),'$unify'(R,Q),arg(1,E,C),'$unify'(S,R),arg(2,E,O),'$unify'(H,S)]
        a1 = a1.dref();
            a9 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_atom_1 , m.trail, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
    // put_str_args([a(6),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(15))
        a15 =  S( FUNCTOR_$002D_2 , a6,  int_1 );
 ;
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        a21 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_op_3_static_exec, VA(a6,  ATOM_xfx , a9), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a11, a7), //
 Op(FILE_system::PRED_$less_or_equal_2_static_exec, VA(a6, a2), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a12, a11), //
 Op(FILE_system::PRED_$less_than_2_static_exec, VA(a4, a6), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a13, a12), //
 Op(FILE_builtins::PRED_is_2_static_exec, VA(a14, a15), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a16, a13), //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a17, a14, a16, a18), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a10), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a19, a18), //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a5, a9,  int_2 ), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a20, a19), //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_1 , a5, a3), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a21, a20), //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_2 , a5, a17), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a8, a21), cont)))))))))))))))));
    }

    private final static Operation $parse_tokens_op_8_6(Prolog m) { 
    // '$parse_tokens_op'(atom(A),B,C,D,E,F,G,H):-(current_op(F,xfy,A),I=G),(F=<B,J=I),(D<F,K=J),(L is F,M=K),'$parse_tokens'(N,L,M,O),(!,P=O),(functor(E,A,2),Q=P),(arg(1,E,C),R=Q),arg(2,E,N),H=R
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$parse_tokens_op'(atom(A),B,C,D,E,F,G,H):-['$get_level'(I),current_op(F,xfy,A),'$unify'(J,G),'$less_or_equal'(F,B),'$unify'(K,J),'$less_than'(D,F),'$unify'(L,K),M is F,'$unify'(N,L),'$parse_tokens'(O,M,N,P),'$cut'(I),'$unify'(Q,P),functor(E,A,2),'$unify'(R,Q),arg(1,E,C),'$unify'(S,R),arg(2,E,O),'$unify'(H,S)]
        a1 = a1.dref();
            a9 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_atom_1 , m.trail, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_op_3_static_exec, VA(a6,  ATOM_xfy , a9), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a11, a7), //
 Op(FILE_system::PRED_$less_or_equal_2_static_exec, VA(a6, a2), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a12, a11), //
 Op(FILE_system::PRED_$less_than_2_static_exec, VA(a4, a6), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a13, a12), //
 Op(FILE_builtins::PRED_is_2_static_exec, VA(a14, a6), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a15, a13), //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a16, a14, a15, a17), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a10), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a18, a17), //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a5, a9,  int_2 ), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a19, a18), //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_1 , a5, a3), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a20, a19), //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_2 , a5, a16), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a8, a20), cont)))))))))))))))));
    }

    private final static Operation $parse_tokens_op_8_7(Prolog m) { 
    // '$parse_tokens_op'(atom(A),B,C,D,E,F,G,H):-(current_op(F,yfx,A),I=G),(F=<B,J=I),(D=<F,K=J),(L is F-1,M=K),'$parse_tokens'(N,L,M,O),(!,P=O),(functor(E,A,2),Q=P),(arg(1,E,C),R=Q),arg(2,E,N),H=R
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$parse_tokens_op'(atom(A),B,C,D,E,F,G,H):-['$get_level'(I),current_op(F,yfx,A),'$unify'(J,G),'$less_or_equal'(F,B),'$unify'(K,J),'$less_or_equal'(D,F),'$unify'(L,K),M is F-1,'$unify'(N,L),'$parse_tokens'(O,M,N,P),'$cut'(I),'$unify'(Q,P),functor(E,A,2),'$unify'(R,Q),arg(1,E,C),'$unify'(S,R),arg(2,E,O),'$unify'(H,S)]
        a1 = a1.dref();
            a9 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_atom_1 , m.trail, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
    // put_str_args([a(6),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(15))
        a15 =  S( FUNCTOR_$002D_2 , a6,  int_1 );
 ;
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        a21 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_op_3_static_exec, VA(a6,  ATOM_yfx , a9), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a11, a7), //
 Op(FILE_system::PRED_$less_or_equal_2_static_exec, VA(a6, a2), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a12, a11), //
 Op(FILE_system::PRED_$less_or_equal_2_static_exec, VA(a4, a6), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a13, a12), //
 Op(FILE_builtins::PRED_is_2_static_exec, VA(a14, a15), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a16, a13), //
 Op(FILE_system::PRED_$parse_tokens_4_static_exec, VA(a17, a14, a16, a18), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a10), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a19, a18), //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a5, a9,  int_2 ), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a20, a19), //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_1 , a5, a3), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a21, a20), //
 Op(FILE_system::PRED_arg_3_static_exec, VA( int_2 , a5, a17), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a8, a21), cont)))))))))))))))));
    }
/** PREDICATE: $parse_tokens_is_starter/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_is_starter'/1,non-(public))




    public static Operation PRED_$parse_tokens_is_starter_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_is_starter_1_var, fail_0, fail_0, FILE_builtins::$parse_tokens_is_starter_1_con, FILE_builtins::$parse_tokens_is_starter_1_str, fail_0); 
    }

    private final static Operation $parse_tokens_is_starter_1_var(Prolog m) { 
        m.jtry1(null, FILE_builtins::$parse_tokens_is_starter_1_var_1);
        return $parse_tokens_is_starter_1_1(m);
    }

    private final static Operation $parse_tokens_is_starter_1_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_starter_1_var_2);
        return $parse_tokens_is_starter_1_2(m);
    }

    private final static Operation $parse_tokens_is_starter_1_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_starter_1_var_3);
        return $parse_tokens_is_starter_1_3(m);
    }

    private final static Operation $parse_tokens_is_starter_1_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_starter_1_var_4);
        return $parse_tokens_is_starter_1_4(m);
    }

    private final static Operation $parse_tokens_is_starter_1_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_starter_1_var_5);
        return $parse_tokens_is_starter_1_5(m);
    }

    private final static Operation $parse_tokens_is_starter_1_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_starter_1_var_6);
        return $parse_tokens_is_starter_1_6(m);
    }

    private final static Operation $parse_tokens_is_starter_1_var_6(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_starter_1_var_7);
        return $parse_tokens_is_starter_1_7(m);
    }

    private final static Operation $parse_tokens_is_starter_1_var_7(Prolog m) { 
        m.trust(null);
        return $parse_tokens_is_starter_1_8(m);
    }

    private final static Operation $parse_tokens_is_starter_1_con(Prolog m) { 
        m.jtry1(null, FILE_builtins::$parse_tokens_is_starter_1_con_1);
        return $parse_tokens_is_starter_1_1(m);
    }

    private final static Operation $parse_tokens_is_starter_1_con_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_starter_1_con_2);
        return $parse_tokens_is_starter_1_2(m);
    }

    private final static Operation $parse_tokens_is_starter_1_con_2(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_starter_1_con_3);
        return $parse_tokens_is_starter_1_3(m);
    }

    private final static Operation $parse_tokens_is_starter_1_con_3(Prolog m) { 
        m.trust(null);
        return $parse_tokens_is_starter_1_4(m);
    }

    private final static Operation $parse_tokens_is_starter_1_str(Prolog m) { 
        m.jtry1(null, FILE_builtins::$parse_tokens_is_starter_1_str_1);
        return $parse_tokens_is_starter_1_5(m);
    }

    private final static Operation $parse_tokens_is_starter_1_str_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_starter_1_str_2);
        return $parse_tokens_is_starter_1_6(m);
    }

    private final static Operation $parse_tokens_is_starter_1_str_2(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_starter_1_str_3);
        return $parse_tokens_is_starter_1_7(m);
    }

    private final static Operation $parse_tokens_is_starter_1_str_3(Prolog m) { 
        m.trust(null);
        return $parse_tokens_is_starter_1_8(m);
    }

    private final static Operation $parse_tokens_is_starter_1_1(Prolog m) { 
    // '$parse_tokens_is_starter'(end_of_file):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_starter'(end_of_file):-[]
        if (!  ATOM_end_of_file .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_is_starter_1_2(Prolog m) { 
    // '$parse_tokens_is_starter'('('):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_starter'('('):-[]
        if (!  ATOM_$0028 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_is_starter_1_3(Prolog m) { 
    // '$parse_tokens_is_starter'('['):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_starter'('['):-[]
        if (!  ATOM_$005B .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_is_starter_1_4(Prolog m) { 
    // '$parse_tokens_is_starter'('{'):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_starter'('{'):-[]
        if (!  ATOM_$007B .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_is_starter_1_5(Prolog m) { 
    // '$parse_tokens_is_starter'(number(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_starter'(number(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_number_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation $parse_tokens_is_starter_1_6(Prolog m) { 
    // '$parse_tokens_is_starter'(atom(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_starter'(atom(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_atom_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation $parse_tokens_is_starter_1_7(Prolog m) { 
    // '$parse_tokens_is_starter'(var(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_starter'(var(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_var_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation $parse_tokens_is_starter_1_8(Prolog m) { 
    // '$parse_tokens_is_starter'(string(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_starter'(string(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_string_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: $parse_tokens_is_terminator/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_is_terminator'/1,non-(public))




    public static Operation PRED_$parse_tokens_is_terminator_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_is_terminator_1_var, fail_0, fail_0, FILE_builtins::$parse_tokens_is_terminator_1_var, fail_0, fail_0); 
    }

    private final static Operation $parse_tokens_is_terminator_1_var(Prolog m) { 
        m.jtry1(null, FILE_builtins::$parse_tokens_is_terminator_1_var_1);
        return $parse_tokens_is_terminator_1_1(m);
    }

    private final static Operation $parse_tokens_is_terminator_1_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_terminator_1_var_2);
        return $parse_tokens_is_terminator_1_2(m);
    }

    private final static Operation $parse_tokens_is_terminator_1_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_terminator_1_var_3);
        return $parse_tokens_is_terminator_1_3(m);
    }

    private final static Operation $parse_tokens_is_terminator_1_var_3(Prolog m) { 
        m.trust(null);
        return $parse_tokens_is_terminator_1_4(m);
    }

    private final static Operation $parse_tokens_is_terminator_1_1(Prolog m) { 
    // '$parse_tokens_is_terminator'(')'):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_terminator'(')'):-[]
        if (!  ATOM_$0029 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_is_terminator_1_2(Prolog m) { 
    // '$parse_tokens_is_terminator'(']'):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_terminator'(']'):-[]
        if (!  ATOM_$005D .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_is_terminator_1_3(Prolog m) { 
    // '$parse_tokens_is_terminator'('}'):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_terminator'('}'):-[]
        if (!  ATOM_$007D .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_is_terminator_1_4(Prolog m) { 
    // '$parse_tokens_is_terminator'('.'):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_terminator'('.'):-[]
        if (!  ATOM_$002E .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $parse_tokens_is_post_in_op/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_is_post_in_op'/1,non-(public))




    public static Operation PRED_$parse_tokens_is_post_in_op_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_is_post_in_op_1_var, fail_0, fail_0, FILE_builtins::$parse_tokens_is_post_in_op_1_con, FILE_builtins::$parse_tokens_is_post_in_op_1_3, fail_0); 
    }

    private final static Operation $parse_tokens_is_post_in_op_1_var(Prolog m) { 
        m.jtry1(null, FILE_builtins::$parse_tokens_is_post_in_op_1_var_1);
        return $parse_tokens_is_post_in_op_1_1(m);
    }

    private final static Operation $parse_tokens_is_post_in_op_1_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_is_post_in_op_1_var_2);
        return $parse_tokens_is_post_in_op_1_2(m);
    }

    private final static Operation $parse_tokens_is_post_in_op_1_var_2(Prolog m) { 
        m.trust(null);
        return $parse_tokens_is_post_in_op_1_3(m);
    }

    private final static Operation $parse_tokens_is_post_in_op_1_con(Prolog m) { 
        m.jtry1(null, FILE_builtins::$parse_tokens_is_post_in_op_1_con_1);
        return $parse_tokens_is_post_in_op_1_1(m);
    }

    private final static Operation $parse_tokens_is_post_in_op_1_con_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_is_post_in_op_1_2(m);
    }

    private final static Operation $parse_tokens_is_post_in_op_1_1(Prolog m) { 
    // '$parse_tokens_is_post_in_op'(','):-!
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_post_in_op'(','):-['$neck_cut']
        if (!  ATOM_$002C .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $parse_tokens_is_post_in_op_1_2(Prolog m) { 
    // '$parse_tokens_is_post_in_op'('|'):-!
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_post_in_op'('|'):-['$neck_cut']
        if (!  ATOM_$007C .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $parse_tokens_is_post_in_op_1_3(Prolog m) { 
    // '$parse_tokens_is_post_in_op'(atom(A)):-current_op(B,C,A),'$parse_tokens_post_in_type'(C),!
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_is_post_in_op'(atom(A)):-['$get_level'(B),current_op(C,D,A),'$parse_tokens_post_in_type'(D),'$cut'(B)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_atom_1 , m.trail, a2)){
                return m.fail();
            }
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_op_3_static_exec, VA(m.DONT_CARE2(), a4, a2), //
 Op(FILE_system::PRED_$parse_tokens_post_in_type_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), cont)));
    }
/** PREDICATE: $parse_tokens_post_in_type/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_post_in_type'/1,non-(public))




    public static Operation PRED_$parse_tokens_post_in_type_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_post_in_type_1_var, fail_0, fail_0, FILE_builtins::$parse_tokens_post_in_type_1_var, fail_0, fail_0); 
    }

    private final static Operation $parse_tokens_post_in_type_1_var(Prolog m) { 
        m.jtry1(null, FILE_builtins::$parse_tokens_post_in_type_1_var_1);
        return $parse_tokens_post_in_type_1_1(m);
    }

    private final static Operation $parse_tokens_post_in_type_1_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_post_in_type_1_var_2);
        return $parse_tokens_post_in_type_1_2(m);
    }

    private final static Operation $parse_tokens_post_in_type_1_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_post_in_type_1_var_3);
        return $parse_tokens_post_in_type_1_3(m);
    }

    private final static Operation $parse_tokens_post_in_type_1_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_post_in_type_1_var_4);
        return $parse_tokens_post_in_type_1_4(m);
    }

    private final static Operation $parse_tokens_post_in_type_1_var_4(Prolog m) { 
        m.trust(null);
        return $parse_tokens_post_in_type_1_5(m);
    }

    private final static Operation $parse_tokens_post_in_type_1_1(Prolog m) { 
    // '$parse_tokens_post_in_type'(xfx):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_post_in_type'(xfx):-[]
        if (!  ATOM_xfx .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_post_in_type_1_2(Prolog m) { 
    // '$parse_tokens_post_in_type'(xfy):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_post_in_type'(xfy):-[]
        if (!  ATOM_xfy .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_post_in_type_1_3(Prolog m) { 
    // '$parse_tokens_post_in_type'(yfx):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_post_in_type'(yfx):-[]
        if (!  ATOM_yfx .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_post_in_type_1_4(Prolog m) { 
    // '$parse_tokens_post_in_type'(xf):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_post_in_type'(xf):-[]
        if (!  ATOM_xf .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_post_in_type_1_5(Prolog m) { 
    // '$parse_tokens_post_in_type'(yf):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_post_in_type'(yf):-[]
        if (!  ATOM_yf .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $parse_tokens_expect/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_expect'/3,non-(public))
    private static final ListTerm L_$parse_tokens_expect_3_s3 = CONS( ATOM_expected ,  Prolog.Nil );




    public static Operation PRED_$parse_tokens_expect_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$parse_tokens_expect_3_sub_1);
        return $parse_tokens_expect_3_1(m);
    }

    private final static Operation $parse_tokens_expect_3_sub_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_expect_3_2(m);
    }

    private final static Operation $parse_tokens_expect_3_1(Prolog m) { 
    // '$parse_tokens_expect'(A,B,C):-'$parse_tokens_skip_spaces'(B,D),D=[A|E],!,C=E
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_expect'(A,B,C):-['$get_level'(D),'$parse_tokens_skip_spaces'(B,E),'$unify'(E,[A|F]),'$cut'(D),'$unify'(C,F)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = CONS(a1, a6);
        return //
 Op(FILE_system::PRED_$parse_tokens_skip_spaces_2_static_exec, VA(a2, a5), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a5, a7), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a3, a6), cont))));
    }

    private final static Operation $parse_tokens_expect_3_2(Prolog m) { 
    // '$parse_tokens_expect'(A,B,C):-'$parse_tokens_error'([A,expected],B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$parse_tokens_expect'(A,B,C):-['$parse_tokens_error'([A,expected],B,C)]
        a4 = CONS(a1, L_$parse_tokens_expect_3_s3);
        return //
 Op(FILE_system::PRED_$parse_tokens_error_3_static_exec, VA(a4, a2, a3), cont);
    }
/** PREDICATE: $parse_tokens_skip_spaces/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_skip_spaces'/2,non-(public))




    public static Operation PRED_$parse_tokens_skip_spaces_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $parse_tokens_skip_spaces_2_top(m);
    }

    private final static Operation $parse_tokens_skip_spaces_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_skip_spaces_2_var, FILE_builtins::$parse_tokens_skip_spaces_2_2, FILE_builtins::$parse_tokens_skip_spaces_2_2, FILE_builtins::$parse_tokens_skip_spaces_2_2, FILE_builtins::$parse_tokens_skip_spaces_2_2, FILE_builtins::$parse_tokens_skip_spaces_2_var); 
    }

    private final static Operation $parse_tokens_skip_spaces_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::$parse_tokens_skip_spaces_2_var_1);
        return $parse_tokens_skip_spaces_2_1(m);
    }

    private final static Operation $parse_tokens_skip_spaces_2_var_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_skip_spaces_2_2(m);
    }

    private final static Operation $parse_tokens_skip_spaces_2_1(Prolog m) { 
    // '$parse_tokens_skip_spaces'([' '|A],B):-(!,C=A),'$parse_tokens_skip_spaces'(C,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$parse_tokens_skip_spaces'([' '|A],B):-['$neck_cut','$unify'(C,A),'$parse_tokens_skip_spaces'(C,B)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        if (!  ATOM_$0020 .unify(a1.car(), m.trail))
                return m.fail();
            a3 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS( ATOM_$0020 , a3), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a4 = m.mkvar1();
        //START inline expansion of $unify(a(4),a(3))
        if (! a4.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
m.cont = cont;
        return $parse_tokens_skip_spaces_2_top(m);
    }

    private final static Operation $parse_tokens_skip_spaces_2_2(Prolog m) { 
    // '$parse_tokens_skip_spaces'(A,A):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$parse_tokens_skip_spaces'(A,A):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $parse_tokens_peep_next/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_peep_next'/3,non-(public))




    public static Operation PRED_$parse_tokens_peep_next_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$parse_tokens_peep_next'(A,B,B):-B=[A|C]
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$parse_tokens_peep_next'(A,B,B):-['$unify'(B,[A|C])]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        a4 = CONS(a1, m.DONT_CARE1());
        //START inline expansion of $unify(a(2),a(4))
        if (! a2.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $parse_tokens_error/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_error'/3,non-(public))




    public static Operation PRED_$parse_tokens_error_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$parse_tokens_error'(A,B,C):-write(user_error,'{SYNTAX ERROR}'),nl(user_error),write(user_error,'** '),'$parse_tokens_write_message'(user_error,A),write(user_error,' **'),nl(user_error),'$parse_tokens_error1'([],B),clause('$tokens'(D),E),'$parse_tokens_error1'(D,B),flush_output(user_error),fail
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$parse_tokens_error'(A,B,C):-[write(user_error,'{SYNTAX ERROR}'),nl(user_error),write(user_error,'** '),'$parse_tokens_write_message'(user_error,A),write(user_error,' **'),nl(user_error),'$parse_tokens_error1'([],B),clause('SxxMachine':'$tokens'(D),E),'$parse_tokens_error1'(D,B),flush_output(user_error),fail]
        a4 = m.mkvar1();
    // put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_$0024tokens_1'),y(1),a(5))
        a5 =  S( FUNCTOR_$0024tokens_1 , a4);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(5)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a5);
 ;
        return //
 Op(FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BSYNTAX$0020ERROR$007D ), //
 Op(FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op(FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$002A$002A$0020 ), //
 Op(FILE_system::PRED_$parse_tokens_write_message_2_static_exec, VA( ATOM_user_error , a1), //
 Op(FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020$002A$002A ), //
 Op(FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op(FILE_system::PRED_$parse_tokens_error1_2_static_exec, VA( Prolog.Nil , a2), //
 Op(FILE_system::PRED_clause_2_static_exec, VA(a6, m.DONT_CARE2()), //
 Op(FILE_system::PRED_$parse_tokens_error1_2_static_exec, VA(a4, a2), //
 Op(FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), fail_0))))))))));
    }
/** PREDICATE: $parse_tokens_error1/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_error1'/2,non-(public))
        final static SymbolTerm ATOM_$002A$002A$0020here$0020$002A$002A = SYM("** here **");




    public static Operation PRED_$parse_tokens_error1_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_error1_2_var, FILE_builtins::$parse_tokens_error1_2_2, FILE_builtins::$parse_tokens_error1_2_2, FILE_builtins::$parse_tokens_error1_2_con, FILE_builtins::$parse_tokens_error1_2_2, FILE_builtins::$parse_tokens_error1_2_lis); 
    }

    private final static Operation $parse_tokens_error1_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::$parse_tokens_error1_2_var_1);
        return $parse_tokens_error1_2_1(m);
    }

    private final static Operation $parse_tokens_error1_2_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_error1_2_var_2);
        return $parse_tokens_error1_2_2(m);
    }

    private final static Operation $parse_tokens_error1_2_var_2(Prolog m) { 
        m.trust(null);
        return $parse_tokens_error1_2_3(m);
    }

    private final static Operation $parse_tokens_error1_2_con(Prolog m) { 
        m.jtry2(null, FILE_builtins::$parse_tokens_error1_2_con_1);
        return $parse_tokens_error1_2_1(m);
    }

    private final static Operation $parse_tokens_error1_2_con_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_error1_2_2(m);
    }

    private final static Operation $parse_tokens_error1_2_lis(Prolog m) { 
        m.jtry2(null, FILE_builtins::$parse_tokens_error1_2_lis_1);
        return $parse_tokens_error1_2_2(m);
    }

    private final static Operation $parse_tokens_error1_2_lis_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_error1_2_3(m);
    }

    private final static Operation $parse_tokens_error1_2_1(Prolog m) { 
    // '$parse_tokens_error1'([],A):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$parse_tokens_error1'([],A):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $parse_tokens_error1_2_2(Prolog m) { 
    // '$parse_tokens_error1'(A,B):-A==B,!,nl(user_error),write(user_error,'** here **'),nl(user_error),'$parse_tokens_error1'(A,[]),nl(user_error)
         Term a1, a2, a3;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$parse_tokens_error1'(A,B):-['$get_level'(C),'$equality_of_term'(A,B),'$cut'(C),nl(user_error),write(user_error,'** here **'),nl(user_error),'$parse_tokens_error1'(A,[]),nl(user_error)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (! a1.equalsTerm(a2)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op(FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$002A$002A$0020here$0020$002A$002A ), //
 Op(FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op(FILE_system::PRED_$parse_tokens_error1_2_static_exec, VA(a1,  Prolog.Nil ), //
 Op(FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), cont)))));
    }

    private final static Operation $parse_tokens_error1_2_3(Prolog m) { 
    // '$parse_tokens_error1'([A|B],C):-'$parse_tokens_error2'(A),'$parse_tokens_error1'(B,C)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$parse_tokens_error1'([A|B],C):-['$parse_tokens_error2'(A),'$parse_tokens_error1'(B,C)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
            a4 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
            a4 = m.mkvar2();
             a1.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_$parse_tokens_error2_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$parse_tokens_error1_2_static_exec, VA(a4, a2), cont));
    }
/** PREDICATE: $parse_tokens_error2/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_error2'/1,non-(public))
        final static SymbolTerm ATOM_$0022 = SYM("\"");




    public static Operation PRED_$parse_tokens_error2_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$parse_tokens_error2_1_var, FILE_builtins::$parse_tokens_error2_1_5, FILE_builtins::$parse_tokens_error2_1_5, FILE_builtins::$parse_tokens_error2_1_5, FILE_builtins::$parse_tokens_error2_1_var, FILE_builtins::$parse_tokens_error2_1_5); 
    }

    private final static Operation $parse_tokens_error2_1_var(Prolog m) { 
        m.jtry1(null, FILE_builtins::$parse_tokens_error2_1_var_1);
        return $parse_tokens_error2_1_1(m);
    }

    private final static Operation $parse_tokens_error2_1_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_error2_1_var_2);
        return $parse_tokens_error2_1_2(m);
    }

    private final static Operation $parse_tokens_error2_1_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_error2_1_var_3);
        return $parse_tokens_error2_1_3(m);
    }

    private final static Operation $parse_tokens_error2_1_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_error2_1_var_4);
        return $parse_tokens_error2_1_4(m);
    }

    private final static Operation $parse_tokens_error2_1_var_4(Prolog m) { 
        m.trust(null);
        return $parse_tokens_error2_1_5(m);
    }

    private final static Operation $parse_tokens_error2_1_1(Prolog m) { 
    // '$parse_tokens_error2'(number(A)):-!,write(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_error2'(number(A)):-['$neck_cut',write(A)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_number_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_write_1_static_exec, VA(a2), cont);
    }

    private final static Operation $parse_tokens_error2_1_2(Prolog m) { 
    // '$parse_tokens_error2'(atom(A)):-!,writeq(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_error2'(atom(A)):-['$neck_cut',writeq(A)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_atom_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_writeq_1_static_exec, VA(a2), cont);
    }

    private final static Operation $parse_tokens_error2_1_3(Prolog m) { 
    // '$parse_tokens_error2'(var(A,B)):-!,write(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_error2'(var(A,B)):-['$neck_cut',write(A)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_var_2 , m.trail, a2, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_write_1_static_exec, VA(a2), cont);
    }

    private final static Operation $parse_tokens_error2_1_4(Prolog m) { 
    // '$parse_tokens_error2'(string(A)):-!,write(user_error,'"'),'$parse_tokens_write_string'(user_error,A),write(user_error,'"')
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_error2'(string(A)):-['$neck_cut',write(user_error,'"'),'$parse_tokens_write_string'(user_error,A),write(user_error,'"')]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_string_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0022 ), //
 Op(FILE_system::PRED_$parse_tokens_write_string_2_static_exec, VA( ATOM_user_error , a2), //
 Op(FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0022 ), cont)));
    }

    private final static Operation $parse_tokens_error2_1_5(Prolog m) { 
    // '$parse_tokens_error2'(A):-write(user_error,A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$parse_tokens_error2'(A):-[write(user_error,A)]
        return //
 Op(FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error , a1), cont);
    }
/** PREDICATE: $parse_tokens_write_string/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_write_string'/2,non-(public))
        final static IntegerTerm int_34 = Integer(34);
    private static final ListTerm L_$parse_tokens_write_string_2_s3 = CONS( int_34 ,  Prolog.Nil );




    public static Operation PRED_$parse_tokens_write_string_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$parse_tokens_write_string_2_sub_1);
        return $parse_tokens_write_string_2_1(m);
    }

    private final static Operation $parse_tokens_write_string_2_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$parse_tokens_write_string_2_sub_2);
        return $parse_tokens_write_string_2_2(m);
    }

    private final static Operation $parse_tokens_write_string_2_sub_2(Prolog m) { 
        m.trust(null);
        return $parse_tokens_write_string_2_3(m);
    }

    private final static Operation $parse_tokens_write_string_2_1(Prolog m) { 
    // '$parse_tokens_write_string'(A,[]):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$parse_tokens_write_string'(A,[]):-[]
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_write_string_2_2(Prolog m) { 
    // '$parse_tokens_write_string'(A,[B|C]):-[B]=[34],!,put_code(A,B),put_code(A,B),'$parse_tokens_write_string'(A,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$parse_tokens_write_string'(A,[B|C]):-['$get_level'(D),'$unify'([B],[34]),'$cut'(D),put_code(A,B),put_code(A,B),'$parse_tokens_write_string'(A,C)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a3 = a2.car();
            a4 = a2.cdr();
        } else if (a2.isVar()){
            a3 = m.mkvar2();
            a4 = m.mkvar2();
             a2.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a6 = CONS(a3,  Prolog.Nil );
        //START inline expansion of $unify(a(6),s(3))
        if (! a6.unify(L_$parse_tokens_write_string_2_s3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(5))
        a5 = a5.dref();
                  m.cut( a5.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_put_code_2_static_exec, VA(a1, a3), //
 Op(FILE_system::PRED_put_code_2_static_exec, VA(a1, a3), //
 Op(FILE_system::PRED_$parse_tokens_write_string_2_static_exec, VA(a1, a4), cont)));
    }

    private final static Operation $parse_tokens_write_string_2_3(Prolog m) { 
    // '$parse_tokens_write_string'(A,[B|C]):-put_code(A,B),'$parse_tokens_write_string'(A,C)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$parse_tokens_write_string'(A,[B|C]):-[put_code(A,B),'$parse_tokens_write_string'(A,C)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a3 = a2.car();
            a4 = a2.cdr();
        } else if (a2.isVar()){
            a3 = m.mkvar2();
            a4 = m.mkvar2();
             a2.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_put_code_2_static_exec, VA(a1, a3), //
 Op(FILE_system::PRED_$parse_tokens_write_string_2_static_exec, VA(a1, a4), cont));
    }
/** PREDICATE: $parse_tokens_write_message/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$parse_tokens_write_message'/2,non-(public))




    public static Operation PRED_$parse_tokens_write_message_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$parse_tokens_write_message_2_sub_1);
        return $parse_tokens_write_message_2_1(m);
    }

    private final static Operation $parse_tokens_write_message_2_sub_1(Prolog m) { 
        m.trust(null);
        return $parse_tokens_write_message_2_2(m);
    }

    private final static Operation $parse_tokens_write_message_2_1(Prolog m) { 
    // '$parse_tokens_write_message'(A,[]):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$parse_tokens_write_message'(A,[]):-[]
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $parse_tokens_write_message_2_2(Prolog m) { 
    // '$parse_tokens_write_message'(A,[B|C]):-write(A,B),write(A,' '),'$parse_tokens_write_message'(A,C)
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$parse_tokens_write_message'(A,[B|C]):-[write(A,B),write(A,' '),'$parse_tokens_write_message'(A,C)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a3 = a2.car();
            a4 = a2.cdr();
        } else if (a2.isVar()){
            a3 = m.mkvar2();
            a4 = m.mkvar2();
             a2.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_write_2_static_exec, VA(a1, a3), //
 Op(FILE_system::PRED_write_2_static_exec, VA(a1,  ATOM_$0020 ), //
 Op(FILE_system::PRED_$parse_tokens_write_message_2_static_exec, VA(a1, a4), cont)));
    }
/** PREDICATE: write/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(write/1,public)
        final static SymbolTerm FUNCTOR_numbervars_1 = F("numbervars",1);
    private static final StructureTerm L_write_1_s4 = S( FUNCTOR_numbervars_1 ,  Prolog.True );
    private static final ListTerm L_write_1_s6 = CONS(L_write_1_s4,  Prolog.Nil );




    public static Operation PRED_write_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // write(A):-current_output(B),write_term(B,A,[numbervars(true)])
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // write(A):-[current_output(B),write_term(B,A,[numbervars(true)])]
        a2 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_output_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_write_term_3_static_exec, VA(a2, a1, L_write_1_s6), cont));
    }
/** PREDICATE: write/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(write/2,public)
    private static final StructureTerm L_write_2_s4 = S( FUNCTOR_numbervars_1 ,  Prolog.True );
    private static final ListTerm L_write_2_s6 = CONS(L_write_2_s4,  Prolog.Nil );




    public static Operation PRED_write_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // write(A,B):-write_term(A,B,[numbervars(true)])
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // write(A,B):-[write_term(A,B,[numbervars(true)])]
        return //
 Op(FILE_system::PRED_write_term_3_static_exec, VA(a1, a2, L_write_2_s6), cont);
    }
/** PREDICATE: writeq/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(writeq/1,public)
        final static SymbolTerm FUNCTOR_quoted_1 = F("quoted",1);
    private static final StructureTerm L_writeq_1_s4 = S( FUNCTOR_quoted_1 ,  Prolog.True );
    private static final StructureTerm L_writeq_1_s6 = S( FUNCTOR_numbervars_1 ,  Prolog.True );
    private static final ListTerm L_writeq_1_s8 = CONS(L_writeq_1_s6,  Prolog.Nil );
    private static final ListTerm L_writeq_1_s9 = CONS(L_writeq_1_s4, L_writeq_1_s8);




    public static Operation PRED_writeq_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // writeq(A):-current_output(B),write_term(B,A,[quoted(true),numbervars(true)])
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // writeq(A):-[current_output(B),write_term(B,A,[quoted(true),numbervars(true)])]
        a2 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_output_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_write_term_3_static_exec, VA(a2, a1, L_writeq_1_s9), cont));
    }
/** PREDICATE: writeq/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(writeq/2,public)
    private static final StructureTerm L_writeq_2_s4 = S( FUNCTOR_quoted_1 ,  Prolog.True );
    private static final StructureTerm L_writeq_2_s6 = S( FUNCTOR_numbervars_1 ,  Prolog.True );
    private static final ListTerm L_writeq_2_s8 = CONS(L_writeq_2_s6,  Prolog.Nil );
    private static final ListTerm L_writeq_2_s9 = CONS(L_writeq_2_s4, L_writeq_2_s8);




    public static Operation PRED_writeq_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // writeq(A,B):-write_term(A,B,[quoted(true),numbervars(true)])
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // writeq(A,B):-[write_term(A,B,[quoted(true),numbervars(true)])]
        return //
 Op(FILE_system::PRED_write_term_3_static_exec, VA(a1, a2, L_writeq_2_s9), cont);
    }
/** PREDICATE: write_canonical/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(write_canonical/1,public)
    private static final StructureTerm L_write_canonical_1_s4 = S( FUNCTOR_quoted_1 ,  Prolog.True );
        final static SymbolTerm FUNCTOR_ignore_ops_1 = F("ignore_ops",1);
    private static final StructureTerm L_write_canonical_1_s6 = S( FUNCTOR_ignore_ops_1 ,  Prolog.True );
    private static final ListTerm L_write_canonical_1_s8 = CONS(L_write_canonical_1_s6,  Prolog.Nil );
    private static final ListTerm L_write_canonical_1_s9 = CONS(L_write_canonical_1_s4, L_write_canonical_1_s8);




    public static Operation PRED_write_canonical_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // write_canonical(A):-current_output(B),write_term(B,A,[quoted(true),ignore_ops(true)])
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // write_canonical(A):-[current_output(B),write_term(B,A,[quoted(true),ignore_ops(true)])]
        a2 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_output_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_write_term_3_static_exec, VA(a2, a1, L_write_canonical_1_s9), cont));
    }
/** PREDICATE: write_canonical/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(write_canonical/2,public)
    private static final StructureTerm L_write_canonical_2_s4 = S( FUNCTOR_quoted_1 ,  Prolog.True );
    private static final StructureTerm L_write_canonical_2_s6 = S( FUNCTOR_ignore_ops_1 ,  Prolog.True );
    private static final ListTerm L_write_canonical_2_s8 = CONS(L_write_canonical_2_s6,  Prolog.Nil );
    private static final ListTerm L_write_canonical_2_s9 = CONS(L_write_canonical_2_s4, L_write_canonical_2_s8);




    public static Operation PRED_write_canonical_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // write_canonical(A,B):-write_term(A,B,[quoted(true),ignore_ops(true)])
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // write_canonical(A,B):-[write_term(A,B,[quoted(true),ignore_ops(true)])]
        return //
 Op(FILE_system::PRED_write_term_3_static_exec, VA(a1, a2, L_write_canonical_2_s9), cont);
    }
/** PREDICATE: write_term/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(write_term/2,public)




    public static Operation PRED_write_term_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // write_term(A,B):-current_output(C),write_term(C,A,B)
        m.setB0();
         Term a1, a2, a3;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // write_term(A,B):-[current_output(C),write_term(C,A,B)]
        a3 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_output_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_write_term_3_static_exec, VA(a3, a1, a2), cont));
    }
/** PREDICATE: write_term/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(write_term/3,public)




    public static Operation PRED_write_term_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::write_term_3_sub_1);
        return write_term_3_1(m);
    }

    private final static Operation write_term_3_sub_1(Prolog m) { 
        m.trust(null);
        return write_term_3_2(m);
    }

    private final static Operation write_term_3_1(Prolog m) { 
    // write_term(A,B,C):-'$write_term'(A,B,C),fail
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // write_term(A,B,C):-['$write_term'(A,B,C),fail]
        return //
 Op(FILE_system::PRED_$write_term_3_static_exec, VA(a1, a2, a3), fail_0);
    }

    private final static Operation write_term_3_2(Prolog m) { 
    // write_term(A,B,C):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // write_term(A,B,C):-[]
        return cont;
    }
/** PREDICATE: $write_term/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_term'/3,non-(public))
        final static IntegerTerm int_1200 = Integer(1200);
        final static SymbolTerm ATOM_punct = SYM("punct");




    public static Operation PRED_$write_term_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$write_term'(A,B,C):-'$write_term0'(B,1200,punct,D,C,A),!
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // '$write_term'(A,B,C):-['$get_level'(D),'$write_term0'(B,1200,punct,E,C,A),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a2,  int_1200 ,  ATOM_punct , m.DONT_CARE2(), a3, a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), cont));
    }
/** PREDICATE: $write_term0/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_term0'/6,non-(public))
        final static SymbolTerm ATOM_alpha = SYM("alpha");
        final static SymbolTerm FUNCTOR_$0024VAR_1 = F("$VAR",1);
    private static final StructureTerm L_$write_term0_6_s7 = S( FUNCTOR_numbervars_1 ,  Prolog.True );
        final static SymbolTerm ATOM_symbol = SYM("symbol");

    // private final Term arg5, arg6;




    public static Operation PRED_$write_term0_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_builtins::$write_term0_6_sub_1);
        return $write_term0_6_1(m);
    }

    private final static Operation $write_term0_6_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term0_6_sub_2);
        return $write_term0_6_2(m);
    }

    private final static Operation $write_term0_6_sub_2(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term0_6_sub_3);
        return $write_term0_6_3(m);
    }

    private final static Operation $write_term0_6_sub_3(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term0_6_sub_4);
        return $write_term0_6_4(m);
    }

    private final static Operation $write_term0_6_sub_4(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term0_6_sub_5);
        return $write_term0_6_5(m);
    }

    private final static Operation $write_term0_6_sub_5(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term0_6_sub_6);
        return $write_term0_6_6(m);
    }

    private final static Operation $write_term0_6_sub_6(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term0_6_sub_7);
        return $write_term0_6_7(m);
    }

    private final static Operation $write_term0_6_sub_7(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term0_6_sub_8);
        return $write_term0_6_8(m);
    }

    private final static Operation $write_term0_6_sub_8(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term0_6_sub_9);
        return $write_term0_6_9(m);
    }

    private final static Operation $write_term0_6_sub_9(Prolog m) { 
        m.trust(null);
        return $write_term0_6_10(m);
    }

    private final static Operation $write_term0_6_1(Prolog m) { 
    // '$write_term0'(A,B,C,alpha,D,E):-var(A),!,'$write_space_if_needed'(C,alpha,E),'$fast_write'(E,A)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$write_term0'(A,B,C,alpha,D,E):-['$get_level'(F),var(A),'$cut'(F),'$write_space_if_needed'(C,alpha,E),'$fast_write'(E,A)]
        if (!  ATOM_alpha .unify(a4, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a3,  ATOM_alpha , a6), //
 Op(FILE_system::PRED_$fast_write_2_static_exec, VA(a6, a1), cont));
    }

    private final static Operation $write_term0_6_2(Prolog m) { 
    // '$write_term0'(A,B,C,alpha,D,E):-java(A),!,'$write_space_if_needed'(C,alpha,E),'$fast_write'(E,A)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$write_term0'(A,B,C,alpha,D,E):-['$get_level'(F),java(A),'$cut'(F),'$write_space_if_needed'(C,alpha,E),'$fast_write'(E,A)]
        if (!  ATOM_alpha .unify(a4, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of java(a(1))
        a1 = a1.dref();
        if (! (a1 .isFFIObject())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a3,  ATOM_alpha , a6), //
 Op(FILE_system::PRED_$fast_write_2_static_exec, VA(a6, a1), cont));
    }

    private final static Operation $write_term0_6_3(Prolog m) { 
    // '$write_term0'(A,B,C,alpha,D,E):-A='$VAR'(F),integer(F),F>=0,'$builtin_member'(numbervars(true),D),!,'$write_space_if_needed'(C,alpha,E),'$write_VAR'(F,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$write_term0'(A,B,C,alpha,D,E):-['$get_level'(F),'$unify'(A,'$VAR'(G)),integer(G),H is 0,'$greater_or_equal'(G,H),'$builtin_member'(numbervars(true),D),'$cut'(F),'$write_space_if_needed'(C,alpha,E),'$write_VAR'(G,E)]
        if (!  ATOM_alpha .unify(a4, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
    // put_str_args([a(8)],y(1)),put_str(@('FUNCTOR_$0024VAR_1'),y(1),a(9))
        a9 =  S( FUNCTOR_$0024VAR_1 , a8);
 ;
        //START inline expansion of $unify(a(1),a(9))
        if (! a1.unify(a9, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of integer(a(8))
        a8 = a8.dref();
        if (! (a8 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        //START inline expansion of a(10)is@(int_0)
        if (! a10.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_or_equal(a(8),a(10))
        if (Arithmetic.evaluate(a8).arithCompareTo(Arithmetic.evaluate(a10)) < 0) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$builtin_member_2_static_exec, VA(L_$write_term0_6_s7, a5), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a7), //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a3,  ATOM_alpha , a6), //
 Op(FILE_system::PRED_$write_VAR_2_static_exec, VA(a8, a6), cont))));
    }

    private final static Operation $write_term0_6_4(Prolog m) { 
    // '$write_term0'(A,B,C,alpha,D,E):-number(A),A<0,!,'$write_space_if_needed'(C,symbol,E),'$fast_write'(E,A)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$write_term0'(A,B,C,alpha,D,E):-['$get_level'(F),number(A),G is 0,'$less_than'(A,G),'$cut'(F),'$write_space_if_needed'(C,symbol,E),'$fast_write'(E,A)]
        if (!  ATOM_alpha .unify(a4, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of number(a(1))
        a1 = a1.dref();
        if (! a1.isNumber()) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        //START inline expansion of a(8)is@(int_0)
        if (! a8.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_than(a(1),a(8))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a8)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a3,  ATOM_symbol , a6), //
 Op(FILE_system::PRED_$fast_write_2_static_exec, VA(a6, a1), cont));
    }

    private final static Operation $write_term0_6_5(Prolog m) { 
    // '$write_term0'(A,B,C,alpha,D,E):-number(A),!,'$write_space_if_needed'(C,alpha,E),'$fast_write'(E,A)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$write_term0'(A,B,C,alpha,D,E):-['$get_level'(F),number(A),'$cut'(F),'$write_space_if_needed'(C,alpha,E),'$fast_write'(E,A)]
        if (!  ATOM_alpha .unify(a4, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of number(a(1))
        a1 = a1.dref();
        if (! a1.isNumber()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a3,  ATOM_alpha , a6), //
 Op(FILE_system::PRED_$fast_write_2_static_exec, VA(a6, a1), cont));
    }

    private final static Operation $write_term0_6_6(Prolog m) { 
    // '$write_term0'(A,B,C,D,E,F):-atom(A),!,'$write_atom'(A,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$write_term0'(A,B,C,D,E,F):-['$get_level'(G),atom(A),'$cut'(G),'$write_atom'(A,C,D,E,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$write_atom_5_static_exec, VA(a1, a3, a4, a5, a6), cont);
    }

    private final static Operation $write_term0_6_7(Prolog m) { 
    // '$write_term0'(A,B,C,D,E,F):-'$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(E),'$write_is_operator'(A,G,H,I),!,'$write_term_op'(G,I,H,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$write_term0'(A,B,C,D,E,F):-['$get_level'(G),'$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(E),'$write_is_operator'(A,H,I,J),'$cut'(G),'$write_term_op'(H,J,I,B,C,D,E,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_$write_is_operator_4_static_exec, VA(a1, a8, a9, a10), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a7), //
 Op(FILE_system::PRED_$write_term_op_8_static_exec, VA(a8, a10, a9, a2, a3, a4, a5, a6), cont))));
    }

    private final static Operation $write_term0_6_8(Prolog m) { 
    // '$write_term0'(A,B,C,punct,D,E):-A=[F|G],'$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(D),!,'$write_space_if_needed'(C,punct,E),put_char(E,'['),'$write_term_list_args'(A,punct,H,D,E),put_char(E,']')
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$write_term0'(A,B,C,punct,D,E):-['$get_level'(F),'$unify'(A,[G|H]),'$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(D),'$cut'(F),'$write_space_if_needed'(C,punct,E),put_char(E,'['),'$write_term_list_args'(A,punct,I,D,E),put_char(E,']')]
        if (!  ATOM_punct .unify(a4, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = CONS(m.DONT_CARE1(), m.DONT_CARE1());
        //START inline expansion of $unify(a(1),a(8))
        if (! a1.unify(a8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a7), //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a3,  ATOM_punct , a6), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a6,  ATOM_$005B ), //
 Op(FILE_system::PRED_$write_term_list_args_5_static_exec, VA(a1,  ATOM_punct , m.DONT_CARE2(), a5, a6), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a6,  ATOM_$005D ), cont))))));
    }

    private final static Operation $write_term0_6_9(Prolog m) { 
    // '$write_term0'(A,B,C,D,E,F):-A={G},'$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(E),!,'$write_space_if_needed'(C,punct,F),put_char(F,'{'),'$write_term0'(G,1200,punct,H,E,F),put_char(F,'}')
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$write_term0'(A,B,C,D,E,F):-['$get_level'(G),'$unify'(A,{H}),'$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(E),'$cut'(G),'$write_space_if_needed'(C,punct,F),put_char(F,'{'),'$write_term0'(H,1200,punct,I,E,F),put_char(F,'}')]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
    // put_str_args([a(8)],y(1)),put_str(@('FUNCTOR_$007B$007D_1'),y(1),a(9))
        a9 =  S( FUNCTOR_$007B$007D_1 , a8);
 ;
        //START inline expansion of $unify(a(1),a(9))
        if (! a1.unify(a9, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a7), //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a3,  ATOM_punct , a6), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a6,  ATOM_$007B ), //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a8,  int_1200 ,  ATOM_punct , m.DONT_CARE2(), a5, a6), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a6,  ATOM_$007D ), cont))))));
    }

    private final static Operation $write_term0_6_10(Prolog m) { 
    // '$write_term0'(A,B,C,punct,D,E):-A=..[F|G],'$write_atom'(F,C,H,D,E),put_char(E,'('),'$write_term_args'(G,punct,I,D,E),put_char(E,')')
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$write_term0'(A,B,C,punct,D,E):-['$univ'(A,[F|G]),'$write_atom'(F,C,H,D,E),put_char(E,'('),'$write_term_args'(G,punct,I,D,E),put_char(E,')')]
        if (!  ATOM_punct .unify(a4, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = CONS(a7, a8);
        return //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a1, a9), //
 Op(FILE_system::PRED_$write_atom_5_static_exec, VA(a7, a3, m.DONT_CARE2(), a5, a6), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a6,  ATOM_$0028 ), //
 Op(FILE_system::PRED_$write_term_args_5_static_exec, VA(a8,  ATOM_punct , m.DONT_CARE2(), a5, a6), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a6,  ATOM_$0029 ), cont)))));
    }
/** PREDICATE: $dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))
    private static final StructureTerm L_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_s4 = S( FUNCTOR_ignore_ops_1 ,  Prolog.True );




    public static Operation PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-'$builtin_member'(ignore_ops(true),A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),'$builtin_member'(ignore_ops(true),A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$builtin_member_2_static_exec, VA(L_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_s4, a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))
    private static final StructureTerm L_$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_s4 = S( FUNCTOR_ignore_ops_1 ,  Prolog.True );




    public static Operation PRED_$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-'$builtin_member'(ignore_ops(true),A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),'$builtin_member'(ignore_ops(true),A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$builtin_member_2_static_exec, VA(L_$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_s4, a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))
    private static final StructureTerm L_$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_s4 = S( FUNCTOR_ignore_ops_1 ,  Prolog.True );




    public static Operation PRED_$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-'$builtin_member'(ignore_ops(true),A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),'$builtin_member'(ignore_ops(true),A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$builtin_member_2_static_exec, VA(L_$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_s4, a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $write_space_if_needed/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_space_if_needed'/3,non-(public))
        final static SymbolTerm ATOM_other = SYM("other");




    public static Operation PRED_$write_space_if_needed_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$write_space_if_needed_3_var, FILE_builtins::$write_space_if_needed_3_int, FILE_builtins::$write_space_if_needed_3_int, FILE_builtins::$write_space_if_needed_3_var, FILE_builtins::$write_space_if_needed_3_int, FILE_builtins::$write_space_if_needed_3_int); 
    }

    private final static Operation $write_space_if_needed_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$write_space_if_needed_3_var_1);
        return $write_space_if_needed_3_1(m);
    }

    private final static Operation $write_space_if_needed_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$write_space_if_needed_3_var_2);
        return $write_space_if_needed_3_2(m);
    }

    private final static Operation $write_space_if_needed_3_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$write_space_if_needed_3_var_3);
        return $write_space_if_needed_3_3(m);
    }

    private final static Operation $write_space_if_needed_3_var_3(Prolog m) { 
        m.trust(null);
        return $write_space_if_needed_3_4(m);
    }

    private final static Operation $write_space_if_needed_3_int(Prolog m) { 
        m.jtry3(null, FILE_builtins::$write_space_if_needed_3_int_1);
        return $write_space_if_needed_3_2(m);
    }

    private final static Operation $write_space_if_needed_3_int_1(Prolog m) { 
        m.trust(null);
        return $write_space_if_needed_3_4(m);
    }

    private final static Operation $write_space_if_needed_3_1(Prolog m) { 
    // '$write_space_if_needed'(punct,A,B):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$write_space_if_needed'(punct,A,B):-['$neck_cut']
        if (!  ATOM_punct .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $write_space_if_needed_3_2(Prolog m) { 
    // '$write_space_if_needed'(A,A,B):-!,put_char(B,' ')
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$write_space_if_needed'(A,A,B):-['$neck_cut',put_char(B,' ')]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a3,  ATOM_$0020 ), cont);
    }

    private final static Operation $write_space_if_needed_3_3(Prolog m) { 
    // '$write_space_if_needed'(other,alpha,A):-!,put_char(A,' ')
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$write_space_if_needed'(other,alpha,A):-['$neck_cut',put_char(A,' ')]
        if (!  ATOM_other .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_alpha .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a3,  ATOM_$0020 ), cont);
    }

    private final static Operation $write_space_if_needed_3_4(Prolog m) { 
    // '$write_space_if_needed'(A,B,C):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$write_space_if_needed'(A,B,C):-[]
        return cont;
    }
/** PREDICATE: $write_VAR/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_VAR'/2,non-(public))
        final static IntegerTerm int_26 = Integer(26);
        final static SymbolTerm FUNCTOR_mod_2 = F("mod",2);
    private static final ListTerm L_$write_VAR_2_s6 = CONS( int_65 ,  Prolog.Nil );
        final static SymbolTerm FUNCTOR_$002F$002F_2 = F("//",2);




    public static Operation PRED_$write_VAR_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$write_VAR_2_sub_1);
        return $write_VAR_2_1(m);
    }

    private final static Operation $write_VAR_2_sub_1(Prolog m) { 
        m.trust(null);
        return $write_VAR_2_2(m);
    }

    private final static Operation $write_VAR_2_1(Prolog m) { 
    // '$write_VAR'(A,B):-A<26,!,C is A mod 26+[65],put_code(B,C)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_VAR'(A,B):-['$get_level'(C),D is 26,'$less_than'(A,D),'$cut'(C),E is A mod 26+[65],put_code(B,E)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        //START inline expansion of a(4)is@(int_26)
        if (! a4.unify(Arithmetic.evaluate(int_26), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_than(a(1),a(4))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a4)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        a5 = m.mkvar1();
    // put_str_args([a(1),@(int_26)],y(1)),put_str(@('FUNCTOR_mod_2'),y(1),a(6))
        a6 =  S( FUNCTOR_mod_2 , a1,  int_26 );
 ;
    // put_str_args([a(6),s(6)],y(2)),put_str(@('FUNCTOR_$002B_2'),y(2),a(7))
        a7 =  S( FUNCTOR_$002B_2 , a6, L_$write_VAR_2_s6);
 ;
        //START inline expansion of a(5)is a(7)
        if (! a5.unify(Arithmetic.evaluate(a7), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_put_code_2_static_exec, VA(a2, a5), cont);
    }

    private final static Operation $write_VAR_2_2(Prolog m) { 
    // '$write_VAR'(A,B):-C is A mod 26+[65],put_code(B,C),D is A//26,'$fast_write'(B,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_VAR'(A,B):-[C is A mod 26+[65],put_code(B,C),D is A//26,'$fast_write'(B,D)]
        a3 = m.mkvar1();
    // put_str_args([a(1),@(int_26)],y(1)),put_str(@('FUNCTOR_mod_2'),y(1),a(4))
        a4 =  S( FUNCTOR_mod_2 , a1,  int_26 );
 ;
    // put_str_args([a(4),s(6)],y(2)),put_str(@('FUNCTOR_$002B_2'),y(2),a(5))
        a5 =  S( FUNCTOR_$002B_2 , a4, L_$write_VAR_2_s6);
 ;
        //START inline expansion of a(3)is a(5)
        if (! a3.unify(Arithmetic.evaluate(a5), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a6 = m.mkvar1();
    // put_str_args([a(1),@(int_26)],y(3)),put_str(@('FUNCTOR_$002F$002F_2'),y(3),a(7))
        a7 =  S( FUNCTOR_$002F$002F_2 , a1,  int_26 );
 ;
        return //
 Op(FILE_system::PRED_put_code_2_static_exec, VA(a2, a3), //
 Op(FILE_builtins::PRED_is_2_static_exec, VA(a6, a7), //
 Op(FILE_system::PRED_$fast_write_2_static_exec, VA(a2, a6), cont)));
    }
/** PREDICATE: $write_atom/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_atom'/5,non-(public))
    private static final StructureTerm L_$write_atom_5_s4 = S( FUNCTOR_quoted_1 ,  Prolog.True );

    // private final Term arg5;




    public static Operation PRED_$write_atom_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_builtins::$write_atom_5_sub_1);
        return $write_atom_5_1(m);
    }

    private final static Operation $write_atom_5_sub_1(Prolog m) { 
        m.trust(null);
        return $write_atom_5_2(m);
    }

    private final static Operation $write_atom_5_1(Prolog m) { 
    // '$write_atom'(A,B,C,D,E):-'$builtin_member'(quoted(true),D),!,'$atom_type'(A,C),'$write_space_if_needed'(B,C,E),'$fast_writeq'(E,A)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$write_atom'(A,B,C,D,E):-['$get_level'(F),'$builtin_member'(quoted(true),D),'$cut'(F),'$atom_type'(A,C),'$write_space_if_needed'(B,C,E),'$fast_writeq'(E,A)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$builtin_member_2_static_exec, VA(L_$write_atom_5_s4, a4), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a6), //
 Op(FILE_system::PRED_$atom_type_2_static_exec, VA(a1, a3), //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a2, a3, a5), //
 Op(FILE_system::PRED_$fast_writeq_2_static_exec, VA(a5, a1), cont)))));
    }

    private final static Operation $write_atom_5_2(Prolog m) { 
    // '$write_atom'(A,B,C,D,E):-'$atom_type'(A,C),'$write_space_if_needed'(B,C,E),'$fast_write'(E,A)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$write_atom'(A,B,C,D,E):-['$atom_type'(A,C),'$write_space_if_needed'(B,C,E),'$fast_write'(E,A)]
        return //
 Op(FILE_system::PRED_$atom_type_2_static_exec, VA(a1, a3), //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a2, a3, a5), //
 Op(FILE_system::PRED_$fast_write_2_static_exec, VA(a5, a1), cont)));
    }
/** PREDICATE: $atom_type/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$atom_type'/2,non-(public))




    public static Operation PRED_$atom_type_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$atom_type_2_sub_1);
        return $atom_type_2_1(m);
    }

    private final static Operation $atom_type_2_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$atom_type_2_sub_2);
        return $atom_type_2_2(m);
    }

    private final static Operation $atom_type_2_sub_2(Prolog m) { 
        m.retry(null, FILE_builtins::$atom_type_2_sub_3);
        return $atom_type_2_3(m);
    }

    private final static Operation $atom_type_2_sub_3(Prolog m) { 
        m.trust(null);
        return $atom_type_2_4(m);
    }

    private final static Operation $atom_type_2_1(Prolog m) { 
    // '$atom_type'(A,alpha):-'$atom_type0'(A,0),!
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$atom_type'(A,alpha):-['$get_level'(B),'$atom_type0'(A,0),'$cut'(B)]
        if (!  ATOM_alpha .unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$atom_type0_2_static_exec, VA(a1,  int_0 ), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation $atom_type_2_2(Prolog m) { 
    // '$atom_type'(A,symbol):-'$atom_type0'(A,1),!
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$atom_type'(A,symbol):-['$get_level'(B),'$atom_type0'(A,1),'$cut'(B)]
        if (!  ATOM_symbol .unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$atom_type0_2_static_exec, VA(a1,  int_1 ), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation $atom_type_2_3(Prolog m) { 
    // '$atom_type'(A,punct):-'$atom_type0'(A,2),!
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$atom_type'(A,punct):-['$get_level'(B),'$atom_type0'(A,2),'$cut'(B)]
        if (!  ATOM_punct .unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$atom_type0_2_static_exec, VA(a1,  int_2 ), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation $atom_type_2_4(Prolog m) { 
    // '$atom_type'(A,other):-'$atom_type0'(A,3),!
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$atom_type'(A,other):-['$get_level'(B),'$atom_type0'(A,3),'$cut'(B)]
        if (!  ATOM_other .unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$atom_type0_2_static_exec, VA(a1,  int_3 ), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), cont));
    }
/** PREDICATE: $write_is_operator/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_is_operator'/4,non-(public))




    public static Operation PRED_$write_is_operator_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$write_is_operator'(A,B,C,D):-functor(A,B,E),'$write_op_type'(E,D),current_op(F,D,B),A=..[G|C],!
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // '$write_is_operator'(A,B,C,D):-['$get_level'(E),functor(A,B,F),'$write_op_type'(F,D),current_op(G,D,B),'$univ'(A,[H|C]),'$cut'(E)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a6 = m.mkvar1();
        a7 = CONS(m.DONT_CARE1(), a3);
        return //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a1, a2, a6), //
 Op(FILE_system::PRED_$write_op_type_2_static_exec, VA(a6, a4), //
 Op(FILE_system::PRED_current_op_3_static_exec, VA(m.DONT_CARE2(), a4, a2), //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a1, a7), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a5), cont)))));
    }
/** PREDICATE: $write_op_type/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_op_type'/2,non-(public))




    public static Operation PRED_$write_op_type_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$write_op_type_2_var, FILE_builtins::$write_op_type_2_var, fail_0, fail_0, fail_0, fail_0); 
    }

    private final static Operation $write_op_type_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::$write_op_type_2_var_1);
        return $write_op_type_2_1(m);
    }

    private final static Operation $write_op_type_2_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$write_op_type_2_var_2);
        return $write_op_type_2_2(m);
    }

    private final static Operation $write_op_type_2_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$write_op_type_2_var_3);
        return $write_op_type_2_3(m);
    }

    private final static Operation $write_op_type_2_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$write_op_type_2_var_4);
        return $write_op_type_2_4(m);
    }

    private final static Operation $write_op_type_2_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$write_op_type_2_var_5);
        return $write_op_type_2_5(m);
    }

    private final static Operation $write_op_type_2_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$write_op_type_2_var_6);
        return $write_op_type_2_6(m);
    }

    private final static Operation $write_op_type_2_var_6(Prolog m) { 
        m.trust(null);
        return $write_op_type_2_7(m);
    }

    private final static Operation $write_op_type_2_1(Prolog m) { 
    // '$write_op_type'(1,fx):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_op_type'(1,fx):-[]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_fx .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $write_op_type_2_2(Prolog m) { 
    // '$write_op_type'(1,fy):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_op_type'(1,fy):-[]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_fy .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $write_op_type_2_3(Prolog m) { 
    // '$write_op_type'(1,xf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_op_type'(1,xf):-[]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_xf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $write_op_type_2_4(Prolog m) { 
    // '$write_op_type'(1,yf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_op_type'(1,yf):-[]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_yf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $write_op_type_2_5(Prolog m) { 
    // '$write_op_type'(2,xfx):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_op_type'(2,xfx):-[]
        if (!  int_2 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_xfx .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $write_op_type_2_6(Prolog m) { 
    // '$write_op_type'(2,xfy):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_op_type'(2,xfy):-[]
        if (!  int_2 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_xfy .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $write_op_type_2_7(Prolog m) { 
    // '$write_op_type'(2,yfx):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_op_type'(2,yfx):-[]
        if (!  int_2 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_yfx .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $write_term_op/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_term_op'/8,non-(public))

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_$write_term_op_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_builtins::$write_term_op_8_sub_1);
        return $write_term_op_8_1(m);
    }

    private final static Operation $write_term_op_8_sub_1(Prolog m) { 
        m.trust(null);
        return $write_term_op_8_2(m);
    }

    private final static Operation $write_term_op_8_1(Prolog m) { 
    // '$write_term_op'(A,B,C,D,E,punct,F,G):-current_op(H,B,A),H>D,!,'$write_space_if_needed'(E,punct,G),put_char(G,'('),'$write_term_op1'(A,B,C,H,punct,I,F,G),put_char(G,')')
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$write_term_op'(A,B,C,D,E,punct,F,G):-['$get_level'(H),current_op(I,B,A),'$greater_than'(I,D),'$cut'(H),'$write_space_if_needed'(E,punct,G),put_char(G,'('),'$write_term_op1'(A,B,C,I,punct,J,F,G),put_char(G,')')]
        if (!  ATOM_punct .unify(a6, m.trail))
            return m.fail();
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_op_3_static_exec, VA(a10, a2, a1), //
 Op(FILE_system::PRED_$greater_than_2_static_exec, VA(a10, a4), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a9), //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a5,  ATOM_punct , a8), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a8,  ATOM_$0028 ), //
 Op(FILE_system::PRED_$write_term_op1_8_static_exec, VA(a1, a2, a3, a10,  ATOM_punct , m.DONT_CARE2(), a7, a8), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a8,  ATOM_$0029 ), cont)))))));
    }

    private final static Operation $write_term_op_8_2(Prolog m) { 
    // '$write_term_op'(A,B,C,D,E,F,G,H):-current_op(I,B,A),'$write_term_op1'(A,B,C,I,E,F,G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$write_term_op'(A,B,C,D,E,F,G,H):-[current_op(I,B,A),'$write_term_op1'(A,B,C,I,E,F,G,H)]
        a9 = m.mkvar1();
        return //
 Op(FILE_system::PRED_current_op_3_static_exec, VA(a9, a2, a1), //
 Op(FILE_system::PRED_$write_term_op1_8_static_exec, VA(a1, a2, a3, a9, a5, a6, a7, a8), cont));
    }
/** PREDICATE: $write_term_op1/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_term_op1'/8,non-(public))

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_$write_term_op1_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_builtins::$write_term_op1_8_sub_1);
        return $write_term_op1_8_1(m);
    }

    private final static Operation $write_term_op1_8_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term_op1_8_sub_2);
        return $write_term_op1_8_2(m);
    }

    private final static Operation $write_term_op1_8_sub_2(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term_op1_8_sub_3);
        return $write_term_op1_8_3(m);
    }

    private final static Operation $write_term_op1_8_sub_3(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term_op1_8_sub_4);
        return $write_term_op1_8_4(m);
    }

    private final static Operation $write_term_op1_8_sub_4(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term_op1_8_sub_5);
        return $write_term_op1_8_5(m);
    }

    private final static Operation $write_term_op1_8_sub_5(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term_op1_8_sub_6);
        return $write_term_op1_8_6(m);
    }

    private final static Operation $write_term_op1_8_sub_6(Prolog m) { 
        m.trust(null);
        return $write_term_op1_8_7(m);
    }

    private final static Operation $write_term_op1_8_1(Prolog m) { 
    // '$write_term_op1'(A,fx,[B],C,D,E,F,G):-!,'$write_atom'(A,D,H,F,G),I is C-1,'$write_term0'(B,I,H,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$write_term_op1'(A,fx,[B],C,D,E,F,G):-['$neck_cut','$write_atom'(A,D,H,F,G),I is C-1,'$write_term0'(B,I,H,E,F,G)]
        if (!  ATOM_fx .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a9 = a3.car();
            if (!  Prolog.Nil .unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
            a9 = m.mkvar2();
             a3.bind(CONS(a9,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a10 = m.mkvar1();
        a11 = m.mkvar1();
    // put_str_args([a(4),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(12))
        a12 =  S( FUNCTOR_$002D_2 , a4,  int_1 );
 ;
        return //
 Op(FILE_system::PRED_$write_atom_5_static_exec, VA(a1, a5, a10, a7, a8), //
 Op(FILE_builtins::PRED_is_2_static_exec, VA(a11, a12), //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a9, a11, a10, a6, a7, a8), cont)));
    }

    private final static Operation $write_term_op1_8_2(Prolog m) { 
    // '$write_term_op1'(A,fy,[B],C,D,E,F,G):-!,'$write_atom'(A,D,H,F,G),I is C,'$write_term0'(B,I,H,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$write_term_op1'(A,fy,[B],C,D,E,F,G):-['$neck_cut','$write_atom'(A,D,H,F,G),I is C,'$write_term0'(B,I,H,E,F,G)]
        if (!  ATOM_fy .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a9 = a3.car();
            if (!  Prolog.Nil .unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
            a9 = m.mkvar2();
             a3.bind(CONS(a9,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$write_atom_5_static_exec, VA(a1, a5, a10, a7, a8), //
 Op(FILE_builtins::PRED_is_2_static_exec, VA(a11, a4), //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a9, a11, a10, a6, a7, a8), cont)));
    }

    private final static Operation $write_term_op1_8_3(Prolog m) { 
    // '$write_term_op1'(A,xf,[B],C,D,E,F,G):-!,H is C-1,'$write_term0'(B,H,D,I,F,G),'$write_atom'(A,I,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$write_term_op1'(A,xf,[B],C,D,E,F,G):-['$neck_cut',H is C-1,'$write_term0'(B,H,D,I,F,G),'$write_atom'(A,I,E,F,G)]
        if (!  ATOM_xf .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a9 = a3.car();
            if (!  Prolog.Nil .unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
            a9 = m.mkvar2();
             a3.bind(CONS(a9,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a10 = m.mkvar1();
    // put_str_args([a(4),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(11))
        a11 =  S( FUNCTOR_$002D_2 , a4,  int_1 );
 ;
        //START inline expansion of a(10)is a(11)
        if (! a10.unify(Arithmetic.evaluate(a11), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a12 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a9, a10, a5, a12, a7, a8), //
 Op(FILE_system::PRED_$write_atom_5_static_exec, VA(a1, a12, a6, a7, a8), cont));
    }

    private final static Operation $write_term_op1_8_4(Prolog m) { 
    // '$write_term_op1'(A,yf,[B],C,D,E,F,G):-!,H is C,'$write_term0'(B,H,D,I,F,G),'$write_atom'(A,I,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$write_term_op1'(A,yf,[B],C,D,E,F,G):-['$neck_cut',H is C,'$write_term0'(B,H,D,I,F,G),'$write_atom'(A,I,E,F,G)]
        if (!  ATOM_yf .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a9 = a3.car();
            if (!  Prolog.Nil .unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
            a9 = m.mkvar2();
             a3.bind(CONS(a9,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a10 = m.mkvar1();
        //START inline expansion of a(10)is a(4)
        if (! a10.unify(Arithmetic.evaluate(a4), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a11 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a9, a10, a5, a11, a7, a8), //
 Op(FILE_system::PRED_$write_atom_5_static_exec, VA(a1, a11, a6, a7, a8), cont));
    }

    private final static Operation $write_term_op1_8_5(Prolog m) { 
    // '$write_term_op1'(A,xfx,[B,C],D,E,F,G,H):-!,I is D-1,J is D-1,'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$write_term_op1'(A,xfx,[B,C],D,E,F,G,H):-['$neck_cut',I is D-1,J is D-1,'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)]
        if (!  ATOM_xfx .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a9 = a3.car();
            a10 = a3.cdr();
        } else if (a3.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a3.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
        if (a10 .isCons()){
                        a11 = a10.car();
            if (!  Prolog.Nil .unify(a10.cdr(), m.trail))
                return m.fail();
        } else if (a10.isVar()){
            a11 = m.mkvar2();
             a10.bind(CONS(a11,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a12 = m.mkvar1();
    // put_str_args([a(4),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(13))
        a13 =  S( FUNCTOR_$002D_2 , a4,  int_1 );
 ;
        //START inline expansion of a(12)is a(13)
        if (! a12.unify(Arithmetic.evaluate(a13), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
    // put_str_args([a(4),@(int_1)],y(2)),put_str(@('FUNCTOR_$002D_2'),y(2),a(15))
        a15 =  S( FUNCTOR_$002D_2 , a4,  int_1 );
 ;
        //START inline expansion of a(14)is a(15)
        if (! a14.unify(Arithmetic.evaluate(a15), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a9, a12, a5, a16, a7, a8), //
 Op(FILE_system::PRED_$write_term_infix_op_5_static_exec, VA(a1, a16, a17, a7, a8), //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a11, a14, a17, a6, a7, a8), cont)));
    }

    private final static Operation $write_term_op1_8_6(Prolog m) { 
    // '$write_term_op1'(A,xfy,[B,C],D,E,F,G,H):-!,I is D-1,J is D,'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$write_term_op1'(A,xfy,[B,C],D,E,F,G,H):-['$neck_cut',I is D-1,J is D,'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)]
        if (!  ATOM_xfy .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a9 = a3.car();
            a10 = a3.cdr();
        } else if (a3.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a3.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
        if (a10 .isCons()){
                        a11 = a10.car();
            if (!  Prolog.Nil .unify(a10.cdr(), m.trail))
                return m.fail();
        } else if (a10.isVar()){
            a11 = m.mkvar2();
             a10.bind(CONS(a11,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a12 = m.mkvar1();
    // put_str_args([a(4),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(13))
        a13 =  S( FUNCTOR_$002D_2 , a4,  int_1 );
 ;
        //START inline expansion of a(12)is a(13)
        if (! a12.unify(Arithmetic.evaluate(a13), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
        //START inline expansion of a(14)is a(4)
        if (! a14.unify(Arithmetic.evaluate(a4), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a9, a12, a5, a15, a7, a8), //
 Op(FILE_system::PRED_$write_term_infix_op_5_static_exec, VA(a1, a15, a16, a7, a8), //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a11, a14, a16, a6, a7, a8), cont)));
    }

    private final static Operation $write_term_op1_8_7(Prolog m) { 
    // '$write_term_op1'(A,yfx,[B,C],D,E,F,G,H):-!,I is D,J is D-1,'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // '$write_term_op1'(A,yfx,[B,C],D,E,F,G,H):-['$neck_cut',I is D,J is D-1,'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)]
        if (!  ATOM_yfx .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a9 = a3.car();
            a10 = a3.cdr();
        } else if (a3.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a3.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
        if (a10 .isCons()){
                        a11 = a10.car();
            if (!  Prolog.Nil .unify(a10.cdr(), m.trail))
                return m.fail();
        } else if (a10.isVar()){
            a11 = m.mkvar2();
             a10.bind(CONS(a11,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a12 = m.mkvar1();
        //START inline expansion of a(12)is a(4)
        if (! a12.unify(Arithmetic.evaluate(a4), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a13 = m.mkvar1();
    // put_str_args([a(4),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(14))
        a14 =  S( FUNCTOR_$002D_2 , a4,  int_1 );
 ;
        //START inline expansion of a(13)is a(14)
        if (! a13.unify(Arithmetic.evaluate(a14), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a9, a12, a5, a15, a7, a8), //
 Op(FILE_system::PRED_$write_term_infix_op_5_static_exec, VA(a1, a15, a16, a7, a8), //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a11, a13, a16, a6, a7, a8), cont)));
    }
/** PREDICATE: $write_term_infix_op/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_term_infix_op'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$write_term_infix_op_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$write_term_infix_op_5_var, FILE_builtins::$write_term_infix_op_5_2, FILE_builtins::$write_term_infix_op_5_2, FILE_builtins::$write_term_infix_op_5_var, FILE_builtins::$write_term_infix_op_5_2, FILE_builtins::$write_term_infix_op_5_2); 
    }

    private final static Operation $write_term_infix_op_5_var(Prolog m) { 
        m.jtry5(null, FILE_builtins::$write_term_infix_op_5_var_1);
        return $write_term_infix_op_5_1(m);
    }

    private final static Operation $write_term_infix_op_5_var_1(Prolog m) { 
        m.trust(null);
        return $write_term_infix_op_5_2(m);
    }

    private final static Operation $write_term_infix_op_5_1(Prolog m) { 
    // '$write_term_infix_op'(',',A,punct,B,C):-!,'$write_space_if_needed'(A,punct,C),put_char(C,',')
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$write_term_infix_op'(',',A,punct,B,C):-['$neck_cut','$write_space_if_needed'(A,punct,C),put_char(C,',')]
        if (!  ATOM_$002C .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_punct .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a2,  ATOM_punct , a5), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a5,  ATOM_$002C ), cont));
    }

    private final static Operation $write_term_infix_op_5_2(Prolog m) { 
    // '$write_term_infix_op'(A,B,C,D,E):-'$write_atom'(A,B,C,D,E)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$write_term_infix_op'(A,B,C,D,E):-['$write_atom'(A,B,C,D,E)]
        return //
 Op(FILE_system::PRED_$write_atom_5_static_exec, VA(a1, a2, a3, a4, a5), cont);
    }
/** PREDICATE: $write_term_list_args/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_term_list_args'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$write_term_list_args_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$write_term_list_args_5_var, fail_0, fail_0, fail_0, fail_0, FILE_builtins::$write_term_list_args_5_var); 
    }

    private final static Operation $write_term_list_args_5_var(Prolog m) { 
        m.jtry5(null, FILE_builtins::$write_term_list_args_5_var_1);
        return $write_term_list_args_5_1(m);
    }

    private final static Operation $write_term_list_args_5_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term_list_args_5_var_2);
        return $write_term_list_args_5_2(m);
    }

    private final static Operation $write_term_list_args_5_var_2(Prolog m) { 
        m.trust(null);
        return $write_term_list_args_5_3(m);
    }

    private final static Operation $write_term_list_args_5_1(Prolog m) { 
    // '$write_term_list_args'([A|B],C,D,E,F):-nonvar(B),B=[G|H],!,'$write_term0'(A,999,C,I,E,F),'$write_space_if_needed'(I,punct,F),put_char(F,','),'$write_term_list_args'(B,punct,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$write_term_list_args'([A|B],C,D,E,F):-['$get_level'(G),nonvar(B),'$unify'(B,[H|I]),'$cut'(G),'$write_term0'(A,999,C,J,E,F),'$write_space_if_needed'(J,punct,F),put_char(F,','),'$write_term_list_args'(B,punct,D,E,F)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a6 = a1.car();
            a7 = a1.cdr();
        } else if (a1.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a1.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(7))
        a7 = a7.dref();
        if ((a7 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a9 = CONS(m.DONT_CARE1(), m.DONT_CARE1());
        //START inline expansion of $unify(a(7),a(9))
        if (! a7.unify(a9, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(8))
        a8 = a8.dref();
                  m.cut( a8.intValue());
        //END inline expansion
        a10 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a6,  int_999 , a2, a10, a4, a5), //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a10,  ATOM_punct , a5), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a5,  ATOM_$002C ), //
 Op(FILE_system::PRED_$write_term_list_args_5_static_exec, VA(a7,  ATOM_punct , a3, a4, a5), cont))));
    }

    private final static Operation $write_term_list_args_5_2(Prolog m) { 
    // '$write_term_list_args'([A|B],C,D,E,F):-nonvar(B),B=[],!,'$write_term0'(A,999,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$write_term_list_args'([A|B],C,D,E,F):-['$get_level'(G),nonvar(B),'$unify'(B,[]),'$cut'(G),'$write_term0'(A,999,C,D,E,F)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a6 = a1.car();
            a7 = a1.cdr();
        } else if (a1.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a1.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(7))
        a7 = a7.dref();
        if ((a7 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(7),@(Prolog.Nil))
        if (! a7.unify(Prolog.Nil, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(8))
        a8 = a8.dref();
                  m.cut( a8.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a6,  int_999 , a2, a3, a4, a5), cont);
    }

    private final static Operation $write_term_list_args_5_3(Prolog m) { 
    // '$write_term_list_args'([A|B],C,D,E,F):-'$write_term0'(A,999,C,G,E,F),'$write_space_if_needed'(G,punct,F),put_char(F,'|'),'$write_term0'(B,999,punct,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$write_term_list_args'([A|B],C,D,E,F):-['$write_term0'(A,999,C,G,E,F),'$write_space_if_needed'(G,punct,F),put_char(F,'|'),'$write_term0'(B,999,punct,D,E,F)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a6 = a1.car();
            a7 = a1.cdr();
        } else if (a1.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a1.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a8 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a6,  int_999 , a2, a8, a4, a5), //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a8,  ATOM_punct , a5), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a5,  ATOM_$007C ), //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a7,  int_999 ,  ATOM_punct , a3, a4, a5), cont))));
    }
/** PREDICATE: $write_term_args/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$write_term_args'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$write_term_args_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$write_term_args_5_var, fail_0, fail_0, FILE_builtins::$write_term_args_5_1, fail_0, FILE_builtins::$write_term_args_5_lis); 
    }

    private final static Operation $write_term_args_5_var(Prolog m) { 
        m.jtry5(null, FILE_builtins::$write_term_args_5_var_1);
        return $write_term_args_5_1(m);
    }

    private final static Operation $write_term_args_5_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$write_term_args_5_var_2);
        return $write_term_args_5_2(m);
    }

    private final static Operation $write_term_args_5_var_2(Prolog m) { 
        m.trust(null);
        return $write_term_args_5_3(m);
    }

    private final static Operation $write_term_args_5_lis(Prolog m) { 
        m.jtry5(null, FILE_builtins::$write_term_args_5_lis_1);
        return $write_term_args_5_2(m);
    }

    private final static Operation $write_term_args_5_lis_1(Prolog m) { 
        m.trust(null);
        return $write_term_args_5_3(m);
    }

    private final static Operation $write_term_args_5_1(Prolog m) { 
    // '$write_term_args'([],A,A,B,C):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$write_term_args'([],A,A,B,C):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $write_term_args_5_2(Prolog m) { 
    // '$write_term_args'([A],B,C,D,E):-!,'$write_term0'(A,999,B,C,D,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$write_term_args'([A],B,C,D,E):-['$neck_cut','$write_term0'(A,999,B,C,D,E)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a6 = a1.car();
            if (!  Prolog.Nil .unify(a1.cdr(), m.trail))
                return m.fail();
        } else if (a1.isVar()){
            a6 = m.mkvar2();
             a1.bind(CONS(a6,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a6,  int_999 , a2, a3, a4, a5), cont);
    }

    private final static Operation $write_term_args_5_3(Prolog m) { 
    // '$write_term_args'([A|B],C,D,E,F):-!,'$write_term0'(A,999,C,G,E,F),'$write_space_if_needed'(G,punct,F),put_char(F,','),'$write_term_args'(B,punct,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$write_term_args'([A|B],C,D,E,F):-['$neck_cut','$write_term0'(A,999,C,G,E,F),'$write_space_if_needed'(G,punct,F),put_char(F,','),'$write_term_args'(B,punct,D,E,F)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a6 = a1.car();
            a7 = a1.cdr();
        } else if (a1.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a1.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a8 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$write_term0_6_static_exec, VA(a6,  int_999 , a2, a8, a4, a5), //
 Op(FILE_system::PRED_$write_space_if_needed_3_static_exec, VA(a8,  ATOM_punct , a5), //
 Op(FILE_system::PRED_put_char_2_static_exec, VA(a5,  ATOM_$002C ), //
 Op(FILE_system::PRED_$write_term_args_5_static_exec, VA(a7,  ATOM_punct , a3, a4, a5), cont))));
    }
/** PREDICATE: op/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(op/3,public)
        final static SymbolTerm FUNCTOR_domain_2 = F("domain",2);
    private static final StructureTerm L_op_3_s7 = S( FUNCTOR_$002D_2 ,  int_0 ,  int_1200 );
    private static final StructureTerm L_op_3_s9 = S( FUNCTOR_domain_2 ,  ATOM_integer , L_op_3_s7);
        final static SymbolTerm FUNCTOR_op_3 = F("op",3);




    public static Operation PRED_op_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::op_3_sub_1);
        return op_3_1(m);
    }

    private final static Operation op_3_sub_1(Prolog m) { 
        m.trust(null);
        return op_3_2(m);
    }

    private final static Operation op_3_1(Prolog m) { 
    // op(A,B,C):-integer(A),0=<A,A=<1200,!,'$op1'(A,B,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // op(A,B,C):-['$get_level'(D),integer(A),E is 0,'$less_or_equal'(E,A),F is 1200,'$less_or_equal'(A,F),'$cut'(D),'$op1'(A,B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of integer(a(1))
        a1 = a1.dref();
        if (! (a1 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        //START inline expansion of a(5)is@(int_0)
        if (! a5.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_or_equal(a(5),a(1))
        if (Arithmetic.evaluate(a5).arithCompareTo(Arithmetic.evaluate(a1)) > 0) {
            return m.fail();
        }
        //END inline expansion
        a6 = m.mkvar1();
        //START inline expansion of a(6)is@(int_1200)
        if (! a6.unify(Arithmetic.evaluate(int_1200), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_or_equal(a(1),a(6))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a6)) > 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$op1_3_static_exec, VA(a1, a2, a3), cont);
    }

    private final static Operation op_3_2(Prolog m) { 
    // op(A,B,C):-illarg(domain(integer,0-1200),op(A,B,C),1)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // op(A,B,C):-[illarg(domain(integer,0-1200),op(A,B,C),1)]
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_op_3'),y(1),a(4))
        a4 =  S( FUNCTOR_op_3 , a1, a2, a3);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_op_3_s9, a4,  int_1 ), cont);
    }
/** PREDICATE: $op1/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$op1'/3,non-(public))




    public static Operation PRED_$op1_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$op1_3_sub_1);
        return $op1_3_1(m);
    }

    private final static Operation $op1_3_sub_1(Prolog m) { 
        m.trust(null);
        return $op1_3_2(m);
    }

    private final static Operation $op1_3_1(Prolog m) { 
    // '$op1'(A,B,C):-nonvar(B),'$op_specifier'(B,D),!,'$op2'(A,B,C)
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$op1'(A,B,C):-['$get_level'(D),nonvar(B),'$op_specifier'(B,E),'$cut'(D),'$op2'(A,B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(2))
        a2 = a2.dref();
        if ((a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$op_specifier_2_static_exec, VA(a2, m.DONT_CARE2()), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$op2_3_static_exec, VA(a1, a2, a3), cont)));
    }

    private final static Operation $op1_3_2(Prolog m) { 
    // '$op1'(A,B,C):-findall(D,'$op_specifier'(D,E),F),illarg(domain(term,F),op(A,B,C),2)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$op1'(A,B,C):-[findall(D,'SxxMachine':'$op_specifier'(D,E),F),illarg(domain(term,F),op(A,B,C),2)]
        a4 = m.mkvar1();
        a5 = Closure( //
 Op(FILE_system::PRED_$op_specifier_2_static_exec, VA(a4, m.DONTCARE("put_clo")), null));
        a6 = m.mkvar1();
    // put_str_args([@('ATOM_term'),a(6)],y(1)),put_str(@('FUNCTOR_domain_2'),y(1),a(7))
        a7 =  S( FUNCTOR_domain_2 ,  ATOM_term , a6);
 ;
    // put_str_args([a(1),a(2),a(3)],y(2)),put_str(@('FUNCTOR_op_3'),y(2),a(8))
        a8 =  S( FUNCTOR_op_3 , a1, a2, a3);
 ;
        return //
 Op(FILE_system::PRED_findall_3_static_exec, VA(a4, a5, a6), //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(a7, a8,  int_2 ), cont));
    }
/** PREDICATE: $op2/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$op2'/3,non-(public))
        final static SymbolTerm FUNCTOR_list_1 = F("list",1);
    private static final StructureTerm L_$op2_3_s6 = S( FUNCTOR_list_1 ,  ATOM_atom );
    private static final StructureTerm L_$op2_3_s8 = S( FUNCTOR_type_1 , L_$op2_3_s6);




    public static Operation PRED_$op2_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$op2_3_sub_1);
        return $op2_3_1(m);
    }

    private final static Operation $op2_3_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$op2_3_sub_2);
        return $op2_3_2(m);
    }

    private final static Operation $op2_3_sub_2(Prolog m) { 
        m.trust(null);
        return $op2_3_3(m);
    }

    private final static Operation $op2_3_1(Prolog m) { 
    // '$op2'(A,B,C):-atom(C),!,'$add_operators'([C],A,B)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$op2'(A,B,C):-['$get_level'(D),atom(C),'$cut'(D),'$add_operators'([C],A,B)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(3))
        a3 = a3.dref();
        if (! (a3 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        a5 = CONS(a3,  Prolog.Nil );
        return //
 Op(FILE_system::PRED_$add_operators_3_static_exec, VA(a5, a1, a2), cont);
    }

    private final static Operation $op2_3_2(Prolog m) { 
    // '$op2'(A,B,C):-'$op_atom_list'(C,D),!,'$add_operators'(D,A,B)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$op2'(A,B,C):-['$get_level'(D),'$op_atom_list'(C,E),'$cut'(D),'$add_operators'(E,A,B)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$op_atom_list_2_static_exec, VA(a3, a5), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$add_operators_3_static_exec, VA(a5, a1, a2), cont)));
    }

    private final static Operation $op2_3_3(Prolog m) { 
    // '$op2'(A,B,C):-illarg(type(list(atom)),op(A,B,C),3)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$op2'(A,B,C):-[illarg(type(list(atom)),op(A,B,C),3)]
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_op_3'),y(1),a(4))
        a4 =  S( FUNCTOR_op_3 , a1, a2, a3);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$op2_3_s8, a4,  int_3 ), cont);
    }
/** PREDICATE: $add_operators/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$add_operators'/3,non-(public))




    public static Operation PRED_$add_operators_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$add_operators_3_var, fail_0, fail_0, FILE_builtins::$add_operators_3_1, fail_0, FILE_builtins::$add_operators_3_2); 
    }

    private final static Operation $add_operators_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$add_operators_3_var_1);
        return $add_operators_3_1(m);
    }

    private final static Operation $add_operators_3_var_1(Prolog m) { 
        m.trust(null);
        return $add_operators_3_2(m);
    }

    private final static Operation $add_operators_3_1(Prolog m) { 
    // '$add_operators'([],A,B):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$add_operators'([],A,B):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $add_operators_3_2(Prolog m) { 
    // '$add_operators'([A|B],C,D):-'$add_op'(A,C,D),'$add_operators'(B,C,D)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$add_operators'([A|B],C,D):-['$add_op'(A,C,D),'$add_operators'(B,C,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_$add_op_3_static_exec, VA(a4, a2, a3), //
 Op(FILE_system::PRED_$add_operators_3_static_exec, VA(a5, a2, a3), cont));
    }
/** PREDICATE: $add_op/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$add_op'/3,non-(public))
        final static SymbolTerm FUNCTOR_$0024current_operator_3 = F("$current_operator",3);




    public static Operation PRED_$add_op_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$add_op_3_var, FILE_builtins::$add_op_3_int, FILE_builtins::$add_op_3_int, FILE_builtins::$add_op_3_var, FILE_builtins::$add_op_3_int, FILE_builtins::$add_op_3_int); 
    }

    private final static Operation $add_op_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$add_op_3_var_1);
        return $add_op_3_1(m);
    }

    private final static Operation $add_op_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$add_op_3_var_2);
        return $add_op_3_2(m);
    }

    private final static Operation $add_op_3_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$add_op_3_var_3);
        return $add_op_3_3(m);
    }

    private final static Operation $add_op_3_var_3(Prolog m) { 
        m.trust(null);
        return $add_op_3_4(m);
    }

    private final static Operation $add_op_3_int(Prolog m) { 
        m.jtry3(null, FILE_builtins::$add_op_3_int_1);
        return $add_op_3_2(m);
    }

    private final static Operation $add_op_3_int_1(Prolog m) { 
        m.retry(null, FILE_builtins::$add_op_3_int_2);
        return $add_op_3_3(m);
    }

    private final static Operation $add_op_3_int_2(Prolog m) { 
        m.trust(null);
        return $add_op_3_4(m);
    }

    private final static Operation $add_op_3_1(Prolog m) { 
    // '$add_op'(',',A,B):-!,illarg(permission(modify,operator,',',C),op(A,B,','),3)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$add_op'(',',A,B):-['$neck_cut',illarg(permission(modify,operator,',',C),op(A,B,','),3)]
        if (!  ATOM_$002C .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([@('ATOM_modify'),@('ATOM_operator'),@('ATOM_$002C'),void],y(1)),put_str(@('FUNCTOR_permission_4'),y(1),a(4))
        a4 =  S( FUNCTOR_permission_4 ,  ATOM_modify ,  ATOM_operator ,  ATOM_$002C , m.mkvar3());
 ;
    // put_str_args([a(2),a(3),@('ATOM_$002C')],y(2)),put_str(@('FUNCTOR_op_3'),y(2),a(5))
        a5 =  S( FUNCTOR_op_3 , a2, a3,  ATOM_$002C );
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(a4, a5,  int_3 ), cont);
    }

    private final static Operation $add_op_3_2(Prolog m) { 
    // '$add_op'(A,B,C):-clause('$current_operator'(D,E,A),F),'$op_specifier'(C,G),'$op_specifier'(E,H),G=H,retract('$current_operator'(I,E,A)),fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$add_op'(A,B,C):-[clause('SxxMachine':'$current_operator'(D,E,A),F),'$op_specifier'(C,G),'$op_specifier'(E,H),'$unify'(G,H),retract('SxxMachine':'$current_operator'(I,E,A)),fail]
        a4 = m.mkvar1();
    // put_str_args([void,a(4),a(1)],y(1)),put_str(@('FUNCTOR_$0024current_operator_3'),y(1),a(5))
        a5 =  S( FUNCTOR_$0024current_operator_3 , m.mkvar3(), a4, a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(5)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a5);
 ;
        a7 = m.mkvar1();
        a8 = m.mkvar1();
    // put_str_args([void,a(4),a(1)],y(3)),put_str(@('FUNCTOR_$0024current_operator_3'),y(3),a(9))
        a9 =  S( FUNCTOR_$0024current_operator_3 , m.mkvar3(), a4, a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(9)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(10))
        a10 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a9);
 ;
        return //
 Op(FILE_system::PRED_clause_2_static_exec, VA(a6, m.DONT_CARE2()), //
 Op(FILE_system::PRED_$op_specifier_2_static_exec, VA(a3, a7), //
 Op(FILE_system::PRED_$op_specifier_2_static_exec, VA(a4, a8), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a7, a8), //
 Op(FILE_system::PRED_retract_1_static_exec, VA(a10), fail_0)))));
    }

    private final static Operation $add_op_3_3(Prolog m) { 
    // '$add_op'(A,0,B):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$add_op'(A,0,B):-['$neck_cut']
        if (!  int_0 .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $add_op_3_4(Prolog m) { 
    // '$add_op'(A,B,C):-assertz('$current_operator'(B,C,A))
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$add_op'(A,B,C):-[assertz('SxxMachine':'$current_operator'(B,C,A))]
    // put_str_args([a(2),a(3),a(1)],y(1)),put_str(@('FUNCTOR_$0024current_operator_3'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024current_operator_3 , a2, a3, a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
        return //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(a5), cont);
    }
/** PREDICATE: $op_specifier/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$op_specifier'/2,non-(public))
        final static SymbolTerm ATOM_prefix = SYM("prefix");
        final static SymbolTerm ATOM_infix = SYM("infix");
        final static SymbolTerm ATOM_postfix = SYM("postfix");




    public static Operation PRED_$op_specifier_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$op_specifier_2_var, fail_0, fail_0, FILE_builtins::$op_specifier_2_var, fail_0, fail_0); 
    }

    private final static Operation $op_specifier_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::$op_specifier_2_var_1);
        return $op_specifier_2_1(m);
    }

    private final static Operation $op_specifier_2_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$op_specifier_2_var_2);
        return $op_specifier_2_2(m);
    }

    private final static Operation $op_specifier_2_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$op_specifier_2_var_3);
        return $op_specifier_2_3(m);
    }

    private final static Operation $op_specifier_2_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$op_specifier_2_var_4);
        return $op_specifier_2_4(m);
    }

    private final static Operation $op_specifier_2_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$op_specifier_2_var_5);
        return $op_specifier_2_5(m);
    }

    private final static Operation $op_specifier_2_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$op_specifier_2_var_6);
        return $op_specifier_2_6(m);
    }

    private final static Operation $op_specifier_2_var_6(Prolog m) { 
        m.trust(null);
        return $op_specifier_2_7(m);
    }

    private final static Operation $op_specifier_2_1(Prolog m) { 
    // '$op_specifier'(fx,prefix):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$op_specifier'(fx,prefix):-[]
        if (!  ATOM_fx .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_prefix .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $op_specifier_2_2(Prolog m) { 
    // '$op_specifier'(fy,prefix):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$op_specifier'(fy,prefix):-[]
        if (!  ATOM_fy .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_prefix .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $op_specifier_2_3(Prolog m) { 
    // '$op_specifier'(xfx,infix):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$op_specifier'(xfx,infix):-[]
        if (!  ATOM_xfx .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_infix .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $op_specifier_2_4(Prolog m) { 
    // '$op_specifier'(xfy,infix):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$op_specifier'(xfy,infix):-[]
        if (!  ATOM_xfy .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_infix .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $op_specifier_2_5(Prolog m) { 
    // '$op_specifier'(yfx,infix):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$op_specifier'(yfx,infix):-[]
        if (!  ATOM_yfx .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_infix .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $op_specifier_2_6(Prolog m) { 
    // '$op_specifier'(xf,postfix):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$op_specifier'(xf,postfix):-[]
        if (!  ATOM_xf .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_postfix .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $op_specifier_2_7(Prolog m) { 
    // '$op_specifier'(yf,postfix):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$op_specifier'(yf,postfix):-[]
        if (!  ATOM_yf .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_postfix .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $op_atom_list/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$op_atom_list'/2,non-(public))




    public static Operation PRED_$op_atom_list_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $op_atom_list_2_top(m);
    }

    private final static Operation $op_atom_list_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$op_atom_list_2_var, FILE_builtins::$op_atom_list_2_1, FILE_builtins::$op_atom_list_2_1, FILE_builtins::$op_atom_list_2_con, FILE_builtins::$op_atom_list_2_1, FILE_builtins::$op_atom_list_2_lis); 
    }

    private final static Operation $op_atom_list_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::$op_atom_list_2_var_1);
        return $op_atom_list_2_1(m);
    }

    private final static Operation $op_atom_list_2_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$op_atom_list_2_var_2);
        return $op_atom_list_2_2(m);
    }

    private final static Operation $op_atom_list_2_var_2(Prolog m) { 
        m.trust(null);
        return $op_atom_list_2_3(m);
    }

    private final static Operation $op_atom_list_2_con(Prolog m) { 
        m.jtry2(null, FILE_builtins::$op_atom_list_2_con_1);
        return $op_atom_list_2_1(m);
    }

    private final static Operation $op_atom_list_2_con_1(Prolog m) { 
        m.trust(null);
        return $op_atom_list_2_2(m);
    }

    private final static Operation $op_atom_list_2_lis(Prolog m) { 
        m.jtry2(null, FILE_builtins::$op_atom_list_2_lis_1);
        return $op_atom_list_2_1(m);
    }

    private final static Operation $op_atom_list_2_lis_1(Prolog m) { 
        m.trust(null);
        return $op_atom_list_2_3(m);
    }

    private final static Operation $op_atom_list_2_1(Prolog m) { 
    // '$op_atom_list'(A,B):-var(A),!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$op_atom_list'(A,B):-['$get_level'(C),var(A),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $op_atom_list_2_2(Prolog m) { 
    // '$op_atom_list'([],[]):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$op_atom_list'([],[]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $op_atom_list_2_3(Prolog m) { 
    // '$op_atom_list'([A|B],[A|C]):-atom(A),!,'$op_atom_list'(B,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$op_atom_list'([A|B],[A|C]):-['$get_level'(D),atom(A),'$cut'(D),'$op_atom_list'(B,C)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
            a4 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
            a4 = m.mkvar2();
             a1.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a3.unify(a2.car(), m.trail))
                return m.fail();
            a5 = a2.cdr();
        } else if (a2.isVar()){
            a5 = m.mkvar2();
             a2.bind(CONS(a3, a5), m.trail);
        } else {
            return m.fail();
        }
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(3))
        a3 = a3.dref();
        if (! (a3 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a5;
m.cont = cont;
        return $op_atom_list_2_top(m);
    }
/** PREDICATE: current_op/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(current_op/3,public)




    public static Operation PRED_current_op_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // current_op(A,B,C):-clause('$current_operator'(A,B,C),D)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // current_op(A,B,C):-[clause('SxxMachine':'$current_operator'(A,B,C),D)]
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_$0024current_operator_3'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024current_operator_3 , a1, a2, a3);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
        return //
 Op(FILE_system::PRED_clause_2_static_exec, VA(a5, m.DONT_CARE2()), cont);
    }
/** PREDICATE: (\+)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main((\+)/1,public)




    public static Operation PRED_$005C$002B_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$005C$002B_1_sub_1);
        return $005C$002B_1_1(m);
    }

    private final static Operation $005C$002B_1_sub_1(Prolog m) { 
        m.trust(null);
        return $005C$002B_1_2(m);
    }

    private final static Operation $005C$002B_1_1(Prolog m) { 
    // \+A:-call(A),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // \+A:-['$get_level'(B),call('SxxMachine':A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
        return //
 Op(FILE_system::PRED_call_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $005C$002B_1_2(Prolog m) { 
    // \+A:-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // \+A:-[]
        return cont;
    }
/** PREDICATE: repeat/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(repeat/0,public)




    public static Operation PRED_repeat_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return repeat_0_top(m);
    }

    private final static Operation repeat_0_top(Prolog m) { 
        m.setB0();
        m.jtry0(null, FILE_builtins::repeat_0_sub_1);
        return repeat_0_1(m);
    }

    private final static Operation repeat_0_sub_1(Prolog m) { 
        m.trust(null);
        return repeat_0_2(m);
    }

    private final static Operation repeat_0_1(Prolog m) { 
    // repeat:-true
        Operation cont;
        cont = m.cont;
    // repeat:-[]
        return cont;
    }

    private final static Operation repeat_0_2(Prolog m) { 
    // repeat:-repeat
        Operation cont;
        cont = m.cont;
    // repeat:-[repeat]
m.cont = cont;
        return repeat_0_top(m);
    }
/** PREDICATE: once/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(once/1,public)




    public static Operation PRED_once_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // once(A):-call(A),!
        m.setB0();
         Term a1, a2, a3;
        Operation p1;
        a1 = LARG[0];
    // once(A):-['$get_level'(B),call('SxxMachine':A),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
        return //
 Op(FILE_system::PRED_call_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), cont));
    }
/** PREDICATE: sub_atom/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(sub_atom/5,public)

    // private final Term arg5;




    public static Operation PRED_sub_atom_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // sub_atom(A,B,C,D,E):-atom_concat(F,G,A),atom_length(F,B),atom_concat(E,H,G),atom_length(E,C),atom_length(H,D)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // sub_atom(A,B,C,D,E):-[atom_concat(F,G,A),atom_length(F,B),atom_concat(E,H,G),atom_length(E,C),atom_length(H,D)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        return //
 Op(FILE_system::PRED_atom_concat_3_static_exec, VA(a6, a7, a1), //
 Op(FILE_system::PRED_atom_length_2_static_exec, VA(a6, a2), //
 Op(FILE_system::PRED_atom_concat_3_static_exec, VA(a5, a8, a7), //
 Op(FILE_system::PRED_atom_length_2_static_exec, VA(a5, a3), //
 Op(FILE_system::PRED_atom_length_2_static_exec, VA(a8, a4), cont)))));
    }
/** PREDICATE: $dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/2,non-(public))
        final static SymbolTerm ATOM_atomic = SYM("atomic");
    private static final StructureTerm L_$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_s4 = S( FUNCTOR_type_1 ,  ATOM_atomic );
        final static SymbolTerm FUNCTOR_name_2 = F("name",2);




    public static Operation PRED_$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_sub_1);
        return $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_1(m);
    }

    private final static Operation $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_sub_2);
        return $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_2(m);
    }

    private final static Operation $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_3(m);
    }

    private final static Operation $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_1(Prolog m) { 
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B):-number(A),!,number_codes(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B):-['$get_level'(C),number(A),'$cut'(C),number_codes(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of number(a(1))
        a1 = a1.dref();
        if (! a1.isNumber()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_number_codes_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_2(Prolog m) { 
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B):-'$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B):-['$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B)]
        return //
 Op(FILE_system::PRED_$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_3(Prolog m) { 
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B):-illarg(type(atomic),name(A,B),1)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B):-[illarg(type(atomic),name(A,B),1)]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_name_2'),y(1),a(3))
        a3 =  S( FUNCTOR_name_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_s4, a3,  int_1 ), cont);
    }
/** PREDICATE: $dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/2,non-(public))




    public static Operation PRED_$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_sub_1);
        return $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_1(m);
    }

    private final static Operation $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_2(m);
    }

    private final static Operation $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_1(Prolog m) { 
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B):-atomic(A),!,atom_codes(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B):-['$get_level'(C),atomic(A),'$cut'(C),atom_codes(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_atom_codes_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_2(Prolog m) { 
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: name/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(name/2,public)




    public static Operation PRED_name_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::name_2_sub_1);
        return name_2_1(m);
    }

    private final static Operation name_2_sub_1(Prolog m) { 
        m.trust(null);
        return name_2_2(m);
    }

    private final static Operation name_2_1(Prolog m) { 
    // name(A,B):-nonvar(A),'$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // name(A,B):-[nonvar(A),'$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B)]
        //START inline expansion of nonvar(a(1))
        a1 = a1.dref();
        if ((a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation name_2_2(Prolog m) { 
    // name(A,B):-var(A),'$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // name(A,B):-[var(A),'$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C)]
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec, VA(a1, a2, m.DONT_CARE2()), cont);
    }
/** PREDICATE: $dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/3,non-(public))
        final static SymbolTerm ATOM_char = SYM("char");
    private static final StructureTerm L_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_s5 = S( FUNCTOR_list_1 ,  ATOM_char );
    private static final StructureTerm L_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_s7 = S( FUNCTOR_type_1 , L_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_s5);




    public static Operation PRED_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1);
        return $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(m);
    }

    private final static Operation $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_2);
        return $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(m);
    }

    private final static Operation $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_3(m);
    }

    private final static Operation $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog m) { 
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-number_codes(C,B),!,A=C
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-['$get_level'(D),number_codes(C,B),'$cut'(D),'$unify'(A,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_number_codes_2_static_exec, VA(a3, a2), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a1, a3), cont)));
    }

    private final static Operation $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog m) { 
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-'$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-['$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C)]
        return //
 Op(FILE_system::PRED_$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec, VA(a1, a2, a3), cont);
    }

    private final static Operation $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_3(Prolog m) { 
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-illarg(type(list(char)),name(A,B),2)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-[illarg(type(list(char)),name(A,B),2)]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_name_2'),y(1),a(4))
        a4 =  S( FUNCTOR_name_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_s7, a4,  int_2 ), cont);
    }
/** PREDICATE: $dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/3,non-(public))




    public static Operation PRED_$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1);
        return $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(m);
    }

    private final static Operation $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(m);
    }

    private final static Operation $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog m) { 
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-atom_codes(C,B),!,A=C
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-['$get_level'(D),atom_codes(C,B),'$cut'(D),'$unify'(A,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_atom_codes_2_static_exec, VA(a3, a2), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a1, a3), cont)));
    }

    private final static Operation $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog m) { 
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: regex_matches/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(regex_matches/3,public)




    public static Operation PRED_regex_matches_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::regex_matches_3_sub_1);
        return regex_matches_3_1(m);
    }

    private final static Operation regex_matches_3_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::regex_matches_3_sub_2);
        return regex_matches_3_2(m);
    }

    private final static Operation regex_matches_3_sub_2(Prolog m) { 
        m.trust(null);
        return regex_matches_3_3(m);
    }

    private final static Operation regex_matches_3_1(Prolog m) { 
    // regex_matches(A,[],B):-!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // regex_matches(A,[],B):-['$neck_cut',fail]
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation regex_matches_3_2(Prolog m) { 
    // regex_matches(A,B,C):-B=[D|E],!,regex_list(A,B,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // regex_matches(A,B,C):-['$get_level'(D),'$unify'(B,[E|F]),'$cut'(D),regex_list(A,B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = CONS(m.DONT_CARE1(), m.DONT_CARE1());
        //START inline expansion of $unify(a(2),a(5))
        if (! a2.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_regex_list_3_static_exec, VA(a1, a2, a3), cont);
    }

    private final static Operation regex_matches_3_3(Prolog m) { 
    // regex_matches(A,B,C):-atom(B),regex_compile(A,D),regex_match(D,B,C)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // regex_matches(A,B,C):-[atom(B),regex_compile(A,D),regex_match(D,B,C)]
        //START inline expansion of atom(a(2))
        a2 = a2.dref();
        if (! (a2 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_regex_compile_2_static_exec, VA(a1, a4), //
 Op(FILE_system::PRED_regex_match_3_static_exec, VA(a4, a2, a3), cont));
    }
/** PREDICATE: regex_matches/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(regex_matches/2,public)




    public static Operation PRED_regex_matches_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // regex_matches(A,B):-once(regex_matches(A,B,C))
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // regex_matches(A,B):-[once('SxxMachine':regex_matches(A,B,C))]
        a3 = Closure( //
 Op(FILE_system::PRED_regex_matches_3_static_exec, VA(a1, a2, m.DONTCARE("put_clo")), null));
        return //
 Op(FILE_system::PRED_once_1_static_exec, VA(a3), cont);
    }
/** PREDICATE: regex_list/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(regex_list/3,non-(public))




    public static Operation PRED_regex_list_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return regex_list_3_top(m);
    }

    private final static Operation regex_list_3_top(Prolog m) { 
        m.setB0();
        m.jtry3(null, FILE_builtins::regex_list_3_sub_1);
        return regex_list_3_1(m);
    }

    private final static Operation regex_list_3_sub_1(Prolog m) { 
        m.trust(null);
        return regex_list_3_2(m);
    }

    private final static Operation regex_list_3_1(Prolog m) { 
    // regex_list(A,[B|C],D):-regex_matches(A,B,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // regex_list(A,[B|C],D):-[regex_matches(A,B,D)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.car();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
             a2.bind(CONS(a4, m.DONTCARE("cons(a(2))")), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_regex_matches_3_static_exec, VA(a1, a4, a3), cont);
    }

    private final static Operation regex_list_3_2(Prolog m) { 
    // regex_list(A,[B|C],D):-regex_list(A,C,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // regex_list(A,[B|C],D):-[regex_list(A,C,D)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.cdr();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
             a2.bind(CONS(m.DONTCARE("cons(a(2))"), a4), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a1;
        m.AREGS[1] = a4;
        m.AREGS[2] = a3;
m.cont = cont;
        return regex_list_3_top(m);
    }
/** PREDICATE: set_prolog_flag/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(set_prolog_flag/2,public)
        final static SymbolTerm FUNCTOR_set_prolog_flag_2 = F("set_prolog_flag",2);
    private static final StructureTerm L_set_prolog_flag_2_s8 = S( FUNCTOR_type_1 ,  ATOM_atom );




    public static Operation PRED_set_prolog_flag_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::set_prolog_flag_2_sub_1);
        return set_prolog_flag_2_1(m);
    }

    private final static Operation set_prolog_flag_2_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::set_prolog_flag_2_sub_2);
        return set_prolog_flag_2_2(m);
    }

    private final static Operation set_prolog_flag_2_sub_2(Prolog m) { 
        m.retry(null, FILE_builtins::set_prolog_flag_2_sub_3);
        return set_prolog_flag_2_3(m);
    }

    private final static Operation set_prolog_flag_2_sub_3(Prolog m) { 
        m.trust(null);
        return set_prolog_flag_2_4(m);
    }

    private final static Operation set_prolog_flag_2_1(Prolog m) { 
    // set_prolog_flag(A,B):-var(A),!,illarg(var,set_prolog_flag(A,B),1)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_prolog_flag(A,B):-['$get_level'(C),var(A),'$cut'(C),illarg(var,set_prolog_flag(A,B),1)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_set_prolog_flag_2'),y(1),a(4))
        a4 =  S( FUNCTOR_set_prolog_flag_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a4,  int_1 ), cont);
    }

    private final static Operation set_prolog_flag_2_2(Prolog m) { 
    // set_prolog_flag(A,B):-var(B),!,illarg(var,set_prolog_flag(A,B),2)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_prolog_flag(A,B):-['$get_level'(C),var(B),'$cut'(C),illarg(var,set_prolog_flag(A,B),2)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_set_prolog_flag_2'),y(1),a(4))
        a4 =  S( FUNCTOR_set_prolog_flag_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a4,  int_2 ), cont);
    }

    private final static Operation set_prolog_flag_2_3(Prolog m) { 
    // set_prolog_flag(A,B):-atom(A),!,'$set_prolog_flag0'(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_prolog_flag(A,B):-['$get_level'(C),atom(A),'$cut'(C),'$set_prolog_flag0'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$set_prolog_flag0_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation set_prolog_flag_2_4(Prolog m) { 
    // set_prolog_flag(A,B):-illarg(type(atom),set_prolog_flag(A,B),1)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_prolog_flag(A,B):-[illarg(type(atom),set_prolog_flag(A,B),1)]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_set_prolog_flag_2'),y(1),a(3))
        a3 =  S( FUNCTOR_set_prolog_flag_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_set_prolog_flag_2_s8, a3,  int_1 ), cont);
    }
/** PREDICATE: $set_prolog_flag0/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$set_prolog_flag0'/2,non-(public))
        final static SymbolTerm FUNCTOR_changeable_1 = F("changeable",1);
        final static SymbolTerm ATOM_prolog_flag = SYM("prolog_flag");
    private static final StructureTerm L_$set_prolog_flag0_2_s6 = S( FUNCTOR_domain_2 ,  ATOM_atom ,  ATOM_prolog_flag );




    public static Operation PRED_$set_prolog_flag0_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::$set_prolog_flag0_2_sub_1);
        return $set_prolog_flag0_2_1(m);
    }

    private final static Operation $set_prolog_flag0_2_sub_1(Prolog m) { 
        m.trust(null);
        return $set_prolog_flag0_2_2(m);
    }

    private final static Operation $set_prolog_flag0_2_1(Prolog m) { 
    // '$set_prolog_flag0'(A,B):-'$prolog_impl_flag'(A,C,changeable(D)),!,'$set_prolog_flag0'(D,A,B,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$set_prolog_flag0'(A,B):-['$get_level'(C),'$prolog_impl_flag'(A,D,changeable(E)),'$cut'(C),'$set_prolog_flag0'(E,A,B,D)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(5)],y(1)),put_str(@('FUNCTOR_changeable_1'),y(1),a(6))
        a6 =  S( FUNCTOR_changeable_1 , a5);
 ;
        return //
 Op(FILE_system::PRED_$prolog_impl_flag_3_static_exec, VA(a1, a4, a6), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$set_prolog_flag0_4_static_exec, VA(a5, a1, a2, a4), cont)));
    }

    private final static Operation $set_prolog_flag0_2_2(Prolog m) { 
    // '$set_prolog_flag0'(A,B):-illarg(domain(atom,prolog_flag),set_prolog_flag(A,B),1)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$set_prolog_flag0'(A,B):-[illarg(domain(atom,prolog_flag),set_prolog_flag(A,B),1)]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_set_prolog_flag_2'),y(1),a(3))
        a3 =  S( FUNCTOR_set_prolog_flag_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$set_prolog_flag0_2_s6, a3,  int_1 ), cont);
    }
/** PREDICATE: $set_prolog_flag0/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$set_prolog_flag0'/4,non-(public))
        final static SymbolTerm ATOM_flag = SYM("flag");
        final static SymbolTerm ATOM_flag_value = SYM("flag_value");
    private static final StructureTerm L_$set_prolog_flag0_4_s10 = S( FUNCTOR_domain_2 ,  ATOM_atom ,  ATOM_flag_value );




    public static Operation PRED_$set_prolog_flag0_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$set_prolog_flag0_4_var, FILE_builtins::$set_prolog_flag0_4_int, FILE_builtins::$set_prolog_flag0_4_int, FILE_builtins::$set_prolog_flag0_4_var, FILE_builtins::$set_prolog_flag0_4_int, FILE_builtins::$set_prolog_flag0_4_int); 
    }

    private final static Operation $set_prolog_flag0_4_var(Prolog m) { 
        m.jtry4(null, FILE_builtins::$set_prolog_flag0_4_var_1);
        return $set_prolog_flag0_4_1(m);
    }

    private final static Operation $set_prolog_flag0_4_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$set_prolog_flag0_4_var_2);
        return $set_prolog_flag0_4_2(m);
    }

    private final static Operation $set_prolog_flag0_4_var_2(Prolog m) { 
        m.trust(null);
        return $set_prolog_flag0_4_3(m);
    }

    private final static Operation $set_prolog_flag0_4_int(Prolog m) { 
        m.jtry4(null, FILE_builtins::$set_prolog_flag0_4_int_1);
        return $set_prolog_flag0_4_2(m);
    }

    private final static Operation $set_prolog_flag0_4_int_1(Prolog m) { 
        m.trust(null);
        return $set_prolog_flag0_4_3(m);
    }

    private final static Operation $set_prolog_flag0_4_1(Prolog m) { 
    // '$set_prolog_flag0'(no,A,B,C):-!,illarg(permission(modify,flag,A,D),set_prolog_flag(A,B),E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$set_prolog_flag0'(no,A,B,C):-['$neck_cut',illarg(permission(modify,flag,A,D),set_prolog_flag(A,B),E)]
        if (!  ATOM_no .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([@('ATOM_modify'),@('ATOM_flag'),a(2),void],y(1)),put_str(@('FUNCTOR_permission_4'),y(1),a(5))
        a5 =  S( FUNCTOR_permission_4 ,  ATOM_modify ,  ATOM_flag , a2, m.mkvar3());
 ;
    // put_str_args([a(2),a(3)],y(2)),put_str(@('FUNCTOR_set_prolog_flag_2'),y(2),a(6))
        a6 =  S( FUNCTOR_set_prolog_flag_2 , a2, a3);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(a5, a6, m.DONT_CARE2()), cont);
    }

    private final static Operation $set_prolog_flag0_4_2(Prolog m) { 
    // '$set_prolog_flag0'(A,B,C,D):-'$builtin_member'(C,D),!,'$set_prolog_impl_flag'(B,C)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$set_prolog_flag0'(A,B,C,D):-['$get_level'(E),'$builtin_member'(C,D),'$cut'(E),'$set_prolog_impl_flag'(B,C)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$builtin_member_2_static_exec, VA(a3, a4), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_$set_prolog_impl_flag_2_static_exec, VA(a2, a3), cont)));
    }

    private final static Operation $set_prolog_flag0_4_3(Prolog m) { 
    // '$set_prolog_flag0'(A,B,C,D):-illarg(domain(atom,flag_value),set_prolog_flag(B,C),2)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$set_prolog_flag0'(A,B,C,D):-[illarg(domain(atom,flag_value),set_prolog_flag(B,C),2)]
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_set_prolog_flag_2'),y(1),a(5))
        a5 =  S( FUNCTOR_set_prolog_flag_2 , a2, a3);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$set_prolog_flag0_4_s10, a5,  int_2 ), cont);
    }
/** PREDICATE: current_prolog_flag/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(current_prolog_flag/2,public)
    private static final StructureTerm L_current_prolog_flag_2_s4 = S( FUNCTOR_type_1 ,  ATOM_atom );
        final static SymbolTerm FUNCTOR_current_prolog_flag_2 = F("current_prolog_flag",2);




    public static Operation PRED_current_prolog_flag_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::current_prolog_flag_2_sub_1);
        return current_prolog_flag_2_1(m);
    }

    private final static Operation current_prolog_flag_2_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::current_prolog_flag_2_sub_2);
        return current_prolog_flag_2_2(m);
    }

    private final static Operation current_prolog_flag_2_sub_2(Prolog m) { 
        m.trust(null);
        return current_prolog_flag_2_3(m);
    }

    private final static Operation current_prolog_flag_2_1(Prolog m) { 
    // current_prolog_flag(A,B):-var(A),!,'$prolog_impl_flag'(A,C,D),'$get_prolog_impl_flag'(A,B)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // current_prolog_flag(A,B):-['$get_level'(C),var(A),'$cut'(C),'$prolog_impl_flag'(A,D,E),'$get_prolog_impl_flag'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$prolog_impl_flag_3_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2()), //
 Op(FILE_system::PRED_$get_prolog_impl_flag_2_static_exec, VA(a1, a2), cont));
    }

    private final static Operation current_prolog_flag_2_2(Prolog m) { 
    // current_prolog_flag(A,B):-atom(A),!,'$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // current_prolog_flag(A,B):-['$get_level'(C),atom(A),'$cut'(C),'$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,D,E)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec, VA(a1, a2, m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }

    private final static Operation current_prolog_flag_2_3(Prolog m) { 
    // current_prolog_flag(A,B):-illarg(type(atom),current_prolog_flag(A,B),1)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // current_prolog_flag(A,B):-[illarg(type(atom),current_prolog_flag(A,B),1)]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_current_prolog_flag_2'),y(1),a(3))
        a3 =  S( FUNCTOR_current_prolog_flag_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_current_prolog_flag_2_s4, a3,  int_1 ), cont);
    }
/** PREDICATE: $dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/4,non-(public))
    private static final StructureTerm L_$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_s5 = S( FUNCTOR_domain_2 ,  ATOM_atom ,  ATOM_prolog_flag );




    public static Operation PRED_$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_builtins::$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_sub_1);
        return $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_1(m);
    }

    private final static Operation $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_2(m);
    }

    private final static Operation $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_1(Prolog m) { 
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-'$prolog_impl_flag'(A,C,D),!,'$get_prolog_impl_flag'(A,B)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-['$get_level'(E),'$prolog_impl_flag'(A,C,D),'$cut'(E),'$get_prolog_impl_flag'(A,B)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$prolog_impl_flag_3_static_exec, VA(a1, a3, a4), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_$get_prolog_impl_flag_2_static_exec, VA(a1, a2), cont)));
    }

    private final static Operation $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_2(Prolog m) { 
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-illarg(domain(atom,prolog_flag),current_prolog_flag(A,B),1)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D):-[illarg(domain(atom,prolog_flag),current_prolog_flag(A,B),1)]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_current_prolog_flag_2'),y(1),a(5))
        a5 =  S( FUNCTOR_current_prolog_flag_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_s5, a5,  int_1 ), cont);
    }
/** PREDICATE: $prolog_impl_flag/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$prolog_impl_flag'/3,non-(public))
        final static SymbolTerm ATOM_max_integer = SYM("max_integer");
    private static final StructureTerm L_$prolog_impl_flag_3_s5 = S( FUNCTOR_changeable_1 ,  ATOM_no );
        final static SymbolTerm ATOM_min_integer = SYM("min_integer");
        final static SymbolTerm ATOM_on = SYM("on");
        final static SymbolTerm ATOM_off = SYM("off");
    private static final ListTerm L_$prolog_impl_flag_3_s11 = CONS( ATOM_off ,  Prolog.Nil );
    private static final ListTerm L_$prolog_impl_flag_3_s12 = CONS( ATOM_on , L_$prolog_impl_flag_3_s11);
        final static SymbolTerm ATOM_yes = SYM("yes");
    private static final StructureTerm L_$prolog_impl_flag_3_s15 = S( FUNCTOR_changeable_1 ,  ATOM_yes );
        final static SymbolTerm ATOM_max_arity = SYM("max_arity");
        final static SymbolTerm ATOM_unknown = SYM("unknown");
        final static SymbolTerm ATOM_error = SYM("error");
        final static SymbolTerm ATOM_fail = SYM("fail");
        final static SymbolTerm ATOM_warning = SYM("warning");
    private static final ListTerm L_$prolog_impl_flag_3_s21 = CONS( ATOM_warning ,  Prolog.Nil );
    private static final ListTerm L_$prolog_impl_flag_3_s22 = CONS( ATOM_fail , L_$prolog_impl_flag_3_s21);
    private static final ListTerm L_$prolog_impl_flag_3_s23 = CONS( ATOM_error , L_$prolog_impl_flag_3_s22);
        final static SymbolTerm ATOM_double_quotes = SYM("double_quotes");
        final static SymbolTerm ATOM_chars = SYM("chars");
        final static SymbolTerm ATOM_codes = SYM("codes");
    private static final ListTerm L_$prolog_impl_flag_3_s28 = CONS( ATOM_atom ,  Prolog.Nil );
    private static final ListTerm L_$prolog_impl_flag_3_s29 = CONS( ATOM_codes , L_$prolog_impl_flag_3_s28);
    private static final ListTerm L_$prolog_impl_flag_3_s30 = CONS( ATOM_chars , L_$prolog_impl_flag_3_s29);
        final static SymbolTerm ATOM_print_stack_trace = SYM("print_stack_trace");




    public static Operation PRED_$prolog_impl_flag_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$prolog_impl_flag_3_var, fail_0, fail_0, FILE_builtins::$prolog_impl_flag_3_var, fail_0, fail_0); 
    }

    private final static Operation $prolog_impl_flag_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$prolog_impl_flag_3_var_1);
        return $prolog_impl_flag_3_1(m);
    }

    private final static Operation $prolog_impl_flag_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$prolog_impl_flag_3_var_2);
        return $prolog_impl_flag_3_2(m);
    }

    private final static Operation $prolog_impl_flag_3_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$prolog_impl_flag_3_var_3);
        return $prolog_impl_flag_3_3(m);
    }

    private final static Operation $prolog_impl_flag_3_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$prolog_impl_flag_3_var_4);
        return $prolog_impl_flag_3_4(m);
    }

    private final static Operation $prolog_impl_flag_3_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$prolog_impl_flag_3_var_5);
        return $prolog_impl_flag_3_5(m);
    }

    private final static Operation $prolog_impl_flag_3_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$prolog_impl_flag_3_var_6);
        return $prolog_impl_flag_3_6(m);
    }

    private final static Operation $prolog_impl_flag_3_var_6(Prolog m) { 
        m.trust(null);
        return $prolog_impl_flag_3_7(m);
    }

    private final static Operation $prolog_impl_flag_3_1(Prolog m) { 
    // '$prolog_impl_flag'(max_integer,A,changeable(no)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$prolog_impl_flag'(max_integer,A,changeable(no)):-[]
        if (!  ATOM_max_integer .unify(a1, m.trail))
            return m.fail();
        if (! L_$prolog_impl_flag_3_s5.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $prolog_impl_flag_3_2(Prolog m) { 
    // '$prolog_impl_flag'(min_integer,A,changeable(no)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$prolog_impl_flag'(min_integer,A,changeable(no)):-[]
        if (!  ATOM_min_integer .unify(a1, m.trail))
            return m.fail();
        if (! L_$prolog_impl_flag_3_s5.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $prolog_impl_flag_3_3(Prolog m) { 
    // '$prolog_impl_flag'(debug,[on,off],changeable(yes)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$prolog_impl_flag'(debug,[on,off],changeable(yes)):-[]
        if (!  ATOM_debug .unify(a1, m.trail))
            return m.fail();
        if (! L_$prolog_impl_flag_3_s12.unify(a2, m.trail))
            return m.fail();
        if (! L_$prolog_impl_flag_3_s15.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $prolog_impl_flag_3_4(Prolog m) { 
    // '$prolog_impl_flag'(max_arity,A,changeable(no)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$prolog_impl_flag'(max_arity,A,changeable(no)):-[]
        if (!  ATOM_max_arity .unify(a1, m.trail))
            return m.fail();
        if (! L_$prolog_impl_flag_3_s5.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $prolog_impl_flag_3_5(Prolog m) { 
    // '$prolog_impl_flag'(unknown,[error,fail,warning],changeable(yes)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$prolog_impl_flag'(unknown,[error,fail,warning],changeable(yes)):-[]
        if (!  ATOM_unknown .unify(a1, m.trail))
            return m.fail();
        if (! L_$prolog_impl_flag_3_s23.unify(a2, m.trail))
            return m.fail();
        if (! L_$prolog_impl_flag_3_s15.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $prolog_impl_flag_3_6(Prolog m) { 
    // '$prolog_impl_flag'(double_quotes,[chars,codes,atom],changeable(no)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$prolog_impl_flag'(double_quotes,[chars,codes,atom],changeable(no)):-[]
        if (!  ATOM_double_quotes .unify(a1, m.trail))
            return m.fail();
        if (! L_$prolog_impl_flag_3_s30.unify(a2, m.trail))
            return m.fail();
        if (! L_$prolog_impl_flag_3_s5.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $prolog_impl_flag_3_7(Prolog m) { 
    // '$prolog_impl_flag'(print_stack_trace,[on,off],changeable(yes)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$prolog_impl_flag'(print_stack_trace,[on,off],changeable(yes)):-[]
        if (!  ATOM_print_stack_trace .unify(a1, m.trail))
            return m.fail();
        if (! L_$prolog_impl_flag_3_s12.unify(a2, m.trail))
            return m.fail();
        if (! L_$prolog_impl_flag_3_s15.unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: halt/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(halt/0,public)




    public static Operation PRED_halt_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // halt:-halt(0)
        m.setB0();
    // halt:-[halt(0)]
        return //
 Op(FILE_system::PRED_halt_1_static_exec, VA( int_0 ), cont);
    }
/** PREDICATE: abort/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(abort/0,public)
        final static SymbolTerm ATOM_Execution$0020aborted = SYM("Execution aborted");




    public static Operation PRED_abort_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // abort:-raise_exception('Execution aborted')
        m.setB0();
    // abort:-[raise_exception('Execution aborted')]
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA( ATOM_Execution$0020aborted ), cont);
    }
/** PREDICATE: C/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('C'/3,public)




    public static Operation PRED_C_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // 'C'([A|B],A,B):-true
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // 'C'([A|B],A,B):-[]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        if (! a5.unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: expand_term/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(expand_term/2,public)




    public static Operation PRED_expand_term_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::expand_term_2_sub_1);
        return expand_term_2_1(m);
    }

    private final static Operation expand_term_2_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::expand_term_2_sub_2);
        return expand_term_2_2(m);
    }

    private final static Operation expand_term_2_sub_2(Prolog m) { 
        m.trust(null);
        return expand_term_2_3(m);
    }

    private final static Operation expand_term_2_1(Prolog m) { 
    // expand_term(A,B):-var(A),!,A=B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // expand_term(A,B):-['$get_level'(C),var(A),'$cut'(C),'$unify'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(1),a(2))
        if (! a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation expand_term_2_2(Prolog m) { 
    // expand_term(A,B):-'$dcg_expansion'(A,C),!,C=B
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // expand_term(A,B):-['$get_level'(C),'$dcg_expansion'(A,D),'$cut'(C),'$unify'(D,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$dcg_expansion_2_static_exec, VA(a1, a4), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a4, a2), cont)));
    }

    private final static Operation expand_term_2_3(Prolog m) { 
    // expand_term(A,A):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // expand_term(A,A):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $dcg_expansion/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dcg_expansion'/2,non-(public))
        final static SymbolTerm FUNCTOR_$002D$002D$003E_2 = F("-->",2);




    public static Operation PRED_$dcg_expansion_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$dcg_expansion_2_var, FILE_builtins::$dcg_expansion_2_1, FILE_builtins::$dcg_expansion_2_1, FILE_builtins::$dcg_expansion_2_1, FILE_builtins::$dcg_expansion_2_var, FILE_builtins::$dcg_expansion_2_1); 
    }

    private final static Operation $dcg_expansion_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::$dcg_expansion_2_var_1);
        return $dcg_expansion_2_1(m);
    }

    private final static Operation $dcg_expansion_2_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_expansion_2_var_2);
        return $dcg_expansion_2_2(m);
    }

    private final static Operation $dcg_expansion_2_var_2(Prolog m) { 
        m.trust(null);
        return $dcg_expansion_2_3(m);
    }

    private final static Operation $dcg_expansion_2_1(Prolog m) { 
    // '$dcg_expansion'(A,B):-var(A),!,A=B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dcg_expansion'(A,B):-['$get_level'(C),var(A),'$cut'(C),'$unify'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(1),a(2))
        if (! a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dcg_expansion_2_2(Prolog m) { 
    // '$dcg_expansion'((A-->B),(C:-D,E)):-nonvar(A),A=(F,G),G=[H|I],!,'$dcg_translation_atom'(F,C,J,K),'$dcg_translation'(B,D,J,L),'$dcg_translation'(G,E,K,L)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dcg_expansion'((A-->B),(C:-D,E)):-['$get_level'(F),nonvar(A),'$unify'(A,(G,H)),'$unify'(H,[I|J]),'$cut'(F),'$dcg_translation_atom'(G,C,K,L),'$dcg_translation'(B,D,K,M),'$dcg_translation'(H,E,L,M)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D$002D$003E_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002C_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(3))
        a3 = a3.dref();
        if ((a3 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        a11 = m.mkvar1();
    // put_str_args([a(10),a(11)],y(1)),put_str(@('FUNCTOR_$002C_2'),y(1),a(12))
        a12 =  S( FUNCTOR_$002C_2 , a10, a11);
 ;
        //START inline expansion of $unify(a(3),a(12))
        if (! a3.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a13 = CONS(m.DONT_CARE1(), m.DONT_CARE1());
        //START inline expansion of $unify(a(11),a(13))
        if (! a11.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(9))
        a9 = a9.dref();
                  m.cut( a9.intValue());
        //END inline expansion
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$dcg_translation_atom_4_static_exec, VA(a10, a5, a14, a15), //
 Op(FILE_system::PRED_$dcg_translation_4_static_exec, VA(a4, a7, a14, a16), //
 Op(FILE_system::PRED_$dcg_translation_4_static_exec, VA(a11, a8, a15, a16), cont)));
    }

    private final static Operation $dcg_expansion_2_3(Prolog m) { 
    // '$dcg_expansion'((A-->B),(C:-D)):-'$dcg_translation_atom'(A,C,E,F),'$dcg_translation'(B,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dcg_expansion'((A-->B),(C:-D)):-['$dcg_translation_atom'(A,C,E,F),'$dcg_translation'(B,D,E,F)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D$002D$003E_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$dcg_translation_atom_4_static_exec, VA(a3, a5, a7, a8), //
 Op(FILE_system::PRED_$dcg_translation_4_static_exec, VA(a4, a6, a7, a8), cont));
    }
/** PREDICATE: $dcg_translation_atom/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dcg_translation_atom'/4,non-(public))
        final static SymbolTerm FUNCTOR_phrase_3 = F("phrase",3);




    public static Operation PRED_$dcg_translation_atom_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $dcg_translation_atom_4_top(m);
    }

    private final static Operation $dcg_translation_atom_4_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$dcg_translation_atom_4_var, FILE_builtins::$dcg_translation_atom_4_int, FILE_builtins::$dcg_translation_atom_4_int, FILE_builtins::$dcg_translation_atom_4_int, FILE_builtins::$dcg_translation_atom_4_var, FILE_builtins::$dcg_translation_atom_4_int); 
    }

    private final static Operation $dcg_translation_atom_4_var(Prolog m) { 
        m.jtry4(null, FILE_builtins::$dcg_translation_atom_4_var_1);
        return $dcg_translation_atom_4_1(m);
    }

    private final static Operation $dcg_translation_atom_4_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_translation_atom_4_var_2);
        return $dcg_translation_atom_4_2(m);
    }

    private final static Operation $dcg_translation_atom_4_var_2(Prolog m) { 
        m.trust(null);
        return $dcg_translation_atom_4_3(m);
    }

    private final static Operation $dcg_translation_atom_4_int(Prolog m) { 
        m.jtry4(null, FILE_builtins::$dcg_translation_atom_4_int_1);
        return $dcg_translation_atom_4_1(m);
    }

    private final static Operation $dcg_translation_atom_4_int_1(Prolog m) { 
        m.trust(null);
        return $dcg_translation_atom_4_3(m);
    }

    private final static Operation $dcg_translation_atom_4_1(Prolog m) { 
    // '$dcg_translation_atom'(A,phrase(A,B,C),B,C):-var(A),!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dcg_translation_atom'(A,phrase(A,B,C),B,C):-['$get_level'(D),var(A),'$cut'(D)]
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_phrase_3 , m.trail, a1, a5, a6)){
                return m.fail();
            }
        if (! a5.unify(a3, m.trail))
            return m.fail();
        if (! a6.unify(a4, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $dcg_translation_atom_4_2(Prolog m) { 
    // '$dcg_translation_atom'(A:B,A:C,D,E):-!,'$dcg_translation_atom'(B,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dcg_translation_atom'(A:B,A:C,D,E):-['$neck_cut','$dcg_translation_atom'(B,C,D,E)]
        a1 = a1.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a2 = a2.dref();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_module_colon_2 , m.trail, a5, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a6;
        m.AREGS[1] = a7;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
m.cont = cont;
        return $dcg_translation_atom_4_top(m);
    }

    private final static Operation $dcg_translation_atom_4_3(Prolog m) { 
    // '$dcg_translation_atom'(A,B,C,D):-A=..[E|F],'$builtin_append'(F,[C,D],G),B=..[E|G]
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dcg_translation_atom'(A,B,C,D):-['$univ'(A,[E|F]),'$builtin_append'(F,[C,D],G),'$univ'(B,[E|G])]
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = CONS(a5, a6);
        a8 = CONS(a4,  Prolog.Nil );
        a9 = CONS(a3, a8);
        a10 = m.mkvar1();
        a11 = CONS(a5, a10);
        return //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a1, a7), //
 Op(FILE_system::PRED_$builtin_append_3_static_exec, VA(a6, a9, a10), //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a2, a11), cont)));
    }
/** PREDICATE: $dcg_translation/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dcg_translation'/4,non-(public))




    public static Operation PRED_$dcg_translation_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$dcg_translation'(A,B,C,D):-'$dcg_trans'(A,E,F,C,D),'$dcg_trans0'(E,B,F,C,D)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // '$dcg_translation'(A,B,C,D):-['$dcg_trans'(A,E,F,C,D),'$dcg_trans0'(E,B,F,C,D)]
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$dcg_trans_5_static_exec, VA(a1, a5, a6, a3, a4), //
 Op(FILE_system::PRED_$dcg_trans0_5_static_exec, VA(a5, a2, a6, a3, a4), cont));
    }
/** PREDICATE: $dcg_trans0/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dcg_trans0'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$dcg_trans0_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_builtins::$dcg_trans0_5_sub_1);
        return $dcg_trans0_5_1(m);
    }

    private final static Operation $dcg_trans0_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dcg_trans0_5_2(m);
    }

    private final static Operation $dcg_trans0_5_1(Prolog m) { 
    // '$dcg_trans0'(A,A,B,C,B):-B\==C,!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans0'(A,A,B,C,B):-['$get_level'(D),'$inequality_of_term'(B,C),'$cut'(D)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a5, m.trail))
            return m.fail();
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $inequality_of_term(a(3),a(4))
        a3 = a3.dref();
        a4 = a4.dref();
        if (a3.equalsTerm(a4)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $dcg_trans0_5_2(Prolog m) { 
    // '$dcg_trans0'(A,B,C,D,E):-'$dcg_concat'(A,E=C,B)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans0'(A,B,C,D,E):-['$dcg_concat'(A,E=C,B)]
    // put_str_args([a(5),a(3)],y(1)),put_str(@('FUNCTOR_$003D_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$003D_2 , a5, a3);
 ;
        return //
 Op(FILE_system::PRED_$dcg_concat_3_static_exec, VA(a1, a6, a2), cont);
    }
/** PREDICATE: $dcg_concat/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dcg_concat'/3,non-(public))




    public static Operation PRED_$dcg_concat_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$dcg_concat_3_sub_1);
        return $dcg_concat_3_1(m);
    }

    private final static Operation $dcg_concat_3_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_concat_3_sub_2);
        return $dcg_concat_3_2(m);
    }

    private final static Operation $dcg_concat_3_sub_2(Prolog m) { 
        m.trust(null);
        return $dcg_concat_3_3(m);
    }

    private final static Operation $dcg_concat_3_1(Prolog m) { 
    // '$dcg_concat'(A,B,C):-A==true,!,C=B
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dcg_concat'(A,B,C):-['$get_level'(D),'$equality_of_term'(A,true),'$cut'(D),'$unify'(C,B)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),@(Prolog.True))
        a1 = a1.dref();
        if (! a1.equalsTerm(Prolog.True)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(3),a(2))
        if (! a3.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dcg_concat_3_2(Prolog m) { 
    // '$dcg_concat'(A,B,C):-B==true,!,C=A
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dcg_concat'(A,B,C):-['$get_level'(D),'$equality_of_term'(B,true),'$cut'(D),'$unify'(C,A)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(2),@(Prolog.True))
        a2 = a2.dref();
        if (! a2.equalsTerm(Prolog.True)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(3),a(1))
        if (! a3.unify(a1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dcg_concat_3_3(Prolog m) { 
    // '$dcg_concat'(A,B,(A,B)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dcg_concat'(A,B,(A,B)):-[]
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_$002C_2 , m.trail, a1, a2)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: $dcg_trans/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dcg_trans'/5,non-(public))
        final static SymbolTerm FUNCTOR_C_3 = F("C",3);

    // private final Term arg5;




    public static Operation PRED_$dcg_trans_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $dcg_trans_5_top(m);
    }

    private final static Operation $dcg_trans_5_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$dcg_trans_5_var, FILE_builtins::$dcg_trans_5_int, FILE_builtins::$dcg_trans_5_int, FILE_builtins::$dcg_trans_5_con, FILE_builtins::$dcg_trans_5_str, FILE_builtins::$dcg_trans_5_lis); 
    }

    private final static Operation $dcg_trans_5_var(Prolog m) { 
        m.jtry5(null, FILE_builtins::$dcg_trans_5_var_1);
        return $dcg_trans_5_1(m);
    }

    private final static Operation $dcg_trans_5_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_var_2);
        return $dcg_trans_5_2(m);
    }

    private final static Operation $dcg_trans_5_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_var_3);
        return $dcg_trans_5_3(m);
    }

    private final static Operation $dcg_trans_5_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_var_4);
        return $dcg_trans_5_4(m);
    }

    private final static Operation $dcg_trans_5_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_var_5);
        return $dcg_trans_5_5(m);
    }

    private final static Operation $dcg_trans_5_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_var_6);
        return $dcg_trans_5_6(m);
    }

    private final static Operation $dcg_trans_5_var_6(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_var_7);
        return $dcg_trans_5_7(m);
    }

    private final static Operation $dcg_trans_5_var_7(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_var_8);
        return $dcg_trans_5_8(m);
    }

    private final static Operation $dcg_trans_5_var_8(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_var_9);
        return $dcg_trans_5_9(m);
    }

    private final static Operation $dcg_trans_5_var_9(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_var_10);
        return $dcg_trans_5_10(m);
    }

    private final static Operation $dcg_trans_5_var_10(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_var_11);
        return $dcg_trans_5_11(m);
    }

    private final static Operation $dcg_trans_5_var_11(Prolog m) { 
        m.trust(null);
        return $dcg_trans_5_12(m);
    }

    private final static Operation $dcg_trans_5_int(Prolog m) { 
        m.jtry5(null, FILE_builtins::$dcg_trans_5_int_1);
        return $dcg_trans_5_1(m);
    }

    private final static Operation $dcg_trans_5_int_1(Prolog m) { 
        m.trust(null);
        return $dcg_trans_5_12(m);
    }

    private final static Operation $dcg_trans_5_con(Prolog m) { 
        m.jtry5(null, FILE_builtins::$dcg_trans_5_con_1);
        return $dcg_trans_5_1(m);
    }

    private final static Operation $dcg_trans_5_con_1(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_con_2);
        return $dcg_trans_5_3(m);
    }

    private final static Operation $dcg_trans_5_con_2(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_con_3);
        return $dcg_trans_5_9(m);
    }

    private final static Operation $dcg_trans_5_con_3(Prolog m) { 
        m.trust(null);
        return $dcg_trans_5_12(m);
    }

    private final static Operation $dcg_trans_5_str(Prolog m) { 
        m.jtry5(null, FILE_builtins::$dcg_trans_5_str_1);
        return $dcg_trans_5_1(m);
    }

    private final static Operation $dcg_trans_5_str_1(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_str_2);
        return $dcg_trans_5_2(m);
    }

    private final static Operation $dcg_trans_5_str_2(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_str_3);
        return $dcg_trans_5_5(m);
    }

    private final static Operation $dcg_trans_5_str_3(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_str_4);
        return $dcg_trans_5_6(m);
    }

    private final static Operation $dcg_trans_5_str_4(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_str_5);
        return $dcg_trans_5_7(m);
    }

    private final static Operation $dcg_trans_5_str_5(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_str_6);
        return $dcg_trans_5_8(m);
    }

    private final static Operation $dcg_trans_5_str_6(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_str_7);
        return $dcg_trans_5_10(m);
    }

    private final static Operation $dcg_trans_5_str_7(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_str_8);
        return $dcg_trans_5_11(m);
    }

    private final static Operation $dcg_trans_5_str_8(Prolog m) { 
        m.trust(null);
        return $dcg_trans_5_12(m);
    }

    private final static Operation $dcg_trans_5_lis(Prolog m) { 
        m.jtry5(null, FILE_builtins::$dcg_trans_5_lis_1);
        return $dcg_trans_5_1(m);
    }

    private final static Operation $dcg_trans_5_lis_1(Prolog m) { 
        m.retry(null, FILE_builtins::$dcg_trans_5_lis_2);
        return $dcg_trans_5_4(m);
    }

    private final static Operation $dcg_trans_5_lis_2(Prolog m) { 
        m.trust(null);
        return $dcg_trans_5_12(m);
    }

    private final static Operation $dcg_trans_5_1(Prolog m) { 
    // '$dcg_trans'(A,B,C,D,C):-var(A),!,'$dcg_translation_atom'(A,B,D,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'(A,B,C,D,C):-['$get_level'(E),var(A),'$cut'(E),'$dcg_translation_atom'(A,B,D,C)]
        if (! a3.unify(a5, m.trail))
            return m.fail();
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dcg_translation_atom_4_static_exec, VA(a1, a2, a4, a3), cont);
    }

    private final static Operation $dcg_trans_5_2(Prolog m) { 
    // '$dcg_trans'(A:B,A:C,D,E,F):-!,'$dcg_trans'(B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'(A:B,A:C,D,E,F):-['$neck_cut','$dcg_trans'(B,C,D,E,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a2 = a2.dref();
            a8 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_module_colon_2 , m.trail, a6, a8)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a7;
        m.AREGS[1] = a8;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
m.cont = cont;
        return $dcg_trans_5_top(m);
    }

    private final static Operation $dcg_trans_5_3(Prolog m) { 
    // '$dcg_trans'([],true,A,A,B):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'([],true,A,A,B):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.True .unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $dcg_trans_5_4(Prolog m) { 
    // '$dcg_trans'([A|B],C,D,E,F):-!,'$dcg_trans'(B,G,D,H,F),'$dcg_concat'('C'(E,A,H),G,C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'([A|B],C,D,E,F):-['$neck_cut','$dcg_trans'(B,G,D,H,F),'$dcg_concat'('C'(E,A,H),G,C)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a6 = a1.car();
            a7 = a1.cdr();
        } else if (a1.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a1.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([a(4),a(6),a(9)],y(1)),put_str(@('FUNCTOR_C_3'),y(1),a(10))
        a10 =  S( FUNCTOR_C_3 , a4, a6, a9);
 ;
        p1 = //
 Op(FILE_system::PRED_$dcg_concat_3_static_exec, VA(a10, a8, a2), cont);
        m.AREGS[0] = a7;
        m.AREGS[1] = a8;
        m.AREGS[2] = a3;
        m.AREGS[3] = a9;
        m.AREGS[4] = a5;
        m.cont = p1;
        return $dcg_trans_5_top(m);
    }

    private final static Operation $dcg_trans_5_5(Prolog m) { 
    // '$dcg_trans'(\+A,(B->fail;C=D),C,D,C):-!,'$dcg_trans'(A,B,E,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'(\+A,(B->fail;C=D),C,D,C):-['$neck_cut','$dcg_trans'(A,B,E,D,E)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$005C$002B_1 , m.trail, a6)){
                return m.fail();
            }
        a2 = a2.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_or_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a9,  ATOM_fail )){
                return m.fail();
            }
        a8 = a8.dref();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_$003D_2 , m.trail, a10, a11)){
                return m.fail();
            }
        if (! a10.unify(a3, m.trail))
            return m.fail();
        if (! a11.unify(a4, m.trail))
            return m.fail();
        if (! a10.unify(a5, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a12 = m.mkvar1();
        m.AREGS[0] = a6;
        m.AREGS[1] = a9;
        m.AREGS[2] = a12;
        m.AREGS[3] = a11;
        m.AREGS[4] = a12;
m.cont = cont;
        return $dcg_trans_5_top(m);
    }

    private final static Operation $dcg_trans_5_6(Prolog m) { 
    // '$dcg_trans'((A,B),C,D,E,F):-!,'$dcg_trans'(A,G,H,E,H),'$dcg_trans'(B,I,D,H,F),'$dcg_concat'(G,I,C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'((A,B),C,D,E,F):-['$neck_cut','$dcg_trans'(A,G,H,E,H),'$dcg_trans'(B,I,D,H,F),'$dcg_concat'(G,I,C)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002C_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        p2 = //
 Op(FILE_system::PRED_$dcg_trans_5_static_exec, VA(a7, a10, a3, a9, a5), //
 Op(FILE_system::PRED_$dcg_concat_3_static_exec, VA(a8, a10, a2), cont));
        m.AREGS[0] = a6;
        m.AREGS[1] = a8;
        m.AREGS[2] = a9;
        m.AREGS[3] = a4;
        m.AREGS[4] = a9;
        m.cont = p2;
        return $dcg_trans_5_top(m);
    }

    private final static Operation $dcg_trans_5_7(Prolog m) { 
    // '$dcg_trans'((A->B),(C->D),E,F,G):-!,'$dcg_trans'(A,C,H,F,H),'$dcg_trans'(B,D,E,H,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'((A->B),(C->D),E,F,G):-['$neck_cut','$dcg_trans'(A,C,H,F,H),'$dcg_trans'(B,D,E,H,G)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a2 = a2.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a8, a9)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a10 = m.mkvar1();
        p1 = //
 Op(FILE_system::PRED_$dcg_trans_5_static_exec, VA(a7, a9, a3, a10, a5), cont);
        m.AREGS[0] = a6;
        m.AREGS[1] = a8;
        m.AREGS[2] = a10;
        m.AREGS[3] = a4;
        m.AREGS[4] = a10;
        m.cont = p1;
        return $dcg_trans_5_top(m);
    }

    private final static Operation $dcg_trans_5_8(Prolog m) { 
    // '$dcg_trans'((A;B),(C;D),E,F,E):-!,'$dcg_translation'(A,C,F,E),'$dcg_translation'(B,D,F,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'((A;B),(C;D),E,F,E):-['$neck_cut','$dcg_translation'(A,C,F,E),'$dcg_translation'(B,D,F,E)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_or_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a2 = a2.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_or_2 , m.trail, a8, a9)){
                return m.fail();
            }
        if (! a3.unify(a5, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dcg_translation_4_static_exec, VA(a6, a8, a4, a3), //
 Op(FILE_system::PRED_$dcg_translation_4_static_exec, VA(a7, a9, a4, a3), cont));
    }

    private final static Operation $dcg_trans_5_9(Prolog m) { 
    // '$dcg_trans'(!,!,A,A,B):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'(!,!,A,A,B):-['$neck_cut']
        if (!  ATOM_$0021 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_$0021 .unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $dcg_trans_5_10(Prolog m) { 
    // '$dcg_trans'({A},call(A),B,B,C):-var(A),!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'({A},call(A),B,B,C):-['$get_level'(D),var(A),'$cut'(D)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$007B$007D_1 , m.trail, a6)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_call_1 , m.trail, a6)){
                return m.fail();
            }
        if (! a3.unify(a4, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(6))
        a6 = a6.dref();
        if (! (a6 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $dcg_trans_5_11(Prolog m) { 
    // '$dcg_trans'({A},A,B,B,C):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'({A},A,B,B,C):-['$neck_cut']
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$007B$007D_1 , m.trail, a6)){
                return m.fail();
            }
        if (! a6.unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $dcg_trans_5_12(Prolog m) { 
    // '$dcg_trans'(A,B,C,D,C):-'$dcg_translation_atom'(A,B,D,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dcg_trans'(A,B,C,D,C):-['$dcg_translation_atom'(A,B,D,C)]
        if (! a3.unify(a5, m.trail))
            return m.fail();
        return //
 Op(FILE_system::PRED_$dcg_translation_atom_4_static_exec, VA(a1, a2, a4, a3), cont);
    }
/** PREDICATE: new_hash/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(new_hash/1,public)




    public static Operation PRED_new_hash_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // new_hash(A):-new_hash(A,[])
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // new_hash(A):-[new_hash(A,[])]
        return //
 Op(FILE_system::PRED_new_hash_2_static_exec, VA(a1,  Prolog.Nil ), cont);
    }
/** PREDICATE: hash_map/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(hash_map/2,public)




    public static Operation PRED_hash_map_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // hash_map(A,B):-hash_keys(A,C),sort(C,D),hash_map(D,B,A)
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
    // hash_map(A,B):-[hash_keys(A,C),sort(C,D),hash_map(D,B,A)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_hash_keys_2_static_exec, VA(a1, a3), //
 Op(FILE_system::PRED_sort_2_static_exec, VA(a3, a4), //
 Op(FILE_system::PRED_hash_map_3_static_exec, VA(a4, a2, a1), cont)));
    }
/** PREDICATE: hash_map/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(hash_map/3,non-(public))




    public static Operation PRED_hash_map_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::hash_map_3_var, fail_0, fail_0, FILE_builtins::hash_map_3_1, fail_0, FILE_builtins::hash_map_3_2); 
    }

    private final static Operation hash_map_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::hash_map_3_var_1);
        return hash_map_3_1(m);
    }

    private final static Operation hash_map_3_var_1(Prolog m) { 
        m.trust(null);
        return hash_map_3_2(m);
    }

    private final static Operation hash_map_3_1(Prolog m) { 
    // hash_map([],[],A):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // hash_map([],[],A):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation hash_map_3_2(Prolog m) { 
    // hash_map([A|B],[(A,C)|D],E):-hash_get(E,A,C),hash_map(B,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // hash_map([A|B],[(A,C)|D],E):-[hash_get(E,A,C),hash_map(B,D,E)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002C_2 , m.trail, a4, a8)){
                return m.fail();
            }
        return //
 Op(FILE_system::PRED_hash_get_3_static_exec, VA(a3, a4, a8), //
 Op(FILE_system::PRED_hash_map_3_static_exec, VA(a5, a7, a3), cont));
    }
/** PREDICATE: hash_exists/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(hash_exists/1,public)




    public static Operation PRED_hash_exists_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // hash_exists(A):-atom(A),'$get_hash_manager'(B),hash_contains_key(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // hash_exists(A):-[atom(A),'$get_hash_manager'(B),hash_contains_key(B,A)]
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        a2 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$get_hash_manager_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_hash_contains_key_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: consult_stream/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(consult_stream/2,non-(public))




    public static Operation PRED_consult_stream_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // consult_stream(A,B):-'$consult_init'(A),repeat,read(B,C),'$consult_clause'(C),C==end_of_file,!
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2, p3, p4, p5;
        a1 = LARG[0];
        a2 = LARG[1];
    // consult_stream(A,B):-['$get_level'(C),'$consult_init'(A),repeat,read(B,D),'$consult_clause'(D),'$equality_of_term'(D,end_of_file),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$consult_init_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_repeat_0_static_exec, VA(), //
 Op(FILE_system::PRED_read_2_static_exec, VA(a2, a4), //
 Op(FILE_system::PRED_$consult_clause_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$equality_of_term_2_static_exec, VA(a4,  ATOM_end_of_file ), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), cont))))));
    }
/** PREDICATE: $consult_init/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$consult_init'/1,non-(public))
        final static SymbolTerm FUNCTOR_$0024consulted_file_1 = F("$consulted_file",1);
        final static SymbolTerm FUNCTOR_$0024consulted_package_1 = F("$consulted_package",1);
        final static SymbolTerm FUNCTOR_$0024consulted_import_2 = F("$consulted_import",2);
        final static SymbolTerm FUNCTOR_$0024consulted_predicate_3 = F("$consulted_predicate",3);
    private static final StructureTerm L_$consult_init_1_s9 = S( FUNCTOR_$0024consulted_package_1 ,  ATOM_user );
    private static final StructureTerm L_$consult_init_1_s11 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$consult_init_1_s9);




    public static Operation PRED_$consult_init_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$consult_init_1_sub_1);
        return $consult_init_1_1(m);
    }

    private final static Operation $consult_init_1_sub_1(Prolog m) { 
        m.trust(null);
        return $consult_init_1_2(m);
    }

    private final static Operation $consult_init_1_1(Prolog m) { 
    // '$consult_init'(A):-retractall('$consulted_file'(B)),retractall('$consulted_package'(C)),retractall('$consulted_import'(A,D)),retract('$consulted_predicate'(E,F,A)),abolish(E:F),fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_init'(A):-[retractall('SxxMachine':'$consulted_file'(B)),retractall('SxxMachine':'$consulted_package'(C)),retractall('SxxMachine':'$consulted_import'(A,D)),retract('SxxMachine':'$consulted_predicate'(E,F,A)),abolish(E:F),fail]
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_$0024consulted_file_1'),y(1),a(2))
        a2 =  S( FUNCTOR_$0024consulted_file_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
    // put_str_args([void],y(3)),put_str(@('FUNCTOR_$0024consulted_package_1'),y(3),a(4))
        a4 =  S( FUNCTOR_$0024consulted_package_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
    // put_str_args([a(1),void],y(5)),put_str(@('FUNCTOR_$0024consulted_import_2'),y(5),a(6))
        a6 =  S( FUNCTOR_$0024consulted_import_2 , a1, m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(6)],y(6)),put_str(@('FUNCTOR_module_colon_2'),y(6),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a6);
 ;
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([a(8),a(9),a(1)],y(7)),put_str(@('FUNCTOR_$0024consulted_predicate_3'),y(7),a(10))
        a10 =  S( FUNCTOR_$0024consulted_predicate_3 , a8, a9, a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(10)],y(8)),put_str(@('FUNCTOR_module_colon_2'),y(8),a(11))
        a11 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a10);
 ;
    // put_str_args([a(8),a(9)],y(9)),put_str(@('FUNCTOR_module_colon_2'),y(9),a(12))
        a12 =  S( FUNCTOR_module_colon_2 , a8, a9);
 ;
        return //
 Op(FILE_system::PRED_retractall_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_retractall_1_static_exec, VA(a5), //
 Op(FILE_system::PRED_retractall_1_static_exec, VA(a7), //
 Op(FILE_system::PRED_retract_1_static_exec, VA(a11), //
 Op(FILE_system::PRED_abolish_1_static_exec, VA(a12), fail_0)))));
    }

    private final static Operation $consult_init_1_2(Prolog m) { 
    // '$consult_init'(A):-assertz('$consulted_file'(A)),assertz('$consulted_package'(user))
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_init'(A):-[assertz('SxxMachine':'$consulted_file'(A)),assertz('SxxMachine':'$consulted_package'(user))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_$0024consulted_file_1'),y(1),a(2))
        a2 =  S( FUNCTOR_$0024consulted_file_1 , a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$consult_init_1_s11), cont));
    }
/** PREDICATE: $consult_clause/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$consult_clause'/1,non-(public))
        final static SymbolTerm FUNCTOR_$003A$002D_1 = F(":-",1);
        final static SymbolTerm FUNCTOR_module_2 = F("module",2);
        final static SymbolTerm FUNCTOR_package_1 = F("package",1);
        final static SymbolTerm FUNCTOR_import_1 = F("import",1);
        final static SymbolTerm FUNCTOR_dynamic_1 = F("dynamic",1);
        final static SymbolTerm FUNCTOR_public_1 = F("public",1);
        final static SymbolTerm FUNCTOR_meta_predicate_1 = F("meta_predicate",1);
        final static SymbolTerm FUNCTOR_mode_1 = F("mode",1);
        final static SymbolTerm FUNCTOR_multifile_1 = F("multifile",1);
        final static SymbolTerm FUNCTOR_block_1 = F("block",1);




    public static Operation PRED_$consult_clause_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$consult_clause_1_var, FILE_builtins::$consult_clause_1_12, FILE_builtins::$consult_clause_1_12, FILE_builtins::$consult_clause_1_con, FILE_builtins::$consult_clause_1_str, FILE_builtins::$consult_clause_1_12); 
    }

    private final static Operation $consult_clause_1_var(Prolog m) { 
        m.jtry1(null, FILE_builtins::$consult_clause_1_var_1);
        return $consult_clause_1_1(m);
    }

    private final static Operation $consult_clause_1_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_var_2);
        return $consult_clause_1_2(m);
    }

    private final static Operation $consult_clause_1_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_var_3);
        return $consult_clause_1_3(m);
    }

    private final static Operation $consult_clause_1_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_var_4);
        return $consult_clause_1_4(m);
    }

    private final static Operation $consult_clause_1_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_var_5);
        return $consult_clause_1_5(m);
    }

    private final static Operation $consult_clause_1_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_var_6);
        return $consult_clause_1_6(m);
    }

    private final static Operation $consult_clause_1_var_6(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_var_7);
        return $consult_clause_1_7(m);
    }

    private final static Operation $consult_clause_1_var_7(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_var_8);
        return $consult_clause_1_8(m);
    }

    private final static Operation $consult_clause_1_var_8(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_var_9);
        return $consult_clause_1_9(m);
    }

    private final static Operation $consult_clause_1_var_9(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_var_10);
        return $consult_clause_1_10(m);
    }

    private final static Operation $consult_clause_1_var_10(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_var_11);
        return $consult_clause_1_11(m);
    }

    private final static Operation $consult_clause_1_var_11(Prolog m) { 
        m.trust(null);
        return $consult_clause_1_12(m);
    }

    private final static Operation $consult_clause_1_con(Prolog m) { 
        m.jtry1(null, FILE_builtins::$consult_clause_1_con_1);
        return $consult_clause_1_1(m);
    }

    private final static Operation $consult_clause_1_con_1(Prolog m) { 
        m.trust(null);
        return $consult_clause_1_12(m);
    }

    private final static Operation $consult_clause_1_str(Prolog m) { 
        m.jtry1(null, FILE_builtins::$consult_clause_1_str_1);
        return $consult_clause_1_2(m);
    }

    private final static Operation $consult_clause_1_str_1(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_str_2);
        return $consult_clause_1_3(m);
    }

    private final static Operation $consult_clause_1_str_2(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_str_3);
        return $consult_clause_1_4(m);
    }

    private final static Operation $consult_clause_1_str_3(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_str_4);
        return $consult_clause_1_5(m);
    }

    private final static Operation $consult_clause_1_str_4(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_str_5);
        return $consult_clause_1_6(m);
    }

    private final static Operation $consult_clause_1_str_5(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_str_6);
        return $consult_clause_1_7(m);
    }

    private final static Operation $consult_clause_1_str_6(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_str_7);
        return $consult_clause_1_8(m);
    }

    private final static Operation $consult_clause_1_str_7(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_str_8);
        return $consult_clause_1_9(m);
    }

    private final static Operation $consult_clause_1_str_8(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_str_9);
        return $consult_clause_1_10(m);
    }

    private final static Operation $consult_clause_1_str_9(Prolog m) { 
        m.retry(null, FILE_builtins::$consult_clause_1_str_10);
        return $consult_clause_1_11(m);
    }

    private final static Operation $consult_clause_1_str_10(Prolog m) { 
        m.trust(null);
        return $consult_clause_1_12(m);
    }

    private final static Operation $consult_clause_1_1(Prolog m) { 
    // '$consult_clause'(end_of_file):-!
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'(end_of_file):-['$neck_cut']
        if (!  ATOM_end_of_file .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $consult_clause_1_2(Prolog m) { 
    // '$consult_clause'((:-module(A,B))):-!,'$assert_consulted_package'(A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'((:-module(A,B))):-['$neck_cut','$assert_consulted_package'(A)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_1 , m.trail, a2)){
                return m.fail();
            }
        a2 = a2.dref();
            a3 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_module_2 , m.trail, a3, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$assert_consulted_package_1_static_exec, VA(a3), cont);
    }

    private final static Operation $consult_clause_1_3(Prolog m) { 
    // '$consult_clause'((:-package A)):-!,'$assert_consulted_package'(A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'((:-package A)):-['$neck_cut','$assert_consulted_package'(A)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_1 , m.trail, a2)){
                return m.fail();
            }
        a2 = a2.dref();
            a3 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_package_1 , m.trail, a3)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$assert_consulted_package_1_static_exec, VA(a3), cont);
    }

    private final static Operation $consult_clause_1_4(Prolog m) { 
    // '$consult_clause'((:-import A)):-!,'$assert_consulted_import'(A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'((:-import A)):-['$neck_cut','$assert_consulted_import'(A)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_1 , m.trail, a2)){
                return m.fail();
            }
        a2 = a2.dref();
            a3 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_import_1 , m.trail, a3)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op(FILE_system::PRED_$assert_consulted_import_1_static_exec, VA(a3), cont);
    }

    private final static Operation $consult_clause_1_5(Prolog m) { 
    // '$consult_clause'((:-dynamic A)):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'((:-dynamic A)):-['$neck_cut']
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_1 , m.trail, a2)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_dynamic_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $consult_clause_1_6(Prolog m) { 
    // '$consult_clause'((:-public A)):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'((:-public A)):-['$neck_cut']
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_1 , m.trail, a2)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_public_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $consult_clause_1_7(Prolog m) { 
    // '$consult_clause'((:-meta_predicate A)):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'((:-meta_predicate A)):-['$neck_cut']
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_1 , m.trail, a2)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_meta_predicate_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $consult_clause_1_8(Prolog m) { 
    // '$consult_clause'((:-mode A)):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'((:-mode A)):-['$neck_cut']
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_1 , m.trail, a2)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_mode_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $consult_clause_1_9(Prolog m) { 
    // '$consult_clause'((:-multifile A)):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'((:-multifile A)):-['$neck_cut']
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_1 , m.trail, a2)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_multifile_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $consult_clause_1_10(Prolog m) { 
    // '$consult_clause'((:-block A)):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'((:-block A)):-['$neck_cut']
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_1 , m.trail, a2)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_block_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $consult_clause_1_11(Prolog m) { 
    // '$consult_clause'((:-A)):-!,clause('$consulted_package'(B),C),once(B:A)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'((:-A)):-['$neck_cut',clause('SxxMachine':'$consulted_package'(B),C),once(B:A)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a3 = m.mkvar1();
    // put_str_args([a(3)],y(1)),put_str(@('FUNCTOR_$0024consulted_package_1'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024consulted_package_1 , a3);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
    // put_str_args([a(3),a(2)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(6))
        a6 =  S( FUNCTOR_module_colon_2 , a3, a2);
 ;
        return //
 Op(FILE_system::PRED_clause_2_static_exec, VA(a5, m.DONT_CARE2()), //
 Op(FILE_system::PRED_once_1_static_exec, VA(a6), cont));
    }

    private final static Operation $consult_clause_1_12(Prolog m) { 
    // '$consult_clause'(A):-'$consult_preprocess'(A,B),'$consult_cls'(B)
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_clause'(A):-['$consult_preprocess'(A,B),'$consult_cls'(B)]
        a2 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$consult_preprocess_2_static_exec, VA(a1, a2), //
 Op(FILE_system::PRED_$consult_cls_1_static_exec, VA(a2), cont));
    }
/** PREDICATE: $assert_consulted_package/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$assert_consulted_package'/1,non-(public))




    public static Operation PRED_$assert_consulted_package_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$assert_consulted_package_1_sub_1);
        return $assert_consulted_package_1_1(m);
    }

    private final static Operation $assert_consulted_package_1_sub_1(Prolog m) { 
        m.trust(null);
        return $assert_consulted_package_1_2(m);
    }

    private final static Operation $assert_consulted_package_1_1(Prolog m) { 
    // '$assert_consulted_package'(A):-clause('$consulted_package'(A),B),!
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$assert_consulted_package'(A):-['$get_level'(B),clause('SxxMachine':'$consulted_package'(A),C),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_$0024consulted_package_1'),y(1),a(3))
        a3 =  S( FUNCTOR_$0024consulted_package_1 , a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a3);
 ;
        return //
 Op(FILE_system::PRED_clause_2_static_exec, VA(a4, m.DONT_CARE2()), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), cont));
    }

    private final static Operation $assert_consulted_package_1_2(Prolog m) { 
    // '$assert_consulted_package'(A):-retractall('$consulted_package'(B)),assertz('$consulted_package'(A))
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$assert_consulted_package'(A):-[retractall('SxxMachine':'$consulted_package'(B)),assertz('SxxMachine':'$consulted_package'(A))]
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_$0024consulted_package_1'),y(1),a(2))
        a2 =  S( FUNCTOR_$0024consulted_package_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
    // put_str_args([a(1)],y(3)),put_str(@('FUNCTOR_$0024consulted_package_1'),y(3),a(4))
        a4 =  S( FUNCTOR_$0024consulted_package_1 , a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
        return //
 Op(FILE_system::PRED_retractall_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(a5), cont));
    }
/** PREDICATE: $assert_consulted_import/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$assert_consulted_import'/1,non-(public))




    public static Operation PRED_$assert_consulted_import_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$assert_consulted_import'(A):-clause('$consulted_file'(B),C),assertz('$consulted_import'(B,A))
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        a1 = LARG[0];
    // '$assert_consulted_import'(A):-[clause('SxxMachine':'$consulted_file'(B),C),assertz('SxxMachine':'$consulted_import'(B,A))]
        a2 = m.mkvar1();
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_$0024consulted_file_1'),y(1),a(3))
        a3 =  S( FUNCTOR_$0024consulted_file_1 , a2);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a3);
 ;
    // put_str_args([a(2),a(1)],y(3)),put_str(@('FUNCTOR_$0024consulted_import_2'),y(3),a(5))
        a5 =  S( FUNCTOR_$0024consulted_import_2 , a2, a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(5)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a5);
 ;
        return //
 Op(FILE_system::PRED_clause_2_static_exec, VA(a4, m.DONT_CARE2()), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(a6), cont));
    }
/** PREDICATE: $consult_preprocess/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$consult_preprocess'/2,non-(public))




    public static Operation PRED_$consult_preprocess_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$consult_preprocess'(A,B):-expand_term(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // '$consult_preprocess'(A,B):-[expand_term(A,B)]
        return //
 Op(FILE_system::PRED_expand_term_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: $consult_cls/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$consult_cls'/1,non-(public))




    public static Operation PRED_$consult_cls_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$consult_cls_1_var, FILE_builtins::$consult_cls_1_2, FILE_builtins::$consult_cls_1_2, FILE_builtins::$consult_cls_1_2, FILE_builtins::$consult_cls_1_var, FILE_builtins::$consult_cls_1_2); 
    }

    private final static Operation $consult_cls_1_var(Prolog m) { 
        m.jtry1(null, FILE_builtins::$consult_cls_1_var_1);
        return $consult_cls_1_1(m);
    }

    private final static Operation $consult_cls_1_var_1(Prolog m) { 
        m.trust(null);
        return $consult_cls_1_2(m);
    }

    private final static Operation $consult_cls_1_1(Prolog m) { 
    // '$consult_cls'((A:-B)):-!,'$assert_consulted_clause'((A:-B))
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_cls'((A:-B)):-['$neck_cut','$assert_consulted_clause'((A:-B))]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a2, a3)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_$003A$002D_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$003A$002D_2 , a2, a3);
 ;
        return //
 Op(FILE_system::PRED_$assert_consulted_clause_1_static_exec, VA(a4), cont);
    }

    private final static Operation $consult_cls_1_2(Prolog m) { 
    // '$consult_cls'(A):-'$assert_consulted_clause'((A:-true))
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$consult_cls'(A):-['$assert_consulted_clause'((A:-true))]
    // put_str_args([a(1),@('Prolog.True')],y(1)),put_str(@('FUNCTOR_$003A$002D_2'),y(1),a(2))
        a2 =  S( FUNCTOR_$003A$002D_2 , a1,  Prolog.True );
 ;
        return //
 Op(FILE_system::PRED_$assert_consulted_clause_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: $assert_consulted_clause/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$assert_consulted_clause'/1,non-(public))




    public static Operation PRED_$assert_consulted_clause_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$assert_consulted_clause'(A):-A=(B:-C),functor(B,D,E),clause('$consulted_file'(F),G),clause('$consulted_package'(H),I),assertz(H:A),assertz('$consulted_predicate'(H,D/E,F)),!
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation p1, p2, p3, p4, p5;
        a1 = LARG[0];
    // '$assert_consulted_clause'(A):-['$get_level'(B),'$unify'(A,(C:-D)),functor(C,E,F),clause('SxxMachine':'$consulted_file'(G),H),clause('SxxMachine':'$consulted_package'(I),J),assertz(I:A),assertz('SxxMachine':'$consulted_predicate'(I,E/F,G)),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
    // put_str_args([a(3),void],y(1)),put_str(@('FUNCTOR_$003A$002D_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$003A$002D_2 , a3, m.mkvar3());
 ;
        //START inline expansion of $unify(a(1),a(4))
        if (! a1.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = m.mkvar1();
    // put_str_args([a(7)],y(2)),put_str(@('FUNCTOR_$0024consulted_file_1'),y(2),a(8))
        a8 =  S( FUNCTOR_$0024consulted_file_1 , a7);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(8)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a8);
 ;
        a10 = m.mkvar1();
    // put_str_args([a(10)],y(4)),put_str(@('FUNCTOR_$0024consulted_package_1'),y(4),a(11))
        a11 =  S( FUNCTOR_$0024consulted_package_1 , a10);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(11)],y(5)),put_str(@('FUNCTOR_module_colon_2'),y(5),a(12))
        a12 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a11);
 ;
    // put_str_args([a(10),a(1)],y(6)),put_str(@('FUNCTOR_module_colon_2'),y(6),a(13))
        a13 =  S( FUNCTOR_module_colon_2 , a10, a1);
 ;
    // put_str_args([a(5),a(6)],y(7)),put_str(@('FUNCTOR_$002F_2'),y(7),a(14))
        a14 =  S( FUNCTOR_$002F_2 , a5, a6);
 ;
    // put_str_args([a(10),a(14),a(7)],y(8)),put_str(@('FUNCTOR_$0024consulted_predicate_3'),y(8),a(15))
        a15 =  S( FUNCTOR_$0024consulted_predicate_3 , a10, a14, a7);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(15)],y(9)),put_str(@('FUNCTOR_module_colon_2'),y(9),a(16))
        a16 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a15);
 ;
        return //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a3, a5, a6), //
 Op(FILE_system::PRED_clause_2_static_exec, VA(a9, m.DONT_CARE2()), //
 Op(FILE_system::PRED_clause_2_static_exec, VA(a12, m.DONT_CARE2()), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(a13), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(a16), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), cont))))));
    }
/** PREDICATE: length/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(length/2,public)




    public static Operation PRED_length_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::length_2_sub_1);
        return length_2_1(m);
    }

    private final static Operation length_2_sub_1(Prolog m) { 
        m.trust(null);
        return length_2_2(m);
    }

    private final static Operation length_2_1(Prolog m) { 
    // length(A,B):-var(B),!,'$length'(A,0,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // length(A,B):-['$get_level'(C),var(B),'$cut'(C),'$length'(A,0,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$length_3_static_exec, VA(a1,  int_0 , a2), cont);
    }

    private final static Operation length_2_2(Prolog m) { 
    // length(A,B):-'$length0'(A,0,B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // length(A,B):-['$length0'(A,0,B)]
        return //
 Op(FILE_system::PRED_$length0_3_static_exec, VA(a1,  int_0 , a2), cont);
    }
/** PREDICATE: $length/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$length'/3,non-(public))




    public static Operation PRED_$length_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $length_3_top(m);
    }

    private final static Operation $length_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$length_3_var, fail_0, fail_0, FILE_builtins::$length_3_1, fail_0, FILE_builtins::$length_3_2); 
    }

    private final static Operation $length_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$length_3_var_1);
        return $length_3_1(m);
    }

    private final static Operation $length_3_var_1(Prolog m) { 
        m.trust(null);
        return $length_3_2(m);
    }

    private final static Operation $length_3_1(Prolog m) { 
    // '$length'([],A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$length'([],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $length_3_2(Prolog m) { 
    // '$length'([A|B],C,D):-E is C+1,'$length'(B,E,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$length'([A|B],C,D):-[E is C+1,'$length'(B,E,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a4), m.trail);
        } else {
            return m.fail();
        }
        a5 = m.mkvar1();
    // put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a2,  int_1 );
 ;
        //START inline expansion of a(5)is a(6)
        if (! a5.unify(Arithmetic.evaluate(a6), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a5;
        m.AREGS[2] = a3;
m.cont = cont;
        return $length_3_top(m);
    }
/** PREDICATE: $length0/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$length0'/3,non-(public))




    public static Operation PRED_$length0_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $length0_3_top(m);
    }

    private final static Operation $length0_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$length0_3_var, fail_0, fail_0, FILE_builtins::$length0_3_1, fail_0, FILE_builtins::$length0_3_2); 
    }

    private final static Operation $length0_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$length0_3_var_1);
        return $length0_3_1(m);
    }

    private final static Operation $length0_3_var_1(Prolog m) { 
        m.trust(null);
        return $length0_3_2(m);
    }

    private final static Operation $length0_3_1(Prolog m) { 
    // '$length0'([],A,A):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$length0'([],A,A):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $length0_3_2(Prolog m) { 
    // '$length0'([A|B],C,D):-C<D,E is C+1,'$length0'(B,E,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$length0'([A|B],C,D):-['$less_than'(C,D),E is C+1,'$length0'(B,E,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a4), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $less_than(a(2),a(3))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
    // put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a2,  int_1 );
 ;
        //START inline expansion of a(5)is a(6)
        if (! a5.unify(Arithmetic.evaluate(a6), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a5;
        m.AREGS[2] = a3;
m.cont = cont;
        return $length0_3_top(m);
    }
/** PREDICATE: numbervars/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(numbervars/3,public)




    public static Operation PRED_numbervars_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // numbervars(A,B,C):-integer(B),B>=0,!,'$numbervars'(A,B,C)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // numbervars(A,B,C):-['$get_level'(D),integer(B),E is 0,'$greater_or_equal'(B,E),'$cut'(D),'$numbervars'(A,B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of integer(a(2))
        a2 = a2.dref();
        if (! (a2 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        //START inline expansion of a(5)is@(int_0)
        if (! a5.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_or_equal(a(2),a(5))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a5)) < 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return //
 Op(FILE_system::PRED_$numbervars_3_static_exec, VA(a1, a2, a3), cont);
    }
/** PREDICATE: $numbervars/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$numbervars'/3,non-(public))




    public static Operation PRED_$numbervars_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$numbervars_3_sub_1);
        return $numbervars_3_1(m);
    }

    private final static Operation $numbervars_3_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$numbervars_3_sub_2);
        return $numbervars_3_2(m);
    }

    private final static Operation $numbervars_3_sub_2(Prolog m) { 
        m.retry(null, FILE_builtins::$numbervars_3_sub_3);
        return $numbervars_3_3(m);
    }

    private final static Operation $numbervars_3_sub_3(Prolog m) { 
        m.trust(null);
        return $numbervars_3_4(m);
    }

    private final static Operation $numbervars_3_1(Prolog m) { 
    // '$numbervars'(A,B,C):-var(A),!,A='$VAR'(B),C is B+1
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$numbervars'(A,B,C):-['$get_level'(D),var(A),'$cut'(D),'$unify'(A,'$VAR'(B)),C is B+1]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_$0024VAR_1'),y(1),a(5))
        a5 =  S( FUNCTOR_$0024VAR_1 , a2);
 ;
        //START inline expansion of $unify(a(1),a(5))
        if (! a1.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2),@(int_1)],y(2)),put_str(@('FUNCTOR_$002B_2'),y(2),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a2,  int_1 );
 ;
        //START inline expansion of a(3)is a(6)
        if (! a3.unify(Arithmetic.evaluate(a6), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $numbervars_3_2(Prolog m) { 
    // '$numbervars'(A,B,B):-atomic(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$numbervars'(A,B,B):-['$get_level'(C),atomic(A),'$cut'(C)]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $numbervars_3_3(Prolog m) { 
    // '$numbervars'(A,B,B):-java(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$numbervars'(A,B,B):-['$get_level'(C),java(A),'$cut'(C)]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of java(a(1))
        a1 = a1.dref();
        if (! (a1 .isFFIObject())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $numbervars_3_4(Prolog m) { 
    // '$numbervars'(A,B,C):-functor(A,D,E),'$numbervars_str'(1,E,A,B,C)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$numbervars'(A,B,C):-[functor(A,D,E),'$numbervars_str'(1,E,A,B,C)]
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_functor_3_static_exec, VA(a1, m.DONT_CARE2(), a4), //
 Op(FILE_system::PRED_$numbervars_str_5_static_exec, VA( int_1 , a4, a1, a2, a3), cont));
    }
/** PREDICATE: $numbervars_str/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$numbervars_str'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$numbervars_str_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_builtins::$numbervars_str_5_sub_1);
        return $numbervars_str_5_1(m);
    }

    private final static Operation $numbervars_str_5_sub_1(Prolog m) { 
        m.trust(null);
        return $numbervars_str_5_2(m);
    }

    private final static Operation $numbervars_str_5_1(Prolog m) { 
    // '$numbervars_str'(A,A,B,C,D):-!,arg(A,B,E),'$numbervars'(E,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$numbervars_str'(A,A,B,C,D):-['$neck_cut',arg(A,B,E),'$numbervars'(E,C,D)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a6 = m.mkvar1();
        return //
 Op(FILE_system::PRED_arg_3_static_exec, VA(a1, a3, a6), //
 Op(FILE_system::PRED_$numbervars_3_static_exec, VA(a6, a4, a5), cont));
    }

    private final static Operation $numbervars_str_5_2(Prolog m) { 
    // '$numbervars_str'(A,B,C,D,E):-arg(A,C,F),'$numbervars'(F,D,G),H is A+1,'$numbervars_str'(H,B,C,G,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$numbervars_str'(A,B,C,D,E):-[arg(A,C,F),'$numbervars'(F,D,G),H is A+1,'$numbervars_str'(H,B,C,G,E)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(9))
        a9 =  S( FUNCTOR_$002B_2 , a1,  int_1 );
 ;
        return //
 Op(FILE_system::PRED_arg_3_static_exec, VA(a1, a3, a6), //
 Op(FILE_system::PRED_$numbervars_3_static_exec, VA(a6, a4, a7), //
 Op(FILE_builtins::PRED_is_2_static_exec, VA(a8, a9), //
 Op(FILE_system::PRED_$numbervars_str_5_static_exec, VA(a8, a2, a3, a7, a5), cont))));
    }
/** PREDICATE: statistics/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(statistics/2,public)
        final static SymbolTerm FUNCTOR_statistics_2 = F("statistics",2);




    public static Operation PRED_statistics_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::statistics_2_sub_1);
        return statistics_2_1(m);
    }

    private final static Operation statistics_2_sub_1(Prolog m) { 
        m.trust(null);
        return statistics_2_2(m);
    }

    private final static Operation statistics_2_1(Prolog m) { 
    // statistics(A,B):-nonvar(A),'$statistics_mode'(A),!,'$statistics'(A,B)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // statistics(A,B):-['$get_level'(C),nonvar(A),'$statistics_mode'(A),'$cut'(C),'$statistics'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(1))
        a1 = a1.dref();
        if ((a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$statistics_mode_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_$statistics_2_static_exec, VA(a1, a2), cont)));
    }

    private final static Operation statistics_2_2(Prolog m) { 
    // statistics(A,B):-findall(C,'$statistics_mode'(C),D),illarg(domain(atom,D),statistics(A,B),1)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // statistics(A,B):-[findall(C,'SxxMachine':'$statistics_mode'(C),D),illarg(domain(atom,D),statistics(A,B),1)]
        a3 = m.mkvar1();
        a4 = Closure( //
 Op(FILE_system::PRED_$statistics_mode_1_static_exec, VA(a3), null));
        a5 = m.mkvar1();
    // put_str_args([@('ATOM_atom'),a(5)],y(1)),put_str(@('FUNCTOR_domain_2'),y(1),a(6))
        a6 =  S( FUNCTOR_domain_2 ,  ATOM_atom , a5);
 ;
    // put_str_args([a(1),a(2)],y(2)),put_str(@('FUNCTOR_statistics_2'),y(2),a(7))
        a7 =  S( FUNCTOR_statistics_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_findall_3_static_exec, VA(a3, a4, a5), //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(a6, a7,  int_1 ), cont));
    }
/** PREDICATE: $statistics_mode/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$statistics_mode'/1,non-(public))
        final static SymbolTerm ATOM_runtime = SYM("runtime");
        final static SymbolTerm ATOM_trail = SYM("trail");
        final static SymbolTerm ATOM_choice = SYM("choice");




    public static Operation PRED_$statistics_mode_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::$statistics_mode_1_var, fail_0, fail_0, FILE_builtins::$statistics_mode_1_var, fail_0, fail_0); 
    }

    private final static Operation $statistics_mode_1_var(Prolog m) { 
        m.jtry1(null, FILE_builtins::$statistics_mode_1_var_1);
        return $statistics_mode_1_1(m);
    }

    private final static Operation $statistics_mode_1_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$statistics_mode_1_var_2);
        return $statistics_mode_1_2(m);
    }

    private final static Operation $statistics_mode_1_var_2(Prolog m) { 
        m.trust(null);
        return $statistics_mode_1_3(m);
    }

    private final static Operation $statistics_mode_1_1(Prolog m) { 
    // '$statistics_mode'(runtime):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$statistics_mode'(runtime):-[]
        if (!  ATOM_runtime .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $statistics_mode_1_2(Prolog m) { 
    // '$statistics_mode'(trail):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$statistics_mode'(trail):-[]
        if (!  ATOM_trail .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $statistics_mode_1_3(Prolog m) { 
    // '$statistics_mode'(choice):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$statistics_mode'(choice):-[]
        if (!  ATOM_choice .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: illarg/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(illarg/3,non-(public))
        final static SymbolTerm FUNCTOR_instantiation_error_2 = F("instantiation_error",2);
        final static SymbolTerm FUNCTOR_existence_3 = F("existence",3);
        final static SymbolTerm FUNCTOR_existence_error_5 = F("existence_error",5);
        final static SymbolTerm FUNCTOR_permission_error_5 = F("permission_error",5);
        final static SymbolTerm FUNCTOR_representation_1 = F("representation",1);
        final static SymbolTerm FUNCTOR_representation_error_3 = F("representation_error",3);
        final static SymbolTerm FUNCTOR_evaluation_1 = F("evaluation",1);
        final static SymbolTerm FUNCTOR_evaluation_error_3 = F("evaluation_error",3);
        final static SymbolTerm FUNCTOR_syntax_3 = F("syntax",3);
        final static SymbolTerm FUNCTOR_syntax_error_5 = F("syntax_error",5);
        final static SymbolTerm FUNCTOR_system_1 = F("system",1);
        final static SymbolTerm FUNCTOR_system_error_1 = F("system_error",1);
        final static SymbolTerm FUNCTOR_internal_1 = F("internal",1);
        final static SymbolTerm FUNCTOR_internal_error_1 = F("internal_error",1);
        final static SymbolTerm FUNCTOR_java_1 = F("java",1);
        final static SymbolTerm FUNCTOR_java_error_3 = F("java_error",3);




    public static Operation PRED_illarg_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return illarg_3_top(m);
    }

    private final static Operation illarg_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::illarg_3_var, FILE_builtins::illarg_3_int, FILE_builtins::illarg_3_int, FILE_builtins::illarg_3_con, FILE_builtins::illarg_3_str, FILE_builtins::illarg_3_int); 
    }

    private final static Operation illarg_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::illarg_3_var_1);
        return illarg_3_1(m);
    }

    private final static Operation illarg_3_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_var_2);
        return illarg_3_2(m);
    }

    private final static Operation illarg_3_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_var_3);
        return illarg_3_3(m);
    }

    private final static Operation illarg_3_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_var_4);
        return illarg_3_4(m);
    }

    private final static Operation illarg_3_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_var_5);
        return illarg_3_5(m);
    }

    private final static Operation illarg_3_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_var_6);
        return illarg_3_6(m);
    }

    private final static Operation illarg_3_var_6(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_var_7);
        return illarg_3_7(m);
    }

    private final static Operation illarg_3_var_7(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_var_8);
        return illarg_3_8(m);
    }

    private final static Operation illarg_3_var_8(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_var_9);
        return illarg_3_9(m);
    }

    private final static Operation illarg_3_var_9(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_var_10);
        return illarg_3_10(m);
    }

    private final static Operation illarg_3_var_10(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_var_11);
        return illarg_3_11(m);
    }

    private final static Operation illarg_3_var_11(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_var_12);
        return illarg_3_12(m);
    }

    private final static Operation illarg_3_var_12(Prolog m) { 
        m.trust(null);
        return illarg_3_13(m);
    }

    private final static Operation illarg_3_int(Prolog m) { 
        m.jtry3(null, FILE_builtins::illarg_3_int_1);
        return illarg_3_1(m);
    }

    private final static Operation illarg_3_int_1(Prolog m) { 
        m.trust(null);
        return illarg_3_13(m);
    }

    private final static Operation illarg_3_con(Prolog m) { 
        m.jtry3(null, FILE_builtins::illarg_3_con_1);
        return illarg_3_1(m);
    }

    private final static Operation illarg_3_con_1(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_con_2);
        return illarg_3_2(m);
    }

    private final static Operation illarg_3_con_2(Prolog m) { 
        m.trust(null);
        return illarg_3_13(m);
    }

    private final static Operation illarg_3_str(Prolog m) { 
        m.jtry3(null, FILE_builtins::illarg_3_str_1);
        return illarg_3_1(m);
    }

    private final static Operation illarg_3_str_1(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_str_2);
        return illarg_3_3(m);
    }

    private final static Operation illarg_3_str_2(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_str_3);
        return illarg_3_4(m);
    }

    private final static Operation illarg_3_str_3(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_str_4);
        return illarg_3_5(m);
    }

    private final static Operation illarg_3_str_4(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_str_5);
        return illarg_3_6(m);
    }

    private final static Operation illarg_3_str_5(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_str_6);
        return illarg_3_7(m);
    }

    private final static Operation illarg_3_str_6(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_str_7);
        return illarg_3_8(m);
    }

    private final static Operation illarg_3_str_7(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_str_8);
        return illarg_3_9(m);
    }

    private final static Operation illarg_3_str_8(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_str_9);
        return illarg_3_10(m);
    }

    private final static Operation illarg_3_str_9(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_str_10);
        return illarg_3_11(m);
    }

    private final static Operation illarg_3_str_10(Prolog m) { 
        m.retry(null, FILE_builtins::illarg_3_str_11);
        return illarg_3_12(m);
    }

    private final static Operation illarg_3_str_11(Prolog m) { 
        m.trust(null);
        return illarg_3_13(m);
    }

    private final static Operation illarg_3_1(Prolog m) { 
    // illarg(A,B,C):-var(A),!,illarg(var,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(A,B,C):-['$get_level'(D),var(A),'$cut'(D),illarg(var,B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        m.AREGS[0] =  ATOM_var ;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
m.cont = cont;
        return illarg_3_top(m);
    }

    private final static Operation illarg_3_2(Prolog m) { 
    // illarg(var,A,B):-raise_exception(instantiation_error(A,B))
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(var,A,B):-[raise_exception(instantiation_error(A,B))]
        if (!  ATOM_var .unify(a1, m.trail))
            return m.fail();
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_instantiation_error_2'),y(1),a(4))
        a4 =  S( FUNCTOR_instantiation_error_2 , a2, a3);
 ;
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a4), cont);
    }

    private final static Operation illarg_3_3(Prolog m) { 
    // illarg(type(A),B,C):-arg(C,B,D),'$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E),raise_exception(E)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(type(A),B,C):-[arg(C,B,D),'$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E),raise_exception(E)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_type_1 , m.trail, a4)){
                return m.fail();
            }
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        return //
 Op(FILE_system::PRED_arg_3_static_exec, VA(a3, a2, a5), //
 Op(FILE_system::PRED_$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_static_exec, VA(a4, a2, a3, a5, a6), //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a6), cont)));
    }

    private final static Operation illarg_3_4(Prolog m) { 
    // illarg(domain(A,B),C,D):-arg(D,C,E),'$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F),raise_exception(F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(domain(A,B),C,D):-[arg(D,C,E),'$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F),raise_exception(F)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_domain_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op(FILE_system::PRED_arg_3_static_exec, VA(a3, a2, a6), //
 Op(FILE_system::PRED_$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec, VA(a4, a5, a2, a3, a6, a7), //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a7), cont)));
    }

    private final static Operation illarg_3_5(Prolog m) { 
    // illarg(existence(A,B,C),D,E):-raise_exception(existence_error(D,E,A,B,C))
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(existence(A,B,C),D,E):-[raise_exception(existence_error(D,E,A,B,C))]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_existence_3 , m.trail, a4, a5, a6)){
                return m.fail();
            }
    // put_str_args([a(2),a(3),a(4),a(5),a(6)],y(1)),put_str(@('FUNCTOR_existence_error_5'),y(1),a(7))
        a7 =  S( FUNCTOR_existence_error_5 , a2, a3, a4, a5, a6);
 ;
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a7), cont);
    }

    private final static Operation illarg_3_6(Prolog m) { 
    // illarg(permission(A,B,C,D),E,F):-raise_exception(permission_error(E,A,B,C,D))
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(permission(A,B,C,D),E,F):-[raise_exception(permission_error(E,A,B,C,D))]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_permission_4 , m.trail, a4, a5, a6, a7)){
                return m.fail();
            }
    // put_str_args([a(2),a(4),a(5),a(6),a(7)],y(1)),put_str(@('FUNCTOR_permission_error_5'),y(1),a(8))
        a8 =  S( FUNCTOR_permission_error_5 , a2, a4, a5, a6, a7);
 ;
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a8), cont);
    }

    private final static Operation illarg_3_7(Prolog m) { 
    // illarg(representation(A),B,C):-raise_exception(representation_error(B,C,A))
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(representation(A),B,C):-[raise_exception(representation_error(B,C,A))]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_representation_1 , m.trail, a4)){
                return m.fail();
            }
    // put_str_args([a(2),a(3),a(4)],y(1)),put_str(@('FUNCTOR_representation_error_3'),y(1),a(5))
        a5 =  S( FUNCTOR_representation_error_3 , a2, a3, a4);
 ;
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a5), cont);
    }

    private final static Operation illarg_3_8(Prolog m) { 
    // illarg(evaluation(A),B,C):-raise_exception(evaluation_error(B,C,A))
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(evaluation(A),B,C):-[raise_exception(evaluation_error(B,C,A))]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_evaluation_1 , m.trail, a4)){
                return m.fail();
            }
    // put_str_args([a(2),a(3),a(4)],y(1)),put_str(@('FUNCTOR_evaluation_error_3'),y(1),a(5))
        a5 =  S( FUNCTOR_evaluation_error_3 , a2, a3, a4);
 ;
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a5), cont);
    }

    private final static Operation illarg_3_9(Prolog m) { 
    // illarg(syntax(A,B,C),D,E):-raise_exception(syntax_error(D,E,A,B,C))
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(syntax(A,B,C),D,E):-[raise_exception(syntax_error(D,E,A,B,C))]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_syntax_3 , m.trail, a4, a5, a6)){
                return m.fail();
            }
    // put_str_args([a(2),a(3),a(4),a(5),a(6)],y(1)),put_str(@('FUNCTOR_syntax_error_5'),y(1),a(7))
        a7 =  S( FUNCTOR_syntax_error_5 , a2, a3, a4, a5, a6);
 ;
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a7), cont);
    }

    private final static Operation illarg_3_10(Prolog m) { 
    // illarg(system(A),B,C):-raise_exception(system_error(A))
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(system(A),B,C):-[raise_exception(system_error(A))]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_system_1 , m.trail, a4)){
                return m.fail();
            }
    // put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_system_error_1'),y(1),a(5))
        a5 =  S( FUNCTOR_system_error_1 , a4);
 ;
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a5), cont);
    }

    private final static Operation illarg_3_11(Prolog m) { 
    // illarg(internal(A),B,C):-raise_exception(internal_error(A))
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(internal(A),B,C):-[raise_exception(internal_error(A))]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_internal_1 , m.trail, a4)){
                return m.fail();
            }
    // put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_internal_error_1'),y(1),a(5))
        a5 =  S( FUNCTOR_internal_error_1 , a4);
 ;
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a5), cont);
    }

    private final static Operation illarg_3_12(Prolog m) { 
    // illarg(java(A),B,C):-raise_exception(java_error(B,C,A))
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(java(A),B,C):-[raise_exception(java_error(B,C,A))]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_java_1 , m.trail, a4)){
                return m.fail();
            }
    // put_str_args([a(2),a(3),a(4)],y(1)),put_str(@('FUNCTOR_java_error_3'),y(1),a(5))
        a5 =  S( FUNCTOR_java_error_3 , a2, a3, a4);
 ;
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a5), cont);
    }

    private final static Operation illarg_3_13(Prolog m) { 
    // illarg(A,B,C):-raise_exception(A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // illarg(A,B,C):-[raise_exception(A)]
        return //
 Op(FILE_system::PRED_raise_exception_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: $dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/5,non-(public))
        final static SymbolTerm FUNCTOR_type_error_4 = F("type_error",4);

    // private final Term arg5;




    public static Operation PRED_$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_builtins::$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_sub_1);
        return $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_1(m);
    }

    private final static Operation $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_2(m);
    }

    private final static Operation $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_1(Prolog m) { 
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E):-nonvar(D),!,E=type_error(B,C,A,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E):-['$get_level'(F),nonvar(D),'$cut'(F),'$unify'(E,type_error(B,C,A,D))]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(4))
        a4 = a4.dref();
        if ((a4 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
    // put_str_args([a(2),a(3),a(1),a(4)],y(1)),put_str(@('FUNCTOR_type_error_4'),y(1),a(7))
        a7 =  S( FUNCTOR_type_error_4 , a2, a3, a1, a4);
 ;
        //START inline expansion of $unify(a(5),a(7))
        if (! a5.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_2(Prolog m) { 
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E):-E=instantiation_error(B,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E):-['$unify'(E,instantiation_error(B,C))]
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_instantiation_error_2'),y(1),a(6))
        a6 =  S( FUNCTOR_instantiation_error_2 , a2, a3);
 ;
        //START inline expansion of $unify(a(5),a(6))
        if (! a5.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/6,non-(public))
        final static SymbolTerm FUNCTOR_domain_error_4 = F("domain_error",4);

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_builtins::$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_1);
        return $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_1(m);
    }

    private final static Operation $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_2);
        return $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_2(m);
    }

    private final static Operation $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_3(m);
    }

    private final static Operation $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_1(Prolog m) { 
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-'$match_type'(A,E),!,F=domain_error(C,D,B,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-['$get_level'(G),'$match_type'(A,E),'$cut'(G),'$unify'(F,domain_error(C,D,B,E))]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(3),a(4),a(2),a(5)],y(1)),put_str(@('FUNCTOR_domain_error_4'),y(1),a(8))
        a8 =  S( FUNCTOR_domain_error_4 , a3, a4, a2, a5);
 ;
        return //
 Op(FILE_system::PRED_$match_type_2_static_exec, VA(a1, a5), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a7), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a6, a8), cont)));
    }

    private final static Operation $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_2(Prolog m) { 
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-'$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-['$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,C,D,E,F)]
        return //
 Op(FILE_system::PRED_$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_static_exec, VA(a1, a3, a4, a5, a6), cont);
    }

    private final static Operation $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_3(Prolog m) { 
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-F=instantiation_error(C,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E,F):-['$unify'(F,instantiation_error(C,D))]
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_instantiation_error_2'),y(1),a(7))
        a7 =  S( FUNCTOR_instantiation_error_2 , a3, a4);
 ;
        //START inline expansion of $unify(a(6),a(7))
        if (! a6.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_builtins::$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_sub_1);
        return $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_1(m);
    }

    private final static Operation $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_2(m);
    }

    private final static Operation $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_1(Prolog m) { 
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E):-nonvar(D),!,E=type_error(B,C,A,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E):-['$get_level'(F),nonvar(D),'$cut'(F),'$unify'(E,type_error(B,C,A,D))]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(4))
        a4 = a4.dref();
        if ((a4 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
    // put_str_args([a(2),a(3),a(1),a(4)],y(1)),put_str(@('FUNCTOR_type_error_4'),y(1),a(7))
        a7 =  S( FUNCTOR_type_error_4 , a2, a3, a1, a4);
 ;
        //START inline expansion of $unify(a(5),a(7))
        if (! a5.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_2(Prolog m) { 
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E):-fail
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C,D,E):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $match_type/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$match_type'/2,non-(public))
        final static SymbolTerm ATOM_variable = SYM("variable");
        final static SymbolTerm ATOM_byte = SYM("byte");
        final static IntegerTerm int_255 = Integer(255);
        final static SymbolTerm ATOM_in_byte = SYM("in_byte");
        final static SymbolTerm ATOM_character = SYM("character");
        final static SymbolTerm ATOM_in_character = SYM("in_character");
        final static SymbolTerm ATOM_number = SYM("number");
        final static SymbolTerm ATOM_long = SYM("long");
        final static SymbolTerm ATOM_float = SYM("float");
        final static SymbolTerm ATOM_compound = SYM("compound");
        final static SymbolTerm ATOM_list = SYM("list");
        final static SymbolTerm ATOM_java = SYM("java");
        final static SymbolTerm ATOM_stream = SYM("stream");
        final static SymbolTerm ATOM_java$002Eio$002EPushbackReader = SYM("java.io.PushbackReader");
        final static SymbolTerm ATOM_java$002Eio$002EPrintWriter = SYM("java.io.PrintWriter");
        final static SymbolTerm ATOM_stream_or_alias = SYM("stream_or_alias");
        final static SymbolTerm ATOM_hash = SYM("hash");
        final static SymbolTerm ATOM_SxxMachine$002EHashtableOfTerm = SYM("SxxMachine.HashtableOfTerm");
        final static SymbolTerm ATOM_hash_or_alias = SYM("hash_or_alias");




    public static Operation PRED_$match_type_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $match_type_2_top(m);
    }

    private final static Operation $match_type_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$match_type_2_var, fail_0, fail_0, FILE_builtins::$match_type_2_var, fail_0, fail_0); 
    }

    private final static Operation $match_type_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::$match_type_2_var_1);
        return $match_type_2_1(m);
    }

    private final static Operation $match_type_2_var_1(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_2);
        return $match_type_2_2(m);
    }

    private final static Operation $match_type_2_var_2(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_3);
        return $match_type_2_3(m);
    }

    private final static Operation $match_type_2_var_3(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_4);
        return $match_type_2_4(m);
    }

    private final static Operation $match_type_2_var_4(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_5);
        return $match_type_2_5(m);
    }

    private final static Operation $match_type_2_var_5(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_6);
        return $match_type_2_6(m);
    }

    private final static Operation $match_type_2_var_6(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_7);
        return $match_type_2_7(m);
    }

    private final static Operation $match_type_2_var_7(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_8);
        return $match_type_2_8(m);
    }

    private final static Operation $match_type_2_var_8(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_9);
        return $match_type_2_9(m);
    }

    private final static Operation $match_type_2_var_9(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_10);
        return $match_type_2_10(m);
    }

    private final static Operation $match_type_2_var_10(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_11);
        return $match_type_2_11(m);
    }

    private final static Operation $match_type_2_var_11(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_12);
        return $match_type_2_12(m);
    }

    private final static Operation $match_type_2_var_12(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_13);
        return $match_type_2_13(m);
    }

    private final static Operation $match_type_2_var_13(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_14);
        return $match_type_2_14(m);
    }

    private final static Operation $match_type_2_var_14(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_15);
        return $match_type_2_15(m);
    }

    private final static Operation $match_type_2_var_15(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_16);
        return $match_type_2_16(m);
    }

    private final static Operation $match_type_2_var_16(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_17);
        return $match_type_2_17(m);
    }

    private final static Operation $match_type_2_var_17(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_18);
        return $match_type_2_18(m);
    }

    private final static Operation $match_type_2_var_18(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_19);
        return $match_type_2_19(m);
    }

    private final static Operation $match_type_2_var_19(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_20);
        return $match_type_2_20(m);
    }

    private final static Operation $match_type_2_var_20(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_21);
        return $match_type_2_21(m);
    }

    private final static Operation $match_type_2_var_21(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_22);
        return $match_type_2_22(m);
    }

    private final static Operation $match_type_2_var_22(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_23);
        return $match_type_2_23(m);
    }

    private final static Operation $match_type_2_var_23(Prolog m) { 
        m.retry(null, FILE_builtins::$match_type_2_var_24);
        return $match_type_2_24(m);
    }

    private final static Operation $match_type_2_var_24(Prolog m) { 
        m.trust(null);
        return $match_type_2_25(m);
    }

    private final static Operation $match_type_2_1(Prolog m) { 
    // '$match_type'(term,A):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(term,A):-[]
        if (!  ATOM_term .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $match_type_2_2(Prolog m) { 
    // '$match_type'(variable,A):-var(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(variable,A):-[var(A)]
        if (!  ATOM_variable .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_3(Prolog m) { 
    // '$match_type'(atom,A):-atom(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(atom,A):-[atom(A)]
        if (!  ATOM_atom .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of atom(a(2))
        a2 = a2.dref();
        if (! (a2 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_4(Prolog m) { 
    // '$match_type'(atomic,A):-atomic(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(atomic,A):-[atomic(A)]
        if (!  ATOM_atomic .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of atomic(a(2))
        a2 = a2.dref();
        if (! a2.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_5(Prolog m) { 
    // '$match_type'(byte,A):-integer(A),0=<A,A=<255
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(byte,A):-[integer(A),B is 0,'$less_or_equal'(B,A),C is 255,'$less_or_equal'(A,C)]
        if (!  ATOM_byte .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of integer(a(2))
        a2 = a2.dref();
        if (! (a2 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
        //START inline expansion of a(3)is@(int_0)
        if (! a3.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_or_equal(a(3),a(2))
        if (Arithmetic.evaluate(a3).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        //START inline expansion of a(4)is@(int_255)
        if (! a4.unify(Arithmetic.evaluate(int_255), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_or_equal(a(2),a(4))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a4)) > 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_6(Prolog m) { 
    // '$match_type'(in_byte,A):-integer(A),-1=<A,A=<255
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(in_byte,A):-[integer(A),B is -1,'$less_or_equal'(B,A),C is 255,'$less_or_equal'(A,C)]
        if (!  ATOM_in_byte .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of integer(a(2))
        a2 = a2.dref();
        if (! (a2 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
        //START inline expansion of a(3)is@(int_neg1)
        if (! a3.unify(Arithmetic.evaluate(int_neg1), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_or_equal(a(3),a(2))
        if (Arithmetic.evaluate(a3).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        //START inline expansion of a(4)is@(int_255)
        if (! a4.unify(Arithmetic.evaluate(int_255), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_or_equal(a(2),a(4))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a4)) > 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_7(Prolog m) { 
    // '$match_type'(character,A):-atom(A),atom_length(A,1)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(character,A):-[atom(A),atom_length(A,1)]
        if (!  ATOM_character .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of atom(a(2))
        a2 = a2.dref();
        if (! (a2 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_atom_length_2_static_exec, VA(a2,  int_1 ), cont);
    }

    private final static Operation $match_type_2_8(Prolog m) { 
    // '$match_type'(in_character,A):-A==end_of_file
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(in_character,A):-['$equality_of_term'(A,end_of_file)]
        if (!  ATOM_in_character .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $equality_of_term(a(2),@(ATOM_end_of_file))
        a2 = a2.dref();
        if (! a2.equalsTerm(ATOM_end_of_file)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_9(Prolog m) { 
    // '$match_type'(in_character,A):-'$match_type'(character,A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(in_character,A):-['$match_type'(character,A)]
        if (!  ATOM_in_character .unify(a1, m.trail))
            return m.fail();
        m.AREGS[0] =  ATOM_character ;
        m.AREGS[1] = a2;
m.cont = cont;
        return $match_type_2_top(m);
    }

    private final static Operation $match_type_2_10(Prolog m) { 
    // '$match_type'(number,A):-number(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(number,A):-[number(A)]
        if (!  ATOM_number .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of number(a(2))
        a2 = a2.dref();
        if (! a2.isNumber()) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_11(Prolog m) { 
    // '$match_type'(integer,A):-integer(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(integer,A):-[integer(A)]
        if (!  ATOM_integer .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of integer(a(2))
        a2 = a2.dref();
        if (! (a2 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_12(Prolog m) { 
    // '$match_type'(long,A):-long(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(long,A):-[long(A)]
        if (!  ATOM_long .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of long(a(2))
        a2 = a2.dref();
        if (! (a2 .isLong())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_13(Prolog m) { 
    // '$match_type'(float,A):-float(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(float,A):-[float(A)]
        if (!  ATOM_float .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of float(a(2))
        a2 = a2.dref();
        if (! (a2 .isDouble())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_14(Prolog m) { 
    // '$match_type'(callable,A):-callable(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(callable,A):-[callable(A)]
        if (!  ATOM_callable .unify(a1, m.trail))
            return m.fail();
        return //
 Op(FILE_system::PRED_callable_1_static_exec, VA(a2), cont);
    }

    private final static Operation $match_type_2_15(Prolog m) { 
    // '$match_type'(compound,A):-compound(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(compound,A):-[compound(A)]
        if (!  ATOM_compound .unify(a1, m.trail))
            return m.fail();
        return //
 Op(FILE_system::PRED_compound_1_static_exec, VA(a2), cont);
    }

    private final static Operation $match_type_2_16(Prolog m) { 
    // '$match_type'(list,A):-nonvar(A),'$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(list,A):-[nonvar(A),'$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C)]
        if (!  ATOM_list .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of nonvar(a(2))
        a2 = a2.dref();
        if ((a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec, VA(a2, m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }

    private final static Operation $match_type_2_17(Prolog m) { 
    // '$match_type'(java,A):-java(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(java,A):-[java(A)]
        if (!  ATOM_java .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of java(a(2))
        a2 = a2.dref();
        if (! (a2 .isFFIObject())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_18(Prolog m) { 
    // '$match_type'(stream,A):-java(A,'java.io.PushbackReader')
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(stream,A):-[java(A,'java.io.PushbackReader')]
        if (!  ATOM_stream .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of java(a(2),@(ATOM_java$002Eio$002EPushbackReader))
        a2 = a2.dref();
        if (! (a2 .isFFIObject())) {
            return m.fail();
        }
        if (! ATOM_java$002Eio$002EPushbackReader.unify(SYM(((FFIObjectTerm) a2).object().getClass().getName()), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_19(Prolog m) { 
    // '$match_type'(stream,A):-java(A,'java.io.PrintWriter')
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(stream,A):-[java(A,'java.io.PrintWriter')]
        if (!  ATOM_stream .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of java(a(2),@(ATOM_java$002Eio$002EPrintWriter))
        a2 = a2.dref();
        if (! (a2 .isFFIObject())) {
            return m.fail();
        }
        if (! ATOM_java$002Eio$002EPrintWriter.unify(SYM(((FFIObjectTerm) a2).object().getClass().getName()), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_20(Prolog m) { 
    // '$match_type'(stream_or_alias,A):-atom(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(stream_or_alias,A):-[atom(A)]
        if (!  ATOM_stream_or_alias .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of atom(a(2))
        a2 = a2.dref();
        if (! (a2 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_21(Prolog m) { 
    // '$match_type'(stream_or_alias,A):-'$match_type'(stream,A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(stream_or_alias,A):-['$match_type'(stream,A)]
        if (!  ATOM_stream_or_alias .unify(a1, m.trail))
            return m.fail();
        m.AREGS[0] =  ATOM_stream ;
        m.AREGS[1] = a2;
m.cont = cont;
        return $match_type_2_top(m);
    }

    private final static Operation $match_type_2_22(Prolog m) { 
    // '$match_type'(hash,A):-jinstanceof(A,'SxxMachine.HashtableOfTerm')
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(hash,A):-[jinstanceof(A,'SxxMachine.HashtableOfTerm')]
        if (!  ATOM_hash .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of jinstanceof(a(2),@(ATOM_SxxMachine$002EHashtableOfTerm))
        a2 = a2.dref();
        if (! (a2 .isFFIObject())) {
            return m.fail();
        }
        if (! ATOM_SxxMachine$002EHashtableOfTerm.unify(SYM(((FFIObjectTerm) a2).object().getClass().getName()), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_23(Prolog m) { 
    // '$match_type'(hash_or_alias,A):-atom(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(hash_or_alias,A):-[atom(A)]
        if (!  ATOM_hash_or_alias .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of atom(a(2))
        a2 = a2.dref();
        if (! (a2 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $match_type_2_24(Prolog m) { 
    // '$match_type'(hash_or_alias,A):-'$match_type'(hash,A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(hash_or_alias,A):-['$match_type'(hash,A)]
        if (!  ATOM_hash_or_alias .unify(a1, m.trail))
            return m.fail();
        m.AREGS[0] =  ATOM_hash ;
        m.AREGS[1] = a2;
m.cont = cont;
        return $match_type_2_top(m);
    }

    private final static Operation $match_type_2_25(Prolog m) { 
    // '$match_type'(predicate_indicator,A):-nonvar(A),A=B:C/D,atom(B),atom(C),integer(D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$match_type'(predicate_indicator,A):-[nonvar(A),'$unify'(A,B:C/D),atom(B),atom(C),integer(D)]
        if (!  ATOM_predicate_indicator .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of nonvar(a(2))
        a2 = a2.dref();
        if ((a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002F_2 , a4, a5);
 ;
    // put_str_args([a(3),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a3, a6);
 ;
        //START inline expansion of $unify(a(2),a(7))
        if (! a2.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(3))
        a3 = a3.dref();
        if (! (a3 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(4))
        a4 = a4.dref();
        if (! (a4 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of integer(a(5))
        a5 = a5.dref();
        if (! (a5 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/3,non-(public))




    public static Operation PRED_$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_builtins::$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1);
        return $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(m);
    }

    private final static Operation $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(m);
    }

    private final static Operation $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_1(Prolog m) { 
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-A=[]
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-['$unify'(A,[])]
        //START inline expansion of $unify(a(1),@(Prolog.Nil))
        if (! a1.unify(Prolog.Nil, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_2(Prolog m) { 
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-A=[B|C]
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A,B,C):-['$unify'(A,[B|C])]
        a4 = CONS(a2, a3);
        //START inline expansion of $unify(a(1),a(4))
        if (! a1.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $builtin_append/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$builtin_append'/3,non-(public))




    public static Operation PRED_$builtin_append_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $builtin_append_3_top(m);
    }

    private final static Operation $builtin_append_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_builtins::$builtin_append_3_var, fail_0, fail_0, FILE_builtins::$builtin_append_3_1, fail_0, FILE_builtins::$builtin_append_3_2); 
    }

    private final static Operation $builtin_append_3_var(Prolog m) { 
        m.jtry3(null, FILE_builtins::$builtin_append_3_var_1);
        return $builtin_append_3_1(m);
    }

    private final static Operation $builtin_append_3_var_1(Prolog m) { 
        m.trust(null);
        return $builtin_append_3_2(m);
    }

    private final static Operation $builtin_append_3_1(Prolog m) { 
    // '$builtin_append'([],A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_append'([],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $builtin_append_3_2(Prolog m) { 
    // '$builtin_append'([A|B],C,[A|D]):-'$builtin_append'(B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$builtin_append'([A|B],C,[A|D]):-['$builtin_append'(B,C,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a4.unify(a3.car(), m.trail))
                return m.fail();
            a6 = a3.cdr();
        } else if (a3.isVar()){
            a6 = m.mkvar2();
             a3.bind(CONS(a4, a6), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a5;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
m.cont = cont;
        return $builtin_append_3_top(m);
    }
/** PREDICATE: $member_in_reverse/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$member_in_reverse'/2,non-(public))




    public static Operation PRED_$member_in_reverse_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $member_in_reverse_2_top(m);
    }

    private final static Operation $member_in_reverse_2_top(Prolog m) { 
        m.setB0();
        m.jtry2(null, FILE_builtins::$member_in_reverse_2_sub_1);
        return $member_in_reverse_2_1(m);
    }

    private final static Operation $member_in_reverse_2_sub_1(Prolog m) { 
        m.trust(null);
        return $member_in_reverse_2_2(m);
    }

    private final static Operation $member_in_reverse_2_1(Prolog m) { 
    // '$member_in_reverse'(A,[B|C]):-'$member_in_reverse'(A,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$member_in_reverse'(A,[B|C]):-['$member_in_reverse'(A,C)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a3 = a2.cdr();
        } else if (a2.isVar()){
            a3 = m.mkvar2();
             a2.bind(CONS(m.DONTCARE("cons(a(2))"), a3), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a1;
        m.AREGS[1] = a3;
m.cont = cont;
        return $member_in_reverse_2_top(m);
    }

    private final static Operation $member_in_reverse_2_2(Prolog m) { 
    // '$member_in_reverse'(A,[A|B]):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$member_in_reverse'(A,[A|B]):-[]
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a1.unify(a2.car(), m.trail))
                return m.fail();
        } else if (a2.isVar()){
             a2.bind(CONS(a1, m.DONTCARE("cons(a(2))")), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }
/** PREDICATE: $dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))




    public static Operation PRED_$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-atom(A),!,fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),atom(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isSymbol())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))




    public static Operation PRED_$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-java(A),!,fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),java(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of java(a(1))
        a1 = a1.dref();
        if (! (a1 .isFFIObject())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: with_mutex/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(with_mutex/2,public)
    private static final StructureTerm L_with_mutex_2_s4 = S( FUNCTOR_type_1 ,  ATOM_atom );
        final static SymbolTerm FUNCTOR_with_mutex_2 = F("with_mutex",2);
    private static final StructureTerm L_with_mutex_2_s11 = S( FUNCTOR_type_1 ,  ATOM_callable );




    public static Operation PRED_with_mutex_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_builtins::with_mutex_2_sub_1);
        return with_mutex_2_1(m);
    }

    private final static Operation with_mutex_2_sub_1(Prolog m) { 
        m.retry(null, FILE_builtins::with_mutex_2_sub_2);
        return with_mutex_2_2(m);
    }

    private final static Operation with_mutex_2_sub_2(Prolog m) { 
        m.retry(null, FILE_builtins::with_mutex_2_sub_3);
        return with_mutex_2_3(m);
    }

    private final static Operation with_mutex_2_sub_3(Prolog m) { 
        m.trust(null);
        return with_mutex_2_4(m);
    }

    private final static Operation with_mutex_2_1(Prolog m) { 
    // with_mutex(A,B):-'$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A),'$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A),!,illarg(type(atom),with_mutex(A,B),1)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // with_mutex(A,B):-['$get_level'(C),'$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A),'$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A),'$cut'(C),illarg(type(atom),with_mutex(A,B),1)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_with_mutex_2'),y(1),a(4))
        a4 =  S( FUNCTOR_with_mutex_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_with_mutex_2_s4, a4,  int_1 ), cont))));
    }

    private final static Operation with_mutex_2_2(Prolog m) { 
    // with_mutex(A,B):-var(B),!,illarg(var,with_mutex(A,B),2)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // with_mutex(A,B):-['$get_level'(C),var(B),'$cut'(C),illarg(var,with_mutex(A,B),2)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_with_mutex_2'),y(1),a(4))
        a4 =  S( FUNCTOR_with_mutex_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a4,  int_2 ), cont);
    }

    private final static Operation with_mutex_2_3(Prolog m) { 
    // with_mutex(A,B):-'$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(B),!,illarg(type(callable),with_mutex(A,B),2)
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // with_mutex(A,B):-['$get_level'(C),'$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(B),'$cut'(C),illarg(type(callable),with_mutex(A,B),2)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_with_mutex_2'),y(1),a(4))
        a4 =  S( FUNCTOR_with_mutex_2 , a1, a2);
 ;
        return //
 Op(FILE_system::PRED_$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec, VA(a2), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_illarg_3_static_exec, VA(L_with_mutex_2_s11, a4,  int_2 ), cont)));
    }

    private final static Operation with_mutex_2_4(Prolog m) { 
    // with_mutex(A,B):-mutex_lock_bt(A),call(B),!,mutex_unlock(A)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // with_mutex(A,B):-['$get_level'(C),mutex_lock_bt(A),call('SxxMachine':B),'$cut'(C),mutex_unlock(A)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op(FILE_system::PRED_mutex_lock_bt_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_call_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op(FILE_system::PRED_mutex_unlock_1_static_exec, VA(a1), cont))));
    }
/** PREDICATE: $dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'/1,non-(public))




    public static Operation PRED_$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_builtins::$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1);
        return $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(m);
    }

    private final static Operation $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(m);
    }

    private final static Operation $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_1(Prolog m) { 
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-callable(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-['$get_level'(B),callable(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op(FILE_system::PRED_callable_1_static_exec, VA(a1), //
 Op(FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_2(Prolog m) { 
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl'(A):-[]
        return cont;
    }
/** PREDICATE: java_constructor/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(java_constructor/2,public)




    public static Operation PRED_java_constructor_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // java_constructor(A,B):-A=..[C|D],builtin_java_convert_args(D,E),F=..[C|E],java_constructor0(F,G),B=G
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
        a2 = LARG[1];
    // java_constructor(A,B):-['$univ'(A,[C|D]),builtin_java_convert_args(D,E),'$univ'(F,[C|E]),java_constructor0(F,G),'$unify'(B,G)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = CONS(a3, a4);
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = CONS(a3, a6);
        a9 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a1, a5), //
 Op(FILE_system::PRED_builtin_java_convert_args_2_static_exec, VA(a4, a6), //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a7, a8), //
 Op(FILE_system::PRED_java_constructor0_2_static_exec, VA(a7, a9), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a2, a9), cont)))));
    }
/** PREDICATE: java_declared_constructor/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(java_declared_constructor/2,public)




    public static Operation PRED_java_declared_constructor_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // java_declared_constructor(A,B):-A=..[C|D],builtin_java_convert_args(D,E),F=..[C|E],java_declared_constructor0(F,G),B=G
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
        a2 = LARG[1];
    // java_declared_constructor(A,B):-['$univ'(A,[C|D]),builtin_java_convert_args(D,E),'$univ'(F,[C|E]),java_declared_constructor0(F,G),'$unify'(B,G)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = CONS(a3, a4);
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = CONS(a3, a6);
        a9 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a1, a5), //
 Op(FILE_system::PRED_builtin_java_convert_args_2_static_exec, VA(a4, a6), //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a7, a8), //
 Op(FILE_system::PRED_java_declared_constructor0_2_static_exec, VA(a7, a9), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a2, a9), cont)))));
    }
/** PREDICATE: java_method/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(java_method/3,public)




    public static Operation PRED_java_method_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // java_method(A,B,C):-B=..[D|E],builtin_java_convert_args(E,F),G=..[D|F],java_method0(A,G,H),java_conversion(I,H),C=I
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4, p5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // java_method(A,B,C):-['$univ'(B,[D|E]),builtin_java_convert_args(E,F),'$univ'(G,[D|F]),java_method0(A,G,H),java_conversion(I,H),'$unify'(C,I)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = CONS(a4, a5);
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = CONS(a4, a7);
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a2, a6), //
 Op(FILE_system::PRED_builtin_java_convert_args_2_static_exec, VA(a5, a7), //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a8, a9), //
 Op(FILE_system::PRED_java_method0_3_static_exec, VA(a1, a8, a10), //
 Op(FILE_system::PRED_java_conversion_2_static_exec, VA(a11, a10), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a3, a11), cont))))));
    }
/** PREDICATE: java_declared_method/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(java_declared_method/3,public)




    public static Operation PRED_java_declared_method_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // java_declared_method(A,B,C):-B=..[D|E],builtin_java_convert_args(E,F),G=..[D|F],java_declared_method0(A,G,H),java_conversion(I,H),C=I
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4, p5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // java_declared_method(A,B,C):-['$univ'(B,[D|E]),builtin_java_convert_args(E,F),'$univ'(G,[D|F]),java_declared_method0(A,G,H),java_conversion(I,H),'$unify'(C,I)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = CONS(a4, a5);
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = CONS(a4, a7);
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a2, a6), //
 Op(FILE_system::PRED_builtin_java_convert_args_2_static_exec, VA(a5, a7), //
 Op(FILE_system::PRED_$univ_2_static_exec, VA(a8, a9), //
 Op(FILE_system::PRED_java_declared_method0_3_static_exec, VA(a1, a8, a10), //
 Op(FILE_system::PRED_java_conversion_2_static_exec, VA(a11, a10), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a3, a11), cont))))));
    }
/** PREDICATE: java_get_field/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(java_get_field/3,public)




    public static Operation PRED_java_get_field_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // java_get_field(A,B,C):-java_get_field0(A,B,D),java_conversion(E,D),C=E
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // java_get_field(A,B,C):-[java_get_field0(A,B,D),java_conversion(E,D),'$unify'(C,E)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op(FILE_system::PRED_java_get_field0_3_static_exec, VA(a1, a2, a4), //
 Op(FILE_system::PRED_java_conversion_2_static_exec, VA(a5, a4), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a3, a5), cont)));
    }
/** PREDICATE: java_get_declared_field/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(java_get_declared_field/3,public)




    public static Operation PRED_java_get_declared_field_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // java_get_declared_field(A,B,C):-java_get_declared_field0(A,B,D),java_conversion(E,D),C=E
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // java_get_declared_field(A,B,C):-[java_get_declared_field0(A,B,D),java_conversion(E,D),'$unify'(C,E)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op(FILE_system::PRED_java_get_declared_field0_3_static_exec, VA(a1, a2, a4), //
 Op(FILE_system::PRED_java_conversion_2_static_exec, VA(a5, a4), //
 Op(FILE_system::PRED_$unify_2_static_exec, VA(a3, a5), cont)));
    }
/** PREDICATE: java_set_field/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(java_set_field/3,public)




    public static Operation PRED_java_set_field_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // java_set_field(A,B,C):-java_conversion(C,D),java_set_field0(A,B,D)
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // java_set_field(A,B,C):-[java_conversion(C,D),java_set_field0(A,B,D)]
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_java_conversion_2_static_exec, VA(a3, a4), //
 Op(FILE_system::PRED_java_set_field0_3_static_exec, VA(a1, a2, a4), cont));
    }
/** PREDICATE: java_set_declared_field/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(java_set_declared_field/3,public)




    public static Operation PRED_java_set_declared_field_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // java_set_declared_field(A,B,C):-java_conversion(C,D),java_set_declared_field0(A,B,D)
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // java_set_declared_field(A,B,C):-[java_conversion(C,D),java_set_declared_field0(A,B,D)]
        a4 = m.mkvar1();
        return //
 Op(FILE_system::PRED_java_conversion_2_static_exec, VA(a3, a4), //
 Op(FILE_system::PRED_java_set_declared_field0_3_static_exec, VA(a1, a2, a4), cont));
    }
/** PREDICATE: builtin_java_convert_args/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(builtin_java_convert_args/2,non-(public))




    public static Operation PRED_builtin_java_convert_args_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_builtins::builtin_java_convert_args_2_var, fail_0, fail_0, FILE_builtins::builtin_java_convert_args_2_1, fail_0, FILE_builtins::builtin_java_convert_args_2_2); 
    }

    private final static Operation builtin_java_convert_args_2_var(Prolog m) { 
        m.jtry2(null, FILE_builtins::builtin_java_convert_args_2_var_1);
        return builtin_java_convert_args_2_1(m);
    }

    private final static Operation builtin_java_convert_args_2_var_1(Prolog m) { 
        m.trust(null);
        return builtin_java_convert_args_2_2(m);
    }

    private final static Operation builtin_java_convert_args_2_1(Prolog m) { 
    // builtin_java_convert_args([],[]):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // builtin_java_convert_args([],[]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation builtin_java_convert_args_2_2(Prolog m) { 
    // builtin_java_convert_args([A|B],[C|D]):-java_conversion(A,C),builtin_java_convert_args(B,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // builtin_java_convert_args([A|B],[C|D]):-[java_conversion(A,C),builtin_java_convert_args(B,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
            a4 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
            a4 = m.mkvar2();
             a1.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a5 = a2.car();
            a6 = a2.cdr();
        } else if (a2.isVar()){
            a5 = m.mkvar2();
            a6 = m.mkvar2();
             a2.bind(CONS(a5, a6), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op(FILE_system::PRED_java_conversion_2_static_exec, VA(a3, a5), //
 Op(FILE_system::PRED_builtin_java_convert_args_2_static_exec, VA(a4, a6), cont));
    }
/** PREDICATE: synchronized/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main(synchronized/2,public)




    public static Operation PRED_synchronized_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // synchronized(A,B):-'$begin_sync'(A,C),call(B),'$end_sync'(C)
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
    // synchronized(A,B):-['$begin_sync'(A,C),call('SxxMachine':B),'$end_sync'(C)]
        a3 = m.mkvar1();
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op(FILE_system::PRED_$begin_sync_2_static_exec, VA(a1, a3), //
 Op(FILE_system::PRED_call_1_static_exec, VA(a4), //
 Op(FILE_system::PRED_$end_sync_1_static_exec, VA(a3), cont)));
    }
/** PREDICATE: $init/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl
*/
    // main('$init'/0,public)
        final static SymbolTerm ATOM_$0024tokens = SYM("$tokens");
    private static final StructureTerm L_$init_0_s6 = S( FUNCTOR_$002F_2 ,  ATOM_$0024tokens ,  int_1 );
        final static SymbolTerm ATOM_$003A$002D = SYM(":-");
    private static final StructureTerm L_$init_0_s14 = S( FUNCTOR_$0024current_operator_3 ,  int_1200 ,  ATOM_xfx ,  ATOM_$003A$002D );
    private static final StructureTerm L_$init_0_s17 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s14,  Prolog.True );
    private static final StructureTerm L_$init_0_s19 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s17);
        final static SymbolTerm ATOM_$002D$002D$003E = SYM("-->");
    private static final StructureTerm L_$init_0_s22 = S( FUNCTOR_$0024current_operator_3 ,  int_1200 ,  ATOM_xfx ,  ATOM_$002D$002D$003E );
    private static final StructureTerm L_$init_0_s24 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s22,  Prolog.True );
    private static final StructureTerm L_$init_0_s26 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s24);
    private static final StructureTerm L_$init_0_s29 = S( FUNCTOR_$0024current_operator_3 ,  int_1200 ,  ATOM_fx ,  ATOM_$003A$002D );
    private static final StructureTerm L_$init_0_s31 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s29,  Prolog.True );
    private static final StructureTerm L_$init_0_s33 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s31);
        final static SymbolTerm ATOM_$003F$002D = SYM("?-");
    private static final StructureTerm L_$init_0_s36 = S( FUNCTOR_$0024current_operator_3 ,  int_1200 ,  ATOM_fx ,  ATOM_$003F$002D );
    private static final StructureTerm L_$init_0_s38 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s36,  Prolog.True );
    private static final StructureTerm L_$init_0_s40 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s38);
        final static IntegerTerm int_1150 = Integer(1150);
        final static SymbolTerm ATOM_package = SYM("package");
    private static final StructureTerm L_$init_0_s44 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_package );
    private static final StructureTerm L_$init_0_s46 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s44,  Prolog.True );
    private static final StructureTerm L_$init_0_s48 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s46);
        final static SymbolTerm ATOM_import = SYM("import");
    private static final StructureTerm L_$init_0_s51 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_import );
    private static final StructureTerm L_$init_0_s53 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s51,  Prolog.True );
    private static final StructureTerm L_$init_0_s55 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s53);
        final static SymbolTerm ATOM_include = SYM("include");
    private static final StructureTerm L_$init_0_s58 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_include );
    private static final StructureTerm L_$init_0_s60 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s58,  Prolog.True );
    private static final StructureTerm L_$init_0_s62 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s60);
        final static SymbolTerm ATOM_include_resource = SYM("include_resource");
    private static final StructureTerm L_$init_0_s65 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_include_resource );
    private static final StructureTerm L_$init_0_s67 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s65,  Prolog.True );
    private static final StructureTerm L_$init_0_s69 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s67);
        final static SymbolTerm ATOM_constant = SYM("constant");
    private static final StructureTerm L_$init_0_s72 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_constant );
    private static final StructureTerm L_$init_0_s74 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s72,  Prolog.True );
    private static final StructureTerm L_$init_0_s76 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s74);
        final static SymbolTerm ATOM_public = SYM("public");
    private static final StructureTerm L_$init_0_s79 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_public );
    private static final StructureTerm L_$init_0_s81 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s79,  Prolog.True );
    private static final StructureTerm L_$init_0_s83 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s81);
        final static SymbolTerm ATOM_dynamic = SYM("dynamic");
    private static final StructureTerm L_$init_0_s86 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_dynamic );
    private static final StructureTerm L_$init_0_s88 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s86,  Prolog.True );
    private static final StructureTerm L_$init_0_s90 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s88);
        final static SymbolTerm ATOM_meta_predicate = SYM("meta_predicate");
    private static final StructureTerm L_$init_0_s93 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_meta_predicate );
    private static final StructureTerm L_$init_0_s95 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s93,  Prolog.True );
    private static final StructureTerm L_$init_0_s97 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s95);
        final static SymbolTerm ATOM_mode = SYM("mode");
    private static final StructureTerm L_$init_0_s100 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_mode );
    private static final StructureTerm L_$init_0_s102 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s100,  Prolog.True );
    private static final StructureTerm L_$init_0_s104 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s102);
        final static SymbolTerm ATOM_multifile = SYM("multifile");
    private static final StructureTerm L_$init_0_s107 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_multifile );
    private static final StructureTerm L_$init_0_s109 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s107,  Prolog.True );
    private static final StructureTerm L_$init_0_s111 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s109);
        final static SymbolTerm ATOM_block = SYM("block");
    private static final StructureTerm L_$init_0_s114 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_block );
    private static final StructureTerm L_$init_0_s116 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s114,  Prolog.True );
    private static final StructureTerm L_$init_0_s118 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s116);
        final static SymbolTerm ATOM_ifdef = SYM("ifdef");
    private static final StructureTerm L_$init_0_s121 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_ifdef );
    private static final StructureTerm L_$init_0_s123 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s121,  Prolog.True );
    private static final StructureTerm L_$init_0_s125 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s123);
        final static SymbolTerm ATOM_ifndef = SYM("ifndef");
    private static final StructureTerm L_$init_0_s128 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_ifndef );
    private static final StructureTerm L_$init_0_s130 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s128,  Prolog.True );
    private static final StructureTerm L_$init_0_s132 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s130);
        final static SymbolTerm ATOM_domain = SYM("domain");
    private static final StructureTerm L_$init_0_s135 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_domain );
    private static final StructureTerm L_$init_0_s137 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s135,  Prolog.True );
    private static final StructureTerm L_$init_0_s139 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s137);
        final static SymbolTerm ATOM_database = SYM("database");
    private static final StructureTerm L_$init_0_s142 = S( FUNCTOR_$0024current_operator_3 ,  int_1150 ,  ATOM_fx ,  ATOM_database );
    private static final StructureTerm L_$init_0_s144 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s142,  Prolog.True );
    private static final StructureTerm L_$init_0_s146 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s144);
        final static IntegerTerm int_1100 = Integer(1100);
    private static final StructureTerm L_$init_0_s151 = S( FUNCTOR_$0024current_operator_3 ,  int_1100 ,  ATOM_xfy ,  ATOM_or );
    private static final StructureTerm L_$init_0_s153 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s151,  Prolog.True );
    private static final StructureTerm L_$init_0_s155 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s153);
        final static IntegerTerm int_1050 = Integer(1050);
        final static SymbolTerm ATOM_$002D$003E = SYM("->");
    private static final StructureTerm L_$init_0_s159 = S( FUNCTOR_$0024current_operator_3 ,  int_1050 ,  ATOM_xfy ,  ATOM_$002D$003E );
    private static final StructureTerm L_$init_0_s161 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s159,  Prolog.True );
    private static final StructureTerm L_$init_0_s163 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s161);
        final static IntegerTerm int_1000 = Integer(1000);
    private static final StructureTerm L_$init_0_s167 = S( FUNCTOR_$0024current_operator_3 ,  int_1000 ,  ATOM_xfy ,  ATOM_$002C );
    private static final StructureTerm L_$init_0_s169 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s167,  Prolog.True );
    private static final StructureTerm L_$init_0_s171 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s169);
        final static IntegerTerm int_900 = Integer(900);
    private static final StructureTerm L_$init_0_s176 = S( FUNCTOR_$0024current_operator_3 ,  int_900 ,  ATOM_fy ,  ATOM_$005C$002B );
    private static final StructureTerm L_$init_0_s178 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s176,  Prolog.True );
    private static final StructureTerm L_$init_0_s180 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s178);
        final static IntegerTerm int_700 = Integer(700);
    private static final StructureTerm L_$init_0_s184 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$003D );
    private static final StructureTerm L_$init_0_s186 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s184,  Prolog.True );
    private static final StructureTerm L_$init_0_s188 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s186);
        final static SymbolTerm ATOM_$005C$003D = SYM("\\=");
    private static final StructureTerm L_$init_0_s191 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$005C$003D );
    private static final StructureTerm L_$init_0_s193 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s191,  Prolog.True );
    private static final StructureTerm L_$init_0_s195 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s193);
        final static SymbolTerm ATOM_$003D$003D = SYM("==");
    private static final StructureTerm L_$init_0_s198 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$003D$003D );
    private static final StructureTerm L_$init_0_s200 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s198,  Prolog.True );
    private static final StructureTerm L_$init_0_s202 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s200);
        final static SymbolTerm ATOM_$005C$003D$003D = SYM("\\==");
    private static final StructureTerm L_$init_0_s205 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$005C$003D$003D );
    private static final StructureTerm L_$init_0_s207 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s205,  Prolog.True );
    private static final StructureTerm L_$init_0_s209 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s207);
        final static SymbolTerm ATOM_$0040$003C = SYM("@<");
    private static final StructureTerm L_$init_0_s212 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$0040$003C );
    private static final StructureTerm L_$init_0_s214 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s212,  Prolog.True );
    private static final StructureTerm L_$init_0_s216 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s214);
        final static SymbolTerm ATOM_$0040$003E = SYM("@>");
    private static final StructureTerm L_$init_0_s219 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$0040$003E );
    private static final StructureTerm L_$init_0_s221 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s219,  Prolog.True );
    private static final StructureTerm L_$init_0_s223 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s221);
        final static SymbolTerm ATOM_$0040$003D$003C = SYM("@=<");
    private static final StructureTerm L_$init_0_s226 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$0040$003D$003C );
    private static final StructureTerm L_$init_0_s228 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s226,  Prolog.True );
    private static final StructureTerm L_$init_0_s230 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s228);
        final static SymbolTerm ATOM_$0040$003E$003D = SYM("@>=");
    private static final StructureTerm L_$init_0_s233 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$0040$003E$003D );
    private static final StructureTerm L_$init_0_s235 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s233,  Prolog.True );
    private static final StructureTerm L_$init_0_s237 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s235);
        final static SymbolTerm ATOM_$003D$002E$002E = SYM("=..");
    private static final StructureTerm L_$init_0_s240 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$003D$002E$002E );
    private static final StructureTerm L_$init_0_s242 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s240,  Prolog.True );
    private static final StructureTerm L_$init_0_s244 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s242);
        final static SymbolTerm ATOM_is = SYM("is");
    private static final StructureTerm L_$init_0_s247 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_is );
    private static final StructureTerm L_$init_0_s249 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s247,  Prolog.True );
    private static final StructureTerm L_$init_0_s251 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s249);
        final static SymbolTerm ATOM_$003D$003A$003D = SYM("=:=");
    private static final StructureTerm L_$init_0_s254 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$003D$003A$003D );
    private static final StructureTerm L_$init_0_s256 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s254,  Prolog.True );
    private static final StructureTerm L_$init_0_s258 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s256);
        final static SymbolTerm ATOM_$003D$005C$003D = SYM("=\\=");
    private static final StructureTerm L_$init_0_s261 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$003D$005C$003D );
    private static final StructureTerm L_$init_0_s263 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s261,  Prolog.True );
    private static final StructureTerm L_$init_0_s265 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s263);
    private static final StructureTerm L_$init_0_s268 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$003C );
    private static final StructureTerm L_$init_0_s270 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s268,  Prolog.True );
    private static final StructureTerm L_$init_0_s272 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s270);
    private static final StructureTerm L_$init_0_s275 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$003E );
    private static final StructureTerm L_$init_0_s277 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s275,  Prolog.True );
    private static final StructureTerm L_$init_0_s279 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s277);
        final static SymbolTerm ATOM_$003D$003C = SYM("=<");
    private static final StructureTerm L_$init_0_s282 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$003D$003C );
    private static final StructureTerm L_$init_0_s284 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s282,  Prolog.True );
    private static final StructureTerm L_$init_0_s286 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s284);
        final static SymbolTerm ATOM_$003E$003D = SYM(">=");
    private static final StructureTerm L_$init_0_s289 = S( FUNCTOR_$0024current_operator_3 ,  int_700 ,  ATOM_xfx ,  ATOM_$003E$003D );
    private static final StructureTerm L_$init_0_s291 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s289,  Prolog.True );
    private static final StructureTerm L_$init_0_s293 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s291);
        final static IntegerTerm int_550 = Integer(550);
    private static final StructureTerm L_$init_0_s297 = S( FUNCTOR_$0024current_operator_3 ,  int_550 ,  ATOM_xfy ,  ATOM_module_colon );
    private static final StructureTerm L_$init_0_s299 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s297,  Prolog.True );
    private static final StructureTerm L_$init_0_s301 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s299);
        final static IntegerTerm int_500 = Integer(500);
        final static SymbolTerm ATOM_$002B = SYM("+");
    private static final StructureTerm L_$init_0_s306 = S( FUNCTOR_$0024current_operator_3 ,  int_500 ,  ATOM_yfx ,  ATOM_$002B );
    private static final StructureTerm L_$init_0_s308 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s306,  Prolog.True );
    private static final StructureTerm L_$init_0_s310 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s308);
    private static final StructureTerm L_$init_0_s313 = S( FUNCTOR_$0024current_operator_3 ,  int_500 ,  ATOM_yfx ,  ATOM_$002D );
    private static final StructureTerm L_$init_0_s315 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s313,  Prolog.True );
    private static final StructureTerm L_$init_0_s317 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s315);
        final static SymbolTerm ATOM_$0023 = SYM("#");
    private static final StructureTerm L_$init_0_s320 = S( FUNCTOR_$0024current_operator_3 ,  int_500 ,  ATOM_yfx ,  ATOM_$0023 );
    private static final StructureTerm L_$init_0_s322 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s320,  Prolog.True );
    private static final StructureTerm L_$init_0_s324 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s322);
        final static SymbolTerm ATOM_$002F$005C = SYM("/\\");
    private static final StructureTerm L_$init_0_s327 = S( FUNCTOR_$0024current_operator_3 ,  int_500 ,  ATOM_yfx ,  ATOM_$002F$005C );
    private static final StructureTerm L_$init_0_s329 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s327,  Prolog.True );
    private static final StructureTerm L_$init_0_s331 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s329);
        final static SymbolTerm ATOM_$005C$002F = SYM("\\/");
    private static final StructureTerm L_$init_0_s334 = S( FUNCTOR_$0024current_operator_3 ,  int_500 ,  ATOM_yfx ,  ATOM_$005C$002F );
    private static final StructureTerm L_$init_0_s336 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s334,  Prolog.True );
    private static final StructureTerm L_$init_0_s338 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s336);
    private static final StructureTerm L_$init_0_s340 = S( FUNCTOR_$0024current_operator_3 ,  int_500 ,  ATOM_fx ,  ATOM_$002B );
    private static final StructureTerm L_$init_0_s342 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s340,  Prolog.True );
    private static final StructureTerm L_$init_0_s344 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s342);
        final static IntegerTerm int_400 = Integer(400);
        final static SymbolTerm ATOM_$002A = SYM("*");
    private static final StructureTerm L_$init_0_s348 = S( FUNCTOR_$0024current_operator_3 ,  int_400 ,  ATOM_yfx ,  ATOM_$002A );
    private static final StructureTerm L_$init_0_s350 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s348,  Prolog.True );
    private static final StructureTerm L_$init_0_s352 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s350);
        final static SymbolTerm ATOM_$002F = SYM("/");
    private static final StructureTerm L_$init_0_s355 = S( FUNCTOR_$0024current_operator_3 ,  int_400 ,  ATOM_yfx ,  ATOM_$002F );
    private static final StructureTerm L_$init_0_s357 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s355,  Prolog.True );
    private static final StructureTerm L_$init_0_s359 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s357);
        final static SymbolTerm ATOM_$002F$002F = SYM("//");
    private static final StructureTerm L_$init_0_s362 = S( FUNCTOR_$0024current_operator_3 ,  int_400 ,  ATOM_yfx ,  ATOM_$002F$002F );
    private static final StructureTerm L_$init_0_s364 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s362,  Prolog.True );
    private static final StructureTerm L_$init_0_s366 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s364);
        final static SymbolTerm ATOM_mod = SYM("mod");
    private static final StructureTerm L_$init_0_s369 = S( FUNCTOR_$0024current_operator_3 ,  int_400 ,  ATOM_yfx ,  ATOM_mod );
    private static final StructureTerm L_$init_0_s371 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s369,  Prolog.True );
    private static final StructureTerm L_$init_0_s373 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s371);
        final static SymbolTerm ATOM_rem = SYM("rem");
    private static final StructureTerm L_$init_0_s376 = S( FUNCTOR_$0024current_operator_3 ,  int_400 ,  ATOM_yfx ,  ATOM_rem );
    private static final StructureTerm L_$init_0_s378 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s376,  Prolog.True );
    private static final StructureTerm L_$init_0_s380 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s378);
        final static SymbolTerm ATOM_$003C$003C = SYM("<<");
    private static final StructureTerm L_$init_0_s383 = S( FUNCTOR_$0024current_operator_3 ,  int_400 ,  ATOM_yfx ,  ATOM_$003C$003C );
    private static final StructureTerm L_$init_0_s385 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s383,  Prolog.True );
    private static final StructureTerm L_$init_0_s387 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s385);
        final static SymbolTerm ATOM_$003E$003E = SYM(">>");
    private static final StructureTerm L_$init_0_s390 = S( FUNCTOR_$0024current_operator_3 ,  int_400 ,  ATOM_yfx ,  ATOM_$003E$003E );
    private static final StructureTerm L_$init_0_s392 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s390,  Prolog.True );
    private static final StructureTerm L_$init_0_s394 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s392);
        final static IntegerTerm int_300 = Integer(300);
        final static SymbolTerm ATOM_$007E = SYM("~");
    private static final StructureTerm L_$init_0_s398 = S( FUNCTOR_$0024current_operator_3 ,  int_300 ,  ATOM_xfx ,  ATOM_$007E );
    private static final StructureTerm L_$init_0_s400 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s398,  Prolog.True );
    private static final StructureTerm L_$init_0_s402 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s400);
        final static IntegerTerm int_200 = Integer(200);
        final static SymbolTerm ATOM_$002A$002A = SYM("**");
    private static final StructureTerm L_$init_0_s406 = S( FUNCTOR_$0024current_operator_3 ,  int_200 ,  ATOM_xfx ,  ATOM_$002A$002A );
    private static final StructureTerm L_$init_0_s408 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s406,  Prolog.True );
    private static final StructureTerm L_$init_0_s410 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s408);
    private static final StructureTerm L_$init_0_s413 = S( FUNCTOR_$0024current_operator_3 ,  int_200 ,  ATOM_xfy ,  ATOM_$005E );
    private static final StructureTerm L_$init_0_s415 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s413,  Prolog.True );
    private static final StructureTerm L_$init_0_s417 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s415);
        final static SymbolTerm ATOM_$005C = SYM("\\");
    private static final StructureTerm L_$init_0_s420 = S( FUNCTOR_$0024current_operator_3 ,  int_200 ,  ATOM_fy ,  ATOM_$005C );
    private static final StructureTerm L_$init_0_s422 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s420,  Prolog.True );
    private static final StructureTerm L_$init_0_s424 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s422);
    private static final StructureTerm L_$init_0_s426 = S( FUNCTOR_$0024current_operator_3 ,  int_200 ,  ATOM_fy ,  ATOM_$002D );
    private static final StructureTerm L_$init_0_s428 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s426,  Prolog.True );
    private static final StructureTerm L_$init_0_s430 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s428);
        final static SymbolTerm ATOM_$0024consulted_file = SYM("$consulted_file");
    private static final StructureTerm L_$init_0_s433 = S( FUNCTOR_$002F_2 ,  ATOM_$0024consulted_file ,  int_1 );
        final static SymbolTerm ATOM_$0024consulted_import = SYM("$consulted_import");
    private static final StructureTerm L_$init_0_s437 = S( FUNCTOR_$002F_2 ,  ATOM_$0024consulted_import ,  int_2 );
        final static SymbolTerm ATOM_$0024consulted_package = SYM("$consulted_package");
    private static final StructureTerm L_$init_0_s440 = S( FUNCTOR_$002F_2 ,  ATOM_$0024consulted_package ,  int_1 );
        final static SymbolTerm ATOM_$0024consulted_predicate = SYM("$consulted_predicate");
    private static final StructureTerm L_$init_0_s444 = S( FUNCTOR_$002F_2 ,  ATOM_$0024consulted_predicate ,  int_3 );




    public static Operation PRED_$init_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$init':-'$new_indexing_hash'('SxxMachine','$tokens'/1,A),assertz(('$current_operator'(1200,xfx,:-):-true)),assertz(('$current_operator'(1200,xfx,-->):-true)),assertz(('$current_operator'(1200,fx,:-):-true)),assertz(('$current_operator'(1200,fx,?-):-true)),assertz(('$current_operator'(1150,fx,package):-true)),assertz(('$current_operator'(1150,fx,import):-true)),assertz(('$current_operator'(1150,fx,include):-true)),assertz(('$current_operator'(1150,fx,include_resource):-true)),assertz(('$current_operator'(1150,fx,constant):-true)),assertz(('$current_operator'(1150,fx,public):-true)),assertz(('$current_operator'(1150,fx,dynamic):-true)),assertz(('$current_operator'(1150,fx,meta_predicate):-true)),assertz(('$current_operator'(1150,fx,mode):-true)),assertz(('$current_operator'(1150,fx,multifile):-true)),assertz(('$current_operator'(1150,fx,block):-true)),assertz(('$current_operator'(1150,fx,ifdef):-true)),assertz(('$current_operator'(1150,fx,ifndef):-true)),assertz(('$current_operator'(1150,fx,domain):-true)),assertz(('$current_operator'(1150,fx,database):-true)),assertz(('$current_operator'(1100,xfy,;):-true)),assertz(('$current_operator'(1050,xfy,->):-true)),assertz(('$current_operator'(1000,xfy,','):-true)),assertz(('$current_operator'(900,fy,\+):-true)),assertz(('$current_operator'(700,xfx,=):-true)),assertz(('$current_operator'(700,xfx,\=):-true)),assertz(('$current_operator'(700,xfx,==):-true)),assertz(('$current_operator'(700,xfx,\==):-true)),assertz(('$current_operator'(700,xfx,@<):-true)),assertz(('$current_operator'(700,xfx,@>):-true)),assertz(('$current_operator'(700,xfx,@=<):-true)),assertz(('$current_operator'(700,xfx,@>=):-true)),assertz(('$current_operator'(700,xfx,=..):-true)),assertz(('$current_operator'(700,xfx,is):-true)),assertz(('$current_operator'(700,xfx,=:=):-true)),assertz(('$current_operator'(700,xfx,=\=):-true)),assertz(('$current_operator'(700,xfx,<):-true)),assertz(('$current_operator'(700,xfx,>):-true)),assertz(('$current_operator'(700,xfx,=<):-true)),assertz(('$current_operator'(700,xfx,>=):-true)),assertz(('$current_operator'(550,xfy,:):-true)),assertz(('$current_operator'(500,yfx,+):-true)),assertz(('$current_operator'(500,yfx,-):-true)),assertz(('$current_operator'(500,yfx,#):-true)),assertz(('$current_operator'(500,yfx,/\):-true)),assertz(('$current_operator'(500,yfx,\/):-true)),assertz(('$current_operator'(500,fx,+):-true)),assertz(('$current_operator'(400,yfx,*):-true)),assertz(('$current_operator'(400,yfx,/):-true)),assertz(('$current_operator'(400,yfx,//):-true)),assertz(('$current_operator'(400,yfx,mod):-true)),assertz(('$current_operator'(400,yfx,rem):-true)),assertz(('$current_operator'(400,yfx,<<):-true)),assertz(('$current_operator'(400,yfx,>>):-true)),assertz(('$current_operator'(300,xfx,~):-true)),assertz(('$current_operator'(200,xfx,**):-true)),assertz(('$current_operator'(200,xfy,^):-true)),assertz(('$current_operator'(200,fy,\):-true)),assertz(('$current_operator'(200,fy,-):-true)),'$new_indexing_hash'('SxxMachine','$consulted_file'/1,B),'$new_indexing_hash'('SxxMachine','$consulted_import'/2,C),'$new_indexing_hash'('SxxMachine','$consulted_package'/1,D),'$new_indexing_hash'('SxxMachine','$consulted_predicate'/3,E)
        m.setB0();
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50, p51, p52, p53, p54, p55, p56, p57, p58, p59, p60, p61, p62;
    // '$init':-['$new_indexing_hash'('SxxMachine','$tokens'/1,A),assertz('SxxMachine':('$current_operator'(1200,xfx,:-):-true)),assertz('SxxMachine':('$current_operator'(1200,xfx,-->):-true)),assertz('SxxMachine':('$current_operator'(1200,fx,:-):-true)),assertz('SxxMachine':('$current_operator'(1200,fx,?-):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,package):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,import):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,include):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,include_resource):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,constant):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,public):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,dynamic):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,meta_predicate):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,mode):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,multifile):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,block):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,ifdef):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,ifndef):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,domain):-true)),assertz('SxxMachine':('$current_operator'(1150,fx,database):-true)),assertz('SxxMachine':('$current_operator'(1100,xfy,;):-true)),assertz('SxxMachine':('$current_operator'(1050,xfy,->):-true)),assertz('SxxMachine':('$current_operator'(1000,xfy,','):-true)),assertz('SxxMachine':('$current_operator'(900,fy,\+):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,=):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,\=):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,==):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,\==):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,@<):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,@>):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,@=<):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,@>=):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,=..):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,is):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,=:=):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,=\=):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,<):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,>):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,=<):-true)),assertz('SxxMachine':('$current_operator'(700,xfx,>=):-true)),assertz('SxxMachine':('$current_operator'(550,xfy,:):-true)),assertz('SxxMachine':('$current_operator'(500,yfx,+):-true)),assertz('SxxMachine':('$current_operator'(500,yfx,-):-true)),assertz('SxxMachine':('$current_operator'(500,yfx,#):-true)),assertz('SxxMachine':('$current_operator'(500,yfx,/\):-true)),assertz('SxxMachine':('$current_operator'(500,yfx,\/):-true)),assertz('SxxMachine':('$current_operator'(500,fx,+):-true)),assertz('SxxMachine':('$current_operator'(400,yfx,*):-true)),assertz('SxxMachine':('$current_operator'(400,yfx,/):-true)),assertz('SxxMachine':('$current_operator'(400,yfx,//):-true)),assertz('SxxMachine':('$current_operator'(400,yfx,mod):-true)),assertz('SxxMachine':('$current_operator'(400,yfx,rem):-true)),assertz('SxxMachine':('$current_operator'(400,yfx,<<):-true)),assertz('SxxMachine':('$current_operator'(400,yfx,>>):-true)),assertz('SxxMachine':('$current_operator'(300,xfx,~):-true)),assertz('SxxMachine':('$current_operator'(200,xfx,**):-true)),assertz('SxxMachine':('$current_operator'(200,xfy,^):-true)),assertz('SxxMachine':('$current_operator'(200,fy,\):-true)),assertz('SxxMachine':('$current_operator'(200,fy,-):-true)),'$new_indexing_hash'('SxxMachine','$consulted_file'/1,B),'$new_indexing_hash'('SxxMachine','$consulted_import'/2,C),'$new_indexing_hash'('SxxMachine','$consulted_package'/1,D),'$new_indexing_hash'('SxxMachine','$consulted_predicate'/3,E)]
        return //
 Op(FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$init_0_s6, m.DONT_CARE2()), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s19), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s26), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s33), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s40), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s48), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s55), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s62), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s69), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s76), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s83), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s90), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s97), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s104), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s111), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s118), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s125), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s132), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s139), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s146), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s155), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s163), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s171), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s180), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s188), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s195), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s202), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s209), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s216), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s223), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s230), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s237), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s244), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s251), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s258), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s265), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s272), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s279), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s286), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s293), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s301), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s310), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s317), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s324), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s331), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s338), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s344), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s352), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s359), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s366), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s373), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s380), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s387), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s394), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s402), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s410), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s417), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s424), //
 Op(FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s430), //
 Op(FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$init_0_s433, m.DONT_CARE2()), //
 Op(FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$init_0_s437, m.DONT_CARE2()), //
 Op(FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$init_0_s440, m.DONT_CARE2()), //
 Op(FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$init_0_s444, m.DONT_CARE2()), cont)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))));
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("package",1,FILE_builtins::PRED_package_1_static_exec);
   PredTable.registerBuiltin("true",0,FILE_builtins::PRED_true_0_static_exec);
   PredTable.registerBuiltin("otherwise",0,FILE_builtins::PRED_otherwise_0_static_exec);
   PredTable.registerBuiltin("fail",0,FILE_builtins::PRED_fail_0_static_exec);
   PredTable.registerBuiltin("false",0,FILE_builtins::PRED_false_0_static_exec);
   PredTable.registerBuiltin("!","$0021",0,FILE_builtins::PRED_$0021_0_static_exec);
   PredTable.registerBuiltin("^","$005E",2,FILE_builtins::PRED_$005E_2_static_exec);
   PredTable.registerBuiltin(",","$002C",2,FILE_builtins::PRED_$002C_2_static_exec);
   PredTable.registerBuiltin(";","$003B",2,FILE_builtins::PRED_$003B_2_static_exec);
   PredTable.registerBuiltin("->","$002D$003E",2,FILE_builtins::PRED_$002D$003E_2_static_exec);
   PredTable.registerBuiltin("call",1,FILE_builtins::PRED_call_1_static_exec);
   PredTable.registerBuiltin("$meta_call",5,FILE_builtins::PRED_$meta_call_5_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",7,FILE_builtins::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_7_static_exec);
   PredTable.registerBuiltin("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",6,FILE_builtins::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",6,FILE_builtins::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",4,FILE_builtins::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec);
   PredTable.registerBuiltin("$meta_call",4,FILE_builtins::PRED_$meta_call_4_static_exec);
   PredTable.registerBuiltin("$call_internal",5,FILE_builtins::PRED_$call_internal_5_static_exec);
   PredTable.registerBuiltin("catch",3,FILE_builtins::PRED_catch_3_static_exec);
   PredTable.registerBuiltin("throw",1,FILE_builtins::PRED_throw_1_static_exec);
   PredTable.registerBuiltin("on_exception",3,FILE_builtins::PRED_on_exception_3_static_exec);
   PredTable.registerBuiltin("$on_exception",3,FILE_builtins::PRED_$on_exception_3_static_exec);
   PredTable.registerBuiltin("$catch_and_throw",3,FILE_builtins::PRED_$catch_and_throw_3_static_exec);
   PredTable.registerBuiltin("=","$003D",2,FILE_builtins::PRED_$003D_2_static_exec);
   PredTable.registerBuiltin("$unify",2,FILE_builtins::PRED_$unify_2_static_exec);
   PredTable.registerBuiltin("\\\\=","$005C$003D",2,FILE_builtins::PRED_$005C$003D_2_static_exec);
   PredTable.registerBuiltin("$not_unifiable",2,FILE_builtins::PRED_$not_unifiable_2_static_exec);
   PredTable.registerBuiltin("var",1,FILE_builtins::PRED_var_1_static_exec);
   PredTable.registerBuiltin("atom",1,FILE_builtins::PRED_atom_1_static_exec);
   PredTable.registerBuiltin("integer",1,FILE_builtins::PRED_integer_1_static_exec);
   PredTable.registerBuiltin("long",1,FILE_builtins::PRED_long_1_static_exec);
   PredTable.registerBuiltin("float",1,FILE_builtins::PRED_float_1_static_exec);
   PredTable.registerBuiltin("atomic",1,FILE_builtins::PRED_atomic_1_static_exec);
   PredTable.registerBuiltin("nonvar",1,FILE_builtins::PRED_nonvar_1_static_exec);
   PredTable.registerBuiltin("number",1,FILE_builtins::PRED_number_1_static_exec);
   PredTable.registerBuiltin("java",1,FILE_builtins::PRED_java_1_static_exec);
   PredTable.registerBuiltin("java",2,FILE_builtins::PRED_java_2_static_exec);
   PredTable.registerBuiltin("closure",1,FILE_builtins::PRED_closure_1_static_exec);
   PredTable.registerBuiltin("ground",1,FILE_builtins::PRED_ground_1_static_exec);
   PredTable.registerBuiltin("compound",1,FILE_builtins::PRED_compound_1_static_exec);
   PredTable.registerBuiltin("callable",1,FILE_builtins::PRED_callable_1_static_exec);
   PredTable.registerBuiltin("==","$003D$003D",2,FILE_builtins::PRED_$003D$003D_2_static_exec);
   PredTable.registerBuiltin("$equality_of_term",2,FILE_builtins::PRED_$equality_of_term_2_static_exec);
   PredTable.registerBuiltin("\\\\==","$005C$003D$003D",2,FILE_builtins::PRED_$005C$003D$003D_2_static_exec);
   PredTable.registerBuiltin("$inequality_of_term",2,FILE_builtins::PRED_$inequality_of_term_2_static_exec);
   PredTable.registerBuiltin("@<","$0040$003C",2,FILE_builtins::PRED_$0040$003C_2_static_exec);
   PredTable.registerBuiltin("$before",2,FILE_builtins::PRED_$before_2_static_exec);
   PredTable.registerBuiltin("@>","$0040$003E",2,FILE_builtins::PRED_$0040$003E_2_static_exec);
   PredTable.registerBuiltin("$after",2,FILE_builtins::PRED_$after_2_static_exec);
   PredTable.registerBuiltin("@=<","$0040$003D$003C",2,FILE_builtins::PRED_$0040$003D$003C_2_static_exec);
   PredTable.registerBuiltin("$not_after",2,FILE_builtins::PRED_$not_after_2_static_exec);
   PredTable.registerBuiltin("@>=","$0040$003E$003D",2,FILE_builtins::PRED_$0040$003E$003D_2_static_exec);
   PredTable.registerBuiltin("$not_before",2,FILE_builtins::PRED_$not_before_2_static_exec);
   PredTable.registerBuiltin("?=","$003F$003D",2,FILE_builtins::PRED_$003F$003D_2_static_exec);
   PredTable.registerBuiltin("$identical_or_cannot_unify",2,FILE_builtins::PRED_$identical_or_cannot_unify_2_static_exec);
   PredTable.registerBuiltin("compare",3,FILE_builtins::PRED_compare_3_static_exec);
   PredTable.registerBuiltin("$map_compare_op",2,FILE_builtins::PRED_$map_compare_op_2_static_exec);
   PredTable.registerBuiltin("=..","$003D$002E$002E",2,FILE_builtins::PRED_$003D$002E$002E_2_static_exec);
   PredTable.registerBuiltin("copy_term",2,FILE_builtins::PRED_copy_term_2_static_exec);
   PredTable.registerBuiltin("is",2,FILE_builtins::PRED_is_2_static_exec);
   PredTable.registerBuiltin("$abs",2,FILE_builtins::PRED_$abs_2_static_exec);
   PredTable.registerBuiltin("$asin",2,FILE_builtins::PRED_$asin_2_static_exec);
   PredTable.registerBuiltin("$acos",2,FILE_builtins::PRED_$acos_2_static_exec);
   PredTable.registerBuiltin("$atan",2,FILE_builtins::PRED_$atan_2_static_exec);
   PredTable.registerBuiltin("$bitwise_conj",3,FILE_builtins::PRED_$bitwise_conj_3_static_exec);
   PredTable.registerBuiltin("$bitwise_disj",3,FILE_builtins::PRED_$bitwise_disj_3_static_exec);
   PredTable.registerBuiltin("$bitwise_exclusive_or",3,FILE_builtins::PRED_$bitwise_exclusive_or_3_static_exec);
   PredTable.registerBuiltin("$bitwise_neg",2,FILE_builtins::PRED_$bitwise_neg_2_static_exec);
   PredTable.registerBuiltin("$ceil",2,FILE_builtins::PRED_$ceil_2_static_exec);
   PredTable.registerBuiltin("$cos",2,FILE_builtins::PRED_$cos_2_static_exec);
   PredTable.registerBuiltin("$degrees",2,FILE_builtins::PRED_$degrees_2_static_exec);
   PredTable.registerBuiltin("$exp",2,FILE_builtins::PRED_$exp_2_static_exec);
   PredTable.registerBuiltin("$float",2,FILE_builtins::PRED_$float_2_static_exec);
   PredTable.registerBuiltin("$float_integer_part",2,FILE_builtins::PRED_$float_integer_part_2_static_exec);
   PredTable.registerBuiltin("$float_fractional_part",2,FILE_builtins::PRED_$float_fractional_part_2_static_exec);
   PredTable.registerBuiltin("$float_quotient",3,FILE_builtins::PRED_$float_quotient_3_static_exec);
   PredTable.registerBuiltin("$floor",2,FILE_builtins::PRED_$floor_2_static_exec);
   PredTable.registerBuiltin("$int_quotient",3,FILE_builtins::PRED_$int_quotient_3_static_exec);
   PredTable.registerBuiltin("$log",2,FILE_builtins::PRED_$log_2_static_exec);
   PredTable.registerBuiltin("$max",3,FILE_builtins::PRED_$max_3_static_exec);
   PredTable.registerBuiltin("$min",3,FILE_builtins::PRED_$min_3_static_exec);
   PredTable.registerBuiltin("$minus",3,FILE_builtins::PRED_$minus_3_static_exec);
   PredTable.registerBuiltin("$mod",3,FILE_builtins::PRED_$mod_3_static_exec);
   PredTable.registerBuiltin("$multi",3,FILE_builtins::PRED_$multi_3_static_exec);
   PredTable.registerBuiltin("$plus",3,FILE_builtins::PRED_$plus_3_static_exec);
   PredTable.registerBuiltin("$pow",3,FILE_builtins::PRED_$pow_3_static_exec);
   PredTable.registerBuiltin("$radians",2,FILE_builtins::PRED_$radians_2_static_exec);
   PredTable.registerBuiltin("$rint",2,FILE_builtins::PRED_$rint_2_static_exec);
   PredTable.registerBuiltin("$round",2,FILE_builtins::PRED_$round_2_static_exec);
   PredTable.registerBuiltin("$shift_left",3,FILE_builtins::PRED_$shift_left_3_static_exec);
   PredTable.registerBuiltin("$shift_right",3,FILE_builtins::PRED_$shift_right_3_static_exec);
   PredTable.registerBuiltin("$sign",2,FILE_builtins::PRED_$sign_2_static_exec);
   PredTable.registerBuiltin("$sin",2,FILE_builtins::PRED_$sin_2_static_exec);
   PredTable.registerBuiltin("$sqrt",2,FILE_builtins::PRED_$sqrt_2_static_exec);
   PredTable.registerBuiltin("$tan",2,FILE_builtins::PRED_$tan_2_static_exec);
   PredTable.registerBuiltin("$truncate",2,FILE_builtins::PRED_$truncate_2_static_exec);
   PredTable.registerBuiltin("=:=","$003D$003A$003D",2,FILE_builtins::PRED_$003D$003A$003D_2_static_exec);
   PredTable.registerBuiltin("$arith_equal",2,FILE_builtins::PRED_$arith_equal_2_static_exec);
   PredTable.registerBuiltin("=\\\\=","$003D$005C$003D",2,FILE_builtins::PRED_$003D$005C$003D_2_static_exec);
   PredTable.registerBuiltin("$arith_not_equal",2,FILE_builtins::PRED_$arith_not_equal_2_static_exec);
   PredTable.registerBuiltin("<","$003C",2,FILE_builtins::PRED_$003C_2_static_exec);
   PredTable.registerBuiltin("$less_than",2,FILE_builtins::PRED_$less_than_2_static_exec);
   PredTable.registerBuiltin("=<","$003D$003C",2,FILE_builtins::PRED_$003D$003C_2_static_exec);
   PredTable.registerBuiltin("$less_or_equal",2,FILE_builtins::PRED_$less_or_equal_2_static_exec);
   PredTable.registerBuiltin(">","$003E",2,FILE_builtins::PRED_$003E_2_static_exec);
   PredTable.registerBuiltin("$greater_than",2,FILE_builtins::PRED_$greater_than_2_static_exec);
   PredTable.registerBuiltin(">=","$003E$003D",2,FILE_builtins::PRED_$003E$003D_2_static_exec);
   PredTable.registerBuiltin("$greater_or_equal",2,FILE_builtins::PRED_$greater_or_equal_2_static_exec);
   PredTable.registerBuiltin("clause",2,FILE_builtins::PRED_clause_2_static_exec);
   PredTable.registerBuiltin("$head_to_term",4,FILE_builtins::PRED_$head_to_term_4_static_exec);
   PredTable.registerBuiltin("$head_to_term",5,FILE_builtins::PRED_$head_to_term_5_static_exec);
   PredTable.registerBuiltin("$new_internal_database",1,FILE_builtins::PRED_$new_internal_database_1_static_exec);
   PredTable.registerBuiltin("$new_internal_database",2,FILE_builtins::PRED_$new_internal_database_2_static_exec);
   PredTable.registerBuiltin("$init_internal_database",1,FILE_builtins::PRED_$init_internal_database_1_static_exec);
   PredTable.registerBuiltin("$defined_internal_database",1,FILE_builtins::PRED_$defined_internal_database_1_static_exec);
   PredTable.registerBuiltin("$clause_internal",5,FILE_builtins::PRED_$clause_internal_5_static_exec);
   PredTable.registerBuiltin("$clause_internal0",3,FILE_builtins::PRED_$clause_internal0_3_static_exec);
   PredTable.registerBuiltin("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",3,FILE_builtins::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec);
   PredTable.registerBuiltin("$get_indices",4,FILE_builtins::PRED_$get_indices_4_static_exec);
   PredTable.registerBuiltin("$new_indexing_hash",3,FILE_builtins::PRED_$new_indexing_hash_3_static_exec);
   PredTable.registerBuiltin("$calc_indexing_key",2,FILE_builtins::PRED_$calc_indexing_key_2_static_exec);
   PredTable.registerBuiltin("$calc_indexing_key0",2,FILE_builtins::PRED_$calc_indexing_key0_2_static_exec);
   PredTable.registerBuiltin("$check_procedure_permission",4,FILE_builtins::PRED_$check_procedure_permission_4_static_exec);
   PredTable.registerBuiltin("initialization",2,FILE_builtins::PRED_initialization_2_static_exec);
   PredTable.registerBuiltin("assert",1,FILE_builtins::PRED_assert_1_static_exec);
   PredTable.registerBuiltin("assertz",1,FILE_builtins::PRED_assertz_1_static_exec);
   PredTable.registerBuiltin("asserta",1,FILE_builtins::PRED_asserta_1_static_exec);
   PredTable.registerBuiltin("abolish",1,FILE_builtins::PRED_abolish_1_static_exec);
   PredTable.registerBuiltin("retract",1,FILE_builtins::PRED_retract_1_static_exec);
   PredTable.registerBuiltin("retractall",1,FILE_builtins::PRED_retractall_1_static_exec);
   PredTable.registerBuiltin("$term_to_clause",4,FILE_builtins::PRED_$term_to_clause_4_static_exec);
   PredTable.registerBuiltin("$term_to_clause",5,FILE_builtins::PRED_$term_to_clause_5_static_exec);
   PredTable.registerBuiltin("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("$term_to_head",4,FILE_builtins::PRED_$term_to_head_4_static_exec);
   PredTable.registerBuiltin("$term_to_body",4,FILE_builtins::PRED_$term_to_body_4_static_exec);
   PredTable.registerBuiltin("$localize_body",3,FILE_builtins::PRED_$localize_body_3_static_exec);
   PredTable.registerBuiltin("$localize_args",4,FILE_builtins::PRED_$localize_args_4_static_exec);
   PredTable.registerBuiltin("$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",3,FILE_builtins::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec);
   PredTable.registerBuiltin("$builtin_meta_predicates",3,FILE_builtins::PRED_$builtin_meta_predicates_3_static_exec);
   PredTable.registerBuiltin("$clause_to_term",4,FILE_builtins::PRED_$clause_to_term_4_static_exec);
   PredTable.registerBuiltin("$clause_to_term",5,FILE_builtins::PRED_$clause_to_term_5_static_exec);
   PredTable.registerBuiltin("$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("$term_to_predicateindicator",3,FILE_builtins::PRED_$term_to_predicateindicator_3_static_exec);
   PredTable.registerBuiltin("$term_to_predicateindicator",5,FILE_builtins::PRED_$term_to_predicateindicator_5_static_exec);
   PredTable.registerBuiltin("$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("$update_indexing",5,FILE_builtins::PRED_$update_indexing_5_static_exec);
   PredTable.registerBuiltin("$gen_indexing_keys",3,FILE_builtins::PRED_$gen_indexing_keys_3_static_exec);
   PredTable.registerBuiltin("$gen_indexing_keys0",3,FILE_builtins::PRED_$gen_indexing_keys0_3_static_exec);
   PredTable.registerBuiltin("$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",3,FILE_builtins::PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec);
   PredTable.registerBuiltin("$update_indexing_hash",4,FILE_builtins::PRED_$update_indexing_hash_4_static_exec);
   PredTable.registerBuiltin("$hash_adda_all",3,FILE_builtins::PRED_$hash_adda_all_3_static_exec);
   PredTable.registerBuiltin("$hash_addz_all",3,FILE_builtins::PRED_$hash_addz_all_3_static_exec);
   PredTable.registerBuiltin("$erase_all",1,FILE_builtins::PRED_$erase_all_1_static_exec);
   PredTable.registerBuiltin("$rehash_indexing",3,FILE_builtins::PRED_$rehash_indexing_3_static_exec);
   PredTable.registerBuiltin("$remove_index_all",3,FILE_builtins::PRED_$remove_index_all_3_static_exec);
   PredTable.registerBuiltin("findall",3,FILE_builtins::PRED_findall_3_static_exec);
   PredTable.registerBuiltin("$findall",4,FILE_builtins::PRED_$findall_4_static_exec);
   PredTable.registerBuiltin("bagof",3,FILE_builtins::PRED_bagof_3_static_exec);
   PredTable.registerBuiltin("setof",3,FILE_builtins::PRED_setof_3_static_exec);
   PredTable.registerBuiltin("$bagof",3,FILE_builtins::PRED_$bagof_3_static_exec);
   PredTable.registerBuiltin("$bagof_instances",3,FILE_builtins::PRED_$bagof_instances_3_static_exec);
   PredTable.registerBuiltin("$bagof_instances0",5,FILE_builtins::PRED_$bagof_instances0_5_static_exec);
   PredTable.registerBuiltin("$variants_subset",5,FILE_builtins::PRED_$variants_subset_5_static_exec);
   PredTable.registerBuiltin("$term_variant",2,FILE_builtins::PRED_$term_variant_2_static_exec);
   PredTable.registerBuiltin("$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",4,FILE_builtins::PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec);
   PredTable.registerBuiltin("$term_variant",3,FILE_builtins::PRED_$term_variant_3_static_exec);
   PredTable.registerBuiltin("$unify_witness",2,FILE_builtins::PRED_$unify_witness_2_static_exec);
   PredTable.registerBuiltin("$variables_set",2,FILE_builtins::PRED_$variables_set_2_static_exec);
   PredTable.registerBuiltin("$variables_set",3,FILE_builtins::PRED_$variables_set_3_static_exec);
   PredTable.registerBuiltin("$builtin_memq",2,FILE_builtins::PRED_$builtin_memq_2_static_exec);
   PredTable.registerBuiltin("$existential_variables_set",2,FILE_builtins::PRED_$existential_variables_set_2_static_exec);
   PredTable.registerBuiltin("$existential_variables_set",3,FILE_builtins::PRED_$existential_variables_set_3_static_exec);
   PredTable.registerBuiltin("$free_variables_set",3,FILE_builtins::PRED_$free_variables_set_3_static_exec);
   PredTable.registerBuiltin("$builtin_set_diff",3,FILE_builtins::PRED_$builtin_set_diff_3_static_exec);
   PredTable.registerBuiltin("$builtin_set_diff0",3,FILE_builtins::PRED_$builtin_set_diff0_3_static_exec);
   PredTable.registerBuiltin("read",1,FILE_builtins::PRED_read_1_static_exec);
   PredTable.registerBuiltin("read",2,FILE_builtins::PRED_read_2_static_exec);
   PredTable.registerBuiltin("read_with_variables",2,FILE_builtins::PRED_read_with_variables_2_static_exec);
   PredTable.registerBuiltin("read_with_variables",3,FILE_builtins::PRED_read_with_variables_3_static_exec);
   PredTable.registerBuiltin("read_line",1,FILE_builtins::PRED_read_line_1_static_exec);
   PredTable.registerBuiltin("read_token",2,FILE_builtins::PRED_read_token_2_static_exec);
   PredTable.registerBuiltin("$read_token1",3,FILE_builtins::PRED_$read_token1_3_static_exec);
   PredTable.registerBuiltin("read_tokens",3,FILE_builtins::PRED_read_tokens_3_static_exec);
   PredTable.registerBuiltin("$read_tokens",4,FILE_builtins::PRED_$read_tokens_4_static_exec);
   PredTable.registerBuiltin("$read_tokens1",5,FILE_builtins::PRED_$read_tokens1_5_static_exec);
   PredTable.registerBuiltin("$mem_pair",2,FILE_builtins::PRED_$mem_pair_2_static_exec);
   PredTable.registerBuiltin("$read_tokens_until_fullstop",1,FILE_builtins::PRED_$read_tokens_until_fullstop_1_static_exec);
   PredTable.registerBuiltin("$read_tokens_until_fullstop",2,FILE_builtins::PRED_$read_tokens_until_fullstop_2_static_exec);
   PredTable.registerBuiltin("parse_tokens",2,FILE_builtins::PRED_parse_tokens_2_static_exec);
   PredTable.registerBuiltin("$parse_tokens",4,FILE_builtins::PRED_$parse_tokens_4_static_exec);
   PredTable.registerBuiltin("$parse_tokens1",5,FILE_builtins::PRED_$parse_tokens1_5_static_exec);
   PredTable.registerBuiltin("$parse_tokens2",7,FILE_builtins::PRED_$parse_tokens2_7_static_exec);
   PredTable.registerBuiltin("$parse_tokens_before_op",5,FILE_builtins::PRED_$parse_tokens_before_op_5_static_exec);
   PredTable.registerBuiltin("$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("$parse_tokens_brace",3,FILE_builtins::PRED_$parse_tokens_brace_3_static_exec);
   PredTable.registerBuiltin("$parse_tokens_list",3,FILE_builtins::PRED_$parse_tokens_list_3_static_exec);
   PredTable.registerBuiltin("$parse_tokens_list_rest",3,FILE_builtins::PRED_$parse_tokens_list_rest_3_static_exec);
   PredTable.registerBuiltin("$parse_tokens_args",3,FILE_builtins::PRED_$parse_tokens_args_3_static_exec);
   PredTable.registerBuiltin("$parse_tokens_args_rest",3,FILE_builtins::PRED_$parse_tokens_args_rest_3_static_exec);
   PredTable.registerBuiltin("$parse_tokens_post_in_ops",7,FILE_builtins::PRED_$parse_tokens_post_in_ops_7_static_exec);
   PredTable.registerBuiltin("$parse_tokens_op",8,FILE_builtins::PRED_$parse_tokens_op_8_static_exec);
   PredTable.registerBuiltin("$parse_tokens_is_starter",1,FILE_builtins::PRED_$parse_tokens_is_starter_1_static_exec);
   PredTable.registerBuiltin("$parse_tokens_is_terminator",1,FILE_builtins::PRED_$parse_tokens_is_terminator_1_static_exec);
   PredTable.registerBuiltin("$parse_tokens_is_post_in_op",1,FILE_builtins::PRED_$parse_tokens_is_post_in_op_1_static_exec);
   PredTable.registerBuiltin("$parse_tokens_post_in_type",1,FILE_builtins::PRED_$parse_tokens_post_in_type_1_static_exec);
   PredTable.registerBuiltin("$parse_tokens_expect",3,FILE_builtins::PRED_$parse_tokens_expect_3_static_exec);
   PredTable.registerBuiltin("$parse_tokens_skip_spaces",2,FILE_builtins::PRED_$parse_tokens_skip_spaces_2_static_exec);
   PredTable.registerBuiltin("$parse_tokens_peep_next",3,FILE_builtins::PRED_$parse_tokens_peep_next_3_static_exec);
   PredTable.registerBuiltin("$parse_tokens_error",3,FILE_builtins::PRED_$parse_tokens_error_3_static_exec);
   PredTable.registerBuiltin("$parse_tokens_error1",2,FILE_builtins::PRED_$parse_tokens_error1_2_static_exec);
   PredTable.registerBuiltin("$parse_tokens_error2",1,FILE_builtins::PRED_$parse_tokens_error2_1_static_exec);
   PredTable.registerBuiltin("$parse_tokens_write_string",2,FILE_builtins::PRED_$parse_tokens_write_string_2_static_exec);
   PredTable.registerBuiltin("$parse_tokens_write_message",2,FILE_builtins::PRED_$parse_tokens_write_message_2_static_exec);
   PredTable.registerBuiltin("write",1,FILE_builtins::PRED_write_1_static_exec);
   PredTable.registerBuiltin("write",2,FILE_builtins::PRED_write_2_static_exec);
   PredTable.registerBuiltin("writeq",1,FILE_builtins::PRED_writeq_1_static_exec);
   PredTable.registerBuiltin("writeq",2,FILE_builtins::PRED_writeq_2_static_exec);
   PredTable.registerBuiltin("write_canonical",1,FILE_builtins::PRED_write_canonical_1_static_exec);
   PredTable.registerBuiltin("write_canonical",2,FILE_builtins::PRED_write_canonical_2_static_exec);
   PredTable.registerBuiltin("write_term",2,FILE_builtins::PRED_write_term_2_static_exec);
   PredTable.registerBuiltin("write_term",3,FILE_builtins::PRED_write_term_3_static_exec);
   PredTable.registerBuiltin("$write_term",3,FILE_builtins::PRED_$write_term_3_static_exec);
   PredTable.registerBuiltin("$write_term0",6,FILE_builtins::PRED_$write_term0_6_static_exec);
   PredTable.registerBuiltin("$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("$write_space_if_needed",3,FILE_builtins::PRED_$write_space_if_needed_3_static_exec);
   PredTable.registerBuiltin("$write_VAR",2,FILE_builtins::PRED_$write_VAR_2_static_exec);
   PredTable.registerBuiltin("$write_atom",5,FILE_builtins::PRED_$write_atom_5_static_exec);
   PredTable.registerBuiltin("$atom_type",2,FILE_builtins::PRED_$atom_type_2_static_exec);
   PredTable.registerBuiltin("$write_is_operator",4,FILE_builtins::PRED_$write_is_operator_4_static_exec);
   PredTable.registerBuiltin("$write_op_type",2,FILE_builtins::PRED_$write_op_type_2_static_exec);
   PredTable.registerBuiltin("$write_term_op",8,FILE_builtins::PRED_$write_term_op_8_static_exec);
   PredTable.registerBuiltin("$write_term_op1",8,FILE_builtins::PRED_$write_term_op1_8_static_exec);
   PredTable.registerBuiltin("$write_term_infix_op",5,FILE_builtins::PRED_$write_term_infix_op_5_static_exec);
   PredTable.registerBuiltin("$write_term_list_args",5,FILE_builtins::PRED_$write_term_list_args_5_static_exec);
   PredTable.registerBuiltin("$write_term_args",5,FILE_builtins::PRED_$write_term_args_5_static_exec);
   PredTable.registerBuiltin("op",3,FILE_builtins::PRED_op_3_static_exec);
   PredTable.registerBuiltin("$op1",3,FILE_builtins::PRED_$op1_3_static_exec);
   PredTable.registerBuiltin("$op2",3,FILE_builtins::PRED_$op2_3_static_exec);
   PredTable.registerBuiltin("$add_operators",3,FILE_builtins::PRED_$add_operators_3_static_exec);
   PredTable.registerBuiltin("$add_op",3,FILE_builtins::PRED_$add_op_3_static_exec);
   PredTable.registerBuiltin("$op_specifier",2,FILE_builtins::PRED_$op_specifier_2_static_exec);
   PredTable.registerBuiltin("$op_atom_list",2,FILE_builtins::PRED_$op_atom_list_2_static_exec);
   PredTable.registerBuiltin("current_op",3,FILE_builtins::PRED_current_op_3_static_exec);
   PredTable.registerBuiltin("\\\\+","$005C$002B",1,FILE_builtins::PRED_$005C$002B_1_static_exec);
   PredTable.registerBuiltin("repeat",0,FILE_builtins::PRED_repeat_0_static_exec);
   PredTable.registerBuiltin("once",1,FILE_builtins::PRED_once_1_static_exec);
   PredTable.registerBuiltin("sub_atom",5,FILE_builtins::PRED_sub_atom_5_static_exec);
   PredTable.registerBuiltin("$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",2,FILE_builtins::PRED_$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",2,FILE_builtins::PRED_$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_2_static_exec);
   PredTable.registerBuiltin("name",2,FILE_builtins::PRED_name_2_static_exec);
   PredTable.registerBuiltin("$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",3,FILE_builtins::PRED_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",3,FILE_builtins::PRED_$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec);
   PredTable.registerBuiltin("regex_matches",3,FILE_builtins::PRED_regex_matches_3_static_exec);
   PredTable.registerBuiltin("regex_matches",2,FILE_builtins::PRED_regex_matches_2_static_exec);
   PredTable.registerBuiltin("regex_list",3,FILE_builtins::PRED_regex_list_3_static_exec);
   PredTable.registerBuiltin("set_prolog_flag",2,FILE_builtins::PRED_set_prolog_flag_2_static_exec);
   PredTable.registerBuiltin("$set_prolog_flag0",2,FILE_builtins::PRED_$set_prolog_flag0_2_static_exec);
   PredTable.registerBuiltin("$set_prolog_flag0",4,FILE_builtins::PRED_$set_prolog_flag0_4_static_exec);
   PredTable.registerBuiltin("current_prolog_flag",2,FILE_builtins::PRED_current_prolog_flag_2_static_exec);
   PredTable.registerBuiltin("$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",4,FILE_builtins::PRED_$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_4_static_exec);
   PredTable.registerBuiltin("$prolog_impl_flag",3,FILE_builtins::PRED_$prolog_impl_flag_3_static_exec);
   PredTable.registerBuiltin("halt",0,FILE_builtins::PRED_halt_0_static_exec);
   PredTable.registerBuiltin("abort",0,FILE_builtins::PRED_abort_0_static_exec);
   PredTable.registerBuiltin("C",3,FILE_builtins::PRED_C_3_static_exec);
   PredTable.registerBuiltin("expand_term",2,FILE_builtins::PRED_expand_term_2_static_exec);
   PredTable.registerBuiltin("$dcg_expansion",2,FILE_builtins::PRED_$dcg_expansion_2_static_exec);
   PredTable.registerBuiltin("$dcg_translation_atom",4,FILE_builtins::PRED_$dcg_translation_atom_4_static_exec);
   PredTable.registerBuiltin("$dcg_translation",4,FILE_builtins::PRED_$dcg_translation_4_static_exec);
   PredTable.registerBuiltin("$dcg_trans0",5,FILE_builtins::PRED_$dcg_trans0_5_static_exec);
   PredTable.registerBuiltin("$dcg_concat",3,FILE_builtins::PRED_$dcg_concat_3_static_exec);
   PredTable.registerBuiltin("$dcg_trans",5,FILE_builtins::PRED_$dcg_trans_5_static_exec);
   PredTable.registerBuiltin("new_hash",1,FILE_builtins::PRED_new_hash_1_static_exec);
   PredTable.registerBuiltin("hash_map",2,FILE_builtins::PRED_hash_map_2_static_exec);
   PredTable.registerBuiltin("hash_map",3,FILE_builtins::PRED_hash_map_3_static_exec);
   PredTable.registerBuiltin("hash_exists",1,FILE_builtins::PRED_hash_exists_1_static_exec);
   PredTable.registerBuiltin("consult_stream",2,FILE_builtins::PRED_consult_stream_2_static_exec);
   PredTable.registerBuiltin("$consult_init",1,FILE_builtins::PRED_$consult_init_1_static_exec);
   PredTable.registerBuiltin("$consult_clause",1,FILE_builtins::PRED_$consult_clause_1_static_exec);
   PredTable.registerBuiltin("$assert_consulted_package",1,FILE_builtins::PRED_$assert_consulted_package_1_static_exec);
   PredTable.registerBuiltin("$assert_consulted_import",1,FILE_builtins::PRED_$assert_consulted_import_1_static_exec);
   PredTable.registerBuiltin("$consult_preprocess",2,FILE_builtins::PRED_$consult_preprocess_2_static_exec);
   PredTable.registerBuiltin("$consult_cls",1,FILE_builtins::PRED_$consult_cls_1_static_exec);
   PredTable.registerBuiltin("$assert_consulted_clause",1,FILE_builtins::PRED_$assert_consulted_clause_1_static_exec);
   PredTable.registerBuiltin("length",2,FILE_builtins::PRED_length_2_static_exec);
   PredTable.registerBuiltin("$length",3,FILE_builtins::PRED_$length_3_static_exec);
   PredTable.registerBuiltin("$length0",3,FILE_builtins::PRED_$length0_3_static_exec);
   PredTable.registerBuiltin("numbervars",3,FILE_builtins::PRED_numbervars_3_static_exec);
   PredTable.registerBuiltin("$numbervars",3,FILE_builtins::PRED_$numbervars_3_static_exec);
   PredTable.registerBuiltin("$numbervars_str",5,FILE_builtins::PRED_$numbervars_str_5_static_exec);
   PredTable.registerBuiltin("statistics",2,FILE_builtins::PRED_statistics_2_static_exec);
   PredTable.registerBuiltin("$statistics_mode",1,FILE_builtins::PRED_$statistics_mode_1_static_exec);
   PredTable.registerBuiltin("illarg",3,FILE_builtins::PRED_illarg_3_static_exec);
   PredTable.registerBuiltin("$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",5,FILE_builtins::PRED_$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_static_exec);
   PredTable.registerBuiltin("$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",6,FILE_builtins::PRED_$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",5,FILE_builtins::PRED_$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_5_static_exec);
   PredTable.registerBuiltin("$match_type",2,FILE_builtins::PRED_$match_type_2_static_exec);
   PredTable.registerBuiltin("$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",3,FILE_builtins::PRED_$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_3_static_exec);
   PredTable.registerBuiltin("$builtin_append",3,FILE_builtins::PRED_$builtin_append_3_static_exec);
   PredTable.registerBuiltin("$member_in_reverse",2,FILE_builtins::PRED_$member_in_reverse_2_static_exec);
   PredTable.registerBuiltin("$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("with_mutex",2,FILE_builtins::PRED_with_mutex_2_static_exec);
   PredTable.registerBuiltin("$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/builtins.pl","$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl",1,FILE_builtins::PRED_$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fbuiltins$002Epl_1_static_exec);
   PredTable.registerBuiltin("java_constructor",2,FILE_builtins::PRED_java_constructor_2_static_exec);
   PredTable.registerBuiltin("java_declared_constructor",2,FILE_builtins::PRED_java_declared_constructor_2_static_exec);
   PredTable.registerBuiltin("java_method",3,FILE_builtins::PRED_java_method_3_static_exec);
   PredTable.registerBuiltin("java_declared_method",3,FILE_builtins::PRED_java_declared_method_3_static_exec);
   PredTable.registerBuiltin("java_get_field",3,FILE_builtins::PRED_java_get_field_3_static_exec);
   PredTable.registerBuiltin("java_get_declared_field",3,FILE_builtins::PRED_java_get_declared_field_3_static_exec);
   PredTable.registerBuiltin("java_set_field",3,FILE_builtins::PRED_java_set_field_3_static_exec);
   PredTable.registerBuiltin("java_set_declared_field",3,FILE_builtins::PRED_java_set_declared_field_3_static_exec);
   PredTable.registerBuiltin("builtin_java_convert_args",2,FILE_builtins::PRED_builtin_java_convert_args_2_static_exec);
   PredTable.registerBuiltin("synchronized",2,FILE_builtins::PRED_synchronized_2_static_exec);
   PredTable.registerBuiltin("$init",0,FILE_builtins::PRED_$init_0_static_exec);
}
}
