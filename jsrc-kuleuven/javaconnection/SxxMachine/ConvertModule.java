
package SxxMachine;

public class ConvertModule extends JpModule {

    public ConvertModule() {
        super(new Code[] { new ListConverter(), new ArrayConverter() }, new String[] { "jp_list", "jp_list2array" });
    }

}
