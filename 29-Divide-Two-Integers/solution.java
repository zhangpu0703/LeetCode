public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor==0) return Integer.MAX_VALUE;
        if (dividend==0) return 0;
        long ldivisor = divisor;
        long ldividend = dividend;
        int sign = 1;
        if ((ldividend>0 && ldivisor<0) || (ldivisor<0 && ldividend>0)) sign = -1;
        //if (divisor == Integer.MIN_VALUE) return 0;
        ldividend = Math.abs(ldividend);
        ldivisor = Math.abs(ldivisor);
        if (dividend<divisor) return 0;
        if (dividend==divisor) return 1;
        int res=1;
        int newdiv = divisor;
        while (dividend-newdiv>=newdiv){
            res+=res;
            newdiv+=newdiv;
        }
        if (sign == 1) return res+divide(dividend-newdiv,divisor);
        else return -res-divide(dividend-newdiv,divisor);
        
    }
}