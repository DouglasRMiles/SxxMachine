
package SxxMachine;

import static SxxMachine.pterm.TermData.internS;

/**
  * Built-ins added by Tom Schrijvers
  *
  *  @author  toms
  *
  */
public class BuiltinsModule extends JpModule {

    public BuiltinsModule() {
        super(new Code[] { new pred_compound_1(), new pred_term_variables_2(), new pred_sort_2(), new pred_inc_2(),
                new pred_cut_1(), new pred_ground_1(), new pred_length2_disj_1_2(), new pred_length_n_2(),
                new pred_length_n2_disj_2_2(), new pred_length_u_2(), new pred_length_2(), new pred_code_call_1(),
                new pred_name_2(), new pred_portray_clause_1() },
                new String[] { internS("compound"), internS("term_variables"), internS("sort"), internS("inc"),
                        internS("cut"), internS("ground"), internS("length2_disj_1"), internS("length_n"),
                        internS("length_n2_disj_2"), internS("length_u"), internS("length"), internS("code_call"),
                        internS("name"), internS("portray_clause") });
    }

}
