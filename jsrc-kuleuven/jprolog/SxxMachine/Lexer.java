
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.io.IOException;
import java.io.Reader;
import java.util.Hashtable;

public class Lexer extends java.io.StreamTokenizer {

    private final static Logger log = Logger.getLogger(Lexer.class);

    private final static String anonymous = internS("_");
    private final static String CONST = internS("const");

    final static String ENDOFFILE = internS("end_of_file");
    final static String ENDOFCLAUSE = internS("end_of_clause");

    private final RunningPrologMachine prologmachine;
    private boolean inClause = false;

    Lexer(Reader I, RunningPrologMachine p) throws Exception {
        super(I);
        resetSyntax();
        //parseNumbers();
        wordChars('0', '9');
        eolIsSignificant(true);
        ordinaryChar('.');
        ordinaryChar('/');
        quoteChar('\'');
        quoteChar('"');
        quoteChar('\'');
        wordChar('$');
        wordChar('_');
        wordChars('a', 'z');
        wordChars('A', 'Z');
        wordChars(128 + 32, 255);
        whitespaceChars(0, ' ');
        slashStarComments(true);
        commentChar('%');
        dict = new Hashtable<Object, Term>();
        prologmachine = p;
    }

    static String char2string(int c) {
        return "" + (char) c;
    }

    boolean atEOF() {
        return TT_EOF == ttype;
    }

    boolean atEOC() {
        return !inClause;
    }

    private Term make_const() {
        try {
            return S(("int"), Integer(Integer.parseInt(sval)));
        } catch (final NumberFormatException ex) {
            if (sval.length() == 1) {
                final char c = sval.charAt(0);
                if (c == '[' || c == ']' || c == '(' || c == ')') {
                    return S(("constant"), CONST(internS(sval)));
                }
            }
            return S(CONST, CONST(internS(sval)));
        }
    }

    // PrologObject make_string() {
    // return new stringToken(sval);
    // }

    private Term make_int(int c) throws IOException {
        //return new Funct("int".intern(), new Int((int) nval));
        //return new Funct("int".intern(), new Int(Integer.parseInt(sval)));
        boolean negative = false;
        if (c == '-') {
            negative = true;
        }
        c = nextToken();
        if (c == TT_WORD) {
            long val;
            try {
                val = Long.valueOf(sval);
            } catch (final NumberFormatException ex) {
                pushBack();
                return S(CONST, CONST("-"));
            }
            return S(("int"), Integer(negative ? val * -1 : val));
        }
        pushBack();
        return S(CONST, CONST("-"));
    }

    Term make_real() {
        return Somethingwrong; // new realToken(nval);
    }

    Term make_var() {
        sval = internS(sval);
        JpVar X;
        NumberTerm I;
        long occ = 0;
        if (anonymous.equals(sval)) {
            X = Jv(prologmachine);
            I = Integer(occ);
        } else {
            X = (JpVar) dict.get(sval);
            if (X == null) {
                X = Jv(prologmachine);
                dict.put(sval, X);
            } else {
                occ = ((NumberTerm) dict.get(X)).longValue();
                occ++;
            }
            I = Integer(occ);
            dict.put(X, I);
        }
        return S(("var"), X, CONST(internS(sval)), I);
    }

    private void whitespaceChar(char c) {
        whitespaceChars(c, c);
    }

    private void wordChar(char c) {
        wordChars(c, c);
    }

    private final Hashtable<Object, Term> dict;

    private final static Term Somethingwrong = S(("exception"), Integer(666));

