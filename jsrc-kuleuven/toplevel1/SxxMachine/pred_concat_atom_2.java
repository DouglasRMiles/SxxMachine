
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
        final TermArray local_aregs = mach.getAreg();
        Term list = local_aregs.a(0).getV();
        final Term dest = local_aregs.a(1).getV();
        if (!list.isCons())
            throw new JPrologInternalException("Not a list: " + list, this);
        final StringBuilder builder = new StringBuilder();
        while (!list.isNil()) {
            if (!(list.isCompound()))
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
        if (dest.unifyJP(CONST(builder.toString()))) {
            local_aregs.setAV(0,local_aregs.a(2).getV());
            return mach.getCall1();
        }
        return mach.Fail0;
    }

}
