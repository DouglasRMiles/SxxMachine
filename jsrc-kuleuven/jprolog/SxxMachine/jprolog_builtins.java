package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import java.io.PrintWriter;
// some builtins written in Java for Prolog
// Bart Demoen, Paul Tarau Aug 1996 Moncton
// there is a mapping from special names (like <) to tokens
// with only letters - the compiler must be aware of that mapping

// smallerthan implements </2
class pred_smallerthan_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    double i1, i2;
    Term dereffed;
    final TermArray local_aregs = mach.getAreg();
    dereffed = local_aregs.getTermDRef( 0 );
    i1 = dereffed.doubleValue();
    dereffed = local_aregs.getTermDRef( 1 );
    i2 = dereffed.doubleValue();
    if( i1 < i2 )
    {
      mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) );
      mach.setARegENull( local_aregs, 2, 1 );
      // local_aregs.a(0).v = local_aregs.a(2).v;
      // local_aregs.a(1).v = local_aregs.a(2).v = null;
      return mach.getCall1();
    }
    return mach.Fail0;
  }
}

// smallerorequal implements =</2
class pred_smallerorequal_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    double i1, i2;
    Term dereffed;
    final TermArray local_aregs = mach.getAreg();
    dereffed = local_aregs.getTermDRef( 0 );
    i1 = dereffed.doubleValue();
    dereffed = local_aregs.getTermDRef( 1 );
    i2 = dereffed.doubleValue();
    if( i1 <= i2 )
    {
      mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) );
      mach.setARegENull( local_aregs, 2, 1 );
      // local_aregs.a(0).v = local_aregs.a(2).v;
      // local_aregs.a(1).v = local_aregs.a(2).v = null;
      return mach.getCall1();
    }
    return mach.Fail0;
  }
}

// arithequal implements =:=/2
class pred_arithequal_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    double i1, i2;
    Term dereffed;
    final TermArray local_aregs = mach.getAreg();
    dereffed = local_aregs.getTermDRef( 0 );
    i1 = dereffed.doubleValue();
    dereffed = local_aregs.getTermDRef( 1 );
    i2 = dereffed.doubleValue();
    if( i1 == i2 )
    {
      mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) );
      mach.setARegENull( local_aregs, 2, 1 );
      // local_aregs.a(0).v = local_aregs.a(2).v;
      // local_aregs.a(1).v = local_aregs.a(2).v = null;
      return mach.getCall1();
    }
    return mach.Fail0;
  }
}

// arithdifferent implements =\= /2
class pred_arithdifferent_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    double i1, i2;
    Term dereffed;
    final TermArray local_aregs = mach.getAreg();
    dereffed = ( local_aregs.getPlainArg( 0 ) ).dref();
    i1 = dereffed.doubleValue();
    dereffed = ( local_aregs.getPlainArg( 1 ) ).dref();
    i2 = dereffed.doubleValue();
    if( i1 != i2 )
    {
      mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) );
      mach.setARegENull( local_aregs, 2, 1 );
      // local_aregs.a(0).v = local_aregs.a(2).v; // move continuation to first
      // register
      // local_aregs.a(1).v = local_aregs.a(2).v = null;
      return mach.getCall1();
    }
    return mach.Fail0;
  }
}

// is implements is/2
class pred_is_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    double i1;
    Term dereffed;
    final TermArray local_aregs = mach.getAreg();
    dereffed = ( local_aregs.getPlainArg( 1 ) ).dref();
    i1 = dereffed.doubleValue();
    long l1 = dereffed.longValue();
    dereffed = ( local_aregs.getPlainArg( 0 ) ).dref();
    Term Res = null;
    if( l1 == i1 )
    {
      Res = Integer( l1 );
    }
    else
    {
      Res = Float( i1 );
    }
    if( !( dereffed.unifyJP( Res ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) );
    mach.setARegENull( local_aregs, 2, 1 );
    // local_aregs.a(0).v = local_aregs.a(2).v;
    // local_aregs.a(1).v = local_aregs.a(2).v = null;
    return mach.getCall1();
  }
}

