public class Solution {
    public double myPow(double x, int n) {
        if (n==0) return 1;
        if (x==0) return 0;
        double root = myPow(x,n/2);
        //if (n==1) return x;
        if (n<0){
            x=1/x;
            n=-n;
        }
        
        if (n%2==1) return root*root*x;
        else return root*root;
    }
}