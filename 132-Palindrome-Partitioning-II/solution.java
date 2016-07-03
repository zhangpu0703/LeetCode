public class Solution {
    public int minCut(String s) {
        int n = s.length();
        int[] res = new int[n+1];
        for (int i=0; i<=n; i++){
            res[i]=i-1;
        }
        for(int i=0; i<n; i++){
            for (int j=0; j<=i && i+j<n && s.charAt(i-j)==s.charAt(i+j); j++){
                res[i+j+1]=Math.min(res[i+j+1],res[i-j]+1);
            }
            for (int j=1; j<=i+1 && i+j<n && s.charAt(i-j+1)==s.charAt(i+j); j++){
                res[i+j+1]=Math.min(res[i+j+1],res[i-j+1]+1);
            }
        }
        return res[n];
    }
}