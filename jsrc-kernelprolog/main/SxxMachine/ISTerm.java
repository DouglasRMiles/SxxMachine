package SxxMachine;

public interface ISTerm {
    public Term getDrefArg(int i);

    public Term getPlainArg(int i);

    public int getIntArg(int i);

    public int unifyArg(int i, Term a, Prog p);
}