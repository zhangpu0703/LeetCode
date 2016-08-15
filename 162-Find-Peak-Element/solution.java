public class Solution {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length<=1) return 0;
        int start = 0, end = nums.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if (mid==0){
                if (nums[mid]>nums[mid+1]) return mid;
                else start = mid+1;
            }
            else if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if (nums[mid]>nums[mid-1]) start = mid+1;
            else end = mid;
        }
        return start;
    }
}