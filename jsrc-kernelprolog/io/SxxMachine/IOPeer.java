package SxxMachine;

public interface IOPeer {

    public abstract void print(String s);

    public abstract void traceln(String s);

    public abstract void println(String s);

    // public abstract boolean addReader(Thread readThread);

    // public abstract String getReadString();
    public abstract String readln();

    public abstract void halt();
}