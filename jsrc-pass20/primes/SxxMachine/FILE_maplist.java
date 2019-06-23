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
import static SxxMachine.pterm.TermData.*;
import SxxMachine.*;
import SxxMachine.pterm.*;
import SxxMachine.bootpreds.*;
import SxxMachine.bootpreds.PRED_$begin_exception_1;
import SxxMachine.bootpreds.PRED_$begin_sync_2;
import SxxMachine.bootpreds.PRED_$builtin_member_2;
import SxxMachine.FILE_builtins.*;
import SxxMachine.sxxtensions.*;
@SuppressWarnings("unused")
public class FILE_maplist extends FILE_system {
/** PREDICATE: n_maplist/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-pass20/primes/maplist.pl
*/
    // main(n_maplist/4,public)
        final static Functor FUNCTOR_$002D_2 = F("-",2);
        final static Functor FUNCTOR_module_colon_2 = F(":",2);
        final static Atomic ATOM_n_maplist = SYM("n_maplist");




    public static Operation PRED_n_maplist_4_static_exec(Prolog m) { 
        Operation cont = m.cont; TermArray LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_maplist::n_maplist_4_var, FILE_maplist::n_maplist_4_var, FILE_maplist::n_maplist_4_flo, FILE_maplist::n_maplist_4_flo, FILE_maplist::n_maplist_4_flo, FILE_maplist::n_maplist_4_flo); 
    }

    private final static Operation n_maplist_4_var(Prolog m) { 
        m.jtry4(null, FILE_maplist::n_maplist_4_var_1);
        return n_maplist_4_1(m);
    }

    private final static Operation n_maplist_4_var_1(Prolog m) { 
        m.retry(null, FILE_maplist::n_maplist_4_var_2);
        return n_maplist_4_2(m);
    }

    private final static Operation n_maplist_4_var_2(Prolog m) { 
        m.trust(null);
        return n_maplist_4_3(m);
    }

    private final static Operation n_maplist_4_flo(Prolog m) { 
        m.jtry4(null, FILE_maplist::n_maplist_4_flo_1);
        return n_maplist_4_2(m);
    }

    private final static Operation n_maplist_4_flo_1(Prolog m) { 
        m.trust(null);
        return n_maplist_4_3(m);
    }

    private final static Operation n_maplist_4_1(Prolog m) { 
    // n_maplist(0,A,B,B):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.a(0).v;
        a2 = m.a(1).v;
        a3 = m.a(2).v;
        a4 = m.a(3).v;
        cont = m.cont;
    // n_maplist(0,A,B,B):-['$neck_cut']
        if (!  int_0 .unify(a1, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation n_maplist_4_2(Prolog m) { 
    // n_maplist(A,B,C,D):-ground(C),!,maplist(B,C,E),F is A-1,n_maplist(F,B,E,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2;
        Operation cont;
        a1 = m.a(0).v;
        a2 = m.a(1).v;
        a3 = m.a(2).v;
        a4 = m.a(3).v;
        cont = m.cont;
    // n_maplist(A,B,C,D):-['$get_level'(E),ground(C),'$cut'(E),maplist(B,C,F),G is A-1,n_maplist(G,n_maplist:B,F,D)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of ground(a(3))
        a3 = a3.dref();
        if (! a3.isGround()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(5))
        a5 = a5.dref();
                  m.cut( a5.intValue());
        //END inline expansion
        a6 = m.mkvar1();
        a7 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(8))
        a8 =  S( FUNCTOR_$002D_2 , a1,  int_1 );
 ;
    // put_str_args([@('ATOM_n_maplist'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_n_maplist , a2);
 ;
        return //
 Op("maplist", FILE_maplist::PRED_maplist_3_static_exec, VA(a2, a3, a6), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a7, a8), //
 Op("n_maplist", FILE_maplist::PRED_n_maplist_4_static_exec, VA(a7, a9, a6, a4), cont)));
    }

    private final static Operation n_maplist_4_3(Prolog m) { 
    // n_maplist(A,B,C,D):-maplist(B,E,D),F is A-1,n_maplist(F,B,C,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        Operation cont;
        a1 = m.a(0).v;
        a2 = m.a(1).v;
        a3 = m.a(2).v;
        a4 = m.a(3).v;
        cont = m.cont;
    // n_maplist(A,B,C,D):-[maplist(B,E,D),F is A-1,n_maplist(F,n_maplist:B,C,E)]
        a5 = m.mkvar1();
        a6 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(7))
        a7 =  S( FUNCTOR_$002D_2 , a1,  int_1 );
 ;
    // put_str_args([@('ATOM_n_maplist'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 ,  ATOM_n_maplist , a2);
 ;
        return //
 Op("maplist", FILE_maplist::PRED_maplist_3_static_exec, VA(a2, a5, a4), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a6, a7), //
 Op("n_maplist", FILE_maplist::PRED_n_maplist_4_static_exec, VA(a6, a8, a3, a5), cont)));
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("n_maplist",4,FILE_maplist::PRED_n_maplist_4_static_exec);
}
}
