public class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n <=  1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int start = 0;
        int end = n-1;
        int mid = 0;
        while (start<end-1){
            mid = start+(end-start)/2;
            if (nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]) return mid;
            else if (nums[mid]>nums[mid-1]) start = mid;
            else end = mid;
        }
        return mid;
    }
}