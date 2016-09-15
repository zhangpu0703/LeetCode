public class Solution {
    public int integerReplacement(int n) {
        int res = 0;
        if (n==Integer.MAX_VALUE) return 32;
        while(n!=1){
            if (n%2==0) n>>>=1;
            else if (n==3||Integer.bitCount(n+1)>Integer.bitCount(n-1)) n--;
            else n++;
            res++;
        }
        return res;
    }
}