package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.CONS;
import static SxxMachine.pterm.TermData.Float;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Long;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.SYM;
import static SxxMachine.pterm.TermData.V;
import static SxxMachine.pterm.TermData.asInt;
import static SxxMachine.pterm.TermData.asStruct;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;

import SxxMachine.BlockingPrologControl;
import SxxMachine.Builtins;
import SxxMachine.Compound;
import SxxMachine.FILE_system;
import SxxMachine.Functor;
import SxxMachine.HashDict;
import SxxMachine.IO;
import SxxMachine.Nonvar;
import SxxMachine.NumberTerm;
import SxxMachine.Operation;
import SxxMachine.Prolog;
import SxxMachine.PrologMain;
import SxxMachine.Term;
import SxxMachine.TermArray;
import SxxMachine.Var;

/**
 * Lexicographic analyser reading from a stream
 */
class LexerHIDE
    extends
      StreamTokenizer
{
  protected Reader input;

  public LexerHIDE( Reader I ) throws IOException
  {
    super( I );
    this.input = I;
    parseNumbers();
    eolIsSignificant( true );
    ordinaryChar( '.' );
    ordinaryChar( '-' ); // creates problems with -1 etc.
    ordinaryChar( '/' );
    quoteChar( '\'' );
    quoteChar( '\"' );
    wordChar( '$' );
    wordChar( '_' );
    slashStarComments( true );
    commentChar( '%' );
    dict = new HashDict();
  }

  /**
   * Path+File name based constructor Used in prolog2java
   */
  public LexerHIDE( String path, String s ) throws IOException
  {
    this( IO.url_or_file( path + s ) ); // stream
  }

  /**
   * String based constructor. Used in queries ended by \n + prolog2java.
   */
  public LexerHIDE( String s ) throws Exception
  {
    this( IO.string_to_stream( s ) );
  }

  public LexerHIDE() throws IOException
  {
    this( IO.input );
  }
  private final static String anonymous = "_";

  private final static String char2string(int c)
  {
    return "" + (char) c;
  }
  private boolean inClause = false;

  public boolean atEOF()
  {
    boolean yes = ( TT_EOF == ttype );
    if( yes )
      try
      {
        input.close();
      }
      catch( IOException e )
      {
        IO.trace( "unable to close atEOF" );
      }
    return yes;
  }

  boolean atEOC()
  {
    return !inClause;
  }

  protected final static Term make_const(String s)
  {
    return new constToken( s );
  }

  private final static Term make_fun(String s)
  {
    return new funToken( s );
  }

  private final static Term make_int(double n)
  {
    return new intToken( (int) n );
  }

  private final static Term make_real(double n)
  {
    return new realToken( n );
  }

  private final static Term make_number(double nval)
  {
    Term T;
    if( Math.floor( nval ) == nval )
      T = make_int( nval );
    else
      T = make_real( nval );
    return T;
  }

  private final Term make_var(String s)
  {
    s = s.intern();
    VariableTerm X;
    long occ;
    if( s == anonymous )
    {
      occ = 0;
      X = V();
      s = X.toString();
    }
    else
    {
      X = (VariableTerm) dict.get( s );
      if( X == null )
      {
        occ = 1;
        X = V();
        X.varName = s;
      }
      else
      {
        occ = asInt( (Term) dict.get( X ) ).longValue();
        occ++;
      }
    }
    LongTerm I = Long( occ );
    dict.put( X, I );
    dict.put( s, X );
    return new varToken( X, SYM( s ), I );
  }

  private final void wordChar(char c)
  {
    wordChars( c, c );
  }
  HashDict dict;

  private Term getWord(boolean quoted) throws IOException
  {
    Term T;
    if( quoted && 0 == sval.length() )
      T = make_const( "" );
    /*
     * DO NOT DO THIS: quoting is meant to prevent it!!! else
     * if("()[]|".indexOf(sval.charAt(0))>=0) { switch(sval.charAt(0)) { case
     * '(': T=new lparToken(); break; case ')': T=new rparToken(); break; case
     * '[': T=new lbraToken(); break; case ']': T=new rbraToken(); break; case
     * '|': T=new barToken(); break; } }
     */
    else
    {
      char c = sval.charAt( 0 );
      if( !quoted && ( Character.isUpperCase( c ) || '_' == c ) )
        T = make_var( sval );
      else
      { // nonvar
        String s = sval;
        int nt = nextToken();
        pushBack();
        T = ( '(' == nt ) ? make_fun( s ) : make_const( s );
      }
    }
    return T;
  }

  protected Term next() throws IOException
  {
    int n = nextToken();
    inClause = true;
    Term T;
    switch( n )
    {
      case TT_WORD:
        T = getWord( false );
        break;
      case '\'':
        T = getWord( true );
        break;
      case TT_NUMBER:
        T = make_number( nval );
        break;
      case TT_EOF:
        T = new eofToken();
        inClause = false;
        break;
      case TT_EOL:
        T = next();
        break;
      case '-':
        if( TT_NUMBER == nextToken() )
        {
          T = make_number( -nval );
        }
        else
        {
          pushBack();
          T = make_const( char2string( n ) );
        }
        break;
      case ':':
        if( '-' == nextToken() )
        {
          T = new iffToken( ":-" );
        }
        else
        {
          pushBack();
          T = make_const( char2string( n ) );
        }
        break;
      case '.':
        int c = nextToken();
        if( TT_EOL == c || TT_EOF == c )
        {
          inClause = false;
          // dict.clear(); ///!!!: this looses Var names
          T = new eocToken();
        }
        else
        {
          pushBack();
          T = make_const( char2string( n ) ); // !!!: sval is gone
        }
        break;
      case '\"':
        T = new stringToken( (constToken) getWord( true ) );
        break;
      case '(':
        T = new lparToken();
        break;
      case ')':
        T = new rparToken();
        break;
      case '[':
        T = new lbraToken();
        break;
      case ']':
        T = new rbraToken();
        break;
      case '|':
        T = new barToken();
        break;
      case ',':
        T = new commaToken();
        break;
      default:
        T = make_const( char2string( n ) );
    }
    // IO.mes("TOKEN:"+T);
    return T;
  }
}

