
package SxxMachine;

import java.io.IOException;
import java.io.Reader;
import java.util.Hashtable;

public class Lexer extends java.io.StreamTokenizer {

    private final static Logger log = Logger.getLogger(Lexer.class);

    private final static String anonymous = Const.strIntern("_");
    private final static String CONST = Const.strIntern("const");

    final static String ENDOFFILE = Const.strIntern("end_of_file");
    final static String ENDOFCLAUSE = Const.strIntern("end_of_clause");

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
            return JpFactory.S(Const.strIntern("int"), JpFactory.Long(Integer.parseInt(sval)));
        } catch (NumberFormatException ex) {
            if (sval.length() == 1) {
                char c = sval.charAt(0);
                if (c == '[' || c == ']' || c == '(' || c == ')') {
                    return JpFactory.S(Const.strIntern("constant"), JpFactory.CONST(Const.strIntern(sval)));
                }
            }
            return JpFactory.S(CONST, JpFactory.CONST(Const.strIntern(sval)));
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
            } catch (NumberFormatException ex) {
                pushBack();
                return JpFactory.S(CONST, JpFactory.CONST("-"));
            }
            return JpFactory.S(Const.strIntern("int"), JpFactory.Long(negative ? val * -1 : val));
        }
        pushBack();
        return JpFactory.S(CONST, JpFactory.CONST("-"));
    }

    Term make_real() {
        return Somethingwrong; // new realToken(nval);
    }

    Term make_var() {
        sval = Const.strIntern(sval);
        JpVar X;
        Int I;
        long occ = 0;
        if (anonymous.equals(sval)) {
            X = JpFactory.JVAR(prologmachine);
            I = JpFactory.Long(occ);
        } else {
            X = (JpVar) dict.get(sval);
            if (X == null) {
                X = JpFactory.JVAR(prologmachine);
                dict.put(sval, X);
            } else {
                occ = ((Int) dict.get(X)).longValue();
                occ++;
            }
            I = JpFactory.Long(occ);
            dict.put(X, I);
        }
        return JpFactory.S(Const.strIntern("var"), X, JpFactory.CONST(Const.strIntern(sval)), I);
    }

    private void whitespaceChar(char c) {
        whitespaceChars(c, c);
    }

    private void wordChar(char c) {
        wordChars(c, c);
    }

    private Hashtable<Object, Term> dict;

    private final static Term Somethingwrong = JpFactory.S(Const.strIntern("exception"), JpFactory.Long(666));

    private Term next0() throws IOException {
        int n = nextToken();
        inClause = true;
        Term T = Somethingwrong;
        String old_sval = null;
        int n2;

        switch (n) {
            case TT_WORD: {
                char c = sval.charAt(0);
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
                T = JpFactory.CONST(ENDOFFILE);
                inClause = false;
                break;
            case TT_EOL:
                T = next();
                break;
            case ':':
                if ('-' == nextToken()) {
                    sval = Const.strIntern(":-");
                } else {
                    old_sval = sval;
                    pushBack();
                    sval = Const.strIntern(":");
                }
                T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern(sval)));
                sval = old_sval;
                break;
            case '-':
                ordinaryChar(' ');
                n2 = nextToken();
                whitespaceChar(' ');
                if ('>' == n2) {
                    sval = Const.strIntern("->");
                } else if (n2 == TT_WORD) {
                    pushBack();
                    T = make_int(n);
                    break;
                } else if (n2 == ' ') {
                    old_sval = sval;
                    sval = Const.strIntern("-");
                } else {
                    old_sval = sval;
                    pushBack();
                    sval = Const.strIntern("-");
                }
                T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern(sval)));
                sval = old_sval;
                break;

            case '.':
                ordinaryChar(' ');
                int c = nextToken();
                whitespaceChar(' ');
                if (TT_EOL == c || TT_EOF == c || ' ' == c) {
                    inClause = false;
                    dict.clear();
                    T = JpFactory.CONST(ENDOFCLAUSE);
                } else {
                    old_sval = sval;
                    pushBack();
                    sval = Const.strIntern(".");
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
                T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern("(")));
                break;
            case ')':
                T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern(")")));
                break;
            case '[':
                T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern("[")));
                break;
            case ']':
                T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern("]")));
                break;
            case '|':
                T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern("|")));
                break;

            case ',':
                T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern(",")));
                break;
            case ';':
                T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern(";")));
                break;

            case '=':
                n2 = nextToken();
                if (n2 == '.') {
                    if (nextToken() != '.') {
                        throw new IllegalStateException("Illegal Syntax! =. found but next token is not .");
                    }
                    T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern("=..")));
                    break;
                } else if (n2 == '<') {
                    T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern("=<")));
                    break;
                } else if (n2 == ':') {
                    if (nextToken() != '=') {
                        throw new IllegalStateException("Illegal Syntax! =: found but next token is not =");
                    }
                    T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern("=:=")));
                    break;
                } else if (n2 == '=') {
                    T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern("==")));
                    break;
                }
                pushBack();
            case '>':
                char next = (char) nextToken();
                if (next == '=') {
                    T = JpFactory.S(CONST, JpFactory.CONST(">="));
                    break;
                }
                if (next == '>') {
                    T = JpFactory.S(CONST, JpFactory.CONST(">>"));
                    break;
                }
                pushBack();
            case '<':
                if (nextToken() == '<') {
                    T = JpFactory.S(CONST, JpFactory.CONST("<<"));
                    break;
                }
                pushBack();
                old_sval = sval;
                sval = char2string(n);
                T = JpFactory.S(CONST, JpFactory.CONST(Const.strIntern(sval)));
                sval = old_sval;
                break;
            case '@':
                n2 = nextToken();
                if (n2 == '<') {
                    T = JpFactory.S(CONST, JpFactory.CONST("@<"));
                    break;
                } else if (n2 == '>') {
                    if (nextToken() == '=') {
                        T = JpFactory.S(CONST, JpFactory.CONST("@>="));
                        break;
                    }
                    pushBack();
                    T = JpFactory.S(CONST, JpFactory.CONST("@>"));
                    break;
                } else if (n2 == '=') {
                    if (nextToken() != '<') {
                        T = JpFactory.S(CONST, JpFactory.CONST("@="));
                        pushBack();
                        break;
                    }
                    T = JpFactory.S(CONST, JpFactory.CONST("@=<"));
                    break;
                }
            case '?':
                n2 = nextToken();
                if (n2 == '-') {
                    T = JpFactory.S(CONST, JpFactory.CONST("?-"));
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
        } catch (IOException e) {
            log.error("Error while reading in lexer", e);
            return JpFactory.S(Const.strIntern("exception"), JpFactory.CONST(Const.strIntern((e.toString()))));
        }
    }

}
