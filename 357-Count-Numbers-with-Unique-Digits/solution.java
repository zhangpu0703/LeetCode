public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n==1) return 10;
        if (n>10) return countNumbersWithUniqueDigits(10);
        int factor = 9;
        for (int i=1; i<n; i++){
            factor = factor * (10-i);
        }
        return factor+countNumbersWithUniqueDigits(n-1);
    }
}