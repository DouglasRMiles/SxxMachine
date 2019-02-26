
package SxxMachine;

public class ReflectionModule extends JpModule {

    public ReflectionModule() {
        super(new Code[] { new ClassPred(), new IterateOverClassStructure(), new InterfaceIterator(), new JPInstance(),
                new JPNull(), new JPException(), new JPException4(), new JPNew(), new JPCall(), new JPCallStatic(),
                new pred_jp_get_3(), new pred_jp_set_3() },
                new String[] { "jp_class", IterateOverClassStructure.PREDNAME, InterfaceIterator.PREDNAME,
                        "jp_instance", "jp_null", "jp_exception", "jp_exception", "jp_new", "jp_call", "jp_call_static",
                        "jp_get", "jp_set" });
    }

}
