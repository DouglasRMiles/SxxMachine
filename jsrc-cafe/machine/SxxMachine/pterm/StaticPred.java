package SxxMachine.pterm;

import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.PredicateEncoder;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.Token;

/**
 * @author Administrator
 *
 */
public class StaticPred extends Predicate implements Operation {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb);
        return sb.toString();
    }

    @Override
    public void toString(StringBuilder sb) {
        Token.toQuotedString(predName(), sb);
        boolean first = true;
        if (ThizLARGs != null) {
            for (int j = 0; j < ThizLARGs.length; j++) {
                if (first) {
                    sb.append('(');
                    first = false;
                } else {
                    sb.append(", ");
                }
                Term val = ThizLARGs[j];
                StructureTerm.toArgString(1, sb, val);
            }
            if (!first) {
                sb.append(')');
            }
        } else {
            sb.append("( ... )");

            // toStringLegacy(sb);
        }

    }

    private Operation static_closure;
    // private String name;

    @Override
    public int predArity() {
        if (ThizLARGs == null) {
            return -1;
        }
        return ThizLARGs.length;
    }

    @Override
    public String predName() {
        String name = this.name;
        if (name == null)
            name = guessname();
        return name;
    }

    private String guessname() {
        String name;
        Class c = static_closure.getClass();

        name = c.getName();
        int index;
        index = name.indexOf("SxxMachine.");
        if (index > 0) {
            name = name.substring(index);
        }
        index = name.indexOf("FILE_");
        if (index > 0) {
            name = name.substring(index);
        }
        index = name.indexOf("$$Lambda$");
        if (index > 0) {
            name = name.substring(0, index);
        }
        index = name.indexOf("FILE_");
        if (index > 0) {
            name = name.substring(index);
        }
        index = name.indexOf("PRED_");
        if (index > 0) {
            name = name.substring(index);
        }
        try {
            name = PredicateEncoder.decodeFunctor(name);
        } catch (Exception e) {
            return name;
        }
        if (name != null) {
            this.name = name;
        } else {
            name = "exec=" + static_closure;
        }

        return name;
    }

    public StaticPred(String functor, Operation object, Term[] va, Operation cont) {
        super(functor, va, cont);

        this.static_closure = object;
    }

    /*
     * (non-Javadoc)
     *
     * @see SxxMachine.Operation#exec(SxxMachine.Prolog)
     */
    @Override
    public Operation exec(Prolog engine) {
        push_to_engine(engine);
        return static_closure.exec(engine);
    }

}