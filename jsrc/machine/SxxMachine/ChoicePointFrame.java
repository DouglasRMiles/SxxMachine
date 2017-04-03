// Copyright 2011 Google Inc. All Rights Reserved.

package com.googlecode.prolog_cafe.lang;

/**
 * Choice point frame.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class ChoicePointFrame {
  ChoicePointFrame prior;

  final long timeStamp;
  final Operation cont;  // continuation goal
  Operation bp;    // next clause
  final int tr;    // trail pointer
  final int b0;    // cut point
  Operation ownerPredicate;

  private Term areg1, areg2, areg3, areg4, areg5, areg6, areg7, areg8;
  private Term[] aregs;
  private final int usedArgs;

  public ChoicePointFrame(Prolog engine, Operation next, long timeStamp){
    usedArgs = 0;
    b0 = engine.B0;
    tr = engine.trail.top();
    bp = next;
    this.timeStamp = timeStamp;
    cont = engine.cont;
    //areg1=areg2=areg3=areg4=areg5=areg6=areg7=areg8=null;
  }

  public ChoicePointFrame(Prolog engine, Term areg1, Operation next, long timeStamp){
    usedArgs = 1;
    b0 = engine.B0;
    tr = engine.trail.top();
    bp = next;
    this.timeStamp = timeStamp;
    cont = engine.cont;
    this.areg1 = areg1;
    //areg2=areg3=areg4=areg5=areg6=areg7=areg8=null;
  }

  public ChoicePointFrame(Prolog engine, Term areg1, Term areg2, Operation next, long timeStamp){
    usedArgs = 2;
    b0 = engine.B0;
    tr = engine.trail.top();
    bp = next;
    this.timeStamp = timeStamp;
    cont = engine.cont;
    this.areg1 = areg1;
    this.areg2 = areg2;
    //areg3=areg4=areg5=areg6=areg7=areg8=null;
  }

  public ChoicePointFrame(Prolog engine, Term areg1, Term areg2, Term areg3, Operation next, long timeStamp){
    usedArgs = 3;
    b0 = engine.B0;
    tr = engine.trail.top();
    bp = next;
    this.timeStamp = timeStamp;
    cont = engine.cont;
    this.areg1 = areg1;
    this.areg2 = areg2;
    this.areg3 = areg3;
    //areg4=areg5=areg6=areg7=areg8=null;
  }

  public ChoicePointFrame(Prolog engine, Term areg1, Term areg2, Term areg3, Term areg4, Operation next, long timeStamp){
    usedArgs = 4;
    b0 = engine.B0;
    tr = engine.trail.top();
    bp = next;
    this.timeStamp = timeStamp;
    cont = engine.cont;
    this.areg1 = areg1;
    this.areg2 = areg2;
    this.areg3 = areg3;
    this.areg4 = areg4;
    //areg5=areg6=areg7=areg8=null;
  }

  public ChoicePointFrame(Prolog engine, Term areg1, Term areg2, Term areg3, Term areg4, Term areg5, Operation next, long timeStamp){
    usedArgs = 5;
    b0 = engine.B0;
    tr = engine.trail.top();
    bp = next;
    this.timeStamp = timeStamp;
    cont = engine.cont;
    this.areg1 = areg1;
    this.areg2 = areg2;
    this.areg3 = areg3;
    this.areg4 = areg4;
    this.areg5 = areg5;
    //areg6=areg7=areg8=null;
  }

  public ChoicePointFrame(Prolog engine, Term areg1, Term areg2, Term areg3, Term areg4, Term areg5, Term areg6, Operation next, long timeStamp){
    usedArgs = 6;
    b0 = engine.B0;
    tr = engine.trail.top();
    bp = next;
    this.timeStamp = timeStamp;
    cont = engine.cont;
    this.areg1 = areg1;
    this.areg2 = areg2;
    this.areg3 = areg3;
    this.areg4 = areg4;
    this.areg5 = areg5;
    this.areg6 = areg6;
    //areg7=areg8=null;
  }

  public ChoicePointFrame(Prolog engine, Term areg1, Term areg2, Term areg3, Term areg4, Term areg5, Term areg6, Term areg7, Operation next, long timeStamp){
    usedArgs = 7;
    b0 = engine.B0;
    tr = engine.trail.top();
    bp = next;
    this.timeStamp = timeStamp;
    cont = engine.cont;
    this.areg1 = areg1;
    this.areg2 = areg2;
    this.areg3 = areg3;
    this.areg4 = areg4;
    this.areg5 = areg5;
    this.areg6 = areg6;
    this.areg7 = areg7;
    //areg8=null;
  }

  public ChoicePointFrame(Prolog engine, Term areg1, Term areg2, Term areg3, Term areg4, Term areg5, Term areg6, Term areg7, Term areg8, Operation next, long timeStamp){
    usedArgs = 8;
    b0 = engine.B0;
    tr = engine.trail.top();
    bp = next;
    this.timeStamp = timeStamp;
    cont = engine.cont;
    this.areg1 = areg1;
    this.areg2 = areg2;
    this.areg3 = areg3;
    this.areg4 = areg4;
    this.areg5 = areg5;
    this.areg6 = areg6;
    this.areg7 = areg7;
    this.areg8 = areg8;
  }

  public ChoicePointFrame(Prolog engine, int arity, Operation next, long timeStamp){
    usedArgs = 9;
    b0 = engine.B0;
    tr = engine.trail.top();
    bp = next;
    this.timeStamp = timeStamp;
    cont = engine.cont;
    this.areg1 = engine.areg1;
    this.areg2 = engine.areg2;
    this.areg3 = engine.areg3;
    this.areg4 = engine.areg4;
    this.areg5 = engine.areg5;
    this.areg6 = engine.areg6;
    this.areg7 = engine.areg7;
    this.areg8 = engine.areg8;
    aregs = new Term[arity-8];
    System.arraycopy(engine.aregs, 0, aregs, 0, aregs.length);
  }

  final void restore(Prolog engine) {

    if (aregs!=null){
      System.arraycopy(aregs, 0, engine.aregs, 0, aregs.length);
    }
    engine.areg8 = areg8;
    engine.areg7 = areg7;
    engine.areg6 = areg6;
    engine.areg5 = areg5;
    engine.areg4 = areg4;
    engine.areg3 = areg3;
    engine.areg2 = areg2;
    engine.areg1 = areg1;
    engine.cont = cont;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder(ChoicePointFrame.class.getName());
    sb.append('{');
    sb.append("time:").append(timeStamp);
    sb.append(" cont:").append(cont);
    sb.append(" bp:").append(bp);
    sb.append(" tr:").append(tr);
    sb.append(" b0:").append(b0);
    sb.append('}');
    return sb.toString();
  }

}
