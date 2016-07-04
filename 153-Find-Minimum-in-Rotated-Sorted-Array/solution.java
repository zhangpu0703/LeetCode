public class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n==0) return 0;
        int start = 0;
        int end = n-1;
        while (start<end){
            int mid = start+(end-start)/2;
            //if (mid>0 && nums[mid]<nums[mid-1]) return mid;
            if (nums[mid]>nums[end]) start=mid+1;
            else end = mid;
        }
        return nums[start];
    }
}