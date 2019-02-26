
package SxxMachine;

public class Stat {

    private final StatCreator cr;
    private int timesRun;
    private long timeInMSRunning;
    private final Class<Code> forCode;

    protected Stat(StatCreator cr, Class<Code> code) {
        if (cr == null)
            throw new NullPointerException();
        if (code == null)
            throw new NullPointerException();
        forCode = code;
        this.cr = cr;
        timesRun = 0;
        timeInMSRunning = 0;
    }

    protected StatCreator getStatCreator() {
        return cr;
    }

    @Override
    public String toString() {
        return forCode.getName() + ": runned " + timesRun + " in " + timeInMSRunning + "ms";
    }

    protected void appendRun(long timeDelta) {
        if (timeDelta < 0)
            throw new IllegalArgumentException();
        timesRun++;
        timeInMSRunning += timeDelta;
    }

    public long getRunningTime() {
        return timeInMSRunning;
    }

}
