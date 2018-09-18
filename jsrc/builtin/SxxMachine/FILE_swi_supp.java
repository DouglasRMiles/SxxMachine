package SxxMachine;
 
import static SxxMachine.FILE_builtins.PRED_$equality_of_term_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_$new_indexing_hash_3_static_exec;
import static SxxMachine.FILE_builtins.PRED_$not_unifiable_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_assertz_1_static_exec;
import static SxxMachine.FILE_builtins.PRED_call_1_static_exec;
import static SxxMachine.FILE_builtins.PRED_compound_1_static_exec;
import static SxxMachine.FILE_builtins.PRED_copy_term_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_integer_1_static_exec;
import static SxxMachine.FILE_builtins.PRED_write_1_static_exec;
import static SxxMachine.FILE_builtins.PRED_writeq_1_static_exec;
import static SxxMachine.FILE_cafeteria.PRED_nl_0_static_exec;
import static SxxMachine.Failure.fail_0;
import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
import static SxxMachine.bootpreds.PRED_$univ_2_static_exec;
import static SxxMachine.sxxtensions.PRED_peek_pending_1_static_exec;
public class FILE_swi_supp extends TermData {
/** PREDICATE: (package)/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




    public static Operation PRED_package_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // package A:-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // package A:-[]
        return cont;
    }
/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
        final static SymbolTerm ATOM_swi_supp = SYM("swi_supp");




    public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-'$current_typein_module'(B),!,A=B
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont; 
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-['$get_level'(C),call(swi_supp:'$current_typein_module'(B)),'$cut'(C),'$unify'(A,B)]
        a3 = V(m);
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        Term[] y1 = VA(a2);
        a4 = S("$current_typein_module", y1);
        Term[] y2 = VA( ATOM_swi_supp , a4);
        a5 = S(":", y2);
        return //
 Op((Prolog e)->PRED_call_1_static_exec(e), VA(a5), //
 Op((Prolog e)->PRED_$cut_1_static_exec(e), VA(a3), //
		 Op((Prolog e)->PRED_$unify_2_static_exec(e), VA(a1, a2), cont)));
    }

    private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: typein_module/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final SymbolTerm PRED_typein_module_1_s1 = SYM("user");




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
    // typein_module(A):-'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // typein_module(A):-['$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)]
        return //
 Op((Prolog e)->PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(e), VA(a1, V(m)), cont);
    }

    private final static Operation typein_module_1_2(Prolog m) { 
    // typein_module(A):-A=user
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // typein_module(A):-['$unify'(A,user)]
        //START inline expansion of $unify(a(1),s(1))
        if (! a1.unify(PRED_typein_module_1_s1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




    public static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-'$current_source_module'(B),!,A=B
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-['$get_level'(C),call(swi_supp:'$current_source_module'(B)),'$cut'(C),'$unify'(A,B)]
        a3 = V(m);
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        Term[] y1 = VA(a2);
        a4 = S("$current_source_module", y1);
        Term[] y2 = VA( ATOM_swi_supp , a4);
        a5 = S(":", y2);
        return //
 Op((Prolog e)->PRED_call_1_static_exec(e), VA(a5), //
 Op((Prolog e)->PRED_$cut_1_static_exec(e), VA(a3), //
 Op((Prolog e)->PRED_$unify_2_static_exec(e), VA(a1, a2), cont)));
    }

    private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: source_module/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final SymbolTerm PRED_source_module_1_s1 = SYM("user");




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
    // source_module(A):-'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // source_module(A):-['$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)]
        return //
 Op((Prolog e)->PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(e), VA(a1, V(m)), cont);
    }

    private final static Operation source_module_1_2(Prolog m) { 
    // source_module(A):-A=user
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // source_module(A):-['$unify'(A,user)]
        //START inline expansion of $unify(a(1),s(1))
        if (! a1.unify(PRED_source_module_1_s1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




    public static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-'$current_context_module'(A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[call(swi_supp:'$current_context_module'(A))]
        Term[] y1 = VA(a1);
        a2 = S("$current_context_module", y1);
        Term[] y2 = VA( ATOM_swi_supp , a2);
        a3 = S(":", y2);
        return //
 Op((Prolog e)->PRED_call_1_static_exec(e), VA(a3), cont);
    }

    private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-typein_module(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[typein_module(A)]
        return //
 Op((Prolog e)->PRED_typein_module_1_static_exec(e), VA(a1), cont);
    }
/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




    public static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(B),!,B=A
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-['$get_level'(C),'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(B),'$cut'(C),'$unify'(B,A)]
        a3 = V(m);
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op((Prolog e)->PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(e), VA(a2), //
 Op((Prolog e)->PRED_$cut_1_static_exec(e), VA(a3), //
 Op((Prolog e)->PRED_$unify_2_static_exec(e), VA(a2, a1), cont)));
    }

    private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: context_module/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




    public static Operation PRED_context_module_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // context_module(A):-'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // context_module(A):-['$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B)]
        return //
 Op((Prolog e)->PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(e), VA(a1, V(m)), cont);
    }
/** PREDICATE: strip_module/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




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
        a4 = V(m);
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
 Op((Prolog e)->PRED_context_module_1_static_exec(e), VA(a2), cont);
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
            a4 = V(m);
            a5 = V(m);
            if (!a1.unify(C(":", a4, a5), m.trail)){
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
 Op((Prolog e)->PRED_context_module_1_static_exec(e), VA(a2), cont);
    }
/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
        final static IntegerTerm int_1 = Integer(1);
        final static SymbolTerm ATOM_some = SYM("some");
        final static IntegerTerm int_0 = Integer(0);
    private static final StructureTerm PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_s8 = S("sols",  int_0 );




    public static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_swi_supp::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_sub_1);
        return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_1(m);
    }

    private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_2(m);
    }

    private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_1(Prolog m) { 
    // '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D):-(call(A),nb_setarg(1,D,some)),call(B)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D):-[call(swi_supp:A),nb_setarg(1,D,some),call(swi_supp:B)]
        Term[] y1 = VA( ATOM_swi_supp , a1);
        a5 = S(":", y1);
        Term[] y2 = VA( ATOM_swi_supp , a2);
        a6 = S(":", y2);
        return //
 Op((Prolog e)->PRED_call_1_static_exec(e), VA(a5), //
 Op(sxxtensions::PRED_nb_setarg_3_static_exec, VA( int_1 , a4,  ATOM_some ), //
 Op((Prolog e)->PRED_call_1_static_exec(e), VA(a6), cont)));
    }

    private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_2(Prolog m) { 
    // '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D):-D=sols(0),call(C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D):-['$unify'(D,sols(0)),call(swi_supp:C)]
        //START inline expansion of $unify(a(4),s(8))
        if (! a4.unify(PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_s8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        Term[] y1 = VA( ATOM_swi_supp , a3);
        a5 = S(":", y1);
        return //
 Op((Prolog e)->PRED_call_1_static_exec(e), VA(a5), cont);
    }
/** PREDICATE: (*->)/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final StructureTerm PRED_$002A$002D$003E_2_s5 = S("sols",  int_0 );




    public static Operation PRED_$002A$002D$003E_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A*->B;C:-D=sols(0),'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
    // A*->B;C:-['$unify'(D,sols(0)),'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A,B,C,D)]
        a2 = a2.dref();
            a3 = V(m);
            a4 = V(m);
            if (!a2.unify(C(";", a3, a4), m.trail)){
                return m.fail();
            }
        a5 = V(m);
        //START inline expansion of $unify(a(5),s(5))
        if (! a5.unify(PRED_$002A$002D$003E_2_s5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op((Prolog e)->PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_static_exec(e), VA(a1, a3, a4, a5), cont);
    }
/** PREDICATE: maplist/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




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
            Term[] argz = VA(a2.car(), a2.cdr());
            a3 = argz[0];
            a4 = argz[1];
        } else if (a2.isVar()){
            a3 = V(m);
            a4 = V(m);
             a2.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op((Prolog e)->PRED_call_2_static_exec(e), VA(a1, a3), //
 Op((Prolog e)->PRED_maplist_2_static_exec(e), VA(a1, a4), cont));
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
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




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
            Term[] argz = VA(a2.car(), a2.cdr());
            a4 = argz[0];
            a5 = argz[1];
        } else if (a2.isVar()){
            a4 = V(m);
            a5 = V(m);
             a2.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
            Term[] argz = VA(a3.car(), a3.cdr());
            a6 = argz[0];
            a7 = argz[1];
        } else if (a3.isVar()){
            a6 = V(m);
            a7 = V(m);
             a3.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op((Prolog e)->PRED_call_3_static_exec(e), VA(a1, a4, a6), //
 Op((Prolog e)->PRED_maplist_3_static_exec(e), VA(a1, a5, a7), cont));
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
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




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
            Term[] argz = VA(a2.car(), a2.cdr());
            a5 = argz[0];
            a6 = argz[1];
        } else if (a2.isVar()){
            a5 = V(m);
            a6 = V(m);
             a2.bind(CONS(a5, a6), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
            Term[] argz = VA(a3.car(), a3.cdr());
            a7 = argz[0];
            a8 = argz[1];
        } else if (a3.isVar()){
            a7 = V(m);
            a8 = V(m);
             a3.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
            Term[] argz = VA(a4.car(), a4.cdr());
            a9 = argz[0];
            a10 = argz[1];
        } else if (a4.isVar()){
            a9 = V(m);
            a10 = V(m);
             a4.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op((Prolog e)->PRED_call_4_static_exec(e), VA(a1, a5, a7, a9), //
 Op((Prolog e)->PRED_maplist_4_static_exec(e), VA(a1, a6, a8, a10), cont));
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
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final SymbolTerm PRED_call_2_s1 = SYM("[]");




    public static Operation PRED_call_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // call(A,B):-A=..[C|D],append(D,[B],E),F=..[C|E],call(F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
    // call(A,B):-['$univ'(A,[C|D]),append(D,[B],E),'$univ'(F,[C|E]),call(swi_supp:F)]
        a3 = V(m);
        a4 = V(m);
        a5 = CONS(a3, a4);
        a6 = CONS(a2, PRED_call_2_s1);
        a7 = V(m);
        a8 = V(m);
        a9 = CONS(a3, a7);
        Term[] y1 = VA( ATOM_swi_supp , a8);
        a10 = S(":", y1);
        return //
 Op((Prolog e)->PRED_$univ_2_static_exec(e), VA(a1, a5), //
 Op((Prolog e)->PRED_append_3_static_exec(e), VA(a4, a6, a7), //
 Op((Prolog e)->PRED_$univ_2_static_exec(e), VA(a8, a9), //
 Op((Prolog e)->PRED_call_1_static_exec(e), VA(a10), cont))));
    }
/** PREDICATE: call/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final SymbolTerm PRED_call_3_s1 = SYM("[]");




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
        a4 = V(m);
        a5 = V(m);
        a6 = CONS(a4, a5);
        a7 = CONS(a3, PRED_call_3_s1);
        a8 = CONS(a2, a7);
        a9 = V(m);
        a10 = V(m);
        a11 = CONS(a4, a9);
        Term[] y1 = VA( ATOM_swi_supp , a10);
        a12 = S(":", y1);
        return //
 Op((Prolog e)->PRED_$univ_2_static_exec(e), VA(a1, a6), //
 Op((Prolog e)->PRED_append_3_static_exec(e), VA(a5, a8, a9), //
 Op((Prolog e)->PRED_$univ_2_static_exec(e), VA(a10, a11), //
 Op((Prolog e)->PRED_call_1_static_exec(e), VA(a12), cont))));
    }
/** PREDICATE: call/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final SymbolTerm PRED_call_4_s1 = SYM("[]");




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
        a5 = V(m);
        a6 = V(m);
        a7 = CONS(a5, a6);
        a8 = CONS(a4, PRED_call_4_s1);
        a9 = CONS(a3, a8);
        a10 = CONS(a2, a9);
        a11 = V(m);
        a12 = V(m);
        a13 = CONS(a5, a11);
        Term[] y1 = VA( ATOM_swi_supp , a12);
        a14 = S(":", y1);
        return //
 Op((Prolog e)->PRED_$univ_2_static_exec(e), VA(a1, a7), //
 Op((Prolog e)->PRED_append_3_static_exec(e), VA(a6, a10, a11), //
 Op((Prolog e)->PRED_$univ_2_static_exec(e), VA(a12, a13), //
 Op((Prolog e)->PRED_call_1_static_exec(e), VA(a14), cont))));
    }
/** PREDICATE: is_cons/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




    public static Operation PRED_is_cons_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // is_cons(A):-compound(A),A=[B|C]
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // is_cons(A):-[compound(A),'$unify'(A,[B|C])]
        a2 = CONS(V(m), V(m));
        return //
 Op((Prolog e)->PRED_compound_1_static_exec(e), VA(a1), //
 Op((Prolog e)->PRED_$unify_2_static_exec(e), VA(a1, a2), cont));
    }
/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




    public static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-compound(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),compound(A),'$cut'(B),fail]
        a2 = V(m);
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op((Prolog e)->PRED_compound_1_static_exec(e), VA(a1), //
 Op((Prolog e)->PRED_$cut_1_static_exec(e), VA(a2), //
 Op(fail_0, VA(), cont)));
    }

    private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: is_list/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final SymbolTerm PRED_is_list_1_s1 = SYM("[]");




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
    // is_list(A):-'$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A),!,A==[]
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_list(A):-['$get_level'(B),'$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A),'$cut'(B),'$equality_of_term'(A,[])]
        a2 = V(m);
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op((Prolog e)->PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(e), VA(a1), //
 Op((Prolog e)->PRED_$cut_1_static_exec(e), VA(a2), //
 Op((Prolog e)->PRED_$equality_of_term_2_static_exec(e), VA(a1, PRED_is_list_1_s1), cont)));
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
            Term[] argz = VA(a1.car(), a1.cdr());
            a2 = argz[1];
        } else if (a1.isVar()){
            a2 = V(m);
             a1.bind(CONS(V(m), a2), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a2;
m.cont = cont;
        return is_list_1_top(m);
    }
/** PREDICATE: member/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




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
            Term[] argz = VA(a2.car(), a2.cdr());
            a3 = argz[0];
            a4 = argz[1];
        } else if (a2.isVar()){
            a3 = V(m);
            a4 = V(m);
             a2.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op((Prolog e)->PRED_member__3_static_exec(e), VA(a4, a1, a3), cont);
    }
/** PREDICATE: member_/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




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
            Term[] argz = VA(a1.car(), a1.cdr());
            a4 = argz[0];
            a5 = argz[1];
        } else if (a1.isVar()){
            a4 = V(m);
            a5 = V(m);
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
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final SymbolTerm PRED_append_3_s1 = SYM("[]");




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
        if (! PRED_append_3_s1.unify(a1, m.trail))
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
            Term[] argz = VA(a1.car(), a1.cdr());
            a4 = argz[0];
            a5 = argz[1];
        } else if (a1.isVar()){
            a4 = V(m);
            a5 = V(m);
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
            Term[] argz = VA(a3.car(), a3.cdr());
            if (! a4.unify(argz[0], m.trail))
                return m.fail();
            a6 = argz[1];
        } else if (a3.isVar()){
            a6 = V(m);
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
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final SymbolTerm PRED_flatten_2_s1 = SYM("[]");




    public static Operation PRED_flatten_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // flatten(A,B):-flatten(A,[],C),!,B=C
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
    // flatten(A,B):-['$get_level'(C),flatten(A,[],D),'$cut'(C),'$unify'(B,D)]
        a3 = V(m);
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = V(m);
        return //
 Op((Prolog e)->PRED_flatten_3_static_exec(e), VA(a1, PRED_flatten_2_s1, a4), //
 Op((Prolog e)->PRED_$cut_1_static_exec(e), VA(a3), //
 Op((Prolog e)->PRED_$unify_2_static_exec(e), VA(a2, a4), cont)));
    }
/** PREDICATE: flatten/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final SymbolTerm PRED_flatten_3_s1 = SYM("[]");




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
            Term[] argz = VA(a3.car(), a3.cdr());
            if (! a1.unify(argz[0], m.trail))
                return m.fail();
            if (! a2.unify(argz[1], m.trail))
                return m.fail();
        } else if (a3.isVar()){
             a3.bind(CONS(a1, a2), m.trail);
        } else {
            return m.fail();
        }
        a4 = V(m);
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
        if (! PRED_flatten_3_s1.unify(a1, m.trail))
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
            Term[] argz = VA(a1.car(), a1.cdr());
            a4 = argz[0];
            a5 = argz[1];
        } else if (a1.isVar()){
            a4 = V(m);
            a5 = V(m);
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a6 = V(m);
        p1 = //
 Op((Prolog e)->PRED_flatten_3_static_exec(e), VA(a5, a2, a6), cont);
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
            Term[] argz = VA(a3.car(), a3.cdr());
            if (! a1.unify(argz[0], m.trail))
                return m.fail();
            if (! a2.unify(argz[1], m.trail))
                return m.fail();
        } else if (a3.isVar()){
             a3.bind(CONS(a1, a2), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }
/** PREDICATE: printAll/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




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
        Term[] y1 = VA( ATOM_swi_supp , a1);
        a2 = S(":", y1);
        return //
 Op((Prolog e)->PRED_call_1_static_exec(e), VA(a2), //
 Op((Prolog e)->PRED_writeq_1_static_exec(e), VA(a1), //
 Op((Prolog e)->PRED_nl_0_static_exec(e), VA(), //
 Op(fail_0, VA(), cont))));
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
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final SymbolTerm PRED_random_1_s1 = SYM("random");




    public static Operation PRED_random_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // random(A):-A is random
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // random(A):-[A is random]
        //START inline expansion of a(1)is s(1)
        if (! a1.unify(Arithmetic.evaluate(PRED_random_1_s1), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: go/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final /**/ IntegerTerm PRED_go_1_s1 = Integer(1);
        final static IntegerTerm int_2 = Integer(2);
    private static final DoubleTerm sf3 = Float(1.0);
        final static IntegerTerm int_3 = Integer(3);
        final static IntegerTerm int_4 = Integer(4);
        final static IntegerTerm int_11 = Integer(11);
        final static IntegerTerm int_12 = Integer(12);
        final static IntegerTerm int_13 = Integer(13);
        final static IntegerTerm int_14 = Integer(14);
        final static IntegerTerm int_15 = Integer(15);
        final static IntegerTerm int_16 = Integer(16);
        final static IntegerTerm int_17 = Integer(17);
        final static IntegerTerm int_18 = Integer(18);
        final static IntegerTerm int_19 = Integer(19);
        final static IntegerTerm int_20 = Integer(20);
        final static IntegerTerm int_21 = Integer(21);




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
        if (! PRED_go_1_s1.unify(a1, m.trail))
            return m.fail();
        a2 = V(m);
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a2), null));
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op((Prolog e)->PRED_$unify_2_static_exec(e), VA(a2, PRED_go_1_s1), cont));
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
        a2 = V(m);
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a2), null));
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op((Prolog e)->PRED_$not_unifiable_2_static_exec(e), VA(a2, sf3), cont));
    }

    private final static Operation go_1_3(Prolog m) { 
    // go(3):-'$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A),A=1.0
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(3):-['$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A),'$unify'(A,1.0)]
        if (!  int_3 .unify(a1, m.trail))
            return m.fail();
        a2 = V(m);
        return //
 Op((Prolog e)->PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(e), VA(a2), //
 Op((Prolog e)->PRED_$unify_2_static_exec(e), VA(a2, sf3), cont));
    }

    private final static Operation go_1_4(Prolog m) { 
    // go(4):-'$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A),A=1.0
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(4):-['$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A),'$unify'(A,1.0)]
        if (!  int_4 .unify(a1, m.trail))
            return m.fail();
        a2 = V(m);
        return //
 Op((Prolog e)->PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(e), VA(a2), //
 Op((Prolog e)->PRED_$unify_2_static_exec(e), VA(a2, sf3), cont));
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
        a2 = V(m);
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a2), null));
        a4 = V(m);
        a5 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a4), null));
        Term[] y1 = VA(a2, a4);
        a6 = S("+", y1);
        a7 = V(m);
        Term[] y2 = VA(V(m), a7);
        a8 = S("+", y2);
        Term[] y3 = VA(a7, V(m));
        a9 = S("frozen", y3);
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a4, a5), //
 Op((Prolog e)->PRED_copy_term_2_static_exec(e), VA(a6, a8), //
 Op((Prolog e)->PRED_printAll_1_static_exec(e), VA(a9), cont))));
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
        a2 = V(m);
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a2), null));
        Term[] y1 = VA(a2, V(m));
        a4 = S("frozen", y1);
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op((Prolog e)->PRED_printAll_1_static_exec(e), VA(a4), cont));
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
        a2 = V(m);
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a2), null));
        a4 = V(m);
        Term[] y1 = VA(a4, V(m));
        a5 = S("frozen", y1);
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op((Prolog e)->PRED_copy_term_2_static_exec(e), VA(a2, a4), //
 Op((Prolog e)->PRED_printAll_1_static_exec(e), VA(a5), cont)));
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
        a2 = V(m);
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a2), null));
        a4 = V(m);
        Term[] y1 = VA(a4, V(m));
        a5 = S("frozen", y1);
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op(sxxtensions::PRED_copy_term_nat_2_static_exec, VA(a2, a4), //
 Op((Prolog e)->PRED_printAll_1_static_exec(e), VA(a5), cont)));
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
        a2 = V(m);
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a2), null));
        a4 = V(m);
        Term[] y1 = VA(a4, V(m));
        a5 = S("frozen", y1);
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op(sxxtensions::PRED_copy_term_att_2_static_exec, VA(a2, a4), //
 Op((Prolog e)->PRED_printAll_1_static_exec(e), VA(a5), cont)));
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
        a2 = V(m);
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a2), null));
        a4 = V(m);
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op(sxxtensions::PRED_copy_term_att_2_static_exec, VA(a2, a4), //
 Op(sxxtensions::PRED_frozen_2_static_exec, VA(a4, V(m)), //
 Op(sxxtensions::PRED_frozen_2_static_exec, VA(a2, V(m)), cont))));
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
        a2 = V(m);
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a2), null));
        a4 = V(m);
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op(sxxtensions::PRED_copy_term_nat_2_static_exec, VA(a2, a4), //
 Op(sxxtensions::PRED_frozen_2_static_exec, VA(a4, V(m)), //
 Op(sxxtensions::PRED_frozen_2_static_exec, VA(a2, V(m)), cont))));
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
        a2 = V(m);
        return //
 Op((Prolog e)->PRED_random_1_static_exec(e), VA(a2), //
 Op((Prolog e)->PRED_write_1_static_exec(e), VA(a2), //
 Op((Prolog e)->PRED_nl_0_static_exec(e), VA(), //
 Op(fail_0, VA(), cont))));
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
 Op((Prolog e)->PRED_peek_pending_1_static_exec(e), VA(V(m)), cont);
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
        a2 = V(m);
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a2), null));
        a4 = V(m);
        a5 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a4), null));
        Term[] y1 = VA(a2, a4);
        a6 = S("+", y1);
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a4, a5), //
 Op(sxxtensions::PRED_copy_term_3_static_exec, VA(a6, V(m), V(m)), cont)));
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
        a2 = V(m);
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a2), null));
        a4 = V(m);
        a5 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a4), null));
        Term[] y1 = VA(a2, a4);
        a6 = S("+", y1);
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a4, a5), //
 Op(sxxtensions::PRED_copy_term_3_static_exec, VA(a6, V(m), V(m)), cont)));
    }
