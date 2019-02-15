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
public class FILE_swi_supp extends FILE_io {
/** PREDICATE: (package)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
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
/** PREDICATE: setup_call_cleanup/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(setup_call_cleanup/3,non-(public))




    public static Operation PRED_setup_call_cleanup_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // setup_call_cleanup(A,B,C):-setup_call_catcher_cleanup(A,B,D,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // setup_call_cleanup(A,B,C):-[setup_call_catcher_cleanup(A,B,D,C)]
        return //
 Op("setup_call_catcher_cleanup", FILE_system::PRED_setup_call_catcher_cleanup_4_static_exec, VA(a1, a2, m.DONT_CARE2(), a3), cont);
    }
/** PREDICATE: each_call_cleanup/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(each_call_cleanup/3,non-(public))
        final static SymbolTerm FUNCTOR_each_call_cleanup_4 = F("each_call_cleanup",4);




    public static Operation PRED_each_call_cleanup_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // each_call_cleanup(A,B,C):-throw_missing(each_call_cleanup(A,B,D,C))
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // each_call_cleanup(A,B,C):-[throw_missing(each_call_cleanup(A,B,D,C))]
    // put_str_args([a(1),a(2),void,a(3)],y(1)),put_str(@('FUNCTOR_each_call_cleanup_4'),y(1),a(4))
        a4 =  S( FUNCTOR_each_call_cleanup_4 , a1, a2, m.mkvar3(), a3);
 ;
        return //
 Op("throw_missing", FILE_system::PRED_throw_missing_1_static_exec, VA(a4), cont);
    }
/** PREDICATE: setup_call_catcher_cleanup/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(setup_call_catcher_cleanup/4,non-(public))
        final static SymbolTerm FUNCTOR_setup_call_catcher_cleanup_4 = F("setup_call_catcher_cleanup",4);




    public static Operation PRED_setup_call_catcher_cleanup_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // setup_call_catcher_cleanup(A,B,C,D):-throw_missing(setup_call_catcher_cleanup(A,B,C,D))
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // setup_call_catcher_cleanup(A,B,C,D):-[throw_missing(setup_call_catcher_cleanup(A,B,C,D))]
    // put_str_args([a(1),a(2),a(3),a(4)],y(1)),put_str(@('FUNCTOR_setup_call_catcher_cleanup_4'),y(1),a(5))
        a5 =  S( FUNCTOR_setup_call_catcher_cleanup_4 , a1, a2, a3, a4);
 ;
        return //
 Op("throw_missing", FILE_system::PRED_throw_missing_1_static_exec, VA(a5), cont);
    }
/** PREDICATE: recorda/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(recorda/2,non-(public))




    public static Operation PRED_recorda_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // recorda(A,B):-recorda(A,B,C)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // recorda(A,B):-[recorda(A,B,C)]
        return //
 Op("recorda", FILE_system::PRED_recorda_3_static_exec, VA(a1, a2, m.DONT_CARE2()), cont);
    }
/** PREDICATE: recordz/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(recordz/2,non-(public))




    public static Operation PRED_recordz_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // recordz(A,B):-recordz(A,B,C)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // recordz(A,B):-[recordz(A,B,C)]
        return //
 Op("recordz", FILE_system::PRED_recordz_3_static_exec, VA(a1, a2, m.DONT_CARE2()), cont);
    }
/** PREDICATE: recorded/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(recorded/2,non-(public))




    public static Operation PRED_recorded_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // recorded(A,B):-recorded(A,B,C)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // recorded(A,B):-[recorded(A,B,C)]
        return //
 Op("recorded", FILE_system::PRED_recorded_3_static_exec, VA(a1, a2, m.DONT_CARE2()), cont);
    }
/** PREDICATE: throw_missing/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(throw_missing/1,non-(public))
        final static SymbolTerm FUNCTOR_throw_missing_1 = F("throw_missing",1);




    public static Operation PRED_throw_missing_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // throw_missing(A):-throw(throw_missing(A))
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // throw_missing(A):-[throw(throw_missing(A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_throw_missing_1'),y(1),a(2))
        a2 =  S( FUNCTOR_throw_missing_1 , a1);
 ;
        return //
 Op("throw", FILE_system::PRED_throw_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: instance/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(instance/2,non-(public))
        final static SymbolTerm FUNCTOR_instance_2 = F("instance",2);




    public static Operation PRED_instance_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // instance(A,B):-throw_missing(instance(A,B))
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // instance(A,B):-[throw_missing(instance(A,B))]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_instance_2'),y(1),a(3))
        a3 =  S( FUNCTOR_instance_2 , a1, a2);
 ;
        return //
 Op("throw_missing", FILE_system::PRED_throw_missing_1_static_exec, VA(a3), cont);
    }
/** PREDICATE: flag/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(flag/3,non-(public))
        final static SymbolTerm FUNCTOR_flag_3 = F("flag",3);




    public static Operation PRED_flag_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // flag(A,B,C):-throw_missing(flag(A,B,C))
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // flag(A,B,C):-[throw_missing(flag(A,B,C))]
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_flag_3'),y(1),a(4))
        a4 =  S( FUNCTOR_flag_3 , a1, a2, a3);
 ;
        return //
 Op("throw_missing", FILE_system::PRED_throw_missing_1_static_exec, VA(a4), cont);
    }
/** PREDICATE: source_location/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(source_location/2,non-(public))
        final static SymbolTerm FUNCTOR_source_location_2 = F("source_location",2);




    public static Operation PRED_source_location_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // source_location(A,B):-throw_missing(source_location(A,B))
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // source_location(A,B):-[throw_missing(source_location(A,B))]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_source_location_2'),y(1),a(3))
        a3 =  S( FUNCTOR_source_location_2 , a1, a2);
 ;
        return //
 Op("throw_missing", FILE_system::PRED_throw_missing_1_static_exec, VA(a3), cont);
    }
/** PREDICATE: set_predicate_property/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(set_predicate_property/2,non-(public))
        final static SymbolTerm FUNCTOR_module_colon_2 = F(":",2);
        final static SymbolTerm FUNCTOR_$002F_2 = F("/",2);
        final static SymbolTerm FUNCTOR_$002C_2 = F(",",2);
        final static SymbolTerm ATOM_meta_predicate = SYM("meta_predicate");
        final static SymbolTerm FUNCTOR_meta_predicate_1 = F("meta_predicate",1);




    public static Operation PRED_set_predicate_property_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return set_predicate_property_2_top(m);
    }

    private final static Operation set_predicate_property_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::set_predicate_property_2_var, FILE_swi_supp::set_predicate_property_2_8, FILE_swi_supp::set_predicate_property_2_8, FILE_swi_supp::set_predicate_property_2_8, FILE_swi_supp::set_predicate_property_2_var, FILE_swi_supp::set_predicate_property_2_8); 
    }

    private final static Operation set_predicate_property_2_var(Prolog m) { 
        m.jtry2(null, FILE_swi_supp::set_predicate_property_2_var_1);
        return set_predicate_property_2_1(m);
    }

    private final static Operation set_predicate_property_2_var_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_2);
        return set_predicate_property_2_2(m);
    }

    private final static Operation set_predicate_property_2_var_2(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_3);
        return set_predicate_property_2_3(m);
    }

    private final static Operation set_predicate_property_2_var_3(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_4);
        return set_predicate_property_2_4(m);
    }

    private final static Operation set_predicate_property_2_var_4(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_5);
        return set_predicate_property_2_5(m);
    }

    private final static Operation set_predicate_property_2_var_5(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_6);
        return set_predicate_property_2_6(m);
    }

    private final static Operation set_predicate_property_2_var_6(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_7);
        return set_predicate_property_2_7(m);
    }

    private final static Operation set_predicate_property_2_var_7(Prolog m) { 
        m.trust(null);
        return set_predicate_property_2_8(m);
    }

    private final static Operation set_predicate_property_2_1(Prolog m) { 
    // set_predicate_property(A:B:C,D):-!,nonvar(B),set_predicate_property(B:C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:B:C,D):-['$neck_cut',nonvar(B),set_predicate_property(B:C,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, m.DONT_CARE1(), a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_module_colon_2 , m.trail, a4, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of nonvar(a(4))
        a4 = a4.dref();
        if ((a4 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(6))
        a6 =  S( FUNCTOR_module_colon_2 , a4, a5);
 ;
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
m.cont = cont;
        return set_predicate_property_2_top(m);
    }

    private final static Operation set_predicate_property_2_2(Prolog m) { 
    // set_predicate_property(A:[],B):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:[],B):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, m.DONT_CARE1(),  Prolog.Nil )){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation set_predicate_property_2_3(Prolog m) { 
    // set_predicate_property(A:B/C,D):-!,set_predicate_property(A,B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:B/C,D):-['$neck_cut',set_predicate_property(A,B,C,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_$002F_2 , m.trail, a5, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_4_static_exec, VA(a3, a5, a6, a2), cont);
    }

    private final static Operation set_predicate_property_2_4(Prolog m) { 
    // set_predicate_property(A:[B|C],D):-!,set_predicate_property(A:B,D),set_predicate_property(A:C,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:[B|C],D):-['$neck_cut',set_predicate_property(A:B,D),set_predicate_property(A:C,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a4 = a4.dref();
        if (a4 .isCons()){
                        a5 = a4.car();
            a6 = a4.cdr();
        } else if (a4.isVar()){
            a5 = m.mkvar2();
            a6 = m.mkvar2();
             a4.bind(CONS(a5, a6), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(3),a(5)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a3, a5);
 ;
    // put_str_args([a(3),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 , a3, a6);
 ;
        p1 = //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a8, a2), cont);
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.cont = p1;
        return set_predicate_property_2_top(m);
    }

    private final static Operation set_predicate_property_2_5(Prolog m) { 
    // set_predicate_property(A:(B,C),D):-!,set_predicate_property(A:B,D),set_predicate_property(A:C,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:(B,C),D):-['$neck_cut',set_predicate_property(A:B,D),set_predicate_property(A:C,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_$002C_2 , m.trail, a5, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(3),a(5)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a3, a5);
 ;
    // put_str_args([a(3),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 , a3, a6);
 ;
        p1 = //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a8, a2), cont);
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.cont = p1;
        return set_predicate_property_2_top(m);
    }

    private final static Operation set_predicate_property_2_6(Prolog m) { 
    // set_predicate_property(A:B,meta_predicate):-!,functor(B,C,D),set_predicate_property(A,C,D,(meta_predicate B))
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:B,meta_predicate):-['$neck_cut',functor(B,C,D),set_predicate_property(A,C,D,(meta_predicate B))]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a4)){
                return m.fail();
            }
        if (!  ATOM_meta_predicate .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
    // put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_meta_predicate_1'),y(1),a(7))
        a7 =  S( FUNCTOR_meta_predicate_1 , a4);
 ;
        return //
 Op("functor", FILE_system::PRED_functor_3_static_exec, VA(a4, a5, a6), //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_4_static_exec, VA(a3, a5, a6, a7), cont));
    }

    private final static Operation set_predicate_property_2_7(Prolog m) { 
    // set_predicate_property(A:B,C):-functor(B,D,E),set_predicate_property(A,D,E,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:B,C):-[functor(B,D,E),set_predicate_property(A,D,E,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        return //
 Op("functor", FILE_system::PRED_functor_3_static_exec, VA(a4, a5, a6), //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_4_static_exec, VA(a3, a5, a6, a2), cont));
    }

    private final static Operation set_predicate_property_2_8(Prolog m) { 
    // set_predicate_property(A,B):-strip_module(A,C,D),A==D,!,set_predicate_property(C:D,B)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A,B):-['$get_level'(C),strip_module(A,D,E),'$equality_of_term'(A,E),'$cut'(C),set_predicate_property(D:E,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(6))
        a6 =  S( FUNCTOR_module_colon_2 , a4, a5);
 ;
        return //
 Op("strip_module", FILE_system::PRED_strip_module_3_static_exec, VA(a1, a4, a5), //
 Op("$equality_of_term", FILE_system::PRED_$equality_of_term_2_static_exec, VA(a1, a5), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a6, a2), cont))));
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/2,non-(public))
        final static SymbolTerm ATOM_swi_supp = SYM("swi_supp");




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-catch(A,B,fail),!,true
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-['$get_level'(C),catch(swi_supp:A,B,swi_supp:fail),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_swi_supp'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a1);
 ;
        a5 = Closure( fail_0);
        return //
 Op("catch", FILE_builtins::PRED_catch_3_static_exec, VA(a4, a2, a5), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: asserta_if_new/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(asserta_if_new/1,non-(public))




    public static Operation PRED_asserta_if_new_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::asserta_if_new_1_sub_1);
        return asserta_if_new_1_1(m);
    }

    private final static Operation asserta_if_new_1_sub_1(Prolog m) { 
        m.trust(null);
        return asserta_if_new_1_2(m);
    }

    private final static Operation asserta_if_new_1_1(Prolog m) { 
    // asserta_if_new(A):-'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // asserta_if_new(A):-['$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)]
        return //
 Op("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }

    private final static Operation asserta_if_new_1_2(Prolog m) { 
    // asserta_if_new(A):-asserta(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // asserta_if_new(A):-[asserta(swi_supp:A)]
    // put_str_args([@('ATOM_swi_supp'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a1);
 ;
        return //
 Op("asserta", FILE_system::PRED_asserta_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: set_predicate_property/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(set_predicate_property/4,non-(public))
        final static SymbolTerm FUNCTOR_$0024predicate_property_4 = F("$predicate_property",4);
        final static SymbolTerm ATOM_defined = SYM("defined");




    public static Operation PRED_set_predicate_property_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_swi_supp::set_predicate_property_4_sub_1);
        return set_predicate_property_4_1(m);
    }

    private final static Operation set_predicate_property_4_sub_1(Prolog m) { 
        m.trust(null);
        return set_predicate_property_4_2(m);
    }

    private final static Operation set_predicate_property_4_1(Prolog m) { 
    // set_predicate_property(A,B,C,D):-call('$predicate_property'(D,A,B,C)),!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // set_predicate_property(A,B,C,D):-['$get_level'(E),call(swi_supp:'$predicate_property'(D,A,B,C)),'$cut'(E)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(4),a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_$0024predicate_property_4'),y(1),a(6))
        a6 =  S( FUNCTOR_$0024predicate_property_4 , a4, a1, a2, a3);
 ;
    // put_str_args([@('ATOM_swi_supp'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a6);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a7), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a5), cont));
    }

    private final static Operation set_predicate_property_4_2(Prolog m) { 
    // set_predicate_property(A,B,C,D):-asserta_if_new('$predicate_property'(defined,A,B,C)),asserta('$predicate_property'(D,A,B,C))
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // set_predicate_property(A,B,C,D):-[asserta_if_new('$predicate_property'(defined,A,B,C)),asserta(swi_supp:'$predicate_property'(D,A,B,C))]
    // put_str_args([@('ATOM_defined'),a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_$0024predicate_property_4'),y(1),a(5))
        a5 =  S( FUNCTOR_$0024predicate_property_4 ,  ATOM_defined , a1, a2, a3);
 ;
    // put_str_args([a(4),a(1),a(2),a(3)],y(2)),put_str(@('FUNCTOR_$0024predicate_property_4'),y(2),a(6))
        a6 =  S( FUNCTOR_$0024predicate_property_4 , a4, a1, a2, a3);
 ;
    // put_str_args([@('ATOM_swi_supp'),a(6)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a6);
 ;
        return //
 Op("asserta_if_new", FILE_system::PRED_asserta_if_new_1_static_exec, VA(a5), //
 Op("asserta", FILE_system::PRED_asserta_1_static_exec, VA(a7), cont));
    }
/** PREDICATE: (multifile)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main((multifile)/1,non-(public))
        final static SymbolTerm ATOM_multifile = SYM("multifile");




    public static Operation PRED_multifile_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // multifile A:-set_predicate_property(A,multifile)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // multifile A:-[set_predicate_property(A,multifile)]
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a1,  ATOM_multifile ), cont);
    }
/** PREDICATE: (discontiguous)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main((discontiguous)/1,non-(public))
        final static SymbolTerm ATOM_discontiguous = SYM("discontiguous");




    public static Operation PRED_discontiguous_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // discontiguous A:-set_predicate_property(A,discontiguous)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // discontiguous A:-[set_predicate_property(A,discontiguous)]
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a1,  ATOM_discontiguous ), cont);
    }
/** PREDICATE: (dynamic)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main((dynamic)/1,non-(public))
        final static SymbolTerm ATOM_dynamic = SYM("dynamic");




    public static Operation PRED_dynamic_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dynamic A:-set_predicate_property(A,dynamic)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // dynamic A:-[set_predicate_property(A,dynamic)]
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a1,  ATOM_dynamic ), cont);
    }
/** PREDICATE: (module_transparent)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main((module_transparent)/1,non-(public))
        final static SymbolTerm ATOM_transparent = SYM("transparent");




    public static Operation PRED_module_transparent_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // module_transparent A:-set_predicate_property(A,transparent)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // module_transparent A:-[set_predicate_property(A,transparent)]
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a1,  ATOM_transparent ), cont);
    }
/** PREDICATE: (meta_predicate)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main((meta_predicate)/1,non-(public))




    public static Operation PRED_meta_predicate_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // meta_predicate A:-set_predicate_property(A,transparent)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // meta_predicate A:-[set_predicate_property(A,transparent)]
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a1,  ATOM_transparent ), cont);
    }
/** PREDICATE: tracing/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(tracing/0,non-(public))
        final static SymbolTerm ATOM_$0024tracing = SYM("$tracing");
    private static final StructureTerm L_tracing_0_s5 = S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp ,  ATOM_$0024tracing );




    public static Operation PRED_tracing_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // tracing:-'$tracing'
        m.setB0();
    // tracing:-[call(swi_supp:'$tracing')]
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(L_tracing_0_s5), cont);
    }
/** PREDICATE: $dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-quietly(A),!,true
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),quietly(A),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("quietly", FILE_system::PRED_quietly_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), cont));
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-fail
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: assertion/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(assertion/1,non-(public))
        final static SymbolTerm FUNCTOR_assertion_failed_1 = F("assertion_failed",1);




    public static Operation PRED_assertion_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::assertion_1_sub_1);
        return assertion_1_1(m);
    }

    private final static Operation assertion_1_sub_1(Prolog m) { 
        m.trust(null);
        return assertion_1_2(m);
    }

    private final static Operation assertion_1_1(Prolog m) { 
    // assertion(A):-'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // assertion(A):-['$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A)]
        return //
 Op("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a1), cont);
    }

    private final static Operation assertion_1_2(Prolog m) { 
    // assertion(A):-throw(assertion_failed(A))
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // assertion(A):-[throw(assertion_failed(A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_assertion_failed_1'),y(1),a(2))
        a2 =  S( FUNCTOR_assertion_failed_1 , a1);
 ;
        return //
 Op("throw", FILE_system::PRED_throw_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: $dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/1,non-(public))
        final static SymbolTerm ATOM_notrace = SYM("notrace");
        final static SymbolTerm FUNCTOR_call_1 = F("call",1);
        final static SymbolTerm ATOM_trace = SYM("trace");




    public static Operation PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-tracing,!,each_call_cleanup(notrace,call(A),trace)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),tracing,'$cut'(B),each_call_cleanup(notrace,call(A),trace)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_call_1'),y(1),a(3))
        a3 =  S( FUNCTOR_call_1 , a1);
 ;
        return //
 Op("tracing", FILE_system::PRED_tracing_0_static_exec, VA(), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), //
 Op("each_call_cleanup", FILE_system::PRED_each_call_cleanup_3_static_exec, VA( ATOM_notrace , a3,  ATOM_trace ), cont)));
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-fail
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: quietly/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(quietly/1,non-(public))




    public static Operation PRED_quietly_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::quietly_1_sub_1);
        return quietly_1_1(m);
    }

    private final static Operation quietly_1_sub_1(Prolog m) { 
        m.trust(null);
        return quietly_1_2(m);
    }

    private final static Operation quietly_1_1(Prolog m) { 
    // quietly(A):-'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // quietly(A):-['$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A)]
        return //
 Op("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a1), cont);
    }

    private final static Operation quietly_1_2(Prolog m) { 
    // quietly(A):-call(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // quietly(A):-[call(swi_supp:A)]
    // put_str_args([@('ATOM_swi_supp'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a1);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: $dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-call(A),!,true
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),call(swi_supp:A),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_swi_supp'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a1);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a3), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), cont));
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-fail
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: ignore/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(ignore/1,non-(public))




    public static Operation PRED_ignore_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::ignore_1_sub_1);
        return ignore_1_1(m);
    }

    private final static Operation ignore_1_sub_1(Prolog m) { 
        m.trust(null);
        return ignore_1_2(m);
    }

    private final static Operation ignore_1_1(Prolog m) { 
    // ignore(A):-'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ignore(A):-['$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A)]
        return //
 Op("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a1), cont);
    }

    private final static Operation ignore_1_2(Prolog m) { 
    // ignore(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ignore(A):-[]
        return cont;
    }
/** PREDICATE: variant/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(variant/2,non-(public))




    public static Operation PRED_variant_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // variant(A,B):-'$term_variant'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // variant(A,B):-['$term_variant'(A,B)]
        return //
 Op("$term_variant", FILE_system::PRED_$term_variant_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: $dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/2,non-(public))
        final static SymbolTerm FUNCTOR_$0024current_typein_module_1 = F("$current_typein_module",1);




    public static Operation PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-'$current_typein_module'(B),!,A=B
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-['$get_level'(C),call(swi_supp:'$current_typein_module'(B)),'$cut'(C),'$unify'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_$0024current_typein_module_1'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024current_typein_module_1 , a2);
 ;
    // put_str_args([@('ATOM_swi_supp'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a4);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a5), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a1, a2), cont)));
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: typein_module/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(typein_module/1,non-(public))
        final static SymbolTerm ATOM_user = SYM("user");




    public static Operation PRED_typein_module_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::typein_module_1_sub_1);
        return typein_module_1_1(m);
    }

    private final static Operation typein_module_1_sub_1(Prolog m) { 
        m.trust(null);
        return typein_module_1_2(m);
    }

    private final static Operation typein_module_1_1(Prolog m) { 
    // typein_module(A):-'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // typein_module(A):-['$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)]
        return //
 Op("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }

    private final static Operation typein_module_1_2(Prolog m) { 
    // typein_module(A):-A=user
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // typein_module(A):-['$unify'(A,user)]
        //START inline expansion of $unify(a(1),@(ATOM_user))
        if (! a1.unify(ATOM_user, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/2,non-(public))
        final static SymbolTerm FUNCTOR_$0024current_source_module_1 = F("$current_source_module",1);




    public static Operation PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-'$current_source_module'(B),!,A=B
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-['$get_level'(C),call(swi_supp:'$current_source_module'(B)),'$cut'(C),'$unify'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_$0024current_source_module_1'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024current_source_module_1 , a2);
 ;
    // put_str_args([@('ATOM_swi_supp'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a4);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a5), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a1, a2), cont)));
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: source_module/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(source_module/1,non-(public))




    public static Operation PRED_source_module_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::source_module_1_sub_1);
        return source_module_1_1(m);
    }

    private final static Operation source_module_1_sub_1(Prolog m) { 
        m.trust(null);
        return source_module_1_2(m);
    }

    private final static Operation source_module_1_1(Prolog m) { 
    // source_module(A):-'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // source_module(A):-['$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)]
        return //
 Op("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }

    private final static Operation source_module_1_2(Prolog m) { 
    // source_module(A):-A=user
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // source_module(A):-['$unify'(A,user)]
        //START inline expansion of $unify(a(1),@(ATOM_user))
        if (! a1.unify(ATOM_user, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/1,non-(public))
        final static SymbolTerm FUNCTOR_$0024current_context_module_1 = F("$current_context_module",1);




    public static Operation PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-'$current_context_module'(A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[call(swi_supp:'$current_context_module'(A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_$0024current_context_module_1'),y(1),a(2))
        a2 =  S( FUNCTOR_$0024current_context_module_1 , a1);
 ;
    // put_str_args([@('ATOM_swi_supp'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a2);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a3), cont);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-typein_module(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[typein_module(A)]
        return //
 Op("typein_module", FILE_system::PRED_typein_module_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: $dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/2,non-(public))




    public static Operation PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-'$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(B),!,B=A
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-['$get_level'(C),'$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(B),'$cut'(C),'$unify'(B,A)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a2), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a2, a1), cont)));
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: context_module/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(context_module/1,non-(public))




    public static Operation PRED_context_module_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // context_module(A):-'$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // context_module(A):-['$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)]
        return //
 Op("$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }
/** PREDICATE: current_predicate/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(current_predicate/1,non-(public))




    public static Operation PRED_current_predicate_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // current_predicate(A):-strip_module(A,B,C/D),current_predicate_m_f_a(B,C,D)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1;
        a1 = LARG[0];
    // current_predicate(A):-[strip_module(A,B,C/D),current_predicate_m_f_a(B,C,D)]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002F_2 , a3, a4);
 ;
        return //
 Op("strip_module", FILE_system::PRED_strip_module_3_static_exec, VA(a1, a2, a5), //
 Op("current_predicate_m_f_a", FILE_system::PRED_current_predicate_m_f_a_3_static_exec, VA(a2, a3, a4), cont));
    }
/** PREDICATE: $dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/2,non-(public))




    public static Operation PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-var(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-[var(A)]
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-var(B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-[var(B)]
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: (->)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main((->)/2,non-(public))
        final static SymbolTerm FUNCTOR_ground_1 = F("ground",1);
        final static SymbolTerm FUNCTOR_functor_3 = F("functor",3);
        final static SymbolTerm FUNCTOR_current_predicate_m_f_a_3 = F("current_predicate_m_f_a",3);




    public static Operation PRED_$002D$003E_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // ground(A/B)->functor(C,A,B),current_predicate_m_f_a(D,A,B):-'$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B),!,predicate_property(D:C,defined),functor(C,A,B)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
    // ground(A/B)->functor(C,A,B),current_predicate_m_f_a(D,A,B):-['$get_level'(E),'$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B),'$cut'(E),predicate_property(D:C,defined),functor(C,A,B)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_ground_1 , m.trail, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002F_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002C_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_functor_3 , m.trail, a8, a4, a5)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_current_predicate_m_f_a_3 , m.trail, a9, a4, a5)){
                return m.fail();
            }
        a10 = m.mkvar1();
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(9),a(8)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(11))
        a11 =  S( FUNCTOR_module_colon_2 , a9, a8);
 ;
        return //
 Op("$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec, VA(a4, a5), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a10), //
 Op("predicate_property", FILE_system::PRED_predicate_property_2_static_exec, VA(a11,  ATOM_defined ), //
 Op("functor", FILE_system::PRED_functor_3_static_exec, VA(a8, a4, a5), cont))));
    }
/** PREDICATE: current_predicate_m_f_a/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(current_predicate_m_f_a/3,non-(public))




    public static Operation PRED_current_predicate_m_f_a_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // current_predicate_m_f_a(A,B,C):-functor(D,B,C),!,predicate_property(A:D,defined)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // current_predicate_m_f_a(A,B,C):-['$get_level'(D),functor(E,B,C),'$cut'(D),predicate_property(A:E,defined)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
    // put_str_args([a(1),a(5)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(6))
        a6 =  S( FUNCTOR_module_colon_2 , a1, a5);
 ;
        return //
 Op("functor", FILE_system::PRED_functor_3_static_exec, VA(a5, a2, a3), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op("predicate_property", FILE_system::PRED_predicate_property_2_static_exec, VA(a6,  ATOM_defined ), cont)));
    }
/** PREDICATE: current_predicate/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(current_predicate/2,non-(public))




    public static Operation PRED_current_predicate_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // current_predicate(A,B):-predicate_property(B,C),strip_module(B,D,E),functor(E,F,G),strip_module(A,D,F)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
    // current_predicate(A,B):-[predicate_property(B,C),strip_module(B,D,E),functor(E,F,G),strip_module(A,D,F)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op("predicate_property", FILE_system::PRED_predicate_property_2_static_exec, VA(a2, m.DONT_CARE2()), //
 Op("strip_module", FILE_system::PRED_strip_module_3_static_exec, VA(a2, a3, a4), //
 Op("functor", FILE_system::PRED_functor_3_static_exec, VA(a4, a5, m.DONT_CARE2()), //
 Op("strip_module", FILE_system::PRED_strip_module_3_static_exec, VA(a1, a3, a5), cont))));
    }
/** PREDICATE: strip_module/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(strip_module/3,non-(public))




    public static Operation PRED_strip_module_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::strip_module_3_var, FILE_swi_supp::strip_module_3_int, FILE_swi_supp::strip_module_3_int, FILE_swi_supp::strip_module_3_int, FILE_swi_supp::strip_module_3_var, FILE_swi_supp::strip_module_3_int); 
    }

    private final static Operation strip_module_3_var(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::strip_module_3_var_1);
        return strip_module_3_1(m);
    }

    private final static Operation strip_module_3_var_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::strip_module_3_var_2);
        return strip_module_3_2(m);
    }

    private final static Operation strip_module_3_var_2(Prolog m) { 
        m.trust(null);
        return strip_module_3_3(m);
    }

    private final static Operation strip_module_3_int(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::strip_module_3_int_1);
        return strip_module_3_1(m);
    }

    private final static Operation strip_module_3_int_1(Prolog m) { 
        m.trust(null);
        return strip_module_3_3(m);
    }

    private final static Operation strip_module_3_1(Prolog m) { 
    // strip_module(A,B,A):-var(A),!,context_module(B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // strip_module(A,B,A):-['$get_level'(C),var(A),'$cut'(C),context_module(B)]
        if (! a1.unify(a3, m.trail))
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
        return //
 Op("context_module", FILE_system::PRED_context_module_1_static_exec, VA(a2), cont);
    }

    private final static Operation strip_module_3_2(Prolog m) { 
    // strip_module(A:B,A,B):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // strip_module(A:B,A,B):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        if (! a5.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation strip_module_3_3(Prolog m) { 
    // strip_module(A,B,A):-context_module(B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // strip_module(A,B,A):-[context_module(B)]
        if (! a1.unify(a3, m.trail))
            return m.fail();
        return //
 Op("context_module", FILE_system::PRED_context_module_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: $dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/4,non-(public))
        final static SymbolTerm ATOM_some = SYM("some");
        final static SymbolTerm FUNCTOR_sols_1 = F("sols",1);
    private static final StructureTerm L_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_s8 = S( FUNCTOR_sols_1 ,  int_0 );




    public static Operation PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_swi_supp::$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_sub_1);
        return $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_1(m);
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_2(m);
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_1(Prolog m) { 
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D):-(call(A),nb_setarg(1,D,some)),call(B)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D):-[call(swi_supp:A),nb_setarg(1,D,some),call(swi_supp:B)]
    // put_str_args([@('ATOM_swi_supp'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a1);
 ;
    // put_str_args([@('ATOM_swi_supp'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a2);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a5), //
 Op("nb_setarg", sxxtensions::PRED_nb_setarg_3_static_exec, VA( int_1 , a4,  ATOM_some ), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a6), cont)));
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_2(Prolog m) { 
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D):-D=sols(0),call(C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D):-['$unify'(D,sols(0)),call(swi_supp:C)]
        //START inline expansion of $unify(a(4),s(8))
        if (! a4.unify(L_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_s8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_swi_supp'),a(3)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a3);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a5), cont);
    }
/** PREDICATE: (*->)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main((*->)/2,public)
        final static SymbolTerm FUNCTOR_or_2 = F(";",2);
    private static final StructureTerm L_$002A$002D$003E_2_s5 = S( FUNCTOR_sols_1 ,  int_0 );




    public static Operation PRED_$002A$002D$003E_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A*->B;C:-D=sols(0),'$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
    // A*->B;C:-['$unify'(D,sols(0)),'$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D)]
        a2 = a2.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_or_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a5 = m.mkvar1();
        //START inline expansion of $unify(a(5),s(5))
        if (! a5.unify(L_$002A$002D$003E_2_s5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_static_exec, VA(a1, a3, a4, a5), cont);
    }
/** PREDICATE: maplist/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(maplist/2,public)




    public static Operation PRED_maplist_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::maplist_2_sub_1);
        return maplist_2_1(m);
    }

    private final static Operation maplist_2_sub_1(Prolog m) { 
        m.trust(null);
        return maplist_2_2(m);
    }

    private final static Operation maplist_2_1(Prolog m) { 
    // maplist(A,[B|C]):-!,call(A,B),maplist(A,C)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // maplist(A,[B|C]):-['$neck_cut',call(A,B),maplist(A,C)]
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
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("call", FILE_system::PRED_call_2_static_exec, VA(a1, a3), //
 Op("maplist", FILE_system::PRED_maplist_2_static_exec, VA(a1, a4), cont));
    }

    private final static Operation maplist_2_2(Prolog m) { 
    // maplist(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // maplist(A,B):-[]
        return cont;
    }
/** PREDICATE: maplist/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(maplist/3,public)




    public static Operation PRED_maplist_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_swi_supp::maplist_3_sub_1);
        return maplist_3_1(m);
    }

    private final static Operation maplist_3_sub_1(Prolog m) { 
        m.trust(null);
        return maplist_3_2(m);
    }

    private final static Operation maplist_3_1(Prolog m) { 
    // maplist(A,[B|C],[D|E]):-!,call(A,B,D),maplist(A,C,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // maplist(A,[B|C],[D|E]):-['$neck_cut',call(A,B,D),maplist(A,C,E)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.car();
            a5 = a2.cdr();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a2.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
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
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("call", FILE_system::PRED_call_3_static_exec, VA(a1, a4, a6), //
 Op("maplist", FILE_system::PRED_maplist_3_static_exec, VA(a1, a5, a7), cont));
    }

    private final static Operation maplist_3_2(Prolog m) { 
    // maplist(A,B,C):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // maplist(A,B,C):-[]
        return cont;
    }
/** PREDICATE: maplist/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(maplist/4,public)




    public static Operation PRED_maplist_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_swi_supp::maplist_4_sub_1);
        return maplist_4_1(m);
    }

    private final static Operation maplist_4_sub_1(Prolog m) { 
        m.trust(null);
        return maplist_4_2(m);
    }

    private final static Operation maplist_4_1(Prolog m) { 
    // maplist(A,[B|C],[D|E],[F|G]):-!,call(A,B,D,F),maplist(A,C,E,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // maplist(A,[B|C],[D|E],[F|G]):-['$neck_cut',call(A,B,D,F),maplist(A,C,E,G)]
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
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("call", FILE_system::PRED_call_4_static_exec, VA(a1, a5, a7, a9), //
 Op("maplist", FILE_system::PRED_maplist_4_static_exec, VA(a1, a6, a8, a10), cont));
    }

    private final static Operation maplist_4_2(Prolog m) { 
    // maplist(A,B,C,D):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // maplist(A,B,C,D):-[]
        return cont;
    }
/** PREDICATE: call/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(call/2,public)




    public static Operation PRED_call_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // call(A,B):-A=..[C|D],append(D,[B],E),F=..[C|E],call(F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
    // call(A,B):-['$univ'(A,[C|D]),append(D,[B],E),'$univ'(F,[C|E]),call(swi_supp:F)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = CONS(a3, a4);
        a6 = CONS(a2,  Prolog.Nil );
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = CONS(a3, a7);
    // put_str_args([@('ATOM_swi_supp'),a(8)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(10))
        a10 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a8);
 ;
        return //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a1, a5), //
 Op("append", FILE_system::PRED_append_3_static_exec, VA(a4, a6, a7), //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a8, a9), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a10), cont))));
    }
/** PREDICATE: call/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(call/3,public)




    public static Operation PRED_call_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // call(A,B,C):-A=..[D|E],append(E,[B,C],F),G=..[D|F],call(G)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // call(A,B,C):-['$univ'(A,[D|E]),append(E,[B,C],F),'$univ'(G,[D|F]),call(swi_supp:G)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = CONS(a4, a5);
        a7 = CONS(a3,  Prolog.Nil );
        a8 = CONS(a2, a7);
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = CONS(a4, a9);
    // put_str_args([@('ATOM_swi_supp'),a(10)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(12))
        a12 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a10);
 ;
        return //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a1, a6), //
 Op("append", FILE_system::PRED_append_3_static_exec, VA(a5, a8, a9), //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a10, a11), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a12), cont))));
    }
/** PREDICATE: call/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(call/4,public)




    public static Operation PRED_call_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // call(A,B,C,D):-A=..[E|F],append(F,[B,C,D],G),H=..[E|G],call(H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // call(A,B,C,D):-['$univ'(A,[E|F]),append(F,[B,C,D],G),'$univ'(H,[E|G]),call(swi_supp:H)]
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = CONS(a5, a6);
        a8 = CONS(a4,  Prolog.Nil );
        a9 = CONS(a3, a8);
        a10 = CONS(a2, a9);
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = CONS(a5, a11);
    // put_str_args([@('ATOM_swi_supp'),a(12)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(14))
        a14 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a12);
 ;
        return //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a1, a7), //
 Op("append", FILE_system::PRED_append_3_static_exec, VA(a6, a10, a11), //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a12, a13), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a14), cont))));
    }
/** PREDICATE: is_cons/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(is_cons/1,non-(public))




    public static Operation PRED_is_cons_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // is_cons(A):-compound(A),A=[B|C]
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // is_cons(A):-[compound(A),'$unify'(A,[B|C])]
        a2 = CONS(m.DONT_CARE1(), m.DONT_CARE1());
        return //
 Op("compound", FILE_system::PRED_compound_1_static_exec, VA(a1), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a1, a2), cont));
    }
/** PREDICATE: $dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-compound(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),compound(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("compound", FILE_system::PRED_compound_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: is_list/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(is_list/1,non-(public))




    public static Operation PRED_is_list_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return is_list_1_top(m);
    }

    private final static Operation is_list_1_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::is_list_1_var, FILE_swi_supp::is_list_1_1, FILE_swi_supp::is_list_1_1, FILE_swi_supp::is_list_1_1, FILE_swi_supp::is_list_1_1, FILE_swi_supp::is_list_1_var); 
    }

    private final static Operation is_list_1_var(Prolog m) { 
        m.jtry1(null, FILE_swi_supp::is_list_1_var_1);
        return is_list_1_1(m);
    }

    private final static Operation is_list_1_var_1(Prolog m) { 
        m.trust(null);
        return is_list_1_2(m);
    }

    private final static Operation is_list_1_1(Prolog m) { 
    // is_list(A):-'$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A),!,A==[]
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_list(A):-['$get_level'(B),'$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A),'$cut'(B),'$equality_of_term'(A,[])]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), //
 Op("$equality_of_term", FILE_system::PRED_$equality_of_term_2_static_exec, VA(a1,  Prolog.Nil ), cont)));
    }

    private final static Operation is_list_1_2(Prolog m) { 
    // is_list([A|B]):-is_list(B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_list([A|B]):-[is_list(B)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a2 = a1.cdr();
        } else if (a1.isVar()){
            a2 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a2), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a2;
m.cont = cont;
        return is_list_1_top(m);
    }
/** PREDICATE: member/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(member/2,non-(public))




    public static Operation PRED_member_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // member(A,[B|C]):-member_(C,A,B)
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
    // member(A,[B|C]):-[member_(C,A,B)]
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
 Op("member_", FILE_system::PRED_member__3_static_exec, VA(a4, a1, a3), cont);
    }
/** PREDICATE: member_/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(member_/3,non-(public))




    public static Operation PRED_member__3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return member__3_top(m);
    }

    private final static Operation member__3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::member__3_var, FILE_swi_supp::member__3_1, FILE_swi_supp::member__3_1, FILE_swi_supp::member__3_1, FILE_swi_supp::member__3_1, FILE_swi_supp::member__3_var); 
    }

    private final static Operation member__3_var(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::member__3_var_1);
        return member__3_1(m);
    }

    private final static Operation member__3_var_1(Prolog m) { 
        m.trust(null);
        return member__3_2(m);
    }

    private final static Operation member__3_1(Prolog m) { 
    // member_(A,B,B):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // member_(A,B,B):-[]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation member__3_2(Prolog m) { 
    // member_([A|B],C,D):-member_(B,C,A)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // member_([A|B],C,D):-[member_(B,C,A)]
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
        m.AREGS[0] = a5;
        m.AREGS[1] = a2;
        m.AREGS[2] = a4;
m.cont = cont;
        return member__3_top(m);
    }
/** PREDICATE: append/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(append/3,non-(public))




    public static Operation PRED_append_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return append_3_top(m);
    }

    private final static Operation append_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::append_3_var, fail_0, fail_0, FILE_swi_supp::append_3_1, fail_0, FILE_swi_supp::append_3_2); 
    }

    private final static Operation append_3_var(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::append_3_var_1);
        return append_3_1(m);
    }

    private final static Operation append_3_var_1(Prolog m) { 
        m.trust(null);
        return append_3_2(m);
    }

    private final static Operation append_3_1(Prolog m) { 
    // append([],A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // append([],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation append_3_2(Prolog m) { 
    // append([A|B],C,[A|D]):-append(B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // append([A|B],C,[A|D]):-[append(B,C,D)]
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
        return append_3_top(m);
    }
/** PREDICATE: flatten/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(flatten/2,non-(public))




    public static Operation PRED_flatten_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // flatten(A,B):-flatten(A,[],C),!,B=C
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
    // flatten(A,B):-['$get_level'(C),flatten(A,[],D),'$cut'(C),'$unify'(B,D)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        return //
 Op("flatten", FILE_system::PRED_flatten_3_static_exec, VA(a1,  Prolog.Nil , a4), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a2, a4), cont)));
    }
/** PREDICATE: flatten/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(flatten/3,non-(public))




    public static Operation PRED_flatten_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return flatten_3_top(m);
    }

    private final static Operation flatten_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::flatten_3_var, FILE_swi_supp::flatten_3_int, FILE_swi_supp::flatten_3_int, FILE_swi_supp::flatten_3_con, FILE_swi_supp::flatten_3_int, FILE_swi_supp::flatten_3_lis); 
    }

    private final static Operation flatten_3_var(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::flatten_3_var_1);
        return flatten_3_1(m);
    }

    private final static Operation flatten_3_var_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::flatten_3_var_2);
        return flatten_3_2(m);
    }

    private final static Operation flatten_3_var_2(Prolog m) { 
        m.retry(null, FILE_swi_supp::flatten_3_var_3);
        return flatten_3_3(m);
    }

    private final static Operation flatten_3_var_3(Prolog m) { 
        m.trust(null);
        return flatten_3_4(m);
    }

    private final static Operation flatten_3_int(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::flatten_3_int_1);
        return flatten_3_1(m);
    }

    private final static Operation flatten_3_int_1(Prolog m) { 
        m.trust(null);
        return flatten_3_4(m);
    }

    private final static Operation flatten_3_con(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::flatten_3_con_1);
        return flatten_3_1(m);
    }

    private final static Operation flatten_3_con_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::flatten_3_con_2);
        return flatten_3_2(m);
    }

    private final static Operation flatten_3_con_2(Prolog m) { 
        m.trust(null);
        return flatten_3_4(m);
    }

    private final static Operation flatten_3_lis(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::flatten_3_lis_1);
        return flatten_3_1(m);
    }

    private final static Operation flatten_3_lis_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::flatten_3_lis_2);
        return flatten_3_3(m);
    }

    private final static Operation flatten_3_lis_2(Prolog m) { 
        m.trust(null);
        return flatten_3_4(m);
    }

    private final static Operation flatten_3_1(Prolog m) { 
    // flatten(A,B,[A|B]):-var(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // flatten(A,B,[A|B]):-['$get_level'(C),var(A),'$cut'(C)]
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

    private final static Operation flatten_3_2(Prolog m) { 
    // flatten([],A,A):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // flatten([],A,A):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation flatten_3_3(Prolog m) { 
    // flatten([A|B],C,D):-!,flatten(A,E,D),flatten(B,C,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // flatten([A|B],C,D):-['$neck_cut',flatten(A,E,D),flatten(B,C,E)]
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
 Op("flatten", FILE_system::PRED_flatten_3_static_exec, VA(a5, a2, a6), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a6;
        m.AREGS[2] = a3;
        m.cont = p1;
        return flatten_3_top(m);
    }

    private final static Operation flatten_3_4(Prolog m) { 
    // flatten(A,B,[A|B]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // flatten(A,B,[A|B]):-[]
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
        return cont;
    }
/** PREDICATE: printAll/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(printAll/1,non-(public))




    public static Operation PRED_printAll_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::printAll_1_sub_1);
        return printAll_1_1(m);
    }

    private final static Operation printAll_1_sub_1(Prolog m) { 
        m.trust(null);
        return printAll_1_2(m);
    }

    private final static Operation printAll_1_1(Prolog m) { 
    // printAll(A):-call(A),writeq(A),nl,fail
         Term a1, a2;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // printAll(A):-[call(swi_supp:A),writeq(A),nl,fail]
    // put_str_args([@('ATOM_swi_supp'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , a1);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a2), //
 Op("writeq", FILE_system::PRED_writeq_1_static_exec, VA(a1), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), fail_0)));
    }

    private final static Operation printAll_1_2(Prolog m) { 
    // printAll(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // printAll(A):-[]
        return cont;
    }
/** PREDICATE: random/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(random/1,non-(public))
        final static SymbolTerm FUNCTOR_random_1 = F("random",1);
    private static final StructureTerm L_random_1_s4 = S( FUNCTOR_random_1 ,  int_0 );




    public static Operation PRED_random_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // random(A):-A is random(0)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // random(A):-[A is random(0)]
        //START inline expansion of a(1)is s(4)
        if (! a1.unify(Arithmetic.evaluate(L_random_1_s4), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: go/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main(go/1,non-(public))
    private static final DoubleTerm sf3 = Float(1.0);
        final static SymbolTerm FUNCTOR_$002B_2 = F("+",2);
        final static SymbolTerm FUNCTOR_frozen_2 = F("frozen",2);




    public static Operation PRED_go_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::go_1_var, FILE_swi_supp::go_1_var, fail_0, fail_0, fail_0, fail_0); 
    }

    private final static Operation go_1_var(Prolog m) { 
        m.jtry1(null, FILE_swi_supp::go_1_var_1);
        return go_1_1(m);
    }

    private final static Operation go_1_var_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_2);
        return go_1_2(m);
    }

    private final static Operation go_1_var_2(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_3);
        return go_1_3(m);
    }

    private final static Operation go_1_var_3(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_4);
        return go_1_4(m);
    }

    private final static Operation go_1_var_4(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_5);
        return go_1_5(m);
    }

    private final static Operation go_1_var_5(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_6);
        return go_1_6(m);
    }

    private final static Operation go_1_var_6(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_7);
        return go_1_7(m);
    }

    private final static Operation go_1_var_7(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_8);
        return go_1_8(m);
    }

    private final static Operation go_1_var_8(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_9);
        return go_1_9(m);
    }

    private final static Operation go_1_var_9(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_10);
        return go_1_10(m);
    }

    private final static Operation go_1_var_10(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_11);
        return go_1_11(m);
    }

    private final static Operation go_1_var_11(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_12);
        return go_1_12(m);
    }

    private final static Operation go_1_var_12(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_13);
        return go_1_13(m);
    }

    private final static Operation go_1_var_13(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_14);
        return go_1_14(m);
    }

    private final static Operation go_1_var_14(Prolog m) { 
        m.trust(null);
        return go_1_15(m);
    }

    private final static Operation go_1_1(Prolog m) { 
    // go(1):-freeze(A,integer(A)),A=1
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(1):-[freeze(A,swi_supp:integer(A)),'$unify'(A,1)]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a2,  int_1 ), cont));
    }

    private final static Operation go_1_2(Prolog m) { 
    // go(2):-freeze(A,integer(A)),A\=1.0
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(2):-[freeze(A,swi_supp:integer(A)),'$not_unifiable'(A,1.0)]
        if (!  int_2 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("$not_unifiable", FILE_system::PRED_$not_unifiable_2_static_exec, VA(a2, sf3), cont));
    }

    private final static Operation go_1_3(Prolog m) { 
    // go(3):-'$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A),A=1.0
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(3):-['$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A),'$unify'(A,1.0)]
        if (!  int_3 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        return //
 Op("$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a2), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a2, sf3), cont));
    }

    private final static Operation go_1_4(Prolog m) { 
    // go(4):-'$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A),A=1.0
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(4):-['$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A),'$unify'(A,1.0)]
        if (!  int_4 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        return //
 Op("$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a2), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a2, sf3), cont));
    }

    private final static Operation go_1_5(Prolog m) { 
    // go(11):-freeze(A,integer(A)),freeze(B,integer(B)),copy_term(A+B,C+D),printAll(frozen(D,E))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(11):-[freeze(A,swi_supp:integer(A)),freeze(B,swi_supp:integer(B)),copy_term(A+B,C+D),printAll(frozen(D,E))]
        if (!  int_11 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
        a5 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a4), null));
    // put_str_args([a(2),a(4)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a2, a4);
 ;
        a7 = m.mkvar1();
    // put_str_args([void,a(7)],y(2)),put_str(@('FUNCTOR_$002B_2'),y(2),a(8))
        a8 =  S( FUNCTOR_$002B_2 , m.mkvar3(), a7);
 ;
    // put_str_args([a(7),void],y(3)),put_str(@('FUNCTOR_frozen_2'),y(3),a(9))
        a9 =  S( FUNCTOR_frozen_2 , a7, m.mkvar3());
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a4, a5), //
 Op("copy_term", FILE_system::PRED_copy_term_2_static_exec, VA(a6, a8), //
 Op("printAll", FILE_system::PRED_printAll_1_static_exec, VA(a9), cont))));
    }

    private final static Operation go_1_6(Prolog m) { 
    // go(12):-freeze(A,integer(A)),printAll(frozen(A,B))
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(12):-[freeze(A,swi_supp:integer(A)),printAll(frozen(A,B))]
        if (!  int_12 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
    // put_str_args([a(2),void],y(1)),put_str(@('FUNCTOR_frozen_2'),y(1),a(4))
        a4 =  S( FUNCTOR_frozen_2 , a2, m.mkvar3());
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("printAll", FILE_system::PRED_printAll_1_static_exec, VA(a4), cont));
    }

    private final static Operation go_1_7(Prolog m) { 
    // go(13):-freeze(A,integer(A)),copy_term(A,B),printAll(frozen(B,C))
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(13):-[freeze(A,swi_supp:integer(A)),copy_term(A,B),printAll(frozen(B,C))]
        if (!  int_13 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
    // put_str_args([a(4),void],y(1)),put_str(@('FUNCTOR_frozen_2'),y(1),a(5))
        a5 =  S( FUNCTOR_frozen_2 , a4, m.mkvar3());
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("copy_term", FILE_system::PRED_copy_term_2_static_exec, VA(a2, a4), //
 Op("printAll", FILE_system::PRED_printAll_1_static_exec, VA(a5), cont)));
    }

    private final static Operation go_1_8(Prolog m) { 
    // go(14):-freeze(A,integer(A)),copy_term_nat(A,B),printAll(frozen(B,C))
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(14):-[freeze(A,swi_supp:integer(A)),copy_term_nat(A,B),printAll(frozen(B,C))]
        if (!  int_14 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
    // put_str_args([a(4),void],y(1)),put_str(@('FUNCTOR_frozen_2'),y(1),a(5))
        a5 =  S( FUNCTOR_frozen_2 , a4, m.mkvar3());
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("copy_term_nat", sxxtensions::PRED_copy_term_nat_2_static_exec, VA(a2, a4), //
 Op("printAll", FILE_system::PRED_printAll_1_static_exec, VA(a5), cont)));
    }

    private final static Operation go_1_9(Prolog m) { 
    // go(15):-freeze(A,integer(A)),copy_term_att(A,B),printAll(frozen(B,C))
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(15):-[freeze(A,swi_supp:integer(A)),copy_term_att(A,B),printAll(frozen(B,C))]
        if (!  int_15 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
    // put_str_args([a(4),void],y(1)),put_str(@('FUNCTOR_frozen_2'),y(1),a(5))
        a5 =  S( FUNCTOR_frozen_2 , a4, m.mkvar3());
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("copy_term_att", sxxtensions::PRED_copy_term_att_2_static_exec, VA(a2, a4), //
 Op("printAll", FILE_system::PRED_printAll_1_static_exec, VA(a5), cont)));
    }

    private final static Operation go_1_10(Prolog m) { 
    // go(16):-freeze(A,integer(A)),copy_term_att(A,B),frozen(B,C),frozen(A,D)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(16):-[freeze(A,swi_supp:integer(A)),copy_term_att(A,B),frozen(B,C),frozen(A,D)]
        if (!  int_16 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("copy_term_att", sxxtensions::PRED_copy_term_att_2_static_exec, VA(a2, a4), //
 Op("frozen", sxxtensions::PRED_frozen_2_static_exec, VA(a4, m.DONT_CARE2()), //
 Op("frozen", sxxtensions::PRED_frozen_2_static_exec, VA(a2, m.DONT_CARE2()), cont))));
    }

    private final static Operation go_1_11(Prolog m) { 
    // go(17):-freeze(A,integer(A)),copy_term_nat(A,B),frozen(B,C),frozen(A,D)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(17):-[freeze(A,swi_supp:integer(A)),copy_term_nat(A,B),frozen(B,C),frozen(A,D)]
        if (!  int_17 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("copy_term_nat", sxxtensions::PRED_copy_term_nat_2_static_exec, VA(a2, a4), //
 Op("frozen", sxxtensions::PRED_frozen_2_static_exec, VA(a4, m.DONT_CARE2()), //
 Op("frozen", sxxtensions::PRED_frozen_2_static_exec, VA(a2, m.DONT_CARE2()), cont))));
    }

    private final static Operation go_1_12(Prolog m) { 
    // go(18):-random(A),write(A),nl,fail
         Term a1, a2;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(18):-[random(A),write(A),nl,fail]
        if (!  int_18 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        return //
 Op("random", FILE_system::PRED_random_1_static_exec, VA(a2), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA(a2), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), fail_0)));
    }

    private final static Operation go_1_13(Prolog m) { 
    // go(19):-peek_pending(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(19):-[peek_pending(A)]
        if (!  int_19 .unify(a1, m.trail))
            return m.fail();
        return //
 Op("peek_pending", FILE_system::PRED_peek_pending_1_static_exec, VA(m.DONT_CARE2()), cont);
    }

    private final static Operation go_1_14(Prolog m) { 
    // go(20):-freeze(A,integer(A)),freeze(B,integer(B)),copy_term(A+B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(20):-[freeze(A,swi_supp:integer(A)),freeze(B,swi_supp:integer(B)),copy_term(A+B,C,D)]
        if (!  int_20 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
        a5 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a4), null));
    // put_str_args([a(2),a(4)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a2, a4);
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a4, a5), //
 Op("copy_term", sxxtensions::PRED_copy_term_3_static_exec, VA(a6, m.DONT_CARE2(), m.DONT_CARE2()), cont)));
    }

    private final static Operation go_1_15(Prolog m) { 
    // go(21):-freeze(A,integer(A)),freeze(B,integer(B)),copy_term(A+B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(21):-[freeze(A,swi_supp:integer(A)),freeze(B,swi_supp:integer(B)),copy_term(A+B,C,D)]
        if (!  int_21 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
        a5 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a4), null));
    // put_str_args([a(2),a(4)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a2, a4);
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a4, a5), //
 Op("copy_term", sxxtensions::PRED_copy_term_3_static_exec, VA(a6, m.DONT_CARE2(), m.DONT_CARE2()), cont)));
    }
/** PREDICATE: $dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-freeze(A,integer(A)),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),freeze(A,swi_supp:integer(A)),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a1), null));
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a1, a3), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-'$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),'$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-freeze(A,integer(A)),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),freeze(A,swi_supp:integer(A)),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a1), null));
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a1, a3), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-'$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),'$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl", FILE_system::PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $init/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl
*/
    // main('$init'/0,public)
        final static SymbolTerm ATOM_$0024predicate_property = SYM("$predicate_property");
    private static final StructureTerm L_$init_0_s6 = S( FUNCTOR_$002F_2 ,  ATOM_$0024predicate_property ,  int_4 );
        final static SymbolTerm FUNCTOR_$003A$002D_2 = F(":-",2);
    private static final StructureTerm L_$init_0_s11 = S( FUNCTOR_$0024current_typein_module_1 ,  ATOM_swi_supp );
    private static final StructureTerm L_$init_0_s14 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s11,  Prolog.True );
    private static final StructureTerm L_$init_0_s16 = S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , L_$init_0_s14);
        final static SymbolTerm ATOM_$0024current_source_module = SYM("$current_source_module");
    private static final StructureTerm L_$init_0_s20 = S( FUNCTOR_$002F_2 ,  ATOM_$0024current_source_module ,  int_1 );
    private static final StructureTerm L_$init_0_s24 = S( FUNCTOR_$0024current_context_module_1 ,  ATOM_user );
    private static final StructureTerm L_$init_0_s26 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s24,  Prolog.True );
    private static final StructureTerm L_$init_0_s28 = S( FUNCTOR_module_colon_2 ,  ATOM_swi_supp , L_$init_0_s26);
    private static final StructureTerm L_$init_0_s32 = S( FUNCTOR_$002F_2 ,  ATOM_$0024tracing ,  int_0 );




    public static Operation PRED_$init_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$init':-'$new_indexing_hash'(swi_supp,'$predicate_property'/4,A),assertz(('$current_typein_module'(swi_supp):-true)),'$new_indexing_hash'(swi_supp,'$current_source_module'/1,B),assertz(('$current_context_module'(user):-true)),'$new_indexing_hash'(swi_supp,'$tracing'/0,C)
        m.setB0();
        Operation p1, p2, p3, p4;
    // '$init':-['$new_indexing_hash'(swi_supp,'$predicate_property'/4,A),assertz(swi_supp:('$current_typein_module'(swi_supp):-true)),'$new_indexing_hash'(swi_supp,'$current_source_module'/1,B),assertz(swi_supp:('$current_context_module'(user):-true)),'$new_indexing_hash'(swi_supp,'$tracing'/0,C)]
        return //
 Op("$new_indexing_hash", FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_swi_supp , L_$init_0_s6, m.DONT_CARE2()), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s16), //
 Op("$new_indexing_hash", FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_swi_supp , L_$init_0_s20, m.DONT_CARE2()), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s28), //
 Op("$new_indexing_hash", FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_swi_supp , L_$init_0_s32, m.DONT_CARE2()), cont)))));
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("package",1,FILE_swi_supp::PRED_package_1_static_exec);
   PredTable.registerBuiltin("setup_call_cleanup",3,FILE_swi_supp::PRED_setup_call_cleanup_3_static_exec);
   PredTable.registerBuiltin("each_call_cleanup",3,FILE_swi_supp::PRED_each_call_cleanup_3_static_exec);
   PredTable.registerBuiltin("setup_call_catcher_cleanup",4,FILE_swi_supp::PRED_setup_call_catcher_cleanup_4_static_exec);
   PredTable.registerBuiltin("recorda",2,FILE_swi_supp::PRED_recorda_2_static_exec);
   PredTable.registerBuiltin("recordz",2,FILE_swi_supp::PRED_recordz_2_static_exec);
   PredTable.registerBuiltin("recorded",2,FILE_swi_supp::PRED_recorded_2_static_exec);
   PredTable.registerBuiltin("throw_missing",1,FILE_swi_supp::PRED_throw_missing_1_static_exec);
   PredTable.registerBuiltin("instance",2,FILE_swi_supp::PRED_instance_2_static_exec);
   PredTable.registerBuiltin("flag",3,FILE_swi_supp::PRED_flag_3_static_exec);
   PredTable.registerBuiltin("source_location",2,FILE_swi_supp::PRED_source_location_2_static_exec);
   PredTable.registerBuiltin("set_predicate_property",2,FILE_swi_supp::PRED_set_predicate_property_2_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("asserta_if_new",1,FILE_swi_supp::PRED_asserta_if_new_1_static_exec);
   PredTable.registerBuiltin("set_predicate_property",4,FILE_swi_supp::PRED_set_predicate_property_4_static_exec);
   PredTable.registerBuiltin("multifile",1,FILE_swi_supp::PRED_multifile_1_static_exec);
   PredTable.registerBuiltin("discontiguous",1,FILE_swi_supp::PRED_discontiguous_1_static_exec);
   PredTable.registerBuiltin("dynamic",1,FILE_swi_supp::PRED_dynamic_1_static_exec);
   PredTable.registerBuiltin("module_transparent",1,FILE_swi_supp::PRED_module_transparent_1_static_exec);
   PredTable.registerBuiltin("meta_predicate",1,FILE_swi_supp::PRED_meta_predicate_1_static_exec);
   PredTable.registerBuiltin("tracing",0,FILE_swi_supp::PRED_tracing_0_static_exec);
   PredTable.registerBuiltin("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("assertion",1,FILE_swi_supp::PRED_assertion_1_static_exec);
   PredTable.registerBuiltin("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("quietly",1,FILE_swi_supp::PRED_quietly_1_static_exec);
   PredTable.registerBuiltin("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("ignore",1,FILE_swi_supp::PRED_ignore_1_static_exec);
   PredTable.registerBuiltin("variant",2,FILE_swi_supp::PRED_variant_2_static_exec);
   PredTable.registerBuiltin("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("typein_module",1,FILE_swi_supp::PRED_typein_module_1_static_exec);
   PredTable.registerBuiltin("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("source_module",1,FILE_swi_supp::PRED_source_module_1_static_exec);
   PredTable.registerBuiltin("$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("context_module",1,FILE_swi_supp::PRED_context_module_1_static_exec);
   PredTable.registerBuiltin("current_predicate",1,FILE_swi_supp::PRED_current_predicate_1_static_exec);
   PredTable.registerBuiltin("$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("->","$002D$003E",2,FILE_swi_supp::PRED_$002D$003E_2_static_exec);
   PredTable.registerBuiltin("current_predicate_m_f_a",3,FILE_swi_supp::PRED_current_predicate_m_f_a_3_static_exec);
   PredTable.registerBuiltin("current_predicate",2,FILE_swi_supp::PRED_current_predicate_2_static_exec);
   PredTable.registerBuiltin("strip_module",3,FILE_swi_supp::PRED_strip_module_3_static_exec);
   PredTable.registerBuiltin("$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",4,FILE_swi_supp::PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_static_exec);
   PredTable.registerBuiltin("*->","$002A$002D$003E",2,FILE_swi_supp::PRED_$002A$002D$003E_2_static_exec);
   PredTable.registerBuiltin("maplist",2,FILE_swi_supp::PRED_maplist_2_static_exec);
   PredTable.registerBuiltin("maplist",3,FILE_swi_supp::PRED_maplist_3_static_exec);
   PredTable.registerBuiltin("maplist",4,FILE_swi_supp::PRED_maplist_4_static_exec);
   PredTable.registerBuiltin("call",2,FILE_swi_supp::PRED_call_2_static_exec);
   PredTable.registerBuiltin("call",3,FILE_swi_supp::PRED_call_3_static_exec);
   PredTable.registerBuiltin("call",4,FILE_swi_supp::PRED_call_4_static_exec);
   PredTable.registerBuiltin("is_cons",1,FILE_swi_supp::PRED_is_cons_1_static_exec);
   PredTable.registerBuiltin("$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("is_list",1,FILE_swi_supp::PRED_is_list_1_static_exec);
   PredTable.registerBuiltin("member",2,FILE_swi_supp::PRED_member_2_static_exec);
   PredTable.registerBuiltin("member_",3,FILE_swi_supp::PRED_member__3_static_exec);
   PredTable.registerBuiltin("append",3,FILE_swi_supp::PRED_append_3_static_exec);
   PredTable.registerBuiltin("flatten",2,FILE_swi_supp::PRED_flatten_2_static_exec);
   PredTable.registerBuiltin("flatten",3,FILE_swi_supp::PRED_flatten_3_static_exec);
   PredTable.registerBuiltin("printAll",1,FILE_swi_supp::PRED_printAll_1_static_exec);
   PredTable.registerBuiltin("random",1,FILE_swi_supp::PRED_random_1_static_exec);
   PredTable.registerBuiltin("go",1,FILE_swi_supp::PRED_go_1_static_exec);
   PredTable.registerBuiltin("$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$init",0,FILE_swi_supp::PRED_$init_0_static_exec);
}
}
