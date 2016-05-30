public class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        if (target>nums[end]) return end+1;
        if (target<nums[start]) return 0;
        while (start<end-1){
            int mid = start+(end-start)/2;
            if (nums[mid]==target) return mid;
            if (nums[mid]<target && nums[mid+1]>=target) return mid+1;
            if (nums[mid]<target) start = mid+1;
            else end = mid;
        }
        if (nums[start]>=target) return start;
        else return start+1;
    }
}