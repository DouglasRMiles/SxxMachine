package SxxMachine;

/**
 * Code consists of predicates and built-ins.
 *
 * @author toms
 */
public abstract class Code
{
  protected final static Term[] NOARGS = new Term[ 0 ];

  @Override
  public String toString()
  {
    return getClass().getSimpleName();
  }

  /**
   * @return predicate arity
   */
  public abstract int arity();

  /**
   * @param mach
   * @return continuation
   */
  public abstract Code exec(PrologMachine mach) throws JPrologInternalException;

  /**
   * Initialize this code.
   *
   * @param mach
   */
  protected void init(PredikatenPrologMachine mach)
  {}

  /**
   * Methode waarmee de argumenten voor dit code-blok kunnen opgevraagd worden,
   * deze methode is handig om aan de hand van deze informatie een
   * index-structuur te bouwen waardoor er een snellere uitvoering kan gehaald
   * worden
   *
   * @return array met de argumenten zoals gewenst voor dit stuk code, indien
   *         dit stuk code zelf hiervan niet op de hoogte is (bv voor
   *         compatibiliteit met oudere versies) kan null teruggegeven worden.
   *         Indien de methode geen argumenten heeft, moet een array met lengte
   *         0 teruggegeven worden.
   */
  protected Term[] getArgs()
  {
    return null;
  }
}