// unify implements =/2
class pred_unify_2
    extends
      Code
{
  private final static Logger log = Logger.getLogger( pred_unify_2.class );

  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final Term arg2 = local_aregs.getTermDRef( 1 );
    if( !( arg1.unifyJP( arg2 ) ) )
    {
      return mach.Fail0;
    }
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) );
    mach.setARegENull( local_aregs, 2, 1 );
    // local_aregs.a(0).v = local_aregs.a(2).v; // move continuation to first
    // register
    // local_aregs.a(1).v = local_aregs.a(2).v = null;
    if( mach.getExceptionState() == ErrorStatus.CHANGEDPENDINGGOALS )
    {
      log.info( "...pushing interrupt vector to the front of the continuation" );
      local_aregs.setAreg0( ( S( ( "call_list" ), mach.getPendinggoals(), local_aregs.getPlainArg( 0 ) ) ) );
      mach.setExceptionState( ErrorStatus.NONE );
      mach.setPendinggoals( Prolog.Nil );
    }
    return mach.getCall1(); // call continuation in first register
  }
}

// univ implements =../2
class pred_univ_3
    extends
      Code
{
  @Override
  public int arity()
  {
    return 3;
  }

  // Areg[0] is a free variable
  // Areg[1] is a Const
  // Areg[2] is a list of PrologObjects
  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final Term arg2 = local_aregs.getTermDRef( 1 );
    final Term arg3 = local_aregs.getTermDRef( 2 );
    // Bij testen van werking code in vergelijking met YAP moet dit ook zo
    // werken voor int
    if( arg1.isAtomOrObject() || arg1 instanceof NumberTerm )
    {
      // Geen parameters bijgevolg
      if( !arg2.unifyJP( arg1 ) )
        return mach.Fail0;
      if( !arg3.unifyJP( CONST( "[]" ) ) )
        return mach.Fail0;
      local_aregs.setAreg0( ( local_aregs.getPlainArg( 3 ) ) );
      mach.setARegENull( local_aregs, 3, 1 );
      return mach.getCall1();
    }
    else if( arg1.isCompound() )
    {
      final AFunct term = (AFunct) arg1;
      final Term functor = CONST( term.fname() );
      final Term arguments = AFunct.listFromArray( term.args() );
      if( !arg2.unifyJP( functor ) )
        return mach.Fail0;
      if( !arg3.unifyJP( arguments ) )
        return mach.Fail0;
      local_aregs.setAreg0( ( local_aregs.getPlainArg( 3 ) ) );
      mach.setARegENull( local_aregs, 3, 1 );
      return mach.getCall1();
    }
    else
    {
      Term tail = arg3;
      int l = 0;
      while ( tail.isCons())
      {
        tail = tail.cdr();
        l++;
      }
      // if (l == 0) //l == 0 kan als er geen parameters zijn voor de gegeven
      // functie
      // return mach.Fail0;
      if( !( tail.isNil() ) )
        return mach.Fail0;
      if( !( arg2.isAtomOrObject() ) )
      {
        if( arg2 instanceof NumberTerm && l == 0 )
        {
          // Moet toch nog werken
          if( !arg1.unifyJP( arg2 ) )
            return mach.Fail0;
          local_aregs.setAreg0( ( local_aregs.getPlainArg( 3 ) ) );
          mach.setARegENull( local_aregs, 3, 1 );
          return mach.getCall1();
        }
        return mach.Fail0;
      }
      final Term args[] = new Term[ l ];
      tail = arg3;
      int i;
      for( i = 0; i < l; i++ )
      {
        args[ i ] = tail.getPlainArg( 0 );
        tail = ( tail.getPlainArg( 1 ) ).dref();
      }
      if( !arg1.unifyJP( S( arg2.fname(), args ) ) )
        return mach.Fail0;
      mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 3 ) );
      mach.setARegENull( local_aregs, 3, 1 );
      return mach.getCall1();
    }
  }
}

class pred_write_1
    extends
      Code
{
  @Override
  public int arity()
  {
    return 1;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final String s = ( local_aregs.getTermDRef( 0 ) ).portrayTerm();
    final PrintWriter writer = mach.getIOLayer().getCurrentOutputStream();
    writer.print( s );
    writer.flush();
    mach.setARegXFR( local_aregs, 0, 1 );
    mach.setARegENull( local_aregs, 1 );
    return mach.getCall1();
  }
}

