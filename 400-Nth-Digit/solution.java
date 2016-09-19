public class Solution {
    public int findNthDigit(int n) {
        long nine = 9;
        int i = 1;
        while (n>=nine*i){
            n-=nine*i;
            nine *= 10;
            i++;
        }
        if (n==0) return 9;
        int num = (n-1)/i + (int) Math.pow(10,i-1);
        int dig = (n-1)%i;
        return String.valueOf(num).charAt(dig)-'0';
    }
}