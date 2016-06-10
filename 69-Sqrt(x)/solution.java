public class Solution {
    public int mySqrt(int x) {
        if (x<=1) return x;
        int start = 0;
        int end = x;
        while (start<end){
            int mid = start+(end-start)/2;
            if (mid<x/mid) start=mid;
            else if (mid == x/mid) return mid;
            else end = mid-1;
        }
        return start;
    }
}