
package SxxMachine;

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
                new String[] { Const.strIntern("compound"), Const.strIntern("term_variables"), Const.strIntern("sort"),
                        Const.strIntern("inc"), Const.strIntern("cut"), Const.strIntern("ground"),
                        Const.strIntern("length2_disj_1"), Const.strIntern("length_n"),
                        Const.strIntern("length_n2_disj_2"), Const.strIntern("length_u"), Const.strIntern("length"),
                        Const.strIntern("code_call"), Const.strIntern("name"), Const.strIntern("portray_clause") });
    }

}
