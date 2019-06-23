
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

public class CHRRuntimeModule extends JpModule {

    public CHRRuntimeModule() {
        super(new Code[] { new pred_chr_newvia_1_2(), new pred_chr_newvia_12___disj___1_2(), new pred_chr_newvia_2_3(),
                new pred_chr_newvia_23___disj___2_3(), new pred_chr_newvia_23___disj___23___disj___3_3(),
                new pred_chr_newvia_23___disj___23___disj___33___disj___4_3(), new pred_chr_newvia_2(),
                new pred_chr_nonground_2(), new pred_chr_gen_id_1(), new pred_chr_none_locked_1(),
                new pred_chr_not_locked_1(), new pred_chr_get_history_2(), new pred_chr_put_history_3(),
                new pred_chr_sbag_member_2(), new pred_chr_sbag_del_element_3() },
                new String[] { internS("chr_newvia_1"), internS("chr_newvia_12___disj___1"), internS("chr_newvia_2"),
                        internS("chr_newvia_23___disj___2"), internS("chr_newvia_23___disj___23___disj___3"),
                        internS("chr_newvia_23___disj___23___disj___33___disj___4"), internS("chr_newvia"),
                        internS("chr_nonground"), internS("chr_gen_id"), internS("chr_none_locked"),
                        internS("chr_not_locked"), internS("chr_get_history"), internS("chr_put_history"),
                        internS("chr_sbag_member"), internS("chr_sbag_del_element") });

    }

}
