
package SxxMachine;

import java.io.File;

@SuppressWarnings("rawtypes")
public abstract class PredikatenPrologMachine {

    private final static Logger log = Logger.getLogger(PredikatenPrologMachine.class);

    public final TrueProc True0;
    public final CutProc Cut2;
    public final Call2Proc Call2;
    public final Call1Proc Call1;
    public final FailProc Fail0;

    private final PredikaatLoader loader;
    private final JpPredTable predicates;

    protected PredikatenPrologMachine() {
        super();
        loader = new PredikaatLoader();
        predicates = new JpPredTable();
        Fail0 = FailProc.createInstance(this);
        Call1 = Call1Proc.createInstance(this);
        Call2 = new Call2Proc(this);
        Cut2 = new CutProc(this);
        True0 = new TrueProc(this);
    }

    @SuppressWarnings("unchecked")
    protected void loadQuery(File folder) {
        try {
            final Class<Code> f = (Class<Code>) loader.locateTemporaryClass(folder, "SxxMachine.query");
            registerCode(f.newInstance(), "$$query");
        } catch (final Exception e) {
            registerCode(Fail0, "$$query");
        }

    }

    protected void removeQuery() {
        predicates.removeQuery();
    }

    public PredikaatLoader getPredikaatLoader() {
        return loader;
    }

    public void registerCode(Code code, String functor) {
        predicates.insertNameArity(functor, code.arity() + 1, code);
    }

    /**
     * Look up a predicate.
     *  @param  Name
     *            predicate name
     *  @param  arity
     *            predicate arity before binarization
     *  @return  predicate
     */
    public Code loadPred(String Name, int arity) {

        try {
            return loadPredikaat(Name, arity);
        } catch (final ClassNotFoundException e) {
            log.debug(e);
        } catch (final IllegalAccessException e) {
            throw new JPrologInternalException("error loading " + Name + "/" + arity, e);
        } catch (final InstantiationException e) {
            throw new JPrologInternalException("error creating " + Name + "/" + arity, e);
        }

        log.fatal("Predicate " + Name + "/" + arity + " not found; does its .class file exist ?");
        setExceptionState(ErrorStatus.FATALERROR);
        return Fail0;
    }

    public Code loadPredikaat(String predName, int arity)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (arity < 0)
            throw new IllegalArgumentException();
        Code code = predicates.isInPredTable(predName, arity + 1);
        if (code != null)
            return code;
        final String s1 = "SxxMachine.pred_" + predName + "_" + arity;
        final Class loaded_class = loader.locateClass(s1);
        code = (Code) loaded_class.newInstance();
        predicates.insertNameArity(predName, arity + 1, code);
        code.init(this);
        return code;
    }

    public boolean couldLoadPredikaat(String predName, int arity) {
        if (arity < 0)
            throw new IllegalArgumentException();
        try {
            loadPredikaat(predName, arity);
            return true;
        } catch (final Exception ex) {
            return false;
        }
    }

    protected abstract void setExceptionState(ErrorStatus status);

}
