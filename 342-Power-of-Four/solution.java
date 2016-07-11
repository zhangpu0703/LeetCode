public class Solution {
    public boolean isPowerOfFour(int num) {
        if (num<=0) return false;
        if (num == 1) return true;
        if (num%4!=0) return false;
        else return isPowerOfFour(num/4);
    }
}