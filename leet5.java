public class leet5 {
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }
        int maxLenth = 1;
        int begin = 0;
        char[] c = s.toCharArray();
        boolean dp[][] = new boolean[length][length];
        for (int j = 1; j < length; j++) {
            for (int i = 0; i < j; i++) {
                if (c[i]!=c[j]) {
                    dp[i][j] = false;
                    continue;
                }
                if (j - i < 3) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = dp[i + 1][j - 1];
                }
                if (dp[i][j] && j - i + 1 > maxLenth) {
                    begin = i;
                    maxLenth = j - i + 1;
                }

            }
        }
        return s.substring(begin, begin+maxLenth);
    }
}
