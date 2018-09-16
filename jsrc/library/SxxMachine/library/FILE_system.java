package SxxMachine.library;
 
import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.locks.*;
import java.util.logging.*;
import static SxxMachine.builtin.bootpreds.*;
import static SxxMachine.builtin.bootpreds.LEVELS;
import static SxxMachine.builtin.FILE_builtins.*;
import static SxxMachine.builtin.FILE_cafeteria.*;
import static SxxMachine.builtin.FILE_io.*;
import static SxxMachine.builtin.FILE_swi_supp.*;
import static SxxMachine.builtin.FILE_system.*;
import static SxxMachine.builtin.sxxtensions.*;
import static SxxMachine.Failure.*;
import static SxxMachine.Predicate.*;
import static SxxMachine.Prolog.*;
import static SxxMachine.Success.*;
import static SxxMachine.SymbolTerm.*;
import static SxxMachine.TermData.*;
import SxxMachine.*;
import SxxMachine.builtin.*;
import SxxMachine.exceptions.*;
import SxxMachine.builtin.bootpreds.*;
import SxxMachine.builtin.bootpreds.PRED_$begin_exception_1;
import SxxMachine.builtin.bootpreds.PRED_$begin_sync_2;
import SxxMachine.builtin.bootpreds.PRED_$builtin_member_2;
import SxxMachine.builtin.FILE_builtins.*;
import SxxMachine.builtin.sxxtensions.*;
public class FILE_system extends FILE_builtins {
/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
*/
    private static final SymbolTerm PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_s1 = SYM("true");
        final static SymbolTerm ATOM_access_level = SYM("access_level");
        final static SymbolTerm ATOM_system = SYM("system");
        final static SymbolTerm ATOM_user = SYM("user");




    public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_system::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_sub_1);
        return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_1(m);
    }

    private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_2(m);
    }

    private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_1(Prolog m) { 
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl'(A):-A==true,!,set_prolog_flag(access_level,system)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl'(A):-['$get_level'(B),'$equality_of_term'(A,true),'$cut'(B),set_prolog_flag(access_level,system)]
        a2 = V(m);
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),s(1))
        a1 = a1.dref();
        if (! a1.equalsTerm(PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        return //
 Op((e)->PRED_set_prolog_flag_2_static_exec(e), VA( ATOM_access_level ,  ATOM_system ), cont);
    }

    private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_2(Prolog m) { 
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl'(A):-set_prolog_flag(access_level,user)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl'(A):-[set_prolog_flag(access_level,user)]
        return //
 Op((e)->PRED_set_prolog_flag_2_static_exec(e), VA( ATOM_access_level ,  ATOM_user ), cont);
    }
/** PREDICATE: system_mode/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
*/
    private static final SymbolTerm PRED_system_mode_1_s1 = SYM("boolean");




    public static Operation PRED_system_mode_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // system_mode(A):-must_be(boolean,A),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl'(A)
        m.setB0();
         Term a1;
        Operation p1;
        a1 = LARG[0];
    // system_mode(A):-[must_be(boolean,A),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl'(A)]
        return //
 Op((e)->PRED_must_be_2_static_exec(e), VA(PRED_system_mode_1_s1, a1), //
 Op((e)->PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_static_exec(e), VA(a1), cont));
    }
/** PREDICATE: system_module/0
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
*/
    private static final SymbolTerm PRED_system_module_0_s1 = SYM("generate_debug_info");
        final static SymbolTerm ATOM_false = SYM("false");




    public static Operation PRED_system_module_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // system_module:-set_prolog_flag(generate_debug_info,false)
        m.setB0();
    // system_module:-[set_prolog_flag(generate_debug_info,false)]
        return //
 Op((e)->PRED_set_prolog_flag_2_static_exec(e), VA(PRED_system_module_0_s1,  ATOM_false ), cont);
    }
/** PREDICATE: lock_predicate/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
*/
    private static final SymbolTerm PRED_lock_predicate_1_s1 = SYM("system");




    public static Operation PRED_lock_predicate_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // lock_predicate(A):-'$set_predicate_attribute'(A,system,true)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // lock_predicate(A):-['$set_predicate_attribute'(A,system,true)]
        return //
 Op((e)->PRED_$set_predicate_attribute_3_static_exec(e), VA(a1, PRED_lock_predicate_1_s1,  Prolog.True ), cont);
    }

/** PREDICATE: unlock_predicate/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl
*/
    private static final SymbolTerm PRED_unlock_predicate_1_s1 = SYM("system");




    public static Operation PRED_unlock_predicate_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // unlock_predicate(A):-'$set_predicate_attribute'(A,system,false)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // unlock_predicate(A):-['$set_predicate_attribute'(A,system,false)]
        return //
 Op((e)->PRED_$set_predicate_attribute_3_static_exec(e), VA(a1, PRED_unlock_predicate_1_s1,  ATOM_false ), cont);
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/system.pl","$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl",1,FILE_system::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fsystem$002Epl_1_static_exec);
   PredTable.registerBuiltin("system_mode",1,FILE_system::PRED_system_mode_1_static_exec);
   PredTable.registerBuiltin("system_module",0,FILE_system::PRED_system_module_0_static_exec);
   PredTable.registerBuiltin("lock_predicate",1,FILE_system::PRED_lock_predicate_1_static_exec);
   PredTable.registerBuiltin("unlock_predicate",1,FILE_system::PRED_unlock_predicate_1_static_exec);
}
}
