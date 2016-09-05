public class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        boolean[][] dp = new boolean[m+1][n+1];
        for (int i=0; i<=n; i++) dp[0][i]=true;
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                dp[i][j]=dp[i][j-1];
                if (dp[i-1][j-1] && s.charAt(i-1) == t.charAt(j-1)) dp[i][j]=true;
            }
        }
        return dp[m][n];
    }
}