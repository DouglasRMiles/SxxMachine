
package SxxMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StatCreator {

    private boolean enabled;
    private PredikatenPrologMachine mach;
    private final Map<Class<Code>, Stat> stat;

    private Code running;
    private long startRunning;

    public StatCreator() {
        super();
        stat = new HashMap<Class<Code>, Stat>();
    }

    void setPrologMachine(PredikatenPrologMachine m) {
        if (m == null)
            throw new NullPointerException();
        mach = m;
    }

    public PredikatenPrologMachine getPrologMachine() {
        return mach;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    protected void startPred(Code c) {
        if (running != null)
            throw new IllegalStateException("Er draait nog een predikaat?");
        running = c;
        startRunning = System.currentTimeMillis();
    }

    @SuppressWarnings("unchecked")
    protected void stopPred(Code c) {
        if (c != running)
            throw new IllegalStateException("Not running?");
        running = null;
        if (!enabled)
            return;
        final long delta = System.currentTimeMillis() - startRunning;
        Stat s;
        if (!stat.containsKey(c.getClass())) {
            s = new Stat(this, (Class<Code>) c.getClass());
            stat.put((Class<Code>) c.getClass(), s);
        } else
            s = stat.get(c.getClass());
        s.appendRun(delta);
    }

    public void clearStats() {
        stat.clear();
    }

    public void printSortedOnTime() {
        printSortedOnTime(null);
    }

    public void printSortedOnTime(Long minTime) {
        final Set<Stat> s = new TreeSet<Stat>((o1, o2) -> (int) (o2.getRunningTime() - o1.getRunningTime()));
        s.addAll(stat.values());
        for (final Stat st : s) {
            if (minTime == null || st.getRunningTime() >= minTime)
                System.out.println(st);
        }
    }

}
