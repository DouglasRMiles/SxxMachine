package SxxMachine;

import java.math.BigInteger;

public class TermData {

	/**
	 * @author Administrator
	 *
	 */
	static public class StaticPred extends Predicate implements Operation {

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			toString(sb);
			return sb.toString();
		}

		@Override
		public void toString(StringBuilder sb) {
			sb.append(predName());
			boolean first = true;
			if (LARG != null) {
				for (int j = 0; j < LARG.length; j++) {
					Term val = LARG[j];
					if (first) {
						sb.append('(');
						first = false;
					} else {
						sb.append(", ");
					}
					val.toQuotedString(0, sb);
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
			if (LARG == null) {
				return -1;
			}
			return LARG.length;
		}

		@Override
		public String predName() {
			String name = this.name;
			if (name == null) {
				Class c = static_closure.getClass();
				name = c.getName();

				int index = name.indexOf("$$Lambda$");
				if (index > 0) {
					name = name.substring(0, index);
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

	public static StructureTerm S(String string, Term... s3) {
		return new StructureTerm(string, s3);
	}
	public static StructureTerm S(SymbolTerm string, Term... s3) {
		return new StructureTerm(string, s3);
	}

	public static StructureTerm C(String string, Term... s3) {
		return new StructureTerm(string, s3);
	}

	public static StructureTerm C(SymbolTerm string, Term... s3) {
		return new StructureTerm(string, s3);
	}
	//
	//  private static ListTerm Cons(Term _car, Term _cdr) {
	//    return TermData.CONS( _car, _cdr);
	//    //return new StructureTerm(ListTerm.SYM_DOT, _car, _cdr);
	//  }

	public static ListTerm CONS(Term _car, Term _cdr) {
		//if(false) return Cons(_car, _cdr);
		return new StructureTerm(Prolog.SYM_DOT, _car, _cdr);
	}

	public static SymbolTerm SYM(String s) {
		return SymbolTerm.intern(s);
	}

	public static SymbolTerm F(String s) {
		return SymbolTerm.intern(s);
	}

	public static SymbolTerm F(String s, int i) {
		return SymbolTerm.intern(s, i);
	}

	public static VariableTerm V(Prolog engine) {
		return new VariableTerm(engine);
	}

	public static VariableTerm V() {
		return new VariableTerm(Prolog.M);
	}

	public static Predicate Op(Operation object, Term[] LARG, Operation cont) {
		return new TermData.StaticPred(null, object, LARG, cont);
	}

	public static Predicate Op(Operation object, Term a1, Term a2, Operation cont) {
		return new TermData.StaticPred(null, object, VA(a1, a2), cont);
	}

	public static Predicate Op(Operation object, Term a1, Term a2, Term a3, Operation cont) {
		return new TermData.StaticPred(null, object, VA(a1, a2, a3), cont);
	}

	public static Predicate Op(Operation object, Term a1, Operation cont) {
		return new TermData.StaticPred(null, object, VA(a1), cont);
	}
	public static LongTerm Long(String s) {
		return new LongTerm(new BigInteger(s));
	}
	public static LongTerm Long(long t) {
		int i = (int) t;
		if (((long) i) == t) {
			return TermData.Integer(i);
		}
		return new LongTerm(t);
	}

	public static DoubleTerm Float(double i) {
		return new DoubleTerm(i);
	}

	final static int POS_INT_CACHE = 1024;
	final static int NEG_INT_CACHE = 1024;
	static IntegerTerm[] posInts = new IntegerTerm[POS_INT_CACHE];
	static IntegerTerm[] negInts = new IntegerTerm[NEG_INT_CACHE];

	public static IntegerTerm Integer(int i) {
		if (i < POS_INT_CACHE) {
			if (i < 0) {
				if (i >= -NEG_INT_CACHE) {
					int idx = -i;
					if (negInts != null) {
						synchronized (negInts) {
							IntegerTerm ret = negInts[idx];
							if (ret == null) {
								negInts[idx] = ret = new IntegerTerm(i);
							}
							return ret;
						}
					}
				}
			} else {
				if (posInts != null) {
					synchronized (posInts) {
						IntegerTerm ret = posInts[i];
						if (ret == null) {
							posInts[i] = ret = new IntegerTerm(i);
						}
						return ret;
					}
				}
			}
		}
		return new IntegerTerm(i);
	}

	static public Term[] VA(Term... array) {
		return array;
	}

	public static Term Closure(Operation _op) {
		return new ClosureTerm((Predicate) _op);
	}

	public static FFIObjectTerm FFIObject(Object _obj) {
		return new FFIObjectTerm(_obj);
	}

	public static ErrorTerm createErrorTerm(Throwable error, Term _functor, Term... _args) {
		return new ErrorTerm(error, _functor, _args);
	}

	public static ListTerm LIST(Term a1, Term... items) {
		int len = items.length;
		if (len == 0) {
			return CONS(a1, Prolog.Nil);
		}
		ListTerm t = CONS(items[len - 1], Prolog.Nil);
		for (int i = len - 2; i >= 0; i--) {
			t = CONS(items[i], t);
		}
		return t;
	}

	public static boolean isQuoted(int printingFlags) {
		return (printingFlags & 1) != 0;
	}

	public static Term AND(Term a1, Term a2) {
		return new StructureTerm(Prolog.SYM_CONJ, a1, a2);
	}

	/**
	 * @param r
	 * @return
	 */
	public static NumberTerm NarrowDouble(double r) {
		NumberTerm T;
		if (Math.floor(r) == r)
			T = TermData.Long((long) r);
		else
			T = TermData.Float(r);
		return T;
	}

	public static HashtableOfTerm asHashtableOfTerm(Object hash) {
		// TODO Auto-generated method stub
		return (HashtableOfTerm) hash;
	}

	public static ErrorTerm asErrorTerm(Term a2) {
		// TODO Auto-generated method stub
		return (ErrorTerm) a2;
	}

}
