package SxxMachine.builtin;


import static SxxMachine.Failure.fail_0;

import SxxMachine.Arithmetic;
import SxxMachine.IntegerTerm;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.PredTable;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;

//import SxxMachine.compiler.*;

public class FILE_rbtrees extends FILE_builtins {
/** PREDICATE: rb_new/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
        final static SymbolTerm ATOM_ = SYM("");




    public static Operation PRED_rb_new_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_new(t(A,A)):-A=black('',B,C,'')
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
    // rb_new(t(A,A)):-['$unify'(A,black('',B,C,''))]
        a1 = a1.dref();
            a2 = V(m);
            if (!a1.unify(C("t", a2, a2), m.trail)){
                return m.fail();
            }
        Term[] y1 = VA( ATOM_ , V(m), V(m),  ATOM_ );
        a3 = S("black", y1);
        //START inline expansion of $unify(a(2),a(3))
        if (! a2.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: rb_empty/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_empty_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_empty(t(A,A)):-A=black('',B,C,'')
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
    // rb_empty(t(A,A)):-['$unify'(A,black('',B,C,''))]
        a1 = a1.dref();
            a2 = V(m);
            if (!a1.unify(C("t", a2, a2), m.trail)){
                return m.fail();
            }
        Term[] y1 = VA( ATOM_ , V(m), V(m),  ATOM_ );
        a3 = S("black", y1);
        //START inline expansion of $unify(a(2),a(3))
        if (! a2.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: rb_lookup/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_lookup_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_lookup(A,B,t(C,D)):-lookup(A,B,D)
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // rb_lookup(A,B,t(C,D)):-[lookup(A,B,D)]
        a3 = a3.dref();
            a4 = V(m);
            if (!a3.unify(C("t", V(m), a4), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_lookup_3_static_exec, VA(a1, a2, a4), cont);
    }
/** PREDICATE: lookup/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
        final static IntegerTerm int_2 = Integer(2);




    public static Operation PRED_lookup_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_rbtrees::lookup_3_sub_1);
        return lookup_3_1(m);
    }

    private final static Operation lookup_3_sub_1(Prolog m) { 
        m.trust(null);
        return lookup_3_2(m);
    }

    private final static Operation lookup_3_1(Prolog m) { 
    // lookup(A,B,black('',C,D,'')):-!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lookup(A,B,black('',C,D,'')):-['$neck_cut',fail]
        a3 = a3.dref();
            if (!a3.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation lookup_3_2(Prolog m) { 
    // lookup(A,B,C):-arg(2,C,D),compare(E,D,A),lookup(E,A,B,C)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lookup(A,B,C):-[arg(2,C,D),compare(E,D,A),lookup(E,A,B,C)]
        a4 = V(m);
        a5 = V(m);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_2 , a3, a4), Op(FILE_builtins::PRED_compare_3_static_exec, VA(a5, a4, a1), Op(FILE_rbtrees::PRED_lookup_4_static_exec, VA(a5, a1, a2, a3), cont)));
    }
/** PREDICATE: lookup/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_lookup_4_s1 = SYM(">");
        final static IntegerTerm int_1 = Integer(1);
        final static SymbolTerm ATOM_smallerthan = SYM("<");
        final static IntegerTerm int_4 = Integer(4);
        final static SymbolTerm ATOM_unify = SYM("=");
        final static IntegerTerm int_3 = Integer(3);




    public static Operation PRED_lookup_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::lookup_4_var, fail_0, fail_0, FILE_rbtrees::lookup_4_var, fail_0, fail_0); 
    }

    private final static Operation lookup_4_var(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::lookup_4_var_1);
        return lookup_4_1(m);
    }

    private final static Operation lookup_4_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::lookup_4_var_2);
        return lookup_4_2(m);
    }

    private final static Operation lookup_4_var_2(Prolog m) { 
        m.trust(null);
        return lookup_4_3(m);
    }

    private final static Operation lookup_4_1(Prolog m) { 
    // lookup(>,A,B,C):-arg(1,C,D),lookup(A,B,D)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // lookup(>,A,B,C):-[arg(1,C,D),lookup(A,B,D)]
        if (! PRED_lookup_4_s1.unify(a1, m.trail))
            return m.fail();
        a5 = V(m);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_1 , a4, a5), Op(FILE_rbtrees::PRED_lookup_3_static_exec, VA(a2, a3, a5), cont));
    }

    private final static Operation lookup_4_2(Prolog m) { 
    // lookup(<,A,B,C):-arg(4,C,D),lookup(A,B,D)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // lookup(<,A,B,C):-[arg(4,C,D),lookup(A,B,D)]
        if (!  ATOM_smallerthan .unify(a1, m.trail))
            return m.fail();
        a5 = V(m);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_4 , a4, a5), Op(FILE_rbtrees::PRED_lookup_3_static_exec, VA(a2, a3, a5), cont));
    }

    private final static Operation lookup_4_3(Prolog m) { 
    // lookup(=,A,B,C):-arg(3,C,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // lookup(=,A,B,C):-[arg(3,C,B)]
        if (!  ATOM_unify .unify(a1, m.trail))
            return m.fail();
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_3 , a4, a3), cont);
    }
/** PREDICATE: rb_min/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_min_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_min(t(A,B),C,D):-min(B,C,D)
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // rb_min(t(A,B),C,D):-[min(B,C,D)]
        a1 = a1.dref();
            a4 = V(m);
            if (!a1.unify(C("t", V(m), a4), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_min_3_static_exec, VA(a4, a2, a3), cont);
    }
/** PREDICATE: min/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_min_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return min_3_top(m);
    }

    private final static Operation min_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::min_3_var, fail_0, fail_0, fail_0, FILE_rbtrees::min_3_var, fail_0); 
    }

    private final static Operation min_3_var(Prolog m) { 
        m.jtry3(null, FILE_rbtrees::min_3_var_1);
        return min_3_1(m);
    }

    private final static Operation min_3_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::min_3_var_2);
        return min_3_2(m);
    }

    private final static Operation min_3_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::min_3_var_3);
        return min_3_3(m);
    }

    private final static Operation min_3_var_3(Prolog m) { 
        m.trust(null);
        return min_3_4(m);
    }

    private final static Operation min_3_1(Prolog m) { 
    // min(red(black('',A,B,C),D,E,F),D,E):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // min(red(black('',A,B,C),D,E,F),D,E):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("red", a4, a5, a6, V(m)), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            if (!a4.unify(C("black",  ATOM_ , V(m), V(m), V(m)), m.trail)){
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

    private final static Operation min_3_2(Prolog m) { 
    // min(black(black('',A,B,C),D,E,F),D,E):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // min(black(black('',A,B,C),D,E,F),D,E):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, V(m)), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            if (!a4.unify(C("black",  ATOM_ , V(m), V(m), V(m)), m.trail)){
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

    private final static Operation min_3_3(Prolog m) { 
    // min(red(A,B,C,D),E,F):-min(A,E,F)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // min(red(A,B,C,D),E,F):-[min(A,E,F)]
        a1 = a1.dref();
            a4 = V(m);
            if (!a1.unify(C("red", a4, V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
m.cont = cont;
        return min_3_top(m);
    }

    private final static Operation min_3_4(Prolog m) { 
    // min(black(A,B,C,D),E,F):-min(A,E,F)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // min(black(A,B,C,D),E,F):-[min(A,E,F)]
        a1 = a1.dref();
            a4 = V(m);
            if (!a1.unify(C("black", a4, V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
m.cont = cont;
        return min_3_top(m);
    }
/** PREDICATE: rb_max/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_max_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_max(t(A,B),C,D):-max(B,C,D)
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // rb_max(t(A,B),C,D):-[max(B,C,D)]
        a1 = a1.dref();
            a4 = V(m);
            if (!a1.unify(C("t", V(m), a4), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_max_3_static_exec, VA(a4, a2, a3), cont);
    }
/** PREDICATE: max/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_max_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return max_3_top(m);
    }

    private final static Operation max_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::max_3_var, fail_0, fail_0, fail_0, FILE_rbtrees::max_3_var, fail_0); 
    }

    private final static Operation max_3_var(Prolog m) { 
        m.jtry3(null, FILE_rbtrees::max_3_var_1);
        return max_3_1(m);
    }

    private final static Operation max_3_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::max_3_var_2);
        return max_3_2(m);
    }

    private final static Operation max_3_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::max_3_var_3);
        return max_3_3(m);
    }

    private final static Operation max_3_var_3(Prolog m) { 
        m.trust(null);
        return max_3_4(m);
    }

    private final static Operation max_3_1(Prolog m) { 
    // max(red(A,B,C,black('',D,E,F)),B,C):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // max(red(A,B,C,black('',D,E,F)),B,C):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("red", V(m), a4, a5, a6), m.trail)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unify(C("black",  ATOM_ , V(m), V(m), V(m)), m.trail)){
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

    private final static Operation max_3_2(Prolog m) { 
    // max(black(A,B,C,black('',D,E,F)),B,C):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // max(black(A,B,C,black('',D,E,F)),B,C):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("black", V(m), a4, a5, a6), m.trail)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unify(C("black",  ATOM_ , V(m), V(m), V(m)), m.trail)){
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

    private final static Operation max_3_3(Prolog m) { 
    // max(red(A,B,C,D),E,F):-max(D,E,F)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // max(red(A,B,C,D),E,F):-[max(D,E,F)]
        a1 = a1.dref();
            a4 = V(m);
            if (!a1.unify(C("red", V(m), V(m), V(m), a4), m.trail)){
                return m.fail();
            }
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
m.cont = cont;
        return max_3_top(m);
    }

    private final static Operation max_3_4(Prolog m) { 
    // max(black(A,B,C,D),E,F):-max(D,E,F)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // max(black(A,B,C,D),E,F):-[max(D,E,F)]
        a1 = a1.dref();
            a4 = V(m);
            if (!a1.unify(C("black", V(m), V(m), V(m), a4), m.trail)){
                return m.fail();
            }
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
m.cont = cont;
        return max_3_top(m);
    }
/** PREDICATE: rb_next/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_next_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_next(t(A,B),C,D,E):-next(B,C,D,E,[])
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // rb_next(t(A,B),C,D,E):-[next(B,C,D,E,[])]
        a1 = a1.dref();
            a5 = V(m);
            if (!a1.unify(C("t", V(m), a5), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_next_5_static_exec, VA(a5, a2, a3, a4,  Prolog.Nil ), cont);
    }
/** PREDICATE: next/5
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5;




    public static Operation PRED_next_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::next_5_var, FILE_rbtrees::next_5_2, FILE_rbtrees::next_5_2, FILE_rbtrees::next_5_2, FILE_rbtrees::next_5_var, FILE_rbtrees::next_5_2); 
    }

    private final static Operation next_5_var(Prolog m) { 
        m.jtry5(null, FILE_rbtrees::next_5_var_1);
        return next_5_1(m);
    }

    private final static Operation next_5_var_1(Prolog m) { 
        m.trust(null);
        return next_5_2(m);
    }

    private final static Operation next_5_1(Prolog m) { 
    // next(black('',A,B,''),C,D,E,F):-!,fail
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // next(black('',A,B,''),C,D,E,F):-['$neck_cut',fail]
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation next_5_2(Prolog m) { 
    // next(A,B,C,D,E):-arg(2,A,F),arg(3,A,G),compare(H,F,B),next(H,B,F,G,C,D,A,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // next(A,B,C,D,E):-[arg(2,A,F),arg(3,A,G),compare(H,F,B),next(H,B,F,G,C,D,A,E)]
        a6 = V(m);
        a7 = V(m);
        a8 = V(m);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_2 , a1, a6), Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_3 , a1, a7), Op(FILE_builtins::PRED_compare_3_static_exec, VA(a8, a6, a2), Op(FILE_rbtrees::PRED_next_8_static_exec, VA(a8, a2, a6, a7, a3, a4, a1, a5), cont))));
    }
/** PREDICATE: next/8
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_next_8_s1 = SYM(">");

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_next_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::next_8_var, fail_0, fail_0, FILE_rbtrees::next_8_var, fail_0, fail_0); 
    }

    private final static Operation next_8_var(Prolog m) { 
        m.jtry8(null, FILE_rbtrees::next_8_var_1);
        return next_8_1(m);
    }

    private final static Operation next_8_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::next_8_var_2);
        return next_8_2(m);
    }

    private final static Operation next_8_var_2(Prolog m) { 
        m.trust(null);
        return next_8_3(m);
    }

    private final static Operation next_8_1(Prolog m) { 
    // next(>,A,B,C,D,E,F,G):-arg(1,F,H),next(H,A,D,E,B-C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
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
    // next(>,A,B,C,D,E,F,G):-[arg(1,F,H),next(H,A,D,E,B-C)]
        if (! PRED_next_8_s1.unify(a1, m.trail))
            return m.fail();
        a9 = V(m);
        Term[] y1 = VA(a3, a4);
        a10 = S("-", y1);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_1 , a7, a9), Op(FILE_rbtrees::PRED_next_5_static_exec, VA(a9, a2, a5, a6, a10), cont));
    }

    private final static Operation next_8_2(Prolog m) { 
    // next(<,A,B,C,D,E,F,G):-arg(4,F,H),next(H,A,D,E,G)
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
    // next(<,A,B,C,D,E,F,G):-[arg(4,F,H),next(H,A,D,E,G)]
        if (!  ATOM_smallerthan .unify(a1, m.trail))
            return m.fail();
        a9 = V(m);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_4 , a7, a9), Op(FILE_rbtrees::PRED_next_5_static_exec, VA(a9, a2, a5, a6, a8), cont));
    }

    private final static Operation next_8_3(Prolog m) { 
    // next(=,A,B,C,D,E,F,G):-arg(4,F,H),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(D,E,G,H)
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
    // next(=,A,B,C,D,E,F,G):-[arg(4,F,H),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(D,E,G,H)]
        if (!  ATOM_unify .unify(a1, m.trail))
            return m.fail();
        a9 = V(m);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_4 , a7, a9), Op(FILE_rbtrees::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_static_exec, VA(a5, a6, a8, a9), cont));
    }
/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_rbtrees::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_sub_1);
        return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_1(m);
    }

    private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_2(m);
    }

    private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_1(Prolog m) { 
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D):-min(D,A,B),!,true
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D):-['$get_level'(E),min(D,A,B),'$cut'(E)]
        a5 = V(m);
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_min_3_static_exec, VA(a4, a1, a2), Op(FILE_rbtrees::PRED_$cut_1_static_exec, VA(a5), cont));
    }

    private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_2(Prolog m) { 
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D):-C=A-B
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D):-['$unify'(C,A-B)]
        Term[] y1 = VA(a1, a2);
        a5 = S("-", y1);
        //START inline expansion of $unify(a(3),a(5))
        if (! a3.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: rb_previous/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_previous_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_previous(t(A,B),C,D,E):-previous(B,C,D,E,[])
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // rb_previous(t(A,B),C,D,E):-[previous(B,C,D,E,[])]
        a1 = a1.dref();
            a5 = V(m);
            if (!a1.unify(C("t", V(m), a5), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_previous_5_static_exec, VA(a5, a2, a3, a4,  Prolog.Nil ), cont);
    }
/** PREDICATE: previous/5
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5;




    public static Operation PRED_previous_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::previous_5_var, FILE_rbtrees::previous_5_2, FILE_rbtrees::previous_5_2, FILE_rbtrees::previous_5_2, FILE_rbtrees::previous_5_var, FILE_rbtrees::previous_5_2); 
    }

    private final static Operation previous_5_var(Prolog m) { 
        m.jtry5(null, FILE_rbtrees::previous_5_var_1);
        return previous_5_1(m);
    }

    private final static Operation previous_5_var_1(Prolog m) { 
        m.trust(null);
        return previous_5_2(m);
    }

    private final static Operation previous_5_1(Prolog m) { 
    // previous(black('',A,B,''),C,D,E,F):-!,fail
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // previous(black('',A,B,''),C,D,E,F):-['$neck_cut',fail]
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation previous_5_2(Prolog m) { 
    // previous(A,B,C,D,E):-arg(2,A,F),arg(3,A,G),compare(H,F,B),previous(H,B,F,G,C,D,A,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // previous(A,B,C,D,E):-[arg(2,A,F),arg(3,A,G),compare(H,F,B),previous(H,B,F,G,C,D,A,E)]
        a6 = V(m);
        a7 = V(m);
        a8 = V(m);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_2 , a1, a6), Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_3 , a1, a7), Op(FILE_builtins::PRED_compare_3_static_exec, VA(a8, a6, a2), Op(FILE_rbtrees::PRED_previous_8_static_exec, VA(a8, a2, a6, a7, a3, a4, a1, a5), cont))));
    }
/** PREDICATE: previous/8
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_previous_8_s1 = SYM(">");

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_previous_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::previous_8_var, fail_0, fail_0, FILE_rbtrees::previous_8_var, fail_0, fail_0); 
    }

    private final static Operation previous_8_var(Prolog m) { 
        m.jtry8(null, FILE_rbtrees::previous_8_var_1);
        return previous_8_1(m);
    }

    private final static Operation previous_8_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::previous_8_var_2);
        return previous_8_2(m);
    }

    private final static Operation previous_8_var_2(Prolog m) { 
        m.trust(null);
        return previous_8_3(m);
    }

    private final static Operation previous_8_1(Prolog m) { 
    // previous(>,A,B,C,D,E,F,G):-arg(1,F,H),previous(H,A,D,E,G)
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
    // previous(>,A,B,C,D,E,F,G):-[arg(1,F,H),previous(H,A,D,E,G)]
        if (! PRED_previous_8_s1.unify(a1, m.trail))
            return m.fail();
        a9 = V(m);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_1 , a7, a9), Op(FILE_rbtrees::PRED_previous_5_static_exec, VA(a9, a2, a5, a6, a8), cont));
    }

    private final static Operation previous_8_2(Prolog m) { 
    // previous(<,A,B,C,D,E,F,G):-arg(4,F,H),previous(H,A,D,E,B-C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
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
    // previous(<,A,B,C,D,E,F,G):-[arg(4,F,H),previous(H,A,D,E,B-C)]
        if (!  ATOM_smallerthan .unify(a1, m.trail))
            return m.fail();
        a9 = V(m);
        Term[] y1 = VA(a3, a4);
        a10 = S("-", y1);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_4 , a7, a9), Op(FILE_rbtrees::PRED_previous_5_static_exec, VA(a9, a2, a5, a6, a10), cont));
    }

    private final static Operation previous_8_3(Prolog m) { 
    // previous(=,A,B,C,D,E,F,G):-arg(1,F,H),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(D,E,G,H)
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
    // previous(=,A,B,C,D,E,F,G):-[arg(1,F,H),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(D,E,G,H)]
        if (!  ATOM_unify .unify(a1, m.trail))
            return m.fail();
        a9 = V(m);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA( int_1 , a7, a9), Op(FILE_rbtrees::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_static_exec, VA(a5, a6, a8, a9), cont));
    }
/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_rbtrees::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_sub_1);
        return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_1(m);
    }

    private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_2(m);
    }

    private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_1(Prolog m) { 
    // '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D):-max(D,A,B),!,true
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D):-['$get_level'(E),max(D,A,B),'$cut'(E)]
        a5 = V(m);
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_max_3_static_exec, VA(a4, a1, a2), Op(FILE_rbtrees::PRED_$cut_1_static_exec, VA(a5), cont));
    }

    private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_2(Prolog m) { 
    // '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D):-C=A-B
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D):-['$unify'(C,A-B)]
        Term[] y1 = VA(a1, a2);
        a5 = S("-", y1);
        //START inline expansion of $unify(a(3),a(5))
        if (! a3.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: rb_update/5
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5;




    public static Operation PRED_rb_update_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_update(t(A,B),C,D,E,t(A,F)):-update(B,C,D,E,F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // rb_update(t(A,B),C,D,E,t(A,F)):-[update(B,C,D,E,F)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("t", a6, a7), m.trail)){
                return m.fail();
            }
        a5 = a5.dref();
            a8 = V(m);
            if (!a5.unify(C("t", a6, a8), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_update_5_static_exec, VA(a7, a2, a3, a4, a8), cont);
    }
/** PREDICATE: rb_update/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_update_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_update(t(A,B),C,D,t(A,E)):-update(B,C,F,D,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // rb_update(t(A,B),C,D,t(A,E)):-[update(B,C,F,D,E)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("t", a5, a6), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a7 = V(m);
            if (!a4.unify(C("t", a5, a7), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_update_5_static_exec, VA(a6, a2, V(m), a3, a7), cont);
    }
/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/11
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_s1 = SYM("=");

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;




    public static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(11, null, FILE_rbtrees::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_1);
        return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_1(m);
    }

    private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_2);
        return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_2(m);
    }

    private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_3(m);
    }

    private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_1(Prolog m) { 
    // '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-I==(=),!,F=C,H=black(A,B,G,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-['$get_level'(L),'$equality_of_term'(I,=),'$cut'(L),'$unify'(F,C),'$unify'(H,black(A,B,G,D))]
        a12 = V(m);
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(9),s(1))
        a9 = a9.dref();
        if (! a9.equalsTerm(PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(12))
        a12 = a12.dref();
                  m.cut( a12.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(6),a(3))
        if (! a6.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        Term[] y1 = VA(a1, a2, a7, a4);
        a13 = S("black", y1);
        //START inline expansion of $unify(a(8),a(13))
        if (! a8.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_2(Prolog m) { 
    // '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-['$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J)]
        return Op(FILE_rbtrees::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec, VA(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10), cont);
    }

    private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_3(Prolog m) { 
    // '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-H=black(A,B,C,K),update(D,E,F,G,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-['$unify'(H,black(A,B,C,K)),update(D,E,F,G,K)]
        Term[] y1 = VA(a1, a2, a3, a11);
        a12 = S("black", y1);
        //START inline expansion of $unify(a(8),a(12))
        if (! a8.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_update_5_static_exec, VA(a4, a5, a6, a7, a11), cont);
    }
/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/10
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_s1 = SYM(">");

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10;




    public static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(10, null, FILE_rbtrees::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_sub_1);
        return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_1(m);
    }

    private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_2(m);
    }

    private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_1(Prolog m) { 
    // '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-I==(>),!,H=black(J,B,C,D),update(A,E,F,G,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-['$get_level'(K),'$equality_of_term'(I,>),'$cut'(K),'$unify'(H,black(J,B,C,D)),update(A,E,F,G,J)]
        a11 = V(m);
        //START inline expansion of $get_level(a(11))
        if (! a11.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(9),s(1))
        a9 = a9.dref();
        if (! a9.equalsTerm(PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(11))
        a11 = a11.dref();
                  m.cut( a11.intValue());
        //END inline expansion
        Term[] y1 = VA(a10, a2, a3, a4);
        a12 = S("black", y1);
        //START inline expansion of $unify(a(8),a(12))
        if (! a8.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_update_5_static_exec, VA(a1, a5, a6, a7, a10), cont);
    }

    private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_2(Prolog m) { 
    // '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: update/5
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5;




    public static Operation PRED_update_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::update_5_var, fail_0, fail_0, fail_0, FILE_rbtrees::update_5_var, fail_0); 
    }

    private final static Operation update_5_var(Prolog m) { 
        m.jtry5(null, FILE_rbtrees::update_5_var_1);
        return update_5_1(m);
    }

    private final static Operation update_5_var_1(Prolog m) { 
        m.trust(null);
        return update_5_2(m);
    }

    private final static Operation update_5_1(Prolog m) { 
    // update(black(A,B,C,D),E,F,G,H):-A\=[],compare(I,B,E),'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // update(black(A,B,C,D),E,F,G,H):-['$not_unifiable'(A,[]),compare(I,B,E),'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("black", a6, a7, a8, a9), m.trail)){
                return m.fail();
            }
        //START inline expansion of $not_unifiable(a(6),@(Prolog.Nil))
        if (a6.unify(Prolog.Nil, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a10 = V(m);
        return Op(FILE_builtins::PRED_compare_3_static_exec, VA(a10, a7, a2), Op(FILE_rbtrees::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec, VA(a6, a7, a8, a9, a2, a3, a4, a5, a10, V(m), V(m)), cont));
    }

    private final static Operation update_5_2(Prolog m) { 
    // update(red(A,B,C,D),E,F,G,H):-compare(I,B,E),'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // update(red(A,B,C,D),E,F,G,H):-[compare(I,B,E),'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("red", a6, a7, a8, a9), m.trail)){
                return m.fail();
            }
        a10 = V(m);
        return Op(FILE_builtins::PRED_compare_3_static_exec, VA(a10, a7, a2), Op(FILE_rbtrees::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec, VA(a6, a7, a8, a9, a2, a3, a4, a5, a10, V(m), V(m)), cont));
    }
/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/11
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_s1 = SYM("=");

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;




    public static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(11, null, FILE_rbtrees::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_1);
        return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_1(m);
    }

    private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_2);
        return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_2(m);
    }

    private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_3(m);
    }

    private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_1(Prolog m) { 
    // '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-I==(=),!,F=C,H=red(A,B,G,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-['$get_level'(L),'$equality_of_term'(I,=),'$cut'(L),'$unify'(F,C),'$unify'(H,red(A,B,G,D))]
        a12 = V(m);
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(9),s(1))
        a9 = a9.dref();
        if (! a9.equalsTerm(PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(12))
        a12 = a12.dref();
                  m.cut( a12.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(6),a(3))
        if (! a6.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        Term[] y1 = VA(a1, a2, a7, a4);
        a13 = S("red", y1);
        //START inline expansion of $unify(a(8),a(13))
        if (! a8.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_2(Prolog m) { 
    // '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-'$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-['$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J)]
        return Op(FILE_rbtrees::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec, VA(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10), cont);
    }

    private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_3(Prolog m) { 
    // '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-H=red(A,B,C,K),update(D,E,F,G,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-['$unify'(H,red(A,B,C,K)),update(D,E,F,G,K)]
        Term[] y1 = VA(a1, a2, a3, a11);
        a12 = S("red", y1);
        //START inline expansion of $unify(a(8),a(12))
        if (! a8.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_update_5_static_exec, VA(a4, a5, a6, a7, a11), cont);
    }
/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/10
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_s1 = SYM(">");

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10;




    public static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(10, null, FILE_rbtrees::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_sub_1);
        return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_1(m);
    }

    private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_2(m);
    }

    private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_1(Prolog m) { 
    // '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-I==(>),!,H=red(J,B,C,D),update(A,E,F,G,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-['$get_level'(K),'$equality_of_term'(I,>),'$cut'(K),'$unify'(H,red(J,B,C,D)),update(A,E,F,G,J)]
        a11 = V(m);
        //START inline expansion of $get_level(a(11))
        if (! a11.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(9),s(1))
        a9 = a9.dref();
        if (! a9.equalsTerm(PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(11))
        a11 = a11.dref();
                  m.cut( a11.intValue());
        //END inline expansion
        Term[] y1 = VA(a10, a2, a3, a4);
        a12 = S("red", y1);
        //START inline expansion of $unify(a(8),a(12))
        if (! a8.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_update_5_static_exec, VA(a1, a5, a6, a7, a10), cont);
    }

    private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_2(Prolog m) { 
    // '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: rb_apply/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_apply_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_apply(t(A,B),C,D,t(A,E)):-apply(B,C,D,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // rb_apply(t(A,B),C,D,t(A,E)):-[apply(B,C,D,E)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("t", a5, a6), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a7 = V(m);
            if (!a4.unify(C("t", a5, a7), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_apply_4_static_exec, VA(a6, a2, a3, a7), cont);
    }
/** PREDICATE: $dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/9
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_s1 = SYM("=");

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(9, null, FILE_rbtrees::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_1);
        return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_1(m);
    }

    private final static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_2);
        return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_2(m);
    }

    private final static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_3(m);
    }

    private final static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_1(Prolog m) { 
    // '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-I==(=),!,F=A,H=C,call(E,B,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        cont = m.cont;
    // '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-['$get_level'(J),'$equality_of_term'(I,=),'$cut'(J),'$unify'(F,A),'$unify'(H,C),call(E,B,G)]
        a10 = V(m);
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(9),s(1))
        a9 = a9.dref();
        if (! a9.equalsTerm(PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(10))
        a10 = a10.dref();
                  m.cut( a10.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(6),a(1))
        if (! a6.unify(a1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(8),a(3))
        if (! a8.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_call_3_static_exec, VA(a5, a2, a7), cont);
    }

    private final static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_2(Prolog m) { 
    // '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-'$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I)
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
        a9 = m.AREGS[8];
        cont = m.cont;
    // '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-['$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I)]
        return Op(FILE_rbtrees::PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec, VA(a1, a2, a3, a4, a5, a6, a7, a8, a9), cont);
    }

    private final static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_3(Prolog m) { 
    // '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-F=A,G=B,apply(C,D,E,H)
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
        a9 = m.AREGS[8];
        cont = m.cont;
    // '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-['$unify'(F,A),'$unify'(G,B),apply(C,D,E,H)]
        //START inline expansion of $unify(a(6),a(1))
        if (! a6.unify(a1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(7),a(2))
        if (! a7.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_apply_4_static_exec, VA(a3, a4, a5, a8), cont);
    }
/** PREDICATE: $dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/9
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_s1 = SYM(">");

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(9, null, FILE_rbtrees::$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_1);
        return $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_1(m);
    }

    private final static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_2(m);
    }

    private final static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_1(Prolog m) { 
    // '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-I==(>),!,H=C,G=B,apply(A,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        cont = m.cont;
    // '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-['$get_level'(J),'$equality_of_term'(I,>),'$cut'(J),'$unify'(H,C),'$unify'(G,B),apply(A,D,E,F)]
        a10 = V(m);
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(9),s(1))
        a9 = a9.dref();
        if (! a9.equalsTerm(PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(10))
        a10 = a10.dref();
                  m.cut( a10.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(8),a(3))
        if (! a8.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(7),a(2))
        if (! a7.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_apply_4_static_exec, VA(a1, a4, a5, a6), cont);
    }

    private final static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_2(Prolog m) { 
    // '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-fail
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
        a9 = m.AREGS[8];
        cont = m.cont;
    // '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: apply/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_apply_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::apply_4_var, fail_0, fail_0, fail_0, FILE_rbtrees::apply_4_var, fail_0); 
    }

    private final static Operation apply_4_var(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::apply_4_var_1);
        return apply_4_1(m);
    }

    private final static Operation apply_4_var_1(Prolog m) { 
        m.trust(null);
        return apply_4_2(m);
    }

    private final static Operation apply_4_1(Prolog m) { 
    // apply(black(A,B,C,D),E,F,black(G,B,H,I)):-A\=[],compare(J,B,E),'$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,C,D,E,F,G,H,I,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // apply(black(A,B,C,D),E,F,black(G,B,H,I)):-['$not_unifiable'(A,[]),compare(J,B,E),'$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,C,D,E,F,G,H,I,J)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a1.unify(C("black", a5, a6, a7, a8), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a9, a6, a10, a11), m.trail)){
                return m.fail();
            }
        //START inline expansion of $not_unifiable(a(5),@(Prolog.Nil))
        if (a5.unify(Prolog.Nil, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a12 = V(m);
        return Op(FILE_builtins::PRED_compare_3_static_exec, VA(a12, a6, a2), Op(FILE_rbtrees::PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec, VA(a5, a7, a8, a2, a3, a9, a10, a11, a12), cont));
    }

    private final static Operation apply_4_2(Prolog m) { 
    // apply(red(A,B,C,D),E,F,red(G,B,H,I)):-compare(J,B,E),'$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,C,D,E,F,G,H,I,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // apply(red(A,B,C,D),E,F,red(G,B,H,I)):-[compare(J,B,E),'$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,C,D,E,F,G,H,I,J)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a1.unify(C("red", a5, a6, a7, a8), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("red", a9, a6, a10, a11), m.trail)){
                return m.fail();
            }
        a12 = V(m);
        return Op(FILE_builtins::PRED_compare_3_static_exec, VA(a12, a6, a2), Op(FILE_rbtrees::PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec, VA(a5, a7, a8, a2, a3, a9, a10, a11, a12), cont));
    }
/** PREDICATE: $dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/9
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_s1 = SYM("=");

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(9, null, FILE_rbtrees::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_1);
        return $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_1(m);
    }

    private final static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_2);
        return $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_2(m);
    }

    private final static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_3(m);
    }

    private final static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_1(Prolog m) { 
    // '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-I==(=),!,F=A,H=C,call(E,B,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        cont = m.cont;
    // '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-['$get_level'(J),'$equality_of_term'(I,=),'$cut'(J),'$unify'(F,A),'$unify'(H,C),call(E,B,G)]
        a10 = V(m);
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(9),s(1))
        a9 = a9.dref();
        if (! a9.equalsTerm(PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(10))
        a10 = a10.dref();
                  m.cut( a10.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(6),a(1))
        if (! a6.unify(a1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(8),a(3))
        if (! a8.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_call_3_static_exec, VA(a5, a2, a7), cont);
    }

    private final static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_2(Prolog m) { 
    // '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-'$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I)
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
        a9 = m.AREGS[8];
        cont = m.cont;
    // '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-['$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I)]
        return Op(FILE_rbtrees::PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec, VA(a1, a2, a3, a4, a5, a6, a7, a8, a9), cont);
    }

    private final static Operation $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_3(Prolog m) { 
    // '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-F=A,G=B,apply(C,D,E,H)
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
        a9 = m.AREGS[8];
        cont = m.cont;
    // '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-['$unify'(F,A),'$unify'(G,B),apply(C,D,E,H)]
        //START inline expansion of $unify(a(6),a(1))
        if (! a6.unify(a1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(7),a(2))
        if (! a7.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_apply_4_static_exec, VA(a3, a4, a5, a8), cont);
    }
/** PREDICATE: $dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/9
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_s1 = SYM(">");

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(9, null, FILE_rbtrees::$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_1);
        return $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_1(m);
    }

    private final static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_2(m);
    }

    private final static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_1(Prolog m) { 
    // '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-I==(>),!,H=C,G=B,apply(A,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        cont = m.cont;
    // '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-['$get_level'(J),'$equality_of_term'(I,>),'$cut'(J),'$unify'(H,C),'$unify'(G,B),apply(A,D,E,F)]
        a10 = V(m);
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(9),s(1))
        a9 = a9.dref();
        if (! a9.equalsTerm(PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(10))
        a10 = a10.dref();
                  m.cut( a10.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(8),a(3))
        if (! a8.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(7),a(2))
        if (! a7.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_apply_4_static_exec, VA(a1, a4, a5, a6), cont);
    }

    private final static Operation $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_2(Prolog m) { 
    // '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-fail
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
        a9 = m.AREGS[8];
        cont = m.cont;
    // '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: rb_in/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_in_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_in(A,B,t(C,D)):-enum(A,B,D)
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // rb_in(A,B,t(C,D)):-[enum(A,B,D)]
        a3 = a3.dref();
            a4 = V(m);
            if (!a3.unify(C("t", V(m), a4), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_enum_3_static_exec, VA(a1, a2, a4), cont);
    }
/** PREDICATE: enum/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_enum_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_rbtrees::enum_3_sub_1);
        return enum_3_1(m);
    }

    private final static Operation enum_3_sub_1(Prolog m) { 
        m.trust(null);
        return enum_3_2(m);
    }

    private final static Operation enum_3_1(Prolog m) { 
    // enum(A,B,black(C,D,E,F)):-C\='',enum_cases(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // enum(A,B,black(C,D,E,F)):-['$not_unifiable'(C,''),enum_cases(A,B,C,D,E,F)]
        a3 = a3.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a3.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        //START inline expansion of $not_unifiable(a(4),@(ATOM_))
        if (a4.unify(ATOM_, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_enum_cases_6_static_exec, VA(a1, a2, a4, a5, a6, a7), cont);
    }

    private final static Operation enum_3_2(Prolog m) { 
    // enum(A,B,red(C,D,E,F)):-enum_cases(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // enum(A,B,red(C,D,E,F)):-[enum_cases(A,B,C,D,E,F)]
        a3 = a3.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a3.unify(C("red", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_enum_cases_6_static_exec, VA(a1, a2, a4, a5, a6, a7), cont);
    }
/** PREDICATE: enum_cases/6
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6;




    public static Operation PRED_enum_cases_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_rbtrees::enum_cases_6_sub_1);
        return enum_cases_6_1(m);
    }

    private final static Operation enum_cases_6_sub_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::enum_cases_6_sub_2);
        return enum_cases_6_2(m);
    }

    private final static Operation enum_cases_6_sub_2(Prolog m) { 
        m.trust(null);
        return enum_cases_6_3(m);
    }

    private final static Operation enum_cases_6_1(Prolog m) { 
    // enum_cases(A,B,C,D,E,F):-enum(A,B,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // enum_cases(A,B,C,D,E,F):-[enum(A,B,C)]
        return Op(FILE_rbtrees::PRED_enum_3_static_exec, VA(a1, a2, a3), cont);
    }

    private final static Operation enum_cases_6_2(Prolog m) { 
    // enum_cases(A,B,C,A,B,D):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // enum_cases(A,B,C,A,B,D):-[]
        if (! a1.unify(a4, m.trail))
            return m.fail();
        if (! a2.unify(a5, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation enum_cases_6_3(Prolog m) { 
    // enum_cases(A,B,C,D,E,F):-enum(A,B,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // enum_cases(A,B,C,D,E,F):-[enum(A,B,F)]
        return Op(FILE_rbtrees::PRED_enum_3_static_exec, VA(a1, a2, a6), cont);
    }
/** PREDICATE: rb_insert/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_insert_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_insert(t(A,B),C,D,t(A,E)):-insert(B,C,D,A,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // rb_insert(t(A,B),C,D,t(A,E)):-[insert(B,C,D,A,E)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("t", a5, a6), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a7 = V(m);
            if (!a4.unify(C("t", a5, a7), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_insert_5_static_exec, VA(a6, a2, a3, a5, a7), cont);
    }
/** PREDICATE: insert/5
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5;




    public static Operation PRED_insert_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // insert(A,B,C,D,E):-insert2(A,B,C,D,F,G),fix_root(F,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // insert(A,B,C,D,E):-[insert2(A,B,C,D,F,G),fix_root(F,E)]
        a6 = V(m);
        return Op(FILE_rbtrees::PRED_insert2_6_static_exec, VA(a1, a2, a3, a4, a6, V(m)), Op(FILE_rbtrees::PRED_fix_root_2_static_exec, VA(a6, a5), cont));
    }
/** PREDICATE: insert2/6
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
        final static SymbolTerm ATOM_not_done = SYM("not_done");

    // private final Term arg5, arg6;




    public static Operation PRED_insert2_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return insert2_6_top(m);
    }

    private final static Operation insert2_6_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::insert2_6_var, fail_0, fail_0, fail_0, FILE_rbtrees::insert2_6_var, fail_0); 
    }

    private final static Operation insert2_6_var(Prolog m) { 
        m.jtry6(null, FILE_rbtrees::insert2_6_var_1);
        return insert2_6_1(m);
    }

    private final static Operation insert2_6_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::insert2_6_var_2);
        return insert2_6_2(m);
    }

    private final static Operation insert2_6_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::insert2_6_var_3);
        return insert2_6_3(m);
    }

    private final static Operation insert2_6_var_3(Prolog m) { 
        m.retry(null, FILE_rbtrees::insert2_6_var_4);
        return insert2_6_4(m);
    }

    private final static Operation insert2_6_var_4(Prolog m) { 
        m.retry(null, FILE_rbtrees::insert2_6_var_5);
        return insert2_6_5(m);
    }

    private final static Operation insert2_6_var_5(Prolog m) { 
        m.retry(null, FILE_rbtrees::insert2_6_var_6);
        return insert2_6_6(m);
    }

    private final static Operation insert2_6_var_6(Prolog m) { 
        m.trust(null);
        return insert2_6_7(m);
    }

    private final static Operation insert2_6_1(Prolog m) { 
    // insert2(black('',A,B,''),C,D,E,F,G):-!,F=red(E,C,D,E),G=not_done
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert2(black('',A,B,''),C,D,E,F,G):-['$neck_cut','$unify'(F,red(E,C,D,E)),'$unify'(G,not_done)]
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        Term[] y1 = VA(a4, a2, a3, a4);
        a7 = S("red", y1);
        //START inline expansion of $unify(a(5),a(7))
        if (! a5.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(6),@(ATOM_not_done))
        if (! a6.unify(ATOM_not_done, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation insert2_6_2(Prolog m) { 
    // insert2(red(A,B,C,D),E,F,G,H,I):-'$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert2(red(A,B,C,D),E,F,G,H,I):-['$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("red", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec, VA(a7, a8, a9, a10, a2, a3, a4, a5, a6, V(m)), cont);
    }

    private final static Operation insert2_6_3(Prolog m) { 
    // insert2(red(A,B,C,D),E,F,G,H,I):-'$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,D,E,F,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert2(red(A,B,C,D),E,F,G,H,I):-['$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,D,E,F,H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("red", a7, a8, V(m), a9), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_static_exec, VA(a7, a8, a9, a2, a3, a5, a6), cont);
    }

    private final static Operation insert2_6_4(Prolog m) { 
    // insert2(red(A,B,C,D),E,F,G,H,I):-H=red(A,B,C,J),insert2(D,E,F,G,J,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert2(red(A,B,C,D),E,F,G,H,I):-['$unify'(H,red(A,B,C,J)),insert2(D,E,F,G,J,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("red", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a11 = V(m);
        Term[] y1 = VA(a7, a8, a9, a11);
        a12 = S("red", y1);
        //START inline expansion of $unify(a(5),a(12))
        if (! a5.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a10;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a11;
        m.AREGS[5] = a6;
m.cont = cont;
        return insert2_6_top(m);
    }

    private final static Operation insert2_6_5(Prolog m) { 
    // insert2(black(A,B,C,D),E,F,G,H,I):-'$dummy_12_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert2(black(A,B,C,D),E,F,G,H,I):-['$dummy_12_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("black", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_$dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec, VA(a7, a8, a9, a10, a2, a3, a4, a5, a6, V(m), V(m)), cont);
    }

    private final static Operation insert2_6_6(Prolog m) { 
    // insert2(black(A,B,C,D),E,F,G,H,I):-'$dummy_13_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,D,E,F,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert2(black(A,B,C,D),E,F,G,H,I):-['$dummy_13_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,D,E,F,H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("black", a7, a8, V(m), a9), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_$dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_static_exec, VA(a7, a8, a9, a2, a3, a5, a6), cont);
    }

    private final static Operation insert2_6_7(Prolog m) { 
    // insert2(black(A,B,C,D),E,F,G,H,I):-insert2(D,E,F,G,J,K),fix_right(K,black(A,B,C,J),H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert2(black(A,B,C,D),E,F,G,H,I):-[insert2(D,E,F,G,J,K),fix_right(K,black(A,B,C,J),H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("black", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a11 = V(m);
        a12 = V(m);
        Term[] y1 = VA(a7, a8, a9, a11);
        a13 = S("black", y1);
        p1 = Op(FILE_rbtrees::PRED_fix_right_4_static_exec, VA(a12, a13, a5, a6), cont);
        m.AREGS[0] = a10;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a11;
        m.AREGS[5] = a12;
        m.cont = p1;
        return insert2_6_top(m);
    }
/** PREDICATE: $dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/10
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10;




    public static Operation PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(10, null, FILE_rbtrees::$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_sub_1);
        return $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_1(m);
    }

    private final static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_2(m);
    }

    private final static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_1(Prolog m) { 
    // '$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-E@<B,!,H=red(J,B,C,D),insert2(A,E,F,G,J,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // '$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-['$get_level'(K),'$before'(E,B),'$cut'(K),'$unify'(H,red(J,B,C,D)),insert2(A,E,F,G,J,I)]
        a11 = V(m);
        //START inline expansion of $get_level(a(11))
        if (! a11.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $before(a(5),a(2))
        a5 = a5.dref();
        a2 = a2.dref();
        if (a5.compareTo(a2) >= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(11))
        a11 = a11.dref();
                  m.cut( a11.intValue());
        //END inline expansion
        Term[] y1 = VA(a10, a2, a3, a4);
        a12 = S("red", y1);
        //START inline expansion of $unify(a(8),a(12))
        if (! a8.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_insert2_6_static_exec, VA(a1, a5, a6, a7, a10, a9), cont);
    }

    private final static Operation $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_2(Prolog m) { 
    // '$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // '$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/7
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
        final static SymbolTerm ATOM_done = SYM("done");

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_rbtrees::$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_sub_1);
        return $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_1(m);
    }

    private final static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_2(m);
    }

    private final static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_1(Prolog m) { 
    // '$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G):-D==B,!,F=red(A,B,E,C),G=done
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G):-['$get_level'(H),'$equality_of_term'(D,B),'$cut'(H),'$unify'(F,red(A,B,E,C)),'$unify'(G,done)]
        a8 = V(m);
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(4),a(2))
        a4 = a4.dref();
        a2 = a2.dref();
        if (! a4.equalsTerm(a2)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(8))
        a8 = a8.dref();
                  m.cut( a8.intValue());
        //END inline expansion
        Term[] y1 = VA(a1, a2, a5, a3);
        a9 = S("red", y1);
        //START inline expansion of $unify(a(6),a(9))
        if (! a6.unify(a9, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(7),@(ATOM_done))
        if (! a7.unify(ATOM_done, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_2(Prolog m) { 
    // '$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G):-fail
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
    // '$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_12_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/11
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;




    public static Operation PRED_$dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(11, null, FILE_rbtrees::$dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_1);
        return $dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_1(m);
    }

    private final static Operation $dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_2(m);
    }

    private final static Operation $dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_1(Prolog m) { 
    // '$dummy_12_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-E@<B,!,insert2(A,E,F,G,J,K),fix_left(K,black(J,B,C,D),H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // '$dummy_12_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-['$get_level'(L),'$before'(E,B),'$cut'(L),insert2(A,E,F,G,J,K),fix_left(K,black(J,B,C,D),H,I)]
        a12 = V(m);
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $before(a(5),a(2))
        a5 = a5.dref();
        a2 = a2.dref();
        if (a5.compareTo(a2) >= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(12))
        a12 = a12.dref();
                  m.cut( a12.intValue());
        //END inline expansion
        Term[] y1 = VA(a10, a2, a3, a4);
        a13 = S("black", y1);
        return Op(FILE_rbtrees::PRED_insert2_6_static_exec, VA(a1, a5, a6, a7, a10, a11), Op(FILE_rbtrees::PRED_fix_left_4_static_exec, VA(a11, a13, a8, a9), cont));
    }

    private final static Operation $dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_2(Prolog m) { 
    // '$dummy_12_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // '$dummy_12_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_13_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/7
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_$dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_rbtrees::$dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_sub_1);
        return $dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_1(m);
    }

    private final static Operation $dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_2(m);
    }

    private final static Operation $dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_1(Prolog m) { 
    // '$dummy_13_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G):-D==B,!,F=black(A,B,E,C),G=done
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$dummy_13_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G):-['$get_level'(H),'$equality_of_term'(D,B),'$cut'(H),'$unify'(F,black(A,B,E,C)),'$unify'(G,done)]
        a8 = V(m);
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(4),a(2))
        a4 = a4.dref();
        a2 = a2.dref();
        if (! a4.equalsTerm(a2)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(8))
        a8 = a8.dref();
                  m.cut( a8.intValue());
        //END inline expansion
        Term[] y1 = VA(a1, a2, a5, a3);
        a9 = S("black", y1);
        //START inline expansion of $unify(a(6),a(9))
        if (! a6.unify(a9, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(7),@(ATOM_done))
        if (! a7.unify(ATOM_done, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_2(Prolog m) { 
    // '$dummy_13_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G):-fail
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
    // '$dummy_13_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: rb_insert_new/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_insert_new_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_insert_new(t(A,B),C,D,t(A,E)):-insert_new(B,C,D,A,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // rb_insert_new(t(A,B),C,D,t(A,E)):-[insert_new(B,C,D,A,E)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("t", a5, a6), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a7 = V(m);
            if (!a4.unify(C("t", a5, a7), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_insert_new_5_static_exec, VA(a6, a2, a3, a5, a7), cont);
    }
/** PREDICATE: insert_new/5
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5;




    public static Operation PRED_insert_new_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // insert_new(A,B,C,D,E):-insert_new_2(A,B,C,D,F,G),fix_root(F,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // insert_new(A,B,C,D,E):-[insert_new_2(A,B,C,D,F,G),fix_root(F,E)]
        a6 = V(m);
        return Op(FILE_rbtrees::PRED_insert_new_2_6_static_exec, VA(a1, a2, a3, a4, a6, V(m)), Op(FILE_rbtrees::PRED_fix_root_2_static_exec, VA(a6, a5), cont));
    }
/** PREDICATE: insert_new_2/6
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6;




    public static Operation PRED_insert_new_2_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return insert_new_2_6_top(m);
    }

    private final static Operation insert_new_2_6_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::insert_new_2_6_var, fail_0, fail_0, fail_0, FILE_rbtrees::insert_new_2_6_var, fail_0); 
    }

    private final static Operation insert_new_2_6_var(Prolog m) { 
        m.jtry6(null, FILE_rbtrees::insert_new_2_6_var_1);
        return insert_new_2_6_1(m);
    }

    private final static Operation insert_new_2_6_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::insert_new_2_6_var_2);
        return insert_new_2_6_2(m);
    }

    private final static Operation insert_new_2_6_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::insert_new_2_6_var_3);
        return insert_new_2_6_3(m);
    }

    private final static Operation insert_new_2_6_var_3(Prolog m) { 
        m.retry(null, FILE_rbtrees::insert_new_2_6_var_4);
        return insert_new_2_6_4(m);
    }

    private final static Operation insert_new_2_6_var_4(Prolog m) { 
        m.retry(null, FILE_rbtrees::insert_new_2_6_var_5);
        return insert_new_2_6_5(m);
    }

    private final static Operation insert_new_2_6_var_5(Prolog m) { 
        m.retry(null, FILE_rbtrees::insert_new_2_6_var_6);
        return insert_new_2_6_6(m);
    }

    private final static Operation insert_new_2_6_var_6(Prolog m) { 
        m.trust(null);
        return insert_new_2_6_7(m);
    }

    private final static Operation insert_new_2_6_1(Prolog m) { 
    // insert_new_2(black('',A,B,''),C,D,E,F,G):-!,F=red(E,C,D,E),G=not_done
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert_new_2(black('',A,B,''),C,D,E,F,G):-['$neck_cut','$unify'(F,red(E,C,D,E)),'$unify'(G,not_done)]
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        Term[] y1 = VA(a4, a2, a3, a4);
        a7 = S("red", y1);
        //START inline expansion of $unify(a(5),a(7))
        if (! a5.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(6),@(ATOM_not_done))
        if (! a6.unify(ATOM_not_done, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation insert_new_2_6_2(Prolog m) { 
    // insert_new_2(red(A,B,C,D),E,F,G,H,I):-'$dummy_14_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert_new_2(red(A,B,C,D),E,F,G,H,I):-['$dummy_14_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("red", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_$dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec, VA(a7, a8, a9, a10, a2, a3, a4, a5, a6, V(m)), cont);
    }

    private final static Operation insert_new_2_6_3(Prolog m) { 
    // insert_new_2(red(A,B,C,D),E,F,G,H,I):-'$dummy_15_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert_new_2(red(A,B,C,D),E,F,G,H,I):-['$dummy_15_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,E)]
        a1 = a1.dref();
            a7 = V(m);
            if (!a1.unify(C("red", V(m), a7, V(m), V(m)), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_$dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec, VA(a7, a2), cont);
    }

    private final static Operation insert_new_2_6_4(Prolog m) { 
    // insert_new_2(red(A,B,C,D),E,F,G,H,I):-H=red(A,B,C,J),insert_new_2(D,E,F,G,J,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert_new_2(red(A,B,C,D),E,F,G,H,I):-['$unify'(H,red(A,B,C,J)),insert_new_2(D,E,F,G,J,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("red", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a11 = V(m);
        Term[] y1 = VA(a7, a8, a9, a11);
        a12 = S("red", y1);
        //START inline expansion of $unify(a(5),a(12))
        if (! a5.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a10;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a11;
        m.AREGS[5] = a6;
m.cont = cont;
        return insert_new_2_6_top(m);
    }

    private final static Operation insert_new_2_6_5(Prolog m) { 
    // insert_new_2(black(A,B,C,D),E,F,G,H,I):-'$dummy_16_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert_new_2(black(A,B,C,D),E,F,G,H,I):-['$dummy_16_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("black", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_$dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec, VA(a7, a8, a9, a10, a2, a3, a4, a5, a6, V(m), V(m)), cont);
    }

    private final static Operation insert_new_2_6_6(Prolog m) { 
    // insert_new_2(black(A,B,C,D),E,F,G,H,I):-'$dummy_17_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert_new_2(black(A,B,C,D),E,F,G,H,I):-['$dummy_17_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,E)]
        a1 = a1.dref();
            a7 = V(m);
            if (!a1.unify(C("black", V(m), a7, V(m), V(m)), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_$dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec, VA(a7, a2), cont);
    }

    private final static Operation insert_new_2_6_7(Prolog m) { 
    // insert_new_2(black(A,B,C,D),E,F,G,H,I):-insert_new_2(D,E,F,G,J,K),fix_right(K,black(A,B,C,J),H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // insert_new_2(black(A,B,C,D),E,F,G,H,I):-[insert_new_2(D,E,F,G,J,K),fix_right(K,black(A,B,C,J),H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("black", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a11 = V(m);
        a12 = V(m);
        Term[] y1 = VA(a7, a8, a9, a11);
        a13 = S("black", y1);
        p1 = Op(FILE_rbtrees::PRED_fix_right_4_static_exec, VA(a12, a13, a5, a6), cont);
        m.AREGS[0] = a10;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a11;
        m.AREGS[5] = a12;
        m.cont = p1;
        return insert_new_2_6_top(m);
    }
/** PREDICATE: $dummy_14_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/10
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10;




    public static Operation PRED_$dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(10, null, FILE_rbtrees::$dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_sub_1);
        return $dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_1(m);
    }

    private final static Operation $dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_2(m);
    }

    private final static Operation $dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_1(Prolog m) { 
    // '$dummy_14_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-E@<B,!,H=red(J,B,C,D),insert_new_2(A,E,F,G,J,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // '$dummy_14_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-['$get_level'(K),'$before'(E,B),'$cut'(K),'$unify'(H,red(J,B,C,D)),insert_new_2(A,E,F,G,J,I)]
        a11 = V(m);
        //START inline expansion of $get_level(a(11))
        if (! a11.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $before(a(5),a(2))
        a5 = a5.dref();
        a2 = a2.dref();
        if (a5.compareTo(a2) >= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(11))
        a11 = a11.dref();
                  m.cut( a11.intValue());
        //END inline expansion
        Term[] y1 = VA(a10, a2, a3, a4);
        a12 = S("red", y1);
        //START inline expansion of $unify(a(8),a(12))
        if (! a8.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_insert_new_2_6_static_exec, VA(a1, a5, a6, a7, a10, a9), cont);
    }

    private final static Operation $dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_2(Prolog m) { 
    // '$dummy_14_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // '$dummy_14_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_15_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_$dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_rbtrees::$dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_sub_1);
        return $dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_1(m);
    }

    private final static Operation $dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_2(m);
    }

    private final static Operation $dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_1(Prolog m) { 
    // '$dummy_15_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-B==A,!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_15_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-['$get_level'(C),'$equality_of_term'(B,A),'$cut'(C),fail]
        a3 = V(m);
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(2),a(1))
        a2 = a2.dref();
        a1 = a1.dref();
        if (! a2.equalsTerm(a1)) {
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

    private final static Operation $dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_2(Prolog m) { 
    // '$dummy_15_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_15_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_16_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/11
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;




    public static Operation PRED_$dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(11, null, FILE_rbtrees::$dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_1);
        return $dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_1(m);
    }

    private final static Operation $dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_2(m);
    }

    private final static Operation $dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_1(Prolog m) { 
    // '$dummy_16_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-E@<B,!,insert_new_2(A,E,F,G,J,K),fix_left(K,black(J,B,C,D),H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // '$dummy_16_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-['$get_level'(L),'$before'(E,B),'$cut'(L),insert_new_2(A,E,F,G,J,K),fix_left(K,black(J,B,C,D),H,I)]
        a12 = V(m);
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $before(a(5),a(2))
        a5 = a5.dref();
        a2 = a2.dref();
        if (a5.compareTo(a2) >= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(12))
        a12 = a12.dref();
                  m.cut( a12.intValue());
        //END inline expansion
        Term[] y1 = VA(a10, a2, a3, a4);
        a13 = S("black", y1);
        return Op(FILE_rbtrees::PRED_insert_new_2_6_static_exec, VA(a1, a5, a6, a7, a10, a11), Op(FILE_rbtrees::PRED_fix_left_4_static_exec, VA(a11, a13, a8, a9), cont));
    }

    private final static Operation $dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_2(Prolog m) { 
    // '$dummy_16_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // '$dummy_16_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_17_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_$dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_rbtrees::$dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_sub_1);
        return $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_1(m);
    }

    private final static Operation $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_2(m);
    }

    private final static Operation $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_1(Prolog m) { 
    // '$dummy_17_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-B==A,!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_17_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-['$get_level'(C),'$equality_of_term'(B,A),'$cut'(C),fail]
        a3 = V(m);
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(2),a(1))
        a2 = a2.dref();
        a1 = a1.dref();
        if (! a2.equalsTerm(a1)) {
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

    private final static Operation $dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_2(Prolog m) { 
    // '$dummy_17_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_17_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: fix_root/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_fix_root_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::fix_root_2_var, fail_0, fail_0, fail_0, FILE_rbtrees::fix_root_2_var, fail_0); 
    }

    private final static Operation fix_root_2_var(Prolog m) { 
        m.jtry2(null, FILE_rbtrees::fix_root_2_var_1);
        return fix_root_2_1(m);
    }

    private final static Operation fix_root_2_var_1(Prolog m) { 
        m.trust(null);
        return fix_root_2_2(m);
    }

    private final static Operation fix_root_2_1(Prolog m) { 
    // fix_root(black(A,B,C,D),black(A,B,C,D)):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // fix_root(black(A,B,C,D),black(A,B,C,D)):-[]
        a1 = a1.dref();
            a3 = V(m);
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("black", a3, a4, a5, a6), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unify(C("black", a3, a4, a5, a6), m.trail)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation fix_root_2_2(Prolog m) { 
    // fix_root(red(A,B,C,D),black(A,B,C,D)):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // fix_root(red(A,B,C,D),black(A,B,C,D)):-[]
        a1 = a1.dref();
            a3 = V(m);
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("red", a3, a4, a5, a6), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unify(C("black", a3, a4, a5, a6), m.trail)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: fix_left/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_fix_left_4_s1 = SYM("done");




    public static Operation PRED_fix_left_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::fix_left_4_var, fail_0, fail_0, FILE_rbtrees::fix_left_4_var, fail_0, fail_0); 
    }

    private final static Operation fix_left_4_var(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::fix_left_4_var_1);
        return fix_left_4_1(m);
    }

    private final static Operation fix_left_4_var_1(Prolog m) { 
        m.trust(null);
        return fix_left_4_2(m);
    }

    private final static Operation fix_left_4_1(Prolog m) { 
    // fix_left(done,A,A,done):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // fix_left(done,A,A,done):-['$neck_cut']
        if (! PRED_fix_left_4_s1.unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! PRED_fix_left_4_s1.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fix_left_4_2(Prolog m) { 
    // fix_left(not_done,A,B,C):-fix_left(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // fix_left(not_done,A,B,C):-[fix_left(A,B,C)]
        if (!  ATOM_not_done .unify(a1, m.trail))
            return m.fail();
        return Op(FILE_rbtrees::PRED_fix_left_3_static_exec, VA(a2, a3, a4), cont);
    }
/** PREDICATE: fix_left/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_fix_left_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::fix_left_3_var, FILE_rbtrees::fix_left_3_5, FILE_rbtrees::fix_left_3_5, FILE_rbtrees::fix_left_3_5, FILE_rbtrees::fix_left_3_var, FILE_rbtrees::fix_left_3_5); 
    }

    private final static Operation fix_left_3_var(Prolog m) { 
        m.jtry3(null, FILE_rbtrees::fix_left_3_var_1);
        return fix_left_3_1(m);
    }

    private final static Operation fix_left_3_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::fix_left_3_var_2);
        return fix_left_3_2(m);
    }

    private final static Operation fix_left_3_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::fix_left_3_var_3);
        return fix_left_3_3(m);
    }

    private final static Operation fix_left_3_var_3(Prolog m) { 
        m.retry(null, FILE_rbtrees::fix_left_3_var_4);
        return fix_left_3_4(m);
    }

    private final static Operation fix_left_3_var_4(Prolog m) { 
        m.trust(null);
        return fix_left_3_5(m);
    }

    private final static Operation fix_left_3_1(Prolog m) { 
    // fix_left(black(red(A,B,C,red(D,E,F,G)),H,I,red(J,K,L,M)),red(black(A,B,C,red(D,E,F,G)),H,I,black(J,K,L,M)),not_done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fix_left(black(red(A,B,C,red(D,E,F,G)),H,I,red(J,K,L,M)),red(black(A,B,C,red(D,E,F,G)),H,I,black(J,K,L,M)),not_done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("red", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a11 = a11.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a11.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a7.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a20 = V(m);
            a21 = V(m);
            if (!a2.unify(C("red", a20, a5, a6, a21), m.trail)){
                return m.fail();
            }
        a20 = a20.dref();
            a22 = V(m);
            if (!a20.unify(C("black", a8, a9, a10, a22), m.trail)){
                return m.fail();
            }
        a22 = a22.dref();
            if (!a22.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a21 = a21.dref();
            if (!a21.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        if (!  ATOM_not_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fix_left_3_2(Prolog m) { 
    // fix_left(black(red(red(A,B,C,D),E,F,G),H,I,red(J,K,L,M)),red(black(red(A,B,C,D),E,F,G),H,I,black(J,K,L,M)),not_done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fix_left(black(red(red(A,B,C,D),E,F,G),H,I,red(J,K,L,M)),red(black(red(A,B,C,D),E,F,G),H,I,black(J,K,L,M)),not_done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("red", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a8 = a8.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a8.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a7.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a20 = V(m);
            a21 = V(m);
            if (!a2.unify(C("red", a20, a5, a6, a21), m.trail)){
                return m.fail();
            }
        a20 = a20.dref();
            a22 = V(m);
            if (!a20.unify(C("black", a22, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a22 = a22.dref();
            if (!a22.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a21 = a21.dref();
            if (!a21.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        if (!  ATOM_not_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fix_left_3_3(Prolog m) { 
    // fix_left(black(red(A,B,C,red(D,E,F,G)),H,I,J),black(red(A,B,C,D),E,F,red(G,H,I,J)),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fix_left(black(red(A,B,C,red(D,E,F,G)),H,I,J),black(red(A,B,C,D),E,F,red(G,H,I,J)),done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("red", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a11 = a11.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a11.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a16 = V(m);
            a17 = V(m);
            if (!a2.unify(C("black", a16, a13, a14, a17), m.trail)){
                return m.fail();
            }
        a16 = a16.dref();
            if (!a16.unify(C("red", a8, a9, a10, a12), m.trail)){
                return m.fail();
            }
        a17 = a17.dref();
            if (!a17.unify(C("red", a15, a5, a6, a7), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fix_left_3_4(Prolog m) { 
    // fix_left(black(red(red(A,B,C,D),E,F,G),H,I,J),black(red(A,B,C,D),E,F,red(G,H,I,J)),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fix_left(black(red(red(A,B,C,D),E,F,G),H,I,J),black(red(A,B,C,D),E,F,red(G,H,I,J)),done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("red", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a8 = a8.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a8.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a16 = V(m);
            a17 = V(m);
            if (!a2.unify(C("black", a16, a9, a10, a17), m.trail)){
                return m.fail();
            }
        a16 = a16.dref();
            if (!a16.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a17 = a17.dref();
            if (!a17.unify(C("red", a11, a5, a6, a7), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fix_left_3_5(Prolog m) { 
    // fix_left(A,A,done):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fix_left(A,A,done):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: fix_right/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_fix_right_4_s1 = SYM("done");




    public static Operation PRED_fix_right_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::fix_right_4_var, fail_0, fail_0, FILE_rbtrees::fix_right_4_var, fail_0, fail_0); 
    }

    private final static Operation fix_right_4_var(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::fix_right_4_var_1);
        return fix_right_4_1(m);
    }

    private final static Operation fix_right_4_var_1(Prolog m) { 
        m.trust(null);
        return fix_right_4_2(m);
    }

    private final static Operation fix_right_4_1(Prolog m) { 
    // fix_right(done,A,A,done):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // fix_right(done,A,A,done):-['$neck_cut']
        if (! PRED_fix_right_4_s1.unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! PRED_fix_right_4_s1.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fix_right_4_2(Prolog m) { 
    // fix_right(not_done,A,B,C):-fix_right(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // fix_right(not_done,A,B,C):-[fix_right(A,B,C)]
        if (!  ATOM_not_done .unify(a1, m.trail))
            return m.fail();
        return Op(FILE_rbtrees::PRED_fix_right_3_static_exec, VA(a2, a3, a4), cont);
    }
/** PREDICATE: fix_right/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_fix_right_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::fix_right_3_var, FILE_rbtrees::fix_right_3_5, FILE_rbtrees::fix_right_3_5, FILE_rbtrees::fix_right_3_5, FILE_rbtrees::fix_right_3_var, FILE_rbtrees::fix_right_3_5); 
    }

    private final static Operation fix_right_3_var(Prolog m) { 
        m.jtry3(null, FILE_rbtrees::fix_right_3_var_1);
        return fix_right_3_1(m);
    }

    private final static Operation fix_right_3_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::fix_right_3_var_2);
        return fix_right_3_2(m);
    }

    private final static Operation fix_right_3_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::fix_right_3_var_3);
        return fix_right_3_3(m);
    }

    private final static Operation fix_right_3_var_3(Prolog m) { 
        m.retry(null, FILE_rbtrees::fix_right_3_var_4);
        return fix_right_3_4(m);
    }

    private final static Operation fix_right_3_var_4(Prolog m) { 
        m.trust(null);
        return fix_right_3_5(m);
    }

    private final static Operation fix_right_3_1(Prolog m) { 
    // fix_right(black(red(A,B,C,D),E,F,red(red(G,H,I,J),K,L,M)),red(black(A,B,C,D),E,F,black(red(G,H,I,J),K,L,M)),not_done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fix_right(black(red(A,B,C,D),E,F,red(red(G,H,I,J),K,L,M)),red(black(A,B,C,D),E,F,black(red(G,H,I,J),K,L,M)),not_done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("red", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a7.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a12 = a12.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a12.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a20 = V(m);
            a21 = V(m);
            if (!a2.unify(C("red", a20, a5, a6, a21), m.trail)){
                return m.fail();
            }
        a20 = a20.dref();
            if (!a20.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a21 = a21.dref();
            a22 = V(m);
            if (!a21.unify(C("black", a22, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a22 = a22.dref();
            if (!a22.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        if (!  ATOM_not_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fix_right_3_2(Prolog m) { 
    // fix_right(black(red(A,B,C,D),E,F,red(G,H,I,red(J,K,L,M))),red(black(A,B,C,D),E,F,black(G,H,I,red(J,K,L,M))),not_done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fix_right(black(red(A,B,C,D),E,F,red(G,H,I,red(J,K,L,M))),red(black(A,B,C,D),E,F,black(G,H,I,red(J,K,L,M))),not_done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("red", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a7.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a15 = a15.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a15.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a20 = V(m);
            a21 = V(m);
            if (!a2.unify(C("red", a20, a5, a6, a21), m.trail)){
                return m.fail();
            }
        a20 = a20.dref();
            if (!a20.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a21 = a21.dref();
            a22 = V(m);
            if (!a21.unify(C("black", a12, a13, a14, a22), m.trail)){
                return m.fail();
            }
        a22 = a22.dref();
            if (!a22.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        if (!  ATOM_not_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fix_right_3_3(Prolog m) { 
    // fix_right(black(A,B,C,red(red(D,E,F,G),H,I,J)),black(red(A,B,C,D),E,F,red(G,H,I,J)),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fix_right(black(A,B,C,red(red(D,E,F,G),H,I,J)),black(red(A,B,C,D),E,F,red(G,H,I,J)),done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a7.unify(C("red", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a8 = a8.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a8.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a16 = V(m);
            a17 = V(m);
            if (!a2.unify(C("black", a16, a13, a14, a17), m.trail)){
                return m.fail();
            }
        a16 = a16.dref();
            if (!a16.unify(C("red", a4, a5, a6, a12), m.trail)){
                return m.fail();
            }
        a17 = a17.dref();
            if (!a17.unify(C("red", a15, a9, a10, a11), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fix_right_3_4(Prolog m) { 
    // fix_right(black(A,B,C,red(D,E,F,red(G,H,I,J))),black(red(A,B,C,D),E,F,red(G,H,I,J)),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fix_right(black(A,B,C,red(D,E,F,red(G,H,I,J))),black(red(A,B,C,D),E,F,red(G,H,I,J)),done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a7.unify(C("red", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a11 = a11.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a11.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a16 = V(m);
            a17 = V(m);
            if (!a2.unify(C("black", a16, a9, a10, a17), m.trail)){
                return m.fail();
            }
        a16 = a16.dref();
            if (!a16.unify(C("red", a4, a5, a6, a8), m.trail)){
                return m.fail();
            }
        a17 = a17.dref();
            if (!a17.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fix_right_3_5(Prolog m) { 
    // fix_right(A,A,done):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fix_right(A,A,done):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: rb_delete/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_delete_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_delete(t(A,B),C,t(A,D)):-delete(B,C,E,D,F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // rb_delete(t(A,B),C,t(A,D)):-[delete(B,C,E,D,F)]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            if (!a1.unify(C("t", a4, a5), m.trail)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = V(m);
            if (!a3.unify(C("t", a4, a6), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_delete_5_static_exec, VA(a5, a2, V(m), a6, V(m)), cont);
    }
/** PREDICATE: rb_delete/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_delete_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_delete(t(A,B),C,D,t(A,E)):-delete(B,C,F,E,G),D=F
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // rb_delete(t(A,B),C,D,t(A,E)):-[delete(B,C,F,E,G),'$unify'(D,F)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("t", a5, a6), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a7 = V(m);
            if (!a4.unify(C("t", a5, a7), m.trail)){
                return m.fail();
            }
        a8 = V(m);
        return Op(FILE_rbtrees::PRED_delete_5_static_exec, VA(a6, a2, a8, a7, V(m)), Op(FILE_rbtrees::PRED_$unify_2_static_exec, VA(a3, a8), cont));
    }
/** PREDICATE: delete/5
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5;




    public static Operation PRED_delete_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return delete_5_top(m);
    }

    private final static Operation delete_5_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::delete_5_var, fail_0, fail_0, fail_0, FILE_rbtrees::delete_5_var, fail_0); 
    }

    private final static Operation delete_5_var(Prolog m) { 
        m.jtry5(null, FILE_rbtrees::delete_5_var_1);
        return delete_5_1(m);
    }

    private final static Operation delete_5_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_5_var_2);
        return delete_5_2(m);
    }

    private final static Operation delete_5_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_5_var_3);
        return delete_5_3(m);
    }

    private final static Operation delete_5_var_3(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_5_var_4);
        return delete_5_4(m);
    }

    private final static Operation delete_5_var_4(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_5_var_5);
        return delete_5_5(m);
    }

    private final static Operation delete_5_var_5(Prolog m) { 
        m.trust(null);
        return delete_5_6(m);
    }

    private final static Operation delete_5_1(Prolog m) { 
    // delete(red(A,B,C,D),E,F,G,H):-E@<B,!,delete(A,E,F,I,J),fixup_left(J,red(I,B,C,D),G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // delete(red(A,B,C,D),E,F,G,H):-['$get_level'(I),'$before'(E,B),'$cut'(I),delete(A,E,F,J,K),fixup_left(K,red(J,B,C,D),G,H)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("red", a6, a7, a8, a9), m.trail)){
                return m.fail();
            }
        a10 = V(m);
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $before(a(2),a(7))
        a2 = a2.dref();
        a7 = a7.dref();
        if (a2.compareTo(a7) >= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(10))
        a10 = a10.dref();
                  m.cut( a10.intValue());
        //END inline expansion
        a11 = V(m);
        a12 = V(m);
        Term[] y1 = VA(a11, a7, a8, a9);
        a13 = S("red", y1);
        p1 = Op(FILE_rbtrees::PRED_fixup_left_4_static_exec, VA(a12, a13, a4, a5), cont);
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a11;
        m.AREGS[4] = a12;
        m.cont = p1;
        return delete_5_top(m);
    }

    private final static Operation delete_5_2(Prolog m) { 
    // delete(red(A,B,C,D),E,F,G,H):-E@>B,!,delete(D,E,F,I,J),fixup_right(J,red(A,B,C,I),G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // delete(red(A,B,C,D),E,F,G,H):-['$get_level'(I),'$after'(E,B),'$cut'(I),delete(D,E,F,J,K),fixup_right(K,red(A,B,C,J),G,H)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("red", a6, a7, a8, a9), m.trail)){
                return m.fail();
            }
        a10 = V(m);
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $after(a(2),a(7))
        a2 = a2.dref();
        a7 = a7.dref();
        if (a2.compareTo(a7) <= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(10))
        a10 = a10.dref();
                  m.cut( a10.intValue());
        //END inline expansion
        a11 = V(m);
        a12 = V(m);
        Term[] y1 = VA(a6, a7, a8, a11);
        a13 = S("red", y1);
        p1 = Op(FILE_rbtrees::PRED_fixup_right_4_static_exec, VA(a12, a13, a4, a5), cont);
        m.AREGS[0] = a9;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a11;
        m.AREGS[4] = a12;
        m.cont = p1;
        return delete_5_top(m);
    }

    private final static Operation delete_5_3(Prolog m) { 
    // delete(red(A,B,C,D),E,C,F,G):-delete_red_node(A,D,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // delete(red(A,B,C,D),E,C,F,G):-[delete_red_node(A,D,F,G)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a1.unify(C("red", a6, V(m), a7, a8), m.trail)){
                return m.fail();
            }
        if (! a7.unify(a3, m.trail))
            return m.fail();
        return Op(FILE_rbtrees::PRED_delete_red_node_4_static_exec, VA(a6, a8, a4, a5), cont);
    }

    private final static Operation delete_5_4(Prolog m) { 
    // delete(black(A,B,C,D),E,F,G,H):-E@<B,!,delete(A,E,F,I,J),fixup_left(J,black(I,B,C,D),G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // delete(black(A,B,C,D),E,F,G,H):-['$get_level'(I),'$before'(E,B),'$cut'(I),delete(A,E,F,J,K),fixup_left(K,black(J,B,C,D),G,H)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("black", a6, a7, a8, a9), m.trail)){
                return m.fail();
            }
        a10 = V(m);
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $before(a(2),a(7))
        a2 = a2.dref();
        a7 = a7.dref();
        if (a2.compareTo(a7) >= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(10))
        a10 = a10.dref();
                  m.cut( a10.intValue());
        //END inline expansion
        a11 = V(m);
        a12 = V(m);
        Term[] y1 = VA(a11, a7, a8, a9);
        a13 = S("black", y1);
        p1 = Op(FILE_rbtrees::PRED_fixup_left_4_static_exec, VA(a12, a13, a4, a5), cont);
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a11;
        m.AREGS[4] = a12;
        m.cont = p1;
        return delete_5_top(m);
    }

    private final static Operation delete_5_5(Prolog m) { 
    // delete(black(A,B,C,D),E,F,G,H):-E@>B,!,delete(D,E,F,I,J),fixup_right(J,black(A,B,C,I),G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // delete(black(A,B,C,D),E,F,G,H):-['$get_level'(I),'$after'(E,B),'$cut'(I),delete(D,E,F,J,K),fixup_right(K,black(A,B,C,J),G,H)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("black", a6, a7, a8, a9), m.trail)){
                return m.fail();
            }
        a10 = V(m);
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $after(a(2),a(7))
        a2 = a2.dref();
        a7 = a7.dref();
        if (a2.compareTo(a7) <= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(10))
        a10 = a10.dref();
                  m.cut( a10.intValue());
        //END inline expansion
        a11 = V(m);
        a12 = V(m);
        Term[] y1 = VA(a6, a7, a8, a11);
        a13 = S("black", y1);
        p1 = Op(FILE_rbtrees::PRED_fixup_right_4_static_exec, VA(a12, a13, a4, a5), cont);
        m.AREGS[0] = a9;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a11;
        m.AREGS[4] = a12;
        m.cont = p1;
        return delete_5_top(m);
    }

    private final static Operation delete_5_6(Prolog m) { 
    // delete(black(A,B,C,D),E,C,F,G):-delete_black_node(A,D,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // delete(black(A,B,C,D),E,C,F,G):-[delete_black_node(A,D,F,G)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a1.unify(C("black", a6, V(m), a7, a8), m.trail)){
                return m.fail();
            }
        if (! a7.unify(a3, m.trail))
            return m.fail();
        return Op(FILE_rbtrees::PRED_delete_black_node_4_static_exec, VA(a6, a8, a4, a5), cont);
    }
/** PREDICATE: rb_del_min/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_del_min_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_del_min(t(A,B),C,D,t(A,E)):-del_min(B,C,D,A,E,F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // rb_del_min(t(A,B),C,D,t(A,E)):-[del_min(B,C,D,A,E,F)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("t", a5, a6), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a7 = V(m);
            if (!a4.unify(C("t", a5, a7), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_del_min_6_static_exec, VA(a6, a2, a3, a5, a7, V(m)), cont);
    }
/** PREDICATE: del_min/6
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6;




    public static Operation PRED_del_min_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return del_min_6_top(m);
    }

    private final static Operation del_min_6_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::del_min_6_var, fail_0, fail_0, fail_0, FILE_rbtrees::del_min_6_var, fail_0); 
    }

    private final static Operation del_min_6_var(Prolog m) { 
        m.jtry6(null, FILE_rbtrees::del_min_6_var_1);
        return del_min_6_1(m);
    }

    private final static Operation del_min_6_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::del_min_6_var_2);
        return del_min_6_2(m);
    }

    private final static Operation del_min_6_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::del_min_6_var_3);
        return del_min_6_3(m);
    }

    private final static Operation del_min_6_var_3(Prolog m) { 
        m.trust(null);
        return del_min_6_4(m);
    }

    private final static Operation del_min_6_1(Prolog m) { 
    // del_min(red(black('',A,B,C),D,E,F),D,E,G,H,I):-!,delete_red_node(G,F,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // del_min(red(black('',A,B,C),D,E,F),D,E,G,H,I):-['$neck_cut',delete_red_node(G,F,H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("red", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unify(C("black",  ATOM_ , V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        if (! a8.unify(a2, m.trail))
            return m.fail();
        if (! a9.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return Op(FILE_rbtrees::PRED_delete_red_node_4_static_exec, VA(a4, a10, a5, a6), cont);
    }

    private final static Operation del_min_6_2(Prolog m) { 
    // del_min(red(A,B,C,D),E,F,G,H,I):-del_min(A,E,F,G,J,K),fixup_left(K,red(J,B,C,D),H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // del_min(red(A,B,C,D),E,F,G,H,I):-[del_min(A,E,F,G,J,K),fixup_left(K,red(J,B,C,D),H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("red", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a11 = V(m);
        a12 = V(m);
        Term[] y1 = VA(a11, a8, a9, a10);
        a13 = S("red", y1);
        p1 = Op(FILE_rbtrees::PRED_fixup_left_4_static_exec, VA(a12, a13, a5, a6), cont);
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a11;
        m.AREGS[5] = a12;
        m.cont = p1;
        return del_min_6_top(m);
    }

    private final static Operation del_min_6_3(Prolog m) { 
    // del_min(black(black('',A,B,C),D,E,F),D,E,G,H,I):-!,delete_black_node(G,F,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // del_min(black(black('',A,B,C),D,E,F),D,E,G,H,I):-['$neck_cut',delete_black_node(G,F,H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("black", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unify(C("black",  ATOM_ , V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        if (! a8.unify(a2, m.trail))
            return m.fail();
        if (! a9.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return Op(FILE_rbtrees::PRED_delete_black_node_4_static_exec, VA(a4, a10, a5, a6), cont);
    }

    private final static Operation del_min_6_4(Prolog m) { 
    // del_min(black(A,B,C,D),E,F,G,H,I):-del_min(A,E,F,G,J,K),fixup_left(K,black(J,B,C,D),H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // del_min(black(A,B,C,D),E,F,G,H,I):-[del_min(A,E,F,G,J,K),fixup_left(K,black(J,B,C,D),H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("black", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a11 = V(m);
        a12 = V(m);
        Term[] y1 = VA(a11, a8, a9, a10);
        a13 = S("black", y1);
        p1 = Op(FILE_rbtrees::PRED_fixup_left_4_static_exec, VA(a12, a13, a5, a6), cont);
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a11;
        m.AREGS[5] = a12;
        m.cont = p1;
        return del_min_6_top(m);
    }
/** PREDICATE: rb_del_max/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_del_max_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_del_max(t(A,B),C,D,t(A,E)):-del_max(B,C,D,A,E,F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // rb_del_max(t(A,B),C,D,t(A,E)):-[del_max(B,C,D,A,E,F)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("t", a5, a6), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a7 = V(m);
            if (!a4.unify(C("t", a5, a7), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_del_max_6_static_exec, VA(a6, a2, a3, a5, a7, V(m)), cont);
    }
/** PREDICATE: del_max/6
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6;




    public static Operation PRED_del_max_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return del_max_6_top(m);
    }

    private final static Operation del_max_6_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::del_max_6_var, fail_0, fail_0, fail_0, FILE_rbtrees::del_max_6_var, fail_0); 
    }

    private final static Operation del_max_6_var(Prolog m) { 
        m.jtry6(null, FILE_rbtrees::del_max_6_var_1);
        return del_max_6_1(m);
    }

    private final static Operation del_max_6_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::del_max_6_var_2);
        return del_max_6_2(m);
    }

    private final static Operation del_max_6_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::del_max_6_var_3);
        return del_max_6_3(m);
    }

    private final static Operation del_max_6_var_3(Prolog m) { 
        m.trust(null);
        return del_max_6_4(m);
    }

    private final static Operation del_max_6_1(Prolog m) { 
    // del_max(red(A,B,C,black('',D,E,F)),B,C,G,H,I):-!,delete_red_node(A,G,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // del_max(red(A,B,C,black('',D,E,F)),B,C,G,H,I):-['$neck_cut',delete_red_node(A,G,H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("red", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a10 = a10.dref();
            if (!a10.unify(C("black",  ATOM_ , V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        if (! a8.unify(a2, m.trail))
            return m.fail();
        if (! a9.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return Op(FILE_rbtrees::PRED_delete_red_node_4_static_exec, VA(a7, a4, a5, a6), cont);
    }

    private final static Operation del_max_6_2(Prolog m) { 
    // del_max(red(A,B,C,D),E,F,G,H,I):-del_max(D,E,F,G,J,K),fixup_right(K,red(A,B,C,J),H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // del_max(red(A,B,C,D),E,F,G,H,I):-[del_max(D,E,F,G,J,K),fixup_right(K,red(A,B,C,J),H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("red", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a11 = V(m);
        a12 = V(m);
        Term[] y1 = VA(a7, a8, a9, a11);
        a13 = S("red", y1);
        p1 = Op(FILE_rbtrees::PRED_fixup_right_4_static_exec, VA(a12, a13, a5, a6), cont);
        m.AREGS[0] = a10;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a11;
        m.AREGS[5] = a12;
        m.cont = p1;
        return del_max_6_top(m);
    }

    private final static Operation del_max_6_3(Prolog m) { 
    // del_max(black(A,B,C,black('',D,E,F)),B,C,G,H,I):-!,delete_black_node(A,G,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // del_max(black(A,B,C,black('',D,E,F)),B,C,G,H,I):-['$neck_cut',delete_black_node(A,G,H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("black", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a10 = a10.dref();
            if (!a10.unify(C("black",  ATOM_ , V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        if (! a8.unify(a2, m.trail))
            return m.fail();
        if (! a9.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return Op(FILE_rbtrees::PRED_delete_black_node_4_static_exec, VA(a7, a4, a5, a6), cont);
    }

    private final static Operation del_max_6_4(Prolog m) { 
    // del_max(black(A,B,C,D),E,F,G,H,I):-del_max(D,E,F,G,J,K),fixup_right(K,black(A,B,C,J),H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // del_max(black(A,B,C,D),E,F,G,H,I):-[del_max(D,E,F,G,J,K),fixup_right(K,black(A,B,C,J),H,I)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("black", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a11 = V(m);
        a12 = V(m);
        Term[] y1 = VA(a7, a8, a9, a11);
        a13 = S("black", y1);
        p1 = Op(FILE_rbtrees::PRED_fixup_right_4_static_exec, VA(a12, a13, a5, a6), cont);
        m.AREGS[0] = a10;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a11;
        m.AREGS[5] = a12;
        m.cont = p1;
        return del_max_6_top(m);
    }
/** PREDICATE: delete_red_node/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_delete_red_node_4_s1 = SYM("done");




    public static Operation PRED_delete_red_node_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::delete_red_node_4_var, FILE_rbtrees::delete_red_node_4_int, FILE_rbtrees::delete_red_node_4_int, FILE_rbtrees::delete_red_node_4_int, FILE_rbtrees::delete_red_node_4_var, FILE_rbtrees::delete_red_node_4_int); 
    }

    private final static Operation delete_red_node_4_var(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::delete_red_node_4_var_1);
        return delete_red_node_4_1(m);
    }

    private final static Operation delete_red_node_4_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_red_node_4_var_2);
        return delete_red_node_4_2(m);
    }

    private final static Operation delete_red_node_4_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_red_node_4_var_3);
        return delete_red_node_4_3(m);
    }

    private final static Operation delete_red_node_4_var_3(Prolog m) { 
        m.trust(null);
        return delete_red_node_4_4(m);
    }

    private final static Operation delete_red_node_4_int(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::delete_red_node_4_int_1);
        return delete_red_node_4_1(m);
    }

    private final static Operation delete_red_node_4_int_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_red_node_4_int_2);
        return delete_red_node_4_3(m);
    }

    private final static Operation delete_red_node_4_int_2(Prolog m) { 
        m.trust(null);
        return delete_red_node_4_4(m);
    }

    private final static Operation delete_red_node_4_1(Prolog m) { 
    // delete_red_node(A,B,A,done):-A==B,!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // delete_red_node(A,B,A,done):-['$get_level'(C),'$equality_of_term'(A,B),'$cut'(C)]
        if (! a1.unify(a3, m.trail))
            return m.fail();
        if (! PRED_delete_red_node_4_s1.unify(a4, m.trail))
            return m.fail();
        a5 = V(m);
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
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
        //START inline expansion of $cut(a(5))
        a5 = a5.dref();
                  m.cut( a5.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation delete_red_node_4_2(Prolog m) { 
    // delete_red_node(black('',A,B,''),C,C,done):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // delete_red_node(black('',A,B,''),C,C,done):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! PRED_delete_red_node_4_s1.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation delete_red_node_4_3(Prolog m) { 
    // delete_red_node(A,black('',B,C,''),A,done):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // delete_red_node(A,black('',B,C,''),A,done):-['$neck_cut']
        a2 = a2.dref();
            if (!a2.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        if (! a1.unify(a3, m.trail))
            return m.fail();
        if (! PRED_delete_red_node_4_s1.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation delete_red_node_4_4(Prolog m) { 
    // delete_red_node(A,B,C,D):-delete_next(B,E,F,G,H),fixup_right(H,red(A,E,F,G),C,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // delete_red_node(A,B,C,D):-[delete_next(B,E,F,G,H),fixup_right(H,red(A,E,F,G),C,D)]
        a5 = V(m);
        a6 = V(m);
        a7 = V(m);
        a8 = V(m);
        Term[] y1 = VA(a1, a5, a6, a7);
        a9 = S("red", y1);
        return Op(FILE_rbtrees::PRED_delete_next_5_static_exec, VA(a2, a5, a6, a7, a8), Op(FILE_rbtrees::PRED_fixup_right_4_static_exec, VA(a8, a9, a3, a4), cont));
    }
/** PREDICATE: delete_black_node/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_delete_black_node_4_s1 = SYM("not_done");




    public static Operation PRED_delete_black_node_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::delete_black_node_4_var, FILE_rbtrees::delete_black_node_4_int, FILE_rbtrees::delete_black_node_4_int, FILE_rbtrees::delete_black_node_4_int, FILE_rbtrees::delete_black_node_4_var, FILE_rbtrees::delete_black_node_4_int); 
    }

    private final static Operation delete_black_node_4_var(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::delete_black_node_4_var_1);
        return delete_black_node_4_1(m);
    }

    private final static Operation delete_black_node_4_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_black_node_4_var_2);
        return delete_black_node_4_2(m);
    }

    private final static Operation delete_black_node_4_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_black_node_4_var_3);
        return delete_black_node_4_3(m);
    }

    private final static Operation delete_black_node_4_var_3(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_black_node_4_var_4);
        return delete_black_node_4_4(m);
    }

    private final static Operation delete_black_node_4_var_4(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_black_node_4_var_5);
        return delete_black_node_4_5(m);
    }

    private final static Operation delete_black_node_4_var_5(Prolog m) { 
        m.trust(null);
        return delete_black_node_4_6(m);
    }

    private final static Operation delete_black_node_4_int(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::delete_black_node_4_int_1);
        return delete_black_node_4_1(m);
    }

    private final static Operation delete_black_node_4_int_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_black_node_4_int_2);
        return delete_black_node_4_5(m);
    }

    private final static Operation delete_black_node_4_int_2(Prolog m) { 
        m.trust(null);
        return delete_black_node_4_6(m);
    }

    private final static Operation delete_black_node_4_1(Prolog m) { 
    // delete_black_node(A,B,A,not_done):-A==B,!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // delete_black_node(A,B,A,not_done):-['$get_level'(C),'$equality_of_term'(A,B),'$cut'(C)]
        if (! a1.unify(a3, m.trail))
            return m.fail();
        if (! PRED_delete_black_node_4_s1.unify(a4, m.trail))
            return m.fail();
        a5 = V(m);
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
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
        //START inline expansion of $cut(a(5))
        a5 = a5.dref();
                  m.cut( a5.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation delete_black_node_4_2(Prolog m) { 
    // delete_black_node(black('',A,B,''),red(C,D,E,F),black(C,D,E,F),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // delete_black_node(black('',A,B,''),red(C,D,E,F),black(C,D,E,F),done):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a2.unify(C("red", a5, a6, a7, a8), m.trail)){
                return m.fail();
            }
        a3 = a3.dref();
            if (!a3.unify(C("black", a5, a6, a7, a8), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation delete_black_node_4_3(Prolog m) { 
    // delete_black_node(black('',A,B,''),C,C,not_done):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // delete_black_node(black('',A,B,''),C,C,not_done):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! PRED_delete_black_node_4_s1.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation delete_black_node_4_4(Prolog m) { 
    // delete_black_node(red(A,B,C,D),black('',E,F,''),black(A,B,C,D),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // delete_black_node(red(A,B,C,D),black('',E,F,''),black(A,B,C,D),done):-['$neck_cut']
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a1.unify(C("red", a5, a6, a7, a8), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        a3 = a3.dref();
            if (!a3.unify(C("black", a5, a6, a7, a8), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation delete_black_node_4_5(Prolog m) { 
    // delete_black_node(A,black('',B,C,''),A,not_done):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // delete_black_node(A,black('',B,C,''),A,not_done):-['$neck_cut']
        a2 = a2.dref();
            if (!a2.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        if (! a1.unify(a3, m.trail))
            return m.fail();
        if (! PRED_delete_black_node_4_s1.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation delete_black_node_4_6(Prolog m) { 
    // delete_black_node(A,B,C,D):-delete_next(B,E,F,G,H),fixup_right(H,black(A,E,F,G),C,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // delete_black_node(A,B,C,D):-[delete_next(B,E,F,G,H),fixup_right(H,black(A,E,F,G),C,D)]
        a5 = V(m);
        a6 = V(m);
        a7 = V(m);
        a8 = V(m);
        Term[] y1 = VA(a1, a5, a6, a7);
        a9 = S("black", y1);
        return Op(FILE_rbtrees::PRED_delete_next_5_static_exec, VA(a2, a5, a6, a7, a8), Op(FILE_rbtrees::PRED_fixup_right_4_static_exec, VA(a8, a9, a3, a4), cont));
    }
/** PREDICATE: delete_next/5
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5;




    public static Operation PRED_delete_next_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return delete_next_5_top(m);
    }

    private final static Operation delete_next_5_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::delete_next_5_var, fail_0, fail_0, fail_0, FILE_rbtrees::delete_next_5_var, fail_0); 
    }

    private final static Operation delete_next_5_var(Prolog m) { 
        m.jtry5(null, FILE_rbtrees::delete_next_5_var_1);
        return delete_next_5_1(m);
    }

    private final static Operation delete_next_5_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_next_5_var_2);
        return delete_next_5_2(m);
    }

    private final static Operation delete_next_5_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_next_5_var_3);
        return delete_next_5_3(m);
    }

    private final static Operation delete_next_5_var_3(Prolog m) { 
        m.retry(null, FILE_rbtrees::delete_next_5_var_4);
        return delete_next_5_4(m);
    }

    private final static Operation delete_next_5_var_4(Prolog m) { 
        m.trust(null);
        return delete_next_5_5(m);
    }

    private final static Operation delete_next_5_1(Prolog m) { 
    // delete_next(red(black('',A,B,''),C,D,E),C,D,E,done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // delete_next(red(black('',A,B,''),C,D,E),C,D,E,done):-['$neck_cut']
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("red", a6, a7, a8, a9), m.trail)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        if (! a7.unify(a2, m.trail))
            return m.fail();
        if (! a8.unify(a3, m.trail))
            return m.fail();
        if (! a9.unify(a4, m.trail))
            return m.fail();
        if (!  ATOM_done .unify(a5, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation delete_next_5_2(Prolog m) { 
    // delete_next(black(black('',A,B,''),C,D,red(E,F,G,H)),C,D,black(E,F,G,H),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // delete_next(black(black('',A,B,''),C,D,red(E,F,G,H)),C,D,black(E,F,G,H),done):-['$neck_cut']
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("black", a6, a7, a8, a9), m.trail)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        a9 = a9.dref();
            a10 = V(m);
            a11 = V(m);
            a12 = V(m);
            a13 = V(m);
            if (!a9.unify(C("red", a10, a11, a12, a13), m.trail)){
                return m.fail();
            }
        if (! a7.unify(a2, m.trail))
            return m.fail();
        if (! a8.unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
            if (!a4.unify(C("black", a10, a11, a12, a13), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a5, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation delete_next_5_3(Prolog m) { 
    // delete_next(black(black('',A,B,''),C,D,E),C,D,E,not_done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // delete_next(black(black('',A,B,''),C,D,E),C,D,E,not_done):-['$neck_cut']
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("black", a6, a7, a8, a9), m.trail)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        if (! a7.unify(a2, m.trail))
            return m.fail();
        if (! a8.unify(a3, m.trail))
            return m.fail();
        if (! a9.unify(a4, m.trail))
            return m.fail();
        if (!  ATOM_not_done .unify(a5, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation delete_next_5_4(Prolog m) { 
    // delete_next(red(A,B,C,D),E,F,G,H):-delete_next(A,E,F,I,J),fixup_left(J,red(I,B,C,D),G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // delete_next(red(A,B,C,D),E,F,G,H):-[delete_next(A,E,F,I,J),fixup_left(J,red(I,B,C,D),G,H)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("red", a6, a7, a8, a9), m.trail)){
                return m.fail();
            }
        a10 = V(m);
        a11 = V(m);
        Term[] y1 = VA(a10, a7, a8, a9);
        a12 = S("red", y1);
        p1 = Op(FILE_rbtrees::PRED_fixup_left_4_static_exec, VA(a11, a12, a4, a5), cont);
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a10;
        m.AREGS[4] = a11;
        m.cont = p1;
        return delete_next_5_top(m);
    }

    private final static Operation delete_next_5_5(Prolog m) { 
    // delete_next(black(A,B,C,D),E,F,G,H):-delete_next(A,E,F,I,J),fixup_left(J,black(I,B,C,D),G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // delete_next(black(A,B,C,D),E,F,G,H):-[delete_next(A,E,F,I,J),fixup_left(J,black(I,B,C,D),G,H)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            if (!a1.unify(C("black", a6, a7, a8, a9), m.trail)){
                return m.fail();
            }
        a10 = V(m);
        a11 = V(m);
        Term[] y1 = VA(a10, a7, a8, a9);
        a12 = S("black", y1);
        p1 = Op(FILE_rbtrees::PRED_fixup_left_4_static_exec, VA(a11, a12, a4, a5), cont);
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a10;
        m.AREGS[4] = a11;
        m.cont = p1;
        return delete_next_5_top(m);
    }
/** PREDICATE: fixup_left/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_fixup_left_4_s1 = SYM("done");




    public static Operation PRED_fixup_left_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::fixup_left_4_var, fail_0, fail_0, FILE_rbtrees::fixup_left_4_var, fail_0, fail_0); 
    }

    private final static Operation fixup_left_4_var(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::fixup_left_4_var_1);
        return fixup_left_4_1(m);
    }

    private final static Operation fixup_left_4_var_1(Prolog m) { 
        m.trust(null);
        return fixup_left_4_2(m);
    }

    private final static Operation fixup_left_4_1(Prolog m) { 
    // fixup_left(done,A,A,done):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // fixup_left(done,A,A,done):-[]
        if (! PRED_fixup_left_4_s1.unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! PRED_fixup_left_4_s1.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation fixup_left_4_2(Prolog m) { 
    // fixup_left(not_done,A,B,C):-fixup2(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // fixup_left(not_done,A,B,C):-[fixup2(A,B,C)]
        if (!  ATOM_not_done .unify(a1, m.trail))
            return m.fail();
        return Op(FILE_rbtrees::PRED_fixup2_3_static_exec, VA(a2, a3, a4), cont);
    }
/** PREDICATE: fixup2/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_fixup2_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return fixup2_3_top(m);
    }

    private final static Operation fixup2_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::fixup2_3_var, fail_0, fail_0, fail_0, FILE_rbtrees::fixup2_3_var, fail_0); 
    }

    private final static Operation fixup2_3_var(Prolog m) { 
        m.jtry3(null, FILE_rbtrees::fixup2_3_var_1);
        return fixup2_3_1(m);
    }

    private final static Operation fixup2_3_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::fixup2_3_var_2);
        return fixup2_3_2(m);
    }

    private final static Operation fixup2_3_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::fixup2_3_var_3);
        return fixup2_3_3(m);
    }

    private final static Operation fixup2_3_var_3(Prolog m) { 
        m.retry(null, FILE_rbtrees::fixup2_3_var_4);
        return fixup2_3_4(m);
    }

    private final static Operation fixup2_3_var_4(Prolog m) { 
        m.retry(null, FILE_rbtrees::fixup2_3_var_5);
        return fixup2_3_5(m);
    }

    private final static Operation fixup2_3_var_5(Prolog m) { 
        m.retry(null, FILE_rbtrees::fixup2_3_var_6);
        return fixup2_3_6(m);
    }

    private final static Operation fixup2_3_var_6(Prolog m) { 
        m.trust(null);
        return fixup2_3_7(m);
    }

    private final static Operation fixup2_3_1(Prolog m) { 
    // fixup2(black(black(A,B,C,D),E,F,red(black(G,H,I,J),K,L,black(M,N,O,P))),black(Q,K,L,black(M,N,O,P)),done):-!,fixup2(red(black(A,B,C,D),E,F,black(G,H,I,J)),Q,R)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup2(black(black(A,B,C,D),E,F,red(black(G,H,I,J),K,L,black(M,N,O,P))),black(Q,K,L,black(M,N,O,P)),done):-['$neck_cut',fixup2(red(black(A,B,C,D),E,F,black(G,H,I,J)),Q,R)]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a7.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a12 = a12.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a12.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a15 = a15.dref();
            a20 = V(m);
            a21 = V(m);
            a22 = V(m);
            a23 = V(m);
            if (!a15.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a24 = V(m);
            a25 = V(m);
            if (!a2.unify(C("black", a24, a13, a14, a25), m.trail)){
                return m.fail();
            }
        a25 = a25.dref();
            if (!a25.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        Term[] y1 = VA(a8, a9, a10, a11);
        a26 = S("black", y1);
        Term[] y2 = VA(a16, a17, a18, a19);
        a27 = S("black", y2);
        Term[] y3 = VA(a26, a5, a6, a27);
        a28 = S("red", y3);
        m.AREGS[0] = a28;
        m.AREGS[1] = a24;
        m.AREGS[2] = V(m);
m.cont = cont;
        return fixup2_3_top(m);
    }

    private final static Operation fixup2_3_2(Prolog m) { 
    // fixup2(red(black(A,B,C,D),E,F,black(black(G,H,I,J),K,L,black(M,N,O,P))),black(black(A,B,C,D),E,F,red(black(G,H,I,J),K,L,black(M,N,O,P))),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup2(red(black(A,B,C,D),E,F,black(black(G,H,I,J),K,L,black(M,N,O,P))),black(black(A,B,C,D),E,F,red(black(G,H,I,J),K,L,black(M,N,O,P))),done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("red", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a7.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a12 = a12.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a12.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a15 = a15.dref();
            a20 = V(m);
            a21 = V(m);
            a22 = V(m);
            a23 = V(m);
            if (!a15.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a24 = V(m);
            a25 = V(m);
            if (!a2.unify(C("black", a24, a5, a6, a25), m.trail)){
                return m.fail();
            }
        a24 = a24.dref();
            if (!a24.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a25 = a25.dref();
            a26 = V(m);
            a27 = V(m);
            if (!a25.unify(C("red", a26, a13, a14, a27), m.trail)){
                return m.fail();
            }
        a26 = a26.dref();
            if (!a26.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a27 = a27.dref();
            if (!a27.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fixup2_3_3(Prolog m) { 
    // fixup2(black(black(A,B,C,D),E,F,black(black(G,H,I,J),K,L,black(M,N,O,P))),black(black(A,B,C,D),E,F,red(black(G,H,I,J),K,L,black(M,N,O,P))),not_done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup2(black(black(A,B,C,D),E,F,black(black(G,H,I,J),K,L,black(M,N,O,P))),black(black(A,B,C,D),E,F,red(black(G,H,I,J),K,L,black(M,N,O,P))),not_done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a7.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a12 = a12.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a12.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a15 = a15.dref();
            a20 = V(m);
            a21 = V(m);
            a22 = V(m);
            a23 = V(m);
            if (!a15.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a24 = V(m);
            a25 = V(m);
            if (!a2.unify(C("black", a24, a5, a6, a25), m.trail)){
                return m.fail();
            }
        a24 = a24.dref();
            if (!a24.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a25 = a25.dref();
            a26 = V(m);
            a27 = V(m);
            if (!a25.unify(C("red", a26, a13, a14, a27), m.trail)){
                return m.fail();
            }
        a26 = a26.dref();
            if (!a26.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a27 = a27.dref();
            if (!a27.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        if (!  ATOM_not_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fixup2_3_4(Prolog m) { 
    // fixup2(red(black(A,B,C,D),E,F,black(red(G,H,I,J),K,L,black(M,N,O,P))),red(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,black(M,N,O,P))),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup2(red(black(A,B,C,D),E,F,black(red(G,H,I,J),K,L,black(M,N,O,P))),red(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,black(M,N,O,P))),done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("red", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a7.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a12 = a12.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a12.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a15 = a15.dref();
            a20 = V(m);
            a21 = V(m);
            a22 = V(m);
            a23 = V(m);
            if (!a15.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a24 = V(m);
            a25 = V(m);
            if (!a2.unify(C("red", a24, a17, a18, a25), m.trail)){
                return m.fail();
            }
        a24 = a24.dref();
            a26 = V(m);
            if (!a24.unify(C("black", a26, a5, a6, a16), m.trail)){
                return m.fail();
            }
        a26 = a26.dref();
            if (!a26.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a25 = a25.dref();
            a27 = V(m);
            if (!a25.unify(C("black", a19, a13, a14, a27), m.trail)){
                return m.fail();
            }
        a27 = a27.dref();
            if (!a27.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fixup2_3_5(Prolog m) { 
    // fixup2(black(black(A,B,C,D),E,F,black(red(G,H,I,J),K,L,black(M,N,O,P))),black(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,black(M,N,O,P))),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup2(black(black(A,B,C,D),E,F,black(red(G,H,I,J),K,L,black(M,N,O,P))),black(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,black(M,N,O,P))),done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a7.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a12 = a12.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a12.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a15 = a15.dref();
            a20 = V(m);
            a21 = V(m);
            a22 = V(m);
            a23 = V(m);
            if (!a15.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a24 = V(m);
            a25 = V(m);
            if (!a2.unify(C("black", a24, a17, a18, a25), m.trail)){
                return m.fail();
            }
        a24 = a24.dref();
            a26 = V(m);
            if (!a24.unify(C("black", a26, a5, a6, a16), m.trail)){
                return m.fail();
            }
        a26 = a26.dref();
            if (!a26.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a25 = a25.dref();
            a27 = V(m);
            if (!a25.unify(C("black", a19, a13, a14, a27), m.trail)){
                return m.fail();
            }
        a27 = a27.dref();
            if (!a27.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fixup2_3_6(Prolog m) { 
    // fixup2(red(black(A,B,C,D),E,F,black(G,H,I,red(J,K,L,M))),red(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,M)),done):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup2(red(black(A,B,C,D),E,F,black(G,H,I,red(J,K,L,M))),red(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,M)),done):-[]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("red", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a7.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a15 = a15.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a15.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a20 = V(m);
            a21 = V(m);
            if (!a2.unify(C("red", a20, a13, a14, a21), m.trail)){
                return m.fail();
            }
        a20 = a20.dref();
            a22 = V(m);
            if (!a20.unify(C("black", a22, a5, a6, a12), m.trail)){
                return m.fail();
            }
        a22 = a22.dref();
            if (!a22.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a21 = a21.dref();
            if (!a21.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation fixup2_3_7(Prolog m) { 
    // fixup2(black(black(A,B,C,D),E,F,black(G,H,I,red(J,K,L,M))),black(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,M)),done):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup2(black(black(A,B,C,D),E,F,black(G,H,I,red(J,K,L,M))),black(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,M)),done):-[]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a7.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a15 = a15.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a15.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a20 = V(m);
            a21 = V(m);
            if (!a2.unify(C("black", a20, a13, a14, a21), m.trail)){
                return m.fail();
            }
        a20 = a20.dref();
            a22 = V(m);
            if (!a20.unify(C("black", a22, a5, a6, a12), m.trail)){
                return m.fail();
            }
        a22 = a22.dref();
            if (!a22.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a21 = a21.dref();
            if (!a21.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: fixup_right/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_fixup_right_4_s1 = SYM("done");




    public static Operation PRED_fixup_right_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::fixup_right_4_var, fail_0, fail_0, FILE_rbtrees::fixup_right_4_var, fail_0, fail_0); 
    }

    private final static Operation fixup_right_4_var(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::fixup_right_4_var_1);
        return fixup_right_4_1(m);
    }

    private final static Operation fixup_right_4_var_1(Prolog m) { 
        m.trust(null);
        return fixup_right_4_2(m);
    }

    private final static Operation fixup_right_4_1(Prolog m) { 
    // fixup_right(done,A,A,done):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // fixup_right(done,A,A,done):-[]
        if (! PRED_fixup_right_4_s1.unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! PRED_fixup_right_4_s1.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation fixup_right_4_2(Prolog m) { 
    // fixup_right(not_done,A,B,C):-fixup3(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // fixup_right(not_done,A,B,C):-[fixup3(A,B,C)]
        if (!  ATOM_not_done .unify(a1, m.trail))
            return m.fail();
        return Op(FILE_rbtrees::PRED_fixup3_3_static_exec, VA(a2, a3, a4), cont);
    }
/** PREDICATE: fixup3/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_fixup3_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return fixup3_3_top(m);
    }

    private final static Operation fixup3_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::fixup3_3_var, fail_0, fail_0, fail_0, FILE_rbtrees::fixup3_3_var, fail_0); 
    }

    private final static Operation fixup3_3_var(Prolog m) { 
        m.jtry3(null, FILE_rbtrees::fixup3_3_var_1);
        return fixup3_3_1(m);
    }

    private final static Operation fixup3_3_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::fixup3_3_var_2);
        return fixup3_3_2(m);
    }

    private final static Operation fixup3_3_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::fixup3_3_var_3);
        return fixup3_3_3(m);
    }

    private final static Operation fixup3_3_var_3(Prolog m) { 
        m.retry(null, FILE_rbtrees::fixup3_3_var_4);
        return fixup3_3_4(m);
    }

    private final static Operation fixup3_3_var_4(Prolog m) { 
        m.retry(null, FILE_rbtrees::fixup3_3_var_5);
        return fixup3_3_5(m);
    }

    private final static Operation fixup3_3_var_5(Prolog m) { 
        m.retry(null, FILE_rbtrees::fixup3_3_var_6);
        return fixup3_3_6(m);
    }

    private final static Operation fixup3_3_var_6(Prolog m) { 
        m.trust(null);
        return fixup3_3_7(m);
    }

    private final static Operation fixup3_3_1(Prolog m) { 
    // fixup3(black(red(black(A,B,C,D),E,F,black(G,H,I,J)),K,L,black(M,N,O,P)),black(black(A,B,C,D),E,F,Q),done):-!,fixup3(red(black(G,H,I,J),K,L,black(M,N,O,P)),Q,R)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup3(black(red(black(A,B,C,D),E,F,black(G,H,I,J)),K,L,black(M,N,O,P)),black(black(A,B,C,D),E,F,Q),done):-['$neck_cut',fixup3(red(black(G,H,I,J),K,L,black(M,N,O,P)),Q,R)]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("red", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a8 = a8.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a8.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a11 = a11.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a11.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a20 = V(m);
            a21 = V(m);
            a22 = V(m);
            a23 = V(m);
            if (!a7.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a24 = V(m);
            a25 = V(m);
            if (!a2.unify(C("black", a24, a9, a10, a25), m.trail)){
                return m.fail();
            }
        a24 = a24.dref();
            if (!a24.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        Term[] y1 = VA(a16, a17, a18, a19);
        a26 = S("black", y1);
        Term[] y2 = VA(a20, a21, a22, a23);
        a27 = S("black", y2);
        Term[] y3 = VA(a26, a5, a6, a27);
        a28 = S("red", y3);
        m.AREGS[0] = a28;
        m.AREGS[1] = a25;
        m.AREGS[2] = V(m);
m.cont = cont;
        return fixup3_3_top(m);
    }

    private final static Operation fixup3_3_2(Prolog m) { 
    // fixup3(red(black(black(A,B,C,D),E,F,black(G,H,I,J)),K,L,black(M,N,O,P)),black(red(black(A,B,C,D),E,F,black(G,H,I,J)),K,L,black(M,N,O,P)),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup3(red(black(black(A,B,C,D),E,F,black(G,H,I,J)),K,L,black(M,N,O,P)),black(red(black(A,B,C,D),E,F,black(G,H,I,J)),K,L,black(M,N,O,P)),done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("red", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a8 = a8.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a8.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a11 = a11.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a11.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a20 = V(m);
            a21 = V(m);
            a22 = V(m);
            a23 = V(m);
            if (!a7.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a24 = V(m);
            a25 = V(m);
            if (!a2.unify(C("black", a24, a5, a6, a25), m.trail)){
                return m.fail();
            }
        a24 = a24.dref();
            a26 = V(m);
            a27 = V(m);
            if (!a24.unify(C("red", a26, a9, a10, a27), m.trail)){
                return m.fail();
            }
        a26 = a26.dref();
            if (!a26.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a27 = a27.dref();
            if (!a27.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a25 = a25.dref();
            if (!a25.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fixup3_3_3(Prolog m) { 
    // fixup3(black(black(black(A,B,C,D),E,F,black(G,H,I,J)),K,L,black(M,N,O,P)),black(red(black(A,B,C,D),E,F,black(G,H,I,J)),K,L,black(M,N,O,P)),not_done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup3(black(black(black(A,B,C,D),E,F,black(G,H,I,J)),K,L,black(M,N,O,P)),black(red(black(A,B,C,D),E,F,black(G,H,I,J)),K,L,black(M,N,O,P)),not_done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a8 = a8.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a8.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a11 = a11.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a11.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a20 = V(m);
            a21 = V(m);
            a22 = V(m);
            a23 = V(m);
            if (!a7.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a24 = V(m);
            a25 = V(m);
            if (!a2.unify(C("black", a24, a5, a6, a25), m.trail)){
                return m.fail();
            }
        a24 = a24.dref();
            a26 = V(m);
            a27 = V(m);
            if (!a24.unify(C("red", a26, a9, a10, a27), m.trail)){
                return m.fail();
            }
        a26 = a26.dref();
            if (!a26.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a27 = a27.dref();
            if (!a27.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a25 = a25.dref();
            if (!a25.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        if (!  ATOM_not_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fixup3_3_4(Prolog m) { 
    // fixup3(red(black(black(A,B,C,D),E,F,red(G,H,I,J)),K,L,black(M,N,O,P)),red(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,black(M,N,O,P))),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup3(red(black(black(A,B,C,D),E,F,red(G,H,I,J)),K,L,black(M,N,O,P)),red(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,black(M,N,O,P))),done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("red", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a8 = a8.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a8.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a11 = a11.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a11.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a20 = V(m);
            a21 = V(m);
            a22 = V(m);
            a23 = V(m);
            if (!a7.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a24 = V(m);
            a25 = V(m);
            if (!a2.unify(C("red", a24, a17, a18, a25), m.trail)){
                return m.fail();
            }
        a24 = a24.dref();
            a26 = V(m);
            if (!a24.unify(C("black", a26, a9, a10, a16), m.trail)){
                return m.fail();
            }
        a26 = a26.dref();
            if (!a26.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a25 = a25.dref();
            a27 = V(m);
            if (!a25.unify(C("black", a19, a5, a6, a27), m.trail)){
                return m.fail();
            }
        a27 = a27.dref();
            if (!a27.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fixup3_3_5(Prolog m) { 
    // fixup3(black(black(black(A,B,C,D),E,F,red(G,H,I,J)),K,L,black(M,N,O,P)),black(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,black(M,N,O,P))),done):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup3(black(black(black(A,B,C,D),E,F,red(G,H,I,J)),K,L,black(M,N,O,P)),black(black(black(A,B,C,D),E,F,G),H,I,black(J,K,L,black(M,N,O,P))),done):-['$neck_cut']
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a8 = a8.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a8.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a11 = a11.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a11.unify(C("red", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a20 = V(m);
            a21 = V(m);
            a22 = V(m);
            a23 = V(m);
            if (!a7.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a24 = V(m);
            a25 = V(m);
            if (!a2.unify(C("black", a24, a17, a18, a25), m.trail)){
                return m.fail();
            }
        a24 = a24.dref();
            a26 = V(m);
            if (!a24.unify(C("black", a26, a9, a10, a16), m.trail)){
                return m.fail();
            }
        a26 = a26.dref();
            if (!a26.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a25 = a25.dref();
            a27 = V(m);
            if (!a25.unify(C("black", a19, a5, a6, a27), m.trail)){
                return m.fail();
            }
        a27 = a27.dref();
            if (!a27.unify(C("black", a20, a21, a22, a23), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation fixup3_3_6(Prolog m) { 
    // fixup3(red(black(red(A,B,C,D),E,F,G),H,I,black(J,K,L,M)),red(black(A,B,C,D),E,F,black(G,H,I,black(J,K,L,M))),done):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup3(red(black(red(A,B,C,D),E,F,G),H,I,black(J,K,L,M)),red(black(A,B,C,D),E,F,black(G,H,I,black(J,K,L,M))),done):-[]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("red", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a8 = a8.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a8.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a7.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a20 = V(m);
            a21 = V(m);
            if (!a2.unify(C("red", a20, a9, a10, a21), m.trail)){
                return m.fail();
            }
        a20 = a20.dref();
            if (!a20.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a21 = a21.dref();
            a22 = V(m);
            if (!a21.unify(C("black", a11, a5, a6, a22), m.trail)){
                return m.fail();
            }
        a22 = a22.dref();
            if (!a22.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation fixup3_3_7(Prolog m) { 
    // fixup3(black(black(red(A,B,C,D),E,F,G),H,I,black(J,K,L,M)),black(black(A,B,C,D),E,F,black(G,H,I,black(J,K,L,M))),done):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // fixup3(black(black(red(A,B,C,D),E,F,G),H,I,black(J,K,L,M)),black(black(A,B,C,D),E,F,black(G,H,I,black(J,K,L,M))),done):-[]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a4.unify(C("black", a8, a9, a10, a11), m.trail)){
                return m.fail();
            }
        a8 = a8.dref();
            a12 = V(m);
            a13 = V(m);
            a14 = V(m);
            a15 = V(m);
            if (!a8.unify(C("red", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            a16 = V(m);
            a17 = V(m);
            a18 = V(m);
            a19 = V(m);
            if (!a7.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a20 = V(m);
            a21 = V(m);
            if (!a2.unify(C("black", a20, a9, a10, a21), m.trail)){
                return m.fail();
            }
        a20 = a20.dref();
            if (!a20.unify(C("black", a12, a13, a14, a15), m.trail)){
                return m.fail();
            }
        a21 = a21.dref();
            a22 = V(m);
            if (!a21.unify(C("black", a11, a5, a6, a22), m.trail)){
                return m.fail();
            }
        a22 = a22.dref();
            if (!a22.unify(C("black", a16, a17, a18, a19), m.trail)){
                return m.fail();
            }
        if (!  ATOM_done .unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: rb_visit/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_visit_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_visit(t(A,B),C):-visit(B,[],C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // rb_visit(t(A,B),C):-[visit(B,[],C)]
        a1 = a1.dref();
            a3 = V(m);
            if (!a1.unify(C("t", V(m), a3), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_visit_3_static_exec, VA(a3,  Prolog.Nil , a2), cont);
    }
/** PREDICATE: visit/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_visit_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return visit_3_top(m);
    }

    private final static Operation visit_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::visit_3_var, fail_0, fail_0, fail_0, FILE_rbtrees::visit_3_var, fail_0); 
    }

    private final static Operation visit_3_var(Prolog m) { 
        m.jtry3(null, FILE_rbtrees::visit_3_var_1);
        return visit_3_1(m);
    }

    private final static Operation visit_3_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::visit_3_var_2);
        return visit_3_2(m);
    }

    private final static Operation visit_3_var_2(Prolog m) { 
        m.trust(null);
        return visit_3_3(m);
    }

    private final static Operation visit_3_1(Prolog m) { 
    // visit(black('',A,B,C),D,D):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // visit(black('',A,B,C),D,D):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        if (! a2.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation visit_3_2(Prolog m) { 
    // visit(red(A,B,C,D),E,F):-visit(A,[B-C|G],F),visit(D,E,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // visit(red(A,B,C,D),E,F):-[visit(A,[B-C|G],F),visit(D,E,G)]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("red", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        Term[] y1 = VA(a5, a6);
        a8 = S("-", y1);
        a9 = V(m);
        a10 = CONS(a8, a9);
        p1 = Op(FILE_rbtrees::PRED_visit_3_static_exec, VA(a7, a2, a9), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a10;
        m.AREGS[2] = a3;
        m.cont = p1;
        return visit_3_top(m);
    }

    private final static Operation visit_3_3(Prolog m) { 
    // visit(black(A,B,C,D),E,F):-visit(A,[B-C|G],F),visit(D,E,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // visit(black(A,B,C,D),E,F):-[visit(A,[B-C|G],F),visit(D,E,G)]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a4, a5, a6, a7), m.trail)){
                return m.fail();
            }
        Term[] y1 = VA(a5, a6);
        a8 = S("-", y1);
        a9 = V(m);
        a10 = CONS(a8, a9);
        p1 = Op(FILE_rbtrees::PRED_visit_3_static_exec, VA(a7, a2, a9), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a10;
        m.AREGS[2] = a3;
        m.cont = p1;
        return visit_3_top(m);
    }
/** PREDICATE: rb_map/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
        final static SymbolTerm ATOM_rbtrees = SYM("rbtrees");




    public static Operation PRED_rb_map_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_map(t(A,B),C,t(A,D)):-map(B,C,D,A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // rb_map(t(A,B),C,t(A,D)):-[map(B,rbtrees:C,D,A)]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            if (!a1.unify(C("t", a4, a5), m.trail)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = V(m);
            if (!a3.unify(C("t", a4, a6), m.trail)){
                return m.fail();
            }
        Term[] y1 = VA( ATOM_rbtrees , a2);
        a7 = S(":", y1);
        return Op(FILE_rbtrees::PRED_map_4_static_exec, VA(a5, a7, a6, a4), cont);
    }
/** PREDICATE: map/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_map_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::map_4_var, fail_0, fail_0, fail_0, FILE_rbtrees::map_4_var, fail_0); 
    }

    private final static Operation map_4_var(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::map_4_var_1);
        return map_4_1(m);
    }

    private final static Operation map_4_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::map_4_var_2);
        return map_4_2(m);
    }

    private final static Operation map_4_var_2(Prolog m) { 
        m.trust(null);
        return map_4_3(m);
    }

    private final static Operation map_4_1(Prolog m) { 
    // map(black('',A,B,''),C,D,D):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // map(black('',A,B,''),C,D,D):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        if (! a3.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation map_4_2(Prolog m) { 
    // map(red(A,B,C,D),E,red(F,B,G,H),I):-call(E,C,G),!,map(A,E,F,I),map(D,E,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // map(red(A,B,C,D),E,red(F,B,G,H),I):-['$get_level'(J),call(E,C,G),'$cut'(J),map(A,rbtrees:E,F,I),map(D,rbtrees:E,H,I)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a1.unify(C("red", a5, a6, a7, a8), m.trail)){
                return m.fail();
            }
        a3 = a3.dref();
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a3.unify(C("red", a9, a6, a10, a11), m.trail)){
                return m.fail();
            }
        a12 = V(m);
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        Term[] y1 = VA( ATOM_rbtrees , a2);
        a13 = S(":", y1);
        Term[] y2 = VA( ATOM_rbtrees , a2);
        a14 = S(":", y2);
        return Op(FILE_rbtrees::PRED_call_3_static_exec, VA(a2, a7, a10), Op(FILE_rbtrees::PRED_$cut_1_static_exec, VA(a12), Op(FILE_rbtrees::PRED_map_4_static_exec, VA(a5, a13, a9, a4), Op(FILE_rbtrees::PRED_map_4_static_exec, VA(a8, a14, a11, a4), cont))));
    }

    private final static Operation map_4_3(Prolog m) { 
    // map(black(A,B,C,D),E,black(F,B,G,H),I):-call(E,C,G),!,map(A,E,F,I),map(D,E,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // map(black(A,B,C,D),E,black(F,B,G,H),I):-['$get_level'(J),call(E,C,G),'$cut'(J),map(A,rbtrees:E,F,I),map(D,rbtrees:E,H,I)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a1.unify(C("black", a5, a6, a7, a8), m.trail)){
                return m.fail();
            }
        a3 = a3.dref();
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a3.unify(C("black", a9, a6, a10, a11), m.trail)){
                return m.fail();
            }
        a12 = V(m);
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        Term[] y1 = VA( ATOM_rbtrees , a2);
        a13 = S(":", y1);
        Term[] y2 = VA( ATOM_rbtrees , a2);
        a14 = S(":", y2);
        return Op(FILE_rbtrees::PRED_call_3_static_exec, VA(a2, a7, a10), Op(FILE_rbtrees::PRED_$cut_1_static_exec, VA(a12), Op(FILE_rbtrees::PRED_map_4_static_exec, VA(a5, a13, a9, a4), Op(FILE_rbtrees::PRED_map_4_static_exec, VA(a8, a14, a11, a4), cont))));
    }
/** PREDICATE: rb_map/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_map_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_map(t(A,B),C):-map(B,C)
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
    // rb_map(t(A,B),C):-[map(B,rbtrees:C)]
        a1 = a1.dref();
            a3 = V(m);
            if (!a1.unify(C("t", V(m), a3), m.trail)){
                return m.fail();
            }
        Term[] y1 = VA( ATOM_rbtrees , a2);
        a4 = S(":", y1);
        return Op(FILE_rbtrees::PRED_map_2_static_exec, VA(a3, a4), cont);
    }
/** PREDICATE: map/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_map_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::map_2_var, fail_0, fail_0, fail_0, FILE_rbtrees::map_2_var, fail_0); 
    }

    private final static Operation map_2_var(Prolog m) { 
        m.jtry2(null, FILE_rbtrees::map_2_var_1);
        return map_2_1(m);
    }

    private final static Operation map_2_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::map_2_var_2);
        return map_2_2(m);
    }

    private final static Operation map_2_var_2(Prolog m) { 
        m.trust(null);
        return map_2_3(m);
    }

    private final static Operation map_2_1(Prolog m) { 
    // map(black('',A,B,''),C):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // map(black('',A,B,''),C):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation map_2_2(Prolog m) { 
    // map(red(A,B,C,D),E):-call(E,C),!,map(A,E),map(D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // map(red(A,B,C,D),E):-['$get_level'(F),call(E,C),'$cut'(F),map(A,rbtrees:E),map(D,rbtrees:E)]
        a1 = a1.dref();
            a3 = V(m);
            a4 = V(m);
            a5 = V(m);
            if (!a1.unify(C("red", a3, V(m), a4, a5), m.trail)){
                return m.fail();
            }
        a6 = V(m);
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        Term[] y1 = VA( ATOM_rbtrees , a2);
        a7 = S(":", y1);
        Term[] y2 = VA( ATOM_rbtrees , a2);
        a8 = S(":", y2);
        return Op(FILE_rbtrees::PRED_call_2_static_exec, VA(a2, a4), Op(FILE_rbtrees::PRED_$cut_1_static_exec, VA(a6), Op(FILE_rbtrees::PRED_map_2_static_exec, VA(a3, a7), Op(FILE_rbtrees::PRED_map_2_static_exec, VA(a5, a8), cont))));
    }

    private final static Operation map_2_3(Prolog m) { 
    // map(black(A,B,C,D),E):-call(E,C),!,map(A,E),map(D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // map(black(A,B,C,D),E):-['$get_level'(F),call(E,C),'$cut'(F),map(A,rbtrees:E),map(D,rbtrees:E)]
        a1 = a1.dref();
            a3 = V(m);
            a4 = V(m);
            a5 = V(m);
            if (!a1.unify(C("black", a3, V(m), a4, a5), m.trail)){
                return m.fail();
            }
        a6 = V(m);
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        Term[] y1 = VA( ATOM_rbtrees , a2);
        a7 = S(":", y1);
        Term[] y2 = VA( ATOM_rbtrees , a2);
        a8 = S(":", y2);
        return Op(FILE_rbtrees::PRED_call_2_static_exec, VA(a2, a4), Op(FILE_rbtrees::PRED_$cut_1_static_exec, VA(a6), Op(FILE_rbtrees::PRED_map_2_static_exec, VA(a3, a7), Op(FILE_rbtrees::PRED_map_2_static_exec, VA(a5, a8), cont))));
    }
/** PREDICATE: rb_fold/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_fold_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_fold(A,t(B,C),D,E):-fold(C,A,D,E)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // rb_fold(A,t(B,C),D,E):-[fold(C,A,D,E)]
        a2 = a2.dref();
            a5 = V(m);
            if (!a2.unify(C("t", V(m), a5), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_fold_4_static_exec, VA(a5, a1, a3, a4), cont);
    }
/** PREDICATE: $dummy_18_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/8
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_$dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_s1 = SYM("");

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_$dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_rbtrees::$dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_sub_1);
        return $dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_1(m);
    }

    private final static Operation $dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_2(m);
    }

    private final static Operation $dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_1(Prolog m) { 
    // '$dummy_18_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-(A=='',H=F),!,H=G
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
    // '$dummy_18_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-['$get_level'(I),'$equality_of_term'(A,''),'$unify'(H,F),'$cut'(I),'$unify'(H,G)]
        a9 = V(m);
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),s(1))
        a1 = a1.dref();
        if (! a1.equalsTerm(PRED_$dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(8),a(6))
        if (! a8.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(9))
        a9 = a9.dref();
                  m.cut( a9.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(8),a(7))
        if (! a8.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_2(Prolog m) { 
    // '$dummy_18_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-fold_parts(E,A,B-C,D,F,G)
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
    // '$dummy_18_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-[fold_parts(E,A,B-C,D,F,G)]
        Term[] y1 = VA(a2, a3);
        a9 = S("-", y1);
        return Op(FILE_rbtrees::PRED_fold_parts_6_static_exec, VA(a5, a1, a9, a4, a6, a7), cont);
    }
/** PREDICATE: fold/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_fold_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::fold_4_var, fail_0, fail_0, fail_0, FILE_rbtrees::fold_4_var, fail_0); 
    }

    private final static Operation fold_4_var(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::fold_4_var_1);
        return fold_4_1(m);
    }

    private final static Operation fold_4_var_1(Prolog m) { 
        m.trust(null);
        return fold_4_2(m);
    }

    private final static Operation fold_4_1(Prolog m) { 
    // fold(black(A,B,C,D),E,F,G):-'$dummy_18_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // fold(black(A,B,C,D),E,F,G):-['$dummy_18_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a1.unify(C("black", a5, a6, a7, a8), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_$dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_static_exec, VA(a5, a6, a7, a8, a2, a3, a4, V(m)), cont);
    }

    private final static Operation fold_4_2(Prolog m) { 
    // fold(red(A,B,C,D),E,F,G):-fold_parts(E,A,B-C,D,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // fold(red(A,B,C,D),E,F,G):-[fold_parts(E,A,B-C,D,F,G)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a1.unify(C("red", a5, a6, a7, a8), m.trail)){
                return m.fail();
            }
        Term[] y1 = VA(a6, a7);
        a9 = S("-", y1);
        return Op(FILE_rbtrees::PRED_fold_parts_6_static_exec, VA(a2, a5, a9, a8, a3, a4), cont);
    }
/** PREDICATE: fold_parts/6
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6;




    public static Operation PRED_fold_parts_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // fold_parts(A,B,C,D,E,F):-fold(B,A,E,G),call(A,C,G,H),fold(D,A,H,F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // fold_parts(A,B,C,D,E,F):-[fold(B,A,E,G),call(A,C,G,H),fold(D,A,H,F)]
        a7 = V(m);
        a8 = V(m);
        return Op(FILE_rbtrees::PRED_fold_4_static_exec, VA(a2, a1, a5, a7), Op(FILE_rbtrees::PRED_call_4_static_exec, VA(a1, a3, a7, a8), Op(FILE_rbtrees::PRED_fold_4_static_exec, VA(a4, a1, a8, a6), cont)));
    }
/** PREDICATE: rb_clone/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_clone_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_clone(t(A,B),t(A,C),D):-clone(B,A,C,D,[])
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // rb_clone(t(A,B),t(A,C),D):-[clone(B,A,C,D,[])]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            if (!a1.unify(C("t", a4, a5), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = V(m);
            if (!a2.unify(C("t", a4, a6), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_clone_5_static_exec, VA(a5, a4, a6, a3,  Prolog.Nil ), cont);
    }
/** PREDICATE: clone/5
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5;




    public static Operation PRED_clone_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return clone_5_top(m);
    }

    private final static Operation clone_5_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::clone_5_var, fail_0, fail_0, fail_0, FILE_rbtrees::clone_5_var, fail_0); 
    }

    private final static Operation clone_5_var(Prolog m) { 
        m.jtry5(null, FILE_rbtrees::clone_5_var_1);
        return clone_5_1(m);
    }

    private final static Operation clone_5_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::clone_5_var_2);
        return clone_5_2(m);
    }

    private final static Operation clone_5_var_2(Prolog m) { 
        m.trust(null);
        return clone_5_3(m);
    }

    private final static Operation clone_5_1(Prolog m) { 
    // clone(black('',A,B,''),C,C,D,D):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // clone(black('',A,B,''),C,C,D,D):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation clone_5_2(Prolog m) { 
    // clone(red(A,B,C,D),E,red(F,B,G,H),I,J):-clone(A,E,F,I,[B-G|K]),clone(D,E,H,K,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // clone(red(A,B,C,D),E,red(F,B,G,H),I,J):-[clone(A,E,F,I,[B-G|K]),clone(D,E,H,K,J)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a1.unify(C("red", a6, a7, V(m), a8), m.trail)){
                return m.fail();
            }
        a3 = a3.dref();
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a3.unify(C("red", a9, a7, a10, a11), m.trail)){
                return m.fail();
            }
        Term[] y1 = VA(a7, a10);
        a12 = S("-", y1);
        a13 = V(m);
        a14 = CONS(a12, a13);
        p1 = Op(FILE_rbtrees::PRED_clone_5_static_exec, VA(a8, a2, a11, a13, a5), cont);
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a9;
        m.AREGS[3] = a4;
        m.AREGS[4] = a14;
        m.cont = p1;
        return clone_5_top(m);
    }

    private final static Operation clone_5_3(Prolog m) { 
    // clone(black(A,B,C,D),E,black(F,B,G,H),I,J):-clone(A,E,F,I,[B-G|K]),clone(D,E,H,K,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // clone(black(A,B,C,D),E,black(F,B,G,H),I,J):-[clone(A,E,F,I,[B-G|K]),clone(D,E,H,K,J)]
        a1 = a1.dref();
            a6 = V(m);
            a7 = V(m);
            a8 = V(m);
            if (!a1.unify(C("black", a6, a7, V(m), a8), m.trail)){
                return m.fail();
            }
        a3 = a3.dref();
            a9 = V(m);
            a10 = V(m);
            a11 = V(m);
            if (!a3.unify(C("black", a9, a7, a10, a11), m.trail)){
                return m.fail();
            }
        Term[] y1 = VA(a7, a10);
        a12 = S("-", y1);
        a13 = V(m);
        a14 = CONS(a12, a13);
        p1 = Op(FILE_rbtrees::PRED_clone_5_static_exec, VA(a8, a2, a11, a13, a5), cont);
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a9;
        m.AREGS[3] = a4;
        m.AREGS[4] = a14;
        m.cont = p1;
        return clone_5_top(m);
    }
/** PREDICATE: rb_partial_map/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_partial_map_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_partial_map(t(A,B),C,D,t(A,E)):-partial_map(B,C,[],A,D,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // rb_partial_map(t(A,B),C,D,t(A,E)):-[partial_map(B,C,[],A,D,E)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("t", a5, a6), m.trail)){
                return m.fail();
            }
        a4 = a4.dref();
            a7 = V(m);
            if (!a4.unify(C("t", a5, a7), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_partial_map_6_static_exec, VA(a6, a2,  Prolog.Nil , a5, a3, a7), cont);
    }
/** PREDICATE: partial_map/6
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_partial_map_6_s1 = SYM("[]");

    // private final Term arg5, arg6;




    public static Operation PRED_partial_map_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return partial_map_6_top(m);
    }

    private final static Operation partial_map_6_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::partial_map_6_var, FILE_rbtrees::partial_map_6_1, FILE_rbtrees::partial_map_6_1, FILE_rbtrees::partial_map_6_1, FILE_rbtrees::partial_map_6_var, FILE_rbtrees::partial_map_6_1); 
    }

    private final static Operation partial_map_6_var(Prolog m) { 
        m.jtry6(null, FILE_rbtrees::partial_map_6_var_1);
        return partial_map_6_1(m);
    }

    private final static Operation partial_map_6_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::partial_map_6_var_2);
        return partial_map_6_2(m);
    }

    private final static Operation partial_map_6_var_2(Prolog m) { 
        m.retry(null, FILE_rbtrees::partial_map_6_var_3);
        return partial_map_6_3(m);
    }

    private final static Operation partial_map_6_var_3(Prolog m) { 
        m.trust(null);
        return partial_map_6_4(m);
    }

    private final static Operation partial_map_6_1(Prolog m) { 
    // partial_map(A,[],[],B,C,A):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // partial_map(A,[],[],B,C,A):-['$neck_cut']
        if (! PRED_partial_map_6_s1.unify(a2, m.trail))
            return m.fail();
        if (! PRED_partial_map_6_s1.unify(a3, m.trail))
            return m.fail();
        if (! a1.unify(a6, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation partial_map_6_2(Prolog m) { 
    // partial_map(black('',A,B,C),D,D,E,F,E):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // partial_map(black('',A,B,C),D,D,E,F,E):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! a4.unify(a6, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation partial_map_6_3(Prolog m) { 
    // partial_map(red(A,B,C,D),E,F,G,H,red(I,B,J,K)):-partial_map(A,E,L,G,H,I),'$dummy_19_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,C,D,F,G,H,J,K,L,M,N,O)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // partial_map(red(A,B,C,D),E,F,G,H,red(I,B,J,K)):-[partial_map(A,E,L,G,H,I),'$dummy_19_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,C,D,F,G,H,J,K,L,M,N,O)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("red", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a6 = a6.dref();
            a11 = V(m);
            a12 = V(m);
            a13 = V(m);
            if (!a6.unify(C("red", a11, a8, a12, a13), m.trail)){
                return m.fail();
            }
        a14 = V(m);
        p1 = Op(FILE_rbtrees::PRED_$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_static_exec, VA(a8, a9, a10, a3, a4, a5, a12, a13, a14, V(m), V(m), V(m)), cont);
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.AREGS[2] = a14;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a11;
        m.cont = p1;
        return partial_map_6_top(m);
    }

    private final static Operation partial_map_6_4(Prolog m) { 
    // partial_map(black(A,B,C,D),E,F,G,H,black(I,B,J,K)):-partial_map(A,E,L,G,H,I),'$dummy_22_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,C,D,F,G,H,J,K,L,M,N,O)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // partial_map(black(A,B,C,D),E,F,G,H,black(I,B,J,K)):-[partial_map(A,E,L,G,H,I),'$dummy_22_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,C,D,F,G,H,J,K,L,M,N,O)]
        a1 = a1.dref();
            a7 = V(m);
            a8 = V(m);
            a9 = V(m);
            a10 = V(m);
            if (!a1.unify(C("black", a7, a8, a9, a10), m.trail)){
                return m.fail();
            }
        a6 = a6.dref();
            a11 = V(m);
            a12 = V(m);
            a13 = V(m);
            if (!a6.unify(C("black", a11, a8, a12, a13), m.trail)){
                return m.fail();
            }
        a14 = V(m);
        p1 = Op(FILE_rbtrees::PRED_$dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_static_exec, VA(a8, a9, a10, a3, a4, a5, a12, a13, a14, V(m), V(m), V(m)), cont);
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.AREGS[2] = a14;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a11;
        m.cont = p1;
        return partial_map_6_top(m);
    }
/** PREDICATE: $dummy_19_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/12
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_s1 = SYM("[]");

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;




    public static Operation PRED_$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(12, null, FILE_rbtrees::$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_sub_1);
        return $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_1(m);
    }

    private final static Operation $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_2(m);
    }

    private final static Operation $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_1(Prolog m) { 
    // '$dummy_19_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-I==[],!,H=C,G=B,D=[]
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // '$dummy_19_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-['$get_level'(M),'$equality_of_term'(I,[]),'$cut'(M),'$unify'(H,C),'$unify'(G,B),'$unify'(D,[])]
        a13 = V(m);
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(9),s(1))
        a9 = a9.dref();
        if (! a9.equalsTerm(PRED_$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(13))
        a13 = a13.dref();
                  m.cut( a13.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(8),a(3))
        if (! a8.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(7),a(2))
        if (! a7.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(4),s(1))
        if (! a4.unify(PRED_$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_s1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_2(Prolog m) { 
    // '$dummy_19_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-I=[J|K],'$dummy_20_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,F,G,I,J,K,L),partial_map(C,L,D,E,F,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // '$dummy_19_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-['$unify'(I,[J|K]),'$dummy_20_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,F,G,I,J,K,L),partial_map(C,L,D,E,F,H)]
        a13 = CONS(a10, a11);
        //START inline expansion of $unify(a(9),a(13))
        if (! a9.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_$dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_static_exec, VA(a1, a2, a6, a7, a9, a10, a11, a12), Op(FILE_rbtrees::PRED_partial_map_6_static_exec, VA(a3, a12, a4, a5, a6, a8), cont));
    }
/** PREDICATE: $dummy_21_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_$dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_rbtrees::$dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_sub_1);
        return $dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_1(m);
    }

    private final static Operation $dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_2(m);
    }

    private final static Operation $dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_1(Prolog m) { 
    // '$dummy_21_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C):-call(B,A,C),!,true
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_21_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C):-['$get_level'(D),call(B,A,C),'$cut'(D)]
        a4 = V(m);
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_call_3_static_exec, VA(a2, a1, a3), Op(FILE_rbtrees::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation $dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_2(Prolog m) { 
    // '$dummy_21_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C):-C=A
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_21_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C):-['$unify'(C,A)]
        //START inline expansion of $unify(a(3),a(1))
        if (! a3.unify(a1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_20_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/8
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_$dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_rbtrees::$dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_sub_1);
        return $dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_1(m);
    }

    private final static Operation $dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_2(m);
    }

    private final static Operation $dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_1(Prolog m) { 
    // '$dummy_20_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-A==F,!,'$dummy_21_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,C,D),H=G
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
    // '$dummy_20_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-['$get_level'(I),'$equality_of_term'(A,F),'$cut'(I),'$dummy_21_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,C,D),'$unify'(H,G)]
        a9 = V(m);
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),a(6))
        a1 = a1.dref();
        a6 = a6.dref();
        if (! a1.equalsTerm(a6)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(9))
        a9 = a9.dref();
                  m.cut( a9.intValue());
        //END inline expansion
        return Op(FILE_rbtrees::PRED_$dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_static_exec, VA(a2, a3, a4), Op(FILE_rbtrees::PRED_$unify_2_static_exec, VA(a8, a7), cont));
    }

    private final static Operation $dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_2(Prolog m) { 
    // '$dummy_20_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-D=B,H=E
         Term a1, a2, a3, a4, a5, a6, a7, a8;
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
    // '$dummy_20_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-['$unify'(D,B),'$unify'(H,E)]
        //START inline expansion of $unify(a(4),a(2))
        if (! a4.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(8),a(5))
        if (! a8.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_22_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/12
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_$dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_s1 = SYM("[]");

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;




    public static Operation PRED_$dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(12, null, FILE_rbtrees::$dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_sub_1);
        return $dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_1(m);
    }

    private final static Operation $dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_2(m);
    }

    private final static Operation $dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_1(Prolog m) { 
    // '$dummy_22_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-I==[],!,H=C,G=B,D=[]
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // '$dummy_22_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-['$get_level'(M),'$equality_of_term'(I,[]),'$cut'(M),'$unify'(H,C),'$unify'(G,B),'$unify'(D,[])]
        a13 = V(m);
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(9),s(1))
        a9 = a9.dref();
        if (! a9.equalsTerm(PRED_$dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_s1)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(13))
        a13 = a13.dref();
                  m.cut( a13.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(8),a(3))
        if (! a8.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(7),a(2))
        if (! a7.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(4),s(1))
        if (! a4.unify(PRED_$dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_s1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_2(Prolog m) { 
    // '$dummy_22_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-I=[J|K],'$dummy_23_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,F,G,I,J,K,L),partial_map(C,L,D,E,F,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // '$dummy_22_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-['$unify'(I,[J|K]),'$dummy_23_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,F,G,I,J,K,L),partial_map(C,L,D,E,F,H)]
        a13 = CONS(a10, a11);
        //START inline expansion of $unify(a(9),a(13))
        if (! a9.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_$dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_static_exec, VA(a1, a2, a6, a7, a9, a10, a11, a12), Op(FILE_rbtrees::PRED_partial_map_6_static_exec, VA(a3, a12, a4, a5, a6, a8), cont));
    }
/** PREDICATE: $dummy_24_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_$dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_rbtrees::$dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_sub_1);
        return $dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_1(m);
    }

    private final static Operation $dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_2(m);
    }

    private final static Operation $dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_1(Prolog m) { 
    // '$dummy_24_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C):-call(B,A,C),!,true
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_24_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C):-['$get_level'(D),call(B,A,C),'$cut'(D)]
        a4 = V(m);
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_call_3_static_exec, VA(a2, a1, a3), Op(FILE_rbtrees::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation $dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_2(Prolog m) { 
    // '$dummy_24_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C):-C=A
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_24_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C):-['$unify'(C,A)]
        //START inline expansion of $unify(a(3),a(1))
        if (! a3.unify(a1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_23_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/8
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_$dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_rbtrees::$dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_sub_1);
        return $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_1(m);
    }

    private final static Operation $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_2(m);
    }

    private final static Operation $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_1(Prolog m) { 
    // '$dummy_23_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-A==F,!,'$dummy_24_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,C,D),H=G
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
    // '$dummy_23_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-['$get_level'(I),'$equality_of_term'(A,F),'$cut'(I),'$dummy_24_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(B,C,D),'$unify'(H,G)]
        a9 = V(m);
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),a(6))
        a1 = a1.dref();
        a6 = a6.dref();
        if (! a1.equalsTerm(a6)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(9))
        a9 = a9.dref();
                  m.cut( a9.intValue());
        //END inline expansion
        return Op(FILE_rbtrees::PRED_$dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_static_exec, VA(a2, a3, a4), Op(FILE_rbtrees::PRED_$unify_2_static_exec, VA(a8, a7), cont));
    }

    private final static Operation $dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_2(Prolog m) { 
    // '$dummy_23_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-D=B,H=E
         Term a1, a2, a3, a4, a5, a6, a7, a8;
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
    // '$dummy_23_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B,C,D,E,F,G,H):-['$unify'(D,B),'$unify'(H,E)]
        //START inline expansion of $unify(a(4),a(2))
        if (! a4.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(8),a(5))
        if (! a8.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: rb_keys/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_rb_keys_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_keys(t(A,B),C):-keys(B,[],C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // rb_keys(t(A,B),C):-[keys(B,[],C)]
        a1 = a1.dref();
            a3 = V(m);
            if (!a1.unify(C("t", V(m), a3), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_keys_3_static_exec, VA(a3,  Prolog.Nil , a2), cont);
    }
/** PREDICATE: keys/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_keys_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return keys_3_top(m);
    }

    private final static Operation keys_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::keys_3_var, fail_0, fail_0, fail_0, FILE_rbtrees::keys_3_var, fail_0); 
    }

    private final static Operation keys_3_var(Prolog m) { 
        m.jtry3(null, FILE_rbtrees::keys_3_var_1);
        return keys_3_1(m);
    }

    private final static Operation keys_3_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::keys_3_var_2);
        return keys_3_2(m);
    }

    private final static Operation keys_3_var_2(Prolog m) { 
        m.trust(null);
        return keys_3_3(m);
    }

    private final static Operation keys_3_1(Prolog m) { 
    // keys(black('',A,B,''),C,C):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // keys(black('',A,B,''),C,C):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        if (! a2.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation keys_3_2(Prolog m) { 
    // keys(red(A,B,C,D),E,F):-keys(A,[B|G],F),keys(D,E,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // keys(red(A,B,C,D),E,F):-[keys(A,[B|G],F),keys(D,E,G)]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("red", a4, a5, V(m), a6), m.trail)){
                return m.fail();
            }
        a7 = V(m);
        a8 = CONS(a5, a7);
        p1 = Op(FILE_rbtrees::PRED_keys_3_static_exec, VA(a6, a2, a7), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a8;
        m.AREGS[2] = a3;
        m.cont = p1;
        return keys_3_top(m);
    }

    private final static Operation keys_3_3(Prolog m) { 
    // keys(black(A,B,C,D),E,F):-keys(A,[B|G],F),keys(D,E,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // keys(black(A,B,C,D),E,F):-[keys(A,[B|G],F),keys(D,E,G)]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            a6 = V(m);
            if (!a1.unify(C("black", a4, a5, V(m), a6), m.trail)){
                return m.fail();
            }
        a7 = V(m);
        a8 = CONS(a5, a7);
        p1 = Op(FILE_rbtrees::PRED_keys_3_static_exec, VA(a6, a2, a7), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a8;
        m.AREGS[2] = a3;
        m.cont = p1;
        return keys_3_top(m);
    }
/** PREDICATE: list_to_rbtree/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_list_to_rbtree_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // list_to_rbtree(A,B):-sort(A,C),ord_list_to_rbtree(C,B)
        m.setB0();
         Term a1, a2, a3;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // list_to_rbtree(A,B):-[sort(A,C),ord_list_to_rbtree(C,B)]
        a3 = V(m);
        return Op(FILE_rbtrees::PRED_sort_2_static_exec, VA(a1, a3), Op(FILE_rbtrees::PRED_ord_list_to_rbtree_2_static_exec, VA(a3, a2), cont));
    }
/** PREDICATE: ord_list_to_rbtree/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final SymbolTerm PRED_ord_list_to_rbtree_2_s1 = SYM("[]");
        final static SymbolTerm ATOM_seq = SYM("seq");
    private static final StructureTerm PRED_ord_list_to_rbtree_2_s12 = S("log",  int_2 );




    public static Operation PRED_ord_list_to_rbtree_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::ord_list_to_rbtree_2_var, FILE_rbtrees::ord_list_to_rbtree_2_3, FILE_rbtrees::ord_list_to_rbtree_2_3, FILE_rbtrees::ord_list_to_rbtree_2_con, FILE_rbtrees::ord_list_to_rbtree_2_3, FILE_rbtrees::ord_list_to_rbtree_2_lis); 
    }

    private final static Operation ord_list_to_rbtree_2_var(Prolog m) { 
        m.jtry2(null, FILE_rbtrees::ord_list_to_rbtree_2_var_1);
        return ord_list_to_rbtree_2_1(m);
    }

    private final static Operation ord_list_to_rbtree_2_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::ord_list_to_rbtree_2_var_2);
        return ord_list_to_rbtree_2_2(m);
    }

    private final static Operation ord_list_to_rbtree_2_var_2(Prolog m) { 
        m.trust(null);
        return ord_list_to_rbtree_2_3(m);
    }

    private final static Operation ord_list_to_rbtree_2_con(Prolog m) { 
        m.jtry2(null, FILE_rbtrees::ord_list_to_rbtree_2_con_1);
        return ord_list_to_rbtree_2_1(m);
    }

    private final static Operation ord_list_to_rbtree_2_con_1(Prolog m) { 
        m.trust(null);
        return ord_list_to_rbtree_2_3(m);
    }

    private final static Operation ord_list_to_rbtree_2_lis(Prolog m) { 
        m.jtry2(null, FILE_rbtrees::ord_list_to_rbtree_2_lis_1);
        return ord_list_to_rbtree_2_2(m);
    }

    private final static Operation ord_list_to_rbtree_2_lis_1(Prolog m) { 
        m.trust(null);
        return ord_list_to_rbtree_2_3(m);
    }

    private final static Operation ord_list_to_rbtree_2_1(Prolog m) { 
    // ord_list_to_rbtree([],t(A,A)):-!,A=black('',B,C,'')
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // ord_list_to_rbtree([],t(A,A)):-['$neck_cut','$unify'(A,black('',B,C,''))]
        if (! PRED_ord_list_to_rbtree_2_s1.unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
            a3 = V(m);
            if (!a2.unify(C("t", a3, a3), m.trail)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        Term[] y1 = VA( ATOM_ , V(m), V(m),  ATOM_ );
        a4 = S("black", y1);
        //START inline expansion of $unify(a(3),a(4))
        if (! a3.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation ord_list_to_rbtree_2_2(Prolog m) { 
    // ord_list_to_rbtree([A-B],t(C,black(C,A,B,C))):-!,C=black('',D,E,'')
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // ord_list_to_rbtree([A-B],t(C,black(C,A,B,C))):-['$neck_cut','$unify'(C,black('',D,E,''))]
        a1 = a1.dref();
        if (a1 .isCons()){
            Term[] argz = VA(a1.car(), a1.cdr());
            a3 = argz[0];
            if (! PRED_ord_list_to_rbtree_2_s1.unify(argz[1], m.trail))
                return m.fail();
        } else if (a1.isVar()){
            a3 = V(m);
             a1.bind(CONS(a3, PRED_ord_list_to_rbtree_2_s1), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
            a4 = V(m);
            a5 = V(m);
            if (!a3.unify(C("-", a4, a5), m.trail)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = V(m);
            a7 = V(m);
            if (!a2.unify(C("t", a6, a7), m.trail)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unify(C("black", a6, a4, a5, a6), m.trail)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        Term[] y1 = VA( ATOM_ , V(m), V(m),  ATOM_ );
        a8 = S("black", y1);
        //START inline expansion of $unify(a(6),a(8))
        if (! a6.unify(a8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation ord_list_to_rbtree_2_3(Prolog m) { 
    // ord_list_to_rbtree(A,t(B,C)):-B=black('',D,E,''),F=..[seq|A],functor(F,G,H),I is truncate(log(H)/log(2)),construct_rbtree(1,H,F,I,B,C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // ord_list_to_rbtree(A,t(B,C)):-['$unify'(B,black('',D,E,'')),'$univ'(F,[seq|A]),functor(F,G,H),I is truncate(log(H)/log(2)),construct_rbtree(1,H,F,I,B,C)]
        a2 = a2.dref();
            a3 = V(m);
            a4 = V(m);
            if (!a2.unify(C("t", a3, a4), m.trail)){
                return m.fail();
            }
        Term[] y1 = VA( ATOM_ , V(m), V(m),  ATOM_ );
        a5 = S("black", y1);
        //START inline expansion of $unify(a(3),a(5))
        if (! a3.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a6 = V(m);
        a7 = CONS( ATOM_seq , a1);
        a8 = V(m);
        a9 = V(m);
        Term[] y2 = VA(a8);
        a10 = S("log", y2);
        Term[] y3 = VA(a10, PRED_ord_list_to_rbtree_2_s12);
        a11 = S("/", y3);
        Term[] y4 = VA(a11);
        a12 = S("truncate", y4);
        return Op(FILE_rbtrees::PRED_$univ_2_static_exec, VA(a6, a7), Op(FILE_rbtrees::PRED_functor_3_static_exec, VA(a6, V(m), a8), Op(FILE_builtins::PRED_is_2_static_exec, VA(a9, a12), Op(FILE_rbtrees::PRED_construct_rbtree_6_static_exec, VA( int_1 , a8, a6, a9, a3, a4), cont))));
    }
/** PREDICATE: construct_rbtree/6
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/

    // private final Term arg5, arg6;




    public static Operation PRED_construct_rbtree_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_rbtrees::construct_rbtree_6_sub_1);
        return construct_rbtree_6_1(m);
    }

    private final static Operation construct_rbtree_6_sub_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::construct_rbtree_6_sub_2);
        return construct_rbtree_6_2(m);
    }

    private final static Operation construct_rbtree_6_sub_2(Prolog m) { 
        m.trust(null);
        return construct_rbtree_6_3(m);
    }

    private final static Operation construct_rbtree_6_1(Prolog m) { 
    // construct_rbtree(A,B,C,D,E,E):-B<A,!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // construct_rbtree(A,B,C,D,E,E):-['$get_level'(F),'$less_than'(B,A),'$cut'(F)]
        if (! a5.unify(a6, m.trail))
            return m.fail();
        a7 = V(m);
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_than(a(2),a(1))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a1)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation construct_rbtree_6_2(Prolog m) { 
    // construct_rbtree(A,A,B,C,D,E):-!,arg(A,B,F-G),build_node(C,D,F,G,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // construct_rbtree(A,A,B,C,D,E):-['$neck_cut',arg(A,B,F-G),build_node(C,D,F,G,D,E)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a7 = V(m);
        a8 = V(m);
        Term[] y1 = VA(a7, a8);
        a9 = S("-", y1);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA(a1, a3, a9), Op(FILE_rbtrees::PRED_build_node_6_static_exec, VA(a4, a5, a7, a8, a5, a6), cont));
    }

    private final static Operation construct_rbtree_6_3(Prolog m) { 
    // construct_rbtree(A,B,C,D,E,F):-G is (A+B)//2,arg(G,C,H-I),build_node(D,J,H,I,K,F),L is G-1,M is D-1,construct_rbtree(A,L,C,M,E,J),N is G+1,construct_rbtree(N,B,C,M,E,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // construct_rbtree(A,B,C,D,E,F):-[G is (A+B)//2,arg(G,C,H-I),build_node(D,J,H,I,K,F),L is G-1,M is D-1,construct_rbtree(A,L,C,M,E,J),N is G+1,construct_rbtree(N,B,C,M,E,K)]
        a7 = V(m);
        Term[] y1 = VA(a1, a2);
        a8 = S("+", y1);
        Term[] y2 = VA(a8,  int_2 );
        a9 = S("//", y2);
        //START inline expansion of a(7)is a(9)
        if (! a7.unify(Arithmetic.evaluate(a9), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a10 = V(m);
        a11 = V(m);
        Term[] y3 = VA(a10, a11);
        a12 = S("-", y3);
        a13 = V(m);
        a14 = V(m);
        a15 = V(m);
        Term[] y4 = VA(a7,  int_1 );
        a16 = S("-", y4);
        a17 = V(m);
        Term[] y5 = VA(a4,  int_1 );
        a18 = S("-", y5);
        a19 = V(m);
        Term[] y6 = VA(a7,  int_1 );
        a20 = S("+", y6);
        return Op(FILE_rbtrees::PRED_arg_3_static_exec, VA(a7, a3, a12), Op(FILE_rbtrees::PRED_build_node_6_static_exec, VA(a4, a13, a10, a11, a14, a6), Op(FILE_builtins::PRED_is_2_static_exec, VA(a15, a16), Op(FILE_builtins::PRED_is_2_static_exec, VA(a17, a18), Op(FILE_rbtrees::PRED_construct_rbtree_6_static_exec, VA(a1, a15, a3, a17, a5, a13), Op(FILE_builtins::PRED_is_2_static_exec, VA(a19, a20), Op(FILE_rbtrees::PRED_construct_rbtree_6_static_exec, VA(a19, a2, a3, a17, a5, a14), cont)))))));
    }
/** PREDICATE: build_node/6
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final /**/ IntegerTerm PRED_build_node_6_s1 = Integer(0);

