package SxxMachine.pterm;

import SxxMachine.IFluent;
import SxxMachine.Prog;
import SxxMachine.Term;
import SxxMachine.Undoable;

/**
 * A Fluent is a Prolog Object which has its own state, subject to changes over
 * time.
 * 
 */
abstract public class Fluent extends SystemObject implements Undoable, IFluent {
	public Fluent(Prog p) {
		trailMe(p);
	}

	/* (non-Javadoc)
     * @see SxxMachine.pterm.IFluent#toClone()
     */
	@Override
	public Term toClone() {
		oopsy();
		return this;
	}

	/* (non-Javadoc)
     * @see SxxMachine.pterm.IFluent#isFluent()
     */
	@Override
	public boolean isFluent() {
		return true;
	}

	private boolean persistent = false;

	/* (non-Javadoc)
     * @see SxxMachine.pterm.IFluent#setPersistent(boolean)
     */
	@Override
    public void setPersistent(boolean persistent) {
		this.persistent = persistent;
	}

	/* (non-Javadoc)
     * @see SxxMachine.pterm.IFluent#getPersistent()
     */
	@Override
    public boolean getPersistent() {
		return this.persistent;
	}

	/**
	 * Adds this Fluent to the parent Solver's trail, which will eventually call the
	 * undo method of the Fluent on backtracking.
	 */
	protected void trailMe(Prog p) {
		if (null != p)
			p.getTrail().push((Undoable)this);
	}

	/* (non-Javadoc)
     * @see SxxMachine.pterm.IFluent#stop()
     */
	@Override
    public void stop() {
	}

	/* (non-Javadoc)
     * @see SxxMachine.pterm.IFluent#undo()
     */
	@Override
	public void undo() {
		if (!persistent)
			stop();
	}
}
