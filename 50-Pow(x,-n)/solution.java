public class Solution {
    public double myPow(double x, int n) {
        if (n==0) return 1;
        if (x==0) return 0;
        if (n%2 == 0) return myPow(x,n/2) * myPow(x,n/2);
        else return myPow(x,n/2) * myPow(x,n/2)*x;
    }
}