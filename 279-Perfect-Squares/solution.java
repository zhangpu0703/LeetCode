public class Solution {
    public int numSquares(int n) {
        int[] res = new int[n];
        for (int i=1; i*i<=n; i++){
            res[i*i-1]=1;
        }
        for (int i=1; i<n; i++){
            if (res[i]==1) continue;
            else res[i]= Integer.MAX_VALUE;
            for (int j = 1; j*j<=i; j++){
                res[i]=Math.min(res[i],res[j*j-1]+res[i-j*j]);
            }
        }
        return res[n-1];
    }
}