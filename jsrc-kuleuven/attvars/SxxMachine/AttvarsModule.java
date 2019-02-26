
package SxxMachine;

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
                new String[] { Const.strIntern("get_attr"), Const.strIntern("put_attr"), Const.strIntern("del_attr"),
                        Const.strIntern("attvar") });
    }

}
