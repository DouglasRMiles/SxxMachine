// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package be.kuleuven.jProlog;
import java.util.*;
class pred_noteq_2_consts {
   Code entry_code;
     Code cut2cont ;
final static String string0 = "cut".intern() ;
final static String string1 = "noteq".intern() ;
final static String string2 = "call".intern() ;
final static String string3 = "cut".intern() ;
final static String string4 = "fail".intern() ;
final static Int posint1 = new Int(1) ;
}
public class pred_noteq_2 extends Code {
private final pred_noteq_2_consts consts;
public pred_noteq_2(){
  consts = new pred_noteq_2_consts();
  initAlternatives();
}
protected pred_noteq_2(pred_noteq_2 c){
  consts = c.getConsts();
  ALT = null;
}
protected final pred_noteq_2_consts getConsts() { return consts; }
private Alternatives ALT = new Alternatives();
private void initAlternatives() {
  ALT.disable();
ALT.addAlternative(new pred_noteq_2_1(this));
ALT.addAlternative(new pred_noteq_2_2(this));

}

  public void init(PredikatenPrologMachine mach) {
    consts.entry_code = this;
}
  @Override public int arity() { return 2 ; }
  @Override
  @SuppressWarnings("static-access")
  public Code exec(PrologMachine mach) {
     PrologObject aregs[] = mach.createAregCopy(3);
     mach.createChoicePoint(aregs) ;
     Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
     mach.fillAlternatives(todo);
     return todo.next().exec(mach);

}
}

class pred_noteq_2_1 extends pred_noteq_2 {
pred_noteq_2_1(pred_noteq_2 consts){
  super(consts);
}

  @Override
  @SuppressWarnings("static-access")
  protected PrologObject[] getArgs() {
    
    PrologObject var1 = new DummyVar();
    PrologObject arg0 = var1;
    PrologObject arg1 = var1.dref();
    return new PrologObject[]{arg0, arg1};
  }
  @Override
  @SuppressWarnings("static-access")
  public Code exec(PrologMachine mach) {
    PrologObject local_aregs[] = mach.getAreg();
    PrologObject continuation = local_aregs[2] ;
PrologObject areg1 = local_aregs[1].dref() ;
PrologObject areg0 = local_aregs[0].dref() ;
PrologObject var1 = new Var(mach) ;
    if (!(areg0.unify(var1.dref()))) return mach.Fail0 ;
    if (!(areg1.unify(var1.dref()))) return mach.Fail0 ;
    mach.doCut(mach.getCUTB())  ;
local_aregs[0] = new StructureTerm(getConsts().string4,continuation) ;
    mach.updateCUTB();
local_aregs[2] = null ;
    return mach.Call1;
  }
}

class pred_noteq_2_2 extends pred_noteq_2 {
pred_noteq_2_2(pred_noteq_2 consts){
  super(consts);
}

  @Override
  @SuppressWarnings("static-access")
  protected PrologObject[] getArgs() {
    
    PrologObject var2 = new DummyVar();
    
    PrologObject var1 = new DummyVar();
    PrologObject arg0 = var1;
    PrologObject arg1 = var2;
    return new PrologObject[]{arg0, arg1};
  }
  @Override
  @SuppressWarnings("static-access")
  public Code exec(PrologMachine mach) {
    PrologObject local_aregs[] = mach.getAreg();
    PrologObject continuation = local_aregs[2] ;
PrologObject areg1 = local_aregs[1].dref() ;
PrologObject areg0 = local_aregs[0].dref() ;
PrologObject var2 = new Var(mach) ;
PrologObject var1 = new Var(mach) ;
    if (!(areg0.unify(var1.dref()))) return mach.Fail0 ;
    if (!(areg1.unify(var2.dref()))) return mach.Fail0 ;
local_aregs[0] = continuation ;
    mach.updateCUTB();
local_aregs[2] = local_aregs[1] = null ;
    return mach.Call1;
  }
}

