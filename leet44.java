

/**
 * leet44
 */
public class leet44 {

    public boolean isMatch(String s, String p) {
        if (s==null||p==null) {
            return false;
        }
        if (s.length()!=p.length()) {
            return false;
        }
        return helper(s, p, 0, 0);

    }
    public boolean helper(String str1, String str2, int index1, int index2) {
        if (index1>=str1.length()) {
            return true;
        }
        char c1 = str1.charAt(index1);
        char c2 = str2.charAt(index2);
        if (c1=='?'||c2=='?') {
            return helper(str1, str2, index1+1, index2+1);
        }
        if (c1=='*') {
            return helper(str1, str2, index1, index2+1) || helper(str1, str2, index1+1, index2+1);
        }
        if (c2=='*') {
            return helper(str1, str2, index1+1, index2) || helper(str1, str2, index1+1, index2+1);
        }
        if (c1!=c2) {
            return false;
        }
        return false;
    }

}