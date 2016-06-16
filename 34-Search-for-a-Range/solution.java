public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0]=-1;
        res[1]=-1;
        int start = 0;
        int end = nums.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]<target) start = mid+1;
            else if (nums[mid]>target) end = mid;
            else if (mid>0 && nums[mid-1]==nums[mid]) end = mid-1;
            else break;
        }
        if (nums[start]==target) res[0]=start;
        start=0;
        end = nums.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]<target) start = mid;
            else if (nums[mid]>target) end = mid-1;
            else if (mid<nums.length-1 && nums[mid+1]==nums[mid]) start = mid+1;
            else break;
        }
        if (nums[start]==target) res[1]=start;
        
        return res;
        
    }
}