/** PREDICATE: $dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




    public static Operation PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-freeze(A,integer(A)),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),freeze(A,swi_supp:integer(A)),'$cut'(B),fail]
        a2 = V(m);
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a1), null));
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a1, a3), //
 Op((Prolog e)->PRED_$cut_1_static_exec(e), VA(a2), //
 Op(fail_0, VA(), cont)));
    }

    private final static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




    public static Operation PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-'$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),'$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A),'$cut'(B),fail]
        a2 = V(m);
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op((Prolog e)->PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(e), VA(a1), //
 Op((Prolog e)->PRED_$cut_1_static_exec(e), VA(a2), //
 Op(fail_0, VA(), cont)));
    }

    private final static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




    public static Operation PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-freeze(A,integer(A)),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),freeze(A,swi_supp:integer(A)),'$cut'(B),fail]
        a2 = V(m);
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = Closure( //
 Op((Prolog e)->PRED_integer_1_static_exec(e), VA(a1), null));
        return //
 Op(sxxtensions::PRED_freeze_2_static_exec, VA(a1, a3), //
 Op((Prolog e)->PRED_$cut_1_static_exec(e), VA(a2), //
 Op(fail_0, VA(), cont)));
    }

    private final static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/




    public static Operation PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-'$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-['$get_level'(B),'$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A),'$cut'(B),fail]
        a2 = V(m);
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op((Prolog e)->PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(e), VA(a1), //
 Op((Prolog e)->PRED_$cut_1_static_exec(e), VA(a2), //
 Op(fail_0, VA(), cont)));
    }

    private final static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $init/0
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl
*/
    private static final StructureTerm PRED_$init_0_s6 = S("$current_typein_module",  ATOM_swi_supp );
    private static final StructureTerm PRED_$init_0_s9 = S(":-", PRED_$init_0_s6,  Prolog.True );
    private static final StructureTerm PRED_$init_0_s11 = S(":",  ATOM_swi_supp , PRED_$init_0_s9);
        final static SymbolTerm ATOM_$0024current_source_module = SYM("$current_source_module");
    private static final StructureTerm PRED_$init_0_s16 = S("/",  ATOM_$0024current_source_module ,  int_1 );
        final static SymbolTerm ATOM_user = SYM("user");
    private static final StructureTerm PRED_$init_0_s20 = S("$current_context_module",  ATOM_user );
    private static final StructureTerm PRED_$init_0_s22 = S(":-", PRED_$init_0_s20,  Prolog.True );
    private static final StructureTerm PRED_$init_0_s24 = S(":",  ATOM_swi_supp , PRED_$init_0_s22);




    public static Operation PRED_$init_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$init':-assertz(('$current_typein_module'(swi_supp):-true)),'$new_indexing_hash'(swi_supp,'$current_source_module'/1,A),assertz(('$current_context_module'(user):-true))
        m.setB0();
        Operation p1, p2;
    // '$init':-[assertz(swi_supp:('$current_typein_module'(swi_supp):-true)),'$new_indexing_hash'(swi_supp,'$current_source_module'/1,A),assertz(swi_supp:('$current_context_module'(user):-true))]
        return //
 Op((Prolog e)->PRED_assertz_1_static_exec(e), VA(PRED_$init_0_s11), //
 Op((Prolog e)->PRED_$new_indexing_hash_3_static_exec(e), VA( ATOM_swi_supp , PRED_$init_0_s16, V(m)), //
 Op((Prolog e)->PRED_assertz_1_static_exec(e), VA(PRED_$init_0_s24), cont)));
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("package",1,FILE_swi_supp::PRED_package_1_static_exec);
   PredTable.registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("typein_module",1,FILE_swi_supp::PRED_typein_module_1_static_exec);
   PredTable.registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("source_module",1,FILE_swi_supp::PRED_source_module_1_static_exec);
   PredTable.registerBuiltin("$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("context_module",1,FILE_swi_supp::PRED_context_module_1_static_exec);
   PredTable.registerBuiltin("strip_module",3,FILE_swi_supp::PRED_strip_module_3_static_exec);
   PredTable.registerBuiltin("$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",4,FILE_swi_supp::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_4_static_exec);
   PredTable.registerBuiltin("*->","$002A$002D$003E",2,FILE_swi_supp::PRED_$002A$002D$003E_2_static_exec);
   PredTable.registerBuiltin("maplist",2,FILE_swi_supp::PRED_maplist_2_static_exec);
   PredTable.registerBuiltin("maplist",3,FILE_swi_supp::PRED_maplist_3_static_exec);
   PredTable.registerBuiltin("maplist",4,FILE_swi_supp::PRED_maplist_4_static_exec);
   PredTable.registerBuiltin("call",2,FILE_swi_supp::PRED_call_2_static_exec);
   PredTable.registerBuiltin("call",3,FILE_swi_supp::PRED_call_3_static_exec);
   PredTable.registerBuiltin("call",4,FILE_swi_supp::PRED_call_4_static_exec);
   PredTable.registerBuiltin("is_cons",1,FILE_swi_supp::PRED_is_cons_1_static_exec);
   PredTable.registerBuiltin("$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("is_list",1,FILE_swi_supp::PRED_is_list_1_static_exec);
   PredTable.registerBuiltin("member",2,FILE_swi_supp::PRED_member_2_static_exec);
   PredTable.registerBuiltin("member_",3,FILE_swi_supp::PRED_member__3_static_exec);
   PredTable.registerBuiltin("append",3,FILE_swi_supp::PRED_append_3_static_exec);
   PredTable.registerBuiltin("flatten",2,FILE_swi_supp::PRED_flatten_2_static_exec);
   PredTable.registerBuiltin("flatten",3,FILE_swi_supp::PRED_flatten_3_static_exec);
   PredTable.registerBuiltin("printAll",1,FILE_swi_supp::PRED_printAll_1_static_exec);
   PredTable.registerBuiltin("random",1,FILE_swi_supp::PRED_random_1_static_exec);
   PredTable.registerBuiltin("go",1,FILE_swi_supp::PRED_go_1_static_exec);
   PredTable.registerBuiltin("$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/swi_supp.pl","$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$init",0,FILE_swi_supp::PRED_$init_0_static_exec);
}
}
