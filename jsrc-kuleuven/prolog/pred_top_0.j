// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package be.kuleuven.jProlog;
import java.util.*;
class pred_top_0_consts {
   Code entry_code;
     Code ttop1cont ;
     Code write2cont ;
final static String string0 = "cut".intern() ;
final static String string1 = "top".intern() ;
final static String string2 = "write".intern() ;
final static String string3 = "?- ".intern() ;
final static String string4 = "vread".intern() ;
final static String string5 = "exec".intern() ;
final static String string6 = "writevars".intern() ;
final static String string7 = "Yes".intern() ;
final static String string8 = "nl".intern() ;
final static String string9 = "notmore".intern() ;
final static String string10 = "cut".intern() ;
final static String string11 = "fail".intern() ;
final static Int posint1 = new Int(1) ;
}
public class pred_top_0 extends Code {
private final pred_top_0_consts consts;
public pred_top_0(){
  consts = new pred_top_0_consts();
  initAlternatives();
}
protected pred_top_0(pred_top_0 c){
  consts = c.getConsts();
  ALT = null;
}
protected final pred_top_0_consts getConsts() { return consts; }
private Alternatives ALT = new Alternatives();
private void initAlternatives() {
  ALT.disable();
ALT.addAlternative(new pred_top_0_1(this));
ALT.addAlternative(new pred_top_0_2(this));

}

  public void init(PredikatenPrologMachine mach) {
    consts.entry_code = this;
consts.ttop1cont = mach.loadPred("top",0) ;
consts.write2cont = mach.loadPred("write",1) ;
}
  @Override public int arity() { return 0 ; }
  @Override
  @SuppressWarnings("static-access")
  public Code exec(PrologMachine mach) {
     PrologObject aregs[] = mach.createAregCopy(1);
     mach.createChoicePoint(aregs) ;
     Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
     mach.fillAlternatives(todo);
     return todo.next().exec(mach);

}
}

class pred_top_0_1 extends pred_top_0 {
pred_top_0_1(pred_top_0 consts){
  super(consts);
}

  @Override
  @SuppressWarnings("static-access")
  protected PrologObject[] getArgs() {
    
    PrologObject var2 = new DummyVar();
    
    PrologObject var1 = new DummyVar();
    return new PrologObject[]{};
  }
  @Override
  @SuppressWarnings("static-access")
  public Code exec(PrologMachine mach) {
    PrologObject local_aregs[] = mach.getAreg();
    PrologObject continuation = local_aregs[0] ;
PrologObject var2 = new Var(mach) ;
PrologObject var1 = new Var(mach) ;
local_aregs[0] = new Const(getConsts().string3) ;
local_aregs[1] = new StructureTerm(getConsts().string4,var1,var2,new StructureTerm(getConsts().string5,var1.dref(),new StructureTerm(getConsts().string6,var2.dref(),new StructureTerm(getConsts().string2,new Const(getConsts().string7),new StructureTerm(getConsts().string8,new StructureTerm(getConsts().string9,new StructureTerm(getConsts().string0, new HeapChoice(mach.getCUTB()),new StructureTerm(getConsts().string11,continuation)))))))) ;
    mach.updateCUTB();
    return getConsts().write2cont;
  }
}

class pred_top_0_2 extends pred_top_0 {
pred_top_0_2(pred_top_0 consts){
  super(consts);
}

  @Override
  @SuppressWarnings("static-access")
  protected PrologObject[] getArgs() {
    return new PrologObject[]{};
  }
  @Override
  @SuppressWarnings("static-access")
  public Code exec(PrologMachine mach) {
    PrologObject local_aregs[] = mach.getAreg();
    PrologObject continuation = local_aregs[0] ;
local_aregs[0] = continuation ;
    mach.updateCUTB();
    return getConsts().entry_code;
  }
}

