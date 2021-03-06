package SxxMachine;

import static SxxMachine.pterm.TermData.*;
@SuppressWarnings("unused")
public class FILE_asm extends FILE_system {
/** PREDICATE: determinate/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-pass20/bench/asm.pl
*/
    // main(determinate/1,public)




    public static Operation PRED_determinate_1_static_exec(Prolog m) {
        final Operation cont = m.cont; TermArray LARG = m.AREGS; final Operation thiz = m.pred;
    // determinate(A):-true
        m.setB0();
         Term a1;
        a1 = LARG.getAreg0();
    // determinate(A):-[]
        return cont;
    }
/** PREDICATE: setup_determinates/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-pass20/bench/asm.pl
*/
    // main(setup_determinates/0,public)
        final static Functor FUNCTOR_$002F_2 = F("/",2);
        final static Atomic ATOM_cmp_error = SYM("cmp_error");
    private static final Compound L_setup_determinates_0_s5 = S( FUNCTOR_$002F_2 ,  ATOM_cmp_error ,  int_1 );
        final static Atomic ATOM_name = SYM("name");
    private static final Compound L_setup_determinates_0_s9 = S( FUNCTOR_$002F_2 ,  ATOM_name ,  int_2 );
        final static Atomic ATOM_length = SYM("length");
    private static final Compound L_setup_determinates_0_s12 = S( FUNCTOR_$002F_2 ,  ATOM_length ,  int_2 );
        final static Atomic ATOM_asm_hash_value = SYM("asm_hash_value");
    private static final Compound L_setup_determinates_0_s15 = S( FUNCTOR_$002F_2 ,  ATOM_asm_hash_value ,  int_2 );
    private static final Compound L_setup_determinates_0_s17 = CONS(L_setup_determinates_0_s15,  Prolog.Nil );
    private static final Compound L_setup_determinates_0_s18 = CONS(L_setup_determinates_0_s12, L_setup_determinates_0_s17);
    private static final Compound L_setup_determinates_0_s19 = CONS(L_setup_determinates_0_s9, L_setup_determinates_0_s18);
    private static final Compound L_setup_determinates_0_s20 = CONS(L_setup_determinates_0_s5, L_setup_determinates_0_s19);




    public static Operation PRED_setup_determinates_0_static_exec(Prolog m) {
        final Operation cont = m.cont; TermArray LARG = m.AREGS; final Operation thiz = m.pred;
    // setup_determinates:-determinate([cmp_error/1,name/2,length/2,asm_hash_value/2])
        m.setB0();
    // setup_determinates:-[determinate([cmp_error/1,name/2,length/2,asm_hash_value/2])]
        return //
 Op("determinate", FILE_asm::PRED_determinate_1_static_exec, VA(L_setup_determinates_0_s20), cont);
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerPredicate("determinate",1,FILE_asm::PRED_determinate_1_static_exec);
   PredTable.registerPredicate("setup_determinates",0,FILE_asm::PRED_setup_determinates_0_static_exec);
}
}
