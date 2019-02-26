// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package be.kuleuven.jProlog;
import java.util.*;
class pred_writevars_1_consts {
   Code entry_code;
     Code write2cont ;
final static String string0 = "cut".intern() ;
final static String string1 = "writevars".intern() ;
final static String string2 = "[|]".intern() ;
final static String string3 = "=".intern() ;
final static String string4 = "write".intern() ;
final static String string5 = " = ".intern() ;
final static String string6 = "nl".intern() ;
final static String string7 = "fail".intern() ;
final static String string8 = "call".intern() ;
}
public class pred_writevars_1 extends Code {
private final pred_writevars_1_consts consts;
public pred_writevars_1(){
  consts = new pred_writevars_1_consts();
  initAlternatives();
}
protected pred_writevars_1(pred_writevars_1 c){
  consts = c.getConsts();
  ALT = null;
}
protected final pred_writevars_1_consts getConsts() { return consts; }
private Alternatives ALT = new Alternatives();
private void initAlternatives() {
  ALT.disable();
ALT.addAlternative(new pred_writevars_1_1(this));
ALT.addAlternative(new pred_writevars_1_2(this));
ALT.addAlternative(new pred_writevars_1_3(this));

}

  public void init(PredikatenPrologMachine mach) {
    consts.entry_code = this;
consts.write2cont = mach.loadPred("write",1) ;
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

class pred_writevars_1_1 extends pred_writevars_1 {
pred_writevars_1_1(pred_writevars_1 consts){
  super(consts);
}

  @Override
  @SuppressWarnings("static-access")
  protected PrologObject[] getArgs() {
    PrologObject arg0 = 