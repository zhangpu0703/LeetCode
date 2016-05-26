public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor==0) return Integer.MAX_VALUE;
        int sign = 1;
        if ((dividend>0&&divisor<0) || (divisor<0 &&dividend>0)) sign = -1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if (dividend<divisor) return 0;
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