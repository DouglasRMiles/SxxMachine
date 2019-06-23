package SxxMachine;

public interface Nonvar extends Term {

    Nonvar aNil = null;

    // public boolean equalsTerm(Term ano2) {
    // return this==ano2;
    // }
    @Override
    boolean isNonvar();

    @Override
	int unifyArg(int i, Term a, Prog p);

    int getIntArg(int i);

    Nonvar toCharsList();

    /**
     * @return
     */
    Term getHead();

    /**
     * @return
     */
    Term getTail();

}