public class Solution {
    public int nthUglyNumber(int n) {
        int two = 0;
        int three = 0;
        int five = 0;
        int[] res = new int[n];
        res[0]=1;
        for (int i=1; i<n; i++){
            int cur = Math.min(res[two]*2, Math.min(res[three]*3, res[five]*5));
            if (res[two]*2==cur) two++;
            if (res[three]*3==cur) three++;
            if (res[five]*5==cur) five++;
            res[i]=cur;
        }
        return res[n-1];
    }
}