public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n==0) return 2;
        //if (n==1) return 11;
        if (n>10) return 0;
        int[] res = new int[n];
        res[0]=10;
        for (int i=1; i<n; i++){
            int cur = 9;
            for (int j = 2; j<=i+1; j++){
                cur *= (11-j);
            }
            res[i]=res[i-1]+cur;
        }
        return res[n-1];
        
    }
}