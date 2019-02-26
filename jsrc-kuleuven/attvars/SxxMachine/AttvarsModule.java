
package SxxMachine;

import static SxxMachine.pterm.TermData.internS;

/**
  * Attributed variables module, offers
  *     attvar/1
  *     del_attr/1
  *     get_attr/2
  *     put_attr/2
  *
  *  @author  toms
  *
  */
public class AttvarsModule extends JpModule {

    public AttvarsModule() {
        super(new Code[] { new pred_get_attr_2(), new pred_put_attr_2(), new pred_del_attr_1(), new pred_attvar_1() },
                new String[] { internS("get_attr"), internS("put_attr"), internS("del_attr"), internS("attvar") });
    }

}
