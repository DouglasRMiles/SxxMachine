
package SxxMachine;

// jProlog 0.1 Copyright (C) Bart Demoen, Paul Tarau 1996
// Prolog implementation in Java
// KUL and CUM

// changes by Bart Demoen - 25 Jan 1997 - for calling Prolog from within Java
// allows to make a new PrologMachine, start a goal and get answers back
// all at once as with findall

public class PrologFromJava {
    public static void main(String args[]) throws JPrologScriptException {

        // this is the application
        // before it can call a Prolog goal, it must make and initialise a
        // machine

        PrologMachine M = new PrologMachine();

        // any time a new goal is called, the machine has to be "reset"

        M.initAlways();

        // then you can call the goal

        while (true) {
            Term Goal = JpFactory.S(Const.strIntern("toplevel")); // animal(X)

            //PrologObject Goal = new StructureTerm("animal".intern(), new Var(M)); // animal(X)
            try {
                Term AnswerList = M.solveGoal(Goal);

                // AnswerList is now a list of instances of the Goal
                // you can iterate through it as follows

                Term NextAnswerList, Answer;

                NextAnswerList = AnswerList.dref();
                while (NextAnswerList.isCons()) {
                    Answer = (((AFunct) NextAnswerList).args()[0]).dref();
                    // do something with the answer - e.g. print it
                    String s = Answer.toString();
                    System.out.println(s);
                    System.out.flush();

                    // get the tail of the next answer list
                    NextAnswerList = (((AFunct) NextAnswerList).args()[1]).dref();
                }
            } catch (Throwable e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
