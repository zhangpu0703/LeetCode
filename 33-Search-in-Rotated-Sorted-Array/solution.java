public class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]==target) return mid;
            if (nums[mid]>nums[end]){
                if (target<nums[start] || target>nums[mid]) start=mid;
                else end = mid;
            }
            else{
                if (target<nums[start] && target>nums[mid]) start=mid;
                else end = mid;
            }
        }
        if (nums[start] == target) return start;
        else if (start<nums.length-1 && nums[start+1]==target) return start+1;
        return -1;
    }
}