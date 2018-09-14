package SxxMachine;
/**
 * The <code>PredicateEncoder</code> class contains static methods for encoding predicate names.<br>
 * The predicate with <code>hoge:f/n</code> is encoded to <code>hoge.PRED_f_n</code>, where
 * <code>hoge</code> is package name,
 * <code>f</code> is predicate name, and
 * <code>n</code> is arity.<br>
 *
 * When encoding a predicate name, we apply the following rules:<br>
 *<ul>
 *<li>The alphanumeric characters
 * &ldquo;<code>a</code>&rdquo; through &ldquo;<code>z</code>&rdquo;,
 * &ldquo;<code>A</code>&rdquo; through &ldquo;<code>Z</code>&rdquo; and
 * &ldquo;<code>0</code>&rdquo; through &ldquo;<code>9</code>&rdquo; remain the same.
 *<li>The special characters &ldquo;<code>_</code>&rdquo; and &ldquo;<code>$</code>&rdquo; remain the same.
 *<li>All other characters are first converted into a list of character codes.
 * Then each character code is represented by the 5-character string &ldquo;<code>$XYZW</code>&rdquo;,
 * where <code>XYZW</code> is the four-digit hexadecimal representation of the character code.
 *</ul>
 *
 * For example,
 * a predicate with <code>hoge:(=..)/2</code> is encoded to <code>hoge.PRED_$003D$002E$002E_2</code>.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PredicateEncoder {

    /**
     * Returns a string representation of class for
     * the predicate with the given arguments.
     * @param pkg package name
     * @param functor predicate name
     * @param arity predicate arity
     * @return a string representation of class for
     * the predicate that corresponds to <code>pkg:functor/arity</code>.
     */
    public static String encode(String pkg, String functor, int arity) {
    	char[] x = functor.toCharArray();
    	StringBuilder sb = new StringBuilder(pkg.length()+x.length*5+10);
    	sb.append(pkg);
    	sb.append(".PRED_");
    	int i = 0;
    	int s = i;
    	while (i<x.length){
    		if ( !((x[i]>='a' && x[i]<='z') || (x[i]>='A' && x[i]<='Z') ||
    				(x[i]>='0' && x[i]<='9') || x[i]=='_' || x[i]=='$')){

    			sb.append(x, s, i-s);
    			sb.append('$').append(Integer.toHexString(x[i]).substring(4, 8));
    			s = i+1;
    		}
    		i++;
    	}
    	if (s<x.length){
    		sb.append(x, s, x.length-s);
    	}
    	sb.append('_').append(arity);
    	return sb.toString();
    }

    public static String decodeFunctor(String className) {
    	int length = className.length();
    	// Remove the Java package name, if present.
    	int start = className.lastIndexOf('.');
    	start++;
    	// Trim the common PRED_ prefix.
    	if (className.regionMatches(start, "PRED_", 0, 5)){
    		start+=5;
    	}
    	// Drop the arity from the end.
    	int finish = className.lastIndexOf('_');
    	if (finish<0){
    		finish = length;
    	}

    	// replace $XXXX with character with code XXXX
    	StringBuilder sb = new StringBuilder(length);
    	int index = start;
    	int middle = index;
    	while (index<finish){
    		index = className.indexOf('$', index);

    		if (index<0){
    			index = finish;
    		} else if (index+4<finish){
    			try {
    				int c = Integer.parseInt(className.substring(index+1, index+5), 16);
    				sb.append(className.substring(middle, index));
    				switch (c) {
					case '\\':
						sb.append("\\\\");
						break;
					case '$':
						sb.append("\\$");
					default:
						sb.append((char)c);
						break;
					}
    				index = middle = index+5;
    			} catch (NumberFormatException e){
    				index++;
    			}
    		} else {
    			index++;
    		}
    	}
    	if (middle<finish){
    		sb.append(className.substring(middle, finish));
    	}
    	return sb.toString();
    }

//    public static void main(String argv[]) {
//		String p = argv[0];
//		String f = argv[1];
//		int n = (Integer.valueOf(argv[2])).intValue();
//		System.out.println(p + ":" + f + "/" + n);
//		System.out.println(PredicateEncoder.encode(p,f,n));
//    }
}
