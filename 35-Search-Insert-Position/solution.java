public class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        if (target<nums[start]) return 0;
        if (target>nums[end]) return nums.length;
        while (start<end){
            int mid = start+(end-start)/2;
            if (target == nums[mid]) return mid;
            else if (target>nums[mid]) start = mid+1;
            else end = mid;
        }
        return start;
    }
}