class pred_nl_0
    extends
      Code
{
  @Override
  public int arity()
  {
    return 0;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    mach.getIOLayer().getCurrentOutputStream().println();
    TermArray local_aregs = mach.getAreg();
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 0 ) );
    return mach.getCall1();
  }
}

class pred_functor_3
    extends
      Code
{
  @Override
  public int arity()
  {
    return 3;
  }

  boolean DoFunctor3(PrologMachine mach, Term arg1, Term arg2, Term arg3)
  {
    arg1 = arg1.dref();
    arg2 = arg2.dref();
    arg3 = arg3.dref();
    if( arg1 instanceof JpVar )
    {
      if( ( !( arg2.isAtomOrObject() ) ) || ( !( arg3 instanceof NumberTerm ) ) )
        return false;
      int i = (int) ( arg3.longValue() );
      final String Name = arg2.fname();
      final Term args[] = new Term[ i ];
      while ( i-- > 0)
      {
        args[ i ] = Jv( mach );
      }
      if( !( arg1.unifyJP( S( Name, args ) ) ) )
        return false;
    }
    else
    {
      final String Name = arg1.fname();
      final int arity = arg1.arity();
      if( !( arg2.unifyJP( CONST( Name ) ) ) )
        return false;
      if( !( arg3.unifyJP( Integer( arity ) ) ) )
        return false;
    }
    return true;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    if( !DoFunctor3( mach, local_aregs.getPlainArg( 0 ), local_aregs.getPlainArg( 1 ), local_aregs.getPlainArg( 2 ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 3 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    mach.setARegENull( local_aregs, 3, 1 );
    return mach.getCall1();
  }
}

class pred_arg_3
    extends
      Code
{
  @Override
  public int arity()
  {
    return 3;
  }

  boolean DoArg3(PredikatenPrologMachine mach, Term arg1, Term arg2, Term arg3)
  {
    arg1 = arg1.dref();
    arg2 = arg2.dref();
    arg3 = arg3.dref();
    if( !( arg1 instanceof NumberTerm ) )
      return false;
    if( !( arg2.isCompound() ) )
      return false;
    final int i = (int) arg1.doubleValue();
    if( i < 1 )
      return false;
    final int l = arg2.arity();
    if( i > l )
      return false;
    Term x = arg2.getDrefArg( i - 1 );
    x = x.dref();
    return ( arg3.unifyJP( x ) );
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    if( !DoArg3( mach, local_aregs.getPlainArg( 0 ), local_aregs.getPlainArg( 1 ), local_aregs.getPlainArg( 2 ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 3 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    mach.setARegENull( local_aregs, 3, 1 );
    return mach.getCall1();
  }
}

class pred_nexttoken_1
    extends
      Code
{
  @Override
  public int arity()
  {
    return 1;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    if( !( arg1 instanceof JpVar ) )
      return mach.Fail0;
    final Term t = mach.nexttoken();
    if( !( arg1.unifyJP( t.dref() ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 1 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    mach.setARegENull( local_aregs, 1 );
    return mach.getCall1();
  }
}

class pred_cputime_1
    extends
      Code
{
  @Override
  public int arity()
  {
    return 1;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final long t = java.lang.System.currentTimeMillis();
    final Term o = Integer( t );
    if( !( arg1.unifyJP( o ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 1 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    mach.setARegENull( local_aregs, 1 );
    return mach.getCall1();
  }
}

class findall_list
    extends
      JPrologObject
{
  JpVar uptonowbegin, uptonowend;
  long time;

  findall_list( PrologMachine mach )
  {
    uptonowbegin = uptonowend = Jv( mach );
    time = mach.getTimestamp();
  }

  @Override
  public Term dref()
  {
    return this;
  }

  @Override
  public boolean unifyJP(Term that)
  {
    return that.bindJP( this );
  }

  @Override
  public String toStringImpl(int depth)
  {
    return ( "findall = " + ( uptonowbegin.dref() ).portrayTerm() + " - " + ( uptonowend.dref() ).portrayTerm() );
  }
}

class pred_initfindall_1
    extends
      Code
{
  @Override
  public int arity()
  {
    return 1;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    if( !( arg1.unifyJP( new findall_list( mach ) ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 1 ) );
    // mach.setCont(local_aregs, 0, local_aregs.a(1).v); // dinstall the
    // continuation
    mach.setARegENull( local_aregs, 1 );
    return mach.getCall1();
  }
}

class pred_addfindall_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final findall_list arg2 = (findall_list) ( local_aregs.getTermDRef( 1 ) );
    final int oldtrail = mach.getCurrentStackItem().getTrailSize();
    final Term copy = arg1.copyJP( mach, arg2.time );
    mach.getCurrentStackItem().unTrail( oldtrail );
    final JpVar NewTail = Jv( mach );
    ( arg2.uptonowend ).Refers = CONS( copy, NewTail );
    arg2.uptonowend = NewTail;
    // local_aregs.a(0).v = local_aregs.a(2).v ; // install the continuation
    // local_aregs.a(1).v = local_aregs.a(2).v = null ;
    return mach.Fail0;
  }
}

class pred_retrievefindall_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final findall_list arg2 = (findall_list) ( local_aregs.getTermDRef( 1 ) );
    ( arg2.uptonowend ).Refers = CONST( internS( "[]" ) );
    if( !( arg1.unifyJP( ( arg2.uptonowbegin ).dref() ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) );
    // mach.setCont(local_aregs, 0, local_aregs.a(2).v); // dinstall the
    // continuation
    mach.setARegENull( local_aregs, 2, 1 );
    return mach.getCall1();
  }
}

class pred_var_equal_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final Term arg2 = local_aregs.getTermDRef( 1 );
    if( arg1 != arg2 )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) );
    // mach.setCont(local_aregs, 0, local_aregs.a(2).v); // dinstall the
    // continuation
    mach.setARegENull( local_aregs, 2, 1 );
    return mach.getCall1();
  }
}

class pred_trail_1
    extends
      Code
{
  @Override
  public int arity()
  {
    return 1;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    if( !( arg1.unifyJP( Integer( ( mach.getCurrentStackItem().getTrailSize() ) ) ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 1 ) );
    // mach.setCont(local_aregs, 0, local_aregs.a(1).v); // dinstall the
    // continuation
    mach.setARegENull( local_aregs, 1 );
    return mach.getCall1();
  }
}

class pred_choice_1
    extends
      Code
{
  @Override
  public int arity()
  {
    return 1;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    if( !( arg1.unifyJP( Integer( ( mach.getCurrentChoice() ) ) ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 1 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    mach.setARegENull( local_aregs, 1 );
    return mach.getCall1();
  }
}

class pred_type_of_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final Term arg2 = local_aregs.getTermDRef( 1 );
    String s;
    if( arg1 instanceof JpVar )
      s = internS( "var" );
    else if( arg1 instanceof FrozenVar )
      s = internS( "var" );
    else if( arg1 instanceof AttributedVariable )
      s = internS( "var" );
    else if( arg1 instanceof NumberTerm )
      s = internS( "integer" );
    else if( arg1.isAtomOrObject() )
      s = internS( "atom" );
    else if( arg1.isCompound() )
    {
      final Compound a = (Compound) arg1;
      if( a.arity() == 0 )
        s = internS( "atom" );
      else
        s = internS( "struct" );
    }
    else
      s = internS( "unknown" );
    if( !( arg2.unifyJP( CONST( s ) ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    local_aregs.setAreg1( ( local_aregs.setAreg2( ( null ) ) ) );
    return mach.getCall1();
  }
}

class pred_atype_of_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final Term arg2 = local_aregs.getTermDRef( 1 );
    String s;
    if( arg1 instanceof JpVar )
      s = internS( "var" );
    else if( arg1 instanceof FrozenVar )
      s = internS( "var" );
    else if( arg1 instanceof AttributedVariable )
      s = internS( "attvar" );
    else if( arg1 instanceof NumberTerm )
      s = internS( "integer" );
    else if( arg1.isAtomOrObject() )
      s = internS( "atom" );
    else if( arg1.isCompound() )
    {
      final Compound a = (Compound) arg1;
      if( a.arity() == 0 )
        s = internS( "atom" );
      else
        s = internS( "struct" );
    }
    else
      s = internS( "unknown" );
    if( !( arg2.unifyJP( CONST( s ) ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    local_aregs.setAreg1( ( local_aregs.setAreg2( ( null ) ) ) );
    return mach.getCall1();
  }
}

class pred_assume_1
    extends
      Code
{
  @Override
  public int arity()
  {
    return 1;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final Term ass = ( mach.getAssumptions() ).dref();
    mach.trailEntry( new PopAssumptions( mach, ass ) );
    mach.setAssumptions( CONS( arg1, ass ) );
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 1 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    mach.setARegENull( local_aregs, 1 );
    return mach.getCall1();
  }
}

class pred_allassumed_1
    extends
      Code
{
  @Override
  public int arity()
  {
    return 1;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final Term ass = ( mach.getAssumptions() ).dref();
    if( !( arg1.unifyJP( ass ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 1 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    mach.setARegENull( local_aregs, 1 );
    return mach.getCall1();
  }
}

class pred_get0_1
    extends
      Code
{
  @Override
  public int arity()
  {
    return 1;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    int i;
    try
    {
      i = mach.getIOLayer().getStreamHandlerIn().getCurrentStream().getStream().read();
    }
    catch( final Exception e )
    {
      return mach.Fail0;
    }
    if( !( arg1.unifyJP( Integer( i ) ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 1 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    mach.setARegENull( local_aregs, 1 );
    return mach.getCall1();
  }
}

class pred_halt_0
    extends
      Code
{
  @Override
  public int arity()
  {
    return 0;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    mach.setExceptionState( ErrorStatus.NORMALEXIT );
    return null;
  }
}

class pred_setarg_3
    extends
      Code
{
  @Override
  public int arity()
  {
    return 3;
  }

  boolean DoSetArg3(PrologMachine mach, Term arg1, Term arg2, Term arg3)
  {
    arg1 = arg1.dref();
    arg2 = arg2.dref();
    arg3 = arg3.dref();
    if( !( arg1 instanceof NumberTerm ) )
      return false;
    if( !( arg2.isCompound() ) )
      return false;
    final int i = (int) ( arg1.doubleValue() ); //fix AFunct
    if( i < 1 )
      return false;
    final int l = arg2.arity(); //fix AFunct
    if( i > l )
      return false;
    final Term x = arg2.args()[ i - 1 ]; //fix AFunct
    final JpVar v = Jv( mach );
    v.Refers = arg3;
    arg2.args()[ i - 1 ] = v;//fix AFunct
    mach.trailEntry( new SetArgTrail( x, v, mach ) );
    return true;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    if( !DoSetArg3( mach, local_aregs.getPlainArg( 0 ), local_aregs.getPlainArg( 1 ), local_aregs.getPlainArg( 2 ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 3 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    mach.setARegENull( local_aregs, 3, 1 );
    return mach.getCall1();
  }
}

class pred_freeze_internal_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final Term arg2 = local_aregs.getTermDRef( 1 );
    final FrozenVar frv = new FrozenVar( mach, arg2 );
    if( !( arg1.unifyJP( frv ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    local_aregs.setAreg1( ( local_aregs.setAreg2( ( null ) ) ) );
    return mach.getCall1();
  }
}

class pred_execcontinuation_0
    extends
      Code
{
  @Override
  public int arity()
  {
    return 0;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    if( !( ( arg1 ) instanceof Continuation ) )
      return mach.Fail0;
    final Continuation c = (Continuation) arg1;
    final Code code = c.getCode();
    int i = code.arity() + 1;
    while ( i-- > 0)
    {
      local_aregs.setAV( i, c.getArg( i ) );
    }
    return code;
  }
}

class pred_frozen_2
    extends
      Code
{
  @Override
  public int arity()
  {
    return 2;
  }

  @Override
  public Code exec(PrologMachine mach)
  {
    final TermArray local_aregs = mach.getAreg();
    final Term arg1 = local_aregs.getTermDRef( 0 );
    final Term arg2 = local_aregs.getTermDRef( 1 );
    Term goal;
    if( arg1 instanceof JpVar )
      goal = CONST( internS( "true" ) );
    else if( arg1 instanceof FrozenVar )
      goal = ( ( (FrozenVar) arg1 ).getGoals() ).dref();
    else
      return mach.Fail0;
    if( !( arg2.unifyJP( goal ) ) )
      return mach.Fail0;
    mach.setCont( local_aregs, 0, local_aregs.getPlainArg( 2 ) ); // dinstall
                                                                  // the
                                                                  // continuation
    local_aregs.setAreg1( ( local_aregs.setAreg2( ( null ) ) ) );
    return mach.getCall1();
  }
}
