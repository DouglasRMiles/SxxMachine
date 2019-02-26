// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package be.kuleuven.jProlog;
import java.util.*;
class pred_untilend_1_consts {
   Code entry_code;
     Code get02cont ;
     Code cut2cont ;
final static String string0 = "cut".intern() ;
final static String string1 = "untilend".intern() ;
final static String string2 = "get0".intern() ;
final static String string3 = "cut".intern() ;
final static Int posint10 = new Int(10) ;
final static Int posint1 = new Int(1) ;
}
public class pred_untilend_1 extends Code {
private final pred_untilend_1_consts consts;
public pred_untilend_1(){
  consts = new pred_untilend_1_consts();
  initAlternatives();
}
protected pred_untilend_1(pred_untilend_1 c){
  consts = c.getConsts();
  ALT = null;
}
protected final pred_untilend_1_consts getConsts() { return consts; }
private Alternatives ALT = new Alternatives();
private void initAlternatives() {
  ALT.disable();
ALT.addAlternative(new pred_untilend_1_1(this));
ALT.addAlternative(new pred_untilend_1_2(this));

}

  public void init(PredikatenPrologMachine mach) {
    consts.entry_code = this;
consts.get02cont = mach.loadPred("get0",1) ;
}
  @Override public int arity() { return 1 ; }
  @Override
  @SuppressWarnings("static-access")
  public Code exec(PrologMachine mach) {
     PrologObject aregs[] = mach.createAregCopy(2);
     mach.createChoicePoint(aregs) ;
     Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
     mach.fillAlternatives(todo);
     return todo.next().exec(mach);

}
}

class pred_untilend_1_1 extends pred_untilend_1 {
pred_untilend_1_1(pred_untilend_1 consts){
  super(consts);
}

  @Override
  @SuppressWarnings("static-access")
  protected PrologObject[] getArgs() {
    PrologObject arg0 = getConsts().posint10;
    return new PrologObject[]{arg0};
  }
  @Override
  @SuppressWarnings("static-access")
  public Code exec(PrologMachine mach) {
    PrologObject local_aregs[] = mach.getAreg();
    PrologObject continuation = local_aregs[1] ;
PrologObject areg0 = local_aregs[0].dref() ;
    if (!(areg0.unify(getConsts().posint10))) return mach.Fail0 ;
    mach.doCut(mach.getCUTB())  ;
local_aregs[0] = continuation ;
    mach.updateCUTB();
    return mach.Call1;
  }
}

class pred_untilend_1_2 extends pred_untilend_1 {
pred_untilend_1_2(pred_untilend_1 consts){
  super(consts);
}

  @Override
  @SuppressWarnings("static-access")
  protected PrologObject[] getArgs() {
    
    PrologObject var2 = new DummyVar();
    
    PrologObject var1 = new DummyVar();
    PrologObject arg0 = var1;
    return new PrologObject[]{arg0};
  }
  @Override
  @SuppressWarnings("static-access")
  public Code exec(PrologMachine mach) {
    PrologObject local_aregs[] = mach.getAreg();
    PrologObject continuation = local_aregs[1] ;
PrologObject areg0 = local_aregs[0].dref() ;
PrologObject var2 = new Var(mach) ;
PrologObject var1 = new Var(mach) ;
    if (!(areg0.unify(var1.dref()))) return mach.Fail0 ;
local_aregs[0] = var2 ;
local_aregs[1] = new StructureTerm(getConsts().string1,var2.dref(),continuation) ;
    mach.updateCUTB();
    return getConsts().get02cont;
  }
}

