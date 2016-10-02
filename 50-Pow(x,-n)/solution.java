public class Solution {
    public double myPow(double x, int n) {
        if (n==0) return 1;
        if (n==Integer.MIN_VALUE){
            x=1/x;
            n=Integer.MAX_VALUE;
            return myPow(x,n)*x;
        }
        if (n<0){
            x=1/x;
            n=-n;
        }
        double root = myPow(x,n/2);
        if (n%2 == 1) return root*root*x;
        else return root*root;
    }
}