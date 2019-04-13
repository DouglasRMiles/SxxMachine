/**
 * 
 */
package SxxMachine;

import java.lang.reflect.Field;

/**
 * @author Administrator
 *
 */
public class TermArray {

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String ret = "TermArray.length=" + this.length;
        if (this.length != 0) {
            ret += " [" + this.termString(this.getPlainArg(0));
            if (this.length > 1)
                for (int i = 1; i < this.length; i++) {
                    ret += ", " + this.termString(this.getPlainArg(i));
                }
        }
        return ret + "]";
    }

    /**
     * @param plainArg
     * @return
     */
    private String termString(Term plainArg) {
        if (plainArg == null)
            return "@nUll";
        return plainArg.toQuotedString();
    }

    public int length;

    final TermRef[] termRefs;

    final private Term[] backing;

    //private int length;

    /**
     * @param length
     */
    public TermArray(int len) {
        this.length = len;
        backing = new Term[len];
        this.termRefs = new TermRef[len];
    }

    /**
     * @param len
     * @return
     */
    public static TermArray newTermArray(int len) {
        final TermArray termArray = new TermArray(len);
        //        for (int j = 0; j < len; j++) {
        //            termArray.setAV(j, null);
        //        }
        return termArray;
    }

    /**
     * @param args
     * @return
     */
    public static TermArray newTermArray(Term... args) {
        final int len = args.length;
        final TermArray termArray = new TermArray(len);
        for (int j = 0; j < len; j++) {
            termArray.setAV(j, args[j]);
        }
        return termArray;
    }

    /**
     * @param i
     * @return
     */
    public Term getPlainArg(int i) {
        if (true)
            return backing[i];
        if (true) {
            //            final Field fa = this.getField(i);
            //            try {
            //                return (Term) fa.get(this);
            //            } catch (IllegalArgumentException | IllegalAccessException e) {
            //                // TODO Auto-generated catch block
            //                e.printStackTrace();
            //                if (true)
            //                    throw new AbstractMethodError("TermArray.setAV throw Exception");
            //
            //            }
        }
        throw new AbstractMethodError("TermArray.setAV throw Exception");
    }

    /**
     * @param i
     * @return
     */
    public Term getTermDRef(int i) {
        return this.getPlainArg(i).dref();
    }

    /**
     * @param i
     * @param object
     * @return
     */
    public Term setAV(int i, Term v) {
        if (true) {
            return backing[i] = v;
        }
        if (v == null) {
            if (i <= this.length) {
                this.length = i + 1;
            }
        } else {
            if (i >= this.length) {
                this.length = i + 1;
            }
        }
        //        if (true) {
        //            final Field fa = this.getField(i);
        //            try {
        //                fa.set(this, v);
        //            } catch (IllegalArgumentException | IllegalAccessException e) {
        //                // TODO Auto-generated catch block
        //                e.printStackTrace();
        //
        //            }
        //            return v;
        //        } else 
        if (true) {
            final Term[] backing = this.backing;
            return backing[i] = v;
        }
        throw new AbstractMethodError("TermArray.setAV throw Exception");
    }

    /**
     * @param i
     * @return
     */
    // // final static Field[] fieldDecls = new Field[33];
    //    public Field getField(final int i) {
    //        Field tr = fieldDecls[i];
    //        if (tr == null) {
    //            try {
    //                tr = fieldDecls[i] = this.getClass().getField("areg" + i);
    //            } catch (final NoSuchFieldException e) {
    //                // TODO Auto-generated catch block
    //                e.printStackTrace();
    //                if (true)
    //                    throw new AbstractMethodError("TermArray.getField throw NoSuchFieldException");
    //
    //            } catch (final SecurityException e) {
    //                // TODO Auto-generated catch block
    //                e.printStackTrace();
    //                if (true)
    //                    throw new AbstractMethodError("TermArray.getField throw SecurityException");
    //
    //            }
    //        }
    //        return tr;
    //    }

    /**
     * @return the length
     */
    public int getLength() {
        return this.length;
    }

    /**
     * @return the backing
     */
    public Term[] getBacking() {
        if (true)
            return this.backing;
        //        if (this.backing == null)
        //            this.backing = new Term[this.length];
        for (int i = 0; i < this.backing.length; i++) {
            this.backing[i] = this.getPlainArg(i);
        }

        return this.backing;

        //throw new AbstractMethodError("TermArray.getBacking throw Exception");
    }

    /**
     * @param i
     * @return
     */
    public TermRef aref(final int i) {
        TermRef tr = this.termRefs[i];
        if (tr == null) {
            tr = this.termRefs[i] = this.makePlain(i);
        }
        return tr;
    }

    /**
     * @param i
     * @return
     */
    private TermRef makePlain(final int i) {
        return new TermRef() {
            @Override
            public Term getVVV() {
                return TermArray.this.getTermDRef(i);
            }

            @Override
            public Term getV() {
                return TermArray.this.getPlainArg(i);
            }

            @Override
            Term setV(Term v) {
                return TermArray.this.setAV(i, v);
            }
        };
    }

    /**
     * @return the areg0
     */
    public Term getAreg0() {
        return this.backing[0];
    }

    /**
     * @param areg0 the areg0 to set
     */
    public Term setAreg0(Term areg0) {
        this.backing[0] = areg0;
        return areg0;
    }

    /**
     * @return the areg1
     */
    public Term getAreg1() {
        return this.backing[1];
    }

    /**
     * @param areg1 the areg1 to set
     */
    public Term setAreg1(Term areg1) {
        this.backing[1] = areg1;
        return areg1;
    }

    /**
     * @return the areg2
     */
    public Term getAreg2() {
        return this.backing[2];
    }

    /**
     * @param areg2 the areg2 to set
     */
    public Term setAreg2(Term areg2) {
        this.backing[2] = areg2;
        return areg2;
    }

    /**
     * @return the areg3
     */
    public Term getAreg3() {
        return this.backing[3];
    }

    /**
     * @param areg3 the areg3 to set
     */
    public Term setAreg3(Term areg3) {
        this.backing[3] = areg3;
        return areg3;
    }

    /**
     * @return the areg4
     */
    public Term getAreg4() {
        return this.backing[4];
    }

    /**
     * @param areg4 the areg4 to set
     */
    public Term setAreg4(Term areg4) {
        this.backing[4] = areg4;
        return areg4;
    }

    /**
     * @return the areg5
     */
    public Term getAreg5() {
        return this.backing[5];
    }

    /**
     * @param areg5 the areg5 to set
     */
    public void setAreg5(Term a5) {
        setAV(5, a5);
    }

    /**
     * @return the areg6
     */
    public Term getAreg6() {
        return this.backing[6];
    }

    /**
     * @param areg6 the areg6 to set
     */
    public void setAreg6(Term areg6) {
        this.backing[6] = areg6;
    }

    /**
     * @return the areg7
     */
    public Term getAreg7() {
        return this.backing[7];
    }

    /**
     * @param areg7 the areg7 to set
     */
    public void setAreg7(Term areg7) {
        this.backing[7] = areg7;
    }

    /**
     * @return the areg8
     */
    public Term getAreg8() {
        return this.backing[8];
    }

    /**
     * @param areg8 the areg8 to set
     */
    public void setAreg8(Term areg8) {
        this.backing[8] = areg8;
    }

    /**
     * @return the areg9
     */
    public Term getAreg9() {
        return this.backing[9];
    }

    /**
     * @param areg9 the areg9 to set
     */
    public void setAreg9(Term areg9) {
        this.backing[9] = areg9;
    }

    /**
     * @return the areg10
     */
    public Term getAreg10() {
        return this.backing[10];
    }

    /**
     * @param areg10 the areg10 to set
     */
    public void setAreg10(Term areg10) {
        this.backing[10] = areg10;
    }

    /**
     * @return the areg11
     */
    public Term getAreg11() {
        return this.backing[11];
    }

    /**
     * @param areg11 the areg11 to set
     */
    public void setAreg11(Term areg11) {
        this.backing[11] = areg11;
    }

    /**
     * @return the areg12
     */
    public Term getAreg12() {
        return this.backing[12];
    }

    /**
     * @param areg12 the areg12 to set
     */
    public void setAreg12(Term areg12) {
        this.backing[12] = areg12;
    }

    /**
     * @return the areg13
     */
    public Term getAreg13() {
        return this.backing[13];
    }

    /**
     * @param areg13 the areg13 to set
     */
    public void setAreg13(Term areg13) {
        this.backing[13] = areg13;
    }

    /**
     * @return the areg14
     */
    public Term getAreg14() {
        return this.backing[14];
    }

    /**
     * @param areg14 the areg14 to set
     */
    public void setAreg14(Term areg14) {
        this.backing[14] = areg14;
    }

    /**
     * @return the areg15
     */
    public Term getAreg15() {
        return this.backing[15];
    }

    /**
     * @param areg15 the areg15 to set
     */
    public void setAreg15(Term areg15) {
        this.backing[15] = areg15;
    }

    /**
     * @param engine
     * @param arity
     */
    public static void copyTA(TermArray src, TermArray dst, int arity) {
        final Term[] lbacking = src.getBacking();
        final Term[] backing = dst.getBacking();
        System.arraycopy(lbacking, 0, backing, 0, arity);
    }

    /**
     * @return
     */
    public Term[] getBackingCopy() {
        final Term[] lbacking = getBacking();
        final int len = lbacking.length;
        final Term[] copy = new Term[len];
        System.arraycopy(lbacking, 0, copy, 0, len);
        return copy;
    }

}
