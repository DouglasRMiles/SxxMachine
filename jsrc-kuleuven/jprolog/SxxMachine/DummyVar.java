
package SxxMachine;

/**
  * Dummy Var voor de indexing. Deze var is enkel om te zorgen dat bij de indexering, er
  * kan gekeken worden of een bepaald element een var is of niet en of deze kan matchen met
  * de opgegeven parameters.
  *
  *  @author  Tim Boven
  */
public class DummyVar extends AbstractVar {

    @Override
    public Term copy(RunningPrologMachine m, long t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unTrailSelf() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean bind(Term that) {
        throw new UnsupportedOperationException();
    }

}
