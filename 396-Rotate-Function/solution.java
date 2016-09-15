public class Solution {
    public int maxRotateFunction(int[] A) {
        int sum = 0;
        int cur = 0;
        for (int i=0; i<A.length; i++){
            cur+=i*A[i];
            sum+=A[i];
        }
        int max = cur;
        for (int i=1; i<A.length; i++){
            cur = cur+sum-A.length * A[A.length-i] ;
            max = Math.max(max,cur);
        }
        return max;
    }
}