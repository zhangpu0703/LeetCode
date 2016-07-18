public class Solution {
    public int divide(int dividend, int divisor) {
        boolean sign = (dividend > 0) ^ (divisor<0);
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        if (b==0) {
            return dividend>=0? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long res = ldiv(a,b);
        if (res>Integer.MAX_VALUE) return sign? Integer.MAX_VALUE : Integer.MIN_VALUE;
        else return sign? (int) res : (int) -res;
        
    }
    public long ldiv (long a, long b){
        if (a<b) return 0;
       long sum = b;
        long mult = 1;
        while (sum+sum<=a){
            sum+=sum;
            mult+=mult;
        }
        return mult+ldiv(a-sum,b);
    }
}