    // private final Term arg5, arg6;




    public static Operation PRED_build_node_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::build_node_6_var, FILE_rbtrees::build_node_6_var, FILE_rbtrees::build_node_6_2, FILE_rbtrees::build_node_6_2, FILE_rbtrees::build_node_6_2, FILE_rbtrees::build_node_6_2); 
    }

    private final static Operation build_node_6_var(Prolog m) { 
        m.jtry6(null, FILE_rbtrees::build_node_6_var_1);
        return build_node_6_1(m);
    }

    private final static Operation build_node_6_var_1(Prolog m) { 
        m.trust(null);
        return build_node_6_2(m);
    }

    private final static Operation build_node_6_1(Prolog m) { 
    // build_node(0,A,B,C,D,red(A,B,C,D)):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // build_node(0,A,B,C,D,red(A,B,C,D)):-['$neck_cut']
        if (! PRED_build_node_6_s1.unify(a1, m.trail))
            return m.fail();
        a6 = a6.dref();
            if (!a6.unify(C("red", a2, a3, a4, a5), m.trail)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation build_node_6_2(Prolog m) { 
    // build_node(A,B,C,D,E,black(B,C,D,E)):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // build_node(A,B,C,D,E,black(B,C,D,E)):-[]
        a6 = a6.dref();
            if (!a6.unify(C("black", a2, a3, a4, a5), m.trail)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: rb_size/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
        final static IntegerTerm int_0 = Integer(0);




    public static Operation PRED_rb_size_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rb_size(t(A,B),C):-size(B,0,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // rb_size(t(A,B),C):-[size(B,0,C)]
        a1 = a1.dref();
            a3 = V(m);
            if (!a1.unify(C("t", V(m), a3), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_size_3_static_exec, VA(a3,  int_0 , a2), cont);
    }
/** PREDICATE: size/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_size_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return size_3_top(m);
    }

    private final static Operation size_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::size_3_var, fail_0, fail_0, fail_0, FILE_rbtrees::size_3_var, fail_0); 
    }

    private final static Operation size_3_var(Prolog m) { 
        m.jtry3(null, FILE_rbtrees::size_3_var_1);
        return size_3_1(m);
    }

    private final static Operation size_3_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::size_3_var_2);
        return size_3_2(m);
    }

    private final static Operation size_3_var_2(Prolog m) { 
        m.trust(null);
        return size_3_3(m);
    }

    private final static Operation size_3_1(Prolog m) { 
    // size(black('',A,B,C),D,D):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // size(black('',A,B,C),D,D):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        if (! a2.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation size_3_2(Prolog m) { 
    // size(red(A,B,C,D),E,F):-G is E+1,size(A,G,H),size(D,H,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // size(red(A,B,C,D),E,F):-[G is E+1,size(A,G,H),size(D,H,F)]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            if (!a1.unify(C("red", a4, V(m), V(m), a5), m.trail)){
                return m.fail();
            }
        a6 = V(m);
        Term[] y1 = VA(a2,  int_1 );
        a7 = S("+", y1);
        //START inline expansion of a(6)is a(7)
        if (! a6.unify(Arithmetic.evaluate(a7), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = V(m);
        p1 = Op(FILE_rbtrees::PRED_size_3_static_exec, VA(a5, a8, a3), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a6;
        m.AREGS[2] = a8;
        m.cont = p1;
        return size_3_top(m);
    }

    private final static Operation size_3_3(Prolog m) { 
    // size(black(A,B,C,D),E,F):-G is E+1,size(A,G,H),size(D,H,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // size(black(A,B,C,D),E,F):-[G is E+1,size(A,G,H),size(D,H,F)]
        a1 = a1.dref();
            a4 = V(m);
            a5 = V(m);
            if (!a1.unify(C("black", a4, V(m), V(m), a5), m.trail)){
                return m.fail();
            }
        a6 = V(m);
        Term[] y1 = VA(a2,  int_1 );
        a7 = S("+", y1);
        //START inline expansion of a(6)is a(7)
        if (! a6.unify(Arithmetic.evaluate(a7), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = V(m);
        p1 = Op(FILE_rbtrees::PRED_size_3_static_exec, VA(a5, a8, a3), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a6;
        m.AREGS[2] = a8;
        m.cont = p1;
        return size_3_top(m);
    }
/** PREDICATE: is_rbtree/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_is_rbtree_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::is_rbtree_1_var, FILE_rbtrees::is_rbtree_1_1, FILE_rbtrees::is_rbtree_1_1, FILE_rbtrees::is_rbtree_1_1, FILE_rbtrees::is_rbtree_1_var, FILE_rbtrees::is_rbtree_1_1); 
    }

    private final static Operation is_rbtree_1_var(Prolog m) { 
        m.jtry1(null, FILE_rbtrees::is_rbtree_1_var_1);
        return is_rbtree_1_1(m);
    }

    private final static Operation is_rbtree_1_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::is_rbtree_1_var_2);
        return is_rbtree_1_2(m);
    }

    private final static Operation is_rbtree_1_var_2(Prolog m) { 
        m.trust(null);
        return is_rbtree_1_3(m);
    }

    private final static Operation is_rbtree_1_1(Prolog m) { 
    // is_rbtree(A):-var(A),!,fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_rbtree(A):-['$get_level'(B),var(A),'$cut'(B),fail]
        a2 = V(m);
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
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

    private final static Operation is_rbtree_1_2(Prolog m) { 
    // is_rbtree(t(A,A)):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_rbtree(t(A,A)):-['$neck_cut']
        a1 = a1.dref();
            a2 = V(m);
            if (!a1.unify(C("t", a2, a2), m.trail)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation is_rbtree_1_3(Prolog m) { 
    // is_rbtree(t(A,B)):-catch(rbtree1(B),msg(C,D),fail)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_rbtree(t(A,B)):-[catch(rbtrees:rbtree1(B),msg(C,D),rbtrees:fail)]
        a1 = a1.dref();
            a2 = V(m);
            if (!a1.unify(C("t", V(m), a2), m.trail)){
                return m.fail();
            }
        a3 = Closure( Op(FILE_rbtrees::PRED_rbtree1_1_static_exec, VA(a2), null));
        Term[] y1 = VA(V(m), V(m));
        a4 = S("msg", y1);
        a5 = Closure( Op(fail_0, VA(), null));
        return Op(FILE_builtins::PRED_catch_3_static_exec, VA(a3, a4, a5), cont);
    }
/** PREDICATE: rbtree1/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
        final static SymbolTerm ATOM_inf = SYM("inf");
    private static final StructureTerm PRED_rbtree1_1_s6 = S("-",  ATOM_inf );
    private static final StructureTerm PRED_rbtree1_1_s8 = S("+",  ATOM_inf );
        final static IntegerTerm int_114 = Integer(114);
        final static IntegerTerm int_111 = Integer(111);
        final static IntegerTerm int_116 = Integer(116);
        final static IntegerTerm int_32 = Integer(32);
        final static IntegerTerm int_115 = Integer(115);
        final static IntegerTerm int_104 = Integer(104);
        final static IntegerTerm int_117 = Integer(117);
        final static IntegerTerm int_108 = Integer(108);
        final static IntegerTerm int_100 = Integer(100);
        final static IntegerTerm int_98 = Integer(98);
        final static IntegerTerm int_101 = Integer(101);
        final static IntegerTerm int_97 = Integer(97);
        final static IntegerTerm int_99 = Integer(99);
        final static IntegerTerm int_107 = Integer(107);
    private static final ListTerm PRED_rbtree1_1_s26 = CONS( int_107 ,  Prolog.Nil );
    private static final ListTerm PRED_rbtree1_1_s27 = CONS( int_99 , PRED_rbtree1_1_s26);
    private static final ListTerm PRED_rbtree1_1_s28 = CONS( int_97 , PRED_rbtree1_1_s27);
    private static final ListTerm PRED_rbtree1_1_s29 = CONS( int_108 , PRED_rbtree1_1_s28);
    private static final ListTerm PRED_rbtree1_1_s30 = CONS( int_98 , PRED_rbtree1_1_s29);
    private static final ListTerm PRED_rbtree1_1_s31 = CONS( int_32 , PRED_rbtree1_1_s30);
    private static final ListTerm PRED_rbtree1_1_s32 = CONS( int_101 , PRED_rbtree1_1_s31);
    private static final ListTerm PRED_rbtree1_1_s33 = CONS( int_98 , PRED_rbtree1_1_s32);
    private static final ListTerm PRED_rbtree1_1_s34 = CONS( int_32 , PRED_rbtree1_1_s33);
    private static final ListTerm PRED_rbtree1_1_s35 = CONS( int_100 , PRED_rbtree1_1_s34);
    private static final ListTerm PRED_rbtree1_1_s36 = CONS( int_108 , PRED_rbtree1_1_s35);
    private static final ListTerm PRED_rbtree1_1_s37 = CONS( int_117 , PRED_rbtree1_1_s36);
    private static final ListTerm PRED_rbtree1_1_s38 = CONS( int_111 , PRED_rbtree1_1_s37);
    private static final ListTerm PRED_rbtree1_1_s39 = CONS( int_104 , PRED_rbtree1_1_s38);
    private static final ListTerm PRED_rbtree1_1_s40 = CONS( int_115 , PRED_rbtree1_1_s39);
    private static final ListTerm PRED_rbtree1_1_s41 = CONS( int_32 , PRED_rbtree1_1_s40);
    private static final ListTerm PRED_rbtree1_1_s42 = CONS( int_116 , PRED_rbtree1_1_s41);
    private static final ListTerm PRED_rbtree1_1_s43 = CONS( int_111 , PRED_rbtree1_1_s42);
    private static final ListTerm PRED_rbtree1_1_s44 = CONS( int_111 , PRED_rbtree1_1_s43);
    private static final ListTerm PRED_rbtree1_1_s45 = CONS( int_114 , PRED_rbtree1_1_s44);
    private static final StructureTerm PRED_rbtree1_1_s47 = S("msg", PRED_rbtree1_1_s45,  Prolog.Nil );




    public static Operation PRED_rbtree1_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::rbtree1_1_var, fail_0, fail_0, fail_0, FILE_rbtrees::rbtree1_1_var, fail_0); 
    }

    private final static Operation rbtree1_1_var(Prolog m) { 
        m.jtry1(null, FILE_rbtrees::rbtree1_1_var_1);
        return rbtree1_1_1(m);
    }

    private final static Operation rbtree1_1_var_1(Prolog m) { 
        m.trust(null);
        return rbtree1_1_2(m);
    }

    private final static Operation rbtree1_1_1(Prolog m) { 
    // rbtree1(black(A,B,C,D)):-find_path_blacks(A,0,E),check_rbtree(A,-inf,B,E),check_rbtree(D,B,+inf,E)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // rbtree1(black(A,B,C,D)):-[find_path_blacks(A,0,E),check_rbtree(A,-inf,B,E),check_rbtree(D,B,+inf,E)]
        a1 = a1.dref();
            a2 = V(m);
            a3 = V(m);
            a4 = V(m);
            if (!a1.unify(C("black", a2, a3, V(m), a4), m.trail)){
                return m.fail();
            }
        a5 = V(m);
        return Op(FILE_rbtrees::PRED_find_path_blacks_3_static_exec, VA(a2,  int_0 , a5), Op(FILE_rbtrees::PRED_check_rbtree_4_static_exec, VA(a2, PRED_rbtree1_1_s6, a3, a5), Op(FILE_rbtrees::PRED_check_rbtree_4_static_exec, VA(a4, a3, PRED_rbtree1_1_s8, a5), cont)));
    }

    private final static Operation rbtree1_1_2(Prolog m) { 
    // rbtree1(red(A,B,C,D)):-throw(msg([114,111,111,116,32,115,104,111,117,108,100,32,98,101,32,98,108,97,99,107],[]))
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // rbtree1(red(A,B,C,D)):-[throw(msg([114,111,111,116,32,115,104,111,117,108,100,32,98,101,32,98,108,97,99,107],[]))]
        a1 = a1.dref();
            if (!a1.unify(C("red", V(m), V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_throw_1_static_exec, VA(PRED_rbtree1_1_s47), cont);
    }
/** PREDICATE: find_path_blacks/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_find_path_blacks_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return find_path_blacks_3_top(m);
    }

    private final static Operation find_path_blacks_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::find_path_blacks_3_var, fail_0, fail_0, fail_0, FILE_rbtrees::find_path_blacks_3_var, fail_0); 
    }

    private final static Operation find_path_blacks_3_var(Prolog m) { 
        m.jtry3(null, FILE_rbtrees::find_path_blacks_3_var_1);
        return find_path_blacks_3_1(m);
    }

    private final static Operation find_path_blacks_3_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::find_path_blacks_3_var_2);
        return find_path_blacks_3_2(m);
    }

    private final static Operation find_path_blacks_3_var_2(Prolog m) { 
        m.trust(null);
        return find_path_blacks_3_3(m);
    }

    private final static Operation find_path_blacks_3_1(Prolog m) { 
    // find_path_blacks(black('',A,B,''),C,C):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // find_path_blacks(black('',A,B,''),C,C):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        if (! a2.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation find_path_blacks_3_2(Prolog m) { 
    // find_path_blacks(black(A,B,C,D),E,F):-G is E+1,find_path_blacks(A,G,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // find_path_blacks(black(A,B,C,D),E,F):-[G is E+1,find_path_blacks(A,G,F)]
        a1 = a1.dref();
            a4 = V(m);
            if (!a1.unify(C("black", a4, V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        a5 = V(m);
        Term[] y1 = VA(a2,  int_1 );
        a6 = S("+", y1);
        //START inline expansion of a(5)is a(6)
        if (! a5.unify(Arithmetic.evaluate(a6), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a5;
        m.AREGS[2] = a3;
m.cont = cont;
        return find_path_blacks_3_top(m);
    }

    private final static Operation find_path_blacks_3_3(Prolog m) { 
    // find_path_blacks(red(A,B,C,D),E,F):-find_path_blacks(A,E,F)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // find_path_blacks(red(A,B,C,D),E,F):-[find_path_blacks(A,E,F)]
        a1 = a1.dref();
            a4 = V(m);
            if (!a1.unify(C("red", a4, V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
m.cont = cont;
        return find_path_blacks_3_top(m);
    }
/** PREDICATE: check_rbtree/4
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/




    public static Operation PRED_check_rbtree_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::check_rbtree_4_var, fail_0, fail_0, fail_0, FILE_rbtrees::check_rbtree_4_var, fail_0); 
    }

    private final static Operation check_rbtree_4_var(Prolog m) { 
        m.jtry4(null, FILE_rbtrees::check_rbtree_4_var_1);
        return check_rbtree_4_1(m);
    }

    private final static Operation check_rbtree_4_var_1(Prolog m) { 
        m.retry(null, FILE_rbtrees::check_rbtree_4_var_2);
        return check_rbtree_4_2(m);
    }

    private final static Operation check_rbtree_4_var_2(Prolog m) { 
        m.trust(null);
        return check_rbtree_4_3(m);
    }

    private final static Operation check_rbtree_4_1(Prolog m) { 
    // check_rbtree(black('',A,B,''),C,D,E):-!,check_height(E,C,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // check_rbtree(black('',A,B,''),C,D,E):-['$neck_cut',check_height(E,C,D)]
        a1 = a1.dref();
            if (!a1.unify(C("black",  ATOM_ , V(m), V(m),  ATOM_ ), m.trail)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return Op(FILE_rbtrees::PRED_check_height_3_static_exec, VA(a4, a2, a3), cont);
    }

    private final static Operation check_rbtree_4_2(Prolog m) { 
    // check_rbtree(red(A,B,C,D),E,F,G):-check_val(B,E,F),check_red_child(A),check_red_child(D),check_rbtree(A,E,B,G),check_rbtree(D,B,F,G)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // check_rbtree(red(A,B,C,D),E,F,G):-[check_val(B,E,F),check_red_child(A),check_red_child(D),check_rbtree(A,E,B,G),check_rbtree(D,B,F,G)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("red", a5, a6, V(m), a7), m.trail)){
                return m.fail();
            }
        return Op(FILE_rbtrees::PRED_check_val_3_static_exec, VA(a6, a2, a3), Op(FILE_rbtrees::PRED_check_red_child_1_static_exec, VA(a5), Op(FILE_rbtrees::PRED_check_red_child_1_static_exec, VA(a7), Op(FILE_rbtrees::PRED_check_rbtree_4_static_exec, VA(a5, a2, a6, a4), Op(FILE_rbtrees::PRED_check_rbtree_4_static_exec, VA(a7, a6, a3, a4), cont)))));
    }

    private final static Operation check_rbtree_4_3(Prolog m) { 
    // check_rbtree(black(A,B,C,D),E,F,G):-check_val(B,E,F),H is G-1,check_rbtree(A,E,B,H),check_rbtree(D,B,F,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // check_rbtree(black(A,B,C,D),E,F,G):-[check_val(B,E,F),H is G-1,check_rbtree(A,E,B,H),check_rbtree(D,B,F,H)]
        a1 = a1.dref();
            a5 = V(m);
            a6 = V(m);
            a7 = V(m);
            if (!a1.unify(C("black", a5, a6, V(m), a7), m.trail)){
                return m.fail();
            }
        a8 = V(m);
        Term[] y1 = VA(a4,  int_1 );
        a9 = S("-", y1);
        return Op(FILE_rbtrees::PRED_check_val_3_static_exec, VA(a6, a2, a3), Op(FILE_builtins::PRED_is_2_static_exec, VA(a8, a9), Op(FILE_rbtrees::PRED_check_rbtree_4_static_exec, VA(a5, a2, a6, a8), Op(FILE_rbtrees::PRED_check_rbtree_4_static_exec, VA(a7, a6, a3, a8), cont))));
    }
/** PREDICATE: check_height/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final /**/ IntegerTerm PRED_check_height_3_s1 = Integer(0);
        final static IntegerTerm int_85 = Integer(85);
        final static IntegerTerm int_110 = Integer(110);
        final static IntegerTerm int_126 = Integer(126);
        final static IntegerTerm int_119 = Integer(119);
    private static final ListTerm PRED_check_height_3_s16 = CONS( int_110 ,  Prolog.Nil );
    private static final ListTerm PRED_check_height_3_s17 = CONS( int_126 , PRED_check_height_3_s16);
    private static final ListTerm PRED_check_height_3_s18 = CONS( int_119 , PRED_check_height_3_s17);
    private static final ListTerm PRED_check_height_3_s19 = CONS( int_126 , PRED_check_height_3_s18);
    private static final ListTerm PRED_check_height_3_s20 = CONS( int_32 , PRED_check_height_3_s19);
    private static final ListTerm PRED_check_height_3_s21 = CONS( int_100 , PRED_check_height_3_s20);
    private static final ListTerm PRED_check_height_3_s22 = CONS( int_110 , PRED_check_height_3_s21);
    private static final ListTerm PRED_check_height_3_s23 = CONS( int_97 , PRED_check_height_3_s22);
    private static final ListTerm PRED_check_height_3_s24 = CONS( int_32 , PRED_check_height_3_s23);
    private static final ListTerm PRED_check_height_3_s25 = CONS( int_119 , PRED_check_height_3_s24);
    private static final ListTerm PRED_check_height_3_s26 = CONS( int_126 , PRED_check_height_3_s25);
    private static final ListTerm PRED_check_height_3_s27 = CONS( int_32 , PRED_check_height_3_s26);
    private static final ListTerm PRED_check_height_3_s28 = CONS( int_110 , PRED_check_height_3_s27);
    private static final ListTerm PRED_check_height_3_s29 = CONS( int_101 , PRED_check_height_3_s28);
    private static final ListTerm PRED_check_height_3_s30 = CONS( int_101 , PRED_check_height_3_s29);
    private static final ListTerm PRED_check_height_3_s31 = CONS( int_119 , PRED_check_height_3_s30);
    private static final ListTerm PRED_check_height_3_s32 = CONS( int_116 , PRED_check_height_3_s31);
    private static final ListTerm PRED_check_height_3_s33 = CONS( int_101 , PRED_check_height_3_s32);
    private static final ListTerm PRED_check_height_3_s34 = CONS( int_98 , PRED_check_height_3_s33);
    private static final ListTerm PRED_check_height_3_s35 = CONS( int_32 , PRED_check_height_3_s34);
    private static final ListTerm PRED_check_height_3_s36 = CONS( int_100 , PRED_check_height_3_s35);
    private static final ListTerm PRED_check_height_3_s37 = CONS( int_126 , PRED_check_height_3_s36);
    private static final ListTerm PRED_check_height_3_s38 = CONS( int_32 , PRED_check_height_3_s37);
    private static final ListTerm PRED_check_height_3_s39 = CONS( int_101 , PRED_check_height_3_s38);
    private static final ListTerm PRED_check_height_3_s40 = CONS( int_99 , PRED_check_height_3_s39);
    private static final ListTerm PRED_check_height_3_s41 = CONS( int_110 , PRED_check_height_3_s40);
    private static final ListTerm PRED_check_height_3_s42 = CONS( int_97 , PRED_check_height_3_s41);
    private static final ListTerm PRED_check_height_3_s43 = CONS( int_108 , PRED_check_height_3_s42);
    private static final ListTerm PRED_check_height_3_s44 = CONS( int_97 , PRED_check_height_3_s43);
    private static final ListTerm PRED_check_height_3_s45 = CONS( int_98 , PRED_check_height_3_s44);
    private static final ListTerm PRED_check_height_3_s46 = CONS( int_110 , PRED_check_height_3_s45);
    private static final ListTerm PRED_check_height_3_s47 = CONS( int_85 , PRED_check_height_3_s46);




    public static Operation PRED_check_height_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::check_height_3_var, FILE_rbtrees::check_height_3_var, FILE_rbtrees::check_height_3_2, FILE_rbtrees::check_height_3_2, FILE_rbtrees::check_height_3_2, FILE_rbtrees::check_height_3_2); 
    }

    private final static Operation check_height_3_var(Prolog m) { 
        m.jtry3(null, FILE_rbtrees::check_height_3_var_1);
        return check_height_3_1(m);
    }

    private final static Operation check_height_3_var_1(Prolog m) { 
        m.trust(null);
        return check_height_3_2(m);
    }

    private final static Operation check_height_3_1(Prolog m) { 
    // check_height(0,A,B):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // check_height(0,A,B):-['$neck_cut']
        if (! PRED_check_height_3_s1.unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation check_height_3_2(Prolog m) { 
    // check_height(A,B,C):-throw(msg([85,110,98,97,108,97,110,99,101,32,126,100,32,98,101,116,119,101,101,110,32,126,119,32,97,110,100,32,126,119,126,110],[A,B,C]))
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // check_height(A,B,C):-[throw(msg([85,110,98,97,108,97,110,99,101,32,126,100,32,98,101,116,119,101,101,110,32,126,119,32,97,110,100,32,126,119,126,110],[A,B,C]))]
        a4 = CONS(a3,  Prolog.Nil );
        a5 = CONS(a2, a4);
        a6 = CONS(a1, a5);
        Term[] y1 = VA(PRED_check_height_3_s47, a6);
        a7 = S("msg", y1);
        return Op(FILE_rbtrees::PRED_throw_1_static_exec, VA(a7), cont);
    }
/** PREDICATE: $dummy_25_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final StructureTerm PRED_$dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_s4 = S("-",  ATOM_inf );




    public static Operation PRED_$dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_rbtrees::$dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_sub_1);
        return $dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_1(m);
    }

    private final static Operation $dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_2(m);
    }

    private final static Operation $dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_1(Prolog m) { 
    // '$dummy_25_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-A@>B
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_25_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-['$after'(A,B)]
        //START inline expansion of $after(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.compareTo(a2) <= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_2(Prolog m) { 
    // '$dummy_25_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-B== -inf
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_25_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-['$equality_of_term'(B,-inf)]
        //START inline expansion of $equality_of_term(a(2),s(4))
        a2 = a2.dref();
        if (! a2.equalsTerm(PRED_$dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_s4)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_26_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl/2
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
    private static final StructureTerm PRED_$dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_s4 = S("+",  ATOM_inf );




    public static Operation PRED_$dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_rbtrees::$dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_sub_1);
        return $dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_1(m);
    }

    private final static Operation $dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_2(m);
    }

    private final static Operation $dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_1(Prolog m) { 
    // '$dummy_26_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-A@<B
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_26_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-['$before'(A,B)]
        //START inline expansion of $before(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.compareTo(a2) >= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_2(Prolog m) { 
    // '$dummy_26_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-B== +inf
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_26_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B):-['$equality_of_term'(B,+inf)]
        //START inline expansion of $equality_of_term(a(2),s(4))
        a2 = a2.dref();
        if (! a2.equalsTerm(PRED_$dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_s4)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: check_val/3
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
        final static IntegerTerm int_58 = Integer(58);
    private static final ListTerm PRED_check_val_3_s15 = CONS( int_110 ,  Prolog.Nil );
    private static final ListTerm PRED_check_val_3_s16 = CONS( int_126 , PRED_check_val_3_s15);
    private static final ListTerm PRED_check_val_3_s17 = CONS( int_119 , PRED_check_val_3_s16);
    private static final ListTerm PRED_check_val_3_s18 = CONS( int_126 , PRED_check_val_3_s17);
    private static final ListTerm PRED_check_val_3_s19 = CONS( int_32 , PRED_check_val_3_s18);
    private static final ListTerm PRED_check_val_3_s20 = CONS( int_100 , PRED_check_val_3_s19);
    private static final ListTerm PRED_check_val_3_s21 = CONS( int_110 , PRED_check_val_3_s20);
    private static final ListTerm PRED_check_val_3_s22 = CONS( int_97 , PRED_check_val_3_s21);
    private static final ListTerm PRED_check_val_3_s23 = CONS( int_32 , PRED_check_val_3_s22);
    private static final ListTerm PRED_check_val_3_s24 = CONS( int_119 , PRED_check_val_3_s23);
    private static final ListTerm PRED_check_val_3_s25 = CONS( int_126 , PRED_check_val_3_s24);
    private static final ListTerm PRED_check_val_3_s26 = CONS( int_32 , PRED_check_val_3_s25);
    private static final ListTerm PRED_check_val_3_s27 = CONS( int_110 , PRED_check_val_3_s26);
    private static final ListTerm PRED_check_val_3_s28 = CONS( int_101 , PRED_check_val_3_s27);
    private static final ListTerm PRED_check_val_3_s29 = CONS( int_101 , PRED_check_val_3_s28);
    private static final ListTerm PRED_check_val_3_s30 = CONS( int_119 , PRED_check_val_3_s29);
    private static final ListTerm PRED_check_val_3_s31 = CONS( int_116 , PRED_check_val_3_s30);
    private static final ListTerm PRED_check_val_3_s32 = CONS( int_101 , PRED_check_val_3_s31);
    private static final ListTerm PRED_check_val_3_s33 = CONS( int_98 , PRED_check_val_3_s32);
    private static final ListTerm PRED_check_val_3_s34 = CONS( int_32 , PRED_check_val_3_s33);
    private static final ListTerm PRED_check_val_3_s35 = CONS( int_116 , PRED_check_val_3_s34);
    private static final ListTerm PRED_check_val_3_s36 = CONS( int_111 , PRED_check_val_3_s35);
    private static final ListTerm PRED_check_val_3_s37 = CONS( int_110 , PRED_check_val_3_s36);
    private static final ListTerm PRED_check_val_3_s38 = CONS( int_32 , PRED_check_val_3_s37);
    private static final ListTerm PRED_check_val_3_s39 = CONS( int_119 , PRED_check_val_3_s38);
    private static final ListTerm PRED_check_val_3_s40 = CONS( int_126 , PRED_check_val_3_s39);
    private static final ListTerm PRED_check_val_3_s41 = CONS( int_32 , PRED_check_val_3_s40);
    private static final ListTerm PRED_check_val_3_s42 = CONS( int_58 , PRED_check_val_3_s41);
    private static final ListTerm PRED_check_val_3_s43 = CONS( int_100 , PRED_check_val_3_s42);
    private static final ListTerm PRED_check_val_3_s44 = CONS( int_101 , PRED_check_val_3_s43);
    private static final ListTerm PRED_check_val_3_s45 = CONS( int_114 , PRED_check_val_3_s44);
    private static final ListTerm PRED_check_val_3_s46 = CONS( int_101 , PRED_check_val_3_s45);
    private static final ListTerm PRED_check_val_3_s47 = CONS( int_100 , PRED_check_val_3_s46);
    private static final ListTerm PRED_check_val_3_s48 = CONS( int_114 , PRED_check_val_3_s47);
    private static final ListTerm PRED_check_val_3_s49 = CONS( int_111 , PRED_check_val_3_s48);
    private static final ListTerm PRED_check_val_3_s50 = CONS( int_32 , PRED_check_val_3_s49);
    private static final ListTerm PRED_check_val_3_s51 = CONS( int_116 , PRED_check_val_3_s50);
    private static final ListTerm PRED_check_val_3_s52 = CONS( int_111 , PRED_check_val_3_s51);
    private static final ListTerm PRED_check_val_3_s53 = CONS( int_110 , PRED_check_val_3_s52);




    public static Operation PRED_check_val_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_rbtrees::check_val_3_sub_1);
        return check_val_3_1(m);
    }

    private final static Operation check_val_3_sub_1(Prolog m) { 
        m.trust(null);
        return check_val_3_2(m);
    }

    private final static Operation check_val_3_1(Prolog m) { 
    // check_val(A,B,C):-'$dummy_25_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B),'$dummy_26_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,C),!
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // check_val(A,B,C):-['$get_level'(D),'$dummy_25_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,B),'$dummy_26_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl'(A,C),'$cut'(D)]
        a4 = V(m);
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return Op(FILE_rbtrees::PRED_$dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec, VA(a1, a2), Op(FILE_rbtrees::PRED_$dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec, VA(a1, a3), Op(FILE_rbtrees::PRED_$cut_1_static_exec, VA(a4), cont)));
    }

    private final static Operation check_val_3_2(Prolog m) { 
    // check_val(A,B,C):-throw(msg([110,111,116,32,111,114,100,101,114,101,100,58,32,126,119,32,110,111,116,32,98,101,116,119,101,101,110,32,126,119,32,97,110,100,32,126,119,126,110],[A,B,C]))
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // check_val(A,B,C):-[throw(msg([110,111,116,32,111,114,100,101,114,101,100,58,32,126,119,32,110,111,116,32,98,101,116,119,101,101,110,32,126,119,32,97,110,100,32,126,119,126,110],[A,B,C]))]
        a4 = CONS(a3,  Prolog.Nil );
        a5 = CONS(a2, a4);
        a6 = CONS(a1, a5);
        Term[] y1 = VA(PRED_check_val_3_s53, a6);
        a7 = S("msg", y1);
        return Op(FILE_rbtrees::PRED_throw_1_static_exec, VA(a7), cont);
    }
/** PREDICATE: check_red_child/1
from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl
*/
        final static IntegerTerm int_109 = Integer(109);
    private static final ListTerm PRED_check_red_child_1_s18 = CONS( int_110 ,  Prolog.Nil );
    private static final ListTerm PRED_check_red_child_1_s19 = CONS( int_126 , PRED_check_red_child_1_s18);
    private static final ListTerm PRED_check_red_child_1_s20 = CONS( int_119 , PRED_check_red_child_1_s19);
    private static final ListTerm PRED_check_red_child_1_s21 = CONS( int_126 , PRED_check_red_child_1_s20);
    private static final ListTerm PRED_check_red_child_1_s22 = CONS( int_32 , PRED_check_red_child_1_s21);
    private static final ListTerm PRED_check_red_child_1_s23 = CONS( int_58 , PRED_check_red_child_1_s22);
    private static final ListTerm PRED_check_red_child_1_s24 = CONS( int_100 , PRED_check_red_child_1_s23);
    private static final ListTerm PRED_check_red_child_1_s25 = CONS( int_101 , PRED_check_red_child_1_s24);
    private static final ListTerm PRED_check_red_child_1_s26 = CONS( int_114 , PRED_check_red_child_1_s25);
    private static final ListTerm PRED_check_red_child_1_s27 = CONS( int_32 , PRED_check_red_child_1_s26);
    private static final ListTerm PRED_check_red_child_1_s28 = CONS( int_101 , PRED_check_red_child_1_s27);
    private static final ListTerm PRED_check_red_child_1_s29 = CONS( int_98 , PRED_check_red_child_1_s28);
    private static final ListTerm PRED_check_red_child_1_s30 = CONS( int_32 , PRED_check_red_child_1_s29);
    private static final ListTerm PRED_check_red_child_1_s31 = CONS( int_116 , PRED_check_red_child_1_s30);
    private static final ListTerm PRED_check_red_child_1_s32 = CONS( int_115 , PRED_check_red_child_1_s31);
    private static final ListTerm PRED_check_red_child_1_s33 = CONS( int_117 , PRED_check_red_child_1_s32);
    private static final ListTerm PRED_check_red_child_1_s34 = CONS( int_109 , PRED_check_red_child_1_s33);




    public static Operation PRED_check_red_child_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_rbtrees::check_red_child_1_var, fail_0, fail_0, fail_0, FILE_rbtrees::check_red_child_1_var, fail_0); 
    }

    private final static Operation check_red_child_1_var(Prolog m) { 
        m.jtry1(null, FILE_rbtrees::check_red_child_1_var_1);
        return check_red_child_1_1(m);
    }

    private final static Operation check_red_child_1_var_1(Prolog m) { 
        m.trust(null);
        return check_red_child_1_2(m);
    }

    private final static Operation check_red_child_1_1(Prolog m) { 
    // check_red_child(black(A,B,C,D)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // check_red_child(black(A,B,C,D)):-[]
        a1 = a1.dref();
            if (!a1.unify(C("black", V(m), V(m), V(m), V(m)), m.trail)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation check_red_child_1_2(Prolog m) { 
    // check_red_child(red(A,B,C,D)):-throw(msg([109,117,115,116,32,98,101,32,114,101,100,58,32,126,119,126,110],[B]))
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // check_red_child(red(A,B,C,D)):-[throw(msg([109,117,115,116,32,98,101,32,114,101,100,58,32,126,119,126,110],[B]))]
        a1 = a1.dref();
            a2 = V(m);
            if (!a1.unify(C("red", V(m), a2, V(m), V(m)), m.trail)){
                return m.fail();
            }
        a3 = CONS(a2,  Prolog.Nil );
        Term[] y1 = VA(PRED_check_red_child_1_s34, a3);
        a4 = S("msg", y1);
        return Op(FILE_rbtrees::PRED_throw_1_static_exec, VA(a4), cont);
    }
static {   PredTable.registerBuiltin("rb_new",1,FILE_rbtrees::PRED_rb_new_1_static_exec);
   PredTable.registerBuiltin("rb_empty",1,FILE_rbtrees::PRED_rb_empty_1_static_exec);
   PredTable.registerBuiltin("rb_lookup",3,FILE_rbtrees::PRED_rb_lookup_3_static_exec);
   PredTable.registerBuiltin("lookup",3,FILE_rbtrees::PRED_lookup_3_static_exec);
   PredTable.registerBuiltin("lookup",4,FILE_rbtrees::PRED_lookup_4_static_exec);
   PredTable.registerBuiltin("rb_min",3,FILE_rbtrees::PRED_rb_min_3_static_exec);
   PredTable.registerBuiltin("min",3,FILE_rbtrees::PRED_min_3_static_exec);
   PredTable.registerBuiltin("rb_max",3,FILE_rbtrees::PRED_rb_max_3_static_exec);
   PredTable.registerBuiltin("max",3,FILE_rbtrees::PRED_max_3_static_exec);
   PredTable.registerBuiltin("rb_next",4,FILE_rbtrees::PRED_rb_next_4_static_exec);
   PredTable.registerBuiltin("next",5,FILE_rbtrees::PRED_next_5_static_exec);
   PredTable.registerBuiltin("next",8,FILE_rbtrees::PRED_next_8_static_exec);
   PredTable.registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",4,FILE_rbtrees::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_static_exec);
   PredTable.registerBuiltin("rb_previous",4,FILE_rbtrees::PRED_rb_previous_4_static_exec);
   PredTable.registerBuiltin("previous",5,FILE_rbtrees::PRED_previous_5_static_exec);
   PredTable.registerBuiltin("previous",8,FILE_rbtrees::PRED_previous_8_static_exec);
   PredTable.registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",4,FILE_rbtrees::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_4_static_exec);
   PredTable.registerBuiltin("rb_update",5,FILE_rbtrees::PRED_rb_update_5_static_exec);
   PredTable.registerBuiltin("rb_update",4,FILE_rbtrees::PRED_rb_update_4_static_exec);
   PredTable.registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",11,FILE_rbtrees::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec);
   PredTable.registerBuiltin("$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",10,FILE_rbtrees::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec);
   PredTable.registerBuiltin("update",5,FILE_rbtrees::PRED_update_5_static_exec);
   PredTable.registerBuiltin("$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",11,FILE_rbtrees::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec);
   PredTable.registerBuiltin("$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",10,FILE_rbtrees::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec);
   PredTable.registerBuiltin("rb_apply",4,FILE_rbtrees::PRED_rb_apply_4_static_exec);
   PredTable.registerBuiltin("$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",9,FILE_rbtrees::PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec);
   PredTable.registerBuiltin("$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",9,FILE_rbtrees::PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec);
   PredTable.registerBuiltin("apply",4,FILE_rbtrees::PRED_apply_4_static_exec);
   PredTable.registerBuiltin("$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",9,FILE_rbtrees::PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec);
   PredTable.registerBuiltin("$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",9,FILE_rbtrees::PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_9_static_exec);
   PredTable.registerBuiltin("rb_in",3,FILE_rbtrees::PRED_rb_in_3_static_exec);
   PredTable.registerBuiltin("enum",3,FILE_rbtrees::PRED_enum_3_static_exec);
   PredTable.registerBuiltin("enum_cases",6,FILE_rbtrees::PRED_enum_cases_6_static_exec);
   PredTable.registerBuiltin("rb_insert",4,FILE_rbtrees::PRED_rb_insert_4_static_exec);
   PredTable.registerBuiltin("insert",5,FILE_rbtrees::PRED_insert_5_static_exec);
   PredTable.registerBuiltin("insert2",6,FILE_rbtrees::PRED_insert2_6_static_exec);
   PredTable.registerBuiltin("$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",10,FILE_rbtrees::PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec);
   PredTable.registerBuiltin("$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",7,FILE_rbtrees::PRED_$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_static_exec);
   PredTable.registerBuiltin("$dummy_12_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",11,FILE_rbtrees::PRED_$dummy_12_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec);
   PredTable.registerBuiltin("$dummy_13_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",7,FILE_rbtrees::PRED_$dummy_13_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_7_static_exec);
   PredTable.registerBuiltin("rb_insert_new",4,FILE_rbtrees::PRED_rb_insert_new_4_static_exec);
   PredTable.registerBuiltin("insert_new",5,FILE_rbtrees::PRED_insert_new_5_static_exec);
   PredTable.registerBuiltin("insert_new_2",6,FILE_rbtrees::PRED_insert_new_2_6_static_exec);
   PredTable.registerBuiltin("$dummy_14_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",10,FILE_rbtrees::PRED_$dummy_14_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_10_static_exec);
   PredTable.registerBuiltin("$dummy_15_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",2,FILE_rbtrees::PRED_$dummy_15_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_16_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",11,FILE_rbtrees::PRED_$dummy_16_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_11_static_exec);
   PredTable.registerBuiltin("$dummy_17_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",2,FILE_rbtrees::PRED_$dummy_17_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec);
   PredTable.registerBuiltin("fix_root",2,FILE_rbtrees::PRED_fix_root_2_static_exec);
   PredTable.registerBuiltin("fix_left",4,FILE_rbtrees::PRED_fix_left_4_static_exec);
   PredTable.registerBuiltin("fix_left",3,FILE_rbtrees::PRED_fix_left_3_static_exec);
   PredTable.registerBuiltin("fix_right",4,FILE_rbtrees::PRED_fix_right_4_static_exec);
   PredTable.registerBuiltin("fix_right",3,FILE_rbtrees::PRED_fix_right_3_static_exec);
   PredTable.registerBuiltin("rb_delete",3,FILE_rbtrees::PRED_rb_delete_3_static_exec);
   PredTable.registerBuiltin("rb_delete",4,FILE_rbtrees::PRED_rb_delete_4_static_exec);
   PredTable.registerBuiltin("delete",5,FILE_rbtrees::PRED_delete_5_static_exec);
   PredTable.registerBuiltin("rb_del_min",4,FILE_rbtrees::PRED_rb_del_min_4_static_exec);
   PredTable.registerBuiltin("del_min",6,FILE_rbtrees::PRED_del_min_6_static_exec);
   PredTable.registerBuiltin("rb_del_max",4,FILE_rbtrees::PRED_rb_del_max_4_static_exec);
   PredTable.registerBuiltin("del_max",6,FILE_rbtrees::PRED_del_max_6_static_exec);
   PredTable.registerBuiltin("delete_red_node",4,FILE_rbtrees::PRED_delete_red_node_4_static_exec);
   PredTable.registerBuiltin("delete_black_node",4,FILE_rbtrees::PRED_delete_black_node_4_static_exec);
   PredTable.registerBuiltin("delete_next",5,FILE_rbtrees::PRED_delete_next_5_static_exec);
   PredTable.registerBuiltin("fixup_left",4,FILE_rbtrees::PRED_fixup_left_4_static_exec);
   PredTable.registerBuiltin("fixup2",3,FILE_rbtrees::PRED_fixup2_3_static_exec);
   PredTable.registerBuiltin("fixup_right",4,FILE_rbtrees::PRED_fixup_right_4_static_exec);
   PredTable.registerBuiltin("fixup3",3,FILE_rbtrees::PRED_fixup3_3_static_exec);
   PredTable.registerBuiltin("rb_visit",2,FILE_rbtrees::PRED_rb_visit_2_static_exec);
   PredTable.registerBuiltin("visit",3,FILE_rbtrees::PRED_visit_3_static_exec);
   PredTable.registerBuiltin("rb_map",3,FILE_rbtrees::PRED_rb_map_3_static_exec);
   PredTable.registerBuiltin("map",4,FILE_rbtrees::PRED_map_4_static_exec);
   PredTable.registerBuiltin("rb_map",2,FILE_rbtrees::PRED_rb_map_2_static_exec);
   PredTable.registerBuiltin("map",2,FILE_rbtrees::PRED_map_2_static_exec);
   PredTable.registerBuiltin("rb_fold",4,FILE_rbtrees::PRED_rb_fold_4_static_exec);
   PredTable.registerBuiltin("$dummy_18_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",8,FILE_rbtrees::PRED_$dummy_18_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_static_exec);
   PredTable.registerBuiltin("fold",4,FILE_rbtrees::PRED_fold_4_static_exec);
   PredTable.registerBuiltin("fold_parts",6,FILE_rbtrees::PRED_fold_parts_6_static_exec);
   PredTable.registerBuiltin("rb_clone",3,FILE_rbtrees::PRED_rb_clone_3_static_exec);
   PredTable.registerBuiltin("clone",5,FILE_rbtrees::PRED_clone_5_static_exec);
   PredTable.registerBuiltin("rb_partial_map",4,FILE_rbtrees::PRED_rb_partial_map_4_static_exec);
   PredTable.registerBuiltin("partial_map",6,FILE_rbtrees::PRED_partial_map_6_static_exec);
   PredTable.registerBuiltin("$dummy_19_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",12,FILE_rbtrees::PRED_$dummy_19_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_static_exec);
   PredTable.registerBuiltin("$dummy_21_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",3,FILE_rbtrees::PRED_$dummy_21_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_20_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",8,FILE_rbtrees::PRED_$dummy_20_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_static_exec);
   PredTable.registerBuiltin("$dummy_22_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",12,FILE_rbtrees::PRED_$dummy_22_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_12_static_exec);
   PredTable.registerBuiltin("$dummy_24_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",3,FILE_rbtrees::PRED_$dummy_24_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_23_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",8,FILE_rbtrees::PRED_$dummy_23_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_8_static_exec);
   PredTable.registerBuiltin("rb_keys",2,FILE_rbtrees::PRED_rb_keys_2_static_exec);
   PredTable.registerBuiltin("keys",3,FILE_rbtrees::PRED_keys_3_static_exec);
   PredTable.registerBuiltin("list_to_rbtree",2,FILE_rbtrees::PRED_list_to_rbtree_2_static_exec);
   PredTable.registerBuiltin("ord_list_to_rbtree",2,FILE_rbtrees::PRED_ord_list_to_rbtree_2_static_exec);
   PredTable.registerBuiltin("construct_rbtree",6,FILE_rbtrees::PRED_construct_rbtree_6_static_exec);
   PredTable.registerBuiltin("build_node",6,FILE_rbtrees::PRED_build_node_6_static_exec);
   PredTable.registerBuiltin("rb_size",2,FILE_rbtrees::PRED_rb_size_2_static_exec);
   PredTable.registerBuiltin("size",3,FILE_rbtrees::PRED_size_3_static_exec);
   PredTable.registerBuiltin("is_rbtree",1,FILE_rbtrees::PRED_is_rbtree_1_static_exec);
   PredTable.registerBuiltin("rbtree1",1,FILE_rbtrees::PRED_rbtree1_1_static_exec);
   PredTable.registerBuiltin("find_path_blacks",3,FILE_rbtrees::PRED_find_path_blacks_3_static_exec);
   PredTable.registerBuiltin("check_rbtree",4,FILE_rbtrees::PRED_check_rbtree_4_static_exec);
   PredTable.registerBuiltin("check_height",3,FILE_rbtrees::PRED_check_height_3_static_exec);
   PredTable.registerBuiltin("$dummy_25_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",2,FILE_rbtrees::PRED_$dummy_25_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_26_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/rbtrees.pl","$dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl",2,FILE_rbtrees::PRED_$dummy_26_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Frbtrees$002Epl_2_static_exec);
   PredTable.registerBuiltin("check_val",3,FILE_rbtrees::PRED_check_val_3_static_exec);
   PredTable.registerBuiltin("check_red_child",1,FILE_rbtrees::PRED_check_red_child_1_static_exec);
}
 public static void loadFile(){}

}


