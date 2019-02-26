
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;

import SxxMachine.pterm.StructureTerm;

public class pred_concat_atom_2 extends Code {

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        final Term[] args = mach.getAreg();
        Term list = args[0];
        final Term dest = args[1];
        if (!list.isCons())
            throw new JPrologInternalException("Not a list: " + list, this);
        final StringBuilder builder = new StringBuilder();
        while (!list.isNil()) {
            if (!(list instanceof AFunct))
                throw new JPrologInternalException("Not a valid list: " + list, this);
            final StructureTerm l = (StructureTerm) list;
            final Term o = l.getPlainArg(0);
            if (o.isVariable())
                throw new JPrologInternalException("No vars in list allowed", this);
            if (o.arity() > 0)
                throw new JPrologInternalException("Not an atom - invalid list", this);
            builder.append(o);
            list = l.getPlainArg(1);
        }
        if (dest.unify(CONST(builder.toString()))) {
            args[0] = args[2];
            return mach.Call1;
        }
        return mach.Fail0;
    }

}
