public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        if (s3.length() != m+n) return false;
        boolean[][] res = new boolean[m+1][n+1];
        res[0][0]=true;
        for (int i=1; i<=m; i++){
            if (s1.substring(0,i).equals(s3.substring(0,i))) res[i][0]=true;
        }
        for (int j=1; j<=n; j++){
            if (s2.substring(0,j).equals(s3.substring(0,j))) res[0][j]=true;
        }
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                if (res[i-1][j] && s1.charAt(i-1)==s3.charAt(i+j-1)) res[i][j]=true;
                if (res[i][j-1] && s2.charAt(j-1)==s3.charAt(i+j-1)) res[i][j]=true;
            }
        }
        return res[m][n];
    }
}