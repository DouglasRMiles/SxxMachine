
package SxxMachine;

public enum ErrorStatus {
    NONE { //0
        @Override
        public boolean continueRunning() {
            return true;
        }
    },
    CHANGEDPENDINGGOALS, //1
    NORMALEXIT, //2
    FATALERROR, //3
    /**
     * AbortThread is een status die gebruikt wordt als er door
     * bv een interrupt vd huidige thread een abort
     * veroorzaakt wordt.
     */
    ABORTTHREAD;

    public boolean continueRunning() {
        return false;
    }
}
