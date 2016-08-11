public class Solution {
    public int getSum(int a, int b) {
        int carry = 0, res = 0;
        if (b==0) return a;
        res = a^b;
        carry = (a&b)<<1;
        return getSum(res,carry);
    }
}