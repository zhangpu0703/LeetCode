public class Solution {
    public double myPow(double x, int n) {
        if (n==0) return 1;
        if (x==0) return 0;
        int half = Math.abs(n/2); 
        if (n<0){
            n=-n;
            x=1/x;
        }
        if (n%2 == 0) return myPow(x*x,half);
        else return myPow(x*x,half)*x;
    }
}