class StructureToken
    extends
      StructureTerm
{
  protected StructureToken( String c, Term... val )
  {
    super( c, val );
  }
}

class varToken
    extends
      StructureToken
{
  public varToken( Var X, Nonvar nonvar, NumberTerm I )
  {
    super( "varToken", X, nonvar, I);
  }

  @Override
  public Term clone()
  {
    return new varToken( argz[ 0 ].toVar(), argz[ 1 ].asConst(), ( argz[ 2 ].asLongTerm() ) );
  }
}

class intToken
    extends
      StructureToken
{
  public intToken( int i )
  {
    super( "intToken", Long( i ) );
  }
}

class realToken
    extends
      StructureToken
{
  public realToken( double i )
  {
    super( "realToken", Float( i ) );
  }
}

class constToken
    extends
      StructureToken
{
  private constToken( Functor c )
  {
    super( "constToken", c );
    setArg( 0, Builtins.toConstBuiltin( c ) );
  }

  public constToken( String s )
  {
    this( SYM( s.intern() ) );
  }
}

class stringToken
    extends
      StructureToken
{
  public stringToken( constToken c )
  {
    super( "stringToken", c.getDrefArg( 0 ) );
  }
}

class funToken
    extends
      StructureToken
{
  public funToken( String s )
  {
    super( "funToken", SYM( s.intern() ) );
  }
}

class eocToken
    extends
      StructureToken
{
  public eocToken()
  {
    super( "eocToken", SYM( "end_of_clause" ) );
  }
}

class eofToken
    extends
      StructureToken
{
  public eofToken()
  {
    super( "eofToken", Prolog.anEof );
  }
}

class iffToken
    extends
      StructureToken
{
  public iffToken( String s )
  {
    super( "iffToken", SYM( s ) );
  }
}

class KPToken
    extends
      SymbolTerm.Dynamic
{
  KPToken( String s )
  {
    super( s, 0 );
  }
}

class lparToken
    extends
      KPToken
{
  public lparToken()
  {
    super( "(" );
  }
}

class rparToken
    extends
      KPToken
{
  public rparToken()
  {
    super( ")" );
  }
}

class lbraToken
    extends
      KPToken
{
  public lbraToken()
  {
    super( "[" );
  }
}

class rbraToken
    extends
      KPToken
{
  public rbraToken()
  {
    super( "]" );
  }
}

class barToken
    extends
      KPToken
{
  public barToken()
  {
    super( "|" );
  }
}

class commaToken
    extends
      KPToken
{
  public commaToken()
  {
    super( "," );
  }
}

/**
 * Simplified Prolog parser: Synatax supported: a0:-a1,...,an. - no operators (
 * except toplevel :- and ,) - use quotes to create special symbol names, i.e.
 * compute('+',1,2, Result) and write(':-'(a,','(b,c)))
 */
