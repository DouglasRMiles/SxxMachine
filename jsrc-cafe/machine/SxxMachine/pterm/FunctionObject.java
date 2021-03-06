package SxxMachine.pterm; //

import SxxMachine.KPTrail;
import SxxMachine.Term;

/**
 * A FunctionObject is a Jinni Nonvar with system assigned name
 *
 */
public abstract class FunctionObject extends KPNonvar {

    public FunctionObject() {
        // registerObject();
    }

    public Term registerObject() {
        if (sym == null)
            setSym(ForeignObject.getJinniName(this));
        ForeignObject.objectPut(fname(), this);
        return this;
    }

    @Override
    final public void finalize() {
        //  IO.mes("% collect " + name());
        ForeignObject.objectRemove(fname());
    }

//    public final String fname() {
//        return qnamed.toString();
//    }

    @Override
    public int arityOrType() {
        return KPTerm.VAR;
    }

    @Override
    public boolean bindKP(Term that, KPTrail trail) {
        return super.bindKP(that, trail);// && ordinal==((FunctionObject)that).ordinal;
    }

    @Override
    public String toString() {
        return fname();
    }

}
