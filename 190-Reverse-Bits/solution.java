public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        int digit = 31;
        while (n!=0){
            if ((n&1) == 1) res = res+(1<<digit);
            n=n>>>1;
            digit--;
        }
        return res;
    }
}