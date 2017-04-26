// Copyright 2011 Google Inc. All Rights Reserved.

package com.googlecode.prolog_cafe.lang;

import java.util.function.BiConsumer;

/**
 * Choice point frame.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class ChoicePointFrame {

  long timeStamp;
  Operation cont;  // continuation goal
  Operation bp;    // next clause
  int tr;    // trail pointer
  int b0;    // cut point

  Predicate ownerPredicate; // used in PrologLogger
  int loggerStackTop; // used in PrologLogger

  BiConsumer<ChoicePointFrame, Prolog> restore; // method to restore the engine from stacke

  Term areg1, areg2, areg3, areg4, areg5, areg6, areg7, areg8;
  Term[] aregs;

  public String toString() {
    return ChoicePointFrame.class.getName() + '{' +
            "time:" + timeStamp +
            " cont:" + cont +
            " bp:" + bp +
            " tr:" + tr +
            " b0:" + b0 +
            '}';
  }
}
