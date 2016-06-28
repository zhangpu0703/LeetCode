public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num==1) return true;
        if (num<4) return false;
        int start = 1;
        int end = num/2;
        while (start<end){
            int mid = start+(end-start)/2;
            if (num%mid == 0 && mid==num/mid) return true;
            else if (mid<=num/mid) start = mid+1;
            else end = mid;
        }
        return num%start == 0 && start==num/start;
    }
}