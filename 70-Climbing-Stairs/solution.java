public class Solution {
    public int climbStairs(int n) {
        if (n<=2) return n;
        int f1 = 1;
        int f2 = 2;
        for (int i = 3; i<=n; i++){
            int temp = f2;
            f2=f1+f2;
            f1=temp;
        }
        return f2;
    }
}