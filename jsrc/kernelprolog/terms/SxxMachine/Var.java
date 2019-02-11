package SxxMachine;

/**
 * Part of the Term hierarchy implmenting logical variables. They are subject to
 * reset by application of and undo action keep on the trail stack.
 */
abstract public class Var extends Term implements Undoable {

	abstract public boolean unbound();

}