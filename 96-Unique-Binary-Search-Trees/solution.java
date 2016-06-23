public class Solution {
    public int numTrees(int n) {
        int[] res = new int[n+1];
        res[0]=1;
        for (int i=1; i<=n; i++){
            int cur = 0;
            for (int j=0; j<i; j++){
                cur+=res[j]*res[i-1-j];
            }
            res[i]=cur;
        }
        return res[n];
    }
}