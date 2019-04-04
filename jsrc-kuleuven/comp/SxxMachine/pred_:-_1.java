// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau
/*
package be.kuleuven.jProlog;
import java.util.*;
class pred_:-_1_consts {
   Code entry_code;
final static String string0 = "cut".intern() ;
final static String string1 = "nb_setval".intern() ;
final static String string2 = "DISABLE_INDEXING".intern() ;
final static String string3 = "false".intern() ;
final static String string4 = "call".intern() ;
}
public class pred_:-_1 extends Code {
private final pred_:-_1_consts consts;
public pred_:-_1(){
  consts = new pred_:-_1_consts();
  initAlternatives();
}
protected pred_:-_1(pred_:-_1 c){
  consts = c.getConsts();
  ALT = null;
}
protected final pred_:-_1_consts getConsts() { return consts; }
private static Alternatives ALT = null;
private void initAlternatives() { }

  public void init(PredikatenPrologMachine mach) {
    consts.entry_code = this;
}
  @Override public int arity() { return 1 ; }
  @Override
  @SuppressWarnings("static-access")
  public Code exec(PrologMachine mach) {
    PrologObject local_aregs[] = mach.getAreg();
    PrologObject continuation = mach.getCont(local_aregs, 1) ;
PrologObject areg0 = local_aregs[0].dref() ;
    if (!(areg0.unify(new StructureTerm(getConsts().string1,new Const(getConsts().string2),new Const(getConsts().string3))))) return mach.Fail0 ;
local_aregs[0] = continuation ;
    mach.updateCUTB();
local_aregs[1] = null ;
    return mach.Call1;

}
}

*/