    private Term next0() throws IOException {
        final int n = nextToken();
        inClause = true;
        Term T = Somethingwrong;
        String old_sval = null;
        int n2;

        switch (n) {
            case TT_WORD: {
                final char c = sval.charAt(0);
                if (Character.isUpperCase(c) || '_' == c)
                    T = make_var();
                else {
                    T = make_const();
                }
            }
                break;
            /*
            case TT_NUMBER:
            if (Math.floor(nval) == nval)
              T = make_int();
            else
              T = make_real();
            break;
            */
            case TT_EOF:
                T = CONST(ENDOFFILE);
                inClause = false;
                break;
            case TT_EOL:
                T = next();
                break;
            case ':':
                if ('-' == nextToken()) {
                    sval = internS(":-");
                } else {
                    old_sval = sval;
                    pushBack();
                    sval = internS(":");
                }
                T = S(CONST, CONST(internS(sval)));
                sval = old_sval;
                break;
            case '-':
                ordinaryChar(' ');
                n2 = nextToken();
                whitespaceChar(' ');
                if ('>' == n2) {
                    sval = internS("->");
                } else if (n2 == TT_WORD) {
                    pushBack();
                    T = make_int(n);
                    break;
                } else if (n2 == ' ') {
                    old_sval = sval;
                    sval = internS("-");
                } else {
                    old_sval = sval;
                    pushBack();
                    sval = internS("-");
                }
                T = S(CONST, CONST(internS(sval)));
                sval = old_sval;
                break;

            case '.':
                ordinaryChar(' ');
                final int c = nextToken();
                whitespaceChar(' ');
                if (TT_EOL == c || TT_EOF == c || ' ' == c) {
                    inClause = false;
                    dict.clear();
                    T = CONST(ENDOFCLAUSE);
                } else {
                    old_sval = sval;
                    pushBack();
                    sval = internS(".");
                    T = make_const();
                    sval = old_sval;
                }
                break;

            case '\'':
                T = make_const();
                break;
            // case '"': T=make_string();
            // break;

            case '(':
                T = S(CONST, CONST(internS("(")));
                break;
            case ')':
                T = S(CONST, CONST(internS(")")));
                break;
            case '[':
                T = S(CONST, CONST(internS("[")));
                break;
            case ']':
                T = S(CONST, CONST(internS("]")));
                break;
            case '|':
                T = S(CONST, CONST(internS("|")));
                break;

            case ',':
                T = S(CONST, CONST(internS(",")));
                break;
            case ';':
                T = S(CONST, CONST(internS(";")));
                break;

            case '=':
                n2 = nextToken();
                if (n2 == '.') {
                    if (nextToken() != '.') {
                        throw new IllegalStateException("Illegal Syntax! =. found but next token is not .");
                    }
                    T = S(CONST, CONST(internS("=..")));
                    break;
                } else if (n2 == '<') {
                    T = S(CONST, CONST(internS("=<")));
                    break;
                } else if (n2 == ':') {
                    if (nextToken() != '=') {
                        throw new IllegalStateException("Illegal Syntax! =: found but next token is not =");
                    }
                    T = S(CONST, CONST(internS("=:=")));
                    break;
                } else if (n2 == '=') {
                    T = S(CONST, CONST(internS("==")));
                    break;
                }
                pushBack();
            case '>':
                final char next = (char) nextToken();
                if (next == '=') {
                    T = S(CONST, CONST(">="));
                    break;
                }
                if (next == '>') {
                    T = S(CONST, CONST(">>"));
                    break;
                }
                pushBack();
            case '<':
                if (nextToken() == '<') {
                    T = S(CONST, CONST("<<"));
                    break;
                }
                pushBack();
                old_sval = sval;
                sval = char2string(n);
                T = S(CONST, CONST(internS(sval)));
                sval = old_sval;
                break;
            case '@':
                n2 = nextToken();
                if (n2 == '<') {
                    T = S(CONST, CONST("@<"));
                    break;
                } else if (n2 == '>') {
                    if (nextToken() == '=') {
                        T = S(CONST, CONST("@>="));
                        break;
                    }
                    pushBack();
                    T = S(CONST, CONST("@>"));
                    break;
                } else if (n2 == '=') {
                    if (nextToken() != '<') {
                        T = S(CONST, CONST("@="));
                        pushBack();
                        break;
                    }
                    T = S(CONST, CONST("@=<"));
                    break;
                }
            case '?':
                n2 = nextToken();
                if (n2 == '-') {
                    T = S(CONST, CONST("?-"));
                    break;
                }
                pushBack();
                break;
            default:
                if (Character.isDigit(n)) {
                    T = make_int(n);
                } else {
                    sval = char2string(n);
                    T = make_const();
                }
        }
        return T;
    }

    Term next() {
        try {
            return next0();
        } catch (final IOException e) {
            log.error("Error while reading in lexer", e);
            return S(("exception"), CONST(internS((e.toString()))));
        }
    }

}
