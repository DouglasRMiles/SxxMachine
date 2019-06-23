
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

// jProlog 0.1 Copyright (C) Bart Demoen, Paul Tarau 1996
// Prolog implementation in Java
// KUL and CUM

public class PrologFromJava {
    public static void main(String args[]) throws JPrologScriptException {

        // this is the application
        // before it can call a Prolog goal, it must make and initialise a
        // machine

        final PrologMachine M = new PrologMachine();

        // any time a new goal is called, the machine has to be "reset"

        M.initAlways();

        // then you can call the goal

        while (true) {
            final Term Goal = SYM("toplevel"); // animal(X)

            //PrologObject Goal = new StructureTerm("animal".intern(), new Var(M)); // animal(X)
            try {
                final Term AnswerList = M.solveGoal(Goal);

                // AnswerList is now a list of instances of the Goal
                // you can iterate through it as follows

                Term NextAnswerList, Answer;

                NextAnswerList = AnswerList.dref();
                while (NextAnswerList.isCons()) {
                    Answer = (NextAnswerList.getPlainArg(0)).dref();
                    // do something with the answer - e.g. print it
                    final String s = Answer.portrayTerm();
                    System.out.println(s);
                    System.out.flush();

                    // get the tail of the next answer list
                    NextAnswerList = (NextAnswerList.getPlainArg(1)).dref();
                }
	            } catch (final Throwable e) {
	                e.printStackTrace();
	            }
        }
    }
}