public class Parser
    extends
      LexerHIDE
{
  public Parser( Reader I ) throws IOException
  {
    super( I );
  }

  /*
   * used in prolog2java
   */
  Parser( String p, String s ) throws IOException
  {
    super( p, s );
  }

  private Parser( String s ) throws Exception
  {
    super( s );
  }

  /**
   * Main Parser interface: reads a clause together with variable name
   * information
   */
  public HornClause readClause()
  {
    HornClause t = null;
    boolean verbose = false;
    try
    {
      t = readClauseOrEOF();
      // IO.mes("GOT Clause:"+t);
    }
    /**
     * catch built exception clauses which are defined in lib.pro - allowing to
     * recover or be quiet about such errors.
     */
    catch( ParserException e )
    {
      t = errorClause( e, "syntax_error", lineno(), verbose );
      try
      {
        while ( !atEOC() && !atEOF())
          next();
      }
      catch( IOException toIgnore )
      {
      }
    }
    catch( IOException e )
    {
      t = errorClause( e, "io_exception", lineno(), verbose );
    }
    catch( Exception e )
    {
      t = errorClause( e, "unexpected_syntax_exception", lineno(), true );
    }
    return t;
  }

  static final HornClause errorClause(Exception e, String type, int line, boolean verbose)
  {
    String mes = e.getMessage();
    if( null == mes )
      mes = "unknown_error";
    Term f = S( "error", SYM( type ), SYM( mes ), S( "line", Integer( line ) ) );
    HornClause C = new HornClause( f, Prolog.True );
    if( verbose )
    {
      IO.errmes( type + " error at line:" + line );
      IO.errmes( C.pprint(), e );
    }
    return C;
  }

  public static final boolean isError(HornClause C)
  {
    Term H = C.getHead();
    if( H.isCompound() && "error".equals( H.fname() ) && H.arityOrType() == 3 && !( asStruct( H ).getDrefArg( 0 ).dref().isVar() ) )
      return true;
    return false;
  }

  static public final void showError(HornClause C)
  {
    IO.errmes( "*** " + C );
  }

  static final HornClause toClause(Term T, HashDict dict)
  {
    HornClause C = T.toClause(); // adds ...:-true if missing
    C.dict = dict;
    return C;
  }

  private HornClause readClauseOrEOF() throws IOException
  {
    if( true )
      return readClauseOrEOFOLD();
    Reader reader = new PushbackReader( this.input );
    if( PrologMain.p == null )
      PrologMain.main( new String[] { "true"
      } );
    // BlockingPrologControl p
    // p = new BlockingPrologControl();
    // p.configureUserIO(System.in, System.out, System.err);
    final Prolog engine = PrologMain.p.getEngine();
    Term v1 = null, v2 = null, v3 = null;
    v1 = TermData.FFIObject( reader );
    v2 = TermData.V( engine );
    v3 = TermData.V( engine );
    engine.setAREGS( TermArray.newTermArray( v1, v2, v3 ) );
    Operation cont = FILE_system.PRED_read_with_variables_3_static_exec( engine );
    BlockingPrologControl.executePredicate( PrologMain.p, engine, cont, true );
    // while (cont != null) {
    // cont = cont.exec(engine);
    // }
    return v2.dref().toClause();
  }

  private HornClause readClauseOrEOFOLD() throws IOException
  {
    dict = new HashDict();
    Term n = next();
    // IO.mes("readClauseOrEOF 0:"+n);
    if( n.isFunctor( "eofToken" ) )
      return null; // $$toClause(n.token(),dict);
    if( n.isFunctor( "iffToken" ) )
    {
      n = next();
      Term t = getTerm( n );
      Term bs = getConjCont( t );
      HornClause C = new HornClause( SYM( "init" ), bs );
      C.dict = dict;
      return C;
    }
    Term h = getTerm( n );
    // IO.mes("readClauseOrEOF 1:"+h);
    n = next();
    // IO.mes("readClauseOrEOF 2:"+n);
    if( n.isFunctor( "eocToken" ) || n.isFunctor( "eofToken" ) )
      return toClause( h, dict );
    // IO.mes("readClauseOrEOF 3:"+b);
    HornClause C = null;
    if( n.isFunctor( "iffToken" ) )
    {
      Term t = getTerm();
      Term bs = getConjCont( t );
      C = new HornClause( h, bs );
      C.dict = dict;
    }
    else if( n.isFunctor( "," ) )
    {
      Term b = getTerm();
      Term bs = getConjCont( b );
      C = toClause( StructureTerm.createCons( ",", h, bs ), dict );
    }
    else
    {
      throw new ParserException( "':-' or '.' or ','", "bad body element", n );
    }
    return C;
  }

  private final Term getConjCont(Term curr) throws IOException
  {
    Term n = next();
    Term t = null;
    if( n.isFunctor( "eocToken" ) )
      t = curr;
    else if( n.isFunctor( "," ) )
    {
      Term other = getTerm();
      t = TermData.AND( curr, getConjCont( other ) );
    }
    if( null == t )
    {
      throw new ParserException( "'.'", "bad body element", n );
    }
    return t;
  }

  final Term getTerm(Term n) throws IOException
  {
    Term t = n.carTokenOrSelf();
    if( n.isFunctor( "stringToken" ) )
    {
      t = ( (Nonvar) n.getDrefArg( 0 ) ).toCharsList();
      // IO.mes("getTerm:stringToken-->"+t);
    }
    else if( n.isFunctor( "[" ) )
    {
      t = getList();
    }
    else if( n.isFunctor( "funToken" ) )
    {
      SxxMachine.Functor f = (Functor) t;
      Term[] args = getArgs();
      f = SymbolTerm.intern( f.fname(), args.length );
      Compound c = S( f, args );
      t = Builtins.toFunBuiltin( c );
    }
    else
    {
      int next = nextToken();
      char nc = (char) next;
      if( nc == '(' )
      {
        if( false )
          throw new ParserException( "var,int,real,constant,'[' or functor", "bad term", n );
      }
      pushBack();
      if( false )
        throw new ParserException( "var,int,real,constant,'[' or functor", "bad term", n );
    }
    return t;
  }

  Term getTerm() throws IOException
  {
    Term n = next();
    return getTerm( n );
  }

  private final Term[] getArgs() throws IOException
  {
    // break;
    Term n = next();
    if( !( n.isFunctor( "(" ) ) )
      throw new ParserException( "'('", "in getArgs", n );
    ArrayList v = new ArrayList();
    Term t = getTerm();
    v.add( t );
    for( ;; )
    {
      n = next();
      if( n.isFunctor( ")" ) )
      {
        int l = v.size();
        Term args[] = new Term[ l ];
        // v.copyInto(Arguments);
        Object[] as = v.toArray();
        for( int i = 0; i < l; i++ )
        {
          args[ i ] = (Term) as[ i ];
        }
        return args;
      }
      else if( n.isFunctor( "," ) )
      {
        t = getTerm();
        v.add( t );
      }
      else
      {
        throw new ParserException( "',' or ')'", "bad arg", n );
      }
    }
  }

  private final Term getList() throws IOException
  {
    Term n = next();
    if( n.isFunctor( "]" ) )
      return Prolog.Nil;
    Term t = getTerm( n );
    return getListCont( t );
  }

  private final Term getListCont(Term curr) throws IOException
  {
    // IO.trace("curr: "+curr);
    Term n = next();
    Term t = null;
    if( n.isFunctor( "]" ) )
      t = CONS( curr, Prolog.Nil );
    else if( n.isFunctor( "|" ) )
    {
      t = CONS( curr, getTerm() );
      n = next();
      if( !( n.isFunctor( "]" ) ) )
      {
        throw new ParserException( "']'", "bad list end after '|'", n );
      }
    }
    else if( n.isFunctor( "," ) )
    {
      Term other = getTerm();
      t = CONS( curr, getListCont( other ) );
    }
    if( t == null )
      throw new ParserException( "| or ]", "bad list continuation", n );
    return t;
  }

  private static final String patchEOFString(String s)
  {
    if( !( s.lastIndexOf( "." ) >= s.length() - 2 ) )
      s = s + ".";
    return s;
  }

  public static HornClause clsFromString(String s)
  {
    return null;
  }

  public static HornClause clsFromStringOld(String s)
  {
    if( null == s )
      return null;
    s = patchEOFString( s );
    HornClause t = null;
    try
    {
      Parser p;
      p = new Parser( s );
      t = p.readClause();
    }
    catch( Exception e )
    { // nothing expected to catch
      IO.errmes( "unexpected parsing error", e );
    }
    if( t.dict == null )
      t.ground = false;
    else
      t.ground = t.dict.isEmpty();
    return t;
  }
}

class ParserException
    extends
      IOException
{
  public ParserException( String e, String f, Term n )
  {
    super( "expected: " + e + ", found: " + f + "'" + n + "'" );
  }
}
