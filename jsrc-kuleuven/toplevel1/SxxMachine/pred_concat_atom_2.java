
package SxxMachine;

public class pred_concat_atom_2 extends Code {

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        Term[] args = mach.getAreg();
        Term list = args[0];
        Term dest = args[1];
        if (!list.isCons())
            throw new JPrologInternalException("Not a list: " + list, this);
        StringBuilder builder = new StringBuilder();
        while (!list.isNil()) {
            if (!(list instanceof AFunct))
                throw new JPrologInternalException("Not a valid list: " + list, this);
            StructureTerm l = (StructureTerm) list;
            Term o = l.args()[0];
            if (o.isVariable())
                throw new JPrologInternalException("No vars in list allowed", this);
            if (o.arity() > 0)
                throw new JPrologInternalException("Not an atom - invalid list", this);
            builder.append(o);
            list = l.args()[1];
        }
        if (dest.unify(JpFactory.CONST(builder.toString()))) {
            args[0] = args[2];
            return mach.Call1;
        }
        return mach.Fail0;
    }

}
