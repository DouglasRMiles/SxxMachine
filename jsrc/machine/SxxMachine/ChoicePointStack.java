package com.googlecode.prolog_cafe.lang;

import java.util.Arrays;
import java.util.function.BiConsumer;

/**
 * Choice point frame stack.<br>
 * The <code>CPFStack</code> class represents a stack of choice point frames.<br>
 * Each choice point frame has the following fields:
 * <ul>
 * <li><em>arguments</em>
 * <li><em>continuation goal</em>
 * <li><em>next clause</em>
 * <li><em>trail pointer</em>
 * <li><em>cut point</em>
 * <li><em>time stamp</em>
 * </ul>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public final class ChoicePointStack {
  /** Trail of the associated Prolog instance. */
  private final Trail trail;

  /** Top of the stack. */
  ChoicePointFrame top;

  /**
   * Current level/depth of the stack.
   * <p>
   * This matches the length of the chain stored in {@link #top}.
   */
  private int level;
  private ChoicePointFrame[] frames;

  ChoicePointStack(Trail trail) {
    this.trail = trail;
    this.level = -1;
    frames = new ChoicePointFrame[256];
  }

  private void doubleFramesCapacity() {
    ChoicePointFrame[] newFrames = new ChoicePointFrame[frames.length<<2];
    System.arraycopy(frames, 0, newFrames, 0, frames.length);
    frames = newFrames;
  }


  ChoicePointFrame push(Prolog engine, Operation next, BiConsumer<ChoicePointFrame, Prolog> restore) {
    level++;
    if (level>=frames.length){
      doubleFramesCapacity();
    }
    if (frames[level]==null){
      frames[level] = new ChoicePointFrame();
    }
    top = frames[level];
    top.b0 = engine.B0;
    top.tr = engine.trail.top();
    top.bp = next;
    top.timeStamp = trail.timeStamp;
    top.cont = engine.cont;
    top.restore = restore;
    return top;
  }

  ChoicePointFrame push(Prolog engine, Term areg1, Operation next) {
    ChoicePointFrame topFrame = push(engine, next, ChoicePointStack::restore1);
    topFrame.areg1 = areg1;
    return topFrame;
  }

  ChoicePointFrame push(Prolog engine, Term areg1, Term areg2, Operation next) {
    ChoicePointFrame topFrame = push(engine, next, ChoicePointStack::restore2);
    topFrame.areg1 = areg1;
    topFrame.areg2 = areg2;
    return topFrame;
  }

  ChoicePointFrame push(Prolog engine, Term areg1, Term areg2, Term areg3, Operation next) {
    ChoicePointFrame topFrame = push(engine, next, ChoicePointStack::restore3);
    topFrame.areg1 = areg1;
    topFrame.areg2 = areg2;
    topFrame.areg3 = areg3;
    return topFrame;
  }

  ChoicePointFrame push(Prolog engine, Term areg1, Term areg2, Term areg3, Term areg4, Operation next) {
    ChoicePointFrame topFrame = push(engine, next, ChoicePointStack::restore4);
    topFrame.areg1 = areg1;
    topFrame.areg2 = areg2;
    topFrame.areg3 = areg3;
    topFrame.areg4 = areg4;
    return topFrame;
  }

  ChoicePointFrame push(Prolog engine, Term areg1, Term areg2, Term areg3, Term areg4, Term areg5, Operation next) {
    ChoicePointFrame topFrame = push(engine, next, ChoicePointStack::restore5);
    topFrame.areg1 = areg1;
    topFrame.areg2 = areg2;
    topFrame.areg3 = areg3;
    topFrame.areg4 = areg4;
    topFrame.areg5 = areg5;
    return topFrame;
  }

  ChoicePointFrame push(Prolog engine, Term areg1, Term areg2, Term areg3, Term areg4, Term areg5, Term areg6, Operation next) {
    ChoicePointFrame topFrame = push(engine, next, ChoicePointStack::restore6);
    topFrame.areg1 = areg1;
    topFrame.areg2 = areg2;
    topFrame.areg3 = areg3;
    topFrame.areg4 = areg4;
    topFrame.areg5 = areg5;
    topFrame.areg6 = areg6;
    return topFrame;
  }

  ChoicePointFrame push(Prolog engine, Term areg1, Term areg2, Term areg3, Term areg4, Term areg5, Term areg6, Term areg7, Operation next) {
    ChoicePointFrame topFrame = push(engine, next, ChoicePointStack::restore7);
    topFrame.areg1 = areg1;
    topFrame.areg2 = areg2;
    topFrame.areg3 = areg3;
    topFrame.areg4 = areg4;
    topFrame.areg5 = areg5;
    topFrame.areg6 = areg6;
    topFrame.areg7 = areg7;
    return topFrame;
  }

  ChoicePointFrame push(Prolog engine, Term areg1, Term areg2, Term areg3, Term areg4, Term areg5, Term areg6, Term areg7, Term areg8, Operation next) {
    ChoicePointFrame topFrame = push(engine, next, ChoicePointStack::restore8);
    topFrame.areg1 = areg1;
    topFrame.areg2 = areg2;
    topFrame.areg3 = areg3;
    topFrame.areg4 = areg4;
    topFrame.areg5 = areg5;
    topFrame.areg6 = areg6;
    topFrame.areg7 = areg7;
    topFrame.areg8 = areg8;
    return topFrame;
  }

  ChoicePointFrame push(Prolog engine, int arity, Operation next) {
    ChoicePointFrame topFrame = push(engine, next, ChoicePointStack::restoreA);
    topFrame.areg1 = engine.areg1;
    topFrame.areg2 = engine.areg2;
    topFrame.areg3 = engine.areg3;
    topFrame.areg4 = engine.areg4;
    topFrame.areg5 = engine.areg5;
    topFrame.areg6 = engine.areg6;
    topFrame.areg7 = engine.areg7;
    topFrame.areg8 = engine.areg8;

    topFrame.aregs = new Term[arity-8];
    System.arraycopy(engine.aregs, 0, topFrame.aregs, 0, topFrame.aregs.length);
    return topFrame;
  }

  static void restore0(ChoicePointFrame frame, Prolog engine){
    engine.cont = frame.cont;
  }

  private static void restore1(ChoicePointFrame frame, Prolog engine){
    engine.cont = frame.cont;
    engine.areg1 = frame.areg1;
  }

  private static void restore2(ChoicePointFrame frame, Prolog engine){
    engine.cont = frame.cont;
    engine.areg1 = frame.areg1;
    engine.areg2 = frame.areg2;
  }

  private static void restore3(ChoicePointFrame frame, Prolog engine){
    engine.cont = frame.cont;
    engine.areg1 = frame.areg1;
    engine.areg2 = frame.areg2;
    engine.areg3 = frame.areg3;
  }

  private static void restore4(ChoicePointFrame frame, Prolog engine){
    engine.cont = frame.cont;
    engine.areg1 = frame.areg1;
    engine.areg2 = frame.areg2;
    engine.areg3 = frame.areg3;
    engine.areg4 = frame.areg4;
  }

  private static void restore5(ChoicePointFrame frame, Prolog engine){
    engine.cont = frame.cont;
    engine.areg1 = frame.areg1;
    engine.areg2 = frame.areg2;
    engine.areg3 = frame.areg3;
    engine.areg4 = frame.areg4;
    engine.areg5 = frame.areg5;
  }

  private static void restore6(ChoicePointFrame frame, Prolog engine){
    engine.cont = frame.cont;
    engine.areg1 = frame.areg1;
    engine.areg2 = frame.areg2;
    engine.areg3 = frame.areg3;
    engine.areg4 = frame.areg4;
    engine.areg5 = frame.areg5;
    engine.areg6 = frame.areg6;
  }

  private static void restore7(ChoicePointFrame frame, Prolog engine){
    engine.cont = frame.cont;
    engine.areg1 = frame.areg1;
    engine.areg2 = frame.areg2;
    engine.areg3 = frame.areg3;
    engine.areg4 = frame.areg4;
    engine.areg5 = frame.areg5;
    engine.areg6 = frame.areg6;
    engine.areg7 = frame.areg7;
  }

  private static void restore8(ChoicePointFrame frame, Prolog engine){
    engine.cont = frame.cont;
    engine.areg1 = frame.areg1;
    engine.areg2 = frame.areg2;
    engine.areg3 = frame.areg3;
    engine.areg4 = frame.areg4;
    engine.areg5 = frame.areg5;
    engine.areg6 = frame.areg6;
    engine.areg7 = frame.areg7;
    engine.areg8 = frame.areg8;
  }

  private static void restoreA(ChoicePointFrame frame, Prolog engine){
    restore8(frame, engine);
    System.arraycopy(frame.aregs, 0, engine.aregs, 0, frame.aregs.length);
  }

  /** Discards all choice points after the value of <code>i</code>. */
  public void cut(int i) {
    if (level > i) {
      Arrays.fill(frames, i+1, level+1, null);
      level = i;
      top = frames[level];
    }
    trail.timeStamp = top.timeStamp;
  }

  /** Discards the top of choice points. */
  void delete() {
    level--;
    top = frames[level];
    trail.timeStamp = top.timeStamp;
  }

  /** Discards all choice points. */
  void init() {
    top = null;
    level = -1;
    trail.timeStamp = Long.MIN_VALUE;
    Arrays.fill(frames, null);
  }

  /** Get the current top of the stack. */
  public int top() {
    return level;
  }

  /** Get the maximum number of choice points permitted on the stack. */
  public int max() {
    // Since the stack is represented as a linked list, there is no limit.
    return Integer.MAX_VALUE;
  }

//  /** Shows the contents of this <code>CPFStack</code>. */
//  public void show() {
//    if (top == null) {
//      System.out.println("{choice point stack is empty!}");
//      return;
//    }
//    for (ChoicePointFrame e = top; e != null; e = e.prior) {
//      System.out.println(e);
//    }
//  }
}
