package SxxMachine;

public class OpVisitor {

    /**
     * @param string
     */
    public OpVisitor(String string) {
        toStr = string;

    }

    String toStr;

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return toStr;
    }

}
