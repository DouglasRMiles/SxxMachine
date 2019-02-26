// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package be.kuleuven.jProlog;
import java.util.*;
class pred_toplevel_0_consts {
   Code entry_code;
     Code ttoplevel1cont ;
     Code ttop1cont ;
final static String string0 = "cut".intern() ;
final static String string1 = "toplevel".intern() ;
final static String string2 = "top".intern() ;
final static String string3 = "fail".intern() ;
}
public class pred_toplevel_0 extends Code {
private final pred_toplevel_0_consts consts;
public pred_toplevel_0(){
  consts = new pred_toplevel_0_consts();
  initAlternatives();
}
protected pred_toplevel_0(pred_toplevel_0 c){
  consts = c.getConsts();
  ALT = null;
}
protected final pred_toplevel_0_consts getConsts() { return consts; }
private Alternatives ALT = new Alternatives();
private void initAlternatives() {
  ALT.disable();
ALT.addAlternative(new pred_toplevel_0_1(this));
ALT.addAlternative(new pred_toplevel_0_2(this));

}

  public void init(PredikatenPrologMachine mach) {
    consts.entry_code = this;
consts.ttoplevel1cont = mach.loadPred("toplevel",0) ;
consts.ttop1cont = mach.loadPred("top",0) ;
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

class pred_toplevel_0_1 extends pred_toplevel_0 {
pred_toplevel_0_1(pred_toplevel_0 consts){
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
local_aregs[0] = new StructureTerm(getConsts().string3,continuation) ;
    mach.updateCUTB();
    return getConsts().ttop1cont;
  }
}

class pred_toplevel_0_2 extends pred_toplevel_0 {
pred_toplevel_0_2(pred_toplevel_0 consts){
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

